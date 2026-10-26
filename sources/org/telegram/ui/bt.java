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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class bt implements Runnable {
    public final /* synthetic */ ft a;

    public bt(ft ftVar) {
        this.a = ftVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x0643, code lost:
    
        if (org.telegram.messenger.MessageObject.isStickerHasSet(r0) != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0965, code lost:
    
        if (org.telegram.messenger.MessageObject.isStickerHasSet(r6) != false) goto L230;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0d85  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        int i12;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        dt dtVar;
        dt dtVar2;
        int i13;
        dt dtVar3;
        int i14;
        dt dtVar4;
        TLRPC.Document document;
        TLRPC.Document document2;
        boolean z10;
        bh.p pVar;
        i0.b bVar;
        i0.b bVar2;
        i0.b bVar3;
        bh.p pVar2;
        bh.p pVar3;
        float f7;
        bh.p pVar4;
        float f10;
        bh.p pVar5;
        bh.p pVar6;
        int i15;
        float f11;
        float f12;
        bh.p pVar7;
        org.telegram.ui.ActionBar.u6 u6Var;
        int i16;
        TLRPC.Document document3;
        dt dtVar5;
        TLRPC.Document document4;
        dt dtVar6;
        dt dtVar7;
        dt dtVar8;
        dt dtVar9;
        int i17;
        dt dtVar10;
        TLRPC.Document document5;
        dt dtVar11;
        TLRPC.Document document6;
        dt dtVar12;
        TLRPC.Document document7;
        int i18;
        TLRPC.Document document8;
        TLRPC.Document document9;
        bh.p pVar8;
        i0.b bVar4;
        i0.b bVar5;
        i0.b bVar6;
        bh.p pVar9;
        bh.p pVar10;
        float f13;
        bh.p pVar11;
        float f14;
        bh.p pVar12;
        bh.p pVar13;
        float f15;
        float f16;
        bh.p pVar14;
        org.telegram.ui.ActionBar.u6 u6Var2;
        TLRPC.Document document10;
        int i19;
        TLRPC.Document document11;
        TLRPC.Document document12;
        int i20;
        TLRPC.Document document13;
        dt dtVar13;
        TLRPC.Document document14;
        dt dtVar14;
        bh.p pVar15;
        i0.b bVar7;
        i0.b bVar8;
        i0.b bVar9;
        int i21;
        bh.p pVar16;
        bh.p pVar17;
        float min;
        int i22;
        bh.p pVar18;
        bh.p pVar19;
        float f17;
        bh.p pVar20;
        bh.p pVar21;
        bh.p pVar22;
        bh.p pVar23;
        bh.p pVar24;
        bh.p pVar25;
        org.telegram.ui.ActionBar.u6 u6Var3;
        TLRPC.Document document15;
        int i23;
        dt dtVar15;
        dt dtVar16;
        dt dtVar17;
        dt dtVar18;
        TLRPC.InputStickerSet inputStickerSet;
        dt dtVar19;
        int i24;
        TLRPC.Document document16;
        dt dtVar20;
        int i25;
        dt dtVar21;
        int i26;
        dt dtVar22;
        dt dtVar23;
        dt dtVar24;
        dt dtVar25;
        int i27;
        boolean z11;
        bh.p pVar26;
        bh.p pVar27;
        int i28;
        za1 za1Var;
        bh.p pVar28;
        org.telegram.ui.Components.k80 i29;
        TLRPC.Document unused;
        ft ftVar = this.a;
        ch.b bVar10 = ftVar.t;
        if (ftVar.w == null || ftVar.m) {
            return;
        }
        ftVar.R = true;
        dt dtVar26 = ftVar.l;
        final int i30 = 0;
        if (dtVar26 != null && (i29 = dtVar26.i(ftVar.z)) != null) {
            i29.Q(bVar10, gh.c.k(ftVar.c0), true);
            i29.t = false;
            i29.Y();
            i29.p = new ui(this, 16);
            ViewGroup viewGroup = i29.A;
            ws wsVar = new ws(this, viewGroup);
            ftVar.k = wsVar;
            wsVar.e = true;
            wsVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
            wsVar.g = true;
            wsVar.setOutsideTouchable(true);
            ftVar.k.setClippingEnabled(true);
            ftVar.k.setAnimationStyle(R.style.PopupContextAnimation);
            ftVar.k.setFocusable(true);
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            ftVar.k.setInputMethodMode(2);
            ftVar.k.getContentView().setFocusableInTouchMode(true);
            i0.b bVar11 = ftVar.q;
            int min2 = (Math.min(ftVar.z.getWidth(), ftVar.z.getHeight() - (bVar11.d + bVar11.b)) - AndroidUtilities.dp(40.0f)) / 2;
            int dp = (int) ((AndroidUtilities.dp(24.0f) - ftVar.e) + ((int) (ftVar.e + Math.max(r3 + min2 + (ftVar.G != null ? AndroidUtilities.dp(40.0f) : 0), ((ftVar.z.getHeight() - r4) - ftVar.I) / 2) + min2)));
            ftVar.k.showAtLocation(ftVar.z, 0, (int) ((r5.getMeasuredWidth() - viewGroup.getMeasuredWidth()) / 2.0f), dp);
            try {
                ftVar.z.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            float f18 = ftVar.e;
            if (f18 != 0.0f) {
                ftVar.f = f18;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.vs
                    public final /* synthetic */ bt b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i30) {
                            case 0:
                                ft ftVar2 = this.b.a;
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ftVar2.g = floatValue;
                                float f19 = ftVar2.f;
                                ftVar2.e = c3.h0.z(0.0f, f19, floatValue, f19);
                                ftVar2.z.invalidate();
                                break;
                            case 1:
                                ft ftVar3 = this.b.a;
                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ftVar3.g = floatValue2;
                                float f20 = ftVar3.f;
                                ftVar3.e = c3.h0.z(0.0f, f20, floatValue2, f20);
                                ftVar3.z.invalidate();
                                break;
                            default:
                                ft ftVar4 = this.b.a;
                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ftVar4.g = floatValue3;
                                float f21 = ftVar4.f;
                                ftVar4.e = c3.h0.z(0.0f, f21, floatValue3, f21);
                                ftVar4.z.invalidate();
                                break;
                        }
                    }
                });
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(org.telegram.ui.Components.ds.f);
                ofFloat.start();
            }
            ftVar.K = true;
            return;
        }
        if (ftVar.V != 3) {
            dt dtVar27 = ftVar.l;
            if (dtVar27 != null) {
                TLRPC.TL_messageMediaPoll d = dtVar27.d();
                TLRPC.PollAnswer g7 = ftVar.l.g();
                if (d != null && d.poll != null && g7 != null) {
                    TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(d, g7.option);
                    if (pollResult != null && pollResult.voters > 0) {
                        MessageObject.canShowVotersList(d);
                    }
                }
            }
            i10 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, ftVar.z.getContext(), ftVar.c0);
            org.telegram.ui.ActionBar.u6 u6Var4 = null;
            eh.d c10 = bVar10.c(actionBarPopupWindow$ActionBarPopupWindowLayout2, null, true);
            c10.v(gh.c.k(ftVar.c0));
            org.telegram.messenger.vh.s(c10, AndroidUtilities.dp(12.0f), 8.0f);
            c10.x.e = true;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackground(c10);
            int i31 = 6;
            int i32 = 7;
            if (ftVar.V != 3) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (ftVar.T == null) {
                    dt dtVar28 = ftVar.l;
                    if (dtVar28 == null || !dtVar28.A()) {
                        if (ftVar.l.x()) {
                            arrayList.add(LocaleController.getString(R.string.SendStickerPreview));
                            d3.r(R.drawable.msg_send, arrayList3, arrayList2, 0);
                        }
                        arrayList.add(LocaleController.getString(R.string.AddToFavorites));
                        d3.r(R.drawable.msg_fave, arrayList3, arrayList2, 1);
                    } else {
                        arrayList.add(LocaleController.getString(R.string.SetIntroSticker));
                        d3.r(R.drawable.menu_sticker_add, arrayList3, arrayList2, 0);
                    }
                }
                dt dtVar29 = ftVar.l;
                if (dtVar29 == null || !dtVar29.A()) {
                    dt dtVar30 = ftVar.l;
                    arrayList.add(LocaleController.getString((dtVar30 == null || !dtVar30.I()) ? R.string.AddToStickerPack : R.string.StickersReplaceSticker));
                    dt dtVar31 = ftVar.l;
                    d3.r((dtVar31 == null || !dtVar31.I()) ? R.drawable.menu_sticker_add : R.drawable.msg_replace, arrayList3, arrayList2, 2);
                }
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, ftVar.w, ftVar.c0, true, false);
                g1Var.setItemHeight(44);
                g1Var.j(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                g1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                FrameLayout frameLayout = new FrameLayout(ftVar.z.getContext());
                LinearLayout linearLayout = new LinearLayout(ftVar.z.getContext());
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.G8, linearLayout, ftVar.c0);
                linearLayout.setOrientation(1);
                if (ftVar.w == null) {
                    za1Var = null;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new TLRPC.TL_stickerSetNoCovered());
                    TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = new TLRPC.TL_messages_getMyStickers();
                    tL_messages_getMyStickers.limit = 100;
                    ConnectionsManager.getInstance(ftVar.r).sendRequest(tL_messages_getMyStickers, new ea(ftVar, arrayList4, tL_messages_getMyStickers, i32));
                    za1Var = new za1(ftVar.w, i32, u6Var4);
                    za1Var.setLayoutManager(new s4.c0());
                    za1Var.i(new fi.p1(arrayList4, 4));
                    za1Var.setAdapter(new ct(ftVar, arrayList4));
                }
                za1Var.setOnItemClickListener(new h(this, i31));
                frameLayout.addView(g1Var);
                linearLayout.addView(frameLayout);
                linearLayout.addView(new org.telegram.ui.ActionBar.l1(ftVar.z.getContext(), ftVar.c0), org.telegram.ui.Components.gb1.r(-1, 8));
                za1 za1Var2 = za1Var;
                di.e0 e0Var = new di.e0(this, arrayList2, za1Var2, linearLayout, actionBarPopupWindow$ActionBarPopupWindowLayout2, 13);
                for (int i33 = 0; i33 < arrayList.size(); i33++) {
                    org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, ((Integer) arrayList3.get(i33)).intValue(), (CharSequence) arrayList.get(i33), false, ftVar.c0);
                    c11.setTag(Integer.valueOf(i33));
                    c11.setOnClickListener(e0Var);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                linearLayout.addView(za1Var2, new LinearLayout.LayoutParams(actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth() - AndroidUtilities.dp(16.0f), (int) (actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredHeight() * 1.5f)));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.b(linearLayout);
                frameLayout.setOnClickListener(new mf(actionBarPopupWindow$ActionBarPopupWindowLayout2, 2));
                i0.b bVar12 = ftVar.q;
                int i34 = bVar12.d + bVar12.b;
                int min3 = ((int) (Math.min(ftVar.z.getWidth(), ftVar.z.getHeight() - i34) / 1.8f)) / 2;
                ftVar.z.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, org.telegram.ui.Components.gb1.h(-2, -2.0f, 49, 0.0f, (AndroidUtilities.dp(84.0f) + ((int) ((ftVar.e + Math.max(r0 + min3, ((ftVar.z.getHeight() - i34) - ftVar.I) / 2)) + min3))) / AndroidUtilities.density, 0.0f, 0.0f));
                ftVar.L = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setTranslationY(-AndroidUtilities.dp(12.0f));
                ftVar.L.setAlpha(0.0f);
                ftVar.L.setScaleX(0.8f);
                ftVar.L.setScaleY(0.8f);
                ftVar.L.setPivotY(0.0f);
                ftVar.L.setPivotX(r0.getMeasuredWidth() / 2.0f);
                ftVar.L.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.ds.h).start();
                if (ftVar.P == null) {
                    org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(ftVar, ftVar.z.getContext(), UserConfig.selectedAccount, ftVar.c0);
                    ftVar.P = zbVar;
                    zbVar.N0 = true;
                    zbVar.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                    ftVar.P.setClipChildren(false);
                    ftVar.P.setClipToPadding(false);
                    ftVar.P.setVisibility(0);
                    ftVar.P.setHint(LocaleController.getString(R.string.StickersSetEmojiForSticker));
                    ftVar.P.setBubbleOffset(-AndroidUtilities.dp(105.0f));
                    ftVar.P.setMiniBubblesOffset(-AndroidUtilities.dp(14.0f));
                    FrameLayout frameLayout2 = new FrameLayout(ftVar.z.getContext());
                    ftVar.Q = frameLayout2;
                    frameLayout2.addView(ftVar.P, org.telegram.ui.Components.gb1.h(-2, 116.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                    ftVar.z.addView(ftVar.Q, org.telegram.ui.Components.gb1.h(-2, -2.0f, 1, 0.0f, 100.0f, 0.0f, 0.0f));
                }
                ftVar.P.setSelectedEmojis(ftVar.o);
                ftVar.P.setDelegate(new ts(ftVar));
                ftVar.P.p(null, null, false);
                ftVar.Q.setScaleY(0.6f);
                ftVar.Q.setScaleX(0.6f);
                ftVar.Q.setAlpha(0.0f);
                AndroidUtilities.runOnUIThread(new ss(ftVar, 2), 10L);
                ftVar.K = true;
                pVar28 = ftVar.z;
                pVar28.invalidate();
            } else {
                int i35 = 0;
                i11 = ftVar.V;
                if (i11 != 0) {
                    i12 = ftVar.V;
                    if (i12 == 2) {
                        dtVar8 = ftVar.l;
                        if (dtVar8 != null) {
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = new ArrayList();
                            dtVar9 = ftVar.l;
                            i17 = ftVar.V;
                            if (dtVar9.l(i17)) {
                                arrayList5.add(LocaleController.getString(R.string.SendEmojiPreview));
                                d3.r(R.drawable.msg_send, arrayList7, arrayList6, 0);
                            }
                            dtVar10 = ftVar.l;
                            document5 = ftVar.W;
                            Boolean P = dtVar10.P(document5);
                            if (P != null) {
                                if (P.booleanValue()) {
                                    arrayList5.add(LocaleController.getString(R.string.SetAsEmojiStatus));
                                    d3.r(R.drawable.msg_smile_status, arrayList7, arrayList6, 1);
                                } else {
                                    arrayList5.add(LocaleController.getString(R.string.RemoveStatus));
                                    d3.r(R.drawable.msg_smile_status, arrayList7, arrayList6, 2);
                                }
                            }
                            dtVar11 = ftVar.l;
                            document6 = ftVar.W;
                            if (dtVar11.D(document6)) {
                                arrayList5.add(LocaleController.getString(R.string.CopyEmojiPreview));
                                d3.r(R.drawable.msg_copy, arrayList7, arrayList6, 3);
                            }
                            dtVar12 = ftVar.l;
                            document7 = ftVar.W;
                            if (dtVar12.M(document7)) {
                                arrayList5.add(LocaleController.getString(R.string.RemoveFromRecent));
                                d3.r(R.drawable.msg_delete, arrayList7, arrayList6, 4);
                            }
                            i18 = ftVar.r;
                            MediaDataController mediaDataController = MediaDataController.getInstance(i18);
                            document8 = ftVar.W;
                            boolean isStickerInFavorites = mediaDataController.isStickerInFavorites(document8);
                            document9 = ftVar.W;
                            if (!MessageObject.isAnimatedEmoji(document9)) {
                                document10 = ftVar.W;
                                if (!MessageObject.isMaskDocument(document10)) {
                                    if (!isStickerInFavorites) {
                                        i19 = ftVar.r;
                                        if (MediaDataController.getInstance(i19).canAddStickerToFavorites()) {
                                            document11 = ftVar.W;
                                        }
                                    }
                                    arrayList5.add(LocaleController.getString(isStickerInFavorites ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                                    d3.r(isStickerInFavorites ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList7, arrayList6, 5);
                                }
                            }
                            if (arrayList5.isEmpty()) {
                                return;
                            }
                            ftVar.K = true;
                            pVar8 = ftVar.z;
                            pVar8.invalidate();
                            int[] iArr = new int[arrayList7.size()];
                            for (int i36 = 0; i36 < arrayList7.size(); i36++) {
                                iArr[i36] = ((Integer) arrayList7.get(i36)).intValue();
                            }
                            org.telegram.ui.Components.pc0 pc0Var = new org.telegram.ui.Components.pc0(this, arrayList6, isStickerInFavorites);
                            boolean f19 = ft.f(ftVar, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                            int i37 = 0;
                            while (i37 < arrayList5.size()) {
                                boolean z12 = !f19 && i37 == 0;
                                boolean z13 = i37 == arrayList5.size() + (-1);
                                int intValue = ((Integer) arrayList7.get(i37)).intValue();
                                CharSequence charSequence = (CharSequence) arrayList5.get(i37);
                                u6Var2 = ftVar.c0;
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                                org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(z12, z13, actionBarPopupWindow$ActionBarPopupWindowLayout3, intValue, charSequence, false, u6Var2);
                                if (((Integer) arrayList6.get(i37)).intValue() == 4) {
                                    c12.c(org.telegram.ui.ActionBar.y6.q7, org.telegram.ui.ActionBar.y6.p7);
                                }
                                c12.setTag(Integer.valueOf(i37));
                                c12.setOnClickListener(pc0Var);
                                i37++;
                                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                            zs zsVar = new zs(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            ftVar.k = zsVar;
                            zsVar.e = true;
                            zsVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
                            zsVar.g = true;
                            zsVar.setOutsideTouchable(true);
                            ftVar.k.setClippingEnabled(true);
                            ftVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                            ftVar.k.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            ftVar.k.setInputMethodMode(2);
                            ftVar.k.getContentView().setFocusableInTouchMode(true);
                            bVar4 = ftVar.q;
                            int i38 = bVar4.d;
                            bVar5 = ftVar.q;
                            int i39 = i38 + bVar5.b;
                            bVar6 = ftVar.q;
                            int i40 = bVar6.b;
                            pVar9 = ftVar.z;
                            int width = pVar9.getWidth();
                            pVar10 = ftVar.z;
                            int min4 = Math.min(width, pVar10.getHeight() - i39) - AndroidUtilities.dp(40.0f);
                            f13 = ftVar.e;
                            int i41 = min4 / 2;
                            int i42 = i40 + i41;
                            int dp2 = ftVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                            pVar11 = ftVar.z;
                            float max = (int) (f13 + Math.max(i42 + dp2, ((pVar11.getHeight() - i39) - ftVar.I) / 2) + i41);
                            float dp3 = AndroidUtilities.dp(24.0f);
                            f14 = ftVar.e;
                            int i43 = (int) ((dp3 - f14) + max);
                            org.telegram.ui.ActionBar.o1 o1Var = ftVar.k;
                            pVar12 = ftVar.z;
                            pVar13 = ftVar.z;
                            o1Var.showAtLocation(pVar12, 0, (int) ((pVar13.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i43);
                            org.telegram.ui.ActionBar.o1.i(actionBarPopupWindow$ActionBarPopupWindowLayout);
                            try {
                                pVar14 = ftVar.z;
                                pVar14.performHapticFeedback(0);
                            } catch (Exception unused3) {
                            }
                            f15 = ftVar.e;
                            if (f15 != 0.0f) {
                                f16 = ftVar.e;
                                ftVar.f = f16;
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                final int i44 = 1;
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.vs
                                    public final /* synthetic */ bt b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        switch (i44) {
                                            case 0:
                                                ft ftVar2 = this.b.a;
                                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                ftVar2.g = floatValue;
                                                float f192 = ftVar2.f;
                                                ftVar2.e = c3.h0.z(0.0f, f192, floatValue, f192);
                                                ftVar2.z.invalidate();
                                                break;
                                            case 1:
                                                ft ftVar3 = this.b.a;
                                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                ftVar3.g = floatValue2;
                                                float f20 = ftVar3.f;
                                                ftVar3.e = c3.h0.z(0.0f, f20, floatValue2, f20);
                                                ftVar3.z.invalidate();
                                                break;
                                            default:
                                                ft ftVar4 = this.b.a;
                                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                ftVar4.g = floatValue3;
                                                float f21 = ftVar4.f;
                                                ftVar4.e = c3.h0.z(0.0f, f21, floatValue3, f21);
                                                ftVar4.z.invalidate();
                                                break;
                                        }
                                    }
                                });
                                ofFloat2.setDuration(350L);
                                ofFloat2.setInterpolator(org.telegram.ui.Components.ds.f);
                                ofFloat2.start();
                            }
                            i15 = 0;
                            i28 = i15;
                            while (i28 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i28);
                                if (childAt instanceof org.telegram.ui.ActionBar.g1) {
                                    ((org.telegram.ui.ActionBar.g1) childAt).n(i28 == 0 ? 1 : i15, i28 == actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() + (-1) ? 1 : i15);
                                }
                                i28++;
                            }
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                    dtVar = ftVar.l;
                    if (dtVar != null) {
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        dtVar2 = ftVar.l;
                        i13 = ftVar.V;
                        if (dtVar2.l(i13)) {
                            dtVar7 = ftVar.l;
                            if (!dtVar7.c()) {
                                arrayList8.add(LocaleController.getString(R.string.SendGifPreview));
                                d3.r(R.drawable.msg_send, arrayList10, arrayList9, 0);
                            }
                        }
                        dtVar3 = ftVar.l;
                        i14 = ftVar.V;
                        if (dtVar3.l(i14)) {
                            dtVar6 = ftVar.l;
                            if (!dtVar6.c()) {
                                arrayList8.add(LocaleController.getString(R.string.SendWithoutSound));
                                d3.r(R.drawable.input_notify_off, arrayList10, arrayList9, 4);
                            }
                        }
                        dtVar4 = ftVar.l;
                        if (dtVar4.b()) {
                            arrayList8.add(LocaleController.getString(R.string.Schedule));
                            d3.r(R.drawable.msg_autodelete, arrayList10, arrayList9, 3);
                        }
                        document = ftVar.W;
                        if (document != null) {
                            dtVar5 = ftVar.l;
                            document4 = ftVar.W;
                            if (dtVar5.e(document4)) {
                                arrayList8.add(LocaleController.getString(R.string.AddACaption));
                                d3.n(R.drawable.outline_caption_24, 11, arrayList10, arrayList9);
                            }
                        }
                        document2 = ftVar.W;
                        if (document2 != null) {
                            i16 = ftVar.r;
                            MediaDataController mediaDataController2 = MediaDataController.getInstance(i16);
                            document3 = ftVar.W;
                            z10 = mediaDataController2.hasRecentGif(document3);
                            if (z10) {
                                arrayList8.add(LocaleController.formatString("Delete", R.string.Delete, new Object[0]));
                                d3.r(R.drawable.msg_delete, arrayList10, arrayList9, 1);
                            } else {
                                arrayList8.add(LocaleController.formatString("SaveToGIFs", R.string.SaveToGIFs, new Object[0]));
                                d3.r(R.drawable.msg_gif_add, arrayList10, arrayList9, 2);
                            }
                        } else {
                            z10 = false;
                        }
                        if (arrayList8.isEmpty()) {
                            return;
                        }
                        ftVar.K = true;
                        pVar = ftVar.z;
                        pVar.invalidate();
                        int[] iArr2 = new int[arrayList10.size()];
                        for (int i45 = 0; i45 < arrayList10.size(); i45++) {
                            iArr2[i45] = ((Integer) arrayList10.get(i45)).intValue();
                        }
                        org.telegram.ui.Components.k51 k51Var = new org.telegram.ui.Components.k51(9, this, arrayList9);
                        for (int i46 = 0; i46 < arrayList8.size(); i46++) {
                            int intValue2 = ((Integer) arrayList10.get(i46)).intValue();
                            CharSequence charSequence2 = (CharSequence) arrayList8.get(i46);
                            u6Var = ftVar.c0;
                            org.telegram.ui.ActionBar.g1 c13 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, intValue2, charSequence2, false, u6Var);
                            c13.setTag(Integer.valueOf(i46));
                            c13.setOnClickListener(k51Var);
                            if (z10 && i46 == arrayList8.size() - 1) {
                                c13.c(org.telegram.ui.ActionBar.y6.q7, org.telegram.ui.ActionBar.y6.p7);
                            }
                        }
                        at atVar = new at(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                        ftVar.k = atVar;
                        atVar.e = true;
                        atVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
                        atVar.g = true;
                        atVar.setOutsideTouchable(true);
                        ftVar.k.setClippingEnabled(true);
                        ftVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                        ftVar.k.setFocusable(true);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                        ftVar.k.setInputMethodMode(2);
                        ftVar.k.getContentView().setFocusableInTouchMode(true);
                        bVar = ftVar.q;
                        int i47 = bVar.d;
                        bVar2 = ftVar.q;
                        int i48 = i47 + bVar2.b;
                        bVar3 = ftVar.q;
                        int i49 = bVar3.b;
                        pVar2 = ftVar.z;
                        int width2 = pVar2.getWidth();
                        pVar3 = ftVar.z;
                        int min5 = Math.min(width2, pVar3.getHeight() - i48) - AndroidUtilities.dp(40.0f);
                        f7 = ftVar.e;
                        int i50 = min5 / 2;
                        int i51 = i49 + i50;
                        int dp4 = ftVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                        pVar4 = ftVar.z;
                        float max2 = (int) (f7 + Math.max(i51 + dp4, ((pVar4.getHeight() - i48) - ftVar.I) / 2) + i50);
                        float dp5 = AndroidUtilities.dp(24.0f);
                        f10 = ftVar.e;
                        int i52 = (int) ((dp5 - f10) + max2);
                        org.telegram.ui.ActionBar.o1 o1Var2 = ftVar.k;
                        pVar5 = ftVar.z;
                        pVar6 = ftVar.z;
                        i15 = 0;
                        o1Var2.showAtLocation(pVar5, 0, (int) ((pVar6.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i52);
                        try {
                            pVar7 = ftVar.z;
                            pVar7.performHapticFeedback(0);
                        } catch (Exception unused4) {
                        }
                        f11 = ftVar.e;
                        if (f11 != 0.0f) {
                            f12 = ftVar.e;
                            ftVar.f = f12;
                            final int i53 = 2;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.vs
                                public final /* synthetic */ bt b;

                                {
                                    this.b = this;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (i53) {
                                        case 0:
                                            ft ftVar2 = this.b.a;
                                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            ftVar2.g = floatValue;
                                            float f192 = ftVar2.f;
                                            ftVar2.e = c3.h0.z(0.0f, f192, floatValue, f192);
                                            ftVar2.z.invalidate();
                                            break;
                                        case 1:
                                            ft ftVar3 = this.b.a;
                                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            ftVar3.g = floatValue2;
                                            float f20 = ftVar3.f;
                                            ftVar3.e = c3.h0.z(0.0f, f20, floatValue2, f20);
                                            ftVar3.z.invalidate();
                                            break;
                                        default:
                                            ft ftVar4 = this.b.a;
                                            float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            ftVar4.g = floatValue3;
                                            float f21 = ftVar4.f;
                                            ftVar4.e = c3.h0.z(0.0f, f21, floatValue3, f21);
                                            ftVar4.z.invalidate();
                                            break;
                                    }
                                }
                            });
                            ofFloat3.setDuration(350L);
                            ofFloat3.setInterpolator(org.telegram.ui.Components.ds.f);
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
                document12 = ftVar.W;
                if (MessageObject.isPremiumSticker(document12)) {
                    i27 = ftVar.r;
                    if (!AccountInstance.getInstance(i27).getUserConfig().isPremium()) {
                        if (ftVar.O == null) {
                            eg1 eg1Var = new eg1(ftVar.z.getContext(), ftVar.c0);
                            ftVar.O = eg1Var;
                            ftVar.z.addView(eg1Var, org.telegram.ui.Components.gb1.g(-1.0f, -1));
                            ftVar.O.setOnClickListener(new us(ftVar, i35));
                            z11 = true;
                            ftVar.O.a.v.setOnClickListener(new us(ftVar, 1 == true ? 1 : 0));
                        } else {
                            z11 = true;
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(ftVar.O, false, 1.0f, false);
                        AndroidUtilities.updateViewVisibilityAnimated(ftVar.O, z11);
                        ftVar.O.setTranslationY(0.0f);
                        ftVar.K = true;
                        pVar26 = ftVar.z;
                        pVar26.invalidate();
                        try {
                            pVar27 = ftVar.z;
                            pVar27.performHapticFeedback(0);
                            return;
                        } catch (Exception unused5) {
                            return;
                        }
                    }
                }
                i20 = ftVar.r;
                MediaDataController mediaDataController3 = MediaDataController.getInstance(i20);
                document13 = ftVar.W;
                boolean isStickerInFavorites2 = mediaDataController3.isStickerInFavorites(document13);
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                dtVar13 = ftVar.l;
                if (dtVar13 != null) {
                    dtVar20 = ftVar.l;
                    i25 = ftVar.V;
                    if (dtVar20.l(i25)) {
                        dtVar25 = ftVar.l;
                        if (!dtVar25.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendStickerPreview));
                            d3.r(R.drawable.msg_send, arrayList13, arrayList12, 0);
                        }
                    }
                    dtVar21 = ftVar.l;
                    i26 = ftVar.V;
                    if (dtVar21.l(i26)) {
                        dtVar24 = ftVar.l;
                        if (!dtVar24.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendWithoutSound));
                            d3.n(R.drawable.input_notify_off, 6, arrayList13, arrayList12);
                        }
                    }
                    dtVar22 = ftVar.l;
                    if (dtVar22.b()) {
                        arrayList11.add(LocaleController.getString(R.string.Schedule));
                        d3.r(R.drawable.msg_autodelete, arrayList13, arrayList12, 3);
                    }
                    dtVar23 = ftVar.l;
                    if (dtVar23.f()) {
                        arrayList11.add(LocaleController.getString(R.string.ImportStickersRemoveMenu));
                        d3.r(R.drawable.msg_delete, arrayList13, arrayList12, 5);
                    }
                }
                document14 = ftVar.W;
                if (!MessageObject.isMaskDocument(document14)) {
                    if (!isStickerInFavorites2) {
                        i24 = ftVar.r;
                        if (MediaDataController.getInstance(i24).canAddStickerToFavorites()) {
                            document16 = ftVar.W;
                        }
                    }
                    arrayList11.add(LocaleController.getString(isStickerInFavorites2 ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                    d3.r(isStickerInFavorites2 ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList13, arrayList12, 2);
                }
                dtVar14 = ftVar.l;
                if (dtVar14 != null && (inputStickerSet = ftVar.a0) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                    dtVar19 = ftVar.l;
                    if (dtVar19.Q()) {
                        arrayList11.add(LocaleController.formatString(R.string.ViewPackPreview, new Object[0]));
                        d3.r(R.drawable.msg_media, arrayList13, arrayList12, 1);
                    }
                }
                if (ftVar.p) {
                    arrayList11.add(LocaleController.getString(R.string.DeleteFromRecent));
                    d3.r(R.drawable.msg_delete, arrayList13, arrayList12, 4);
                }
                if (ftVar.a0 != null) {
                    document15 = ftVar.W;
                    if (document15 != null) {
                        i23 = ftVar.r;
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i23).getStickerSet(ftVar.a0, true);
                        if (stickerSet != null) {
                            dtVar17 = ftVar.l;
                            if (dtVar17 != null) {
                                dtVar18 = ftVar.l;
                                if (dtVar18.C()) {
                                    TLRPC.StickerSet stickerSet2 = stickerSet.set;
                                    if (!stickerSet2.emojis && !stickerSet2.masks) {
                                        arrayList11.add(LocaleController.getString(R.string.EditSticker));
                                        d3.n(R.drawable.msg_edit, 7, arrayList13, arrayList12);
                                    }
                                }
                            }
                        }
                        if (stickerSet != null && stickerSet.set.creator) {
                            dtVar15 = ftVar.l;
                            if (dtVar15 != null) {
                                dtVar16 = ftVar.l;
                                unused = ftVar.W;
                                if (dtVar16.H()) {
                                    arrayList11.add(LocaleController.getString(R.string.DeleteSticker));
                                    d3.n(R.drawable.msg_delete, 8, arrayList13, arrayList12);
                                }
                            }
                        }
                    }
                }
                if (arrayList11.isEmpty()) {
                    return;
                }
                ftVar.K = true;
                pVar15 = ftVar.z;
                pVar15.invalidate();
                xs xsVar = new xs(this, arrayList12, isStickerInFavorites2);
                ft.f(ftVar, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                for (int i54 = 0; i54 < arrayList11.size(); i54++) {
                    int intValue3 = ((Integer) arrayList13.get(i54)).intValue();
                    CharSequence charSequence3 = (CharSequence) arrayList11.get(i54);
                    u6Var3 = ftVar.c0;
                    org.telegram.ui.ActionBar.g1 c14 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, intValue3, charSequence3, false, u6Var3);
                    c14.setTag(Integer.valueOf(i54));
                    c14.setOnClickListener(xsVar);
                    if (((Integer) arrayList12.get(i54)).intValue() == 8) {
                        int i55 = org.telegram.ui.ActionBar.y6.q7;
                        c14.c(i55, i55);
                        c14.h(0.1f, i55);
                    }
                }
                ys ysVar = new ys(this, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                ftVar.k = ysVar;
                ysVar.e = true;
                ysVar.c = 100;
                ysVar.g = true;
                ysVar.setOutsideTouchable(true);
                ftVar.k.setClippingEnabled(true);
                ftVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                ftVar.k.setFocusable(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                ftVar.k.setInputMethodMode(2);
                ftVar.k.getContentView().setFocusableInTouchMode(true);
                bVar7 = ftVar.q;
                int i56 = bVar7.d;
                bVar8 = ftVar.q;
                int i57 = i56 + bVar8.b;
                bVar9 = ftVar.q;
                int i58 = bVar9.b;
                i21 = ftVar.V;
                if (i21 == 1) {
                    pVar24 = ftVar.z;
                    int width3 = pVar24.getWidth();
                    pVar25 = ftVar.z;
                    i22 = Math.min(width3, pVar25.getHeight() - i57) - AndroidUtilities.dp(40.0f);
                } else {
                    if (ftVar.S) {
                        pVar18 = ftVar.z;
                        int width4 = pVar18.getWidth();
                        pVar19 = ftVar.z;
                        min = Math.min(width4, pVar19.getHeight() - i57) - AndroidUtilities.dpf2(40.0f);
                    } else {
                        pVar16 = ftVar.z;
                        int width5 = pVar16.getWidth();
                        pVar17 = ftVar.z;
                        min = Math.min(width5, pVar17.getHeight() - i57) / 1.8f;
                    }
                    i22 = (int) min;
                }
                f17 = ftVar.e;
                int i59 = i22 / 2;
                int i60 = i58 + i59;
                int dp6 = ftVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                pVar20 = ftVar.z;
                int dp7 = AndroidUtilities.dp(24.0f) + ((int) (f17 + Math.max(i60 + dp6, ((pVar20.getHeight() - i57) - ftVar.I) / 2) + i59));
                if (ftVar.S) {
                    dp7 += AndroidUtilities.dp(24.0f);
                }
                org.telegram.ui.ActionBar.o1 o1Var3 = ftVar.k;
                pVar21 = ftVar.z;
                pVar22 = ftVar.z;
                o1Var3.showAtLocation(pVar21, 0, (int) ((pVar22.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth()) / 2.0f), dp7);
                try {
                    pVar23 = ftVar.z;
                    pVar23.performHapticFeedback(0);
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
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout22 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, ftVar.z.getContext(), ftVar.c0);
        org.telegram.ui.ActionBar.u6 u6Var42 = null;
        eh.d c102 = bVar10.c(actionBarPopupWindow$ActionBarPopupWindowLayout22, null, true);
        c102.v(gh.c.k(ftVar.c0));
        org.telegram.messenger.vh.s(c102, AndroidUtilities.dp(12.0f), 8.0f);
        c102.x.e = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout22.setBackground(c102);
        int i312 = 6;
        int i322 = 7;
        if (ftVar.V != 3) {
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout22;
        i15 = 0;
        i28 = i15;
        while (i28 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
        }
    }
}
