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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class dt implements Runnable {
    public final /* synthetic */ ht a;

    public dt(ht htVar) {
        this.a = htVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x0663, code lost:
    
        if (org.telegram.messenger.MessageObject.isStickerHasSet(r0) != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0990, code lost:
    
        if (org.telegram.messenger.MessageObject.isStickerHasSet(r4) != false) goto L233;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0dc2  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        int i11;
        int i12;
        ft ftVar;
        ft ftVar2;
        int i13;
        ft ftVar3;
        int i14;
        ft ftVar4;
        TLRPC.Document document;
        TLRPC.Document document2;
        boolean z10;
        bg.d1 d1Var;
        i0.b bVar;
        i0.b bVar2;
        i0.b bVar3;
        bg.d1 d1Var2;
        bg.d1 d1Var3;
        float f9;
        bg.d1 d1Var4;
        float f10;
        bg.d1 d1Var5;
        bg.d1 d1Var6;
        float f11;
        float f12;
        bg.d1 d1Var7;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i15;
        TLRPC.Document document3;
        ft ftVar5;
        TLRPC.Document document4;
        ft ftVar6;
        ft ftVar7;
        ft ftVar8;
        ft ftVar9;
        int i16;
        ft ftVar10;
        TLRPC.Document document5;
        ft ftVar11;
        TLRPC.Document document6;
        ft ftVar12;
        TLRPC.Document document7;
        int i17;
        TLRPC.Document document8;
        TLRPC.Document document9;
        bg.d1 d1Var8;
        i0.b bVar4;
        i0.b bVar5;
        i0.b bVar6;
        bg.d1 d1Var9;
        bg.d1 d1Var10;
        float f13;
        bg.d1 d1Var11;
        float f14;
        bg.d1 d1Var12;
        bg.d1 d1Var13;
        float f15;
        float f16;
        bg.d1 d1Var14;
        org.telegram.ui.ActionBar.c6 c6Var2;
        TLRPC.Document document10;
        int i18;
        TLRPC.Document document11;
        TLRPC.Document document12;
        int i19;
        TLRPC.Document document13;
        ft ftVar13;
        TLRPC.Document document14;
        ft ftVar14;
        bg.d1 d1Var15;
        i0.b bVar7;
        i0.b bVar8;
        i0.b bVar9;
        int i20;
        bg.d1 d1Var16;
        bg.d1 d1Var17;
        float min;
        int i21;
        bg.d1 d1Var18;
        bg.d1 d1Var19;
        float f17;
        bg.d1 d1Var20;
        bg.d1 d1Var21;
        bg.d1 d1Var22;
        bg.d1 d1Var23;
        bg.d1 d1Var24;
        bg.d1 d1Var25;
        org.telegram.ui.ActionBar.c6 c6Var3;
        TLRPC.Document document15;
        int i22;
        ft ftVar15;
        ft ftVar16;
        ft ftVar17;
        ft ftVar18;
        TLRPC.InputStickerSet inputStickerSet;
        ft ftVar19;
        int i23;
        TLRPC.Document document16;
        ft ftVar20;
        int i24;
        ft ftVar21;
        int i25;
        ft ftVar22;
        ft ftVar23;
        ft ftVar24;
        ft ftVar25;
        int i26;
        bg.d1 d1Var26;
        bg.d1 d1Var27;
        int i27;
        wa1 wa1Var;
        int i28;
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        bg.d1 d1Var28;
        org.telegram.ui.Components.j70 G;
        TLRPC.Document unused;
        ht htVar = this.a;
        lg.a aVar = htVar.t;
        if (htVar.w == null || htVar.m) {
            return;
        }
        htVar.R = true;
        ft ftVar26 = htVar.l;
        int i29 = 16;
        final int i30 = 0;
        if (ftVar26 != null && (G = ftVar26.G(htVar.z)) != null) {
            G.Q(aVar, pg.a.j(htVar.c0), true);
            G.t = false;
            G.Y();
            G.p = new ui(this, i29);
            ViewGroup viewGroup = G.A;
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
            i0.b bVar10 = htVar.q;
            int min2 = (Math.min(htVar.z.getWidth(), htVar.z.getHeight() - (bVar10.d + bVar10.b)) - AndroidUtilities.dp(40.0f)) / 2;
            int dp = (int) ((AndroidUtilities.dp(24.0f) - htVar.e) + ((int) (htVar.e + Math.max(r2 + min2 + (htVar.G != null ? AndroidUtilities.dp(40.0f) : 0), ((htVar.z.getHeight() - r3) - htVar.I) / 2) + min2)));
            htVar.k.showAtLocation(htVar.z, 0, (int) ((r4.getMeasuredWidth() - viewGroup.getMeasuredWidth()) / 2.0f), dp);
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
                        switch (i30) {
                            case 0:
                                ht htVar2 = this.b.a;
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                htVar2.g = floatValue;
                                float f19 = htVar2.f;
                                htVar2.e = com.google.android.recaptcha.internal.a.z(0.0f, f19, floatValue, f19);
                                htVar2.z.invalidate();
                                break;
                            case 1:
                                ht htVar3 = this.b.a;
                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                htVar3.g = floatValue2;
                                float f20 = htVar3.f;
                                htVar3.e = com.google.android.recaptcha.internal.a.z(0.0f, f20, floatValue2, f20);
                                htVar3.z.invalidate();
                                break;
                            default:
                                ht htVar4 = this.b.a;
                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                htVar4.g = floatValue3;
                                float f21 = htVar4.f;
                                htVar4.e = com.google.android.recaptcha.internal.a.z(0.0f, f21, floatValue3, f21);
                                htVar4.z.invalidate();
                                break;
                        }
                    }
                });
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(org.telegram.ui.Components.jr.f);
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
            actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, htVar.z.getContext(), htVar.c0);
            org.telegram.ui.ActionBar.c6 c6Var4 = null;
            ng.d c3 = aVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, true);
            c3.n(pg.a.j(htVar.c0));
            c3.p(AndroidUtilities.dp(12.0f));
            c3.o(AndroidUtilities.dp(8.0f));
            c3.h.e = true;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c3);
            if (htVar.V != 3) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (htVar.T == null) {
                    ft ftVar28 = htVar.l;
                    if (ftVar28 == null || !ftVar28.z()) {
                        if (htVar.l.w()) {
                            arrayList.add(LocaleController.getString(R.string.SendStickerPreview));
                            b.k(R.drawable.msg_send, arrayList3, arrayList2, 0);
                        }
                        arrayList.add(LocaleController.getString(R.string.AddToFavorites));
                        b.k(R.drawable.msg_fave, arrayList3, arrayList2, 1);
                    } else {
                        arrayList.add(LocaleController.getString(R.string.SetIntroSticker));
                        b.k(R.drawable.menu_sticker_add, arrayList3, arrayList2, 0);
                    }
                }
                ft ftVar29 = htVar.l;
                if (ftVar29 == null || !ftVar29.z()) {
                    ft ftVar30 = htVar.l;
                    arrayList.add(LocaleController.getString((ftVar30 == null || !ftVar30.J()) ? R.string.AddToStickerPack : R.string.StickersReplaceSticker));
                    ft ftVar31 = htVar.l;
                    b.k((ftVar31 == null || !ftVar31.J()) ? R.drawable.menu_sticker_add : R.drawable.msg_replace, arrayList3, arrayList2, 2);
                }
                int i31 = 6;
                int i32 = 7;
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, htVar.w, htVar.c0, true, false);
                g1Var.setItemHeight(44);
                g1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                g1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                FrameLayout frameLayout = new FrameLayout(htVar.z.getContext());
                LinearLayout linearLayout = new LinearLayout(htVar.z.getContext());
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, htVar.c0));
                linearLayout.setOrientation(1);
                if (htVar.w == null) {
                    wa1Var = null;
                    i28 = 5;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new TLRPC.TL_stickerSetNoCovered());
                    TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = new TLRPC.TL_messages_getMyStickers();
                    tL_messages_getMyStickers.limit = 100;
                    ConnectionsManager.getInstance(htVar.r).sendRequest(tL_messages_getMyStickers, new x9(htVar, arrayList4, tL_messages_getMyStickers, i32));
                    wa1Var = new wa1(htVar.w, i31, c6Var4);
                    wa1Var.setLayoutManager(new f2.j0());
                    i28 = 5;
                    wa1Var.i(new eg.f2(arrayList4, i28));
                    wa1Var.setAdapter(new et(htVar, arrayList4));
                }
                wa1Var.setOnItemClickListener(new j(this, i28));
                frameLayout.addView(g1Var);
                linearLayout.addView(frameLayout);
                linearLayout.addView(new org.telegram.ui.ActionBar.l1(htVar.z.getContext(), htVar.c0), i7.f6.n(-1, 8));
                wa1 wa1Var2 = wa1Var;
                lh.b0 b0Var = new lh.b0(this, arrayList2, wa1Var2, linearLayout, actionBarPopupWindow$ActionBarPopupWindowLayout, 12);
                for (int i33 = 0; i33 < arrayList.size(); i33++) {
                    org.telegram.ui.ActionBar.g1 c6 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, ((Integer) arrayList3.get(i33)).intValue(), (CharSequence) arrayList.get(i33), false, htVar.c0);
                    c6.setTag(Integer.valueOf(i33));
                    c6.setOnClickListener(b0Var);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout;
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                linearLayout.addView(wa1Var2, new LinearLayout.LayoutParams(actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() - AndroidUtilities.dp(16.0f), (int) (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() * 1.5f)));
                actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                frameLayout.setOnClickListener(new ff(actionBarPopupWindow$ActionBarPopupWindowLayout, 2));
                i0.b bVar11 = htVar.q;
                int i34 = bVar11.d + bVar11.b;
                int min3 = ((int) (Math.min(htVar.z.getWidth(), htVar.z.getHeight() - i34) / 1.8f)) / 2;
                htVar.z.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, i7.f6.d(-2, -2.0f, 49, 0.0f, (AndroidUtilities.dp(84.0f) + ((int) ((htVar.e + Math.max(r0 + min3, ((htVar.z.getHeight() - i34) - htVar.I) / 2)) + min3))) / AndroidUtilities.density, 0.0f, 0.0f));
                htVar.L = actionBarPopupWindow$ActionBarPopupWindowLayout;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(-AndroidUtilities.dp(12.0f));
                htVar.L.setAlpha(0.0f);
                view = htVar.L;
                view.setScaleX(0.8f);
                view2 = htVar.L;
                view2.setScaleY(0.8f);
                view3 = htVar.L;
                view3.setPivotY(0.0f);
                view4 = htVar.L;
                view5 = htVar.L;
                view4.setPivotX(view5.getMeasuredWidth() / 2.0f);
                view6 = htVar.L;
                view6.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.jr.h).start();
                if (htVar.P == null) {
                    org.telegram.ui.Components.vb vbVar = new org.telegram.ui.Components.vb(htVar, htVar.z.getContext(), UserConfig.selectedAccount, htVar.c0);
                    htVar.P = vbVar;
                    vbVar.J0 = true;
                    vbVar.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                    htVar.P.setClipChildren(false);
                    htVar.P.setClipToPadding(false);
                    htVar.P.setVisibility(0);
                    htVar.P.setHint(LocaleController.getString(R.string.StickersSetEmojiForSticker));
                    htVar.P.setBubbleOffset(-AndroidUtilities.dp(105.0f));
                    htVar.P.setMiniBubblesOffset(-AndroidUtilities.dp(14.0f));
                    FrameLayout frameLayout2 = new FrameLayout(htVar.z.getContext());
                    htVar.Q = frameLayout2;
                    frameLayout2.addView(htVar.P, i7.f6.d(-2, 116.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                    htVar.z.addView(htVar.Q, i7.f6.d(-2, -2.0f, 1, 0.0f, 100.0f, 0.0f, 0.0f));
                }
                htVar.P.setSelectedEmojis(htVar.o);
                htVar.P.setDelegate(new us(htVar));
                htVar.P.p(null, null, false);
                htVar.Q.setScaleY(0.6f);
                htVar.Q.setScaleX(0.6f);
                htVar.Q.setAlpha(0.0f);
                AndroidUtilities.runOnUIThread(new ts(htVar, 2), 10L);
                htVar.K = true;
                d1Var28 = htVar.z;
                d1Var28.invalidate();
            } else {
                int i35 = 1;
                int i36 = 0;
                i11 = htVar.V;
                if (i11 == 0) {
                    document12 = htVar.W;
                    if (MessageObject.isPremiumSticker(document12)) {
                        i26 = htVar.r;
                        if (!AccountInstance.getInstance(i26).getUserConfig().isPremium()) {
                            if (htVar.O == null) {
                                dg1 dg1Var = new dg1(htVar.z.getContext(), htVar.c0);
                                htVar.O = dg1Var;
                                htVar.z.addView(dg1Var, i7.f6.c(-1.0f, -1));
                                htVar.O.setOnClickListener(new ws(htVar, i36));
                                htVar.O.a.r.setOnClickListener(new ws(htVar, i35));
                            }
                            AndroidUtilities.updateViewVisibilityAnimated(htVar.O, false, 1.0f, false);
                            AndroidUtilities.updateViewVisibilityAnimated(htVar.O, true);
                            htVar.O.setTranslationY(0.0f);
                            htVar.K = true;
                            d1Var26 = htVar.z;
                            d1Var26.invalidate();
                            try {
                                d1Var27 = htVar.z;
                                d1Var27.performHapticFeedback(0);
                                return;
                            } catch (Exception unused3) {
                                return;
                            }
                        }
                    }
                    i19 = htVar.r;
                    MediaDataController mediaDataController = MediaDataController.getInstance(i19);
                    document13 = htVar.W;
                    boolean isStickerInFavorites = mediaDataController.isStickerInFavorites(document13);
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    ftVar13 = htVar.l;
                    if (ftVar13 != null) {
                        ftVar20 = htVar.l;
                        i24 = htVar.V;
                        if (ftVar20.k(i24)) {
                            ftVar25 = htVar.l;
                            if (!ftVar25.c()) {
                                arrayList5.add(LocaleController.getString(R.string.SendStickerPreview));
                                b.k(R.drawable.msg_send, arrayList7, arrayList6, 0);
                            }
                        }
                        ftVar21 = htVar.l;
                        i25 = htVar.V;
                        if (ftVar21.k(i25)) {
                            ftVar24 = htVar.l;
                            if (!ftVar24.c()) {
                                arrayList5.add(LocaleController.getString(R.string.SendWithoutSound));
                                b.h(R.drawable.input_notify_off, 6, arrayList7, arrayList6);
                            }
                        }
                        ftVar22 = htVar.l;
                        if (ftVar22.b()) {
                            arrayList5.add(LocaleController.getString(R.string.Schedule));
                            b.k(R.drawable.msg_autodelete, arrayList7, arrayList6, 3);
                        }
                        ftVar23 = htVar.l;
                        if (ftVar23.f()) {
                            arrayList5.add(LocaleController.getString(R.string.ImportStickersRemoveMenu));
                            b.k(R.drawable.msg_delete, arrayList7, arrayList6, 5);
                        }
                    }
                    document14 = htVar.W;
                    if (!MessageObject.isMaskDocument(document14)) {
                        if (!isStickerInFavorites) {
                            i23 = htVar.r;
                            if (MediaDataController.getInstance(i23).canAddStickerToFavorites()) {
                                document16 = htVar.W;
                            }
                        }
                        arrayList5.add(LocaleController.getString(isStickerInFavorites ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                        b.k(isStickerInFavorites ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList7, arrayList6, 2);
                    }
                    ftVar14 = htVar.l;
                    if (ftVar14 != null && (inputStickerSet = htVar.a0) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                        ftVar19 = htVar.l;
                        if (ftVar19.Q()) {
                            arrayList5.add(LocaleController.formatString(R.string.ViewPackPreview, new Object[0]));
                            b.k(R.drawable.msg_media, arrayList7, arrayList6, 1);
                        }
                    }
                    if (htVar.p) {
                        arrayList5.add(LocaleController.getString(R.string.DeleteFromRecent));
                        b.k(R.drawable.msg_delete, arrayList7, arrayList6, 4);
                    }
                    if (htVar.a0 != null) {
                        document15 = htVar.W;
                        if (document15 != null) {
                            i22 = htVar.r;
                            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i22).getStickerSet(htVar.a0, true);
                            if (stickerSet != null) {
                                ftVar17 = htVar.l;
                                if (ftVar17 != null) {
                                    ftVar18 = htVar.l;
                                    if (ftVar18.B()) {
                                        TLRPC.StickerSet stickerSet2 = stickerSet.set;
                                        if (!stickerSet2.emojis && !stickerSet2.masks) {
                                            arrayList5.add(LocaleController.getString(R.string.EditSticker));
                                            b.h(R.drawable.msg_edit, 7, arrayList7, arrayList6);
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
                                        arrayList5.add(LocaleController.getString(R.string.DeleteSticker));
                                        b.h(R.drawable.msg_delete, 8, arrayList7, arrayList6);
                                    }
                                }
                            }
                        }
                    }
                    if (arrayList5.isEmpty()) {
                        return;
                    }
                    htVar.K = true;
                    d1Var15 = htVar.z;
                    d1Var15.invalidate();
                    zs zsVar = new zs(this, arrayList6, isStickerInFavorites);
                    ht.h(htVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                    for (int i37 = 0; i37 < arrayList5.size(); i37++) {
                        int intValue = ((Integer) arrayList7.get(i37)).intValue();
                        CharSequence charSequence = (CharSequence) arrayList5.get(i37);
                        c6Var3 = htVar.c0;
                        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, intValue, charSequence, false, c6Var3);
                        c10.setTag(Integer.valueOf(i37));
                        c10.setOnClickListener(zsVar);
                        if (((Integer) arrayList6.get(i37)).intValue() == 8) {
                            int d10 = ht.d(htVar, org.telegram.ui.ActionBar.g6.q7);
                            c10.c(d10, d10);
                            c10.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.1f, d10));
                        }
                    }
                    at atVar = new at(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                    htVar.k = atVar;
                    atVar.e = true;
                    atVar.c = 100;
                    atVar.g = true;
                    atVar.setOutsideTouchable(true);
                    htVar.k.setClippingEnabled(true);
                    htVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                    htVar.k.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                    htVar.k.setInputMethodMode(2);
                    htVar.k.getContentView().setFocusableInTouchMode(true);
                    bVar7 = htVar.q;
                    int i38 = bVar7.d;
                    bVar8 = htVar.q;
                    int i39 = i38 + bVar8.b;
                    bVar9 = htVar.q;
                    int i40 = bVar9.b;
                    i20 = htVar.V;
                    if (i20 == 1) {
                        d1Var24 = htVar.z;
                        int width = d1Var24.getWidth();
                        d1Var25 = htVar.z;
                        i21 = Math.min(width, d1Var25.getHeight() - i39) - AndroidUtilities.dp(40.0f);
                    } else {
                        if (htVar.S) {
                            d1Var18 = htVar.z;
                            int width2 = d1Var18.getWidth();
                            d1Var19 = htVar.z;
                            min = Math.min(width2, d1Var19.getHeight() - i39) - AndroidUtilities.dpf2(40.0f);
                        } else {
                            d1Var16 = htVar.z;
                            int width3 = d1Var16.getWidth();
                            d1Var17 = htVar.z;
                            min = Math.min(width3, d1Var17.getHeight() - i39) / 1.8f;
                        }
                        i21 = (int) min;
                    }
                    f17 = htVar.e;
                    int i41 = i21 / 2;
                    int i42 = i40 + i41;
                    int dp2 = htVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                    d1Var20 = htVar.z;
                    int dp3 = AndroidUtilities.dp(24.0f) + ((int) (f17 + Math.max(i42 + dp2, ((d1Var20.getHeight() - i39) - htVar.I) / 2) + i41));
                    if (htVar.S) {
                        dp3 += AndroidUtilities.dp(24.0f);
                    }
                    org.telegram.ui.ActionBar.o1 o1Var = htVar.k;
                    d1Var21 = htVar.z;
                    d1Var22 = htVar.z;
                    o1Var.showAtLocation(d1Var21, 0, (int) ((d1Var22.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), dp3);
                    try {
                        d1Var23 = htVar.z;
                        d1Var23.performHapticFeedback(0);
                    } catch (Exception unused4) {
                    }
                } else {
                    i12 = htVar.V;
                    if (i12 == 2) {
                        ftVar8 = htVar.l;
                        if (ftVar8 != null) {
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = new ArrayList();
                            ftVar9 = htVar.l;
                            i16 = htVar.V;
                            if (ftVar9.k(i16)) {
                                arrayList8.add(LocaleController.getString(R.string.SendEmojiPreview));
                                b.k(R.drawable.msg_send, arrayList10, arrayList9, 0);
                            }
                            ftVar10 = htVar.l;
                            document5 = htVar.W;
                            Boolean P = ftVar10.P(document5);
                            if (P != null) {
                                if (P.booleanValue()) {
                                    arrayList8.add(LocaleController.getString(R.string.SetAsEmojiStatus));
                                    b.k(R.drawable.msg_smile_status, arrayList10, arrayList9, 1);
                                } else {
                                    arrayList8.add(LocaleController.getString(R.string.RemoveStatus));
                                    b.k(R.drawable.msg_smile_status, arrayList10, arrayList9, 2);
                                }
                            }
                            ftVar11 = htVar.l;
                            document6 = htVar.W;
                            if (ftVar11.C(document6)) {
                                arrayList8.add(LocaleController.getString(R.string.CopyEmojiPreview));
                                b.k(R.drawable.msg_copy, arrayList10, arrayList9, 3);
                            }
                            ftVar12 = htVar.l;
                            document7 = htVar.W;
                            if (ftVar12.N(document7)) {
                                arrayList8.add(LocaleController.getString(R.string.RemoveFromRecent));
                                b.k(R.drawable.msg_delete, arrayList10, arrayList9, 4);
                            }
                            i17 = htVar.r;
                            MediaDataController mediaDataController2 = MediaDataController.getInstance(i17);
                            document8 = htVar.W;
                            boolean isStickerInFavorites2 = mediaDataController2.isStickerInFavorites(document8);
                            document9 = htVar.W;
                            if (!MessageObject.isAnimatedEmoji(document9)) {
                                document10 = htVar.W;
                                if (!MessageObject.isMaskDocument(document10)) {
                                    if (!isStickerInFavorites2) {
                                        i18 = htVar.r;
                                        if (MediaDataController.getInstance(i18).canAddStickerToFavorites()) {
                                            document11 = htVar.W;
                                        }
                                    }
                                    arrayList8.add(LocaleController.getString(isStickerInFavorites2 ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                                    b.k(isStickerInFavorites2 ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList10, arrayList9, 5);
                                }
                            }
                            if (arrayList8.isEmpty()) {
                                return;
                            }
                            htVar.K = true;
                            d1Var8 = htVar.z;
                            d1Var8.invalidate();
                            int[] iArr = new int[arrayList10.size()];
                            for (int i43 = 0; i43 < arrayList10.size(); i43++) {
                                iArr[i43] = ((Integer) arrayList10.get(i43)).intValue();
                            }
                            org.telegram.ui.Components.tb0 tb0Var = new org.telegram.ui.Components.tb0(this, arrayList9, isStickerInFavorites2);
                            boolean h = ht.h(htVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            int i44 = 0;
                            while (i44 < arrayList8.size()) {
                                boolean z11 = !h && i44 == 0;
                                boolean z12 = i44 == arrayList8.size() + (-1);
                                int intValue2 = ((Integer) arrayList10.get(i44)).intValue();
                                CharSequence charSequence2 = (CharSequence) arrayList8.get(i44);
                                c6Var2 = htVar.c0;
                                org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(z11, z12, actionBarPopupWindow$ActionBarPopupWindowLayout, intValue2, charSequence2, false, c6Var2);
                                if (((Integer) arrayList9.get(i44)).intValue() == 4) {
                                    c11.setIconColor(ht.d(htVar, org.telegram.ui.ActionBar.g6.p7));
                                    c11.setTextColor(ht.d(htVar, org.telegram.ui.ActionBar.g6.q7));
                                }
                                c11.setTag(Integer.valueOf(i44));
                                c11.setOnClickListener(tb0Var);
                                i44++;
                            }
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
                            int i45 = bVar4.d;
                            bVar5 = htVar.q;
                            int i46 = i45 + bVar5.b;
                            bVar6 = htVar.q;
                            int i47 = bVar6.b;
                            d1Var9 = htVar.z;
                            int width4 = d1Var9.getWidth();
                            d1Var10 = htVar.z;
                            int min4 = Math.min(width4, d1Var10.getHeight() - i46) - AndroidUtilities.dp(40.0f);
                            f13 = htVar.e;
                            int i48 = min4 / 2;
                            int i49 = i47 + i48;
                            int dp4 = htVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                            d1Var11 = htVar.z;
                            float max = (int) (f13 + Math.max(i49 + dp4, ((d1Var11.getHeight() - i46) - htVar.I) / 2) + i48);
                            float dp5 = AndroidUtilities.dp(24.0f);
                            f14 = htVar.e;
                            int i50 = (int) ((dp5 - f14) + max);
                            org.telegram.ui.ActionBar.o1 o1Var2 = htVar.k;
                            d1Var12 = htVar.z;
                            d1Var13 = htVar.z;
                            o1Var2.showAtLocation(d1Var12, 0, (int) ((d1Var13.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i50);
                            org.telegram.ui.ActionBar.o1.i(actionBarPopupWindow$ActionBarPopupWindowLayout);
                            try {
                                d1Var14 = htVar.z;
                                d1Var14.performHapticFeedback(0);
                            } catch (Exception unused5) {
                            }
                            f15 = htVar.e;
                            if (f15 != 0.0f) {
                                f16 = htVar.e;
                                htVar.f = f16;
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                final int i51 = 1;
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.xs
                                    public final /* synthetic */ dt b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        switch (i51) {
                                            case 0:
                                                ht htVar2 = this.b.a;
                                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                htVar2.g = floatValue;
                                                float f19 = htVar2.f;
                                                htVar2.e = com.google.android.recaptcha.internal.a.z(0.0f, f19, floatValue, f19);
                                                htVar2.z.invalidate();
                                                break;
                                            case 1:
                                                ht htVar3 = this.b.a;
                                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                htVar3.g = floatValue2;
                                                float f20 = htVar3.f;
                                                htVar3.e = com.google.android.recaptcha.internal.a.z(0.0f, f20, floatValue2, f20);
                                                htVar3.z.invalidate();
                                                break;
                                            default:
                                                ht htVar4 = this.b.a;
                                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                htVar4.g = floatValue3;
                                                float f21 = htVar4.f;
                                                htVar4.e = com.google.android.recaptcha.internal.a.z(0.0f, f21, floatValue3, f21);
                                                htVar4.z.invalidate();
                                                break;
                                        }
                                    }
                                });
                                ofFloat2.setDuration(350L);
                                ofFloat2.setInterpolator(org.telegram.ui.Components.jr.f);
                                ofFloat2.start();
                            }
                        }
                    }
                    ftVar = htVar.l;
                    if (ftVar != null) {
                        ArrayList arrayList11 = new ArrayList();
                        ArrayList arrayList12 = new ArrayList();
                        ArrayList arrayList13 = new ArrayList();
                        ftVar2 = htVar.l;
                        i13 = htVar.V;
                        if (ftVar2.k(i13)) {
                            ftVar7 = htVar.l;
                            if (!ftVar7.c()) {
                                arrayList11.add(LocaleController.getString(R.string.SendGifPreview));
                                b.k(R.drawable.msg_send, arrayList13, arrayList12, 0);
                            }
                        }
                        ftVar3 = htVar.l;
                        i14 = htVar.V;
                        if (ftVar3.k(i14)) {
                            ftVar6 = htVar.l;
                            if (!ftVar6.c()) {
                                arrayList11.add(LocaleController.getString(R.string.SendWithoutSound));
                                b.k(R.drawable.input_notify_off, arrayList13, arrayList12, 4);
                            }
                        }
                        ftVar4 = htVar.l;
                        if (ftVar4.b()) {
                            arrayList11.add(LocaleController.getString(R.string.Schedule));
                            b.k(R.drawable.msg_autodelete, arrayList13, arrayList12, 3);
                        }
                        document = htVar.W;
                        if (document != null) {
                            ftVar5 = htVar.l;
                            document4 = htVar.W;
                            if (ftVar5.e(document4)) {
                                arrayList11.add(LocaleController.getString(R.string.AddACaption));
                                b.h(R.drawable.outline_caption_24, 11, arrayList13, arrayList12);
                            }
                        }
                        document2 = htVar.W;
                        if (document2 != null) {
                            i15 = htVar.r;
                            MediaDataController mediaDataController3 = MediaDataController.getInstance(i15);
                            document3 = htVar.W;
                            z10 = mediaDataController3.hasRecentGif(document3);
                            if (z10) {
                                arrayList11.add(LocaleController.formatString("Delete", R.string.Delete, new Object[0]));
                                b.k(R.drawable.msg_delete, arrayList13, arrayList12, 1);
                            } else {
                                arrayList11.add(LocaleController.formatString("SaveToGIFs", R.string.SaveToGIFs, new Object[0]));
                                b.k(R.drawable.msg_gif_add, arrayList13, arrayList12, 2);
                            }
                        } else {
                            z10 = false;
                        }
                        if (arrayList11.isEmpty()) {
                            return;
                        }
                        htVar.K = true;
                        d1Var = htVar.z;
                        d1Var.invalidate();
                        int[] iArr2 = new int[arrayList13.size()];
                        for (int i52 = 0; i52 < arrayList13.size(); i52++) {
                            iArr2[i52] = ((Integer) arrayList13.get(i52)).intValue();
                        }
                        org.telegram.ui.Components.fi0 fi0Var = new org.telegram.ui.Components.fi0(16, this, arrayList12);
                        for (int i53 = 0; i53 < arrayList11.size(); i53++) {
                            int intValue3 = ((Integer) arrayList13.get(i53)).intValue();
                            CharSequence charSequence3 = (CharSequence) arrayList11.get(i53);
                            c6Var = htVar.c0;
                            org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, intValue3, charSequence3, false, c6Var);
                            c12.setTag(Integer.valueOf(i53));
                            c12.setOnClickListener(fi0Var);
                            if (z10 && i53 == arrayList11.size() - 1) {
                                c12.c(ht.d(htVar, org.telegram.ui.ActionBar.g6.q7), ht.d(htVar, org.telegram.ui.ActionBar.g6.p7));
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
                        int i54 = bVar.d;
                        bVar2 = htVar.q;
                        int i55 = i54 + bVar2.b;
                        bVar3 = htVar.q;
                        int i56 = bVar3.b;
                        d1Var2 = htVar.z;
                        int width5 = d1Var2.getWidth();
                        d1Var3 = htVar.z;
                        int min5 = Math.min(width5, d1Var3.getHeight() - i55) - AndroidUtilities.dp(40.0f);
                        f9 = htVar.e;
                        int i57 = min5 / 2;
                        int i58 = i56 + i57;
                        int dp6 = htVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                        d1Var4 = htVar.z;
                        float max2 = (int) (f9 + Math.max(i58 + dp6, ((d1Var4.getHeight() - i55) - htVar.I) / 2) + i57);
                        float dp7 = AndroidUtilities.dp(24.0f);
                        f10 = htVar.e;
                        int i59 = (int) ((dp7 - f10) + max2);
                        org.telegram.ui.ActionBar.o1 o1Var3 = htVar.k;
                        d1Var5 = htVar.z;
                        d1Var6 = htVar.z;
                        o1Var3.showAtLocation(d1Var5, 0, (int) ((d1Var6.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i59);
                        try {
                            d1Var7 = htVar.z;
                            d1Var7.performHapticFeedback(0);
                        } catch (Exception unused6) {
                        }
                        f11 = htVar.e;
                        if (f11 != 0.0f) {
                            f12 = htVar.e;
                            htVar.f = f12;
                            final int i60 = 2;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.xs
                                public final /* synthetic */ dt b;

                                {
                                    this.b = this;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (i60) {
                                        case 0:
                                            ht htVar2 = this.b.a;
                                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            htVar2.g = floatValue;
                                            float f19 = htVar2.f;
                                            htVar2.e = com.google.android.recaptcha.internal.a.z(0.0f, f19, floatValue, f19);
                                            htVar2.z.invalidate();
                                            break;
                                        case 1:
                                            ht htVar3 = this.b.a;
                                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            htVar3.g = floatValue2;
                                            float f20 = htVar3.f;
                                            htVar3.e = com.google.android.recaptcha.internal.a.z(0.0f, f20, floatValue2, f20);
                                            htVar3.z.invalidate();
                                            break;
                                        default:
                                            ht htVar4 = this.b.a;
                                            float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            htVar4.g = floatValue3;
                                            float f21 = htVar4.f;
                                            htVar4.e = com.google.android.recaptcha.internal.a.z(0.0f, f21, floatValue3, f21);
                                            htVar4.z.invalidate();
                                            break;
                                    }
                                }
                            });
                            ofFloat3.setDuration(350L);
                            ofFloat3.setInterpolator(org.telegram.ui.Components.jr.f);
                            ofFloat3.start();
                        }
                        i27 = 0;
                        while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i27);
                            if (childAt instanceof org.telegram.ui.ActionBar.g1) {
                                ((org.telegram.ui.ActionBar.g1) childAt).k(i27 == 0, i27 == actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() + (-1));
                            }
                            i27++;
                        }
                    }
                }
            }
            i27 = 0;
            while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
            }
        }
        i10 = 1;
        actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, htVar.z.getContext(), htVar.c0);
        org.telegram.ui.ActionBar.c6 c6Var42 = null;
        ng.d c32 = aVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, true);
        c32.n(pg.a.j(htVar.c0));
        c32.p(AndroidUtilities.dp(12.0f));
        c32.o(AndroidUtilities.dp(8.0f));
        c32.h.e = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c32);
        if (htVar.V != 3) {
        }
        i27 = 0;
        while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
        }
    }
}
