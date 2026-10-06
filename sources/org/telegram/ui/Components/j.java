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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
    /* JADX WARN: Type inference failed for: r1v10, types: [org.telegram.ui.ActionBar.f3, org.telegram.ui.Components.s8] */
    /* JADX WARN: Type inference failed for: r4v15, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // org.telegram.ui.Components.ml0
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
        zj0 zj0Var;
        int i13;
        hz0 hz0Var;
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
                org.telegram.ui.z7 z7Var = b9Var.h3;
                e9 e9Var = b9Var.j3;
                if (view instanceof c9) {
                    c9 c9Var = (c9) view;
                    if (!c9Var.d) {
                        a9 a9Var2 = c9Var.a;
                        b9Var.g3 = a9Var2.a;
                        e9Var.a.b(a9Var2, false);
                        if (z7Var != null) {
                            z7Var.l();
                        }
                        e9Var.n0();
                        break;
                    }
                }
                if (b9Var.g3 != 1 && (a9Var = b9Var.i3) != null) {
                    b9Var.g3 = 1;
                    e9Var.a.b(a9Var, true);
                    if (z7Var != null) {
                        z7Var.l();
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
                    frameLayout.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.i6.Oh));
                    TextView textView = new TextView(e9Var.getParentActivity());
                    textView.setTextSize(1, 14.0f);
                    textView.setText(LocaleController.getString(R.string.SetColor));
                    textView.setGravity(17);
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Sh, false));
                    frameLayout.addView(textView, w7.z5.e(-2, -2, 17));
                    linearLayout.addView(frameLayout, w7.z5.d(-1, 48.0f, 0, 16.0f, -8.0f, 16.0f, 16.0f));
                    frameLayout.setOnClickListener(new org.telegram.ui.qf(19, e9Var, zArr));
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
                pp.o((pp) obj, view, i10);
                break;
            case 4:
                jr jrVar = (jr) obj;
                zl0 zl0Var = jrVar.d;
                if (i10 > 3) {
                    jrVar.d0 = (TLRPC.Peer) jrVar.Y.get(i10 - 4);
                    if (view instanceof org.telegram.ui.Cells.g4) {
                        z10 = true;
                        ((org.telegram.ui.Cells.g4) view).c(true, true);
                    } else {
                        z10 = true;
                    }
                    int i21 = 0;
                    while (i21 < zl0Var.getChildCount()) {
                        View childAt = zl0Var.getChildAt(i21);
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
                nz nzVar = ((wx) obj).F;
                int i22 = nzVar.c1;
                if (view.getTag() instanceof TLRPC.StickerSetCovered) {
                    TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) view.getTag();
                    ArrayList arrayList2 = new ArrayList();
                    org.telegram.ui.ActionBar.n2 n2Var = nzVar.Y1;
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
                    wv wvVar = new wv(n2Var, nzVar.getContext(), n2Var == null ? nzVar.Z1 : n2Var.getResourceProvider(), arrayList2);
                    if (i15 >= 0) {
                        wvVar.O = i15;
                    }
                    if (n2Var != null) {
                        n2Var.showDialog(wvVar);
                        break;
                    } else {
                        wvVar.show();
                        break;
                    }
                }
                break;
            case 6:
                nz nzVar2 = ((ez) obj).v;
                nzVar2.t1.o(new d61(nzVar2.getContext(), new hx(nzVar2), nzVar2.x1, nzVar2.y1, nzVar2.z1, (TLRPC.StickerSetCovered) view.getTag(), nzVar2.Z1));
                break;
            case 7:
                q00 q00Var = (q00) obj;
                org.telegram.ui.bu buVar = q00Var.r;
                ArrayList arrayList3 = q00Var.c.d.s;
                MessagesController.DialogFilter dialogFilter2 = i10 < arrayList3.size() ? (MessagesController.DialogFilter) arrayList3.get(i10) : null;
                boolean z12 = view instanceof org.telegram.ui.ActionBar.y2 ? ((org.telegram.ui.ActionBar.y2) view).e : false;
                org.telegram.ui.uy uyVar = ((org.telegram.ui.sw) buVar.b).a;
                ArrayList arrayList4 = uyVar.I2;
                ArrayList G = q00.G(uyVar, dialogFilter2, arrayList4, true, false);
                if (!z12) {
                    int size = G.size() + (dialogFilter2 != null ? dialogFilter2.alwaysShow.size() : 0);
                    if ((size > uyVar.getMessagesController().dialogFiltersChatsLimitDefault && !uyVar.getUserConfig().isPremium()) || size > uyVar.getMessagesController().dialogFiltersChatsLimitPremium) {
                        Context context = uyVar.fragmentView.getContext();
                        i11 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                        uyVar.showDialog(new rg.k0(4, i11, context, uyVar, null));
                        q00Var.dismiss();
                        break;
                    }
                }
                if (dialogFilter2 == null) {
                    uyVar.presentFragment(new org.telegram.ui.f10(null, G));
                } else if (z12) {
                    for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                        dialogFilter2.neverShow.add((Long) arrayList4.get(i23));
                        dialogFilter2.alwaysShow.remove(arrayList4.get(i23));
                    }
                    MessagesController.DialogFilter dialogFilter3 = dialogFilter2;
                    org.telegram.ui.f10.t0(dialogFilter3, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, true, false, uyVar, null);
                    long longValue = arrayList4.size() == 1 ? ((Long) arrayList4.get(0)).longValue() : 0L;
                    UndoView h42 = uyVar.h4();
                    if (h42 != null) {
                        h42.k(longValue, 21, Integer.valueOf(arrayList4.size()), dialogFilter3, null, null);
                    }
                    uyVar = uyVar;
                } else {
                    if (G.isEmpty()) {
                        dialogFilter = dialogFilter2;
                    } else {
                        for (int i24 = 0; i24 < G.size(); i24++) {
                            dialogFilter2.neverShow.remove(G.get(i24));
                        }
                        dialogFilter2.alwaysShow.addAll(G);
                        dialogFilter = dialogFilter2;
                        org.telegram.ui.f10.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, true, false, uyVar, null);
                    }
                    uyVar = uyVar;
                    long longValue2 = G.size() == 1 ? ((Long) G.get(0)).longValue() : 0L;
                    MessagesController.DialogFilter dialogFilter4 = dialogFilter;
                    UndoView h43 = uyVar.h4();
                    if (h43 != null) {
                        h43.k(longValue2, 20, Integer.valueOf(G.size()), dialogFilter4, null, null);
                    }
                }
                uyVar.k4(true);
                q00Var.dismiss();
                break;
            case 8:
                f10 f10Var = (f10) obj;
                org.telegram.ui.ActionBar.n2 n2Var2 = f10Var.n;
                ArrayList arrayList5 = f10Var.g0;
                ArrayList arrayList6 = f10Var.i0;
                if ((view instanceof org.telegram.ui.Cells.g4) && (i12 = (i10 - 1) - f10Var.r0) >= 0 && i12 < arrayList5.size()) {
                    long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList5.get(i12));
                    if (!arrayList6.contains(Long.valueOf(peerDialogId))) {
                        z11 = true;
                        arrayList6.add(Long.valueOf(peerDialogId));
                        ((org.telegram.ui.Cells.g4) view).c(true, true);
                    } else if (f10Var.h0.contains(Long.valueOf(peerDialogId))) {
                        int i25 = -f10Var.C0;
                        f10Var.C0 = i25;
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
                        if (f10Var.D0 != peerDialogId || System.currentTimeMillis() - f10Var.E0 > 1500) {
                            f10Var.D0 = peerDialogId;
                            f10Var.E0 = System.currentTimeMillis();
                            rc g10 = new yc(f10Var.k0, null).g(str, arrayList7);
                            g10.j = 1500;
                            g10.j();
                            break;
                        }
                    } else {
                        arrayList6.remove(Long.valueOf(peerDialogId));
                        z11 = true;
                        ((org.telegram.ui.Cells.g4) view).c(false, true);
                    }
                    f10Var.S(z11);
                    f10Var.T();
                    f10Var.O(false);
                    break;
                }
                break;
            case 9:
                v30 v30Var = (v30) obj;
                if (i10 == v30Var.i0) {
                    v30Var.g0.a.j1(true);
                    v30Var.dismiss();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.b5) {
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
                    if (!v30Var.f0.contains(Long.valueOf(b5Var.getUserId()))) {
                        v30Var.g0.a.m1(b5Var.getUserId(), true);
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
                    zj0Var.f(ck0Var.I);
                    break;
                }
                break;
            case 11:
                sk0 sk0Var = (sk0) obj;
                rk0 rk0Var = sk0Var.g0;
                if (rk0Var != null && (view instanceof qk0)) {
                    rk0Var.i(sk0Var, ((qk0) view).e, false, false);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                br0 br0Var = ((xq0) obj).K;
                i13 = ((org.telegram.ui.ActionBar.f3) br0Var).currentAccount;
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
                    br0Var.U0(r4, n4Var);
                    break;
                } else {
                    tL_dialog.id = r4;
                    br0Var.R0(null, tL_dialog);
                    boolean z13 = br0Var.U.h(r4) >= 0;
                    if (n4Var.w) {
                        n4Var.v.a(z13, true);
                        break;
                    }
                }
                break;
            case 13:
                uv0 uv0Var = (uv0) obj;
                int i26 = i10 - 1;
                if (i26 >= 0 && i26 < LocationController.getLocationsCount()) {
                    uv0Var.n.b(uv0.p(i26));
                    uv0Var.dismiss();
                    break;
                }
                break;
            case 14:
                bx0.N((bx0) obj, i10);
                break;
            case 15:
                sx0 sx0Var = (sx0) obj;
                if (i10 < 1) {
                    sx0Var.getClass();
                    break;
                } else {
                    ox0[] ox0VarArr = sx0Var.f3;
                    if (ox0VarArr != null) {
                        ox0 ox0Var = ox0VarArr[i10 - 1];
                        int dp = AndroidUtilities.dp(64.0f);
                        if (sx0Var.getMeasuredWidth() - view.getRight() < dp) {
                            sx0Var.w0(dp - (sx0Var.getMeasuredWidth() - view.getRight()), 0, tr.h);
                        } else if (view.getLeft() < dp) {
                            sx0Var.w0(-(dp - view.getLeft()), 0, tr.h);
                        }
                        Utilities.Callback callback = sx0Var.u3;
                        if (callback != null) {
                            callback.run(ox0Var);
                            break;
                        }
                    }
                }
                break;
            case 16:
                ry0.m((ry0) obj, view, i10);
                break;
            case 17:
                jz0 jz0Var = (jz0) obj;
                String str2 = ((iz0) view).a;
                if (jz0Var.s && (hz0Var = jz0Var.c) != null && (hz0Var.getFieldText() instanceof Spanned)) {
                    if (jz0Var.T != null) {
                        intValue = ((Spanned) jz0Var.c.getFieldText()).getSpanStart(jz0Var.T);
                        intValue2 = ((Spanned) jz0Var.c.getFieldText()).getSpanEnd(jz0Var.T);
                    } else {
                        Integer num = jz0Var.V;
                        if (num != null && jz0Var.W != null) {
                            intValue = num.intValue();
                            intValue2 = jz0Var.W.intValue();
                            jz0Var.W = null;
                            jz0Var.V = null;
                        }
                    }
                    Editable editText = jz0Var.c.getEditText();
                    if (editText != null && intValue >= 0 && intValue2 >= 0 && intValue <= editText.length() && intValue2 <= editText.length()) {
                        if (jz0Var.T != null) {
                            if (jz0Var.c.getFieldText() instanceof Spannable) {
                                ((Spannable) jz0Var.c.getFieldText()).removeSpan(jz0Var.T);
                            }
                            jz0Var.T = null;
                        }
                        String obj2 = editText.toString();
                        String substring = obj2.substring(intValue, intValue2);
                        int length = substring.length();
                        int i27 = intValue2 - length;
                        while (i27 >= 0) {
                            int i28 = i27 + length;
                            if (obj2.substring(i27, i28).equals(substring)) {
                                Paint.FontMetricsInt fontMetricsInt2 = jz0Var.c.getEditField() != null ? jz0Var.c.getEditField().getPaint().getFontMetricsInt() : fontMetricsInt;
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
                                        TLRPC.Document f7 = q5.f(jz0Var.a, parseLong);
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
                            jz0Var.performHapticFeedback(3, 1);
                            Emoji.addRecentEmoji(str2);
                            jz0Var.s = false;
                            jz0Var.v = true;
                            jz0Var.G = 0;
                            f0Var = jz0Var.d;
                            if (f0Var == null) {
                                f0Var.invalidate();
                                break;
                            }
                        }
                        jz0Var.performHapticFeedback(3, 1);
                        Emoji.addRecentEmoji(str2);
                        jz0Var.s = false;
                        jz0Var.v = true;
                        jz0Var.G = 0;
                        f0Var = jz0Var.d;
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
                    j21 j21Var = editorAlert.n;
                    if (adapter == j21Var) {
                        int i29 = i10 - 1;
                        ArrayList arrayList9 = j21Var.d;
                        themeEditorView.c = (i29 < 0 || i29 >= arrayList9.size()) ? null : (ArrayList) arrayList9.get(i29);
                    } else {
                        k21 k21Var = editorAlert.r;
                        int i30 = i10 - 1;
                        if (i30 < 0) {
                            k21Var.getClass();
                        } else if (i30 < k21Var.e.size()) {
                            arrayList = (ArrayList) k21Var.e.get(i30);
                            themeEditorView.c = arrayList;
                        }
                        arrayList = null;
                        themeEditorView.c = arrayList;
                    }
                    themeEditorView.d = i10;
                    for (int i31 = 0; i31 < themeEditorView.c.size(); i31++) {
                        org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) themeEditorView.c.get(i31);
                        int i32 = k6Var.f;
                        if (i32 == org.telegram.ui.ActionBar.i6.Nd) {
                            final o91 o91Var = themeEditorView.k;
                            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) o91Var.b, (org.telegram.ui.ActionBar.d6) null, false);
                            f3Var.fixNavigationBar();
                            f3Var.title = LocaleController.getString(R.string.ChoosePhoto);
                            f3Var.bigTitle = true;
                            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.ChooseTakePhoto), LocaleController.getString(R.string.SelectFromGallery), LocaleController.getString(R.string.SelectColor), LocaleController.getString(R.string.Default)};
                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.l91
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i33) {
                                    o91 o91Var2 = o91.this;
                                    n91 n91Var = o91Var2.d;
                                    Activity activity = o91Var2.b;
                                    try {
                                        if (i33 != 0) {
                                            if (i33 == 1) {
                                                o91Var2.b();
                                                return;
                                            } else if (i33 == 2) {
                                                n91Var.a();
                                                return;
                                            } else {
                                                if (i33 == 3) {
                                                    n91Var.b(null, null, false);
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
                                                o91Var2.a = generatePicturePath.getAbsolutePath();
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
                            int w02 = org.telegram.ui.ActionBar.i6.w0(k6Var.j, i32, false);
                            k6Var.i = w02;
                            if (i31 == 0) {
                                editorAlert.b.c(w02);
                            }
                        }
                    }
                    editorAlert.J(true);
                    break;
                }
                break;
            default:
                d61 d61Var = (d61) obj;
                s4.h0 adapter2 = d61Var.n.getAdapter();
                gg.g2 g2Var = d61Var.v;
                if (adapter2 == g2Var) {
                    stickerSetCovered = (TLRPC.StickerSetCovered) g2Var.K.get(i10);
                } else {
                    c61 c61Var = d61Var.s;
                    stickerSetCovered = i10 < c61Var.w ? (TLRPC.StickerSetCovered) c61Var.f.get(i10) : null;
                }
                if (stickerSetCovered != null) {
                    d61Var.b(stickerSetCovered.set, null);
                    break;
                }
                break;
        }
    }
}
