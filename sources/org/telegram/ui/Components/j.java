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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements kl0 {
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
    /* JADX WARN: Type inference failed for: r1v10, types: [org.telegram.ui.ActionBar.e3, org.telegram.ui.Components.s8] */
    /* JADX WARN: Type inference failed for: r4v15, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // org.telegram.ui.Components.kl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i10, View view) {
        a9 a9Var;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        MessagesController.DialogFilter dialogFilter;
        int i11;
        int i12;
        boolean z11;
        String str;
        xj0 xj0Var;
        int i13;
        vy0 vy0Var;
        int intValue;
        int intValue2;
        ai.f0 f0Var;
        CharSequence replaceEmoji;
        z5[] z5VarArr;
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
                ((e0) obj).O0.G(i10 - 1);
                break;
            case 1:
                ((q) obj).f0.G(i10 - 1);
                break;
            case 2:
                b9 b9Var = (b9) obj;
                org.telegram.ui.w7 w7Var = b9Var.a3;
                e9 e9Var = b9Var.c3;
                if (view instanceof c9) {
                    c9 c9Var = (c9) view;
                    if (!c9Var.d) {
                        a9 a9Var2 = c9Var.a;
                        b9Var.Z2 = a9Var2.a;
                        e9Var.a.b(a9Var2, false);
                        if (w7Var != null) {
                            w7Var.l();
                        }
                        e9Var.n0();
                        break;
                    }
                }
                if (b9Var.Z2 != 1 && (a9Var = b9Var.b3) != null) {
                    b9Var.Z2 = 1;
                    e9Var.a.b(a9Var, true);
                    if (w7Var != null) {
                        w7Var.l();
                    }
                    e9Var.n0();
                    break;
                } else if (e9Var.S == null) {
                    if (!e9Var.a.v) {
                        e9Var.g0(true, true, true);
                    }
                    a9 a9Var3 = e9Var.a.h;
                    boolean[] zArr = {false};
                    AndroidUtilities.requestAdjustNothing(e9Var.getParentActivity(), e9Var.getClassGuid());
                    s8 s8Var = new s8(e9Var, e9Var.getParentActivity());
                    e9Var.S = s8Var;
                    s8Var.fixNavigationBar();
                    e9Var.S.pauseAllHeavyOperations = false;
                    e9Var.h = true;
                    e9Var.e.setBackground(new BitmapDrawable(e9Var.getParentActivity().getResources(), AndroidUtilities.makeBlurBitmap(e9Var.fragmentView, 12.0f, 10)));
                    e9Var.h = false;
                    e9Var.e.setVisibility(0);
                    e9Var.e.setAlpha(0.0f);
                    e9Var.f = true;
                    e9Var.fragmentView.invalidate();
                    e9Var.e.animate().setListener(new t8(e9Var, r11)).alpha(1.0f).setDuration(200L).start();
                    e9Var.Y = new a9();
                    u8 u8Var = new u8(e9Var.getParentActivity(), r11, new q8(e9Var, i16), r11);
                    a9 a9Var4 = e9Var.a.h;
                    if (a9Var4 != null) {
                        a9 a9Var5 = e9Var.Y;
                        int i17 = a9Var4.f;
                        a9Var5.f = i17;
                        u8Var.e(i17, 3);
                        a9 a9Var6 = e9Var.Y;
                        int i18 = e9Var.a.h.e;
                        a9Var6.e = i18;
                        u8Var.e(i18, 2);
                        a9 a9Var7 = e9Var.Y;
                        int i19 = e9Var.a.h.d;
                        a9Var7.d = i19;
                        u8Var.e(i19, 1);
                        a9 a9Var8 = e9Var.Y;
                        int i20 = e9Var.a.h.c;
                        a9Var8.c = i20;
                        u8Var.e(i20, 0);
                    }
                    a9 a9Var9 = e9Var.Y;
                    if (a9Var9.f != 0) {
                        i16 = 4;
                    } else if (a9Var9.e != 0) {
                        i16 = 3;
                    } else if (a9Var9.d == 0) {
                        i16 = 1;
                    }
                    u8Var.f(-1, 4, i16, false);
                    e9Var.a.b(e9Var.Y, true);
                    e9Var.n0();
                    ?? linearLayout = new LinearLayout(e9Var.getParentActivity());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(0, AndroidUtilities.dp(8.0f), 0, 0);
                    linearLayout.addView(u8Var);
                    FrameLayout frameLayout = new FrameLayout(e9Var.getParentActivity());
                    frameLayout.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.h6.Oh));
                    TextView textView = new TextView(e9Var.getParentActivity());
                    textView.setTextSize(1, 14.0f);
                    textView.setText(LocaleController.getString(R.string.SetColor));
                    textView.setGravity(17);
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sh, false));
                    frameLayout.addView(textView, w7.y5.e(-2, -2, 17));
                    linearLayout.addView(frameLayout, w7.y5.d(-1, 48.0f, 0, 16.0f, -8.0f, 16.0f, 16.0f));
                    frameLayout.setOnClickListener(new org.telegram.ui.pf(19, e9Var, zArr));
                    e9Var.S.setCustomView(linearLayout);
                    s8 s8Var2 = e9Var.S;
                    s8Var2.smoothKeyboardAnimationEnabled = true;
                    s8Var2.setDimBehind(false);
                    e9Var.S.show();
                    e9Var.isLightStatusBar();
                    break;
                }
                break;
            case 3:
                np.o((np) obj, view, i10);
                break;
            case 4:
                hr hrVar = (hr) obj;
                wl0 wl0Var = hrVar.d;
                if (i10 > 3) {
                    hrVar.d0 = (TLRPC.Peer) hrVar.Y.get(i10 - 4);
                    if (view instanceof org.telegram.ui.Cells.g4) {
                        z10 = true;
                        ((org.telegram.ui.Cells.g4) view).c(true, true);
                    } else {
                        z10 = true;
                    }
                    int i21 = 0;
                    while (i21 < wl0Var.getChildCount()) {
                        View childAt = wl0Var.getChildAt(i21);
                        if (childAt != view && (childAt instanceof org.telegram.ui.Cells.g4)) {
                            ((org.telegram.ui.Cells.g4) childAt).c(false, z10);
                        }
                        i21++;
                        z10 = true;
                    }
                    break;
                }
                break;
            case 5:
                lz lzVar = ((ux) obj).F;
                int i22 = lzVar.c1;
                if (view.getTag() instanceof TLRPC.StickerSetCovered) {
                    TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) view.getTag();
                    ArrayList arrayList2 = new ArrayList();
                    org.telegram.ui.ActionBar.m2 m2Var = lzVar.Y1;
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
                    uv uvVar = new uv(m2Var, lzVar.getContext(), m2Var == null ? lzVar.Z1 : m2Var.getResourceProvider(), arrayList2);
                    if (i15 >= 0) {
                        uvVar.O = i15;
                    }
                    if (m2Var != null) {
                        m2Var.showDialog(uvVar);
                        break;
                    } else {
                        uvVar.show();
                        break;
                    }
                }
                break;
            case 6:
                lz lzVar2 = ((cz) obj).v;
                lzVar2.t1.o(new r51(lzVar2.getContext(), new gx(lzVar2), lzVar2.x1, lzVar2.y1, lzVar2.z1, (TLRPC.StickerSetCovered) view.getTag(), lzVar2.Z1));
                break;
            case 7:
                o00 o00Var = (o00) obj;
                org.telegram.ui.du duVar = o00Var.r;
                ArrayList arrayList3 = o00Var.c.d.s;
                MessagesController.DialogFilter dialogFilter2 = i10 < arrayList3.size() ? (MessagesController.DialogFilter) arrayList3.get(i10) : null;
                boolean z12 = view instanceof org.telegram.ui.ActionBar.x2 ? ((org.telegram.ui.ActionBar.x2) view).e : false;
                org.telegram.ui.qy qyVar = ((org.telegram.ui.qw) duVar.b).a;
                ArrayList arrayList4 = qyVar.I2;
                ArrayList I = o00.I(qyVar, dialogFilter2, arrayList4, true, false);
                if (!z12) {
                    int size = I.size() + (dialogFilter2 != null ? dialogFilter2.alwaysShow.size() : 0);
                    if ((size > qyVar.getMessagesController().dialogFiltersChatsLimitDefault && !qyVar.getUserConfig().isPremium()) || size > qyVar.getMessagesController().dialogFiltersChatsLimitPremium) {
                        Context context = qyVar.fragmentView.getContext();
                        i11 = ((org.telegram.ui.ActionBar.m2) qyVar).currentAccount;
                        qyVar.showDialog(new rg.j0(4, i11, context, qyVar, null));
                        o00Var.dismiss();
                        break;
                    }
                }
                if (dialogFilter2 == null) {
                    qyVar.presentFragment(new org.telegram.ui.b10(null, I));
                } else if (z12) {
                    for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                        dialogFilter2.neverShow.add((Long) arrayList4.get(i23));
                        dialogFilter2.alwaysShow.remove(arrayList4.get(i23));
                    }
                    MessagesController.DialogFilter dialogFilter3 = dialogFilter2;
                    org.telegram.ui.b10.t0(dialogFilter3, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, true, false, qyVar, null);
                    long longValue = arrayList4.size() == 1 ? ((Long) arrayList4.get(0)).longValue() : 0L;
                    UndoView Y3 = qyVar.Y3();
                    if (Y3 != null) {
                        Y3.k(longValue, 21, Integer.valueOf(arrayList4.size()), dialogFilter3, null, null);
                    }
                    qyVar = qyVar;
                } else {
                    if (I.isEmpty()) {
                        dialogFilter = dialogFilter2;
                    } else {
                        for (int i24 = 0; i24 < I.size(); i24++) {
                            dialogFilter2.neverShow.remove(I.get(i24));
                        }
                        dialogFilter2.alwaysShow.addAll(I);
                        dialogFilter = dialogFilter2;
                        org.telegram.ui.b10.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, true, false, qyVar, null);
                    }
                    qyVar = qyVar;
                    long longValue2 = I.size() == 1 ? ((Long) I.get(0)).longValue() : 0L;
                    MessagesController.DialogFilter dialogFilter4 = dialogFilter;
                    UndoView Y32 = qyVar.Y3();
                    if (Y32 != null) {
                        Y32.k(longValue2, 20, Integer.valueOf(I.size()), dialogFilter4, null, null);
                    }
                }
                qyVar.b4(true);
                o00Var.dismiss();
                break;
            case 8:
                d10 d10Var = (d10) obj;
                org.telegram.ui.ActionBar.m2 m2Var2 = d10Var.n;
                ArrayList arrayList5 = d10Var.g0;
                ArrayList arrayList6 = d10Var.i0;
                if ((view instanceof org.telegram.ui.Cells.g4) && (i12 = (i10 - 1) - d10Var.r0) >= 0 && i12 < arrayList5.size()) {
                    long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList5.get(i12));
                    if (!arrayList6.contains(Long.valueOf(peerDialogId))) {
                        z11 = true;
                        arrayList6.add(Long.valueOf(peerDialogId));
                        ((org.telegram.ui.Cells.g4) view).c(true, true);
                    } else if (d10Var.h0.contains(Long.valueOf(peerDialogId))) {
                        int i25 = -d10Var.C0;
                        d10Var.C0 = i25;
                        AndroidUtilities.shakeViewSpring(view, i25);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        ArrayList arrayList7 = new ArrayList();
                        if (peerDialogId >= 0) {
                            arrayList7.add(m2Var2.getMessagesController().getUser(Long.valueOf(peerDialogId)));
                            str = "beep boop.";
                        } else {
                            TLRPC.Chat chat = m2Var2.getMessagesController().getChat(Long.valueOf(-peerDialogId));
                            String string = ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.getString(R.string.FolderLinkAlreadySubscribed) : LocaleController.getString(R.string.FolderLinkAlreadyJoined);
                            arrayList7.add(chat);
                            str = string;
                        }
                        if (d10Var.D0 != peerDialogId || System.currentTimeMillis() - d10Var.E0 > 1500) {
                            d10Var.D0 = peerDialogId;
                            d10Var.E0 = System.currentTimeMillis();
                            qc g10 = new yc(d10Var.k0, null).g(str, arrayList7);
                            g10.j = 1500;
                            g10.j();
                            break;
                        }
                    } else {
                        arrayList6.remove(Long.valueOf(peerDialogId));
                        z11 = true;
                        ((org.telegram.ui.Cells.g4) view).c(false, true);
                    }
                    d10Var.U(z11);
                    d10Var.V();
                    d10Var.Q(false);
                    break;
                }
                break;
            case 9:
                s30 s30Var = (s30) obj;
                if (i10 == s30Var.i0) {
                    s30Var.g0.a.j1(true);
                    s30Var.dismiss();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.b5) {
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
                    if (!s30Var.f0.contains(Long.valueOf(b5Var.getUserId()))) {
                        s30Var.g0.a.m1(b5Var.getUserId(), true);
                        break;
                    }
                }
                break;
            case 10:
                ak0 ak0Var = (ak0) obj;
                ArrayList arrayList8 = ak0Var.n;
                int j3 = ak0Var.f.j(i10);
                if (j3 == 0) {
                    zj0 zj0Var = ak0Var.E;
                    if (zj0Var != null) {
                        zj0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList8.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList8.get(i10));
                        break;
                    }
                } else if (j3 == 1 && (xj0Var = ak0Var.G) != null) {
                    xj0Var.e(ak0Var.I);
                    break;
                }
                break;
            case 11:
                qk0 qk0Var = (qk0) obj;
                pk0 pk0Var = qk0Var.g0;
                if (pk0Var != null && (view instanceof ok0)) {
                    pk0Var.h(qk0Var, ((ok0) view).e, false, false);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                uq0 uq0Var = ((qq0) obj).K;
                i13 = ((org.telegram.ui.ActionBar.e3) uq0Var).currentAccount;
                TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i13).hints.get(i10);
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
                    uq0Var.X0(r4, n4Var);
                    break;
                } else {
                    tL_dialog.id = r4;
                    uq0Var.U0(null, tL_dialog);
                    boolean z13 = uq0Var.U.h(r4) >= 0;
                    if (n4Var.w) {
                        n4Var.v.a(z13, true);
                        break;
                    }
                }
                break;
            case 13:
                nv0 nv0Var = (nv0) obj;
                int i26 = i10 - 1;
                if (i26 >= 0 && i26 < LocationController.getLocationsCount()) {
                    nv0Var.n.b(nv0.p(i26));
                    nv0Var.dismiss();
                    break;
                }
                break;
            case 14:
                pw0.P((pw0) obj, i10);
                break;
            case 15:
                gx0 gx0Var = (gx0) obj;
                if (i10 < 1) {
                    gx0Var.getClass();
                    break;
                } else {
                    cx0[] cx0VarArr = gx0Var.Y2;
                    if (cx0VarArr != null) {
                        cx0 cx0Var = cx0VarArr[i10 - 1];
                        int dp = AndroidUtilities.dp(64.0f);
                        if (gx0Var.getMeasuredWidth() - view.getRight() < dp) {
                            gx0Var.v0(dp - (gx0Var.getMeasuredWidth() - view.getRight()), 0, rr.h);
                        } else if (view.getLeft() < dp) {
                            gx0Var.v0(-(dp - view.getLeft()), 0, rr.h);
                        }
                        Utilities.Callback callback = gx0Var.n3;
                        if (callback != null) {
                            callback.run(cx0Var);
                            break;
                        }
                    }
                }
                break;
            case 16:
                fy0.m((fy0) obj, view, i10);
                break;
            case 17:
                xy0 xy0Var = (xy0) obj;
                String str2 = ((wy0) view).a;
                if (xy0Var.s && (vy0Var = xy0Var.c) != null && (vy0Var.getFieldText() instanceof Spanned)) {
                    if (xy0Var.T != null) {
                        intValue = ((Spanned) xy0Var.c.getFieldText()).getSpanStart(xy0Var.T);
                        intValue2 = ((Spanned) xy0Var.c.getFieldText()).getSpanEnd(xy0Var.T);
                    } else {
                        Integer num = xy0Var.V;
                        if (num != null && xy0Var.W != null) {
                            intValue = num.intValue();
                            intValue2 = xy0Var.W.intValue();
                            xy0Var.W = null;
                            xy0Var.V = null;
                        }
                    }
                    Editable editText = xy0Var.c.getEditText();
                    if (editText != null && intValue >= 0 && intValue2 >= 0 && intValue <= editText.length() && intValue2 <= editText.length()) {
                        if (xy0Var.T != null) {
                            if (xy0Var.c.getFieldText() instanceof Spannable) {
                                ((Spannable) xy0Var.c.getFieldText()).removeSpan(xy0Var.T);
                            }
                            xy0Var.T = null;
                        }
                        String obj2 = editText.toString();
                        String substring = obj2.substring(intValue, intValue2);
                        int length = substring.length();
                        int i27 = intValue2 - length;
                        while (i27 >= 0) {
                            int i28 = i27 + length;
                            if (obj2.substring(i27, i28).equals(substring)) {
                                Paint.FontMetricsInt fontMetricsInt2 = xy0Var.c.getEditField() != null ? xy0Var.c.getEditField().getPaint().getFontMetricsInt() : fontMetricsInt;
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
                                        TLRPC.Document f7 = q5.f(xy0Var.a, parseLong);
                                        SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f7));
                                        spannableString.setSpan(f7 == null ? new z5(parseLong, fontMetricsInt2) : new z5(f7, fontMetricsInt2), 0, spannableString.length(), 33);
                                        replaceEmoji = spannableString;
                                    } catch (Exception unused) {
                                        replaceEmoji = null;
                                    }
                                }
                                if (replaceEmoji != null && ((z5VarArr = (z5[]) editText.getSpans(i27, i28, z5.class)) == null || z5VarArr.length <= 0)) {
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
                            xy0Var.performHapticFeedback(3, 1);
                            Emoji.addRecentEmoji(str2);
                            xy0Var.s = false;
                            xy0Var.v = true;
                            xy0Var.G = 0;
                            f0Var = xy0Var.d;
                            if (f0Var == null) {
                                f0Var.invalidate();
                                break;
                            }
                        }
                        xy0Var.performHapticFeedback(3, 1);
                        Emoji.addRecentEmoji(str2);
                        xy0Var.s = false;
                        xy0Var.v = true;
                        xy0Var.G = 0;
                        f0Var = xy0Var.d;
                        if (f0Var == null) {
                        }
                    }
                }
                break;
            case 18:
                ThemeEditorView.EditorAlert editorAlert = (ThemeEditorView.EditorAlert) obj;
                ThemeEditorView themeEditorView = ThemeEditorView.this;
                if (i10 != 0) {
                    s4.h0 adapter = editorAlert.c.getAdapter();
                    x11 x11Var = editorAlert.n;
                    if (adapter == x11Var) {
                        int i29 = i10 - 1;
                        ArrayList arrayList9 = x11Var.d;
                        themeEditorView.c = (i29 < 0 || i29 >= arrayList9.size()) ? null : (ArrayList) arrayList9.get(i29);
                    } else {
                        y11 y11Var = editorAlert.r;
                        int i30 = i10 - 1;
                        if (i30 < 0) {
                            y11Var.getClass();
                        } else if (i30 < y11Var.e.size()) {
                            arrayList = (ArrayList) y11Var.e.get(i30);
                            themeEditorView.c = arrayList;
                        }
                        arrayList = null;
                        themeEditorView.c = arrayList;
                    }
                    themeEditorView.d = i10;
                    for (int i31 = 0; i31 < themeEditorView.c.size(); i31++) {
                        org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) themeEditorView.c.get(i31);
                        int i32 = j6Var.f;
                        if (i32 == org.telegram.ui.ActionBar.h6.Nd) {
                            final d91 d91Var = themeEditorView.k;
                            org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) d91Var.b, (org.telegram.ui.ActionBar.d6) null, false);
                            e3Var.fixNavigationBar();
                            e3Var.title = LocaleController.getString(R.string.ChoosePhoto);
                            e3Var.bigTitle = true;
                            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.ChooseTakePhoto), LocaleController.getString(R.string.SelectFromGallery), LocaleController.getString(R.string.SelectColor), LocaleController.getString(R.string.Default)};
                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.a91
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i33) {
                                    d91 d91Var2 = d91.this;
                                    c91 c91Var = d91Var2.d;
                                    Activity activity = d91Var2.b;
                                    try {
                                        if (i33 != 0) {
                                            if (i33 == 1) {
                                                d91Var2.b();
                                                return;
                                            } else if (i33 == 2) {
                                                c91Var.a();
                                                return;
                                            } else {
                                                if (i33 == 3) {
                                                    c91Var.b(null, null, false);
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
                                                d91Var2.a = generatePicturePath.getAbsolutePath();
                                            }
                                            activity.startActivityForResult(intent, 10);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                }
                            };
                            e3Var.items = charSequenceArr;
                            e3Var.itemIcons = null;
                            e3Var.onClickListener = onClickListener;
                            e3Var.show();
                            break;
                        } else {
                            int w02 = org.telegram.ui.ActionBar.h6.w0(j6Var.j, i32, false);
                            j6Var.i = w02;
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
                r51 r51Var = (r51) obj;
                s4.h0 adapter2 = r51Var.n.getAdapter();
                gg.g2 g2Var = r51Var.v;
                if (adapter2 == g2Var) {
                    stickerSetCovered = (TLRPC.StickerSetCovered) g2Var.K.get(i10);
                } else {
                    q51 q51Var = r51Var.s;
                    stickerSetCovered = i10 < q51Var.w ? (TLRPC.StickerSetCovered) q51Var.f.get(i10) : null;
                }
                if (stickerSetCovered != null) {
                    r51Var.b(stickerSetCovered.set, null);
                    break;
                }
                break;
        }
    }
}
