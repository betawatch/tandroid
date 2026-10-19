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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements wl0 {
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
    /* JADX WARN: Type inference failed for: r13v18, types: [android.view.View, org.telegram.ui.Components.hz0] */
    /* JADX WARN: Type inference failed for: r1v10, types: [org.telegram.ui.ActionBar.f3, org.telegram.ui.Components.s8] */
    /* JADX WARN: Type inference failed for: r4v15, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r9v51 */
    /* JADX WARN: Type inference failed for: r9v52, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v54 */
    @Override // org.telegram.ui.Components.wl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i10, View view) {
        int i11;
        a9 a9Var;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        MessagesController.DialogFilter dialogFilter;
        int i12;
        int i13;
        boolean z11;
        String str;
        jk0 jk0Var;
        int i14;
        fz0 fz0Var;
        int intValue;
        int intValue2;
        int i15;
        ?? r92;
        ah.x xVar;
        CharSequence replaceEmoji;
        a6[] a6VarArr;
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
                b9 b9Var = (b9) obj;
                org.telegram.ui.z7 z7Var = b9Var.Y2;
                e9 e9Var = b9Var.a3;
                if (view instanceof c9) {
                    c9 c9Var = (c9) view;
                    if (!c9Var.d) {
                        a9 a9Var2 = c9Var.a;
                        b9Var.X2 = a9Var2.a;
                        e9Var.a.b(a9Var2, false);
                        if (z7Var != null) {
                            z7Var.l();
                        }
                        e9Var.n0();
                        break;
                    }
                }
                if (b9Var.X2 != 1 && (a9Var = b9Var.Z2) != null) {
                    b9Var.X2 = 1;
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
                    u8 u8Var = new u8(e9Var.getParentActivity(), r11, new r8(e9Var, i18), r11);
                    a9 a9Var4 = e9Var.a.h;
                    if (a9Var4 != null) {
                        a9 a9Var5 = e9Var.Y;
                        int i20 = a9Var4.f;
                        a9Var5.f = i20;
                        i11 = 3;
                        u8Var.e(i20, 3);
                        a9 a9Var6 = e9Var.Y;
                        int i21 = e9Var.a.h.e;
                        a9Var6.e = i21;
                        u8Var.e(i21, 2);
                        a9 a9Var7 = e9Var.Y;
                        int i22 = e9Var.a.h.d;
                        a9Var7.d = i22;
                        u8Var.e(i22, 1);
                        a9 a9Var8 = e9Var.Y;
                        int i23 = e9Var.a.h.c;
                        a9Var8.c = i23;
                        u8Var.e(i23, 0);
                    } else {
                        i11 = 3;
                    }
                    a9 a9Var9 = e9Var.Y;
                    if (a9Var9.f != 0) {
                        i18 = 4;
                    } else if (a9Var9.e != 0) {
                        i18 = i11;
                    } else if (a9Var9.d == 0) {
                        i18 = 1;
                    }
                    u8Var.f(-1, 4, i18, false);
                    e9Var.a.b(e9Var.Y, true);
                    e9Var.n0();
                    ?? linearLayout = new LinearLayout(e9Var.getParentActivity());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(0, AndroidUtilities.dp(8.0f), 0, 0);
                    linearLayout.addView(u8Var);
                    FrameLayout frameLayout = new FrameLayout(e9Var.getParentActivity());
                    frameLayout.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.h6.Oh));
                    TextView textView = new TextView(e9Var.getParentActivity());
                    textView.setTextSize(1, 14.0f);
                    textView.setText(LocaleController.getString(R.string.SetColor));
                    textView.setGravity(17);
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
                    frameLayout.addView(textView, w7.z5.e(-2, -2, 17));
                    linearLayout.addView(frameLayout, w7.z5.d(-1, 48.0f, 0, 16.0f, -8.0f, 16.0f, 16.0f));
                    frameLayout.setOnClickListener(new org.telegram.ui.ActionBar.s1(29, e9Var, zArr));
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
                wp.p((wp) obj, view, i10);
                break;
            case 4:
                rr rrVar = (rr) obj;
                im0 im0Var = rrVar.d;
                if (i10 > 3) {
                    rrVar.d0 = (TLRPC.Peer) rrVar.Y.get(i10 - 4);
                    if (view instanceof org.telegram.ui.Cells.f4) {
                        z10 = true;
                        ((org.telegram.ui.Cells.f4) view).c(true, true);
                    } else {
                        z10 = true;
                    }
                    int i24 = 0;
                    while (i24 < im0Var.getChildCount()) {
                        View childAt = im0Var.getChildAt(i24);
                        if (childAt != view && (childAt instanceof org.telegram.ui.Cells.f4)) {
                            ((org.telegram.ui.Cells.f4) childAt).c(false, z10);
                        }
                        i24++;
                        z10 = true;
                    }
                    break;
                }
                break;
            case 5:
                tz tzVar = ((ay) obj).F;
                int i25 = tzVar.c1;
                if (view.getTag() instanceof TLRPC.StickerSetCovered) {
                    TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) view.getTag();
                    ArrayList arrayList2 = new ArrayList();
                    org.telegram.ui.ActionBar.n2 n2Var = tzVar.Y1;
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
                    aw awVar = new aw(n2Var, tzVar.getContext(), n2Var == null ? tzVar.Z1 : n2Var.getResourceProvider(), arrayList2);
                    if (i17 >= 0) {
                        awVar.O = i17;
                    }
                    if (n2Var != null) {
                        n2Var.showDialog(awVar);
                        break;
                    } else {
                        awVar.show();
                        break;
                    }
                }
                break;
            case 6:
                tz tzVar2 = ((kz) obj).v;
                tzVar2.t1.o(new c61(tzVar2.getContext(), new mx(tzVar2), tzVar2.x1, tzVar2.y1, tzVar2.z1, (TLRPC.StickerSetCovered) view.getTag(), tzVar2.Z1));
                break;
            case 7:
                v00 v00Var = (v00) obj;
                org.telegram.ui.ut utVar = v00Var.r;
                ArrayList arrayList3 = v00Var.c.d.s;
                MessagesController.DialogFilter dialogFilter2 = i10 < arrayList3.size() ? (MessagesController.DialogFilter) arrayList3.get(i10) : null;
                boolean z13 = view instanceof org.telegram.ui.ActionBar.y2 ? ((org.telegram.ui.ActionBar.y2) view).e : false;
                org.telegram.ui.cy cyVar = ((org.telegram.ui.cw) utVar.b).a;
                ArrayList arrayList4 = cyVar.I2;
                ArrayList J = v00.J(cyVar, dialogFilter2, arrayList4, true, false);
                if (!z13) {
                    int size = J.size() + (dialogFilter2 != null ? dialogFilter2.alwaysShow.size() : 0);
                    if ((size > cyVar.getMessagesController().dialogFiltersChatsLimitDefault && !cyVar.getUserConfig().isPremium()) || size > cyVar.getMessagesController().dialogFiltersChatsLimitPremium) {
                        Context context = cyVar.fragmentView.getContext();
                        i12 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
                        cyVar.showDialog(new sg.k0(4, i12, context, cyVar, null));
                        v00Var.dismiss();
                        break;
                    }
                }
                if (dialogFilter2 == null) {
                    cyVar.presentFragment(new org.telegram.ui.n00(null, J));
                } else if (z13) {
                    for (int i26 = 0; i26 < arrayList4.size(); i26++) {
                        dialogFilter2.neverShow.add((Long) arrayList4.get(i26));
                        dialogFilter2.alwaysShow.remove(arrayList4.get(i26));
                    }
                    MessagesController.DialogFilter dialogFilter3 = dialogFilter2;
                    org.telegram.ui.n00.t0(dialogFilter3, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, true, false, cyVar, null);
                    long longValue = arrayList4.size() == 1 ? ((Long) arrayList4.get(0)).longValue() : 0L;
                    UndoView W3 = cyVar.W3();
                    if (W3 != null) {
                        W3.k(longValue, 21, Integer.valueOf(arrayList4.size()), dialogFilter3, null, null);
                    }
                    cyVar = cyVar;
                } else {
                    if (J.isEmpty()) {
                        dialogFilter = dialogFilter2;
                    } else {
                        for (int i27 = 0; i27 < J.size(); i27++) {
                            dialogFilter2.neverShow.remove(J.get(i27));
                        }
                        dialogFilter2.alwaysShow.addAll(J);
                        dialogFilter = dialogFilter2;
                        org.telegram.ui.n00.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, true, false, cyVar, null);
                    }
                    cyVar = cyVar;
                    long longValue2 = J.size() == 1 ? ((Long) J.get(0)).longValue() : 0L;
                    MessagesController.DialogFilter dialogFilter4 = dialogFilter;
                    UndoView W32 = cyVar.W3();
                    if (W32 != null) {
                        W32.k(longValue2, 20, Integer.valueOf(J.size()), dialogFilter4, null, null);
                    }
                }
                cyVar.Z3(true);
                v00Var.dismiss();
                break;
            case 8:
                k10 k10Var = (k10) obj;
                org.telegram.ui.ActionBar.n2 n2Var2 = k10Var.n;
                ArrayList arrayList5 = k10Var.g0;
                ArrayList arrayList6 = k10Var.i0;
                if ((view instanceof org.telegram.ui.Cells.f4) && (i13 = (i10 - 1) - k10Var.r0) >= 0 && i13 < arrayList5.size()) {
                    long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList5.get(i13));
                    if (!arrayList6.contains(Long.valueOf(peerDialogId))) {
                        z11 = true;
                        arrayList6.add(Long.valueOf(peerDialogId));
                        ((org.telegram.ui.Cells.f4) view).c(true, true);
                    } else if (k10Var.h0.contains(Long.valueOf(peerDialogId))) {
                        int i28 = -k10Var.C0;
                        k10Var.C0 = i28;
                        AndroidUtilities.shakeViewSpring(view, i28);
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
                        if (k10Var.D0 != peerDialogId || System.currentTimeMillis() - k10Var.E0 > 1500) {
                            k10Var.D0 = peerDialogId;
                            k10Var.E0 = System.currentTimeMillis();
                            qc g10 = new xc(k10Var.k0, null).g(str, arrayList7);
                            g10.j = 1500;
                            g10.j();
                            break;
                        }
                    } else {
                        arrayList6.remove(Long.valueOf(peerDialogId));
                        z11 = true;
                        ((org.telegram.ui.Cells.f4) view).c(false, true);
                    }
                    k10Var.V(z11);
                    k10Var.W();
                    k10Var.R(false);
                    break;
                }
                break;
            case 9:
                a40 a40Var = (a40) obj;
                if (i10 == a40Var.i0) {
                    a40Var.g0.a.k1(true);
                    a40Var.dismiss();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.a5) {
                    org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
                    if (!a40Var.f0.contains(Long.valueOf(a5Var.getUserId()))) {
                        a40Var.g0.a.n1(a5Var.getUserId(), true);
                        break;
                    }
                }
                break;
            case 10:
                mk0 mk0Var = (mk0) obj;
                ArrayList arrayList8 = mk0Var.n;
                int j10 = mk0Var.f.j(i10);
                if (j10 == 0) {
                    lk0 lk0Var = mk0Var.E;
                    if (lk0Var != null) {
                        lk0Var.c(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList8.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList8.get(i10));
                        break;
                    }
                } else if (j10 == 1 && (jk0Var = mk0Var.G) != null) {
                    jk0Var.e(mk0Var.I);
                    break;
                }
                break;
            case 11:
                cl0 cl0Var = (cl0) obj;
                bl0 bl0Var = cl0Var.g0;
                if (bl0Var != null && (view instanceof al0)) {
                    bl0Var.o(cl0Var, ((al0) view).e, false, false);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                er0 er0Var = ((ar0) obj).K;
                i14 = ((org.telegram.ui.ActionBar.f3) er0Var).currentAccount;
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
                if (m4Var.E) {
                    er0Var.Z0(r4, m4Var);
                    break;
                } else {
                    tL_dialog.id = r4;
                    er0Var.W0(null, tL_dialog);
                    boolean z14 = er0Var.V.h(r4) >= 0;
                    if (m4Var.w) {
                        m4Var.v.a(z14, true);
                        break;
                    }
                }
                break;
            case 13:
                xv0 xv0Var = (xv0) obj;
                int i29 = i10 - 1;
                if (i29 >= 0 && i29 < LocationController.getLocationsCount()) {
                    xv0Var.n.b(xv0.q(i29));
                    xv0Var.dismiss();
                    break;
                }
                break;
            case 14:
                zw0.Q((zw0) obj, i10);
                break;
            case 15:
                qx0 qx0Var = (qx0) obj;
                if (i10 < 1) {
                    qx0Var.getClass();
                    break;
                } else {
                    mx0[] mx0VarArr = qx0Var.W2;
                    if (mx0VarArr != null) {
                        mx0 mx0Var = mx0VarArr[i10 - 1];
                        int dp = AndroidUtilities.dp(64.0f);
                        if (qx0Var.getMeasuredWidth() - view.getRight() < dp) {
                            qx0Var.v0(dp - (qx0Var.getMeasuredWidth() - view.getRight()), 0, bs.h);
                        } else if (view.getLeft() < dp) {
                            qx0Var.v0(-(dp - view.getLeft()), 0, bs.h);
                        }
                        Utilities.Callback callback = qx0Var.l3;
                        if (callback != null) {
                            callback.run(mx0Var);
                            break;
                        }
                    }
                }
                break;
            case 16:
                py0.n((py0) obj, view, i10);
                break;
            case 17:
                ?? r13 = (hz0) obj;
                String str2 = ((gz0) view).a;
                if (r13.s && (fz0Var = r13.c) != null && (fz0Var.getFieldText() instanceof Spanned)) {
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
                                        TLRPC.Document f7 = r5.f(r13.a, parseLong);
                                        SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f7));
                                        spannableString.setSpan(f7 == null ? new a6(parseLong, fontMetricsInt2) : new a6(f7, fontMetricsInt2), 0, spannableString.length(), 33);
                                        replaceEmoji = spannableString;
                                    } catch (Exception unused) {
                                        replaceEmoji = null;
                                    }
                                }
                                if (replaceEmoji == null || ((a6VarArr = (a6[]) editText.getSpans(i30, i31, a6.class)) != null && a6VarArr.length > 0)) {
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
                    h21 h21Var = editorAlert.n;
                    if (adapter == h21Var) {
                        int i32 = i10 - 1;
                        ArrayList arrayList9 = h21Var.d;
                        themeEditorView.c = (i32 < 0 || i32 >= arrayList9.size()) ? null : (ArrayList) arrayList9.get(i32);
                    } else {
                        i21 i21Var = editorAlert.r;
                        int i33 = i10 - 1;
                        if (i33 < 0) {
                            i21Var.getClass();
                        } else if (i33 < i21Var.e.size()) {
                            arrayList = (ArrayList) i21Var.e.get(i33);
                            themeEditorView.c = arrayList;
                        }
                        arrayList = null;
                        themeEditorView.c = arrayList;
                    }
                    themeEditorView.d = i10;
                    for (int i34 = 0; i34 < themeEditorView.c.size(); i34++) {
                        org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) themeEditorView.c.get(i34);
                        int i35 = j6Var.f;
                        if (i35 == org.telegram.ui.ActionBar.h6.Nd) {
                            final k91 k91Var = themeEditorView.k;
                            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) k91Var.b, (org.telegram.ui.ActionBar.d6) null, false);
                            f3Var.fixNavigationBar();
                            f3Var.title = LocaleController.getString(R.string.ChoosePhoto);
                            f3Var.bigTitle = true;
                            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.ChooseTakePhoto), LocaleController.getString(R.string.SelectFromGallery), LocaleController.getString(R.string.SelectColor), LocaleController.getString(R.string.Default)};
                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.h91
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i36) {
                                    k91 k91Var2 = k91.this;
                                    j91 j91Var = k91Var2.d;
                                    Activity activity = k91Var2.b;
                                    try {
                                        if (i36 != 0) {
                                            if (i36 == 1) {
                                                k91Var2.b();
                                                return;
                                            } else if (i36 == 2) {
                                                j91Var.a();
                                                return;
                                            } else {
                                                if (i36 == 3) {
                                                    j91Var.b(null, null, false);
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
                                                k91Var2.a = generatePicturePath.getAbsolutePath();
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
                            int x02 = org.telegram.ui.ActionBar.h6.x0(j6Var.j, i35, false);
                            j6Var.i = x02;
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
                c61 c61Var = (c61) obj;
                s4.g0 adapter2 = c61Var.n.getAdapter();
                hg.e2 e2Var = c61Var.v;
                if (adapter2 == e2Var) {
                    stickerSetCovered = (TLRPC.StickerSetCovered) e2Var.K.get(i10);
                } else {
                    b61 b61Var = c61Var.s;
                    stickerSetCovered = i10 < b61Var.w ? (TLRPC.StickerSetCovered) b61Var.f.get(i10) : null;
                }
                if (stickerSetCovered != null) {
                    c61Var.b(stickerSetCovered.set, null);
                    break;
                }
                break;
        }
    }
}
