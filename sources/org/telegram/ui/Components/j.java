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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements zk0 {
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
    /* JADX WARN: Type inference failed for: r1v10, types: [org.telegram.ui.ActionBar.f3, org.telegram.ui.Components.q8] */
    /* JADX WARN: Type inference failed for: r4v15, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // org.telegram.ui.Components.zk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i10, View view) {
        y8 y8Var;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        MessagesController.DialogFilter dialogFilter;
        int i11;
        int i12;
        boolean z11;
        String str;
        mj0 mj0Var;
        int i13;
        ly0 ly0Var;
        int intValue;
        int intValue2;
        ai.f0 f0Var;
        CharSequence replaceEmoji;
        x5[] x5VarArr;
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
                z8 z8Var = (z8) obj;
                org.telegram.ui.w7 w7Var = z8Var.a3;
                c9 c9Var = z8Var.c3;
                if (view instanceof a9) {
                    a9 a9Var = (a9) view;
                    if (!a9Var.d) {
                        y8 y8Var2 = a9Var.a;
                        z8Var.Z2 = y8Var2.a;
                        c9Var.a.b(y8Var2, false);
                        if (w7Var != null) {
                            w7Var.l();
                        }
                        c9Var.n0();
                        break;
                    }
                }
                if (z8Var.Z2 != 1 && (y8Var = z8Var.b3) != null) {
                    z8Var.Z2 = 1;
                    c9Var.a.b(y8Var, true);
                    if (w7Var != null) {
                        w7Var.l();
                    }
                    c9Var.n0();
                    break;
                } else if (c9Var.S == null) {
                    if (!c9Var.a.v) {
                        c9Var.g0(true, true, true);
                    }
                    y8 y8Var3 = c9Var.a.h;
                    boolean[] zArr = {false};
                    AndroidUtilities.requestAdjustNothing(c9Var.getParentActivity(), c9Var.getClassGuid());
                    q8 q8Var = new q8(c9Var, c9Var.getParentActivity());
                    c9Var.S = q8Var;
                    q8Var.fixNavigationBar();
                    c9Var.S.pauseAllHeavyOperations = false;
                    c9Var.h = true;
                    c9Var.e.setBackground(new BitmapDrawable(c9Var.getParentActivity().getResources(), AndroidUtilities.makeBlurBitmap(c9Var.fragmentView, 12.0f, 10)));
                    c9Var.h = false;
                    c9Var.e.setVisibility(0);
                    c9Var.e.setAlpha(0.0f);
                    c9Var.f = true;
                    c9Var.fragmentView.invalidate();
                    c9Var.e.animate().setListener(new r8(c9Var, r11)).alpha(1.0f).setDuration(200L).start();
                    c9Var.Y = new y8();
                    s8 s8Var = new s8(c9Var.getParentActivity(), r11, new o8(c9Var, i16), r11);
                    y8 y8Var4 = c9Var.a.h;
                    if (y8Var4 != null) {
                        y8 y8Var5 = c9Var.Y;
                        int i17 = y8Var4.f;
                        y8Var5.f = i17;
                        s8Var.e(i17, 3);
                        y8 y8Var6 = c9Var.Y;
                        int i18 = c9Var.a.h.e;
                        y8Var6.e = i18;
                        s8Var.e(i18, 2);
                        y8 y8Var7 = c9Var.Y;
                        int i19 = c9Var.a.h.d;
                        y8Var7.d = i19;
                        s8Var.e(i19, 1);
                        y8 y8Var8 = c9Var.Y;
                        int i20 = c9Var.a.h.c;
                        y8Var8.c = i20;
                        s8Var.e(i20, 0);
                    }
                    y8 y8Var9 = c9Var.Y;
                    if (y8Var9.f != 0) {
                        i16 = 4;
                    } else if (y8Var9.e != 0) {
                        i16 = 3;
                    } else if (y8Var9.d == 0) {
                        i16 = 1;
                    }
                    s8Var.f(-1, 4, i16, false);
                    c9Var.a.b(c9Var.Y, true);
                    c9Var.n0();
                    ?? linearLayout = new LinearLayout(c9Var.getParentActivity());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(0, AndroidUtilities.dp(8.0f), 0, 0);
                    linearLayout.addView(s8Var);
                    FrameLayout frameLayout = new FrameLayout(c9Var.getParentActivity());
                    frameLayout.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.i6.Oh));
                    TextView textView = new TextView(c9Var.getParentActivity());
                    textView.setTextSize(1, 14.0f);
                    textView.setText(LocaleController.getString(R.string.SetColor));
                    textView.setGravity(17);
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Sh, false));
                    frameLayout.addView(textView, w7.x5.e(-2, -2, 17));
                    linearLayout.addView(frameLayout, w7.x5.d(-1, 48.0f, 0, 16.0f, -8.0f, 16.0f, 16.0f));
                    frameLayout.setOnClickListener(new org.telegram.ui.rf(19, c9Var, zArr));
                    c9Var.S.setCustomView(linearLayout);
                    q8 q8Var2 = c9Var.S;
                    q8Var2.smoothKeyboardAnimationEnabled = true;
                    q8Var2.setDimBehind(false);
                    c9Var.S.show();
                    c9Var.isLightStatusBar();
                    break;
                }
                break;
            case 3:
                mp.o((mp) obj, view, i10);
                break;
            case 4:
                gr grVar = (gr) obj;
                ll0 ll0Var = grVar.d;
                if (i10 > 3) {
                    grVar.d0 = (TLRPC.Peer) grVar.Y.get(i10 - 4);
                    if (view instanceof org.telegram.ui.Cells.g4) {
                        z10 = true;
                        ((org.telegram.ui.Cells.g4) view).c(true, true);
                    } else {
                        z10 = true;
                    }
                    int i21 = 0;
                    while (i21 < ll0Var.getChildCount()) {
                        View childAt = ll0Var.getChildAt(i21);
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
                kz kzVar = ((sx) obj).F;
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
                    sv svVar = new sv(n2Var, kzVar.getContext(), n2Var == null ? kzVar.Z1 : n2Var.getResourceProvider(), arrayList2);
                    if (i15 >= 0) {
                        svVar.O = i15;
                    }
                    if (n2Var != null) {
                        n2Var.showDialog(svVar);
                        break;
                    } else {
                        svVar.show();
                        break;
                    }
                }
                break;
            case 6:
                kz kzVar2 = ((bz) obj).v;
                kzVar2.t1.o(new e51(kzVar2.getContext(), new ex(kzVar2), kzVar2.x1, kzVar2.y1, kzVar2.z1, (TLRPC.StickerSetCovered) view.getTag(), kzVar2.Z1));
                break;
            case 7:
                n00 n00Var = (n00) obj;
                org.telegram.ui.hu huVar = n00Var.r;
                ArrayList arrayList3 = n00Var.c.d.s;
                MessagesController.DialogFilter dialogFilter2 = i10 < arrayList3.size() ? (MessagesController.DialogFilter) arrayList3.get(i10) : null;
                boolean z12 = view instanceof org.telegram.ui.ActionBar.y2 ? ((org.telegram.ui.ActionBar.y2) view).e : false;
                org.telegram.ui.uy uyVar = ((org.telegram.ui.uw) huVar.b).a;
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
                if ((view instanceof org.telegram.ui.Cells.g4) && (i12 = (i10 - 1) - c10Var.r0) >= 0 && i12 < arrayList5.size()) {
                    long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList5.get(i12));
                    if (!arrayList6.contains(Long.valueOf(peerDialogId))) {
                        z11 = true;
                        arrayList6.add(Long.valueOf(peerDialogId));
                        ((org.telegram.ui.Cells.g4) view).c(true, true);
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
                            oc g10 = new vc(c10Var.k0, null).g(str, arrayList7);
                            g10.j = 1500;
                            g10.j();
                            break;
                        }
                    } else {
                        arrayList6.remove(Long.valueOf(peerDialogId));
                        z11 = true;
                        ((org.telegram.ui.Cells.g4) view).c(false, true);
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
                } else if (view instanceof org.telegram.ui.Cells.b5) {
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
                    if (!r30Var.f0.contains(Long.valueOf(b5Var.getUserId()))) {
                        r30Var.g0.a.m1(b5Var.getUserId(), true);
                        break;
                    }
                }
                break;
            case 10:
                pj0 pj0Var = (pj0) obj;
                ArrayList arrayList8 = pj0Var.n;
                int j3 = pj0Var.f.j(i10);
                if (j3 == 0) {
                    oj0 oj0Var = pj0Var.E;
                    if (oj0Var != null) {
                        oj0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList8.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList8.get(i10));
                        break;
                    }
                } else if (j3 == 1 && (mj0Var = pj0Var.G) != null) {
                    mj0Var.e(pj0Var.I);
                    break;
                }
                break;
            case 11:
                fk0 fk0Var = (fk0) obj;
                ek0 ek0Var = fk0Var.g0;
                if (ek0Var != null && (view instanceof dk0)) {
                    ek0Var.h(fk0Var, ((dk0) view).e, false, false);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                hq0 hq0Var = ((dq0) obj).K;
                i13 = ((org.telegram.ui.ActionBar.f3) hq0Var).currentAccount;
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
                    hq0Var.X0(r4, n4Var);
                    break;
                } else {
                    tL_dialog.id = r4;
                    hq0Var.U0(null, tL_dialog);
                    boolean z13 = hq0Var.U.h(r4) >= 0;
                    if (n4Var.w) {
                        n4Var.v.a(z13, true);
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
                ew0.P((ew0) obj, i10);
                break;
            case 15:
                ww0 ww0Var = (ww0) obj;
                if (i10 < 1) {
                    ww0Var.getClass();
                    break;
                } else {
                    sw0[] sw0VarArr = ww0Var.Y2;
                    if (sw0VarArr != null) {
                        sw0 sw0Var = sw0VarArr[i10 - 1];
                        int dp = AndroidUtilities.dp(64.0f);
                        if (ww0Var.getMeasuredWidth() - view.getRight() < dp) {
                            ww0Var.v0(dp - (ww0Var.getMeasuredWidth() - view.getRight()), 0, qr.h);
                        } else if (view.getLeft() < dp) {
                            ww0Var.v0(-(dp - view.getLeft()), 0, qr.h);
                        }
                        Utilities.Callback callback = ww0Var.n3;
                        if (callback != null) {
                            callback.run(sw0Var);
                            break;
                        }
                    }
                }
                break;
            case 16:
                vx0.m((vx0) obj, view, i10);
                break;
            case 17:
                ny0 ny0Var = (ny0) obj;
                String str2 = ((my0) view).a;
                if (ny0Var.s && (ly0Var = ny0Var.c) != null && (ly0Var.getFieldText() instanceof Spanned)) {
                    if (ny0Var.T != null) {
                        intValue = ((Spanned) ny0Var.c.getFieldText()).getSpanStart(ny0Var.T);
                        intValue2 = ((Spanned) ny0Var.c.getFieldText()).getSpanEnd(ny0Var.T);
                    } else {
                        Integer num = ny0Var.V;
                        if (num != null && ny0Var.W != null) {
                            intValue = num.intValue();
                            intValue2 = ny0Var.W.intValue();
                            ny0Var.W = null;
                            ny0Var.V = null;
                        }
                    }
                    Editable editText = ny0Var.c.getEditText();
                    if (editText != null && intValue >= 0 && intValue2 >= 0 && intValue <= editText.length() && intValue2 <= editText.length()) {
                        if (ny0Var.T != null) {
                            if (ny0Var.c.getFieldText() instanceof Spannable) {
                                ((Spannable) ny0Var.c.getFieldText()).removeSpan(ny0Var.T);
                            }
                            ny0Var.T = null;
                        }
                        String obj2 = editText.toString();
                        String substring = obj2.substring(intValue, intValue2);
                        int length = substring.length();
                        int i27 = intValue2 - length;
                        while (i27 >= 0) {
                            int i28 = i27 + length;
                            if (obj2.substring(i27, i28).equals(substring)) {
                                Paint.FontMetricsInt fontMetricsInt2 = ny0Var.c.getEditField() != null ? ny0Var.c.getEditField().getPaint().getFontMetricsInt() : fontMetricsInt;
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
                                        TLRPC.Document f7 = o5.f(ny0Var.a, parseLong);
                                        SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f7));
                                        spannableString.setSpan(f7 == null ? new x5(parseLong, fontMetricsInt2) : new x5(f7, fontMetricsInt2), 0, spannableString.length(), 33);
                                        replaceEmoji = spannableString;
                                    } catch (Exception unused) {
                                        replaceEmoji = null;
                                    }
                                }
                                if (replaceEmoji != null && ((x5VarArr = (x5[]) editText.getSpans(i27, i28, x5.class)) == null || x5VarArr.length <= 0)) {
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
                            ny0Var.performHapticFeedback(3, 1);
                            Emoji.addRecentEmoji(str2);
                            ny0Var.s = false;
                            ny0Var.v = true;
                            ny0Var.G = 0;
                            f0Var = ny0Var.d;
                            if (f0Var == null) {
                                f0Var.invalidate();
                                break;
                            }
                        }
                        ny0Var.performHapticFeedback(3, 1);
                        Emoji.addRecentEmoji(str2);
                        ny0Var.s = false;
                        ny0Var.v = true;
                        ny0Var.G = 0;
                        f0Var = ny0Var.d;
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
                    k11 k11Var = editorAlert.n;
                    if (adapter == k11Var) {
                        int i29 = i10 - 1;
                        ArrayList arrayList9 = k11Var.d;
                        themeEditorView.c = (i29 < 0 || i29 >= arrayList9.size()) ? null : (ArrayList) arrayList9.get(i29);
                    } else {
                        l11 l11Var = editorAlert.r;
                        int i30 = i10 - 1;
                        if (i30 < 0) {
                            l11Var.getClass();
                        } else if (i30 < l11Var.e.size()) {
                            arrayList = (ArrayList) l11Var.e.get(i30);
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
                            final p81 p81Var = themeEditorView.k;
                            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) p81Var.b, (org.telegram.ui.ActionBar.e6) null, false);
                            f3Var.fixNavigationBar();
                            f3Var.title = LocaleController.getString(R.string.ChoosePhoto);
                            f3Var.bigTitle = true;
                            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.ChooseTakePhoto), LocaleController.getString(R.string.SelectFromGallery), LocaleController.getString(R.string.SelectColor), LocaleController.getString(R.string.Default)};
                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.m81
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i33) {
                                    p81 p81Var2 = p81.this;
                                    o81 o81Var = p81Var2.d;
                                    Activity activity = p81Var2.b;
                                    try {
                                        if (i33 != 0) {
                                            if (i33 == 1) {
                                                p81Var2.b();
                                                return;
                                            } else if (i33 == 2) {
                                                o81Var.a();
                                                return;
                                            } else {
                                                if (i33 == 3) {
                                                    o81Var.b(null, null, false);
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
                                                p81Var2.a = generatePicturePath.getAbsolutePath();
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
                            int w02 = org.telegram.ui.ActionBar.i6.w0(k6Var.j, i32, false);
                            k6Var.i = w02;
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
                e51 e51Var = (e51) obj;
                s4.h0 adapter2 = e51Var.n.getAdapter();
                gg.g2 g2Var = e51Var.v;
                if (adapter2 == g2Var) {
                    stickerSetCovered = (TLRPC.StickerSetCovered) g2Var.K.get(i10);
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
