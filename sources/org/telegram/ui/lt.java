package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class lt implements Runnable {
    public final /* synthetic */ pt a;

    public lt(pt ptVar) {
        this.a = ptVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x0657, code lost:
    
        if (org.telegram.messenger.MessageObject.isStickerHasSet(r2) != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0985, code lost:
    
        if (org.telegram.messenger.MessageObject.isStickerHasSet(r8) != false) goto L233;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0db5  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        int i12;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        nt ntVar;
        nt ntVar2;
        int i13;
        nt ntVar3;
        int i14;
        nt ntVar4;
        TLRPC.Document document;
        TLRPC.Document document2;
        boolean z10;
        ci.m6 m6Var;
        i0.b bVar;
        i0.b bVar2;
        i0.b bVar3;
        ci.m6 m6Var2;
        ci.m6 m6Var3;
        float f7;
        ci.m6 m6Var4;
        float f10;
        ci.m6 m6Var5;
        ci.m6 m6Var6;
        float f11;
        float f12;
        ci.m6 m6Var7;
        org.telegram.ui.ActionBar.d6 d6Var;
        int i15;
        TLRPC.Document document3;
        nt ntVar5;
        TLRPC.Document document4;
        nt ntVar6;
        nt ntVar7;
        nt ntVar8;
        nt ntVar9;
        int i16;
        nt ntVar10;
        TLRPC.Document document5;
        nt ntVar11;
        TLRPC.Document document6;
        nt ntVar12;
        TLRPC.Document document7;
        int i17;
        TLRPC.Document document8;
        TLRPC.Document document9;
        ci.m6 m6Var8;
        i0.b bVar4;
        i0.b bVar5;
        i0.b bVar6;
        ci.m6 m6Var9;
        ci.m6 m6Var10;
        float f13;
        ci.m6 m6Var11;
        float f14;
        ci.m6 m6Var12;
        ci.m6 m6Var13;
        float f15;
        float f16;
        ci.m6 m6Var14;
        org.telegram.ui.ActionBar.d6 d6Var2;
        TLRPC.Document document10;
        int i18;
        TLRPC.Document document11;
        TLRPC.Document document12;
        int i19;
        TLRPC.Document document13;
        nt ntVar13;
        TLRPC.Document document14;
        nt ntVar14;
        ci.m6 m6Var15;
        i0.b bVar7;
        i0.b bVar8;
        i0.b bVar9;
        int i20;
        ci.m6 m6Var16;
        ci.m6 m6Var17;
        float min;
        int i21;
        ci.m6 m6Var18;
        ci.m6 m6Var19;
        float f17;
        ci.m6 m6Var20;
        ci.m6 m6Var21;
        ci.m6 m6Var22;
        ci.m6 m6Var23;
        ci.m6 m6Var24;
        ci.m6 m6Var25;
        org.telegram.ui.ActionBar.d6 d6Var3;
        TLRPC.Document document15;
        int i22;
        nt ntVar15;
        nt ntVar16;
        nt ntVar17;
        nt ntVar18;
        TLRPC.InputStickerSet inputStickerSet;
        nt ntVar19;
        int i23;
        TLRPC.Document document16;
        nt ntVar20;
        int i24;
        nt ntVar21;
        int i25;
        nt ntVar22;
        nt ntVar23;
        nt ntVar24;
        nt ntVar25;
        int i26;
        ci.m6 m6Var26;
        ci.m6 m6Var27;
        int i27;
        wb1 wb1Var;
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        ci.m6 m6Var28;
        org.telegram.ui.Components.o70 j3;
        TLRPC.Document unused;
        pt ptVar = this.a;
        ah.c cVar = ptVar.t;
        if (ptVar.w == null || ptVar.m) {
            return;
        }
        ptVar.R = true;
        nt ntVar26 = ptVar.l;
        final int i28 = 0;
        if (ntVar26 != null && (j3 = ntVar26.j(ptVar.z)) != null) {
            j3.Q(cVar, eh.b.k(ptVar.c0), true);
            j3.t = false;
            j3.Y();
            j3.p = new aj(this, 16);
            ViewGroup viewGroup = j3.A;
            ft ftVar = new ft(this, viewGroup);
            ptVar.k = ftVar;
            ftVar.e = true;
            ftVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
            ftVar.g = true;
            ftVar.setOutsideTouchable(true);
            ptVar.k.setClippingEnabled(true);
            ptVar.k.setAnimationStyle(R.style.PopupContextAnimation);
            ptVar.k.setFocusable(true);
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            ptVar.k.setInputMethodMode(2);
            ptVar.k.getContentView().setFocusableInTouchMode(true);
            i0.b bVar10 = ptVar.q;
            int min2 = (Math.min(ptVar.z.getWidth(), ptVar.z.getHeight() - (bVar10.d + bVar10.b)) - AndroidUtilities.dp(40.0f)) / 2;
            int dp = (int) ((AndroidUtilities.dp(24.0f) - ptVar.e) + ((int) (ptVar.e + Math.max(r2 + min2 + (ptVar.G != null ? AndroidUtilities.dp(40.0f) : 0), ((ptVar.z.getHeight() - r3) - ptVar.I) / 2) + min2)));
            ptVar.k.showAtLocation(ptVar.z, 0, (int) ((r4.getMeasuredWidth() - viewGroup.getMeasuredWidth()) / 2.0f), dp);
            try {
                ptVar.z.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            float f18 = ptVar.e;
            if (f18 != 0.0f) {
                ptVar.f = f18;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.et
                    public final /* synthetic */ lt b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i28) {
                            case 0:
                                pt ptVar2 = this.b.a;
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ptVar2.g = floatValue;
                                float f19 = ptVar2.f;
                                ptVar2.e = com.google.android.gms.internal.vision.e2.z(0.0f, f19, floatValue, f19);
                                ptVar2.z.invalidate();
                                break;
                            case 1:
                                pt ptVar3 = this.b.a;
                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ptVar3.g = floatValue2;
                                float f20 = ptVar3.f;
                                ptVar3.e = com.google.android.gms.internal.vision.e2.z(0.0f, f20, floatValue2, f20);
                                ptVar3.z.invalidate();
                                break;
                            default:
                                pt ptVar4 = this.b.a;
                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ptVar4.g = floatValue3;
                                float f21 = ptVar4.f;
                                ptVar4.e = com.google.android.gms.internal.vision.e2.z(0.0f, f21, floatValue3, f21);
                                ptVar4.z.invalidate();
                                break;
                        }
                    }
                });
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(org.telegram.ui.Components.rr.f);
                ofFloat.start();
            }
            ptVar.K = true;
            return;
        }
        if (ptVar.V != 3) {
            nt ntVar27 = ptVar.l;
            if (ntVar27 != null) {
                TLRPC.TL_messageMediaPoll d = ntVar27.d();
                TLRPC.PollAnswer h = ptVar.l.h();
                if (d != null && d.poll != null && h != null) {
                    TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(d, h.option);
                    if (pollResult != null && pollResult.voters > 0) {
                        MessageObject.canShowVotersList(d);
                    }
                }
            }
            i10 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, ptVar.z.getContext(), ptVar.c0);
            org.telegram.ui.ActionBar.d6 d6Var4 = null;
            ch.d c10 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout2, null, true);
            c10.o(eh.b.k(ptVar.c0));
            c10.q(AndroidUtilities.dp(12.0f));
            c10.p(AndroidUtilities.dp(8.0f));
            c10.j.e = true;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackground(c10);
            if (ptVar.V != 3) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (ptVar.T == null) {
                    nt ntVar28 = ptVar.l;
                    if (ntVar28 == null || !ntVar28.B()) {
                        if (ptVar.l.y()) {
                            arrayList.add(LocaleController.getString(R.string.SendStickerPreview));
                            org.telegram.ui.Cells.q3.o(R.drawable.msg_send, arrayList3, arrayList2, 0);
                        }
                        arrayList.add(LocaleController.getString(R.string.AddToFavorites));
                        org.telegram.ui.Cells.q3.o(R.drawable.msg_fave, arrayList3, arrayList2, 1);
                    } else {
                        arrayList.add(LocaleController.getString(R.string.SetIntroSticker));
                        org.telegram.ui.Cells.q3.o(R.drawable.menu_sticker_add, arrayList3, arrayList2, 0);
                    }
                }
                nt ntVar29 = ptVar.l;
                if (ntVar29 == null || !ntVar29.B()) {
                    nt ntVar30 = ptVar.l;
                    arrayList.add(LocaleController.getString((ntVar30 == null || !ntVar30.J()) ? R.string.AddToStickerPack : R.string.StickersReplaceSticker));
                    nt ntVar31 = ptVar.l;
                    org.telegram.ui.Cells.q3.o((ntVar31 == null || !ntVar31.J()) ? R.drawable.menu_sticker_add : R.drawable.msg_replace, arrayList3, arrayList2, 2);
                }
                int i29 = 7;
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, ptVar.w, ptVar.c0, true, false);
                f1Var.setItemHeight(44);
                f1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                f1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                FrameLayout frameLayout = new FrameLayout(ptVar.z.getContext());
                LinearLayout linearLayout = new LinearLayout(ptVar.z.getContext());
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G8, ptVar.c0));
                linearLayout.setOrientation(1);
                if (ptVar.w == null) {
                    wb1Var = null;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new TLRPC.TL_stickerSetNoCovered());
                    TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = new TLRPC.TL_messages_getMyStickers();
                    tL_messages_getMyStickers.limit = 100;
                    ConnectionsManager.getInstance(ptVar.r).sendRequest(tL_messages_getMyStickers, new aa(ptVar, arrayList4, tL_messages_getMyStickers, i29));
                    wb1 wb1Var2 = new wb1(ptVar.w, i29, d6Var4);
                    wb1Var2.setLayoutManager(new s4.c0());
                    wb1Var2.i(new ci.r1(arrayList4, 4));
                    wb1Var2.setAdapter(new mt(ptVar, arrayList4));
                    wb1Var = wb1Var2;
                }
                wb1Var.setOnItemClickListener(new i(this, 5));
                frameLayout.addView(f1Var);
                linearLayout.addView(frameLayout);
                linearLayout.addView(new org.telegram.ui.ActionBar.k1(ptVar.z.getContext(), ptVar.c0), w7.x5.n(-1, 8));
                ai.s0 s0Var = new ai.s0(this, arrayList2, wb1Var, linearLayout, actionBarPopupWindow$ActionBarPopupWindowLayout2, 13);
                for (int i30 = 0; i30 < arrayList.size(); i30++) {
                    org.telegram.ui.ActionBar.f1 c11 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, ((Integer) arrayList3.get(i30)).intValue(), (CharSequence) arrayList.get(i30), false, ptVar.c0);
                    c11.setTag(Integer.valueOf(i30));
                    c11.setOnClickListener(s0Var);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                linearLayout.addView(wb1Var, new LinearLayout.LayoutParams(actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth() - AndroidUtilities.dp(16.0f), (int) (actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredHeight() * 1.5f)));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.b(linearLayout);
                frameLayout.setOnClickListener(new sf(actionBarPopupWindow$ActionBarPopupWindowLayout2, 2));
                i0.b bVar11 = ptVar.q;
                int i31 = bVar11.d + bVar11.b;
                int min3 = ((int) (Math.min(ptVar.z.getWidth(), ptVar.z.getHeight() - i31) / 1.8f)) / 2;
                ptVar.z.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, w7.x5.d(-2, -2.0f, 49, 0.0f, (AndroidUtilities.dp(84.0f) + ((int) ((ptVar.e + Math.max(r0 + min3, ((ptVar.z.getHeight() - i31) - ptVar.I) / 2)) + min3))) / AndroidUtilities.density, 0.0f, 0.0f));
                ptVar.L = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setTranslationY(-AndroidUtilities.dp(12.0f));
                ptVar.L.setAlpha(0.0f);
                view = ptVar.L;
                view.setScaleX(0.8f);
                view2 = ptVar.L;
                view2.setScaleY(0.8f);
                view3 = ptVar.L;
                view3.setPivotY(0.0f);
                view4 = ptVar.L;
                view5 = ptVar.L;
                view4.setPivotX(view5.getMeasuredWidth() / 2.0f);
                view6 = ptVar.L;
                view6.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.rr.h).start();
                if (ptVar.P == null) {
                    org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(ptVar, ptVar.z.getContext(), UserConfig.selectedAccount, ptVar.c0);
                    ptVar.P = zbVar;
                    zbVar.N0 = true;
                    zbVar.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                    ptVar.P.setClipChildren(false);
                    ptVar.P.setClipToPadding(false);
                    ptVar.P.setVisibility(0);
                    ptVar.P.setHint(LocaleController.getString(R.string.StickersSetEmojiForSticker));
                    ptVar.P.setBubbleOffset(-AndroidUtilities.dp(105.0f));
                    ptVar.P.setMiniBubblesOffset(-AndroidUtilities.dp(14.0f));
                    FrameLayout frameLayout2 = new FrameLayout(ptVar.z.getContext());
                    ptVar.Q = frameLayout2;
                    frameLayout2.addView(ptVar.P, w7.x5.d(-2, 116.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                    ptVar.z.addView(ptVar.Q, w7.x5.d(-2, -2.0f, 1, 0.0f, 100.0f, 0.0f, 0.0f));
                }
                ptVar.P.setSelectedEmojis(ptVar.o);
                ptVar.P.setDelegate(new bt(ptVar));
                ptVar.P.p(null, null, false);
                ptVar.Q.setScaleY(0.6f);
                ptVar.Q.setScaleX(0.6f);
                ptVar.Q.setAlpha(0.0f);
                AndroidUtilities.runOnUIThread(new at(ptVar, 2), 10L);
                ptVar.K = true;
                m6Var28 = ptVar.z;
                m6Var28.invalidate();
            } else {
                final int i32 = 1;
                int i33 = 0;
                i11 = ptVar.V;
                if (i11 != 0) {
                    i12 = ptVar.V;
                    if (i12 == 2) {
                        ntVar8 = ptVar.l;
                        if (ntVar8 != null) {
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = new ArrayList();
                            ntVar9 = ptVar.l;
                            i16 = ptVar.V;
                            if (ntVar9.m(i16)) {
                                arrayList5.add(LocaleController.getString(R.string.SendEmojiPreview));
                                org.telegram.ui.Cells.q3.o(R.drawable.msg_send, arrayList7, arrayList6, 0);
                            }
                            ntVar10 = ptVar.l;
                            document5 = ptVar.W;
                            Boolean P = ntVar10.P(document5);
                            if (P != null) {
                                if (P.booleanValue()) {
                                    arrayList5.add(LocaleController.getString(R.string.SetAsEmojiStatus));
                                    org.telegram.ui.Cells.q3.o(R.drawable.msg_smile_status, arrayList7, arrayList6, 1);
                                } else {
                                    arrayList5.add(LocaleController.getString(R.string.RemoveStatus));
                                    org.telegram.ui.Cells.q3.o(R.drawable.msg_smile_status, arrayList7, arrayList6, 2);
                                }
                            }
                            ntVar11 = ptVar.l;
                            document6 = ptVar.W;
                            if (ntVar11.E(document6)) {
                                arrayList5.add(LocaleController.getString(R.string.CopyEmojiPreview));
                                org.telegram.ui.Cells.q3.o(R.drawable.msg_copy, arrayList7, arrayList6, 3);
                            }
                            ntVar12 = ptVar.l;
                            document7 = ptVar.W;
                            if (ntVar12.N(document7)) {
                                arrayList5.add(LocaleController.getString(R.string.RemoveFromRecent));
                                org.telegram.ui.Cells.q3.o(R.drawable.msg_delete, arrayList7, arrayList6, 4);
                            }
                            i17 = ptVar.r;
                            MediaDataController mediaDataController = MediaDataController.getInstance(i17);
                            document8 = ptVar.W;
                            boolean isStickerInFavorites = mediaDataController.isStickerInFavorites(document8);
                            document9 = ptVar.W;
                            if (!MessageObject.isAnimatedEmoji(document9)) {
                                document10 = ptVar.W;
                                if (!MessageObject.isMaskDocument(document10)) {
                                    if (!isStickerInFavorites) {
                                        i18 = ptVar.r;
                                        if (MediaDataController.getInstance(i18).canAddStickerToFavorites()) {
                                            document11 = ptVar.W;
                                        }
                                    }
                                    arrayList5.add(LocaleController.getString(isStickerInFavorites ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                                    org.telegram.ui.Cells.q3.o(isStickerInFavorites ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList7, arrayList6, 5);
                                }
                            }
                            if (arrayList5.isEmpty()) {
                                return;
                            }
                            ptVar.K = true;
                            m6Var8 = ptVar.z;
                            m6Var8.invalidate();
                            int[] iArr = new int[arrayList7.size()];
                            for (int i34 = 0; i34 < arrayList7.size(); i34++) {
                                iArr[i34] = ((Integer) arrayList7.get(i34)).intValue();
                            }
                            org.telegram.ui.Components.wb0 wb0Var = new org.telegram.ui.Components.wb0(this, arrayList6, isStickerInFavorites);
                            boolean h10 = pt.h(ptVar, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                            int i35 = 0;
                            while (i35 < arrayList5.size()) {
                                boolean z11 = !h10 && i35 == 0;
                                boolean z12 = i35 == arrayList5.size() + (-1);
                                int intValue = ((Integer) arrayList7.get(i35)).intValue();
                                CharSequence charSequence = (CharSequence) arrayList5.get(i35);
                                d6Var2 = ptVar.c0;
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                                org.telegram.ui.ActionBar.f1 c12 = org.telegram.ui.ActionBar.v0.c(z11, z12, actionBarPopupWindow$ActionBarPopupWindowLayout3, intValue, charSequence, false, d6Var2);
                                if (((Integer) arrayList6.get(i35)).intValue() == 4) {
                                    c12.setIconColor(pt.d(ptVar, org.telegram.ui.ActionBar.h6.p7));
                                    c12.setTextColor(pt.d(ptVar, org.telegram.ui.ActionBar.h6.q7));
                                }
                                c12.setTag(Integer.valueOf(i35));
                                c12.setOnClickListener(wb0Var);
                                i35++;
                                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                            jt jtVar = new jt(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            ptVar.k = jtVar;
                            jtVar.e = true;
                            jtVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
                            jtVar.g = true;
                            jtVar.setOutsideTouchable(true);
                            ptVar.k.setClippingEnabled(true);
                            ptVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                            ptVar.k.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            ptVar.k.setInputMethodMode(2);
                            ptVar.k.getContentView().setFocusableInTouchMode(true);
                            bVar4 = ptVar.q;
                            int i36 = bVar4.d;
                            bVar5 = ptVar.q;
                            int i37 = i36 + bVar5.b;
                            bVar6 = ptVar.q;
                            int i38 = bVar6.b;
                            m6Var9 = ptVar.z;
                            int width = m6Var9.getWidth();
                            m6Var10 = ptVar.z;
                            int min4 = Math.min(width, m6Var10.getHeight() - i37) - AndroidUtilities.dp(40.0f);
                            f13 = ptVar.e;
                            int i39 = min4 / 2;
                            int i40 = i38 + i39;
                            int dp2 = ptVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                            m6Var11 = ptVar.z;
                            float max = (int) (f13 + Math.max(i40 + dp2, ((m6Var11.getHeight() - i37) - ptVar.I) / 2) + i39);
                            float dp3 = AndroidUtilities.dp(24.0f);
                            f14 = ptVar.e;
                            int i41 = (int) ((dp3 - f14) + max);
                            org.telegram.ui.ActionBar.n1 n1Var = ptVar.k;
                            m6Var12 = ptVar.z;
                            m6Var13 = ptVar.z;
                            n1Var.showAtLocation(m6Var12, 0, (int) ((m6Var13.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i41);
                            org.telegram.ui.ActionBar.n1.i(actionBarPopupWindow$ActionBarPopupWindowLayout);
                            try {
                                m6Var14 = ptVar.z;
                                m6Var14.performHapticFeedback(0);
                            } catch (Exception unused3) {
                            }
                            f15 = ptVar.e;
                            if (f15 != 0.0f) {
                                f16 = ptVar.e;
                                ptVar.f = f16;
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.et
                                    public final /* synthetic */ lt b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        switch (i32) {
                                            case 0:
                                                pt ptVar2 = this.b.a;
                                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                ptVar2.g = floatValue;
                                                float f19 = ptVar2.f;
                                                ptVar2.e = com.google.android.gms.internal.vision.e2.z(0.0f, f19, floatValue, f19);
                                                ptVar2.z.invalidate();
                                                break;
                                            case 1:
                                                pt ptVar3 = this.b.a;
                                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                ptVar3.g = floatValue2;
                                                float f20 = ptVar3.f;
                                                ptVar3.e = com.google.android.gms.internal.vision.e2.z(0.0f, f20, floatValue2, f20);
                                                ptVar3.z.invalidate();
                                                break;
                                            default:
                                                pt ptVar4 = this.b.a;
                                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                ptVar4.g = floatValue3;
                                                float f21 = ptVar4.f;
                                                ptVar4.e = com.google.android.gms.internal.vision.e2.z(0.0f, f21, floatValue3, f21);
                                                ptVar4.z.invalidate();
                                                break;
                                        }
                                    }
                                });
                                ofFloat2.setDuration(350L);
                                ofFloat2.setInterpolator(org.telegram.ui.Components.rr.f);
                                ofFloat2.start();
                            }
                            i27 = 0;
                            while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i27);
                                if (childAt instanceof org.telegram.ui.ActionBar.f1) {
                                    ((org.telegram.ui.ActionBar.f1) childAt).k(i27 == 0, i27 == actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() + (-1));
                                }
                                i27++;
                            }
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                    ntVar = ptVar.l;
                    if (ntVar != null) {
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        ntVar2 = ptVar.l;
                        i13 = ptVar.V;
                        if (ntVar2.m(i13)) {
                            ntVar7 = ptVar.l;
                            if (!ntVar7.c()) {
                                arrayList8.add(LocaleController.getString(R.string.SendGifPreview));
                                org.telegram.ui.Cells.q3.o(R.drawable.msg_send, arrayList10, arrayList9, 0);
                            }
                        }
                        ntVar3 = ptVar.l;
                        i14 = ptVar.V;
                        if (ntVar3.m(i14)) {
                            ntVar6 = ptVar.l;
                            if (!ntVar6.c()) {
                                arrayList8.add(LocaleController.getString(R.string.SendWithoutSound));
                                org.telegram.ui.Cells.q3.o(R.drawable.input_notify_off, arrayList10, arrayList9, 4);
                            }
                        }
                        ntVar4 = ptVar.l;
                        if (ntVar4.b()) {
                            arrayList8.add(LocaleController.getString(R.string.Schedule));
                            org.telegram.ui.Cells.q3.o(R.drawable.msg_autodelete, arrayList10, arrayList9, 3);
                        }
                        document = ptVar.W;
                        if (document != null) {
                            ntVar5 = ptVar.l;
                            document4 = ptVar.W;
                            if (ntVar5.e(document4)) {
                                arrayList8.add(LocaleController.getString(R.string.AddACaption));
                                org.telegram.ui.Cells.q3.n(R.drawable.outline_caption_24, 11, arrayList10, arrayList9);
                            }
                        }
                        document2 = ptVar.W;
                        if (document2 != null) {
                            i15 = ptVar.r;
                            MediaDataController mediaDataController2 = MediaDataController.getInstance(i15);
                            document3 = ptVar.W;
                            z10 = mediaDataController2.hasRecentGif(document3);
                            if (z10) {
                                arrayList8.add(LocaleController.formatString("Delete", R.string.Delete, new Object[0]));
                                org.telegram.ui.Cells.q3.o(R.drawable.msg_delete, arrayList10, arrayList9, 1);
                            } else {
                                arrayList8.add(LocaleController.formatString("SaveToGIFs", R.string.SaveToGIFs, new Object[0]));
                                org.telegram.ui.Cells.q3.o(R.drawable.msg_gif_add, arrayList10, arrayList9, 2);
                            }
                        } else {
                            z10 = false;
                        }
                        if (arrayList8.isEmpty()) {
                            return;
                        }
                        ptVar.K = true;
                        m6Var = ptVar.z;
                        m6Var.invalidate();
                        int[] iArr2 = new int[arrayList10.size()];
                        for (int i42 = 0; i42 < arrayList10.size(); i42++) {
                            iArr2[i42] = ((Integer) arrayList10.get(i42)).intValue();
                        }
                        org.telegram.ui.Components.et etVar = new org.telegram.ui.Components.et(28, this, arrayList9);
                        for (int i43 = 0; i43 < arrayList8.size(); i43++) {
                            int intValue2 = ((Integer) arrayList10.get(i43)).intValue();
                            CharSequence charSequence2 = (CharSequence) arrayList8.get(i43);
                            d6Var = ptVar.c0;
                            org.telegram.ui.ActionBar.f1 c13 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, intValue2, charSequence2, false, d6Var);
                            c13.setTag(Integer.valueOf(i43));
                            c13.setOnClickListener(etVar);
                            if (z10 && i43 == arrayList8.size() - 1) {
                                c13.c(pt.d(ptVar, org.telegram.ui.ActionBar.h6.q7), pt.d(ptVar, org.telegram.ui.ActionBar.h6.p7));
                            }
                        }
                        kt ktVar = new kt(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                        ptVar.k = ktVar;
                        ktVar.e = true;
                        ktVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
                        ktVar.g = true;
                        ktVar.setOutsideTouchable(true);
                        ptVar.k.setClippingEnabled(true);
                        ptVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                        ptVar.k.setFocusable(true);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                        ptVar.k.setInputMethodMode(2);
                        ptVar.k.getContentView().setFocusableInTouchMode(true);
                        bVar = ptVar.q;
                        int i44 = bVar.d;
                        bVar2 = ptVar.q;
                        int i45 = i44 + bVar2.b;
                        bVar3 = ptVar.q;
                        int i46 = bVar3.b;
                        m6Var2 = ptVar.z;
                        int width2 = m6Var2.getWidth();
                        m6Var3 = ptVar.z;
                        int min5 = Math.min(width2, m6Var3.getHeight() - i45) - AndroidUtilities.dp(40.0f);
                        f7 = ptVar.e;
                        int i47 = min5 / 2;
                        int i48 = i46 + i47;
                        int dp4 = ptVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                        m6Var4 = ptVar.z;
                        float max2 = (int) (f7 + Math.max(i48 + dp4, ((m6Var4.getHeight() - i45) - ptVar.I) / 2) + i47);
                        float dp5 = AndroidUtilities.dp(24.0f);
                        f10 = ptVar.e;
                        int i49 = (int) ((dp5 - f10) + max2);
                        org.telegram.ui.ActionBar.n1 n1Var2 = ptVar.k;
                        m6Var5 = ptVar.z;
                        m6Var6 = ptVar.z;
                        n1Var2.showAtLocation(m6Var5, 0, (int) ((m6Var6.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i49);
                        try {
                            m6Var7 = ptVar.z;
                            m6Var7.performHapticFeedback(0);
                        } catch (Exception unused4) {
                        }
                        f11 = ptVar.e;
                        if (f11 != 0.0f) {
                            f12 = ptVar.e;
                            ptVar.f = f12;
                            final int i50 = 2;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.et
                                public final /* synthetic */ lt b;

                                {
                                    this.b = this;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (i50) {
                                        case 0:
                                            pt ptVar2 = this.b.a;
                                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            ptVar2.g = floatValue;
                                            float f19 = ptVar2.f;
                                            ptVar2.e = com.google.android.gms.internal.vision.e2.z(0.0f, f19, floatValue, f19);
                                            ptVar2.z.invalidate();
                                            break;
                                        case 1:
                                            pt ptVar3 = this.b.a;
                                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            ptVar3.g = floatValue2;
                                            float f20 = ptVar3.f;
                                            ptVar3.e = com.google.android.gms.internal.vision.e2.z(0.0f, f20, floatValue2, f20);
                                            ptVar3.z.invalidate();
                                            break;
                                        default:
                                            pt ptVar4 = this.b.a;
                                            float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            ptVar4.g = floatValue3;
                                            float f21 = ptVar4.f;
                                            ptVar4.e = com.google.android.gms.internal.vision.e2.z(0.0f, f21, floatValue3, f21);
                                            ptVar4.z.invalidate();
                                            break;
                                    }
                                }
                            });
                            ofFloat3.setDuration(350L);
                            ofFloat3.setInterpolator(org.telegram.ui.Components.rr.f);
                            ofFloat3.start();
                        }
                        i27 = 0;
                        while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                        }
                    }
                    i27 = 0;
                    while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                    }
                }
                document12 = ptVar.W;
                if (MessageObject.isPremiumSticker(document12)) {
                    i26 = ptVar.r;
                    if (!AccountInstance.getInstance(i26).getUserConfig().isPremium()) {
                        if (ptVar.O == null) {
                            ah1 ah1Var = new ah1(ptVar.z.getContext(), ptVar.c0);
                            ptVar.O = ah1Var;
                            ptVar.z.addView(ah1Var, w7.x5.c(-1.0f, -1));
                            ptVar.O.setOnClickListener(new ct(ptVar, i33));
                            ptVar.O.a.r.setOnClickListener(new ct(ptVar, i32));
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(ptVar.O, false, 1.0f, false);
                        AndroidUtilities.updateViewVisibilityAnimated(ptVar.O, true);
                        ptVar.O.setTranslationY(0.0f);
                        ptVar.K = true;
                        m6Var26 = ptVar.z;
                        m6Var26.invalidate();
                        try {
                            m6Var27 = ptVar.z;
                            m6Var27.performHapticFeedback(0);
                            return;
                        } catch (Exception unused5) {
                            return;
                        }
                    }
                }
                i19 = ptVar.r;
                MediaDataController mediaDataController3 = MediaDataController.getInstance(i19);
                document13 = ptVar.W;
                boolean isStickerInFavorites2 = mediaDataController3.isStickerInFavorites(document13);
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                ntVar13 = ptVar.l;
                if (ntVar13 != null) {
                    ntVar20 = ptVar.l;
                    i24 = ptVar.V;
                    if (ntVar20.m(i24)) {
                        ntVar25 = ptVar.l;
                        if (!ntVar25.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendStickerPreview));
                            org.telegram.ui.Cells.q3.o(R.drawable.msg_send, arrayList13, arrayList12, 0);
                        }
                    }
                    ntVar21 = ptVar.l;
                    i25 = ptVar.V;
                    if (ntVar21.m(i25)) {
                        ntVar24 = ptVar.l;
                        if (!ntVar24.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendWithoutSound));
                            org.telegram.ui.Cells.q3.n(R.drawable.input_notify_off, 6, arrayList13, arrayList12);
                        }
                    }
                    ntVar22 = ptVar.l;
                    if (ntVar22.b()) {
                        arrayList11.add(LocaleController.getString(R.string.Schedule));
                        org.telegram.ui.Cells.q3.o(R.drawable.msg_autodelete, arrayList13, arrayList12, 3);
                    }
                    ntVar23 = ptVar.l;
                    if (ntVar23.g()) {
                        arrayList11.add(LocaleController.getString(R.string.ImportStickersRemoveMenu));
                        org.telegram.ui.Cells.q3.o(R.drawable.msg_delete, arrayList13, arrayList12, 5);
                    }
                }
                document14 = ptVar.W;
                if (!MessageObject.isMaskDocument(document14)) {
                    if (!isStickerInFavorites2) {
                        i23 = ptVar.r;
                        if (MediaDataController.getInstance(i23).canAddStickerToFavorites()) {
                            document16 = ptVar.W;
                        }
                    }
                    arrayList11.add(LocaleController.getString(isStickerInFavorites2 ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                    org.telegram.ui.Cells.q3.o(isStickerInFavorites2 ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList13, arrayList12, 2);
                }
                ntVar14 = ptVar.l;
                if (ntVar14 != null && (inputStickerSet = ptVar.a0) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                    ntVar19 = ptVar.l;
                    if (ntVar19.Q()) {
                        arrayList11.add(LocaleController.formatString(R.string.ViewPackPreview, new Object[0]));
                        org.telegram.ui.Cells.q3.o(R.drawable.msg_media, arrayList13, arrayList12, 1);
                    }
                }
                if (ptVar.p) {
                    arrayList11.add(LocaleController.getString(R.string.DeleteFromRecent));
                    org.telegram.ui.Cells.q3.o(R.drawable.msg_delete, arrayList13, arrayList12, 4);
                }
                if (ptVar.a0 != null) {
                    document15 = ptVar.W;
                    if (document15 != null) {
                        i22 = ptVar.r;
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i22).getStickerSet(ptVar.a0, true);
                        if (stickerSet != null) {
                            ntVar17 = ptVar.l;
                            if (ntVar17 != null) {
                                ntVar18 = ptVar.l;
                                if (ntVar18.D()) {
                                    TLRPC.StickerSet stickerSet2 = stickerSet.set;
                                    if (!stickerSet2.emojis && !stickerSet2.masks) {
                                        arrayList11.add(LocaleController.getString(R.string.EditSticker));
                                        org.telegram.ui.Cells.q3.n(R.drawable.msg_edit, 7, arrayList13, arrayList12);
                                    }
                                }
                            }
                        }
                        if (stickerSet != null && stickerSet.set.creator) {
                            ntVar15 = ptVar.l;
                            if (ntVar15 != null) {
                                ntVar16 = ptVar.l;
                                unused = ptVar.W;
                                if (ntVar16.I()) {
                                    arrayList11.add(LocaleController.getString(R.string.DeleteSticker));
                                    org.telegram.ui.Cells.q3.n(R.drawable.msg_delete, 8, arrayList13, arrayList12);
                                }
                            }
                        }
                    }
                }
                if (arrayList11.isEmpty()) {
                    return;
                }
                ptVar.K = true;
                m6Var15 = ptVar.z;
                m6Var15.invalidate();
                gt gtVar = new gt(this, arrayList12, isStickerInFavorites2);
                pt.h(ptVar, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                for (int i51 = 0; i51 < arrayList11.size(); i51++) {
                    int intValue3 = ((Integer) arrayList13.get(i51)).intValue();
                    CharSequence charSequence3 = (CharSequence) arrayList11.get(i51);
                    d6Var3 = ptVar.c0;
                    org.telegram.ui.ActionBar.f1 c14 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, intValue3, charSequence3, false, d6Var3);
                    c14.setTag(Integer.valueOf(i51));
                    c14.setOnClickListener(gtVar);
                    if (((Integer) arrayList12.get(i51)).intValue() == 8) {
                        int d10 = pt.d(ptVar, org.telegram.ui.ActionBar.h6.q7);
                        c14.c(d10, d10);
                        c14.setSelectorColor(org.telegram.ui.ActionBar.h6.l1(0.1f, d10));
                    }
                }
                ht htVar = new ht(this, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                ptVar.k = htVar;
                htVar.e = true;
                htVar.c = 100;
                htVar.g = true;
                htVar.setOutsideTouchable(true);
                ptVar.k.setClippingEnabled(true);
                ptVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                ptVar.k.setFocusable(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                ptVar.k.setInputMethodMode(2);
                ptVar.k.getContentView().setFocusableInTouchMode(true);
                bVar7 = ptVar.q;
                int i52 = bVar7.d;
                bVar8 = ptVar.q;
                int i53 = i52 + bVar8.b;
                bVar9 = ptVar.q;
                int i54 = bVar9.b;
                i20 = ptVar.V;
                if (i20 == 1) {
                    m6Var24 = ptVar.z;
                    int width3 = m6Var24.getWidth();
                    m6Var25 = ptVar.z;
                    i21 = Math.min(width3, m6Var25.getHeight() - i53) - AndroidUtilities.dp(40.0f);
                } else {
                    if (ptVar.S) {
                        m6Var18 = ptVar.z;
                        int width4 = m6Var18.getWidth();
                        m6Var19 = ptVar.z;
                        min = Math.min(width4, m6Var19.getHeight() - i53) - AndroidUtilities.dpf2(40.0f);
                    } else {
                        m6Var16 = ptVar.z;
                        int width5 = m6Var16.getWidth();
                        m6Var17 = ptVar.z;
                        min = Math.min(width5, m6Var17.getHeight() - i53) / 1.8f;
                    }
                    i21 = (int) min;
                }
                f17 = ptVar.e;
                int i55 = i21 / 2;
                int i56 = i54 + i55;
                int dp6 = ptVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                m6Var20 = ptVar.z;
                int dp7 = AndroidUtilities.dp(24.0f) + ((int) (f17 + Math.max(i56 + dp6, ((m6Var20.getHeight() - i53) - ptVar.I) / 2) + i55));
                if (ptVar.S) {
                    dp7 += AndroidUtilities.dp(24.0f);
                }
                org.telegram.ui.ActionBar.n1 n1Var3 = ptVar.k;
                m6Var21 = ptVar.z;
                m6Var22 = ptVar.z;
                n1Var3.showAtLocation(m6Var21, 0, (int) ((m6Var22.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth()) / 2.0f), dp7);
                try {
                    m6Var23 = ptVar.z;
                    m6Var23.performHapticFeedback(0);
                } catch (Exception unused6) {
                }
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            i27 = 0;
            while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
            }
        }
        i10 = 1;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout22 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, ptVar.z.getContext(), ptVar.c0);
        org.telegram.ui.ActionBar.d6 d6Var42 = null;
        ch.d c102 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout22, null, true);
        c102.o(eh.b.k(ptVar.c0));
        c102.q(AndroidUtilities.dp(12.0f));
        c102.p(AndroidUtilities.dp(8.0f));
        c102.j.e = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout22.setBackground(c102);
        if (ptVar.V != 3) {
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout22;
        i27 = 0;
        while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
        }
    }
}
