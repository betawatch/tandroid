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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements pk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(Object obj, int i10) {
        this.a = i10;
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
    /* JADX WARN: Type inference failed for: r1v10, types: [org.telegram.ui.ActionBar.e3, org.telegram.ui.Components.j8] */
    /* JADX WARN: Type inference failed for: r4v15, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // org.telegram.ui.Components.pk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i10, View view) {
        r8 r8Var;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        MessagesController.DialogFilter dialogFilter;
        int i11;
        int i12;
        boolean z11;
        String str;
        dj0 dj0Var;
        int i13;
        ux0 ux0Var;
        int intValue;
        int intValue2;
        ag.p1 p1Var;
        CharSequence replaceEmoji;
        t5[] t5VarArr;
        ArrayList arrayList;
        TLRPC.StickerSetCovered stickerSetCovered;
        int i14 = this.a;
        int i15 = -1;
        int i16 = 2;
        Paint.FontMetricsInt fontMetricsInt = null;
        ?? r11 = 0;
        Object obj = this.b;
        switch (i14) {
            case 0:
                ((e0) obj).K0.G(i10 - 1);
                break;
            case 1:
                ((q) obj).b0.G(i10 - 1);
                break;
            case 2:
                s8 s8Var = (s8) obj;
                org.telegram.ui.w7 w7Var = s8Var.W2;
                v8 v8Var = s8Var.Y2;
                if (view instanceof t8) {
                    t8 t8Var = (t8) view;
                    if (!t8Var.d) {
                        r8 r8Var2 = t8Var.a;
                        s8Var.V2 = r8Var2.a;
                        v8Var.a.b(r8Var2, false);
                        if (w7Var != null) {
                            w7Var.l();
                        }
                        v8Var.n0();
                        break;
                    }
                }
                if (s8Var.V2 != 1 && (r8Var = s8Var.X2) != null) {
                    s8Var.V2 = 1;
                    v8Var.a.b(r8Var, true);
                    if (w7Var != null) {
                        w7Var.l();
                    }
                    v8Var.n0();
                    break;
                } else if (v8Var.O == null) {
                    if (!v8Var.a.v) {
                        v8Var.g0(true, true, true);
                    }
                    r8 r8Var3 = v8Var.a.h;
                    boolean[] zArr = {false};
                    AndroidUtilities.requestAdjustNothing(v8Var.getParentActivity(), v8Var.getClassGuid());
                    j8 j8Var = new j8(v8Var, v8Var.getParentActivity());
                    v8Var.O = j8Var;
                    j8Var.fixNavigationBar();
                    v8Var.O.pauseAllHeavyOperations = false;
                    v8Var.h = true;
                    v8Var.e.setBackground(new BitmapDrawable(v8Var.getParentActivity().getResources(), AndroidUtilities.makeBlurBitmap(v8Var.fragmentView, 12.0f, 10)));
                    v8Var.h = false;
                    v8Var.e.setVisibility(0);
                    v8Var.e.setAlpha(0.0f);
                    v8Var.f = true;
                    v8Var.fragmentView.invalidate();
                    v8Var.e.animate().setListener(new k8(v8Var, r11)).alpha(1.0f).setDuration(200L).start();
                    v8Var.U = new r8();
                    l8 l8Var = new l8(v8Var.getParentActivity(), r11, new i8(v8Var, i16), r11);
                    r8 r8Var4 = v8Var.a.h;
                    if (r8Var4 != null) {
                        r8 r8Var5 = v8Var.U;
                        int i17 = r8Var4.f;
                        r8Var5.f = i17;
                        l8Var.e(i17, 3);
                        r8 r8Var6 = v8Var.U;
                        int i18 = v8Var.a.h.e;
                        r8Var6.e = i18;
                        l8Var.e(i18, 2);
                        r8 r8Var7 = v8Var.U;
                        int i19 = v8Var.a.h.d;
                        r8Var7.d = i19;
                        l8Var.e(i19, 1);
                        r8 r8Var8 = v8Var.U;
                        int i20 = v8Var.a.h.c;
                        r8Var8.c = i20;
                        l8Var.e(i20, 0);
                    }
                    r8 r8Var9 = v8Var.U;
                    if (r8Var9.f != 0) {
                        i16 = 4;
                    } else if (r8Var9.e != 0) {
                        i16 = 3;
                    } else if (r8Var9.d == 0) {
                        i16 = 1;
                    }
                    l8Var.f(-1, 4, i16, false);
                    v8Var.a.b(v8Var.U, true);
                    v8Var.n0();
                    ?? linearLayout = new LinearLayout(v8Var.getParentActivity());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(0, AndroidUtilities.dp(8.0f), 0, 0);
                    linearLayout.addView(l8Var);
                    FrameLayout frameLayout = new FrameLayout(v8Var.getParentActivity());
                    frameLayout.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.g6.Oh));
                    TextView textView = new TextView(v8Var.getParentActivity());
                    textView.setTextSize(1, 14.0f);
                    textView.setText(LocaleController.getString(R.string.SetColor));
                    textView.setGravity(17);
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                    frameLayout.addView(textView, h7.z5.e(-2, -2, 17));
                    linearLayout.addView(frameLayout, h7.z5.d(-1, 48.0f, 0, 16.0f, -8.0f, 16.0f, 16.0f));
                    frameLayout.setOnClickListener(new q2(v8Var, zArr));
                    v8Var.O.setCustomView(linearLayout);
                    j8 j8Var2 = v8Var.O;
                    j8Var2.smoothKeyboardAnimationEnabled = true;
                    j8Var2.setDimBehind(false);
                    v8Var.O.show();
                    v8Var.isLightStatusBar();
                    break;
                }
                break;
            case 3:
                ap.p((ap) obj, view, i10);
                break;
            case 4:
                uq uqVar = (uq) obj;
                zk0 zk0Var = uqVar.d;
                if (i10 > 3) {
                    uqVar.Z = (TLRPC.Peer) uqVar.U.get(i10 - 4);
                    if (view instanceof org.telegram.ui.Cells.d4) {
                        z10 = true;
                        ((org.telegram.ui.Cells.d4) view).c(true, true);
                    } else {
                        z10 = true;
                    }
                    int i21 = 0;
                    while (i21 < zk0Var.getChildCount()) {
                        View childAt = zk0Var.getChildAt(i21);
                        if (childAt != view && (childAt instanceof org.telegram.ui.Cells.d4)) {
                            ((org.telegram.ui.Cells.d4) childAt).c(false, z10);
                        }
                        i21++;
                        z10 = true;
                    }
                    break;
                }
                break;
            case 5:
                yy yyVar = ((gx) obj).B;
                int i22 = yyVar.Y0;
                if (view.getTag() instanceof TLRPC.StickerSetCovered) {
                    TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) view.getTag();
                    ArrayList arrayList2 = new ArrayList();
                    org.telegram.ui.ActionBar.n2 n2Var = yyVar.U1;
                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i22).getFeaturedEmojiSets();
                    while (r11 < featuredEmojiSets.size()) {
                        TLRPC.StickerSetCovered stickerSetCovered3 = featuredEmojiSets.get(r11);
                        if (stickerSetCovered3 != null && stickerSetCovered3.set != null) {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            TLRPC.StickerSet stickerSet2 = stickerSetCovered3.set;
                            tL_inputStickerSetID.id = stickerSet2.id;
                            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                            arrayList2.add(tL_inputStickerSetID);
                            if (stickerSetCovered2 != null && (stickerSet = stickerSetCovered2.set) != null && stickerSet.id == stickerSetCovered3.set.id) {
                                i15 = r11;
                            }
                        }
                        r11++;
                    }
                    MediaDataController.getInstance(i22).markFeaturedStickersAsRead(true, true);
                    cv cvVar = new cv(n2Var, yyVar.getContext(), n2Var == null ? yyVar.V1 : n2Var.getResourceProvider(), arrayList2);
                    if (i15 >= 0) {
                        cvVar.K = i15;
                    }
                    if (n2Var != null) {
                        n2Var.showDialog(cvVar);
                        break;
                    } else {
                        cvVar.show();
                        break;
                    }
                }
                break;
            case 6:
                yy yyVar2 = ((py) obj).v;
                yyVar2.p1.o(new j41(yyVar2.getContext(), new rw(yyVar2), yyVar2.t1, yyVar2.u1, yyVar2.v1, (TLRPC.StickerSetCovered) view.getTag(), yyVar2.V1));
                break;
            case 7:
                b00 b00Var = (b00) obj;
                org.telegram.ui.zt ztVar = b00Var.r;
                ArrayList arrayList3 = b00Var.c.d.s;
                MessagesController.DialogFilter dialogFilter2 = i10 < arrayList3.size() ? (MessagesController.DialogFilter) arrayList3.get(i10) : null;
                boolean z12 = view instanceof org.telegram.ui.ActionBar.x2 ? ((org.telegram.ui.ActionBar.x2) view).e : false;
                org.telegram.ui.gy gyVar = ((org.telegram.ui.hw) ztVar.b).a;
                ArrayList arrayList4 = gyVar.E2;
                ArrayList I = b00.I(gyVar, dialogFilter2, arrayList4, true, false);
                if (!z12) {
                    int size = I.size() + (dialogFilter2 != null ? dialogFilter2.alwaysShow.size() : 0);
                    if ((size > gyVar.getMessagesController().dialogFiltersChatsLimitDefault && !gyVar.getUserConfig().isPremium()) || size > gyVar.getMessagesController().dialogFiltersChatsLimitPremium) {
                        Context context = gyVar.fragmentView.getContext();
                        i11 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
                        gyVar.showDialog(new ag.i1(4, i11, context, gyVar, null));
                        b00Var.dismiss();
                        break;
                    }
                }
                if (dialogFilter2 == null) {
                    gyVar.presentFragment(new org.telegram.ui.q00(null, I));
                } else if (z12) {
                    for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                        dialogFilter2.neverShow.add((Long) arrayList4.get(i23));
                        dialogFilter2.alwaysShow.remove(arrayList4.get(i23));
                    }
                    MessagesController.DialogFilter dialogFilter3 = dialogFilter2;
                    org.telegram.ui.q00.t0(dialogFilter3, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, true, false, gyVar, null);
                    long longValue = arrayList4.size() == 1 ? ((Long) arrayList4.get(0)).longValue() : 0L;
                    UndoView Y3 = gyVar.Y3();
                    if (Y3 != null) {
                        Y3.k(longValue, 21, Integer.valueOf(arrayList4.size()), dialogFilter3, null, null);
                    }
                    gyVar = gyVar;
                } else {
                    if (I.isEmpty()) {
                        dialogFilter = dialogFilter2;
                    } else {
                        for (int i24 = 0; i24 < I.size(); i24++) {
                            dialogFilter2.neverShow.remove(I.get(i24));
                        }
                        dialogFilter2.alwaysShow.addAll(I);
                        dialogFilter = dialogFilter2;
                        org.telegram.ui.q00.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, true, false, gyVar, null);
                    }
                    gyVar = gyVar;
                    long longValue2 = I.size() == 1 ? ((Long) I.get(0)).longValue() : 0L;
                    MessagesController.DialogFilter dialogFilter4 = dialogFilter;
                    UndoView Y32 = gyVar.Y3();
                    if (Y32 != null) {
                        Y32.k(longValue2, 20, Integer.valueOf(I.size()), dialogFilter4, null, null);
                    }
                }
                gyVar.b4(true);
                b00Var.dismiss();
                break;
            case 8:
                q00 q00Var = (q00) obj;
                org.telegram.ui.ActionBar.n2 n2Var2 = q00Var.n;
                ArrayList arrayList5 = q00Var.c0;
                ArrayList arrayList6 = q00Var.e0;
                if ((view instanceof org.telegram.ui.Cells.d4) && (i12 = (i10 - 1) - q00Var.n0) >= 0 && i12 < arrayList5.size()) {
                    long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList5.get(i12));
                    if (!arrayList6.contains(Long.valueOf(peerDialogId))) {
                        z11 = true;
                        arrayList6.add(Long.valueOf(peerDialogId));
                        ((org.telegram.ui.Cells.d4) view).c(true, true);
                    } else if (q00Var.d0.contains(Long.valueOf(peerDialogId))) {
                        int i25 = -q00Var.y0;
                        q00Var.y0 = i25;
                        AndroidUtilities.shakeViewSpring(view, i25);
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
                        if (q00Var.z0 != peerDialogId || System.currentTimeMillis() - q00Var.A0 > 1500) {
                            q00Var.z0 = peerDialogId;
                            q00Var.A0 = System.currentTimeMillis();
                            ec g10 = new mc(q00Var.g0, null).g(str, arrayList7);
                            g10.j = 1500;
                            g10.j();
                            break;
                        }
                    } else {
                        arrayList6.remove(Long.valueOf(peerDialogId));
                        z11 = true;
                        ((org.telegram.ui.Cells.d4) view).c(false, true);
                    }
                    q00Var.U(z11);
                    q00Var.V();
                    q00Var.Q(false);
                    break;
                }
                break;
            case 9:
                g30 g30Var = (g30) obj;
                if (i10 == g30Var.e0) {
                    g30Var.c0.a.j1(true);
                    g30Var.dismiss();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.y4) {
                    org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                    if (!g30Var.b0.contains(Long.valueOf(y4Var.getUserId()))) {
                        g30Var.c0.a.m1(y4Var.getUserId(), true);
                        break;
                    }
                }
                break;
            case 10:
                gj0 gj0Var = (gj0) obj;
                ArrayList arrayList8 = gj0Var.n;
                int j10 = gj0Var.f.j(i10);
                if (j10 == 0) {
                    fj0 fj0Var = gj0Var.A;
                    if (fj0Var != null) {
                        fj0Var.e(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList8.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList8.get(i10));
                        break;
                    }
                } else if (j10 == 1 && (dj0Var = gj0Var.C) != null) {
                    dj0Var.g(gj0Var.E);
                    break;
                }
                break;
            case 11:
                wj0 wj0Var = (wj0) obj;
                vj0 vj0Var = wj0Var.c0;
                if (vj0Var != null && (view instanceof uj0)) {
                    vj0Var.n(wj0Var, ((uj0) view).e, false, false);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                sp0 sp0Var = ((op0) obj).G;
                i13 = ((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount;
                TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i13).hints.get(i10);
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
                if (k4Var.A) {
                    sp0Var.X0(r4, k4Var);
                    break;
                } else {
                    tL_dialog.id = r4;
                    sp0Var.U0(null, tL_dialog);
                    boolean z13 = sp0Var.Q.h(r4) >= 0;
                    if (k4Var.w) {
                        k4Var.v.a(z13, true);
                        break;
                    }
                }
                break;
            case 13:
                lu0 lu0Var = (lu0) obj;
                int i26 = i10 - 1;
                if (i26 >= 0 && i26 < LocationController.getLocationsCount()) {
                    lu0Var.n.d(lu0.q(i26));
                    lu0Var.dismiss();
                    break;
                }
                break;
            case 14:
                ov0.P((ov0) obj, i10);
                break;
            case 15:
                gw0 gw0Var = (gw0) obj;
                if (i10 < 1) {
                    gw0Var.getClass();
                    break;
                } else {
                    cw0[] cw0VarArr = gw0Var.U2;
                    if (cw0VarArr != null) {
                        cw0 cw0Var = cw0VarArr[i10 - 1];
                        int dp = AndroidUtilities.dp(64.0f);
                        if (gw0Var.getMeasuredWidth() - view.getRight() < dp) {
                            gw0Var.v0(dp - (gw0Var.getMeasuredWidth() - view.getRight()), 0, er.h);
                        } else if (view.getLeft() < dp) {
                            gw0Var.v0(-(dp - view.getLeft()), 0, er.h);
                        }
                        Utilities.Callback callback = gw0Var.j3;
                        if (callback != null) {
                            callback.run(cw0Var);
                            break;
                        }
                    }
                }
                break;
            case 16:
                ex0.m((ex0) obj, view, i10);
                break;
            case 17:
                wx0 wx0Var = (wx0) obj;
                String str2 = ((vx0) view).a;
                if (wx0Var.s && (ux0Var = wx0Var.c) != null && (ux0Var.getFieldText() instanceof Spanned)) {
                    if (wx0Var.P != null) {
                        intValue = ((Spanned) wx0Var.c.getFieldText()).getSpanStart(wx0Var.P);
                        intValue2 = ((Spanned) wx0Var.c.getFieldText()).getSpanEnd(wx0Var.P);
                    } else {
                        Integer num = wx0Var.R;
                        if (num != null && wx0Var.S != null) {
                            intValue = num.intValue();
                            intValue2 = wx0Var.S.intValue();
                            wx0Var.S = null;
                            wx0Var.R = null;
                        }
                    }
                    Editable editText = wx0Var.c.getEditText();
                    if (editText != null && intValue >= 0 && intValue2 >= 0 && intValue <= editText.length() && intValue2 <= editText.length()) {
                        if (wx0Var.P != null) {
                            if (wx0Var.c.getFieldText() instanceof Spannable) {
                                ((Spannable) wx0Var.c.getFieldText()).removeSpan(wx0Var.P);
                            }
                            wx0Var.P = null;
                        }
                        String obj2 = editText.toString();
                        String substring = obj2.substring(intValue, intValue2);
                        int length = substring.length();
                        int i27 = intValue2 - length;
                        while (i27 >= 0) {
                            int i28 = i27 + length;
                            if (obj2.substring(i27, i28).equals(substring)) {
                                Paint.FontMetricsInt fontMetricsInt2 = wx0Var.c.getEditField() != null ? wx0Var.c.getEditField().getPaint().getFontMetricsInt() : fontMetricsInt;
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
                                        TLRPC.Document f10 = k5.f(wx0Var.a, parseLong);
                                        SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f10));
                                        spannableString.setSpan(f10 == null ? new t5(parseLong, fontMetricsInt2) : new t5(f10, fontMetricsInt2), 0, spannableString.length(), 33);
                                        replaceEmoji = spannableString;
                                    } catch (Exception unused) {
                                        replaceEmoji = null;
                                    }
                                }
                                if (replaceEmoji != null && ((t5VarArr = (t5[]) editText.getSpans(i27, i28, t5.class)) == null || t5VarArr.length <= 0)) {
                                    Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) editText.getSpans(i27, i28, Emoji.EmojiSpan.class);
                                    if (emojiSpanArr != null) {
                                        for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                                            editText.removeSpan(emojiSpan);
                                        }
                                    }
                                    editText.replace(i27, i28, "");
                                    editText.insert(i27, replaceEmoji);
                                    i27 -= length;
                                    fontMetricsInt = null;
                                }
                            }
                            wx0Var.performHapticFeedback(3, 1);
                            Emoji.addRecentEmoji(str2);
                            wx0Var.s = false;
                            wx0Var.v = true;
                            wx0Var.C = 0;
                            p1Var = wx0Var.d;
                            if (p1Var == null) {
                                p1Var.invalidate();
                                break;
                            }
                        }
                        wx0Var.performHapticFeedback(3, 1);
                        Emoji.addRecentEmoji(str2);
                        wx0Var.s = false;
                        wx0Var.v = true;
                        wx0Var.C = 0;
                        p1Var = wx0Var.d;
                        if (p1Var == null) {
                        }
                    }
                }
                break;
            case 18:
                ThemeEditorView.EditorAlert editorAlert = (ThemeEditorView.EditorAlert) obj;
                ThemeEditorView themeEditorView = ThemeEditorView.this;
                if (i10 != 0) {
                    f2.q0 adapter = editorAlert.c.getAdapter();
                    s01 s01Var = editorAlert.n;
                    if (adapter == s01Var) {
                        int i29 = i10 - 1;
                        ArrayList arrayList9 = s01Var.d;
                        themeEditorView.c = (i29 < 0 || i29 >= arrayList9.size()) ? null : (ArrayList) arrayList9.get(i29);
                    } else {
                        t01 t01Var = editorAlert.r;
                        int i30 = i10 - 1;
                        if (i30 < 0) {
                            t01Var.getClass();
                        } else if (i30 < t01Var.e.size()) {
                            arrayList = (ArrayList) t01Var.e.get(i30);
                            themeEditorView.c = arrayList;
                        }
                        arrayList = null;
                        themeEditorView.c = arrayList;
                    }
                    themeEditorView.d = i10;
                    for (int i31 = 0; i31 < themeEditorView.c.size(); i31++) {
                        org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) themeEditorView.c.get(i31);
                        int i32 = i6Var.f;
                        if (i32 == org.telegram.ui.ActionBar.g6.Nd) {
                            final w71 w71Var = themeEditorView.k;
                            org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(w71Var.b, null, false, false);
                            e3Var.fixNavigationBar();
                            e3Var.title = LocaleController.getString(R.string.ChoosePhoto);
                            e3Var.bigTitle = true;
                            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.ChooseTakePhoto), LocaleController.getString(R.string.SelectFromGallery), LocaleController.getString(R.string.SelectColor), LocaleController.getString(R.string.Default)};
                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.t71
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i33) {
                                    w71 w71Var2 = w71.this;
                                    v71 v71Var = w71Var2.d;
                                    Activity activity = w71Var2.b;
                                    try {
                                        if (i33 != 0) {
                                            if (i33 == 1) {
                                                w71Var2.b();
                                                return;
                                            } else if (i33 == 2) {
                                                v71Var.a();
                                                return;
                                            } else {
                                                if (i33 == 3) {
                                                    v71Var.b(null, null, false);
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
                                                w71Var2.a = generatePicturePath.getAbsolutePath();
                                            }
                                            activity.startActivityForResult(intent, 10);
                                        } catch (Exception e9) {
                                            FileLog.e(e9);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                }
                            };
                            e3Var.items = charSequenceArr;
                            e3Var.itemIcons = null;
                            e3Var.onClickListener = onClickListener;
                            e3Var.show();
                            break;
                        } else {
                            int w02 = org.telegram.ui.ActionBar.g6.w0(i6Var.j, i32, false);
                            i6Var.i = w02;
                            if (i31 == 0) {
                                editorAlert.b.c(w02);
                            }
                        }
                    }
                    editorAlert.L(true);
                    break;
                }
                break;
            default:
                j41 j41Var = (j41) obj;
                f2.q0 adapter2 = j41Var.n.getAdapter();
                pf.l1 l1Var = j41Var.v;
                if (adapter2 == l1Var) {
                    stickerSetCovered = (TLRPC.StickerSetCovered) l1Var.G.get(i10);
                } else {
                    i41 i41Var = j41Var.s;
                    stickerSetCovered = i10 < i41Var.w ? (TLRPC.StickerSetCovered) i41Var.f.get(i10) : null;
                }
                if (stickerSetCovered != null) {
                    j41Var.b(stickerSetCovered.set, null);
                    break;
                }
                break;
        }
    }
}
