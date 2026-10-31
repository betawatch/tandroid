package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class gt implements Runnable {
    public final /* synthetic */ lt a;

    public gt(lt ltVar) {
        this.a = ltVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x06af, code lost:
    
        if (org.telegram.messenger.jj.v4(r4) != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x09ee, code lost:
    
        if (org.telegram.messenger.jj.v4(r7) != false) goto L229;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0e43  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        int i12;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        jt jtVar;
        jt jtVar2;
        int i13;
        jt jtVar3;
        int i14;
        jt jtVar4;
        TLRPC.Document document;
        TLRPC.Document document2;
        boolean z10;
        fg.i iVar;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        i0.c cVar;
        i0.c cVar2;
        i0.c cVar3;
        fg.i iVar2;
        fg.i iVar3;
        float f7;
        fg.i iVar4;
        float f10;
        fg.i iVar5;
        fg.i iVar6;
        int i15;
        float f11;
        float f12;
        fg.i iVar7;
        org.telegram.ui.ActionBar.p6 p6Var;
        int i16;
        TLRPC.Document document3;
        jt jtVar5;
        TLRPC.Document document4;
        jt jtVar6;
        jt jtVar7;
        jt jtVar8;
        jt jtVar9;
        int i17;
        jt jtVar10;
        TLRPC.Document document5;
        jt jtVar11;
        TLRPC.Document document6;
        jt jtVar12;
        TLRPC.Document document7;
        int i18;
        TLRPC.Document document8;
        TLRPC.Document document9;
        fg.i iVar8;
        i0.c cVar4;
        i0.c cVar5;
        i0.c cVar6;
        fg.i iVar9;
        fg.i iVar10;
        float f13;
        fg.i iVar11;
        float f14;
        fg.i iVar12;
        fg.i iVar13;
        float f15;
        float f16;
        fg.i iVar14;
        org.telegram.ui.ActionBar.p6 p6Var2;
        TLRPC.Document document10;
        int i19;
        TLRPC.Document document11;
        TLRPC.Document document12;
        int i20;
        TLRPC.Document document13;
        jt jtVar13;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3;
        TLRPC.Document document14;
        jt jtVar14;
        fg.i iVar15;
        i0.c cVar7;
        i0.c cVar8;
        i0.c cVar9;
        int i21;
        fg.i iVar16;
        fg.i iVar17;
        float min;
        int i22;
        fg.i iVar18;
        fg.i iVar19;
        float f17;
        fg.i iVar20;
        fg.i iVar21;
        fg.i iVar22;
        fg.i iVar23;
        fg.i iVar24;
        fg.i iVar25;
        org.telegram.ui.ActionBar.p6 p6Var3;
        TLRPC.Document document15;
        int i23;
        jt jtVar15;
        jt jtVar16;
        jt jtVar17;
        jt jtVar18;
        TLRPC.InputStickerSet inputStickerSet;
        jt jtVar19;
        int i24;
        TLRPC.Document document16;
        jt jtVar20;
        int i25;
        jt jtVar21;
        int i26;
        jt jtVar22;
        jt jtVar23;
        jt jtVar24;
        jt jtVar25;
        int i27;
        boolean z11;
        fg.i iVar26;
        fg.i iVar27;
        int i28;
        w71 w71Var;
        i0.c cVar10;
        i0.c cVar11;
        i0.c cVar12;
        fg.i iVar28;
        fg.i iVar29;
        float f18;
        fg.i iVar30;
        fg.i iVar31;
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        View view7;
        View view8;
        fg.i iVar32;
        org.telegram.ui.Components.z60 D;
        TLRPC.Document unused;
        Integer valueOf = Integer.valueOf(R.drawable.msg_smile_status);
        Integer valueOf2 = Integer.valueOf(R.drawable.msg_autodelete);
        Integer valueOf3 = Integer.valueOf(R.drawable.input_notify_off);
        Integer valueOf4 = Integer.valueOf(R.drawable.msg_send);
        Integer valueOf5 = Integer.valueOf(R.drawable.msg_delete);
        lt ltVar = this.a;
        tg.b bVar = ltVar.t;
        if (ltVar.w == null || ltVar.m) {
            return;
        }
        ltVar.R = true;
        jt jtVar26 = ltVar.l;
        if (jtVar26 != null && (D = jtVar26.D(ltVar.z)) != null) {
            D.R(bVar, w7.b9.k(ltVar.c0), true);
            D.t = false;
            D.Y();
            D.p = new rh(this, 17);
            ViewGroup viewGroup = D.A;
            bt btVar = new bt(this, viewGroup);
            ltVar.k = btVar;
            btVar.e = true;
            btVar.c = org.telegram.messenger.zs.g2;
            btVar.g = true;
            btVar.setOutsideTouchable(true);
            ltVar.k.setClippingEnabled(true);
            ltVar.k.setAnimationStyle(R.style.PopupContextAnimation);
            ltVar.k.setFocusable(true);
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31));
            ltVar.k.setInputMethodMode(2);
            ltVar.k.getContentView().setFocusableInTouchMode(true);
            i0.c cVar13 = ltVar.q;
            int min2 = (Math.min(ltVar.z.getWidth(), ltVar.z.getHeight() - (cVar13.d + cVar13.b)) - org.telegram.messenger.i0.L(40.0f)) / 2;
            int L = (int) ((org.telegram.messenger.i0.L(24.0f) - ltVar.e) + ((int) (ltVar.e + Math.max(r2 + min2 + (ltVar.G != null ? org.telegram.messenger.i0.L(40.0f) : 0), ((ltVar.z.getHeight() - r3) - ltVar.I) / 2) + min2)));
            ltVar.k.showAtLocation(ltVar.z, 0, (int) ((r4.getMeasuredWidth() - viewGroup.getMeasuredWidth()) / 2.0f), L);
            try {
                ltVar.z.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            float f19 = ltVar.e;
            if (f19 != 0.0f) {
                ltVar.f = f19;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                final int i29 = 0;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.at
                    public final /* synthetic */ gt b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i29) {
                            case 0:
                                lt ltVar2 = this.b.a;
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ltVar2.g = floatValue;
                                float f20 = ltVar2.f;
                                ltVar2.e = c3.i0.z(0.0f, f20, floatValue, f20);
                                ltVar2.z.invalidate();
                                break;
                            case 1:
                                lt ltVar3 = this.b.a;
                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ltVar3.g = floatValue2;
                                float f21 = ltVar3.f;
                                ltVar3.e = c3.i0.z(0.0f, f21, floatValue2, f21);
                                ltVar3.z.invalidate();
                                break;
                            default:
                                lt ltVar4 = this.b.a;
                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ltVar4.g = floatValue3;
                                float f22 = ltVar4.f;
                                ltVar4.e = c3.i0.z(0.0f, f22, floatValue3, f22);
                                ltVar4.z.invalidate();
                                break;
                        }
                    }
                });
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(org.telegram.ui.Components.gr.f);
                ofFloat.start();
            }
            ltVar.K = true;
            return;
        }
        int i30 = 0;
        if (ltVar.V != 3) {
            jt jtVar27 = ltVar.l;
            if (jtVar27 != null) {
                TLRPC.TL_messageMediaPoll d = jtVar27.d();
                TLRPC.PollAnswer g10 = ltVar.l.g();
                if (d != null && d.poll != null && g10 != null) {
                    TLRPC.PollAnswerVoters F1 = org.telegram.messenger.jj.F1(d, g10.option);
                    if (F1 != null && F1.voters > 0) {
                        org.telegram.messenger.jj.A(d);
                    }
                }
            }
            i10 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, ltVar.z.getContext(), ltVar.c0);
            org.telegram.ui.ActionBar.p6 p6Var4 = null;
            vg.f c10 = bVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout4, null, true);
            c10.o(w7.b9.k(ltVar.c0));
            org.telegram.messenger.z20.u(c10, org.telegram.messenger.i0.L(12.0f), 8.0f);
            c10.M.e = true;
            actionBarPopupWindow$ActionBarPopupWindowLayout4.setBackground(c10);
            if (ltVar.V != 3) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ltVar.T;
                int i31 = R.drawable.menu_sticker_add;
                if (tL_messages_stickerSet == null) {
                    jt jtVar28 = ltVar.l;
                    if (jtVar28 == null || !jtVar28.z()) {
                        if (ltVar.l.w()) {
                            arrayList.add(org.telegram.messenger.cd.L0(2131745605, null));
                            arrayList3.add(valueOf4);
                            arrayList2.add(0);
                        }
                        org.telegram.ui.Cells.f1.t(null, 2131754374, arrayList, R.drawable.msg_fave, arrayList3);
                        arrayList2.add(1);
                    } else {
                        org.telegram.ui.Cells.f1.t(null, 2131745541, arrayList, R.drawable.menu_sticker_add, arrayList3);
                        arrayList2.add(0);
                    }
                }
                jt jtVar29 = ltVar.l;
                if (jtVar29 == null || !jtVar29.z()) {
                    jt jtVar30 = ltVar.l;
                    arrayList.add(org.telegram.messenger.cd.L0((jtVar30 == null || !jtVar30.I()) ? 2131754370 : 2131744867, null));
                    jt jtVar31 = ltVar.l;
                    if (jtVar31 != null && jtVar31.I()) {
                        i31 = R.drawable.msg_replace;
                    }
                    arrayList3.add(Integer.valueOf(i31));
                    arrayList2.add(2);
                }
                int i32 = 7;
                org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(0, ltVar.w, ltVar.c0, true, false);
                b1Var.setItemHeight(44);
                b1Var.j(org.telegram.messenger.cd.L0(2131753756, null), R.drawable.msg_arrow_back, null);
                b1Var.getTextView().setPadding(org.telegram.messenger.cd.X ? 0 : org.telegram.messenger.i0.L(40.0f), 0, org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(40.0f) : 0, 0);
                FrameLayout frameLayout = new FrameLayout(ltVar.z.getContext());
                LinearLayout linearLayout = new LinearLayout(ltVar.z.getContext());
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.G8, linearLayout, ltVar.c0);
                linearLayout.setOrientation(1);
                if (ltVar.w == null) {
                    w71Var = null;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new TLRPC.TL_stickerSetNoCovered());
                    TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = new TLRPC.TL_messages_getMyStickers();
                    tL_messages_getMyStickers.limit = 100;
                    ConnectionsManager.getInstance(ltVar.r).sendRequest(tL_messages_getMyStickers, new aa(ltVar, arrayList4, tL_messages_getMyStickers, i32));
                    int i33 = 5;
                    w71Var = new w71(i33, ltVar.w, p6Var4);
                    w71Var.setLayoutManager(new s4.a0());
                    w71Var.i(new mg.u1(arrayList4, i33));
                    w71Var.setAdapter(new ht(ltVar, arrayList4));
                }
                w71Var.setOnItemClickListener(new g(this, 6));
                frameLayout.addView(b1Var);
                linearLayout.addView(frameLayout);
                linearLayout.addView(new org.telegram.ui.ActionBar.h1(ltVar.z.getContext(), ltVar.c0), w7.b6.o(-1, 8));
                bi.c cVar14 = new bi.c(this, arrayList2, w71Var, linearLayout, actionBarPopupWindow$ActionBarPopupWindowLayout4, 9);
                for (int i34 = 0; i34 < arrayList.size(); i34++) {
                    org.telegram.ui.ActionBar.b1 c11 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout4, ((Integer) arrayList3.get(i34)).intValue(), (CharSequence) arrayList.get(i34), false, ltVar.c0);
                    c11.setTag(Integer.valueOf(i34));
                    c11.setOnClickListener(cVar14);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout4.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31));
                linearLayout.addView(w71Var, new LinearLayout.LayoutParams(actionBarPopupWindow$ActionBarPopupWindowLayout4.getMeasuredWidth() - org.telegram.messenger.i0.L(16.0f), (int) (actionBarPopupWindow$ActionBarPopupWindowLayout4.getMeasuredHeight() * 1.5f)));
                actionBarPopupWindow$ActionBarPopupWindowLayout4.b(linearLayout);
                frameLayout.setOnClickListener(new pf(actionBarPopupWindow$ActionBarPopupWindowLayout4, 2));
                cVar10 = ltVar.q;
                int i35 = cVar10.d;
                cVar11 = ltVar.q;
                int i36 = i35 + cVar11.b;
                cVar12 = ltVar.q;
                int i37 = cVar12.b;
                iVar28 = ltVar.z;
                int width = iVar28.getWidth();
                iVar29 = ltVar.z;
                int min3 = (int) (Math.min(width, iVar29.getHeight() - i36) / 1.8f);
                f18 = ltVar.e;
                iVar30 = ltVar.z;
                int L2 = org.telegram.messenger.i0.L(84.0f) + ((int) (f18 + Math.max(i37 + r3, ((iVar30.getHeight() - i36) - ltVar.I) / 2) + (min3 / 2)));
                iVar31 = ltVar.z;
                iVar31.addView(actionBarPopupWindow$ActionBarPopupWindowLayout4, w7.b6.d(-2, -2.0f, 49, 0.0f, L2 / org.telegram.messenger.i0.p, 0.0f, 0.0f));
                ltVar.L = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                view = ltVar.L;
                view.setTranslationY(-org.telegram.messenger.i0.L(12.0f));
                view2 = ltVar.L;
                view2.setAlpha(0.0f);
                view3 = ltVar.L;
                view3.setScaleX(0.8f);
                view4 = ltVar.L;
                view4.setScaleY(0.8f);
                view5 = ltVar.L;
                view5.setPivotY(0.0f);
                view6 = ltVar.L;
                view7 = ltVar.L;
                view6.setPivotX(view7.getMeasuredWidth() / 2.0f);
                view8 = ltVar.L;
                view8.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.gr.h).start();
                if (ltVar.P == null) {
                    org.telegram.ui.Components.fb fbVar = new org.telegram.ui.Components.fb(ltVar, ltVar.z.getContext(), org.telegram.messenger.d20.s0, ltVar.c0);
                    ltVar.P = fbVar;
                    fbVar.N0 = true;
                    fbVar.setPadding(0, org.telegram.messenger.i0.L(22.0f), 0, org.telegram.messenger.i0.L(22.0f));
                    ltVar.P.setClipChildren(false);
                    ltVar.P.setClipToPadding(false);
                    ltVar.P.setVisibility(0);
                    ltVar.P.setHint(org.telegram.messenger.cd.L0(2131744866, null));
                    ltVar.P.setBubbleOffset(-org.telegram.messenger.i0.L(105.0f));
                    ltVar.P.setMiniBubblesOffset(-org.telegram.messenger.i0.L(14.0f));
                    FrameLayout frameLayout2 = new FrameLayout(ltVar.z.getContext());
                    ltVar.Q = frameLayout2;
                    frameLayout2.addView(ltVar.P, w7.b6.d(-2, 116.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                    ltVar.z.addView(ltVar.Q, w7.b6.d(-2, -2.0f, 1, 0.0f, 100.0f, 0.0f, 0.0f));
                }
                ltVar.P.setSelectedEmojis(ltVar.o);
                ltVar.P.setDelegate(new ys(ltVar));
                ltVar.P.p(null, null, false);
                ltVar.Q.setScaleY(0.6f);
                ltVar.Q.setScaleX(0.6f);
                ltVar.Q.setAlpha(0.0f);
                org.telegram.messenger.i0.h3(new ws(ltVar, 2), 10L);
                ltVar.K = true;
                iVar32 = ltVar.z;
                iVar32.invalidate();
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
            } else {
                i11 = ltVar.V;
                if (i11 == 0) {
                    document12 = ltVar.W;
                    if (org.telegram.messenger.jj.X3(document12)) {
                        i27 = ltVar.r;
                        if (!org.telegram.messenger.c.a(i27).d().q()) {
                            if (ltVar.O == null) {
                                uc1 uc1Var = new uc1(ltVar.z.getContext(), ltVar.c0);
                                ltVar.O = uc1Var;
                                ltVar.z.addView(uc1Var, w7.b6.c(-1.0f, -1));
                                ltVar.O.setOnClickListener(new zs(ltVar, i30));
                                z11 = true;
                                ((kg.x0) ltVar.O.b).w.setOnClickListener(new zs(ltVar, 1 == true ? 1 : 0));
                            } else {
                                z11 = true;
                            }
                            org.telegram.messenger.i0.Y3(ltVar.O, false, 1.0f, z11, false);
                            org.telegram.messenger.i0.W3(ltVar.O, z11);
                            ltVar.O.setTranslationY(0.0f);
                            ltVar.K = true;
                            iVar26 = ltVar.z;
                            iVar26.invalidate();
                            try {
                                iVar27 = ltVar.z;
                                iVar27.performHapticFeedback(0);
                                return;
                            } catch (Exception unused3) {
                                return;
                            }
                        }
                    }
                    i20 = ltVar.r;
                    org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i20);
                    document13 = ltVar.W;
                    boolean A0 = b02.A0(document13);
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    jtVar13 = ltVar.l;
                    if (jtVar13 != null) {
                        jtVar20 = ltVar.l;
                        actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                        i25 = ltVar.V;
                        if (jtVar20.k(i25)) {
                            jtVar25 = ltVar.l;
                            if (!jtVar25.c()) {
                                org.telegram.ui.Cells.f1.r(2131745605, arrayList5, arrayList7, valueOf4);
                                arrayList6.add(0);
                            }
                        }
                        jtVar21 = ltVar.l;
                        i26 = ltVar.V;
                        if (jtVar21.k(i26)) {
                            jtVar24 = ltVar.l;
                            if (!jtVar24.c()) {
                                arrayList5.add(org.telegram.messenger.cd.K0(2131745600));
                                arrayList7.add(valueOf3);
                                arrayList6.add(6);
                            }
                        }
                        jtVar22 = ltVar.l;
                        if (jtVar22.b()) {
                            org.telegram.ui.Cells.f1.r(2131745877, arrayList5, arrayList7, valueOf2);
                            arrayList6.add(3);
                        }
                        jtVar23 = ltVar.l;
                        if (jtVar23.f()) {
                            org.telegram.ui.Cells.f1.r(2131749236, arrayList5, arrayList7, valueOf5);
                            arrayList6.add(5);
                        }
                    } else {
                        actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                    }
                    document14 = ltVar.W;
                    if (!org.telegram.messenger.jj.E3(document14)) {
                        if (!A0) {
                            i24 = ltVar.r;
                            if (org.telegram.messenger.ui.b0(i24).s()) {
                                document16 = ltVar.W;
                            }
                        }
                        arrayList5.add(A0 ? org.telegram.messenger.cd.K0(2131751539) : org.telegram.messenger.cd.K0(2131754374));
                        arrayList7.add(Integer.valueOf(A0 ? R.drawable.msg_unfave : R.drawable.msg_fave));
                        arrayList6.add(2);
                    }
                    jtVar14 = ltVar.l;
                    if (jtVar14 != null && (inputStickerSet = ltVar.a0) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                        jtVar19 = ltVar.l;
                        if (jtVar19.Q()) {
                            arrayList5.add(org.telegram.messenger.cd.Z(2131743574, new Object[0]));
                            arrayList7.add(Integer.valueOf(R.drawable.msg_media));
                            arrayList6.add(1);
                        }
                    }
                    if (ltVar.p) {
                        org.telegram.ui.Cells.f1.r(2131751538, arrayList5, arrayList7, valueOf5);
                        arrayList6.add(4);
                    }
                    if (ltVar.a0 != null) {
                        document15 = ltVar.W;
                        if (document15 != null) {
                            i23 = ltVar.r;
                            TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(i23).m0(ltVar.a0, true);
                            if (m0 != null) {
                                jtVar17 = ltVar.l;
                                if (jtVar17 != null) {
                                    jtVar18 = ltVar.l;
                                    if (jtVar18.B()) {
                                        TLRPC.StickerSet stickerSet = m0.set;
                                        if (!stickerSet.emojis && !stickerSet.masks) {
                                            arrayList6.add(org.telegram.ui.Cells.f1.m(2131751224, arrayList5, R.drawable.msg_edit, arrayList7, 7));
                                        }
                                    }
                                }
                            }
                            if (m0 != null && m0.set.creator) {
                                jtVar15 = ltVar.l;
                                if (jtVar15 != null) {
                                    jtVar16 = ltVar.l;
                                    unused = ltVar.W;
                                    if (jtVar16.H()) {
                                        arrayList5.add(org.telegram.messenger.cd.K0(2131751496));
                                        arrayList7.add(valueOf5);
                                        arrayList6.add(8);
                                    }
                                }
                            }
                        }
                    }
                    if (arrayList5.isEmpty()) {
                        return;
                    }
                    ltVar.K = true;
                    iVar15 = ltVar.z;
                    iVar15.invalidate();
                    ct ctVar = new ct(this, arrayList6, A0);
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                    lt.g(ltVar, actionBarPopupWindow$ActionBarPopupWindowLayout5);
                    int i38 = 0;
                    while (i38 < arrayList5.size()) {
                        int intValue = ((Integer) arrayList7.get(i38)).intValue();
                        CharSequence charSequence = (CharSequence) arrayList5.get(i38);
                        p6Var3 = ltVar.c0;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout5;
                        org.telegram.ui.ActionBar.b1 c12 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout6, intValue, charSequence, false, p6Var3);
                        c12.setTag(Integer.valueOf(i38));
                        c12.setOnClickListener(ctVar);
                        if (((Integer) arrayList6.get(i38)).intValue() == 8) {
                            int i39 = org.telegram.ui.ActionBar.t6.q7;
                            c12.c(i39, i39);
                            c12.h(0.1f, i39);
                        }
                        i38++;
                        actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout6;
                    }
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout5;
                    dt dtVar = new dt(this, actionBarPopupWindow$ActionBarPopupWindowLayout7);
                    ltVar.k = dtVar;
                    dtVar.e = true;
                    dtVar.c = 100;
                    dtVar.g = true;
                    dtVar.setOutsideTouchable(true);
                    ltVar.k.setClippingEnabled(true);
                    ltVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                    ltVar.k.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout7.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31));
                    ltVar.k.setInputMethodMode(2);
                    ltVar.k.getContentView().setFocusableInTouchMode(true);
                    cVar7 = ltVar.q;
                    int i40 = cVar7.d;
                    cVar8 = ltVar.q;
                    int i41 = i40 + cVar8.b;
                    cVar9 = ltVar.q;
                    int i42 = cVar9.b;
                    i21 = ltVar.V;
                    if (i21 == 1) {
                        iVar24 = ltVar.z;
                        int width2 = iVar24.getWidth();
                        iVar25 = ltVar.z;
                        i22 = Math.min(width2, iVar25.getHeight() - i41) - org.telegram.messenger.i0.L(40.0f);
                    } else {
                        if (ltVar.S) {
                            iVar18 = ltVar.z;
                            int width3 = iVar18.getWidth();
                            iVar19 = ltVar.z;
                            min = Math.min(width3, iVar19.getHeight() - i41) - org.telegram.messenger.i0.N(40.0f);
                        } else {
                            iVar16 = ltVar.z;
                            int width4 = iVar16.getWidth();
                            iVar17 = ltVar.z;
                            min = Math.min(width4, iVar17.getHeight() - i41) / 1.8f;
                        }
                        i22 = (int) min;
                    }
                    f17 = ltVar.e;
                    int i43 = i22 / 2;
                    int i44 = i42 + i43;
                    int L3 = ltVar.G != null ? org.telegram.messenger.i0.L(40.0f) : 0;
                    iVar20 = ltVar.z;
                    int L4 = org.telegram.messenger.i0.L(24.0f) + ((int) (f17 + Math.max(i44 + L3, ((iVar20.getHeight() - i41) - ltVar.I) / 2) + i43));
                    if (ltVar.S) {
                        L4 += org.telegram.messenger.i0.L(24.0f);
                    }
                    org.telegram.ui.ActionBar.k1 k1Var = ltVar.k;
                    iVar21 = ltVar.z;
                    iVar22 = ltVar.z;
                    k1Var.showAtLocation(iVar21, 0, (int) ((iVar22.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout7.getMeasuredWidth()) / 2.0f), L4);
                    try {
                        iVar23 = ltVar.z;
                        iVar23.performHapticFeedback(0);
                    } catch (Exception unused4) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout7;
                } else {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                    i12 = ltVar.V;
                    if (i12 == 2) {
                        jtVar8 = ltVar.l;
                        if (jtVar8 != null) {
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = new ArrayList();
                            jtVar9 = ltVar.l;
                            i17 = ltVar.V;
                            if (jtVar9.k(i17)) {
                                org.telegram.ui.Cells.f1.r(2131745643, arrayList8, arrayList10, valueOf4);
                                arrayList9.add(0);
                            }
                            jtVar10 = ltVar.l;
                            document5 = ltVar.W;
                            Boolean P = jtVar10.P(document5);
                            if (P != null) {
                                if (P.booleanValue()) {
                                    org.telegram.ui.Cells.f1.r(2131745563, arrayList8, arrayList10, valueOf);
                                    arrayList9.add(1);
                                } else {
                                    org.telegram.ui.Cells.f1.r(2131746303, arrayList8, arrayList10, valueOf);
                                    arrayList9.add(2);
                                }
                            }
                            jtVar11 = ltVar.l;
                            document6 = ltVar.W;
                            if (jtVar11.C(document6)) {
                                arrayList8.add(org.telegram.messenger.cd.K0(2131751764));
                                arrayList10.add(Integer.valueOf(R.drawable.msg_copy));
                                arrayList9.add(3);
                            }
                            jtVar12 = ltVar.l;
                            document7 = ltVar.W;
                            if (jtVar12.M(document7)) {
                                org.telegram.ui.Cells.f1.r(2131746326, arrayList8, arrayList10, valueOf5);
                                arrayList9.add(4);
                            }
                            i18 = ltVar.r;
                            org.telegram.messenger.ui b03 = org.telegram.messenger.ui.b0(i18);
                            document8 = ltVar.W;
                            boolean A02 = b03.A0(document8);
                            document9 = ltVar.W;
                            if (!org.telegram.messenger.jj.H2(document9)) {
                                document10 = ltVar.W;
                                if (!org.telegram.messenger.jj.E3(document10)) {
                                    if (!A02) {
                                        i19 = ltVar.r;
                                        if (org.telegram.messenger.ui.b0(i19).s()) {
                                            document11 = ltVar.W;
                                        }
                                    }
                                    arrayList8.add(A02 ? org.telegram.messenger.cd.K0(2131751539) : org.telegram.messenger.cd.K0(2131754374));
                                    arrayList10.add(Integer.valueOf(A02 ? R.drawable.msg_unfave : R.drawable.msg_fave));
                                    arrayList9.add(5);
                                }
                            }
                            if (arrayList8.isEmpty()) {
                                return;
                            }
                            ltVar.K = true;
                            iVar8 = ltVar.z;
                            iVar8.invalidate();
                            int[] iArr = new int[arrayList10.size()];
                            for (int i45 = 0; i45 < arrayList10.size(); i45++) {
                                iArr[i45] = ((Integer) arrayList10.get(i45)).intValue();
                            }
                            org.telegram.ui.Components.cb0 cb0Var = new org.telegram.ui.Components.cb0(this, arrayList9, A02);
                            boolean g11 = lt.g(ltVar, actionBarPopupWindow$ActionBarPopupWindowLayout8);
                            int i46 = 0;
                            while (i46 < arrayList8.size()) {
                                boolean z12 = !g11 && i46 == 0;
                                boolean z13 = i46 == arrayList8.size() + (-1);
                                int intValue2 = ((Integer) arrayList10.get(i46)).intValue();
                                CharSequence charSequence2 = (CharSequence) arrayList8.get(i46);
                                p6Var2 = ltVar.c0;
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout9 = actionBarPopupWindow$ActionBarPopupWindowLayout8;
                                org.telegram.ui.ActionBar.b1 c13 = org.telegram.ui.ActionBar.t0.c(z12, z13, actionBarPopupWindow$ActionBarPopupWindowLayout9, intValue2, charSequence2, false, p6Var2);
                                if (((Integer) arrayList9.get(i46)).intValue() == 4) {
                                    c13.c(org.telegram.ui.ActionBar.t6.q7, org.telegram.ui.ActionBar.t6.p7);
                                }
                                c13.setTag(Integer.valueOf(i46));
                                c13.setOnClickListener(cb0Var);
                                i46++;
                                actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout9;
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout8;
                            et etVar = new et(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            ltVar.k = etVar;
                            etVar.e = true;
                            etVar.c = org.telegram.messenger.zs.g2;
                            etVar.g = true;
                            etVar.setOutsideTouchable(true);
                            ltVar.k.setClippingEnabled(true);
                            ltVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                            ltVar.k.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31));
                            ltVar.k.setInputMethodMode(2);
                            ltVar.k.getContentView().setFocusableInTouchMode(true);
                            cVar4 = ltVar.q;
                            int i47 = cVar4.d;
                            cVar5 = ltVar.q;
                            int i48 = i47 + cVar5.b;
                            cVar6 = ltVar.q;
                            int i49 = cVar6.b;
                            iVar9 = ltVar.z;
                            int width5 = iVar9.getWidth();
                            iVar10 = ltVar.z;
                            int min4 = Math.min(width5, iVar10.getHeight() - i48) - org.telegram.messenger.i0.L(40.0f);
                            f13 = ltVar.e;
                            int i50 = min4 / 2;
                            int i51 = i49 + i50;
                            int L5 = ltVar.G != null ? org.telegram.messenger.i0.L(40.0f) : 0;
                            iVar11 = ltVar.z;
                            float max = (int) (f13 + Math.max(i51 + L5, ((iVar11.getHeight() - i48) - ltVar.I) / 2) + i50);
                            float L6 = org.telegram.messenger.i0.L(24.0f);
                            f14 = ltVar.e;
                            int i52 = (int) ((L6 - f14) + max);
                            org.telegram.ui.ActionBar.k1 k1Var2 = ltVar.k;
                            iVar12 = ltVar.z;
                            iVar13 = ltVar.z;
                            k1Var2.showAtLocation(iVar12, 0, (int) ((iVar13.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i52);
                            org.telegram.ui.ActionBar.k1.i(actionBarPopupWindow$ActionBarPopupWindowLayout);
                            try {
                                iVar14 = ltVar.z;
                                iVar14.performHapticFeedback(0);
                            } catch (Exception unused5) {
                            }
                            f15 = ltVar.e;
                            if (f15 != 0.0f) {
                                f16 = ltVar.e;
                                ltVar.f = f16;
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                final int i53 = 1;
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.at
                                    public final /* synthetic */ gt b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        switch (i53) {
                                            case 0:
                                                lt ltVar2 = this.b.a;
                                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                ltVar2.g = floatValue;
                                                float f20 = ltVar2.f;
                                                ltVar2.e = c3.i0.z(0.0f, f20, floatValue, f20);
                                                ltVar2.z.invalidate();
                                                break;
                                            case 1:
                                                lt ltVar3 = this.b.a;
                                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                ltVar3.g = floatValue2;
                                                float f21 = ltVar3.f;
                                                ltVar3.e = c3.i0.z(0.0f, f21, floatValue2, f21);
                                                ltVar3.z.invalidate();
                                                break;
                                            default:
                                                lt ltVar4 = this.b.a;
                                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                ltVar4.g = floatValue3;
                                                float f22 = ltVar4.f;
                                                ltVar4.e = c3.i0.z(0.0f, f22, floatValue3, f22);
                                                ltVar4.z.invalidate();
                                                break;
                                        }
                                    }
                                });
                                ofFloat2.setDuration(350L);
                                ofFloat2.setInterpolator(org.telegram.ui.Components.gr.f);
                                ofFloat2.start();
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout8;
                    jtVar = ltVar.l;
                    if (jtVar != null) {
                        ArrayList arrayList11 = new ArrayList();
                        ArrayList arrayList12 = new ArrayList();
                        ArrayList arrayList13 = new ArrayList();
                        jtVar2 = ltVar.l;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout10 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                        i13 = ltVar.V;
                        if (jtVar2.k(i13)) {
                            jtVar7 = ltVar.l;
                            if (!jtVar7.c()) {
                                org.telegram.ui.Cells.f1.r(2131745640, arrayList11, arrayList13, valueOf4);
                                arrayList12.add(0);
                            }
                        }
                        jtVar3 = ltVar.l;
                        i14 = ltVar.V;
                        if (jtVar3.k(i14)) {
                            jtVar6 = ltVar.l;
                            if (!jtVar6.c()) {
                                org.telegram.ui.Cells.f1.r(2131745600, arrayList11, arrayList13, valueOf3);
                                arrayList12.add(4);
                            }
                        }
                        jtVar4 = ltVar.l;
                        if (jtVar4.b()) {
                            org.telegram.ui.Cells.f1.r(2131745877, arrayList11, arrayList13, valueOf2);
                            arrayList12.add(3);
                        }
                        document = ltVar.W;
                        if (document != null) {
                            jtVar5 = ltVar.l;
                            document4 = ltVar.W;
                            if (jtVar5.e(document4)) {
                                arrayList12.add(org.telegram.ui.Cells.f1.m(2131754485, arrayList11, R.drawable.outline_caption_24, arrayList13, 11));
                            }
                        }
                        document2 = ltVar.W;
                        if (document2 != null) {
                            i16 = ltVar.r;
                            org.telegram.messenger.ui b04 = org.telegram.messenger.ui.b0(i16);
                            document3 = ltVar.W;
                            int i54 = 0;
                            while (true) {
                                if (i54 >= b04.i0.size()) {
                                    z10 = false;
                                    break;
                                }
                                TLRPC.Document document17 = (TLRPC.Document) b04.i0.get(i54);
                                if (document17.id == document3.id) {
                                    b04.i0.remove(i54);
                                    b04.i0.add(0, document17);
                                    z10 = true;
                                    break;
                                }
                                i54++;
                            }
                            if (z10) {
                                arrayList11.add(org.telegram.messenger.cd.Y(2131751599, "Delete", new Object[0]));
                                arrayList13.add(valueOf5);
                                arrayList12.add(1);
                            } else {
                                arrayList11.add(org.telegram.messenger.cd.Y(2131745947, "SaveToGIFs", new Object[0]));
                                arrayList13.add(Integer.valueOf(R.drawable.msg_gif_add));
                                arrayList12.add(2);
                            }
                        } else {
                            z10 = false;
                        }
                        if (arrayList11.isEmpty()) {
                            return;
                        }
                        ltVar.K = true;
                        iVar = ltVar.z;
                        iVar.invalidate();
                        int[] iArr2 = new int[arrayList13.size()];
                        for (int i55 = 0; i55 < arrayList13.size(); i55++) {
                            iArr2[i55] = ((Integer) arrayList13.get(i55)).intValue();
                        }
                        org.telegram.ui.Components.sr srVar = new org.telegram.ui.Components.sr(29, this, arrayList12);
                        int i56 = 0;
                        while (i56 < arrayList11.size()) {
                            int intValue3 = ((Integer) arrayList13.get(i56)).intValue();
                            CharSequence charSequence3 = (CharSequence) arrayList11.get(i56);
                            p6Var = ltVar.c0;
                            org.telegram.ui.ActionBar.b1 c14 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout10, intValue3, charSequence3, false, p6Var);
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout11 = actionBarPopupWindow$ActionBarPopupWindowLayout10;
                            c14.setTag(Integer.valueOf(i56));
                            c14.setOnClickListener(srVar);
                            if (z10 && i56 == arrayList11.size() - 1) {
                                c14.c(org.telegram.ui.ActionBar.t6.q7, org.telegram.ui.ActionBar.t6.p7);
                            }
                            i56++;
                            actionBarPopupWindow$ActionBarPopupWindowLayout10 = actionBarPopupWindow$ActionBarPopupWindowLayout11;
                        }
                        actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout10;
                        ft ftVar = new ft(this, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                        ltVar.k = ftVar;
                        ftVar.e = true;
                        ftVar.c = org.telegram.messenger.zs.g2;
                        ftVar.g = true;
                        ftVar.setOutsideTouchable(true);
                        ltVar.k.setClippingEnabled(true);
                        ltVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                        ltVar.k.setFocusable(true);
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31));
                        ltVar.k.setInputMethodMode(2);
                        ltVar.k.getContentView().setFocusableInTouchMode(true);
                        cVar = ltVar.q;
                        int i57 = cVar.d;
                        cVar2 = ltVar.q;
                        int i58 = i57 + cVar2.b;
                        cVar3 = ltVar.q;
                        int i59 = cVar3.b;
                        iVar2 = ltVar.z;
                        int width6 = iVar2.getWidth();
                        iVar3 = ltVar.z;
                        int min5 = Math.min(width6, iVar3.getHeight() - i58) - org.telegram.messenger.i0.L(40.0f);
                        f7 = ltVar.e;
                        int i60 = min5 / 2;
                        int i61 = i59 + i60;
                        int L7 = ltVar.G != null ? org.telegram.messenger.i0.L(40.0f) : 0;
                        iVar4 = ltVar.z;
                        float max2 = (int) (f7 + Math.max(i61 + L7, ((iVar4.getHeight() - i58) - ltVar.I) / 2) + i60);
                        float L8 = org.telegram.messenger.i0.L(24.0f);
                        f10 = ltVar.e;
                        int i62 = (int) ((L8 - f10) + max2);
                        org.telegram.ui.ActionBar.k1 k1Var3 = ltVar.k;
                        iVar5 = ltVar.z;
                        iVar6 = ltVar.z;
                        i15 = 0;
                        k1Var3.showAtLocation(iVar5, 0, (int) ((iVar6.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth()) / 2.0f), i62);
                        try {
                            iVar7 = ltVar.z;
                            iVar7.performHapticFeedback(0);
                        } catch (Exception unused6) {
                        }
                        f11 = ltVar.e;
                        if (f11 != 0.0f) {
                            f12 = ltVar.e;
                            ltVar.f = f12;
                            final int i63 = 2;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.at
                                public final /* synthetic */ gt b;

                                {
                                    this.b = this;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (i63) {
                                        case 0:
                                            lt ltVar2 = this.b.a;
                                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            ltVar2.g = floatValue;
                                            float f20 = ltVar2.f;
                                            ltVar2.e = c3.i0.z(0.0f, f20, floatValue, f20);
                                            ltVar2.z.invalidate();
                                            break;
                                        case 1:
                                            lt ltVar3 = this.b.a;
                                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            ltVar3.g = floatValue2;
                                            float f21 = ltVar3.f;
                                            ltVar3.e = c3.i0.z(0.0f, f21, floatValue2, f21);
                                            ltVar3.z.invalidate();
                                            break;
                                        default:
                                            lt ltVar4 = this.b.a;
                                            float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            ltVar4.g = floatValue3;
                                            float f22 = ltVar4.f;
                                            ltVar4.e = c3.i0.z(0.0f, f22, floatValue3, f22);
                                            ltVar4.z.invalidate();
                                            break;
                                    }
                                }
                            });
                            ofFloat3.setDuration(350L);
                            ofFloat3.setInterpolator(org.telegram.ui.Components.gr.f);
                            ofFloat3.start();
                        }
                        i28 = i15;
                        while (i28 < actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount()) {
                            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout2.L.getChildAt(i28);
                            if (childAt instanceof org.telegram.ui.ActionBar.b1) {
                                ((org.telegram.ui.ActionBar.b1) childAt).n(i28 == 0 ? 1 : i15, i28 == actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount() + (-1) ? 1 : i15);
                            }
                            i28++;
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                }
            }
            i15 = 0;
            i28 = i15;
            while (i28 < actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount()) {
            }
        }
        i10 = 1;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout42 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, ltVar.z.getContext(), ltVar.c0);
        org.telegram.ui.ActionBar.p6 p6Var42 = null;
        vg.f c102 = bVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout42, null, true);
        c102.o(w7.b9.k(ltVar.c0));
        org.telegram.messenger.z20.u(c102, org.telegram.messenger.i0.L(12.0f), 8.0f);
        c102.M.e = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout42.setBackground(c102);
        if (ltVar.V != 3) {
        }
        i15 = 0;
        i28 = i15;
        while (i28 < actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount()) {
        }
    }
}
