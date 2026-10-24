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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
    /* JADX WARN: Type inference failed for: r1v10, types: [org.telegram.ui.ActionBar.h3, org.telegram.ui.Components.s8] */
    /* JADX WARN: Type inference failed for: r4v15, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r9v51 */
    /* JADX WARN: Type inference failed for: r9v52, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v54 */
    @Override // org.telegram.ui.Components.am0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i10, View view) {
        int i11;
        a9 a9Var;
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
                ((q) obj).g0.G(i10 - 1);
                break;
            case 2:
                b9 b9Var = (b9) obj;
                org.telegram.ui.z7 z7Var = b9Var.b3;
                e9 e9Var = b9Var.d3;
                if (view instanceof c9) {
                    c9 c9Var = (c9) view;
                    if (!c9Var.d) {
                        a9 a9Var2 = c9Var.a;
                        b9Var.a3 = a9Var2.a;
                        e9Var.a.b(a9Var2, false);
                        if (z7Var != null) {
                            z7Var.l();
                        }
                        e9Var.n0();
                        break;
                    }
                }
                if (b9Var.a3 != 1 && (a9Var = b9Var.c3) != null) {
                    b9Var.a3 = 1;
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
                    frameLayout.setBackground(org.telegram.ui.ActionBar.a6.f(new float[]{8.0f}, org.telegram.ui.ActionBar.k6.Oh));
                    TextView textView = new TextView(e9Var.getParentActivity());
                    textView.setTextSize(1, 14.0f);
                    textView.setText(LocaleController.getString(R.string.SetColor));
                    textView.setGravity(17);
                    textView.setTypeface(AndroidUtilities.bold());
                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.Sh, null);
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
                mm0 mm0Var = rrVar.d;
                if (i10 > 3) {
                    rrVar.d0 = (TLRPC.Peer) rrVar.Y.get(i10 - 4);
                    if (view instanceof org.telegram.ui.Cells.f4) {
                        z10 = true;
                        ((org.telegram.ui.Cells.f4) view).c(true, true);
                    } else {
                        z10 = true;
                    }
                    int i24 = 0;
                    while (i24 < mm0Var.getChildCount()) {
                        View childAt = mm0Var.getChildAt(i24);
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
                    org.telegram.ui.ActionBar.o2 o2Var = tzVar.Y1;
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
                    aw awVar = new aw(o2Var, tzVar.getContext(), o2Var == null ? tzVar.Z1 : o2Var.getResourceProvider(), arrayList2);
                    if (i17 >= 0) {
                        awVar.O = i17;
                    }
                    if (o2Var != null) {
                        o2Var.showDialog(awVar);
                        break;
                    } else {
                        awVar.show();
                        break;
                    }
                }
                break;
            case 6:
                tz tzVar2 = ((kz) obj).v;
                tzVar2.t1.o(new i61(tzVar2.getContext(), new mx(tzVar2), tzVar2.x1, tzVar2.y1, tzVar2.z1, (TLRPC.StickerSetCovered) view.getTag(), tzVar2.Z1));
                break;
            case 7:
                v00 v00Var = (v00) obj;
                org.telegram.ui.xt xtVar = v00Var.s;
                ArrayList arrayList3 = v00Var.d.d.v;
                MessagesController.DialogFilter dialogFilter2 = i10 < arrayList3.size() ? (MessagesController.DialogFilter) arrayList3.get(i10) : null;
                boolean z13 = view instanceof org.telegram.ui.ActionBar.z2 ? ((org.telegram.ui.ActionBar.z2) view).e : false;
                org.telegram.ui.ey eyVar = ((org.telegram.ui.ew) xtVar.b).a;
                ArrayList arrayList4 = eyVar.I2;
                ArrayList I = v00.I(eyVar, dialogFilter2, arrayList4, true, false);
                if (!z13) {
                    int size = I.size() + (dialogFilter2 != null ? dialogFilter2.alwaysShow.size() : 0);
                    if ((size > eyVar.getMessagesController().dialogFiltersChatsLimitDefault && !eyVar.getUserConfig().isPremium()) || size > eyVar.getMessagesController().dialogFiltersChatsLimitPremium) {
                        Context context = eyVar.fragmentView.getContext();
                        i12 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
                        eyVar.showDialog(new sg.j0(4, i12, context, eyVar, null));
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
                    org.telegram.ui.q00.t0(dialogFilter3, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, true, false, eyVar, null);
                    long longValue = arrayList4.size() == 1 ? ((Long) arrayList4.get(0)).longValue() : 0L;
                    UndoView W3 = eyVar.W3();
                    if (W3 != null) {
                        W3.k(longValue, 21, Integer.valueOf(arrayList4.size()), dialogFilter3, null, null);
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
                        org.telegram.ui.q00.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, true, false, eyVar, null);
                    }
                    eyVar = eyVar;
                    long longValue2 = I.size() == 1 ? ((Long) I.get(0)).longValue() : 0L;
                    MessagesController.DialogFilter dialogFilter4 = dialogFilter;
                    UndoView W32 = eyVar.W3();
                    if (W32 != null) {
                        W32.k(longValue2, 20, Integer.valueOf(I.size()), dialogFilter4, null, null);
                    }
                }
                eyVar.Z3(true);
                v00Var.dismiss();
                break;
            case 8:
                k10 k10Var = (k10) obj;
                org.telegram.ui.ActionBar.o2 o2Var2 = k10Var.n;
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
                            arrayList7.add(o2Var2.getMessagesController().getUser(Long.valueOf(peerDialogId)));
                            str = "beep boop.";
                        } else {
                            TLRPC.Chat chat = o2Var2.getMessagesController().getChat(Long.valueOf(-peerDialogId));
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
                    a40Var.g0.a.j1(true);
                    a40Var.dismiss();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.a5) {
                    org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
                    if (!a40Var.f0.contains(Long.valueOf(a5Var.getUserId()))) {
                        a40Var.g0.a.m1(a5Var.getUserId(), true);
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
                        pk0Var.e(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList8.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList8.get(i10));
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
                    fl0Var.m(gl0Var, ((el0) view).e, false, false);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                ir0 ir0Var = ((er0) obj).K;
                i14 = ((org.telegram.ui.ActionBar.h3) ir0Var).currentAccount;
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
                    ir0Var.d1(r4, m4Var);
                    break;
                } else {
                    tL_dialog.id = r4;
                    ir0Var.Z0(null, tL_dialog);
                    boolean z14 = ir0Var.V.h(r4) >= 0;
                    if (m4Var.w) {
                        m4Var.v.a(z14, true);
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
                dx0.P((dx0) obj, i10);
                break;
            case 15:
                ux0 ux0Var = (ux0) obj;
                if (i10 < 1) {
                    ux0Var.getClass();
                    break;
                } else {
                    qx0[] qx0VarArr = ux0Var.Z2;
                    if (qx0VarArr != null) {
                        qx0 qx0Var = qx0VarArr[i10 - 1];
                        int dp = AndroidUtilities.dp(64.0f);
                        if (ux0Var.getMeasuredWidth() - view.getRight() < dp) {
                            ux0Var.v0(dp - (ux0Var.getMeasuredWidth() - view.getRight()), 0, bs.h);
                        } else if (view.getLeft() < dp) {
                            ux0Var.v0(-(dp - view.getLeft()), 0, bs.h);
                        }
                        Utilities.Callback callback = ux0Var.o3;
                        if (callback != null) {
                            callback.run(qx0Var);
                            break;
                        }
                    }
                }
                break;
            case 16:
                ty0.m((ty0) obj, view, i10);
                break;
            case 17:
                ?? r13 = (lz0) obj;
                String str2 = ((kz0) view).a;
                if (r13.s && (jz0Var = r13.c) != null && (jz0Var.getFieldText() instanceof Spanned)) {
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
                                    r13.I = 0;
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
                                r13.I = 0;
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
                        r13.I = 0;
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
                    l21 l21Var = editorAlert.n;
                    if (adapter == l21Var) {
                        int i32 = i10 - 1;
                        ArrayList arrayList9 = l21Var.d;
                        themeEditorView.e = (i32 < 0 || i32 >= arrayList9.size()) ? null : (ArrayList) arrayList9.get(i32);
                    } else {
                        m21 m21Var = editorAlert.r;
                        int i33 = i10 - 1;
                        if (i33 < 0) {
                            m21Var.getClass();
                        } else if (i33 < m21Var.e.size()) {
                            arrayList = (ArrayList) m21Var.e.get(i33);
                            themeEditorView.e = arrayList;
                        }
                        arrayList = null;
                        themeEditorView.e = arrayList;
                    }
                    themeEditorView.f = i10;
                    for (int i34 = 0; i34 < themeEditorView.e.size(); i34++) {
                        org.telegram.ui.ActionBar.t6 t6Var = (org.telegram.ui.ActionBar.t6) themeEditorView.e.get(i34);
                        int i35 = t6Var.e;
                        if (i35 == org.telegram.ui.ActionBar.k6.Nd) {
                            final s91 s91Var = themeEditorView.m;
                            org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) s91Var.b, (org.telegram.ui.ActionBar.g6) null, false);
                            h3Var.fixNavigationBar();
                            h3Var.title = LocaleController.getString(R.string.ChoosePhoto);
                            h3Var.bigTitle = true;
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
                            h3Var.items = charSequenceArr;
                            h3Var.itemIcons = null;
                            h3Var.onClickListener = onClickListener;
                            h3Var.show();
                            break;
                        } else {
                            int x02 = org.telegram.ui.ActionBar.k6.x0(t6Var.i, i35, false);
                            t6Var.h = x02;
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
