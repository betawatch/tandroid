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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ot implements Runnable {
    public final /* synthetic */ st a;

    public ot(st stVar) {
        this.a = stVar;
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
        qt qtVar;
        qt qtVar2;
        int i13;
        qt qtVar3;
        int i14;
        qt qtVar4;
        TLRPC.Document document;
        TLRPC.Document document2;
        boolean z10;
        ah.w wVar;
        i0.c cVar;
        i0.c cVar2;
        i0.c cVar3;
        ah.w wVar2;
        ah.w wVar3;
        float f7;
        ah.w wVar4;
        float f10;
        ah.w wVar5;
        ah.w wVar6;
        float f11;
        float f12;
        ah.w wVar7;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i15;
        TLRPC.Document document3;
        qt qtVar5;
        TLRPC.Document document4;
        qt qtVar6;
        qt qtVar7;
        qt qtVar8;
        qt qtVar9;
        int i16;
        qt qtVar10;
        TLRPC.Document document5;
        qt qtVar11;
        TLRPC.Document document6;
        qt qtVar12;
        TLRPC.Document document7;
        int i17;
        TLRPC.Document document8;
        TLRPC.Document document9;
        ah.w wVar8;
        i0.c cVar4;
        i0.c cVar5;
        i0.c cVar6;
        ah.w wVar9;
        ah.w wVar10;
        float f13;
        ah.w wVar11;
        float f14;
        ah.w wVar12;
        ah.w wVar13;
        float f15;
        float f16;
        ah.w wVar14;
        org.telegram.ui.ActionBar.f6 f6Var2;
        TLRPC.Document document10;
        int i18;
        TLRPC.Document document11;
        TLRPC.Document document12;
        int i19;
        TLRPC.Document document13;
        qt qtVar13;
        TLRPC.Document document14;
        qt qtVar14;
        ah.w wVar15;
        i0.c cVar7;
        i0.c cVar8;
        i0.c cVar9;
        int i20;
        ah.w wVar16;
        ah.w wVar17;
        float min;
        int i21;
        ah.w wVar18;
        ah.w wVar19;
        float f17;
        ah.w wVar20;
        ah.w wVar21;
        ah.w wVar22;
        ah.w wVar23;
        ah.w wVar24;
        ah.w wVar25;
        org.telegram.ui.ActionBar.f6 f6Var3;
        TLRPC.Document document15;
        int i22;
        qt qtVar15;
        qt qtVar16;
        qt qtVar17;
        qt qtVar18;
        TLRPC.InputStickerSet inputStickerSet;
        qt qtVar19;
        int i23;
        TLRPC.Document document16;
        qt qtVar20;
        int i24;
        qt qtVar21;
        int i25;
        qt qtVar22;
        qt qtVar23;
        qt qtVar24;
        qt qtVar25;
        int i26;
        ah.w wVar26;
        ah.w wVar27;
        int i27;
        ec1 ec1Var;
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        ah.w wVar28;
        org.telegram.ui.Components.n70 t10;
        TLRPC.Document unused;
        st stVar = this.a;
        bh.b bVar = stVar.t;
        if (stVar.w == null || stVar.m) {
            return;
        }
        stVar.R = true;
        qt qtVar26 = stVar.l;
        final int i28 = 0;
        if (qtVar26 != null && (t10 = qtVar26.t(stVar.z)) != null) {
            t10.Q(bVar, fh.b.k(stVar.c0), true);
            t10.t = false;
            t10.Y();
            t10.p = new dj(this, 16);
            ViewGroup viewGroup = t10.A;
            jt jtVar = new jt(this, viewGroup);
            stVar.k = jtVar;
            jtVar.e = true;
            jtVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
            jtVar.g = true;
            jtVar.setOutsideTouchable(true);
            stVar.k.setClippingEnabled(true);
            stVar.k.setAnimationStyle(R.style.PopupContextAnimation);
            stVar.k.setFocusable(true);
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            stVar.k.setInputMethodMode(2);
            stVar.k.getContentView().setFocusableInTouchMode(true);
            i0.c cVar10 = stVar.q;
            int min2 = (Math.min(stVar.z.getWidth(), stVar.z.getHeight() - (cVar10.d + cVar10.b)) - AndroidUtilities.dp(40.0f)) / 2;
            int dp = (int) ((AndroidUtilities.dp(24.0f) - stVar.e) + ((int) (stVar.e + Math.max(r2 + min2 + (stVar.G != null ? AndroidUtilities.dp(40.0f) : 0), ((stVar.z.getHeight() - r3) - stVar.I) / 2) + min2)));
            stVar.k.showAtLocation(stVar.z, 0, (int) ((r4.getMeasuredWidth() - viewGroup.getMeasuredWidth()) / 2.0f), dp);
            try {
                stVar.z.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            float f18 = stVar.e;
            if (f18 != 0.0f) {
                stVar.f = f18;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ht
                    public final /* synthetic */ ot b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i28) {
                            case 0:
                                st stVar2 = this.b.a;
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                stVar2.g = floatValue;
                                float f19 = stVar2.f;
                                stVar2.e = com.google.android.gms.internal.vision.e2.z(0.0f, f19, floatValue, f19);
                                stVar2.z.invalidate();
                                break;
                            case 1:
                                st stVar3 = this.b.a;
                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                stVar3.g = floatValue2;
                                float f20 = stVar3.f;
                                stVar3.e = com.google.android.gms.internal.vision.e2.z(0.0f, f20, floatValue2, f20);
                                stVar3.z.invalidate();
                                break;
                            default:
                                st stVar4 = this.b.a;
                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                stVar4.g = floatValue3;
                                float f21 = stVar4.f;
                                stVar4.e = com.google.android.gms.internal.vision.e2.z(0.0f, f21, floatValue3, f21);
                                stVar4.z.invalidate();
                                break;
                        }
                    }
                });
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(org.telegram.ui.Components.pr.f);
                ofFloat.start();
            }
            stVar.K = true;
            return;
        }
        if (stVar.V != 3) {
            qt qtVar27 = stVar.l;
            if (qtVar27 != null) {
                TLRPC.TL_messageMediaPoll d = qtVar27.d();
                TLRPC.PollAnswer g10 = stVar.l.g();
                if (d != null && d.poll != null && g10 != null) {
                    TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(d, g10.option);
                    if (pollResult != null && pollResult.voters > 0) {
                        MessageObject.canShowVotersList(d);
                    }
                }
            }
            i10 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, stVar.z.getContext(), stVar.c0);
            org.telegram.ui.ActionBar.f6 f6Var4 = null;
            dh.d c10 = bVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout2, null, true);
            c10.n(fh.b.k(stVar.c0));
            c10.p(AndroidUtilities.dp(12.0f));
            c10.o(AndroidUtilities.dp(8.0f));
            c10.h.e = true;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackground(c10);
            if (stVar.V != 3) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (stVar.T == null) {
                    qt qtVar28 = stVar.l;
                    if (qtVar28 == null || !qtVar28.A()) {
                        if (stVar.l.x()) {
                            arrayList.add(LocaleController.getString(R.string.SendStickerPreview));
                            org.telegram.ui.Cells.p6.o(R.drawable.msg_send, arrayList3, arrayList2, 0);
                        }
                        arrayList.add(LocaleController.getString(R.string.AddToFavorites));
                        org.telegram.ui.Cells.p6.o(R.drawable.msg_fave, arrayList3, arrayList2, 1);
                    } else {
                        arrayList.add(LocaleController.getString(R.string.SetIntroSticker));
                        org.telegram.ui.Cells.p6.o(R.drawable.menu_sticker_add, arrayList3, arrayList2, 0);
                    }
                }
                qt qtVar29 = stVar.l;
                if (qtVar29 == null || !qtVar29.A()) {
                    qt qtVar30 = stVar.l;
                    arrayList.add(LocaleController.getString((qtVar30 == null || !qtVar30.J()) ? R.string.AddToStickerPack : R.string.StickersReplaceSticker));
                    qt qtVar31 = stVar.l;
                    org.telegram.ui.Cells.p6.o((qtVar31 == null || !qtVar31.J()) ? R.drawable.menu_sticker_add : R.drawable.msg_replace, arrayList3, arrayList2, 2);
                }
                int i29 = 7;
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, stVar.w, stVar.c0, true, false);
                f1Var.setItemHeight(44);
                f1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                f1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                FrameLayout frameLayout = new FrameLayout(stVar.z.getContext());
                LinearLayout linearLayout = new LinearLayout(stVar.z.getContext());
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, stVar.c0));
                linearLayout.setOrientation(1);
                if (stVar.w == null) {
                    ec1Var = null;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new TLRPC.TL_stickerSetNoCovered());
                    TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = new TLRPC.TL_messages_getMyStickers();
                    tL_messages_getMyStickers.limit = 100;
                    ConnectionsManager.getInstance(stVar.r).sendRequest(tL_messages_getMyStickers, new aa(stVar, arrayList4, tL_messages_getMyStickers, i29));
                    ec1 ec1Var2 = new ec1(stVar.w, i29, f6Var4);
                    ec1Var2.setLayoutManager(new s4.c0());
                    ec1Var2.i(new di.r1(arrayList4, 4));
                    ec1Var2.setAdapter(new pt(stVar, arrayList4));
                    ec1Var = ec1Var2;
                }
                ec1Var.setOnItemClickListener(new i(this, 5));
                frameLayout.addView(f1Var);
                linearLayout.addView(frameLayout);
                linearLayout.addView(new org.telegram.ui.ActionBar.k1(stVar.z.getContext(), stVar.c0), w7.x5.n(-1, 8));
                bi.l0 l0Var = new bi.l0(this, arrayList2, ec1Var, linearLayout, actionBarPopupWindow$ActionBarPopupWindowLayout2, 13);
                for (int i30 = 0; i30 < arrayList.size(); i30++) {
                    org.telegram.ui.ActionBar.f1 c11 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, ((Integer) arrayList3.get(i30)).intValue(), (CharSequence) arrayList.get(i30), false, stVar.c0);
                    c11.setTag(Integer.valueOf(i30));
                    c11.setOnClickListener(l0Var);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                linearLayout.addView(ec1Var, new LinearLayout.LayoutParams(actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth() - AndroidUtilities.dp(16.0f), (int) (actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredHeight() * 1.5f)));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.b(linearLayout);
                frameLayout.setOnClickListener(new tf(actionBarPopupWindow$ActionBarPopupWindowLayout2, 2));
                i0.c cVar11 = stVar.q;
                int i31 = cVar11.d + cVar11.b;
                int min3 = ((int) (Math.min(stVar.z.getWidth(), stVar.z.getHeight() - i31) / 1.8f)) / 2;
                stVar.z.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, w7.x5.d(-2, -2.0f, 49, 0.0f, (AndroidUtilities.dp(84.0f) + ((int) ((stVar.e + Math.max(r0 + min3, ((stVar.z.getHeight() - i31) - stVar.I) / 2)) + min3))) / AndroidUtilities.density, 0.0f, 0.0f));
                stVar.L = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setTranslationY(-AndroidUtilities.dp(12.0f));
                stVar.L.setAlpha(0.0f);
                view = stVar.L;
                view.setScaleX(0.8f);
                view2 = stVar.L;
                view2.setScaleY(0.8f);
                view3 = stVar.L;
                view3.setPivotY(0.0f);
                view4 = stVar.L;
                view5 = stVar.L;
                view4.setPivotX(view5.getMeasuredWidth() / 2.0f);
                view6 = stVar.L;
                view6.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.pr.h).start();
                if (stVar.P == null) {
                    org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(stVar, stVar.z.getContext(), UserConfig.selectedAccount, stVar.c0);
                    stVar.P = zbVar;
                    zbVar.N0 = true;
                    zbVar.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                    stVar.P.setClipChildren(false);
                    stVar.P.setClipToPadding(false);
                    stVar.P.setVisibility(0);
                    stVar.P.setHint(LocaleController.getString(R.string.StickersSetEmojiForSticker));
                    stVar.P.setBubbleOffset(-AndroidUtilities.dp(105.0f));
                    stVar.P.setMiniBubblesOffset(-AndroidUtilities.dp(14.0f));
                    FrameLayout frameLayout2 = new FrameLayout(stVar.z.getContext());
                    stVar.Q = frameLayout2;
                    frameLayout2.addView(stVar.P, w7.x5.d(-2, 116.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                    stVar.z.addView(stVar.Q, w7.x5.d(-2, -2.0f, 1, 0.0f, 100.0f, 0.0f, 0.0f));
                }
                stVar.P.setSelectedEmojis(stVar.o);
                stVar.P.setDelegate(new ft(stVar));
                stVar.P.p(null, null, false);
                stVar.Q.setScaleY(0.6f);
                stVar.Q.setScaleX(0.6f);
                stVar.Q.setAlpha(0.0f);
                AndroidUtilities.runOnUIThread(new et(stVar, 2), 10L);
                stVar.K = true;
                wVar28 = stVar.z;
                wVar28.invalidate();
            } else {
                final int i32 = 1;
                int i33 = 0;
                i11 = stVar.V;
                if (i11 != 0) {
                    i12 = stVar.V;
                    if (i12 == 2) {
                        qtVar8 = stVar.l;
                        if (qtVar8 != null) {
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = new ArrayList();
                            qtVar9 = stVar.l;
                            i16 = stVar.V;
                            if (qtVar9.k(i16)) {
                                arrayList5.add(LocaleController.getString(R.string.SendEmojiPreview));
                                org.telegram.ui.Cells.p6.o(R.drawable.msg_send, arrayList7, arrayList6, 0);
                            }
                            qtVar10 = stVar.l;
                            document5 = stVar.W;
                            Boolean P = qtVar10.P(document5);
                            if (P != null) {
                                if (P.booleanValue()) {
                                    arrayList5.add(LocaleController.getString(R.string.SetAsEmojiStatus));
                                    org.telegram.ui.Cells.p6.o(R.drawable.msg_smile_status, arrayList7, arrayList6, 1);
                                } else {
                                    arrayList5.add(LocaleController.getString(R.string.RemoveStatus));
                                    org.telegram.ui.Cells.p6.o(R.drawable.msg_smile_status, arrayList7, arrayList6, 2);
                                }
                            }
                            qtVar11 = stVar.l;
                            document6 = stVar.W;
                            if (qtVar11.D(document6)) {
                                arrayList5.add(LocaleController.getString(R.string.CopyEmojiPreview));
                                org.telegram.ui.Cells.p6.o(R.drawable.msg_copy, arrayList7, arrayList6, 3);
                            }
                            qtVar12 = stVar.l;
                            document7 = stVar.W;
                            if (qtVar12.N(document7)) {
                                arrayList5.add(LocaleController.getString(R.string.RemoveFromRecent));
                                org.telegram.ui.Cells.p6.o(R.drawable.msg_delete, arrayList7, arrayList6, 4);
                            }
                            i17 = stVar.r;
                            MediaDataController mediaDataController = MediaDataController.getInstance(i17);
                            document8 = stVar.W;
                            boolean isStickerInFavorites = mediaDataController.isStickerInFavorites(document8);
                            document9 = stVar.W;
                            if (!MessageObject.isAnimatedEmoji(document9)) {
                                document10 = stVar.W;
                                if (!MessageObject.isMaskDocument(document10)) {
                                    if (!isStickerInFavorites) {
                                        i18 = stVar.r;
                                        if (MediaDataController.getInstance(i18).canAddStickerToFavorites()) {
                                            document11 = stVar.W;
                                        }
                                    }
                                    arrayList5.add(LocaleController.getString(isStickerInFavorites ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                                    org.telegram.ui.Cells.p6.o(isStickerInFavorites ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList7, arrayList6, 5);
                                }
                            }
                            if (arrayList5.isEmpty()) {
                                return;
                            }
                            stVar.K = true;
                            wVar8 = stVar.z;
                            wVar8.invalidate();
                            int[] iArr = new int[arrayList7.size()];
                            for (int i34 = 0; i34 < arrayList7.size(); i34++) {
                                iArr[i34] = ((Integer) arrayList7.get(i34)).intValue();
                            }
                            org.telegram.ui.Components.yb0 yb0Var = new org.telegram.ui.Components.yb0(this, arrayList6, isStickerInFavorites);
                            boolean h = st.h(stVar, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                            int i35 = 0;
                            while (i35 < arrayList5.size()) {
                                boolean z11 = !h && i35 == 0;
                                boolean z12 = i35 == arrayList5.size() + (-1);
                                int intValue = ((Integer) arrayList7.get(i35)).intValue();
                                CharSequence charSequence = (CharSequence) arrayList5.get(i35);
                                f6Var2 = stVar.c0;
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                                org.telegram.ui.ActionBar.f1 c12 = org.telegram.ui.ActionBar.v0.c(z11, z12, actionBarPopupWindow$ActionBarPopupWindowLayout3, intValue, charSequence, false, f6Var2);
                                if (((Integer) arrayList6.get(i35)).intValue() == 4) {
                                    c12.setIconColor(st.d(stVar, org.telegram.ui.ActionBar.j6.p7));
                                    c12.setTextColor(st.d(stVar, org.telegram.ui.ActionBar.j6.q7));
                                }
                                c12.setTag(Integer.valueOf(i35));
                                c12.setOnClickListener(yb0Var);
                                i35++;
                                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                            mt mtVar = new mt(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            stVar.k = mtVar;
                            mtVar.e = true;
                            mtVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
                            mtVar.g = true;
                            mtVar.setOutsideTouchable(true);
                            stVar.k.setClippingEnabled(true);
                            stVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                            stVar.k.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            stVar.k.setInputMethodMode(2);
                            stVar.k.getContentView().setFocusableInTouchMode(true);
                            cVar4 = stVar.q;
                            int i36 = cVar4.d;
                            cVar5 = stVar.q;
                            int i37 = i36 + cVar5.b;
                            cVar6 = stVar.q;
                            int i38 = cVar6.b;
                            wVar9 = stVar.z;
                            int width = wVar9.getWidth();
                            wVar10 = stVar.z;
                            int min4 = Math.min(width, wVar10.getHeight() - i37) - AndroidUtilities.dp(40.0f);
                            f13 = stVar.e;
                            int i39 = min4 / 2;
                            int i40 = i38 + i39;
                            int dp2 = stVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                            wVar11 = stVar.z;
                            float max = (int) (f13 + Math.max(i40 + dp2, ((wVar11.getHeight() - i37) - stVar.I) / 2) + i39);
                            float dp3 = AndroidUtilities.dp(24.0f);
                            f14 = stVar.e;
                            int i41 = (int) ((dp3 - f14) + max);
                            org.telegram.ui.ActionBar.n1 n1Var = stVar.k;
                            wVar12 = stVar.z;
                            wVar13 = stVar.z;
                            n1Var.showAtLocation(wVar12, 0, (int) ((wVar13.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i41);
                            org.telegram.ui.ActionBar.n1.i(actionBarPopupWindow$ActionBarPopupWindowLayout);
                            try {
                                wVar14 = stVar.z;
                                wVar14.performHapticFeedback(0);
                            } catch (Exception unused3) {
                            }
                            f15 = stVar.e;
                            if (f15 != 0.0f) {
                                f16 = stVar.e;
                                stVar.f = f16;
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ht
                                    public final /* synthetic */ ot b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        switch (i32) {
                                            case 0:
                                                st stVar2 = this.b.a;
                                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                stVar2.g = floatValue;
                                                float f19 = stVar2.f;
                                                stVar2.e = com.google.android.gms.internal.vision.e2.z(0.0f, f19, floatValue, f19);
                                                stVar2.z.invalidate();
                                                break;
                                            case 1:
                                                st stVar3 = this.b.a;
                                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                stVar3.g = floatValue2;
                                                float f20 = stVar3.f;
                                                stVar3.e = com.google.android.gms.internal.vision.e2.z(0.0f, f20, floatValue2, f20);
                                                stVar3.z.invalidate();
                                                break;
                                            default:
                                                st stVar4 = this.b.a;
                                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                stVar4.g = floatValue3;
                                                float f21 = stVar4.f;
                                                stVar4.e = com.google.android.gms.internal.vision.e2.z(0.0f, f21, floatValue3, f21);
                                                stVar4.z.invalidate();
                                                break;
                                        }
                                    }
                                });
                                ofFloat2.setDuration(350L);
                                ofFloat2.setInterpolator(org.telegram.ui.Components.pr.f);
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
                    qtVar = stVar.l;
                    if (qtVar != null) {
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        qtVar2 = stVar.l;
                        i13 = stVar.V;
                        if (qtVar2.k(i13)) {
                            qtVar7 = stVar.l;
                            if (!qtVar7.c()) {
                                arrayList8.add(LocaleController.getString(R.string.SendGifPreview));
                                org.telegram.ui.Cells.p6.o(R.drawable.msg_send, arrayList10, arrayList9, 0);
                            }
                        }
                        qtVar3 = stVar.l;
                        i14 = stVar.V;
                        if (qtVar3.k(i14)) {
                            qtVar6 = stVar.l;
                            if (!qtVar6.c()) {
                                arrayList8.add(LocaleController.getString(R.string.SendWithoutSound));
                                org.telegram.ui.Cells.p6.o(R.drawable.input_notify_off, arrayList10, arrayList9, 4);
                            }
                        }
                        qtVar4 = stVar.l;
                        if (qtVar4.b()) {
                            arrayList8.add(LocaleController.getString(R.string.Schedule));
                            org.telegram.ui.Cells.p6.o(R.drawable.msg_autodelete, arrayList10, arrayList9, 3);
                        }
                        document = stVar.W;
                        if (document != null) {
                            qtVar5 = stVar.l;
                            document4 = stVar.W;
                            if (qtVar5.e(document4)) {
                                arrayList8.add(LocaleController.getString(R.string.AddACaption));
                                org.telegram.ui.Cells.p6.n(R.drawable.outline_caption_24, 11, arrayList10, arrayList9);
                            }
                        }
                        document2 = stVar.W;
                        if (document2 != null) {
                            i15 = stVar.r;
                            MediaDataController mediaDataController2 = MediaDataController.getInstance(i15);
                            document3 = stVar.W;
                            z10 = mediaDataController2.hasRecentGif(document3);
                            if (z10) {
                                arrayList8.add(LocaleController.formatString("Delete", R.string.Delete, new Object[0]));
                                org.telegram.ui.Cells.p6.o(R.drawable.msg_delete, arrayList10, arrayList9, 1);
                            } else {
                                arrayList8.add(LocaleController.formatString("SaveToGIFs", R.string.SaveToGIFs, new Object[0]));
                                org.telegram.ui.Cells.p6.o(R.drawable.msg_gif_add, arrayList10, arrayList9, 2);
                            }
                        } else {
                            z10 = false;
                        }
                        if (arrayList8.isEmpty()) {
                            return;
                        }
                        stVar.K = true;
                        wVar = stVar.z;
                        wVar.invalidate();
                        int[] iArr2 = new int[arrayList10.size()];
                        for (int i42 = 0; i42 < arrayList10.size(); i42++) {
                            iArr2[i42] = ((Integer) arrayList10.get(i42)).intValue();
                        }
                        org.telegram.ui.Components.ct ctVar = new org.telegram.ui.Components.ct(28, this, arrayList9);
                        for (int i43 = 0; i43 < arrayList8.size(); i43++) {
                            int intValue2 = ((Integer) arrayList10.get(i43)).intValue();
                            CharSequence charSequence2 = (CharSequence) arrayList8.get(i43);
                            f6Var = stVar.c0;
                            org.telegram.ui.ActionBar.f1 c13 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, intValue2, charSequence2, false, f6Var);
                            c13.setTag(Integer.valueOf(i43));
                            c13.setOnClickListener(ctVar);
                            if (z10 && i43 == arrayList8.size() - 1) {
                                c13.c(st.d(stVar, org.telegram.ui.ActionBar.j6.q7), st.d(stVar, org.telegram.ui.ActionBar.j6.p7));
                            }
                        }
                        nt ntVar = new nt(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                        stVar.k = ntVar;
                        ntVar.e = true;
                        ntVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
                        ntVar.g = true;
                        ntVar.setOutsideTouchable(true);
                        stVar.k.setClippingEnabled(true);
                        stVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                        stVar.k.setFocusable(true);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                        stVar.k.setInputMethodMode(2);
                        stVar.k.getContentView().setFocusableInTouchMode(true);
                        cVar = stVar.q;
                        int i44 = cVar.d;
                        cVar2 = stVar.q;
                        int i45 = i44 + cVar2.b;
                        cVar3 = stVar.q;
                        int i46 = cVar3.b;
                        wVar2 = stVar.z;
                        int width2 = wVar2.getWidth();
                        wVar3 = stVar.z;
                        int min5 = Math.min(width2, wVar3.getHeight() - i45) - AndroidUtilities.dp(40.0f);
                        f7 = stVar.e;
                        int i47 = min5 / 2;
                        int i48 = i46 + i47;
                        int dp4 = stVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                        wVar4 = stVar.z;
                        float max2 = (int) (f7 + Math.max(i48 + dp4, ((wVar4.getHeight() - i45) - stVar.I) / 2) + i47);
                        float dp5 = AndroidUtilities.dp(24.0f);
                        f10 = stVar.e;
                        int i49 = (int) ((dp5 - f10) + max2);
                        org.telegram.ui.ActionBar.n1 n1Var2 = stVar.k;
                        wVar5 = stVar.z;
                        wVar6 = stVar.z;
                        n1Var2.showAtLocation(wVar5, 0, (int) ((wVar6.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i49);
                        try {
                            wVar7 = stVar.z;
                            wVar7.performHapticFeedback(0);
                        } catch (Exception unused4) {
                        }
                        f11 = stVar.e;
                        if (f11 != 0.0f) {
                            f12 = stVar.e;
                            stVar.f = f12;
                            final int i50 = 2;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ht
                                public final /* synthetic */ ot b;

                                {
                                    this.b = this;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (i50) {
                                        case 0:
                                            st stVar2 = this.b.a;
                                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            stVar2.g = floatValue;
                                            float f19 = stVar2.f;
                                            stVar2.e = com.google.android.gms.internal.vision.e2.z(0.0f, f19, floatValue, f19);
                                            stVar2.z.invalidate();
                                            break;
                                        case 1:
                                            st stVar3 = this.b.a;
                                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            stVar3.g = floatValue2;
                                            float f20 = stVar3.f;
                                            stVar3.e = com.google.android.gms.internal.vision.e2.z(0.0f, f20, floatValue2, f20);
                                            stVar3.z.invalidate();
                                            break;
                                        default:
                                            st stVar4 = this.b.a;
                                            float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            stVar4.g = floatValue3;
                                            float f21 = stVar4.f;
                                            stVar4.e = com.google.android.gms.internal.vision.e2.z(0.0f, f21, floatValue3, f21);
                                            stVar4.z.invalidate();
                                            break;
                                    }
                                }
                            });
                            ofFloat3.setDuration(350L);
                            ofFloat3.setInterpolator(org.telegram.ui.Components.pr.f);
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
                document12 = stVar.W;
                if (MessageObject.isPremiumSticker(document12)) {
                    i26 = stVar.r;
                    if (!AccountInstance.getInstance(i26).getUserConfig().isPremium()) {
                        if (stVar.O == null) {
                            ih1 ih1Var = new ih1(stVar.z.getContext(), stVar.c0);
                            stVar.O = ih1Var;
                            stVar.z.addView(ih1Var, w7.x5.c(-1.0f, -1));
                            stVar.O.setOnClickListener(new gt(stVar, i33));
                            stVar.O.a.r.setOnClickListener(new gt(stVar, i32));
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(stVar.O, false, 1.0f, false);
                        AndroidUtilities.updateViewVisibilityAnimated(stVar.O, true);
                        stVar.O.setTranslationY(0.0f);
                        stVar.K = true;
                        wVar26 = stVar.z;
                        wVar26.invalidate();
                        try {
                            wVar27 = stVar.z;
                            wVar27.performHapticFeedback(0);
                            return;
                        } catch (Exception unused5) {
                            return;
                        }
                    }
                }
                i19 = stVar.r;
                MediaDataController mediaDataController3 = MediaDataController.getInstance(i19);
                document13 = stVar.W;
                boolean isStickerInFavorites2 = mediaDataController3.isStickerInFavorites(document13);
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                qtVar13 = stVar.l;
                if (qtVar13 != null) {
                    qtVar20 = stVar.l;
                    i24 = stVar.V;
                    if (qtVar20.k(i24)) {
                        qtVar25 = stVar.l;
                        if (!qtVar25.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendStickerPreview));
                            org.telegram.ui.Cells.p6.o(R.drawable.msg_send, arrayList13, arrayList12, 0);
                        }
                    }
                    qtVar21 = stVar.l;
                    i25 = stVar.V;
                    if (qtVar21.k(i25)) {
                        qtVar24 = stVar.l;
                        if (!qtVar24.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendWithoutSound));
                            org.telegram.ui.Cells.p6.n(R.drawable.input_notify_off, 6, arrayList13, arrayList12);
                        }
                    }
                    qtVar22 = stVar.l;
                    if (qtVar22.b()) {
                        arrayList11.add(LocaleController.getString(R.string.Schedule));
                        org.telegram.ui.Cells.p6.o(R.drawable.msg_autodelete, arrayList13, arrayList12, 3);
                    }
                    qtVar23 = stVar.l;
                    if (qtVar23.f()) {
                        arrayList11.add(LocaleController.getString(R.string.ImportStickersRemoveMenu));
                        org.telegram.ui.Cells.p6.o(R.drawable.msg_delete, arrayList13, arrayList12, 5);
                    }
                }
                document14 = stVar.W;
                if (!MessageObject.isMaskDocument(document14)) {
                    if (!isStickerInFavorites2) {
                        i23 = stVar.r;
                        if (MediaDataController.getInstance(i23).canAddStickerToFavorites()) {
                            document16 = stVar.W;
                        }
                    }
                    arrayList11.add(LocaleController.getString(isStickerInFavorites2 ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                    org.telegram.ui.Cells.p6.o(isStickerInFavorites2 ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList13, arrayList12, 2);
                }
                qtVar14 = stVar.l;
                if (qtVar14 != null && (inputStickerSet = stVar.a0) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                    qtVar19 = stVar.l;
                    if (qtVar19.Q()) {
                        arrayList11.add(LocaleController.formatString(R.string.ViewPackPreview, new Object[0]));
                        org.telegram.ui.Cells.p6.o(R.drawable.msg_media, arrayList13, arrayList12, 1);
                    }
                }
                if (stVar.p) {
                    arrayList11.add(LocaleController.getString(R.string.DeleteFromRecent));
                    org.telegram.ui.Cells.p6.o(R.drawable.msg_delete, arrayList13, arrayList12, 4);
                }
                if (stVar.a0 != null) {
                    document15 = stVar.W;
                    if (document15 != null) {
                        i22 = stVar.r;
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i22).getStickerSet(stVar.a0, true);
                        if (stickerSet != null) {
                            qtVar17 = stVar.l;
                            if (qtVar17 != null) {
                                qtVar18 = stVar.l;
                                if (qtVar18.C()) {
                                    TLRPC.StickerSet stickerSet2 = stickerSet.set;
                                    if (!stickerSet2.emojis && !stickerSet2.masks) {
                                        arrayList11.add(LocaleController.getString(R.string.EditSticker));
                                        org.telegram.ui.Cells.p6.n(R.drawable.msg_edit, 7, arrayList13, arrayList12);
                                    }
                                }
                            }
                        }
                        if (stickerSet != null && stickerSet.set.creator) {
                            qtVar15 = stVar.l;
                            if (qtVar15 != null) {
                                qtVar16 = stVar.l;
                                unused = stVar.W;
                                if (qtVar16.I()) {
                                    arrayList11.add(LocaleController.getString(R.string.DeleteSticker));
                                    org.telegram.ui.Cells.p6.n(R.drawable.msg_delete, 8, arrayList13, arrayList12);
                                }
                            }
                        }
                    }
                }
                if (arrayList11.isEmpty()) {
                    return;
                }
                stVar.K = true;
                wVar15 = stVar.z;
                wVar15.invalidate();
                kt ktVar = new kt(this, arrayList12, isStickerInFavorites2);
                st.h(stVar, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                for (int i51 = 0; i51 < arrayList11.size(); i51++) {
                    int intValue3 = ((Integer) arrayList13.get(i51)).intValue();
                    CharSequence charSequence3 = (CharSequence) arrayList11.get(i51);
                    f6Var3 = stVar.c0;
                    org.telegram.ui.ActionBar.f1 c14 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, intValue3, charSequence3, false, f6Var3);
                    c14.setTag(Integer.valueOf(i51));
                    c14.setOnClickListener(ktVar);
                    if (((Integer) arrayList12.get(i51)).intValue() == 8) {
                        int d10 = st.d(stVar, org.telegram.ui.ActionBar.j6.q7);
                        c14.c(d10, d10);
                        c14.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.1f, d10));
                    }
                }
                lt ltVar = new lt(this, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                stVar.k = ltVar;
                ltVar.e = true;
                ltVar.c = 100;
                ltVar.g = true;
                ltVar.setOutsideTouchable(true);
                stVar.k.setClippingEnabled(true);
                stVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                stVar.k.setFocusable(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                stVar.k.setInputMethodMode(2);
                stVar.k.getContentView().setFocusableInTouchMode(true);
                cVar7 = stVar.q;
                int i52 = cVar7.d;
                cVar8 = stVar.q;
                int i53 = i52 + cVar8.b;
                cVar9 = stVar.q;
                int i54 = cVar9.b;
                i20 = stVar.V;
                if (i20 == 1) {
                    wVar24 = stVar.z;
                    int width3 = wVar24.getWidth();
                    wVar25 = stVar.z;
                    i21 = Math.min(width3, wVar25.getHeight() - i53) - AndroidUtilities.dp(40.0f);
                } else {
                    if (stVar.S) {
                        wVar18 = stVar.z;
                        int width4 = wVar18.getWidth();
                        wVar19 = stVar.z;
                        min = Math.min(width4, wVar19.getHeight() - i53) - AndroidUtilities.dpf2(40.0f);
                    } else {
                        wVar16 = stVar.z;
                        int width5 = wVar16.getWidth();
                        wVar17 = stVar.z;
                        min = Math.min(width5, wVar17.getHeight() - i53) / 1.8f;
                    }
                    i21 = (int) min;
                }
                f17 = stVar.e;
                int i55 = i21 / 2;
                int i56 = i54 + i55;
                int dp6 = stVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                wVar20 = stVar.z;
                int dp7 = AndroidUtilities.dp(24.0f) + ((int) (f17 + Math.max(i56 + dp6, ((wVar20.getHeight() - i53) - stVar.I) / 2) + i55));
                if (stVar.S) {
                    dp7 += AndroidUtilities.dp(24.0f);
                }
                org.telegram.ui.ActionBar.n1 n1Var3 = stVar.k;
                wVar21 = stVar.z;
                wVar22 = stVar.z;
                n1Var3.showAtLocation(wVar21, 0, (int) ((wVar22.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth()) / 2.0f), dp7);
                try {
                    wVar23 = stVar.z;
                    wVar23.performHapticFeedback(0);
                } catch (Exception unused6) {
                }
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            i27 = 0;
            while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
            }
        }
        i10 = 1;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout22 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, stVar.z.getContext(), stVar.c0);
        org.telegram.ui.ActionBar.f6 f6Var42 = null;
        dh.d c102 = bVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout22, null, true);
        c102.n(fh.b.k(stVar.c0));
        c102.p(AndroidUtilities.dp(12.0f));
        c102.o(AndroidUtilities.dp(8.0f));
        c102.h.e = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout22.setBackground(c102);
        if (stVar.V != 3) {
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout22;
        i27 = 0;
        while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
        }
    }
}
