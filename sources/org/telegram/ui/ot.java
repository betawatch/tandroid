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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
        ci.n6 n6Var;
        i0.b bVar;
        i0.b bVar2;
        i0.b bVar3;
        ci.n6 n6Var2;
        ci.n6 n6Var3;
        float f7;
        ci.n6 n6Var4;
        float f10;
        ci.n6 n6Var5;
        ci.n6 n6Var6;
        float f11;
        float f12;
        ci.n6 n6Var7;
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
        ci.n6 n6Var8;
        i0.b bVar4;
        i0.b bVar5;
        i0.b bVar6;
        ci.n6 n6Var9;
        ci.n6 n6Var10;
        float f13;
        ci.n6 n6Var11;
        float f14;
        ci.n6 n6Var12;
        ci.n6 n6Var13;
        float f15;
        float f16;
        ci.n6 n6Var14;
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
        ci.n6 n6Var15;
        i0.b bVar7;
        i0.b bVar8;
        i0.b bVar9;
        int i20;
        ci.n6 n6Var16;
        ci.n6 n6Var17;
        float min;
        int i21;
        ci.n6 n6Var18;
        ci.n6 n6Var19;
        float f17;
        ci.n6 n6Var20;
        ci.n6 n6Var21;
        ci.n6 n6Var22;
        ci.n6 n6Var23;
        ci.n6 n6Var24;
        ci.n6 n6Var25;
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
        ci.n6 n6Var26;
        ci.n6 n6Var27;
        int i27;
        fc1 fc1Var;
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        ci.n6 n6Var28;
        org.telegram.ui.Components.v70 i28;
        TLRPC.Document unused;
        st stVar = this.a;
        ah.c cVar = stVar.t;
        if (stVar.w == null || stVar.m) {
            return;
        }
        stVar.R = true;
        qt qtVar26 = stVar.l;
        final int i29 = 0;
        if (qtVar26 != null && (i28 = qtVar26.i(stVar.z)) != null) {
            i28.Q(cVar, eh.b.k(stVar.c0), true);
            i28.t = false;
            i28.Y();
            i28.p = new cj(this, 16);
            ViewGroup viewGroup = i28.A;
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
            i0.b bVar10 = stVar.q;
            int min2 = (Math.min(stVar.z.getWidth(), stVar.z.getHeight() - (bVar10.d + bVar10.b)) - AndroidUtilities.dp(40.0f)) / 2;
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
                        switch (i29) {
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
                ofFloat.setInterpolator(org.telegram.ui.Components.qr.f);
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
            ch.d c10 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout2, null, true);
            c10.o(eh.b.k(stVar.c0));
            c10.q(AndroidUtilities.dp(12.0f));
            c10.p(AndroidUtilities.dp(8.0f));
            c10.j.e = true;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackground(c10);
            if (stVar.V != 3) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (stVar.T == null) {
                    qt qtVar28 = stVar.l;
                    if (qtVar28 == null || !qtVar28.B()) {
                        if (stVar.l.y()) {
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
                qt qtVar29 = stVar.l;
                if (qtVar29 == null || !qtVar29.B()) {
                    qt qtVar30 = stVar.l;
                    arrayList.add(LocaleController.getString((qtVar30 == null || !qtVar30.J()) ? R.string.AddToStickerPack : R.string.StickersReplaceSticker));
                    qt qtVar31 = stVar.l;
                    org.telegram.ui.Cells.c1.p((qtVar31 == null || !qtVar31.J()) ? R.drawable.menu_sticker_add : R.drawable.msg_replace, arrayList3, arrayList2, 2);
                }
                int i30 = 7;
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, stVar.w, stVar.c0, true, false);
                f1Var.setItemHeight(44);
                f1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                f1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                FrameLayout frameLayout = new FrameLayout(stVar.z.getContext());
                LinearLayout linearLayout = new LinearLayout(stVar.z.getContext());
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, stVar.c0));
                linearLayout.setOrientation(1);
                if (stVar.w == null) {
                    fc1Var = null;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new TLRPC.TL_stickerSetNoCovered());
                    TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = new TLRPC.TL_messages_getMyStickers();
                    tL_messages_getMyStickers.limit = 100;
                    ConnectionsManager.getInstance(stVar.r).sendRequest(tL_messages_getMyStickers, new ba(stVar, arrayList4, tL_messages_getMyStickers, i30));
                    fc1 fc1Var2 = new fc1(stVar.w, i30, f6Var4);
                    fc1Var2.setLayoutManager(new s4.c0());
                    fc1Var2.i(new ci.r1(arrayList4, 4));
                    fc1Var2.setAdapter(new pt(stVar, arrayList4));
                    fc1Var = fc1Var2;
                }
                fc1Var.setOnItemClickListener(new i(this, 5));
                frameLayout.addView(f1Var);
                linearLayout.addView(frameLayout);
                linearLayout.addView(new org.telegram.ui.ActionBar.k1(stVar.z.getContext(), stVar.c0), w7.y5.n(-1, 8));
                ai.s0 s0Var = new ai.s0(this, arrayList2, fc1Var, linearLayout, actionBarPopupWindow$ActionBarPopupWindowLayout2, 13);
                for (int i31 = 0; i31 < arrayList.size(); i31++) {
                    org.telegram.ui.ActionBar.f1 c11 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, ((Integer) arrayList3.get(i31)).intValue(), (CharSequence) arrayList.get(i31), false, stVar.c0);
                    c11.setTag(Integer.valueOf(i31));
                    c11.setOnClickListener(s0Var);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                linearLayout.addView(fc1Var, new LinearLayout.LayoutParams(actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth() - AndroidUtilities.dp(16.0f), (int) (actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredHeight() * 1.5f)));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.b(linearLayout);
                frameLayout.setOnClickListener(new uf(actionBarPopupWindow$ActionBarPopupWindowLayout2, 2));
                i0.b bVar11 = stVar.q;
                int i32 = bVar11.d + bVar11.b;
                int min3 = ((int) (Math.min(stVar.z.getWidth(), stVar.z.getHeight() - i32) / 1.8f)) / 2;
                stVar.z.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, w7.y5.d(-2, -2.0f, 49, 0.0f, (AndroidUtilities.dp(84.0f) + ((int) ((stVar.e + Math.max(r0 + min3, ((stVar.z.getHeight() - i32) - stVar.I) / 2)) + min3))) / AndroidUtilities.density, 0.0f, 0.0f));
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
                view6.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.qr.h).start();
                if (stVar.P == null) {
                    org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(stVar, stVar.z.getContext(), UserConfig.selectedAccount, stVar.c0);
                    stVar.P = ybVar;
                    ybVar.N0 = true;
                    ybVar.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                    stVar.P.setClipChildren(false);
                    stVar.P.setClipToPadding(false);
                    stVar.P.setVisibility(0);
                    stVar.P.setHint(LocaleController.getString(R.string.StickersSetEmojiForSticker));
                    stVar.P.setBubbleOffset(-AndroidUtilities.dp(105.0f));
                    stVar.P.setMiniBubblesOffset(-AndroidUtilities.dp(14.0f));
                    FrameLayout frameLayout2 = new FrameLayout(stVar.z.getContext());
                    stVar.Q = frameLayout2;
                    frameLayout2.addView(stVar.P, w7.y5.d(-2, 116.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                    stVar.z.addView(stVar.Q, w7.y5.d(-2, -2.0f, 1, 0.0f, 100.0f, 0.0f, 0.0f));
                }
                stVar.P.setSelectedEmojis(stVar.o);
                stVar.P.setDelegate(new ft(stVar));
                stVar.P.p(null, null, false);
                stVar.Q.setScaleY(0.6f);
                stVar.Q.setScaleX(0.6f);
                stVar.Q.setAlpha(0.0f);
                AndroidUtilities.runOnUIThread(new et(stVar, 2), 10L);
                stVar.K = true;
                n6Var28 = stVar.z;
                n6Var28.invalidate();
            } else {
                final int i33 = 1;
                int i34 = 0;
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
                            if (qtVar9.l(i16)) {
                                arrayList5.add(LocaleController.getString(R.string.SendEmojiPreview));
                                org.telegram.ui.Cells.c1.p(R.drawable.msg_send, arrayList7, arrayList6, 0);
                            }
                            qtVar10 = stVar.l;
                            document5 = stVar.W;
                            Boolean P = qtVar10.P(document5);
                            if (P != null) {
                                if (P.booleanValue()) {
                                    arrayList5.add(LocaleController.getString(R.string.SetAsEmojiStatus));
                                    org.telegram.ui.Cells.c1.p(R.drawable.msg_smile_status, arrayList7, arrayList6, 1);
                                } else {
                                    arrayList5.add(LocaleController.getString(R.string.RemoveStatus));
                                    org.telegram.ui.Cells.c1.p(R.drawable.msg_smile_status, arrayList7, arrayList6, 2);
                                }
                            }
                            qtVar11 = stVar.l;
                            document6 = stVar.W;
                            if (qtVar11.E(document6)) {
                                arrayList5.add(LocaleController.getString(R.string.CopyEmojiPreview));
                                org.telegram.ui.Cells.c1.p(R.drawable.msg_copy, arrayList7, arrayList6, 3);
                            }
                            qtVar12 = stVar.l;
                            document7 = stVar.W;
                            if (qtVar12.N(document7)) {
                                arrayList5.add(LocaleController.getString(R.string.RemoveFromRecent));
                                org.telegram.ui.Cells.c1.p(R.drawable.msg_delete, arrayList7, arrayList6, 4);
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
                                    org.telegram.ui.Cells.c1.p(isStickerInFavorites ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList7, arrayList6, 5);
                                }
                            }
                            if (arrayList5.isEmpty()) {
                                return;
                            }
                            stVar.K = true;
                            n6Var8 = stVar.z;
                            n6Var8.invalidate();
                            int[] iArr = new int[arrayList7.size()];
                            for (int i35 = 0; i35 < arrayList7.size(); i35++) {
                                iArr[i35] = ((Integer) arrayList7.get(i35)).intValue();
                            }
                            org.telegram.ui.Components.fc0 fc0Var = new org.telegram.ui.Components.fc0(this, arrayList6, isStickerInFavorites);
                            boolean h = st.h(stVar, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                            int i36 = 0;
                            while (i36 < arrayList5.size()) {
                                boolean z11 = !h && i36 == 0;
                                boolean z12 = i36 == arrayList5.size() + (-1);
                                int intValue = ((Integer) arrayList7.get(i36)).intValue();
                                CharSequence charSequence = (CharSequence) arrayList5.get(i36);
                                f6Var2 = stVar.c0;
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                                org.telegram.ui.ActionBar.f1 c12 = org.telegram.ui.ActionBar.v0.c(z11, z12, actionBarPopupWindow$ActionBarPopupWindowLayout3, intValue, charSequence, false, f6Var2);
                                if (((Integer) arrayList6.get(i36)).intValue() == 4) {
                                    c12.setIconColor(st.d(stVar, org.telegram.ui.ActionBar.j6.p7));
                                    c12.setTextColor(st.d(stVar, org.telegram.ui.ActionBar.j6.q7));
                                }
                                c12.setTag(Integer.valueOf(i36));
                                c12.setOnClickListener(fc0Var);
                                i36++;
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
                            bVar4 = stVar.q;
                            int i37 = bVar4.d;
                            bVar5 = stVar.q;
                            int i38 = i37 + bVar5.b;
                            bVar6 = stVar.q;
                            int i39 = bVar6.b;
                            n6Var9 = stVar.z;
                            int width = n6Var9.getWidth();
                            n6Var10 = stVar.z;
                            int min4 = Math.min(width, n6Var10.getHeight() - i38) - AndroidUtilities.dp(40.0f);
                            f13 = stVar.e;
                            int i40 = min4 / 2;
                            int i41 = i39 + i40;
                            int dp2 = stVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                            n6Var11 = stVar.z;
                            float max = (int) (f13 + Math.max(i41 + dp2, ((n6Var11.getHeight() - i38) - stVar.I) / 2) + i40);
                            float dp3 = AndroidUtilities.dp(24.0f);
                            f14 = stVar.e;
                            int i42 = (int) ((dp3 - f14) + max);
                            org.telegram.ui.ActionBar.n1 n1Var = stVar.k;
                            n6Var12 = stVar.z;
                            n6Var13 = stVar.z;
                            n1Var.showAtLocation(n6Var12, 0, (int) ((n6Var13.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i42);
                            org.telegram.ui.ActionBar.n1.i(actionBarPopupWindow$ActionBarPopupWindowLayout);
                            try {
                                n6Var14 = stVar.z;
                                n6Var14.performHapticFeedback(0);
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
                                        switch (i33) {
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
                                ofFloat2.setInterpolator(org.telegram.ui.Components.qr.f);
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
                        if (qtVar2.l(i13)) {
                            qtVar7 = stVar.l;
                            if (!qtVar7.c()) {
                                arrayList8.add(LocaleController.getString(R.string.SendGifPreview));
                                org.telegram.ui.Cells.c1.p(R.drawable.msg_send, arrayList10, arrayList9, 0);
                            }
                        }
                        qtVar3 = stVar.l;
                        i14 = stVar.V;
                        if (qtVar3.l(i14)) {
                            qtVar6 = stVar.l;
                            if (!qtVar6.c()) {
                                arrayList8.add(LocaleController.getString(R.string.SendWithoutSound));
                                org.telegram.ui.Cells.c1.p(R.drawable.input_notify_off, arrayList10, arrayList9, 4);
                            }
                        }
                        qtVar4 = stVar.l;
                        if (qtVar4.b()) {
                            arrayList8.add(LocaleController.getString(R.string.Schedule));
                            org.telegram.ui.Cells.c1.p(R.drawable.msg_autodelete, arrayList10, arrayList9, 3);
                        }
                        document = stVar.W;
                        if (document != null) {
                            qtVar5 = stVar.l;
                            document4 = stVar.W;
                            if (qtVar5.e(document4)) {
                                arrayList8.add(LocaleController.getString(R.string.AddACaption));
                                org.telegram.ui.Cells.c1.n(R.drawable.outline_caption_24, 11, arrayList10, arrayList9);
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
                        stVar.K = true;
                        n6Var = stVar.z;
                        n6Var.invalidate();
                        int[] iArr2 = new int[arrayList10.size()];
                        for (int i43 = 0; i43 < arrayList10.size(); i43++) {
                            iArr2[i43] = ((Integer) arrayList10.get(i43)).intValue();
                        }
                        org.telegram.ui.Components.dt dtVar = new org.telegram.ui.Components.dt(28, this, arrayList9);
                        for (int i44 = 0; i44 < arrayList8.size(); i44++) {
                            int intValue2 = ((Integer) arrayList10.get(i44)).intValue();
                            CharSequence charSequence2 = (CharSequence) arrayList8.get(i44);
                            f6Var = stVar.c0;
                            org.telegram.ui.ActionBar.f1 c13 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, intValue2, charSequence2, false, f6Var);
                            c13.setTag(Integer.valueOf(i44));
                            c13.setOnClickListener(dtVar);
                            if (z10 && i44 == arrayList8.size() - 1) {
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
                        bVar = stVar.q;
                        int i45 = bVar.d;
                        bVar2 = stVar.q;
                        int i46 = i45 + bVar2.b;
                        bVar3 = stVar.q;
                        int i47 = bVar3.b;
                        n6Var2 = stVar.z;
                        int width2 = n6Var2.getWidth();
                        n6Var3 = stVar.z;
                        int min5 = Math.min(width2, n6Var3.getHeight() - i46) - AndroidUtilities.dp(40.0f);
                        f7 = stVar.e;
                        int i48 = min5 / 2;
                        int i49 = i47 + i48;
                        int dp4 = stVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                        n6Var4 = stVar.z;
                        float max2 = (int) (f7 + Math.max(i49 + dp4, ((n6Var4.getHeight() - i46) - stVar.I) / 2) + i48);
                        float dp5 = AndroidUtilities.dp(24.0f);
                        f10 = stVar.e;
                        int i50 = (int) ((dp5 - f10) + max2);
                        org.telegram.ui.ActionBar.n1 n1Var2 = stVar.k;
                        n6Var5 = stVar.z;
                        n6Var6 = stVar.z;
                        n1Var2.showAtLocation(n6Var5, 0, (int) ((n6Var6.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i50);
                        try {
                            n6Var7 = stVar.z;
                            n6Var7.performHapticFeedback(0);
                        } catch (Exception unused4) {
                        }
                        f11 = stVar.e;
                        if (f11 != 0.0f) {
                            f12 = stVar.e;
                            stVar.f = f12;
                            final int i51 = 2;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ht
                                public final /* synthetic */ ot b;

                                {
                                    this.b = this;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (i51) {
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
                            ofFloat3.setInterpolator(org.telegram.ui.Components.qr.f);
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
                            jh1 jh1Var = new jh1(stVar.z.getContext(), stVar.c0);
                            stVar.O = jh1Var;
                            stVar.z.addView(jh1Var, w7.y5.c(-1.0f, -1));
                            stVar.O.setOnClickListener(new gt(stVar, i34));
                            stVar.O.a.r.setOnClickListener(new gt(stVar, i33));
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(stVar.O, false, 1.0f, false);
                        AndroidUtilities.updateViewVisibilityAnimated(stVar.O, true);
                        stVar.O.setTranslationY(0.0f);
                        stVar.K = true;
                        n6Var26 = stVar.z;
                        n6Var26.invalidate();
                        try {
                            n6Var27 = stVar.z;
                            n6Var27.performHapticFeedback(0);
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
                    if (qtVar20.l(i24)) {
                        qtVar25 = stVar.l;
                        if (!qtVar25.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendStickerPreview));
                            org.telegram.ui.Cells.c1.p(R.drawable.msg_send, arrayList13, arrayList12, 0);
                        }
                    }
                    qtVar21 = stVar.l;
                    i25 = stVar.V;
                    if (qtVar21.l(i25)) {
                        qtVar24 = stVar.l;
                        if (!qtVar24.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendWithoutSound));
                            org.telegram.ui.Cells.c1.n(R.drawable.input_notify_off, 6, arrayList13, arrayList12);
                        }
                    }
                    qtVar22 = stVar.l;
                    if (qtVar22.b()) {
                        arrayList11.add(LocaleController.getString(R.string.Schedule));
                        org.telegram.ui.Cells.c1.p(R.drawable.msg_autodelete, arrayList13, arrayList12, 3);
                    }
                    qtVar23 = stVar.l;
                    if (qtVar23.f()) {
                        arrayList11.add(LocaleController.getString(R.string.ImportStickersRemoveMenu));
                        org.telegram.ui.Cells.c1.p(R.drawable.msg_delete, arrayList13, arrayList12, 5);
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
                    org.telegram.ui.Cells.c1.p(isStickerInFavorites2 ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList13, arrayList12, 2);
                }
                qtVar14 = stVar.l;
                if (qtVar14 != null && (inputStickerSet = stVar.a0) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                    qtVar19 = stVar.l;
                    if (qtVar19.Q()) {
                        arrayList11.add(LocaleController.formatString(R.string.ViewPackPreview, new Object[0]));
                        org.telegram.ui.Cells.c1.p(R.drawable.msg_media, arrayList13, arrayList12, 1);
                    }
                }
                if (stVar.p) {
                    arrayList11.add(LocaleController.getString(R.string.DeleteFromRecent));
                    org.telegram.ui.Cells.c1.p(R.drawable.msg_delete, arrayList13, arrayList12, 4);
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
                                if (qtVar18.D()) {
                                    TLRPC.StickerSet stickerSet2 = stickerSet.set;
                                    if (!stickerSet2.emojis && !stickerSet2.masks) {
                                        arrayList11.add(LocaleController.getString(R.string.EditSticker));
                                        org.telegram.ui.Cells.c1.n(R.drawable.msg_edit, 7, arrayList13, arrayList12);
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
                                    org.telegram.ui.Cells.c1.n(R.drawable.msg_delete, 8, arrayList13, arrayList12);
                                }
                            }
                        }
                    }
                }
                if (arrayList11.isEmpty()) {
                    return;
                }
                stVar.K = true;
                n6Var15 = stVar.z;
                n6Var15.invalidate();
                kt ktVar = new kt(this, arrayList12, isStickerInFavorites2);
                st.h(stVar, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                for (int i52 = 0; i52 < arrayList11.size(); i52++) {
                    int intValue3 = ((Integer) arrayList13.get(i52)).intValue();
                    CharSequence charSequence3 = (CharSequence) arrayList11.get(i52);
                    f6Var3 = stVar.c0;
                    org.telegram.ui.ActionBar.f1 c14 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, intValue3, charSequence3, false, f6Var3);
                    c14.setTag(Integer.valueOf(i52));
                    c14.setOnClickListener(ktVar);
                    if (((Integer) arrayList12.get(i52)).intValue() == 8) {
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
                bVar7 = stVar.q;
                int i53 = bVar7.d;
                bVar8 = stVar.q;
                int i54 = i53 + bVar8.b;
                bVar9 = stVar.q;
                int i55 = bVar9.b;
                i20 = stVar.V;
                if (i20 == 1) {
                    n6Var24 = stVar.z;
                    int width3 = n6Var24.getWidth();
                    n6Var25 = stVar.z;
                    i21 = Math.min(width3, n6Var25.getHeight() - i54) - AndroidUtilities.dp(40.0f);
                } else {
                    if (stVar.S) {
                        n6Var18 = stVar.z;
                        int width4 = n6Var18.getWidth();
                        n6Var19 = stVar.z;
                        min = Math.min(width4, n6Var19.getHeight() - i54) - AndroidUtilities.dpf2(40.0f);
                    } else {
                        n6Var16 = stVar.z;
                        int width5 = n6Var16.getWidth();
                        n6Var17 = stVar.z;
                        min = Math.min(width5, n6Var17.getHeight() - i54) / 1.8f;
                    }
                    i21 = (int) min;
                }
                f17 = stVar.e;
                int i56 = i21 / 2;
                int i57 = i55 + i56;
                int dp6 = stVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                n6Var20 = stVar.z;
                int dp7 = AndroidUtilities.dp(24.0f) + ((int) (f17 + Math.max(i57 + dp6, ((n6Var20.getHeight() - i54) - stVar.I) / 2) + i56));
                if (stVar.S) {
                    dp7 += AndroidUtilities.dp(24.0f);
                }
                org.telegram.ui.ActionBar.n1 n1Var3 = stVar.k;
                n6Var21 = stVar.z;
                n6Var22 = stVar.z;
                n1Var3.showAtLocation(n6Var21, 0, (int) ((n6Var22.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth()) / 2.0f), dp7);
                try {
                    n6Var23 = stVar.z;
                    n6Var23.performHapticFeedback(0);
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
        ch.d c102 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout22, null, true);
        c102.o(eh.b.k(stVar.c0));
        c102.q(AndroidUtilities.dp(12.0f));
        c102.p(AndroidUtilities.dp(8.0f));
        c102.j.e = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout22.setBackground(c102);
        if (stVar.V != 3) {
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout22;
        i27 = 0;
        while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
        }
    }
}
