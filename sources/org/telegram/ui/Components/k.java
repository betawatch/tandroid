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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements jl0 {
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
    /* JADX WARN: Type inference failed for: r1v10, types: [org.telegram.ui.ActionBar.h3, org.telegram.ui.Components.k8] */
    /* JADX WARN: Type inference failed for: r4v15, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // org.telegram.ui.Components.jl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i10, View view) {
        s8 s8Var;
        boolean z4;
        TLRPC.StickerSet stickerSet;
        MessagesController.DialogFilter dialogFilter;
        int i11;
        int i12;
        boolean z10;
        String str;
        xj0 xj0Var;
        int i13;
        py0 py0Var;
        int intValue;
        int intValue2;
        eg.s2 s2Var;
        CharSequence replaceEmoji;
        u5[] u5VarArr;
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
                ((f0) obj).L0.G(i10 - 1);
                break;
            case 1:
                ((r) obj).c0.G(i10 - 1);
                break;
            case 2:
                t8 t8Var = (t8) obj;
                org.telegram.ui.y7 y7Var = t8Var.X2;
                w8 w8Var = t8Var.Z2;
                if (view instanceof u8) {
                    u8 u8Var = (u8) view;
                    if (!u8Var.d) {
                        s8 s8Var2 = u8Var.a;
                        t8Var.W2 = s8Var2.a;
                        w8Var.a.b(s8Var2, false);
                        if (y7Var != null) {
                            y7Var.l();
                        }
                        w8Var.n0();
                        break;
                    }
                }
                if (t8Var.W2 != 1 && (s8Var = t8Var.Y2) != null) {
                    t8Var.W2 = 1;
                    w8Var.a.b(s8Var, true);
                    if (y7Var != null) {
                        y7Var.l();
                    }
                    w8Var.n0();
                    break;
                } else if (w8Var.P == null) {
                    if (!w8Var.a.v) {
                        w8Var.g0(true, true, true);
                    }
                    s8 s8Var3 = w8Var.a.h;
                    boolean[] zArr = {false};
                    AndroidUtilities.requestAdjustNothing(w8Var.getParentActivity(), w8Var.getClassGuid());
                    k8 k8Var = new k8(w8Var, w8Var.getParentActivity());
                    w8Var.P = k8Var;
                    k8Var.fixNavigationBar();
                    w8Var.P.pauseAllHeavyOperations = false;
                    w8Var.h = true;
                    w8Var.e.setBackground(new BitmapDrawable(w8Var.getParentActivity().getResources(), AndroidUtilities.makeBlurBitmap(w8Var.fragmentView, 12.0f, 10)));
                    w8Var.h = false;
                    w8Var.e.setVisibility(0);
                    w8Var.e.setAlpha(0.0f);
                    w8Var.f = true;
                    w8Var.fragmentView.invalidate();
                    w8Var.e.animate().setListener(new l8(w8Var, r11)).alpha(1.0f).setDuration(200L).start();
                    w8Var.V = new s8();
                    m8 m8Var = new m8(w8Var.getParentActivity(), r11, new j8(w8Var, i16), r11);
                    s8 s8Var4 = w8Var.a.h;
                    if (s8Var4 != null) {
                        s8 s8Var5 = w8Var.V;
                        int i17 = s8Var4.f;
                        s8Var5.f = i17;
                        m8Var.e(i17, 3);
                        s8 s8Var6 = w8Var.V;
                        int i18 = w8Var.a.h.e;
                        s8Var6.e = i18;
                        m8Var.e(i18, 2);
                        s8 s8Var7 = w8Var.V;
                        int i19 = w8Var.a.h.d;
                        s8Var7.d = i19;
                        m8Var.e(i19, 1);
                        s8 s8Var8 = w8Var.V;
                        int i20 = w8Var.a.h.c;
                        s8Var8.c = i20;
                        m8Var.e(i20, 0);
                    }
                    s8 s8Var9 = w8Var.V;
                    if (s8Var9.f != 0) {
                        i16 = 4;
                    } else if (s8Var9.e != 0) {
                        i16 = 3;
                    } else if (s8Var9.d == 0) {
                        i16 = 1;
                    }
                    m8Var.f(-1, 4, i16, false);
                    w8Var.a.b(w8Var.V, true);
                    w8Var.n0();
                    ?? linearLayout = new LinearLayout(w8Var.getParentActivity());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(0, AndroidUtilities.dp(8.0f), 0, 0);
                    linearLayout.addView(m8Var);
                    FrameLayout frameLayout = new FrameLayout(w8Var.getParentActivity());
                    frameLayout.setBackground(org.telegram.ui.ActionBar.a6.f(new float[]{8.0f}, org.telegram.ui.ActionBar.k6.Oh));
                    TextView textView = new TextView(w8Var.getParentActivity());
                    textView.setTextSize(1, 14.0f);
                    textView.setText(LocaleController.getString(R.string.SetColor));
                    textView.setGravity(17);
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false));
                    frameLayout.addView(textView, k7.c6.e(-2, -2, 17));
                    linearLayout.addView(frameLayout, k7.c6.d(-1, 48.0f, 0, 16.0f, -8.0f, 16.0f, 16.0f));
                    frameLayout.setOnClickListener(new w2(w8Var, zArr));
                    w8Var.P.setCustomView(linearLayout);
                    k8 k8Var2 = w8Var.P;
                    k8Var2.smoothKeyboardAnimationEnabled = true;
                    k8Var2.setDimBehind(false);
                    w8Var.P.show();
                    w8Var.isLightStatusBar();
                    break;
                }
                break;
            case 3:
                mp.o((mp) obj, view, i10);
                break;
            case 4:
                gr grVar = (gr) obj;
                tl0 tl0Var = grVar.d;
                if (i10 > 3) {
                    grVar.a0 = (TLRPC.Peer) grVar.V.get(i10 - 4);
                    if (view instanceof org.telegram.ui.Cells.g4) {
                        z4 = true;
                        ((org.telegram.ui.Cells.g4) view).c(true, true);
                    } else {
                        z4 = true;
                    }
                    int i21 = 0;
                    while (i21 < tl0Var.getChildCount()) {
                        View childAt = tl0Var.getChildAt(i21);
                        if (childAt != view && (childAt instanceof org.telegram.ui.Cells.g4)) {
                            ((org.telegram.ui.Cells.g4) childAt).c(false, z4);
                        }
                        i21++;
                        z4 = true;
                    }
                    break;
                }
                break;
            case 5:
                mz mzVar = ((tx) obj).C;
                int i22 = mzVar.Z0;
                if (view.getTag() instanceof TLRPC.StickerSetCovered) {
                    TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) view.getTag();
                    ArrayList arrayList2 = new ArrayList();
                    org.telegram.ui.ActionBar.p2 p2Var = mzVar.V1;
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
                    ov ovVar = new ov(p2Var, mzVar.getContext(), p2Var == null ? mzVar.W1 : p2Var.getResourceProvider(), arrayList2);
                    if (i15 >= 0) {
                        ovVar.L = i15;
                    }
                    if (p2Var != null) {
                        p2Var.showDialog(ovVar);
                        break;
                    } else {
                        ovVar.show();
                        break;
                    }
                }
                break;
            case 6:
                mz mzVar2 = ((dz) obj).v;
                mzVar2.q1.o(new f51(mzVar2.getContext(), new ex(mzVar2), mzVar2.u1, mzVar2.v1, mzVar2.w1, (TLRPC.StickerSetCovered) view.getTag(), mzVar2.W1));
                break;
            case 7:
                o00 o00Var = (o00) obj;
                org.telegram.ui.gu guVar = o00Var.r;
                ArrayList arrayList3 = o00Var.c.d.s;
                MessagesController.DialogFilter dialogFilter2 = i10 < arrayList3.size() ? (MessagesController.DialogFilter) arrayList3.get(i10) : null;
                boolean z11 = view instanceof org.telegram.ui.ActionBar.a3 ? ((org.telegram.ui.ActionBar.a3) view).e : false;
                org.telegram.ui.py pyVar = ((org.telegram.ui.qw) guVar.b).a;
                ArrayList arrayList4 = pyVar.F2;
                ArrayList H = o00.H(pyVar, dialogFilter2, arrayList4, true, false);
                if (!z11) {
                    int size = H.size() + (dialogFilter2 != null ? dialogFilter2.alwaysShow.size() : 0);
                    if ((size > pyVar.getMessagesController().dialogFiltersChatsLimitDefault && !pyVar.getUserConfig().isPremium()) || size > pyVar.getMessagesController().dialogFiltersChatsLimitPremium) {
                        Context context = pyVar.fragmentView.getContext();
                        i11 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                        pyVar.showDialog(new fg.v0(4, i11, context, pyVar, null));
                        o00Var.dismiss();
                        break;
                    }
                }
                if (dialogFilter2 == null) {
                    pyVar.presentFragment(new org.telegram.ui.b10(null, H));
                } else if (z11) {
                    for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                        dialogFilter2.neverShow.add((Long) arrayList4.get(i23));
                        dialogFilter2.alwaysShow.remove(arrayList4.get(i23));
                    }
                    MessagesController.DialogFilter dialogFilter3 = dialogFilter2;
                    org.telegram.ui.b10.t0(dialogFilter3, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, true, false, pyVar, null);
                    long longValue = arrayList4.size() == 1 ? ((Long) arrayList4.get(0)).longValue() : 0L;
                    UndoView Y3 = pyVar.Y3();
                    if (Y3 != null) {
                        Y3.k(longValue, 21, Integer.valueOf(arrayList4.size()), dialogFilter3, null, null);
                    }
                    pyVar = pyVar;
                } else {
                    if (H.isEmpty()) {
                        dialogFilter = dialogFilter2;
                    } else {
                        for (int i24 = 0; i24 < H.size(); i24++) {
                            dialogFilter2.neverShow.remove(H.get(i24));
                        }
                        dialogFilter2.alwaysShow.addAll(H);
                        dialogFilter = dialogFilter2;
                        org.telegram.ui.b10.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, true, false, pyVar, null);
                    }
                    pyVar = pyVar;
                    long longValue2 = H.size() == 1 ? ((Long) H.get(0)).longValue() : 0L;
                    MessagesController.DialogFilter dialogFilter4 = dialogFilter;
                    UndoView Y32 = pyVar.Y3();
                    if (Y32 != null) {
                        Y32.k(longValue2, 20, Integer.valueOf(H.size()), dialogFilter4, null, null);
                    }
                }
                pyVar.b4(true);
                o00Var.dismiss();
                break;
            case 8:
                d10 d10Var = (d10) obj;
                org.telegram.ui.ActionBar.p2 p2Var2 = d10Var.n;
                ArrayList arrayList5 = d10Var.d0;
                ArrayList arrayList6 = d10Var.f0;
                if ((view instanceof org.telegram.ui.Cells.g4) && (i12 = (i10 - 1) - d10Var.o0) >= 0 && i12 < arrayList5.size()) {
                    long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList5.get(i12));
                    if (!arrayList6.contains(Long.valueOf(peerDialogId))) {
                        z10 = true;
                        arrayList6.add(Long.valueOf(peerDialogId));
                        ((org.telegram.ui.Cells.g4) view).c(true, true);
                    } else if (d10Var.e0.contains(Long.valueOf(peerDialogId))) {
                        int i25 = -d10Var.z0;
                        d10Var.z0 = i25;
                        AndroidUtilities.shakeViewSpring(view, i25);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        ArrayList arrayList7 = new ArrayList();
                        if (peerDialogId >= 0) {
                            arrayList7.add(p2Var2.getMessagesController().getUser(Long.valueOf(peerDialogId)));
                            str = "beep boop.";
                        } else {
                            TLRPC.Chat chat = p2Var2.getMessagesController().getChat(Long.valueOf(-peerDialogId));
                            String string = ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.getString(R.string.FolderLinkAlreadySubscribed) : LocaleController.getString(R.string.FolderLinkAlreadyJoined);
                            arrayList7.add(chat);
                            str = string;
                        }
                        if (d10Var.A0 != peerDialogId || System.currentTimeMillis() - d10Var.B0 > 1500) {
                            d10Var.A0 = peerDialogId;
                            d10Var.B0 = System.currentTimeMillis();
                            ic g10 = new qc(d10Var.h0, null).g(str, arrayList7);
                            g10.j = 1500;
                            g10.j();
                            break;
                        }
                    } else {
                        arrayList6.remove(Long.valueOf(peerDialogId));
                        z10 = true;
                        ((org.telegram.ui.Cells.g4) view).c(false, true);
                    }
                    d10Var.U(z10);
                    d10Var.V();
                    d10Var.Q(false);
                    break;
                }
                break;
            case 9:
                v30 v30Var = (v30) obj;
                if (i10 == v30Var.f0) {
                    v30Var.d0.a.j1(true);
                    v30Var.dismiss();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.b5) {
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
                    if (!v30Var.c0.contains(Long.valueOf(b5Var.getUserId()))) {
                        v30Var.d0.a.m1(b5Var.getUserId(), true);
                        break;
                    }
                }
                break;
            case 10:
                ak0 ak0Var = (ak0) obj;
                ArrayList arrayList8 = ak0Var.n;
                int j10 = ak0Var.f.j(i10);
                if (j10 == 0) {
                    zj0 zj0Var = ak0Var.B;
                    if (zj0Var != null) {
                        zj0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList8.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList8.get(i10));
                        break;
                    }
                } else if (j10 == 1 && (xj0Var = ak0Var.D) != null) {
                    xj0Var.e(ak0Var.F);
                    break;
                }
                break;
            case 11:
                rk0 rk0Var = (rk0) obj;
                qk0 qk0Var = rk0Var.d0;
                if (qk0Var != null && (view instanceof pk0)) {
                    qk0Var.o(rk0Var, ((pk0) view).e, false, false);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                mq0 mq0Var = ((iq0) obj).H;
                i13 = ((org.telegram.ui.ActionBar.h3) mq0Var).currentAccount;
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
                if (n4Var.B) {
                    mq0Var.X0(r4, n4Var);
                    break;
                } else {
                    tL_dialog.id = r4;
                    mq0Var.U0(null, tL_dialog);
                    boolean z12 = mq0Var.R.h(r4) >= 0;
                    if (n4Var.w) {
                        n4Var.v.a(z12, true);
                        break;
                    }
                }
                break;
            case 13:
                dv0 dv0Var = (dv0) obj;
                int i26 = i10 - 1;
                if (i26 >= 0 && i26 < LocationController.getLocationsCount()) {
                    dv0Var.n.b(dv0.p(i26));
                    dv0Var.dismiss();
                    break;
                }
                break;
            case 14:
                gw0.P((gw0) obj, i10);
                break;
            case 15:
                yw0 yw0Var = (yw0) obj;
                if (i10 < 1) {
                    yw0Var.getClass();
                    break;
                } else {
                    uw0[] uw0VarArr = yw0Var.V2;
                    if (uw0VarArr != null) {
                        uw0 uw0Var = uw0VarArr[i10 - 1];
                        int dp = AndroidUtilities.dp(64.0f);
                        if (yw0Var.getMeasuredWidth() - view.getRight() < dp) {
                            yw0Var.v0(dp - (yw0Var.getMeasuredWidth() - view.getRight()), 0, pr.h);
                        } else if (view.getLeft() < dp) {
                            yw0Var.v0(-(dp - view.getLeft()), 0, pr.h);
                        }
                        Utilities.Callback callback = yw0Var.k3;
                        if (callback != null) {
                            callback.run(uw0Var);
                            break;
                        }
                    }
                }
                break;
            case 16:
                yx0.m((yx0) obj, view, i10);
                break;
            case 17:
                ry0 ry0Var = (ry0) obj;
                String str2 = ((qy0) view).a;
                if (ry0Var.s && (py0Var = ry0Var.c) != null && (py0Var.getFieldText() instanceof Spanned)) {
                    if (ry0Var.Q != null) {
                        intValue = ((Spanned) ry0Var.c.getFieldText()).getSpanStart(ry0Var.Q);
                        intValue2 = ((Spanned) ry0Var.c.getFieldText()).getSpanEnd(ry0Var.Q);
                    } else {
                        Integer num = ry0Var.S;
                        if (num != null && ry0Var.T != null) {
                            intValue = num.intValue();
                            intValue2 = ry0Var.T.intValue();
                            ry0Var.T = null;
                            ry0Var.S = null;
                        }
                    }
                    Editable editText = ry0Var.c.getEditText();
                    if (editText != null && intValue >= 0 && intValue2 >= 0 && intValue <= editText.length() && intValue2 <= editText.length()) {
                        if (ry0Var.Q != null) {
                            if (ry0Var.c.getFieldText() instanceof Spannable) {
                                ((Spannable) ry0Var.c.getFieldText()).removeSpan(ry0Var.Q);
                            }
                            ry0Var.Q = null;
                        }
                        String obj2 = editText.toString();
                        String substring = obj2.substring(intValue, intValue2);
                        int length = substring.length();
                        int i27 = intValue2 - length;
                        while (i27 >= 0) {
                            int i28 = i27 + length;
                            if (obj2.substring(i27, i28).equals(substring)) {
                                Paint.FontMetricsInt fontMetricsInt2 = ry0Var.c.getEditField() != null ? ry0Var.c.getEditField().getPaint().getFontMetricsInt() : fontMetricsInt;
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
                                        TLRPC.Document f10 = l5.f(ry0Var.a, parseLong);
                                        SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f10));
                                        spannableString.setSpan(f10 == null ? new u5(parseLong, fontMetricsInt2) : new u5(f10, fontMetricsInt2), 0, spannableString.length(), 33);
                                        replaceEmoji = spannableString;
                                    } catch (Exception unused) {
                                        replaceEmoji = null;
                                    }
                                }
                                if (replaceEmoji != null && ((u5VarArr = (u5[]) editText.getSpans(i27, i28, u5.class)) == null || u5VarArr.length <= 0)) {
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
                            ry0Var.performHapticFeedback(3, 1);
                            Emoji.addRecentEmoji(str2);
                            ry0Var.s = false;
                            ry0Var.v = true;
                            ry0Var.D = 0;
                            s2Var = ry0Var.d;
                            if (s2Var == null) {
                                s2Var.invalidate();
                                break;
                            }
                        }
                        ry0Var.performHapticFeedback(3, 1);
                        Emoji.addRecentEmoji(str2);
                        ry0Var.s = false;
                        ry0Var.v = true;
                        ry0Var.D = 0;
                        s2Var = ry0Var.d;
                        if (s2Var == null) {
                        }
                    }
                }
                break;
            case 18:
                ThemeEditorView.EditorAlert editorAlert = (ThemeEditorView.EditorAlert) obj;
                ThemeEditorView themeEditorView = ThemeEditorView.this;
                if (i10 != 0) {
                    f2.p0 adapter = editorAlert.c.getAdapter();
                    o11 o11Var = editorAlert.n;
                    if (adapter == o11Var) {
                        int i29 = i10 - 1;
                        ArrayList arrayList9 = o11Var.d;
                        themeEditorView.c = (i29 < 0 || i29 >= arrayList9.size()) ? null : (ArrayList) arrayList9.get(i29);
                    } else {
                        p11 p11Var = editorAlert.r;
                        int i30 = i10 - 1;
                        if (i30 < 0) {
                            p11Var.getClass();
                        } else if (i30 < p11Var.e.size()) {
                            arrayList = (ArrayList) p11Var.e.get(i30);
                            themeEditorView.c = arrayList;
                        }
                        arrayList = null;
                        themeEditorView.c = arrayList;
                    }
                    themeEditorView.d = i10;
                    for (int i31 = 0; i31 < themeEditorView.c.size(); i31++) {
                        org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) themeEditorView.c.get(i31);
                        int i32 = m6Var.f;
                        if (i32 == org.telegram.ui.ActionBar.k6.Nd) {
                            final t81 t81Var = themeEditorView.k;
                            org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(t81Var.b, null, false, false);
                            h3Var.fixNavigationBar();
                            h3Var.title = LocaleController.getString(R.string.ChoosePhoto);
                            h3Var.bigTitle = true;
                            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.ChooseTakePhoto), LocaleController.getString(R.string.SelectFromGallery), LocaleController.getString(R.string.SelectColor), LocaleController.getString(R.string.Default)};
                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.q81
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i33) {
                                    t81 t81Var2 = t81.this;
                                    s81 s81Var = t81Var2.d;
                                    Activity activity = t81Var2.b;
                                    try {
                                        if (i33 != 0) {
                                            if (i33 == 1) {
                                                t81Var2.b();
                                                return;
                                            } else if (i33 == 2) {
                                                s81Var.a();
                                                return;
                                            } else {
                                                if (i33 == 3) {
                                                    s81Var.b(null, null, false);
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
                                                t81Var2.a = generatePicturePath.getAbsolutePath();
                                            }
                                            activity.startActivityForResult(intent, 10);
                                        } catch (Exception e6) {
                                            FileLog.e(e6);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                }
                            };
                            h3Var.items = charSequenceArr;
                            h3Var.itemIcons = null;
                            h3Var.onClickListener = onClickListener;
                            h3Var.show();
                            break;
                        } else {
                            int w02 = org.telegram.ui.ActionBar.k6.w0(m6Var.j, i32, false);
                            m6Var.i = w02;
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
                f51 f51Var = (f51) obj;
                f2.p0 adapter2 = f51Var.n.getAdapter();
                uf.m1 m1Var = f51Var.v;
                if (adapter2 == m1Var) {
                    stickerSetCovered = (TLRPC.StickerSetCovered) m1Var.H.get(i10);
                } else {
                    e51 e51Var = f51Var.s;
                    stickerSetCovered = i10 < e51Var.w ? (TLRPC.StickerSetCovered) e51Var.f.get(i10) : null;
                }
                if (stickerSetCovered != null) {
                    f51Var.b(stickerSetCovered.set, null);
                    break;
                }
                break;
        }
    }
}
