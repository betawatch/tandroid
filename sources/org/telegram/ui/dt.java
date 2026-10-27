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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class dt implements Runnable {
    public final /* synthetic */ ht a;

    public dt(ht htVar) {
        this.a = htVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x0643, code lost:
    
        if (org.telegram.messenger.MessageObject.isStickerHasSet(r0) != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0965, code lost:
    
        if (org.telegram.messenger.MessageObject.isStickerHasSet(r6) != false) goto L230;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0d85  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        int i12;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        ft ftVar;
        ft ftVar2;
        int i13;
        ft ftVar3;
        int i14;
        ft ftVar4;
        TLRPC.Document document;
        TLRPC.Document document2;
        boolean z10;
        bh.p pVar;
        i0.b bVar;
        i0.b bVar2;
        i0.b bVar3;
        bh.p pVar2;
        bh.p pVar3;
        float f7;
        bh.p pVar4;
        float f10;
        bh.p pVar5;
        bh.p pVar6;
        int i15;
        float f11;
        float f12;
        bh.p pVar7;
        org.telegram.ui.ActionBar.u6 u6Var;
        int i16;
        TLRPC.Document document3;
        ft ftVar5;
        TLRPC.Document document4;
        ft ftVar6;
        ft ftVar7;
        ft ftVar8;
        ft ftVar9;
        int i17;
        ft ftVar10;
        TLRPC.Document document5;
        ft ftVar11;
        TLRPC.Document document6;
        ft ftVar12;
        TLRPC.Document document7;
        int i18;
        TLRPC.Document document8;
        TLRPC.Document document9;
        bh.p pVar8;
        i0.b bVar4;
        i0.b bVar5;
        i0.b bVar6;
        bh.p pVar9;
        bh.p pVar10;
        float f13;
        bh.p pVar11;
        float f14;
        bh.p pVar12;
        bh.p pVar13;
        float f15;
        float f16;
        bh.p pVar14;
        org.telegram.ui.ActionBar.u6 u6Var2;
        TLRPC.Document document10;
        int i19;
        TLRPC.Document document11;
        TLRPC.Document document12;
        int i20;
        TLRPC.Document document13;
        ft ftVar13;
        TLRPC.Document document14;
        ft ftVar14;
        bh.p pVar15;
        i0.b bVar7;
        i0.b bVar8;
        i0.b bVar9;
        int i21;
        bh.p pVar16;
        bh.p pVar17;
        float min;
        int i22;
        bh.p pVar18;
        bh.p pVar19;
        float f17;
        bh.p pVar20;
        bh.p pVar21;
        bh.p pVar22;
        bh.p pVar23;
        bh.p pVar24;
        bh.p pVar25;
        org.telegram.ui.ActionBar.u6 u6Var3;
        TLRPC.Document document15;
        int i23;
        ft ftVar15;
        ft ftVar16;
        ft ftVar17;
        ft ftVar18;
        TLRPC.InputStickerSet inputStickerSet;
        ft ftVar19;
        int i24;
        TLRPC.Document document16;
        ft ftVar20;
        int i25;
        ft ftVar21;
        int i26;
        ft ftVar22;
        ft ftVar23;
        ft ftVar24;
        ft ftVar25;
        int i27;
        boolean z11;
        bh.p pVar26;
        bh.p pVar27;
        int i28;
        bb1 bb1Var;
        bh.p pVar28;
        org.telegram.ui.Components.l80 i29;
        TLRPC.Document unused;
        ht htVar = this.a;
        ch.b bVar10 = htVar.t;
        if (htVar.w == null || htVar.m) {
            return;
        }
        htVar.R = true;
        ft ftVar26 = htVar.l;
        final int i30 = 0;
        if (ftVar26 != null && (i29 = ftVar26.i(htVar.z)) != null) {
            i29.Q(bVar10, gh.c.k(htVar.c0), true);
            i29.t = false;
            i29.Y();
            i29.p = new xi(this, 16);
            ViewGroup viewGroup = i29.A;
            ys ysVar = new ys(this, viewGroup);
            htVar.k = ysVar;
            ysVar.e = true;
            ysVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
            ysVar.g = true;
            ysVar.setOutsideTouchable(true);
            htVar.k.setClippingEnabled(true);
            htVar.k.setAnimationStyle(R.style.PopupContextAnimation);
            htVar.k.setFocusable(true);
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            htVar.k.setInputMethodMode(2);
            htVar.k.getContentView().setFocusableInTouchMode(true);
            i0.b bVar11 = htVar.q;
            int min2 = (Math.min(htVar.z.getWidth(), htVar.z.getHeight() - (bVar11.d + bVar11.b)) - AndroidUtilities.dp(40.0f)) / 2;
            int dp = (int) ((AndroidUtilities.dp(24.0f) - htVar.e) + ((int) (htVar.e + Math.max(r3 + min2 + (htVar.G != null ? AndroidUtilities.dp(40.0f) : 0), ((htVar.z.getHeight() - r4) - htVar.I) / 2) + min2)));
            htVar.k.showAtLocation(htVar.z, 0, (int) ((r5.getMeasuredWidth() - viewGroup.getMeasuredWidth()) / 2.0f), dp);
            try {
                htVar.z.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            float f18 = htVar.e;
            if (f18 != 0.0f) {
                htVar.f = f18;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.xs
                    public final /* synthetic */ dt b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i30) {
                            case 0:
                                ht htVar2 = this.b.a;
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                htVar2.g = floatValue;
                                float f19 = htVar2.f;
                                htVar2.e = c3.h0.z(0.0f, f19, floatValue, f19);
                                htVar2.z.invalidate();
                                break;
                            case 1:
                                ht htVar3 = this.b.a;
                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                htVar3.g = floatValue2;
                                float f20 = htVar3.f;
                                htVar3.e = c3.h0.z(0.0f, f20, floatValue2, f20);
                                htVar3.z.invalidate();
                                break;
                            default:
                                ht htVar4 = this.b.a;
                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                htVar4.g = floatValue3;
                                float f21 = htVar4.f;
                                htVar4.e = c3.h0.z(0.0f, f21, floatValue3, f21);
                                htVar4.z.invalidate();
                                break;
                        }
                    }
                });
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(org.telegram.ui.Components.ds.f);
                ofFloat.start();
            }
            htVar.K = true;
            return;
        }
        if (htVar.V != 3) {
            ft ftVar27 = htVar.l;
            if (ftVar27 != null) {
                TLRPC.TL_messageMediaPoll d = ftVar27.d();
                TLRPC.PollAnswer g7 = htVar.l.g();
                if (d != null && d.poll != null && g7 != null) {
                    TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(d, g7.option);
                    if (pollResult != null && pollResult.voters > 0) {
                        MessageObject.canShowVotersList(d);
                    }
                }
            }
            i10 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, htVar.z.getContext(), htVar.c0);
            org.telegram.ui.ActionBar.u6 u6Var4 = null;
            eh.d c10 = bVar10.c(actionBarPopupWindow$ActionBarPopupWindowLayout2, null, true);
            c10.v(gh.c.k(htVar.c0));
            org.telegram.messenger.wh.s(c10, AndroidUtilities.dp(12.0f), 8.0f);
            c10.x.e = true;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackground(c10);
            int i31 = 6;
            int i32 = 7;
            if (htVar.V != 3) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (htVar.T == null) {
                    ft ftVar28 = htVar.l;
                    if (ftVar28 == null || !ftVar28.A()) {
                        if (htVar.l.x()) {
                            arrayList.add(LocaleController.getString(R.string.SendStickerPreview));
                            d3.r(R.drawable.msg_send, arrayList3, arrayList2, 0);
                        }
                        arrayList.add(LocaleController.getString(R.string.AddToFavorites));
                        d3.r(R.drawable.msg_fave, arrayList3, arrayList2, 1);
                    } else {
                        arrayList.add(LocaleController.getString(R.string.SetIntroSticker));
                        d3.r(R.drawable.menu_sticker_add, arrayList3, arrayList2, 0);
                    }
                }
                ft ftVar29 = htVar.l;
                if (ftVar29 == null || !ftVar29.A()) {
                    ft ftVar30 = htVar.l;
                    arrayList.add(LocaleController.getString((ftVar30 == null || !ftVar30.I()) ? R.string.AddToStickerPack : R.string.StickersReplaceSticker));
                    ft ftVar31 = htVar.l;
                    d3.r((ftVar31 == null || !ftVar31.I()) ? R.drawable.menu_sticker_add : R.drawable.msg_replace, arrayList3, arrayList2, 2);
                }
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, htVar.w, htVar.c0, true, false);
                g1Var.setItemHeight(44);
                g1Var.j(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                g1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                FrameLayout frameLayout = new FrameLayout(htVar.z.getContext());
                LinearLayout linearLayout = new LinearLayout(htVar.z.getContext());
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.G8, linearLayout, htVar.c0);
                linearLayout.setOrientation(1);
                if (htVar.w == null) {
                    bb1Var = null;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new TLRPC.TL_stickerSetNoCovered());
                    TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = new TLRPC.TL_messages_getMyStickers();
                    tL_messages_getMyStickers.limit = 100;
                    ConnectionsManager.getInstance(htVar.r).sendRequest(tL_messages_getMyStickers, new ea(htVar, arrayList4, tL_messages_getMyStickers, i32));
                    bb1Var = new bb1(htVar.w, i32, u6Var4);
                    bb1Var.setLayoutManager(new s4.c0());
                    bb1Var.i(new fi.p1(arrayList4, 4));
                    bb1Var.setAdapter(new et(htVar, arrayList4));
                }
                bb1Var.setOnItemClickListener(new h(this, i31));
                frameLayout.addView(g1Var);
                linearLayout.addView(frameLayout);
                linearLayout.addView(new org.telegram.ui.ActionBar.l1(htVar.z.getContext(), htVar.c0), org.telegram.ui.Components.kb1.r(-1, 8));
                bb1 bb1Var2 = bb1Var;
                di.e0 e0Var = new di.e0(this, arrayList2, bb1Var2, linearLayout, actionBarPopupWindow$ActionBarPopupWindowLayout2, 13);
                for (int i33 = 0; i33 < arrayList.size(); i33++) {
                    org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, ((Integer) arrayList3.get(i33)).intValue(), (CharSequence) arrayList.get(i33), false, htVar.c0);
                    c11.setTag(Integer.valueOf(i33));
                    c11.setOnClickListener(e0Var);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                linearLayout.addView(bb1Var2, new LinearLayout.LayoutParams(actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth() - AndroidUtilities.dp(16.0f), (int) (actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredHeight() * 1.5f)));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.b(linearLayout);
                frameLayout.setOnClickListener(new lf(actionBarPopupWindow$ActionBarPopupWindowLayout2, 2));
                i0.b bVar12 = htVar.q;
                int i34 = bVar12.d + bVar12.b;
                int min3 = ((int) (Math.min(htVar.z.getWidth(), htVar.z.getHeight() - i34) / 1.8f)) / 2;
                htVar.z.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, org.telegram.ui.Components.kb1.h(-2, -2.0f, 49, 0.0f, (AndroidUtilities.dp(84.0f) + ((int) ((htVar.e + Math.max(r0 + min3, ((htVar.z.getHeight() - i34) - htVar.I) / 2)) + min3))) / AndroidUtilities.density, 0.0f, 0.0f));
                htVar.L = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setTranslationY(-AndroidUtilities.dp(12.0f));
                htVar.L.setAlpha(0.0f);
                htVar.L.setScaleX(0.8f);
                htVar.L.setScaleY(0.8f);
                htVar.L.setPivotY(0.0f);
                htVar.L.setPivotX(r0.getMeasuredWidth() / 2.0f);
                htVar.L.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.ds.h).start();
                if (htVar.P == null) {
                    org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(htVar, htVar.z.getContext(), UserConfig.selectedAccount, htVar.c0);
                    htVar.P = zbVar;
                    zbVar.N0 = true;
                    zbVar.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                    htVar.P.setClipChildren(false);
                    htVar.P.setClipToPadding(false);
                    htVar.P.setVisibility(0);
                    htVar.P.setHint(LocaleController.getString(R.string.StickersSetEmojiForSticker));
                    htVar.P.setBubbleOffset(-AndroidUtilities.dp(105.0f));
                    htVar.P.setMiniBubblesOffset(-AndroidUtilities.dp(14.0f));
                    FrameLayout frameLayout2 = new FrameLayout(htVar.z.getContext());
                    htVar.Q = frameLayout2;
                    frameLayout2.addView(htVar.P, org.telegram.ui.Components.kb1.h(-2, 116.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                    htVar.z.addView(htVar.Q, org.telegram.ui.Components.kb1.h(-2, -2.0f, 1, 0.0f, 100.0f, 0.0f, 0.0f));
                }
                htVar.P.setSelectedEmojis(htVar.o);
                htVar.P.setDelegate(new vs(htVar));
                htVar.P.p(null, null, false);
                htVar.Q.setScaleY(0.6f);
                htVar.Q.setScaleX(0.6f);
                htVar.Q.setAlpha(0.0f);
                AndroidUtilities.runOnUIThread(new us(htVar, 2), 10L);
                htVar.K = true;
                pVar28 = htVar.z;
                pVar28.invalidate();
            } else {
                int i35 = 0;
                i11 = htVar.V;
                if (i11 != 0) {
                    i12 = htVar.V;
                    if (i12 == 2) {
                        ftVar8 = htVar.l;
                        if (ftVar8 != null) {
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = new ArrayList();
                            ftVar9 = htVar.l;
                            i17 = htVar.V;
                            if (ftVar9.l(i17)) {
                                arrayList5.add(LocaleController.getString(R.string.SendEmojiPreview));
                                d3.r(R.drawable.msg_send, arrayList7, arrayList6, 0);
                            }
                            ftVar10 = htVar.l;
                            document5 = htVar.W;
                            Boolean P = ftVar10.P(document5);
                            if (P != null) {
                                if (P.booleanValue()) {
                                    arrayList5.add(LocaleController.getString(R.string.SetAsEmojiStatus));
                                    d3.r(R.drawable.msg_smile_status, arrayList7, arrayList6, 1);
                                } else {
                                    arrayList5.add(LocaleController.getString(R.string.RemoveStatus));
                                    d3.r(R.drawable.msg_smile_status, arrayList7, arrayList6, 2);
                                }
                            }
                            ftVar11 = htVar.l;
                            document6 = htVar.W;
                            if (ftVar11.D(document6)) {
                                arrayList5.add(LocaleController.getString(R.string.CopyEmojiPreview));
                                d3.r(R.drawable.msg_copy, arrayList7, arrayList6, 3);
                            }
                            ftVar12 = htVar.l;
                            document7 = htVar.W;
                            if (ftVar12.M(document7)) {
                                arrayList5.add(LocaleController.getString(R.string.RemoveFromRecent));
                                d3.r(R.drawable.msg_delete, arrayList7, arrayList6, 4);
                            }
                            i18 = htVar.r;
                            MediaDataController mediaDataController = MediaDataController.getInstance(i18);
                            document8 = htVar.W;
                            boolean isStickerInFavorites = mediaDataController.isStickerInFavorites(document8);
                            document9 = htVar.W;
                            if (!MessageObject.isAnimatedEmoji(document9)) {
                                document10 = htVar.W;
                                if (!MessageObject.isMaskDocument(document10)) {
                                    if (!isStickerInFavorites) {
                                        i19 = htVar.r;
                                        if (MediaDataController.getInstance(i19).canAddStickerToFavorites()) {
                                            document11 = htVar.W;
                                        }
                                    }
                                    arrayList5.add(LocaleController.getString(isStickerInFavorites ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                                    d3.r(isStickerInFavorites ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList7, arrayList6, 5);
                                }
                            }
                            if (arrayList5.isEmpty()) {
                                return;
                            }
                            htVar.K = true;
                            pVar8 = htVar.z;
                            pVar8.invalidate();
                            int[] iArr = new int[arrayList7.size()];
                            for (int i36 = 0; i36 < arrayList7.size(); i36++) {
                                iArr[i36] = ((Integer) arrayList7.get(i36)).intValue();
                            }
                            org.telegram.ui.Components.qc0 qc0Var = new org.telegram.ui.Components.qc0(this, arrayList6, isStickerInFavorites);
                            boolean f19 = ht.f(htVar, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                            int i37 = 0;
                            while (i37 < arrayList5.size()) {
                                boolean z12 = !f19 && i37 == 0;
                                boolean z13 = i37 == arrayList5.size() + (-1);
                                int intValue = ((Integer) arrayList7.get(i37)).intValue();
                                CharSequence charSequence = (CharSequence) arrayList5.get(i37);
                                u6Var2 = htVar.c0;
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                                org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(z12, z13, actionBarPopupWindow$ActionBarPopupWindowLayout3, intValue, charSequence, false, u6Var2);
                                if (((Integer) arrayList6.get(i37)).intValue() == 4) {
                                    c12.c(org.telegram.ui.ActionBar.y6.q7, org.telegram.ui.ActionBar.y6.p7);
                                }
                                c12.setTag(Integer.valueOf(i37));
                                c12.setOnClickListener(qc0Var);
                                i37++;
                                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                            bt btVar = new bt(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            htVar.k = btVar;
                            btVar.e = true;
                            btVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
                            btVar.g = true;
                            btVar.setOutsideTouchable(true);
                            htVar.k.setClippingEnabled(true);
                            htVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                            htVar.k.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            htVar.k.setInputMethodMode(2);
                            htVar.k.getContentView().setFocusableInTouchMode(true);
                            bVar4 = htVar.q;
                            int i38 = bVar4.d;
                            bVar5 = htVar.q;
                            int i39 = i38 + bVar5.b;
                            bVar6 = htVar.q;
                            int i40 = bVar6.b;
                            pVar9 = htVar.z;
                            int width = pVar9.getWidth();
                            pVar10 = htVar.z;
                            int min4 = Math.min(width, pVar10.getHeight() - i39) - AndroidUtilities.dp(40.0f);
                            f13 = htVar.e;
                            int i41 = min4 / 2;
                            int i42 = i40 + i41;
                            int dp2 = htVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                            pVar11 = htVar.z;
                            float max = (int) (f13 + Math.max(i42 + dp2, ((pVar11.getHeight() - i39) - htVar.I) / 2) + i41);
                            float dp3 = AndroidUtilities.dp(24.0f);
                            f14 = htVar.e;
                            int i43 = (int) ((dp3 - f14) + max);
                            org.telegram.ui.ActionBar.o1 o1Var = htVar.k;
                            pVar12 = htVar.z;
                            pVar13 = htVar.z;
                            o1Var.showAtLocation(pVar12, 0, (int) ((pVar13.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i43);
                            org.telegram.ui.ActionBar.o1.i(actionBarPopupWindow$ActionBarPopupWindowLayout);
                            try {
                                pVar14 = htVar.z;
                                pVar14.performHapticFeedback(0);
                            } catch (Exception unused3) {
                            }
                            f15 = htVar.e;
                            if (f15 != 0.0f) {
                                f16 = htVar.e;
                                htVar.f = f16;
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                final int i44 = 1;
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.xs
                                    public final /* synthetic */ dt b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        switch (i44) {
                                            case 0:
                                                ht htVar2 = this.b.a;
                                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                htVar2.g = floatValue;
                                                float f192 = htVar2.f;
                                                htVar2.e = c3.h0.z(0.0f, f192, floatValue, f192);
                                                htVar2.z.invalidate();
                                                break;
                                            case 1:
                                                ht htVar3 = this.b.a;
                                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                htVar3.g = floatValue2;
                                                float f20 = htVar3.f;
                                                htVar3.e = c3.h0.z(0.0f, f20, floatValue2, f20);
                                                htVar3.z.invalidate();
                                                break;
                                            default:
                                                ht htVar4 = this.b.a;
                                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                htVar4.g = floatValue3;
                                                float f21 = htVar4.f;
                                                htVar4.e = c3.h0.z(0.0f, f21, floatValue3, f21);
                                                htVar4.z.invalidate();
                                                break;
                                        }
                                    }
                                });
                                ofFloat2.setDuration(350L);
                                ofFloat2.setInterpolator(org.telegram.ui.Components.ds.f);
                                ofFloat2.start();
                            }
                            i15 = 0;
                            i28 = i15;
                            while (i28 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i28);
                                if (childAt instanceof org.telegram.ui.ActionBar.g1) {
                                    ((org.telegram.ui.ActionBar.g1) childAt).n(i28 == 0 ? 1 : i15, i28 == actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() + (-1) ? 1 : i15);
                                }
                                i28++;
                            }
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                    ftVar = htVar.l;
                    if (ftVar != null) {
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        ftVar2 = htVar.l;
                        i13 = htVar.V;
                        if (ftVar2.l(i13)) {
                            ftVar7 = htVar.l;
                            if (!ftVar7.c()) {
                                arrayList8.add(LocaleController.getString(R.string.SendGifPreview));
                                d3.r(R.drawable.msg_send, arrayList10, arrayList9, 0);
                            }
                        }
                        ftVar3 = htVar.l;
                        i14 = htVar.V;
                        if (ftVar3.l(i14)) {
                            ftVar6 = htVar.l;
                            if (!ftVar6.c()) {
                                arrayList8.add(LocaleController.getString(R.string.SendWithoutSound));
                                d3.r(R.drawable.input_notify_off, arrayList10, arrayList9, 4);
                            }
                        }
                        ftVar4 = htVar.l;
                        if (ftVar4.b()) {
                            arrayList8.add(LocaleController.getString(R.string.Schedule));
                            d3.r(R.drawable.msg_autodelete, arrayList10, arrayList9, 3);
                        }
                        document = htVar.W;
                        if (document != null) {
                            ftVar5 = htVar.l;
                            document4 = htVar.W;
                            if (ftVar5.e(document4)) {
                                arrayList8.add(LocaleController.getString(R.string.AddACaption));
                                d3.n(R.drawable.outline_caption_24, 11, arrayList10, arrayList9);
                            }
                        }
                        document2 = htVar.W;
                        if (document2 != null) {
                            i16 = htVar.r;
                            MediaDataController mediaDataController2 = MediaDataController.getInstance(i16);
                            document3 = htVar.W;
                            z10 = mediaDataController2.hasRecentGif(document3);
                            if (z10) {
                                arrayList8.add(LocaleController.formatString("Delete", R.string.Delete, new Object[0]));
                                d3.r(R.drawable.msg_delete, arrayList10, arrayList9, 1);
                            } else {
                                arrayList8.add(LocaleController.formatString("SaveToGIFs", R.string.SaveToGIFs, new Object[0]));
                                d3.r(R.drawable.msg_gif_add, arrayList10, arrayList9, 2);
                            }
                        } else {
                            z10 = false;
                        }
                        if (arrayList8.isEmpty()) {
                            return;
                        }
                        htVar.K = true;
                        pVar = htVar.z;
                        pVar.invalidate();
                        int[] iArr2 = new int[arrayList10.size()];
                        for (int i45 = 0; i45 < arrayList10.size(); i45++) {
                            iArr2[i45] = ((Integer) arrayList10.get(i45)).intValue();
                        }
                        org.telegram.ui.Components.l51 l51Var = new org.telegram.ui.Components.l51(9, this, arrayList9);
                        for (int i46 = 0; i46 < arrayList8.size(); i46++) {
                            int intValue2 = ((Integer) arrayList10.get(i46)).intValue();
                            CharSequence charSequence2 = (CharSequence) arrayList8.get(i46);
                            u6Var = htVar.c0;
                            org.telegram.ui.ActionBar.g1 c13 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, intValue2, charSequence2, false, u6Var);
                            c13.setTag(Integer.valueOf(i46));
                            c13.setOnClickListener(l51Var);
                            if (z10 && i46 == arrayList8.size() - 1) {
                                c13.c(org.telegram.ui.ActionBar.y6.q7, org.telegram.ui.ActionBar.y6.p7);
                            }
                        }
                        ct ctVar = new ct(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                        htVar.k = ctVar;
                        ctVar.e = true;
                        ctVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
                        ctVar.g = true;
                        ctVar.setOutsideTouchable(true);
                        htVar.k.setClippingEnabled(true);
                        htVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                        htVar.k.setFocusable(true);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                        htVar.k.setInputMethodMode(2);
                        htVar.k.getContentView().setFocusableInTouchMode(true);
                        bVar = htVar.q;
                        int i47 = bVar.d;
                        bVar2 = htVar.q;
                        int i48 = i47 + bVar2.b;
                        bVar3 = htVar.q;
                        int i49 = bVar3.b;
                        pVar2 = htVar.z;
                        int width2 = pVar2.getWidth();
                        pVar3 = htVar.z;
                        int min5 = Math.min(width2, pVar3.getHeight() - i48) - AndroidUtilities.dp(40.0f);
                        f7 = htVar.e;
                        int i50 = min5 / 2;
                        int i51 = i49 + i50;
                        int dp4 = htVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                        pVar4 = htVar.z;
                        float max2 = (int) (f7 + Math.max(i51 + dp4, ((pVar4.getHeight() - i48) - htVar.I) / 2) + i50);
                        float dp5 = AndroidUtilities.dp(24.0f);
                        f10 = htVar.e;
                        int i52 = (int) ((dp5 - f10) + max2);
                        org.telegram.ui.ActionBar.o1 o1Var2 = htVar.k;
                        pVar5 = htVar.z;
                        pVar6 = htVar.z;
                        i15 = 0;
                        o1Var2.showAtLocation(pVar5, 0, (int) ((pVar6.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i52);
                        try {
                            pVar7 = htVar.z;
                            pVar7.performHapticFeedback(0);
                        } catch (Exception unused4) {
                        }
                        f11 = htVar.e;
                        if (f11 != 0.0f) {
                            f12 = htVar.e;
                            htVar.f = f12;
                            final int i53 = 2;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.xs
                                public final /* synthetic */ dt b;

                                {
                                    this.b = this;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (i53) {
                                        case 0:
                                            ht htVar2 = this.b.a;
                                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            htVar2.g = floatValue;
                                            float f192 = htVar2.f;
                                            htVar2.e = c3.h0.z(0.0f, f192, floatValue, f192);
                                            htVar2.z.invalidate();
                                            break;
                                        case 1:
                                            ht htVar3 = this.b.a;
                                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            htVar3.g = floatValue2;
                                            float f20 = htVar3.f;
                                            htVar3.e = c3.h0.z(0.0f, f20, floatValue2, f20);
                                            htVar3.z.invalidate();
                                            break;
                                        default:
                                            ht htVar4 = this.b.a;
                                            float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            htVar4.g = floatValue3;
                                            float f21 = htVar4.f;
                                            htVar4.e = c3.h0.z(0.0f, f21, floatValue3, f21);
                                            htVar4.z.invalidate();
                                            break;
                                    }
                                }
                            });
                            ofFloat3.setDuration(350L);
                            ofFloat3.setInterpolator(org.telegram.ui.Components.ds.f);
                            ofFloat3.start();
                        }
                        i28 = i15;
                        while (i28 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                        }
                    }
                    i15 = 0;
                    i28 = i15;
                    while (i28 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                    }
                }
                document12 = htVar.W;
                if (MessageObject.isPremiumSticker(document12)) {
                    i27 = htVar.r;
                    if (!AccountInstance.getInstance(i27).getUserConfig().isPremium()) {
                        if (htVar.O == null) {
                            gg1 gg1Var = new gg1(htVar.z.getContext(), htVar.c0);
                            htVar.O = gg1Var;
                            htVar.z.addView(gg1Var, org.telegram.ui.Components.kb1.g(-1.0f, -1));
                            htVar.O.setOnClickListener(new ws(htVar, i35));
                            z11 = true;
                            htVar.O.a.v.setOnClickListener(new ws(htVar, 1 == true ? 1 : 0));
                        } else {
                            z11 = true;
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(htVar.O, false, 1.0f, false);
                        AndroidUtilities.updateViewVisibilityAnimated(htVar.O, z11);
                        htVar.O.setTranslationY(0.0f);
                        htVar.K = true;
                        pVar26 = htVar.z;
                        pVar26.invalidate();
                        try {
                            pVar27 = htVar.z;
                            pVar27.performHapticFeedback(0);
                            return;
                        } catch (Exception unused5) {
                            return;
                        }
                    }
                }
                i20 = htVar.r;
                MediaDataController mediaDataController3 = MediaDataController.getInstance(i20);
                document13 = htVar.W;
                boolean isStickerInFavorites2 = mediaDataController3.isStickerInFavorites(document13);
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                ftVar13 = htVar.l;
                if (ftVar13 != null) {
                    ftVar20 = htVar.l;
                    i25 = htVar.V;
                    if (ftVar20.l(i25)) {
                        ftVar25 = htVar.l;
                        if (!ftVar25.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendStickerPreview));
                            d3.r(R.drawable.msg_send, arrayList13, arrayList12, 0);
                        }
                    }
                    ftVar21 = htVar.l;
                    i26 = htVar.V;
                    if (ftVar21.l(i26)) {
                        ftVar24 = htVar.l;
                        if (!ftVar24.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendWithoutSound));
                            d3.n(R.drawable.input_notify_off, 6, arrayList13, arrayList12);
                        }
                    }
                    ftVar22 = htVar.l;
                    if (ftVar22.b()) {
                        arrayList11.add(LocaleController.getString(R.string.Schedule));
                        d3.r(R.drawable.msg_autodelete, arrayList13, arrayList12, 3);
                    }
                    ftVar23 = htVar.l;
                    if (ftVar23.f()) {
                        arrayList11.add(LocaleController.getString(R.string.ImportStickersRemoveMenu));
                        d3.r(R.drawable.msg_delete, arrayList13, arrayList12, 5);
                    }
                }
                document14 = htVar.W;
                if (!MessageObject.isMaskDocument(document14)) {
                    if (!isStickerInFavorites2) {
                        i24 = htVar.r;
                        if (MediaDataController.getInstance(i24).canAddStickerToFavorites()) {
                            document16 = htVar.W;
                        }
                    }
                    arrayList11.add(LocaleController.getString(isStickerInFavorites2 ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                    d3.r(isStickerInFavorites2 ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList13, arrayList12, 2);
                }
                ftVar14 = htVar.l;
                if (ftVar14 != null && (inputStickerSet = htVar.a0) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                    ftVar19 = htVar.l;
                    if (ftVar19.Q()) {
                        arrayList11.add(LocaleController.formatString(R.string.ViewPackPreview, new Object[0]));
                        d3.r(R.drawable.msg_media, arrayList13, arrayList12, 1);
                    }
                }
                if (htVar.p) {
                    arrayList11.add(LocaleController.getString(R.string.DeleteFromRecent));
                    d3.r(R.drawable.msg_delete, arrayList13, arrayList12, 4);
                }
                if (htVar.a0 != null) {
                    document15 = htVar.W;
                    if (document15 != null) {
                        i23 = htVar.r;
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i23).getStickerSet(htVar.a0, true);
                        if (stickerSet != null) {
                            ftVar17 = htVar.l;
                            if (ftVar17 != null) {
                                ftVar18 = htVar.l;
                                if (ftVar18.C()) {
                                    TLRPC.StickerSet stickerSet2 = stickerSet.set;
                                    if (!stickerSet2.emojis && !stickerSet2.masks) {
                                        arrayList11.add(LocaleController.getString(R.string.EditSticker));
                                        d3.n(R.drawable.msg_edit, 7, arrayList13, arrayList12);
                                    }
                                }
                            }
                        }
                        if (stickerSet != null && stickerSet.set.creator) {
                            ftVar15 = htVar.l;
                            if (ftVar15 != null) {
                                ftVar16 = htVar.l;
                                unused = htVar.W;
                                if (ftVar16.H()) {
                                    arrayList11.add(LocaleController.getString(R.string.DeleteSticker));
                                    d3.n(R.drawable.msg_delete, 8, arrayList13, arrayList12);
                                }
                            }
                        }
                    }
                }
                if (arrayList11.isEmpty()) {
                    return;
                }
                htVar.K = true;
                pVar15 = htVar.z;
                pVar15.invalidate();
                zs zsVar = new zs(this, arrayList12, isStickerInFavorites2);
                ht.f(htVar, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                for (int i54 = 0; i54 < arrayList11.size(); i54++) {
                    int intValue3 = ((Integer) arrayList13.get(i54)).intValue();
                    CharSequence charSequence3 = (CharSequence) arrayList11.get(i54);
                    u6Var3 = htVar.c0;
                    org.telegram.ui.ActionBar.g1 c14 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, intValue3, charSequence3, false, u6Var3);
                    c14.setTag(Integer.valueOf(i54));
                    c14.setOnClickListener(zsVar);
                    if (((Integer) arrayList12.get(i54)).intValue() == 8) {
                        int i55 = org.telegram.ui.ActionBar.y6.q7;
                        c14.c(i55, i55);
                        c14.h(0.1f, i55);
                    }
                }
                at atVar = new at(this, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                htVar.k = atVar;
                atVar.e = true;
                atVar.c = 100;
                atVar.g = true;
                atVar.setOutsideTouchable(true);
                htVar.k.setClippingEnabled(true);
                htVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                htVar.k.setFocusable(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                htVar.k.setInputMethodMode(2);
                htVar.k.getContentView().setFocusableInTouchMode(true);
                bVar7 = htVar.q;
                int i56 = bVar7.d;
                bVar8 = htVar.q;
                int i57 = i56 + bVar8.b;
                bVar9 = htVar.q;
                int i58 = bVar9.b;
                i21 = htVar.V;
                if (i21 == 1) {
                    pVar24 = htVar.z;
                    int width3 = pVar24.getWidth();
                    pVar25 = htVar.z;
                    i22 = Math.min(width3, pVar25.getHeight() - i57) - AndroidUtilities.dp(40.0f);
                } else {
                    if (htVar.S) {
                        pVar18 = htVar.z;
                        int width4 = pVar18.getWidth();
                        pVar19 = htVar.z;
                        min = Math.min(width4, pVar19.getHeight() - i57) - AndroidUtilities.dpf2(40.0f);
                    } else {
                        pVar16 = htVar.z;
                        int width5 = pVar16.getWidth();
                        pVar17 = htVar.z;
                        min = Math.min(width5, pVar17.getHeight() - i57) / 1.8f;
                    }
                    i22 = (int) min;
                }
                f17 = htVar.e;
                int i59 = i22 / 2;
                int i60 = i58 + i59;
                int dp6 = htVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                pVar20 = htVar.z;
                int dp7 = AndroidUtilities.dp(24.0f) + ((int) (f17 + Math.max(i60 + dp6, ((pVar20.getHeight() - i57) - htVar.I) / 2) + i59));
                if (htVar.S) {
                    dp7 += AndroidUtilities.dp(24.0f);
                }
                org.telegram.ui.ActionBar.o1 o1Var3 = htVar.k;
                pVar21 = htVar.z;
                pVar22 = htVar.z;
                o1Var3.showAtLocation(pVar21, 0, (int) ((pVar22.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth()) / 2.0f), dp7);
                try {
                    pVar23 = htVar.z;
                    pVar23.performHapticFeedback(0);
                } catch (Exception unused6) {
                }
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            i15 = 0;
            i28 = i15;
            while (i28 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
            }
        }
        i10 = 1;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout22 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, htVar.z.getContext(), htVar.c0);
        org.telegram.ui.ActionBar.u6 u6Var42 = null;
        eh.d c102 = bVar10.c(actionBarPopupWindow$ActionBarPopupWindowLayout22, null, true);
        c102.v(gh.c.k(htVar.c0));
        org.telegram.messenger.wh.s(c102, AndroidUtilities.dp(12.0f), 8.0f);
        c102.x.e = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout22.setBackground(c102);
        int i312 = 6;
        int i322 = 7;
        if (htVar.V != 3) {
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout22;
        i15 = 0;
        i28 = i15;
        while (i28 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
        }
    }
}
