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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements hl0 {
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
    /* JADX WARN: Type inference failed for: r1v10, types: [org.telegram.ui.ActionBar.g3, org.telegram.ui.Components.k8] */
    /* JADX WARN: Type inference failed for: r4v15, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // org.telegram.ui.Components.hl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i10, View view) {
        s8 s8Var;
        boolean z4;
        TLRPC.StickerSet stickerSet;
        MessagesController.DialogFilter dialogFilter;
        int i11;
        int i12;
        boolean z10;
        String str;
        vj0 vj0Var;
        int i13;
        oy0 oy0Var;
        int intValue;
        int intValue2;
        dg.u2 u2Var;
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
                org.telegram.ui.a8 a8Var = t8Var.X2;
                w8 w8Var = t8Var.Z2;
                if (view instanceof u8) {
                    u8 u8Var = (u8) view;
                    if (!u8Var.d) {
                        s8 s8Var2 = u8Var.a;
                        t8Var.W2 = s8Var2.a;
                        w8Var.a.b(s8Var2, false);
                        if (a8Var != null) {
                            a8Var.l();
                        }
                        w8Var.n0();
                        break;
                    }
                }
                if (t8Var.W2 != 1 && (s8Var = t8Var.Y2) != null) {
                    t8Var.W2 = 1;
                    w8Var.a.b(s8Var, true);
                    if (a8Var != null) {
                        a8Var.l();
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
                    frameLayout.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.j6.Oh));
                    TextView textView = new TextView(w8Var.getParentActivity());
                    textView.setTextSize(1, 14.0f);
                    textView.setText(LocaleController.getString(R.string.SetColor));
                    textView.setGravity(17);
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                    frameLayout.addView(textView, k7.b6.e(-2, -2, 17));
                    linearLayout.addView(frameLayout, k7.b6.d(-1, 48.0f, 0, 16.0f, -8.0f, 16.0f, 16.0f));
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
                jp.o((jp) obj, view, i10);
                break;
            case 4:
                dr drVar = (dr) obj;
                rl0 rl0Var = drVar.d;
                if (i10 > 3) {
                    drVar.a0 = (TLRPC.Peer) drVar.V.get(i10 - 4);
                    if (view instanceof org.telegram.ui.Cells.f4) {
                        z4 = true;
                        ((org.telegram.ui.Cells.f4) view).c(true, true);
                    } else {
                        z4 = true;
                    }
                    int i21 = 0;
                    while (i21 < rl0Var.getChildCount()) {
                        View childAt = rl0Var.getChildAt(i21);
                        if (childAt != view && (childAt instanceof org.telegram.ui.Cells.f4)) {
                            ((org.telegram.ui.Cells.f4) childAt).c(false, z4);
                        }
                        i21++;
                        z4 = true;
                    }
                    break;
                }
                break;
            case 5:
                kz kzVar = ((rx) obj).C;
                int i22 = kzVar.Z0;
                if (view.getTag() instanceof TLRPC.StickerSetCovered) {
                    TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) view.getTag();
                    ArrayList arrayList2 = new ArrayList();
                    org.telegram.ui.ActionBar.p2 p2Var = kzVar.V1;
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
                    lv lvVar = new lv(p2Var, kzVar.getContext(), p2Var == null ? kzVar.W1 : p2Var.getResourceProvider(), arrayList2);
                    if (i15 >= 0) {
                        lvVar.L = i15;
                    }
                    if (p2Var != null) {
                        p2Var.showDialog(lvVar);
                        break;
                    } else {
                        lvVar.show();
                        break;
                    }
                }
                break;
            case 6:
                kz kzVar2 = ((bz) obj).v;
                kzVar2.q1.o(new e51(kzVar2.getContext(), new cx(kzVar2), kzVar2.u1, kzVar2.v1, kzVar2.w1, (TLRPC.StickerSetCovered) view.getTag(), kzVar2.W1));
                break;
            case 7:
                o00 o00Var = (o00) obj;
                org.telegram.ui.hu huVar = o00Var.r;
                ArrayList arrayList3 = o00Var.c.d.s;
                MessagesController.DialogFilter dialogFilter2 = i10 < arrayList3.size() ? (MessagesController.DialogFilter) arrayList3.get(i10) : null;
                boolean z11 = view instanceof org.telegram.ui.ActionBar.z2 ? ((org.telegram.ui.ActionBar.z2) view).e : false;
                org.telegram.ui.qy qyVar = ((org.telegram.ui.rw) huVar.b).a;
                ArrayList arrayList4 = qyVar.F2;
                ArrayList H = o00.H(qyVar, dialogFilter2, arrayList4, true, false);
                if (!z11) {
                    int size = H.size() + (dialogFilter2 != null ? dialogFilter2.alwaysShow.size() : 0);
                    if ((size > qyVar.getMessagesController().dialogFiltersChatsLimitDefault && !qyVar.getUserConfig().isPremium()) || size > qyVar.getMessagesController().dialogFiltersChatsLimitPremium) {
                        Context context = qyVar.fragmentView.getContext();
                        i11 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
                        qyVar.showDialog(new eg.v0(4, i11, context, qyVar, null));
                        o00Var.dismiss();
                        break;
                    }
                }
                if (dialogFilter2 == null) {
                    qyVar.presentFragment(new org.telegram.ui.c10(null, H));
                } else if (z11) {
                    for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                        dialogFilter2.neverShow.add((Long) arrayList4.get(i23));
                        dialogFilter2.alwaysShow.remove(arrayList4.get(i23));
                    }
                    MessagesController.DialogFilter dialogFilter3 = dialogFilter2;
                    org.telegram.ui.c10.t0(dialogFilter3, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, true, false, qyVar, null);
                    long longValue = arrayList4.size() == 1 ? ((Long) arrayList4.get(0)).longValue() : 0L;
                    UndoView Y3 = qyVar.Y3();
                    if (Y3 != null) {
                        Y3.k(longValue, 21, Integer.valueOf(arrayList4.size()), dialogFilter3, null, null);
                    }
                    qyVar = qyVar;
                } else {
                    if (H.isEmpty()) {
                        dialogFilter = dialogFilter2;
                    } else {
                        for (int i24 = 0; i24 < H.size(); i24++) {
                            dialogFilter2.neverShow.remove(H.get(i24));
                        }
                        dialogFilter2.alwaysShow.addAll(H);
                        dialogFilter = dialogFilter2;
                        org.telegram.ui.c10.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, true, false, qyVar, null);
                    }
                    qyVar = qyVar;
                    long longValue2 = H.size() == 1 ? ((Long) H.get(0)).longValue() : 0L;
                    MessagesController.DialogFilter dialogFilter4 = dialogFilter;
                    UndoView Y32 = qyVar.Y3();
                    if (Y32 != null) {
                        Y32.k(longValue2, 20, Integer.valueOf(H.size()), dialogFilter4, null, null);
                    }
                }
                qyVar.b4(true);
                o00Var.dismiss();
                break;
            case 8:
                d10 d10Var = (d10) obj;
                org.telegram.ui.ActionBar.p2 p2Var2 = d10Var.n;
                ArrayList arrayList5 = d10Var.d0;
                ArrayList arrayList6 = d10Var.f0;
                if ((view instanceof org.telegram.ui.Cells.f4) && (i12 = (i10 - 1) - d10Var.o0) >= 0 && i12 < arrayList5.size()) {
                    long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList5.get(i12));
                    if (!arrayList6.contains(Long.valueOf(peerDialogId))) {
                        z10 = true;
                        arrayList6.add(Long.valueOf(peerDialogId));
                        ((org.telegram.ui.Cells.f4) view).c(true, true);
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
                        ((org.telegram.ui.Cells.f4) view).c(false, true);
                    }
                    d10Var.U(z10);
                    d10Var.V();
                    d10Var.Q(false);
                    break;
                }
                break;
            case 9:
                u30 u30Var = (u30) obj;
                if (i10 == u30Var.f0) {
                    u30Var.d0.a.j1(true);
                    u30Var.dismiss();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.a5) {
                    org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
                    if (!u30Var.c0.contains(Long.valueOf(a5Var.getUserId()))) {
                        u30Var.d0.a.m1(a5Var.getUserId(), true);
                        break;
                    }
                }
                break;
            case 10:
                yj0 yj0Var = (yj0) obj;
                ArrayList arrayList8 = yj0Var.n;
                int j10 = yj0Var.f.j(i10);
                if (j10 == 0) {
                    xj0 xj0Var = yj0Var.B;
                    if (xj0Var != null) {
                        xj0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList8.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList8.get(i10));
                        break;
                    }
                } else if (j10 == 1 && (vj0Var = yj0Var.D) != null) {
                    vj0Var.f(yj0Var.F);
                    break;
                }
                break;
            case 11:
                pk0 pk0Var = (pk0) obj;
                ok0 ok0Var = pk0Var.d0;
                if (ok0Var != null && (view instanceof nk0)) {
                    ok0Var.j(pk0Var, ((nk0) view).e, false, false);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                lq0 lq0Var = ((hq0) obj).H;
                i13 = ((org.telegram.ui.ActionBar.g3) lq0Var).currentAccount;
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
                if (m4Var.B) {
                    lq0Var.X0(r4, m4Var);
                    break;
                } else {
                    tL_dialog.id = r4;
                    lq0Var.U0(null, tL_dialog);
                    boolean z12 = lq0Var.R.h(r4) >= 0;
                    if (m4Var.w) {
                        m4Var.v.a(z12, true);
                        break;
                    }
                }
                break;
            case 13:
                cv0 cv0Var = (cv0) obj;
                int i26 = i10 - 1;
                if (i26 >= 0 && i26 < LocationController.getLocationsCount()) {
                    cv0Var.n.b(cv0.p(i26));
                    cv0Var.dismiss();
                    break;
                }
                break;
            case 14:
                fw0.P((fw0) obj, i10);
                break;
            case 15:
                xw0 xw0Var = (xw0) obj;
                if (i10 < 1) {
                    xw0Var.getClass();
                    break;
                } else {
                    tw0[] tw0VarArr = xw0Var.V2;
                    if (tw0VarArr != null) {
                        tw0 tw0Var = tw0VarArr[i10 - 1];
                        int dp = AndroidUtilities.dp(64.0f);
                        if (xw0Var.getMeasuredWidth() - view.getRight() < dp) {
                            xw0Var.v0(dp - (xw0Var.getMeasuredWidth() - view.getRight()), 0, mr.h);
                        } else if (view.getLeft() < dp) {
                            xw0Var.v0(-(dp - view.getLeft()), 0, mr.h);
                        }
                        Utilities.Callback callback = xw0Var.k3;
                        if (callback != null) {
                            callback.run(tw0Var);
                            break;
                        }
                    }
                }
                break;
            case 16:
                xx0.m((xx0) obj, view, i10);
                break;
            case 17:
                qy0 qy0Var = (qy0) obj;
                String str2 = ((py0) view).a;
                if (qy0Var.s && (oy0Var = qy0Var.c) != null && (oy0Var.getFieldText() instanceof Spanned)) {
                    if (qy0Var.Q != null) {
                        intValue = ((Spanned) qy0Var.c.getFieldText()).getSpanStart(qy0Var.Q);
                        intValue2 = ((Spanned) qy0Var.c.getFieldText()).getSpanEnd(qy0Var.Q);
                    } else {
                        Integer num = qy0Var.S;
                        if (num != null && qy0Var.T != null) {
                            intValue = num.intValue();
                            intValue2 = qy0Var.T.intValue();
                            qy0Var.T = null;
                            qy0Var.S = null;
                        }
                    }
                    Editable editText = qy0Var.c.getEditText();
                    if (editText != null && intValue >= 0 && intValue2 >= 0 && intValue <= editText.length() && intValue2 <= editText.length()) {
                        if (qy0Var.Q != null) {
                            if (qy0Var.c.getFieldText() instanceof Spannable) {
                                ((Spannable) qy0Var.c.getFieldText()).removeSpan(qy0Var.Q);
                            }
                            qy0Var.Q = null;
                        }
                        String obj2 = editText.toString();
                        String substring = obj2.substring(intValue, intValue2);
                        int length = substring.length();
                        int i27 = intValue2 - length;
                        while (i27 >= 0) {
                            int i28 = i27 + length;
                            if (obj2.substring(i27, i28).equals(substring)) {
                                Paint.FontMetricsInt fontMetricsInt2 = qy0Var.c.getEditField() != null ? qy0Var.c.getEditField().getPaint().getFontMetricsInt() : fontMetricsInt;
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
                                        TLRPC.Document f10 = l5.f(qy0Var.a, parseLong);
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
                            qy0Var.performHapticFeedback(3, 1);
                            Emoji.addRecentEmoji(str2);
                            qy0Var.s = false;
                            qy0Var.v = true;
                            qy0Var.D = 0;
                            u2Var = qy0Var.d;
                            if (u2Var == null) {
                                u2Var.invalidate();
                                break;
                            }
                        }
                        qy0Var.performHapticFeedback(3, 1);
                        Emoji.addRecentEmoji(str2);
                        qy0Var.s = false;
                        qy0Var.v = true;
                        qy0Var.D = 0;
                        u2Var = qy0Var.d;
                        if (u2Var == null) {
                        }
                    }
                }
                break;
            case 18:
                ThemeEditorView.EditorAlert editorAlert = (ThemeEditorView.EditorAlert) obj;
                ThemeEditorView themeEditorView = ThemeEditorView.this;
                if (i10 != 0) {
                    f2.o0 adapter = editorAlert.c.getAdapter();
                    n11 n11Var = editorAlert.n;
                    if (adapter == n11Var) {
                        int i29 = i10 - 1;
                        ArrayList arrayList9 = n11Var.d;
                        themeEditorView.c = (i29 < 0 || i29 >= arrayList9.size()) ? null : (ArrayList) arrayList9.get(i29);
                    } else {
                        o11 o11Var = editorAlert.r;
                        int i30 = i10 - 1;
                        if (i30 < 0) {
                            o11Var.getClass();
                        } else if (i30 < o11Var.e.size()) {
                            arrayList = (ArrayList) o11Var.e.get(i30);
                            themeEditorView.c = arrayList;
                        }
                        arrayList = null;
                        themeEditorView.c = arrayList;
                    }
                    themeEditorView.d = i10;
                    for (int i31 = 0; i31 < themeEditorView.c.size(); i31++) {
                        org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) themeEditorView.c.get(i31);
                        int i32 = l6Var.f;
                        if (i32 == org.telegram.ui.ActionBar.j6.Nd) {
                            final s81 s81Var = themeEditorView.k;
                            org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(s81Var.b, null, false, false);
                            g3Var.fixNavigationBar();
                            g3Var.title = LocaleController.getString(R.string.ChoosePhoto);
                            g3Var.bigTitle = true;
                            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.ChooseTakePhoto), LocaleController.getString(R.string.SelectFromGallery), LocaleController.getString(R.string.SelectColor), LocaleController.getString(R.string.Default)};
                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.p81
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i33) {
                                    s81 s81Var2 = s81.this;
                                    r81 r81Var = s81Var2.d;
                                    Activity activity = s81Var2.b;
                                    try {
                                        if (i33 != 0) {
                                            if (i33 == 1) {
                                                s81Var2.b();
                                                return;
                                            } else if (i33 == 2) {
                                                r81Var.a();
                                                return;
                                            } else {
                                                if (i33 == 3) {
                                                    r81Var.b(null, null, false);
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
                                                s81Var2.a = generatePicturePath.getAbsolutePath();
                                            }
                                            activity.startActivityForResult(intent, 10);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                    }
                                }
                            };
                            g3Var.items = charSequenceArr;
                            g3Var.itemIcons = null;
                            g3Var.onClickListener = onClickListener;
                            g3Var.show();
                            break;
                        } else {
                            int w02 = org.telegram.ui.ActionBar.j6.w0(l6Var.j, i32, false);
                            l6Var.i = w02;
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
                e51 e51Var = (e51) obj;
                f2.o0 adapter2 = e51Var.n.getAdapter();
                tf.m1 m1Var = e51Var.v;
                if (adapter2 == m1Var) {
                    stickerSetCovered = (TLRPC.StickerSetCovered) m1Var.H.get(i10);
                } else {
                    d51 d51Var = e51Var.s;
                    stickerSetCovered = i10 < d51Var.w ? (TLRPC.StickerSetCovered) d51Var.f.get(i10) : null;
                }
                if (stickerSetCovered != null) {
                    e51Var.b(stickerSetCovered.set, null);
                    break;
                }
                break;
        }
    }
}
