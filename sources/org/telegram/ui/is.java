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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class is implements Runnable {
    public final /* synthetic */ ms a;

    public is(ms msVar) {
        this.a = msVar;
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
        ks ksVar;
        ks ksVar2;
        int i12;
        ks ksVar3;
        int i13;
        ks ksVar4;
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
        org.telegram.ui.ActionBar.g6 g6Var;
        int i15;
        TLRPC.Document document3;
        ks ksVar5;
        TLRPC.Document document4;
        ks ksVar6;
        ks ksVar7;
        ks ksVar8;
        ks ksVar9;
        int i16;
        ks ksVar10;
        TLRPC.Document document5;
        ks ksVar11;
        TLRPC.Document document6;
        ks ksVar12;
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
        org.telegram.ui.ActionBar.g6 g6Var2;
        TLRPC.Document document10;
        int i18;
        TLRPC.Document document11;
        TLRPC.Document document12;
        int i19;
        TLRPC.Document document13;
        ks ksVar13;
        boolean z10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        TLRPC.Document document14;
        ks ksVar14;
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
        org.telegram.ui.ActionBar.g6 g6Var3;
        TLRPC.Document document15;
        int i22;
        ks ksVar15;
        ks ksVar16;
        ks ksVar17;
        ks ksVar18;
        TLRPC.InputStickerSet inputStickerSet;
        ks ksVar19;
        int i23;
        TLRPC.Document document16;
        ks ksVar20;
        int i24;
        ks ksVar21;
        int i25;
        ks ksVar22;
        ks ksVar23;
        ks ksVar24;
        ks ksVar25;
        int i26;
        bi.x5 x5Var26;
        bi.x5 x5Var27;
        int i27;
        f61 f61Var;
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
        org.telegram.ui.Components.l60 m10;
        TLRPC.Document unused;
        Integer valueOf = Integer.valueOf(R.drawable.msg_smile_status);
        Integer valueOf2 = Integer.valueOf(R.drawable.msg_autodelete);
        Integer valueOf3 = Integer.valueOf(R.drawable.input_notify_off);
        Integer valueOf4 = Integer.valueOf(R.drawable.msg_send);
        Integer valueOf5 = Integer.valueOf(R.drawable.msg_delete);
        ms msVar = this.a;
        dh.c cVar = msVar.t;
        if (msVar.w == null || msVar.m) {
            return;
        }
        msVar.R = true;
        ks ksVar26 = msVar.l;
        if (ksVar26 != null && (m10 = ksVar26.m(msVar.z)) != null) {
            m10.Q(cVar, c8.g0.k(msVar.c0), true);
            m10.t = false;
            m10.Y();
            m10.p = new dh(this, 16);
            ViewGroup viewGroup = m10.A;
            ds dsVar = new ds(this, viewGroup);
            msVar.k = dsVar;
            dsVar.e = true;
            dsVar.c = org.telegram.messenger.qs.g2;
            dsVar.g = true;
            dsVar.setOutsideTouchable(true);
            msVar.k.setClippingEnabled(true);
            msVar.k.setAnimationStyle(R.style.PopupContextAnimation);
            msVar.k.setFocusable(true);
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
            msVar.k.setInputMethodMode(2);
            msVar.k.getContentView().setFocusableInTouchMode(true);
            i0.b bVar13 = msVar.q;
            int min2 = (Math.min(msVar.z.getWidth(), msVar.z.getHeight() - (bVar13.d + bVar13.b)) - org.telegram.messenger.g0.L(40.0f)) / 2;
            int L = (int) ((org.telegram.messenger.g0.L(24.0f) - msVar.e) + ((int) (msVar.e + Math.max(r2 + min2 + (msVar.G != null ? org.telegram.messenger.g0.L(40.0f) : 0), ((msVar.z.getHeight() - r3) - msVar.I) / 2) + min2)));
            msVar.k.showAtLocation(msVar.z, 0, (int) ((r4.getMeasuredWidth() - viewGroup.getMeasuredWidth()) / 2.0f), L);
            try {
                msVar.z.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            float f20 = msVar.e;
            if (f20 != 0.0f) {
                msVar.f = f20;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                final int i28 = 0;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.cs
                    public final /* synthetic */ is b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i28) {
                            case 0:
                                ms msVar2 = this.b.a;
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                msVar2.g = floatValue;
                                float f21 = msVar2.f;
                                msVar2.e = com.google.android.recaptcha.internal.a.z(0.0f, f21, floatValue, f21);
                                msVar2.z.invalidate();
                                break;
                            case 1:
                                ms msVar3 = this.b.a;
                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                msVar3.g = floatValue2;
                                float f22 = msVar3.f;
                                msVar3.e = com.google.android.recaptcha.internal.a.z(0.0f, f22, floatValue2, f22);
                                msVar3.z.invalidate();
                                break;
                            default:
                                ms msVar4 = this.b.a;
                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                msVar4.g = floatValue3;
                                float f23 = msVar4.f;
                                msVar4.e = com.google.android.recaptcha.internal.a.z(0.0f, f23, floatValue3, f23);
                                msVar4.z.invalidate();
                                break;
                        }
                    }
                });
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(org.telegram.ui.Components.xq.f);
                ofFloat.start();
            }
            msVar.K = true;
            return;
        }
        int i29 = 0;
        if (msVar.V != 3) {
            ks ksVar27 = msVar.l;
            if (ksVar27 != null) {
                TLRPC.TL_messageMediaPoll d = ksVar27.d();
                TLRPC.PollAnswer g10 = msVar.l.g();
                if (d != null && d.poll != null && g10 != null) {
                    TLRPC.PollAnswerVoters E1 = org.telegram.messenger.ij.E1(d, g10.option);
                    if (E1 != null && E1.voters > 0) {
                        org.telegram.messenger.ij.A(d);
                    }
                }
            }
            i7 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i7, msVar.z.getContext(), msVar.c0);
            org.telegram.ui.ActionBar.g6 g6Var4 = null;
            fh.g c10 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout3, null, true);
            c10.p(c8.g0.k(msVar.c0));
            org.telegram.messenger.camera.q.p(c10, org.telegram.messenger.g0.L(12.0f), 8.0f);
            c10.Q.e = true;
            actionBarPopupWindow$ActionBarPopupWindowLayout3.setBackground(c10);
            if (msVar.V != 3) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = msVar.T;
                int i30 = R.drawable.menu_sticker_add;
                if (tL_messages_stickerSet == null) {
                    ks ksVar28 = msVar.l;
                    if (ksVar28 == null || !ksVar28.B()) {
                        if (msVar.l.y()) {
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
                ks ksVar29 = msVar.l;
                if (ksVar29 == null || !ksVar29.B()) {
                    ks ksVar30 = msVar.l;
                    arrayList.add(org.telegram.messenger.id.M0((ksVar30 == null || !ksVar30.J()) ? 2131754370 : 2131744849, null));
                    ks ksVar31 = msVar.l;
                    if (ksVar31 != null && ksVar31.J()) {
                        i30 = R.drawable.msg_replace;
                    }
                    arrayList3.add(Integer.valueOf(i30));
                    arrayList2.add(2);
                }
                int i31 = 7;
                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, msVar.w, msVar.c0, true, false);
                z0Var.setItemHeight(44);
                z0Var.j(org.telegram.messenger.id.M0(2131753756, null), R.drawable.msg_arrow_back, null);
                z0Var.getTextView().setPadding(org.telegram.messenger.id.a0 ? 0 : org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0);
                FrameLayout frameLayout = new FrameLayout(msVar.z.getContext());
                LinearLayout linearLayout = new LinearLayout(msVar.z.getContext());
                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.G8, linearLayout, msVar.c0);
                linearLayout.setOrientation(1);
                if (msVar.w == null) {
                    f61Var = null;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new TLRPC.TL_stickerSetNoCovered());
                    TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = new TLRPC.TL_messages_getMyStickers();
                    tL_messages_getMyStickers.limit = 100;
                    ConnectionsManager.getInstance(msVar.r).sendRequest(tL_messages_getMyStickers, new z9(msVar, arrayList4, tL_messages_getMyStickers, i31));
                    f61Var = new f61(8, msVar.w, g6Var4);
                    f61Var.setLayoutManager(new v4.b0());
                    f61Var.i(new fi.o1(arrayList4, 4));
                    f61Var.setAdapter(new js(msVar, arrayList4));
                }
                f61Var.setOnItemClickListener(new h(this, 6));
                frameLayout.addView(z0Var);
                linearLayout.addView(frameLayout);
                linearLayout.addView(new org.telegram.ui.ActionBar.d1(msVar.z.getContext(), msVar.c0), c8.ha.o(-1, 8));
                di.d0 d0Var = new di.d0(this, arrayList2, f61Var, linearLayout, actionBarPopupWindow$ActionBarPopupWindowLayout3, 13);
                for (int i32 = 0; i32 < arrayList.size(); i32++) {
                    org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, ((Integer) arrayList3.get(i32)).intValue(), (CharSequence) arrayList.get(i32), false, msVar.c0);
                    c11.setTag(Integer.valueOf(i32));
                    c11.setOnClickListener(d0Var);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout3.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                linearLayout.addView(f61Var, new LinearLayout.LayoutParams(actionBarPopupWindow$ActionBarPopupWindowLayout3.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f), (int) (actionBarPopupWindow$ActionBarPopupWindowLayout3.getMeasuredHeight() * 1.5f)));
                actionBarPopupWindow$ActionBarPopupWindowLayout3.b(linearLayout);
                frameLayout.setOnClickListener(new cf(actionBarPopupWindow$ActionBarPopupWindowLayout3, 2));
                bVar10 = msVar.q;
                int i33 = bVar10.d;
                bVar11 = msVar.q;
                int i34 = i33 + bVar11.b;
                bVar12 = msVar.q;
                int i35 = bVar12.b;
                x5Var28 = msVar.z;
                int width = x5Var28.getWidth();
                x5Var29 = msVar.z;
                int min3 = (int) (Math.min(width, x5Var29.getHeight() - i34) / 1.8f);
                f19 = msVar.e;
                x5Var30 = msVar.z;
                int L2 = org.telegram.messenger.g0.L(84.0f) + ((int) (f19 + Math.max(i35 + r3, ((x5Var30.getHeight() - i34) - msVar.I) / 2) + (min3 / 2)));
                x5Var31 = msVar.z;
                x5Var31.addView(actionBarPopupWindow$ActionBarPopupWindowLayout3, c8.ha.d(-2, -2.0f, 49, 0.0f, L2 / org.telegram.messenger.g0.p, 0.0f, 0.0f));
                msVar.L = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                view = msVar.L;
                view.setTranslationY(-org.telegram.messenger.g0.L(12.0f));
                view2 = msVar.L;
                view2.setAlpha(0.0f);
                view3 = msVar.L;
                view3.setScaleX(0.8f);
                view4 = msVar.L;
                view4.setScaleY(0.8f);
                view5 = msVar.L;
                view5.setPivotY(0.0f);
                view6 = msVar.L;
                view7 = msVar.L;
                view6.setPivotX(view7.getMeasuredWidth() / 2.0f);
                view8 = msVar.L;
                view8.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.xq.h).start();
                if (msVar.P == null) {
                    org.telegram.ui.Components.lb lbVar = new org.telegram.ui.Components.lb(msVar, msVar.z.getContext(), org.telegram.messenger.p10.s0, msVar.c0);
                    msVar.P = lbVar;
                    lbVar.N0 = true;
                    lbVar.setPadding(0, org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f));
                    msVar.P.setClipChildren(false);
                    msVar.P.setClipToPadding(false);
                    msVar.P.setVisibility(0);
                    msVar.P.setHint(org.telegram.messenger.id.M0(2131744848, null));
                    msVar.P.setBubbleOffset(-org.telegram.messenger.g0.L(105.0f));
                    msVar.P.setMiniBubblesOffset(-org.telegram.messenger.g0.L(14.0f));
                    FrameLayout frameLayout2 = new FrameLayout(msVar.z.getContext());
                    msVar.Q = frameLayout2;
                    frameLayout2.addView(msVar.P, c8.ha.d(-2, 116.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                    msVar.z.addView(msVar.Q, c8.ha.d(-2, -2.0f, 1, 0.0f, 100.0f, 0.0f, 0.0f));
                }
                msVar.P.setSelectedEmojis(msVar.o);
                msVar.P.setDelegate(new as(msVar));
                msVar.P.p(null, null, false);
                msVar.Q.setScaleY(0.6f);
                msVar.Q.setScaleX(0.6f);
                msVar.Q.setAlpha(0.0f);
                org.telegram.messenger.g0.i3(new zr(msVar, 2), 10L);
                msVar.K = true;
                x5Var32 = msVar.z;
                x5Var32.invalidate();
                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout3;
            } else {
                int i36 = 1;
                i10 = msVar.V;
                int i37 = R.drawable.msg_unfave;
                if (i10 == 0) {
                    document12 = msVar.W;
                    if (org.telegram.messenger.ij.X3(document12)) {
                        i26 = msVar.r;
                        if (!org.telegram.messenger.c.a(i26).d().q()) {
                            if (msVar.O == null) {
                                k0 k0Var = new k0(msVar.z.getContext(), msVar.c0);
                                msVar.O = k0Var;
                                msVar.z.addView(k0Var, c8.ha.c(-1.0f, -1));
                                msVar.O.setOnClickListener(new bs(msVar, i29));
                                ((ug.p0) msVar.O.b).w.setOnClickListener(new bs(msVar, i36));
                            }
                            org.telegram.messenger.g0.Z3(msVar.O, false, 1.0f, true, false);
                            org.telegram.messenger.g0.X3(msVar.O, true);
                            msVar.O.setTranslationY(0.0f);
                            msVar.K = true;
                            x5Var26 = msVar.z;
                            x5Var26.invalidate();
                            try {
                                x5Var27 = msVar.z;
                                x5Var27.performHapticFeedback(0);
                                return;
                            } catch (Exception unused3) {
                                return;
                            }
                        }
                    }
                    i19 = msVar.r;
                    org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i19);
                    document13 = msVar.W;
                    boolean A0 = b02.A0(document13);
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    ksVar13 = msVar.l;
                    if (ksVar13 != null) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                        ksVar20 = msVar.l;
                        z10 = A0;
                        i24 = msVar.V;
                        if (ksVar20.k(i24)) {
                            ksVar25 = msVar.l;
                            if (!ksVar25.c()) {
                                org.telegram.ui.Cells.f1.q(2131745588, arrayList5, arrayList7, valueOf4);
                                arrayList6.add(0);
                            }
                        }
                        ksVar21 = msVar.l;
                        i25 = msVar.V;
                        if (ksVar21.k(i25)) {
                            ksVar24 = msVar.l;
                            if (!ksVar24.c()) {
                                arrayList5.add(org.telegram.messenger.id.L0(2131745583));
                                arrayList7.add(valueOf3);
                                arrayList6.add(6);
                            }
                        }
                        ksVar22 = msVar.l;
                        if (ksVar22.b()) {
                            org.telegram.ui.Cells.f1.q(2131745860, arrayList5, arrayList7, valueOf2);
                            arrayList6.add(3);
                        }
                        ksVar23 = msVar.l;
                        if (ksVar23.f()) {
                            org.telegram.ui.Cells.f1.q(2131749227, arrayList5, arrayList7, valueOf5);
                            arrayList6.add(5);
                        }
                    } else {
                        z10 = A0;
                        actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                    }
                    document14 = msVar.W;
                    if (!org.telegram.messenger.ij.E3(document14)) {
                        if (!z10) {
                            i23 = msVar.r;
                            if (org.telegram.messenger.ui.b0(i23).s()) {
                                document16 = msVar.W;
                            }
                        }
                        arrayList5.add(z10 ? org.telegram.messenger.id.L0(2131751538) : org.telegram.messenger.id.L0(2131754374));
                        if (!z10) {
                            i37 = R.drawable.msg_fave;
                        }
                        arrayList7.add(Integer.valueOf(i37));
                        arrayList6.add(2);
                    }
                    ksVar14 = msVar.l;
                    if (ksVar14 != null && (inputStickerSet = msVar.a0) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                        ksVar19 = msVar.l;
                        if (ksVar19.Q()) {
                            arrayList5.add(org.telegram.messenger.id.Z(2131743548, new Object[0]));
                            arrayList7.add(Integer.valueOf(R.drawable.msg_media));
                            arrayList6.add(1);
                        }
                    }
                    if (msVar.p) {
                        org.telegram.ui.Cells.f1.q(2131751537, arrayList5, arrayList7, valueOf5);
                        arrayList6.add(4);
                    }
                    if (msVar.a0 != null) {
                        document15 = msVar.W;
                        if (document15 != null) {
                            i22 = msVar.r;
                            z11 = true;
                            TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(i22).m0(msVar.a0, true);
                            if (m0 != null) {
                                ksVar17 = msVar.l;
                                if (ksVar17 != null) {
                                    ksVar18 = msVar.l;
                                    if (ksVar18.D()) {
                                        TLRPC.StickerSet stickerSet = m0.set;
                                        if (!stickerSet.emojis && !stickerSet.masks) {
                                            arrayList6.add(org.telegram.ui.Cells.f1.j(2131751223, arrayList5, R.drawable.msg_edit, arrayList7, 7));
                                        }
                                    }
                                }
                            }
                            if (m0 != null && m0.set.creator) {
                                ksVar15 = msVar.l;
                                if (ksVar15 != null) {
                                    ksVar16 = msVar.l;
                                    unused = msVar.W;
                                    if (ksVar16.I()) {
                                        arrayList5.add(org.telegram.messenger.id.L0(2131751495));
                                        arrayList7.add(valueOf5);
                                        arrayList6.add(8);
                                    }
                                }
                            }
                            if (!arrayList5.isEmpty()) {
                                return;
                            }
                            msVar.K = true;
                            x5Var15 = msVar.z;
                            x5Var15.invalidate();
                            es esVar = new es(this, arrayList6, z10);
                            actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                            ms.g(msVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            for (int i38 = 0; i38 < arrayList5.size(); i38++) {
                                int intValue = ((Integer) arrayList7.get(i38)).intValue();
                                CharSequence charSequence = (CharSequence) arrayList5.get(i38);
                                g6Var3 = msVar.c0;
                                org.telegram.ui.ActionBar.z0 c12 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, intValue, charSequence, false, g6Var3);
                                c12.setTag(Integer.valueOf(i38));
                                c12.setOnClickListener(esVar);
                                if (((Integer) arrayList6.get(i38)).intValue() == 8) {
                                    int i39 = org.telegram.ui.ActionBar.l6.q7;
                                    c12.c(i39, i39);
                                    c12.h(0.1f, i39);
                                }
                            }
                            fs fsVar = new fs(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            msVar.k = fsVar;
                            fsVar.e = true;
                            fsVar.c = 100;
                            fsVar.g = true;
                            fsVar.setOutsideTouchable(z11);
                            msVar.k.setClippingEnabled(z11);
                            msVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                            msVar.k.setFocusable(z11);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                            msVar.k.setInputMethodMode(2);
                            msVar.k.getContentView().setFocusableInTouchMode(z11);
                            bVar7 = msVar.q;
                            int i40 = bVar7.d;
                            bVar8 = msVar.q;
                            int i41 = i40 + bVar8.b;
                            bVar9 = msVar.q;
                            int i42 = bVar9.b;
                            i20 = msVar.V;
                            if (i20 == z11) {
                                x5Var24 = msVar.z;
                                int width2 = x5Var24.getWidth();
                                x5Var25 = msVar.z;
                                i21 = Math.min(width2, x5Var25.getHeight() - i41) - org.telegram.messenger.g0.L(40.0f);
                            } else {
                                if (msVar.S) {
                                    x5Var18 = msVar.z;
                                    int width3 = x5Var18.getWidth();
                                    x5Var19 = msVar.z;
                                    min = Math.min(width3, x5Var19.getHeight() - i41) - org.telegram.messenger.g0.N(40.0f);
                                } else {
                                    x5Var16 = msVar.z;
                                    int width4 = x5Var16.getWidth();
                                    x5Var17 = msVar.z;
                                    min = Math.min(width4, x5Var17.getHeight() - i41) / 1.8f;
                                }
                                i21 = (int) min;
                            }
                            f18 = msVar.e;
                            int i43 = i21 / 2;
                            int L3 = i42 + i43 + (msVar.G != null ? org.telegram.messenger.g0.L(40.0f) : 0);
                            x5Var20 = msVar.z;
                            int L4 = org.telegram.messenger.g0.L(24.0f) + ((int) (f18 + Math.max(L3, ((x5Var20.getHeight() - i41) - msVar.I) / 2) + i43));
                            if (msVar.S) {
                                L4 += org.telegram.messenger.g0.L(24.0f);
                            }
                            org.telegram.ui.ActionBar.g1 g1Var = msVar.k;
                            x5Var21 = msVar.z;
                            x5Var22 = msVar.z;
                            g1Var.showAtLocation(x5Var21, 0, (int) ((x5Var22.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), L4);
                            try {
                                x5Var23 = msVar.z;
                                x5Var23.performHapticFeedback(0);
                            } catch (Exception unused4) {
                            }
                        }
                    }
                    z11 = true;
                    if (!arrayList5.isEmpty()) {
                    }
                } else {
                    i11 = msVar.V;
                    if (i11 == 2) {
                        ksVar8 = msVar.l;
                        if (ksVar8 != null) {
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = new ArrayList();
                            ksVar9 = msVar.l;
                            i16 = msVar.V;
                            if (ksVar9.k(i16)) {
                                org.telegram.ui.Cells.f1.q(2131745626, arrayList8, arrayList10, valueOf4);
                                arrayList9.add(0);
                            }
                            ksVar10 = msVar.l;
                            document5 = msVar.W;
                            Boolean P = ksVar10.P(document5);
                            if (P != null) {
                                if (P.booleanValue()) {
                                    org.telegram.ui.Cells.f1.q(2131745546, arrayList8, arrayList10, valueOf);
                                    arrayList9.add(1);
                                } else {
                                    org.telegram.ui.Cells.f1.q(2131746288, arrayList8, arrayList10, valueOf);
                                    arrayList9.add(2);
                                }
                            }
                            ksVar11 = msVar.l;
                            document6 = msVar.W;
                            if (ksVar11.E(document6)) {
                                arrayList8.add(org.telegram.messenger.id.L0(2131751764));
                                arrayList10.add(Integer.valueOf(R.drawable.msg_copy));
                                arrayList9.add(3);
                            }
                            ksVar12 = msVar.l;
                            document7 = msVar.W;
                            if (ksVar12.N(document7)) {
                                org.telegram.ui.Cells.f1.q(2131746311, arrayList8, arrayList10, valueOf5);
                                arrayList9.add(4);
                            }
                            i17 = msVar.r;
                            org.telegram.messenger.ui b03 = org.telegram.messenger.ui.b0(i17);
                            document8 = msVar.W;
                            boolean A02 = b03.A0(document8);
                            document9 = msVar.W;
                            if (!org.telegram.messenger.ij.H2(document9)) {
                                document10 = msVar.W;
                                if (!org.telegram.messenger.ij.E3(document10)) {
                                    if (!A02) {
                                        i18 = msVar.r;
                                        if (org.telegram.messenger.ui.b0(i18).s()) {
                                            document11 = msVar.W;
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
                            msVar.K = true;
                            x5Var8 = msVar.z;
                            x5Var8.invalidate();
                            int[] iArr = new int[arrayList10.size()];
                            for (int i44 = 0; i44 < arrayList10.size(); i44++) {
                                iArr[i44] = ((Integer) arrayList10.get(i44)).intValue();
                            }
                            org.telegram.ui.Components.la0 la0Var = new org.telegram.ui.Components.la0(this, arrayList9, A02);
                            boolean g11 = ms.g(msVar, actionBarPopupWindow$ActionBarPopupWindowLayout3);
                            int i45 = 0;
                            while (i45 < arrayList8.size()) {
                                boolean z12 = !g11 && i45 == 0;
                                boolean z13 = i45 == arrayList8.size() + (-1);
                                int intValue2 = ((Integer) arrayList10.get(i45)).intValue();
                                CharSequence charSequence2 = (CharSequence) arrayList8.get(i45);
                                g6Var2 = msVar.c0;
                                org.telegram.ui.ActionBar.z0 c13 = org.telegram.ui.ActionBar.r0.c(z12, z13, actionBarPopupWindow$ActionBarPopupWindowLayout3, intValue2, charSequence2, false, g6Var2);
                                if (((Integer) arrayList9.get(i45)).intValue() == 4) {
                                    c13.c(org.telegram.ui.ActionBar.l6.q7, org.telegram.ui.ActionBar.l6.p7);
                                }
                                c13.setTag(Integer.valueOf(i45));
                                c13.setOnClickListener(la0Var);
                                i45++;
                            }
                            gs gsVar = new gs(this, actionBarPopupWindow$ActionBarPopupWindowLayout3);
                            msVar.k = gsVar;
                            gsVar.e = true;
                            gsVar.c = org.telegram.messenger.qs.g2;
                            gsVar.g = true;
                            gsVar.setOutsideTouchable(true);
                            msVar.k.setClippingEnabled(true);
                            msVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                            msVar.k.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout3.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                            msVar.k.setInputMethodMode(2);
                            msVar.k.getContentView().setFocusableInTouchMode(true);
                            bVar4 = msVar.q;
                            int i46 = bVar4.d;
                            bVar5 = msVar.q;
                            int i47 = i46 + bVar5.b;
                            bVar6 = msVar.q;
                            int i48 = bVar6.b;
                            x5Var9 = msVar.z;
                            int width5 = x5Var9.getWidth();
                            x5Var10 = msVar.z;
                            int min4 = Math.min(width5, x5Var10.getHeight() - i47) - org.telegram.messenger.g0.L(40.0f);
                            f14 = msVar.e;
                            int i49 = min4 / 2;
                            int L5 = i48 + i49 + (msVar.G != null ? org.telegram.messenger.g0.L(40.0f) : 0);
                            x5Var11 = msVar.z;
                            float max = (int) (f14 + Math.max(L5, ((x5Var11.getHeight() - i47) - msVar.I) / 2) + i49);
                            float L6 = org.telegram.messenger.g0.L(24.0f);
                            f15 = msVar.e;
                            int i50 = (int) ((L6 - f15) + max);
                            org.telegram.ui.ActionBar.g1 g1Var2 = msVar.k;
                            x5Var12 = msVar.z;
                            x5Var13 = msVar.z;
                            g1Var2.showAtLocation(x5Var12, 0, (int) ((x5Var13.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout3.getMeasuredWidth()) / 2.0f), i50);
                            org.telegram.ui.ActionBar.g1.i(actionBarPopupWindow$ActionBarPopupWindowLayout3);
                            try {
                                x5Var14 = msVar.z;
                                x5Var14.performHapticFeedback(0);
                            } catch (Exception unused5) {
                            }
                            f16 = msVar.e;
                            if (f16 != 0.0f) {
                                f17 = msVar.e;
                                msVar.f = f17;
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                final int i51 = 1;
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.cs
                                    public final /* synthetic */ is b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        switch (i51) {
                                            case 0:
                                                ms msVar2 = this.b.a;
                                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                msVar2.g = floatValue;
                                                float f21 = msVar2.f;
                                                msVar2.e = com.google.android.recaptcha.internal.a.z(0.0f, f21, floatValue, f21);
                                                msVar2.z.invalidate();
                                                break;
                                            case 1:
                                                ms msVar3 = this.b.a;
                                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                msVar3.g = floatValue2;
                                                float f22 = msVar3.f;
                                                msVar3.e = com.google.android.recaptcha.internal.a.z(0.0f, f22, floatValue2, f22);
                                                msVar3.z.invalidate();
                                                break;
                                            default:
                                                ms msVar4 = this.b.a;
                                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                msVar4.g = floatValue3;
                                                float f23 = msVar4.f;
                                                msVar4.e = com.google.android.recaptcha.internal.a.z(0.0f, f23, floatValue3, f23);
                                                msVar4.z.invalidate();
                                                break;
                                        }
                                    }
                                });
                                ofFloat2.setDuration(350L);
                                ofFloat2.setInterpolator(org.telegram.ui.Components.xq.f);
                                ofFloat2.start();
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                        }
                    }
                    ksVar = msVar.l;
                    if (ksVar != null) {
                        ArrayList arrayList11 = new ArrayList();
                        ArrayList arrayList12 = new ArrayList();
                        ArrayList arrayList13 = new ArrayList();
                        ksVar2 = msVar.l;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                        i12 = msVar.V;
                        if (ksVar2.k(i12)) {
                            ksVar7 = msVar.l;
                            if (!ksVar7.c()) {
                                org.telegram.ui.Cells.f1.q(2131745623, arrayList11, arrayList13, valueOf4);
                                arrayList12.add(0);
                            }
                        }
                        ksVar3 = msVar.l;
                        i13 = msVar.V;
                        if (ksVar3.k(i13)) {
                            ksVar6 = msVar.l;
                            if (!ksVar6.c()) {
                                org.telegram.ui.Cells.f1.q(2131745583, arrayList11, arrayList13, valueOf3);
                                arrayList12.add(4);
                            }
                        }
                        ksVar4 = msVar.l;
                        if (ksVar4.b()) {
                            org.telegram.ui.Cells.f1.q(2131745860, arrayList11, arrayList13, valueOf2);
                            arrayList12.add(3);
                        }
                        document = msVar.W;
                        if (document != null) {
                            ksVar5 = msVar.l;
                            document4 = msVar.W;
                            if (ksVar5.e(document4)) {
                                arrayList12.add(org.telegram.ui.Cells.f1.j(2131754485, arrayList11, R.drawable.outline_caption_24, arrayList13, 11));
                            }
                        }
                        document2 = msVar.W;
                        if (document2 != null) {
                            i15 = msVar.r;
                            org.telegram.messenger.ui b04 = org.telegram.messenger.ui.b0(i15);
                            document3 = msVar.W;
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
                        msVar.K = true;
                        x5Var = msVar.z;
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
                            g6Var = msVar.c0;
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                            org.telegram.ui.ActionBar.z0 c14 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, intValue3, charSequence3, false, g6Var);
                            c14.setTag(Integer.valueOf(i54));
                            c14.setOnClickListener(u41Var);
                            if (z9 && i54 == arrayList11.size() - 1) {
                                c14.c(org.telegram.ui.ActionBar.l6.q7, org.telegram.ui.ActionBar.l6.p7);
                            }
                            i54++;
                            actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout5;
                        }
                        actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                        hs hsVar = new hs(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                        msVar.k = hsVar;
                        hsVar.e = true;
                        hsVar.c = org.telegram.messenger.qs.g2;
                        hsVar.g = true;
                        hsVar.setOutsideTouchable(true);
                        msVar.k.setClippingEnabled(true);
                        msVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                        msVar.k.setFocusable(true);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                        msVar.k.setInputMethodMode(2);
                        msVar.k.getContentView().setFocusableInTouchMode(true);
                        bVar = msVar.q;
                        int i55 = bVar.d;
                        bVar2 = msVar.q;
                        int i56 = i55 + bVar2.b;
                        bVar3 = msVar.q;
                        int i57 = bVar3.b;
                        x5Var2 = msVar.z;
                        int width6 = x5Var2.getWidth();
                        x5Var3 = msVar.z;
                        int min5 = Math.min(width6, x5Var3.getHeight() - i56) - org.telegram.messenger.g0.L(40.0f);
                        f10 = msVar.e;
                        int i58 = min5 / 2;
                        int L7 = i57 + i58 + (msVar.G != null ? org.telegram.messenger.g0.L(40.0f) : 0);
                        x5Var4 = msVar.z;
                        float max2 = (int) (f10 + Math.max(L7, ((x5Var4.getHeight() - i56) - msVar.I) / 2) + i58);
                        float L8 = org.telegram.messenger.g0.L(24.0f);
                        f11 = msVar.e;
                        int i59 = (int) ((L8 - f11) + max2);
                        org.telegram.ui.ActionBar.g1 g1Var3 = msVar.k;
                        x5Var5 = msVar.z;
                        x5Var6 = msVar.z;
                        i14 = 0;
                        g1Var3.showAtLocation(x5Var5, 0, (int) ((x5Var6.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i59);
                        try {
                            x5Var7 = msVar.z;
                            x5Var7.performHapticFeedback(0);
                        } catch (Exception unused6) {
                        }
                        f12 = msVar.e;
                        if (f12 != 0.0f) {
                            f13 = msVar.e;
                            msVar.f = f13;
                            final int i60 = 2;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.cs
                                public final /* synthetic */ is b;

                                {
                                    this.b = this;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (i60) {
                                        case 0:
                                            ms msVar2 = this.b.a;
                                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            msVar2.g = floatValue;
                                            float f21 = msVar2.f;
                                            msVar2.e = com.google.android.recaptcha.internal.a.z(0.0f, f21, floatValue, f21);
                                            msVar2.z.invalidate();
                                            break;
                                        case 1:
                                            ms msVar3 = this.b.a;
                                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            msVar3.g = floatValue2;
                                            float f22 = msVar3.f;
                                            msVar3.e = com.google.android.recaptcha.internal.a.z(0.0f, f22, floatValue2, f22);
                                            msVar3.z.invalidate();
                                            break;
                                        default:
                                            ms msVar4 = this.b.a;
                                            float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            msVar4.g = floatValue3;
                                            float f23 = msVar4.f;
                                            msVar4.e = com.google.android.recaptcha.internal.a.z(0.0f, f23, floatValue3, f23);
                                            msVar4.z.invalidate();
                                            break;
                                    }
                                }
                            });
                            ofFloat3.setDuration(350L);
                            ofFloat3.setInterpolator(org.telegram.ui.Components.xq.f);
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
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout32 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i7, msVar.z.getContext(), msVar.c0);
        org.telegram.ui.ActionBar.g6 g6Var42 = null;
        fh.g c102 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout32, null, true);
        c102.p(c8.g0.k(msVar.c0));
        org.telegram.messenger.camera.q.p(c102, org.telegram.messenger.g0.L(12.0f), 8.0f);
        c102.Q.e = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout32.setBackground(c102);
        if (msVar.V != 3) {
        }
        i14 = 0;
        i27 = i14;
        while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
        }
    }
}
