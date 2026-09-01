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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class mt implements Runnable {
    public final /* synthetic */ qt a;

    public mt(qt qtVar) {
        this.a = qtVar;
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
        ot otVar;
        ot otVar2;
        int i13;
        ot otVar3;
        int i14;
        ot otVar4;
        TLRPC.Document document;
        TLRPC.Document document2;
        boolean z4;
        ag.l lVar;
        i0.b bVar;
        i0.b bVar2;
        i0.b bVar3;
        ag.l lVar2;
        ag.l lVar3;
        float f10;
        ag.l lVar4;
        float f11;
        ag.l lVar5;
        ag.l lVar6;
        float f12;
        float f13;
        ag.l lVar7;
        org.telegram.ui.ActionBar.g6 g6Var;
        int i15;
        TLRPC.Document document3;
        ot otVar5;
        TLRPC.Document document4;
        ot otVar6;
        ot otVar7;
        ot otVar8;
        ot otVar9;
        int i16;
        ot otVar10;
        TLRPC.Document document5;
        ot otVar11;
        TLRPC.Document document6;
        ot otVar12;
        TLRPC.Document document7;
        int i17;
        TLRPC.Document document8;
        TLRPC.Document document9;
        ag.l lVar8;
        i0.b bVar4;
        i0.b bVar5;
        i0.b bVar6;
        ag.l lVar9;
        ag.l lVar10;
        float f14;
        ag.l lVar11;
        float f15;
        ag.l lVar12;
        ag.l lVar13;
        float f16;
        float f17;
        ag.l lVar14;
        org.telegram.ui.ActionBar.g6 g6Var2;
        TLRPC.Document document10;
        int i18;
        TLRPC.Document document11;
        TLRPC.Document document12;
        int i19;
        TLRPC.Document document13;
        ot otVar13;
        TLRPC.Document document14;
        ot otVar14;
        ag.l lVar15;
        i0.b bVar7;
        i0.b bVar8;
        i0.b bVar9;
        int i20;
        ag.l lVar16;
        ag.l lVar17;
        float min;
        int i21;
        ag.l lVar18;
        ag.l lVar19;
        float f18;
        ag.l lVar20;
        ag.l lVar21;
        ag.l lVar22;
        ag.l lVar23;
        ag.l lVar24;
        ag.l lVar25;
        org.telegram.ui.ActionBar.g6 g6Var3;
        TLRPC.Document document15;
        int i22;
        ot otVar15;
        ot otVar16;
        ot otVar17;
        ot otVar18;
        TLRPC.InputStickerSet inputStickerSet;
        ot otVar19;
        int i23;
        TLRPC.Document document16;
        ot otVar20;
        int i24;
        ot otVar21;
        int i25;
        ot otVar22;
        ot otVar23;
        ot otVar24;
        ot otVar25;
        int i26;
        ag.l lVar26;
        ag.l lVar27;
        int i27;
        kb1 kb1Var;
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        ag.l lVar28;
        org.telegram.ui.Components.q70 I;
        TLRPC.Document unused;
        qt qtVar = this.a;
        og.a aVar = qtVar.t;
        if (qtVar.w == null || qtVar.m) {
            return;
        }
        qtVar.R = true;
        ot otVar26 = qtVar.l;
        final int i28 = 0;
        if (otVar26 != null && (I = otVar26.I(qtVar.z)) != null) {
            I.Q(aVar, sg.b.j(qtVar.c0), true);
            I.t = false;
            I.Y();
            I.p = new zi(this, 16);
            ViewGroup viewGroup = I.A;
            gt gtVar = new gt(this, viewGroup);
            qtVar.k = gtVar;
            gtVar.e = true;
            gtVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
            gtVar.g = true;
            gtVar.setOutsideTouchable(true);
            qtVar.k.setClippingEnabled(true);
            qtVar.k.setAnimationStyle(R.style.PopupContextAnimation);
            qtVar.k.setFocusable(true);
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            qtVar.k.setInputMethodMode(2);
            qtVar.k.getContentView().setFocusableInTouchMode(true);
            i0.b bVar10 = qtVar.q;
            int min2 = (Math.min(qtVar.z.getWidth(), qtVar.z.getHeight() - (bVar10.d + bVar10.b)) - AndroidUtilities.dp(40.0f)) / 2;
            int dp = (int) ((AndroidUtilities.dp(24.0f) - qtVar.e) + ((int) (qtVar.e + Math.max(r2 + min2 + (qtVar.G != null ? AndroidUtilities.dp(40.0f) : 0), ((qtVar.z.getHeight() - r3) - qtVar.I) / 2) + min2)));
            qtVar.k.showAtLocation(qtVar.z, 0, (int) ((r4.getMeasuredWidth() - viewGroup.getMeasuredWidth()) / 2.0f), dp);
            try {
                qtVar.z.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            float f19 = qtVar.e;
            if (f19 != 0.0f) {
                qtVar.f = f19;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ft
                    public final /* synthetic */ mt b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i28) {
                            case 0:
                                qt qtVar2 = this.b.a;
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                qtVar2.g = floatValue;
                                float f20 = qtVar2.f;
                                qtVar2.e = e2.c.w(0.0f, f20, floatValue, f20);
                                qtVar2.z.invalidate();
                                break;
                            case 1:
                                qt qtVar3 = this.b.a;
                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                qtVar3.g = floatValue2;
                                float f21 = qtVar3.f;
                                qtVar3.e = e2.c.w(0.0f, f21, floatValue2, f21);
                                qtVar3.z.invalidate();
                                break;
                            default:
                                qt qtVar4 = this.b.a;
                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                qtVar4.g = floatValue3;
                                float f22 = qtVar4.f;
                                qtVar4.e = e2.c.w(0.0f, f22, floatValue3, f22);
                                qtVar4.z.invalidate();
                                break;
                        }
                    }
                });
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(org.telegram.ui.Components.pr.f);
                ofFloat.start();
            }
            qtVar.K = true;
            return;
        }
        if (qtVar.V != 3) {
            ot otVar27 = qtVar.l;
            if (otVar27 != null) {
                TLRPC.TL_messageMediaPoll d = otVar27.d();
                TLRPC.PollAnswer g10 = qtVar.l.g();
                if (d != null && d.poll != null && g10 != null) {
                    TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(d, g10.option);
                    if (pollResult != null && pollResult.voters > 0) {
                        MessageObject.canShowVotersList(d);
                    }
                }
            }
            i10 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, qtVar.z.getContext(), qtVar.c0);
            org.telegram.ui.ActionBar.g6 g6Var4 = null;
            qg.b c3 = aVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout3, null, true);
            c3.n(sg.b.j(qtVar.c0));
            c3.p(AndroidUtilities.dp(12.0f));
            c3.o(AndroidUtilities.dp(8.0f));
            c3.h.e = true;
            actionBarPopupWindow$ActionBarPopupWindowLayout3.setBackground(c3);
            if (qtVar.V != 3) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (qtVar.T == null) {
                    ot otVar28 = qtVar.l;
                    if (otVar28 == null || !otVar28.A()) {
                        if (qtVar.l.w()) {
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
                ot otVar29 = qtVar.l;
                if (otVar29 == null || !otVar29.A()) {
                    ot otVar30 = qtVar.l;
                    arrayList.add(LocaleController.getString((otVar30 == null || !otVar30.J()) ? R.string.AddToStickerPack : R.string.StickersReplaceSticker));
                    ot otVar31 = qtVar.l;
                    b.j((otVar31 == null || !otVar31.J()) ? R.drawable.menu_sticker_add : R.drawable.msg_replace, arrayList3, arrayList2, 2);
                }
                int i29 = 7;
                int i30 = 6;
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, qtVar.w, qtVar.c0, true, false);
                g1Var.setItemHeight(44);
                g1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                g1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                FrameLayout frameLayout = new FrameLayout(qtVar.z.getContext());
                LinearLayout linearLayout = new LinearLayout(qtVar.z.getContext());
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G8, qtVar.c0));
                linearLayout.setOrientation(1);
                if (qtVar.w == null) {
                    kb1Var = null;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new TLRPC.TL_stickerSetNoCovered());
                    TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = new TLRPC.TL_messages_getMyStickers();
                    tL_messages_getMyStickers.limit = 100;
                    ConnectionsManager.getInstance(qtVar.r).sendRequest(tL_messages_getMyStickers, new ba(qtVar, arrayList4, tL_messages_getMyStickers, i29));
                    kb1Var = new kb1(qtVar.w, i30, g6Var4);
                    kb1Var.setLayoutManager(new f2.j0());
                    kb1Var.i(new hg.e2(arrayList4, 4));
                    kb1Var.setAdapter(new nt(qtVar, arrayList4));
                }
                kb1Var.setOnItemClickListener(new j(this, 5));
                frameLayout.addView(g1Var);
                linearLayout.addView(frameLayout);
                linearLayout.addView(new org.telegram.ui.ActionBar.m1(qtVar.z.getContext(), qtVar.c0), k7.c6.n(-1, 8));
                oh.b0 b0Var = new oh.b0(this, arrayList2, kb1Var, linearLayout, actionBarPopupWindow$ActionBarPopupWindowLayout3, 12);
                for (int i31 = 0; i31 < arrayList.size(); i31++) {
                    org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, ((Integer) arrayList3.get(i31)).intValue(), (CharSequence) arrayList.get(i31), false, qtVar.c0);
                    c10.setTag(Integer.valueOf(i31));
                    c10.setOnClickListener(b0Var);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                linearLayout.addView(kb1Var, new LinearLayout.LayoutParams(actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() - AndroidUtilities.dp(16.0f), (int) (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() * 1.5f)));
                actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                frameLayout.setOnClickListener(new nf(actionBarPopupWindow$ActionBarPopupWindowLayout, 2));
                i0.b bVar11 = qtVar.q;
                int i32 = bVar11.d + bVar11.b;
                int min3 = ((int) (Math.min(qtVar.z.getWidth(), qtVar.z.getHeight() - i32) / 1.8f)) / 2;
                qtVar.z.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, k7.c6.d(-2, -2.0f, 49, 0.0f, (AndroidUtilities.dp(84.0f) + ((int) ((qtVar.e + Math.max(r0 + min3, ((qtVar.z.getHeight() - i32) - qtVar.I) / 2)) + min3))) / AndroidUtilities.density, 0.0f, 0.0f));
                qtVar.L = actionBarPopupWindow$ActionBarPopupWindowLayout;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(-AndroidUtilities.dp(12.0f));
                qtVar.L.setAlpha(0.0f);
                view = qtVar.L;
                view.setScaleX(0.8f);
                view2 = qtVar.L;
                view2.setScaleY(0.8f);
                view3 = qtVar.L;
                view3.setPivotY(0.0f);
                view4 = qtVar.L;
                view5 = qtVar.L;
                view4.setPivotX(view5.getMeasuredWidth() / 2.0f);
                view6 = qtVar.L;
                view6.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.pr.h).start();
                if (qtVar.P == null) {
                    org.telegram.ui.Components.rb rbVar = new org.telegram.ui.Components.rb(qtVar, qtVar.z.getContext(), UserConfig.selectedAccount, qtVar.c0);
                    qtVar.P = rbVar;
                    rbVar.K0 = true;
                    rbVar.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                    qtVar.P.setClipChildren(false);
                    qtVar.P.setClipToPadding(false);
                    qtVar.P.setVisibility(0);
                    qtVar.P.setHint(LocaleController.getString(R.string.StickersSetEmojiForSticker));
                    qtVar.P.setBubbleOffset(-AndroidUtilities.dp(105.0f));
                    qtVar.P.setMiniBubblesOffset(-AndroidUtilities.dp(14.0f));
                    FrameLayout frameLayout2 = new FrameLayout(qtVar.z.getContext());
                    qtVar.Q = frameLayout2;
                    frameLayout2.addView(qtVar.P, k7.c6.d(-2, 116.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                    qtVar.z.addView(qtVar.Q, k7.c6.d(-2, -2.0f, 1, 0.0f, 100.0f, 0.0f, 0.0f));
                }
                qtVar.P.setSelectedEmojis(qtVar.o);
                qtVar.P.setDelegate(new ct(qtVar));
                qtVar.P.p(null, null, false);
                qtVar.Q.setScaleY(0.6f);
                qtVar.Q.setScaleX(0.6f);
                qtVar.Q.setAlpha(0.0f);
                AndroidUtilities.runOnUIThread(new bt(qtVar, 2), 10L);
                qtVar.K = true;
                lVar28 = qtVar.z;
                lVar28.invalidate();
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                final int i33 = 1;
                int i34 = 0;
                i11 = qtVar.V;
                if (i11 != 0) {
                    i12 = qtVar.V;
                    if (i12 == 2) {
                        otVar8 = qtVar.l;
                        if (otVar8 != null) {
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = new ArrayList();
                            otVar9 = qtVar.l;
                            i16 = qtVar.V;
                            if (otVar9.k(i16)) {
                                arrayList5.add(LocaleController.getString(R.string.SendEmojiPreview));
                                b.j(R.drawable.msg_send, arrayList7, arrayList6, 0);
                            }
                            otVar10 = qtVar.l;
                            document5 = qtVar.W;
                            Boolean P = otVar10.P(document5);
                            if (P != null) {
                                if (P.booleanValue()) {
                                    arrayList5.add(LocaleController.getString(R.string.SetAsEmojiStatus));
                                    b.j(R.drawable.msg_smile_status, arrayList7, arrayList6, 1);
                                } else {
                                    arrayList5.add(LocaleController.getString(R.string.RemoveStatus));
                                    b.j(R.drawable.msg_smile_status, arrayList7, arrayList6, 2);
                                }
                            }
                            otVar11 = qtVar.l;
                            document6 = qtVar.W;
                            if (otVar11.D(document6)) {
                                arrayList5.add(LocaleController.getString(R.string.CopyEmojiPreview));
                                b.j(R.drawable.msg_copy, arrayList7, arrayList6, 3);
                            }
                            otVar12 = qtVar.l;
                            document7 = qtVar.W;
                            if (otVar12.N(document7)) {
                                arrayList5.add(LocaleController.getString(R.string.RemoveFromRecent));
                                b.j(R.drawable.msg_delete, arrayList7, arrayList6, 4);
                            }
                            i17 = qtVar.r;
                            MediaDataController mediaDataController = MediaDataController.getInstance(i17);
                            document8 = qtVar.W;
                            boolean isStickerInFavorites = mediaDataController.isStickerInFavorites(document8);
                            document9 = qtVar.W;
                            if (!MessageObject.isAnimatedEmoji(document9)) {
                                document10 = qtVar.W;
                                if (!MessageObject.isMaskDocument(document10)) {
                                    if (!isStickerInFavorites) {
                                        i18 = qtVar.r;
                                        if (MediaDataController.getInstance(i18).canAddStickerToFavorites()) {
                                            document11 = qtVar.W;
                                        }
                                    }
                                    arrayList5.add(LocaleController.getString(isStickerInFavorites ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                                    b.j(isStickerInFavorites ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList7, arrayList6, 5);
                                }
                            }
                            if (arrayList5.isEmpty()) {
                                return;
                            }
                            qtVar.K = true;
                            lVar8 = qtVar.z;
                            lVar8.invalidate();
                            int[] iArr = new int[arrayList7.size()];
                            for (int i35 = 0; i35 < arrayList7.size(); i35++) {
                                iArr[i35] = ((Integer) arrayList7.get(i35)).intValue();
                            }
                            org.telegram.ui.Components.ac0 ac0Var = new org.telegram.ui.Components.ac0(this, arrayList6, isStickerInFavorites);
                            boolean h = qt.h(qtVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            int i36 = 0;
                            while (i36 < arrayList5.size()) {
                                boolean z10 = !h && i36 == 0;
                                boolean z11 = i36 == arrayList5.size() + (-1);
                                int intValue = ((Integer) arrayList7.get(i36)).intValue();
                                CharSequence charSequence = (CharSequence) arrayList5.get(i36);
                                g6Var2 = qtVar.c0;
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(z10, z11, actionBarPopupWindow$ActionBarPopupWindowLayout4, intValue, charSequence, false, g6Var2);
                                if (((Integer) arrayList6.get(i36)).intValue() == 4) {
                                    c11.setIconColor(qt.d(qtVar, org.telegram.ui.ActionBar.k6.p7));
                                    c11.setTextColor(qt.d(qtVar, org.telegram.ui.ActionBar.k6.q7));
                                }
                                c11.setTag(Integer.valueOf(i36));
                                c11.setOnClickListener(ac0Var);
                                i36++;
                                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            kt ktVar = new kt(this, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                            qtVar.k = ktVar;
                            ktVar.e = true;
                            ktVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
                            ktVar.g = true;
                            ktVar.setOutsideTouchable(true);
                            qtVar.k.setClippingEnabled(true);
                            qtVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                            qtVar.k.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            qtVar.k.setInputMethodMode(2);
                            qtVar.k.getContentView().setFocusableInTouchMode(true);
                            bVar4 = qtVar.q;
                            int i37 = bVar4.d;
                            bVar5 = qtVar.q;
                            int i38 = i37 + bVar5.b;
                            bVar6 = qtVar.q;
                            int i39 = bVar6.b;
                            lVar9 = qtVar.z;
                            int width = lVar9.getWidth();
                            lVar10 = qtVar.z;
                            int min4 = Math.min(width, lVar10.getHeight() - i38) - AndroidUtilities.dp(40.0f);
                            f14 = qtVar.e;
                            int i40 = min4 / 2;
                            int i41 = i39 + i40;
                            int dp2 = qtVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                            lVar11 = qtVar.z;
                            float max = (int) (f14 + Math.max(i41 + dp2, ((lVar11.getHeight() - i38) - qtVar.I) / 2) + i40);
                            float dp3 = AndroidUtilities.dp(24.0f);
                            f15 = qtVar.e;
                            int i42 = (int) ((dp3 - f15) + max);
                            org.telegram.ui.ActionBar.p1 p1Var = qtVar.k;
                            lVar12 = qtVar.z;
                            lVar13 = qtVar.z;
                            p1Var.showAtLocation(lVar12, 0, (int) ((lVar13.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth()) / 2.0f), i42);
                            org.telegram.ui.ActionBar.p1.i(actionBarPopupWindow$ActionBarPopupWindowLayout2);
                            try {
                                lVar14 = qtVar.z;
                                lVar14.performHapticFeedback(0);
                            } catch (Exception unused3) {
                            }
                            f16 = qtVar.e;
                            if (f16 != 0.0f) {
                                f17 = qtVar.e;
                                qtVar.f = f17;
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ft
                                    public final /* synthetic */ mt b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        switch (i33) {
                                            case 0:
                                                qt qtVar2 = this.b.a;
                                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                qtVar2.g = floatValue;
                                                float f20 = qtVar2.f;
                                                qtVar2.e = e2.c.w(0.0f, f20, floatValue, f20);
                                                qtVar2.z.invalidate();
                                                break;
                                            case 1:
                                                qt qtVar3 = this.b.a;
                                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                qtVar3.g = floatValue2;
                                                float f21 = qtVar3.f;
                                                qtVar3.e = e2.c.w(0.0f, f21, floatValue2, f21);
                                                qtVar3.z.invalidate();
                                                break;
                                            default:
                                                qt qtVar4 = this.b.a;
                                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                qtVar4.g = floatValue3;
                                                float f22 = qtVar4.f;
                                                qtVar4.e = e2.c.w(0.0f, f22, floatValue3, f22);
                                                qtVar4.z.invalidate();
                                                break;
                                        }
                                    }
                                });
                                ofFloat2.setDuration(350L);
                                ofFloat2.setInterpolator(org.telegram.ui.Components.pr.f);
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
                    otVar = qtVar.l;
                    if (otVar != null) {
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        otVar2 = qtVar.l;
                        i13 = qtVar.V;
                        if (otVar2.k(i13)) {
                            otVar7 = qtVar.l;
                            if (!otVar7.c()) {
                                arrayList8.add(LocaleController.getString(R.string.SendGifPreview));
                                b.j(R.drawable.msg_send, arrayList10, arrayList9, 0);
                            }
                        }
                        otVar3 = qtVar.l;
                        i14 = qtVar.V;
                        if (otVar3.k(i14)) {
                            otVar6 = qtVar.l;
                            if (!otVar6.c()) {
                                arrayList8.add(LocaleController.getString(R.string.SendWithoutSound));
                                b.j(R.drawable.input_notify_off, arrayList10, arrayList9, 4);
                            }
                        }
                        otVar4 = qtVar.l;
                        if (otVar4.b()) {
                            arrayList8.add(LocaleController.getString(R.string.Schedule));
                            b.j(R.drawable.msg_autodelete, arrayList10, arrayList9, 3);
                        }
                        document = qtVar.W;
                        if (document != null) {
                            otVar5 = qtVar.l;
                            document4 = qtVar.W;
                            if (otVar5.e(document4)) {
                                arrayList8.add(LocaleController.getString(R.string.AddACaption));
                                b.h(R.drawable.outline_caption_24, 11, arrayList10, arrayList9);
                            }
                        }
                        document2 = qtVar.W;
                        if (document2 != null) {
                            i15 = qtVar.r;
                            MediaDataController mediaDataController2 = MediaDataController.getInstance(i15);
                            document3 = qtVar.W;
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
                        qtVar.K = true;
                        lVar = qtVar.z;
                        lVar.invalidate();
                        int[] iArr2 = new int[arrayList10.size()];
                        for (int i43 = 0; i43 < arrayList10.size(); i43++) {
                            iArr2[i43] = ((Integer) arrayList10.get(i43)).intValue();
                        }
                        org.telegram.ui.Components.sx0 sx0Var = new org.telegram.ui.Components.sx0(13, this, arrayList9);
                        for (int i44 = 0; i44 < arrayList8.size(); i44++) {
                            int intValue2 = ((Integer) arrayList10.get(i44)).intValue();
                            CharSequence charSequence2 = (CharSequence) arrayList8.get(i44);
                            g6Var = qtVar.c0;
                            org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, intValue2, charSequence2, false, g6Var);
                            c12.setTag(Integer.valueOf(i44));
                            c12.setOnClickListener(sx0Var);
                            if (z4 && i44 == arrayList8.size() - 1) {
                                c12.c(qt.d(qtVar, org.telegram.ui.ActionBar.k6.q7), qt.d(qtVar, org.telegram.ui.ActionBar.k6.p7));
                            }
                        }
                        lt ltVar = new lt(this, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                        qtVar.k = ltVar;
                        ltVar.e = true;
                        ltVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
                        ltVar.g = true;
                        ltVar.setOutsideTouchable(true);
                        qtVar.k.setClippingEnabled(true);
                        qtVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                        qtVar.k.setFocusable(true);
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                        qtVar.k.setInputMethodMode(2);
                        qtVar.k.getContentView().setFocusableInTouchMode(true);
                        bVar = qtVar.q;
                        int i45 = bVar.d;
                        bVar2 = qtVar.q;
                        int i46 = i45 + bVar2.b;
                        bVar3 = qtVar.q;
                        int i47 = bVar3.b;
                        lVar2 = qtVar.z;
                        int width2 = lVar2.getWidth();
                        lVar3 = qtVar.z;
                        int min5 = Math.min(width2, lVar3.getHeight() - i46) - AndroidUtilities.dp(40.0f);
                        f10 = qtVar.e;
                        int i48 = min5 / 2;
                        int i49 = i47 + i48;
                        int dp4 = qtVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                        lVar4 = qtVar.z;
                        float max2 = (int) (f10 + Math.max(i49 + dp4, ((lVar4.getHeight() - i46) - qtVar.I) / 2) + i48);
                        float dp5 = AndroidUtilities.dp(24.0f);
                        f11 = qtVar.e;
                        int i50 = (int) ((dp5 - f11) + max2);
                        org.telegram.ui.ActionBar.p1 p1Var2 = qtVar.k;
                        lVar5 = qtVar.z;
                        lVar6 = qtVar.z;
                        p1Var2.showAtLocation(lVar5, 0, (int) ((lVar6.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth()) / 2.0f), i50);
                        try {
                            lVar7 = qtVar.z;
                            lVar7.performHapticFeedback(0);
                        } catch (Exception unused4) {
                        }
                        f12 = qtVar.e;
                        if (f12 != 0.0f) {
                            f13 = qtVar.e;
                            qtVar.f = f13;
                            final int i51 = 2;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ft
                                public final /* synthetic */ mt b;

                                {
                                    this.b = this;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (i51) {
                                        case 0:
                                            qt qtVar2 = this.b.a;
                                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            qtVar2.g = floatValue;
                                            float f20 = qtVar2.f;
                                            qtVar2.e = e2.c.w(0.0f, f20, floatValue, f20);
                                            qtVar2.z.invalidate();
                                            break;
                                        case 1:
                                            qt qtVar3 = this.b.a;
                                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            qtVar3.g = floatValue2;
                                            float f21 = qtVar3.f;
                                            qtVar3.e = e2.c.w(0.0f, f21, floatValue2, f21);
                                            qtVar3.z.invalidate();
                                            break;
                                        default:
                                            qt qtVar4 = this.b.a;
                                            float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            qtVar4.g = floatValue3;
                                            float f22 = qtVar4.f;
                                            qtVar4.e = e2.c.w(0.0f, f22, floatValue3, f22);
                                            qtVar4.z.invalidate();
                                            break;
                                    }
                                }
                            });
                            ofFloat3.setDuration(350L);
                            ofFloat3.setInterpolator(org.telegram.ui.Components.pr.f);
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
                document12 = qtVar.W;
                if (MessageObject.isPremiumSticker(document12)) {
                    i26 = qtVar.r;
                    if (!AccountInstance.getInstance(i26).getUserConfig().isPremium()) {
                        if (qtVar.O == null) {
                            rg1 rg1Var = new rg1(qtVar.z.getContext(), qtVar.c0);
                            qtVar.O = rg1Var;
                            qtVar.z.addView(rg1Var, k7.c6.c(-1.0f, -1));
                            qtVar.O.setOnClickListener(new et(qtVar, i34));
                            qtVar.O.a.r.setOnClickListener(new et(qtVar, i33));
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(qtVar.O, false, 1.0f, false);
                        AndroidUtilities.updateViewVisibilityAnimated(qtVar.O, true);
                        qtVar.O.setTranslationY(0.0f);
                        qtVar.K = true;
                        lVar26 = qtVar.z;
                        lVar26.invalidate();
                        try {
                            lVar27 = qtVar.z;
                            lVar27.performHapticFeedback(0);
                            return;
                        } catch (Exception unused5) {
                            return;
                        }
                    }
                }
                i19 = qtVar.r;
                MediaDataController mediaDataController3 = MediaDataController.getInstance(i19);
                document13 = qtVar.W;
                boolean isStickerInFavorites2 = mediaDataController3.isStickerInFavorites(document13);
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                otVar13 = qtVar.l;
                if (otVar13 != null) {
                    otVar20 = qtVar.l;
                    i24 = qtVar.V;
                    if (otVar20.k(i24)) {
                        otVar25 = qtVar.l;
                        if (!otVar25.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendStickerPreview));
                            b.j(R.drawable.msg_send, arrayList13, arrayList12, 0);
                        }
                    }
                    otVar21 = qtVar.l;
                    i25 = qtVar.V;
                    if (otVar21.k(i25)) {
                        otVar24 = qtVar.l;
                        if (!otVar24.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendWithoutSound));
                            b.h(R.drawable.input_notify_off, 6, arrayList13, arrayList12);
                        }
                    }
                    otVar22 = qtVar.l;
                    if (otVar22.b()) {
                        arrayList11.add(LocaleController.getString(R.string.Schedule));
                        b.j(R.drawable.msg_autodelete, arrayList13, arrayList12, 3);
                    }
                    otVar23 = qtVar.l;
                    if (otVar23.f()) {
                        arrayList11.add(LocaleController.getString(R.string.ImportStickersRemoveMenu));
                        b.j(R.drawable.msg_delete, arrayList13, arrayList12, 5);
                    }
                }
                document14 = qtVar.W;
                if (!MessageObject.isMaskDocument(document14)) {
                    if (!isStickerInFavorites2) {
                        i23 = qtVar.r;
                        if (MediaDataController.getInstance(i23).canAddStickerToFavorites()) {
                            document16 = qtVar.W;
                        }
                    }
                    arrayList11.add(LocaleController.getString(isStickerInFavorites2 ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                    b.j(isStickerInFavorites2 ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList13, arrayList12, 2);
                }
                otVar14 = qtVar.l;
                if (otVar14 != null && (inputStickerSet = qtVar.a0) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                    otVar19 = qtVar.l;
                    if (otVar19.Q()) {
                        arrayList11.add(LocaleController.formatString(R.string.ViewPackPreview, new Object[0]));
                        b.j(R.drawable.msg_media, arrayList13, arrayList12, 1);
                    }
                }
                if (qtVar.p) {
                    arrayList11.add(LocaleController.getString(R.string.DeleteFromRecent));
                    b.j(R.drawable.msg_delete, arrayList13, arrayList12, 4);
                }
                if (qtVar.a0 != null) {
                    document15 = qtVar.W;
                    if (document15 != null) {
                        i22 = qtVar.r;
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i22).getStickerSet(qtVar.a0, true);
                        if (stickerSet != null) {
                            otVar17 = qtVar.l;
                            if (otVar17 != null) {
                                otVar18 = qtVar.l;
                                if (otVar18.C()) {
                                    TLRPC.StickerSet stickerSet2 = stickerSet.set;
                                    if (!stickerSet2.emojis && !stickerSet2.masks) {
                                        arrayList11.add(LocaleController.getString(R.string.EditSticker));
                                        b.h(R.drawable.msg_edit, 7, arrayList13, arrayList12);
                                    }
                                }
                            }
                        }
                        if (stickerSet != null && stickerSet.set.creator) {
                            otVar15 = qtVar.l;
                            if (otVar15 != null) {
                                otVar16 = qtVar.l;
                                unused = qtVar.W;
                                if (otVar16.H()) {
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
                qtVar.K = true;
                lVar15 = qtVar.z;
                lVar15.invalidate();
                ht htVar = new ht(this, arrayList12, isStickerInFavorites2);
                qt.h(qtVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                for (int i52 = 0; i52 < arrayList11.size(); i52++) {
                    int intValue3 = ((Integer) arrayList13.get(i52)).intValue();
                    CharSequence charSequence3 = (CharSequence) arrayList11.get(i52);
                    g6Var3 = qtVar.c0;
                    org.telegram.ui.ActionBar.g1 c13 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, intValue3, charSequence3, false, g6Var3);
                    c13.setTag(Integer.valueOf(i52));
                    c13.setOnClickListener(htVar);
                    if (((Integer) arrayList12.get(i52)).intValue() == 8) {
                        int d10 = qt.d(qtVar, org.telegram.ui.ActionBar.k6.q7);
                        c13.c(d10, d10);
                        c13.setSelectorColor(org.telegram.ui.ActionBar.k6.l1(0.1f, d10));
                    }
                }
                jt jtVar = new jt(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                qtVar.k = jtVar;
                jtVar.e = true;
                jtVar.c = 100;
                jtVar.g = true;
                jtVar.setOutsideTouchable(true);
                qtVar.k.setClippingEnabled(true);
                qtVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                qtVar.k.setFocusable(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                qtVar.k.setInputMethodMode(2);
                qtVar.k.getContentView().setFocusableInTouchMode(true);
                bVar7 = qtVar.q;
                int i53 = bVar7.d;
                bVar8 = qtVar.q;
                int i54 = i53 + bVar8.b;
                bVar9 = qtVar.q;
                int i55 = bVar9.b;
                i20 = qtVar.V;
                if (i20 == 1) {
                    lVar24 = qtVar.z;
                    int width3 = lVar24.getWidth();
                    lVar25 = qtVar.z;
                    i21 = Math.min(width3, lVar25.getHeight() - i54) - AndroidUtilities.dp(40.0f);
                } else {
                    if (qtVar.S) {
                        lVar18 = qtVar.z;
                        int width4 = lVar18.getWidth();
                        lVar19 = qtVar.z;
                        min = Math.min(width4, lVar19.getHeight() - i54) - AndroidUtilities.dpf2(40.0f);
                    } else {
                        lVar16 = qtVar.z;
                        int width5 = lVar16.getWidth();
                        lVar17 = qtVar.z;
                        min = Math.min(width5, lVar17.getHeight() - i54) / 1.8f;
                    }
                    i21 = (int) min;
                }
                f18 = qtVar.e;
                int i56 = i21 / 2;
                int i57 = i55 + i56;
                int dp6 = qtVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                lVar20 = qtVar.z;
                int dp7 = AndroidUtilities.dp(24.0f) + ((int) (f18 + Math.max(i57 + dp6, ((lVar20.getHeight() - i54) - qtVar.I) / 2) + i56));
                if (qtVar.S) {
                    dp7 += AndroidUtilities.dp(24.0f);
                }
                org.telegram.ui.ActionBar.p1 p1Var3 = qtVar.k;
                lVar21 = qtVar.z;
                lVar22 = qtVar.z;
                p1Var3.showAtLocation(lVar21, 0, (int) ((lVar22.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), dp7);
                try {
                    lVar23 = qtVar.z;
                    lVar23.performHapticFeedback(0);
                } catch (Exception unused6) {
                }
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            i27 = 0;
            while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount()) {
            }
        }
        i10 = 1;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout32 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, qtVar.z.getContext(), qtVar.c0);
        org.telegram.ui.ActionBar.g6 g6Var42 = null;
        qg.b c32 = aVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout32, null, true);
        c32.n(sg.b.j(qtVar.c0));
        c32.p(AndroidUtilities.dp(12.0f));
        c32.o(AndroidUtilities.dp(8.0f));
        c32.h.e = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout32.setBackground(c32);
        if (qtVar.V != 3) {
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        i27 = 0;
        while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount()) {
        }
    }
}
