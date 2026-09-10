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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class pt implements Runnable {
    public final /* synthetic */ tt a;

    public pt(tt ttVar) {
        this.a = ttVar;
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
        rt rtVar;
        rt rtVar2;
        int i13;
        rt rtVar3;
        int i14;
        rt rtVar4;
        TLRPC.Document document;
        TLRPC.Document document2;
        boolean z10;
        bi.n7 n7Var;
        i0.c cVar;
        i0.c cVar2;
        i0.c cVar3;
        bi.n7 n7Var2;
        bi.n7 n7Var3;
        float f7;
        bi.n7 n7Var4;
        float f10;
        bi.n7 n7Var5;
        bi.n7 n7Var6;
        float f11;
        float f12;
        bi.n7 n7Var7;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i15;
        TLRPC.Document document3;
        rt rtVar5;
        TLRPC.Document document4;
        rt rtVar6;
        rt rtVar7;
        rt rtVar8;
        rt rtVar9;
        int i16;
        rt rtVar10;
        TLRPC.Document document5;
        rt rtVar11;
        TLRPC.Document document6;
        rt rtVar12;
        TLRPC.Document document7;
        int i17;
        TLRPC.Document document8;
        TLRPC.Document document9;
        bi.n7 n7Var8;
        i0.c cVar4;
        i0.c cVar5;
        i0.c cVar6;
        bi.n7 n7Var9;
        bi.n7 n7Var10;
        float f13;
        bi.n7 n7Var11;
        float f14;
        bi.n7 n7Var12;
        bi.n7 n7Var13;
        float f15;
        float f16;
        bi.n7 n7Var14;
        org.telegram.ui.ActionBar.f6 f6Var2;
        TLRPC.Document document10;
        int i18;
        TLRPC.Document document11;
        TLRPC.Document document12;
        int i19;
        TLRPC.Document document13;
        rt rtVar13;
        TLRPC.Document document14;
        rt rtVar14;
        bi.n7 n7Var15;
        i0.c cVar7;
        i0.c cVar8;
        i0.c cVar9;
        int i20;
        bi.n7 n7Var16;
        bi.n7 n7Var17;
        float min;
        int i21;
        bi.n7 n7Var18;
        bi.n7 n7Var19;
        float f17;
        bi.n7 n7Var20;
        bi.n7 n7Var21;
        bi.n7 n7Var22;
        bi.n7 n7Var23;
        bi.n7 n7Var24;
        bi.n7 n7Var25;
        org.telegram.ui.ActionBar.f6 f6Var3;
        TLRPC.Document document15;
        int i22;
        rt rtVar15;
        rt rtVar16;
        rt rtVar17;
        rt rtVar18;
        TLRPC.InputStickerSet inputStickerSet;
        rt rtVar19;
        int i23;
        TLRPC.Document document16;
        rt rtVar20;
        int i24;
        rt rtVar21;
        int i25;
        rt rtVar22;
        rt rtVar23;
        rt rtVar24;
        rt rtVar25;
        int i26;
        bi.n7 n7Var26;
        bi.n7 n7Var27;
        int i27;
        ic1 ic1Var;
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        bi.n7 n7Var28;
        org.telegram.ui.Components.w70 K;
        TLRPC.Document unused;
        tt ttVar = this.a;
        zg.a aVar = ttVar.t;
        if (ttVar.w == null || ttVar.m) {
            return;
        }
        ttVar.R = true;
        rt rtVar26 = ttVar.l;
        final int i28 = 0;
        if (rtVar26 != null && (K = rtVar26.K(ttVar.z)) != null) {
            K.R(aVar, dh.c.k(ttVar.c0), true);
            K.t = false;
            K.Y();
            K.p = new fj(this, 16);
            ViewGroup viewGroup = K.A;
            kt ktVar = new kt(this, viewGroup);
            ttVar.k = ktVar;
            ktVar.e = true;
            ktVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
            ktVar.g = true;
            ktVar.setOutsideTouchable(true);
            ttVar.k.setClippingEnabled(true);
            ttVar.k.setAnimationStyle(R.style.PopupContextAnimation);
            ttVar.k.setFocusable(true);
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            ttVar.k.setInputMethodMode(2);
            ttVar.k.getContentView().setFocusableInTouchMode(true);
            i0.c cVar10 = ttVar.q;
            int min2 = (Math.min(ttVar.z.getWidth(), ttVar.z.getHeight() - (cVar10.d + cVar10.b)) - AndroidUtilities.dp(40.0f)) / 2;
            int dp = (int) ((AndroidUtilities.dp(24.0f) - ttVar.e) + ((int) (ttVar.e + Math.max(r2 + min2 + (ttVar.G != null ? AndroidUtilities.dp(40.0f) : 0), ((ttVar.z.getHeight() - r3) - ttVar.I) / 2) + min2)));
            ttVar.k.showAtLocation(ttVar.z, 0, (int) ((r4.getMeasuredWidth() - viewGroup.getMeasuredWidth()) / 2.0f), dp);
            try {
                ttVar.z.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            float f18 = ttVar.e;
            if (f18 != 0.0f) {
                ttVar.f = f18;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.jt
                    public final /* synthetic */ pt b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i28) {
                            case 0:
                                tt ttVar2 = this.b.a;
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ttVar2.g = floatValue;
                                float f19 = ttVar2.f;
                                ttVar2.e = com.google.android.gms.internal.vision.e2.z(0.0f, f19, floatValue, f19);
                                ttVar2.z.invalidate();
                                break;
                            case 1:
                                tt ttVar3 = this.b.a;
                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ttVar3.g = floatValue2;
                                float f20 = ttVar3.f;
                                ttVar3.e = com.google.android.gms.internal.vision.e2.z(0.0f, f20, floatValue2, f20);
                                ttVar3.z.invalidate();
                                break;
                            default:
                                tt ttVar4 = this.b.a;
                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ttVar4.g = floatValue3;
                                float f21 = ttVar4.f;
                                ttVar4.e = com.google.android.gms.internal.vision.e2.z(0.0f, f21, floatValue3, f21);
                                ttVar4.z.invalidate();
                                break;
                        }
                    }
                });
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(org.telegram.ui.Components.wr.f);
                ofFloat.start();
            }
            ttVar.K = true;
            return;
        }
        if (ttVar.V != 3) {
            rt rtVar27 = ttVar.l;
            if (rtVar27 != null) {
                TLRPC.TL_messageMediaPoll d = rtVar27.d();
                TLRPC.PollAnswer g10 = ttVar.l.g();
                if (d != null && d.poll != null && g10 != null) {
                    TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(d, g10.option);
                    if (pollResult != null && pollResult.voters > 0) {
                        MessageObject.canShowVotersList(d);
                    }
                }
            }
            i10 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, ttVar.z.getContext(), ttVar.c0);
            org.telegram.ui.ActionBar.f6 f6Var4 = null;
            bh.d c10 = aVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout3, null, true);
            c10.n(dh.c.k(ttVar.c0));
            c10.p(AndroidUtilities.dp(12.0f));
            c10.o(AndroidUtilities.dp(8.0f));
            c10.h.e = true;
            actionBarPopupWindow$ActionBarPopupWindowLayout3.setBackground(c10);
            if (ttVar.V != 3) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (ttVar.T == null) {
                    rt rtVar28 = ttVar.l;
                    if (rtVar28 == null || !rtVar28.z()) {
                        if (ttVar.l.w()) {
                            arrayList.add(LocaleController.getString(R.string.SendStickerPreview));
                            org.telegram.ui.Cells.r6.o(R.drawable.msg_send, arrayList3, arrayList2, 0);
                        }
                        arrayList.add(LocaleController.getString(R.string.AddToFavorites));
                        org.telegram.ui.Cells.r6.o(R.drawable.msg_fave, arrayList3, arrayList2, 1);
                    } else {
                        arrayList.add(LocaleController.getString(R.string.SetIntroSticker));
                        org.telegram.ui.Cells.r6.o(R.drawable.menu_sticker_add, arrayList3, arrayList2, 0);
                    }
                }
                rt rtVar29 = ttVar.l;
                if (rtVar29 == null || !rtVar29.z()) {
                    rt rtVar30 = ttVar.l;
                    arrayList.add(LocaleController.getString((rtVar30 == null || !rtVar30.I()) ? R.string.AddToStickerPack : R.string.StickersReplaceSticker));
                    rt rtVar31 = ttVar.l;
                    org.telegram.ui.Cells.r6.o((rtVar31 == null || !rtVar31.I()) ? R.drawable.menu_sticker_add : R.drawable.msg_replace, arrayList3, arrayList2, 2);
                }
                int i29 = 7;
                int i30 = 6;
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, ttVar.w, ttVar.c0, true, false);
                g1Var.setItemHeight(44);
                g1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                g1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                FrameLayout frameLayout = new FrameLayout(ttVar.z.getContext());
                LinearLayout linearLayout = new LinearLayout(ttVar.z.getContext());
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, ttVar.c0));
                linearLayout.setOrientation(1);
                if (ttVar.w == null) {
                    ic1Var = null;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new TLRPC.TL_stickerSetNoCovered());
                    TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = new TLRPC.TL_messages_getMyStickers();
                    tL_messages_getMyStickers.limit = 100;
                    ConnectionsManager.getInstance(ttVar.r).sendRequest(tL_messages_getMyStickers, new aa(ttVar, arrayList4, tL_messages_getMyStickers, i29));
                    ic1Var = new ic1(ttVar.w, i30, f6Var4);
                    ic1Var.setLayoutManager(new s4.c0());
                    ic1Var.i(new bi.z1(arrayList4, 4));
                    ic1Var.setAdapter(new qt(ttVar, arrayList4));
                }
                ic1Var.setOnItemClickListener(new i(this, 5));
                frameLayout.addView(g1Var);
                linearLayout.addView(frameLayout);
                linearLayout.addView(new org.telegram.ui.ActionBar.m1(ttVar.z.getContext(), ttVar.c0), w7.a6.n(-1, 8));
                hi.c cVar11 = new hi.c(this, arrayList2, ic1Var, linearLayout, actionBarPopupWindow$ActionBarPopupWindowLayout3, 9);
                for (int i31 = 0; i31 < arrayList.size(); i31++) {
                    org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, ((Integer) arrayList3.get(i31)).intValue(), (CharSequence) arrayList.get(i31), false, ttVar.c0);
                    c11.setTag(Integer.valueOf(i31));
                    c11.setOnClickListener(cVar11);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                linearLayout.addView(ic1Var, new LinearLayout.LayoutParams(actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() - AndroidUtilities.dp(16.0f), (int) (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() * 1.5f)));
                actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                frameLayout.setOnClickListener(new uf(actionBarPopupWindow$ActionBarPopupWindowLayout, 2));
                i0.c cVar12 = ttVar.q;
                int i32 = cVar12.d + cVar12.b;
                int min3 = ((int) (Math.min(ttVar.z.getWidth(), ttVar.z.getHeight() - i32) / 1.8f)) / 2;
                ttVar.z.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.a6.d(-2, -2.0f, 49, 0.0f, (AndroidUtilities.dp(84.0f) + ((int) ((ttVar.e + Math.max(r0 + min3, ((ttVar.z.getHeight() - i32) - ttVar.I) / 2)) + min3))) / AndroidUtilities.density, 0.0f, 0.0f));
                ttVar.L = actionBarPopupWindow$ActionBarPopupWindowLayout;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(-AndroidUtilities.dp(12.0f));
                ttVar.L.setAlpha(0.0f);
                view = ttVar.L;
                view.setScaleX(0.8f);
                view2 = ttVar.L;
                view2.setScaleY(0.8f);
                view3 = ttVar.L;
                view3.setPivotY(0.0f);
                view4 = ttVar.L;
                view5 = ttVar.L;
                view4.setPivotX(view5.getMeasuredWidth() / 2.0f);
                view6 = ttVar.L;
                view6.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.wr.h).start();
                if (ttVar.P == null) {
                    org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(ttVar, ttVar.z.getContext(), UserConfig.selectedAccount, ttVar.c0);
                    ttVar.P = ybVar;
                    ybVar.N0 = true;
                    ybVar.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                    ttVar.P.setClipChildren(false);
                    ttVar.P.setClipToPadding(false);
                    ttVar.P.setVisibility(0);
                    ttVar.P.setHint(LocaleController.getString(R.string.StickersSetEmojiForSticker));
                    ttVar.P.setBubbleOffset(-AndroidUtilities.dp(105.0f));
                    ttVar.P.setMiniBubblesOffset(-AndroidUtilities.dp(14.0f));
                    FrameLayout frameLayout2 = new FrameLayout(ttVar.z.getContext());
                    ttVar.Q = frameLayout2;
                    frameLayout2.addView(ttVar.P, w7.a6.d(-2, 116.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                    ttVar.z.addView(ttVar.Q, w7.a6.d(-2, -2.0f, 1, 0.0f, 100.0f, 0.0f, 0.0f));
                }
                ttVar.P.setSelectedEmojis(ttVar.o);
                ttVar.P.setDelegate(new gt(ttVar));
                ttVar.P.p(null, null, false);
                ttVar.Q.setScaleY(0.6f);
                ttVar.Q.setScaleX(0.6f);
                ttVar.Q.setAlpha(0.0f);
                AndroidUtilities.runOnUIThread(new ft(ttVar, 2), 10L);
                ttVar.K = true;
                n7Var28 = ttVar.z;
                n7Var28.invalidate();
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                final int i33 = 1;
                int i34 = 0;
                i11 = ttVar.V;
                if (i11 != 0) {
                    i12 = ttVar.V;
                    if (i12 == 2) {
                        rtVar8 = ttVar.l;
                        if (rtVar8 != null) {
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = new ArrayList();
                            rtVar9 = ttVar.l;
                            i16 = ttVar.V;
                            if (rtVar9.k(i16)) {
                                arrayList5.add(LocaleController.getString(R.string.SendEmojiPreview));
                                org.telegram.ui.Cells.r6.o(R.drawable.msg_send, arrayList7, arrayList6, 0);
                            }
                            rtVar10 = ttVar.l;
                            document5 = ttVar.W;
                            Boolean P = rtVar10.P(document5);
                            if (P != null) {
                                if (P.booleanValue()) {
                                    arrayList5.add(LocaleController.getString(R.string.SetAsEmojiStatus));
                                    org.telegram.ui.Cells.r6.o(R.drawable.msg_smile_status, arrayList7, arrayList6, 1);
                                } else {
                                    arrayList5.add(LocaleController.getString(R.string.RemoveStatus));
                                    org.telegram.ui.Cells.r6.o(R.drawable.msg_smile_status, arrayList7, arrayList6, 2);
                                }
                            }
                            rtVar11 = ttVar.l;
                            document6 = ttVar.W;
                            if (rtVar11.C(document6)) {
                                arrayList5.add(LocaleController.getString(R.string.CopyEmojiPreview));
                                org.telegram.ui.Cells.r6.o(R.drawable.msg_copy, arrayList7, arrayList6, 3);
                            }
                            rtVar12 = ttVar.l;
                            document7 = ttVar.W;
                            if (rtVar12.N(document7)) {
                                arrayList5.add(LocaleController.getString(R.string.RemoveFromRecent));
                                org.telegram.ui.Cells.r6.o(R.drawable.msg_delete, arrayList7, arrayList6, 4);
                            }
                            i17 = ttVar.r;
                            MediaDataController mediaDataController = MediaDataController.getInstance(i17);
                            document8 = ttVar.W;
                            boolean isStickerInFavorites = mediaDataController.isStickerInFavorites(document8);
                            document9 = ttVar.W;
                            if (!MessageObject.isAnimatedEmoji(document9)) {
                                document10 = ttVar.W;
                                if (!MessageObject.isMaskDocument(document10)) {
                                    if (!isStickerInFavorites) {
                                        i18 = ttVar.r;
                                        if (MediaDataController.getInstance(i18).canAddStickerToFavorites()) {
                                            document11 = ttVar.W;
                                        }
                                    }
                                    arrayList5.add(LocaleController.getString(isStickerInFavorites ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                                    org.telegram.ui.Cells.r6.o(isStickerInFavorites ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList7, arrayList6, 5);
                                }
                            }
                            if (arrayList5.isEmpty()) {
                                return;
                            }
                            ttVar.K = true;
                            n7Var8 = ttVar.z;
                            n7Var8.invalidate();
                            int[] iArr = new int[arrayList7.size()];
                            for (int i35 = 0; i35 < arrayList7.size(); i35++) {
                                iArr[i35] = ((Integer) arrayList7.get(i35)).intValue();
                            }
                            org.telegram.ui.Components.gc0 gc0Var = new org.telegram.ui.Components.gc0(this, arrayList6, isStickerInFavorites);
                            boolean h = tt.h(ttVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            int i36 = 0;
                            while (i36 < arrayList5.size()) {
                                boolean z11 = !h && i36 == 0;
                                boolean z12 = i36 == arrayList5.size() + (-1);
                                int intValue = ((Integer) arrayList7.get(i36)).intValue();
                                CharSequence charSequence = (CharSequence) arrayList5.get(i36);
                                f6Var2 = ttVar.c0;
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(z11, z12, actionBarPopupWindow$ActionBarPopupWindowLayout4, intValue, charSequence, false, f6Var2);
                                if (((Integer) arrayList6.get(i36)).intValue() == 4) {
                                    c12.setIconColor(tt.d(ttVar, org.telegram.ui.ActionBar.j6.p7));
                                    c12.setTextColor(tt.d(ttVar, org.telegram.ui.ActionBar.j6.q7));
                                }
                                c12.setTag(Integer.valueOf(i36));
                                c12.setOnClickListener(gc0Var);
                                i36++;
                                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            nt ntVar = new nt(this, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                            ttVar.k = ntVar;
                            ntVar.e = true;
                            ntVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
                            ntVar.g = true;
                            ntVar.setOutsideTouchable(true);
                            ttVar.k.setClippingEnabled(true);
                            ttVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                            ttVar.k.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            ttVar.k.setInputMethodMode(2);
                            ttVar.k.getContentView().setFocusableInTouchMode(true);
                            cVar4 = ttVar.q;
                            int i37 = cVar4.d;
                            cVar5 = ttVar.q;
                            int i38 = i37 + cVar5.b;
                            cVar6 = ttVar.q;
                            int i39 = cVar6.b;
                            n7Var9 = ttVar.z;
                            int width = n7Var9.getWidth();
                            n7Var10 = ttVar.z;
                            int min4 = Math.min(width, n7Var10.getHeight() - i38) - AndroidUtilities.dp(40.0f);
                            f13 = ttVar.e;
                            int i40 = min4 / 2;
                            int i41 = i39 + i40;
                            int dp2 = ttVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                            n7Var11 = ttVar.z;
                            float max = (int) (f13 + Math.max(i41 + dp2, ((n7Var11.getHeight() - i38) - ttVar.I) / 2) + i40);
                            float dp3 = AndroidUtilities.dp(24.0f);
                            f14 = ttVar.e;
                            int i42 = (int) ((dp3 - f14) + max);
                            org.telegram.ui.ActionBar.p1 p1Var = ttVar.k;
                            n7Var12 = ttVar.z;
                            n7Var13 = ttVar.z;
                            p1Var.showAtLocation(n7Var12, 0, (int) ((n7Var13.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth()) / 2.0f), i42);
                            org.telegram.ui.ActionBar.p1.i(actionBarPopupWindow$ActionBarPopupWindowLayout2);
                            try {
                                n7Var14 = ttVar.z;
                                n7Var14.performHapticFeedback(0);
                            } catch (Exception unused3) {
                            }
                            f15 = ttVar.e;
                            if (f15 != 0.0f) {
                                f16 = ttVar.e;
                                ttVar.f = f16;
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.jt
                                    public final /* synthetic */ pt b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        switch (i33) {
                                            case 0:
                                                tt ttVar2 = this.b.a;
                                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                ttVar2.g = floatValue;
                                                float f19 = ttVar2.f;
                                                ttVar2.e = com.google.android.gms.internal.vision.e2.z(0.0f, f19, floatValue, f19);
                                                ttVar2.z.invalidate();
                                                break;
                                            case 1:
                                                tt ttVar3 = this.b.a;
                                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                ttVar3.g = floatValue2;
                                                float f20 = ttVar3.f;
                                                ttVar3.e = com.google.android.gms.internal.vision.e2.z(0.0f, f20, floatValue2, f20);
                                                ttVar3.z.invalidate();
                                                break;
                                            default:
                                                tt ttVar4 = this.b.a;
                                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                ttVar4.g = floatValue3;
                                                float f21 = ttVar4.f;
                                                ttVar4.e = com.google.android.gms.internal.vision.e2.z(0.0f, f21, floatValue3, f21);
                                                ttVar4.z.invalidate();
                                                break;
                                        }
                                    }
                                });
                                ofFloat2.setDuration(350L);
                                ofFloat2.setInterpolator(org.telegram.ui.Components.wr.f);
                                ofFloat2.start();
                            }
                            i27 = 0;
                            while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount()) {
                                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout2.L.getChildAt(i27);
                                if (childAt instanceof org.telegram.ui.ActionBar.g1) {
                                    ((org.telegram.ui.ActionBar.g1) childAt).k(i27 == 0, i27 == actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount() + (-1));
                                }
                                i27++;
                            }
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    rtVar = ttVar.l;
                    if (rtVar != null) {
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        rtVar2 = ttVar.l;
                        i13 = ttVar.V;
                        if (rtVar2.k(i13)) {
                            rtVar7 = ttVar.l;
                            if (!rtVar7.c()) {
                                arrayList8.add(LocaleController.getString(R.string.SendGifPreview));
                                org.telegram.ui.Cells.r6.o(R.drawable.msg_send, arrayList10, arrayList9, 0);
                            }
                        }
                        rtVar3 = ttVar.l;
                        i14 = ttVar.V;
                        if (rtVar3.k(i14)) {
                            rtVar6 = ttVar.l;
                            if (!rtVar6.c()) {
                                arrayList8.add(LocaleController.getString(R.string.SendWithoutSound));
                                org.telegram.ui.Cells.r6.o(R.drawable.input_notify_off, arrayList10, arrayList9, 4);
                            }
                        }
                        rtVar4 = ttVar.l;
                        if (rtVar4.b()) {
                            arrayList8.add(LocaleController.getString(R.string.Schedule));
                            org.telegram.ui.Cells.r6.o(R.drawable.msg_autodelete, arrayList10, arrayList9, 3);
                        }
                        document = ttVar.W;
                        if (document != null) {
                            rtVar5 = ttVar.l;
                            document4 = ttVar.W;
                            if (rtVar5.e(document4)) {
                                arrayList8.add(LocaleController.getString(R.string.AddACaption));
                                org.telegram.ui.Cells.r6.n(R.drawable.outline_caption_24, 11, arrayList10, arrayList9);
                            }
                        }
                        document2 = ttVar.W;
                        if (document2 != null) {
                            i15 = ttVar.r;
                            MediaDataController mediaDataController2 = MediaDataController.getInstance(i15);
                            document3 = ttVar.W;
                            z10 = mediaDataController2.hasRecentGif(document3);
                            if (z10) {
                                arrayList8.add(LocaleController.formatString("Delete", R.string.Delete, new Object[0]));
                                org.telegram.ui.Cells.r6.o(R.drawable.msg_delete, arrayList10, arrayList9, 1);
                            } else {
                                arrayList8.add(LocaleController.formatString("SaveToGIFs", R.string.SaveToGIFs, new Object[0]));
                                org.telegram.ui.Cells.r6.o(R.drawable.msg_gif_add, arrayList10, arrayList9, 2);
                            }
                        } else {
                            z10 = false;
                        }
                        if (arrayList8.isEmpty()) {
                            return;
                        }
                        ttVar.K = true;
                        n7Var = ttVar.z;
                        n7Var.invalidate();
                        int[] iArr2 = new int[arrayList10.size()];
                        for (int i43 = 0; i43 < arrayList10.size(); i43++) {
                            iArr2[i43] = ((Integer) arrayList10.get(i43)).intValue();
                        }
                        org.telegram.ui.Components.u10 u10Var = new org.telegram.ui.Components.u10(25, this, arrayList9);
                        for (int i44 = 0; i44 < arrayList8.size(); i44++) {
                            int intValue2 = ((Integer) arrayList10.get(i44)).intValue();
                            CharSequence charSequence2 = (CharSequence) arrayList8.get(i44);
                            f6Var = ttVar.c0;
                            org.telegram.ui.ActionBar.g1 c13 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, intValue2, charSequence2, false, f6Var);
                            c13.setTag(Integer.valueOf(i44));
                            c13.setOnClickListener(u10Var);
                            if (z10 && i44 == arrayList8.size() - 1) {
                                c13.c(tt.d(ttVar, org.telegram.ui.ActionBar.j6.q7), tt.d(ttVar, org.telegram.ui.ActionBar.j6.p7));
                            }
                        }
                        ot otVar = new ot(this, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                        ttVar.k = otVar;
                        otVar.e = true;
                        otVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
                        otVar.g = true;
                        otVar.setOutsideTouchable(true);
                        ttVar.k.setClippingEnabled(true);
                        ttVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                        ttVar.k.setFocusable(true);
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                        ttVar.k.setInputMethodMode(2);
                        ttVar.k.getContentView().setFocusableInTouchMode(true);
                        cVar = ttVar.q;
                        int i45 = cVar.d;
                        cVar2 = ttVar.q;
                        int i46 = i45 + cVar2.b;
                        cVar3 = ttVar.q;
                        int i47 = cVar3.b;
                        n7Var2 = ttVar.z;
                        int width2 = n7Var2.getWidth();
                        n7Var3 = ttVar.z;
                        int min5 = Math.min(width2, n7Var3.getHeight() - i46) - AndroidUtilities.dp(40.0f);
                        f7 = ttVar.e;
                        int i48 = min5 / 2;
                        int i49 = i47 + i48;
                        int dp4 = ttVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                        n7Var4 = ttVar.z;
                        float max2 = (int) (f7 + Math.max(i49 + dp4, ((n7Var4.getHeight() - i46) - ttVar.I) / 2) + i48);
                        float dp5 = AndroidUtilities.dp(24.0f);
                        f10 = ttVar.e;
                        int i50 = (int) ((dp5 - f10) + max2);
                        org.telegram.ui.ActionBar.p1 p1Var2 = ttVar.k;
                        n7Var5 = ttVar.z;
                        n7Var6 = ttVar.z;
                        p1Var2.showAtLocation(n7Var5, 0, (int) ((n7Var6.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth()) / 2.0f), i50);
                        try {
                            n7Var7 = ttVar.z;
                            n7Var7.performHapticFeedback(0);
                        } catch (Exception unused4) {
                        }
                        f11 = ttVar.e;
                        if (f11 != 0.0f) {
                            f12 = ttVar.e;
                            ttVar.f = f12;
                            final int i51 = 2;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.jt
                                public final /* synthetic */ pt b;

                                {
                                    this.b = this;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (i51) {
                                        case 0:
                                            tt ttVar2 = this.b.a;
                                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            ttVar2.g = floatValue;
                                            float f19 = ttVar2.f;
                                            ttVar2.e = com.google.android.gms.internal.vision.e2.z(0.0f, f19, floatValue, f19);
                                            ttVar2.z.invalidate();
                                            break;
                                        case 1:
                                            tt ttVar3 = this.b.a;
                                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            ttVar3.g = floatValue2;
                                            float f20 = ttVar3.f;
                                            ttVar3.e = com.google.android.gms.internal.vision.e2.z(0.0f, f20, floatValue2, f20);
                                            ttVar3.z.invalidate();
                                            break;
                                        default:
                                            tt ttVar4 = this.b.a;
                                            float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            ttVar4.g = floatValue3;
                                            float f21 = ttVar4.f;
                                            ttVar4.e = com.google.android.gms.internal.vision.e2.z(0.0f, f21, floatValue3, f21);
                                            ttVar4.z.invalidate();
                                            break;
                                    }
                                }
                            });
                            ofFloat3.setDuration(350L);
                            ofFloat3.setInterpolator(org.telegram.ui.Components.wr.f);
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
                document12 = ttVar.W;
                if (MessageObject.isPremiumSticker(document12)) {
                    i26 = ttVar.r;
                    if (!AccountInstance.getInstance(i26).getUserConfig().isPremium()) {
                        if (ttVar.O == null) {
                            nh1 nh1Var = new nh1(ttVar.z.getContext(), ttVar.c0);
                            ttVar.O = nh1Var;
                            ttVar.z.addView(nh1Var, w7.a6.c(-1.0f, -1));
                            ttVar.O.setOnClickListener(new ht(ttVar, i34));
                            ttVar.O.a.r.setOnClickListener(new ht(ttVar, i33));
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(ttVar.O, false, 1.0f, false);
                        AndroidUtilities.updateViewVisibilityAnimated(ttVar.O, true);
                        ttVar.O.setTranslationY(0.0f);
                        ttVar.K = true;
                        n7Var26 = ttVar.z;
                        n7Var26.invalidate();
                        try {
                            n7Var27 = ttVar.z;
                            n7Var27.performHapticFeedback(0);
                            return;
                        } catch (Exception unused5) {
                            return;
                        }
                    }
                }
                i19 = ttVar.r;
                MediaDataController mediaDataController3 = MediaDataController.getInstance(i19);
                document13 = ttVar.W;
                boolean isStickerInFavorites2 = mediaDataController3.isStickerInFavorites(document13);
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                rtVar13 = ttVar.l;
                if (rtVar13 != null) {
                    rtVar20 = ttVar.l;
                    i24 = ttVar.V;
                    if (rtVar20.k(i24)) {
                        rtVar25 = ttVar.l;
                        if (!rtVar25.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendStickerPreview));
                            org.telegram.ui.Cells.r6.o(R.drawable.msg_send, arrayList13, arrayList12, 0);
                        }
                    }
                    rtVar21 = ttVar.l;
                    i25 = ttVar.V;
                    if (rtVar21.k(i25)) {
                        rtVar24 = ttVar.l;
                        if (!rtVar24.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendWithoutSound));
                            org.telegram.ui.Cells.r6.n(R.drawable.input_notify_off, 6, arrayList13, arrayList12);
                        }
                    }
                    rtVar22 = ttVar.l;
                    if (rtVar22.b()) {
                        arrayList11.add(LocaleController.getString(R.string.Schedule));
                        org.telegram.ui.Cells.r6.o(R.drawable.msg_autodelete, arrayList13, arrayList12, 3);
                    }
                    rtVar23 = ttVar.l;
                    if (rtVar23.f()) {
                        arrayList11.add(LocaleController.getString(R.string.ImportStickersRemoveMenu));
                        org.telegram.ui.Cells.r6.o(R.drawable.msg_delete, arrayList13, arrayList12, 5);
                    }
                }
                document14 = ttVar.W;
                if (!MessageObject.isMaskDocument(document14)) {
                    if (!isStickerInFavorites2) {
                        i23 = ttVar.r;
                        if (MediaDataController.getInstance(i23).canAddStickerToFavorites()) {
                            document16 = ttVar.W;
                        }
                    }
                    arrayList11.add(LocaleController.getString(isStickerInFavorites2 ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                    org.telegram.ui.Cells.r6.o(isStickerInFavorites2 ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList13, arrayList12, 2);
                }
                rtVar14 = ttVar.l;
                if (rtVar14 != null && (inputStickerSet = ttVar.a0) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                    rtVar19 = ttVar.l;
                    if (rtVar19.Q()) {
                        arrayList11.add(LocaleController.formatString(R.string.ViewPackPreview, new Object[0]));
                        org.telegram.ui.Cells.r6.o(R.drawable.msg_media, arrayList13, arrayList12, 1);
                    }
                }
                if (ttVar.p) {
                    arrayList11.add(LocaleController.getString(R.string.DeleteFromRecent));
                    org.telegram.ui.Cells.r6.o(R.drawable.msg_delete, arrayList13, arrayList12, 4);
                }
                if (ttVar.a0 != null) {
                    document15 = ttVar.W;
                    if (document15 != null) {
                        i22 = ttVar.r;
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i22).getStickerSet(ttVar.a0, true);
                        if (stickerSet != null) {
                            rtVar17 = ttVar.l;
                            if (rtVar17 != null) {
                                rtVar18 = ttVar.l;
                                if (rtVar18.B()) {
                                    TLRPC.StickerSet stickerSet2 = stickerSet.set;
                                    if (!stickerSet2.emojis && !stickerSet2.masks) {
                                        arrayList11.add(LocaleController.getString(R.string.EditSticker));
                                        org.telegram.ui.Cells.r6.n(R.drawable.msg_edit, 7, arrayList13, arrayList12);
                                    }
                                }
                            }
                        }
                        if (stickerSet != null && stickerSet.set.creator) {
                            rtVar15 = ttVar.l;
                            if (rtVar15 != null) {
                                rtVar16 = ttVar.l;
                                unused = ttVar.W;
                                if (rtVar16.H()) {
                                    arrayList11.add(LocaleController.getString(R.string.DeleteSticker));
                                    org.telegram.ui.Cells.r6.n(R.drawable.msg_delete, 8, arrayList13, arrayList12);
                                }
                            }
                        }
                    }
                }
                if (arrayList11.isEmpty()) {
                    return;
                }
                ttVar.K = true;
                n7Var15 = ttVar.z;
                n7Var15.invalidate();
                lt ltVar = new lt(this, arrayList12, isStickerInFavorites2);
                tt.h(ttVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                for (int i52 = 0; i52 < arrayList11.size(); i52++) {
                    int intValue3 = ((Integer) arrayList13.get(i52)).intValue();
                    CharSequence charSequence3 = (CharSequence) arrayList11.get(i52);
                    f6Var3 = ttVar.c0;
                    org.telegram.ui.ActionBar.g1 c14 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, intValue3, charSequence3, false, f6Var3);
                    c14.setTag(Integer.valueOf(i52));
                    c14.setOnClickListener(ltVar);
                    if (((Integer) arrayList12.get(i52)).intValue() == 8) {
                        int d10 = tt.d(ttVar, org.telegram.ui.ActionBar.j6.q7);
                        c14.c(d10, d10);
                        c14.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.1f, d10));
                    }
                }
                mt mtVar = new mt(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                ttVar.k = mtVar;
                mtVar.e = true;
                mtVar.c = 100;
                mtVar.g = true;
                mtVar.setOutsideTouchable(true);
                ttVar.k.setClippingEnabled(true);
                ttVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                ttVar.k.setFocusable(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                ttVar.k.setInputMethodMode(2);
                ttVar.k.getContentView().setFocusableInTouchMode(true);
                cVar7 = ttVar.q;
                int i53 = cVar7.d;
                cVar8 = ttVar.q;
                int i54 = i53 + cVar8.b;
                cVar9 = ttVar.q;
                int i55 = cVar9.b;
                i20 = ttVar.V;
                if (i20 == 1) {
                    n7Var24 = ttVar.z;
                    int width3 = n7Var24.getWidth();
                    n7Var25 = ttVar.z;
                    i21 = Math.min(width3, n7Var25.getHeight() - i54) - AndroidUtilities.dp(40.0f);
                } else {
                    if (ttVar.S) {
                        n7Var18 = ttVar.z;
                        int width4 = n7Var18.getWidth();
                        n7Var19 = ttVar.z;
                        min = Math.min(width4, n7Var19.getHeight() - i54) - AndroidUtilities.dpf2(40.0f);
                    } else {
                        n7Var16 = ttVar.z;
                        int width5 = n7Var16.getWidth();
                        n7Var17 = ttVar.z;
                        min = Math.min(width5, n7Var17.getHeight() - i54) / 1.8f;
                    }
                    i21 = (int) min;
                }
                f17 = ttVar.e;
                int i56 = i21 / 2;
                int i57 = i55 + i56;
                int dp6 = ttVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                n7Var20 = ttVar.z;
                int dp7 = AndroidUtilities.dp(24.0f) + ((int) (f17 + Math.max(i57 + dp6, ((n7Var20.getHeight() - i54) - ttVar.I) / 2) + i56));
                if (ttVar.S) {
                    dp7 += AndroidUtilities.dp(24.0f);
                }
                org.telegram.ui.ActionBar.p1 p1Var3 = ttVar.k;
                n7Var21 = ttVar.z;
                n7Var22 = ttVar.z;
                p1Var3.showAtLocation(n7Var21, 0, (int) ((n7Var22.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), dp7);
                try {
                    n7Var23 = ttVar.z;
                    n7Var23.performHapticFeedback(0);
                } catch (Exception unused6) {
                }
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            i27 = 0;
            while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount()) {
            }
        }
        i10 = 1;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout32 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, ttVar.z.getContext(), ttVar.c0);
        org.telegram.ui.ActionBar.f6 f6Var42 = null;
        bh.d c102 = aVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout32, null, true);
        c102.n(dh.c.k(ttVar.c0));
        c102.p(AndroidUtilities.dp(12.0f));
        c102.o(AndroidUtilities.dp(8.0f));
        c102.h.e = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout32.setBackground(c102);
        if (ttVar.V != 3) {
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        i27 = 0;
        while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount()) {
        }
    }
}
