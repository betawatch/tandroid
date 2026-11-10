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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class js implements Runnable {
    public final /* synthetic */ ns a;

    public js(ns nsVar) {
        this.a = nsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x06cc, code lost:
    
        if (org.telegram.messenger.ij.v4(r0) != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0a09, code lost:
    
        if (org.telegram.messenger.ij.v4(r6) != false) goto L228;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:225:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0e55  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        int i10;
        int i11;
        ls lsVar;
        ls lsVar2;
        int i12;
        ls lsVar3;
        int i13;
        ls lsVar4;
        TLRPC.Document document;
        TLRPC.Document document2;
        boolean z9;
        bi.x5 x5Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        i0.b bVar;
        i0.b bVar2;
        i0.b bVar3;
        bi.x5 x5Var2;
        bi.x5 x5Var3;
        float f10;
        bi.x5 x5Var4;
        float f11;
        bi.x5 x5Var5;
        bi.x5 x5Var6;
        int i14;
        float f12;
        float f13;
        bi.x5 x5Var7;
        org.telegram.ui.ActionBar.h6 h6Var;
        int i15;
        TLRPC.Document document3;
        ls lsVar5;
        TLRPC.Document document4;
        ls lsVar6;
        ls lsVar7;
        ls lsVar8;
        ls lsVar9;
        int i16;
        ls lsVar10;
        TLRPC.Document document5;
        ls lsVar11;
        TLRPC.Document document6;
        ls lsVar12;
        TLRPC.Document document7;
        int i17;
        TLRPC.Document document8;
        TLRPC.Document document9;
        bi.x5 x5Var8;
        i0.b bVar4;
        i0.b bVar5;
        i0.b bVar6;
        bi.x5 x5Var9;
        bi.x5 x5Var10;
        float f14;
        bi.x5 x5Var11;
        float f15;
        bi.x5 x5Var12;
        bi.x5 x5Var13;
        float f16;
        float f17;
        bi.x5 x5Var14;
        org.telegram.ui.ActionBar.h6 h6Var2;
        TLRPC.Document document10;
        int i18;
        TLRPC.Document document11;
        TLRPC.Document document12;
        int i19;
        TLRPC.Document document13;
        ls lsVar13;
        boolean z10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        TLRPC.Document document14;
        ls lsVar14;
        boolean z11;
        bi.x5 x5Var15;
        i0.b bVar7;
        i0.b bVar8;
        i0.b bVar9;
        int i20;
        bi.x5 x5Var16;
        bi.x5 x5Var17;
        float min;
        int i21;
        bi.x5 x5Var18;
        bi.x5 x5Var19;
        float f18;
        bi.x5 x5Var20;
        bi.x5 x5Var21;
        bi.x5 x5Var22;
        bi.x5 x5Var23;
        bi.x5 x5Var24;
        bi.x5 x5Var25;
        org.telegram.ui.ActionBar.h6 h6Var3;
        TLRPC.Document document15;
        int i22;
        ls lsVar15;
        ls lsVar16;
        ls lsVar17;
        ls lsVar18;
        TLRPC.InputStickerSet inputStickerSet;
        ls lsVar19;
        int i23;
        TLRPC.Document document16;
        ls lsVar20;
        int i24;
        ls lsVar21;
        int i25;
        ls lsVar22;
        ls lsVar23;
        ls lsVar24;
        ls lsVar25;
        int i26;
        bi.x5 x5Var26;
        bi.x5 x5Var27;
        int i27;
        g61 g61Var;
        i0.b bVar10;
        i0.b bVar11;
        i0.b bVar12;
        bi.x5 x5Var28;
        bi.x5 x5Var29;
        float f19;
        bi.x5 x5Var30;
        bi.x5 x5Var31;
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        View view7;
        View view8;
        bi.x5 x5Var32;
        org.telegram.ui.Components.k60 m10;
        TLRPC.Document unused;
        Integer valueOf = Integer.valueOf(R.drawable.msg_smile_status);
        Integer valueOf2 = Integer.valueOf(R.drawable.msg_autodelete);
        Integer valueOf3 = Integer.valueOf(R.drawable.input_notify_off);
        Integer valueOf4 = Integer.valueOf(R.drawable.msg_send);
        Integer valueOf5 = Integer.valueOf(R.drawable.msg_delete);
        ns nsVar = this.a;
        dh.c cVar = nsVar.t;
        if (nsVar.w == null || nsVar.m) {
            return;
        }
        nsVar.R = true;
        ls lsVar26 = nsVar.l;
        if (lsVar26 != null && (m10 = lsVar26.m(nsVar.z)) != null) {
            m10.Q(cVar, c8.g0.k(nsVar.c0), true);
            m10.t = false;
            m10.Y();
            m10.p = new dh(this, 16);
            ViewGroup viewGroup = m10.A;
            es esVar = new es(this, viewGroup);
            nsVar.k = esVar;
            esVar.e = true;
            esVar.c = org.telegram.messenger.qs.g2;
            esVar.g = true;
            esVar.setOutsideTouchable(true);
            nsVar.k.setClippingEnabled(true);
            nsVar.k.setAnimationStyle(R.style.PopupContextAnimation);
            nsVar.k.setFocusable(true);
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
            nsVar.k.setInputMethodMode(2);
            nsVar.k.getContentView().setFocusableInTouchMode(true);
            i0.b bVar13 = nsVar.q;
            int min2 = (Math.min(nsVar.z.getWidth(), nsVar.z.getHeight() - (bVar13.d + bVar13.b)) - org.telegram.messenger.g0.L(40.0f)) / 2;
            int L = (int) ((org.telegram.messenger.g0.L(24.0f) - nsVar.e) + ((int) (nsVar.e + Math.max(r2 + min2 + (nsVar.G != null ? org.telegram.messenger.g0.L(40.0f) : 0), ((nsVar.z.getHeight() - r3) - nsVar.I) / 2) + min2)));
            nsVar.k.showAtLocation(nsVar.z, 0, (int) ((r4.getMeasuredWidth() - viewGroup.getMeasuredWidth()) / 2.0f), L);
            try {
                nsVar.z.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            float f20 = nsVar.e;
            if (f20 != 0.0f) {
                nsVar.f = f20;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                final int i28 = 0;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ds
                    public final /* synthetic */ js b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i28) {
                            case 0:
                                ns nsVar2 = this.b.a;
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                nsVar2.g = floatValue;
                                float f21 = nsVar2.f;
                                nsVar2.e = com.google.android.recaptcha.internal.a.z(0.0f, f21, floatValue, f21);
                                nsVar2.z.invalidate();
                                break;
                            case 1:
                                ns nsVar3 = this.b.a;
                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                nsVar3.g = floatValue2;
                                float f22 = nsVar3.f;
                                nsVar3.e = com.google.android.recaptcha.internal.a.z(0.0f, f22, floatValue2, f22);
                                nsVar3.z.invalidate();
                                break;
                            default:
                                ns nsVar4 = this.b.a;
                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                nsVar4.g = floatValue3;
                                float f23 = nsVar4.f;
                                nsVar4.e = com.google.android.recaptcha.internal.a.z(0.0f, f23, floatValue3, f23);
                                nsVar4.z.invalidate();
                                break;
                        }
                    }
                });
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(org.telegram.ui.Components.wq.f);
                ofFloat.start();
            }
            nsVar.K = true;
            return;
        }
        int i29 = 0;
        if (nsVar.V != 3) {
            ls lsVar27 = nsVar.l;
            if (lsVar27 != null) {
                TLRPC.TL_messageMediaPoll d = lsVar27.d();
                TLRPC.PollAnswer g10 = nsVar.l.g();
                if (d != null && d.poll != null && g10 != null) {
                    TLRPC.PollAnswerVoters E1 = org.telegram.messenger.ij.E1(d, g10.option);
                    if (E1 != null && E1.voters > 0) {
                        org.telegram.messenger.ij.A(d);
                    }
                }
            }
            i7 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i7, nsVar.z.getContext(), nsVar.c0);
            org.telegram.ui.ActionBar.h6 h6Var4 = null;
            fh.g c10 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout3, null, true);
            c10.p(c8.g0.k(nsVar.c0));
            org.telegram.messenger.camera.q.p(c10, org.telegram.messenger.g0.L(12.0f), 8.0f);
            c10.Q.e = true;
            actionBarPopupWindow$ActionBarPopupWindowLayout3.setBackground(c10);
            if (nsVar.V != 3) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = nsVar.T;
                int i30 = R.drawable.menu_sticker_add;
                if (tL_messages_stickerSet == null) {
                    ls lsVar28 = nsVar.l;
                    if (lsVar28 == null || !lsVar28.B()) {
                        if (nsVar.l.y()) {
                            arrayList.add(org.telegram.messenger.id.M0(2131745588, null));
                            arrayList3.add(valueOf4);
                            arrayList2.add(0);
                        }
                        org.telegram.ui.Cells.f1.t(null, 2131754374, arrayList, R.drawable.msg_fave, arrayList3);
                        arrayList2.add(1);
                    } else {
                        org.telegram.ui.Cells.f1.t(null, 2131745524, arrayList, R.drawable.menu_sticker_add, arrayList3);
                        arrayList2.add(0);
                    }
                }
                ls lsVar29 = nsVar.l;
                if (lsVar29 == null || !lsVar29.B()) {
                    ls lsVar30 = nsVar.l;
                    arrayList.add(org.telegram.messenger.id.M0((lsVar30 == null || !lsVar30.J()) ? 2131754370 : 2131744849, null));
                    ls lsVar31 = nsVar.l;
                    if (lsVar31 != null && lsVar31.J()) {
                        i30 = R.drawable.msg_replace;
                    }
                    arrayList3.add(Integer.valueOf(i30));
                    arrayList2.add(2);
                }
                int i31 = 7;
                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, nsVar.w, nsVar.c0, true, false);
                z0Var.setItemHeight(44);
                z0Var.j(org.telegram.messenger.id.M0(2131753756, null), R.drawable.msg_arrow_back, null);
                z0Var.getTextView().setPadding(org.telegram.messenger.id.a0 ? 0 : org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0);
                FrameLayout frameLayout = new FrameLayout(nsVar.z.getContext());
                LinearLayout linearLayout = new LinearLayout(nsVar.z.getContext());
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.G8, linearLayout, nsVar.c0);
                linearLayout.setOrientation(1);
                if (nsVar.w == null) {
                    g61Var = null;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new TLRPC.TL_stickerSetNoCovered());
                    TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = new TLRPC.TL_messages_getMyStickers();
                    tL_messages_getMyStickers.limit = 100;
                    ConnectionsManager.getInstance(nsVar.r).sendRequest(tL_messages_getMyStickers, new z9(nsVar, arrayList4, tL_messages_getMyStickers, i31));
                    g61Var = new g61(8, nsVar.w, h6Var4);
                    g61Var.setLayoutManager(new v4.b0());
                    g61Var.i(new fi.o1(arrayList4, 4));
                    g61Var.setAdapter(new ks(nsVar, arrayList4));
                }
                g61Var.setOnItemClickListener(new h(this, 6));
                frameLayout.addView(z0Var);
                linearLayout.addView(frameLayout);
                linearLayout.addView(new org.telegram.ui.ActionBar.d1(nsVar.z.getContext(), nsVar.c0), c8.ha.o(-1, 8));
                di.d0 d0Var = new di.d0(this, arrayList2, g61Var, linearLayout, actionBarPopupWindow$ActionBarPopupWindowLayout3, 13);
                for (int i32 = 0; i32 < arrayList.size(); i32++) {
                    org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, ((Integer) arrayList3.get(i32)).intValue(), (CharSequence) arrayList.get(i32), false, nsVar.c0);
                    c11.setTag(Integer.valueOf(i32));
                    c11.setOnClickListener(d0Var);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout3.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                linearLayout.addView(g61Var, new LinearLayout.LayoutParams(actionBarPopupWindow$ActionBarPopupWindowLayout3.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f), (int) (actionBarPopupWindow$ActionBarPopupWindowLayout3.getMeasuredHeight() * 1.5f)));
                actionBarPopupWindow$ActionBarPopupWindowLayout3.b(linearLayout);
                frameLayout.setOnClickListener(new df(actionBarPopupWindow$ActionBarPopupWindowLayout3, 2));
                bVar10 = nsVar.q;
                int i33 = bVar10.d;
                bVar11 = nsVar.q;
                int i34 = i33 + bVar11.b;
                bVar12 = nsVar.q;
                int i35 = bVar12.b;
                x5Var28 = nsVar.z;
                int width = x5Var28.getWidth();
                x5Var29 = nsVar.z;
                int min3 = (int) (Math.min(width, x5Var29.getHeight() - i34) / 1.8f);
                f19 = nsVar.e;
                x5Var30 = nsVar.z;
                int L2 = org.telegram.messenger.g0.L(84.0f) + ((int) (f19 + Math.max(i35 + r3, ((x5Var30.getHeight() - i34) - nsVar.I) / 2) + (min3 / 2)));
                x5Var31 = nsVar.z;
                x5Var31.addView(actionBarPopupWindow$ActionBarPopupWindowLayout3, c8.ha.d(-2, -2.0f, 49, 0.0f, L2 / org.telegram.messenger.g0.p, 0.0f, 0.0f));
                nsVar.L = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                view = nsVar.L;
                view.setTranslationY(-org.telegram.messenger.g0.L(12.0f));
                view2 = nsVar.L;
                view2.setAlpha(0.0f);
                view3 = nsVar.L;
                view3.setScaleX(0.8f);
                view4 = nsVar.L;
                view4.setScaleY(0.8f);
                view5 = nsVar.L;
                view5.setPivotY(0.0f);
                view6 = nsVar.L;
                view7 = nsVar.L;
                view6.setPivotX(view7.getMeasuredWidth() / 2.0f);
                view8 = nsVar.L;
                view8.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.wq.h).start();
                if (nsVar.P == null) {
                    org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.kb(nsVar, nsVar.z.getContext(), org.telegram.messenger.p10.s0, nsVar.c0);
                    nsVar.P = kbVar;
                    kbVar.N0 = true;
                    kbVar.setPadding(0, org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f));
                    nsVar.P.setClipChildren(false);
                    nsVar.P.setClipToPadding(false);
                    nsVar.P.setVisibility(0);
                    nsVar.P.setHint(org.telegram.messenger.id.M0(2131744848, null));
                    nsVar.P.setBubbleOffset(-org.telegram.messenger.g0.L(105.0f));
                    nsVar.P.setMiniBubblesOffset(-org.telegram.messenger.g0.L(14.0f));
                    FrameLayout frameLayout2 = new FrameLayout(nsVar.z.getContext());
                    nsVar.Q = frameLayout2;
                    frameLayout2.addView(nsVar.P, c8.ha.d(-2, 116.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                    nsVar.z.addView(nsVar.Q, c8.ha.d(-2, -2.0f, 1, 0.0f, 100.0f, 0.0f, 0.0f));
                }
                nsVar.P.setSelectedEmojis(nsVar.o);
                nsVar.P.setDelegate(new bs(nsVar));
                nsVar.P.p(null, null, false);
                nsVar.Q.setScaleY(0.6f);
                nsVar.Q.setScaleX(0.6f);
                nsVar.Q.setAlpha(0.0f);
                org.telegram.messenger.g0.i3(new as(nsVar, 2), 10L);
                nsVar.K = true;
                x5Var32 = nsVar.z;
                x5Var32.invalidate();
                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout3;
            } else {
                int i36 = 1;
                i10 = nsVar.V;
                int i37 = R.drawable.msg_unfave;
                if (i10 == 0) {
                    document12 = nsVar.W;
                    if (org.telegram.messenger.ij.X3(document12)) {
                        i26 = nsVar.r;
                        if (!org.telegram.messenger.c.a(i26).d().q()) {
                            if (nsVar.O == null) {
                                k0 k0Var = new k0(nsVar.z.getContext(), nsVar.c0);
                                nsVar.O = k0Var;
                                nsVar.z.addView(k0Var, c8.ha.c(-1.0f, -1));
                                nsVar.O.setOnClickListener(new cs(nsVar, i29));
                                ((ug.p0) nsVar.O.b).w.setOnClickListener(new cs(nsVar, i36));
                            }
                            org.telegram.messenger.g0.Z3(nsVar.O, false, 1.0f, true, false);
                            org.telegram.messenger.g0.X3(nsVar.O, true);
                            nsVar.O.setTranslationY(0.0f);
                            nsVar.K = true;
                            x5Var26 = nsVar.z;
                            x5Var26.invalidate();
                            try {
                                x5Var27 = nsVar.z;
                                x5Var27.performHapticFeedback(0);
                                return;
                            } catch (Exception unused3) {
                                return;
                            }
                        }
                    }
                    i19 = nsVar.r;
                    org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i19);
                    document13 = nsVar.W;
                    boolean A0 = b02.A0(document13);
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    lsVar13 = nsVar.l;
                    if (lsVar13 != null) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                        lsVar20 = nsVar.l;
                        z10 = A0;
                        i24 = nsVar.V;
                        if (lsVar20.k(i24)) {
                            lsVar25 = nsVar.l;
                            if (!lsVar25.c()) {
                                org.telegram.ui.Cells.f1.q(2131745588, arrayList5, arrayList7, valueOf4);
                                arrayList6.add(0);
                            }
                        }
                        lsVar21 = nsVar.l;
                        i25 = nsVar.V;
                        if (lsVar21.k(i25)) {
                            lsVar24 = nsVar.l;
                            if (!lsVar24.c()) {
                                arrayList5.add(org.telegram.messenger.id.L0(2131745583));
                                arrayList7.add(valueOf3);
                                arrayList6.add(6);
                            }
                        }
                        lsVar22 = nsVar.l;
                        if (lsVar22.b()) {
                            org.telegram.ui.Cells.f1.q(2131745860, arrayList5, arrayList7, valueOf2);
                            arrayList6.add(3);
                        }
                        lsVar23 = nsVar.l;
                        if (lsVar23.f()) {
                            org.telegram.ui.Cells.f1.q(2131749227, arrayList5, arrayList7, valueOf5);
                            arrayList6.add(5);
                        }
                    } else {
                        z10 = A0;
                        actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                    }
                    document14 = nsVar.W;
                    if (!org.telegram.messenger.ij.E3(document14)) {
                        if (!z10) {
                            i23 = nsVar.r;
                            if (org.telegram.messenger.ui.b0(i23).s()) {
                                document16 = nsVar.W;
                            }
                        }
                        arrayList5.add(z10 ? org.telegram.messenger.id.L0(2131751538) : org.telegram.messenger.id.L0(2131754374));
                        if (!z10) {
                            i37 = R.drawable.msg_fave;
                        }
                        arrayList7.add(Integer.valueOf(i37));
                        arrayList6.add(2);
                    }
                    lsVar14 = nsVar.l;
                    if (lsVar14 != null && (inputStickerSet = nsVar.a0) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                        lsVar19 = nsVar.l;
                        if (lsVar19.Q()) {
                            arrayList5.add(org.telegram.messenger.id.Z(2131743548, new Object[0]));
                            arrayList7.add(Integer.valueOf(R.drawable.msg_media));
                            arrayList6.add(1);
                        }
                    }
                    if (nsVar.p) {
                        org.telegram.ui.Cells.f1.q(2131751537, arrayList5, arrayList7, valueOf5);
                        arrayList6.add(4);
                    }
                    if (nsVar.a0 != null) {
                        document15 = nsVar.W;
                        if (document15 != null) {
                            i22 = nsVar.r;
                            z11 = true;
                            TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(i22).m0(nsVar.a0, true);
                            if (m0 != null) {
                                lsVar17 = nsVar.l;
                                if (lsVar17 != null) {
                                    lsVar18 = nsVar.l;
                                    if (lsVar18.D()) {
                                        TLRPC.StickerSet stickerSet = m0.set;
                                        if (!stickerSet.emojis && !stickerSet.masks) {
                                            arrayList6.add(org.telegram.ui.Cells.f1.j(2131751223, arrayList5, R.drawable.msg_edit, arrayList7, 7));
                                        }
                                    }
                                }
                            }
                            if (m0 != null && m0.set.creator) {
                                lsVar15 = nsVar.l;
                                if (lsVar15 != null) {
                                    lsVar16 = nsVar.l;
                                    unused = nsVar.W;
                                    if (lsVar16.I()) {
                                        arrayList5.add(org.telegram.messenger.id.L0(2131751495));
                                        arrayList7.add(valueOf5);
                                        arrayList6.add(8);
                                    }
                                }
                            }
                            if (!arrayList5.isEmpty()) {
                                return;
                            }
                            nsVar.K = true;
                            x5Var15 = nsVar.z;
                            x5Var15.invalidate();
                            fs fsVar = new fs(this, arrayList6, z10);
                            actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                            ns.g(nsVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            for (int i38 = 0; i38 < arrayList5.size(); i38++) {
                                int intValue = ((Integer) arrayList7.get(i38)).intValue();
                                CharSequence charSequence = (CharSequence) arrayList5.get(i38);
                                h6Var3 = nsVar.c0;
                                org.telegram.ui.ActionBar.z0 c12 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, intValue, charSequence, false, h6Var3);
                                c12.setTag(Integer.valueOf(i38));
                                c12.setOnClickListener(fsVar);
                                if (((Integer) arrayList6.get(i38)).intValue() == 8) {
                                    int i39 = org.telegram.ui.ActionBar.m6.q7;
                                    c12.c(i39, i39);
                                    c12.h(0.1f, i39);
                                }
                            }
                            gs gsVar = new gs(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            nsVar.k = gsVar;
                            gsVar.e = true;
                            gsVar.c = 100;
                            gsVar.g = true;
                            gsVar.setOutsideTouchable(z11);
                            nsVar.k.setClippingEnabled(z11);
                            nsVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                            nsVar.k.setFocusable(z11);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                            nsVar.k.setInputMethodMode(2);
                            nsVar.k.getContentView().setFocusableInTouchMode(z11);
                            bVar7 = nsVar.q;
                            int i40 = bVar7.d;
                            bVar8 = nsVar.q;
                            int i41 = i40 + bVar8.b;
                            bVar9 = nsVar.q;
                            int i42 = bVar9.b;
                            i20 = nsVar.V;
                            if (i20 == z11) {
                                x5Var24 = nsVar.z;
                                int width2 = x5Var24.getWidth();
                                x5Var25 = nsVar.z;
                                i21 = Math.min(width2, x5Var25.getHeight() - i41) - org.telegram.messenger.g0.L(40.0f);
                            } else {
                                if (nsVar.S) {
                                    x5Var18 = nsVar.z;
                                    int width3 = x5Var18.getWidth();
                                    x5Var19 = nsVar.z;
                                    min = Math.min(width3, x5Var19.getHeight() - i41) - org.telegram.messenger.g0.N(40.0f);
                                } else {
                                    x5Var16 = nsVar.z;
                                    int width4 = x5Var16.getWidth();
                                    x5Var17 = nsVar.z;
                                    min = Math.min(width4, x5Var17.getHeight() - i41) / 1.8f;
                                }
                                i21 = (int) min;
                            }
                            f18 = nsVar.e;
                            int i43 = i21 / 2;
                            int L3 = i42 + i43 + (nsVar.G != null ? org.telegram.messenger.g0.L(40.0f) : 0);
                            x5Var20 = nsVar.z;
                            int L4 = org.telegram.messenger.g0.L(24.0f) + ((int) (f18 + Math.max(L3, ((x5Var20.getHeight() - i41) - nsVar.I) / 2) + i43));
                            if (nsVar.S) {
                                L4 += org.telegram.messenger.g0.L(24.0f);
                            }
                            org.telegram.ui.ActionBar.g1 g1Var = nsVar.k;
                            x5Var21 = nsVar.z;
                            x5Var22 = nsVar.z;
                            g1Var.showAtLocation(x5Var21, 0, (int) ((x5Var22.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), L4);
                            try {
                                x5Var23 = nsVar.z;
                                x5Var23.performHapticFeedback(0);
                            } catch (Exception unused4) {
                            }
                        }
                    }
                    z11 = true;
                    if (!arrayList5.isEmpty()) {
                    }
                } else {
                    i11 = nsVar.V;
                    if (i11 == 2) {
                        lsVar8 = nsVar.l;
                        if (lsVar8 != null) {
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = new ArrayList();
                            lsVar9 = nsVar.l;
                            i16 = nsVar.V;
                            if (lsVar9.k(i16)) {
                                org.telegram.ui.Cells.f1.q(2131745626, arrayList8, arrayList10, valueOf4);
                                arrayList9.add(0);
                            }
                            lsVar10 = nsVar.l;
                            document5 = nsVar.W;
                            Boolean P = lsVar10.P(document5);
                            if (P != null) {
                                if (P.booleanValue()) {
                                    org.telegram.ui.Cells.f1.q(2131745546, arrayList8, arrayList10, valueOf);
                                    arrayList9.add(1);
                                } else {
                                    org.telegram.ui.Cells.f1.q(2131746288, arrayList8, arrayList10, valueOf);
                                    arrayList9.add(2);
                                }
                            }
                            lsVar11 = nsVar.l;
                            document6 = nsVar.W;
                            if (lsVar11.E(document6)) {
                                arrayList8.add(org.telegram.messenger.id.L0(2131751764));
                                arrayList10.add(Integer.valueOf(R.drawable.msg_copy));
                                arrayList9.add(3);
                            }
                            lsVar12 = nsVar.l;
                            document7 = nsVar.W;
                            if (lsVar12.N(document7)) {
                                org.telegram.ui.Cells.f1.q(2131746311, arrayList8, arrayList10, valueOf5);
                                arrayList9.add(4);
                            }
                            i17 = nsVar.r;
                            org.telegram.messenger.ui b03 = org.telegram.messenger.ui.b0(i17);
                            document8 = nsVar.W;
                            boolean A02 = b03.A0(document8);
                            document9 = nsVar.W;
                            if (!org.telegram.messenger.ij.H2(document9)) {
                                document10 = nsVar.W;
                                if (!org.telegram.messenger.ij.E3(document10)) {
                                    if (!A02) {
                                        i18 = nsVar.r;
                                        if (org.telegram.messenger.ui.b0(i18).s()) {
                                            document11 = nsVar.W;
                                        }
                                    }
                                    arrayList8.add(A02 ? org.telegram.messenger.id.L0(2131751538) : org.telegram.messenger.id.L0(2131754374));
                                    arrayList10.add(Integer.valueOf(A02 ? R.drawable.msg_unfave : R.drawable.msg_fave));
                                    arrayList9.add(5);
                                }
                            }
                            if (arrayList8.isEmpty()) {
                                return;
                            }
                            nsVar.K = true;
                            x5Var8 = nsVar.z;
                            x5Var8.invalidate();
                            int[] iArr = new int[arrayList10.size()];
                            for (int i44 = 0; i44 < arrayList10.size(); i44++) {
                                iArr[i44] = ((Integer) arrayList10.get(i44)).intValue();
                            }
                            org.telegram.ui.Components.ka0 ka0Var = new org.telegram.ui.Components.ka0(this, arrayList9, A02);
                            boolean g11 = ns.g(nsVar, actionBarPopupWindow$ActionBarPopupWindowLayout3);
                            int i45 = 0;
                            while (i45 < arrayList8.size()) {
                                boolean z12 = !g11 && i45 == 0;
                                boolean z13 = i45 == arrayList8.size() + (-1);
                                int intValue2 = ((Integer) arrayList10.get(i45)).intValue();
                                CharSequence charSequence2 = (CharSequence) arrayList8.get(i45);
                                h6Var2 = nsVar.c0;
                                org.telegram.ui.ActionBar.z0 c13 = org.telegram.ui.ActionBar.r0.c(z12, z13, actionBarPopupWindow$ActionBarPopupWindowLayout3, intValue2, charSequence2, false, h6Var2);
                                if (((Integer) arrayList9.get(i45)).intValue() == 4) {
                                    c13.c(org.telegram.ui.ActionBar.m6.q7, org.telegram.ui.ActionBar.m6.p7);
                                }
                                c13.setTag(Integer.valueOf(i45));
                                c13.setOnClickListener(ka0Var);
                                i45++;
                            }
                            hs hsVar = new hs(this, actionBarPopupWindow$ActionBarPopupWindowLayout3);
                            nsVar.k = hsVar;
                            hsVar.e = true;
                            hsVar.c = org.telegram.messenger.qs.g2;
                            hsVar.g = true;
                            hsVar.setOutsideTouchable(true);
                            nsVar.k.setClippingEnabled(true);
                            nsVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                            nsVar.k.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout3.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                            nsVar.k.setInputMethodMode(2);
                            nsVar.k.getContentView().setFocusableInTouchMode(true);
                            bVar4 = nsVar.q;
                            int i46 = bVar4.d;
                            bVar5 = nsVar.q;
                            int i47 = i46 + bVar5.b;
                            bVar6 = nsVar.q;
                            int i48 = bVar6.b;
                            x5Var9 = nsVar.z;
                            int width5 = x5Var9.getWidth();
                            x5Var10 = nsVar.z;
                            int min4 = Math.min(width5, x5Var10.getHeight() - i47) - org.telegram.messenger.g0.L(40.0f);
                            f14 = nsVar.e;
                            int i49 = min4 / 2;
                            int L5 = i48 + i49 + (nsVar.G != null ? org.telegram.messenger.g0.L(40.0f) : 0);
                            x5Var11 = nsVar.z;
                            float max = (int) (f14 + Math.max(L5, ((x5Var11.getHeight() - i47) - nsVar.I) / 2) + i49);
                            float L6 = org.telegram.messenger.g0.L(24.0f);
                            f15 = nsVar.e;
                            int i50 = (int) ((L6 - f15) + max);
                            org.telegram.ui.ActionBar.g1 g1Var2 = nsVar.k;
                            x5Var12 = nsVar.z;
                            x5Var13 = nsVar.z;
                            g1Var2.showAtLocation(x5Var12, 0, (int) ((x5Var13.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout3.getMeasuredWidth()) / 2.0f), i50);
                            org.telegram.ui.ActionBar.g1.i(actionBarPopupWindow$ActionBarPopupWindowLayout3);
                            try {
                                x5Var14 = nsVar.z;
                                x5Var14.performHapticFeedback(0);
                            } catch (Exception unused5) {
                            }
                            f16 = nsVar.e;
                            if (f16 != 0.0f) {
                                f17 = nsVar.e;
                                nsVar.f = f17;
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                final int i51 = 1;
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ds
                                    public final /* synthetic */ js b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        switch (i51) {
                                            case 0:
                                                ns nsVar2 = this.b.a;
                                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                nsVar2.g = floatValue;
                                                float f21 = nsVar2.f;
                                                nsVar2.e = com.google.android.recaptcha.internal.a.z(0.0f, f21, floatValue, f21);
                                                nsVar2.z.invalidate();
                                                break;
                                            case 1:
                                                ns nsVar3 = this.b.a;
                                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                nsVar3.g = floatValue2;
                                                float f22 = nsVar3.f;
                                                nsVar3.e = com.google.android.recaptcha.internal.a.z(0.0f, f22, floatValue2, f22);
                                                nsVar3.z.invalidate();
                                                break;
                                            default:
                                                ns nsVar4 = this.b.a;
                                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                nsVar4.g = floatValue3;
                                                float f23 = nsVar4.f;
                                                nsVar4.e = com.google.android.recaptcha.internal.a.z(0.0f, f23, floatValue3, f23);
                                                nsVar4.z.invalidate();
                                                break;
                                        }
                                    }
                                });
                                ofFloat2.setDuration(350L);
                                ofFloat2.setInterpolator(org.telegram.ui.Components.wq.f);
                                ofFloat2.start();
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                        }
                    }
                    lsVar = nsVar.l;
                    if (lsVar != null) {
                        ArrayList arrayList11 = new ArrayList();
                        ArrayList arrayList12 = new ArrayList();
                        ArrayList arrayList13 = new ArrayList();
                        lsVar2 = nsVar.l;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                        i12 = nsVar.V;
                        if (lsVar2.k(i12)) {
                            lsVar7 = nsVar.l;
                            if (!lsVar7.c()) {
                                org.telegram.ui.Cells.f1.q(2131745623, arrayList11, arrayList13, valueOf4);
                                arrayList12.add(0);
                            }
                        }
                        lsVar3 = nsVar.l;
                        i13 = nsVar.V;
                        if (lsVar3.k(i13)) {
                            lsVar6 = nsVar.l;
                            if (!lsVar6.c()) {
                                org.telegram.ui.Cells.f1.q(2131745583, arrayList11, arrayList13, valueOf3);
                                arrayList12.add(4);
                            }
                        }
                        lsVar4 = nsVar.l;
                        if (lsVar4.b()) {
                            org.telegram.ui.Cells.f1.q(2131745860, arrayList11, arrayList13, valueOf2);
                            arrayList12.add(3);
                        }
                        document = nsVar.W;
                        if (document != null) {
                            lsVar5 = nsVar.l;
                            document4 = nsVar.W;
                            if (lsVar5.e(document4)) {
                                arrayList12.add(org.telegram.ui.Cells.f1.j(2131754485, arrayList11, R.drawable.outline_caption_24, arrayList13, 11));
                            }
                        }
                        document2 = nsVar.W;
                        if (document2 != null) {
                            i15 = nsVar.r;
                            org.telegram.messenger.ui b04 = org.telegram.messenger.ui.b0(i15);
                            document3 = nsVar.W;
                            int i52 = 0;
                            while (true) {
                                if (i52 >= b04.i0.size()) {
                                    z9 = false;
                                    break;
                                }
                                TLRPC.Document document17 = (TLRPC.Document) b04.i0.get(i52);
                                if (document17.id == document3.id) {
                                    b04.i0.remove(i52);
                                    b04.i0.add(0, document17);
                                    z9 = true;
                                    break;
                                }
                                i52++;
                            }
                            if (z9) {
                                arrayList11.add(org.telegram.messenger.id.Y(2131751598, "Delete", new Object[0]));
                                arrayList13.add(valueOf5);
                                arrayList12.add(1);
                            } else {
                                arrayList11.add(org.telegram.messenger.id.Y(2131745930, "SaveToGIFs", new Object[0]));
                                arrayList13.add(Integer.valueOf(R.drawable.msg_gif_add));
                                arrayList12.add(2);
                            }
                        } else {
                            z9 = false;
                        }
                        if (arrayList11.isEmpty()) {
                            return;
                        }
                        nsVar.K = true;
                        x5Var = nsVar.z;
                        x5Var.invalidate();
                        int[] iArr2 = new int[arrayList13.size()];
                        for (int i53 = 0; i53 < arrayList13.size(); i53++) {
                            iArr2[i53] = ((Integer) arrayList13.get(i53)).intValue();
                        }
                        org.telegram.ui.Components.u41 u41Var = new org.telegram.ui.Components.u41(6, this, arrayList12);
                        int i54 = 0;
                        while (i54 < arrayList11.size()) {
                            int intValue3 = ((Integer) arrayList13.get(i54)).intValue();
                            CharSequence charSequence3 = (CharSequence) arrayList11.get(i54);
                            h6Var = nsVar.c0;
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                            org.telegram.ui.ActionBar.z0 c14 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, intValue3, charSequence3, false, h6Var);
                            c14.setTag(Integer.valueOf(i54));
                            c14.setOnClickListener(u41Var);
                            if (z9 && i54 == arrayList11.size() - 1) {
                                c14.c(org.telegram.ui.ActionBar.m6.q7, org.telegram.ui.ActionBar.m6.p7);
                            }
                            i54++;
                            actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout5;
                        }
                        actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                        is isVar = new is(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                        nsVar.k = isVar;
                        isVar.e = true;
                        isVar.c = org.telegram.messenger.qs.g2;
                        isVar.g = true;
                        isVar.setOutsideTouchable(true);
                        nsVar.k.setClippingEnabled(true);
                        nsVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                        nsVar.k.setFocusable(true);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                        nsVar.k.setInputMethodMode(2);
                        nsVar.k.getContentView().setFocusableInTouchMode(true);
                        bVar = nsVar.q;
                        int i55 = bVar.d;
                        bVar2 = nsVar.q;
                        int i56 = i55 + bVar2.b;
                        bVar3 = nsVar.q;
                        int i57 = bVar3.b;
                        x5Var2 = nsVar.z;
                        int width6 = x5Var2.getWidth();
                        x5Var3 = nsVar.z;
                        int min5 = Math.min(width6, x5Var3.getHeight() - i56) - org.telegram.messenger.g0.L(40.0f);
                        f10 = nsVar.e;
                        int i58 = min5 / 2;
                        int L7 = i57 + i58 + (nsVar.G != null ? org.telegram.messenger.g0.L(40.0f) : 0);
                        x5Var4 = nsVar.z;
                        float max2 = (int) (f10 + Math.max(L7, ((x5Var4.getHeight() - i56) - nsVar.I) / 2) + i58);
                        float L8 = org.telegram.messenger.g0.L(24.0f);
                        f11 = nsVar.e;
                        int i59 = (int) ((L8 - f11) + max2);
                        org.telegram.ui.ActionBar.g1 g1Var3 = nsVar.k;
                        x5Var5 = nsVar.z;
                        x5Var6 = nsVar.z;
                        i14 = 0;
                        g1Var3.showAtLocation(x5Var5, 0, (int) ((x5Var6.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i59);
                        try {
                            x5Var7 = nsVar.z;
                            x5Var7.performHapticFeedback(0);
                        } catch (Exception unused6) {
                        }
                        f12 = nsVar.e;
                        if (f12 != 0.0f) {
                            f13 = nsVar.e;
                            nsVar.f = f13;
                            final int i60 = 2;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ds
                                public final /* synthetic */ js b;

                                {
                                    this.b = this;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (i60) {
                                        case 0:
                                            ns nsVar2 = this.b.a;
                                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            nsVar2.g = floatValue;
                                            float f21 = nsVar2.f;
                                            nsVar2.e = com.google.android.recaptcha.internal.a.z(0.0f, f21, floatValue, f21);
                                            nsVar2.z.invalidate();
                                            break;
                                        case 1:
                                            ns nsVar3 = this.b.a;
                                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            nsVar3.g = floatValue2;
                                            float f22 = nsVar3.f;
                                            nsVar3.e = com.google.android.recaptcha.internal.a.z(0.0f, f22, floatValue2, f22);
                                            nsVar3.z.invalidate();
                                            break;
                                        default:
                                            ns nsVar4 = this.b.a;
                                            float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            nsVar4.g = floatValue3;
                                            float f23 = nsVar4.f;
                                            nsVar4.e = com.google.android.recaptcha.internal.a.z(0.0f, f23, floatValue3, f23);
                                            nsVar4.z.invalidate();
                                            break;
                                    }
                                }
                            });
                            ofFloat3.setDuration(350L);
                            ofFloat3.setInterpolator(org.telegram.ui.Components.wq.f);
                            ofFloat3.start();
                        }
                        i27 = i14;
                        while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i27);
                            if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                                ((org.telegram.ui.ActionBar.z0) childAt).n(i27 == 0 ? 1 : i14, i27 == actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() + (-1) ? 1 : i14);
                            }
                            i27++;
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                }
            }
            i14 = 0;
            i27 = i14;
            while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
            }
        }
        i7 = 1;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout32 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i7, nsVar.z.getContext(), nsVar.c0);
        org.telegram.ui.ActionBar.h6 h6Var42 = null;
        fh.g c102 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout32, null, true);
        c102.p(c8.g0.k(nsVar.c0));
        org.telegram.messenger.camera.q.p(c102, org.telegram.messenger.g0.L(12.0f), 8.0f);
        c102.Q.e = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout32.setBackground(c102);
        if (nsVar.V != 3) {
        }
        i14 = 0;
        i27 = i14;
        while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
        }
    }
}
