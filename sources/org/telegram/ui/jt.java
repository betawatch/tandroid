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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class jt implements Runnable {
    public final /* synthetic */ nt a;

    public jt(nt ntVar) {
        this.a = ntVar;
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
        lt ltVar;
        lt ltVar2;
        int i13;
        lt ltVar3;
        int i14;
        lt ltVar4;
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
        lt ltVar5;
        TLRPC.Document document4;
        lt ltVar6;
        lt ltVar7;
        lt ltVar8;
        lt ltVar9;
        int i16;
        lt ltVar10;
        TLRPC.Document document5;
        lt ltVar11;
        TLRPC.Document document6;
        lt ltVar12;
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
        lt ltVar13;
        TLRPC.Document document14;
        lt ltVar14;
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
        lt ltVar15;
        lt ltVar16;
        lt ltVar17;
        lt ltVar18;
        TLRPC.InputStickerSet inputStickerSet;
        lt ltVar19;
        int i23;
        TLRPC.Document document16;
        lt ltVar20;
        int i24;
        lt ltVar21;
        int i25;
        lt ltVar22;
        lt ltVar23;
        lt ltVar24;
        lt ltVar25;
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
        org.telegram.ui.Components.y70 j3;
        TLRPC.Document unused;
        nt ntVar = this.a;
        ah.c cVar = ntVar.t;
        if (ntVar.w == null || ntVar.m) {
            return;
        }
        ntVar.R = true;
        lt ltVar26 = ntVar.l;
        final int i28 = 0;
        if (ltVar26 != null && (j3 = ltVar26.j(ntVar.z)) != null) {
            j3.Q(cVar, eh.b.k(ntVar.c0), true);
            j3.t = false;
            j3.Y();
            j3.p = new aj(this, 16);
            ViewGroup viewGroup = j3.A;
            dt dtVar = new dt(this, viewGroup);
            ntVar.k = dtVar;
            dtVar.e = true;
            dtVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
            dtVar.g = true;
            dtVar.setOutsideTouchable(true);
            ntVar.k.setClippingEnabled(true);
            ntVar.k.setAnimationStyle(R.style.PopupContextAnimation);
            ntVar.k.setFocusable(true);
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            ntVar.k.setInputMethodMode(2);
            ntVar.k.getContentView().setFocusableInTouchMode(true);
            i0.b bVar10 = ntVar.q;
            int min2 = (Math.min(ntVar.z.getWidth(), ntVar.z.getHeight() - (bVar10.d + bVar10.b)) - AndroidUtilities.dp(40.0f)) / 2;
            int dp = (int) ((AndroidUtilities.dp(24.0f) - ntVar.e) + ((int) (ntVar.e + Math.max(r2 + min2 + (ntVar.G != null ? AndroidUtilities.dp(40.0f) : 0), ((ntVar.z.getHeight() - r3) - ntVar.I) / 2) + min2)));
            ntVar.k.showAtLocation(ntVar.z, 0, (int) ((r4.getMeasuredWidth() - viewGroup.getMeasuredWidth()) / 2.0f), dp);
            try {
                ntVar.z.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            float f18 = ntVar.e;
            if (f18 != 0.0f) {
                ntVar.f = f18;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ct
                    public final /* synthetic */ jt b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i28) {
                            case 0:
                                nt ntVar2 = this.b.a;
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ntVar2.g = floatValue;
                                float f19 = ntVar2.f;
                                ntVar2.e = com.google.android.gms.internal.vision.e2.z(0.0f, f19, floatValue, f19);
                                ntVar2.z.invalidate();
                                break;
                            case 1:
                                nt ntVar3 = this.b.a;
                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ntVar3.g = floatValue2;
                                float f20 = ntVar3.f;
                                ntVar3.e = com.google.android.gms.internal.vision.e2.z(0.0f, f20, floatValue2, f20);
                                ntVar3.z.invalidate();
                                break;
                            default:
                                nt ntVar4 = this.b.a;
                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ntVar4.g = floatValue3;
                                float f21 = ntVar4.f;
                                ntVar4.e = com.google.android.gms.internal.vision.e2.z(0.0f, f21, floatValue3, f21);
                                ntVar4.z.invalidate();
                                break;
                        }
                    }
                });
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(org.telegram.ui.Components.rr.f);
                ofFloat.start();
            }
            ntVar.K = true;
            return;
        }
        if (ntVar.V != 3) {
            lt ltVar27 = ntVar.l;
            if (ltVar27 != null) {
                TLRPC.TL_messageMediaPoll d = ltVar27.d();
                TLRPC.PollAnswer h = ntVar.l.h();
                if (d != null && d.poll != null && h != null) {
                    TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(d, h.option);
                    if (pollResult != null && pollResult.voters > 0) {
                        MessageObject.canShowVotersList(d);
                    }
                }
            }
            i10 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, ntVar.z.getContext(), ntVar.c0);
            org.telegram.ui.ActionBar.d6 d6Var4 = null;
            ch.d c10 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout2, null, true);
            c10.o(eh.b.k(ntVar.c0));
            c10.q(AndroidUtilities.dp(12.0f));
            c10.p(AndroidUtilities.dp(8.0f));
            c10.j.e = true;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackground(c10);
            if (ntVar.V != 3) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (ntVar.T == null) {
                    lt ltVar28 = ntVar.l;
                    if (ltVar28 == null || !ltVar28.B()) {
                        if (ntVar.l.y()) {
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
                lt ltVar29 = ntVar.l;
                if (ltVar29 == null || !ltVar29.B()) {
                    lt ltVar30 = ntVar.l;
                    arrayList.add(LocaleController.getString((ltVar30 == null || !ltVar30.J()) ? R.string.AddToStickerPack : R.string.StickersReplaceSticker));
                    lt ltVar31 = ntVar.l;
                    org.telegram.ui.Cells.c1.o((ltVar31 == null || !ltVar31.J()) ? R.drawable.menu_sticker_add : R.drawable.msg_replace, arrayList3, arrayList2, 2);
                }
                int i29 = 7;
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, ntVar.w, ntVar.c0, true, false);
                e1Var.setItemHeight(44);
                e1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                e1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                FrameLayout frameLayout = new FrameLayout(ntVar.z.getContext());
                LinearLayout linearLayout = new LinearLayout(ntVar.z.getContext());
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G8, ntVar.c0));
                linearLayout.setOrientation(1);
                if (ntVar.w == null) {
                    wb1Var = null;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new TLRPC.TL_stickerSetNoCovered());
                    TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = new TLRPC.TL_messages_getMyStickers();
                    tL_messages_getMyStickers.limit = 100;
                    ConnectionsManager.getInstance(ntVar.r).sendRequest(tL_messages_getMyStickers, new aa(ntVar, arrayList4, tL_messages_getMyStickers, i29));
                    wb1 wb1Var2 = new wb1(ntVar.w, i29, d6Var4);
                    wb1Var2.setLayoutManager(new s4.c0());
                    wb1Var2.i(new ci.r1(arrayList4, 4));
                    wb1Var2.setAdapter(new kt(ntVar, arrayList4));
                    wb1Var = wb1Var2;
                }
                wb1Var.setOnItemClickListener(new i(this, 5));
                frameLayout.addView(e1Var);
                linearLayout.addView(frameLayout);
                linearLayout.addView(new org.telegram.ui.ActionBar.j1(ntVar.z.getContext(), ntVar.c0), w7.y5.n(-1, 8));
                ai.s0 s0Var = new ai.s0(this, arrayList2, wb1Var, linearLayout, actionBarPopupWindow$ActionBarPopupWindowLayout2, 13);
                for (int i30 = 0; i30 < arrayList.size(); i30++) {
                    org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, ((Integer) arrayList3.get(i30)).intValue(), (CharSequence) arrayList.get(i30), false, ntVar.c0);
                    c11.setTag(Integer.valueOf(i30));
                    c11.setOnClickListener(s0Var);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                linearLayout.addView(wb1Var, new LinearLayout.LayoutParams(actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth() - AndroidUtilities.dp(16.0f), (int) (actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredHeight() * 1.5f)));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.b(linearLayout);
                frameLayout.setOnClickListener(new rf(actionBarPopupWindow$ActionBarPopupWindowLayout2, 2));
                i0.b bVar11 = ntVar.q;
                int i31 = bVar11.d + bVar11.b;
                int min3 = ((int) (Math.min(ntVar.z.getWidth(), ntVar.z.getHeight() - i31) / 1.8f)) / 2;
                ntVar.z.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, w7.y5.d(-2, -2.0f, 49, 0.0f, (AndroidUtilities.dp(84.0f) + ((int) ((ntVar.e + Math.max(r0 + min3, ((ntVar.z.getHeight() - i31) - ntVar.I) / 2)) + min3))) / AndroidUtilities.density, 0.0f, 0.0f));
                ntVar.L = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setTranslationY(-AndroidUtilities.dp(12.0f));
                ntVar.L.setAlpha(0.0f);
                view = ntVar.L;
                view.setScaleX(0.8f);
                view2 = ntVar.L;
                view2.setScaleY(0.8f);
                view3 = ntVar.L;
                view3.setPivotY(0.0f);
                view4 = ntVar.L;
                view5 = ntVar.L;
                view4.setPivotX(view5.getMeasuredWidth() / 2.0f);
                view6 = ntVar.L;
                view6.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.rr.h).start();
                if (ntVar.P == null) {
                    org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(ntVar, ntVar.z.getContext(), UserConfig.selectedAccount, ntVar.c0);
                    ntVar.P = zbVar;
                    zbVar.N0 = true;
                    zbVar.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                    ntVar.P.setClipChildren(false);
                    ntVar.P.setClipToPadding(false);
                    ntVar.P.setVisibility(0);
                    ntVar.P.setHint(LocaleController.getString(R.string.StickersSetEmojiForSticker));
                    ntVar.P.setBubbleOffset(-AndroidUtilities.dp(105.0f));
                    ntVar.P.setMiniBubblesOffset(-AndroidUtilities.dp(14.0f));
                    FrameLayout frameLayout2 = new FrameLayout(ntVar.z.getContext());
                    ntVar.Q = frameLayout2;
                    frameLayout2.addView(ntVar.P, w7.y5.d(-2, 116.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                    ntVar.z.addView(ntVar.Q, w7.y5.d(-2, -2.0f, 1, 0.0f, 100.0f, 0.0f, 0.0f));
                }
                ntVar.P.setSelectedEmojis(ntVar.o);
                ntVar.P.setDelegate(new zs(ntVar));
                ntVar.P.p(null, null, false);
                ntVar.Q.setScaleY(0.6f);
                ntVar.Q.setScaleX(0.6f);
                ntVar.Q.setAlpha(0.0f);
                AndroidUtilities.runOnUIThread(new ys(ntVar, 2), 10L);
                ntVar.K = true;
                m6Var28 = ntVar.z;
                m6Var28.invalidate();
            } else {
                final int i32 = 1;
                int i33 = 0;
                i11 = ntVar.V;
                if (i11 != 0) {
                    i12 = ntVar.V;
                    if (i12 == 2) {
                        ltVar8 = ntVar.l;
                        if (ltVar8 != null) {
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = new ArrayList();
                            ltVar9 = ntVar.l;
                            i16 = ntVar.V;
                            if (ltVar9.m(i16)) {
                                arrayList5.add(LocaleController.getString(R.string.SendEmojiPreview));
                                org.telegram.ui.Cells.c1.o(R.drawable.msg_send, arrayList7, arrayList6, 0);
                            }
                            ltVar10 = ntVar.l;
                            document5 = ntVar.W;
                            Boolean P = ltVar10.P(document5);
                            if (P != null) {
                                if (P.booleanValue()) {
                                    arrayList5.add(LocaleController.getString(R.string.SetAsEmojiStatus));
                                    org.telegram.ui.Cells.c1.o(R.drawable.msg_smile_status, arrayList7, arrayList6, 1);
                                } else {
                                    arrayList5.add(LocaleController.getString(R.string.RemoveStatus));
                                    org.telegram.ui.Cells.c1.o(R.drawable.msg_smile_status, arrayList7, arrayList6, 2);
                                }
                            }
                            ltVar11 = ntVar.l;
                            document6 = ntVar.W;
                            if (ltVar11.E(document6)) {
                                arrayList5.add(LocaleController.getString(R.string.CopyEmojiPreview));
                                org.telegram.ui.Cells.c1.o(R.drawable.msg_copy, arrayList7, arrayList6, 3);
                            }
                            ltVar12 = ntVar.l;
                            document7 = ntVar.W;
                            if (ltVar12.N(document7)) {
                                arrayList5.add(LocaleController.getString(R.string.RemoveFromRecent));
                                org.telegram.ui.Cells.c1.o(R.drawable.msg_delete, arrayList7, arrayList6, 4);
                            }
                            i17 = ntVar.r;
                            MediaDataController mediaDataController = MediaDataController.getInstance(i17);
                            document8 = ntVar.W;
                            boolean isStickerInFavorites = mediaDataController.isStickerInFavorites(document8);
                            document9 = ntVar.W;
                            if (!MessageObject.isAnimatedEmoji(document9)) {
                                document10 = ntVar.W;
                                if (!MessageObject.isMaskDocument(document10)) {
                                    if (!isStickerInFavorites) {
                                        i18 = ntVar.r;
                                        if (MediaDataController.getInstance(i18).canAddStickerToFavorites()) {
                                            document11 = ntVar.W;
                                        }
                                    }
                                    arrayList5.add(LocaleController.getString(isStickerInFavorites ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                                    org.telegram.ui.Cells.c1.o(isStickerInFavorites ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList7, arrayList6, 5);
                                }
                            }
                            if (arrayList5.isEmpty()) {
                                return;
                            }
                            ntVar.K = true;
                            m6Var8 = ntVar.z;
                            m6Var8.invalidate();
                            int[] iArr = new int[arrayList7.size()];
                            for (int i34 = 0; i34 < arrayList7.size(); i34++) {
                                iArr[i34] = ((Integer) arrayList7.get(i34)).intValue();
                            }
                            org.telegram.ui.Components.hc0 hc0Var = new org.telegram.ui.Components.hc0(this, arrayList6, isStickerInFavorites);
                            boolean h10 = nt.h(ntVar, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                            int i35 = 0;
                            while (i35 < arrayList5.size()) {
                                boolean z11 = !h10 && i35 == 0;
                                boolean z12 = i35 == arrayList5.size() + (-1);
                                int intValue = ((Integer) arrayList7.get(i35)).intValue();
                                CharSequence charSequence = (CharSequence) arrayList5.get(i35);
                                d6Var2 = ntVar.c0;
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                                org.telegram.ui.ActionBar.e1 c12 = org.telegram.ui.ActionBar.u0.c(z11, z12, actionBarPopupWindow$ActionBarPopupWindowLayout3, intValue, charSequence, false, d6Var2);
                                if (((Integer) arrayList6.get(i35)).intValue() == 4) {
                                    c12.setIconColor(nt.d(ntVar, org.telegram.ui.ActionBar.h6.p7));
                                    c12.setTextColor(nt.d(ntVar, org.telegram.ui.ActionBar.h6.q7));
                                }
                                c12.setTag(Integer.valueOf(i35));
                                c12.setOnClickListener(hc0Var);
                                i35++;
                                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                            gt gtVar = new gt(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            ntVar.k = gtVar;
                            gtVar.e = true;
                            gtVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
                            gtVar.g = true;
                            gtVar.setOutsideTouchable(true);
                            ntVar.k.setClippingEnabled(true);
                            ntVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                            ntVar.k.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            ntVar.k.setInputMethodMode(2);
                            ntVar.k.getContentView().setFocusableInTouchMode(true);
                            bVar4 = ntVar.q;
                            int i36 = bVar4.d;
                            bVar5 = ntVar.q;
                            int i37 = i36 + bVar5.b;
                            bVar6 = ntVar.q;
                            int i38 = bVar6.b;
                            m6Var9 = ntVar.z;
                            int width = m6Var9.getWidth();
                            m6Var10 = ntVar.z;
                            int min4 = Math.min(width, m6Var10.getHeight() - i37) - AndroidUtilities.dp(40.0f);
                            f13 = ntVar.e;
                            int i39 = min4 / 2;
                            int i40 = i38 + i39;
                            int dp2 = ntVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                            m6Var11 = ntVar.z;
                            float max = (int) (f13 + Math.max(i40 + dp2, ((m6Var11.getHeight() - i37) - ntVar.I) / 2) + i39);
                            float dp3 = AndroidUtilities.dp(24.0f);
                            f14 = ntVar.e;
                            int i41 = (int) ((dp3 - f14) + max);
                            org.telegram.ui.ActionBar.m1 m1Var = ntVar.k;
                            m6Var12 = ntVar.z;
                            m6Var13 = ntVar.z;
                            m1Var.showAtLocation(m6Var12, 0, (int) ((m6Var13.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i41);
                            org.telegram.ui.ActionBar.m1.i(actionBarPopupWindow$ActionBarPopupWindowLayout);
                            try {
                                m6Var14 = ntVar.z;
                                m6Var14.performHapticFeedback(0);
                            } catch (Exception unused3) {
                            }
                            f15 = ntVar.e;
                            if (f15 != 0.0f) {
                                f16 = ntVar.e;
                                ntVar.f = f16;
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ct
                                    public final /* synthetic */ jt b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        switch (i32) {
                                            case 0:
                                                nt ntVar2 = this.b.a;
                                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                ntVar2.g = floatValue;
                                                float f19 = ntVar2.f;
                                                ntVar2.e = com.google.android.gms.internal.vision.e2.z(0.0f, f19, floatValue, f19);
                                                ntVar2.z.invalidate();
                                                break;
                                            case 1:
                                                nt ntVar3 = this.b.a;
                                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                ntVar3.g = floatValue2;
                                                float f20 = ntVar3.f;
                                                ntVar3.e = com.google.android.gms.internal.vision.e2.z(0.0f, f20, floatValue2, f20);
                                                ntVar3.z.invalidate();
                                                break;
                                            default:
                                                nt ntVar4 = this.b.a;
                                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                ntVar4.g = floatValue3;
                                                float f21 = ntVar4.f;
                                                ntVar4.e = com.google.android.gms.internal.vision.e2.z(0.0f, f21, floatValue3, f21);
                                                ntVar4.z.invalidate();
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
                                if (childAt instanceof org.telegram.ui.ActionBar.e1) {
                                    ((org.telegram.ui.ActionBar.e1) childAt).k(i27 == 0, i27 == actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() + (-1));
                                }
                                i27++;
                            }
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                    ltVar = ntVar.l;
                    if (ltVar != null) {
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        ltVar2 = ntVar.l;
                        i13 = ntVar.V;
                        if (ltVar2.m(i13)) {
                            ltVar7 = ntVar.l;
                            if (!ltVar7.c()) {
                                arrayList8.add(LocaleController.getString(R.string.SendGifPreview));
                                org.telegram.ui.Cells.c1.o(R.drawable.msg_send, arrayList10, arrayList9, 0);
                            }
                        }
                        ltVar3 = ntVar.l;
                        i14 = ntVar.V;
                        if (ltVar3.m(i14)) {
                            ltVar6 = ntVar.l;
                            if (!ltVar6.c()) {
                                arrayList8.add(LocaleController.getString(R.string.SendWithoutSound));
                                org.telegram.ui.Cells.c1.o(R.drawable.input_notify_off, arrayList10, arrayList9, 4);
                            }
                        }
                        ltVar4 = ntVar.l;
                        if (ltVar4.b()) {
                            arrayList8.add(LocaleController.getString(R.string.Schedule));
                            org.telegram.ui.Cells.c1.o(R.drawable.msg_autodelete, arrayList10, arrayList9, 3);
                        }
                        document = ntVar.W;
                        if (document != null) {
                            ltVar5 = ntVar.l;
                            document4 = ntVar.W;
                            if (ltVar5.e(document4)) {
                                arrayList8.add(LocaleController.getString(R.string.AddACaption));
                                org.telegram.ui.Cells.c1.m(R.drawable.outline_caption_24, 11, arrayList10, arrayList9);
                            }
                        }
                        document2 = ntVar.W;
                        if (document2 != null) {
                            i15 = ntVar.r;
                            MediaDataController mediaDataController2 = MediaDataController.getInstance(i15);
                            document3 = ntVar.W;
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
                        ntVar.K = true;
                        m6Var = ntVar.z;
                        m6Var.invalidate();
                        int[] iArr2 = new int[arrayList10.size()];
                        for (int i42 = 0; i42 < arrayList10.size(); i42++) {
                            iArr2[i42] = ((Integer) arrayList10.get(i42)).intValue();
                        }
                        org.telegram.ui.Components.et etVar = new org.telegram.ui.Components.et(28, this, arrayList9);
                        for (int i43 = 0; i43 < arrayList8.size(); i43++) {
                            int intValue2 = ((Integer) arrayList10.get(i43)).intValue();
                            CharSequence charSequence2 = (CharSequence) arrayList8.get(i43);
                            d6Var = ntVar.c0;
                            org.telegram.ui.ActionBar.e1 c13 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, intValue2, charSequence2, false, d6Var);
                            c13.setTag(Integer.valueOf(i43));
                            c13.setOnClickListener(etVar);
                            if (z10 && i43 == arrayList8.size() - 1) {
                                c13.c(nt.d(ntVar, org.telegram.ui.ActionBar.h6.q7), nt.d(ntVar, org.telegram.ui.ActionBar.h6.p7));
                            }
                        }
                        ht htVar = new ht(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                        ntVar.k = htVar;
                        htVar.e = true;
                        htVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
                        htVar.g = true;
                        htVar.setOutsideTouchable(true);
                        ntVar.k.setClippingEnabled(true);
                        ntVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                        ntVar.k.setFocusable(true);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                        ntVar.k.setInputMethodMode(2);
                        ntVar.k.getContentView().setFocusableInTouchMode(true);
                        bVar = ntVar.q;
                        int i44 = bVar.d;
                        bVar2 = ntVar.q;
                        int i45 = i44 + bVar2.b;
                        bVar3 = ntVar.q;
                        int i46 = bVar3.b;
                        m6Var2 = ntVar.z;
                        int width2 = m6Var2.getWidth();
                        m6Var3 = ntVar.z;
                        int min5 = Math.min(width2, m6Var3.getHeight() - i45) - AndroidUtilities.dp(40.0f);
                        f7 = ntVar.e;
                        int i47 = min5 / 2;
                        int i48 = i46 + i47;
                        int dp4 = ntVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                        m6Var4 = ntVar.z;
                        float max2 = (int) (f7 + Math.max(i48 + dp4, ((m6Var4.getHeight() - i45) - ntVar.I) / 2) + i47);
                        float dp5 = AndroidUtilities.dp(24.0f);
                        f10 = ntVar.e;
                        int i49 = (int) ((dp5 - f10) + max2);
                        org.telegram.ui.ActionBar.m1 m1Var2 = ntVar.k;
                        m6Var5 = ntVar.z;
                        m6Var6 = ntVar.z;
                        m1Var2.showAtLocation(m6Var5, 0, (int) ((m6Var6.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i49);
                        try {
                            m6Var7 = ntVar.z;
                            m6Var7.performHapticFeedback(0);
                        } catch (Exception unused4) {
                        }
                        f11 = ntVar.e;
                        if (f11 != 0.0f) {
                            f12 = ntVar.e;
                            ntVar.f = f12;
                            final int i50 = 2;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ct
                                public final /* synthetic */ jt b;

                                {
                                    this.b = this;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (i50) {
                                        case 0:
                                            nt ntVar2 = this.b.a;
                                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            ntVar2.g = floatValue;
                                            float f19 = ntVar2.f;
                                            ntVar2.e = com.google.android.gms.internal.vision.e2.z(0.0f, f19, floatValue, f19);
                                            ntVar2.z.invalidate();
                                            break;
                                        case 1:
                                            nt ntVar3 = this.b.a;
                                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            ntVar3.g = floatValue2;
                                            float f20 = ntVar3.f;
                                            ntVar3.e = com.google.android.gms.internal.vision.e2.z(0.0f, f20, floatValue2, f20);
                                            ntVar3.z.invalidate();
                                            break;
                                        default:
                                            nt ntVar4 = this.b.a;
                                            float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            ntVar4.g = floatValue3;
                                            float f21 = ntVar4.f;
                                            ntVar4.e = com.google.android.gms.internal.vision.e2.z(0.0f, f21, floatValue3, f21);
                                            ntVar4.z.invalidate();
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
                document12 = ntVar.W;
                if (MessageObject.isPremiumSticker(document12)) {
                    i26 = ntVar.r;
                    if (!AccountInstance.getInstance(i26).getUserConfig().isPremium()) {
                        if (ntVar.O == null) {
                            ah1 ah1Var = new ah1(ntVar.z.getContext(), ntVar.c0);
                            ntVar.O = ah1Var;
                            ntVar.z.addView(ah1Var, w7.y5.c(-1.0f, -1));
                            ntVar.O.setOnClickListener(new at(ntVar, i33));
                            ntVar.O.a.r.setOnClickListener(new at(ntVar, i32));
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(ntVar.O, false, 1.0f, false);
                        AndroidUtilities.updateViewVisibilityAnimated(ntVar.O, true);
                        ntVar.O.setTranslationY(0.0f);
                        ntVar.K = true;
                        m6Var26 = ntVar.z;
                        m6Var26.invalidate();
                        try {
                            m6Var27 = ntVar.z;
                            m6Var27.performHapticFeedback(0);
                            return;
                        } catch (Exception unused5) {
                            return;
                        }
                    }
                }
                i19 = ntVar.r;
                MediaDataController mediaDataController3 = MediaDataController.getInstance(i19);
                document13 = ntVar.W;
                boolean isStickerInFavorites2 = mediaDataController3.isStickerInFavorites(document13);
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                ltVar13 = ntVar.l;
                if (ltVar13 != null) {
                    ltVar20 = ntVar.l;
                    i24 = ntVar.V;
                    if (ltVar20.m(i24)) {
                        ltVar25 = ntVar.l;
                        if (!ltVar25.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendStickerPreview));
                            org.telegram.ui.Cells.c1.o(R.drawable.msg_send, arrayList13, arrayList12, 0);
                        }
                    }
                    ltVar21 = ntVar.l;
                    i25 = ntVar.V;
                    if (ltVar21.m(i25)) {
                        ltVar24 = ntVar.l;
                        if (!ltVar24.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendWithoutSound));
                            org.telegram.ui.Cells.c1.m(R.drawable.input_notify_off, 6, arrayList13, arrayList12);
                        }
                    }
                    ltVar22 = ntVar.l;
                    if (ltVar22.b()) {
                        arrayList11.add(LocaleController.getString(R.string.Schedule));
                        org.telegram.ui.Cells.c1.o(R.drawable.msg_autodelete, arrayList13, arrayList12, 3);
                    }
                    ltVar23 = ntVar.l;
                    if (ltVar23.g()) {
                        arrayList11.add(LocaleController.getString(R.string.ImportStickersRemoveMenu));
                        org.telegram.ui.Cells.c1.o(R.drawable.msg_delete, arrayList13, arrayList12, 5);
                    }
                }
                document14 = ntVar.W;
                if (!MessageObject.isMaskDocument(document14)) {
                    if (!isStickerInFavorites2) {
                        i23 = ntVar.r;
                        if (MediaDataController.getInstance(i23).canAddStickerToFavorites()) {
                            document16 = ntVar.W;
                        }
                    }
                    arrayList11.add(LocaleController.getString(isStickerInFavorites2 ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                    org.telegram.ui.Cells.c1.o(isStickerInFavorites2 ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList13, arrayList12, 2);
                }
                ltVar14 = ntVar.l;
                if (ltVar14 != null && (inputStickerSet = ntVar.a0) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                    ltVar19 = ntVar.l;
                    if (ltVar19.Q()) {
                        arrayList11.add(LocaleController.formatString(R.string.ViewPackPreview, new Object[0]));
                        org.telegram.ui.Cells.c1.o(R.drawable.msg_media, arrayList13, arrayList12, 1);
                    }
                }
                if (ntVar.p) {
                    arrayList11.add(LocaleController.getString(R.string.DeleteFromRecent));
                    org.telegram.ui.Cells.c1.o(R.drawable.msg_delete, arrayList13, arrayList12, 4);
                }
                if (ntVar.a0 != null) {
                    document15 = ntVar.W;
                    if (document15 != null) {
                        i22 = ntVar.r;
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i22).getStickerSet(ntVar.a0, true);
                        if (stickerSet != null) {
                            ltVar17 = ntVar.l;
                            if (ltVar17 != null) {
                                ltVar18 = ntVar.l;
                                if (ltVar18.D()) {
                                    TLRPC.StickerSet stickerSet2 = stickerSet.set;
                                    if (!stickerSet2.emojis && !stickerSet2.masks) {
                                        arrayList11.add(LocaleController.getString(R.string.EditSticker));
                                        org.telegram.ui.Cells.c1.m(R.drawable.msg_edit, 7, arrayList13, arrayList12);
                                    }
                                }
                            }
                        }
                        if (stickerSet != null && stickerSet.set.creator) {
                            ltVar15 = ntVar.l;
                            if (ltVar15 != null) {
                                ltVar16 = ntVar.l;
                                unused = ntVar.W;
                                if (ltVar16.I()) {
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
                ntVar.K = true;
                m6Var15 = ntVar.z;
                m6Var15.invalidate();
                et etVar2 = new et(this, arrayList12, isStickerInFavorites2);
                nt.h(ntVar, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                for (int i51 = 0; i51 < arrayList11.size(); i51++) {
                    int intValue3 = ((Integer) arrayList13.get(i51)).intValue();
                    CharSequence charSequence3 = (CharSequence) arrayList11.get(i51);
                    d6Var3 = ntVar.c0;
                    org.telegram.ui.ActionBar.e1 c14 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, intValue3, charSequence3, false, d6Var3);
                    c14.setTag(Integer.valueOf(i51));
                    c14.setOnClickListener(etVar2);
                    if (((Integer) arrayList12.get(i51)).intValue() == 8) {
                        int d10 = nt.d(ntVar, org.telegram.ui.ActionBar.h6.q7);
                        c14.c(d10, d10);
                        c14.setSelectorColor(org.telegram.ui.ActionBar.h6.l1(0.1f, d10));
                    }
                }
                ft ftVar = new ft(this, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                ntVar.k = ftVar;
                ftVar.e = true;
                ftVar.c = 100;
                ftVar.g = true;
                ftVar.setOutsideTouchable(true);
                ntVar.k.setClippingEnabled(true);
                ntVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                ntVar.k.setFocusable(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                ntVar.k.setInputMethodMode(2);
                ntVar.k.getContentView().setFocusableInTouchMode(true);
                bVar7 = ntVar.q;
                int i52 = bVar7.d;
                bVar8 = ntVar.q;
                int i53 = i52 + bVar8.b;
                bVar9 = ntVar.q;
                int i54 = bVar9.b;
                i20 = ntVar.V;
                if (i20 == 1) {
                    m6Var24 = ntVar.z;
                    int width3 = m6Var24.getWidth();
                    m6Var25 = ntVar.z;
                    i21 = Math.min(width3, m6Var25.getHeight() - i53) - AndroidUtilities.dp(40.0f);
                } else {
                    if (ntVar.S) {
                        m6Var18 = ntVar.z;
                        int width4 = m6Var18.getWidth();
                        m6Var19 = ntVar.z;
                        min = Math.min(width4, m6Var19.getHeight() - i53) - AndroidUtilities.dpf2(40.0f);
                    } else {
                        m6Var16 = ntVar.z;
                        int width5 = m6Var16.getWidth();
                        m6Var17 = ntVar.z;
                        min = Math.min(width5, m6Var17.getHeight() - i53) / 1.8f;
                    }
                    i21 = (int) min;
                }
                f17 = ntVar.e;
                int i55 = i21 / 2;
                int i56 = i54 + i55;
                int dp6 = ntVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                m6Var20 = ntVar.z;
                int dp7 = AndroidUtilities.dp(24.0f) + ((int) (f17 + Math.max(i56 + dp6, ((m6Var20.getHeight() - i53) - ntVar.I) / 2) + i55));
                if (ntVar.S) {
                    dp7 += AndroidUtilities.dp(24.0f);
                }
                org.telegram.ui.ActionBar.m1 m1Var3 = ntVar.k;
                m6Var21 = ntVar.z;
                m6Var22 = ntVar.z;
                m1Var3.showAtLocation(m6Var21, 0, (int) ((m6Var22.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth()) / 2.0f), dp7);
                try {
                    m6Var23 = ntVar.z;
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
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout22 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, ntVar.z.getContext(), ntVar.c0);
        org.telegram.ui.ActionBar.d6 d6Var42 = null;
        ch.d c102 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout22, null, true);
        c102.o(eh.b.k(ntVar.c0));
        c102.q(AndroidUtilities.dp(12.0f));
        c102.p(AndroidUtilities.dp(8.0f));
        c102.j.e = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout22.setBackground(c102);
        if (ntVar.V != 3) {
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout22;
        i27 = 0;
        while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
        }
    }
}
