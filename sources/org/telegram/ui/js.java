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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class js implements Runnable {
    public final /* synthetic */ ns a;

    public js(ns nsVar) {
        this.a = nsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x06a6, code lost:
    
        if (org.telegram.messenger.fj.v4(r4) != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x09d8, code lost:
    
        if (org.telegram.messenger.fj.v4(r7) != false) goto L229;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0e30  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        int i10;
        int i11;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        ls lsVar;
        ls lsVar2;
        int i12;
        ls lsVar3;
        int i13;
        ls lsVar4;
        TLRPC.Document document;
        TLRPC.Document document2;
        boolean z10;
        ai.k0 k0Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        i0.b bVar;
        i0.b bVar2;
        i0.b bVar3;
        ai.k0 k0Var2;
        ai.k0 k0Var3;
        float f10;
        ai.k0 k0Var4;
        float f11;
        ai.k0 k0Var5;
        ai.k0 k0Var6;
        int i14;
        float f12;
        float f13;
        ai.k0 k0Var7;
        org.telegram.ui.ActionBar.i6 i6Var;
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
        ai.k0 k0Var8;
        i0.b bVar4;
        i0.b bVar5;
        i0.b bVar6;
        ai.k0 k0Var9;
        ai.k0 k0Var10;
        float f14;
        ai.k0 k0Var11;
        float f15;
        ai.k0 k0Var12;
        ai.k0 k0Var13;
        float f16;
        float f17;
        ai.k0 k0Var14;
        org.telegram.ui.ActionBar.i6 i6Var2;
        TLRPC.Document document10;
        int i18;
        TLRPC.Document document11;
        TLRPC.Document document12;
        int i19;
        TLRPC.Document document13;
        ls lsVar13;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3;
        TLRPC.Document document14;
        ls lsVar14;
        ai.k0 k0Var15;
        i0.b bVar7;
        i0.b bVar8;
        i0.b bVar9;
        int i20;
        ai.k0 k0Var16;
        ai.k0 k0Var17;
        float min;
        int i21;
        ai.k0 k0Var18;
        ai.k0 k0Var19;
        float f18;
        ai.k0 k0Var20;
        ai.k0 k0Var21;
        ai.k0 k0Var22;
        ai.k0 k0Var23;
        ai.k0 k0Var24;
        ai.k0 k0Var25;
        org.telegram.ui.ActionBar.i6 i6Var3;
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
        boolean z11;
        ai.k0 k0Var26;
        ai.k0 k0Var27;
        int i27;
        f61 f61Var;
        i0.b bVar10;
        i0.b bVar11;
        i0.b bVar12;
        ai.k0 k0Var28;
        ai.k0 k0Var29;
        float f19;
        ai.k0 k0Var30;
        ai.k0 k0Var31;
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        View view7;
        View view8;
        ai.k0 k0Var32;
        org.telegram.ui.Components.y60 E;
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
        if (lsVar26 != null && (E = lsVar26.E(nsVar.z)) != null) {
            E.R(cVar, c8.i0.l(nsVar.c0), true);
            E.t = false;
            E.Z();
            E.p = new bh(this, 16);
            ViewGroup viewGroup = E.A;
            es esVar = new es(this, viewGroup);
            nsVar.k = esVar;
            esVar.e = true;
            esVar.c = org.telegram.messenger.ks.g2;
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
                                nsVar2.e = com.google.android.gms.internal.vision.e2.z(0.0f, f21, floatValue, f21);
                                nsVar2.z.invalidate();
                                break;
                            case 1:
                                ns nsVar3 = this.b.a;
                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                nsVar3.g = floatValue2;
                                float f22 = nsVar3.f;
                                nsVar3.e = com.google.android.gms.internal.vision.e2.z(0.0f, f22, floatValue2, f22);
                                nsVar3.z.invalidate();
                                break;
                            default:
                                ns nsVar4 = this.b.a;
                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                nsVar4.g = floatValue3;
                                float f23 = nsVar4.f;
                                nsVar4.e = com.google.android.gms.internal.vision.e2.z(0.0f, f23, floatValue3, f23);
                                nsVar4.z.invalidate();
                                break;
                        }
                    }
                });
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(org.telegram.ui.Components.lr.f);
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
                    TLRPC.PollAnswerVoters E1 = org.telegram.messenger.fj.E1(d, g10.option);
                    if (E1 != null && E1.voters > 0) {
                        org.telegram.messenger.fj.A(d);
                    }
                }
            }
            i7 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i7, nsVar.z.getContext(), nsVar.c0);
            org.telegram.ui.ActionBar.i6 i6Var4 = null;
            fh.g c10 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout4, null, true);
            c10.p(c8.i0.l(nsVar.c0));
            org.telegram.messenger.n10.s(c10, org.telegram.messenger.g0.L(12.0f), 8.0f);
            c10.R.e = true;
            actionBarPopupWindow$ActionBarPopupWindowLayout4.setBackground(c10);
            if (nsVar.V != 3) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = nsVar.T;
                int i30 = R.drawable.menu_sticker_add;
                if (tL_messages_stickerSet == null) {
                    ls lsVar28 = nsVar.l;
                    if (lsVar28 == null || !lsVar28.A()) {
                        if (nsVar.l.w()) {
                            arrayList.add(org.telegram.messenger.gd.M0(2131745393, null));
                            arrayList3.add(valueOf4);
                            arrayList2.add(0);
                        }
                        org.telegram.ui.Cells.c0.v(null, 2131754372, arrayList, R.drawable.msg_fave, arrayList3);
                        arrayList2.add(1);
                    } else {
                        org.telegram.ui.Cells.c0.v(null, 2131745329, arrayList, R.drawable.menu_sticker_add, arrayList3);
                        arrayList2.add(0);
                    }
                }
                ls lsVar29 = nsVar.l;
                if (lsVar29 == null || !lsVar29.A()) {
                    ls lsVar30 = nsVar.l;
                    arrayList.add(org.telegram.messenger.gd.M0((lsVar30 == null || !lsVar30.J()) ? 2131754368 : 2131744614, null));
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
                z0Var.j(org.telegram.messenger.gd.M0(2131753754, null), R.drawable.msg_arrow_back, null);
                z0Var.getTextView().setPadding(org.telegram.messenger.gd.a0 ? 0 : org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0);
                FrameLayout frameLayout = new FrameLayout(nsVar.z.getContext());
                LinearLayout linearLayout = new LinearLayout(nsVar.z.getContext());
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.G8, linearLayout, nsVar.c0);
                linearLayout.setOrientation(1);
                if (nsVar.w == null) {
                    f61Var = null;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new TLRPC.TL_stickerSetNoCovered());
                    TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = new TLRPC.TL_messages_getMyStickers();
                    tL_messages_getMyStickers.limit = 100;
                    ConnectionsManager.getInstance(nsVar.r).sendRequest(tL_messages_getMyStickers, new z9(nsVar, arrayList4, tL_messages_getMyStickers, i31));
                    f61Var = new f61(8, nsVar.w, i6Var4);
                    f61Var.setLayoutManager(new v4.c0());
                    f61Var.i(new ai.i0(arrayList4, 5));
                    f61Var.setAdapter(new ks(nsVar, arrayList4));
                }
                f61Var.setOnItemClickListener(new h(this, 6));
                frameLayout.addView(z0Var);
                linearLayout.addView(frameLayout);
                linearLayout.addView(new org.telegram.ui.ActionBar.e1(nsVar.z.getContext(), nsVar.c0), c8.ma.o(-1, 8));
                fi.d0 d0Var = new fi.d0(this, arrayList2, f61Var, linearLayout, actionBarPopupWindow$ActionBarPopupWindowLayout4, 13);
                for (int i32 = 0; i32 < arrayList.size(); i32++) {
                    org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout4, ((Integer) arrayList3.get(i32)).intValue(), (CharSequence) arrayList.get(i32), false, nsVar.c0);
                    c11.setTag(Integer.valueOf(i32));
                    c11.setOnClickListener(d0Var);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout4.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                linearLayout.addView(f61Var, new LinearLayout.LayoutParams(actionBarPopupWindow$ActionBarPopupWindowLayout4.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f), (int) (actionBarPopupWindow$ActionBarPopupWindowLayout4.getMeasuredHeight() * 1.5f)));
                actionBarPopupWindow$ActionBarPopupWindowLayout4.b(linearLayout);
                frameLayout.setOnClickListener(new cf(actionBarPopupWindow$ActionBarPopupWindowLayout4, 2));
                bVar10 = nsVar.q;
                int i33 = bVar10.d;
                bVar11 = nsVar.q;
                int i34 = i33 + bVar11.b;
                bVar12 = nsVar.q;
                int i35 = bVar12.b;
                k0Var28 = nsVar.z;
                int width = k0Var28.getWidth();
                k0Var29 = nsVar.z;
                int min3 = (int) (Math.min(width, k0Var29.getHeight() - i34) / 1.8f);
                f19 = nsVar.e;
                k0Var30 = nsVar.z;
                int L2 = org.telegram.messenger.g0.L(84.0f) + ((int) (f19 + Math.max(i35 + r3, ((k0Var30.getHeight() - i34) - nsVar.I) / 2) + (min3 / 2)));
                k0Var31 = nsVar.z;
                k0Var31.addView(actionBarPopupWindow$ActionBarPopupWindowLayout4, c8.ma.d(-2, -2.0f, 49, 0.0f, L2 / org.telegram.messenger.g0.p, 0.0f, 0.0f));
                nsVar.L = actionBarPopupWindow$ActionBarPopupWindowLayout4;
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
                view8.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.lr.h).start();
                if (nsVar.P == null) {
                    org.telegram.ui.Components.pb pbVar = new org.telegram.ui.Components.pb(nsVar, nsVar.z.getContext(), org.telegram.messenger.j10.t0, nsVar.c0);
                    nsVar.P = pbVar;
                    pbVar.O0 = true;
                    pbVar.setPadding(0, org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f));
                    nsVar.P.setClipChildren(false);
                    nsVar.P.setClipToPadding(false);
                    nsVar.P.setVisibility(0);
                    nsVar.P.setHint(org.telegram.messenger.gd.M0(2131744613, null));
                    nsVar.P.setBubbleOffset(-org.telegram.messenger.g0.L(105.0f));
                    nsVar.P.setMiniBubblesOffset(-org.telegram.messenger.g0.L(14.0f));
                    FrameLayout frameLayout2 = new FrameLayout(nsVar.z.getContext());
                    nsVar.Q = frameLayout2;
                    frameLayout2.addView(nsVar.P, c8.ma.d(-2, 116.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                    nsVar.z.addView(nsVar.Q, c8.ma.d(-2, -2.0f, 1, 0.0f, 100.0f, 0.0f, 0.0f));
                }
                nsVar.P.setSelectedEmojis(nsVar.o);
                nsVar.P.setDelegate(new bs(nsVar));
                nsVar.P.p(null, null, false);
                nsVar.Q.setScaleY(0.6f);
                nsVar.Q.setScaleX(0.6f);
                nsVar.Q.setAlpha(0.0f);
                org.telegram.messenger.g0.h3(new as(nsVar, 2), 10L);
                nsVar.K = true;
                k0Var32 = nsVar.z;
                k0Var32.invalidate();
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
            } else {
                i10 = nsVar.V;
                if (i10 == 0) {
                    document12 = nsVar.W;
                    if (org.telegram.messenger.fj.X3(document12)) {
                        i26 = nsVar.r;
                        if (!org.telegram.messenger.c.a(i26).e().q()) {
                            if (nsVar.O == null) {
                                k0 k0Var33 = new k0(nsVar.z.getContext(), nsVar.c0);
                                nsVar.O = k0Var33;
                                nsVar.z.addView(k0Var33, c8.ma.c(-1.0f, -1));
                                nsVar.O.setOnClickListener(new cs(nsVar, i29));
                                z11 = true;
                                ((ug.s0) nsVar.O.b).w.setOnClickListener(new cs(nsVar, 1 == true ? 1 : 0));
                            } else {
                                z11 = true;
                            }
                            org.telegram.messenger.g0.X3(nsVar.O, false, 1.0f, z11, false);
                            org.telegram.messenger.g0.V3(nsVar.O, z11);
                            nsVar.O.setTranslationY(0.0f);
                            nsVar.K = true;
                            k0Var26 = nsVar.z;
                            k0Var26.invalidate();
                            try {
                                k0Var27 = nsVar.z;
                                k0Var27.performHapticFeedback(0);
                                return;
                            } catch (Exception unused3) {
                                return;
                            }
                        }
                    }
                    i19 = nsVar.r;
                    org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i19);
                    document13 = nsVar.W;
                    boolean D0 = d02.D0(document13);
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    lsVar13 = nsVar.l;
                    if (lsVar13 != null) {
                        lsVar20 = nsVar.l;
                        actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                        i24 = nsVar.V;
                        if (lsVar20.k(i24)) {
                            lsVar25 = nsVar.l;
                            if (!lsVar25.c()) {
                                org.telegram.ui.Cells.c0.s(2131745393, arrayList5, arrayList7, valueOf4);
                                arrayList6.add(0);
                            }
                        }
                        lsVar21 = nsVar.l;
                        i25 = nsVar.V;
                        if (lsVar21.k(i25)) {
                            lsVar24 = nsVar.l;
                            if (!lsVar24.c()) {
                                arrayList6.add(org.telegram.ui.Cells.c0.o(2131745388, arrayList5, arrayList7, valueOf3, 6));
                            }
                        }
                        lsVar22 = nsVar.l;
                        if (lsVar22.b()) {
                            org.telegram.ui.Cells.c0.s(2131745665, arrayList5, arrayList7, valueOf2);
                            arrayList6.add(3);
                        }
                        lsVar23 = nsVar.l;
                        if (lsVar23.f()) {
                            org.telegram.ui.Cells.c0.s(2131749035, arrayList5, arrayList7, valueOf5);
                            arrayList6.add(5);
                        }
                    } else {
                        actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                    }
                    document14 = nsVar.W;
                    if (!org.telegram.messenger.fj.E3(document14)) {
                        if (!D0) {
                            i23 = nsVar.r;
                            if (org.telegram.messenger.ri.d0(i23).u()) {
                                document16 = nsVar.W;
                            }
                        }
                        arrayList5.add(D0 ? org.telegram.messenger.gd.L0(2131751527) : org.telegram.messenger.gd.L0(2131754372));
                        arrayList7.add(Integer.valueOf(D0 ? R.drawable.msg_unfave : R.drawable.msg_fave));
                        arrayList6.add(2);
                    }
                    lsVar14 = nsVar.l;
                    if (lsVar14 != null && (inputStickerSet = nsVar.a0) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                        lsVar19 = nsVar.l;
                        if (lsVar19.Q()) {
                            arrayList5.add(org.telegram.messenger.gd.Z(2131743311, new Object[0]));
                            arrayList7.add(Integer.valueOf(R.drawable.msg_media));
                            arrayList6.add(1);
                        }
                    }
                    if (nsVar.p) {
                        org.telegram.ui.Cells.c0.s(2131751526, arrayList5, arrayList7, valueOf5);
                        arrayList6.add(4);
                    }
                    if (nsVar.a0 != null) {
                        document15 = nsVar.W;
                        if (document15 != null) {
                            i22 = nsVar.r;
                            TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.ri.d0(i22).o0(nsVar.a0, true);
                            if (o02 != null) {
                                lsVar17 = nsVar.l;
                                if (lsVar17 != null) {
                                    lsVar18 = nsVar.l;
                                    if (lsVar18.C()) {
                                        TLRPC.StickerSet stickerSet = o02.set;
                                        if (!stickerSet.emojis && !stickerSet.masks) {
                                            arrayList6.add(org.telegram.ui.Cells.c0.n(2131751212, arrayList5, R.drawable.msg_edit, arrayList7, 7));
                                        }
                                    }
                                }
                            }
                            if (o02 != null && o02.set.creator) {
                                lsVar15 = nsVar.l;
                                if (lsVar15 != null) {
                                    lsVar16 = nsVar.l;
                                    unused = nsVar.W;
                                    if (lsVar16.I()) {
                                        arrayList6.add(org.telegram.ui.Cells.c0.o(2131751484, arrayList5, arrayList7, valueOf5, 8));
                                    }
                                }
                            }
                        }
                    }
                    if (arrayList5.isEmpty()) {
                        return;
                    }
                    nsVar.K = true;
                    k0Var15 = nsVar.z;
                    k0Var15.invalidate();
                    fs fsVar = new fs(this, arrayList6, D0);
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                    ns.g(nsVar, actionBarPopupWindow$ActionBarPopupWindowLayout5);
                    int i36 = 0;
                    while (i36 < arrayList5.size()) {
                        int intValue = ((Integer) arrayList7.get(i36)).intValue();
                        CharSequence charSequence = (CharSequence) arrayList5.get(i36);
                        i6Var3 = nsVar.c0;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout5;
                        org.telegram.ui.ActionBar.z0 c12 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout6, intValue, charSequence, false, i6Var3);
                        c12.setTag(Integer.valueOf(i36));
                        c12.setOnClickListener(fsVar);
                        if (((Integer) arrayList6.get(i36)).intValue() == 8) {
                            int i37 = org.telegram.ui.ActionBar.n6.q7;
                            c12.c(i37, i37);
                            c12.h(0.1f, i37);
                        }
                        i36++;
                        actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout6;
                    }
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout5;
                    gs gsVar = new gs(this, actionBarPopupWindow$ActionBarPopupWindowLayout7);
                    nsVar.k = gsVar;
                    gsVar.e = true;
                    gsVar.c = 100;
                    gsVar.g = true;
                    gsVar.setOutsideTouchable(true);
                    nsVar.k.setClippingEnabled(true);
                    nsVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                    nsVar.k.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout7.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                    nsVar.k.setInputMethodMode(2);
                    nsVar.k.getContentView().setFocusableInTouchMode(true);
                    bVar7 = nsVar.q;
                    int i38 = bVar7.d;
                    bVar8 = nsVar.q;
                    int i39 = i38 + bVar8.b;
                    bVar9 = nsVar.q;
                    int i40 = bVar9.b;
                    i20 = nsVar.V;
                    if (i20 == 1) {
                        k0Var24 = nsVar.z;
                        int width2 = k0Var24.getWidth();
                        k0Var25 = nsVar.z;
                        i21 = Math.min(width2, k0Var25.getHeight() - i39) - org.telegram.messenger.g0.L(40.0f);
                    } else {
                        if (nsVar.S) {
                            k0Var18 = nsVar.z;
                            int width3 = k0Var18.getWidth();
                            k0Var19 = nsVar.z;
                            min = Math.min(width3, k0Var19.getHeight() - i39) - org.telegram.messenger.g0.N(40.0f);
                        } else {
                            k0Var16 = nsVar.z;
                            int width4 = k0Var16.getWidth();
                            k0Var17 = nsVar.z;
                            min = Math.min(width4, k0Var17.getHeight() - i39) / 1.8f;
                        }
                        i21 = (int) min;
                    }
                    f18 = nsVar.e;
                    int i41 = i21 / 2;
                    int i42 = i40 + i41;
                    int L3 = nsVar.G != null ? org.telegram.messenger.g0.L(40.0f) : 0;
                    k0Var20 = nsVar.z;
                    int L4 = org.telegram.messenger.g0.L(24.0f) + ((int) (f18 + Math.max(i42 + L3, ((k0Var20.getHeight() - i39) - nsVar.I) / 2) + i41));
                    if (nsVar.S) {
                        L4 += org.telegram.messenger.g0.L(24.0f);
                    }
                    org.telegram.ui.ActionBar.h1 h1Var = nsVar.k;
                    k0Var21 = nsVar.z;
                    k0Var22 = nsVar.z;
                    h1Var.showAtLocation(k0Var21, 0, (int) ((k0Var22.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout7.getMeasuredWidth()) / 2.0f), L4);
                    try {
                        k0Var23 = nsVar.z;
                        k0Var23.performHapticFeedback(0);
                    } catch (Exception unused4) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout7;
                } else {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
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
                                org.telegram.ui.Cells.c0.s(2131745431, arrayList8, arrayList10, valueOf4);
                                arrayList9.add(0);
                            }
                            lsVar10 = nsVar.l;
                            document5 = nsVar.W;
                            Boolean P = lsVar10.P(document5);
                            if (P != null) {
                                if (P.booleanValue()) {
                                    org.telegram.ui.Cells.c0.s(2131745351, arrayList8, arrayList10, valueOf);
                                    arrayList9.add(1);
                                } else {
                                    org.telegram.ui.Cells.c0.s(2131746093, arrayList8, arrayList10, valueOf);
                                    arrayList9.add(2);
                                }
                            }
                            lsVar11 = nsVar.l;
                            document6 = nsVar.W;
                            if (lsVar11.D(document6)) {
                                arrayList8.add(org.telegram.messenger.gd.L0(2131751753));
                                arrayList10.add(Integer.valueOf(R.drawable.msg_copy));
                                arrayList9.add(3);
                            }
                            lsVar12 = nsVar.l;
                            document7 = nsVar.W;
                            if (lsVar12.N(document7)) {
                                org.telegram.ui.Cells.c0.s(2131746116, arrayList8, arrayList10, valueOf5);
                                arrayList9.add(4);
                            }
                            i17 = nsVar.r;
                            org.telegram.messenger.ri d03 = org.telegram.messenger.ri.d0(i17);
                            document8 = nsVar.W;
                            boolean D02 = d03.D0(document8);
                            document9 = nsVar.W;
                            if (!org.telegram.messenger.fj.H2(document9)) {
                                document10 = nsVar.W;
                                if (!org.telegram.messenger.fj.E3(document10)) {
                                    if (!D02) {
                                        i18 = nsVar.r;
                                        if (org.telegram.messenger.ri.d0(i18).u()) {
                                            document11 = nsVar.W;
                                        }
                                    }
                                    arrayList8.add(D02 ? org.telegram.messenger.gd.L0(2131751527) : org.telegram.messenger.gd.L0(2131754372));
                                    arrayList10.add(Integer.valueOf(D02 ? R.drawable.msg_unfave : R.drawable.msg_fave));
                                    arrayList9.add(5);
                                }
                            }
                            if (arrayList8.isEmpty()) {
                                return;
                            }
                            nsVar.K = true;
                            k0Var8 = nsVar.z;
                            k0Var8.invalidate();
                            int[] iArr = new int[arrayList10.size()];
                            for (int i43 = 0; i43 < arrayList10.size(); i43++) {
                                iArr[i43] = ((Integer) arrayList10.get(i43)).intValue();
                            }
                            org.telegram.ui.Components.wa0 wa0Var = new org.telegram.ui.Components.wa0(this, arrayList9, D02);
                            boolean g11 = ns.g(nsVar, actionBarPopupWindow$ActionBarPopupWindowLayout8);
                            int i44 = 0;
                            while (i44 < arrayList8.size()) {
                                boolean z12 = !g11 && i44 == 0;
                                boolean z13 = i44 == arrayList8.size() + (-1);
                                int intValue2 = ((Integer) arrayList10.get(i44)).intValue();
                                CharSequence charSequence2 = (CharSequence) arrayList8.get(i44);
                                i6Var2 = nsVar.c0;
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout9 = actionBarPopupWindow$ActionBarPopupWindowLayout8;
                                org.telegram.ui.ActionBar.z0 c13 = org.telegram.ui.ActionBar.r0.c(z12, z13, actionBarPopupWindow$ActionBarPopupWindowLayout9, intValue2, charSequence2, false, i6Var2);
                                if (((Integer) arrayList9.get(i44)).intValue() == 4) {
                                    c13.c(org.telegram.ui.ActionBar.n6.q7, org.telegram.ui.ActionBar.n6.p7);
                                }
                                c13.setTag(Integer.valueOf(i44));
                                c13.setOnClickListener(wa0Var);
                                i44++;
                                actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout9;
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout8;
                            hs hsVar = new hs(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            nsVar.k = hsVar;
                            hsVar.e = true;
                            hsVar.c = org.telegram.messenger.ks.g2;
                            hsVar.g = true;
                            hsVar.setOutsideTouchable(true);
                            nsVar.k.setClippingEnabled(true);
                            nsVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                            nsVar.k.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                            nsVar.k.setInputMethodMode(2);
                            nsVar.k.getContentView().setFocusableInTouchMode(true);
                            bVar4 = nsVar.q;
                            int i45 = bVar4.d;
                            bVar5 = nsVar.q;
                            int i46 = i45 + bVar5.b;
                            bVar6 = nsVar.q;
                            int i47 = bVar6.b;
                            k0Var9 = nsVar.z;
                            int width5 = k0Var9.getWidth();
                            k0Var10 = nsVar.z;
                            int min4 = Math.min(width5, k0Var10.getHeight() - i46) - org.telegram.messenger.g0.L(40.0f);
                            f14 = nsVar.e;
                            int i48 = min4 / 2;
                            int i49 = i47 + i48;
                            int L5 = nsVar.G != null ? org.telegram.messenger.g0.L(40.0f) : 0;
                            k0Var11 = nsVar.z;
                            float max = (int) (f14 + Math.max(i49 + L5, ((k0Var11.getHeight() - i46) - nsVar.I) / 2) + i48);
                            float L6 = org.telegram.messenger.g0.L(24.0f);
                            f15 = nsVar.e;
                            int i50 = (int) ((L6 - f15) + max);
                            org.telegram.ui.ActionBar.h1 h1Var2 = nsVar.k;
                            k0Var12 = nsVar.z;
                            k0Var13 = nsVar.z;
                            h1Var2.showAtLocation(k0Var12, 0, (int) ((k0Var13.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i50);
                            org.telegram.ui.ActionBar.h1.i(actionBarPopupWindow$ActionBarPopupWindowLayout);
                            try {
                                k0Var14 = nsVar.z;
                                k0Var14.performHapticFeedback(0);
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
                                                nsVar2.e = com.google.android.gms.internal.vision.e2.z(0.0f, f21, floatValue, f21);
                                                nsVar2.z.invalidate();
                                                break;
                                            case 1:
                                                ns nsVar3 = this.b.a;
                                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                nsVar3.g = floatValue2;
                                                float f22 = nsVar3.f;
                                                nsVar3.e = com.google.android.gms.internal.vision.e2.z(0.0f, f22, floatValue2, f22);
                                                nsVar3.z.invalidate();
                                                break;
                                            default:
                                                ns nsVar4 = this.b.a;
                                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                nsVar4.g = floatValue3;
                                                float f23 = nsVar4.f;
                                                nsVar4.e = com.google.android.gms.internal.vision.e2.z(0.0f, f23, floatValue3, f23);
                                                nsVar4.z.invalidate();
                                                break;
                                        }
                                    }
                                });
                                ofFloat2.setDuration(350L);
                                ofFloat2.setInterpolator(org.telegram.ui.Components.lr.f);
                                ofFloat2.start();
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout8;
                    lsVar = nsVar.l;
                    if (lsVar != null) {
                        ArrayList arrayList11 = new ArrayList();
                        ArrayList arrayList12 = new ArrayList();
                        ArrayList arrayList13 = new ArrayList();
                        lsVar2 = nsVar.l;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout10 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                        i12 = nsVar.V;
                        if (lsVar2.k(i12)) {
                            lsVar7 = nsVar.l;
                            if (!lsVar7.c()) {
                                org.telegram.ui.Cells.c0.s(2131745428, arrayList11, arrayList13, valueOf4);
                                arrayList12.add(0);
                            }
                        }
                        lsVar3 = nsVar.l;
                        i13 = nsVar.V;
                        if (lsVar3.k(i13)) {
                            lsVar6 = nsVar.l;
                            if (!lsVar6.c()) {
                                org.telegram.ui.Cells.c0.s(2131745388, arrayList11, arrayList13, valueOf3);
                                arrayList12.add(4);
                            }
                        }
                        lsVar4 = nsVar.l;
                        if (lsVar4.b()) {
                            org.telegram.ui.Cells.c0.s(2131745665, arrayList11, arrayList13, valueOf2);
                            arrayList12.add(3);
                        }
                        document = nsVar.W;
                        if (document != null) {
                            lsVar5 = nsVar.l;
                            document4 = nsVar.W;
                            if (lsVar5.e(document4)) {
                                arrayList12.add(org.telegram.ui.Cells.c0.n(2131754483, arrayList11, R.drawable.outline_caption_24, arrayList13, 11));
                            }
                        }
                        document2 = nsVar.W;
                        if (document2 != null) {
                            i15 = nsVar.r;
                            org.telegram.messenger.ri d04 = org.telegram.messenger.ri.d0(i15);
                            document3 = nsVar.W;
                            int i52 = 0;
                            while (true) {
                                if (i52 >= d04.j0.size()) {
                                    z10 = false;
                                    break;
                                }
                                TLRPC.Document document17 = (TLRPC.Document) d04.j0.get(i52);
                                if (document17.id == document3.id) {
                                    d04.j0.remove(i52);
                                    d04.j0.add(0, document17);
                                    z10 = true;
                                    break;
                                }
                                i52++;
                            }
                            if (z10) {
                                arrayList11.add(org.telegram.messenger.gd.Y(2131751587, "Delete", new Object[0]));
                                arrayList13.add(valueOf5);
                                arrayList12.add(1);
                            } else {
                                arrayList11.add(org.telegram.messenger.gd.Y(2131745735, "SaveToGIFs", new Object[0]));
                                arrayList13.add(Integer.valueOf(R.drawable.msg_gif_add));
                                arrayList12.add(2);
                            }
                        } else {
                            z10 = false;
                        }
                        if (arrayList11.isEmpty()) {
                            return;
                        }
                        nsVar.K = true;
                        k0Var = nsVar.z;
                        k0Var.invalidate();
                        int[] iArr2 = new int[arrayList13.size()];
                        for (int i53 = 0; i53 < arrayList13.size(); i53++) {
                            iArr2[i53] = ((Integer) arrayList13.get(i53)).intValue();
                        }
                        org.telegram.ui.Components.c31 c31Var = new org.telegram.ui.Components.c31(10, this, arrayList12);
                        int i54 = 0;
                        while (i54 < arrayList11.size()) {
                            int intValue3 = ((Integer) arrayList13.get(i54)).intValue();
                            CharSequence charSequence3 = (CharSequence) arrayList11.get(i54);
                            i6Var = nsVar.c0;
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout11 = actionBarPopupWindow$ActionBarPopupWindowLayout10;
                            org.telegram.ui.ActionBar.z0 c14 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout11, intValue3, charSequence3, false, i6Var);
                            c14.setTag(Integer.valueOf(i54));
                            c14.setOnClickListener(c31Var);
                            if (z10 && i54 == arrayList11.size() - 1) {
                                c14.c(org.telegram.ui.ActionBar.n6.q7, org.telegram.ui.ActionBar.n6.p7);
                            }
                            i54++;
                            actionBarPopupWindow$ActionBarPopupWindowLayout10 = actionBarPopupWindow$ActionBarPopupWindowLayout11;
                        }
                        actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout10;
                        is isVar = new is(this, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                        nsVar.k = isVar;
                        isVar.e = true;
                        isVar.c = org.telegram.messenger.ks.g2;
                        isVar.g = true;
                        isVar.setOutsideTouchable(true);
                        nsVar.k.setClippingEnabled(true);
                        nsVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                        nsVar.k.setFocusable(true);
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                        nsVar.k.setInputMethodMode(2);
                        nsVar.k.getContentView().setFocusableInTouchMode(true);
                        bVar = nsVar.q;
                        int i55 = bVar.d;
                        bVar2 = nsVar.q;
                        int i56 = i55 + bVar2.b;
                        bVar3 = nsVar.q;
                        int i57 = bVar3.b;
                        k0Var2 = nsVar.z;
                        int width6 = k0Var2.getWidth();
                        k0Var3 = nsVar.z;
                        int min5 = Math.min(width6, k0Var3.getHeight() - i56) - org.telegram.messenger.g0.L(40.0f);
                        f10 = nsVar.e;
                        int i58 = min5 / 2;
                        int i59 = i57 + i58;
                        int L7 = nsVar.G != null ? org.telegram.messenger.g0.L(40.0f) : 0;
                        k0Var4 = nsVar.z;
                        float max2 = (int) (f10 + Math.max(i59 + L7, ((k0Var4.getHeight() - i56) - nsVar.I) / 2) + i58);
                        float L8 = org.telegram.messenger.g0.L(24.0f);
                        f11 = nsVar.e;
                        int i60 = (int) ((L8 - f11) + max2);
                        org.telegram.ui.ActionBar.h1 h1Var3 = nsVar.k;
                        k0Var5 = nsVar.z;
                        k0Var6 = nsVar.z;
                        i14 = 0;
                        h1Var3.showAtLocation(k0Var5, 0, (int) ((k0Var6.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth()) / 2.0f), i60);
                        try {
                            k0Var7 = nsVar.z;
                            k0Var7.performHapticFeedback(0);
                        } catch (Exception unused6) {
                        }
                        f12 = nsVar.e;
                        if (f12 != 0.0f) {
                            f13 = nsVar.e;
                            nsVar.f = f13;
                            final int i61 = 2;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ds
                                public final /* synthetic */ js b;

                                {
                                    this.b = this;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (i61) {
                                        case 0:
                                            ns nsVar2 = this.b.a;
                                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            nsVar2.g = floatValue;
                                            float f21 = nsVar2.f;
                                            nsVar2.e = com.google.android.gms.internal.vision.e2.z(0.0f, f21, floatValue, f21);
                                            nsVar2.z.invalidate();
                                            break;
                                        case 1:
                                            ns nsVar3 = this.b.a;
                                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            nsVar3.g = floatValue2;
                                            float f22 = nsVar3.f;
                                            nsVar3.e = com.google.android.gms.internal.vision.e2.z(0.0f, f22, floatValue2, f22);
                                            nsVar3.z.invalidate();
                                            break;
                                        default:
                                            ns nsVar4 = this.b.a;
                                            float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            nsVar4.g = floatValue3;
                                            float f23 = nsVar4.f;
                                            nsVar4.e = com.google.android.gms.internal.vision.e2.z(0.0f, f23, floatValue3, f23);
                                            nsVar4.z.invalidate();
                                            break;
                                    }
                                }
                            });
                            ofFloat3.setDuration(350L);
                            ofFloat3.setInterpolator(org.telegram.ui.Components.lr.f);
                            ofFloat3.start();
                        }
                        i27 = i14;
                        while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount()) {
                            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout2.M.getChildAt(i27);
                            if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                                ((org.telegram.ui.ActionBar.z0) childAt).n(i27 == 0 ? 1 : i14, i27 == actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount() + (-1) ? 1 : i14);
                            }
                            i27++;
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                }
            }
            i14 = 0;
            i27 = i14;
            while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount()) {
            }
        }
        i7 = 1;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout42 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i7, nsVar.z.getContext(), nsVar.c0);
        org.telegram.ui.ActionBar.i6 i6Var42 = null;
        fh.g c102 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout42, null, true);
        c102.p(c8.i0.l(nsVar.c0));
        org.telegram.messenger.n10.s(c102, org.telegram.messenger.g0.L(12.0f), 8.0f);
        c102.R.e = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout42.setBackground(c102);
        if (nsVar.V != 3) {
        }
        i14 = 0;
        i27 = i14;
        while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount()) {
        }
    }
}
