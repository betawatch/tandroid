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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class lt implements Runnable {
    public final /* synthetic */ pt a;

    public lt(pt ptVar) {
        this.a = ptVar;
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
        nt ntVar;
        nt ntVar2;
        int i13;
        nt ntVar3;
        int i14;
        nt ntVar4;
        TLRPC.Document document;
        TLRPC.Document document2;
        boolean z4;
        ah.d dVar;
        i0.b bVar;
        i0.b bVar2;
        i0.b bVar3;
        ah.d dVar2;
        ah.d dVar3;
        float f10;
        ah.d dVar4;
        float f11;
        ah.d dVar5;
        ah.d dVar6;
        float f12;
        float f13;
        ah.d dVar7;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i15;
        TLRPC.Document document3;
        nt ntVar5;
        TLRPC.Document document4;
        nt ntVar6;
        nt ntVar7;
        nt ntVar8;
        nt ntVar9;
        int i16;
        nt ntVar10;
        TLRPC.Document document5;
        nt ntVar11;
        TLRPC.Document document6;
        nt ntVar12;
        TLRPC.Document document7;
        int i17;
        TLRPC.Document document8;
        TLRPC.Document document9;
        ah.d dVar8;
        i0.b bVar4;
        i0.b bVar5;
        i0.b bVar6;
        ah.d dVar9;
        ah.d dVar10;
        float f14;
        ah.d dVar11;
        float f15;
        ah.d dVar12;
        ah.d dVar13;
        float f16;
        float f17;
        ah.d dVar14;
        org.telegram.ui.ActionBar.f6 f6Var2;
        TLRPC.Document document10;
        int i18;
        TLRPC.Document document11;
        TLRPC.Document document12;
        int i19;
        TLRPC.Document document13;
        nt ntVar13;
        TLRPC.Document document14;
        nt ntVar14;
        ah.d dVar15;
        i0.b bVar7;
        i0.b bVar8;
        i0.b bVar9;
        int i20;
        ah.d dVar16;
        ah.d dVar17;
        float min;
        int i21;
        ah.d dVar18;
        ah.d dVar19;
        float f18;
        ah.d dVar20;
        ah.d dVar21;
        ah.d dVar22;
        ah.d dVar23;
        ah.d dVar24;
        ah.d dVar25;
        org.telegram.ui.ActionBar.f6 f6Var3;
        TLRPC.Document document15;
        int i22;
        nt ntVar15;
        nt ntVar16;
        nt ntVar17;
        nt ntVar18;
        TLRPC.InputStickerSet inputStickerSet;
        nt ntVar19;
        int i23;
        TLRPC.Document document16;
        nt ntVar20;
        int i24;
        nt ntVar21;
        int i25;
        nt ntVar22;
        nt ntVar23;
        nt ntVar24;
        nt ntVar25;
        int i26;
        ah.d dVar26;
        ah.d dVar27;
        int i27;
        jb1 jb1Var;
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        ah.d dVar28;
        org.telegram.ui.Components.o70 d;
        TLRPC.Document unused;
        pt ptVar = this.a;
        ng.a aVar = ptVar.t;
        if (ptVar.w == null || ptVar.m) {
            return;
        }
        ptVar.R = true;
        nt ntVar26 = ptVar.l;
        final int i28 = 0;
        if (ntVar26 != null && (d = ntVar26.d(ptVar.z)) != null) {
            d.Q(aVar, rg.b.j(ptVar.c0), true);
            d.t = false;
            d.Y();
            d.p = new zi(this, 16);
            ViewGroup viewGroup = d.A;
            ft ftVar = new ft(this, viewGroup);
            ptVar.k = ftVar;
            ftVar.e = true;
            ftVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
            ftVar.g = true;
            ftVar.setOutsideTouchable(true);
            ptVar.k.setClippingEnabled(true);
            ptVar.k.setAnimationStyle(R.style.PopupContextAnimation);
            ptVar.k.setFocusable(true);
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            ptVar.k.setInputMethodMode(2);
            ptVar.k.getContentView().setFocusableInTouchMode(true);
            i0.b bVar10 = ptVar.q;
            int min2 = (Math.min(ptVar.z.getWidth(), ptVar.z.getHeight() - (bVar10.d + bVar10.b)) - AndroidUtilities.dp(40.0f)) / 2;
            int dp = (int) ((AndroidUtilities.dp(24.0f) - ptVar.e) + ((int) (ptVar.e + Math.max(r2 + min2 + (ptVar.G != null ? AndroidUtilities.dp(40.0f) : 0), ((ptVar.z.getHeight() - r3) - ptVar.I) / 2) + min2)));
            ptVar.k.showAtLocation(ptVar.z, 0, (int) ((r4.getMeasuredWidth() - viewGroup.getMeasuredWidth()) / 2.0f), dp);
            try {
                ptVar.z.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            float f19 = ptVar.e;
            if (f19 != 0.0f) {
                ptVar.f = f19;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.et
                    public final /* synthetic */ lt b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i28) {
                            case 0:
                                pt ptVar2 = this.b.a;
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ptVar2.g = floatValue;
                                float f20 = ptVar2.f;
                                ptVar2.e = e2.c.w(0.0f, f20, floatValue, f20);
                                ptVar2.z.invalidate();
                                break;
                            case 1:
                                pt ptVar3 = this.b.a;
                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ptVar3.g = floatValue2;
                                float f21 = ptVar3.f;
                                ptVar3.e = e2.c.w(0.0f, f21, floatValue2, f21);
                                ptVar3.z.invalidate();
                                break;
                            default:
                                pt ptVar4 = this.b.a;
                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ptVar4.g = floatValue3;
                                float f22 = ptVar4.f;
                                ptVar4.e = e2.c.w(0.0f, f22, floatValue3, f22);
                                ptVar4.z.invalidate();
                                break;
                        }
                    }
                });
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(org.telegram.ui.Components.nr.f);
                ofFloat.start();
            }
            ptVar.K = true;
            return;
        }
        if (ptVar.V != 3) {
            nt ntVar27 = ptVar.l;
            if (ntVar27 != null) {
                TLRPC.TL_messageMediaPoll e = ntVar27.e();
                TLRPC.PollAnswer h = ptVar.l.h();
                if (e != null && e.poll != null && h != null) {
                    TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(e, h.option);
                    if (pollResult != null && pollResult.voters > 0) {
                        MessageObject.canShowVotersList(e);
                    }
                }
            }
            i10 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, ptVar.z.getContext(), ptVar.c0);
            org.telegram.ui.ActionBar.f6 f6Var4 = null;
            pg.b c3 = aVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout3, null, true);
            c3.n(rg.b.j(ptVar.c0));
            c3.p(AndroidUtilities.dp(12.0f));
            c3.o(AndroidUtilities.dp(8.0f));
            c3.h.e = true;
            actionBarPopupWindow$ActionBarPopupWindowLayout3.setBackground(c3);
            if (ptVar.V != 3) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (ptVar.T == null) {
                    nt ntVar28 = ptVar.l;
                    if (ntVar28 == null || !ntVar28.B()) {
                        if (ptVar.l.x()) {
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
                nt ntVar29 = ptVar.l;
                if (ntVar29 == null || !ntVar29.B()) {
                    nt ntVar30 = ptVar.l;
                    arrayList.add(LocaleController.getString((ntVar30 == null || !ntVar30.J()) ? R.string.AddToStickerPack : R.string.StickersReplaceSticker));
                    nt ntVar31 = ptVar.l;
                    b.j((ntVar31 == null || !ntVar31.J()) ? R.drawable.menu_sticker_add : R.drawable.msg_replace, arrayList3, arrayList2, 2);
                }
                int i29 = 7;
                int i30 = 6;
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, ptVar.w, ptVar.c0, true, false);
                g1Var.setItemHeight(44);
                g1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                g1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                FrameLayout frameLayout = new FrameLayout(ptVar.z.getContext());
                LinearLayout linearLayout = new LinearLayout(ptVar.z.getContext());
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, ptVar.c0));
                linearLayout.setOrientation(1);
                if (ptVar.w == null) {
                    jb1Var = null;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new TLRPC.TL_stickerSetNoCovered());
                    TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = new TLRPC.TL_messages_getMyStickers();
                    tL_messages_getMyStickers.limit = 100;
                    ConnectionsManager.getInstance(ptVar.r).sendRequest(tL_messages_getMyStickers, new ba(ptVar, arrayList4, tL_messages_getMyStickers, i29));
                    jb1Var = new jb1(ptVar.w, i30, f6Var4);
                    jb1Var.setLayoutManager(new f2.i0());
                    jb1Var.i(new gg.e2(arrayList4, 4));
                    jb1Var.setAdapter(new mt(ptVar, arrayList4));
                }
                jb1Var.setOnItemClickListener(new j(this, 5));
                frameLayout.addView(g1Var);
                linearLayout.addView(frameLayout);
                linearLayout.addView(new org.telegram.ui.ActionBar.m1(ptVar.z.getContext(), ptVar.c0), k7.b6.n(-1, 8));
                nh.c0 c0Var = new nh.c0(this, arrayList2, jb1Var, linearLayout, actionBarPopupWindow$ActionBarPopupWindowLayout3, 12);
                for (int i31 = 0; i31 < arrayList.size(); i31++) {
                    org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, ((Integer) arrayList3.get(i31)).intValue(), (CharSequence) arrayList.get(i31), false, ptVar.c0);
                    c10.setTag(Integer.valueOf(i31));
                    c10.setOnClickListener(c0Var);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                linearLayout.addView(jb1Var, new LinearLayout.LayoutParams(actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() - AndroidUtilities.dp(16.0f), (int) (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() * 1.5f)));
                actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                frameLayout.setOnClickListener(new nf(actionBarPopupWindow$ActionBarPopupWindowLayout, 2));
                i0.b bVar11 = ptVar.q;
                int i32 = bVar11.d + bVar11.b;
                int min3 = ((int) (Math.min(ptVar.z.getWidth(), ptVar.z.getHeight() - i32) / 1.8f)) / 2;
                ptVar.z.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, k7.b6.d(-2, -2.0f, 49, 0.0f, (AndroidUtilities.dp(84.0f) + ((int) ((ptVar.e + Math.max(r0 + min3, ((ptVar.z.getHeight() - i32) - ptVar.I) / 2)) + min3))) / AndroidUtilities.density, 0.0f, 0.0f));
                ptVar.L = actionBarPopupWindow$ActionBarPopupWindowLayout;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(-AndroidUtilities.dp(12.0f));
                ptVar.L.setAlpha(0.0f);
                view = ptVar.L;
                view.setScaleX(0.8f);
                view2 = ptVar.L;
                view2.setScaleY(0.8f);
                view3 = ptVar.L;
                view3.setPivotY(0.0f);
                view4 = ptVar.L;
                view5 = ptVar.L;
                view4.setPivotX(view5.getMeasuredWidth() / 2.0f);
                view6 = ptVar.L;
                view6.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.nr.h).start();
                if (ptVar.P == null) {
                    org.telegram.ui.Components.rb rbVar = new org.telegram.ui.Components.rb(ptVar, ptVar.z.getContext(), UserConfig.selectedAccount, ptVar.c0);
                    ptVar.P = rbVar;
                    rbVar.K0 = true;
                    rbVar.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                    ptVar.P.setClipChildren(false);
                    ptVar.P.setClipToPadding(false);
                    ptVar.P.setVisibility(0);
                    ptVar.P.setHint(LocaleController.getString(R.string.StickersSetEmojiForSticker));
                    ptVar.P.setBubbleOffset(-AndroidUtilities.dp(105.0f));
                    ptVar.P.setMiniBubblesOffset(-AndroidUtilities.dp(14.0f));
                    FrameLayout frameLayout2 = new FrameLayout(ptVar.z.getContext());
                    ptVar.Q = frameLayout2;
                    frameLayout2.addView(ptVar.P, k7.b6.d(-2, 116.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                    ptVar.z.addView(ptVar.Q, k7.b6.d(-2, -2.0f, 1, 0.0f, 100.0f, 0.0f, 0.0f));
                }
                ptVar.P.setSelectedEmojis(ptVar.o);
                ptVar.P.setDelegate(new bt(ptVar));
                ptVar.P.p(null, null, false);
                ptVar.Q.setScaleY(0.6f);
                ptVar.Q.setScaleX(0.6f);
                ptVar.Q.setAlpha(0.0f);
                AndroidUtilities.runOnUIThread(new at(ptVar, 2), 10L);
                ptVar.K = true;
                dVar28 = ptVar.z;
                dVar28.invalidate();
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                final int i33 = 1;
                int i34 = 0;
                i11 = ptVar.V;
                if (i11 != 0) {
                    i12 = ptVar.V;
                    if (i12 == 2) {
                        ntVar8 = ptVar.l;
                        if (ntVar8 != null) {
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = new ArrayList();
                            ntVar9 = ptVar.l;
                            i16 = ptVar.V;
                            if (ntVar9.l(i16)) {
                                arrayList5.add(LocaleController.getString(R.string.SendEmojiPreview));
                                b.j(R.drawable.msg_send, arrayList7, arrayList6, 0);
                            }
                            ntVar10 = ptVar.l;
                            document5 = ptVar.W;
                            Boolean P = ntVar10.P(document5);
                            if (P != null) {
                                if (P.booleanValue()) {
                                    arrayList5.add(LocaleController.getString(R.string.SetAsEmojiStatus));
                                    b.j(R.drawable.msg_smile_status, arrayList7, arrayList6, 1);
                                } else {
                                    arrayList5.add(LocaleController.getString(R.string.RemoveStatus));
                                    b.j(R.drawable.msg_smile_status, arrayList7, arrayList6, 2);
                                }
                            }
                            ntVar11 = ptVar.l;
                            document6 = ptVar.W;
                            if (ntVar11.E(document6)) {
                                arrayList5.add(LocaleController.getString(R.string.CopyEmojiPreview));
                                b.j(R.drawable.msg_copy, arrayList7, arrayList6, 3);
                            }
                            ntVar12 = ptVar.l;
                            document7 = ptVar.W;
                            if (ntVar12.N(document7)) {
                                arrayList5.add(LocaleController.getString(R.string.RemoveFromRecent));
                                b.j(R.drawable.msg_delete, arrayList7, arrayList6, 4);
                            }
                            i17 = ptVar.r;
                            MediaDataController mediaDataController = MediaDataController.getInstance(i17);
                            document8 = ptVar.W;
                            boolean isStickerInFavorites = mediaDataController.isStickerInFavorites(document8);
                            document9 = ptVar.W;
                            if (!MessageObject.isAnimatedEmoji(document9)) {
                                document10 = ptVar.W;
                                if (!MessageObject.isMaskDocument(document10)) {
                                    if (!isStickerInFavorites) {
                                        i18 = ptVar.r;
                                        if (MediaDataController.getInstance(i18).canAddStickerToFavorites()) {
                                            document11 = ptVar.W;
                                        }
                                    }
                                    arrayList5.add(LocaleController.getString(isStickerInFavorites ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                                    b.j(isStickerInFavorites ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList7, arrayList6, 5);
                                }
                            }
                            if (arrayList5.isEmpty()) {
                                return;
                            }
                            ptVar.K = true;
                            dVar8 = ptVar.z;
                            dVar8.invalidate();
                            int[] iArr = new int[arrayList7.size()];
                            for (int i35 = 0; i35 < arrayList7.size(); i35++) {
                                iArr[i35] = ((Integer) arrayList7.get(i35)).intValue();
                            }
                            org.telegram.ui.Components.yb0 yb0Var = new org.telegram.ui.Components.yb0(this, arrayList6, isStickerInFavorites);
                            boolean h9 = pt.h(ptVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            int i36 = 0;
                            while (i36 < arrayList5.size()) {
                                boolean z10 = !h9 && i36 == 0;
                                boolean z11 = i36 == arrayList5.size() + (-1);
                                int intValue = ((Integer) arrayList7.get(i36)).intValue();
                                CharSequence charSequence = (CharSequence) arrayList5.get(i36);
                                f6Var2 = ptVar.c0;
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(z10, z11, actionBarPopupWindow$ActionBarPopupWindowLayout4, intValue, charSequence, false, f6Var2);
                                if (((Integer) arrayList6.get(i36)).intValue() == 4) {
                                    c11.setIconColor(pt.d(ptVar, org.telegram.ui.ActionBar.j6.p7));
                                    c11.setTextColor(pt.d(ptVar, org.telegram.ui.ActionBar.j6.q7));
                                }
                                c11.setTag(Integer.valueOf(i36));
                                c11.setOnClickListener(yb0Var);
                                i36++;
                                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            jt jtVar = new jt(this, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                            ptVar.k = jtVar;
                            jtVar.e = true;
                            jtVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
                            jtVar.g = true;
                            jtVar.setOutsideTouchable(true);
                            ptVar.k.setClippingEnabled(true);
                            ptVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                            ptVar.k.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            ptVar.k.setInputMethodMode(2);
                            ptVar.k.getContentView().setFocusableInTouchMode(true);
                            bVar4 = ptVar.q;
                            int i37 = bVar4.d;
                            bVar5 = ptVar.q;
                            int i38 = i37 + bVar5.b;
                            bVar6 = ptVar.q;
                            int i39 = bVar6.b;
                            dVar9 = ptVar.z;
                            int width = dVar9.getWidth();
                            dVar10 = ptVar.z;
                            int min4 = Math.min(width, dVar10.getHeight() - i38) - AndroidUtilities.dp(40.0f);
                            f14 = ptVar.e;
                            int i40 = min4 / 2;
                            int i41 = i39 + i40;
                            int dp2 = ptVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                            dVar11 = ptVar.z;
                            float max = (int) (f14 + Math.max(i41 + dp2, ((dVar11.getHeight() - i38) - ptVar.I) / 2) + i40);
                            float dp3 = AndroidUtilities.dp(24.0f);
                            f15 = ptVar.e;
                            int i42 = (int) ((dp3 - f15) + max);
                            org.telegram.ui.ActionBar.p1 p1Var = ptVar.k;
                            dVar12 = ptVar.z;
                            dVar13 = ptVar.z;
                            p1Var.showAtLocation(dVar12, 0, (int) ((dVar13.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth()) / 2.0f), i42);
                            org.telegram.ui.ActionBar.p1.i(actionBarPopupWindow$ActionBarPopupWindowLayout2);
                            try {
                                dVar14 = ptVar.z;
                                dVar14.performHapticFeedback(0);
                            } catch (Exception unused3) {
                            }
                            f16 = ptVar.e;
                            if (f16 != 0.0f) {
                                f17 = ptVar.e;
                                ptVar.f = f17;
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.et
                                    public final /* synthetic */ lt b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        switch (i33) {
                                            case 0:
                                                pt ptVar2 = this.b.a;
                                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                ptVar2.g = floatValue;
                                                float f20 = ptVar2.f;
                                                ptVar2.e = e2.c.w(0.0f, f20, floatValue, f20);
                                                ptVar2.z.invalidate();
                                                break;
                                            case 1:
                                                pt ptVar3 = this.b.a;
                                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                ptVar3.g = floatValue2;
                                                float f21 = ptVar3.f;
                                                ptVar3.e = e2.c.w(0.0f, f21, floatValue2, f21);
                                                ptVar3.z.invalidate();
                                                break;
                                            default:
                                                pt ptVar4 = this.b.a;
                                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                ptVar4.g = floatValue3;
                                                float f22 = ptVar4.f;
                                                ptVar4.e = e2.c.w(0.0f, f22, floatValue3, f22);
                                                ptVar4.z.invalidate();
                                                break;
                                        }
                                    }
                                });
                                ofFloat2.setDuration(350L);
                                ofFloat2.setInterpolator(org.telegram.ui.Components.nr.f);
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
                    ntVar = ptVar.l;
                    if (ntVar != null) {
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        ntVar2 = ptVar.l;
                        i13 = ptVar.V;
                        if (ntVar2.l(i13)) {
                            ntVar7 = ptVar.l;
                            if (!ntVar7.c()) {
                                arrayList8.add(LocaleController.getString(R.string.SendGifPreview));
                                b.j(R.drawable.msg_send, arrayList10, arrayList9, 0);
                            }
                        }
                        ntVar3 = ptVar.l;
                        i14 = ptVar.V;
                        if (ntVar3.l(i14)) {
                            ntVar6 = ptVar.l;
                            if (!ntVar6.c()) {
                                arrayList8.add(LocaleController.getString(R.string.SendWithoutSound));
                                b.j(R.drawable.input_notify_off, arrayList10, arrayList9, 4);
                            }
                        }
                        ntVar4 = ptVar.l;
                        if (ntVar4.b()) {
                            arrayList8.add(LocaleController.getString(R.string.Schedule));
                            b.j(R.drawable.msg_autodelete, arrayList10, arrayList9, 3);
                        }
                        document = ptVar.W;
                        if (document != null) {
                            ntVar5 = ptVar.l;
                            document4 = ptVar.W;
                            if (ntVar5.f(document4)) {
                                arrayList8.add(LocaleController.getString(R.string.AddACaption));
                                b.h(R.drawable.outline_caption_24, 11, arrayList10, arrayList9);
                            }
                        }
                        document2 = ptVar.W;
                        if (document2 != null) {
                            i15 = ptVar.r;
                            MediaDataController mediaDataController2 = MediaDataController.getInstance(i15);
                            document3 = ptVar.W;
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
                        ptVar.K = true;
                        dVar = ptVar.z;
                        dVar.invalidate();
                        int[] iArr2 = new int[arrayList10.size()];
                        for (int i43 = 0; i43 < arrayList10.size(); i43++) {
                            iArr2[i43] = ((Integer) arrayList10.get(i43)).intValue();
                        }
                        org.telegram.ui.Components.rx0 rx0Var = new org.telegram.ui.Components.rx0(13, this, arrayList9);
                        for (int i44 = 0; i44 < arrayList8.size(); i44++) {
                            int intValue2 = ((Integer) arrayList10.get(i44)).intValue();
                            CharSequence charSequence2 = (CharSequence) arrayList8.get(i44);
                            f6Var = ptVar.c0;
                            org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, intValue2, charSequence2, false, f6Var);
                            c12.setTag(Integer.valueOf(i44));
                            c12.setOnClickListener(rx0Var);
                            if (z4 && i44 == arrayList8.size() - 1) {
                                c12.c(pt.d(ptVar, org.telegram.ui.ActionBar.j6.q7), pt.d(ptVar, org.telegram.ui.ActionBar.j6.p7));
                            }
                        }
                        kt ktVar = new kt(this, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                        ptVar.k = ktVar;
                        ktVar.e = true;
                        ktVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
                        ktVar.g = true;
                        ktVar.setOutsideTouchable(true);
                        ptVar.k.setClippingEnabled(true);
                        ptVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                        ptVar.k.setFocusable(true);
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                        ptVar.k.setInputMethodMode(2);
                        ptVar.k.getContentView().setFocusableInTouchMode(true);
                        bVar = ptVar.q;
                        int i45 = bVar.d;
                        bVar2 = ptVar.q;
                        int i46 = i45 + bVar2.b;
                        bVar3 = ptVar.q;
                        int i47 = bVar3.b;
                        dVar2 = ptVar.z;
                        int width2 = dVar2.getWidth();
                        dVar3 = ptVar.z;
                        int min5 = Math.min(width2, dVar3.getHeight() - i46) - AndroidUtilities.dp(40.0f);
                        f10 = ptVar.e;
                        int i48 = min5 / 2;
                        int i49 = i47 + i48;
                        int dp4 = ptVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                        dVar4 = ptVar.z;
                        float max2 = (int) (f10 + Math.max(i49 + dp4, ((dVar4.getHeight() - i46) - ptVar.I) / 2) + i48);
                        float dp5 = AndroidUtilities.dp(24.0f);
                        f11 = ptVar.e;
                        int i50 = (int) ((dp5 - f11) + max2);
                        org.telegram.ui.ActionBar.p1 p1Var2 = ptVar.k;
                        dVar5 = ptVar.z;
                        dVar6 = ptVar.z;
                        p1Var2.showAtLocation(dVar5, 0, (int) ((dVar6.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth()) / 2.0f), i50);
                        try {
                            dVar7 = ptVar.z;
                            dVar7.performHapticFeedback(0);
                        } catch (Exception unused4) {
                        }
                        f12 = ptVar.e;
                        if (f12 != 0.0f) {
                            f13 = ptVar.e;
                            ptVar.f = f13;
                            final int i51 = 2;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.et
                                public final /* synthetic */ lt b;

                                {
                                    this.b = this;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (i51) {
                                        case 0:
                                            pt ptVar2 = this.b.a;
                                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            ptVar2.g = floatValue;
                                            float f20 = ptVar2.f;
                                            ptVar2.e = e2.c.w(0.0f, f20, floatValue, f20);
                                            ptVar2.z.invalidate();
                                            break;
                                        case 1:
                                            pt ptVar3 = this.b.a;
                                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            ptVar3.g = floatValue2;
                                            float f21 = ptVar3.f;
                                            ptVar3.e = e2.c.w(0.0f, f21, floatValue2, f21);
                                            ptVar3.z.invalidate();
                                            break;
                                        default:
                                            pt ptVar4 = this.b.a;
                                            float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            ptVar4.g = floatValue3;
                                            float f22 = ptVar4.f;
                                            ptVar4.e = e2.c.w(0.0f, f22, floatValue3, f22);
                                            ptVar4.z.invalidate();
                                            break;
                                    }
                                }
                            });
                            ofFloat3.setDuration(350L);
                            ofFloat3.setInterpolator(org.telegram.ui.Components.nr.f);
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
                document12 = ptVar.W;
                if (MessageObject.isPremiumSticker(document12)) {
                    i26 = ptVar.r;
                    if (!AccountInstance.getInstance(i26).getUserConfig().isPremium()) {
                        if (ptVar.O == null) {
                            pg1 pg1Var = new pg1(ptVar.z.getContext(), ptVar.c0);
                            ptVar.O = pg1Var;
                            ptVar.z.addView(pg1Var, k7.b6.c(-1.0f, -1));
                            ptVar.O.setOnClickListener(new dt(ptVar, i34));
                            ptVar.O.a.r.setOnClickListener(new dt(ptVar, i33));
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(ptVar.O, false, 1.0f, false);
                        AndroidUtilities.updateViewVisibilityAnimated(ptVar.O, true);
                        ptVar.O.setTranslationY(0.0f);
                        ptVar.K = true;
                        dVar26 = ptVar.z;
                        dVar26.invalidate();
                        try {
                            dVar27 = ptVar.z;
                            dVar27.performHapticFeedback(0);
                            return;
                        } catch (Exception unused5) {
                            return;
                        }
                    }
                }
                i19 = ptVar.r;
                MediaDataController mediaDataController3 = MediaDataController.getInstance(i19);
                document13 = ptVar.W;
                boolean isStickerInFavorites2 = mediaDataController3.isStickerInFavorites(document13);
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                ntVar13 = ptVar.l;
                if (ntVar13 != null) {
                    ntVar20 = ptVar.l;
                    i24 = ptVar.V;
                    if (ntVar20.l(i24)) {
                        ntVar25 = ptVar.l;
                        if (!ntVar25.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendStickerPreview));
                            b.j(R.drawable.msg_send, arrayList13, arrayList12, 0);
                        }
                    }
                    ntVar21 = ptVar.l;
                    i25 = ptVar.V;
                    if (ntVar21.l(i25)) {
                        ntVar24 = ptVar.l;
                        if (!ntVar24.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendWithoutSound));
                            b.h(R.drawable.input_notify_off, 6, arrayList13, arrayList12);
                        }
                    }
                    ntVar22 = ptVar.l;
                    if (ntVar22.b()) {
                        arrayList11.add(LocaleController.getString(R.string.Schedule));
                        b.j(R.drawable.msg_autodelete, arrayList13, arrayList12, 3);
                    }
                    ntVar23 = ptVar.l;
                    if (ntVar23.g()) {
                        arrayList11.add(LocaleController.getString(R.string.ImportStickersRemoveMenu));
                        b.j(R.drawable.msg_delete, arrayList13, arrayList12, 5);
                    }
                }
                document14 = ptVar.W;
                if (!MessageObject.isMaskDocument(document14)) {
                    if (!isStickerInFavorites2) {
                        i23 = ptVar.r;
                        if (MediaDataController.getInstance(i23).canAddStickerToFavorites()) {
                            document16 = ptVar.W;
                        }
                    }
                    arrayList11.add(LocaleController.getString(isStickerInFavorites2 ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                    b.j(isStickerInFavorites2 ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList13, arrayList12, 2);
                }
                ntVar14 = ptVar.l;
                if (ntVar14 != null && (inputStickerSet = ptVar.a0) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                    ntVar19 = ptVar.l;
                    if (ntVar19.Q()) {
                        arrayList11.add(LocaleController.formatString(R.string.ViewPackPreview, new Object[0]));
                        b.j(R.drawable.msg_media, arrayList13, arrayList12, 1);
                    }
                }
                if (ptVar.p) {
                    arrayList11.add(LocaleController.getString(R.string.DeleteFromRecent));
                    b.j(R.drawable.msg_delete, arrayList13, arrayList12, 4);
                }
                if (ptVar.a0 != null) {
                    document15 = ptVar.W;
                    if (document15 != null) {
                        i22 = ptVar.r;
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i22).getStickerSet(ptVar.a0, true);
                        if (stickerSet != null) {
                            ntVar17 = ptVar.l;
                            if (ntVar17 != null) {
                                ntVar18 = ptVar.l;
                                if (ntVar18.D()) {
                                    TLRPC.StickerSet stickerSet2 = stickerSet.set;
                                    if (!stickerSet2.emojis && !stickerSet2.masks) {
                                        arrayList11.add(LocaleController.getString(R.string.EditSticker));
                                        b.h(R.drawable.msg_edit, 7, arrayList13, arrayList12);
                                    }
                                }
                            }
                        }
                        if (stickerSet != null && stickerSet.set.creator) {
                            ntVar15 = ptVar.l;
                            if (ntVar15 != null) {
                                ntVar16 = ptVar.l;
                                unused = ptVar.W;
                                if (ntVar16.I()) {
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
                ptVar.K = true;
                dVar15 = ptVar.z;
                dVar15.invalidate();
                gt gtVar = new gt(this, arrayList12, isStickerInFavorites2);
                pt.h(ptVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                for (int i52 = 0; i52 < arrayList11.size(); i52++) {
                    int intValue3 = ((Integer) arrayList13.get(i52)).intValue();
                    CharSequence charSequence3 = (CharSequence) arrayList11.get(i52);
                    f6Var3 = ptVar.c0;
                    org.telegram.ui.ActionBar.g1 c13 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, intValue3, charSequence3, false, f6Var3);
                    c13.setTag(Integer.valueOf(i52));
                    c13.setOnClickListener(gtVar);
                    if (((Integer) arrayList12.get(i52)).intValue() == 8) {
                        int d10 = pt.d(ptVar, org.telegram.ui.ActionBar.j6.q7);
                        c13.c(d10, d10);
                        c13.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.1f, d10));
                    }
                }
                ht htVar = new ht(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                ptVar.k = htVar;
                htVar.e = true;
                htVar.c = 100;
                htVar.g = true;
                htVar.setOutsideTouchable(true);
                ptVar.k.setClippingEnabled(true);
                ptVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                ptVar.k.setFocusable(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                ptVar.k.setInputMethodMode(2);
                ptVar.k.getContentView().setFocusableInTouchMode(true);
                bVar7 = ptVar.q;
                int i53 = bVar7.d;
                bVar8 = ptVar.q;
                int i54 = i53 + bVar8.b;
                bVar9 = ptVar.q;
                int i55 = bVar9.b;
                i20 = ptVar.V;
                if (i20 == 1) {
                    dVar24 = ptVar.z;
                    int width3 = dVar24.getWidth();
                    dVar25 = ptVar.z;
                    i21 = Math.min(width3, dVar25.getHeight() - i54) - AndroidUtilities.dp(40.0f);
                } else {
                    if (ptVar.S) {
                        dVar18 = ptVar.z;
                        int width4 = dVar18.getWidth();
                        dVar19 = ptVar.z;
                        min = Math.min(width4, dVar19.getHeight() - i54) - AndroidUtilities.dpf2(40.0f);
                    } else {
                        dVar16 = ptVar.z;
                        int width5 = dVar16.getWidth();
                        dVar17 = ptVar.z;
                        min = Math.min(width5, dVar17.getHeight() - i54) / 1.8f;
                    }
                    i21 = (int) min;
                }
                f18 = ptVar.e;
                int i56 = i21 / 2;
                int i57 = i55 + i56;
                int dp6 = ptVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                dVar20 = ptVar.z;
                int dp7 = AndroidUtilities.dp(24.0f) + ((int) (f18 + Math.max(i57 + dp6, ((dVar20.getHeight() - i54) - ptVar.I) / 2) + i56));
                if (ptVar.S) {
                    dp7 += AndroidUtilities.dp(24.0f);
                }
                org.telegram.ui.ActionBar.p1 p1Var3 = ptVar.k;
                dVar21 = ptVar.z;
                dVar22 = ptVar.z;
                p1Var3.showAtLocation(dVar21, 0, (int) ((dVar22.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), dp7);
                try {
                    dVar23 = ptVar.z;
                    dVar23.performHapticFeedback(0);
                } catch (Exception unused6) {
                }
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            i27 = 0;
            while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount()) {
            }
        }
        i10 = 1;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout32 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, ptVar.z.getContext(), ptVar.c0);
        org.telegram.ui.ActionBar.f6 f6Var42 = null;
        pg.b c32 = aVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout32, null, true);
        c32.n(rg.b.j(ptVar.c0));
        c32.p(AndroidUtilities.dp(12.0f));
        c32.o(AndroidUtilities.dp(8.0f));
        c32.h.e = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout32.setBackground(c32);
        if (ptVar.V != 3) {
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        i27 = 0;
        while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount()) {
        }
    }
}
