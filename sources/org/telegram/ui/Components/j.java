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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements am0 {
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
    /* JADX WARN: Type inference failed for: r13v18, types: [android.view.View, org.telegram.ui.Components.uz0] */
    /* JADX WARN: Type inference failed for: r1v10, types: [org.telegram.ui.ActionBar.k3, org.telegram.ui.Components.u8] */
    /* JADX WARN: Type inference failed for: r4v15, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r9v51 */
    /* JADX WARN: Type inference failed for: r9v52, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v54 */
    @Override // org.telegram.ui.Components.am0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i10, View view) {
        int i11;
        c9 c9Var;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        MessagesController.DialogFilter dialogFilter;
        int i12;
        int i13;
        boolean z11;
        String str;
        nk0 nk0Var;
        int i14;
        sz0 sz0Var;
        int intValue;
        int intValue2;
        int i15;
        ?? r92;
        bh.r rVar;
        CharSequence replaceEmoji;
        c6[] c6VarArr;
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
                ((q) obj).g0.G(i10 - 1);
                break;
            case 2:
                d9 d9Var = (d9) obj;
                org.telegram.ui.c8 c8Var = d9Var.i3;
                g9 g9Var = d9Var.k3;
                if (view instanceof e9) {
                    e9 e9Var = (e9) view;
                    if (!e9Var.d) {
                        c9 c9Var2 = e9Var.a;
                        d9Var.h3 = c9Var2.a;
                        g9Var.a.b(c9Var2, false);
                        if (c8Var != null) {
                            c8Var.l();
                        }
                        g9Var.o0();
                        break;
                    }
                }
                if (d9Var.h3 != 1 && (c9Var = d9Var.j3) != null) {
                    d9Var.h3 = 1;
                    g9Var.a.b(c9Var, true);
                    if (c8Var != null) {
                        c8Var.l();
                    }
                    g9Var.o0();
                    break;
                } else if (g9Var.S == null) {
                    if (!g9Var.a.v) {
                        g9Var.h0(true, true, true);
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
                    w8 w8Var = new w8(g9Var.getParentActivity(), r11, new t8(g9Var, i18), r11);
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
                    g9Var.o0();
                    ?? linearLayout = new LinearLayout(g9Var.getParentActivity());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(0, AndroidUtilities.dp(8.0f), 0, 0);
                    linearLayout.addView(w8Var);
                    FrameLayout frameLayout = new FrameLayout(g9Var.getParentActivity());
                    frameLayout.setBackground(org.telegram.ui.ActionBar.o6.f(new float[]{8.0f}, org.telegram.ui.ActionBar.y6.Oh));
                    TextView textView = new TextView(g9Var.getParentActivity());
                    textView.setTextSize(1, 14.0f);
                    textView.setText(LocaleController.getString(R.string.SetColor));
                    textView.setGravity(17);
                    textView.setTypeface(AndroidUtilities.bold());
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.Sh, null);
                    frameLayout.addView(textView, kb1.i(-2, -2, 17));
                    linearLayout.addView(frameLayout, kb1.h(-1, 48.0f, 0, 16.0f, -8.0f, 16.0f, 16.0f));
                    frameLayout.setOnClickListener(new org.telegram.ui.ActionBar.u1(29, g9Var, zArr));
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
                zp.o((zp) obj, view, i10);
                break;
            case 4:
                tr trVar = (tr) obj;
                nm0 nm0Var = trVar.d;
                if (i10 > 3) {
                    trVar.d0 = (TLRPC.Peer) trVar.Y.get(i10 - 4);
                    if (view instanceof org.telegram.ui.Cells.k4) {
                        z10 = true;
                        ((org.telegram.ui.Cells.k4) view).c(true, true);
                    } else {
                        z10 = true;
                    }
                    int i24 = 0;
                    while (i24 < nm0Var.getChildCount()) {
                        View childAt = nm0Var.getChildAt(i24);
                        if (childAt != view && (childAt instanceof org.telegram.ui.Cells.k4)) {
                            ((org.telegram.ui.Cells.k4) childAt).c(false, z10);
                        }
                        i24++;
                        z10 = true;
                    }
                    break;
                }
                break;
            case 5:
                sz szVar = ((zx) obj).F;
                int i25 = szVar.c1;
                if (view.getTag() instanceof TLRPC.StickerSetCovered) {
                    TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) view.getTag();
                    ArrayList arrayList2 = new ArrayList();
                    org.telegram.ui.ActionBar.r2 r2Var = szVar.Y1;
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
                    aw awVar = new aw(r2Var, szVar.getContext(), r2Var == null ? szVar.Z1 : r2Var.getResourceProvider(), arrayList2);
                    if (i17 >= 0) {
                        awVar.O = i17;
                    }
                    if (r2Var != null) {
                        r2Var.showDialog(awVar);
                        break;
                    } else {
                        awVar.show();
                        break;
                    }
                }
                break;
            case 6:
                sz szVar2 = ((jz) obj).v;
                szVar2.t1.o(new q61(szVar2.getContext(), new kx(szVar2), szVar2.x1, szVar2.y1, szVar2.z1, (TLRPC.StickerSetCovered) view.getTag(), szVar2.Z1));
                break;
            case 7:
                v00 v00Var = (v00) obj;
                org.telegram.ui.st stVar = v00Var.s;
                ArrayList arrayList3 = v00Var.d.d.v;
                MessagesController.DialogFilter dialogFilter2 = i10 < arrayList3.size() ? (MessagesController.DialogFilter) arrayList3.get(i10) : null;
                boolean z13 = view instanceof org.telegram.ui.ActionBar.c3 ? ((org.telegram.ui.ActionBar.c3) view).e : false;
                org.telegram.ui.ey eyVar = ((org.telegram.ui.bw) stVar.b).a;
                ArrayList arrayList4 = eyVar.I2;
                ArrayList I = v00.I(eyVar, dialogFilter2, arrayList4, true, false);
                if (!z13) {
                    int size = I.size() + (dialogFilter2 != null ? dialogFilter2.alwaysShow.size() : 0);
                    if ((size > eyVar.getMessagesController().dialogFiltersChatsLimitDefault && !eyVar.getUserConfig().isPremium()) || size > eyVar.getMessagesController().dialogFiltersChatsLimitPremium) {
                        Context context = eyVar.fragmentView.getContext();
                        i12 = ((org.telegram.ui.ActionBar.r2) eyVar).currentAccount;
                        eyVar.showDialog(new tg.j0(4, i12, context, eyVar, null));
                        v00Var.dismiss();
                        break;
                    }
                }
                if (dialogFilter2 == null) {
                    eyVar.presentFragment(new org.telegram.ui.q00(null, I));
                } else if (z13) {
                    for (int i26 = 0; i26 < arrayList4.size(); i26++) {
                        dialogFilter2.neverShow.add((Long) arrayList4.get(i26));
                        dialogFilter2.alwaysShow.remove(arrayList4.get(i26));
                    }
                    MessagesController.DialogFilter dialogFilter3 = dialogFilter2;
                    org.telegram.ui.q00.v0(dialogFilter3, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, true, false, eyVar, null);
                    long longValue = arrayList4.size() == 1 ? ((Long) arrayList4.get(0)).longValue() : 0L;
                    UndoView g42 = eyVar.g4();
                    if (g42 != null) {
                        g42.k(longValue, 21, Integer.valueOf(arrayList4.size()), dialogFilter3, null, null);
                    }
                    eyVar = eyVar;
                } else {
                    if (I.isEmpty()) {
                        dialogFilter = dialogFilter2;
                    } else {
                        for (int i27 = 0; i27 < I.size(); i27++) {
                            dialogFilter2.neverShow.remove(I.get(i27));
                        }
                        dialogFilter2.alwaysShow.addAll(I);
                        dialogFilter = dialogFilter2;
                        org.telegram.ui.q00.v0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, true, false, eyVar, null);
                    }
                    eyVar = eyVar;
                    long longValue2 = I.size() == 1 ? ((Long) I.get(0)).longValue() : 0L;
                    MessagesController.DialogFilter dialogFilter4 = dialogFilter;
                    UndoView g43 = eyVar.g4();
                    if (g43 != null) {
                        g43.k(longValue2, 20, Integer.valueOf(I.size()), dialogFilter4, null, null);
                    }
                }
                eyVar.j4(true);
                v00Var.dismiss();
                break;
            case 8:
                n10 n10Var = (n10) obj;
                org.telegram.ui.ActionBar.r2 r2Var2 = n10Var.n;
                ArrayList arrayList5 = n10Var.g0;
                ArrayList arrayList6 = n10Var.i0;
                if ((view instanceof org.telegram.ui.Cells.k4) && (i13 = (i10 - 1) - n10Var.r0) >= 0 && i13 < arrayList5.size()) {
                    long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList5.get(i13));
                    if (!arrayList6.contains(Long.valueOf(peerDialogId))) {
                        z11 = true;
                        arrayList6.add(Long.valueOf(peerDialogId));
                        ((org.telegram.ui.Cells.k4) view).c(true, true);
                    } else if (n10Var.h0.contains(Long.valueOf(peerDialogId))) {
                        int i28 = -n10Var.C0;
                        n10Var.C0 = i28;
                        AndroidUtilities.shakeViewSpring(view, i28);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        ArrayList arrayList7 = new ArrayList();
                        if (peerDialogId >= 0) {
                            arrayList7.add(r2Var2.getMessagesController().getUser(Long.valueOf(peerDialogId)));
                            str = "beep boop.";
                        } else {
                            TLRPC.Chat chat = r2Var2.getMessagesController().getChat(Long.valueOf(-peerDialogId));
                            String string = ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.getString(R.string.FolderLinkAlreadySubscribed) : LocaleController.getString(R.string.FolderLinkAlreadyJoined);
                            arrayList7.add(chat);
                            str = string;
                        }
                        if (n10Var.D0 != peerDialogId || System.currentTimeMillis() - n10Var.E0 > 1500) {
                            n10Var.D0 = peerDialogId;
                            n10Var.E0 = System.currentTimeMillis();
                            qc g7 = new wc(n10Var.k0, null).g(str, arrayList7);
                            g7.j = 1500;
                            g7.j();
                            break;
                        }
                    } else {
                        arrayList6.remove(Long.valueOf(peerDialogId));
                        z11 = true;
                        ((org.telegram.ui.Cells.k4) view).c(false, true);
                    }
                    n10Var.V(z11);
                    n10Var.W();
                    n10Var.R(false);
                    break;
                }
                break;
            case 9:
                c40 c40Var = (c40) obj;
                if (i10 == c40Var.i0) {
                    c40Var.g0.a.j1(true);
                    c40Var.dismiss();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.f5) {
                    org.telegram.ui.Cells.f5 f5Var = (org.telegram.ui.Cells.f5) view;
                    if (!c40Var.f0.contains(Long.valueOf(f5Var.getUserId()))) {
                        c40Var.g0.a.m1(f5Var.getUserId(), true);
                        break;
                    }
                }
                break;
            case 10:
                qk0 qk0Var = (qk0) obj;
                ArrayList arrayList8 = qk0Var.n;
                int j10 = qk0Var.f.j(i10);
                if (j10 == 0) {
                    pk0 pk0Var = qk0Var.E;
                    if (pk0Var != null) {
                        pk0Var.f(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList8.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList8.get(i10));
                        break;
                    }
                } else if (j10 == 1 && (nk0Var = qk0Var.G) != null) {
                    nk0Var.g(qk0Var.I);
                    break;
                }
                break;
            case 11:
                gl0 gl0Var = (gl0) obj;
                fl0 fl0Var = gl0Var.g0;
                if (fl0Var != null && (view instanceof el0)) {
                    fl0Var.p(gl0Var, ((el0) view).e, false, false);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Cells.r4 r4Var = (org.telegram.ui.Cells.r4) view;
                nr0 nr0Var = ((jr0) obj).K;
                i14 = ((org.telegram.ui.ActionBar.k3) nr0Var).currentAccount;
                TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i14).hints.get(i10);
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
                if (r4Var.E) {
                    nr0Var.a1(r4, r4Var);
                    break;
                } else {
                    tL_dialog.id = r4;
                    nr0Var.W0(null, tL_dialog);
                    boolean z14 = nr0Var.V.h(r4) >= 0;
                    if (r4Var.w) {
                        r4Var.v.a(z14, true);
                        break;
                    }
                }
                break;
            case 13:
                fw0 fw0Var = (fw0) obj;
                int i29 = i10 - 1;
                if (i29 >= 0 && i29 < LocationController.getLocationsCount()) {
                    fw0Var.n.d(fw0.q(i29));
                    fw0Var.dismiss();
                    break;
                }
                break;
            case 14:
                lx0.P((lx0) obj, i10);
                break;
            case 15:
                cy0 cy0Var = (cy0) obj;
                if (i10 < 1) {
                    cy0Var.getClass();
                    break;
                } else {
                    yx0[] yx0VarArr = cy0Var.g3;
                    if (yx0VarArr != null) {
                        yx0 yx0Var = yx0VarArr[i10 - 1];
                        int dp = AndroidUtilities.dp(64.0f);
                        if (cy0Var.getMeasuredWidth() - view.getRight() < dp) {
                            cy0Var.w0(dp - (cy0Var.getMeasuredWidth() - view.getRight()), 0, ds.h);
                        } else if (view.getLeft() < dp) {
                            cy0Var.w0(-(dp - view.getLeft()), 0, ds.h);
                        }
                        Utilities.Callback callback = cy0Var.v3;
                        if (callback != null) {
                            callback.run(yx0Var);
                            break;
                        }
                    }
                }
                break;
            case 16:
                dz0.m((dz0) obj, view, i10);
                break;
            case 17:
                ?? r13 = (uz0) obj;
                String str2 = ((tz0) view).a;
                if (r13.s && (sz0Var = r13.c) != null && (sz0Var.getFieldText() instanceof Spanned)) {
                    if (r13.V != null) {
                        intValue = ((Spanned) r13.c.getFieldText()).getSpanStart(r13.V);
                        intValue2 = ((Spanned) r13.c.getFieldText()).getSpanEnd(r13.V);
                    } else {
                        Integer num = r13.a0;
                        if (num != null && r13.b0 != null) {
                            intValue = num.intValue();
                            intValue2 = r13.b0.intValue();
                            r13.b0 = null;
                            r13.a0 = null;
                        }
                    }
                    Editable editText = r13.c.getEditText();
                    if (editText != null && intValue >= 0 && intValue2 >= 0 && intValue <= editText.length() && intValue2 <= editText.length()) {
                        if (r13.V != null) {
                            if (r13.c.getFieldText() instanceof Spannable) {
                                ((Spannable) r13.c.getFieldText()).removeSpan(r13.V);
                            }
                            r13.V = null;
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
                                        TLRPC.Document f7 = t5.f(r13.a, parseLong);
                                        SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f7));
                                        spannableString.setSpan(f7 == null ? new c6(parseLong, fontMetricsInt2) : new c6(f7, fontMetricsInt2), 0, spannableString.length(), 33);
                                        replaceEmoji = spannableString;
                                    } catch (Exception unused) {
                                        replaceEmoji = null;
                                    }
                                }
                                if (replaceEmoji == null || ((c6VarArr = (c6[]) editText.getSpans(i30, i31, c6.class)) != null && c6VarArr.length > 0)) {
                                    i15 = 3;
                                    r92 = 1;
                                    r13.performHapticFeedback(i15, r92);
                                    Emoji.addRecentEmoji(str2);
                                    r13.s = false;
                                    r13.v = r92;
                                    r13.I = 0;
                                    rVar = r13.d;
                                    if (rVar != null) {
                                        rVar.invalidate();
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
                                r13.I = 0;
                                rVar = r13.d;
                                if (rVar != null) {
                                }
                            }
                        }
                        i15 = i19;
                        r92 = z12;
                        r13.performHapticFeedback(i15, r92);
                        Emoji.addRecentEmoji(str2);
                        r13.s = false;
                        r13.v = r92;
                        r13.I = 0;
                        rVar = r13.d;
                        if (rVar != null) {
                        }
                    }
                }
                break;
            case 18:
                ThemeEditorView.EditorAlert editorAlert = (ThemeEditorView.EditorAlert) obj;
                ThemeEditorView themeEditorView = ThemeEditorView.this;
                if (i10 != 0) {
                    s4.h0 adapter = editorAlert.c.getAdapter();
                    u21 u21Var = editorAlert.n;
                    if (adapter == u21Var) {
                        int i32 = i10 - 1;
                        ArrayList arrayList9 = u21Var.d;
                        themeEditorView.e = (i32 < 0 || i32 >= arrayList9.size()) ? null : (ArrayList) arrayList9.get(i32);
                    } else {
                        v21 v21Var = editorAlert.r;
                        int i33 = i10 - 1;
                        if (i33 < 0) {
                            v21Var.getClass();
                        } else if (i33 < v21Var.e.size()) {
                            arrayList = (ArrayList) v21Var.e.get(i33);
                            themeEditorView.e = arrayList;
                        }
                        arrayList = null;
                        themeEditorView.e = arrayList;
                    }
                    themeEditorView.f = i10;
                    for (int i34 = 0; i34 < themeEditorView.e.size(); i34++) {
                        org.telegram.ui.ActionBar.h7 h7Var = (org.telegram.ui.ActionBar.h7) themeEditorView.e.get(i34);
                        int i35 = h7Var.e;
                        if (i35 == org.telegram.ui.ActionBar.y6.Nd) {
                            final ca1 ca1Var = themeEditorView.m;
                            org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, (Context) ca1Var.b, (org.telegram.ui.ActionBar.u6) null, false);
                            k3Var.fixNavigationBar();
                            k3Var.title = LocaleController.getString(R.string.ChoosePhoto);
                            k3Var.bigTitle = true;
                            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.ChooseTakePhoto), LocaleController.getString(R.string.SelectFromGallery), LocaleController.getString(R.string.SelectColor), LocaleController.getString(R.string.Default)};
                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.z91
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i36) {
                                    ca1 ca1Var2 = ca1.this;
                                    ba1 ba1Var = ca1Var2.d;
                                    Activity activity = ca1Var2.b;
                                    try {
                                        if (i36 != 0) {
                                            if (i36 == 1) {
                                                ca1Var2.b();
                                                return;
                                            } else if (i36 == 2) {
                                                ba1Var.a();
                                                return;
                                            } else {
                                                if (i36 == 3) {
                                                    ba1Var.b(null, null, false);
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
                                                ca1Var2.a = generatePicturePath.getAbsolutePath();
                                            }
                                            activity.startActivityForResult(intent, 10);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                }
                            };
                            k3Var.items = charSequenceArr;
                            k3Var.itemIcons = null;
                            k3Var.onClickListener = onClickListener;
                            k3Var.show();
                            break;
                        } else {
                            int x02 = org.telegram.ui.ActionBar.y6.x0(h7Var.i, i35, false);
                            h7Var.h = x02;
                            if (i34 == 0) {
                                editorAlert.b.c(x02);
                            }
                        }
                    }
                    editorAlert.L(true);
                    break;
                }
                break;
            default:
                q61 q61Var = (q61) obj;
                s4.h0 adapter2 = q61Var.n.getAdapter();
                ig.d2 d2Var = q61Var.v;
                if (adapter2 == d2Var) {
                    stickerSetCovered = (TLRPC.StickerSetCovered) d2Var.K.get(i10);
                } else {
                    p61 p61Var = q61Var.s;
                    stickerSetCovered = i10 < p61Var.w ? (TLRPC.StickerSetCovered) p61Var.f.get(i10) : null;
                }
                if (stickerSetCovered != null) {
                    q61Var.b(stickerSetCovered.set, null);
                    break;
                }
                break;
        }
    }
}
