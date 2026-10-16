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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
    /* JADX WARN: Type inference failed for: r13v18, types: [android.view.View, org.telegram.ui.Components.lz0] */
    /* JADX WARN: Type inference failed for: r1v10, types: [org.telegram.ui.ActionBar.e3, org.telegram.ui.Components.v8] */
    /* JADX WARN: Type inference failed for: r4v15, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r9v51 */
    /* JADX WARN: Type inference failed for: r9v52, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v54 */
    @Override // org.telegram.ui.Components.am0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i10, View view) {
        int i11;
        d9 d9Var;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        MessagesController.DialogFilter dialogFilter;
        int i12;
        int i13;
        boolean z11;
        String str;
        nk0 nk0Var;
        int i14;
        jz0 jz0Var;
        int intValue;
        int intValue2;
        int i15;
        ?? r92;
        ah.x xVar;
        CharSequence replaceEmoji;
        b6[] b6VarArr;
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
                ((q) obj).f0.G(i10 - 1);
                break;
            case 2:
                e9 e9Var = (e9) obj;
                org.telegram.ui.a8 a8Var = e9Var.Y2;
                h9 h9Var = e9Var.a3;
                if (view instanceof f9) {
                    f9 f9Var = (f9) view;
                    if (!f9Var.d) {
                        d9 d9Var2 = f9Var.a;
                        e9Var.X2 = d9Var2.a;
                        h9Var.a.b(d9Var2, false);
                        if (a8Var != null) {
                            a8Var.l();
                        }
                        h9Var.n0();
                        break;
                    }
                }
                if (e9Var.X2 != 1 && (d9Var = e9Var.Z2) != null) {
                    e9Var.X2 = 1;
                    h9Var.a.b(d9Var, true);
                    if (a8Var != null) {
                        a8Var.l();
                    }
                    h9Var.n0();
                    break;
                } else if (h9Var.S == null) {
                    if (!h9Var.a.v) {
                        h9Var.g0(true, true, true);
                    }
                    d9 d9Var3 = h9Var.a.h;
                    boolean[] zArr = {false};
                    AndroidUtilities.requestAdjustNothing(h9Var.getParentActivity(), h9Var.getClassGuid());
                    v8 v8Var = new v8(h9Var, h9Var.getParentActivity());
                    h9Var.S = v8Var;
                    v8Var.fixNavigationBar();
                    h9Var.S.pauseAllHeavyOperations = false;
                    h9Var.h = true;
                    h9Var.e.setBackground(new BitmapDrawable(h9Var.getParentActivity().getResources(), AndroidUtilities.makeBlurBitmap(h9Var.fragmentView, 12.0f, 10)));
                    h9Var.h = false;
                    h9Var.e.setVisibility(0);
                    h9Var.e.setAlpha(0.0f);
                    h9Var.f = true;
                    h9Var.fragmentView.invalidate();
                    h9Var.e.animate().setListener(new w8(h9Var, r11)).alpha(1.0f).setDuration(200L).start();
                    h9Var.Y = new d9();
                    x8 x8Var = new x8(h9Var.getParentActivity(), r11, new u8(h9Var, i18), r11);
                    d9 d9Var4 = h9Var.a.h;
                    if (d9Var4 != null) {
                        d9 d9Var5 = h9Var.Y;
                        int i20 = d9Var4.f;
                        d9Var5.f = i20;
                        i11 = 3;
                        x8Var.e(i20, 3);
                        d9 d9Var6 = h9Var.Y;
                        int i21 = h9Var.a.h.e;
                        d9Var6.e = i21;
                        x8Var.e(i21, 2);
                        d9 d9Var7 = h9Var.Y;
                        int i22 = h9Var.a.h.d;
                        d9Var7.d = i22;
                        x8Var.e(i22, 1);
                        d9 d9Var8 = h9Var.Y;
                        int i23 = h9Var.a.h.c;
                        d9Var8.c = i23;
                        x8Var.e(i23, 0);
                    } else {
                        i11 = 3;
                    }
                    d9 d9Var9 = h9Var.Y;
                    if (d9Var9.f != 0) {
                        i18 = 4;
                    } else if (d9Var9.e != 0) {
                        i18 = i11;
                    } else if (d9Var9.d == 0) {
                        i18 = 1;
                    }
                    x8Var.f(-1, 4, i18, false);
                    h9Var.a.b(h9Var.Y, true);
                    h9Var.n0();
                    ?? linearLayout = new LinearLayout(h9Var.getParentActivity());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(0, AndroidUtilities.dp(8.0f), 0, 0);
                    linearLayout.addView(x8Var);
                    FrameLayout frameLayout = new FrameLayout(h9Var.getParentActivity());
                    frameLayout.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.g6.Oh));
                    TextView textView = new TextView(h9Var.getParentActivity());
                    textView.setTextSize(1, 14.0f);
                    textView.setText(LocaleController.getString(R.string.SetColor));
                    textView.setGravity(17);
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                    frameLayout.addView(textView, w7.z5.e(-2, -2, 17));
                    linearLayout.addView(frameLayout, w7.z5.a(48.0f, 16.0f, -8.0f, 16.0f, 16.0f, -1, 0));
                    frameLayout.setOnClickListener(new org.telegram.ui.xf(19, h9Var, zArr));
                    h9Var.S.setCustomView(linearLayout);
                    v8 v8Var2 = h9Var.S;
                    v8Var2.smoothKeyboardAnimationEnabled = true;
                    v8Var2.setDimBehind(false);
                    h9Var.S.show();
                    h9Var.isLightStatusBar();
                    break;
                }
                break;
            case 3:
                zp.q((zp) obj, view, i10);
                break;
            case 4:
                ur urVar = (ur) obj;
                mm0 mm0Var = urVar.d;
                if (i10 > 3) {
                    urVar.d0 = (TLRPC.Peer) urVar.Y.get(i10 - 4);
                    if (view instanceof org.telegram.ui.Cells.g4) {
                        z10 = true;
                        ((org.telegram.ui.Cells.g4) view).c(true, true);
                    } else {
                        z10 = true;
                    }
                    int i24 = 0;
                    while (i24 < mm0Var.getChildCount()) {
                        View childAt = mm0Var.getChildAt(i24);
                        if (childAt != view && (childAt instanceof org.telegram.ui.Cells.g4)) {
                            ((org.telegram.ui.Cells.g4) childAt).c(false, z10);
                        }
                        i24++;
                        z10 = true;
                    }
                    break;
                }
                break;
            case 5:
                wz wzVar = ((fy) obj).F;
                int i25 = wzVar.c1;
                if (view.getTag() instanceof TLRPC.StickerSetCovered) {
                    TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) view.getTag();
                    ArrayList arrayList2 = new ArrayList();
                    org.telegram.ui.ActionBar.m2 m2Var = wzVar.Y1;
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
                    ew ewVar = new ew(m2Var, wzVar.getContext(), m2Var == null ? wzVar.Z1 : m2Var.getResourceProvider(), arrayList2);
                    if (i17 >= 0) {
                        ewVar.O = i17;
                    }
                    if (m2Var != null) {
                        m2Var.showDialog(ewVar);
                        break;
                    } else {
                        ewVar.show();
                        break;
                    }
                }
                break;
            case 6:
                wz wzVar2 = ((mz) obj).v;
                wzVar2.t1.o(new i61(wzVar2.getContext(), new qx(wzVar2), wzVar2.x1, wzVar2.y1, wzVar2.z1, (TLRPC.StickerSetCovered) view.getTag(), wzVar2.Z1));
                break;
            case 7:
                z00 z00Var = (z00) obj;
                org.telegram.ui.mu muVar = z00Var.r;
                ArrayList arrayList3 = z00Var.c.d.s;
                MessagesController.DialogFilter dialogFilter2 = i10 < arrayList3.size() ? (MessagesController.DialogFilter) arrayList3.get(i10) : null;
                boolean z13 = view instanceof org.telegram.ui.ActionBar.x2 ? ((org.telegram.ui.ActionBar.x2) view).e : false;
                org.telegram.ui.yy yyVar = ((org.telegram.ui.yw) muVar.b).a;
                ArrayList arrayList4 = yyVar.I2;
                ArrayList J = z00.J(yyVar, dialogFilter2, arrayList4, true, false);
                if (!z13) {
                    int size = J.size() + (dialogFilter2 != null ? dialogFilter2.alwaysShow.size() : 0);
                    if ((size > yyVar.getMessagesController().dialogFiltersChatsLimitDefault && !yyVar.getUserConfig().isPremium()) || size > yyVar.getMessagesController().dialogFiltersChatsLimitPremium) {
                        Context context = yyVar.fragmentView.getContext();
                        i12 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                        yyVar.showDialog(new sg.j0(4, i12, context, yyVar, null));
                        z00Var.dismiss();
                        break;
                    }
                }
                if (dialogFilter2 == null) {
                    yyVar.presentFragment(new org.telegram.ui.k10(null, J));
                } else if (z13) {
                    for (int i26 = 0; i26 < arrayList4.size(); i26++) {
                        dialogFilter2.neverShow.add((Long) arrayList4.get(i26));
                        dialogFilter2.alwaysShow.remove(arrayList4.get(i26));
                    }
                    MessagesController.DialogFilter dialogFilter3 = dialogFilter2;
                    org.telegram.ui.k10.t0(dialogFilter3, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, true, false, yyVar, null);
                    long longValue = arrayList4.size() == 1 ? ((Long) arrayList4.get(0)).longValue() : 0L;
                    UndoView W3 = yyVar.W3();
                    if (W3 != null) {
                        W3.k(longValue, 21, Integer.valueOf(arrayList4.size()), dialogFilter3, null, null);
                    }
                    yyVar = yyVar;
                } else {
                    if (J.isEmpty()) {
                        dialogFilter = dialogFilter2;
                    } else {
                        for (int i27 = 0; i27 < J.size(); i27++) {
                            dialogFilter2.neverShow.remove(J.get(i27));
                        }
                        dialogFilter2.alwaysShow.addAll(J);
                        dialogFilter = dialogFilter2;
                        org.telegram.ui.k10.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, true, false, yyVar, null);
                    }
                    yyVar = yyVar;
                    long longValue2 = J.size() == 1 ? ((Long) J.get(0)).longValue() : 0L;
                    MessagesController.DialogFilter dialogFilter4 = dialogFilter;
                    UndoView W32 = yyVar.W3();
                    if (W32 != null) {
                        W32.k(longValue2, 20, Integer.valueOf(J.size()), dialogFilter4, null, null);
                    }
                }
                yyVar.Z3(true);
                z00Var.dismiss();
                break;
            case 8:
                o10 o10Var = (o10) obj;
                org.telegram.ui.ActionBar.m2 m2Var2 = o10Var.n;
                ArrayList arrayList5 = o10Var.g0;
                ArrayList arrayList6 = o10Var.i0;
                if ((view instanceof org.telegram.ui.Cells.g4) && (i13 = (i10 - 1) - o10Var.r0) >= 0 && i13 < arrayList5.size()) {
                    long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList5.get(i13));
                    if (!arrayList6.contains(Long.valueOf(peerDialogId))) {
                        z11 = true;
                        arrayList6.add(Long.valueOf(peerDialogId));
                        ((org.telegram.ui.Cells.g4) view).c(true, true);
                    } else if (o10Var.h0.contains(Long.valueOf(peerDialogId))) {
                        int i28 = -o10Var.C0;
                        o10Var.C0 = i28;
                        AndroidUtilities.shakeViewSpring(view, i28);
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
                        if (o10Var.D0 != peerDialogId || System.currentTimeMillis() - o10Var.E0 > 1500) {
                            o10Var.D0 = peerDialogId;
                            o10Var.E0 = System.currentTimeMillis();
                            sc g10 = new zc(o10Var.k0, null).g(str, arrayList7);
                            g10.j = 1500;
                            g10.j();
                            break;
                        }
                    } else {
                        arrayList6.remove(Long.valueOf(peerDialogId));
                        z11 = true;
                        ((org.telegram.ui.Cells.g4) view).c(false, true);
                    }
                    o10Var.V(z11);
                    o10Var.W();
                    o10Var.R(false);
                    break;
                }
                break;
            case 9:
                e40 e40Var = (e40) obj;
                if (i10 == e40Var.i0) {
                    e40Var.g0.a.k1(true);
                    e40Var.dismiss();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.b5) {
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
                    if (!e40Var.f0.contains(Long.valueOf(b5Var.getUserId()))) {
                        e40Var.g0.a.n1(b5Var.getUserId(), true);
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
                        pk0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList8.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList8.get(i10));
                        break;
                    }
                } else if (j10 == 1 && (nk0Var = qk0Var.G) != null) {
                    nk0Var.e(qk0Var.I);
                    break;
                }
                break;
            case 11:
                gl0 gl0Var = (gl0) obj;
                fl0 fl0Var = gl0Var.g0;
                if (fl0Var != null && (view instanceof el0)) {
                    fl0Var.n(gl0Var, ((el0) view).e, false, false);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                ir0 ir0Var = ((er0) obj).K;
                i14 = ((org.telegram.ui.ActionBar.e3) ir0Var).currentAccount;
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
                if (n4Var.E) {
                    ir0Var.Y0(r4, n4Var);
                    break;
                } else {
                    tL_dialog.id = r4;
                    ir0Var.V0(null, tL_dialog);
                    boolean z14 = ir0Var.U.h(r4) >= 0;
                    if (n4Var.w) {
                        n4Var.v.a(z14, true);
                        break;
                    }
                }
                break;
            case 13:
                bw0 bw0Var = (bw0) obj;
                int i29 = i10 - 1;
                if (i29 >= 0 && i29 < LocationController.getLocationsCount()) {
                    bw0Var.n.b(bw0.r(i29));
                    bw0Var.dismiss();
                    break;
                }
                break;
            case 14:
                dx0.Q((dx0) obj, i10);
                break;
            case 15:
                ux0 ux0Var = (ux0) obj;
                if (i10 < 1) {
                    ux0Var.getClass();
                    break;
                } else {
                    qx0[] qx0VarArr = ux0Var.W2;
                    if (qx0VarArr != null) {
                        qx0 qx0Var = qx0VarArr[i10 - 1];
                        int dp = AndroidUtilities.dp(64.0f);
                        if (ux0Var.getMeasuredWidth() - view.getRight() < dp) {
                            ux0Var.v0(dp - (ux0Var.getMeasuredWidth() - view.getRight()), 0, es.h);
                        } else if (view.getLeft() < dp) {
                            ux0Var.v0(-(dp - view.getLeft()), 0, es.h);
                        }
                        Utilities.Callback callback = ux0Var.l3;
                        if (callback != null) {
                            callback.run(qx0Var);
                            break;
                        }
                    }
                }
                break;
            case 16:
                uy0.n((uy0) obj, view, i10);
                break;
            case 17:
                ?? r13 = (lz0) obj;
                String str2 = ((kz0) view).a;
                if (r13.s && (jz0Var = r13.c) != null && (jz0Var.getFieldText() instanceof Spanned)) {
                    if (r13.T != null) {
                        intValue = ((Spanned) r13.c.getFieldText()).getSpanStart(r13.T);
                        intValue2 = ((Spanned) r13.c.getFieldText()).getSpanEnd(r13.T);
                    } else {
                        Integer num = r13.V;
                        if (num != null && r13.W != null) {
                            intValue = num.intValue();
                            intValue2 = r13.W.intValue();
                            r13.W = null;
                            r13.V = null;
                        }
                    }
                    Editable editText = r13.c.getEditText();
                    if (editText != null && intValue >= 0 && intValue2 >= 0 && intValue <= editText.length() && intValue2 <= editText.length()) {
                        if (r13.T != null) {
                            if (r13.c.getFieldText() instanceof Spannable) {
                                ((Spannable) r13.c.getFieldText()).removeSpan(r13.T);
                            }
                            r13.T = null;
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
                                        TLRPC.Document f7 = s5.f(r13.a, parseLong);
                                        SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f7));
                                        spannableString.setSpan(f7 == null ? new b6(parseLong, fontMetricsInt2) : new b6(f7, fontMetricsInt2), 0, spannableString.length(), 33);
                                        replaceEmoji = spannableString;
                                    } catch (Exception unused) {
                                        replaceEmoji = null;
                                    }
                                }
                                if (replaceEmoji == null || ((b6VarArr = (b6[]) editText.getSpans(i30, i31, b6.class)) != null && b6VarArr.length > 0)) {
                                    i15 = 3;
                                    r92 = 1;
                                    r13.performHapticFeedback(i15, r92);
                                    Emoji.addRecentEmoji(str2);
                                    r13.s = false;
                                    r13.v = r92;
                                    r13.G = 0;
                                    xVar = r13.d;
                                    if (xVar != null) {
                                        xVar.invalidate();
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
                                r13.G = 0;
                                xVar = r13.d;
                                if (xVar != null) {
                                }
                            }
                        }
                        i15 = i19;
                        r92 = z12;
                        r13.performHapticFeedback(i15, r92);
                        Emoji.addRecentEmoji(str2);
                        r13.s = false;
                        r13.v = r92;
                        r13.G = 0;
                        xVar = r13.d;
                        if (xVar != null) {
                        }
                    }
                }
                break;
            case 18:
                ThemeEditorView.EditorAlert editorAlert = (ThemeEditorView.EditorAlert) obj;
                ThemeEditorView themeEditorView = ThemeEditorView.this;
                if (i10 != 0) {
                    s4.g0 adapter = editorAlert.c.getAdapter();
                    m21 m21Var = editorAlert.n;
                    if (adapter == m21Var) {
                        int i32 = i10 - 1;
                        ArrayList arrayList9 = m21Var.d;
                        themeEditorView.c = (i32 < 0 || i32 >= arrayList9.size()) ? null : (ArrayList) arrayList9.get(i32);
                    } else {
                        o21 o21Var = editorAlert.r;
                        int i33 = i10 - 1;
                        if (i33 < 0) {
                            o21Var.getClass();
                        } else if (i33 < o21Var.e.size()) {
                            arrayList = (ArrayList) o21Var.e.get(i33);
                            themeEditorView.c = arrayList;
                        }
                        arrayList = null;
                        themeEditorView.c = arrayList;
                    }
                    themeEditorView.d = i10;
                    for (int i34 = 0; i34 < themeEditorView.c.size(); i34++) {
                        org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) themeEditorView.c.get(i34);
                        int i35 = i6Var.f;
                        if (i35 == org.telegram.ui.ActionBar.g6.Nd) {
                            final s91 s91Var = themeEditorView.k;
                            org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) s91Var.b, (org.telegram.ui.ActionBar.c6) null, false);
                            e3Var.fixNavigationBar();
                            e3Var.title = LocaleController.getString(R.string.ChoosePhoto);
                            e3Var.bigTitle = true;
                            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.ChooseTakePhoto), LocaleController.getString(R.string.SelectFromGallery), LocaleController.getString(R.string.SelectColor), LocaleController.getString(R.string.Default)};
                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.p91
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i36) {
                                    s91 s91Var2 = s91.this;
                                    r91 r91Var = s91Var2.d;
                                    Activity activity = s91Var2.b;
                                    try {
                                        if (i36 != 0) {
                                            if (i36 == 1) {
                                                s91Var2.b();
                                                return;
                                            } else if (i36 == 2) {
                                                r91Var.a();
                                                return;
                                            } else {
                                                if (i36 == 3) {
                                                    r91Var.b(null, null, false);
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
                                                s91Var2.a = generatePicturePath.getAbsolutePath();
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
                            int x02 = org.telegram.ui.ActionBar.g6.x0(i6Var.j, i35, false);
                            i6Var.i = x02;
                            if (i34 == 0) {
                                editorAlert.b.c(x02);
                            }
                        }
                    }
                    editorAlert.M(true);
                    break;
                }
                break;
            default:
                i61 i61Var = (i61) obj;
                s4.g0 adapter2 = i61Var.n.getAdapter();
                hg.e2 e2Var = i61Var.v;
                if (adapter2 == e2Var) {
                    stickerSetCovered = (TLRPC.StickerSetCovered) e2Var.K.get(i10);
                } else {
                    h61 h61Var = i61Var.s;
                    stickerSetCovered = i10 < h61Var.w ? (TLRPC.StickerSetCovered) h61Var.f.get(i10) : null;
                }
                if (stickerSetCovered != null) {
                    i61Var.b(stickerSetCovered.set, null);
                    break;
                }
                break;
        }
    }
}
