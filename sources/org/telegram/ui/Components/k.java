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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements zk0 {
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
    /* JADX WARN: Type inference failed for: r1v10, types: [org.telegram.ui.ActionBar.f3, org.telegram.ui.Components.t8] */
    /* JADX WARN: Type inference failed for: r4v15, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // org.telegram.ui.Components.zk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i10, View view) {
        b9 b9Var;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        MessagesController.DialogFilter dialogFilter;
        int i11;
        int i12;
        boolean z11;
        String str;
        mj0 mj0Var;
        int i13;
        ky0 ky0Var;
        int intValue;
        int intValue2;
        ah.y yVar;
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
                ((f0) obj).O0.G(i10 - 1);
                break;
            case 1:
                ((r) obj).f0.G(i10 - 1);
                break;
            case 2:
                c9 c9Var = (c9) obj;
                org.telegram.ui.w7 w7Var = c9Var.a3;
                f9 f9Var = c9Var.c3;
                if (view instanceof d9) {
                    d9 d9Var = (d9) view;
                    if (!d9Var.d) {
                        b9 b9Var2 = d9Var.a;
                        c9Var.Z2 = b9Var2.a;
                        f9Var.a.b(b9Var2, false);
                        if (w7Var != null) {
                            w7Var.l();
                        }
                        f9Var.n0();
                        break;
                    }
                }
                if (c9Var.Z2 != 1 && (b9Var = c9Var.b3) != null) {
                    c9Var.Z2 = 1;
                    f9Var.a.b(b9Var, true);
                    if (w7Var != null) {
                        w7Var.l();
                    }
                    f9Var.n0();
                    break;
                } else if (f9Var.S == null) {
                    if (!f9Var.a.v) {
                        f9Var.g0(true, true, true);
                    }
                    b9 b9Var3 = f9Var.a.h;
                    boolean[] zArr = {false};
                    AndroidUtilities.requestAdjustNothing(f9Var.getParentActivity(), f9Var.getClassGuid());
                    t8 t8Var = new t8(f9Var, f9Var.getParentActivity());
                    f9Var.S = t8Var;
                    t8Var.fixNavigationBar();
                    f9Var.S.pauseAllHeavyOperations = false;
                    f9Var.h = true;
                    f9Var.e.setBackground(new BitmapDrawable(f9Var.getParentActivity().getResources(), AndroidUtilities.makeBlurBitmap(f9Var.fragmentView, 12.0f, 10)));
                    f9Var.h = false;
                    f9Var.e.setVisibility(0);
                    f9Var.e.setAlpha(0.0f);
                    f9Var.f = true;
                    f9Var.fragmentView.invalidate();
                    f9Var.e.animate().setListener(new u8(f9Var, r11)).alpha(1.0f).setDuration(200L).start();
                    f9Var.Y = new b9();
                    v8 v8Var = new v8(f9Var.getParentActivity(), r11, new s8(f9Var, i16), r11);
                    b9 b9Var4 = f9Var.a.h;
                    if (b9Var4 != null) {
                        b9 b9Var5 = f9Var.Y;
                        int i17 = b9Var4.f;
                        b9Var5.f = i17;
                        v8Var.e(i17, 3);
                        b9 b9Var6 = f9Var.Y;
                        int i18 = f9Var.a.h.e;
                        b9Var6.e = i18;
                        v8Var.e(i18, 2);
                        b9 b9Var7 = f9Var.Y;
                        int i19 = f9Var.a.h.d;
                        b9Var7.d = i19;
                        v8Var.e(i19, 1);
                        b9 b9Var8 = f9Var.Y;
                        int i20 = f9Var.a.h.c;
                        b9Var8.c = i20;
                        v8Var.e(i20, 0);
                    }
                    b9 b9Var9 = f9Var.Y;
                    if (b9Var9.f != 0) {
                        i16 = 4;
                    } else if (b9Var9.e != 0) {
                        i16 = 3;
                    } else if (b9Var9.d == 0) {
                        i16 = 1;
                    }
                    v8Var.f(-1, 4, i16, false);
                    f9Var.a.b(f9Var.Y, true);
                    f9Var.n0();
                    ?? linearLayout = new LinearLayout(f9Var.getParentActivity());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(0, AndroidUtilities.dp(8.0f), 0, 0);
                    linearLayout.addView(v8Var);
                    FrameLayout frameLayout = new FrameLayout(f9Var.getParentActivity());
                    frameLayout.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.j6.Oh));
                    TextView textView = new TextView(f9Var.getParentActivity());
                    textView.setTextSize(1, 14.0f);
                    textView.setText(LocaleController.getString(R.string.SetColor));
                    textView.setGravity(17);
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                    frameLayout.addView(textView, w7.x5.e(-2, -2, 17));
                    linearLayout.addView(frameLayout, w7.x5.d(-1, 48.0f, 0, 16.0f, -8.0f, 16.0f, 16.0f));
                    frameLayout.setOnClickListener(new org.telegram.ui.rf(19, f9Var, zArr));
                    f9Var.S.setCustomView(linearLayout);
                    t8 t8Var2 = f9Var.S;
                    t8Var2.smoothKeyboardAnimationEnabled = true;
                    t8Var2.setDimBehind(false);
                    f9Var.S.show();
                    f9Var.isLightStatusBar();
                    break;
                }
                break;
            case 3:
                lp.o((lp) obj, view, i10);
                break;
            case 4:
                fr frVar = (fr) obj;
                ll0 ll0Var = frVar.d;
                if (i10 > 3) {
                    frVar.d0 = (TLRPC.Peer) frVar.Y.get(i10 - 4);
                    if (view instanceof org.telegram.ui.Cells.f4) {
                        z10 = true;
                        ((org.telegram.ui.Cells.f4) view).c(true, true);
                    } else {
                        z10 = true;
                    }
                    int i21 = 0;
                    while (i21 < ll0Var.getChildCount()) {
                        View childAt = ll0Var.getChildAt(i21);
                        if (childAt != view && (childAt instanceof org.telegram.ui.Cells.f4)) {
                            ((org.telegram.ui.Cells.f4) childAt).c(false, z10);
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
                    rv rvVar = new rv(n2Var, kzVar.getContext(), n2Var == null ? kzVar.Z1 : n2Var.getResourceProvider(), arrayList2);
                    if (i15 >= 0) {
                        rvVar.O = i15;
                    }
                    if (n2Var != null) {
                        n2Var.showDialog(rvVar);
                        break;
                    } else {
                        rvVar.show();
                        break;
                    }
                }
                break;
            case 6:
                kz kzVar2 = ((bz) obj).v;
                kzVar2.t1.o(new d51(kzVar2.getContext(), new fx(kzVar2), kzVar2.x1, kzVar2.y1, kzVar2.z1, (TLRPC.StickerSetCovered) view.getTag(), kzVar2.Z1));
                break;
            case 7:
                n00 n00Var = (n00) obj;
                org.telegram.ui.iu iuVar = n00Var.r;
                ArrayList arrayList3 = n00Var.c.d.s;
                MessagesController.DialogFilter dialogFilter2 = i10 < arrayList3.size() ? (MessagesController.DialogFilter) arrayList3.get(i10) : null;
                boolean z12 = view instanceof org.telegram.ui.ActionBar.y2 ? ((org.telegram.ui.ActionBar.y2) view).e : false;
                org.telegram.ui.uy uyVar = ((org.telegram.ui.uw) iuVar.b).a;
                ArrayList arrayList4 = uyVar.I2;
                ArrayList I = n00.I(uyVar, dialogFilter2, arrayList4, true, false);
                if (!z12) {
                    int size = I.size() + (dialogFilter2 != null ? dialogFilter2.alwaysShow.size() : 0);
                    if ((size > uyVar.getMessagesController().dialogFiltersChatsLimitDefault && !uyVar.getUserConfig().isPremium()) || size > uyVar.getMessagesController().dialogFiltersChatsLimitPremium) {
                        Context context = uyVar.fragmentView.getContext();
                        i11 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                        uyVar.showDialog(new sg.k0(4, i11, context, uyVar, null));
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
                if ((view instanceof org.telegram.ui.Cells.f4) && (i12 = (i10 - 1) - c10Var.r0) >= 0 && i12 < arrayList5.size()) {
                    long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList5.get(i12));
                    if (!arrayList6.contains(Long.valueOf(peerDialogId))) {
                        z11 = true;
                        arrayList6.add(Long.valueOf(peerDialogId));
                        ((org.telegram.ui.Cells.f4) view).c(true, true);
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
                            qc g10 = new yc(c10Var.k0, null).g(str, arrayList7);
                            g10.j = 1500;
                            g10.j();
                            break;
                        }
                    } else {
                        arrayList6.remove(Long.valueOf(peerDialogId));
                        z11 = true;
                        ((org.telegram.ui.Cells.f4) view).c(false, true);
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
                } else if (view instanceof org.telegram.ui.Cells.a5) {
                    org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
                    if (!r30Var.f0.contains(Long.valueOf(a5Var.getUserId()))) {
                        r30Var.g0.a.m1(a5Var.getUserId(), true);
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
                    ek0Var.B(fk0Var, ((dk0) view).e, false, false);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
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
                if (m4Var.E) {
                    hq0Var.X0(r4, m4Var);
                    break;
                } else {
                    tL_dialog.id = r4;
                    hq0Var.U0(null, tL_dialog);
                    boolean z13 = hq0Var.U.h(r4) >= 0;
                    if (m4Var.w) {
                        m4Var.v.a(z13, true);
                        break;
                    }
                }
                break;
            case 13:
                bv0 bv0Var = (bv0) obj;
                int i26 = i10 - 1;
                if (i26 >= 0 && i26 < LocationController.getLocationsCount()) {
                    bv0Var.n.b(bv0.p(i26));
                    bv0Var.dismiss();
                    break;
                }
                break;
            case 14:
                dw0.P((dw0) obj, i10);
                break;
            case 15:
                vw0 vw0Var = (vw0) obj;
                if (i10 < 1) {
                    vw0Var.getClass();
                    break;
                } else {
                    rw0[] rw0VarArr = vw0Var.Y2;
                    if (rw0VarArr != null) {
                        rw0 rw0Var = rw0VarArr[i10 - 1];
                        int dp = AndroidUtilities.dp(64.0f);
                        if (vw0Var.getMeasuredWidth() - view.getRight() < dp) {
                            vw0Var.v0(dp - (vw0Var.getMeasuredWidth() - view.getRight()), 0, pr.h);
                        } else if (view.getLeft() < dp) {
                            vw0Var.v0(-(dp - view.getLeft()), 0, pr.h);
                        }
                        Utilities.Callback callback = vw0Var.n3;
                        if (callback != null) {
                            callback.run(rw0Var);
                            break;
                        }
                    }
                }
                break;
            case 16:
                ux0.m((ux0) obj, view, i10);
                break;
            case 17:
                my0 my0Var = (my0) obj;
                String str2 = ((ly0) view).a;
                if (my0Var.s && (ky0Var = my0Var.c) != null && (ky0Var.getFieldText() instanceof Spanned)) {
                    if (my0Var.T != null) {
                        intValue = ((Spanned) my0Var.c.getFieldText()).getSpanStart(my0Var.T);
                        intValue2 = ((Spanned) my0Var.c.getFieldText()).getSpanEnd(my0Var.T);
                    } else {
                        Integer num = my0Var.V;
                        if (num != null && my0Var.W != null) {
                            intValue = num.intValue();
                            intValue2 = my0Var.W.intValue();
                            my0Var.W = null;
                            my0Var.V = null;
                        }
                    }
                    Editable editText = my0Var.c.getEditText();
                    if (editText != null && intValue >= 0 && intValue2 >= 0 && intValue <= editText.length() && intValue2 <= editText.length()) {
                        if (my0Var.T != null) {
                            if (my0Var.c.getFieldText() instanceof Spannable) {
                                ((Spannable) my0Var.c.getFieldText()).removeSpan(my0Var.T);
                            }
                            my0Var.T = null;
                        }
                        String obj2 = editText.toString();
                        String substring = obj2.substring(intValue, intValue2);
                        int length = substring.length();
                        int i27 = intValue2 - length;
                        while (i27 >= 0) {
                            int i28 = i27 + length;
                            if (obj2.substring(i27, i28).equals(substring)) {
                                Paint.FontMetricsInt fontMetricsInt2 = my0Var.c.getEditField() != null ? my0Var.c.getEditField().getPaint().getFontMetricsInt() : fontMetricsInt;
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
                                        TLRPC.Document f7 = q5.f(my0Var.a, parseLong);
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
                            my0Var.performHapticFeedback(3, 1);
                            Emoji.addRecentEmoji(str2);
                            my0Var.s = false;
                            my0Var.v = true;
                            my0Var.G = 0;
                            yVar = my0Var.d;
                            if (yVar == null) {
                                yVar.invalidate();
                                break;
                            }
                        }
                        my0Var.performHapticFeedback(3, 1);
                        Emoji.addRecentEmoji(str2);
                        my0Var.s = false;
                        my0Var.v = true;
                        my0Var.G = 0;
                        yVar = my0Var.d;
                        if (yVar == null) {
                        }
                    }
                }
                break;
            case 18:
                ThemeEditorView.EditorAlert editorAlert = (ThemeEditorView.EditorAlert) obj;
                ThemeEditorView themeEditorView = ThemeEditorView.this;
                if (i10 != 0) {
                    s4.h0 adapter = editorAlert.c.getAdapter();
                    j11 j11Var = editorAlert.n;
                    if (adapter == j11Var) {
                        int i29 = i10 - 1;
                        ArrayList arrayList9 = j11Var.d;
                        themeEditorView.c = (i29 < 0 || i29 >= arrayList9.size()) ? null : (ArrayList) arrayList9.get(i29);
                    } else {
                        k11 k11Var = editorAlert.r;
                        int i30 = i10 - 1;
                        if (i30 < 0) {
                            k11Var.getClass();
                        } else if (i30 < k11Var.e.size()) {
                            arrayList = (ArrayList) k11Var.e.get(i30);
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
                            final p81 p81Var = themeEditorView.k;
                            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) p81Var.b, (org.telegram.ui.ActionBar.f6) null, false);
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
                d51 d51Var = (d51) obj;
                s4.h0 adapter2 = d51Var.n.getAdapter();
                hg.f2 f2Var = d51Var.v;
                if (adapter2 == f2Var) {
                    stickerSetCovered = (TLRPC.StickerSetCovered) f2Var.K.get(i10);
                } else {
                    c51 c51Var = d51Var.s;
                    stickerSetCovered = i10 < c51Var.w ? (TLRPC.StickerSetCovered) c51Var.f.get(i10) : null;
                }
                if (stickerSetCovered != null) {
                    d51Var.b(stickerSetCovered.set, null);
                    break;
                }
                break;
        }
    }
}
