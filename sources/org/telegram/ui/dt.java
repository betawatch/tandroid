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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class dt implements Runnable {
    public final /* synthetic */ ht a;

    public dt(ht htVar) {
        this.a = htVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x0660, code lost:
    
        if (org.telegram.messenger.MessageObject.isStickerHasSet(r2) != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x098c, code lost:
    
        if (org.telegram.messenger.MessageObject.isStickerHasSet(r8) != false) goto L233;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0dc0  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i9;
        int i10;
        int i11;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        ft ftVar;
        ft ftVar2;
        int i12;
        ft ftVar3;
        int i13;
        ft ftVar4;
        TLRPC.Document document;
        TLRPC.Document document2;
        boolean z10;
        fh.v vVar;
        i0.b bVar;
        i0.b bVar2;
        i0.b bVar3;
        fh.v vVar2;
        fh.v vVar3;
        float f10;
        fh.v vVar4;
        float f11;
        fh.v vVar5;
        fh.v vVar6;
        float f12;
        float f13;
        fh.v vVar7;
        org.telegram.ui.ActionBar.b6 b6Var;
        int i14;
        TLRPC.Document document3;
        ft ftVar5;
        TLRPC.Document document4;
        ft ftVar6;
        ft ftVar7;
        ft ftVar8;
        ft ftVar9;
        int i15;
        ft ftVar10;
        TLRPC.Document document5;
        ft ftVar11;
        TLRPC.Document document6;
        ft ftVar12;
        TLRPC.Document document7;
        int i16;
        TLRPC.Document document8;
        TLRPC.Document document9;
        fh.v vVar8;
        i0.b bVar4;
        i0.b bVar5;
        i0.b bVar6;
        fh.v vVar9;
        fh.v vVar10;
        float f14;
        fh.v vVar11;
        float f15;
        fh.v vVar12;
        fh.v vVar13;
        float f16;
        float f17;
        fh.v vVar14;
        org.telegram.ui.ActionBar.b6 b6Var2;
        TLRPC.Document document10;
        int i17;
        TLRPC.Document document11;
        TLRPC.Document document12;
        int i18;
        TLRPC.Document document13;
        ft ftVar13;
        TLRPC.Document document14;
        ft ftVar14;
        fh.v vVar15;
        i0.b bVar7;
        i0.b bVar8;
        i0.b bVar9;
        int i19;
        fh.v vVar16;
        fh.v vVar17;
        float min;
        int i20;
        fh.v vVar18;
        fh.v vVar19;
        float f18;
        fh.v vVar20;
        fh.v vVar21;
        fh.v vVar22;
        fh.v vVar23;
        fh.v vVar24;
        fh.v vVar25;
        org.telegram.ui.ActionBar.b6 b6Var3;
        TLRPC.Document document15;
        int i21;
        ft ftVar15;
        ft ftVar16;
        ft ftVar17;
        ft ftVar18;
        TLRPC.InputStickerSet inputStickerSet;
        ft ftVar19;
        int i22;
        TLRPC.Document document16;
        ft ftVar20;
        int i23;
        ft ftVar21;
        int i24;
        ft ftVar22;
        ft ftVar23;
        ft ftVar24;
        ft ftVar25;
        int i25;
        fh.v vVar26;
        fh.v vVar27;
        int i26;
        va1 va1Var;
        int i27;
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        fh.v vVar28;
        org.telegram.ui.Components.x60 r10;
        TLRPC.Document unused;
        ht htVar = this.a;
        ig.a aVar = htVar.t;
        if (htVar.w == null || htVar.m) {
            return;
        }
        htVar.R = true;
        ft ftVar26 = htVar.l;
        final int i28 = 0;
        if (ftVar26 != null && (r10 = ftVar26.r(htVar.z)) != null) {
            r10.Q(aVar, mg.c.j(htVar.c0), true);
            r10.t = false;
            r10.Y();
            r10.p = new ri(this, 16);
            ViewGroup viewGroup = r10.A;
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
            int dp = (int) ((AndroidUtilities.dp(24.0f) - htVar.e) + ((int) (htVar.e + Math.max(r0 + min2 + (htVar.G != null ? AndroidUtilities.dp(40.0f) : 0), ((htVar.z.getHeight() - r3) - htVar.I) / 2) + min2)));
            htVar.k.showAtLocation(htVar.z, 0, (int) ((r4.getMeasuredWidth() - viewGroup.getMeasuredWidth()) / 2.0f), dp);
            try {
                htVar.z.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            float f19 = htVar.e;
            if (f19 != 0.0f) {
                htVar.f = f19;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.xs
                    public final /* synthetic */ dt b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i28) {
                            case 0:
                                ht htVar2 = this.b.a;
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                htVar2.g = floatValue;
                                float f20 = htVar2.f;
                                htVar2.e = e2.c.z(0.0f, f20, floatValue, f20);
                                htVar2.z.invalidate();
                                break;
                            case 1:
                                ht htVar3 = this.b.a;
                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                htVar3.g = floatValue2;
                                float f21 = htVar3.f;
                                htVar3.e = e2.c.z(0.0f, f21, floatValue2, f21);
                                htVar3.z.invalidate();
                                break;
                            default:
                                ht htVar4 = this.b.a;
                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                htVar4.g = floatValue3;
                                float f22 = htVar4.f;
                                htVar4.e = e2.c.z(0.0f, f22, floatValue3, f22);
                                htVar4.z.invalidate();
                                break;
                        }
                    }
                });
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(org.telegram.ui.Components.gr.f);
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
            i9 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i9, htVar.z.getContext(), htVar.c0);
            org.telegram.ui.ActionBar.b6 b6Var4 = null;
            kg.d c10 = aVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout2, null, true);
            c10.n(mg.c.j(htVar.c0));
            c10.p(AndroidUtilities.dp(12.0f));
            c10.o(AndroidUtilities.dp(8.0f));
            c10.h.e = true;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackground(c10);
            if (htVar.V != 3) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (htVar.T == null) {
                    ft ftVar28 = htVar.l;
                    if (ftVar28 == null || !ftVar28.A()) {
                        if (htVar.l.x()) {
                            arrayList.add(LocaleController.getString(R.string.SendStickerPreview));
                            org.telegram.ui.Cells.j2.m(R.drawable.msg_send, arrayList3, arrayList2, 0);
                        }
                        arrayList.add(LocaleController.getString(R.string.AddToFavorites));
                        org.telegram.ui.Cells.j2.m(R.drawable.msg_fave, arrayList3, arrayList2, 1);
                    } else {
                        arrayList.add(LocaleController.getString(R.string.SetIntroSticker));
                        org.telegram.ui.Cells.j2.m(R.drawable.menu_sticker_add, arrayList3, arrayList2, 0);
                    }
                }
                ft ftVar29 = htVar.l;
                if (ftVar29 == null || !ftVar29.A()) {
                    ft ftVar30 = htVar.l;
                    arrayList.add(LocaleController.getString((ftVar30 == null || !ftVar30.J()) ? R.string.AddToStickerPack : R.string.StickersReplaceSticker));
                    ft ftVar31 = htVar.l;
                    org.telegram.ui.Cells.j2.m((ftVar31 == null || !ftVar31.J()) ? R.drawable.menu_sticker_add : R.drawable.msg_replace, arrayList3, arrayList2, 2);
                }
                int i29 = 7;
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, htVar.w, htVar.c0, true, false);
                g1Var.setItemHeight(44);
                g1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                g1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                FrameLayout frameLayout = new FrameLayout(htVar.z.getContext());
                LinearLayout linearLayout = new LinearLayout(htVar.z.getContext());
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G8, htVar.c0));
                linearLayout.setOrientation(1);
                if (htVar.w == null) {
                    va1Var = null;
                    i27 = 5;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new TLRPC.TL_stickerSetNoCovered());
                    TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = new TLRPC.TL_messages_getMyStickers();
                    tL_messages_getMyStickers.limit = 100;
                    ConnectionsManager.getInstance(htVar.r).sendRequest(tL_messages_getMyStickers, new y9(htVar, arrayList4, tL_messages_getMyStickers, i29));
                    va1Var = new va1(htVar.w, i29, b6Var4);
                    va1Var.setLayoutManager(new f2.m0());
                    i27 = 5;
                    va1Var.i(new bg.p2(arrayList4, i27));
                    va1Var.setAdapter(new et(htVar, arrayList4));
                }
                va1Var.setOnItemClickListener(new i(this, i27));
                frameLayout.addView(g1Var);
                linearLayout.addView(frameLayout);
                linearLayout.addView(new org.telegram.ui.ActionBar.l1(htVar.z.getContext(), htVar.c0), g7.e6.n(-1, 8));
                va1 va1Var2 = va1Var;
                ih.d0 d0Var = new ih.d0(this, arrayList2, va1Var2, linearLayout, actionBarPopupWindow$ActionBarPopupWindowLayout2, 12);
                for (int i30 = 0; i30 < arrayList.size(); i30++) {
                    org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, ((Integer) arrayList3.get(i30)).intValue(), (CharSequence) arrayList.get(i30), false, htVar.c0);
                    c11.setTag(Integer.valueOf(i30));
                    c11.setOnClickListener(d0Var);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                linearLayout.addView(va1Var2, new LinearLayout.LayoutParams(actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth() - AndroidUtilities.dp(16.0f), (int) (actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredHeight() * 1.5f)));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.b(linearLayout);
                frameLayout.setOnClickListener(new jf(actionBarPopupWindow$ActionBarPopupWindowLayout2, 2));
                i0.b bVar11 = htVar.q;
                int i31 = bVar11.d + bVar11.b;
                int min3 = ((int) (Math.min(htVar.z.getWidth(), htVar.z.getHeight() - i31) / 1.8f)) / 2;
                htVar.z.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, g7.e6.d(-2, -2.0f, 49, 0.0f, (AndroidUtilities.dp(84.0f) + ((int) ((htVar.e + Math.max(r0 + min3, ((htVar.z.getHeight() - i31) - htVar.I) / 2)) + min3))) / AndroidUtilities.density, 0.0f, 0.0f));
                htVar.L = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setTranslationY(-AndroidUtilities.dp(12.0f));
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
                view6.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.gr.h).start();
                if (htVar.P == null) {
                    org.telegram.ui.Components.pb pbVar = new org.telegram.ui.Components.pb(htVar, htVar.z.getContext(), UserConfig.selectedAccount, htVar.c0);
                    htVar.P = pbVar;
                    pbVar.J0 = true;
                    pbVar.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                    htVar.P.setClipChildren(false);
                    htVar.P.setClipToPadding(false);
                    htVar.P.setVisibility(0);
                    htVar.P.setHint(LocaleController.getString(R.string.StickersSetEmojiForSticker));
                    htVar.P.setBubbleOffset(-AndroidUtilities.dp(105.0f));
                    htVar.P.setMiniBubblesOffset(-AndroidUtilities.dp(14.0f));
                    FrameLayout frameLayout2 = new FrameLayout(htVar.z.getContext());
                    htVar.Q = frameLayout2;
                    frameLayout2.addView(htVar.P, g7.e6.d(-2, 116.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                    htVar.z.addView(htVar.Q, g7.e6.d(-2, -2.0f, 1, 0.0f, 100.0f, 0.0f, 0.0f));
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
                final int i32 = 1;
                int i33 = 0;
                i10 = htVar.V;
                if (i10 != 0) {
                    i11 = htVar.V;
                    if (i11 == 2) {
                        ftVar8 = htVar.l;
                        if (ftVar8 != null) {
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = new ArrayList();
                            ftVar9 = htVar.l;
                            i15 = htVar.V;
                            if (ftVar9.k(i15)) {
                                arrayList5.add(LocaleController.getString(R.string.SendEmojiPreview));
                                org.telegram.ui.Cells.j2.m(R.drawable.msg_send, arrayList7, arrayList6, 0);
                            }
                            ftVar10 = htVar.l;
                            document5 = htVar.W;
                            Boolean P = ftVar10.P(document5);
                            if (P != null) {
                                if (P.booleanValue()) {
                                    arrayList5.add(LocaleController.getString(R.string.SetAsEmojiStatus));
                                    org.telegram.ui.Cells.j2.m(R.drawable.msg_smile_status, arrayList7, arrayList6, 1);
                                } else {
                                    arrayList5.add(LocaleController.getString(R.string.RemoveStatus));
                                    org.telegram.ui.Cells.j2.m(R.drawable.msg_smile_status, arrayList7, arrayList6, 2);
                                }
                            }
                            ftVar11 = htVar.l;
                            document6 = htVar.W;
                            if (ftVar11.D(document6)) {
                                arrayList5.add(LocaleController.getString(R.string.CopyEmojiPreview));
                                org.telegram.ui.Cells.j2.m(R.drawable.msg_copy, arrayList7, arrayList6, 3);
                            }
                            ftVar12 = htVar.l;
                            document7 = htVar.W;
                            if (ftVar12.N(document7)) {
                                arrayList5.add(LocaleController.getString(R.string.RemoveFromRecent));
                                org.telegram.ui.Cells.j2.m(R.drawable.msg_delete, arrayList7, arrayList6, 4);
                            }
                            i16 = htVar.r;
                            MediaDataController mediaDataController = MediaDataController.getInstance(i16);
                            document8 = htVar.W;
                            boolean isStickerInFavorites = mediaDataController.isStickerInFavorites(document8);
                            document9 = htVar.W;
                            if (!MessageObject.isAnimatedEmoji(document9)) {
                                document10 = htVar.W;
                                if (!MessageObject.isMaskDocument(document10)) {
                                    if (!isStickerInFavorites) {
                                        i17 = htVar.r;
                                        if (MediaDataController.getInstance(i17).canAddStickerToFavorites()) {
                                            document11 = htVar.W;
                                        }
                                    }
                                    arrayList5.add(LocaleController.getString(isStickerInFavorites ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                                    org.telegram.ui.Cells.j2.m(isStickerInFavorites ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList7, arrayList6, 5);
                                }
                            }
                            if (arrayList5.isEmpty()) {
                                return;
                            }
                            htVar.K = true;
                            vVar8 = htVar.z;
                            vVar8.invalidate();
                            int[] iArr = new int[arrayList7.size()];
                            for (int i34 = 0; i34 < arrayList7.size(); i34++) {
                                iArr[i34] = ((Integer) arrayList7.get(i34)).intValue();
                            }
                            org.telegram.ui.Components.eb0 eb0Var = new org.telegram.ui.Components.eb0(this, arrayList6, isStickerInFavorites);
                            boolean h = ht.h(htVar, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                            int i35 = 0;
                            while (i35 < arrayList5.size()) {
                                boolean z11 = !h && i35 == 0;
                                boolean z12 = i35 == arrayList5.size() + (-1);
                                int intValue = ((Integer) arrayList7.get(i35)).intValue();
                                CharSequence charSequence = (CharSequence) arrayList5.get(i35);
                                b6Var2 = htVar.c0;
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                                org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(z11, z12, actionBarPopupWindow$ActionBarPopupWindowLayout3, intValue, charSequence, false, b6Var2);
                                if (((Integer) arrayList6.get(i35)).intValue() == 4) {
                                    c12.setIconColor(ht.d(htVar, org.telegram.ui.ActionBar.f6.p7));
                                    c12.setTextColor(ht.d(htVar, org.telegram.ui.ActionBar.f6.q7));
                                }
                                c12.setTag(Integer.valueOf(i35));
                                c12.setOnClickListener(eb0Var);
                                i35++;
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
                            int i36 = bVar4.d;
                            bVar5 = htVar.q;
                            int i37 = i36 + bVar5.b;
                            bVar6 = htVar.q;
                            int i38 = bVar6.b;
                            vVar9 = htVar.z;
                            int width = vVar9.getWidth();
                            vVar10 = htVar.z;
                            int min4 = Math.min(width, vVar10.getHeight() - i37) - AndroidUtilities.dp(40.0f);
                            f14 = htVar.e;
                            int i39 = min4 / 2;
                            int i40 = i38 + i39;
                            int dp2 = htVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                            vVar11 = htVar.z;
                            float max = (int) (f14 + Math.max(i40 + dp2, ((vVar11.getHeight() - i37) - htVar.I) / 2) + i39);
                            float dp3 = AndroidUtilities.dp(24.0f);
                            f15 = htVar.e;
                            int i41 = (int) ((dp3 - f15) + max);
                            org.telegram.ui.ActionBar.o1 o1Var = htVar.k;
                            vVar12 = htVar.z;
                            vVar13 = htVar.z;
                            o1Var.showAtLocation(vVar12, 0, (int) ((vVar13.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i41);
                            org.telegram.ui.ActionBar.o1.i(actionBarPopupWindow$ActionBarPopupWindowLayout);
                            try {
                                vVar14 = htVar.z;
                                vVar14.performHapticFeedback(0);
                            } catch (Exception unused3) {
                            }
                            f16 = htVar.e;
                            if (f16 != 0.0f) {
                                f17 = htVar.e;
                                htVar.f = f17;
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.xs
                                    public final /* synthetic */ dt b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        switch (i32) {
                                            case 0:
                                                ht htVar2 = this.b.a;
                                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                htVar2.g = floatValue;
                                                float f20 = htVar2.f;
                                                htVar2.e = e2.c.z(0.0f, f20, floatValue, f20);
                                                htVar2.z.invalidate();
                                                break;
                                            case 1:
                                                ht htVar3 = this.b.a;
                                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                htVar3.g = floatValue2;
                                                float f21 = htVar3.f;
                                                htVar3.e = e2.c.z(0.0f, f21, floatValue2, f21);
                                                htVar3.z.invalidate();
                                                break;
                                            default:
                                                ht htVar4 = this.b.a;
                                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                htVar4.g = floatValue3;
                                                float f22 = htVar4.f;
                                                htVar4.e = e2.c.z(0.0f, f22, floatValue3, f22);
                                                htVar4.z.invalidate();
                                                break;
                                        }
                                    }
                                });
                                ofFloat2.setDuration(350L);
                                ofFloat2.setInterpolator(org.telegram.ui.Components.gr.f);
                                ofFloat2.start();
                            }
                            i26 = 0;
                            while (i26 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i26);
                                if (childAt instanceof org.telegram.ui.ActionBar.g1) {
                                    ((org.telegram.ui.ActionBar.g1) childAt).k(i26 == 0, i26 == actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() + (-1));
                                }
                                i26++;
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
                        i12 = htVar.V;
                        if (ftVar2.k(i12)) {
                            ftVar7 = htVar.l;
                            if (!ftVar7.c()) {
                                arrayList8.add(LocaleController.getString(R.string.SendGifPreview));
                                org.telegram.ui.Cells.j2.m(R.drawable.msg_send, arrayList10, arrayList9, 0);
                            }
                        }
                        ftVar3 = htVar.l;
                        i13 = htVar.V;
                        if (ftVar3.k(i13)) {
                            ftVar6 = htVar.l;
                            if (!ftVar6.c()) {
                                arrayList8.add(LocaleController.getString(R.string.SendWithoutSound));
                                org.telegram.ui.Cells.j2.m(R.drawable.input_notify_off, arrayList10, arrayList9, 4);
                            }
                        }
                        ftVar4 = htVar.l;
                        if (ftVar4.b()) {
                            arrayList8.add(LocaleController.getString(R.string.Schedule));
                            org.telegram.ui.Cells.j2.m(R.drawable.msg_autodelete, arrayList10, arrayList9, 3);
                        }
                        document = htVar.W;
                        if (document != null) {
                            ftVar5 = htVar.l;
                            document4 = htVar.W;
                            if (ftVar5.e(document4)) {
                                arrayList8.add(LocaleController.getString(R.string.AddACaption));
                                org.telegram.ui.Cells.j2.j(R.drawable.outline_caption_24, 11, arrayList10, arrayList9);
                            }
                        }
                        document2 = htVar.W;
                        if (document2 != null) {
                            i14 = htVar.r;
                            MediaDataController mediaDataController2 = MediaDataController.getInstance(i14);
                            document3 = htVar.W;
                            z10 = mediaDataController2.hasRecentGif(document3);
                            if (z10) {
                                arrayList8.add(LocaleController.formatString("Delete", R.string.Delete, new Object[0]));
                                org.telegram.ui.Cells.j2.m(R.drawable.msg_delete, arrayList10, arrayList9, 1);
                            } else {
                                arrayList8.add(LocaleController.formatString("SaveToGIFs", R.string.SaveToGIFs, new Object[0]));
                                org.telegram.ui.Cells.j2.m(R.drawable.msg_gif_add, arrayList10, arrayList9, 2);
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
                        for (int i42 = 0; i42 < arrayList10.size(); i42++) {
                            iArr2[i42] = ((Integer) arrayList10.get(i42)).intValue();
                        }
                        org.telegram.ui.Components.vh0 vh0Var = new org.telegram.ui.Components.vh0(15, this, arrayList9);
                        for (int i43 = 0; i43 < arrayList8.size(); i43++) {
                            int intValue2 = ((Integer) arrayList10.get(i43)).intValue();
                            CharSequence charSequence2 = (CharSequence) arrayList8.get(i43);
                            b6Var = htVar.c0;
                            org.telegram.ui.ActionBar.g1 c13 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, intValue2, charSequence2, false, b6Var);
                            c13.setTag(Integer.valueOf(i43));
                            c13.setOnClickListener(vh0Var);
                            if (z10 && i43 == arrayList8.size() - 1) {
                                c13.c(ht.d(htVar, org.telegram.ui.ActionBar.f6.q7), ht.d(htVar, org.telegram.ui.ActionBar.f6.p7));
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
                        int i44 = bVar.d;
                        bVar2 = htVar.q;
                        int i45 = i44 + bVar2.b;
                        bVar3 = htVar.q;
                        int i46 = bVar3.b;
                        vVar2 = htVar.z;
                        int width2 = vVar2.getWidth();
                        vVar3 = htVar.z;
                        int min5 = Math.min(width2, vVar3.getHeight() - i45) - AndroidUtilities.dp(40.0f);
                        f10 = htVar.e;
                        int i47 = min5 / 2;
                        int i48 = i46 + i47;
                        int dp4 = htVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                        vVar4 = htVar.z;
                        float max2 = (int) (f10 + Math.max(i48 + dp4, ((vVar4.getHeight() - i45) - htVar.I) / 2) + i47);
                        float dp5 = AndroidUtilities.dp(24.0f);
                        f11 = htVar.e;
                        int i49 = (int) ((dp5 - f11) + max2);
                        org.telegram.ui.ActionBar.o1 o1Var2 = htVar.k;
                        vVar5 = htVar.z;
                        vVar6 = htVar.z;
                        o1Var2.showAtLocation(vVar5, 0, (int) ((vVar6.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i49);
                        try {
                            vVar7 = htVar.z;
                            vVar7.performHapticFeedback(0);
                        } catch (Exception unused4) {
                        }
                        f12 = htVar.e;
                        if (f12 != 0.0f) {
                            f13 = htVar.e;
                            htVar.f = f13;
                            final int i50 = 2;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.xs
                                public final /* synthetic */ dt b;

                                {
                                    this.b = this;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (i50) {
                                        case 0:
                                            ht htVar2 = this.b.a;
                                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            htVar2.g = floatValue;
                                            float f20 = htVar2.f;
                                            htVar2.e = e2.c.z(0.0f, f20, floatValue, f20);
                                            htVar2.z.invalidate();
                                            break;
                                        case 1:
                                            ht htVar3 = this.b.a;
                                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            htVar3.g = floatValue2;
                                            float f21 = htVar3.f;
                                            htVar3.e = e2.c.z(0.0f, f21, floatValue2, f21);
                                            htVar3.z.invalidate();
                                            break;
                                        default:
                                            ht htVar4 = this.b.a;
                                            float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            htVar4.g = floatValue3;
                                            float f22 = htVar4.f;
                                            htVar4.e = e2.c.z(0.0f, f22, floatValue3, f22);
                                            htVar4.z.invalidate();
                                            break;
                                    }
                                }
                            });
                            ofFloat3.setDuration(350L);
                            ofFloat3.setInterpolator(org.telegram.ui.Components.gr.f);
                            ofFloat3.start();
                        }
                        i26 = 0;
                        while (i26 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                        }
                    }
                    i26 = 0;
                    while (i26 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                    }
                }
                document12 = htVar.W;
                if (MessageObject.isPremiumSticker(document12)) {
                    i25 = htVar.r;
                    if (!AccountInstance.getInstance(i25).getUserConfig().isPremium()) {
                        if (htVar.O == null) {
                            bg1 bg1Var = new bg1(htVar.z.getContext(), htVar.c0);
                            htVar.O = bg1Var;
                            htVar.z.addView(bg1Var, g7.e6.c(-1.0f, -1));
                            htVar.O.setOnClickListener(new ws(htVar, i33));
                            htVar.O.a.r.setOnClickListener(new ws(htVar, i32));
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(htVar.O, false, 1.0f, false);
                        AndroidUtilities.updateViewVisibilityAnimated(htVar.O, true);
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
                i18 = htVar.r;
                MediaDataController mediaDataController3 = MediaDataController.getInstance(i18);
                document13 = htVar.W;
                boolean isStickerInFavorites2 = mediaDataController3.isStickerInFavorites(document13);
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                ftVar13 = htVar.l;
                if (ftVar13 != null) {
                    ftVar20 = htVar.l;
                    i23 = htVar.V;
                    if (ftVar20.k(i23)) {
                        ftVar25 = htVar.l;
                        if (!ftVar25.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendStickerPreview));
                            org.telegram.ui.Cells.j2.m(R.drawable.msg_send, arrayList13, arrayList12, 0);
                        }
                    }
                    ftVar21 = htVar.l;
                    i24 = htVar.V;
                    if (ftVar21.k(i24)) {
                        ftVar24 = htVar.l;
                        if (!ftVar24.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendWithoutSound));
                            org.telegram.ui.Cells.j2.j(R.drawable.input_notify_off, 6, arrayList13, arrayList12);
                        }
                    }
                    ftVar22 = htVar.l;
                    if (ftVar22.b()) {
                        arrayList11.add(LocaleController.getString(R.string.Schedule));
                        org.telegram.ui.Cells.j2.m(R.drawable.msg_autodelete, arrayList13, arrayList12, 3);
                    }
                    ftVar23 = htVar.l;
                    if (ftVar23.f()) {
                        arrayList11.add(LocaleController.getString(R.string.ImportStickersRemoveMenu));
                        org.telegram.ui.Cells.j2.m(R.drawable.msg_delete, arrayList13, arrayList12, 5);
                    }
                }
                document14 = htVar.W;
                if (!MessageObject.isMaskDocument(document14)) {
                    if (!isStickerInFavorites2) {
                        i22 = htVar.r;
                        if (MediaDataController.getInstance(i22).canAddStickerToFavorites()) {
                            document16 = htVar.W;
                        }
                    }
                    arrayList11.add(LocaleController.getString(isStickerInFavorites2 ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                    org.telegram.ui.Cells.j2.m(isStickerInFavorites2 ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList13, arrayList12, 2);
                }
                ftVar14 = htVar.l;
                if (ftVar14 != null && (inputStickerSet = htVar.a0) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                    ftVar19 = htVar.l;
                    if (ftVar19.Q()) {
                        arrayList11.add(LocaleController.formatString(R.string.ViewPackPreview, new Object[0]));
                        org.telegram.ui.Cells.j2.m(R.drawable.msg_media, arrayList13, arrayList12, 1);
                    }
                }
                if (htVar.p) {
                    arrayList11.add(LocaleController.getString(R.string.DeleteFromRecent));
                    org.telegram.ui.Cells.j2.m(R.drawable.msg_delete, arrayList13, arrayList12, 4);
                }
                if (htVar.a0 != null) {
                    document15 = htVar.W;
                    if (document15 != null) {
                        i21 = htVar.r;
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i21).getStickerSet(htVar.a0, true);
                        if (stickerSet != null) {
                            ftVar17 = htVar.l;
                            if (ftVar17 != null) {
                                ftVar18 = htVar.l;
                                if (ftVar18.C()) {
                                    TLRPC.StickerSet stickerSet2 = stickerSet.set;
                                    if (!stickerSet2.emojis && !stickerSet2.masks) {
                                        arrayList11.add(LocaleController.getString(R.string.EditSticker));
                                        org.telegram.ui.Cells.j2.j(R.drawable.msg_edit, 7, arrayList13, arrayList12);
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
                                    org.telegram.ui.Cells.j2.j(R.drawable.msg_delete, 8, arrayList13, arrayList12);
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
                ht.h(htVar, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                for (int i51 = 0; i51 < arrayList11.size(); i51++) {
                    int intValue3 = ((Integer) arrayList13.get(i51)).intValue();
                    CharSequence charSequence3 = (CharSequence) arrayList11.get(i51);
                    b6Var3 = htVar.c0;
                    org.telegram.ui.ActionBar.g1 c14 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, intValue3, charSequence3, false, b6Var3);
                    c14.setTag(Integer.valueOf(i51));
                    c14.setOnClickListener(zsVar);
                    if (((Integer) arrayList12.get(i51)).intValue() == 8) {
                        int d9 = ht.d(htVar, org.telegram.ui.ActionBar.f6.q7);
                        c14.c(d9, d9);
                        c14.setSelectorColor(org.telegram.ui.ActionBar.f6.l1(0.1f, d9));
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
                int i52 = bVar7.d;
                bVar8 = htVar.q;
                int i53 = i52 + bVar8.b;
                bVar9 = htVar.q;
                int i54 = bVar9.b;
                i19 = htVar.V;
                if (i19 == 1) {
                    vVar24 = htVar.z;
                    int width3 = vVar24.getWidth();
                    vVar25 = htVar.z;
                    i20 = Math.min(width3, vVar25.getHeight() - i53) - AndroidUtilities.dp(40.0f);
                } else {
                    if (htVar.S) {
                        vVar18 = htVar.z;
                        int width4 = vVar18.getWidth();
                        vVar19 = htVar.z;
                        min = Math.min(width4, vVar19.getHeight() - i53) - AndroidUtilities.dpf2(40.0f);
                    } else {
                        vVar16 = htVar.z;
                        int width5 = vVar16.getWidth();
                        vVar17 = htVar.z;
                        min = Math.min(width5, vVar17.getHeight() - i53) / 1.8f;
                    }
                    i20 = (int) min;
                }
                f18 = htVar.e;
                int i55 = i20 / 2;
                int i56 = i54 + i55;
                int dp6 = htVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                vVar20 = htVar.z;
                int dp7 = AndroidUtilities.dp(24.0f) + ((int) (f18 + Math.max(i56 + dp6, ((vVar20.getHeight() - i53) - htVar.I) / 2) + i55));
                if (htVar.S) {
                    dp7 += AndroidUtilities.dp(24.0f);
                }
                org.telegram.ui.ActionBar.o1 o1Var3 = htVar.k;
                vVar21 = htVar.z;
                vVar22 = htVar.z;
                o1Var3.showAtLocation(vVar21, 0, (int) ((vVar22.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth()) / 2.0f), dp7);
                try {
                    vVar23 = htVar.z;
                    vVar23.performHapticFeedback(0);
                } catch (Exception unused6) {
                }
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            i26 = 0;
            while (i26 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
            }
        }
        i9 = 1;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout22 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i9, htVar.z.getContext(), htVar.c0);
        org.telegram.ui.ActionBar.b6 b6Var42 = null;
        kg.d c102 = aVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout22, null, true);
        c102.n(mg.c.j(htVar.c0));
        c102.p(AndroidUtilities.dp(12.0f));
        c102.o(AndroidUtilities.dp(8.0f));
        c102.h.e = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout22.setBackground(c102);
        if (htVar.V != 3) {
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout22;
        i26 = 0;
        while (i26 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
        }
    }
}
