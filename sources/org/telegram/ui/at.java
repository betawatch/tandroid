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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class at implements Runnable {
    public final /* synthetic */ et a;

    public at(et etVar) {
        this.a = etVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x065c, code lost:
    
        if (org.telegram.messenger.MessageObject.isStickerHasSet(r0) != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0986, code lost:
    
        if (org.telegram.messenger.MessageObject.isStickerHasSet(r6) != false) goto L230;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0db9  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        int i12;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        ct ctVar;
        ct ctVar2;
        int i13;
        ct ctVar3;
        int i14;
        ct ctVar4;
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
        ct ctVar5;
        TLRPC.Document document4;
        ct ctVar6;
        ct ctVar7;
        ct ctVar8;
        ct ctVar9;
        int i17;
        ct ctVar10;
        TLRPC.Document document5;
        ct ctVar11;
        TLRPC.Document document6;
        ct ctVar12;
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
        ct ctVar13;
        TLRPC.Document document14;
        ct ctVar14;
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
        ct ctVar15;
        ct ctVar16;
        ct ctVar17;
        ct ctVar18;
        TLRPC.InputStickerSet inputStickerSet;
        ct ctVar19;
        int i24;
        TLRPC.Document document16;
        ct ctVar20;
        int i25;
        ct ctVar21;
        int i26;
        ct ctVar22;
        ct ctVar23;
        ct ctVar24;
        ct ctVar25;
        int i27;
        boolean z11;
        ah.v vVar26;
        ah.v vVar27;
        int i28;
        sa1 sa1Var;
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        ah.v vVar28;
        org.telegram.ui.Components.i80 u10;
        TLRPC.Document unused;
        et etVar = this.a;
        bh.b bVar10 = etVar.t;
        if (etVar.w == null || etVar.m) {
            return;
        }
        etVar.R = true;
        ct ctVar26 = etVar.l;
        final int i29 = 0;
        if (ctVar26 != null && (u10 = ctVar26.u(etVar.z)) != null) {
            u10.Q(bVar10, fh.c.k(etVar.c0), true);
            u10.t = false;
            u10.Y();
            u10.p = new ti(this, 17);
            ViewGroup viewGroup = u10.A;
            vs vsVar = new vs(this, viewGroup);
            etVar.k = vsVar;
            vsVar.e = true;
            vsVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
            vsVar.g = true;
            vsVar.setOutsideTouchable(true);
            etVar.k.setClippingEnabled(true);
            etVar.k.setAnimationStyle(R.style.PopupContextAnimation);
            etVar.k.setFocusable(true);
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            etVar.k.setInputMethodMode(2);
            etVar.k.getContentView().setFocusableInTouchMode(true);
            i0.b bVar11 = etVar.q;
            int min2 = (Math.min(etVar.z.getWidth(), etVar.z.getHeight() - (bVar11.d + bVar11.b)) - AndroidUtilities.dp(40.0f)) / 2;
            int dp = (int) ((AndroidUtilities.dp(24.0f) - etVar.e) + ((int) (etVar.e + Math.max(r3 + min2 + (etVar.G != null ? AndroidUtilities.dp(40.0f) : 0), ((etVar.z.getHeight() - r4) - etVar.I) / 2) + min2)));
            etVar.k.showAtLocation(etVar.z, 0, (int) ((r5.getMeasuredWidth() - viewGroup.getMeasuredWidth()) / 2.0f), dp);
            try {
                etVar.z.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            float f18 = etVar.e;
            if (f18 != 0.0f) {
                etVar.f = f18;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.us
                    public final /* synthetic */ at b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i29) {
                            case 0:
                                et etVar2 = this.b.a;
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                etVar2.g = floatValue;
                                float f19 = etVar2.f;
                                etVar2.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f19, floatValue, f19);
                                etVar2.z.invalidate();
                                break;
                            case 1:
                                et etVar3 = this.b.a;
                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                etVar3.g = floatValue2;
                                float f20 = etVar3.f;
                                etVar3.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f20, floatValue2, f20);
                                etVar3.z.invalidate();
                                break;
                            default:
                                et etVar4 = this.b.a;
                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                etVar4.g = floatValue3;
                                float f21 = etVar4.f;
                                etVar4.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f21, floatValue3, f21);
                                etVar4.z.invalidate();
                                break;
                        }
                    }
                });
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(org.telegram.ui.Components.bs.f);
                ofFloat.start();
            }
            etVar.K = true;
            return;
        }
        if (etVar.V != 3) {
            ct ctVar27 = etVar.l;
            if (ctVar27 != null) {
                TLRPC.TL_messageMediaPoll d = ctVar27.d();
                TLRPC.PollAnswer g10 = etVar.l.g();
                if (d != null && d.poll != null && g10 != null) {
                    TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(d, g10.option);
                    if (pollResult != null && pollResult.voters > 0) {
                        MessageObject.canShowVotersList(d);
                    }
                }
            }
            i10 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, etVar.z.getContext(), etVar.c0);
            org.telegram.ui.ActionBar.d6 d6Var4 = null;
            dh.d c10 = bVar10.c(actionBarPopupWindow$ActionBarPopupWindowLayout2, null, true);
            c10.o(fh.c.k(etVar.c0));
            c10.q(AndroidUtilities.dp(12.0f));
            c10.p(AndroidUtilities.dp(8.0f));
            c10.j.e = true;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackground(c10);
            int i30 = 6;
            int i31 = 7;
            if (etVar.V != 3) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (etVar.T == null) {
                    ct ctVar28 = etVar.l;
                    if (ctVar28 == null || !ctVar28.B()) {
                        if (etVar.l.y()) {
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
                ct ctVar29 = etVar.l;
                if (ctVar29 == null || !ctVar29.B()) {
                    ct ctVar30 = etVar.l;
                    arrayList.add(LocaleController.getString((ctVar30 == null || !ctVar30.J()) ? R.string.AddToStickerPack : R.string.StickersReplaceSticker));
                    ct ctVar31 = etVar.l;
                    org.telegram.ui.Cells.c1.p((ctVar31 == null || !ctVar31.J()) ? R.drawable.menu_sticker_add : R.drawable.msg_replace, arrayList3, arrayList2, 2);
                }
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, etVar.w, etVar.c0, true, false);
                e1Var.setItemHeight(44);
                e1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                e1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                FrameLayout frameLayout = new FrameLayout(etVar.z.getContext());
                LinearLayout linearLayout = new LinearLayout(etVar.z.getContext());
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, etVar.c0));
                linearLayout.setOrientation(1);
                if (etVar.w == null) {
                    sa1Var = null;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new TLRPC.TL_stickerSetNoCovered());
                    TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = new TLRPC.TL_messages_getMyStickers();
                    tL_messages_getMyStickers.limit = 100;
                    ConnectionsManager.getInstance(etVar.r).sendRequest(tL_messages_getMyStickers, new ca(etVar, arrayList4, tL_messages_getMyStickers, i31));
                    sa1Var = new sa1(etVar.w, i31, d6Var4);
                    sa1Var.setLayoutManager(new s4.b0());
                    sa1Var.i(new ei.q1(arrayList4, 4));
                    sa1Var.setAdapter(new bt(etVar, arrayList4));
                }
                sa1Var.setOnItemClickListener(new i(this, i30));
                frameLayout.addView(e1Var);
                linearLayout.addView(frameLayout);
                linearLayout.addView(new org.telegram.ui.ActionBar.j1(etVar.z.getContext(), etVar.c0), w7.z5.n(-1, 8));
                sa1 sa1Var2 = sa1Var;
                ci.e0 e0Var = new ci.e0(this, arrayList2, sa1Var2, linearLayout, actionBarPopupWindow$ActionBarPopupWindowLayout2, 13);
                for (int i32 = 0; i32 < arrayList.size(); i32++) {
                    org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, ((Integer) arrayList3.get(i32)).intValue(), (CharSequence) arrayList.get(i32), false, etVar.c0);
                    c11.setTag(Integer.valueOf(i32));
                    c11.setOnClickListener(e0Var);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                linearLayout.addView(sa1Var2, new LinearLayout.LayoutParams(actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth() - AndroidUtilities.dp(16.0f), (int) (actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredHeight() * 1.5f)));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.b(linearLayout);
                frameLayout.setOnClickListener(new mf(actionBarPopupWindow$ActionBarPopupWindowLayout2, 2));
                i0.b bVar12 = etVar.q;
                int i33 = bVar12.d + bVar12.b;
                int min3 = ((int) (Math.min(etVar.z.getWidth(), etVar.z.getHeight() - i33) / 1.8f)) / 2;
                etVar.z.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, w7.z5.d(-2, -2.0f, 49, 0.0f, (AndroidUtilities.dp(84.0f) + ((int) ((etVar.e + Math.max(r0 + min3, ((etVar.z.getHeight() - i33) - etVar.I) / 2)) + min3))) / AndroidUtilities.density, 0.0f, 0.0f));
                etVar.L = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setTranslationY(-AndroidUtilities.dp(12.0f));
                etVar.L.setAlpha(0.0f);
                view = etVar.L;
                view.setScaleX(0.8f);
                view2 = etVar.L;
                view2.setScaleY(0.8f);
                view3 = etVar.L;
                view3.setPivotY(0.0f);
                view4 = etVar.L;
                view5 = etVar.L;
                view4.setPivotX(view5.getMeasuredWidth() / 2.0f);
                view6 = etVar.L;
                view6.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.bs.h).start();
                if (etVar.P == null) {
                    org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(etVar, etVar.z.getContext(), UserConfig.selectedAccount, etVar.c0);
                    etVar.P = zbVar;
                    zbVar.N0 = true;
                    zbVar.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                    etVar.P.setClipChildren(false);
                    etVar.P.setClipToPadding(false);
                    etVar.P.setVisibility(0);
                    etVar.P.setHint(LocaleController.getString(R.string.StickersSetEmojiForSticker));
                    etVar.P.setBubbleOffset(-AndroidUtilities.dp(105.0f));
                    etVar.P.setMiniBubblesOffset(-AndroidUtilities.dp(14.0f));
                    FrameLayout frameLayout2 = new FrameLayout(etVar.z.getContext());
                    etVar.Q = frameLayout2;
                    frameLayout2.addView(etVar.P, w7.z5.d(-2, 116.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                    etVar.z.addView(etVar.Q, w7.z5.d(-2, -2.0f, 1, 0.0f, 100.0f, 0.0f, 0.0f));
                }
                etVar.P.setSelectedEmojis(etVar.o);
                etVar.P.setDelegate(new ss(etVar));
                etVar.P.p(null, null, false);
                etVar.Q.setScaleY(0.6f);
                etVar.Q.setScaleX(0.6f);
                etVar.Q.setAlpha(0.0f);
                AndroidUtilities.runOnUIThread(new rs(etVar, 2), 10L);
                etVar.K = true;
                vVar28 = etVar.z;
                vVar28.invalidate();
            } else {
                int i34 = 0;
                i11 = etVar.V;
                if (i11 != 0) {
                    i12 = etVar.V;
                    if (i12 == 2) {
                        ctVar8 = etVar.l;
                        if (ctVar8 != null) {
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = new ArrayList();
                            ctVar9 = etVar.l;
                            i17 = etVar.V;
                            if (ctVar9.k(i17)) {
                                arrayList5.add(LocaleController.getString(R.string.SendEmojiPreview));
                                org.telegram.ui.Cells.c1.p(R.drawable.msg_send, arrayList7, arrayList6, 0);
                            }
                            ctVar10 = etVar.l;
                            document5 = etVar.W;
                            Boolean P = ctVar10.P(document5);
                            if (P != null) {
                                if (P.booleanValue()) {
                                    arrayList5.add(LocaleController.getString(R.string.SetAsEmojiStatus));
                                    org.telegram.ui.Cells.c1.p(R.drawable.msg_smile_status, arrayList7, arrayList6, 1);
                                } else {
                                    arrayList5.add(LocaleController.getString(R.string.RemoveStatus));
                                    org.telegram.ui.Cells.c1.p(R.drawable.msg_smile_status, arrayList7, arrayList6, 2);
                                }
                            }
                            ctVar11 = etVar.l;
                            document6 = etVar.W;
                            if (ctVar11.E(document6)) {
                                arrayList5.add(LocaleController.getString(R.string.CopyEmojiPreview));
                                org.telegram.ui.Cells.c1.p(R.drawable.msg_copy, arrayList7, arrayList6, 3);
                            }
                            ctVar12 = etVar.l;
                            document7 = etVar.W;
                            if (ctVar12.N(document7)) {
                                arrayList5.add(LocaleController.getString(R.string.RemoveFromRecent));
                                org.telegram.ui.Cells.c1.p(R.drawable.msg_delete, arrayList7, arrayList6, 4);
                            }
                            i18 = etVar.r;
                            MediaDataController mediaDataController = MediaDataController.getInstance(i18);
                            document8 = etVar.W;
                            boolean isStickerInFavorites = mediaDataController.isStickerInFavorites(document8);
                            document9 = etVar.W;
                            if (!MessageObject.isAnimatedEmoji(document9)) {
                                document10 = etVar.W;
                                if (!MessageObject.isMaskDocument(document10)) {
                                    if (!isStickerInFavorites) {
                                        i19 = etVar.r;
                                        if (MediaDataController.getInstance(i19).canAddStickerToFavorites()) {
                                            document11 = etVar.W;
                                        }
                                    }
                                    arrayList5.add(LocaleController.getString(isStickerInFavorites ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                                    org.telegram.ui.Cells.c1.p(isStickerInFavorites ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList7, arrayList6, 5);
                                }
                            }
                            if (arrayList5.isEmpty()) {
                                return;
                            }
                            etVar.K = true;
                            vVar8 = etVar.z;
                            vVar8.invalidate();
                            int[] iArr = new int[arrayList7.size()];
                            for (int i35 = 0; i35 < arrayList7.size(); i35++) {
                                iArr[i35] = ((Integer) arrayList7.get(i35)).intValue();
                            }
                            org.telegram.ui.Components.qc0 qc0Var = new org.telegram.ui.Components.qc0(this, arrayList6, isStickerInFavorites);
                            boolean h = et.h(etVar, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                            int i36 = 0;
                            while (i36 < arrayList5.size()) {
                                boolean z12 = !h && i36 == 0;
                                boolean z13 = i36 == arrayList5.size() + (-1);
                                int intValue = ((Integer) arrayList7.get(i36)).intValue();
                                CharSequence charSequence = (CharSequence) arrayList5.get(i36);
                                d6Var2 = etVar.c0;
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                                org.telegram.ui.ActionBar.e1 c12 = org.telegram.ui.ActionBar.u0.c(z12, z13, actionBarPopupWindow$ActionBarPopupWindowLayout3, intValue, charSequence, false, d6Var2);
                                if (((Integer) arrayList6.get(i36)).intValue() == 4) {
                                    c12.setIconColor(et.d(etVar, org.telegram.ui.ActionBar.h6.p7));
                                    c12.setTextColor(et.d(etVar, org.telegram.ui.ActionBar.h6.q7));
                                }
                                c12.setTag(Integer.valueOf(i36));
                                c12.setOnClickListener(qc0Var);
                                i36++;
                                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                            ys ysVar = new ys(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            etVar.k = ysVar;
                            ysVar.e = true;
                            ysVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
                            ysVar.g = true;
                            ysVar.setOutsideTouchable(true);
                            etVar.k.setClippingEnabled(true);
                            etVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                            etVar.k.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            etVar.k.setInputMethodMode(2);
                            etVar.k.getContentView().setFocusableInTouchMode(true);
                            bVar4 = etVar.q;
                            int i37 = bVar4.d;
                            bVar5 = etVar.q;
                            int i38 = i37 + bVar5.b;
                            bVar6 = etVar.q;
                            int i39 = bVar6.b;
                            vVar9 = etVar.z;
                            int width = vVar9.getWidth();
                            vVar10 = etVar.z;
                            int min4 = Math.min(width, vVar10.getHeight() - i38) - AndroidUtilities.dp(40.0f);
                            f13 = etVar.e;
                            int i40 = min4 / 2;
                            int i41 = i39 + i40;
                            int dp2 = etVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                            vVar11 = etVar.z;
                            float max = (int) (f13 + Math.max(i41 + dp2, ((vVar11.getHeight() - i38) - etVar.I) / 2) + i40);
                            float dp3 = AndroidUtilities.dp(24.0f);
                            f14 = etVar.e;
                            int i42 = (int) ((dp3 - f14) + max);
                            org.telegram.ui.ActionBar.m1 m1Var = etVar.k;
                            vVar12 = etVar.z;
                            vVar13 = etVar.z;
                            m1Var.showAtLocation(vVar12, 0, (int) ((vVar13.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i42);
                            org.telegram.ui.ActionBar.m1.i(actionBarPopupWindow$ActionBarPopupWindowLayout);
                            try {
                                vVar14 = etVar.z;
                                vVar14.performHapticFeedback(0);
                            } catch (Exception unused3) {
                            }
                            f15 = etVar.e;
                            if (f15 != 0.0f) {
                                f16 = etVar.e;
                                etVar.f = f16;
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                final int i43 = 1;
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.us
                                    public final /* synthetic */ at b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        switch (i43) {
                                            case 0:
                                                et etVar2 = this.b.a;
                                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                etVar2.g = floatValue;
                                                float f19 = etVar2.f;
                                                etVar2.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f19, floatValue, f19);
                                                etVar2.z.invalidate();
                                                break;
                                            case 1:
                                                et etVar3 = this.b.a;
                                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                etVar3.g = floatValue2;
                                                float f20 = etVar3.f;
                                                etVar3.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f20, floatValue2, f20);
                                                etVar3.z.invalidate();
                                                break;
                                            default:
                                                et etVar4 = this.b.a;
                                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                etVar4.g = floatValue3;
                                                float f21 = etVar4.f;
                                                etVar4.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f21, floatValue3, f21);
                                                etVar4.z.invalidate();
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
                    ctVar = etVar.l;
                    if (ctVar != null) {
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        ctVar2 = etVar.l;
                        i13 = etVar.V;
                        if (ctVar2.k(i13)) {
                            ctVar7 = etVar.l;
                            if (!ctVar7.c()) {
                                arrayList8.add(LocaleController.getString(R.string.SendGifPreview));
                                org.telegram.ui.Cells.c1.p(R.drawable.msg_send, arrayList10, arrayList9, 0);
                            }
                        }
                        ctVar3 = etVar.l;
                        i14 = etVar.V;
                        if (ctVar3.k(i14)) {
                            ctVar6 = etVar.l;
                            if (!ctVar6.c()) {
                                arrayList8.add(LocaleController.getString(R.string.SendWithoutSound));
                                org.telegram.ui.Cells.c1.p(R.drawable.input_notify_off, arrayList10, arrayList9, 4);
                            }
                        }
                        ctVar4 = etVar.l;
                        if (ctVar4.b()) {
                            arrayList8.add(LocaleController.getString(R.string.Schedule));
                            org.telegram.ui.Cells.c1.p(R.drawable.msg_autodelete, arrayList10, arrayList9, 3);
                        }
                        document = etVar.W;
                        if (document != null) {
                            ctVar5 = etVar.l;
                            document4 = etVar.W;
                            if (ctVar5.e(document4)) {
                                arrayList8.add(LocaleController.getString(R.string.AddACaption));
                                org.telegram.ui.Cells.c1.m(R.drawable.outline_caption_24, 11, arrayList10, arrayList9);
                            }
                        }
                        document2 = etVar.W;
                        if (document2 != null) {
                            i16 = etVar.r;
                            MediaDataController mediaDataController2 = MediaDataController.getInstance(i16);
                            document3 = etVar.W;
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
                        etVar.K = true;
                        vVar = etVar.z;
                        vVar.invalidate();
                        int[] iArr2 = new int[arrayList10.size()];
                        for (int i44 = 0; i44 < arrayList10.size(); i44++) {
                            iArr2[i44] = ((Integer) arrayList10.get(i44)).intValue();
                        }
                        org.telegram.ui.Components.i51 i51Var = new org.telegram.ui.Components.i51(8, this, arrayList9);
                        for (int i45 = 0; i45 < arrayList8.size(); i45++) {
                            int intValue2 = ((Integer) arrayList10.get(i45)).intValue();
                            CharSequence charSequence2 = (CharSequence) arrayList8.get(i45);
                            d6Var = etVar.c0;
                            org.telegram.ui.ActionBar.e1 c13 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, intValue2, charSequence2, false, d6Var);
                            c13.setTag(Integer.valueOf(i45));
                            c13.setOnClickListener(i51Var);
                            if (z10 && i45 == arrayList8.size() - 1) {
                                c13.c(et.d(etVar, org.telegram.ui.ActionBar.h6.q7), et.d(etVar, org.telegram.ui.ActionBar.h6.p7));
                            }
                        }
                        zs zsVar = new zs(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                        etVar.k = zsVar;
                        zsVar.e = true;
                        zsVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
                        zsVar.g = true;
                        zsVar.setOutsideTouchable(true);
                        etVar.k.setClippingEnabled(true);
                        etVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                        etVar.k.setFocusable(true);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                        etVar.k.setInputMethodMode(2);
                        etVar.k.getContentView().setFocusableInTouchMode(true);
                        bVar = etVar.q;
                        int i46 = bVar.d;
                        bVar2 = etVar.q;
                        int i47 = i46 + bVar2.b;
                        bVar3 = etVar.q;
                        int i48 = bVar3.b;
                        vVar2 = etVar.z;
                        int width2 = vVar2.getWidth();
                        vVar3 = etVar.z;
                        int min5 = Math.min(width2, vVar3.getHeight() - i47) - AndroidUtilities.dp(40.0f);
                        f7 = etVar.e;
                        int i49 = min5 / 2;
                        int i50 = i48 + i49;
                        int dp4 = etVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                        vVar4 = etVar.z;
                        float max2 = (int) (f7 + Math.max(i50 + dp4, ((vVar4.getHeight() - i47) - etVar.I) / 2) + i49);
                        float dp5 = AndroidUtilities.dp(24.0f);
                        f10 = etVar.e;
                        int i51 = (int) ((dp5 - f10) + max2);
                        org.telegram.ui.ActionBar.m1 m1Var2 = etVar.k;
                        vVar5 = etVar.z;
                        vVar6 = etVar.z;
                        i15 = 0;
                        m1Var2.showAtLocation(vVar5, 0, (int) ((vVar6.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i51);
                        try {
                            vVar7 = etVar.z;
                            vVar7.performHapticFeedback(0);
                        } catch (Exception unused4) {
                        }
                        f11 = etVar.e;
                        if (f11 != 0.0f) {
                            f12 = etVar.e;
                            etVar.f = f12;
                            final int i52 = 2;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.us
                                public final /* synthetic */ at b;

                                {
                                    this.b = this;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (i52) {
                                        case 0:
                                            et etVar2 = this.b.a;
                                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            etVar2.g = floatValue;
                                            float f19 = etVar2.f;
                                            etVar2.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f19, floatValue, f19);
                                            etVar2.z.invalidate();
                                            break;
                                        case 1:
                                            et etVar3 = this.b.a;
                                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            etVar3.g = floatValue2;
                                            float f20 = etVar3.f;
                                            etVar3.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f20, floatValue2, f20);
                                            etVar3.z.invalidate();
                                            break;
                                        default:
                                            et etVar4 = this.b.a;
                                            float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            etVar4.g = floatValue3;
                                            float f21 = etVar4.f;
                                            etVar4.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f21, floatValue3, f21);
                                            etVar4.z.invalidate();
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
                document12 = etVar.W;
                if (MessageObject.isPremiumSticker(document12)) {
                    i27 = etVar.r;
                    if (!AccountInstance.getInstance(i27).getUserConfig().isPremium()) {
                        if (etVar.O == null) {
                            wf1 wf1Var = new wf1(etVar.z.getContext(), etVar.c0);
                            etVar.O = wf1Var;
                            etVar.z.addView(wf1Var, w7.z5.c(-1.0f, -1));
                            etVar.O.setOnClickListener(new ts(etVar, i34));
                            z11 = true;
                            etVar.O.a.r.setOnClickListener(new ts(etVar, 1 == true ? 1 : 0));
                        } else {
                            z11 = true;
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(etVar.O, false, 1.0f, false);
                        AndroidUtilities.updateViewVisibilityAnimated(etVar.O, z11);
                        etVar.O.setTranslationY(0.0f);
                        etVar.K = true;
                        vVar26 = etVar.z;
                        vVar26.invalidate();
                        try {
                            vVar27 = etVar.z;
                            vVar27.performHapticFeedback(0);
                            return;
                        } catch (Exception unused5) {
                            return;
                        }
                    }
                }
                i20 = etVar.r;
                MediaDataController mediaDataController3 = MediaDataController.getInstance(i20);
                document13 = etVar.W;
                boolean isStickerInFavorites2 = mediaDataController3.isStickerInFavorites(document13);
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                ctVar13 = etVar.l;
                if (ctVar13 != null) {
                    ctVar20 = etVar.l;
                    i25 = etVar.V;
                    if (ctVar20.k(i25)) {
                        ctVar25 = etVar.l;
                        if (!ctVar25.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendStickerPreview));
                            org.telegram.ui.Cells.c1.p(R.drawable.msg_send, arrayList13, arrayList12, 0);
                        }
                    }
                    ctVar21 = etVar.l;
                    i26 = etVar.V;
                    if (ctVar21.k(i26)) {
                        ctVar24 = etVar.l;
                        if (!ctVar24.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendWithoutSound));
                            org.telegram.ui.Cells.c1.m(R.drawable.input_notify_off, 6, arrayList13, arrayList12);
                        }
                    }
                    ctVar22 = etVar.l;
                    if (ctVar22.b()) {
                        arrayList11.add(LocaleController.getString(R.string.Schedule));
                        org.telegram.ui.Cells.c1.p(R.drawable.msg_autodelete, arrayList13, arrayList12, 3);
                    }
                    ctVar23 = etVar.l;
                    if (ctVar23.f()) {
                        arrayList11.add(LocaleController.getString(R.string.ImportStickersRemoveMenu));
                        org.telegram.ui.Cells.c1.p(R.drawable.msg_delete, arrayList13, arrayList12, 5);
                    }
                }
                document14 = etVar.W;
                if (!MessageObject.isMaskDocument(document14)) {
                    if (!isStickerInFavorites2) {
                        i24 = etVar.r;
                        if (MediaDataController.getInstance(i24).canAddStickerToFavorites()) {
                            document16 = etVar.W;
                        }
                    }
                    arrayList11.add(LocaleController.getString(isStickerInFavorites2 ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                    org.telegram.ui.Cells.c1.p(isStickerInFavorites2 ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList13, arrayList12, 2);
                }
                ctVar14 = etVar.l;
                if (ctVar14 != null && (inputStickerSet = etVar.a0) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                    ctVar19 = etVar.l;
                    if (ctVar19.Q()) {
                        arrayList11.add(LocaleController.formatString(R.string.ViewPackPreview, new Object[0]));
                        org.telegram.ui.Cells.c1.p(R.drawable.msg_media, arrayList13, arrayList12, 1);
                    }
                }
                if (etVar.p) {
                    arrayList11.add(LocaleController.getString(R.string.DeleteFromRecent));
                    org.telegram.ui.Cells.c1.p(R.drawable.msg_delete, arrayList13, arrayList12, 4);
                }
                if (etVar.a0 != null) {
                    document15 = etVar.W;
                    if (document15 != null) {
                        i23 = etVar.r;
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i23).getStickerSet(etVar.a0, true);
                        if (stickerSet != null) {
                            ctVar17 = etVar.l;
                            if (ctVar17 != null) {
                                ctVar18 = etVar.l;
                                if (ctVar18.D()) {
                                    TLRPC.StickerSet stickerSet2 = stickerSet.set;
                                    if (!stickerSet2.emojis && !stickerSet2.masks) {
                                        arrayList11.add(LocaleController.getString(R.string.EditSticker));
                                        org.telegram.ui.Cells.c1.m(R.drawable.msg_edit, 7, arrayList13, arrayList12);
                                    }
                                }
                            }
                        }
                        if (stickerSet != null && stickerSet.set.creator) {
                            ctVar15 = etVar.l;
                            if (ctVar15 != null) {
                                ctVar16 = etVar.l;
                                unused = etVar.W;
                                if (ctVar16.I()) {
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
                etVar.K = true;
                vVar15 = etVar.z;
                vVar15.invalidate();
                ws wsVar = new ws(this, arrayList12, isStickerInFavorites2);
                et.h(etVar, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                for (int i53 = 0; i53 < arrayList11.size(); i53++) {
                    int intValue3 = ((Integer) arrayList13.get(i53)).intValue();
                    CharSequence charSequence3 = (CharSequence) arrayList11.get(i53);
                    d6Var3 = etVar.c0;
                    org.telegram.ui.ActionBar.e1 c14 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, intValue3, charSequence3, false, d6Var3);
                    c14.setTag(Integer.valueOf(i53));
                    c14.setOnClickListener(wsVar);
                    if (((Integer) arrayList12.get(i53)).intValue() == 8) {
                        int d10 = et.d(etVar, org.telegram.ui.ActionBar.h6.q7);
                        c14.c(d10, d10);
                        c14.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.1f, d10));
                    }
                }
                xs xsVar = new xs(this, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                etVar.k = xsVar;
                xsVar.e = true;
                xsVar.c = 100;
                xsVar.g = true;
                xsVar.setOutsideTouchable(true);
                etVar.k.setClippingEnabled(true);
                etVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                etVar.k.setFocusable(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                etVar.k.setInputMethodMode(2);
                etVar.k.getContentView().setFocusableInTouchMode(true);
                bVar7 = etVar.q;
                int i54 = bVar7.d;
                bVar8 = etVar.q;
                int i55 = i54 + bVar8.b;
                bVar9 = etVar.q;
                int i56 = bVar9.b;
                i21 = etVar.V;
                if (i21 == 1) {
                    vVar24 = etVar.z;
                    int width3 = vVar24.getWidth();
                    vVar25 = etVar.z;
                    i22 = Math.min(width3, vVar25.getHeight() - i55) - AndroidUtilities.dp(40.0f);
                } else {
                    if (etVar.S) {
                        vVar18 = etVar.z;
                        int width4 = vVar18.getWidth();
                        vVar19 = etVar.z;
                        min = Math.min(width4, vVar19.getHeight() - i55) - AndroidUtilities.dpf2(40.0f);
                    } else {
                        vVar16 = etVar.z;
                        int width5 = vVar16.getWidth();
                        vVar17 = etVar.z;
                        min = Math.min(width5, vVar17.getHeight() - i55) / 1.8f;
                    }
                    i22 = (int) min;
                }
                f17 = etVar.e;
                int i57 = i22 / 2;
                int i58 = i56 + i57;
                int dp6 = etVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                vVar20 = etVar.z;
                int dp7 = AndroidUtilities.dp(24.0f) + ((int) (f17 + Math.max(i58 + dp6, ((vVar20.getHeight() - i55) - etVar.I) / 2) + i57));
                if (etVar.S) {
                    dp7 += AndroidUtilities.dp(24.0f);
                }
                org.telegram.ui.ActionBar.m1 m1Var3 = etVar.k;
                vVar21 = etVar.z;
                vVar22 = etVar.z;
                m1Var3.showAtLocation(vVar21, 0, (int) ((vVar22.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth()) / 2.0f), dp7);
                try {
                    vVar23 = etVar.z;
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
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout22 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, etVar.z.getContext(), etVar.c0);
        org.telegram.ui.ActionBar.d6 d6Var42 = null;
        dh.d c102 = bVar10.c(actionBarPopupWindow$ActionBarPopupWindowLayout22, null, true);
        c102.o(fh.c.k(etVar.c0));
        c102.q(AndroidUtilities.dp(12.0f));
        c102.p(AndroidUtilities.dp(8.0f));
        c102.j.e = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout22.setBackground(c102);
        int i302 = 6;
        int i312 = 7;
        if (etVar.V != 3) {
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout22;
        i15 = 0;
        i28 = i15;
        while (i28 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
        }
    }
}
