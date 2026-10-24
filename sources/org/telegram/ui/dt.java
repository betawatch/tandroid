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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class dt implements Runnable {
    public final /* synthetic */ ht a;

    public dt(ht htVar) {
        this.a = htVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x064a, code lost:
    
        if (org.telegram.messenger.MessageObject.isStickerHasSet(r0) != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x096c, code lost:
    
        if (org.telegram.messenger.MessageObject.isStickerHasSet(r6) != false) goto L230;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0d8c  */
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
        org.telegram.ui.ActionBar.g6 g6Var;
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
        org.telegram.ui.ActionBar.g6 g6Var2;
        TLRPC.Document document10;
        int i19;
        TLRPC.Document document11;
        TLRPC.Document document12;
        int i20;
        TLRPC.Document document13;
        ft ftVar13;
        TLRPC.Document document14;
        ft ftVar14;
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
        org.telegram.ui.ActionBar.g6 g6Var3;
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
        ah.v vVar26;
        ah.v vVar27;
        int i28;
        xa1 xa1Var;
        ah.v vVar28;
        org.telegram.ui.Components.j80 u10;
        TLRPC.Document unused;
        ht htVar = this.a;
        bh.b bVar10 = htVar.t;
        if (htVar.w == null || htVar.m) {
            return;
        }
        htVar.R = true;
        ft ftVar26 = htVar.l;
        final int i29 = 0;
        if (ftVar26 != null && (u10 = ftVar26.u(htVar.z)) != null) {
            u10.Q(bVar10, fh.c.k(htVar.c0), true);
            u10.t = false;
            u10.Y();
            u10.p = new ti(this, 17);
            ViewGroup viewGroup = u10.A;
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
                        switch (i29) {
                            case 0:
                                ht htVar2 = this.b.a;
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                htVar2.g = floatValue;
                                float f19 = htVar2.f;
                                htVar2.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f19, floatValue, f19);
                                htVar2.z.invalidate();
                                break;
                            case 1:
                                ht htVar3 = this.b.a;
                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                htVar3.g = floatValue2;
                                float f20 = htVar3.f;
                                htVar3.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f20, floatValue2, f20);
                                htVar3.z.invalidate();
                                break;
                            default:
                                ht htVar4 = this.b.a;
                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                htVar4.g = floatValue3;
                                float f21 = htVar4.f;
                                htVar4.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f21, floatValue3, f21);
                                htVar4.z.invalidate();
                                break;
                        }
                    }
                });
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(org.telegram.ui.Components.bs.f);
                ofFloat.start();
            }
            htVar.K = true;
            return;
        }
        if (htVar.V != 3) {
            ft ftVar27 = htVar.l;
            if (ftVar27 != null) {
                TLRPC.TL_messageMediaPoll d = ftVar27.d();
                TLRPC.PollAnswer g10 = htVar.l.g();
                if (d != null && d.poll != null && g10 != null) {
                    TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(d, g10.option);
                    if (pollResult != null && pollResult.voters > 0) {
                        MessageObject.canShowVotersList(d);
                    }
                }
            }
            i10 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, htVar.z.getContext(), htVar.c0);
            org.telegram.ui.ActionBar.g6 g6Var4 = null;
            dh.d c10 = bVar10.c(actionBarPopupWindow$ActionBarPopupWindowLayout2, null, true);
            c10.o(fh.c.k(htVar.c0));
            c10.q(AndroidUtilities.dp(12.0f));
            c10.p(AndroidUtilities.dp(8.0f));
            c10.v.e = true;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackground(c10);
            int i30 = 6;
            int i31 = 7;
            if (htVar.V != 3) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (htVar.T == null) {
                    ft ftVar28 = htVar.l;
                    if (ftVar28 == null || !ftVar28.B()) {
                        if (htVar.l.y()) {
                            arrayList.add(LocaleController.getString(R.string.SendStickerPreview));
                            org.telegram.ui.Cells.b1.q(R.drawable.msg_send, arrayList3, arrayList2, 0);
                        }
                        arrayList.add(LocaleController.getString(R.string.AddToFavorites));
                        org.telegram.ui.Cells.b1.q(R.drawable.msg_fave, arrayList3, arrayList2, 1);
                    } else {
                        arrayList.add(LocaleController.getString(R.string.SetIntroSticker));
                        org.telegram.ui.Cells.b1.q(R.drawable.menu_sticker_add, arrayList3, arrayList2, 0);
                    }
                }
                ft ftVar29 = htVar.l;
                if (ftVar29 == null || !ftVar29.B()) {
                    ft ftVar30 = htVar.l;
                    arrayList.add(LocaleController.getString((ftVar30 == null || !ftVar30.J()) ? R.string.AddToStickerPack : R.string.StickersReplaceSticker));
                    ft ftVar31 = htVar.l;
                    org.telegram.ui.Cells.b1.q((ftVar31 == null || !ftVar31.J()) ? R.drawable.menu_sticker_add : R.drawable.msg_replace, arrayList3, arrayList2, 2);
                }
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, htVar.w, htVar.c0, true, false);
                e1Var.setItemHeight(44);
                e1Var.j(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                e1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                FrameLayout frameLayout = new FrameLayout(htVar.z.getContext());
                LinearLayout linearLayout = new LinearLayout(htVar.z.getContext());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, linearLayout, htVar.c0);
                linearLayout.setOrientation(1);
                if (htVar.w == null) {
                    xa1Var = null;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new TLRPC.TL_stickerSetNoCovered());
                    TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = new TLRPC.TL_messages_getMyStickers();
                    tL_messages_getMyStickers.limit = 100;
                    ConnectionsManager.getInstance(htVar.r).sendRequest(tL_messages_getMyStickers, new ca(htVar, arrayList4, tL_messages_getMyStickers, i31));
                    xa1Var = new xa1(htVar.w, i31, g6Var4);
                    xa1Var.setLayoutManager(new s4.b0());
                    xa1Var.i(new ei.q1(arrayList4, 4));
                    xa1Var.setAdapter(new et(htVar, arrayList4));
                }
                xa1Var.setOnItemClickListener(new h(this, i30));
                frameLayout.addView(e1Var);
                linearLayout.addView(frameLayout);
                linearLayout.addView(new org.telegram.ui.ActionBar.j1(htVar.z.getContext(), htVar.c0), w7.z5.n(-1, 8));
                xa1 xa1Var2 = xa1Var;
                ci.e0 e0Var = new ci.e0(this, arrayList2, xa1Var2, linearLayout, actionBarPopupWindow$ActionBarPopupWindowLayout2, 13);
                for (int i32 = 0; i32 < arrayList.size(); i32++) {
                    org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, ((Integer) arrayList3.get(i32)).intValue(), (CharSequence) arrayList.get(i32), false, htVar.c0);
                    c11.setTag(Integer.valueOf(i32));
                    c11.setOnClickListener(e0Var);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                linearLayout.addView(xa1Var2, new LinearLayout.LayoutParams(actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth() - AndroidUtilities.dp(16.0f), (int) (actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredHeight() * 1.5f)));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.b(linearLayout);
                frameLayout.setOnClickListener(new mf(actionBarPopupWindow$ActionBarPopupWindowLayout2, 2));
                i0.b bVar12 = htVar.q;
                int i33 = bVar12.d + bVar12.b;
                int min3 = ((int) (Math.min(htVar.z.getWidth(), htVar.z.getHeight() - i33) / 1.8f)) / 2;
                htVar.z.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, w7.z5.d(-2, -2.0f, 49, 0.0f, (AndroidUtilities.dp(84.0f) + ((int) ((htVar.e + Math.max(r0 + min3, ((htVar.z.getHeight() - i33) - htVar.I) / 2)) + min3))) / AndroidUtilities.density, 0.0f, 0.0f));
                htVar.L = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setTranslationY(-AndroidUtilities.dp(12.0f));
                htVar.L.setAlpha(0.0f);
                htVar.L.setScaleX(0.8f);
                htVar.L.setScaleY(0.8f);
                htVar.L.setPivotY(0.0f);
                htVar.L.setPivotX(r0.getMeasuredWidth() / 2.0f);
                htVar.L.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.bs.h).start();
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
                    frameLayout2.addView(htVar.P, w7.z5.d(-2, 116.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                    htVar.z.addView(htVar.Q, w7.z5.d(-2, -2.0f, 1, 0.0f, 100.0f, 0.0f, 0.0f));
                }
                htVar.P.setSelectedEmojis(htVar.o);
                htVar.P.setDelegate(new vs(htVar));
                htVar.P.p(null, null, false);
                htVar.Q.setScaleY(0.6f);
                htVar.Q.setScaleX(0.6f);
                htVar.Q.setAlpha(0.0f);
                AndroidUtilities.runOnUIThread(new us(htVar, 2), 10L);
                htVar.K = true;
                vVar28 = htVar.z;
                vVar28.invalidate();
            } else {
                int i34 = 0;
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
                            if (ftVar9.k(i17)) {
                                arrayList5.add(LocaleController.getString(R.string.SendEmojiPreview));
                                org.telegram.ui.Cells.b1.q(R.drawable.msg_send, arrayList7, arrayList6, 0);
                            }
                            ftVar10 = htVar.l;
                            document5 = htVar.W;
                            Boolean P = ftVar10.P(document5);
                            if (P != null) {
                                if (P.booleanValue()) {
                                    arrayList5.add(LocaleController.getString(R.string.SetAsEmojiStatus));
                                    org.telegram.ui.Cells.b1.q(R.drawable.msg_smile_status, arrayList7, arrayList6, 1);
                                } else {
                                    arrayList5.add(LocaleController.getString(R.string.RemoveStatus));
                                    org.telegram.ui.Cells.b1.q(R.drawable.msg_smile_status, arrayList7, arrayList6, 2);
                                }
                            }
                            ftVar11 = htVar.l;
                            document6 = htVar.W;
                            if (ftVar11.E(document6)) {
                                arrayList5.add(LocaleController.getString(R.string.CopyEmojiPreview));
                                org.telegram.ui.Cells.b1.q(R.drawable.msg_copy, arrayList7, arrayList6, 3);
                            }
                            ftVar12 = htVar.l;
                            document7 = htVar.W;
                            if (ftVar12.N(document7)) {
                                arrayList5.add(LocaleController.getString(R.string.RemoveFromRecent));
                                org.telegram.ui.Cells.b1.q(R.drawable.msg_delete, arrayList7, arrayList6, 4);
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
                                    org.telegram.ui.Cells.b1.q(isStickerInFavorites ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList7, arrayList6, 5);
                                }
                            }
                            if (arrayList5.isEmpty()) {
                                return;
                            }
                            htVar.K = true;
                            vVar8 = htVar.z;
                            vVar8.invalidate();
                            int[] iArr = new int[arrayList7.size()];
                            for (int i35 = 0; i35 < arrayList7.size(); i35++) {
                                iArr[i35] = ((Integer) arrayList7.get(i35)).intValue();
                            }
                            org.telegram.ui.Components.tc0 tc0Var = new org.telegram.ui.Components.tc0(this, arrayList6, isStickerInFavorites);
                            boolean f19 = ht.f(htVar, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                            int i36 = 0;
                            while (i36 < arrayList5.size()) {
                                boolean z12 = !f19 && i36 == 0;
                                boolean z13 = i36 == arrayList5.size() + (-1);
                                int intValue = ((Integer) arrayList7.get(i36)).intValue();
                                CharSequence charSequence = (CharSequence) arrayList5.get(i36);
                                g6Var2 = htVar.c0;
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                                org.telegram.ui.ActionBar.e1 c12 = org.telegram.ui.ActionBar.u0.c(z12, z13, actionBarPopupWindow$ActionBarPopupWindowLayout3, intValue, charSequence, false, g6Var2);
                                if (((Integer) arrayList6.get(i36)).intValue() == 4) {
                                    c12.c(org.telegram.ui.ActionBar.k6.q7, org.telegram.ui.ActionBar.k6.p7);
                                }
                                c12.setTag(Integer.valueOf(i36));
                                c12.setOnClickListener(tc0Var);
                                i36++;
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
                            int i37 = bVar4.d;
                            bVar5 = htVar.q;
                            int i38 = i37 + bVar5.b;
                            bVar6 = htVar.q;
                            int i39 = bVar6.b;
                            vVar9 = htVar.z;
                            int width = vVar9.getWidth();
                            vVar10 = htVar.z;
                            int min4 = Math.min(width, vVar10.getHeight() - i38) - AndroidUtilities.dp(40.0f);
                            f13 = htVar.e;
                            int i40 = min4 / 2;
                            int i41 = i39 + i40;
                            int dp2 = htVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                            vVar11 = htVar.z;
                            float max = (int) (f13 + Math.max(i41 + dp2, ((vVar11.getHeight() - i38) - htVar.I) / 2) + i40);
                            float dp3 = AndroidUtilities.dp(24.0f);
                            f14 = htVar.e;
                            int i42 = (int) ((dp3 - f14) + max);
                            org.telegram.ui.ActionBar.m1 m1Var = htVar.k;
                            vVar12 = htVar.z;
                            vVar13 = htVar.z;
                            m1Var.showAtLocation(vVar12, 0, (int) ((vVar13.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i42);
                            org.telegram.ui.ActionBar.m1.i(actionBarPopupWindow$ActionBarPopupWindowLayout);
                            try {
                                vVar14 = htVar.z;
                                vVar14.performHapticFeedback(0);
                            } catch (Exception unused3) {
                            }
                            f15 = htVar.e;
                            if (f15 != 0.0f) {
                                f16 = htVar.e;
                                htVar.f = f16;
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                final int i43 = 1;
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.xs
                                    public final /* synthetic */ dt b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        switch (i43) {
                                            case 0:
                                                ht htVar2 = this.b.a;
                                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                htVar2.g = floatValue;
                                                float f192 = htVar2.f;
                                                htVar2.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f192, floatValue, f192);
                                                htVar2.z.invalidate();
                                                break;
                                            case 1:
                                                ht htVar3 = this.b.a;
                                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                htVar3.g = floatValue2;
                                                float f20 = htVar3.f;
                                                htVar3.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f20, floatValue2, f20);
                                                htVar3.z.invalidate();
                                                break;
                                            default:
                                                ht htVar4 = this.b.a;
                                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                htVar4.g = floatValue3;
                                                float f21 = htVar4.f;
                                                htVar4.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f21, floatValue3, f21);
                                                htVar4.z.invalidate();
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
                                    ((org.telegram.ui.ActionBar.e1) childAt).n(i28 == 0 ? 1 : i15, i28 == actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() + (-1) ? 1 : i15);
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
                        if (ftVar2.k(i13)) {
                            ftVar7 = htVar.l;
                            if (!ftVar7.c()) {
                                arrayList8.add(LocaleController.getString(R.string.SendGifPreview));
                                org.telegram.ui.Cells.b1.q(R.drawable.msg_send, arrayList10, arrayList9, 0);
                            }
                        }
                        ftVar3 = htVar.l;
                        i14 = htVar.V;
                        if (ftVar3.k(i14)) {
                            ftVar6 = htVar.l;
                            if (!ftVar6.c()) {
                                arrayList8.add(LocaleController.getString(R.string.SendWithoutSound));
                                org.telegram.ui.Cells.b1.q(R.drawable.input_notify_off, arrayList10, arrayList9, 4);
                            }
                        }
                        ftVar4 = htVar.l;
                        if (ftVar4.b()) {
                            arrayList8.add(LocaleController.getString(R.string.Schedule));
                            org.telegram.ui.Cells.b1.q(R.drawable.msg_autodelete, arrayList10, arrayList9, 3);
                        }
                        document = htVar.W;
                        if (document != null) {
                            ftVar5 = htVar.l;
                            document4 = htVar.W;
                            if (ftVar5.e(document4)) {
                                arrayList8.add(LocaleController.getString(R.string.AddACaption));
                                org.telegram.ui.Cells.b1.n(R.drawable.outline_caption_24, 11, arrayList10, arrayList9);
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
                                org.telegram.ui.Cells.b1.q(R.drawable.msg_delete, arrayList10, arrayList9, 1);
                            } else {
                                arrayList8.add(LocaleController.formatString("SaveToGIFs", R.string.SaveToGIFs, new Object[0]));
                                org.telegram.ui.Cells.b1.q(R.drawable.msg_gif_add, arrayList10, arrayList9, 2);
                            }
                        } else {
                            z10 = false;
                        }
                        if (arrayList8.isEmpty()) {
                            return;
                        }
                        htVar.K = true;
                        vVar = htVar.z;
                        vVar.invalidate();
                        int[] iArr2 = new int[arrayList10.size()];
                        for (int i44 = 0; i44 < arrayList10.size(); i44++) {
                            iArr2[i44] = ((Integer) arrayList10.get(i44)).intValue();
                        }
                        org.telegram.ui.Components.d51 d51Var = new org.telegram.ui.Components.d51(9, this, arrayList9);
                        for (int i45 = 0; i45 < arrayList8.size(); i45++) {
                            int intValue2 = ((Integer) arrayList10.get(i45)).intValue();
                            CharSequence charSequence2 = (CharSequence) arrayList8.get(i45);
                            g6Var = htVar.c0;
                            org.telegram.ui.ActionBar.e1 c13 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, intValue2, charSequence2, false, g6Var);
                            c13.setTag(Integer.valueOf(i45));
                            c13.setOnClickListener(d51Var);
                            if (z10 && i45 == arrayList8.size() - 1) {
                                c13.c(org.telegram.ui.ActionBar.k6.q7, org.telegram.ui.ActionBar.k6.p7);
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
                        int i46 = bVar.d;
                        bVar2 = htVar.q;
                        int i47 = i46 + bVar2.b;
                        bVar3 = htVar.q;
                        int i48 = bVar3.b;
                        vVar2 = htVar.z;
                        int width2 = vVar2.getWidth();
                        vVar3 = htVar.z;
                        int min5 = Math.min(width2, vVar3.getHeight() - i47) - AndroidUtilities.dp(40.0f);
                        f7 = htVar.e;
                        int i49 = min5 / 2;
                        int i50 = i48 + i49;
                        int dp4 = htVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                        vVar4 = htVar.z;
                        float max2 = (int) (f7 + Math.max(i50 + dp4, ((vVar4.getHeight() - i47) - htVar.I) / 2) + i49);
                        float dp5 = AndroidUtilities.dp(24.0f);
                        f10 = htVar.e;
                        int i51 = (int) ((dp5 - f10) + max2);
                        org.telegram.ui.ActionBar.m1 m1Var2 = htVar.k;
                        vVar5 = htVar.z;
                        vVar6 = htVar.z;
                        i15 = 0;
                        m1Var2.showAtLocation(vVar5, 0, (int) ((vVar6.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i51);
                        try {
                            vVar7 = htVar.z;
                            vVar7.performHapticFeedback(0);
                        } catch (Exception unused4) {
                        }
                        f11 = htVar.e;
                        if (f11 != 0.0f) {
                            f12 = htVar.e;
                            htVar.f = f12;
                            final int i52 = 2;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.xs
                                public final /* synthetic */ dt b;

                                {
                                    this.b = this;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (i52) {
                                        case 0:
                                            ht htVar2 = this.b.a;
                                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            htVar2.g = floatValue;
                                            float f192 = htVar2.f;
                                            htVar2.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f192, floatValue, f192);
                                            htVar2.z.invalidate();
                                            break;
                                        case 1:
                                            ht htVar3 = this.b.a;
                                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            htVar3.g = floatValue2;
                                            float f20 = htVar3.f;
                                            htVar3.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f20, floatValue2, f20);
                                            htVar3.z.invalidate();
                                            break;
                                        default:
                                            ht htVar4 = this.b.a;
                                            float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            htVar4.g = floatValue3;
                                            float f21 = htVar4.f;
                                            htVar4.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f21, floatValue3, f21);
                                            htVar4.z.invalidate();
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
                document12 = htVar.W;
                if (MessageObject.isPremiumSticker(document12)) {
                    i27 = htVar.r;
                    if (!AccountInstance.getInstance(i27).getUserConfig().isPremium()) {
                        if (htVar.O == null) {
                            cg1 cg1Var = new cg1(htVar.z.getContext(), htVar.c0);
                            htVar.O = cg1Var;
                            htVar.z.addView(cg1Var, w7.z5.c(-1.0f, -1));
                            htVar.O.setOnClickListener(new ws(htVar, i34));
                            z11 = true;
                            htVar.O.a.v.setOnClickListener(new ws(htVar, 1 == true ? 1 : 0));
                        } else {
                            z11 = true;
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(htVar.O, false, 1.0f, false);
                        AndroidUtilities.updateViewVisibilityAnimated(htVar.O, z11);
                        htVar.O.setTranslationY(0.0f);
                        htVar.K = true;
                        vVar26 = htVar.z;
                        vVar26.invalidate();
                        try {
                            vVar27 = htVar.z;
                            vVar27.performHapticFeedback(0);
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
                    if (ftVar20.k(i25)) {
                        ftVar25 = htVar.l;
                        if (!ftVar25.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendStickerPreview));
                            org.telegram.ui.Cells.b1.q(R.drawable.msg_send, arrayList13, arrayList12, 0);
                        }
                    }
                    ftVar21 = htVar.l;
                    i26 = htVar.V;
                    if (ftVar21.k(i26)) {
                        ftVar24 = htVar.l;
                        if (!ftVar24.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendWithoutSound));
                            org.telegram.ui.Cells.b1.n(R.drawable.input_notify_off, 6, arrayList13, arrayList12);
                        }
                    }
                    ftVar22 = htVar.l;
                    if (ftVar22.b()) {
                        arrayList11.add(LocaleController.getString(R.string.Schedule));
                        org.telegram.ui.Cells.b1.q(R.drawable.msg_autodelete, arrayList13, arrayList12, 3);
                    }
                    ftVar23 = htVar.l;
                    if (ftVar23.f()) {
                        arrayList11.add(LocaleController.getString(R.string.ImportStickersRemoveMenu));
                        org.telegram.ui.Cells.b1.q(R.drawable.msg_delete, arrayList13, arrayList12, 5);
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
                    org.telegram.ui.Cells.b1.q(isStickerInFavorites2 ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList13, arrayList12, 2);
                }
                ftVar14 = htVar.l;
                if (ftVar14 != null && (inputStickerSet = htVar.a0) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                    ftVar19 = htVar.l;
                    if (ftVar19.Q()) {
                        arrayList11.add(LocaleController.formatString(R.string.ViewPackPreview, new Object[0]));
                        org.telegram.ui.Cells.b1.q(R.drawable.msg_media, arrayList13, arrayList12, 1);
                    }
                }
                if (htVar.p) {
                    arrayList11.add(LocaleController.getString(R.string.DeleteFromRecent));
                    org.telegram.ui.Cells.b1.q(R.drawable.msg_delete, arrayList13, arrayList12, 4);
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
                                if (ftVar18.D()) {
                                    TLRPC.StickerSet stickerSet2 = stickerSet.set;
                                    if (!stickerSet2.emojis && !stickerSet2.masks) {
                                        arrayList11.add(LocaleController.getString(R.string.EditSticker));
                                        org.telegram.ui.Cells.b1.n(R.drawable.msg_edit, 7, arrayList13, arrayList12);
                                    }
                                }
                            }
                        }
                        if (stickerSet != null && stickerSet.set.creator) {
                            ftVar15 = htVar.l;
                            if (ftVar15 != null) {
                                ftVar16 = htVar.l;
                                unused = htVar.W;
                                if (ftVar16.I()) {
                                    arrayList11.add(LocaleController.getString(R.string.DeleteSticker));
                                    org.telegram.ui.Cells.b1.n(R.drawable.msg_delete, 8, arrayList13, arrayList12);
                                }
                            }
                        }
                    }
                }
                if (arrayList11.isEmpty()) {
                    return;
                }
                htVar.K = true;
                vVar15 = htVar.z;
                vVar15.invalidate();
                zs zsVar = new zs(this, arrayList12, isStickerInFavorites2);
                ht.f(htVar, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                for (int i53 = 0; i53 < arrayList11.size(); i53++) {
                    int intValue3 = ((Integer) arrayList13.get(i53)).intValue();
                    CharSequence charSequence3 = (CharSequence) arrayList11.get(i53);
                    g6Var3 = htVar.c0;
                    org.telegram.ui.ActionBar.e1 c14 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, intValue3, charSequence3, false, g6Var3);
                    c14.setTag(Integer.valueOf(i53));
                    c14.setOnClickListener(zsVar);
                    if (((Integer) arrayList12.get(i53)).intValue() == 8) {
                        int i54 = org.telegram.ui.ActionBar.k6.q7;
                        c14.c(i54, i54);
                        c14.h(0.1f, i54);
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
                int i55 = bVar7.d;
                bVar8 = htVar.q;
                int i56 = i55 + bVar8.b;
                bVar9 = htVar.q;
                int i57 = bVar9.b;
                i21 = htVar.V;
                if (i21 == 1) {
                    vVar24 = htVar.z;
                    int width3 = vVar24.getWidth();
                    vVar25 = htVar.z;
                    i22 = Math.min(width3, vVar25.getHeight() - i56) - AndroidUtilities.dp(40.0f);
                } else {
                    if (htVar.S) {
                        vVar18 = htVar.z;
                        int width4 = vVar18.getWidth();
                        vVar19 = htVar.z;
                        min = Math.min(width4, vVar19.getHeight() - i56) - AndroidUtilities.dpf2(40.0f);
                    } else {
                        vVar16 = htVar.z;
                        int width5 = vVar16.getWidth();
                        vVar17 = htVar.z;
                        min = Math.min(width5, vVar17.getHeight() - i56) / 1.8f;
                    }
                    i22 = (int) min;
                }
                f17 = htVar.e;
                int i58 = i22 / 2;
                int i59 = i57 + i58;
                int dp6 = htVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                vVar20 = htVar.z;
                int dp7 = AndroidUtilities.dp(24.0f) + ((int) (f17 + Math.max(i59 + dp6, ((vVar20.getHeight() - i56) - htVar.I) / 2) + i58));
                if (htVar.S) {
                    dp7 += AndroidUtilities.dp(24.0f);
                }
                org.telegram.ui.ActionBar.m1 m1Var3 = htVar.k;
                vVar21 = htVar.z;
                vVar22 = htVar.z;
                m1Var3.showAtLocation(vVar21, 0, (int) ((vVar22.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth()) / 2.0f), dp7);
                try {
                    vVar23 = htVar.z;
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
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout22 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, htVar.z.getContext(), htVar.c0);
        org.telegram.ui.ActionBar.g6 g6Var42 = null;
        dh.d c102 = bVar10.c(actionBarPopupWindow$ActionBarPopupWindowLayout22, null, true);
        c102.o(fh.c.k(htVar.c0));
        c102.q(AndroidUtilities.dp(12.0f));
        c102.p(AndroidUtilities.dp(8.0f));
        c102.v.e = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout22.setBackground(c102);
        int i302 = 6;
        int i312 = 7;
        if (htVar.V != 3) {
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout22;
        i15 = 0;
        i28 = i15;
        while (i28 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
        }
    }
}
