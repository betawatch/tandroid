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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ft implements Runnable {
    public final /* synthetic */ kt a;

    public ft(kt ktVar) {
        this.a = ktVar;
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
        ht htVar;
        ht htVar2;
        int i13;
        ht htVar3;
        int i14;
        ht htVar4;
        TLRPC.Document document;
        TLRPC.Document document2;
        boolean z10;
        ag.y1 y1Var;
        i0.c cVar;
        i0.c cVar2;
        i0.c cVar3;
        ag.y1 y1Var2;
        ag.y1 y1Var3;
        float f10;
        ag.y1 y1Var4;
        float f11;
        ag.y1 y1Var5;
        ag.y1 y1Var6;
        float f12;
        float f13;
        ag.y1 y1Var7;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i15;
        TLRPC.Document document3;
        ht htVar5;
        TLRPC.Document document4;
        ht htVar6;
        ht htVar7;
        ht htVar8;
        ht htVar9;
        int i16;
        ht htVar10;
        TLRPC.Document document5;
        ht htVar11;
        TLRPC.Document document6;
        ht htVar12;
        TLRPC.Document document7;
        int i17;
        TLRPC.Document document8;
        TLRPC.Document document9;
        ag.y1 y1Var8;
        i0.c cVar4;
        i0.c cVar5;
        i0.c cVar6;
        ag.y1 y1Var9;
        ag.y1 y1Var10;
        float f14;
        ag.y1 y1Var11;
        float f15;
        ag.y1 y1Var12;
        ag.y1 y1Var13;
        float f16;
        float f17;
        ag.y1 y1Var14;
        org.telegram.ui.ActionBar.c6 c6Var2;
        TLRPC.Document document10;
        int i18;
        TLRPC.Document document11;
        TLRPC.Document document12;
        int i19;
        TLRPC.Document document13;
        ht htVar13;
        TLRPC.Document document14;
        ht htVar14;
        ag.y1 y1Var15;
        i0.c cVar7;
        i0.c cVar8;
        i0.c cVar9;
        int i20;
        ag.y1 y1Var16;
        ag.y1 y1Var17;
        float min;
        int i21;
        ag.y1 y1Var18;
        ag.y1 y1Var19;
        float f18;
        ag.y1 y1Var20;
        ag.y1 y1Var21;
        ag.y1 y1Var22;
        ag.y1 y1Var23;
        ag.y1 y1Var24;
        ag.y1 y1Var25;
        org.telegram.ui.ActionBar.c6 c6Var3;
        TLRPC.Document document15;
        int i22;
        ht htVar15;
        ht htVar16;
        ht htVar17;
        ht htVar18;
        TLRPC.InputStickerSet inputStickerSet;
        ht htVar19;
        int i23;
        TLRPC.Document document16;
        ht htVar20;
        int i24;
        ht htVar21;
        int i25;
        ht htVar22;
        ht htVar23;
        ht htVar24;
        ht htVar25;
        int i26;
        ag.y1 y1Var26;
        ag.y1 y1Var27;
        int i27;
        ta1 ta1Var;
        int i28;
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        ag.y1 y1Var28;
        org.telegram.ui.Components.b70 L;
        TLRPC.Document unused;
        kt ktVar = this.a;
        jg.a aVar = ktVar.t;
        if (ktVar.w == null || ktVar.m) {
            return;
        }
        ktVar.R = true;
        ht htVar26 = ktVar.l;
        int i29 = 16;
        final int i30 = 0;
        if (htVar26 != null && (L = htVar26.L(ktVar.z)) != null) {
            L.Q(aVar, ng.c.j(ktVar.c0), true);
            L.t = false;
            L.Y();
            L.p = new ti(this, i29);
            ViewGroup viewGroup = L.A;
            at atVar = new at(this, viewGroup);
            ktVar.k = atVar;
            atVar.e = true;
            atVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
            atVar.g = true;
            atVar.setOutsideTouchable(true);
            ktVar.k.setClippingEnabled(true);
            ktVar.k.setAnimationStyle(R.style.PopupContextAnimation);
            ktVar.k.setFocusable(true);
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            ktVar.k.setInputMethodMode(2);
            ktVar.k.getContentView().setFocusableInTouchMode(true);
            i0.c cVar10 = ktVar.q;
            int min2 = (Math.min(ktVar.z.getWidth(), ktVar.z.getHeight() - (cVar10.d + cVar10.b)) - AndroidUtilities.dp(40.0f)) / 2;
            int dp = (int) ((AndroidUtilities.dp(24.0f) - ktVar.e) + ((int) (ktVar.e + Math.max(r2 + min2 + (ktVar.G != null ? AndroidUtilities.dp(40.0f) : 0), ((ktVar.z.getHeight() - r3) - ktVar.I) / 2) + min2)));
            ktVar.k.showAtLocation(ktVar.z, 0, (int) ((r4.getMeasuredWidth() - viewGroup.getMeasuredWidth()) / 2.0f), dp);
            try {
                ktVar.z.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            float f19 = ktVar.e;
            if (f19 != 0.0f) {
                ktVar.f = f19;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.zs
                    public final /* synthetic */ ft b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i30) {
                            case 0:
                                kt ktVar2 = this.b.a;
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ktVar2.g = floatValue;
                                float f20 = ktVar2.f;
                                ktVar2.e = com.google.android.recaptcha.internal.a.z(0.0f, f20, floatValue, f20);
                                ktVar2.z.invalidate();
                                break;
                            case 1:
                                kt ktVar3 = this.b.a;
                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ktVar3.g = floatValue2;
                                float f21 = ktVar3.f;
                                ktVar3.e = com.google.android.recaptcha.internal.a.z(0.0f, f21, floatValue2, f21);
                                ktVar3.z.invalidate();
                                break;
                            default:
                                kt ktVar4 = this.b.a;
                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ktVar4.g = floatValue3;
                                float f22 = ktVar4.f;
                                ktVar4.e = com.google.android.recaptcha.internal.a.z(0.0f, f22, floatValue3, f22);
                                ktVar4.z.invalidate();
                                break;
                        }
                    }
                });
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(org.telegram.ui.Components.er.f);
                ofFloat.start();
            }
            ktVar.K = true;
            return;
        }
        if (ktVar.V != 3) {
            ht htVar27 = ktVar.l;
            if (htVar27 != null) {
                TLRPC.TL_messageMediaPoll d = htVar27.d();
                TLRPC.PollAnswer g10 = ktVar.l.g();
                if (d != null && d.poll != null && g10 != null) {
                    TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(d, g10.option);
                    if (pollResult != null && pollResult.voters > 0) {
                        MessageObject.canShowVotersList(d);
                    }
                }
            }
            i10 = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, ktVar.z.getContext(), ktVar.c0);
            org.telegram.ui.ActionBar.c6 c6Var4 = null;
            lg.d c10 = aVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, true);
            c10.n(ng.c.j(ktVar.c0));
            c10.p(AndroidUtilities.dp(12.0f));
            c10.o(AndroidUtilities.dp(8.0f));
            c10.h.e = true;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
            if (ktVar.V != 3) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (ktVar.T == null) {
                    ht htVar28 = ktVar.l;
                    if (htVar28 == null || !htVar28.z()) {
                        if (ktVar.l.w()) {
                            arrayList.add(LocaleController.getString(R.string.SendStickerPreview));
                            org.telegram.ui.Cells.pa.p(R.drawable.msg_send, arrayList3, arrayList2, 0);
                        }
                        arrayList.add(LocaleController.getString(R.string.AddToFavorites));
                        org.telegram.ui.Cells.pa.p(R.drawable.msg_fave, arrayList3, arrayList2, 1);
                    } else {
                        arrayList.add(LocaleController.getString(R.string.SetIntroSticker));
                        org.telegram.ui.Cells.pa.p(R.drawable.menu_sticker_add, arrayList3, arrayList2, 0);
                    }
                }
                ht htVar29 = ktVar.l;
                if (htVar29 == null || !htVar29.z()) {
                    ht htVar30 = ktVar.l;
                    arrayList.add(LocaleController.getString((htVar30 == null || !htVar30.I()) ? R.string.AddToStickerPack : R.string.StickersReplaceSticker));
                    ht htVar31 = ktVar.l;
                    org.telegram.ui.Cells.pa.p((htVar31 == null || !htVar31.I()) ? R.drawable.menu_sticker_add : R.drawable.msg_replace, arrayList3, arrayList2, 2);
                }
                int i31 = 6;
                int i32 = 7;
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, ktVar.w, ktVar.c0, true, false);
                f1Var.setItemHeight(44);
                f1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                f1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                FrameLayout frameLayout = new FrameLayout(ktVar.z.getContext());
                LinearLayout linearLayout = new LinearLayout(ktVar.z.getContext());
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, ktVar.c0));
                linearLayout.setOrientation(1);
                if (ktVar.w == null) {
                    ta1Var = null;
                    i28 = 5;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new TLRPC.TL_stickerSetNoCovered());
                    TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = new TLRPC.TL_messages_getMyStickers();
                    tL_messages_getMyStickers.limit = 100;
                    ConnectionsManager.getInstance(ktVar.r).sendRequest(tL_messages_getMyStickers, new z9(ktVar, arrayList4, tL_messages_getMyStickers, i32));
                    ta1Var = new ta1(ktVar.w, i31, c6Var4);
                    ta1Var.setLayoutManager(new f2.k0());
                    i28 = 5;
                    ta1Var.i(new cg.h2(arrayList4, i28));
                    ta1Var.setAdapter(new gt(ktVar, arrayList4));
                }
                ta1Var.setOnItemClickListener(new i(this, i28));
                frameLayout.addView(f1Var);
                linearLayout.addView(frameLayout);
                linearLayout.addView(new org.telegram.ui.ActionBar.k1(ktVar.z.getContext(), ktVar.c0), h7.z5.n(-1, 8));
                ta1 ta1Var2 = ta1Var;
                jh.b0 b0Var = new jh.b0(this, arrayList2, ta1Var2, linearLayout, actionBarPopupWindow$ActionBarPopupWindowLayout, 12);
                for (int i33 = 0; i33 < arrayList.size(); i33++) {
                    org.telegram.ui.ActionBar.f1 c11 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, ((Integer) arrayList3.get(i33)).intValue(), (CharSequence) arrayList.get(i33), false, ktVar.c0);
                    c11.setTag(Integer.valueOf(i33));
                    c11.setOnClickListener(b0Var);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout;
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                linearLayout.addView(ta1Var2, new LinearLayout.LayoutParams(actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() - AndroidUtilities.dp(16.0f), (int) (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() * 1.5f)));
                actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                frameLayout.setOnClickListener(new jf(actionBarPopupWindow$ActionBarPopupWindowLayout, 2));
                i0.c cVar11 = ktVar.q;
                int i34 = cVar11.d + cVar11.b;
                int min3 = ((int) (Math.min(ktVar.z.getWidth(), ktVar.z.getHeight() - i34) / 1.8f)) / 2;
                ktVar.z.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, h7.z5.d(-2, -2.0f, 49, 0.0f, (AndroidUtilities.dp(84.0f) + ((int) ((ktVar.e + Math.max(r0 + min3, ((ktVar.z.getHeight() - i34) - ktVar.I) / 2)) + min3))) / AndroidUtilities.density, 0.0f, 0.0f));
                ktVar.L = actionBarPopupWindow$ActionBarPopupWindowLayout;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(-AndroidUtilities.dp(12.0f));
                ktVar.L.setAlpha(0.0f);
                view = ktVar.L;
                view.setScaleX(0.8f);
                view2 = ktVar.L;
                view2.setScaleY(0.8f);
                view3 = ktVar.L;
                view3.setPivotY(0.0f);
                view4 = ktVar.L;
                view5 = ktVar.L;
                view4.setPivotX(view5.getMeasuredWidth() / 2.0f);
                view6 = ktVar.L;
                view6.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.er.h).start();
                if (ktVar.P == null) {
                    org.telegram.ui.Components.nb nbVar = new org.telegram.ui.Components.nb(ktVar, ktVar.z.getContext(), UserConfig.selectedAccount, ktVar.c0);
                    ktVar.P = nbVar;
                    nbVar.J0 = true;
                    nbVar.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                    ktVar.P.setClipChildren(false);
                    ktVar.P.setClipToPadding(false);
                    ktVar.P.setVisibility(0);
                    ktVar.P.setHint(LocaleController.getString(R.string.StickersSetEmojiForSticker));
                    ktVar.P.setBubbleOffset(-AndroidUtilities.dp(105.0f));
                    ktVar.P.setMiniBubblesOffset(-AndroidUtilities.dp(14.0f));
                    FrameLayout frameLayout2 = new FrameLayout(ktVar.z.getContext());
                    ktVar.Q = frameLayout2;
                    frameLayout2.addView(ktVar.P, h7.z5.d(-2, 116.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                    ktVar.z.addView(ktVar.Q, h7.z5.d(-2, -2.0f, 1, 0.0f, 100.0f, 0.0f, 0.0f));
                }
                ktVar.P.setSelectedEmojis(ktVar.o);
                ktVar.P.setDelegate(new ws(ktVar));
                ktVar.P.p(null, null, false);
                ktVar.Q.setScaleY(0.6f);
                ktVar.Q.setScaleX(0.6f);
                ktVar.Q.setAlpha(0.0f);
                AndroidUtilities.runOnUIThread(new vs(ktVar, 2), 10L);
                ktVar.K = true;
                y1Var28 = ktVar.z;
                y1Var28.invalidate();
            } else {
                int i35 = 1;
                int i36 = 0;
                i11 = ktVar.V;
                if (i11 == 0) {
                    document12 = ktVar.W;
                    if (MessageObject.isPremiumSticker(document12)) {
                        i26 = ktVar.r;
                        if (!AccountInstance.getInstance(i26).getUserConfig().isPremium()) {
                            if (ktVar.O == null) {
                                ag1 ag1Var = new ag1(ktVar.z.getContext(), ktVar.c0);
                                ktVar.O = ag1Var;
                                ktVar.z.addView(ag1Var, h7.z5.c(-1.0f, -1));
                                ktVar.O.setOnClickListener(new ys(ktVar, i36));
                                ktVar.O.a.r.setOnClickListener(new ys(ktVar, i35));
                            }
                            AndroidUtilities.updateViewVisibilityAnimated(ktVar.O, false, 1.0f, false);
                            AndroidUtilities.updateViewVisibilityAnimated(ktVar.O, true);
                            ktVar.O.setTranslationY(0.0f);
                            ktVar.K = true;
                            y1Var26 = ktVar.z;
                            y1Var26.invalidate();
                            try {
                                y1Var27 = ktVar.z;
                                y1Var27.performHapticFeedback(0);
                                return;
                            } catch (Exception unused3) {
                                return;
                            }
                        }
                    }
                    i19 = ktVar.r;
                    MediaDataController mediaDataController = MediaDataController.getInstance(i19);
                    document13 = ktVar.W;
                    boolean isStickerInFavorites = mediaDataController.isStickerInFavorites(document13);
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    htVar13 = ktVar.l;
                    if (htVar13 != null) {
                        htVar20 = ktVar.l;
                        i24 = ktVar.V;
                        if (htVar20.k(i24)) {
                            htVar25 = ktVar.l;
                            if (!htVar25.c()) {
                                arrayList5.add(LocaleController.getString(R.string.SendStickerPreview));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_send, arrayList7, arrayList6, 0);
                            }
                        }
                        htVar21 = ktVar.l;
                        i25 = ktVar.V;
                        if (htVar21.k(i25)) {
                            htVar24 = ktVar.l;
                            if (!htVar24.c()) {
                                arrayList5.add(LocaleController.getString(R.string.SendWithoutSound));
                                org.telegram.ui.Cells.pa.n(R.drawable.input_notify_off, 6, arrayList7, arrayList6);
                            }
                        }
                        htVar22 = ktVar.l;
                        if (htVar22.b()) {
                            arrayList5.add(LocaleController.getString(R.string.Schedule));
                            org.telegram.ui.Cells.pa.p(R.drawable.msg_autodelete, arrayList7, arrayList6, 3);
                        }
                        htVar23 = ktVar.l;
                        if (htVar23.f()) {
                            arrayList5.add(LocaleController.getString(R.string.ImportStickersRemoveMenu));
                            org.telegram.ui.Cells.pa.p(R.drawable.msg_delete, arrayList7, arrayList6, 5);
                        }
                    }
                    document14 = ktVar.W;
                    if (!MessageObject.isMaskDocument(document14)) {
                        if (!isStickerInFavorites) {
                            i23 = ktVar.r;
                            if (MediaDataController.getInstance(i23).canAddStickerToFavorites()) {
                                document16 = ktVar.W;
                            }
                        }
                        arrayList5.add(LocaleController.getString(isStickerInFavorites ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                        org.telegram.ui.Cells.pa.p(isStickerInFavorites ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList7, arrayList6, 2);
                    }
                    htVar14 = ktVar.l;
                    if (htVar14 != null && (inputStickerSet = ktVar.a0) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                        htVar19 = ktVar.l;
                        if (htVar19.Q()) {
                            arrayList5.add(LocaleController.formatString(R.string.ViewPackPreview, new Object[0]));
                            org.telegram.ui.Cells.pa.p(R.drawable.msg_media, arrayList7, arrayList6, 1);
                        }
                    }
                    if (ktVar.p) {
                        arrayList5.add(LocaleController.getString(R.string.DeleteFromRecent));
                        org.telegram.ui.Cells.pa.p(R.drawable.msg_delete, arrayList7, arrayList6, 4);
                    }
                    if (ktVar.a0 != null) {
                        document15 = ktVar.W;
                        if (document15 != null) {
                            i22 = ktVar.r;
                            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i22).getStickerSet(ktVar.a0, true);
                            if (stickerSet != null) {
                                htVar17 = ktVar.l;
                                if (htVar17 != null) {
                                    htVar18 = ktVar.l;
                                    if (htVar18.B()) {
                                        TLRPC.StickerSet stickerSet2 = stickerSet.set;
                                        if (!stickerSet2.emojis && !stickerSet2.masks) {
                                            arrayList5.add(LocaleController.getString(R.string.EditSticker));
                                            org.telegram.ui.Cells.pa.n(R.drawable.msg_edit, 7, arrayList7, arrayList6);
                                        }
                                    }
                                }
                            }
                            if (stickerSet != null && stickerSet.set.creator) {
                                htVar15 = ktVar.l;
                                if (htVar15 != null) {
                                    htVar16 = ktVar.l;
                                    unused = ktVar.W;
                                    if (htVar16.H()) {
                                        arrayList5.add(LocaleController.getString(R.string.DeleteSticker));
                                        org.telegram.ui.Cells.pa.n(R.drawable.msg_delete, 8, arrayList7, arrayList6);
                                    }
                                }
                            }
                        }
                    }
                    if (arrayList5.isEmpty()) {
                        return;
                    }
                    ktVar.K = true;
                    y1Var15 = ktVar.z;
                    y1Var15.invalidate();
                    bt btVar = new bt(this, arrayList6, isStickerInFavorites);
                    kt.h(ktVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                    for (int i37 = 0; i37 < arrayList5.size(); i37++) {
                        int intValue = ((Integer) arrayList7.get(i37)).intValue();
                        CharSequence charSequence = (CharSequence) arrayList5.get(i37);
                        c6Var3 = ktVar.c0;
                        org.telegram.ui.ActionBar.f1 c12 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, intValue, charSequence, false, c6Var3);
                        c12.setTag(Integer.valueOf(i37));
                        c12.setOnClickListener(btVar);
                        if (((Integer) arrayList6.get(i37)).intValue() == 8) {
                            int d10 = kt.d(ktVar, org.telegram.ui.ActionBar.g6.q7);
                            c12.c(d10, d10);
                            c12.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.1f, d10));
                        }
                    }
                    ct ctVar = new ct(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                    ktVar.k = ctVar;
                    ctVar.e = true;
                    ctVar.c = 100;
                    ctVar.g = true;
                    ctVar.setOutsideTouchable(true);
                    ktVar.k.setClippingEnabled(true);
                    ktVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                    ktVar.k.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                    ktVar.k.setInputMethodMode(2);
                    ktVar.k.getContentView().setFocusableInTouchMode(true);
                    cVar7 = ktVar.q;
                    int i38 = cVar7.d;
                    cVar8 = ktVar.q;
                    int i39 = i38 + cVar8.b;
                    cVar9 = ktVar.q;
                    int i40 = cVar9.b;
                    i20 = ktVar.V;
                    if (i20 == 1) {
                        y1Var24 = ktVar.z;
                        int width = y1Var24.getWidth();
                        y1Var25 = ktVar.z;
                        i21 = Math.min(width, y1Var25.getHeight() - i39) - AndroidUtilities.dp(40.0f);
                    } else {
                        if (ktVar.S) {
                            y1Var18 = ktVar.z;
                            int width2 = y1Var18.getWidth();
                            y1Var19 = ktVar.z;
                            min = Math.min(width2, y1Var19.getHeight() - i39) - AndroidUtilities.dpf2(40.0f);
                        } else {
                            y1Var16 = ktVar.z;
                            int width3 = y1Var16.getWidth();
                            y1Var17 = ktVar.z;
                            min = Math.min(width3, y1Var17.getHeight() - i39) / 1.8f;
                        }
                        i21 = (int) min;
                    }
                    f18 = ktVar.e;
                    int i41 = i21 / 2;
                    int i42 = i40 + i41;
                    int dp2 = ktVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                    y1Var20 = ktVar.z;
                    int dp3 = AndroidUtilities.dp(24.0f) + ((int) (f18 + Math.max(i42 + dp2, ((y1Var20.getHeight() - i39) - ktVar.I) / 2) + i41));
                    if (ktVar.S) {
                        dp3 += AndroidUtilities.dp(24.0f);
                    }
                    org.telegram.ui.ActionBar.n1 n1Var = ktVar.k;
                    y1Var21 = ktVar.z;
                    y1Var22 = ktVar.z;
                    n1Var.showAtLocation(y1Var21, 0, (int) ((y1Var22.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), dp3);
                    try {
                        y1Var23 = ktVar.z;
                        y1Var23.performHapticFeedback(0);
                    } catch (Exception unused4) {
                    }
                } else {
                    i12 = ktVar.V;
                    if (i12 == 2) {
                        htVar8 = ktVar.l;
                        if (htVar8 != null) {
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = new ArrayList();
                            htVar9 = ktVar.l;
                            i16 = ktVar.V;
                            if (htVar9.k(i16)) {
                                arrayList8.add(LocaleController.getString(R.string.SendEmojiPreview));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_send, arrayList10, arrayList9, 0);
                            }
                            htVar10 = ktVar.l;
                            document5 = ktVar.W;
                            Boolean P = htVar10.P(document5);
                            if (P != null) {
                                if (P.booleanValue()) {
                                    arrayList8.add(LocaleController.getString(R.string.SetAsEmojiStatus));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_smile_status, arrayList10, arrayList9, 1);
                                } else {
                                    arrayList8.add(LocaleController.getString(R.string.RemoveStatus));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_smile_status, arrayList10, arrayList9, 2);
                                }
                            }
                            htVar11 = ktVar.l;
                            document6 = ktVar.W;
                            if (htVar11.C(document6)) {
                                arrayList8.add(LocaleController.getString(R.string.CopyEmojiPreview));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_copy, arrayList10, arrayList9, 3);
                            }
                            htVar12 = ktVar.l;
                            document7 = ktVar.W;
                            if (htVar12.N(document7)) {
                                arrayList8.add(LocaleController.getString(R.string.RemoveFromRecent));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_delete, arrayList10, arrayList9, 4);
                            }
                            i17 = ktVar.r;
                            MediaDataController mediaDataController2 = MediaDataController.getInstance(i17);
                            document8 = ktVar.W;
                            boolean isStickerInFavorites2 = mediaDataController2.isStickerInFavorites(document8);
                            document9 = ktVar.W;
                            if (!MessageObject.isAnimatedEmoji(document9)) {
                                document10 = ktVar.W;
                                if (!MessageObject.isMaskDocument(document10)) {
                                    if (!isStickerInFavorites2) {
                                        i18 = ktVar.r;
                                        if (MediaDataController.getInstance(i18).canAddStickerToFavorites()) {
                                            document11 = ktVar.W;
                                        }
                                    }
                                    arrayList8.add(LocaleController.getString(isStickerInFavorites2 ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                                    org.telegram.ui.Cells.pa.p(isStickerInFavorites2 ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList10, arrayList9, 5);
                                }
                            }
                            if (arrayList8.isEmpty()) {
                                return;
                            }
                            ktVar.K = true;
                            y1Var8 = ktVar.z;
                            y1Var8.invalidate();
                            int[] iArr = new int[arrayList10.size()];
                            for (int i43 = 0; i43 < arrayList10.size(); i43++) {
                                iArr[i43] = ((Integer) arrayList10.get(i43)).intValue();
                            }
                            org.telegram.ui.Components.ib0 ib0Var = new org.telegram.ui.Components.ib0(this, arrayList9, isStickerInFavorites2);
                            boolean h = kt.h(ktVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            int i44 = 0;
                            while (i44 < arrayList8.size()) {
                                boolean z11 = !h && i44 == 0;
                                boolean z12 = i44 == arrayList8.size() + (-1);
                                int intValue2 = ((Integer) arrayList10.get(i44)).intValue();
                                CharSequence charSequence2 = (CharSequence) arrayList8.get(i44);
                                c6Var2 = ktVar.c0;
                                org.telegram.ui.ActionBar.f1 c13 = org.telegram.ui.ActionBar.v0.c(z11, z12, actionBarPopupWindow$ActionBarPopupWindowLayout, intValue2, charSequence2, false, c6Var2);
                                if (((Integer) arrayList9.get(i44)).intValue() == 4) {
                                    c13.setIconColor(kt.d(ktVar, org.telegram.ui.ActionBar.g6.p7));
                                    c13.setTextColor(kt.d(ktVar, org.telegram.ui.ActionBar.g6.q7));
                                }
                                c13.setTag(Integer.valueOf(i44));
                                c13.setOnClickListener(ib0Var);
                                i44++;
                            }
                            dt dtVar = new dt(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            ktVar.k = dtVar;
                            dtVar.e = true;
                            dtVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
                            dtVar.g = true;
                            dtVar.setOutsideTouchable(true);
                            ktVar.k.setClippingEnabled(true);
                            ktVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                            ktVar.k.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            ktVar.k.setInputMethodMode(2);
                            ktVar.k.getContentView().setFocusableInTouchMode(true);
                            cVar4 = ktVar.q;
                            int i45 = cVar4.d;
                            cVar5 = ktVar.q;
                            int i46 = i45 + cVar5.b;
                            cVar6 = ktVar.q;
                            int i47 = cVar6.b;
                            y1Var9 = ktVar.z;
                            int width4 = y1Var9.getWidth();
                            y1Var10 = ktVar.z;
                            int min4 = Math.min(width4, y1Var10.getHeight() - i46) - AndroidUtilities.dp(40.0f);
                            f14 = ktVar.e;
                            int i48 = min4 / 2;
                            int i49 = i47 + i48;
                            int dp4 = ktVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                            y1Var11 = ktVar.z;
                            float max = (int) (f14 + Math.max(i49 + dp4, ((y1Var11.getHeight() - i46) - ktVar.I) / 2) + i48);
                            float dp5 = AndroidUtilities.dp(24.0f);
                            f15 = ktVar.e;
                            int i50 = (int) ((dp5 - f15) + max);
                            org.telegram.ui.ActionBar.n1 n1Var2 = ktVar.k;
                            y1Var12 = ktVar.z;
                            y1Var13 = ktVar.z;
                            n1Var2.showAtLocation(y1Var12, 0, (int) ((y1Var13.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i50);
                            org.telegram.ui.ActionBar.n1.i(actionBarPopupWindow$ActionBarPopupWindowLayout);
                            try {
                                y1Var14 = ktVar.z;
                                y1Var14.performHapticFeedback(0);
                            } catch (Exception unused5) {
                            }
                            f16 = ktVar.e;
                            if (f16 != 0.0f) {
                                f17 = ktVar.e;
                                ktVar.f = f17;
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                final int i51 = 1;
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.zs
                                    public final /* synthetic */ ft b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        switch (i51) {
                                            case 0:
                                                kt ktVar2 = this.b.a;
                                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                ktVar2.g = floatValue;
                                                float f20 = ktVar2.f;
                                                ktVar2.e = com.google.android.recaptcha.internal.a.z(0.0f, f20, floatValue, f20);
                                                ktVar2.z.invalidate();
                                                break;
                                            case 1:
                                                kt ktVar3 = this.b.a;
                                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                ktVar3.g = floatValue2;
                                                float f21 = ktVar3.f;
                                                ktVar3.e = com.google.android.recaptcha.internal.a.z(0.0f, f21, floatValue2, f21);
                                                ktVar3.z.invalidate();
                                                break;
                                            default:
                                                kt ktVar4 = this.b.a;
                                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                ktVar4.g = floatValue3;
                                                float f22 = ktVar4.f;
                                                ktVar4.e = com.google.android.recaptcha.internal.a.z(0.0f, f22, floatValue3, f22);
                                                ktVar4.z.invalidate();
                                                break;
                                        }
                                    }
                                });
                                ofFloat2.setDuration(350L);
                                ofFloat2.setInterpolator(org.telegram.ui.Components.er.f);
                                ofFloat2.start();
                            }
                        }
                    }
                    htVar = ktVar.l;
                    if (htVar != null) {
                        ArrayList arrayList11 = new ArrayList();
                        ArrayList arrayList12 = new ArrayList();
                        ArrayList arrayList13 = new ArrayList();
                        htVar2 = ktVar.l;
                        i13 = ktVar.V;
                        if (htVar2.k(i13)) {
                            htVar7 = ktVar.l;
                            if (!htVar7.c()) {
                                arrayList11.add(LocaleController.getString(R.string.SendGifPreview));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_send, arrayList13, arrayList12, 0);
                            }
                        }
                        htVar3 = ktVar.l;
                        i14 = ktVar.V;
                        if (htVar3.k(i14)) {
                            htVar6 = ktVar.l;
                            if (!htVar6.c()) {
                                arrayList11.add(LocaleController.getString(R.string.SendWithoutSound));
                                org.telegram.ui.Cells.pa.p(R.drawable.input_notify_off, arrayList13, arrayList12, 4);
                            }
                        }
                        htVar4 = ktVar.l;
                        if (htVar4.b()) {
                            arrayList11.add(LocaleController.getString(R.string.Schedule));
                            org.telegram.ui.Cells.pa.p(R.drawable.msg_autodelete, arrayList13, arrayList12, 3);
                        }
                        document = ktVar.W;
                        if (document != null) {
                            htVar5 = ktVar.l;
                            document4 = ktVar.W;
                            if (htVar5.e(document4)) {
                                arrayList11.add(LocaleController.getString(R.string.AddACaption));
                                org.telegram.ui.Cells.pa.n(R.drawable.outline_caption_24, 11, arrayList13, arrayList12);
                            }
                        }
                        document2 = ktVar.W;
                        if (document2 != null) {
                            i15 = ktVar.r;
                            MediaDataController mediaDataController3 = MediaDataController.getInstance(i15);
                            document3 = ktVar.W;
                            z10 = mediaDataController3.hasRecentGif(document3);
                            if (z10) {
                                arrayList11.add(LocaleController.formatString("Delete", R.string.Delete, new Object[0]));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_delete, arrayList13, arrayList12, 1);
                            } else {
                                arrayList11.add(LocaleController.formatString("SaveToGIFs", R.string.SaveToGIFs, new Object[0]));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_gif_add, arrayList13, arrayList12, 2);
                            }
                        } else {
                            z10 = false;
                        }
                        if (arrayList11.isEmpty()) {
                            return;
                        }
                        ktVar.K = true;
                        y1Var = ktVar.z;
                        y1Var.invalidate();
                        int[] iArr2 = new int[arrayList13.size()];
                        for (int i52 = 0; i52 < arrayList13.size(); i52++) {
                            iArr2[i52] = ((Integer) arrayList13.get(i52)).intValue();
                        }
                        org.telegram.ui.Components.xh0 xh0Var = new org.telegram.ui.Components.xh0(16, this, arrayList12);
                        for (int i53 = 0; i53 < arrayList11.size(); i53++) {
                            int intValue3 = ((Integer) arrayList13.get(i53)).intValue();
                            CharSequence charSequence3 = (CharSequence) arrayList11.get(i53);
                            c6Var = ktVar.c0;
                            org.telegram.ui.ActionBar.f1 c14 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, intValue3, charSequence3, false, c6Var);
                            c14.setTag(Integer.valueOf(i53));
                            c14.setOnClickListener(xh0Var);
                            if (z10 && i53 == arrayList11.size() - 1) {
                                c14.c(kt.d(ktVar, org.telegram.ui.ActionBar.g6.q7), kt.d(ktVar, org.telegram.ui.ActionBar.g6.p7));
                            }
                        }
                        et etVar = new et(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                        ktVar.k = etVar;
                        etVar.e = true;
                        etVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
                        etVar.g = true;
                        etVar.setOutsideTouchable(true);
                        ktVar.k.setClippingEnabled(true);
                        ktVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                        ktVar.k.setFocusable(true);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                        ktVar.k.setInputMethodMode(2);
                        ktVar.k.getContentView().setFocusableInTouchMode(true);
                        cVar = ktVar.q;
                        int i54 = cVar.d;
                        cVar2 = ktVar.q;
                        int i55 = i54 + cVar2.b;
                        cVar3 = ktVar.q;
                        int i56 = cVar3.b;
                        y1Var2 = ktVar.z;
                        int width5 = y1Var2.getWidth();
                        y1Var3 = ktVar.z;
                        int min5 = Math.min(width5, y1Var3.getHeight() - i55) - AndroidUtilities.dp(40.0f);
                        f10 = ktVar.e;
                        int i57 = min5 / 2;
                        int i58 = i56 + i57;
                        int dp6 = ktVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                        y1Var4 = ktVar.z;
                        float max2 = (int) (f10 + Math.max(i58 + dp6, ((y1Var4.getHeight() - i55) - ktVar.I) / 2) + i57);
                        float dp7 = AndroidUtilities.dp(24.0f);
                        f11 = ktVar.e;
                        int i59 = (int) ((dp7 - f11) + max2);
                        org.telegram.ui.ActionBar.n1 n1Var3 = ktVar.k;
                        y1Var5 = ktVar.z;
                        y1Var6 = ktVar.z;
                        n1Var3.showAtLocation(y1Var5, 0, (int) ((y1Var6.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i59);
                        try {
                            y1Var7 = ktVar.z;
                            y1Var7.performHapticFeedback(0);
                        } catch (Exception unused6) {
                        }
                        f12 = ktVar.e;
                        if (f12 != 0.0f) {
                            f13 = ktVar.e;
                            ktVar.f = f13;
                            final int i60 = 2;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.zs
                                public final /* synthetic */ ft b;

                                {
                                    this.b = this;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (i60) {
                                        case 0:
                                            kt ktVar2 = this.b.a;
                                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            ktVar2.g = floatValue;
                                            float f20 = ktVar2.f;
                                            ktVar2.e = com.google.android.recaptcha.internal.a.z(0.0f, f20, floatValue, f20);
                                            ktVar2.z.invalidate();
                                            break;
                                        case 1:
                                            kt ktVar3 = this.b.a;
                                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            ktVar3.g = floatValue2;
                                            float f21 = ktVar3.f;
                                            ktVar3.e = com.google.android.recaptcha.internal.a.z(0.0f, f21, floatValue2, f21);
                                            ktVar3.z.invalidate();
                                            break;
                                        default:
                                            kt ktVar4 = this.b.a;
                                            float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            ktVar4.g = floatValue3;
                                            float f22 = ktVar4.f;
                                            ktVar4.e = com.google.android.recaptcha.internal.a.z(0.0f, f22, floatValue3, f22);
                                            ktVar4.z.invalidate();
                                            break;
                                    }
                                }
                            });
                            ofFloat3.setDuration(350L);
                            ofFloat3.setInterpolator(org.telegram.ui.Components.er.f);
                            ofFloat3.start();
                        }
                        i27 = 0;
                        while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i27);
                            if (childAt instanceof org.telegram.ui.ActionBar.f1) {
                                ((org.telegram.ui.ActionBar.f1) childAt).k(i27 == 0, i27 == actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() + (-1));
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
        actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, ktVar.z.getContext(), ktVar.c0);
        org.telegram.ui.ActionBar.c6 c6Var42 = null;
        lg.d c102 = aVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, true);
        c102.n(ng.c.j(ktVar.c0));
        c102.p(AndroidUtilities.dp(12.0f));
        c102.o(AndroidUtilities.dp(8.0f));
        c102.h.e = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c102);
        if (ktVar.V != 3) {
        }
        i27 = 0;
        while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
        }
    }
}
