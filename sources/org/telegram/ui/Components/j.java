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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements ml0 {
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
    /* JADX WARN: Type inference failed for: r1v10, types: [org.telegram.ui.ActionBar.f3, org.telegram.ui.Components.r8] */
    /* JADX WARN: Type inference failed for: r4v15, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // org.telegram.ui.Components.ml0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i10, View view) {
        z8 z8Var;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        MessagesController.DialogFilter dialogFilter;
        int i11;
        int i12;
        boolean z11;
        String str;
        zj0 zj0Var;
        int i13;
        yy0 yy0Var;
        int intValue;
        int intValue2;
        ai.f0 f0Var;
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
                ((e0) obj).O0.G(i10 - 1);
                break;
            case 1:
                ((q) obj).f0.G(i10 - 1);
                break;
            case 2:
                a9 a9Var = (a9) obj;
                org.telegram.ui.x7 x7Var = a9Var.a3;
                d9 d9Var = a9Var.c3;
                if (view instanceof b9) {
                    b9 b9Var = (b9) view;
                    if (!b9Var.d) {
                        z8 z8Var2 = b9Var.a;
                        a9Var.Z2 = z8Var2.a;
                        d9Var.a.b(z8Var2, false);
                        if (x7Var != null) {
                            x7Var.l();
                        }
                        d9Var.n0();
                        break;
                    }
                }
                if (a9Var.Z2 != 1 && (z8Var = a9Var.b3) != null) {
                    a9Var.Z2 = 1;
                    d9Var.a.b(z8Var, true);
                    if (x7Var != null) {
                        x7Var.l();
                    }
                    d9Var.n0();
                    break;
                } else if (d9Var.S == null) {
                    if (!d9Var.a.v) {
                        d9Var.g0(true, true, true);
                    }
                    z8 z8Var3 = d9Var.a.h;
                    boolean[] zArr = {false};
                    AndroidUtilities.requestAdjustNothing(d9Var.getParentActivity(), d9Var.getClassGuid());
                    r8 r8Var = new r8(d9Var, d9Var.getParentActivity());
                    d9Var.S = r8Var;
                    r8Var.fixNavigationBar();
                    d9Var.S.pauseAllHeavyOperations = false;
                    d9Var.h = true;
                    d9Var.e.setBackground(new BitmapDrawable(d9Var.getParentActivity().getResources(), AndroidUtilities.makeBlurBitmap(d9Var.fragmentView, 12.0f, 10)));
                    d9Var.h = false;
                    d9Var.e.setVisibility(0);
                    d9Var.e.setAlpha(0.0f);
                    d9Var.f = true;
                    d9Var.fragmentView.invalidate();
                    d9Var.e.animate().setListener(new s8(d9Var, r11)).alpha(1.0f).setDuration(200L).start();
                    d9Var.Y = new z8();
                    t8 t8Var = new t8(d9Var.getParentActivity(), r11, new p8(d9Var, i16), r11);
                    z8 z8Var4 = d9Var.a.h;
                    if (z8Var4 != null) {
                        z8 z8Var5 = d9Var.Y;
                        int i17 = z8Var4.f;
                        z8Var5.f = i17;
                        t8Var.e(i17, 3);
                        z8 z8Var6 = d9Var.Y;
                        int i18 = d9Var.a.h.e;
                        z8Var6.e = i18;
                        t8Var.e(i18, 2);
                        z8 z8Var7 = d9Var.Y;
                        int i19 = d9Var.a.h.d;
                        z8Var7.d = i19;
                        t8Var.e(i19, 1);
                        z8 z8Var8 = d9Var.Y;
                        int i20 = d9Var.a.h.c;
                        z8Var8.c = i20;
                        t8Var.e(i20, 0);
                    }
                    z8 z8Var9 = d9Var.Y;
                    if (z8Var9.f != 0) {
                        i16 = 4;
                    } else if (z8Var9.e != 0) {
                        i16 = 3;
                    } else if (z8Var9.d == 0) {
                        i16 = 1;
                    }
                    t8Var.f(-1, 4, i16, false);
                    d9Var.a.b(d9Var.Y, true);
                    d9Var.n0();
                    ?? linearLayout = new LinearLayout(d9Var.getParentActivity());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(0, AndroidUtilities.dp(8.0f), 0, 0);
                    linearLayout.addView(t8Var);
                    FrameLayout frameLayout = new FrameLayout(d9Var.getParentActivity());
                    frameLayout.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.j6.Oh));
                    TextView textView = new TextView(d9Var.getParentActivity());
                    textView.setTextSize(1, 14.0f);
                    textView.setText(LocaleController.getString(R.string.SetColor));
                    textView.setGravity(17);
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                    frameLayout.addView(textView, w7.y5.e(-2, -2, 17));
                    linearLayout.addView(frameLayout, w7.y5.d(-1, 48.0f, 0, 16.0f, -8.0f, 16.0f, 16.0f));
                    frameLayout.setOnClickListener(new org.telegram.ui.sf(19, d9Var, zArr));
                    d9Var.S.setCustomView(linearLayout);
                    r8 r8Var2 = d9Var.S;
                    r8Var2.smoothKeyboardAnimationEnabled = true;
                    r8Var2.setDimBehind(false);
                    d9Var.S.show();
                    d9Var.isLightStatusBar();
                    break;
                }
                break;
            case 3:
                mp.o((mp) obj, view, i10);
                break;
            case 4:
                gr grVar = (gr) obj;
                yl0 yl0Var = grVar.d;
                if (i10 > 3) {
                    grVar.d0 = (TLRPC.Peer) grVar.Y.get(i10 - 4);
                    if (view instanceof org.telegram.ui.Cells.h4) {
                        z10 = true;
                        ((org.telegram.ui.Cells.h4) view).c(true, true);
                    } else {
                        z10 = true;
                    }
                    int i21 = 0;
                    while (i21 < yl0Var.getChildCount()) {
                        View childAt = yl0Var.getChildAt(i21);
                        if (childAt != view && (childAt instanceof org.telegram.ui.Cells.h4)) {
                            ((org.telegram.ui.Cells.h4) childAt).c(false, z10);
                        }
                        i21++;
                        z10 = true;
                    }
                    break;
                }
                break;
            case 5:
                kz kzVar = ((tx) obj).F;
                int i22 = kzVar.c1;
                if (view.getTag() instanceof TLRPC.StickerSetCovered) {
                    TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) view.getTag();
                    ArrayList arrayList2 = new ArrayList();
                    org.telegram.ui.ActionBar.n2 n2Var = kzVar.Y1;
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
                    tv tvVar = new tv(n2Var, kzVar.getContext(), n2Var == null ? kzVar.Z1 : n2Var.getResourceProvider(), arrayList2);
                    if (i15 >= 0) {
                        tvVar.O = i15;
                    }
                    if (n2Var != null) {
                        n2Var.showDialog(tvVar);
                        break;
                    } else {
                        tvVar.show();
                        break;
                    }
                }
                break;
            case 6:
                kz kzVar2 = ((bz) obj).v;
                kzVar2.t1.o(new u51(kzVar2.getContext(), new fx(kzVar2), kzVar2.x1, kzVar2.y1, kzVar2.z1, (TLRPC.StickerSetCovered) view.getTag(), kzVar2.Z1));
                break;
            case 7:
                n00 n00Var = (n00) obj;
                org.telegram.ui.fu fuVar = n00Var.r;
                ArrayList arrayList3 = n00Var.c.d.s;
                MessagesController.DialogFilter dialogFilter2 = i10 < arrayList3.size() ? (MessagesController.DialogFilter) arrayList3.get(i10) : null;
                boolean z12 = view instanceof org.telegram.ui.ActionBar.y2 ? ((org.telegram.ui.ActionBar.y2) view).e : false;
                org.telegram.ui.uy uyVar = ((org.telegram.ui.uw) fuVar.b).a;
                ArrayList arrayList4 = uyVar.I2;
                ArrayList I = n00.I(uyVar, dialogFilter2, arrayList4, true, false);
                if (!z12) {
                    int size = I.size() + (dialogFilter2 != null ? dialogFilter2.alwaysShow.size() : 0);
                    if ((size > uyVar.getMessagesController().dialogFiltersChatsLimitDefault && !uyVar.getUserConfig().isPremium()) || size > uyVar.getMessagesController().dialogFiltersChatsLimitPremium) {
                        Context context = uyVar.fragmentView.getContext();
                        i11 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                        uyVar.showDialog(new rg.j0(4, i11, context, uyVar, null));
                        n00Var.dismiss();
                        break;
                    }
                }
                if (dialogFilter2 == null) {
                    uyVar.presentFragment(new org.telegram.ui.f10(null, I));
                } else if (z12) {
                    for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                        dialogFilter2.neverShow.add((Long) arrayList4.get(i23));
                        dialogFilter2.alwaysShow.remove(arrayList4.get(i23));
                    }
                    MessagesController.DialogFilter dialogFilter3 = dialogFilter2;
                    org.telegram.ui.f10.t0(dialogFilter3, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, true, false, uyVar, null);
                    long longValue = arrayList4.size() == 1 ? ((Long) arrayList4.get(0)).longValue() : 0L;
                    UndoView Y3 = uyVar.Y3();
                    if (Y3 != null) {
                        Y3.k(longValue, 21, Integer.valueOf(arrayList4.size()), dialogFilter3, null, null);
                    }
                    uyVar = uyVar;
                } else {
                    if (I.isEmpty()) {
                        dialogFilter = dialogFilter2;
                    } else {
                        for (int i24 = 0; i24 < I.size(); i24++) {
                            dialogFilter2.neverShow.remove(I.get(i24));
                        }
                        dialogFilter2.alwaysShow.addAll(I);
                        dialogFilter = dialogFilter2;
                        org.telegram.ui.f10.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, true, false, uyVar, null);
                    }
                    uyVar = uyVar;
                    long longValue2 = I.size() == 1 ? ((Long) I.get(0)).longValue() : 0L;
                    MessagesController.DialogFilter dialogFilter4 = dialogFilter;
                    UndoView Y32 = uyVar.Y3();
                    if (Y32 != null) {
                        Y32.k(longValue2, 20, Integer.valueOf(I.size()), dialogFilter4, null, null);
                    }
                }
                uyVar.b4(true);
                n00Var.dismiss();
                break;
            case 8:
                c10 c10Var = (c10) obj;
                org.telegram.ui.ActionBar.n2 n2Var2 = c10Var.n;
                ArrayList arrayList5 = c10Var.g0;
                ArrayList arrayList6 = c10Var.i0;
                if ((view instanceof org.telegram.ui.Cells.h4) && (i12 = (i10 - 1) - c10Var.r0) >= 0 && i12 < arrayList5.size()) {
                    long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList5.get(i12));
                    if (!arrayList6.contains(Long.valueOf(peerDialogId))) {
                        z11 = true;
                        arrayList6.add(Long.valueOf(peerDialogId));
                        ((org.telegram.ui.Cells.h4) view).c(true, true);
                    } else if (c10Var.h0.contains(Long.valueOf(peerDialogId))) {
                        int i25 = -c10Var.C0;
                        c10Var.C0 = i25;
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
                        if (c10Var.D0 != peerDialogId || System.currentTimeMillis() - c10Var.E0 > 1500) {
                            c10Var.D0 = peerDialogId;
                            c10Var.E0 = System.currentTimeMillis();
                            pc g10 = new xc(c10Var.k0, null).g(str, arrayList7);
                            g10.j = 1500;
                            g10.j();
                            break;
                        }
                    } else {
                        arrayList6.remove(Long.valueOf(peerDialogId));
                        z11 = true;
                        ((org.telegram.ui.Cells.h4) view).c(false, true);
                    }
                    c10Var.U(z11);
                    c10Var.V();
                    c10Var.Q(false);
                    break;
                }
                break;
            case 9:
                r30 r30Var = (r30) obj;
                if (i10 == r30Var.i0) {
                    r30Var.g0.a.j1(true);
                    r30Var.dismiss();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.c5) {
                    org.telegram.ui.Cells.c5 c5Var = (org.telegram.ui.Cells.c5) view;
                    if (!r30Var.f0.contains(Long.valueOf(c5Var.getUserId()))) {
                        r30Var.g0.a.m1(c5Var.getUserId(), true);
                        break;
                    }
                }
                break;
            case 10:
                ck0 ck0Var = (ck0) obj;
                ArrayList arrayList8 = ck0Var.n;
                int j3 = ck0Var.f.j(i10);
                if (j3 == 0) {
                    bk0 bk0Var = ck0Var.E;
                    if (bk0Var != null) {
                        bk0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList8.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList8.get(i10));
                        break;
                    }
                } else if (j3 == 1 && (zj0Var = ck0Var.G) != null) {
                    zj0Var.e(ck0Var.I);
                    break;
                }
                break;
            case 11:
                sk0 sk0Var = (sk0) obj;
                rk0 rk0Var = sk0Var.g0;
                if (rk0Var != null && (view instanceof qk0)) {
                    rk0Var.h(sk0Var, ((qk0) view).e, false, false);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                wq0 wq0Var = ((sq0) obj).K;
                i13 = ((org.telegram.ui.ActionBar.f3) wq0Var).currentAccount;
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
                if (o4Var.E) {
                    wq0Var.X0(r4, o4Var);
                    break;
                } else {
                    tL_dialog.id = r4;
                    wq0Var.U0(null, tL_dialog);
                    boolean z13 = wq0Var.U.h(r4) >= 0;
                    if (o4Var.w) {
                        o4Var.v.a(z13, true);
                        break;
                    }
                }
                break;
            case 13:
                pv0 pv0Var = (pv0) obj;
                int i26 = i10 - 1;
                if (i26 >= 0 && i26 < LocationController.getLocationsCount()) {
                    pv0Var.n.b(pv0.p(i26));
                    pv0Var.dismiss();
                    break;
                }
                break;
            case 14:
                rw0.P((rw0) obj, i10);
                break;
            case 15:
                jx0 jx0Var = (jx0) obj;
                if (i10 < 1) {
                    jx0Var.getClass();
                    break;
                } else {
                    fx0[] fx0VarArr = jx0Var.Y2;
                    if (fx0VarArr != null) {
                        fx0 fx0Var = fx0VarArr[i10 - 1];
                        int dp = AndroidUtilities.dp(64.0f);
                        if (jx0Var.getMeasuredWidth() - view.getRight() < dp) {
                            jx0Var.w0(dp - (jx0Var.getMeasuredWidth() - view.getRight()), 0, qr.h);
                        } else if (view.getLeft() < dp) {
                            jx0Var.w0(-(dp - view.getLeft()), 0, qr.h);
                        }
                        Utilities.Callback callback = jx0Var.n3;
                        if (callback != null) {
                            callback.run(fx0Var);
                            break;
                        }
                    }
                }
                break;
            case 16:
                iy0.m((iy0) obj, view, i10);
                break;
            case 17:
                az0 az0Var = (az0) obj;
                String str2 = ((zy0) view).a;
                if (az0Var.s && (yy0Var = az0Var.c) != null && (yy0Var.getFieldText() instanceof Spanned)) {
                    if (az0Var.T != null) {
                        intValue = ((Spanned) az0Var.c.getFieldText()).getSpanStart(az0Var.T);
                        intValue2 = ((Spanned) az0Var.c.getFieldText()).getSpanEnd(az0Var.T);
                    } else {
                        Integer num = az0Var.V;
                        if (num != null && az0Var.W != null) {
                            intValue = num.intValue();
                            intValue2 = az0Var.W.intValue();
                            az0Var.W = null;
                            az0Var.V = null;
                        }
                    }
                    Editable editText = az0Var.c.getEditText();
                    if (editText != null && intValue >= 0 && intValue2 >= 0 && intValue <= editText.length() && intValue2 <= editText.length()) {
                        if (az0Var.T != null) {
                            if (az0Var.c.getFieldText() instanceof Spannable) {
                                ((Spannable) az0Var.c.getFieldText()).removeSpan(az0Var.T);
                            }
                            az0Var.T = null;
                        }
                        String obj2 = editText.toString();
                        String substring = obj2.substring(intValue, intValue2);
                        int length = substring.length();
                        int i27 = intValue2 - length;
                        while (i27 >= 0) {
                            int i28 = i27 + length;
                            if (obj2.substring(i27, i28).equals(substring)) {
                                Paint.FontMetricsInt fontMetricsInt2 = az0Var.c.getEditField() != null ? az0Var.c.getEditField().getPaint().getFontMetricsInt() : fontMetricsInt;
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
                                        TLRPC.Document f7 = p5.f(az0Var.a, parseLong);
                                        SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f7));
                                        spannableString.setSpan(f7 == null ? new y5(parseLong, fontMetricsInt2) : new y5(f7, fontMetricsInt2), 0, spannableString.length(), 33);
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
                            az0Var.performHapticFeedback(3, 1);
                            Emoji.addRecentEmoji(str2);
                            az0Var.s = false;
                            az0Var.v = true;
                            az0Var.G = 0;
                            f0Var = az0Var.d;
                            if (f0Var == null) {
                                f0Var.invalidate();
                                break;
                            }
                        }
                        az0Var.performHapticFeedback(3, 1);
                        Emoji.addRecentEmoji(str2);
                        az0Var.s = false;
                        az0Var.v = true;
                        az0Var.G = 0;
                        f0Var = az0Var.d;
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
                    a21 a21Var = editorAlert.n;
                    if (adapter == a21Var) {
                        int i29 = i10 - 1;
                        ArrayList arrayList9 = a21Var.d;
                        themeEditorView.c = (i29 < 0 || i29 >= arrayList9.size()) ? null : (ArrayList) arrayList9.get(i29);
                    } else {
                        b21 b21Var = editorAlert.r;
                        int i30 = i10 - 1;
                        if (i30 < 0) {
                            b21Var.getClass();
                        } else if (i30 < b21Var.e.size()) {
                            arrayList = (ArrayList) b21Var.e.get(i30);
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
                            final g91 g91Var = themeEditorView.k;
                            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) g91Var.b, (org.telegram.ui.ActionBar.f6) null, false);
                            f3Var.fixNavigationBar();
                            f3Var.title = LocaleController.getString(R.string.ChoosePhoto);
                            f3Var.bigTitle = true;
                            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.ChooseTakePhoto), LocaleController.getString(R.string.SelectFromGallery), LocaleController.getString(R.string.SelectColor), LocaleController.getString(R.string.Default)};
                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.d91
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i33) {
                                    g91 g91Var2 = g91.this;
                                    f91 f91Var = g91Var2.d;
                                    Activity activity = g91Var2.b;
                                    try {
                                        if (i33 != 0) {
                                            if (i33 == 1) {
                                                g91Var2.b();
                                                return;
                                            } else if (i33 == 2) {
                                                f91Var.a();
                                                return;
                                            } else {
                                                if (i33 == 3) {
                                                    f91Var.b(null, null, false);
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
                                                g91Var2.a = generatePicturePath.getAbsolutePath();
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
                            f3Var.items = charSequenceArr;
                            f3Var.itemIcons = null;
                            f3Var.onClickListener = onClickListener;
                            f3Var.show();
                            break;
                        } else {
                            int w02 = org.telegram.ui.ActionBar.j6.w0(l6Var.j, i32, false);
                            l6Var.i = w02;
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
                u51 u51Var = (u51) obj;
                s4.h0 adapter2 = u51Var.n.getAdapter();
                gg.g2 g2Var = u51Var.v;
                if (adapter2 == g2Var) {
                    stickerSetCovered = (TLRPC.StickerSetCovered) g2Var.K.get(i10);
                } else {
                    t51 t51Var = u51Var.s;
                    stickerSetCovered = i10 < t51Var.w ? (TLRPC.StickerSetCovered) t51Var.f.get(i10) : null;
                }
                if (stickerSetCovered != null) {
                    u51Var.b(stickerSetCovered.set, null);
                    break;
                }
                break;
        }
    }
}
