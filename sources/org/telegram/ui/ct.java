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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ct implements Runnable {
    public final /* synthetic */ gt a;

    public ct(gt gtVar) {
        this.a = gtVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x065d, code lost:
    
        if (org.telegram.messenger.MessageObject.isStickerHasSet(r0) != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0987, code lost:
    
        if (org.telegram.messenger.MessageObject.isStickerHasSet(r6) != false) goto L230;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0dba  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        int i12;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        et etVar;
        et etVar2;
        int i13;
        et etVar3;
        int i14;
        et etVar4;
        TLRPC.Document document;
        TLRPC.Document document2;
        boolean z10;
        ah.v vVar;
        i0.b bVar;
        i0.b bVar2;
        i0.b bVar3;
        ah.v vVar2;
        ah.v vVar3;
        float f7;
        ah.v vVar4;
        float f10;
        ah.v vVar5;
        ah.v vVar6;
        int i15;
        float f11;
        float f12;
        ah.v vVar7;
        org.telegram.ui.ActionBar.d6 d6Var;
        int i16;
        TLRPC.Document document3;
        et etVar5;
        TLRPC.Document document4;
        et etVar6;
        et etVar7;
        et etVar8;
        et etVar9;
        int i17;
        et etVar10;
        TLRPC.Document document5;
        et etVar11;
        TLRPC.Document document6;
        et etVar12;
        TLRPC.Document document7;
        int i18;
        TLRPC.Document document8;
        TLRPC.Document document9;
        ah.v vVar8;
        i0.b bVar4;
        i0.b bVar5;
        i0.b bVar6;
        ah.v vVar9;
        ah.v vVar10;
        float f13;
        ah.v vVar11;
        float f14;
        ah.v vVar12;
        ah.v vVar13;
        float f15;
        float f16;
        ah.v vVar14;
        org.telegram.ui.ActionBar.d6 d6Var2;
        TLRPC.Document document10;
        int i19;
        TLRPC.Document document11;
        TLRPC.Document document12;
        int i20;
        TLRPC.Document document13;
        et etVar13;
        TLRPC.Document document14;
        et etVar14;
        ah.v vVar15;
        i0.b bVar7;
        i0.b bVar8;
        i0.b bVar9;
        int i21;
        ah.v vVar16;
        ah.v vVar17;
        float min;
        int i22;
        ah.v vVar18;
        ah.v vVar19;
        float f17;
        ah.v vVar20;
        ah.v vVar21;
        ah.v vVar22;
        ah.v vVar23;
        ah.v vVar24;
        ah.v vVar25;
        org.telegram.ui.ActionBar.d6 d6Var3;
        TLRPC.Document document15;
        int i23;
        et etVar15;
        et etVar16;
        et etVar17;
        et etVar18;
        TLRPC.InputStickerSet inputStickerSet;
        et etVar19;
        int i24;
        TLRPC.Document document16;
        et etVar20;
        int i25;
        et etVar21;
        int i26;
        et etVar22;
        et etVar23;
        et etVar24;
        et etVar25;
        int i27;
        boolean z11;
        ah.v vVar26;
        ah.v vVar27;
        int i28;
        ua1 ua1Var;
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        ah.v vVar28;
        org.telegram.ui.Components.i80 u10;
        TLRPC.Document unused;
        gt gtVar = this.a;
        bh.b bVar10 = gtVar.t;
        if (gtVar.w == null || gtVar.m) {
            return;
        }
        gtVar.R = true;
        et etVar26 = gtVar.l;
        final int i29 = 0;
        if (etVar26 != null && (u10 = etVar26.u(gtVar.z)) != null) {
            u10.Q(bVar10, fh.c.k(gtVar.c0), true);
            u10.t = false;
            u10.Y();
            u10.p = new vi(this, 17);
            ViewGroup viewGroup = u10.A;
            xs xsVar = new xs(this, viewGroup);
            gtVar.k = xsVar;
            xsVar.e = true;
            xsVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
            xsVar.g = true;
            xsVar.setOutsideTouchable(true);
            gtVar.k.setClippingEnabled(true);
            gtVar.k.setAnimationStyle(R.style.PopupContextAnimation);
            gtVar.k.setFocusable(true);
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            gtVar.k.setInputMethodMode(2);
            gtVar.k.getContentView().setFocusableInTouchMode(true);
            i0.b bVar11 = gtVar.q;
            int min2 = (Math.min(gtVar.z.getWidth(), gtVar.z.getHeight() - (bVar11.d + bVar11.b)) - AndroidUtilities.dp(40.0f)) / 2;
            int dp = (int) ((AndroidUtilities.dp(24.0f) - gtVar.e) + ((int) (gtVar.e + Math.max(r3 + min2 + (gtVar.G != null ? AndroidUtilities.dp(40.0f) : 0), ((gtVar.z.getHeight() - r4) - gtVar.I) / 2) + min2)));
            gtVar.k.showAtLocation(gtVar.z, 0, (int) ((r5.getMeasuredWidth() - viewGroup.getMeasuredWidth()) / 2.0f), dp);
            try {
                gtVar.z.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            float f18 = gtVar.e;
            if (f18 != 0.0f) {
                gtVar.f = f18;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ws
                    public final /* synthetic */ ct b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i29) {
                            case 0:
                                gt gtVar2 = this.b.a;
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                gtVar2.g = floatValue;
                                float f19 = gtVar2.f;
                                gtVar2.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f19, floatValue, f19);
                                gtVar2.z.invalidate();
                                break;
                            case 1:
                                gt gtVar3 = this.b.a;
                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                gtVar3.g = floatValue2;
                                float f20 = gtVar3.f;
                                gtVar3.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f20, floatValue2, f20);
                                gtVar3.z.invalidate();
                                break;
                            default:
                                gt gtVar4 = this.b.a;
                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                gtVar4.g = floatValue3;
                                float f21 = gtVar4.f;
                                gtVar4.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f21, floatValue3, f21);
                                gtVar4.z.invalidate();
                                break;
                        }
                    }
                });
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(org.telegram.ui.Components.bs.f);
                ofFloat.start();
            }
            gtVar.K = true;
            return;
        }
        if (gtVar.V != 3) {
            et etVar27 = gtVar.l;
            if (etVar27 != null) {
                TLRPC.TL_messageMediaPoll d = etVar27.d();
                TLRPC.PollAnswer g10 = gtVar.l.g();
                if (d != null && d.poll != null && g10 != null) {
                    TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(d, g10.option);
                    if (pollResult != null && pollResult.voters > 0) {
                        MessageObject.canShowVotersList(d);
                    }
                }
            }
            i10 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, gtVar.z.getContext(), gtVar.c0);
            org.telegram.ui.ActionBar.d6 d6Var4 = null;
            dh.d c10 = bVar10.c(actionBarPopupWindow$ActionBarPopupWindowLayout2, null, true);
            c10.o(fh.c.k(gtVar.c0));
            c10.q(AndroidUtilities.dp(12.0f));
            c10.p(AndroidUtilities.dp(8.0f));
            c10.j.e = true;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackground(c10);
            int i30 = 6;
            int i31 = 7;
            if (gtVar.V != 3) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (gtVar.T == null) {
                    et etVar28 = gtVar.l;
                    if (etVar28 == null || !etVar28.B()) {
                        if (gtVar.l.y()) {
                            arrayList.add(LocaleController.getString(R.string.SendStickerPreview));
                            org.telegram.ui.Cells.c1.p(R.drawable.msg_send, arrayList3, arrayList2, 0);
                        }
                        arrayList.add(LocaleController.getString(R.string.AddToFavorites));
                        org.telegram.ui.Cells.c1.p(R.drawable.msg_fave, arrayList3, arrayList2, 1);
                    } else {
                        arrayList.add(LocaleController.getString(R.string.SetIntroSticker));
                        org.telegram.ui.Cells.c1.p(R.drawable.menu_sticker_add, arrayList3, arrayList2, 0);
                    }
                }
                et etVar29 = gtVar.l;
                if (etVar29 == null || !etVar29.B()) {
                    et etVar30 = gtVar.l;
                    arrayList.add(LocaleController.getString((etVar30 == null || !etVar30.J()) ? R.string.AddToStickerPack : R.string.StickersReplaceSticker));
                    et etVar31 = gtVar.l;
                    org.telegram.ui.Cells.c1.p((etVar31 == null || !etVar31.J()) ? R.drawable.menu_sticker_add : R.drawable.msg_replace, arrayList3, arrayList2, 2);
                }
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, gtVar.w, gtVar.c0, true, false);
                e1Var.setItemHeight(44);
                e1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                e1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                FrameLayout frameLayout = new FrameLayout(gtVar.z.getContext());
                LinearLayout linearLayout = new LinearLayout(gtVar.z.getContext());
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, gtVar.c0));
                linearLayout.setOrientation(1);
                if (gtVar.w == null) {
                    ua1Var = null;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new TLRPC.TL_stickerSetNoCovered());
                    TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = new TLRPC.TL_messages_getMyStickers();
                    tL_messages_getMyStickers.limit = 100;
                    ConnectionsManager.getInstance(gtVar.r).sendRequest(tL_messages_getMyStickers, new ea(gtVar, arrayList4, tL_messages_getMyStickers, i31));
                    ua1Var = new ua1(gtVar.w, i31, d6Var4);
                    ua1Var.setLayoutManager(new s4.b0());
                    ua1Var.i(new ei.q1(arrayList4, 4));
                    ua1Var.setAdapter(new dt(gtVar, arrayList4));
                }
                ua1Var.setOnItemClickListener(new i(this, i30));
                frameLayout.addView(e1Var);
                linearLayout.addView(frameLayout);
                linearLayout.addView(new org.telegram.ui.ActionBar.j1(gtVar.z.getContext(), gtVar.c0), w7.z5.n(-1, 8));
                ua1 ua1Var2 = ua1Var;
                ci.e0 e0Var = new ci.e0(this, arrayList2, ua1Var2, linearLayout, actionBarPopupWindow$ActionBarPopupWindowLayout2, 13);
                for (int i32 = 0; i32 < arrayList.size(); i32++) {
                    org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, ((Integer) arrayList3.get(i32)).intValue(), (CharSequence) arrayList.get(i32), false, gtVar.c0);
                    c11.setTag(Integer.valueOf(i32));
                    c11.setOnClickListener(e0Var);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                linearLayout.addView(ua1Var2, new LinearLayout.LayoutParams(actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth() - AndroidUtilities.dp(16.0f), (int) (actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredHeight() * 1.5f)));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.b(linearLayout);
                frameLayout.setOnClickListener(new of(actionBarPopupWindow$ActionBarPopupWindowLayout2, 2));
                i0.b bVar12 = gtVar.q;
                int i33 = bVar12.d + bVar12.b;
                int min3 = ((int) (Math.min(gtVar.z.getWidth(), gtVar.z.getHeight() - i33) / 1.8f)) / 2;
                gtVar.z.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, w7.z5.a(-2.0f, 0.0f, (AndroidUtilities.dp(84.0f) + ((int) ((gtVar.e + Math.max(r0 + min3, ((gtVar.z.getHeight() - i33) - gtVar.I) / 2)) + min3))) / AndroidUtilities.density, 0.0f, 0.0f, -2, 49));
                gtVar.L = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setTranslationY(-AndroidUtilities.dp(12.0f));
                gtVar.L.setAlpha(0.0f);
                view = gtVar.L;
                view.setScaleX(0.8f);
                view2 = gtVar.L;
                view2.setScaleY(0.8f);
                view3 = gtVar.L;
                view3.setPivotY(0.0f);
                view4 = gtVar.L;
                view5 = gtVar.L;
                view4.setPivotX(view5.getMeasuredWidth() / 2.0f);
                view6 = gtVar.L;
                view6.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.bs.h).start();
                if (gtVar.P == null) {
                    org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(gtVar, gtVar.z.getContext(), UserConfig.selectedAccount, gtVar.c0);
                    gtVar.P = zbVar;
                    zbVar.N0 = true;
                    zbVar.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                    gtVar.P.setClipChildren(false);
                    gtVar.P.setClipToPadding(false);
                    gtVar.P.setVisibility(0);
                    gtVar.P.setHint(LocaleController.getString(R.string.StickersSetEmojiForSticker));
                    gtVar.P.setBubbleOffset(-AndroidUtilities.dp(105.0f));
                    gtVar.P.setMiniBubblesOffset(-AndroidUtilities.dp(14.0f));
                    FrameLayout frameLayout2 = new FrameLayout(gtVar.z.getContext());
                    gtVar.Q = frameLayout2;
                    frameLayout2.addView(gtVar.P, w7.z5.a(116.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 1));
                    gtVar.z.addView(gtVar.Q, w7.z5.a(-2.0f, 0.0f, 100.0f, 0.0f, 0.0f, -2, 1));
                }
                gtVar.P.setSelectedEmojis(gtVar.o);
                gtVar.P.setDelegate(new us(gtVar));
                gtVar.P.p(null, null, false);
                gtVar.Q.setScaleY(0.6f);
                gtVar.Q.setScaleX(0.6f);
                gtVar.Q.setAlpha(0.0f);
                AndroidUtilities.runOnUIThread(new ts(gtVar, 2), 10L);
                gtVar.K = true;
                vVar28 = gtVar.z;
                vVar28.invalidate();
            } else {
                int i34 = 0;
                i11 = gtVar.V;
                if (i11 != 0) {
                    i12 = gtVar.V;
                    if (i12 == 2) {
                        etVar8 = gtVar.l;
                        if (etVar8 != null) {
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = new ArrayList();
                            etVar9 = gtVar.l;
                            i17 = gtVar.V;
                            if (etVar9.k(i17)) {
                                arrayList5.add(LocaleController.getString(R.string.SendEmojiPreview));
                                org.telegram.ui.Cells.c1.p(R.drawable.msg_send, arrayList7, arrayList6, 0);
                            }
                            etVar10 = gtVar.l;
                            document5 = gtVar.W;
                            Boolean P = etVar10.P(document5);
                            if (P != null) {
                                if (P.booleanValue()) {
                                    arrayList5.add(LocaleController.getString(R.string.SetAsEmojiStatus));
                                    org.telegram.ui.Cells.c1.p(R.drawable.msg_smile_status, arrayList7, arrayList6, 1);
                                } else {
                                    arrayList5.add(LocaleController.getString(R.string.RemoveStatus));
                                    org.telegram.ui.Cells.c1.p(R.drawable.msg_smile_status, arrayList7, arrayList6, 2);
                                }
                            }
                            etVar11 = gtVar.l;
                            document6 = gtVar.W;
                            if (etVar11.E(document6)) {
                                arrayList5.add(LocaleController.getString(R.string.CopyEmojiPreview));
                                org.telegram.ui.Cells.c1.p(R.drawable.msg_copy, arrayList7, arrayList6, 3);
                            }
                            etVar12 = gtVar.l;
                            document7 = gtVar.W;
                            if (etVar12.N(document7)) {
                                arrayList5.add(LocaleController.getString(R.string.RemoveFromRecent));
                                org.telegram.ui.Cells.c1.p(R.drawable.msg_delete, arrayList7, arrayList6, 4);
                            }
                            i18 = gtVar.r;
                            MediaDataController mediaDataController = MediaDataController.getInstance(i18);
                            document8 = gtVar.W;
                            boolean isStickerInFavorites = mediaDataController.isStickerInFavorites(document8);
                            document9 = gtVar.W;
                            if (!MessageObject.isAnimatedEmoji(document9)) {
                                document10 = gtVar.W;
                                if (!MessageObject.isMaskDocument(document10)) {
                                    if (!isStickerInFavorites) {
                                        i19 = gtVar.r;
                                        if (MediaDataController.getInstance(i19).canAddStickerToFavorites()) {
                                            document11 = gtVar.W;
                                        }
                                    }
                                    arrayList5.add(LocaleController.getString(isStickerInFavorites ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                                    org.telegram.ui.Cells.c1.p(isStickerInFavorites ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList7, arrayList6, 5);
                                }
                            }
                            if (arrayList5.isEmpty()) {
                                return;
                            }
                            gtVar.K = true;
                            vVar8 = gtVar.z;
                            vVar8.invalidate();
                            int[] iArr = new int[arrayList7.size()];
                            for (int i35 = 0; i35 < arrayList7.size(); i35++) {
                                iArr[i35] = ((Integer) arrayList7.get(i35)).intValue();
                            }
                            org.telegram.ui.Components.qc0 qc0Var = new org.telegram.ui.Components.qc0(this, arrayList6, isStickerInFavorites);
                            boolean h = gt.h(gtVar, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                            int i36 = 0;
                            while (i36 < arrayList5.size()) {
                                boolean z12 = !h && i36 == 0;
                                boolean z13 = i36 == arrayList5.size() + (-1);
                                int intValue = ((Integer) arrayList7.get(i36)).intValue();
                                CharSequence charSequence = (CharSequence) arrayList5.get(i36);
                                d6Var2 = gtVar.c0;
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                                org.telegram.ui.ActionBar.e1 c12 = org.telegram.ui.ActionBar.u0.c(z12, z13, actionBarPopupWindow$ActionBarPopupWindowLayout3, intValue, charSequence, false, d6Var2);
                                if (((Integer) arrayList6.get(i36)).intValue() == 4) {
                                    c12.setIconColor(gt.d(gtVar, org.telegram.ui.ActionBar.h6.p7));
                                    c12.setTextColor(gt.d(gtVar, org.telegram.ui.ActionBar.h6.q7));
                                }
                                c12.setTag(Integer.valueOf(i36));
                                c12.setOnClickListener(qc0Var);
                                i36++;
                                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                            at atVar = new at(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            gtVar.k = atVar;
                            atVar.e = true;
                            atVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
                            atVar.g = true;
                            atVar.setOutsideTouchable(true);
                            gtVar.k.setClippingEnabled(true);
                            gtVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                            gtVar.k.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            gtVar.k.setInputMethodMode(2);
                            gtVar.k.getContentView().setFocusableInTouchMode(true);
                            bVar4 = gtVar.q;
                            int i37 = bVar4.d;
                            bVar5 = gtVar.q;
                            int i38 = i37 + bVar5.b;
                            bVar6 = gtVar.q;
                            int i39 = bVar6.b;
                            vVar9 = gtVar.z;
                            int width = vVar9.getWidth();
                            vVar10 = gtVar.z;
                            int min4 = Math.min(width, vVar10.getHeight() - i38) - AndroidUtilities.dp(40.0f);
                            f13 = gtVar.e;
                            int i40 = min4 / 2;
                            int i41 = i39 + i40;
                            int dp2 = gtVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                            vVar11 = gtVar.z;
                            float max = (int) (f13 + Math.max(i41 + dp2, ((vVar11.getHeight() - i38) - gtVar.I) / 2) + i40);
                            float dp3 = AndroidUtilities.dp(24.0f);
                            f14 = gtVar.e;
                            int i42 = (int) ((dp3 - f14) + max);
                            org.telegram.ui.ActionBar.m1 m1Var = gtVar.k;
                            vVar12 = gtVar.z;
                            vVar13 = gtVar.z;
                            m1Var.showAtLocation(vVar12, 0, (int) ((vVar13.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i42);
                            org.telegram.ui.ActionBar.m1.i(actionBarPopupWindow$ActionBarPopupWindowLayout);
                            try {
                                vVar14 = gtVar.z;
                                vVar14.performHapticFeedback(0);
                            } catch (Exception unused3) {
                            }
                            f15 = gtVar.e;
                            if (f15 != 0.0f) {
                                f16 = gtVar.e;
                                gtVar.f = f16;
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                final int i43 = 1;
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ws
                                    public final /* synthetic */ ct b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        switch (i43) {
                                            case 0:
                                                gt gtVar2 = this.b.a;
                                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                gtVar2.g = floatValue;
                                                float f19 = gtVar2.f;
                                                gtVar2.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f19, floatValue, f19);
                                                gtVar2.z.invalidate();
                                                break;
                                            case 1:
                                                gt gtVar3 = this.b.a;
                                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                gtVar3.g = floatValue2;
                                                float f20 = gtVar3.f;
                                                gtVar3.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f20, floatValue2, f20);
                                                gtVar3.z.invalidate();
                                                break;
                                            default:
                                                gt gtVar4 = this.b.a;
                                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                gtVar4.g = floatValue3;
                                                float f21 = gtVar4.f;
                                                gtVar4.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f21, floatValue3, f21);
                                                gtVar4.z.invalidate();
                                                break;
                                        }
                                    }
                                });
                                ofFloat2.setDuration(350L);
                                ofFloat2.setInterpolator(org.telegram.ui.Components.bs.f);
                                ofFloat2.start();
                            }
                            i15 = 0;
                            i28 = i15;
                            while (i28 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i28);
                                if (childAt instanceof org.telegram.ui.ActionBar.e1) {
                                    ((org.telegram.ui.ActionBar.e1) childAt).k(i28 == 0 ? 1 : i15, i28 == actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() + (-1) ? 1 : i15);
                                }
                                i28++;
                            }
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                    etVar = gtVar.l;
                    if (etVar != null) {
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        etVar2 = gtVar.l;
                        i13 = gtVar.V;
                        if (etVar2.k(i13)) {
                            etVar7 = gtVar.l;
                            if (!etVar7.c()) {
                                arrayList8.add(LocaleController.getString(R.string.SendGifPreview));
                                org.telegram.ui.Cells.c1.p(R.drawable.msg_send, arrayList10, arrayList9, 0);
                            }
                        }
                        etVar3 = gtVar.l;
                        i14 = gtVar.V;
                        if (etVar3.k(i14)) {
                            etVar6 = gtVar.l;
                            if (!etVar6.c()) {
                                arrayList8.add(LocaleController.getString(R.string.SendWithoutSound));
                                org.telegram.ui.Cells.c1.p(R.drawable.input_notify_off, arrayList10, arrayList9, 4);
                            }
                        }
                        etVar4 = gtVar.l;
                        if (etVar4.b()) {
                            arrayList8.add(LocaleController.getString(R.string.Schedule));
                            org.telegram.ui.Cells.c1.p(R.drawable.msg_autodelete, arrayList10, arrayList9, 3);
                        }
                        document = gtVar.W;
                        if (document != null) {
                            etVar5 = gtVar.l;
                            document4 = gtVar.W;
                            if (etVar5.e(document4)) {
                                arrayList8.add(LocaleController.getString(R.string.AddACaption));
                                org.telegram.ui.Cells.c1.m(R.drawable.outline_caption_24, 11, arrayList10, arrayList9);
                            }
                        }
                        document2 = gtVar.W;
                        if (document2 != null) {
                            i16 = gtVar.r;
                            MediaDataController mediaDataController2 = MediaDataController.getInstance(i16);
                            document3 = gtVar.W;
                            z10 = mediaDataController2.hasRecentGif(document3);
                            if (z10) {
                                arrayList8.add(LocaleController.formatString("Delete", R.string.Delete, new Object[0]));
                                org.telegram.ui.Cells.c1.p(R.drawable.msg_delete, arrayList10, arrayList9, 1);
                            } else {
                                arrayList8.add(LocaleController.formatString("SaveToGIFs", R.string.SaveToGIFs, new Object[0]));
                                org.telegram.ui.Cells.c1.p(R.drawable.msg_gif_add, arrayList10, arrayList9, 2);
                            }
                        } else {
                            z10 = false;
                        }
                        if (arrayList8.isEmpty()) {
                            return;
                        }
                        gtVar.K = true;
                        vVar = gtVar.z;
                        vVar.invalidate();
                        int[] iArr2 = new int[arrayList10.size()];
                        for (int i44 = 0; i44 < arrayList10.size(); i44++) {
                            iArr2[i44] = ((Integer) arrayList10.get(i44)).intValue();
                        }
                        org.telegram.ui.Components.g51 g51Var = new org.telegram.ui.Components.g51(8, this, arrayList9);
                        for (int i45 = 0; i45 < arrayList8.size(); i45++) {
                            int intValue2 = ((Integer) arrayList10.get(i45)).intValue();
                            CharSequence charSequence2 = (CharSequence) arrayList8.get(i45);
                            d6Var = gtVar.c0;
                            org.telegram.ui.ActionBar.e1 c13 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, intValue2, charSequence2, false, d6Var);
                            c13.setTag(Integer.valueOf(i45));
                            c13.setOnClickListener(g51Var);
                            if (z10 && i45 == arrayList8.size() - 1) {
                                c13.c(gt.d(gtVar, org.telegram.ui.ActionBar.h6.q7), gt.d(gtVar, org.telegram.ui.ActionBar.h6.p7));
                            }
                        }
                        bt btVar = new bt(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                        gtVar.k = btVar;
                        btVar.e = true;
                        btVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
                        btVar.g = true;
                        btVar.setOutsideTouchable(true);
                        gtVar.k.setClippingEnabled(true);
                        gtVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                        gtVar.k.setFocusable(true);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                        gtVar.k.setInputMethodMode(2);
                        gtVar.k.getContentView().setFocusableInTouchMode(true);
                        bVar = gtVar.q;
                        int i46 = bVar.d;
                        bVar2 = gtVar.q;
                        int i47 = i46 + bVar2.b;
                        bVar3 = gtVar.q;
                        int i48 = bVar3.b;
                        vVar2 = gtVar.z;
                        int width2 = vVar2.getWidth();
                        vVar3 = gtVar.z;
                        int min5 = Math.min(width2, vVar3.getHeight() - i47) - AndroidUtilities.dp(40.0f);
                        f7 = gtVar.e;
                        int i49 = min5 / 2;
                        int i50 = i48 + i49;
                        int dp4 = gtVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                        vVar4 = gtVar.z;
                        float max2 = (int) (f7 + Math.max(i50 + dp4, ((vVar4.getHeight() - i47) - gtVar.I) / 2) + i49);
                        float dp5 = AndroidUtilities.dp(24.0f);
                        f10 = gtVar.e;
                        int i51 = (int) ((dp5 - f10) + max2);
                        org.telegram.ui.ActionBar.m1 m1Var2 = gtVar.k;
                        vVar5 = gtVar.z;
                        vVar6 = gtVar.z;
                        i15 = 0;
                        m1Var2.showAtLocation(vVar5, 0, (int) ((vVar6.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i51);
                        try {
                            vVar7 = gtVar.z;
                            vVar7.performHapticFeedback(0);
                        } catch (Exception unused4) {
                        }
                        f11 = gtVar.e;
                        if (f11 != 0.0f) {
                            f12 = gtVar.e;
                            gtVar.f = f12;
                            final int i52 = 2;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ws
                                public final /* synthetic */ ct b;

                                {
                                    this.b = this;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (i52) {
                                        case 0:
                                            gt gtVar2 = this.b.a;
                                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            gtVar2.g = floatValue;
                                            float f19 = gtVar2.f;
                                            gtVar2.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f19, floatValue, f19);
                                            gtVar2.z.invalidate();
                                            break;
                                        case 1:
                                            gt gtVar3 = this.b.a;
                                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            gtVar3.g = floatValue2;
                                            float f20 = gtVar3.f;
                                            gtVar3.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f20, floatValue2, f20);
                                            gtVar3.z.invalidate();
                                            break;
                                        default:
                                            gt gtVar4 = this.b.a;
                                            float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            gtVar4.g = floatValue3;
                                            float f21 = gtVar4.f;
                                            gtVar4.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f21, floatValue3, f21);
                                            gtVar4.z.invalidate();
                                            break;
                                    }
                                }
                            });
                            ofFloat3.setDuration(350L);
                            ofFloat3.setInterpolator(org.telegram.ui.Components.bs.f);
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
                document12 = gtVar.W;
                if (MessageObject.isPremiumSticker(document12)) {
                    i27 = gtVar.r;
                    if (!AccountInstance.getInstance(i27).getUserConfig().isPremium()) {
                        if (gtVar.O == null) {
                            yf1 yf1Var = new yf1(gtVar.z.getContext(), gtVar.c0);
                            gtVar.O = yf1Var;
                            gtVar.z.addView(yf1Var, w7.z5.d(-1.0f, -1));
                            gtVar.O.setOnClickListener(new vs(gtVar, i34));
                            z11 = true;
                            gtVar.O.a.r.setOnClickListener(new vs(gtVar, 1 == true ? 1 : 0));
                        } else {
                            z11 = true;
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(gtVar.O, false, 1.0f, false);
                        AndroidUtilities.updateViewVisibilityAnimated(gtVar.O, z11);
                        gtVar.O.setTranslationY(0.0f);
                        gtVar.K = true;
                        vVar26 = gtVar.z;
                        vVar26.invalidate();
                        try {
                            vVar27 = gtVar.z;
                            vVar27.performHapticFeedback(0);
                            return;
                        } catch (Exception unused5) {
                            return;
                        }
                    }
                }
                i20 = gtVar.r;
                MediaDataController mediaDataController3 = MediaDataController.getInstance(i20);
                document13 = gtVar.W;
                boolean isStickerInFavorites2 = mediaDataController3.isStickerInFavorites(document13);
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                etVar13 = gtVar.l;
                if (etVar13 != null) {
                    etVar20 = gtVar.l;
                    i25 = gtVar.V;
                    if (etVar20.k(i25)) {
                        etVar25 = gtVar.l;
                        if (!etVar25.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendStickerPreview));
                            org.telegram.ui.Cells.c1.p(R.drawable.msg_send, arrayList13, arrayList12, 0);
                        }
                    }
                    etVar21 = gtVar.l;
                    i26 = gtVar.V;
                    if (etVar21.k(i26)) {
                        etVar24 = gtVar.l;
                        if (!etVar24.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendWithoutSound));
                            org.telegram.ui.Cells.c1.m(R.drawable.input_notify_off, 6, arrayList13, arrayList12);
                        }
                    }
                    etVar22 = gtVar.l;
                    if (etVar22.b()) {
                        arrayList11.add(LocaleController.getString(R.string.Schedule));
                        org.telegram.ui.Cells.c1.p(R.drawable.msg_autodelete, arrayList13, arrayList12, 3);
                    }
                    etVar23 = gtVar.l;
                    if (etVar23.f()) {
                        arrayList11.add(LocaleController.getString(R.string.ImportStickersRemoveMenu));
                        org.telegram.ui.Cells.c1.p(R.drawable.msg_delete, arrayList13, arrayList12, 5);
                    }
                }
                document14 = gtVar.W;
                if (!MessageObject.isMaskDocument(document14)) {
                    if (!isStickerInFavorites2) {
                        i24 = gtVar.r;
                        if (MediaDataController.getInstance(i24).canAddStickerToFavorites()) {
                            document16 = gtVar.W;
                        }
                    }
                    arrayList11.add(LocaleController.getString(isStickerInFavorites2 ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                    org.telegram.ui.Cells.c1.p(isStickerInFavorites2 ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList13, arrayList12, 2);
                }
                etVar14 = gtVar.l;
                if (etVar14 != null && (inputStickerSet = gtVar.a0) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                    etVar19 = gtVar.l;
                    if (etVar19.Q()) {
                        arrayList11.add(LocaleController.formatString(R.string.ViewPackPreview, new Object[0]));
                        org.telegram.ui.Cells.c1.p(R.drawable.msg_media, arrayList13, arrayList12, 1);
                    }
                }
                if (gtVar.p) {
                    arrayList11.add(LocaleController.getString(R.string.DeleteFromRecent));
                    org.telegram.ui.Cells.c1.p(R.drawable.msg_delete, arrayList13, arrayList12, 4);
                }
                if (gtVar.a0 != null) {
                    document15 = gtVar.W;
                    if (document15 != null) {
                        i23 = gtVar.r;
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i23).getStickerSet(gtVar.a0, true);
                        if (stickerSet != null) {
                            etVar17 = gtVar.l;
                            if (etVar17 != null) {
                                etVar18 = gtVar.l;
                                if (etVar18.D()) {
                                    TLRPC.StickerSet stickerSet2 = stickerSet.set;
                                    if (!stickerSet2.emojis && !stickerSet2.masks) {
                                        arrayList11.add(LocaleController.getString(R.string.EditSticker));
                                        org.telegram.ui.Cells.c1.m(R.drawable.msg_edit, 7, arrayList13, arrayList12);
                                    }
                                }
                            }
                        }
                        if (stickerSet != null && stickerSet.set.creator) {
                            etVar15 = gtVar.l;
                            if (etVar15 != null) {
                                etVar16 = gtVar.l;
                                unused = gtVar.W;
                                if (etVar16.I()) {
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
                gtVar.K = true;
                vVar15 = gtVar.z;
                vVar15.invalidate();
                ys ysVar = new ys(this, arrayList12, isStickerInFavorites2);
                gt.h(gtVar, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                for (int i53 = 0; i53 < arrayList11.size(); i53++) {
                    int intValue3 = ((Integer) arrayList13.get(i53)).intValue();
                    CharSequence charSequence3 = (CharSequence) arrayList11.get(i53);
                    d6Var3 = gtVar.c0;
                    org.telegram.ui.ActionBar.e1 c14 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, intValue3, charSequence3, false, d6Var3);
                    c14.setTag(Integer.valueOf(i53));
                    c14.setOnClickListener(ysVar);
                    if (((Integer) arrayList12.get(i53)).intValue() == 8) {
                        int d10 = gt.d(gtVar, org.telegram.ui.ActionBar.h6.q7);
                        c14.c(d10, d10);
                        c14.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.1f, d10));
                    }
                }
                zs zsVar = new zs(this, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                gtVar.k = zsVar;
                zsVar.e = true;
                zsVar.c = 100;
                zsVar.g = true;
                zsVar.setOutsideTouchable(true);
                gtVar.k.setClippingEnabled(true);
                gtVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                gtVar.k.setFocusable(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                gtVar.k.setInputMethodMode(2);
                gtVar.k.getContentView().setFocusableInTouchMode(true);
                bVar7 = gtVar.q;
                int i54 = bVar7.d;
                bVar8 = gtVar.q;
                int i55 = i54 + bVar8.b;
                bVar9 = gtVar.q;
                int i56 = bVar9.b;
                i21 = gtVar.V;
                if (i21 == 1) {
                    vVar24 = gtVar.z;
                    int width3 = vVar24.getWidth();
                    vVar25 = gtVar.z;
                    i22 = Math.min(width3, vVar25.getHeight() - i55) - AndroidUtilities.dp(40.0f);
                } else {
                    if (gtVar.S) {
                        vVar18 = gtVar.z;
                        int width4 = vVar18.getWidth();
                        vVar19 = gtVar.z;
                        min = Math.min(width4, vVar19.getHeight() - i55) - AndroidUtilities.dpf2(40.0f);
                    } else {
                        vVar16 = gtVar.z;
                        int width5 = vVar16.getWidth();
                        vVar17 = gtVar.z;
                        min = Math.min(width5, vVar17.getHeight() - i55) / 1.8f;
                    }
                    i22 = (int) min;
                }
                f17 = gtVar.e;
                int i57 = i22 / 2;
                int i58 = i56 + i57;
                int dp6 = gtVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                vVar20 = gtVar.z;
                int dp7 = AndroidUtilities.dp(24.0f) + ((int) (f17 + Math.max(i58 + dp6, ((vVar20.getHeight() - i55) - gtVar.I) / 2) + i57));
                if (gtVar.S) {
                    dp7 += AndroidUtilities.dp(24.0f);
                }
                org.telegram.ui.ActionBar.m1 m1Var3 = gtVar.k;
                vVar21 = gtVar.z;
                vVar22 = gtVar.z;
                m1Var3.showAtLocation(vVar21, 0, (int) ((vVar22.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth()) / 2.0f), dp7);
                try {
                    vVar23 = gtVar.z;
                    vVar23.performHapticFeedback(0);
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
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout22 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, gtVar.z.getContext(), gtVar.c0);
        org.telegram.ui.ActionBar.d6 d6Var42 = null;
        dh.d c102 = bVar10.c(actionBarPopupWindow$ActionBarPopupWindowLayout22, null, true);
        c102.o(fh.c.k(gtVar.c0));
        c102.q(AndroidUtilities.dp(12.0f));
        c102.p(AndroidUtilities.dp(8.0f));
        c102.j.e = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout22.setBackground(c102);
        int i302 = 6;
        int i312 = 7;
        if (gtVar.V != 3) {
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout22;
        i15 = 0;
        i28 = i15;
        while (i28 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
        }
    }
}
