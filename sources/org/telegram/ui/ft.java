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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ft implements Runnable {
    public final /* synthetic */ kt a;

    public ft(kt ktVar) {
        this.a = ktVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x06af, code lost:
    
        if (org.telegram.messenger.kj.v4(r4) != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x09ee, code lost:
    
        if (org.telegram.messenger.kj.v4(r7) != false) goto L229;
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
        ht htVar;
        ht htVar2;
        int i13;
        ht htVar3;
        int i14;
        ht htVar4;
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
        ht htVar5;
        TLRPC.Document document4;
        ht htVar6;
        ht htVar7;
        ht htVar8;
        ht htVar9;
        int i17;
        ht htVar10;
        TLRPC.Document document5;
        ht htVar11;
        TLRPC.Document document6;
        ht htVar12;
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
        ht htVar13;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3;
        TLRPC.Document document14;
        ht htVar14;
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
        ht htVar15;
        ht htVar16;
        ht htVar17;
        ht htVar18;
        TLRPC.InputStickerSet inputStickerSet;
        ht htVar19;
        int i24;
        TLRPC.Document document16;
        ht htVar20;
        int i25;
        ht htVar21;
        int i26;
        ht htVar22;
        ht htVar23;
        ht htVar24;
        ht htVar25;
        int i27;
        boolean z11;
        fg.i iVar26;
        fg.i iVar27;
        int i28;
        u71 u71Var;
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
        kt ktVar = this.a;
        tg.b bVar = ktVar.t;
        if (ktVar.w == null || ktVar.m) {
            return;
        }
        ktVar.R = true;
        ht htVar26 = ktVar.l;
        if (htVar26 != null && (D = htVar26.D(ktVar.z)) != null) {
            D.R(bVar, w7.b9.k(ktVar.c0), true);
            D.t = false;
            D.Y();
            D.p = new rh(this, 17);
            ViewGroup viewGroup = D.A;
            at atVar = new at(this, viewGroup);
            ktVar.k = atVar;
            atVar.e = true;
            atVar.c = org.telegram.messenger.at.g2;
            atVar.g = true;
            atVar.setOutsideTouchable(true);
            ktVar.k.setClippingEnabled(true);
            ktVar.k.setAnimationStyle(R.style.PopupContextAnimation);
            ktVar.k.setFocusable(true);
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31));
            ktVar.k.setInputMethodMode(2);
            ktVar.k.getContentView().setFocusableInTouchMode(true);
            i0.c cVar13 = ktVar.q;
            int min2 = (Math.min(ktVar.z.getWidth(), ktVar.z.getHeight() - (cVar13.d + cVar13.b)) - org.telegram.messenger.i0.L(40.0f)) / 2;
            int L = (int) ((org.telegram.messenger.i0.L(24.0f) - ktVar.e) + ((int) (ktVar.e + Math.max(r2 + min2 + (ktVar.G != null ? org.telegram.messenger.i0.L(40.0f) : 0), ((ktVar.z.getHeight() - r3) - ktVar.I) / 2) + min2)));
            ktVar.k.showAtLocation(ktVar.z, 0, (int) ((r4.getMeasuredWidth() - viewGroup.getMeasuredWidth()) / 2.0f), L);
            try {
                ktVar.z.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            float f19 = ktVar.e;
            if (f19 != 0.0f) {
                ktVar.f = f19;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                final int i29 = 0;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.zs
                    public final /* synthetic */ ft b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i29) {
                            case 0:
                                kt ktVar2 = this.b.a;
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ktVar2.g = floatValue;
                                float f20 = ktVar2.f;
                                ktVar2.e = c3.i0.z(0.0f, f20, floatValue, f20);
                                ktVar2.z.invalidate();
                                break;
                            case 1:
                                kt ktVar3 = this.b.a;
                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ktVar3.g = floatValue2;
                                float f21 = ktVar3.f;
                                ktVar3.e = c3.i0.z(0.0f, f21, floatValue2, f21);
                                ktVar3.z.invalidate();
                                break;
                            default:
                                kt ktVar4 = this.b.a;
                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ktVar4.g = floatValue3;
                                float f22 = ktVar4.f;
                                ktVar4.e = c3.i0.z(0.0f, f22, floatValue3, f22);
                                ktVar4.z.invalidate();
                                break;
                        }
                    }
                });
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(org.telegram.ui.Components.gr.f);
                ofFloat.start();
            }
            ktVar.K = true;
            return;
        }
        int i30 = 0;
        if (ktVar.V != 3) {
            ht htVar27 = ktVar.l;
            if (htVar27 != null) {
                TLRPC.TL_messageMediaPoll d = htVar27.d();
                TLRPC.PollAnswer g10 = ktVar.l.g();
                if (d != null && d.poll != null && g10 != null) {
                    TLRPC.PollAnswerVoters F1 = org.telegram.messenger.kj.F1(d, g10.option);
                    if (F1 != null && F1.voters > 0) {
                        org.telegram.messenger.kj.A(d);
                    }
                }
            }
            i10 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, ktVar.z.getContext(), ktVar.c0);
            org.telegram.ui.ActionBar.p6 p6Var4 = null;
            vg.f c10 = bVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout4, null, true);
            c10.o(w7.b9.k(ktVar.c0));
            org.telegram.messenger.a30.u(c10, org.telegram.messenger.i0.L(12.0f), 8.0f);
            c10.P.e = true;
            actionBarPopupWindow$ActionBarPopupWindowLayout4.setBackground(c10);
            if (ktVar.V != 3) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ktVar.T;
                int i31 = R.drawable.menu_sticker_add;
                if (tL_messages_stickerSet == null) {
                    ht htVar28 = ktVar.l;
                    if (htVar28 == null || !htVar28.z()) {
                        if (ktVar.l.w()) {
                            arrayList.add(org.telegram.messenger.dd.L0(2131745605, null));
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
                ht htVar29 = ktVar.l;
                if (htVar29 == null || !htVar29.z()) {
                    ht htVar30 = ktVar.l;
                    arrayList.add(org.telegram.messenger.dd.L0((htVar30 == null || !htVar30.I()) ? 2131754370 : 2131744867, null));
                    ht htVar31 = ktVar.l;
                    if (htVar31 != null && htVar31.I()) {
                        i31 = R.drawable.msg_replace;
                    }
                    arrayList3.add(Integer.valueOf(i31));
                    arrayList2.add(2);
                }
                int i32 = 7;
                org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(0, ktVar.w, ktVar.c0, true, false);
                b1Var.setItemHeight(44);
                b1Var.j(org.telegram.messenger.dd.L0(2131753756, null), R.drawable.msg_arrow_back, null);
                b1Var.getTextView().setPadding(org.telegram.messenger.dd.X ? 0 : org.telegram.messenger.i0.L(40.0f), 0, org.telegram.messenger.dd.X ? org.telegram.messenger.i0.L(40.0f) : 0, 0);
                FrameLayout frameLayout = new FrameLayout(ktVar.z.getContext());
                LinearLayout linearLayout = new LinearLayout(ktVar.z.getContext());
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.G8, linearLayout, ktVar.c0);
                linearLayout.setOrientation(1);
                if (ktVar.w == null) {
                    u71Var = null;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new TLRPC.TL_stickerSetNoCovered());
                    TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = new TLRPC.TL_messages_getMyStickers();
                    tL_messages_getMyStickers.limit = 100;
                    ConnectionsManager.getInstance(ktVar.r).sendRequest(tL_messages_getMyStickers, new aa(ktVar, arrayList4, tL_messages_getMyStickers, i32));
                    int i33 = 5;
                    u71Var = new u71(i33, ktVar.w, p6Var4);
                    u71Var.setLayoutManager(new s4.a0());
                    u71Var.i(new mg.u1(arrayList4, i33));
                    u71Var.setAdapter(new gt(ktVar, arrayList4));
                }
                u71Var.setOnItemClickListener(new g(this, 6));
                frameLayout.addView(b1Var);
                linearLayout.addView(frameLayout);
                linearLayout.addView(new org.telegram.ui.ActionBar.h1(ktVar.z.getContext(), ktVar.c0), w7.b6.o(-1, 8));
                bi.c cVar14 = new bi.c(this, arrayList2, u71Var, linearLayout, actionBarPopupWindow$ActionBarPopupWindowLayout4, 9);
                for (int i34 = 0; i34 < arrayList.size(); i34++) {
                    org.telegram.ui.ActionBar.b1 c11 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout4, ((Integer) arrayList3.get(i34)).intValue(), (CharSequence) arrayList.get(i34), false, ktVar.c0);
                    c11.setTag(Integer.valueOf(i34));
                    c11.setOnClickListener(cVar14);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout4.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31));
                linearLayout.addView(u71Var, new LinearLayout.LayoutParams(actionBarPopupWindow$ActionBarPopupWindowLayout4.getMeasuredWidth() - org.telegram.messenger.i0.L(16.0f), (int) (actionBarPopupWindow$ActionBarPopupWindowLayout4.getMeasuredHeight() * 1.5f)));
                actionBarPopupWindow$ActionBarPopupWindowLayout4.b(linearLayout);
                frameLayout.setOnClickListener(new pf(actionBarPopupWindow$ActionBarPopupWindowLayout4, 2));
                cVar10 = ktVar.q;
                int i35 = cVar10.d;
                cVar11 = ktVar.q;
                int i36 = i35 + cVar11.b;
                cVar12 = ktVar.q;
                int i37 = cVar12.b;
                iVar28 = ktVar.z;
                int width = iVar28.getWidth();
                iVar29 = ktVar.z;
                int min3 = (int) (Math.min(width, iVar29.getHeight() - i36) / 1.8f);
                f18 = ktVar.e;
                iVar30 = ktVar.z;
                int L2 = org.telegram.messenger.i0.L(84.0f) + ((int) (f18 + Math.max(i37 + r3, ((iVar30.getHeight() - i36) - ktVar.I) / 2) + (min3 / 2)));
                iVar31 = ktVar.z;
                iVar31.addView(actionBarPopupWindow$ActionBarPopupWindowLayout4, w7.b6.d(-2, -2.0f, 49, 0.0f, L2 / org.telegram.messenger.i0.p, 0.0f, 0.0f));
                ktVar.L = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                view = ktVar.L;
                view.setTranslationY(-org.telegram.messenger.i0.L(12.0f));
                view2 = ktVar.L;
                view2.setAlpha(0.0f);
                view3 = ktVar.L;
                view3.setScaleX(0.8f);
                view4 = ktVar.L;
                view4.setScaleY(0.8f);
                view5 = ktVar.L;
                view5.setPivotY(0.0f);
                view6 = ktVar.L;
                view7 = ktVar.L;
                view6.setPivotX(view7.getMeasuredWidth() / 2.0f);
                view8 = ktVar.L;
                view8.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.gr.h).start();
                if (ktVar.P == null) {
                    org.telegram.ui.Components.fb fbVar = new org.telegram.ui.Components.fb(ktVar, ktVar.z.getContext(), org.telegram.messenger.e20.s0, ktVar.c0);
                    ktVar.P = fbVar;
                    fbVar.N0 = true;
                    fbVar.setPadding(0, org.telegram.messenger.i0.L(22.0f), 0, org.telegram.messenger.i0.L(22.0f));
                    ktVar.P.setClipChildren(false);
                    ktVar.P.setClipToPadding(false);
                    ktVar.P.setVisibility(0);
                    ktVar.P.setHint(org.telegram.messenger.dd.L0(2131744866, null));
                    ktVar.P.setBubbleOffset(-org.telegram.messenger.i0.L(105.0f));
                    ktVar.P.setMiniBubblesOffset(-org.telegram.messenger.i0.L(14.0f));
                    FrameLayout frameLayout2 = new FrameLayout(ktVar.z.getContext());
                    ktVar.Q = frameLayout2;
                    frameLayout2.addView(ktVar.P, w7.b6.d(-2, 116.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                    ktVar.z.addView(ktVar.Q, w7.b6.d(-2, -2.0f, 1, 0.0f, 100.0f, 0.0f, 0.0f));
                }
                ktVar.P.setSelectedEmojis(ktVar.o);
                ktVar.P.setDelegate(new xs(ktVar));
                ktVar.P.p(null, null, false);
                ktVar.Q.setScaleY(0.6f);
                ktVar.Q.setScaleX(0.6f);
                ktVar.Q.setAlpha(0.0f);
                org.telegram.messenger.i0.h3(new ws(ktVar, 2), 10L);
                ktVar.K = true;
                iVar32 = ktVar.z;
                iVar32.invalidate();
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
            } else {
                i11 = ktVar.V;
                if (i11 == 0) {
                    document12 = ktVar.W;
                    if (org.telegram.messenger.kj.X3(document12)) {
                        i27 = ktVar.r;
                        if (!org.telegram.messenger.c.a(i27).d().q()) {
                            if (ktVar.O == null) {
                                sc1 sc1Var = new sc1(ktVar.z.getContext(), ktVar.c0);
                                ktVar.O = sc1Var;
                                ktVar.z.addView(sc1Var, w7.b6.c(-1.0f, -1));
                                ktVar.O.setOnClickListener(new ys(ktVar, i30));
                                z11 = true;
                                ((kg.x0) ktVar.O.b).w.setOnClickListener(new ys(ktVar, 1 == true ? 1 : 0));
                            } else {
                                z11 = true;
                            }
                            org.telegram.messenger.i0.Y3(ktVar.O, false, 1.0f, z11, false);
                            org.telegram.messenger.i0.W3(ktVar.O, z11);
                            ktVar.O.setTranslationY(0.0f);
                            ktVar.K = true;
                            iVar26 = ktVar.z;
                            iVar26.invalidate();
                            try {
                                iVar27 = ktVar.z;
                                iVar27.performHapticFeedback(0);
                                return;
                            } catch (Exception unused3) {
                                return;
                            }
                        }
                    }
                    i20 = ktVar.r;
                    org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(i20);
                    document13 = ktVar.W;
                    boolean A0 = b02.A0(document13);
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    htVar13 = ktVar.l;
                    if (htVar13 != null) {
                        htVar20 = ktVar.l;
                        actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                        i25 = ktVar.V;
                        if (htVar20.k(i25)) {
                            htVar25 = ktVar.l;
                            if (!htVar25.c()) {
                                org.telegram.ui.Cells.f1.r(2131745605, arrayList5, arrayList7, valueOf4);
                                arrayList6.add(0);
                            }
                        }
                        htVar21 = ktVar.l;
                        i26 = ktVar.V;
                        if (htVar21.k(i26)) {
                            htVar24 = ktVar.l;
                            if (!htVar24.c()) {
                                arrayList5.add(org.telegram.messenger.dd.K0(2131745600));
                                arrayList7.add(valueOf3);
                                arrayList6.add(6);
                            }
                        }
                        htVar22 = ktVar.l;
                        if (htVar22.b()) {
                            org.telegram.ui.Cells.f1.r(2131745877, arrayList5, arrayList7, valueOf2);
                            arrayList6.add(3);
                        }
                        htVar23 = ktVar.l;
                        if (htVar23.f()) {
                            org.telegram.ui.Cells.f1.r(2131749236, arrayList5, arrayList7, valueOf5);
                            arrayList6.add(5);
                        }
                    } else {
                        actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                    }
                    document14 = ktVar.W;
                    if (!org.telegram.messenger.kj.E3(document14)) {
                        if (!A0) {
                            i24 = ktVar.r;
                            if (org.telegram.messenger.vi.b0(i24).s()) {
                                document16 = ktVar.W;
                            }
                        }
                        arrayList5.add(A0 ? org.telegram.messenger.dd.K0(2131751539) : org.telegram.messenger.dd.K0(2131754374));
                        arrayList7.add(Integer.valueOf(A0 ? R.drawable.msg_unfave : R.drawable.msg_fave));
                        arrayList6.add(2);
                    }
                    htVar14 = ktVar.l;
                    if (htVar14 != null && (inputStickerSet = ktVar.a0) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                        htVar19 = ktVar.l;
                        if (htVar19.Q()) {
                            arrayList5.add(org.telegram.messenger.dd.Z(2131743574, new Object[0]));
                            arrayList7.add(Integer.valueOf(R.drawable.msg_media));
                            arrayList6.add(1);
                        }
                    }
                    if (ktVar.p) {
                        org.telegram.ui.Cells.f1.r(2131751538, arrayList5, arrayList7, valueOf5);
                        arrayList6.add(4);
                    }
                    if (ktVar.a0 != null) {
                        document15 = ktVar.W;
                        if (document15 != null) {
                            i23 = ktVar.r;
                            TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.vi.b0(i23).m0(ktVar.a0, true);
                            if (m0 != null) {
                                htVar17 = ktVar.l;
                                if (htVar17 != null) {
                                    htVar18 = ktVar.l;
                                    if (htVar18.B()) {
                                        TLRPC.StickerSet stickerSet = m0.set;
                                        if (!stickerSet.emojis && !stickerSet.masks) {
                                            arrayList6.add(org.telegram.ui.Cells.f1.m(2131751224, arrayList5, R.drawable.msg_edit, arrayList7, 7));
                                        }
                                    }
                                }
                            }
                            if (m0 != null && m0.set.creator) {
                                htVar15 = ktVar.l;
                                if (htVar15 != null) {
                                    htVar16 = ktVar.l;
                                    unused = ktVar.W;
                                    if (htVar16.H()) {
                                        arrayList5.add(org.telegram.messenger.dd.K0(2131751496));
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
                    ktVar.K = true;
                    iVar15 = ktVar.z;
                    iVar15.invalidate();
                    bt btVar = new bt(this, arrayList6, A0);
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                    kt.g(ktVar, actionBarPopupWindow$ActionBarPopupWindowLayout5);
                    int i38 = 0;
                    while (i38 < arrayList5.size()) {
                        int intValue = ((Integer) arrayList7.get(i38)).intValue();
                        CharSequence charSequence = (CharSequence) arrayList5.get(i38);
                        p6Var3 = ktVar.c0;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout5;
                        org.telegram.ui.ActionBar.b1 c12 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout6, intValue, charSequence, false, p6Var3);
                        c12.setTag(Integer.valueOf(i38));
                        c12.setOnClickListener(btVar);
                        if (((Integer) arrayList6.get(i38)).intValue() == 8) {
                            int i39 = org.telegram.ui.ActionBar.t6.q7;
                            c12.c(i39, i39);
                            c12.h(0.1f, i39);
                        }
                        i38++;
                        actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout6;
                    }
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout5;
                    ct ctVar = new ct(this, actionBarPopupWindow$ActionBarPopupWindowLayout7);
                    ktVar.k = ctVar;
                    ctVar.e = true;
                    ctVar.c = 100;
                    ctVar.g = true;
                    ctVar.setOutsideTouchable(true);
                    ktVar.k.setClippingEnabled(true);
                    ktVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                    ktVar.k.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout7.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31));
                    ktVar.k.setInputMethodMode(2);
                    ktVar.k.getContentView().setFocusableInTouchMode(true);
                    cVar7 = ktVar.q;
                    int i40 = cVar7.d;
                    cVar8 = ktVar.q;
                    int i41 = i40 + cVar8.b;
                    cVar9 = ktVar.q;
                    int i42 = cVar9.b;
                    i21 = ktVar.V;
                    if (i21 == 1) {
                        iVar24 = ktVar.z;
                        int width2 = iVar24.getWidth();
                        iVar25 = ktVar.z;
                        i22 = Math.min(width2, iVar25.getHeight() - i41) - org.telegram.messenger.i0.L(40.0f);
                    } else {
                        if (ktVar.S) {
                            iVar18 = ktVar.z;
                            int width3 = iVar18.getWidth();
                            iVar19 = ktVar.z;
                            min = Math.min(width3, iVar19.getHeight() - i41) - org.telegram.messenger.i0.N(40.0f);
                        } else {
                            iVar16 = ktVar.z;
                            int width4 = iVar16.getWidth();
                            iVar17 = ktVar.z;
                            min = Math.min(width4, iVar17.getHeight() - i41) / 1.8f;
                        }
                        i22 = (int) min;
                    }
                    f17 = ktVar.e;
                    int i43 = i22 / 2;
                    int i44 = i42 + i43;
                    int L3 = ktVar.G != null ? org.telegram.messenger.i0.L(40.0f) : 0;
                    iVar20 = ktVar.z;
                    int L4 = org.telegram.messenger.i0.L(24.0f) + ((int) (f17 + Math.max(i44 + L3, ((iVar20.getHeight() - i41) - ktVar.I) / 2) + i43));
                    if (ktVar.S) {
                        L4 += org.telegram.messenger.i0.L(24.0f);
                    }
                    org.telegram.ui.ActionBar.k1 k1Var = ktVar.k;
                    iVar21 = ktVar.z;
                    iVar22 = ktVar.z;
                    k1Var.showAtLocation(iVar21, 0, (int) ((iVar22.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout7.getMeasuredWidth()) / 2.0f), L4);
                    try {
                        iVar23 = ktVar.z;
                        iVar23.performHapticFeedback(0);
                    } catch (Exception unused4) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout7;
                } else {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                    i12 = ktVar.V;
                    if (i12 == 2) {
                        htVar8 = ktVar.l;
                        if (htVar8 != null) {
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = new ArrayList();
                            htVar9 = ktVar.l;
                            i17 = ktVar.V;
                            if (htVar9.k(i17)) {
                                org.telegram.ui.Cells.f1.r(2131745643, arrayList8, arrayList10, valueOf4);
                                arrayList9.add(0);
                            }
                            htVar10 = ktVar.l;
                            document5 = ktVar.W;
                            Boolean P = htVar10.P(document5);
                            if (P != null) {
                                if (P.booleanValue()) {
                                    org.telegram.ui.Cells.f1.r(2131745563, arrayList8, arrayList10, valueOf);
                                    arrayList9.add(1);
                                } else {
                                    org.telegram.ui.Cells.f1.r(2131746303, arrayList8, arrayList10, valueOf);
                                    arrayList9.add(2);
                                }
                            }
                            htVar11 = ktVar.l;
                            document6 = ktVar.W;
                            if (htVar11.C(document6)) {
                                arrayList8.add(org.telegram.messenger.dd.K0(2131751764));
                                arrayList10.add(Integer.valueOf(R.drawable.msg_copy));
                                arrayList9.add(3);
                            }
                            htVar12 = ktVar.l;
                            document7 = ktVar.W;
                            if (htVar12.M(document7)) {
                                org.telegram.ui.Cells.f1.r(2131746326, arrayList8, arrayList10, valueOf5);
                                arrayList9.add(4);
                            }
                            i18 = ktVar.r;
                            org.telegram.messenger.vi b03 = org.telegram.messenger.vi.b0(i18);
                            document8 = ktVar.W;
                            boolean A02 = b03.A0(document8);
                            document9 = ktVar.W;
                            if (!org.telegram.messenger.kj.H2(document9)) {
                                document10 = ktVar.W;
                                if (!org.telegram.messenger.kj.E3(document10)) {
                                    if (!A02) {
                                        i19 = ktVar.r;
                                        if (org.telegram.messenger.vi.b0(i19).s()) {
                                            document11 = ktVar.W;
                                        }
                                    }
                                    arrayList8.add(A02 ? org.telegram.messenger.dd.K0(2131751539) : org.telegram.messenger.dd.K0(2131754374));
                                    arrayList10.add(Integer.valueOf(A02 ? R.drawable.msg_unfave : R.drawable.msg_fave));
                                    arrayList9.add(5);
                                }
                            }
                            if (arrayList8.isEmpty()) {
                                return;
                            }
                            ktVar.K = true;
                            iVar8 = ktVar.z;
                            iVar8.invalidate();
                            int[] iArr = new int[arrayList10.size()];
                            for (int i45 = 0; i45 < arrayList10.size(); i45++) {
                                iArr[i45] = ((Integer) arrayList10.get(i45)).intValue();
                            }
                            org.telegram.ui.Components.cb0 cb0Var = new org.telegram.ui.Components.cb0(this, arrayList9, A02);
                            boolean g11 = kt.g(ktVar, actionBarPopupWindow$ActionBarPopupWindowLayout8);
                            int i46 = 0;
                            while (i46 < arrayList8.size()) {
                                boolean z12 = !g11 && i46 == 0;
                                boolean z13 = i46 == arrayList8.size() + (-1);
                                int intValue2 = ((Integer) arrayList10.get(i46)).intValue();
                                CharSequence charSequence2 = (CharSequence) arrayList8.get(i46);
                                p6Var2 = ktVar.c0;
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
                            dt dtVar = new dt(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            ktVar.k = dtVar;
                            dtVar.e = true;
                            dtVar.c = org.telegram.messenger.at.g2;
                            dtVar.g = true;
                            dtVar.setOutsideTouchable(true);
                            ktVar.k.setClippingEnabled(true);
                            ktVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                            ktVar.k.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31));
                            ktVar.k.setInputMethodMode(2);
                            ktVar.k.getContentView().setFocusableInTouchMode(true);
                            cVar4 = ktVar.q;
                            int i47 = cVar4.d;
                            cVar5 = ktVar.q;
                            int i48 = i47 + cVar5.b;
                            cVar6 = ktVar.q;
                            int i49 = cVar6.b;
                            iVar9 = ktVar.z;
                            int width5 = iVar9.getWidth();
                            iVar10 = ktVar.z;
                            int min4 = Math.min(width5, iVar10.getHeight() - i48) - org.telegram.messenger.i0.L(40.0f);
                            f13 = ktVar.e;
                            int i50 = min4 / 2;
                            int i51 = i49 + i50;
                            int L5 = ktVar.G != null ? org.telegram.messenger.i0.L(40.0f) : 0;
                            iVar11 = ktVar.z;
                            float max = (int) (f13 + Math.max(i51 + L5, ((iVar11.getHeight() - i48) - ktVar.I) / 2) + i50);
                            float L6 = org.telegram.messenger.i0.L(24.0f);
                            f14 = ktVar.e;
                            int i52 = (int) ((L6 - f14) + max);
                            org.telegram.ui.ActionBar.k1 k1Var2 = ktVar.k;
                            iVar12 = ktVar.z;
                            iVar13 = ktVar.z;
                            k1Var2.showAtLocation(iVar12, 0, (int) ((iVar13.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i52);
                            org.telegram.ui.ActionBar.k1.i(actionBarPopupWindow$ActionBarPopupWindowLayout);
                            try {
                                iVar14 = ktVar.z;
                                iVar14.performHapticFeedback(0);
                            } catch (Exception unused5) {
                            }
                            f15 = ktVar.e;
                            if (f15 != 0.0f) {
                                f16 = ktVar.e;
                                ktVar.f = f16;
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                final int i53 = 1;
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.zs
                                    public final /* synthetic */ ft b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        switch (i53) {
                                            case 0:
                                                kt ktVar2 = this.b.a;
                                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                ktVar2.g = floatValue;
                                                float f20 = ktVar2.f;
                                                ktVar2.e = c3.i0.z(0.0f, f20, floatValue, f20);
                                                ktVar2.z.invalidate();
                                                break;
                                            case 1:
                                                kt ktVar3 = this.b.a;
                                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                ktVar3.g = floatValue2;
                                                float f21 = ktVar3.f;
                                                ktVar3.e = c3.i0.z(0.0f, f21, floatValue2, f21);
                                                ktVar3.z.invalidate();
                                                break;
                                            default:
                                                kt ktVar4 = this.b.a;
                                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                ktVar4.g = floatValue3;
                                                float f22 = ktVar4.f;
                                                ktVar4.e = c3.i0.z(0.0f, f22, floatValue3, f22);
                                                ktVar4.z.invalidate();
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
                    htVar = ktVar.l;
                    if (htVar != null) {
                        ArrayList arrayList11 = new ArrayList();
                        ArrayList arrayList12 = new ArrayList();
                        ArrayList arrayList13 = new ArrayList();
                        htVar2 = ktVar.l;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout10 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                        i13 = ktVar.V;
                        if (htVar2.k(i13)) {
                            htVar7 = ktVar.l;
                            if (!htVar7.c()) {
                                org.telegram.ui.Cells.f1.r(2131745640, arrayList11, arrayList13, valueOf4);
                                arrayList12.add(0);
                            }
                        }
                        htVar3 = ktVar.l;
                        i14 = ktVar.V;
                        if (htVar3.k(i14)) {
                            htVar6 = ktVar.l;
                            if (!htVar6.c()) {
                                org.telegram.ui.Cells.f1.r(2131745600, arrayList11, arrayList13, valueOf3);
                                arrayList12.add(4);
                            }
                        }
                        htVar4 = ktVar.l;
                        if (htVar4.b()) {
                            org.telegram.ui.Cells.f1.r(2131745877, arrayList11, arrayList13, valueOf2);
                            arrayList12.add(3);
                        }
                        document = ktVar.W;
                        if (document != null) {
                            htVar5 = ktVar.l;
                            document4 = ktVar.W;
                            if (htVar5.e(document4)) {
                                arrayList12.add(org.telegram.ui.Cells.f1.m(2131754485, arrayList11, R.drawable.outline_caption_24, arrayList13, 11));
                            }
                        }
                        document2 = ktVar.W;
                        if (document2 != null) {
                            i16 = ktVar.r;
                            org.telegram.messenger.vi b04 = org.telegram.messenger.vi.b0(i16);
                            document3 = ktVar.W;
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
                                arrayList11.add(org.telegram.messenger.dd.Y(2131751599, "Delete", new Object[0]));
                                arrayList13.add(valueOf5);
                                arrayList12.add(1);
                            } else {
                                arrayList11.add(org.telegram.messenger.dd.Y(2131745947, "SaveToGIFs", new Object[0]));
                                arrayList13.add(Integer.valueOf(R.drawable.msg_gif_add));
                                arrayList12.add(2);
                            }
                        } else {
                            z10 = false;
                        }
                        if (arrayList11.isEmpty()) {
                            return;
                        }
                        ktVar.K = true;
                        iVar = ktVar.z;
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
                            p6Var = ktVar.c0;
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
                        et etVar = new et(this, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                        ktVar.k = etVar;
                        etVar.e = true;
                        etVar.c = org.telegram.messenger.at.g2;
                        etVar.g = true;
                        etVar.setOutsideTouchable(true);
                        ktVar.k.setClippingEnabled(true);
                        ktVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                        ktVar.k.setFocusable(true);
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31));
                        ktVar.k.setInputMethodMode(2);
                        ktVar.k.getContentView().setFocusableInTouchMode(true);
                        cVar = ktVar.q;
                        int i57 = cVar.d;
                        cVar2 = ktVar.q;
                        int i58 = i57 + cVar2.b;
                        cVar3 = ktVar.q;
                        int i59 = cVar3.b;
                        iVar2 = ktVar.z;
                        int width6 = iVar2.getWidth();
                        iVar3 = ktVar.z;
                        int min5 = Math.min(width6, iVar3.getHeight() - i58) - org.telegram.messenger.i0.L(40.0f);
                        f7 = ktVar.e;
                        int i60 = min5 / 2;
                        int i61 = i59 + i60;
                        int L7 = ktVar.G != null ? org.telegram.messenger.i0.L(40.0f) : 0;
                        iVar4 = ktVar.z;
                        float max2 = (int) (f7 + Math.max(i61 + L7, ((iVar4.getHeight() - i58) - ktVar.I) / 2) + i60);
                        float L8 = org.telegram.messenger.i0.L(24.0f);
                        f10 = ktVar.e;
                        int i62 = (int) ((L8 - f10) + max2);
                        org.telegram.ui.ActionBar.k1 k1Var3 = ktVar.k;
                        iVar5 = ktVar.z;
                        iVar6 = ktVar.z;
                        i15 = 0;
                        k1Var3.showAtLocation(iVar5, 0, (int) ((iVar6.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth()) / 2.0f), i62);
                        try {
                            iVar7 = ktVar.z;
                            iVar7.performHapticFeedback(0);
                        } catch (Exception unused6) {
                        }
                        f11 = ktVar.e;
                        if (f11 != 0.0f) {
                            f12 = ktVar.e;
                            ktVar.f = f12;
                            final int i63 = 2;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.zs
                                public final /* synthetic */ ft b;

                                {
                                    this.b = this;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (i63) {
                                        case 0:
                                            kt ktVar2 = this.b.a;
                                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            ktVar2.g = floatValue;
                                            float f20 = ktVar2.f;
                                            ktVar2.e = c3.i0.z(0.0f, f20, floatValue, f20);
                                            ktVar2.z.invalidate();
                                            break;
                                        case 1:
                                            kt ktVar3 = this.b.a;
                                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            ktVar3.g = floatValue2;
                                            float f21 = ktVar3.f;
                                            ktVar3.e = c3.i0.z(0.0f, f21, floatValue2, f21);
                                            ktVar3.z.invalidate();
                                            break;
                                        default:
                                            kt ktVar4 = this.b.a;
                                            float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            ktVar4.g = floatValue3;
                                            float f22 = ktVar4.f;
                                            ktVar4.e = c3.i0.z(0.0f, f22, floatValue3, f22);
                                            ktVar4.z.invalidate();
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
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout42 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, ktVar.z.getContext(), ktVar.c0);
        org.telegram.ui.ActionBar.p6 p6Var42 = null;
        vg.f c102 = bVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout42, null, true);
        c102.o(w7.b9.k(ktVar.c0));
        org.telegram.messenger.a30.u(c102, org.telegram.messenger.i0.L(12.0f), 8.0f);
        c102.P.e = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout42.setBackground(c102);
        if (ktVar.V != 3) {
        }
        i15 = 0;
        i28 = i15;
        while (i28 < actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount()) {
        }
    }
}
