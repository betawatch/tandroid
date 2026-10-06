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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class nt implements Runnable {
    public final /* synthetic */ rt a;

    public nt(rt rtVar) {
        this.a = rtVar;
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
        pt ptVar;
        pt ptVar2;
        int i13;
        pt ptVar3;
        int i14;
        pt ptVar4;
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
        pt ptVar13;
        TLRPC.Document document14;
        pt ptVar14;
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
        ci.m6 m6Var26;
        ci.m6 m6Var27;
        int i27;
        xb1 xb1Var;
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        ci.m6 m6Var28;
        org.telegram.ui.Components.b80 j3;
        TLRPC.Document unused;
        rt rtVar = this.a;
        ah.c cVar = rtVar.t;
        if (rtVar.w == null || rtVar.m) {
            return;
        }
        rtVar.R = true;
        pt ptVar26 = rtVar.l;
        final int i28 = 0;
        if (ptVar26 != null && (j3 = ptVar26.j(rtVar.z)) != null) {
            j3.Q(cVar, eh.b.k(rtVar.c0), true);
            j3.t = false;
            j3.Y();
            j3.p = new bj(this, 16);
            ViewGroup viewGroup = j3.A;
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
            float f18 = rtVar.e;
            if (f18 != 0.0f) {
                rtVar.f = f18;
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
                                float f19 = rtVar2.f;
                                rtVar2.e = com.google.android.gms.internal.vision.e2.z(0.0f, f19, floatValue, f19);
                                rtVar2.z.invalidate();
                                break;
                            case 1:
                                rt rtVar3 = this.b.a;
                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                rtVar3.g = floatValue2;
                                float f20 = rtVar3.f;
                                rtVar3.e = com.google.android.gms.internal.vision.e2.z(0.0f, f20, floatValue2, f20);
                                rtVar3.z.invalidate();
                                break;
                            default:
                                rt rtVar4 = this.b.a;
                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                rtVar4.g = floatValue3;
                                float f21 = rtVar4.f;
                                rtVar4.e = com.google.android.gms.internal.vision.e2.z(0.0f, f21, floatValue3, f21);
                                rtVar4.z.invalidate();
                                break;
                        }
                    }
                });
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(org.telegram.ui.Components.tr.f);
                ofFloat.start();
            }
            rtVar.K = true;
            return;
        }
        if (rtVar.V != 3) {
            pt ptVar27 = rtVar.l;
            if (ptVar27 != null) {
                TLRPC.TL_messageMediaPoll d = ptVar27.d();
                TLRPC.PollAnswer h = rtVar.l.h();
                if (d != null && d.poll != null && h != null) {
                    TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(d, h.option);
                    if (pollResult != null && pollResult.voters > 0) {
                        MessageObject.canShowVotersList(d);
                    }
                }
            }
            i10 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, rtVar.z.getContext(), rtVar.c0);
            org.telegram.ui.ActionBar.d6 d6Var4 = null;
            ch.d c10 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout2, null, true);
            c10.w(eh.b.k(rtVar.c0));
            c10.y(AndroidUtilities.dp(12.0f));
            c10.x(AndroidUtilities.dp(8.0f));
            c10.l.e = true;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackground(c10);
            if (rtVar.V != 3) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (rtVar.T == null) {
                    pt ptVar28 = rtVar.l;
                    if (ptVar28 == null || !ptVar28.B()) {
                        if (rtVar.l.y()) {
                            arrayList.add(LocaleController.getString(R.string.SendStickerPreview));
                            org.telegram.ui.Cells.c1.o(R.drawable.msg_send, arrayList3, arrayList2, 0);
                        }
                        arrayList.add(LocaleController.getString(R.string.AddToFavorites));
                        org.telegram.ui.Cells.c1.o(R.drawable.msg_fave, arrayList3, arrayList2, 1);
                    } else {
                        arrayList.add(LocaleController.getString(R.string.SetIntroSticker));
                        org.telegram.ui.Cells.c1.o(R.drawable.menu_sticker_add, arrayList3, arrayList2, 0);
                    }
                }
                pt ptVar29 = rtVar.l;
                if (ptVar29 == null || !ptVar29.B()) {
                    pt ptVar30 = rtVar.l;
                    arrayList.add(LocaleController.getString((ptVar30 == null || !ptVar30.J()) ? R.string.AddToStickerPack : R.string.StickersReplaceSticker));
                    pt ptVar31 = rtVar.l;
                    org.telegram.ui.Cells.c1.o((ptVar31 == null || !ptVar31.J()) ? R.drawable.menu_sticker_add : R.drawable.msg_replace, arrayList3, arrayList2, 2);
                }
                int i29 = 7;
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, rtVar.w, rtVar.c0, true, false);
                f1Var.setItemHeight(44);
                f1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                f1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                FrameLayout frameLayout = new FrameLayout(rtVar.z.getContext());
                LinearLayout linearLayout = new LinearLayout(rtVar.z.getContext());
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, rtVar.c0));
                linearLayout.setOrientation(1);
                if (rtVar.w == null) {
                    xb1Var = null;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new TLRPC.TL_stickerSetNoCovered());
                    TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = new TLRPC.TL_messages_getMyStickers();
                    tL_messages_getMyStickers.limit = 100;
                    ConnectionsManager.getInstance(rtVar.r).sendRequest(tL_messages_getMyStickers, new ca(rtVar, arrayList4, tL_messages_getMyStickers, i29));
                    xb1 xb1Var2 = new xb1(rtVar.w, i29, d6Var4);
                    xb1Var2.setLayoutManager(new s4.c0());
                    xb1Var2.i(new ci.r1(arrayList4, 4));
                    xb1Var2.setAdapter(new ot(rtVar, arrayList4));
                    xb1Var = xb1Var2;
                }
                xb1Var.setOnItemClickListener(new i(this, 5));
                frameLayout.addView(f1Var);
                linearLayout.addView(frameLayout);
                linearLayout.addView(new org.telegram.ui.ActionBar.k1(rtVar.z.getContext(), rtVar.c0), w7.z5.n(-1, 8));
                ai.s0 s0Var = new ai.s0(this, arrayList2, xb1Var, linearLayout, actionBarPopupWindow$ActionBarPopupWindowLayout2, 13);
                for (int i30 = 0; i30 < arrayList.size(); i30++) {
                    org.telegram.ui.ActionBar.f1 c11 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, ((Integer) arrayList3.get(i30)).intValue(), (CharSequence) arrayList.get(i30), false, rtVar.c0);
                    c11.setTag(Integer.valueOf(i30));
                    c11.setOnClickListener(s0Var);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                linearLayout.addView(xb1Var, new LinearLayout.LayoutParams(actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth() - AndroidUtilities.dp(16.0f), (int) (actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredHeight() * 1.5f)));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.b(linearLayout);
                frameLayout.setOnClickListener(new sf(actionBarPopupWindow$ActionBarPopupWindowLayout2, 2));
                i0.b bVar11 = rtVar.q;
                int i31 = bVar11.d + bVar11.b;
                int min3 = ((int) (Math.min(rtVar.z.getWidth(), rtVar.z.getHeight() - i31) / 1.8f)) / 2;
                rtVar.z.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, w7.z5.d(-2, -2.0f, 49, 0.0f, (AndroidUtilities.dp(84.0f) + ((int) ((rtVar.e + Math.max(r0 + min3, ((rtVar.z.getHeight() - i31) - rtVar.I) / 2)) + min3))) / AndroidUtilities.density, 0.0f, 0.0f));
                rtVar.L = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setTranslationY(-AndroidUtilities.dp(12.0f));
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
                view6.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.tr.h).start();
                if (rtVar.P == null) {
                    org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(rtVar, rtVar.z.getContext(), UserConfig.selectedAccount, rtVar.c0);
                    rtVar.P = acVar;
                    acVar.N0 = true;
                    acVar.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                    rtVar.P.setClipChildren(false);
                    rtVar.P.setClipToPadding(false);
                    rtVar.P.setVisibility(0);
                    rtVar.P.setHint(LocaleController.getString(R.string.StickersSetEmojiForSticker));
                    rtVar.P.setBubbleOffset(-AndroidUtilities.dp(105.0f));
                    rtVar.P.setMiniBubblesOffset(-AndroidUtilities.dp(14.0f));
                    FrameLayout frameLayout2 = new FrameLayout(rtVar.z.getContext());
                    rtVar.Q = frameLayout2;
                    frameLayout2.addView(rtVar.P, w7.z5.d(-2, 116.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                    rtVar.z.addView(rtVar.Q, w7.z5.d(-2, -2.0f, 1, 0.0f, 100.0f, 0.0f, 0.0f));
                }
                rtVar.P.setSelectedEmojis(rtVar.o);
                rtVar.P.setDelegate(new dt(rtVar));
                rtVar.P.p(null, null, false);
                rtVar.Q.setScaleY(0.6f);
                rtVar.Q.setScaleX(0.6f);
                rtVar.Q.setAlpha(0.0f);
                AndroidUtilities.runOnUIThread(new ct(rtVar, 2), 10L);
                rtVar.K = true;
                m6Var28 = rtVar.z;
                m6Var28.invalidate();
            } else {
                final int i32 = 1;
                int i33 = 0;
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
                            if (ptVar9.m(i16)) {
                                arrayList5.add(LocaleController.getString(R.string.SendEmojiPreview));
                                org.telegram.ui.Cells.c1.o(R.drawable.msg_send, arrayList7, arrayList6, 0);
                            }
                            ptVar10 = rtVar.l;
                            document5 = rtVar.W;
                            Boolean P = ptVar10.P(document5);
                            if (P != null) {
                                if (P.booleanValue()) {
                                    arrayList5.add(LocaleController.getString(R.string.SetAsEmojiStatus));
                                    org.telegram.ui.Cells.c1.o(R.drawable.msg_smile_status, arrayList7, arrayList6, 1);
                                } else {
                                    arrayList5.add(LocaleController.getString(R.string.RemoveStatus));
                                    org.telegram.ui.Cells.c1.o(R.drawable.msg_smile_status, arrayList7, arrayList6, 2);
                                }
                            }
                            ptVar11 = rtVar.l;
                            document6 = rtVar.W;
                            if (ptVar11.E(document6)) {
                                arrayList5.add(LocaleController.getString(R.string.CopyEmojiPreview));
                                org.telegram.ui.Cells.c1.o(R.drawable.msg_copy, arrayList7, arrayList6, 3);
                            }
                            ptVar12 = rtVar.l;
                            document7 = rtVar.W;
                            if (ptVar12.N(document7)) {
                                arrayList5.add(LocaleController.getString(R.string.RemoveFromRecent));
                                org.telegram.ui.Cells.c1.o(R.drawable.msg_delete, arrayList7, arrayList6, 4);
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
                                    org.telegram.ui.Cells.c1.o(isStickerInFavorites ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList7, arrayList6, 5);
                                }
                            }
                            if (arrayList5.isEmpty()) {
                                return;
                            }
                            rtVar.K = true;
                            m6Var8 = rtVar.z;
                            m6Var8.invalidate();
                            int[] iArr = new int[arrayList7.size()];
                            for (int i34 = 0; i34 < arrayList7.size(); i34++) {
                                iArr[i34] = ((Integer) arrayList7.get(i34)).intValue();
                            }
                            org.telegram.ui.Components.kc0 kc0Var = new org.telegram.ui.Components.kc0(this, arrayList6, isStickerInFavorites);
                            boolean h10 = rt.h(rtVar, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                            int i35 = 0;
                            while (i35 < arrayList5.size()) {
                                boolean z11 = !h10 && i35 == 0;
                                boolean z12 = i35 == arrayList5.size() + (-1);
                                int intValue = ((Integer) arrayList7.get(i35)).intValue();
                                CharSequence charSequence = (CharSequence) arrayList5.get(i35);
                                d6Var2 = rtVar.c0;
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                                org.telegram.ui.ActionBar.f1 c12 = org.telegram.ui.ActionBar.v0.c(z11, z12, actionBarPopupWindow$ActionBarPopupWindowLayout3, intValue, charSequence, false, d6Var2);
                                if (((Integer) arrayList6.get(i35)).intValue() == 4) {
                                    c12.setIconColor(rt.d(rtVar, org.telegram.ui.ActionBar.i6.p7));
                                    c12.setTextColor(rt.d(rtVar, org.telegram.ui.ActionBar.i6.q7));
                                }
                                c12.setTag(Integer.valueOf(i35));
                                c12.setOnClickListener(kc0Var);
                                i35++;
                                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                            lt ltVar = new lt(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            rtVar.k = ltVar;
                            ltVar.e = true;
                            ltVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
                            ltVar.g = true;
                            ltVar.setOutsideTouchable(true);
                            rtVar.k.setClippingEnabled(true);
                            rtVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                            rtVar.k.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            rtVar.k.setInputMethodMode(2);
                            rtVar.k.getContentView().setFocusableInTouchMode(true);
                            bVar4 = rtVar.q;
                            int i36 = bVar4.d;
                            bVar5 = rtVar.q;
                            int i37 = i36 + bVar5.b;
                            bVar6 = rtVar.q;
                            int i38 = bVar6.b;
                            m6Var9 = rtVar.z;
                            int width = m6Var9.getWidth();
                            m6Var10 = rtVar.z;
                            int min4 = Math.min(width, m6Var10.getHeight() - i37) - AndroidUtilities.dp(40.0f);
                            f13 = rtVar.e;
                            int i39 = min4 / 2;
                            int i40 = i38 + i39;
                            int dp2 = rtVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                            m6Var11 = rtVar.z;
                            float max = (int) (f13 + Math.max(i40 + dp2, ((m6Var11.getHeight() - i37) - rtVar.I) / 2) + i39);
                            float dp3 = AndroidUtilities.dp(24.0f);
                            f14 = rtVar.e;
                            int i41 = (int) ((dp3 - f14) + max);
                            org.telegram.ui.ActionBar.n1 n1Var = rtVar.k;
                            m6Var12 = rtVar.z;
                            m6Var13 = rtVar.z;
                            n1Var.showAtLocation(m6Var12, 0, (int) ((m6Var13.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i41);
                            org.telegram.ui.ActionBar.n1.i(actionBarPopupWindow$ActionBarPopupWindowLayout);
                            try {
                                m6Var14 = rtVar.z;
                                m6Var14.performHapticFeedback(0);
                            } catch (Exception unused3) {
                            }
                            f15 = rtVar.e;
                            if (f15 != 0.0f) {
                                f16 = rtVar.e;
                                rtVar.f = f16;
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.gt
                                    public final /* synthetic */ nt b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        switch (i32) {
                                            case 0:
                                                rt rtVar2 = this.b.a;
                                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                rtVar2.g = floatValue;
                                                float f19 = rtVar2.f;
                                                rtVar2.e = com.google.android.gms.internal.vision.e2.z(0.0f, f19, floatValue, f19);
                                                rtVar2.z.invalidate();
                                                break;
                                            case 1:
                                                rt rtVar3 = this.b.a;
                                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                rtVar3.g = floatValue2;
                                                float f20 = rtVar3.f;
                                                rtVar3.e = com.google.android.gms.internal.vision.e2.z(0.0f, f20, floatValue2, f20);
                                                rtVar3.z.invalidate();
                                                break;
                                            default:
                                                rt rtVar4 = this.b.a;
                                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                rtVar4.g = floatValue3;
                                                float f21 = rtVar4.f;
                                                rtVar4.e = com.google.android.gms.internal.vision.e2.z(0.0f, f21, floatValue3, f21);
                                                rtVar4.z.invalidate();
                                                break;
                                        }
                                    }
                                });
                                ofFloat2.setDuration(350L);
                                ofFloat2.setInterpolator(org.telegram.ui.Components.tr.f);
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
                    ptVar = rtVar.l;
                    if (ptVar != null) {
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        ptVar2 = rtVar.l;
                        i13 = rtVar.V;
                        if (ptVar2.m(i13)) {
                            ptVar7 = rtVar.l;
                            if (!ptVar7.c()) {
                                arrayList8.add(LocaleController.getString(R.string.SendGifPreview));
                                org.telegram.ui.Cells.c1.o(R.drawable.msg_send, arrayList10, arrayList9, 0);
                            }
                        }
                        ptVar3 = rtVar.l;
                        i14 = rtVar.V;
                        if (ptVar3.m(i14)) {
                            ptVar6 = rtVar.l;
                            if (!ptVar6.c()) {
                                arrayList8.add(LocaleController.getString(R.string.SendWithoutSound));
                                org.telegram.ui.Cells.c1.o(R.drawable.input_notify_off, arrayList10, arrayList9, 4);
                            }
                        }
                        ptVar4 = rtVar.l;
                        if (ptVar4.b()) {
                            arrayList8.add(LocaleController.getString(R.string.Schedule));
                            org.telegram.ui.Cells.c1.o(R.drawable.msg_autodelete, arrayList10, arrayList9, 3);
                        }
                        document = rtVar.W;
                        if (document != null) {
                            ptVar5 = rtVar.l;
                            document4 = rtVar.W;
                            if (ptVar5.e(document4)) {
                                arrayList8.add(LocaleController.getString(R.string.AddACaption));
                                org.telegram.ui.Cells.c1.m(R.drawable.outline_caption_24, 11, arrayList10, arrayList9);
                            }
                        }
                        document2 = rtVar.W;
                        if (document2 != null) {
                            i15 = rtVar.r;
                            MediaDataController mediaDataController2 = MediaDataController.getInstance(i15);
                            document3 = rtVar.W;
                            z10 = mediaDataController2.hasRecentGif(document3);
                            if (z10) {
                                arrayList8.add(LocaleController.formatString("Delete", R.string.Delete, new Object[0]));
                                org.telegram.ui.Cells.c1.o(R.drawable.msg_delete, arrayList10, arrayList9, 1);
                            } else {
                                arrayList8.add(LocaleController.formatString("SaveToGIFs", R.string.SaveToGIFs, new Object[0]));
                                org.telegram.ui.Cells.c1.o(R.drawable.msg_gif_add, arrayList10, arrayList9, 2);
                            }
                        } else {
                            z10 = false;
                        }
                        if (arrayList8.isEmpty()) {
                            return;
                        }
                        rtVar.K = true;
                        m6Var = rtVar.z;
                        m6Var.invalidate();
                        int[] iArr2 = new int[arrayList10.size()];
                        for (int i42 = 0; i42 < arrayList10.size(); i42++) {
                            iArr2[i42] = ((Integer) arrayList10.get(i42)).intValue();
                        }
                        org.telegram.ui.Components.gt gtVar = new org.telegram.ui.Components.gt(28, this, arrayList9);
                        for (int i43 = 0; i43 < arrayList8.size(); i43++) {
                            int intValue2 = ((Integer) arrayList10.get(i43)).intValue();
                            CharSequence charSequence2 = (CharSequence) arrayList8.get(i43);
                            d6Var = rtVar.c0;
                            org.telegram.ui.ActionBar.f1 c13 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, intValue2, charSequence2, false, d6Var);
                            c13.setTag(Integer.valueOf(i43));
                            c13.setOnClickListener(gtVar);
                            if (z10 && i43 == arrayList8.size() - 1) {
                                c13.c(rt.d(rtVar, org.telegram.ui.ActionBar.i6.q7), rt.d(rtVar, org.telegram.ui.ActionBar.i6.p7));
                            }
                        }
                        mt mtVar = new mt(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                        rtVar.k = mtVar;
                        mtVar.e = true;
                        mtVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
                        mtVar.g = true;
                        mtVar.setOutsideTouchable(true);
                        rtVar.k.setClippingEnabled(true);
                        rtVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                        rtVar.k.setFocusable(true);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                        rtVar.k.setInputMethodMode(2);
                        rtVar.k.getContentView().setFocusableInTouchMode(true);
                        bVar = rtVar.q;
                        int i44 = bVar.d;
                        bVar2 = rtVar.q;
                        int i45 = i44 + bVar2.b;
                        bVar3 = rtVar.q;
                        int i46 = bVar3.b;
                        m6Var2 = rtVar.z;
                        int width2 = m6Var2.getWidth();
                        m6Var3 = rtVar.z;
                        int min5 = Math.min(width2, m6Var3.getHeight() - i45) - AndroidUtilities.dp(40.0f);
                        f7 = rtVar.e;
                        int i47 = min5 / 2;
                        int i48 = i46 + i47;
                        int dp4 = rtVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                        m6Var4 = rtVar.z;
                        float max2 = (int) (f7 + Math.max(i48 + dp4, ((m6Var4.getHeight() - i45) - rtVar.I) / 2) + i47);
                        float dp5 = AndroidUtilities.dp(24.0f);
                        f10 = rtVar.e;
                        int i49 = (int) ((dp5 - f10) + max2);
                        org.telegram.ui.ActionBar.n1 n1Var2 = rtVar.k;
                        m6Var5 = rtVar.z;
                        m6Var6 = rtVar.z;
                        n1Var2.showAtLocation(m6Var5, 0, (int) ((m6Var6.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i49);
                        try {
                            m6Var7 = rtVar.z;
                            m6Var7.performHapticFeedback(0);
                        } catch (Exception unused4) {
                        }
                        f11 = rtVar.e;
                        if (f11 != 0.0f) {
                            f12 = rtVar.e;
                            rtVar.f = f12;
                            final int i50 = 2;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.gt
                                public final /* synthetic */ nt b;

                                {
                                    this.b = this;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (i50) {
                                        case 0:
                                            rt rtVar2 = this.b.a;
                                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            rtVar2.g = floatValue;
                                            float f19 = rtVar2.f;
                                            rtVar2.e = com.google.android.gms.internal.vision.e2.z(0.0f, f19, floatValue, f19);
                                            rtVar2.z.invalidate();
                                            break;
                                        case 1:
                                            rt rtVar3 = this.b.a;
                                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            rtVar3.g = floatValue2;
                                            float f20 = rtVar3.f;
                                            rtVar3.e = com.google.android.gms.internal.vision.e2.z(0.0f, f20, floatValue2, f20);
                                            rtVar3.z.invalidate();
                                            break;
                                        default:
                                            rt rtVar4 = this.b.a;
                                            float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            rtVar4.g = floatValue3;
                                            float f21 = rtVar4.f;
                                            rtVar4.e = com.google.android.gms.internal.vision.e2.z(0.0f, f21, floatValue3, f21);
                                            rtVar4.z.invalidate();
                                            break;
                                    }
                                }
                            });
                            ofFloat3.setDuration(350L);
                            ofFloat3.setInterpolator(org.telegram.ui.Components.tr.f);
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
                document12 = rtVar.W;
                if (MessageObject.isPremiumSticker(document12)) {
                    i26 = rtVar.r;
                    if (!AccountInstance.getInstance(i26).getUserConfig().isPremium()) {
                        if (rtVar.O == null) {
                            ah1 ah1Var = new ah1(rtVar.z.getContext(), rtVar.c0);
                            rtVar.O = ah1Var;
                            rtVar.z.addView(ah1Var, w7.z5.c(-1.0f, -1));
                            rtVar.O.setOnClickListener(new et(rtVar, i33));
                            rtVar.O.a.r.setOnClickListener(new et(rtVar, i32));
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(rtVar.O, false, 1.0f, false);
                        AndroidUtilities.updateViewVisibilityAnimated(rtVar.O, true);
                        rtVar.O.setTranslationY(0.0f);
                        rtVar.K = true;
                        m6Var26 = rtVar.z;
                        m6Var26.invalidate();
                        try {
                            m6Var27 = rtVar.z;
                            m6Var27.performHapticFeedback(0);
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
                    if (ptVar20.m(i24)) {
                        ptVar25 = rtVar.l;
                        if (!ptVar25.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendStickerPreview));
                            org.telegram.ui.Cells.c1.o(R.drawable.msg_send, arrayList13, arrayList12, 0);
                        }
                    }
                    ptVar21 = rtVar.l;
                    i25 = rtVar.V;
                    if (ptVar21.m(i25)) {
                        ptVar24 = rtVar.l;
                        if (!ptVar24.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendWithoutSound));
                            org.telegram.ui.Cells.c1.m(R.drawable.input_notify_off, 6, arrayList13, arrayList12);
                        }
                    }
                    ptVar22 = rtVar.l;
                    if (ptVar22.b()) {
                        arrayList11.add(LocaleController.getString(R.string.Schedule));
                        org.telegram.ui.Cells.c1.o(R.drawable.msg_autodelete, arrayList13, arrayList12, 3);
                    }
                    ptVar23 = rtVar.l;
                    if (ptVar23.g()) {
                        arrayList11.add(LocaleController.getString(R.string.ImportStickersRemoveMenu));
                        org.telegram.ui.Cells.c1.o(R.drawable.msg_delete, arrayList13, arrayList12, 5);
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
                    org.telegram.ui.Cells.c1.o(isStickerInFavorites2 ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList13, arrayList12, 2);
                }
                ptVar14 = rtVar.l;
                if (ptVar14 != null && (inputStickerSet = rtVar.a0) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                    ptVar19 = rtVar.l;
                    if (ptVar19.Q()) {
                        arrayList11.add(LocaleController.formatString(R.string.ViewPackPreview, new Object[0]));
                        org.telegram.ui.Cells.c1.o(R.drawable.msg_media, arrayList13, arrayList12, 1);
                    }
                }
                if (rtVar.p) {
                    arrayList11.add(LocaleController.getString(R.string.DeleteFromRecent));
                    org.telegram.ui.Cells.c1.o(R.drawable.msg_delete, arrayList13, arrayList12, 4);
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
                                        org.telegram.ui.Cells.c1.m(R.drawable.msg_edit, 7, arrayList13, arrayList12);
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
                                    org.telegram.ui.Cells.c1.m(R.drawable.msg_delete, 8, arrayList13, arrayList12);
                                }
                            }
                        }
                    }
                }
                if (arrayList11.isEmpty()) {
                    return;
                }
                rtVar.K = true;
                m6Var15 = rtVar.z;
                m6Var15.invalidate();
                jt jtVar = new jt(this, arrayList12, isStickerInFavorites2);
                rt.h(rtVar, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                for (int i51 = 0; i51 < arrayList11.size(); i51++) {
                    int intValue3 = ((Integer) arrayList13.get(i51)).intValue();
                    CharSequence charSequence3 = (CharSequence) arrayList11.get(i51);
                    d6Var3 = rtVar.c0;
                    org.telegram.ui.ActionBar.f1 c14 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, intValue3, charSequence3, false, d6Var3);
                    c14.setTag(Integer.valueOf(i51));
                    c14.setOnClickListener(jtVar);
                    if (((Integer) arrayList12.get(i51)).intValue() == 8) {
                        int d10 = rt.d(rtVar, org.telegram.ui.ActionBar.i6.q7);
                        c14.c(d10, d10);
                        c14.setSelectorColor(org.telegram.ui.ActionBar.i6.l1(0.1f, d10));
                    }
                }
                kt ktVar = new kt(this, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                rtVar.k = ktVar;
                ktVar.e = true;
                ktVar.c = 100;
                ktVar.g = true;
                ktVar.setOutsideTouchable(true);
                rtVar.k.setClippingEnabled(true);
                rtVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                rtVar.k.setFocusable(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                rtVar.k.setInputMethodMode(2);
                rtVar.k.getContentView().setFocusableInTouchMode(true);
                bVar7 = rtVar.q;
                int i52 = bVar7.d;
                bVar8 = rtVar.q;
                int i53 = i52 + bVar8.b;
                bVar9 = rtVar.q;
                int i54 = bVar9.b;
                i20 = rtVar.V;
                if (i20 == 1) {
                    m6Var24 = rtVar.z;
                    int width3 = m6Var24.getWidth();
                    m6Var25 = rtVar.z;
                    i21 = Math.min(width3, m6Var25.getHeight() - i53) - AndroidUtilities.dp(40.0f);
                } else {
                    if (rtVar.S) {
                        m6Var18 = rtVar.z;
                        int width4 = m6Var18.getWidth();
                        m6Var19 = rtVar.z;
                        min = Math.min(width4, m6Var19.getHeight() - i53) - AndroidUtilities.dpf2(40.0f);
                    } else {
                        m6Var16 = rtVar.z;
                        int width5 = m6Var16.getWidth();
                        m6Var17 = rtVar.z;
                        min = Math.min(width5, m6Var17.getHeight() - i53) / 1.8f;
                    }
                    i21 = (int) min;
                }
                f17 = rtVar.e;
                int i55 = i21 / 2;
                int i56 = i54 + i55;
                int dp6 = rtVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                m6Var20 = rtVar.z;
                int dp7 = AndroidUtilities.dp(24.0f) + ((int) (f17 + Math.max(i56 + dp6, ((m6Var20.getHeight() - i53) - rtVar.I) / 2) + i55));
                if (rtVar.S) {
                    dp7 += AndroidUtilities.dp(24.0f);
                }
                org.telegram.ui.ActionBar.n1 n1Var3 = rtVar.k;
                m6Var21 = rtVar.z;
                m6Var22 = rtVar.z;
                n1Var3.showAtLocation(m6Var21, 0, (int) ((m6Var22.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth()) / 2.0f), dp7);
                try {
                    m6Var23 = rtVar.z;
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
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout22 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, rtVar.z.getContext(), rtVar.c0);
        org.telegram.ui.ActionBar.d6 d6Var42 = null;
        ch.d c102 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout22, null, true);
        c102.w(eh.b.k(rtVar.c0));
        c102.y(AndroidUtilities.dp(12.0f));
        c102.x(AndroidUtilities.dp(8.0f));
        c102.l.e = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout22.setBackground(c102);
        if (rtVar.V != 3) {
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout22;
        i27 = 0;
        while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
        }
    }
}
