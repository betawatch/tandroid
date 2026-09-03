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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class nt implements Runnable {
    public final /* synthetic */ rt a;

    public nt(rt rtVar) {
        this.a = rtVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x0657, code lost:
    
        if (org.telegram.messenger.MessageObject.isStickerHasSet(r0) != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0987, code lost:
    
        if (org.telegram.messenger.MessageObject.isStickerHasSet(r8) != false) goto L233;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0db7  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        int i11;
        int i12;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        pt ptVar;
        pt ptVar2;
        int i13;
        pt ptVar3;
        int i14;
        pt ptVar4;
        TLRPC.Document document;
        TLRPC.Document document2;
        boolean z4;
        ah.e eVar;
        i0.b bVar;
        i0.b bVar2;
        i0.b bVar3;
        ah.e eVar2;
        ah.e eVar3;
        float f10;
        ah.e eVar4;
        float f11;
        ah.e eVar5;
        ah.e eVar6;
        float f12;
        float f13;
        ah.e eVar7;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i15;
        TLRPC.Document document3;
        pt ptVar5;
        TLRPC.Document document4;
        pt ptVar6;
        pt ptVar7;
        pt ptVar8;
        pt ptVar9;
        int i16;
        pt ptVar10;
        TLRPC.Document document5;
        pt ptVar11;
        TLRPC.Document document6;
        pt ptVar12;
        TLRPC.Document document7;
        int i17;
        TLRPC.Document document8;
        TLRPC.Document document9;
        ah.e eVar8;
        i0.b bVar4;
        i0.b bVar5;
        i0.b bVar6;
        ah.e eVar9;
        ah.e eVar10;
        float f14;
        ah.e eVar11;
        float f15;
        ah.e eVar12;
        ah.e eVar13;
        float f16;
        float f17;
        ah.e eVar14;
        org.telegram.ui.ActionBar.f6 f6Var2;
        TLRPC.Document document10;
        int i18;
        TLRPC.Document document11;
        TLRPC.Document document12;
        int i19;
        TLRPC.Document document13;
        pt ptVar13;
        TLRPC.Document document14;
        pt ptVar14;
        ah.e eVar15;
        i0.b bVar7;
        i0.b bVar8;
        i0.b bVar9;
        int i20;
        ah.e eVar16;
        ah.e eVar17;
        float min;
        int i21;
        ah.e eVar18;
        ah.e eVar19;
        float f18;
        ah.e eVar20;
        ah.e eVar21;
        ah.e eVar22;
        ah.e eVar23;
        ah.e eVar24;
        ah.e eVar25;
        org.telegram.ui.ActionBar.f6 f6Var3;
        TLRPC.Document document15;
        int i22;
        pt ptVar15;
        pt ptVar16;
        pt ptVar17;
        pt ptVar18;
        TLRPC.InputStickerSet inputStickerSet;
        pt ptVar19;
        int i23;
        TLRPC.Document document16;
        pt ptVar20;
        int i24;
        pt ptVar21;
        int i25;
        pt ptVar22;
        pt ptVar23;
        pt ptVar24;
        pt ptVar25;
        int i26;
        ah.e eVar26;
        ah.e eVar27;
        int i27;
        rb1 rb1Var;
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        ah.e eVar28;
        org.telegram.ui.Components.p70 d;
        TLRPC.Document unused;
        rt rtVar = this.a;
        ng.a aVar = rtVar.t;
        if (rtVar.w == null || rtVar.m) {
            return;
        }
        rtVar.R = true;
        pt ptVar26 = rtVar.l;
        final int i28 = 0;
        if (ptVar26 != null && (d = ptVar26.d(rtVar.z)) != null) {
            d.Q(aVar, rg.b.k(rtVar.c0), true);
            d.t = false;
            d.Y();
            d.p = new bj(this, 16);
            ViewGroup viewGroup = d.A;
            ht htVar = new ht(this, viewGroup);
            rtVar.k = htVar;
            htVar.e = true;
            htVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
            htVar.g = true;
            htVar.setOutsideTouchable(true);
            rtVar.k.setClippingEnabled(true);
            rtVar.k.setAnimationStyle(R.style.PopupContextAnimation);
            rtVar.k.setFocusable(true);
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            rtVar.k.setInputMethodMode(2);
            rtVar.k.getContentView().setFocusableInTouchMode(true);
            i0.b bVar10 = rtVar.q;
            int min2 = (Math.min(rtVar.z.getWidth(), rtVar.z.getHeight() - (bVar10.d + bVar10.b)) - AndroidUtilities.dp(40.0f)) / 2;
            int dp = (int) ((AndroidUtilities.dp(24.0f) - rtVar.e) + ((int) (rtVar.e + Math.max(r2 + min2 + (rtVar.G != null ? AndroidUtilities.dp(40.0f) : 0), ((rtVar.z.getHeight() - r3) - rtVar.I) / 2) + min2)));
            rtVar.k.showAtLocation(rtVar.z, 0, (int) ((r4.getMeasuredWidth() - viewGroup.getMeasuredWidth()) / 2.0f), dp);
            try {
                rtVar.z.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            float f19 = rtVar.e;
            if (f19 != 0.0f) {
                rtVar.f = f19;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.gt
                    public final /* synthetic */ nt b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i28) {
                            case 0:
                                rt rtVar2 = this.b.a;
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                rtVar2.g = floatValue;
                                float f20 = rtVar2.f;
                                rtVar2.e = e2.c.w(0.0f, f20, floatValue, f20);
                                rtVar2.z.invalidate();
                                break;
                            case 1:
                                rt rtVar3 = this.b.a;
                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                rtVar3.g = floatValue2;
                                float f21 = rtVar3.f;
                                rtVar3.e = e2.c.w(0.0f, f21, floatValue2, f21);
                                rtVar3.z.invalidate();
                                break;
                            default:
                                rt rtVar4 = this.b.a;
                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                rtVar4.g = floatValue3;
                                float f22 = rtVar4.f;
                                rtVar4.e = e2.c.w(0.0f, f22, floatValue3, f22);
                                rtVar4.z.invalidate();
                                break;
                        }
                    }
                });
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(org.telegram.ui.Components.mr.f);
                ofFloat.start();
            }
            rtVar.K = true;
            return;
        }
        if (rtVar.V != 3) {
            pt ptVar27 = rtVar.l;
            if (ptVar27 != null) {
                TLRPC.TL_messageMediaPoll e = ptVar27.e();
                TLRPC.PollAnswer h = rtVar.l.h();
                if (e != null && e.poll != null && h != null) {
                    TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(e, h.option);
                    if (pollResult != null && pollResult.voters > 0) {
                        MessageObject.canShowVotersList(e);
                    }
                }
            }
            i10 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, rtVar.z.getContext(), rtVar.c0);
            org.telegram.ui.ActionBar.f6 f6Var4 = null;
            pg.b c3 = aVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout3, null, true);
            c3.n(rg.b.k(rtVar.c0));
            c3.p(AndroidUtilities.dp(12.0f));
            c3.o(AndroidUtilities.dp(8.0f));
            c3.h.e = true;
            actionBarPopupWindow$ActionBarPopupWindowLayout3.setBackground(c3);
            if (rtVar.V != 3) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (rtVar.T == null) {
                    pt ptVar28 = rtVar.l;
                    if (ptVar28 == null || !ptVar28.B()) {
                        if (rtVar.l.x()) {
                            arrayList.add(LocaleController.getString(R.string.SendStickerPreview));
                            b.j(R.drawable.msg_send, arrayList3, arrayList2, 0);
                        }
                        arrayList.add(LocaleController.getString(R.string.AddToFavorites));
                        b.j(R.drawable.msg_fave, arrayList3, arrayList2, 1);
                    } else {
                        arrayList.add(LocaleController.getString(R.string.SetIntroSticker));
                        b.j(R.drawable.menu_sticker_add, arrayList3, arrayList2, 0);
                    }
                }
                pt ptVar29 = rtVar.l;
                if (ptVar29 == null || !ptVar29.B()) {
                    pt ptVar30 = rtVar.l;
                    arrayList.add(LocaleController.getString((ptVar30 == null || !ptVar30.J()) ? R.string.AddToStickerPack : R.string.StickersReplaceSticker));
                    pt ptVar31 = rtVar.l;
                    b.j((ptVar31 == null || !ptVar31.J()) ? R.drawable.menu_sticker_add : R.drawable.msg_replace, arrayList3, arrayList2, 2);
                }
                int i29 = 7;
                int i30 = 6;
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, rtVar.w, rtVar.c0, true, false);
                g1Var.setItemHeight(44);
                g1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                g1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                FrameLayout frameLayout = new FrameLayout(rtVar.z.getContext());
                LinearLayout linearLayout = new LinearLayout(rtVar.z.getContext());
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, rtVar.c0));
                linearLayout.setOrientation(1);
                if (rtVar.w == null) {
                    rb1Var = null;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new TLRPC.TL_stickerSetNoCovered());
                    TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = new TLRPC.TL_messages_getMyStickers();
                    tL_messages_getMyStickers.limit = 100;
                    ConnectionsManager.getInstance(rtVar.r).sendRequest(tL_messages_getMyStickers, new da(rtVar, arrayList4, tL_messages_getMyStickers, i29));
                    rb1Var = new rb1(rtVar.w, i30, f6Var4);
                    rb1Var.setLayoutManager(new f2.i0());
                    rb1Var.i(new gg.e2(arrayList4, 4));
                    rb1Var.setAdapter(new ot(rtVar, arrayList4));
                }
                rb1Var.setOnItemClickListener(new j(this, 5));
                frameLayout.addView(g1Var);
                linearLayout.addView(frameLayout);
                linearLayout.addView(new org.telegram.ui.ActionBar.m1(rtVar.z.getContext(), rtVar.c0), k7.b6.n(-1, 8));
                nh.c0 c0Var = new nh.c0(this, arrayList2, rb1Var, linearLayout, actionBarPopupWindow$ActionBarPopupWindowLayout3, 12);
                for (int i31 = 0; i31 < arrayList.size(); i31++) {
                    org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, ((Integer) arrayList3.get(i31)).intValue(), (CharSequence) arrayList.get(i31), false, rtVar.c0);
                    c10.setTag(Integer.valueOf(i31));
                    c10.setOnClickListener(c0Var);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                linearLayout.addView(rb1Var, new LinearLayout.LayoutParams(actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() - AndroidUtilities.dp(16.0f), (int) (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() * 1.5f)));
                actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                frameLayout.setOnClickListener(new pf(actionBarPopupWindow$ActionBarPopupWindowLayout, 2));
                i0.b bVar11 = rtVar.q;
                int i32 = bVar11.d + bVar11.b;
                int min3 = ((int) (Math.min(rtVar.z.getWidth(), rtVar.z.getHeight() - i32) / 1.8f)) / 2;
                rtVar.z.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, k7.b6.d(-2, -2.0f, 49, 0.0f, (AndroidUtilities.dp(84.0f) + ((int) ((rtVar.e + Math.max(r0 + min3, ((rtVar.z.getHeight() - i32) - rtVar.I) / 2)) + min3))) / AndroidUtilities.density, 0.0f, 0.0f));
                rtVar.L = actionBarPopupWindow$ActionBarPopupWindowLayout;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(-AndroidUtilities.dp(12.0f));
                rtVar.L.setAlpha(0.0f);
                view = rtVar.L;
                view.setScaleX(0.8f);
                view2 = rtVar.L;
                view2.setScaleY(0.8f);
                view3 = rtVar.L;
                view3.setPivotY(0.0f);
                view4 = rtVar.L;
                view5 = rtVar.L;
                view4.setPivotX(view5.getMeasuredWidth() / 2.0f);
                view6 = rtVar.L;
                view6.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.mr.h).start();
                if (rtVar.P == null) {
                    org.telegram.ui.Components.rb rbVar = new org.telegram.ui.Components.rb(rtVar, rtVar.z.getContext(), UserConfig.selectedAccount, rtVar.c0);
                    rtVar.P = rbVar;
                    rbVar.K0 = true;
                    rbVar.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                    rtVar.P.setClipChildren(false);
                    rtVar.P.setClipToPadding(false);
                    rtVar.P.setVisibility(0);
                    rtVar.P.setHint(LocaleController.getString(R.string.StickersSetEmojiForSticker));
                    rtVar.P.setBubbleOffset(-AndroidUtilities.dp(105.0f));
                    rtVar.P.setMiniBubblesOffset(-AndroidUtilities.dp(14.0f));
                    FrameLayout frameLayout2 = new FrameLayout(rtVar.z.getContext());
                    rtVar.Q = frameLayout2;
                    frameLayout2.addView(rtVar.P, k7.b6.d(-2, 116.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                    rtVar.z.addView(rtVar.Q, k7.b6.d(-2, -2.0f, 1, 0.0f, 100.0f, 0.0f, 0.0f));
                }
                rtVar.P.setSelectedEmojis(rtVar.o);
                rtVar.P.setDelegate(new dt(rtVar));
                rtVar.P.p(null, null, false);
                rtVar.Q.setScaleY(0.6f);
                rtVar.Q.setScaleX(0.6f);
                rtVar.Q.setAlpha(0.0f);
                AndroidUtilities.runOnUIThread(new ct(rtVar, 2), 10L);
                rtVar.K = true;
                eVar28 = rtVar.z;
                eVar28.invalidate();
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                final int i33 = 1;
                int i34 = 0;
                i11 = rtVar.V;
                if (i11 != 0) {
                    i12 = rtVar.V;
                    if (i12 == 2) {
                        ptVar8 = rtVar.l;
                        if (ptVar8 != null) {
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = new ArrayList();
                            ptVar9 = rtVar.l;
                            i16 = rtVar.V;
                            if (ptVar9.l(i16)) {
                                arrayList5.add(LocaleController.getString(R.string.SendEmojiPreview));
                                b.j(R.drawable.msg_send, arrayList7, arrayList6, 0);
                            }
                            ptVar10 = rtVar.l;
                            document5 = rtVar.W;
                            Boolean P = ptVar10.P(document5);
                            if (P != null) {
                                if (P.booleanValue()) {
                                    arrayList5.add(LocaleController.getString(R.string.SetAsEmojiStatus));
                                    b.j(R.drawable.msg_smile_status, arrayList7, arrayList6, 1);
                                } else {
                                    arrayList5.add(LocaleController.getString(R.string.RemoveStatus));
                                    b.j(R.drawable.msg_smile_status, arrayList7, arrayList6, 2);
                                }
                            }
                            ptVar11 = rtVar.l;
                            document6 = rtVar.W;
                            if (ptVar11.E(document6)) {
                                arrayList5.add(LocaleController.getString(R.string.CopyEmojiPreview));
                                b.j(R.drawable.msg_copy, arrayList7, arrayList6, 3);
                            }
                            ptVar12 = rtVar.l;
                            document7 = rtVar.W;
                            if (ptVar12.N(document7)) {
                                arrayList5.add(LocaleController.getString(R.string.RemoveFromRecent));
                                b.j(R.drawable.msg_delete, arrayList7, arrayList6, 4);
                            }
                            i17 = rtVar.r;
                            MediaDataController mediaDataController = MediaDataController.getInstance(i17);
                            document8 = rtVar.W;
                            boolean isStickerInFavorites = mediaDataController.isStickerInFavorites(document8);
                            document9 = rtVar.W;
                            if (!MessageObject.isAnimatedEmoji(document9)) {
                                document10 = rtVar.W;
                                if (!MessageObject.isMaskDocument(document10)) {
                                    if (!isStickerInFavorites) {
                                        i18 = rtVar.r;
                                        if (MediaDataController.getInstance(i18).canAddStickerToFavorites()) {
                                            document11 = rtVar.W;
                                        }
                                    }
                                    arrayList5.add(LocaleController.getString(isStickerInFavorites ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                                    b.j(isStickerInFavorites ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList7, arrayList6, 5);
                                }
                            }
                            if (arrayList5.isEmpty()) {
                                return;
                            }
                            rtVar.K = true;
                            eVar8 = rtVar.z;
                            eVar8.invalidate();
                            int[] iArr = new int[arrayList7.size()];
                            for (int i35 = 0; i35 < arrayList7.size(); i35++) {
                                iArr[i35] = ((Integer) arrayList7.get(i35)).intValue();
                            }
                            org.telegram.ui.Components.zb0 zb0Var = new org.telegram.ui.Components.zb0(this, arrayList6, isStickerInFavorites);
                            boolean h9 = rt.h(rtVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            int i36 = 0;
                            while (i36 < arrayList5.size()) {
                                boolean z10 = !h9 && i36 == 0;
                                boolean z11 = i36 == arrayList5.size() + (-1);
                                int intValue = ((Integer) arrayList7.get(i36)).intValue();
                                CharSequence charSequence = (CharSequence) arrayList5.get(i36);
                                f6Var2 = rtVar.c0;
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(z10, z11, actionBarPopupWindow$ActionBarPopupWindowLayout4, intValue, charSequence, false, f6Var2);
                                if (((Integer) arrayList6.get(i36)).intValue() == 4) {
                                    c11.setIconColor(rt.d(rtVar, org.telegram.ui.ActionBar.j6.p7));
                                    c11.setTextColor(rt.d(rtVar, org.telegram.ui.ActionBar.j6.q7));
                                }
                                c11.setTag(Integer.valueOf(i36));
                                c11.setOnClickListener(zb0Var);
                                i36++;
                                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            lt ltVar = new lt(this, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                            rtVar.k = ltVar;
                            ltVar.e = true;
                            ltVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
                            ltVar.g = true;
                            ltVar.setOutsideTouchable(true);
                            rtVar.k.setClippingEnabled(true);
                            rtVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                            rtVar.k.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            rtVar.k.setInputMethodMode(2);
                            rtVar.k.getContentView().setFocusableInTouchMode(true);
                            bVar4 = rtVar.q;
                            int i37 = bVar4.d;
                            bVar5 = rtVar.q;
                            int i38 = i37 + bVar5.b;
                            bVar6 = rtVar.q;
                            int i39 = bVar6.b;
                            eVar9 = rtVar.z;
                            int width = eVar9.getWidth();
                            eVar10 = rtVar.z;
                            int min4 = Math.min(width, eVar10.getHeight() - i38) - AndroidUtilities.dp(40.0f);
                            f14 = rtVar.e;
                            int i40 = min4 / 2;
                            int i41 = i39 + i40;
                            int dp2 = rtVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                            eVar11 = rtVar.z;
                            float max = (int) (f14 + Math.max(i41 + dp2, ((eVar11.getHeight() - i38) - rtVar.I) / 2) + i40);
                            float dp3 = AndroidUtilities.dp(24.0f);
                            f15 = rtVar.e;
                            int i42 = (int) ((dp3 - f15) + max);
                            org.telegram.ui.ActionBar.p1 p1Var = rtVar.k;
                            eVar12 = rtVar.z;
                            eVar13 = rtVar.z;
                            p1Var.showAtLocation(eVar12, 0, (int) ((eVar13.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth()) / 2.0f), i42);
                            org.telegram.ui.ActionBar.p1.i(actionBarPopupWindow$ActionBarPopupWindowLayout2);
                            try {
                                eVar14 = rtVar.z;
                                eVar14.performHapticFeedback(0);
                            } catch (Exception unused3) {
                            }
                            f16 = rtVar.e;
                            if (f16 != 0.0f) {
                                f17 = rtVar.e;
                                rtVar.f = f17;
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.gt
                                    public final /* synthetic */ nt b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        switch (i33) {
                                            case 0:
                                                rt rtVar2 = this.b.a;
                                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                rtVar2.g = floatValue;
                                                float f20 = rtVar2.f;
                                                rtVar2.e = e2.c.w(0.0f, f20, floatValue, f20);
                                                rtVar2.z.invalidate();
                                                break;
                                            case 1:
                                                rt rtVar3 = this.b.a;
                                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                rtVar3.g = floatValue2;
                                                float f21 = rtVar3.f;
                                                rtVar3.e = e2.c.w(0.0f, f21, floatValue2, f21);
                                                rtVar3.z.invalidate();
                                                break;
                                            default:
                                                rt rtVar4 = this.b.a;
                                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                rtVar4.g = floatValue3;
                                                float f22 = rtVar4.f;
                                                rtVar4.e = e2.c.w(0.0f, f22, floatValue3, f22);
                                                rtVar4.z.invalidate();
                                                break;
                                        }
                                    }
                                });
                                ofFloat2.setDuration(350L);
                                ofFloat2.setInterpolator(org.telegram.ui.Components.mr.f);
                                ofFloat2.start();
                            }
                            i27 = 0;
                            while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount()) {
                                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout2.I.getChildAt(i27);
                                if (childAt instanceof org.telegram.ui.ActionBar.g1) {
                                    ((org.telegram.ui.ActionBar.g1) childAt).k(i27 == 0, i27 == actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount() + (-1));
                                }
                                i27++;
                            }
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    ptVar = rtVar.l;
                    if (ptVar != null) {
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        ptVar2 = rtVar.l;
                        i13 = rtVar.V;
                        if (ptVar2.l(i13)) {
                            ptVar7 = rtVar.l;
                            if (!ptVar7.c()) {
                                arrayList8.add(LocaleController.getString(R.string.SendGifPreview));
                                b.j(R.drawable.msg_send, arrayList10, arrayList9, 0);
                            }
                        }
                        ptVar3 = rtVar.l;
                        i14 = rtVar.V;
                        if (ptVar3.l(i14)) {
                            ptVar6 = rtVar.l;
                            if (!ptVar6.c()) {
                                arrayList8.add(LocaleController.getString(R.string.SendWithoutSound));
                                b.j(R.drawable.input_notify_off, arrayList10, arrayList9, 4);
                            }
                        }
                        ptVar4 = rtVar.l;
                        if (ptVar4.b()) {
                            arrayList8.add(LocaleController.getString(R.string.Schedule));
                            b.j(R.drawable.msg_autodelete, arrayList10, arrayList9, 3);
                        }
                        document = rtVar.W;
                        if (document != null) {
                            ptVar5 = rtVar.l;
                            document4 = rtVar.W;
                            if (ptVar5.f(document4)) {
                                arrayList8.add(LocaleController.getString(R.string.AddACaption));
                                b.h(R.drawable.outline_caption_24, 11, arrayList10, arrayList9);
                            }
                        }
                        document2 = rtVar.W;
                        if (document2 != null) {
                            i15 = rtVar.r;
                            MediaDataController mediaDataController2 = MediaDataController.getInstance(i15);
                            document3 = rtVar.W;
                            z4 = mediaDataController2.hasRecentGif(document3);
                            if (z4) {
                                arrayList8.add(LocaleController.formatString("Delete", R.string.Delete, new Object[0]));
                                b.j(R.drawable.msg_delete, arrayList10, arrayList9, 1);
                            } else {
                                arrayList8.add(LocaleController.formatString("SaveToGIFs", R.string.SaveToGIFs, new Object[0]));
                                b.j(R.drawable.msg_gif_add, arrayList10, arrayList9, 2);
                            }
                        } else {
                            z4 = false;
                        }
                        if (arrayList8.isEmpty()) {
                            return;
                        }
                        rtVar.K = true;
                        eVar = rtVar.z;
                        eVar.invalidate();
                        int[] iArr2 = new int[arrayList10.size()];
                        for (int i43 = 0; i43 < arrayList10.size(); i43++) {
                            iArr2[i43] = ((Integer) arrayList10.get(i43)).intValue();
                        }
                        org.telegram.ui.Components.rx0 rx0Var = new org.telegram.ui.Components.rx0(13, this, arrayList9);
                        for (int i44 = 0; i44 < arrayList8.size(); i44++) {
                            int intValue2 = ((Integer) arrayList10.get(i44)).intValue();
                            CharSequence charSequence2 = (CharSequence) arrayList8.get(i44);
                            f6Var = rtVar.c0;
                            org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, intValue2, charSequence2, false, f6Var);
                            c12.setTag(Integer.valueOf(i44));
                            c12.setOnClickListener(rx0Var);
                            if (z4 && i44 == arrayList8.size() - 1) {
                                c12.c(rt.d(rtVar, org.telegram.ui.ActionBar.j6.q7), rt.d(rtVar, org.telegram.ui.ActionBar.j6.p7));
                            }
                        }
                        mt mtVar = new mt(this, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                        rtVar.k = mtVar;
                        mtVar.e = true;
                        mtVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
                        mtVar.g = true;
                        mtVar.setOutsideTouchable(true);
                        rtVar.k.setClippingEnabled(true);
                        rtVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                        rtVar.k.setFocusable(true);
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                        rtVar.k.setInputMethodMode(2);
                        rtVar.k.getContentView().setFocusableInTouchMode(true);
                        bVar = rtVar.q;
                        int i45 = bVar.d;
                        bVar2 = rtVar.q;
                        int i46 = i45 + bVar2.b;
                        bVar3 = rtVar.q;
                        int i47 = bVar3.b;
                        eVar2 = rtVar.z;
                        int width2 = eVar2.getWidth();
                        eVar3 = rtVar.z;
                        int min5 = Math.min(width2, eVar3.getHeight() - i46) - AndroidUtilities.dp(40.0f);
                        f10 = rtVar.e;
                        int i48 = min5 / 2;
                        int i49 = i47 + i48;
                        int dp4 = rtVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                        eVar4 = rtVar.z;
                        float max2 = (int) (f10 + Math.max(i49 + dp4, ((eVar4.getHeight() - i46) - rtVar.I) / 2) + i48);
                        float dp5 = AndroidUtilities.dp(24.0f);
                        f11 = rtVar.e;
                        int i50 = (int) ((dp5 - f11) + max2);
                        org.telegram.ui.ActionBar.p1 p1Var2 = rtVar.k;
                        eVar5 = rtVar.z;
                        eVar6 = rtVar.z;
                        p1Var2.showAtLocation(eVar5, 0, (int) ((eVar6.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth()) / 2.0f), i50);
                        try {
                            eVar7 = rtVar.z;
                            eVar7.performHapticFeedback(0);
                        } catch (Exception unused4) {
                        }
                        f12 = rtVar.e;
                        if (f12 != 0.0f) {
                            f13 = rtVar.e;
                            rtVar.f = f13;
                            final int i51 = 2;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.gt
                                public final /* synthetic */ nt b;

                                {
                                    this.b = this;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (i51) {
                                        case 0:
                                            rt rtVar2 = this.b.a;
                                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            rtVar2.g = floatValue;
                                            float f20 = rtVar2.f;
                                            rtVar2.e = e2.c.w(0.0f, f20, floatValue, f20);
                                            rtVar2.z.invalidate();
                                            break;
                                        case 1:
                                            rt rtVar3 = this.b.a;
                                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            rtVar3.g = floatValue2;
                                            float f21 = rtVar3.f;
                                            rtVar3.e = e2.c.w(0.0f, f21, floatValue2, f21);
                                            rtVar3.z.invalidate();
                                            break;
                                        default:
                                            rt rtVar4 = this.b.a;
                                            float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            rtVar4.g = floatValue3;
                                            float f22 = rtVar4.f;
                                            rtVar4.e = e2.c.w(0.0f, f22, floatValue3, f22);
                                            rtVar4.z.invalidate();
                                            break;
                                    }
                                }
                            });
                            ofFloat3.setDuration(350L);
                            ofFloat3.setInterpolator(org.telegram.ui.Components.mr.f);
                            ofFloat3.start();
                        }
                        i27 = 0;
                        while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount()) {
                        }
                    }
                    i27 = 0;
                    while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount()) {
                    }
                }
                document12 = rtVar.W;
                if (MessageObject.isPremiumSticker(document12)) {
                    i26 = rtVar.r;
                    if (!AccountInstance.getInstance(i26).getUserConfig().isPremium()) {
                        if (rtVar.O == null) {
                            xg1 xg1Var = new xg1(rtVar.z.getContext(), rtVar.c0);
                            rtVar.O = xg1Var;
                            rtVar.z.addView(xg1Var, k7.b6.c(-1.0f, -1));
                            rtVar.O.setOnClickListener(new ft(rtVar, i34));
                            rtVar.O.a.r.setOnClickListener(new ft(rtVar, i33));
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(rtVar.O, false, 1.0f, false);
                        AndroidUtilities.updateViewVisibilityAnimated(rtVar.O, true);
                        rtVar.O.setTranslationY(0.0f);
                        rtVar.K = true;
                        eVar26 = rtVar.z;
                        eVar26.invalidate();
                        try {
                            eVar27 = rtVar.z;
                            eVar27.performHapticFeedback(0);
                            return;
                        } catch (Exception unused5) {
                            return;
                        }
                    }
                }
                i19 = rtVar.r;
                MediaDataController mediaDataController3 = MediaDataController.getInstance(i19);
                document13 = rtVar.W;
                boolean isStickerInFavorites2 = mediaDataController3.isStickerInFavorites(document13);
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                ptVar13 = rtVar.l;
                if (ptVar13 != null) {
                    ptVar20 = rtVar.l;
                    i24 = rtVar.V;
                    if (ptVar20.l(i24)) {
                        ptVar25 = rtVar.l;
                        if (!ptVar25.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendStickerPreview));
                            b.j(R.drawable.msg_send, arrayList13, arrayList12, 0);
                        }
                    }
                    ptVar21 = rtVar.l;
                    i25 = rtVar.V;
                    if (ptVar21.l(i25)) {
                        ptVar24 = rtVar.l;
                        if (!ptVar24.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendWithoutSound));
                            b.h(R.drawable.input_notify_off, 6, arrayList13, arrayList12);
                        }
                    }
                    ptVar22 = rtVar.l;
                    if (ptVar22.b()) {
                        arrayList11.add(LocaleController.getString(R.string.Schedule));
                        b.j(R.drawable.msg_autodelete, arrayList13, arrayList12, 3);
                    }
                    ptVar23 = rtVar.l;
                    if (ptVar23.g()) {
                        arrayList11.add(LocaleController.getString(R.string.ImportStickersRemoveMenu));
                        b.j(R.drawable.msg_delete, arrayList13, arrayList12, 5);
                    }
                }
                document14 = rtVar.W;
                if (!MessageObject.isMaskDocument(document14)) {
                    if (!isStickerInFavorites2) {
                        i23 = rtVar.r;
                        if (MediaDataController.getInstance(i23).canAddStickerToFavorites()) {
                            document16 = rtVar.W;
                        }
                    }
                    arrayList11.add(LocaleController.getString(isStickerInFavorites2 ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                    b.j(isStickerInFavorites2 ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList13, arrayList12, 2);
                }
                ptVar14 = rtVar.l;
                if (ptVar14 != null && (inputStickerSet = rtVar.a0) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                    ptVar19 = rtVar.l;
                    if (ptVar19.Q()) {
                        arrayList11.add(LocaleController.formatString(R.string.ViewPackPreview, new Object[0]));
                        b.j(R.drawable.msg_media, arrayList13, arrayList12, 1);
                    }
                }
                if (rtVar.p) {
                    arrayList11.add(LocaleController.getString(R.string.DeleteFromRecent));
                    b.j(R.drawable.msg_delete, arrayList13, arrayList12, 4);
                }
                if (rtVar.a0 != null) {
                    document15 = rtVar.W;
                    if (document15 != null) {
                        i22 = rtVar.r;
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i22).getStickerSet(rtVar.a0, true);
                        if (stickerSet != null) {
                            ptVar17 = rtVar.l;
                            if (ptVar17 != null) {
                                ptVar18 = rtVar.l;
                                if (ptVar18.D()) {
                                    TLRPC.StickerSet stickerSet2 = stickerSet.set;
                                    if (!stickerSet2.emojis && !stickerSet2.masks) {
                                        arrayList11.add(LocaleController.getString(R.string.EditSticker));
                                        b.h(R.drawable.msg_edit, 7, arrayList13, arrayList12);
                                    }
                                }
                            }
                        }
                        if (stickerSet != null && stickerSet.set.creator) {
                            ptVar15 = rtVar.l;
                            if (ptVar15 != null) {
                                ptVar16 = rtVar.l;
                                unused = rtVar.W;
                                if (ptVar16.I()) {
                                    arrayList11.add(LocaleController.getString(R.string.DeleteSticker));
                                    b.h(R.drawable.msg_delete, 8, arrayList13, arrayList12);
                                }
                            }
                        }
                    }
                }
                if (arrayList11.isEmpty()) {
                    return;
                }
                rtVar.K = true;
                eVar15 = rtVar.z;
                eVar15.invalidate();
                jt jtVar = new jt(this, arrayList12, isStickerInFavorites2);
                rt.h(rtVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                for (int i52 = 0; i52 < arrayList11.size(); i52++) {
                    int intValue3 = ((Integer) arrayList13.get(i52)).intValue();
                    CharSequence charSequence3 = (CharSequence) arrayList11.get(i52);
                    f6Var3 = rtVar.c0;
                    org.telegram.ui.ActionBar.g1 c13 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, intValue3, charSequence3, false, f6Var3);
                    c13.setTag(Integer.valueOf(i52));
                    c13.setOnClickListener(jtVar);
                    if (((Integer) arrayList12.get(i52)).intValue() == 8) {
                        int d10 = rt.d(rtVar, org.telegram.ui.ActionBar.j6.q7);
                        c13.c(d10, d10);
                        c13.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.1f, d10));
                    }
                }
                kt ktVar = new kt(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                rtVar.k = ktVar;
                ktVar.e = true;
                ktVar.c = 100;
                ktVar.g = true;
                ktVar.setOutsideTouchable(true);
                rtVar.k.setClippingEnabled(true);
                rtVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                rtVar.k.setFocusable(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                rtVar.k.setInputMethodMode(2);
                rtVar.k.getContentView().setFocusableInTouchMode(true);
                bVar7 = rtVar.q;
                int i53 = bVar7.d;
                bVar8 = rtVar.q;
                int i54 = i53 + bVar8.b;
                bVar9 = rtVar.q;
                int i55 = bVar9.b;
                i20 = rtVar.V;
                if (i20 == 1) {
                    eVar24 = rtVar.z;
                    int width3 = eVar24.getWidth();
                    eVar25 = rtVar.z;
                    i21 = Math.min(width3, eVar25.getHeight() - i54) - AndroidUtilities.dp(40.0f);
                } else {
                    if (rtVar.S) {
                        eVar18 = rtVar.z;
                        int width4 = eVar18.getWidth();
                        eVar19 = rtVar.z;
                        min = Math.min(width4, eVar19.getHeight() - i54) - AndroidUtilities.dpf2(40.0f);
                    } else {
                        eVar16 = rtVar.z;
                        int width5 = eVar16.getWidth();
                        eVar17 = rtVar.z;
                        min = Math.min(width5, eVar17.getHeight() - i54) / 1.8f;
                    }
                    i21 = (int) min;
                }
                f18 = rtVar.e;
                int i56 = i21 / 2;
                int i57 = i55 + i56;
                int dp6 = rtVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                eVar20 = rtVar.z;
                int dp7 = AndroidUtilities.dp(24.0f) + ((int) (f18 + Math.max(i57 + dp6, ((eVar20.getHeight() - i54) - rtVar.I) / 2) + i56));
                if (rtVar.S) {
                    dp7 += AndroidUtilities.dp(24.0f);
                }
                org.telegram.ui.ActionBar.p1 p1Var3 = rtVar.k;
                eVar21 = rtVar.z;
                eVar22 = rtVar.z;
                p1Var3.showAtLocation(eVar21, 0, (int) ((eVar22.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), dp7);
                try {
                    eVar23 = rtVar.z;
                    eVar23.performHapticFeedback(0);
                } catch (Exception unused6) {
                }
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            i27 = 0;
            while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount()) {
            }
        }
        i10 = 1;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout32 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, rtVar.z.getContext(), rtVar.c0);
        org.telegram.ui.ActionBar.f6 f6Var42 = null;
        pg.b c32 = aVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout32, null, true);
        c32.n(rg.b.k(rtVar.c0));
        c32.p(AndroidUtilities.dp(12.0f));
        c32.o(AndroidUtilities.dp(8.0f));
        c32.h.e = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout32.setBackground(c32);
        if (rtVar.V != 3) {
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        i27 = 0;
        while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount()) {
        }
    }
}
