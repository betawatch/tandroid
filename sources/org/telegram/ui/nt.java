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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class nt implements Runnable {
    public final /* synthetic */ rt a;

    public nt(rt rtVar) {
        this.a = rtVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x0655, code lost:
    
        if (org.telegram.messenger.MessageObject.isStickerHasSet(r2) != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0980, code lost:
    
        if (org.telegram.messenger.MessageObject.isStickerHasSet(r8) != false) goto L230;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0dac  */
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
        int i15;
        float f11;
        float f12;
        ci.m6 m6Var7;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i16;
        TLRPC.Document document3;
        pt ptVar5;
        TLRPC.Document document4;
        pt ptVar6;
        pt ptVar7;
        pt ptVar8;
        pt ptVar9;
        int i17;
        pt ptVar10;
        TLRPC.Document document5;
        pt ptVar11;
        TLRPC.Document document6;
        pt ptVar12;
        TLRPC.Document document7;
        int i18;
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
        org.telegram.ui.ActionBar.e6 e6Var2;
        TLRPC.Document document10;
        int i19;
        TLRPC.Document document11;
        TLRPC.Document document12;
        int i20;
        TLRPC.Document document13;
        pt ptVar13;
        TLRPC.Document document14;
        pt ptVar14;
        ci.m6 m6Var15;
        i0.b bVar7;
        i0.b bVar8;
        i0.b bVar9;
        int i21;
        ci.m6 m6Var16;
        ci.m6 m6Var17;
        float min;
        int i22;
        ci.m6 m6Var18;
        ci.m6 m6Var19;
        float f17;
        ci.m6 m6Var20;
        ci.m6 m6Var21;
        ci.m6 m6Var22;
        ci.m6 m6Var23;
        ci.m6 m6Var24;
        ci.m6 m6Var25;
        org.telegram.ui.ActionBar.e6 e6Var3;
        TLRPC.Document document15;
        int i23;
        pt ptVar15;
        pt ptVar16;
        pt ptVar17;
        pt ptVar18;
        TLRPC.InputStickerSet inputStickerSet;
        pt ptVar19;
        int i24;
        TLRPC.Document document16;
        pt ptVar20;
        int i25;
        pt ptVar21;
        int i26;
        pt ptVar22;
        pt ptVar23;
        pt ptVar24;
        pt ptVar25;
        int i27;
        ci.m6 m6Var26;
        ci.m6 m6Var27;
        int i28;
        fc1 fc1Var;
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        ci.m6 m6Var28;
        org.telegram.ui.Components.p80 j3;
        TLRPC.Document unused;
        rt rtVar = this.a;
        ah.c cVar = rtVar.t;
        if (rtVar.w == null || rtVar.m) {
            return;
        }
        final int i29 = 1;
        rtVar.R = true;
        pt ptVar26 = rtVar.l;
        final int i30 = 0;
        if (ptVar26 != null && (j3 = ptVar26.j(rtVar.z)) != null) {
            j3.Q(cVar, eh.b.k(rtVar.c0), true);
            j3.t = false;
            j3.Y();
            j3.p = new cj(this, 17);
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
                        switch (i30) {
                            case 0:
                                rt rtVar2 = this.b.a;
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                rtVar2.g = floatValue;
                                float f19 = rtVar2.f;
                                rtVar2.e = com.google.android.gms.internal.vision.e2.y(0.0f, f19, floatValue, f19);
                                rtVar2.z.invalidate();
                                break;
                            case 1:
                                rt rtVar3 = this.b.a;
                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                rtVar3.g = floatValue2;
                                float f20 = rtVar3.f;
                                rtVar3.e = com.google.android.gms.internal.vision.e2.y(0.0f, f20, floatValue2, f20);
                                rtVar3.z.invalidate();
                                break;
                            default:
                                rt rtVar4 = this.b.a;
                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                rtVar4.g = floatValue3;
                                float f21 = rtVar4.f;
                                rtVar4.e = com.google.android.gms.internal.vision.e2.y(0.0f, f21, floatValue3, f21);
                                rtVar4.z.invalidate();
                                break;
                        }
                    }
                });
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(org.telegram.ui.Components.hs.f);
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
            org.telegram.ui.ActionBar.e6 e6Var4 = null;
            ch.d c10 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout2, null, true);
            c10.o(eh.b.k(rtVar.c0));
            c10.q(AndroidUtilities.dp(12.0f));
            c10.p(AndroidUtilities.dp(8.0f));
            c10.j.e = true;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackground(c10);
            int i31 = 7;
            if (rtVar.V != 3) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (rtVar.T == null) {
                    pt ptVar28 = rtVar.l;
                    if (ptVar28 == null || !ptVar28.B()) {
                        if (rtVar.l.y()) {
                            arrayList.add(LocaleController.getString(R.string.SendStickerPreview));
                            org.telegram.ui.Cells.c1.m(R.drawable.msg_send, arrayList3, arrayList2, 0);
                        }
                        arrayList.add(LocaleController.getString(R.string.AddToFavorites));
                        org.telegram.ui.Cells.c1.m(R.drawable.msg_fave, arrayList3, arrayList2, 1);
                    } else {
                        arrayList.add(LocaleController.getString(R.string.SetIntroSticker));
                        org.telegram.ui.Cells.c1.m(R.drawable.menu_sticker_add, arrayList3, arrayList2, 0);
                    }
                }
                pt ptVar29 = rtVar.l;
                if (ptVar29 == null || !ptVar29.B()) {
                    pt ptVar30 = rtVar.l;
                    arrayList.add(LocaleController.getString((ptVar30 == null || !ptVar30.J()) ? R.string.AddToStickerPack : R.string.StickersReplaceSticker));
                    pt ptVar31 = rtVar.l;
                    org.telegram.ui.Cells.c1.m((ptVar31 == null || !ptVar31.J()) ? R.drawable.menu_sticker_add : R.drawable.msg_replace, arrayList3, arrayList2, 2);
                }
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, rtVar.w, rtVar.c0, true, false);
                f1Var.setItemHeight(44);
                f1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                f1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                FrameLayout frameLayout = new FrameLayout(rtVar.z.getContext());
                LinearLayout linearLayout = new LinearLayout(rtVar.z.getContext());
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G8, rtVar.c0));
                linearLayout.setOrientation(1);
                if (rtVar.w == null) {
                    fc1Var = null;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new TLRPC.TL_stickerSetNoCovered());
                    TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = new TLRPC.TL_messages_getMyStickers();
                    tL_messages_getMyStickers.limit = 100;
                    ConnectionsManager.getInstance(rtVar.r).sendRequest(tL_messages_getMyStickers, new ba(rtVar, arrayList4, tL_messages_getMyStickers, i31));
                    fc1 fc1Var2 = new fc1(rtVar.w, i31, e6Var4);
                    fc1Var2.setLayoutManager(new s4.d0());
                    fc1Var2.i(new ci.q1(arrayList4, 4));
                    fc1Var2.setAdapter(new ot(rtVar, arrayList4));
                    fc1Var = fc1Var2;
                }
                fc1Var.setOnItemClickListener(new i(this, 5));
                frameLayout.addView(f1Var);
                linearLayout.addView(frameLayout);
                linearLayout.addView(new org.telegram.ui.ActionBar.k1(rtVar.z.getContext(), rtVar.c0), w7.x5.n(-1, 8));
                ai.s0 s0Var = new ai.s0(this, arrayList2, fc1Var, linearLayout, actionBarPopupWindow$ActionBarPopupWindowLayout2, 13);
                for (int i32 = 0; i32 < arrayList.size(); i32++) {
                    org.telegram.ui.ActionBar.f1 c11 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, ((Integer) arrayList3.get(i32)).intValue(), (CharSequence) arrayList.get(i32), false, rtVar.c0);
                    c11.setTag(Integer.valueOf(i32));
                    c11.setOnClickListener(s0Var);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                linearLayout.addView(fc1Var, new LinearLayout.LayoutParams(actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth() - AndroidUtilities.dp(16.0f), (int) (actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredHeight() * 1.5f)));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.b(linearLayout);
                frameLayout.setOnClickListener(new uf(actionBarPopupWindow$ActionBarPopupWindowLayout2, 2));
                i0.b bVar11 = rtVar.q;
                int i33 = bVar11.d + bVar11.b;
                int min3 = ((int) (Math.min(rtVar.z.getWidth(), rtVar.z.getHeight() - i33) / 1.8f)) / 2;
                rtVar.z.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, w7.x5.a(-2.0f, 0.0f, (AndroidUtilities.dp(84.0f) + ((int) ((rtVar.e + Math.max(r0 + min3, ((rtVar.z.getHeight() - i33) - rtVar.I) / 2)) + min3))) / AndroidUtilities.density, 0.0f, 0.0f, -2, 49));
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
                view6.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.hs.h).start();
                if (rtVar.P == null) {
                    org.telegram.ui.Components.cc ccVar = new org.telegram.ui.Components.cc(rtVar, rtVar.z.getContext(), UserConfig.selectedAccount, rtVar.c0);
                    rtVar.P = ccVar;
                    ccVar.N0 = true;
                    ccVar.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                    rtVar.P.setClipChildren(false);
                    rtVar.P.setClipToPadding(false);
                    rtVar.P.setVisibility(0);
                    rtVar.P.setHint(LocaleController.getString(R.string.StickersSetEmojiForSticker));
                    rtVar.P.setBubbleOffset(-AndroidUtilities.dp(105.0f));
                    rtVar.P.setMiniBubblesOffset(-AndroidUtilities.dp(14.0f));
                    FrameLayout frameLayout2 = new FrameLayout(rtVar.z.getContext());
                    rtVar.Q = frameLayout2;
                    frameLayout2.addView(rtVar.P, w7.x5.a(116.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 1));
                    rtVar.z.addView(rtVar.Q, w7.x5.a(-2.0f, 0.0f, 100.0f, 0.0f, 0.0f, -2, 1));
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
                            i17 = rtVar.V;
                            if (ptVar9.m(i17)) {
                                arrayList5.add(LocaleController.getString(R.string.SendEmojiPreview));
                                org.telegram.ui.Cells.c1.m(R.drawable.msg_send, arrayList7, arrayList6, 0);
                            }
                            ptVar10 = rtVar.l;
                            document5 = rtVar.W;
                            Boolean P = ptVar10.P(document5);
                            if (P != null) {
                                if (P.booleanValue()) {
                                    arrayList5.add(LocaleController.getString(R.string.SetAsEmojiStatus));
                                    org.telegram.ui.Cells.c1.m(R.drawable.msg_smile_status, arrayList7, arrayList6, 1);
                                } else {
                                    arrayList5.add(LocaleController.getString(R.string.RemoveStatus));
                                    org.telegram.ui.Cells.c1.m(R.drawable.msg_smile_status, arrayList7, arrayList6, 2);
                                }
                            }
                            ptVar11 = rtVar.l;
                            document6 = rtVar.W;
                            if (ptVar11.E(document6)) {
                                arrayList5.add(LocaleController.getString(R.string.CopyEmojiPreview));
                                org.telegram.ui.Cells.c1.m(R.drawable.msg_copy, arrayList7, arrayList6, 3);
                            }
                            ptVar12 = rtVar.l;
                            document7 = rtVar.W;
                            if (ptVar12.N(document7)) {
                                arrayList5.add(LocaleController.getString(R.string.RemoveFromRecent));
                                org.telegram.ui.Cells.c1.m(R.drawable.msg_delete, arrayList7, arrayList6, 4);
                            }
                            i18 = rtVar.r;
                            MediaDataController mediaDataController = MediaDataController.getInstance(i18);
                            document8 = rtVar.W;
                            boolean isStickerInFavorites = mediaDataController.isStickerInFavorites(document8);
                            document9 = rtVar.W;
                            if (!MessageObject.isAnimatedEmoji(document9)) {
                                document10 = rtVar.W;
                                if (!MessageObject.isMaskDocument(document10)) {
                                    if (!isStickerInFavorites) {
                                        i19 = rtVar.r;
                                        if (MediaDataController.getInstance(i19).canAddStickerToFavorites()) {
                                            document11 = rtVar.W;
                                        }
                                    }
                                    arrayList5.add(LocaleController.getString(isStickerInFavorites ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                                    org.telegram.ui.Cells.c1.m(isStickerInFavorites ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList7, arrayList6, 5);
                                }
                            }
                            if (arrayList5.isEmpty()) {
                                return;
                            }
                            rtVar.K = true;
                            m6Var8 = rtVar.z;
                            m6Var8.invalidate();
                            int[] iArr = new int[arrayList7.size()];
                            for (int i35 = 0; i35 < arrayList7.size(); i35++) {
                                iArr[i35] = ((Integer) arrayList7.get(i35)).intValue();
                            }
                            org.telegram.ui.Components.xc0 xc0Var = new org.telegram.ui.Components.xc0(this, arrayList6, isStickerInFavorites);
                            boolean h10 = rt.h(rtVar, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                            int i36 = 0;
                            while (i36 < arrayList5.size()) {
                                boolean z11 = !h10 && i36 == 0;
                                boolean z12 = i36 == arrayList5.size() + (-1);
                                int intValue = ((Integer) arrayList7.get(i36)).intValue();
                                CharSequence charSequence = (CharSequence) arrayList5.get(i36);
                                e6Var2 = rtVar.c0;
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                                org.telegram.ui.ActionBar.f1 c12 = org.telegram.ui.ActionBar.v0.c(z11, z12, actionBarPopupWindow$ActionBarPopupWindowLayout3, intValue, charSequence, false, e6Var2);
                                if (((Integer) arrayList6.get(i36)).intValue() == 4) {
                                    c12.setIconColor(rt.d(rtVar, org.telegram.ui.ActionBar.i6.p7));
                                    c12.setTextColor(rt.d(rtVar, org.telegram.ui.ActionBar.i6.q7));
                                }
                                c12.setTag(Integer.valueOf(i36));
                                c12.setOnClickListener(xc0Var);
                                i36++;
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
                            int i37 = bVar4.d;
                            bVar5 = rtVar.q;
                            int i38 = i37 + bVar5.b;
                            bVar6 = rtVar.q;
                            int i39 = bVar6.b;
                            m6Var9 = rtVar.z;
                            int width = m6Var9.getWidth();
                            m6Var10 = rtVar.z;
                            int min4 = Math.min(width, m6Var10.getHeight() - i38) - AndroidUtilities.dp(40.0f);
                            f13 = rtVar.e;
                            int i40 = min4 / 2;
                            int i41 = i39 + i40;
                            int dp2 = rtVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                            m6Var11 = rtVar.z;
                            float max = (int) (f13 + Math.max(i41 + dp2, ((m6Var11.getHeight() - i38) - rtVar.I) / 2) + i40);
                            float dp3 = AndroidUtilities.dp(24.0f);
                            f14 = rtVar.e;
                            int i42 = (int) ((dp3 - f14) + max);
                            org.telegram.ui.ActionBar.n1 n1Var = rtVar.k;
                            m6Var12 = rtVar.z;
                            m6Var13 = rtVar.z;
                            n1Var.showAtLocation(m6Var12, 0, (int) ((m6Var13.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i42);
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
                                        switch (i29) {
                                            case 0:
                                                rt rtVar2 = this.b.a;
                                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                rtVar2.g = floatValue;
                                                float f19 = rtVar2.f;
                                                rtVar2.e = com.google.android.gms.internal.vision.e2.y(0.0f, f19, floatValue, f19);
                                                rtVar2.z.invalidate();
                                                break;
                                            case 1:
                                                rt rtVar3 = this.b.a;
                                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                rtVar3.g = floatValue2;
                                                float f20 = rtVar3.f;
                                                rtVar3.e = com.google.android.gms.internal.vision.e2.y(0.0f, f20, floatValue2, f20);
                                                rtVar3.z.invalidate();
                                                break;
                                            default:
                                                rt rtVar4 = this.b.a;
                                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                rtVar4.g = floatValue3;
                                                float f21 = rtVar4.f;
                                                rtVar4.e = com.google.android.gms.internal.vision.e2.y(0.0f, f21, floatValue3, f21);
                                                rtVar4.z.invalidate();
                                                break;
                                        }
                                    }
                                });
                                ofFloat2.setDuration(350L);
                                ofFloat2.setInterpolator(org.telegram.ui.Components.hs.f);
                                ofFloat2.start();
                            }
                            i15 = 0;
                            i28 = i15;
                            while (i28 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i28);
                                if (childAt instanceof org.telegram.ui.ActionBar.f1) {
                                    ((org.telegram.ui.ActionBar.f1) childAt).k(i28 == 0 ? 1 : i15, i28 == actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() + (-1) ? 1 : i15);
                                }
                                i28++;
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
                                org.telegram.ui.Cells.c1.m(R.drawable.msg_send, arrayList10, arrayList9, 0);
                            }
                        }
                        ptVar3 = rtVar.l;
                        i14 = rtVar.V;
                        if (ptVar3.m(i14)) {
                            ptVar6 = rtVar.l;
                            if (!ptVar6.c()) {
                                arrayList8.add(LocaleController.getString(R.string.SendWithoutSound));
                                org.telegram.ui.Cells.c1.m(R.drawable.input_notify_off, arrayList10, arrayList9, 4);
                            }
                        }
                        ptVar4 = rtVar.l;
                        if (ptVar4.b()) {
                            arrayList8.add(LocaleController.getString(R.string.Schedule));
                            org.telegram.ui.Cells.c1.m(R.drawable.msg_autodelete, arrayList10, arrayList9, 3);
                        }
                        document = rtVar.W;
                        if (document != null) {
                            ptVar5 = rtVar.l;
                            document4 = rtVar.W;
                            if (ptVar5.e(document4)) {
                                arrayList8.add(LocaleController.getString(R.string.AddACaption));
                                org.telegram.ui.Cells.c1.k(R.drawable.outline_caption_24, 11, arrayList10, arrayList9);
                            }
                        }
                        document2 = rtVar.W;
                        if (document2 != null) {
                            i16 = rtVar.r;
                            MediaDataController mediaDataController2 = MediaDataController.getInstance(i16);
                            document3 = rtVar.W;
                            z10 = mediaDataController2.hasRecentGif(document3);
                            if (z10) {
                                arrayList8.add(LocaleController.formatString("Delete", R.string.Delete, new Object[0]));
                                org.telegram.ui.Cells.c1.m(R.drawable.msg_delete, arrayList10, arrayList9, 1);
                            } else {
                                arrayList8.add(LocaleController.formatString("SaveToGIFs", R.string.SaveToGIFs, new Object[0]));
                                org.telegram.ui.Cells.c1.m(R.drawable.msg_gif_add, arrayList10, arrayList9, 2);
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
                        for (int i43 = 0; i43 < arrayList10.size(); i43++) {
                            iArr2[i43] = ((Integer) arrayList10.get(i43)).intValue();
                        }
                        org.telegram.ui.Components.ut utVar = new org.telegram.ui.Components.ut(28, this, arrayList9);
                        for (int i44 = 0; i44 < arrayList8.size(); i44++) {
                            int intValue2 = ((Integer) arrayList10.get(i44)).intValue();
                            CharSequence charSequence2 = (CharSequence) arrayList8.get(i44);
                            e6Var = rtVar.c0;
                            org.telegram.ui.ActionBar.f1 c13 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, intValue2, charSequence2, false, e6Var);
                            c13.setTag(Integer.valueOf(i44));
                            c13.setOnClickListener(utVar);
                            if (z10 && i44 == arrayList8.size() - 1) {
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
                        int i45 = bVar.d;
                        bVar2 = rtVar.q;
                        int i46 = i45 + bVar2.b;
                        bVar3 = rtVar.q;
                        int i47 = bVar3.b;
                        m6Var2 = rtVar.z;
                        int width2 = m6Var2.getWidth();
                        m6Var3 = rtVar.z;
                        int min5 = Math.min(width2, m6Var3.getHeight() - i46) - AndroidUtilities.dp(40.0f);
                        f7 = rtVar.e;
                        int i48 = min5 / 2;
                        int i49 = i47 + i48;
                        int dp4 = rtVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                        m6Var4 = rtVar.z;
                        float max2 = (int) (f7 + Math.max(i49 + dp4, ((m6Var4.getHeight() - i46) - rtVar.I) / 2) + i48);
                        float dp5 = AndroidUtilities.dp(24.0f);
                        f10 = rtVar.e;
                        int i50 = (int) ((dp5 - f10) + max2);
                        org.telegram.ui.ActionBar.n1 n1Var2 = rtVar.k;
                        m6Var5 = rtVar.z;
                        m6Var6 = rtVar.z;
                        i15 = 0;
                        n1Var2.showAtLocation(m6Var5, 0, (int) ((m6Var6.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i50);
                        try {
                            m6Var7 = rtVar.z;
                            m6Var7.performHapticFeedback(0);
                        } catch (Exception unused4) {
                        }
                        f11 = rtVar.e;
                        if (f11 != 0.0f) {
                            f12 = rtVar.e;
                            rtVar.f = f12;
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
                                            float f19 = rtVar2.f;
                                            rtVar2.e = com.google.android.gms.internal.vision.e2.y(0.0f, f19, floatValue, f19);
                                            rtVar2.z.invalidate();
                                            break;
                                        case 1:
                                            rt rtVar3 = this.b.a;
                                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            rtVar3.g = floatValue2;
                                            float f20 = rtVar3.f;
                                            rtVar3.e = com.google.android.gms.internal.vision.e2.y(0.0f, f20, floatValue2, f20);
                                            rtVar3.z.invalidate();
                                            break;
                                        default:
                                            rt rtVar4 = this.b.a;
                                            float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            rtVar4.g = floatValue3;
                                            float f21 = rtVar4.f;
                                            rtVar4.e = com.google.android.gms.internal.vision.e2.y(0.0f, f21, floatValue3, f21);
                                            rtVar4.z.invalidate();
                                            break;
                                    }
                                }
                            });
                            ofFloat3.setDuration(350L);
                            ofFloat3.setInterpolator(org.telegram.ui.Components.hs.f);
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
                document12 = rtVar.W;
                if (MessageObject.isPremiumSticker(document12)) {
                    i27 = rtVar.r;
                    if (!AccountInstance.getInstance(i27).getUserConfig().isPremium()) {
                        if (rtVar.O == null) {
                            jh1 jh1Var = new jh1(rtVar.z.getContext(), rtVar.c0);
                            rtVar.O = jh1Var;
                            rtVar.z.addView(jh1Var, w7.x5.d(-1.0f, -1));
                            rtVar.O.setOnClickListener(new et(rtVar, i34));
                            rtVar.O.a.r.setOnClickListener(new et(rtVar, i29));
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
                i20 = rtVar.r;
                MediaDataController mediaDataController3 = MediaDataController.getInstance(i20);
                document13 = rtVar.W;
                boolean isStickerInFavorites2 = mediaDataController3.isStickerInFavorites(document13);
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                ptVar13 = rtVar.l;
                if (ptVar13 != null) {
                    ptVar20 = rtVar.l;
                    i25 = rtVar.V;
                    if (ptVar20.m(i25)) {
                        ptVar25 = rtVar.l;
                        if (!ptVar25.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendStickerPreview));
                            org.telegram.ui.Cells.c1.m(R.drawable.msg_send, arrayList13, arrayList12, 0);
                        }
                    }
                    ptVar21 = rtVar.l;
                    i26 = rtVar.V;
                    if (ptVar21.m(i26)) {
                        ptVar24 = rtVar.l;
                        if (!ptVar24.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendWithoutSound));
                            org.telegram.ui.Cells.c1.k(R.drawable.input_notify_off, 6, arrayList13, arrayList12);
                        }
                    }
                    ptVar22 = rtVar.l;
                    if (ptVar22.b()) {
                        arrayList11.add(LocaleController.getString(R.string.Schedule));
                        org.telegram.ui.Cells.c1.m(R.drawable.msg_autodelete, arrayList13, arrayList12, 3);
                    }
                    ptVar23 = rtVar.l;
                    if (ptVar23.g()) {
                        arrayList11.add(LocaleController.getString(R.string.ImportStickersRemoveMenu));
                        org.telegram.ui.Cells.c1.m(R.drawable.msg_delete, arrayList13, arrayList12, 5);
                    }
                }
                document14 = rtVar.W;
                if (!MessageObject.isMaskDocument(document14)) {
                    if (!isStickerInFavorites2) {
                        i24 = rtVar.r;
                        if (MediaDataController.getInstance(i24).canAddStickerToFavorites()) {
                            document16 = rtVar.W;
                        }
                    }
                    arrayList11.add(LocaleController.getString(isStickerInFavorites2 ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                    org.telegram.ui.Cells.c1.m(isStickerInFavorites2 ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList13, arrayList12, 2);
                }
                ptVar14 = rtVar.l;
                if (ptVar14 != null && (inputStickerSet = rtVar.a0) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                    ptVar19 = rtVar.l;
                    if (ptVar19.Q()) {
                        arrayList11.add(LocaleController.formatString(R.string.ViewPackPreview, new Object[0]));
                        org.telegram.ui.Cells.c1.m(R.drawable.msg_media, arrayList13, arrayList12, 1);
                    }
                }
                if (rtVar.p) {
                    arrayList11.add(LocaleController.getString(R.string.DeleteFromRecent));
                    org.telegram.ui.Cells.c1.m(R.drawable.msg_delete, arrayList13, arrayList12, 4);
                }
                if (rtVar.a0 != null) {
                    document15 = rtVar.W;
                    if (document15 != null) {
                        i23 = rtVar.r;
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i23).getStickerSet(rtVar.a0, true);
                        if (stickerSet != null) {
                            ptVar17 = rtVar.l;
                            if (ptVar17 != null) {
                                ptVar18 = rtVar.l;
                                if (ptVar18.D()) {
                                    TLRPC.StickerSet stickerSet2 = stickerSet.set;
                                    if (!stickerSet2.emojis && !stickerSet2.masks) {
                                        arrayList11.add(LocaleController.getString(R.string.EditSticker));
                                        org.telegram.ui.Cells.c1.k(R.drawable.msg_edit, 7, arrayList13, arrayList12);
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
                                    org.telegram.ui.Cells.c1.k(R.drawable.msg_delete, 8, arrayList13, arrayList12);
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
                for (int i52 = 0; i52 < arrayList11.size(); i52++) {
                    int intValue3 = ((Integer) arrayList13.get(i52)).intValue();
                    CharSequence charSequence3 = (CharSequence) arrayList11.get(i52);
                    e6Var3 = rtVar.c0;
                    org.telegram.ui.ActionBar.f1 c14 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, intValue3, charSequence3, false, e6Var3);
                    c14.setTag(Integer.valueOf(i52));
                    c14.setOnClickListener(jtVar);
                    if (((Integer) arrayList12.get(i52)).intValue() == 8) {
                        int d10 = rt.d(rtVar, org.telegram.ui.ActionBar.i6.q7);
                        c14.c(d10, d10);
                        c14.setSelectorColor(org.telegram.ui.ActionBar.i6.m1(0.1f, d10));
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
                int i53 = bVar7.d;
                bVar8 = rtVar.q;
                int i54 = i53 + bVar8.b;
                bVar9 = rtVar.q;
                int i55 = bVar9.b;
                i21 = rtVar.V;
                if (i21 == 1) {
                    m6Var24 = rtVar.z;
                    int width3 = m6Var24.getWidth();
                    m6Var25 = rtVar.z;
                    i22 = Math.min(width3, m6Var25.getHeight() - i54) - AndroidUtilities.dp(40.0f);
                } else {
                    if (rtVar.S) {
                        m6Var18 = rtVar.z;
                        int width4 = m6Var18.getWidth();
                        m6Var19 = rtVar.z;
                        min = Math.min(width4, m6Var19.getHeight() - i54) - AndroidUtilities.dpf2(40.0f);
                    } else {
                        m6Var16 = rtVar.z;
                        int width5 = m6Var16.getWidth();
                        m6Var17 = rtVar.z;
                        min = Math.min(width5, m6Var17.getHeight() - i54) / 1.8f;
                    }
                    i22 = (int) min;
                }
                f17 = rtVar.e;
                int i56 = i22 / 2;
                int i57 = i55 + i56;
                int dp6 = rtVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                m6Var20 = rtVar.z;
                int dp7 = AndroidUtilities.dp(24.0f) + ((int) (f17 + Math.max(i57 + dp6, ((m6Var20.getHeight() - i54) - rtVar.I) / 2) + i56));
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
            i15 = 0;
            i28 = i15;
            while (i28 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
            }
        }
        i10 = 1;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout22 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, rtVar.z.getContext(), rtVar.c0);
        org.telegram.ui.ActionBar.e6 e6Var42 = null;
        ch.d c102 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout22, null, true);
        c102.o(eh.b.k(rtVar.c0));
        c102.q(AndroidUtilities.dp(12.0f));
        c102.p(AndroidUtilities.dp(8.0f));
        c102.j.e = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout22.setBackground(c102);
        int i312 = 7;
        if (rtVar.V != 3) {
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout22;
        i15 = 0;
        i28 = i15;
        while (i28 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
        }
    }
}
