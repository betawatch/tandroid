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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements zk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(Object obj, int i10) {
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
    /* JADX WARN: Type inference failed for: r1v10, types: [org.telegram.ui.ActionBar.f3, org.telegram.ui.Components.p8] */
    /* JADX WARN: Type inference failed for: r4v15, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // org.telegram.ui.Components.zk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i10, View view) {
        x8 x8Var;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        MessagesController.DialogFilter dialogFilter;
        int i11;
        int i12;
        boolean z11;
        String str;
        mj0 mj0Var;
        int i13;
        dy0 dy0Var;
        int intValue;
        int intValue2;
        bg.x2 x2Var;
        CharSequence replaceEmoji;
        y5[] y5VarArr;
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
                ((g0) obj).K0.G(i10 - 1);
                break;
            case 1:
                ((s) obj).b0.G(i10 - 1);
                break;
            case 2:
                y8 y8Var = (y8) obj;
                org.telegram.ui.u7 u7Var = y8Var.W2;
                b9 b9Var = y8Var.Y2;
                if (view instanceof z8) {
                    z8 z8Var = (z8) view;
                    if (!z8Var.d) {
                        x8 x8Var2 = z8Var.a;
                        y8Var.V2 = x8Var2.a;
                        b9Var.a.b(x8Var2, false);
                        if (u7Var != null) {
                            u7Var.l();
                        }
                        b9Var.n0();
                        break;
                    }
                }
                if (y8Var.V2 != 1 && (x8Var = y8Var.X2) != null) {
                    y8Var.V2 = 1;
                    b9Var.a.b(x8Var, true);
                    if (u7Var != null) {
                        u7Var.l();
                    }
                    b9Var.n0();
                    break;
                } else if (b9Var.O == null) {
                    if (!b9Var.a.v) {
                        b9Var.g0(true, true, true);
                    }
                    x8 x8Var3 = b9Var.a.h;
                    boolean[] zArr = {false};
                    AndroidUtilities.requestAdjustNothing(b9Var.getParentActivity(), b9Var.getClassGuid());
                    p8 p8Var = new p8(b9Var, b9Var.getParentActivity());
                    b9Var.O = p8Var;
                    p8Var.fixNavigationBar();
                    b9Var.O.pauseAllHeavyOperations = false;
                    b9Var.h = true;
                    b9Var.e.setBackground(new BitmapDrawable(b9Var.getParentActivity().getResources(), AndroidUtilities.makeBlurBitmap(b9Var.fragmentView, 12.0f, 10)));
                    b9Var.h = false;
                    b9Var.e.setVisibility(0);
                    b9Var.e.setAlpha(0.0f);
                    b9Var.f = true;
                    b9Var.fragmentView.invalidate();
                    b9Var.e.animate().setListener(new q8(b9Var, r11)).alpha(1.0f).setDuration(200L).start();
                    b9Var.U = new x8();
                    r8 r8Var = new r8(b9Var.getParentActivity(), r11, new o8(b9Var, i16), r11);
                    x8 x8Var4 = b9Var.a.h;
                    if (x8Var4 != null) {
                        x8 x8Var5 = b9Var.U;
                        int i17 = x8Var4.f;
                        x8Var5.f = i17;
                        r8Var.e(i17, 3);
                        x8 x8Var6 = b9Var.U;
                        int i18 = b9Var.a.h.e;
                        x8Var6.e = i18;
                        r8Var.e(i18, 2);
                        x8 x8Var7 = b9Var.U;
                        int i19 = b9Var.a.h.d;
                        x8Var7.d = i19;
                        r8Var.e(i19, 1);
                        x8 x8Var8 = b9Var.U;
                        int i20 = b9Var.a.h.c;
                        x8Var8.c = i20;
                        r8Var.e(i20, 0);
                    }
                    x8 x8Var9 = b9Var.U;
                    if (x8Var9.f != 0) {
                        i16 = 4;
                    } else if (x8Var9.e != 0) {
                        i16 = 3;
                    } else if (x8Var9.d == 0) {
                        i16 = 1;
                    }
                    r8Var.f(-1, 4, i16, false);
                    b9Var.a.b(b9Var.U, true);
                    b9Var.n0();
                    ?? linearLayout = new LinearLayout(b9Var.getParentActivity());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(0, AndroidUtilities.dp(8.0f), 0, 0);
                    linearLayout.addView(r8Var);
                    FrameLayout frameLayout = new FrameLayout(b9Var.getParentActivity());
                    frameLayout.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.g6.Oh));
                    TextView textView = new TextView(b9Var.getParentActivity());
                    textView.setTextSize(1, 14.0f);
                    textView.setText(LocaleController.getString(R.string.SetColor));
                    textView.setGravity(17);
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                    frameLayout.addView(textView, i7.f6.e(-2, -2, 17));
                    linearLayout.addView(frameLayout, i7.f6.d(-1, 48.0f, 0, 16.0f, -8.0f, 16.0f, 16.0f));
                    frameLayout.setOnClickListener(new t2(b9Var, zArr));
                    b9Var.O.setCustomView(linearLayout);
                    p8 p8Var2 = b9Var.O;
                    p8Var2.smoothKeyboardAnimationEnabled = true;
                    p8Var2.setDimBehind(false);
                    b9Var.O.show();
                    b9Var.isLightStatusBar();
                    break;
                }
                break;
            case 3:
                gp.o((gp) obj, view, i10);
                break;
            case 4:
                ar arVar = (ar) obj;
                jl0 jl0Var = arVar.d;
                if (i10 > 3) {
                    arVar.Z = (TLRPC.Peer) arVar.U.get(i10 - 4);
                    if (view instanceof org.telegram.ui.Cells.e4) {
                        z10 = true;
                        ((org.telegram.ui.Cells.e4) view).c(true, true);
                    } else {
                        z10 = true;
                    }
                    int i21 = 0;
                    while (i21 < jl0Var.getChildCount()) {
                        View childAt = jl0Var.getChildAt(i21);
                        if (childAt != view && (childAt instanceof org.telegram.ui.Cells.e4)) {
                            ((org.telegram.ui.Cells.e4) childAt).c(false, z10);
                        }
                        i21++;
                        z10 = true;
                    }
                    break;
                }
                break;
            case 5:
                fz fzVar = ((nx) obj).B;
                int i22 = fzVar.Y0;
                if (view.getTag() instanceof TLRPC.StickerSetCovered) {
                    TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) view.getTag();
                    ArrayList arrayList2 = new ArrayList();
                    org.telegram.ui.ActionBar.o2 o2Var = fzVar.U1;
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
                    jv jvVar = new jv(o2Var, fzVar.getContext(), o2Var == null ? fzVar.V1 : o2Var.getResourceProvider(), arrayList2);
                    if (i15 >= 0) {
                        jvVar.K = i15;
                    }
                    if (o2Var != null) {
                        o2Var.showDialog(jvVar);
                        break;
                    } else {
                        jvVar.show();
                        break;
                    }
                }
                break;
            case 6:
                fz fzVar2 = ((wy) obj).v;
                fzVar2.p1.o(new s41(fzVar2.getContext(), new yw(fzVar2), fzVar2.t1, fzVar2.u1, fzVar2.v1, (TLRPC.StickerSetCovered) view.getTag(), fzVar2.V1));
                break;
            case 7:
                j00 j00Var = (j00) obj;
                org.telegram.ui.xt xtVar = j00Var.r;
                ArrayList arrayList3 = j00Var.c.d.s;
                MessagesController.DialogFilter dialogFilter2 = i10 < arrayList3.size() ? (MessagesController.DialogFilter) arrayList3.get(i10) : null;
                boolean z12 = view instanceof org.telegram.ui.ActionBar.y2 ? ((org.telegram.ui.ActionBar.y2) view).e : false;
                org.telegram.ui.fy fyVar = ((org.telegram.ui.gw) xtVar.b).a;
                ArrayList arrayList4 = fyVar.E2;
                ArrayList H = j00.H(fyVar, dialogFilter2, arrayList4, true, false);
                if (!z12) {
                    int size = H.size() + (dialogFilter2 != null ? dialogFilter2.alwaysShow.size() : 0);
                    if ((size > fyVar.getMessagesController().dialogFiltersChatsLimitDefault && !fyVar.getUserConfig().isPremium()) || size > fyVar.getMessagesController().dialogFiltersChatsLimitPremium) {
                        Context context = fyVar.fragmentView.getContext();
                        i11 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                        fyVar.showDialog(new cg.v0(4, i11, context, fyVar, null));
                        j00Var.dismiss();
                        break;
                    }
                }
                if (dialogFilter2 == null) {
                    fyVar.presentFragment(new org.telegram.ui.p00(null, H));
                } else if (z12) {
                    for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                        dialogFilter2.neverShow.add((Long) arrayList4.get(i23));
                        dialogFilter2.alwaysShow.remove(arrayList4.get(i23));
                    }
                    MessagesController.DialogFilter dialogFilter3 = dialogFilter2;
                    org.telegram.ui.p00.t0(dialogFilter3, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, true, false, fyVar, null);
                    long longValue = arrayList4.size() == 1 ? ((Long) arrayList4.get(0)).longValue() : 0L;
                    UndoView Y3 = fyVar.Y3();
                    if (Y3 != null) {
                        Y3.k(longValue, 21, Integer.valueOf(arrayList4.size()), dialogFilter3, null, null);
                    }
                    fyVar = fyVar;
                } else {
                    if (H.isEmpty()) {
                        dialogFilter = dialogFilter2;
                    } else {
                        for (int i24 = 0; i24 < H.size(); i24++) {
                            dialogFilter2.neverShow.remove(H.get(i24));
                        }
                        dialogFilter2.alwaysShow.addAll(H);
                        dialogFilter = dialogFilter2;
                        org.telegram.ui.p00.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, true, false, fyVar, null);
                    }
                    fyVar = fyVar;
                    long longValue2 = H.size() == 1 ? ((Long) H.get(0)).longValue() : 0L;
                    MessagesController.DialogFilter dialogFilter4 = dialogFilter;
                    UndoView Y32 = fyVar.Y3();
                    if (Y32 != null) {
                        Y32.k(longValue2, 20, Integer.valueOf(H.size()), dialogFilter4, null, null);
                    }
                }
                fyVar.b4(true);
                j00Var.dismiss();
                break;
            case 8:
                y00 y00Var = (y00) obj;
                org.telegram.ui.ActionBar.o2 o2Var2 = y00Var.n;
                ArrayList arrayList5 = y00Var.c0;
                ArrayList arrayList6 = y00Var.e0;
                if ((view instanceof org.telegram.ui.Cells.e4) && (i12 = (i10 - 1) - y00Var.n0) >= 0 && i12 < arrayList5.size()) {
                    long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList5.get(i12));
                    if (!arrayList6.contains(Long.valueOf(peerDialogId))) {
                        z11 = true;
                        arrayList6.add(Long.valueOf(peerDialogId));
                        ((org.telegram.ui.Cells.e4) view).c(true, true);
                    } else if (y00Var.d0.contains(Long.valueOf(peerDialogId))) {
                        int i25 = -y00Var.y0;
                        y00Var.y0 = i25;
                        AndroidUtilities.shakeViewSpring(view, i25);
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
                        if (y00Var.z0 != peerDialogId || System.currentTimeMillis() - y00Var.A0 > 1500) {
                            y00Var.z0 = peerDialogId;
                            y00Var.A0 = System.currentTimeMillis();
                            mc g10 = new tc(y00Var.g0, null).g(str, arrayList7);
                            g10.j = 1500;
                            g10.j();
                            break;
                        }
                    } else {
                        arrayList6.remove(Long.valueOf(peerDialogId));
                        z11 = true;
                        ((org.telegram.ui.Cells.e4) view).c(false, true);
                    }
                    y00Var.U(z11);
                    y00Var.V();
                    y00Var.Q(false);
                    break;
                }
                break;
            case 9:
                p30 p30Var = (p30) obj;
                if (i10 == p30Var.e0) {
                    p30Var.c0.a.j1(true);
                    p30Var.dismiss();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.z4) {
                    org.telegram.ui.Cells.z4 z4Var = (org.telegram.ui.Cells.z4) view;
                    if (!p30Var.b0.contains(Long.valueOf(z4Var.getUserId()))) {
                        p30Var.c0.a.m1(z4Var.getUserId(), true);
                        break;
                    }
                }
                break;
            case 10:
                pj0 pj0Var = (pj0) obj;
                ArrayList arrayList8 = pj0Var.n;
                int j10 = pj0Var.f.j(i10);
                if (j10 == 0) {
                    oj0 oj0Var = pj0Var.A;
                    if (oj0Var != null) {
                        oj0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList8.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList8.get(i10));
                        break;
                    }
                } else if (j10 == 1 && (mj0Var = pj0Var.C) != null) {
                    mj0Var.e(pj0Var.E);
                    break;
                }
                break;
            case 11:
                fk0 fk0Var = (fk0) obj;
                ek0 ek0Var = fk0Var.c0;
                if (ek0Var != null && (view instanceof dk0)) {
                    ek0Var.Q(fk0Var, ((dk0) view).e, false, false);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                dq0 dq0Var = ((zp0) obj).G;
                i13 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
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
                if (l4Var.A) {
                    dq0Var.X0(r4, l4Var);
                    break;
                } else {
                    tL_dialog.id = r4;
                    dq0Var.U0(null, tL_dialog);
                    boolean z13 = dq0Var.Q.h(r4) >= 0;
                    if (l4Var.w) {
                        l4Var.v.a(z13, true);
                        break;
                    }
                }
                break;
            case 13:
                uu0 uu0Var = (uu0) obj;
                int i26 = i10 - 1;
                if (i26 >= 0 && i26 < LocationController.getLocationsCount()) {
                    uu0Var.n.d(uu0.p(i26));
                    uu0Var.dismiss();
                    break;
                }
                break;
            case 14:
                wv0.P((wv0) obj, i10);
                break;
            case 15:
                ow0 ow0Var = (ow0) obj;
                if (i10 < 1) {
                    ow0Var.getClass();
                    break;
                } else {
                    kw0[] kw0VarArr = ow0Var.U2;
                    if (kw0VarArr != null) {
                        kw0 kw0Var = kw0VarArr[i10 - 1];
                        int dp = AndroidUtilities.dp(64.0f);
                        if (ow0Var.getMeasuredWidth() - view.getRight() < dp) {
                            ow0Var.v0(dp - (ow0Var.getMeasuredWidth() - view.getRight()), 0, jr.h);
                        } else if (view.getLeft() < dp) {
                            ow0Var.v0(-(dp - view.getLeft()), 0, jr.h);
                        }
                        Utilities.Callback callback = ow0Var.j3;
                        if (callback != null) {
                            callback.run(kw0Var);
                            break;
                        }
                    }
                }
                break;
            case 16:
                nx0.m((nx0) obj, view, i10);
                break;
            case 17:
                fy0 fy0Var = (fy0) obj;
                String str2 = ((ey0) view).a;
                if (fy0Var.s && (dy0Var = fy0Var.c) != null && (dy0Var.getFieldText() instanceof Spanned)) {
                    if (fy0Var.P != null) {
                        intValue = ((Spanned) fy0Var.c.getFieldText()).getSpanStart(fy0Var.P);
                        intValue2 = ((Spanned) fy0Var.c.getFieldText()).getSpanEnd(fy0Var.P);
                    } else {
                        Integer num = fy0Var.R;
                        if (num != null && fy0Var.S != null) {
                            intValue = num.intValue();
                            intValue2 = fy0Var.S.intValue();
                            fy0Var.S = null;
                            fy0Var.R = null;
                        }
                    }
                    Editable editText = fy0Var.c.getEditText();
                    if (editText != null && intValue >= 0 && intValue2 >= 0 && intValue <= editText.length() && intValue2 <= editText.length()) {
                        if (fy0Var.P != null) {
                            if (fy0Var.c.getFieldText() instanceof Spannable) {
                                ((Spannable) fy0Var.c.getFieldText()).removeSpan(fy0Var.P);
                            }
                            fy0Var.P = null;
                        }
                        String obj2 = editText.toString();
                        String substring = obj2.substring(intValue, intValue2);
                        int length = substring.length();
                        int i27 = intValue2 - length;
                        while (i27 >= 0) {
                            int i28 = i27 + length;
                            if (obj2.substring(i27, i28).equals(substring)) {
                                Paint.FontMetricsInt fontMetricsInt2 = fy0Var.c.getEditField() != null ? fy0Var.c.getEditField().getPaint().getFontMetricsInt() : fontMetricsInt;
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
                                        TLRPC.Document f9 = p5.f(fy0Var.a, parseLong);
                                        SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f9));
                                        spannableString.setSpan(f9 == null ? new y5(parseLong, fontMetricsInt2) : new y5(f9, fontMetricsInt2), 0, spannableString.length(), 33);
                                        replaceEmoji = spannableString;
                                    } catch (Exception unused) {
                                        replaceEmoji = null;
                                    }
                                }
                                if (replaceEmoji != null && ((y5VarArr = (y5[]) editText.getSpans(i27, i28, y5.class)) == null || y5VarArr.length <= 0)) {
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
                            fy0Var.performHapticFeedback(3, 1);
                            Emoji.addRecentEmoji(str2);
                            fy0Var.s = false;
                            fy0Var.v = true;
                            fy0Var.C = 0;
                            x2Var = fy0Var.d;
                            if (x2Var == null) {
                                x2Var.invalidate();
                                break;
                            }
                        }
                        fy0Var.performHapticFeedback(3, 1);
                        Emoji.addRecentEmoji(str2);
                        fy0Var.s = false;
                        fy0Var.v = true;
                        fy0Var.C = 0;
                        x2Var = fy0Var.d;
                        if (x2Var == null) {
                        }
                    }
                }
                break;
            case 18:
                ThemeEditorView.EditorAlert editorAlert = (ThemeEditorView.EditorAlert) obj;
                ThemeEditorView themeEditorView = ThemeEditorView.this;
                if (i10 != 0) {
                    f2.p0 adapter = editorAlert.c.getAdapter();
                    c11 c11Var = editorAlert.n;
                    if (adapter == c11Var) {
                        int i29 = i10 - 1;
                        ArrayList arrayList9 = c11Var.d;
                        themeEditorView.c = (i29 < 0 || i29 >= arrayList9.size()) ? null : (ArrayList) arrayList9.get(i29);
                    } else {
                        d11 d11Var = editorAlert.r;
                        int i30 = i10 - 1;
                        if (i30 < 0) {
                            d11Var.getClass();
                        } else if (i30 < d11Var.e.size()) {
                            arrayList = (ArrayList) d11Var.e.get(i30);
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
                            final g81 g81Var = themeEditorView.k;
                            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(g81Var.b, null, false, false);
                            f3Var.fixNavigationBar();
                            f3Var.title = LocaleController.getString(R.string.ChoosePhoto);
                            f3Var.bigTitle = true;
                            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.ChooseTakePhoto), LocaleController.getString(R.string.SelectFromGallery), LocaleController.getString(R.string.SelectColor), LocaleController.getString(R.string.Default)};
                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.d81
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i33) {
                                    g81 g81Var2 = g81.this;
                                    f81 f81Var = g81Var2.d;
                                    Activity activity = g81Var2.b;
                                    try {
                                        if (i33 != 0) {
                                            if (i33 == 1) {
                                                g81Var2.b();
                                                return;
                                            } else if (i33 == 2) {
                                                f81Var.a();
                                                return;
                                            } else {
                                                if (i33 == 3) {
                                                    f81Var.b(null, null, false);
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
                                                g81Var2.a = generatePicturePath.getAbsolutePath();
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
                            int w02 = org.telegram.ui.ActionBar.g6.w0(i6Var.j, i32, false);
                            i6Var.i = w02;
                            if (i31 == 0) {
                                editorAlert.b.c(w02);
                            }
                        }
                    }
                    editorAlert.K(true);
                    break;
                }
                break;
            default:
                s41 s41Var = (s41) obj;
                f2.p0 adapter2 = s41Var.n.getAdapter();
                rf.m1 m1Var = s41Var.v;
                if (adapter2 == m1Var) {
                    stickerSetCovered = (TLRPC.StickerSetCovered) m1Var.G.get(i10);
                } else {
                    r41 r41Var = s41Var.s;
                    stickerSetCovered = i10 < r41Var.w ? (TLRPC.StickerSetCovered) r41Var.f.get(i10) : null;
                }
                if (stickerSetCovered != null) {
                    s41Var.b(stickerSetCovered.set, null);
                    break;
                }
                break;
        }
    }
}
