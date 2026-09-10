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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
    /* JADX WARN: Type inference failed for: r1v10, types: [org.telegram.ui.ActionBar.h3, org.telegram.ui.Components.r8] */
    /* JADX WARN: Type inference failed for: r4v15, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // org.telegram.ui.Components.jl0
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
        wj0 wj0Var;
        int i13;
        xy0 xy0Var;
        int intValue;
        int intValue2;
        bi.ld ldVar;
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
                ((g0) obj).O0.G(i10 - 1);
                break;
            case 1:
                ((r) obj).f0.G(i10 - 1);
                break;
            case 2:
                a9 a9Var = (a9) obj;
                org.telegram.ui.w7 w7Var = a9Var.a3;
                d9 d9Var = a9Var.c3;
                if (view instanceof b9) {
                    b9 b9Var = (b9) view;
                    if (!b9Var.d) {
                        z8 z8Var2 = b9Var.a;
                        a9Var.Z2 = z8Var2.a;
                        d9Var.a.b(z8Var2, false);
                        if (w7Var != null) {
                            w7Var.l();
                        }
                        d9Var.n0();
                        break;
                    }
                }
                if (a9Var.Z2 != 1 && (z8Var = a9Var.b3) != null) {
                    a9Var.Z2 = 1;
                    d9Var.a.b(z8Var, true);
                    if (w7Var != null) {
                        w7Var.l();
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
                    t8 t8Var = new t8(d9Var.getParentActivity(), r11, new q8(d9Var, i16), r11);
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
                    frameLayout.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.j6.Oh));
                    TextView textView = new TextView(d9Var.getParentActivity());
                    textView.setTextSize(1, 14.0f);
                    textView.setText(LocaleController.getString(R.string.SetColor));
                    textView.setGravity(17);
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                    frameLayout.addView(textView, w7.a6.e(-2, -2, 17));
                    linearLayout.addView(frameLayout, w7.a6.d(-1, 48.0f, 0, 16.0f, -8.0f, 16.0f, 16.0f));
                    frameLayout.setOnClickListener(new org.telegram.ui.sh(16, d9Var, zArr));
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
                sp.o((sp) obj, view, i10);
                break;
            case 4:
                mr mrVar = (mr) obj;
                vl0 vl0Var = mrVar.d;
                if (i10 > 3) {
                    mrVar.d0 = (TLRPC.Peer) mrVar.Y.get(i10 - 4);
                    if (view instanceof org.telegram.ui.Cells.g4) {
                        z10 = true;
                        ((org.telegram.ui.Cells.g4) view).c(true, true);
                    } else {
                        z10 = true;
                    }
                    int i21 = 0;
                    while (i21 < vl0Var.getChildCount()) {
                        View childAt = vl0Var.getChildAt(i21);
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
                rz rzVar = ((yx) obj).F;
                int i22 = rzVar.c1;
                if (view.getTag() instanceof TLRPC.StickerSetCovered) {
                    TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) view.getTag();
                    ArrayList arrayList2 = new ArrayList();
                    org.telegram.ui.ActionBar.p2 p2Var = rzVar.Y1;
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
                    wv wvVar = new wv(p2Var, rzVar.getContext(), p2Var == null ? rzVar.Z1 : p2Var.getResourceProvider(), arrayList2);
                    if (i15 >= 0) {
                        wvVar.O = i15;
                    }
                    if (p2Var != null) {
                        p2Var.showDialog(wvVar);
                        break;
                    } else {
                        wvVar.show();
                        break;
                    }
                }
                break;
            case 6:
                rz rzVar2 = ((iz) obj).v;
                rzVar2.t1.o(new r51(rzVar2.getContext(), new kx(rzVar2), rzVar2.x1, rzVar2.y1, rzVar2.z1, (TLRPC.StickerSetCovered) view.getTag(), rzVar2.Z1));
                break;
            case 7:
                u00 u00Var = (u00) obj;
                org.telegram.ui.iu iuVar = u00Var.r;
                ArrayList arrayList3 = u00Var.c.d.s;
                MessagesController.DialogFilter dialogFilter2 = i10 < arrayList3.size() ? (MessagesController.DialogFilter) arrayList3.get(i10) : null;
                boolean z12 = view instanceof org.telegram.ui.ActionBar.a3 ? ((org.telegram.ui.ActionBar.a3) view).e : false;
                org.telegram.ui.wy wyVar = ((org.telegram.ui.ww) iuVar.b).a;
                ArrayList arrayList4 = wyVar.I2;
                ArrayList I = u00.I(wyVar, dialogFilter2, arrayList4, true, false);
                if (!z12) {
                    int size = I.size() + (dialogFilter2 != null ? dialogFilter2.alwaysShow.size() : 0);
                    if ((size > wyVar.getMessagesController().dialogFiltersChatsLimitDefault && !wyVar.getUserConfig().isPremium()) || size > wyVar.getMessagesController().dialogFiltersChatsLimitPremium) {
                        Context context = wyVar.fragmentView.getContext();
                        i11 = ((org.telegram.ui.ActionBar.p2) wyVar).currentAccount;
                        wyVar.showDialog(new qg.k0(4, i11, context, wyVar, null));
                        u00Var.dismiss();
                        break;
                    }
                }
                if (dialogFilter2 == null) {
                    wyVar.presentFragment(new org.telegram.ui.h10(null, I));
                } else if (z12) {
                    for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                        dialogFilter2.neverShow.add((Long) arrayList4.get(i23));
                        dialogFilter2.alwaysShow.remove(arrayList4.get(i23));
                    }
                    MessagesController.DialogFilter dialogFilter3 = dialogFilter2;
                    org.telegram.ui.h10.t0(dialogFilter3, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, true, false, wyVar, null);
                    long longValue = arrayList4.size() == 1 ? ((Long) arrayList4.get(0)).longValue() : 0L;
                    UndoView Y3 = wyVar.Y3();
                    if (Y3 != null) {
                        Y3.k(longValue, 21, Integer.valueOf(arrayList4.size()), dialogFilter3, null, null);
                    }
                    wyVar = wyVar;
                } else {
                    if (I.isEmpty()) {
                        dialogFilter = dialogFilter2;
                    } else {
                        for (int i24 = 0; i24 < I.size(); i24++) {
                            dialogFilter2.neverShow.remove(I.get(i24));
                        }
                        dialogFilter2.alwaysShow.addAll(I);
                        dialogFilter = dialogFilter2;
                        org.telegram.ui.h10.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, true, false, wyVar, null);
                    }
                    wyVar = wyVar;
                    long longValue2 = I.size() == 1 ? ((Long) I.get(0)).longValue() : 0L;
                    MessagesController.DialogFilter dialogFilter4 = dialogFilter;
                    UndoView Y32 = wyVar.Y3();
                    if (Y32 != null) {
                        Y32.k(longValue2, 20, Integer.valueOf(I.size()), dialogFilter4, null, null);
                    }
                }
                wyVar.b4(true);
                u00Var.dismiss();
                break;
            case 8:
                k10 k10Var = (k10) obj;
                org.telegram.ui.ActionBar.p2 p2Var2 = k10Var.n;
                ArrayList arrayList5 = k10Var.g0;
                ArrayList arrayList6 = k10Var.i0;
                if ((view instanceof org.telegram.ui.Cells.g4) && (i12 = (i10 - 1) - k10Var.r0) >= 0 && i12 < arrayList5.size()) {
                    long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList5.get(i12));
                    if (!arrayList6.contains(Long.valueOf(peerDialogId))) {
                        z11 = true;
                        arrayList6.add(Long.valueOf(peerDialogId));
                        ((org.telegram.ui.Cells.g4) view).c(true, true);
                    } else if (k10Var.h0.contains(Long.valueOf(peerDialogId))) {
                        int i25 = -k10Var.C0;
                        k10Var.C0 = i25;
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
                        if (k10Var.D0 != peerDialogId || System.currentTimeMillis() - k10Var.E0 > 1500) {
                            k10Var.D0 = peerDialogId;
                            k10Var.E0 = System.currentTimeMillis();
                            pc g10 = new wc(k10Var.k0, null).g(str, arrayList7);
                            g10.j = 1500;
                            g10.j();
                            break;
                        }
                    } else {
                        arrayList6.remove(Long.valueOf(peerDialogId));
                        z11 = true;
                        ((org.telegram.ui.Cells.g4) view).c(false, true);
                    }
                    k10Var.U(z11);
                    k10Var.V();
                    k10Var.Q(false);
                    break;
                }
                break;
            case 9:
                b40 b40Var = (b40) obj;
                if (i10 == b40Var.i0) {
                    b40Var.g0.a.j1(true);
                    b40Var.dismiss();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.b5) {
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
                    if (!b40Var.f0.contains(Long.valueOf(b5Var.getUserId()))) {
                        b40Var.g0.a.m1(b5Var.getUserId(), true);
                        break;
                    }
                }
                break;
            case 10:
                zj0 zj0Var = (zj0) obj;
                ArrayList arrayList8 = zj0Var.n;
                int j3 = zj0Var.f.j(i10);
                if (j3 == 0) {
                    yj0 yj0Var = zj0Var.E;
                    if (yj0Var != null) {
                        yj0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList8.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList8.get(i10));
                        break;
                    }
                } else if (j3 == 1 && (wj0Var = zj0Var.G) != null) {
                    wj0Var.e(zj0Var.I);
                    break;
                }
                break;
            case 11:
                pk0 pk0Var = (pk0) obj;
                ok0 ok0Var = pk0Var.g0;
                if (ok0Var != null && (view instanceof nk0)) {
                    ok0Var.l(pk0Var, ((nk0) view).e, false, false);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                sq0 sq0Var = ((oq0) obj).K;
                i13 = ((org.telegram.ui.ActionBar.h3) sq0Var).currentAccount;
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
                    sq0Var.X0(r4, n4Var);
                    break;
                } else {
                    tL_dialog.id = r4;
                    sq0Var.U0(null, tL_dialog);
                    boolean z13 = sq0Var.U.h(r4) >= 0;
                    if (n4Var.w) {
                        n4Var.v.a(z13, true);
                        break;
                    }
                }
                break;
            case 13:
                mv0 mv0Var = (mv0) obj;
                int i26 = i10 - 1;
                if (i26 >= 0 && i26 < LocationController.getLocationsCount()) {
                    mv0Var.n.b(mv0.p(i26));
                    mv0Var.dismiss();
                    break;
                }
                break;
            case 14:
                pw0.P((pw0) obj, i10);
                break;
            case 15:
                hx0 hx0Var = (hx0) obj;
                if (i10 < 1) {
                    hx0Var.getClass();
                    break;
                } else {
                    dx0[] dx0VarArr = hx0Var.Y2;
                    if (dx0VarArr != null) {
                        dx0 dx0Var = dx0VarArr[i10 - 1];
                        int dp = AndroidUtilities.dp(64.0f);
                        if (hx0Var.getMeasuredWidth() - view.getRight() < dp) {
                            hx0Var.v0(dp - (hx0Var.getMeasuredWidth() - view.getRight()), 0, wr.h);
                        } else if (view.getLeft() < dp) {
                            hx0Var.v0(-(dp - view.getLeft()), 0, wr.h);
                        }
                        Utilities.Callback callback = hx0Var.n3;
                        if (callback != null) {
                            callback.run(dx0Var);
                            break;
                        }
                    }
                }
                break;
            case 16:
                hy0.m((hy0) obj, view, i10);
                break;
            case 17:
                zy0 zy0Var = (zy0) obj;
                String str2 = ((yy0) view).a;
                if (zy0Var.s && (xy0Var = zy0Var.c) != null && (xy0Var.getFieldText() instanceof Spanned)) {
                    if (zy0Var.T != null) {
                        intValue = ((Spanned) zy0Var.c.getFieldText()).getSpanStart(zy0Var.T);
                        intValue2 = ((Spanned) zy0Var.c.getFieldText()).getSpanEnd(zy0Var.T);
                    } else {
                        Integer num = zy0Var.V;
                        if (num != null && zy0Var.W != null) {
                            intValue = num.intValue();
                            intValue2 = zy0Var.W.intValue();
                            zy0Var.W = null;
                            zy0Var.V = null;
                        }
                    }
                    Editable editText = zy0Var.c.getEditText();
                    if (editText != null && intValue >= 0 && intValue2 >= 0 && intValue <= editText.length() && intValue2 <= editText.length()) {
                        if (zy0Var.T != null) {
                            if (zy0Var.c.getFieldText() instanceof Spannable) {
                                ((Spannable) zy0Var.c.getFieldText()).removeSpan(zy0Var.T);
                            }
                            zy0Var.T = null;
                        }
                        String obj2 = editText.toString();
                        String substring = obj2.substring(intValue, intValue2);
                        int length = substring.length();
                        int i27 = intValue2 - length;
                        while (i27 >= 0) {
                            int i28 = i27 + length;
                            if (obj2.substring(i27, i28).equals(substring)) {
                                Paint.FontMetricsInt fontMetricsInt2 = zy0Var.c.getEditField() != null ? zy0Var.c.getEditField().getPaint().getFontMetricsInt() : fontMetricsInt;
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
                                        TLRPC.Document f7 = p5.f(zy0Var.a, parseLong);
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
                            zy0Var.performHapticFeedback(3, 1);
                            Emoji.addRecentEmoji(str2);
                            zy0Var.s = false;
                            zy0Var.v = true;
                            zy0Var.G = 0;
                            ldVar = zy0Var.d;
                            if (ldVar == null) {
                                ldVar.invalidate();
                                break;
                            }
                        }
                        zy0Var.performHapticFeedback(3, 1);
                        Emoji.addRecentEmoji(str2);
                        zy0Var.s = false;
                        zy0Var.v = true;
                        zy0Var.G = 0;
                        ldVar = zy0Var.d;
                        if (ldVar == null) {
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
                        org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) themeEditorView.c.get(i31);
                        int i32 = l6Var.f;
                        if (i32 == org.telegram.ui.ActionBar.j6.Nd) {
                            final c91 c91Var = themeEditorView.k;
                            org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) c91Var.b, (org.telegram.ui.ActionBar.f6) null, false);
                            h3Var.fixNavigationBar();
                            h3Var.title = LocaleController.getString(R.string.ChoosePhoto);
                            h3Var.bigTitle = true;
                            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.ChooseTakePhoto), LocaleController.getString(R.string.SelectFromGallery), LocaleController.getString(R.string.SelectColor), LocaleController.getString(R.string.Default)};
                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.z81
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i33) {
                                    c91 c91Var2 = c91.this;
                                    b91 b91Var = c91Var2.d;
                                    Activity activity = c91Var2.b;
                                    try {
                                        if (i33 != 0) {
                                            if (i33 == 1) {
                                                c91Var2.b();
                                                return;
                                            } else if (i33 == 2) {
                                                b91Var.a();
                                                return;
                                            } else {
                                                if (i33 == 3) {
                                                    b91Var.b(null, null, false);
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
                                                c91Var2.a = generatePicturePath.getAbsolutePath();
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
                            h3Var.items = charSequenceArr;
                            h3Var.itemIcons = null;
                            h3Var.onClickListener = onClickListener;
                            h3Var.show();
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
                r51 r51Var = (r51) obj;
                s4.h0 adapter2 = r51Var.n.getAdapter();
                fg.h2 h2Var = r51Var.v;
                if (adapter2 == h2Var) {
                    stickerSetCovered = (TLRPC.StickerSetCovered) h2Var.K.get(i10);
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
