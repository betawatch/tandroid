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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class gs implements Runnable {
    public final /* synthetic */ ks a;

    public gs(ks ksVar) {
        this.a = ksVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x06cc, code lost:
    
        if (org.telegram.messenger.ij.w4(r0) != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0a09, code lost:
    
        if (org.telegram.messenger.ij.w4(r6) != false) goto L228;
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
        is isVar;
        is isVar2;
        int i12;
        is isVar3;
        int i13;
        is isVar4;
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
        org.telegram.ui.ActionBar.f6 f6Var;
        int i15;
        TLRPC.Document document3;
        is isVar5;
        TLRPC.Document document4;
        is isVar6;
        is isVar7;
        is isVar8;
        is isVar9;
        int i16;
        is isVar10;
        TLRPC.Document document5;
        is isVar11;
        TLRPC.Document document6;
        is isVar12;
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
        org.telegram.ui.ActionBar.f6 f6Var2;
        TLRPC.Document document10;
        int i18;
        TLRPC.Document document11;
        TLRPC.Document document12;
        int i19;
        TLRPC.Document document13;
        is isVar13;
        boolean z10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        TLRPC.Document document14;
        is isVar14;
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
        org.telegram.ui.ActionBar.f6 f6Var3;
        TLRPC.Document document15;
        int i22;
        is isVar15;
        is isVar16;
        is isVar17;
        is isVar18;
        TLRPC.InputStickerSet inputStickerSet;
        is isVar19;
        int i23;
        TLRPC.Document document16;
        is isVar20;
        int i24;
        is isVar21;
        int i25;
        is isVar22;
        is isVar23;
        is isVar24;
        is isVar25;
        int i26;
        bi.x5 x5Var26;
        bi.x5 x5Var27;
        int i27;
        e61 e61Var;
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
        ks ksVar = this.a;
        dh.c cVar = ksVar.t;
        if (ksVar.w == null || ksVar.m) {
            return;
        }
        ksVar.R = true;
        is isVar26 = ksVar.l;
        if (isVar26 != null && (m10 = isVar26.m(ksVar.z)) != null) {
            m10.Q(cVar, c8.g0.k(ksVar.c0), true);
            m10.t = false;
            m10.Y();
            m10.p = new bh(this, 16);
            ViewGroup viewGroup = m10.A;
            bs bsVar = new bs(this, viewGroup);
            ksVar.k = bsVar;
            bsVar.e = true;
            bsVar.c = org.telegram.messenger.qs.g2;
            bsVar.g = true;
            bsVar.setOutsideTouchable(true);
            ksVar.k.setClippingEnabled(true);
            ksVar.k.setAnimationStyle(R.style.PopupContextAnimation);
            ksVar.k.setFocusable(true);
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
            ksVar.k.setInputMethodMode(2);
            ksVar.k.getContentView().setFocusableInTouchMode(true);
            i0.b bVar13 = ksVar.q;
            int min2 = (Math.min(ksVar.z.getWidth(), ksVar.z.getHeight() - (bVar13.d + bVar13.b)) - org.telegram.messenger.g0.L(40.0f)) / 2;
            int L = (int) ((org.telegram.messenger.g0.L(24.0f) - ksVar.e) + ((int) (ksVar.e + Math.max(r2 + min2 + (ksVar.G != null ? org.telegram.messenger.g0.L(40.0f) : 0), ((ksVar.z.getHeight() - r3) - ksVar.I) / 2) + min2)));
            ksVar.k.showAtLocation(ksVar.z, 0, (int) ((r4.getMeasuredWidth() - viewGroup.getMeasuredWidth()) / 2.0f), L);
            try {
                ksVar.z.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            float f20 = ksVar.e;
            if (f20 != 0.0f) {
                ksVar.f = f20;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                final int i28 = 0;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.as
                    public final /* synthetic */ gs b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i28) {
                            case 0:
                                ks ksVar2 = this.b.a;
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ksVar2.g = floatValue;
                                float f21 = ksVar2.f;
                                ksVar2.e = com.google.android.recaptcha.internal.a.z(0.0f, f21, floatValue, f21);
                                ksVar2.z.invalidate();
                                break;
                            case 1:
                                ks ksVar3 = this.b.a;
                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ksVar3.g = floatValue2;
                                float f22 = ksVar3.f;
                                ksVar3.e = com.google.android.recaptcha.internal.a.z(0.0f, f22, floatValue2, f22);
                                ksVar3.z.invalidate();
                                break;
                            default:
                                ks ksVar4 = this.b.a;
                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ksVar4.g = floatValue3;
                                float f23 = ksVar4.f;
                                ksVar4.e = com.google.android.recaptcha.internal.a.z(0.0f, f23, floatValue3, f23);
                                ksVar4.z.invalidate();
                                break;
                        }
                    }
                });
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(org.telegram.ui.Components.xq.f);
                ofFloat.start();
            }
            ksVar.K = true;
            return;
        }
        int i29 = 0;
        if (ksVar.V != 3) {
            is isVar27 = ksVar.l;
            if (isVar27 != null) {
                TLRPC.TL_messageMediaPoll d = isVar27.d();
                TLRPC.PollAnswer g10 = ksVar.l.g();
                if (d != null && d.poll != null && g10 != null) {
                    TLRPC.PollAnswerVoters F1 = org.telegram.messenger.ij.F1(d, g10.option);
                    if (F1 != null && F1.voters > 0) {
                        org.telegram.messenger.ij.A(d);
                    }
                }
            }
            i7 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i7, ksVar.z.getContext(), ksVar.c0);
            org.telegram.ui.ActionBar.f6 f6Var4 = null;
            fh.g c10 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout3, null, true);
            c10.p(c8.g0.k(ksVar.c0));
            org.telegram.messenger.camera.q.p(c10, org.telegram.messenger.g0.L(12.0f), 8.0f);
            c10.Q.e = true;
            actionBarPopupWindow$ActionBarPopupWindowLayout3.setBackground(c10);
            if (ksVar.V != 3) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ksVar.T;
                int i30 = R.drawable.menu_sticker_add;
                if (tL_messages_stickerSet == null) {
                    is isVar28 = ksVar.l;
                    if (isVar28 == null || !isVar28.B()) {
                        if (ksVar.l.y()) {
                            arrayList.add(org.telegram.messenger.hd.M0(2131745589, null));
                            arrayList3.add(valueOf4);
                            arrayList2.add(0);
                        }
                        org.telegram.ui.Cells.f1.t(null, 2131754374, arrayList, R.drawable.msg_fave, arrayList3);
                        arrayList2.add(1);
                    } else {
                        org.telegram.ui.Cells.f1.t(null, 2131745525, arrayList, R.drawable.menu_sticker_add, arrayList3);
                        arrayList2.add(0);
                    }
                }
                is isVar29 = ksVar.l;
                if (isVar29 == null || !isVar29.B()) {
                    is isVar30 = ksVar.l;
                    arrayList.add(org.telegram.messenger.hd.M0((isVar30 == null || !isVar30.J()) ? 2131754370 : 2131744850, null));
                    is isVar31 = ksVar.l;
                    if (isVar31 != null && isVar31.J()) {
                        i30 = R.drawable.msg_replace;
                    }
                    arrayList3.add(Integer.valueOf(i30));
                    arrayList2.add(2);
                }
                int i31 = 7;
                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, ksVar.w, ksVar.c0, true, false);
                z0Var.setItemHeight(44);
                z0Var.j(org.telegram.messenger.hd.M0(2131753756, null), R.drawable.msg_arrow_back, null);
                z0Var.getTextView().setPadding(org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0);
                FrameLayout frameLayout = new FrameLayout(ksVar.z.getContext());
                LinearLayout linearLayout = new LinearLayout(ksVar.z.getContext());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, linearLayout, ksVar.c0);
                linearLayout.setOrientation(1);
                if (ksVar.w == null) {
                    e61Var = null;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new TLRPC.TL_stickerSetNoCovered());
                    TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = new TLRPC.TL_messages_getMyStickers();
                    tL_messages_getMyStickers.limit = 100;
                    ConnectionsManager.getInstance(ksVar.r).sendRequest(tL_messages_getMyStickers, new z9(ksVar, arrayList4, tL_messages_getMyStickers, i31));
                    e61Var = new e61(8, ksVar.w, f6Var4);
                    e61Var.setLayoutManager(new v4.b0());
                    e61Var.i(new fi.o1(arrayList4, 4));
                    e61Var.setAdapter(new hs(ksVar, arrayList4));
                }
                e61Var.setOnItemClickListener(new h(this, 6));
                frameLayout.addView(z0Var);
                linearLayout.addView(frameLayout);
                linearLayout.addView(new org.telegram.ui.ActionBar.d1(ksVar.z.getContext(), ksVar.c0), c8.ha.o(-1, 8));
                di.d0 d0Var = new di.d0(this, arrayList2, e61Var, linearLayout, actionBarPopupWindow$ActionBarPopupWindowLayout3, 13);
                for (int i32 = 0; i32 < arrayList.size(); i32++) {
                    org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, ((Integer) arrayList3.get(i32)).intValue(), (CharSequence) arrayList.get(i32), false, ksVar.c0);
                    c11.setTag(Integer.valueOf(i32));
                    c11.setOnClickListener(d0Var);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout3.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                linearLayout.addView(e61Var, new LinearLayout.LayoutParams(actionBarPopupWindow$ActionBarPopupWindowLayout3.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f), (int) (actionBarPopupWindow$ActionBarPopupWindowLayout3.getMeasuredHeight() * 1.5f)));
                actionBarPopupWindow$ActionBarPopupWindowLayout3.b(linearLayout);
                frameLayout.setOnClickListener(new cf(actionBarPopupWindow$ActionBarPopupWindowLayout3, 2));
                bVar10 = ksVar.q;
                int i33 = bVar10.d;
                bVar11 = ksVar.q;
                int i34 = i33 + bVar11.b;
                bVar12 = ksVar.q;
                int i35 = bVar12.b;
                x5Var28 = ksVar.z;
                int width = x5Var28.getWidth();
                x5Var29 = ksVar.z;
                int min3 = (int) (Math.min(width, x5Var29.getHeight() - i34) / 1.8f);
                f19 = ksVar.e;
                x5Var30 = ksVar.z;
                int L2 = org.telegram.messenger.g0.L(84.0f) + ((int) (f19 + Math.max(i35 + r3, ((x5Var30.getHeight() - i34) - ksVar.I) / 2) + (min3 / 2)));
                x5Var31 = ksVar.z;
                x5Var31.addView(actionBarPopupWindow$ActionBarPopupWindowLayout3, c8.ha.d(-2, -2.0f, 49, 0.0f, L2 / org.telegram.messenger.g0.p, 0.0f, 0.0f));
                ksVar.L = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                view = ksVar.L;
                view.setTranslationY(-org.telegram.messenger.g0.L(12.0f));
                view2 = ksVar.L;
                view2.setAlpha(0.0f);
                view3 = ksVar.L;
                view3.setScaleX(0.8f);
                view4 = ksVar.L;
                view4.setScaleY(0.8f);
                view5 = ksVar.L;
                view5.setPivotY(0.0f);
                view6 = ksVar.L;
                view7 = ksVar.L;
                view6.setPivotX(view7.getMeasuredWidth() / 2.0f);
                view8 = ksVar.L;
                view8.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.xq.h).start();
                if (ksVar.P == null) {
                    org.telegram.ui.Components.lb lbVar = new org.telegram.ui.Components.lb(ksVar, ksVar.z.getContext(), org.telegram.messenger.p10.s0, ksVar.c0);
                    ksVar.P = lbVar;
                    lbVar.N0 = true;
                    lbVar.setPadding(0, org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f));
                    ksVar.P.setClipChildren(false);
                    ksVar.P.setClipToPadding(false);
                    ksVar.P.setVisibility(0);
                    ksVar.P.setHint(org.telegram.messenger.hd.M0(2131744849, null));
                    ksVar.P.setBubbleOffset(-org.telegram.messenger.g0.L(105.0f));
                    ksVar.P.setMiniBubblesOffset(-org.telegram.messenger.g0.L(14.0f));
                    FrameLayout frameLayout2 = new FrameLayout(ksVar.z.getContext());
                    ksVar.Q = frameLayout2;
                    frameLayout2.addView(ksVar.P, c8.ha.d(-2, 116.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                    ksVar.z.addView(ksVar.Q, c8.ha.d(-2, -2.0f, 1, 0.0f, 100.0f, 0.0f, 0.0f));
                }
                ksVar.P.setSelectedEmojis(ksVar.o);
                ksVar.P.setDelegate(new yr(ksVar));
                ksVar.P.p(null, null, false);
                ksVar.Q.setScaleY(0.6f);
                ksVar.Q.setScaleX(0.6f);
                ksVar.Q.setAlpha(0.0f);
                org.telegram.messenger.g0.i3(new xr(ksVar, 2), 10L);
                ksVar.K = true;
                x5Var32 = ksVar.z;
                x5Var32.invalidate();
                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout3;
            } else {
                int i36 = 1;
                i10 = ksVar.V;
                int i37 = R.drawable.msg_unfave;
                if (i10 == 0) {
                    document12 = ksVar.W;
                    if (org.telegram.messenger.ij.Y3(document12)) {
                        i26 = ksVar.r;
                        if (!org.telegram.messenger.c.a(i26).d().q()) {
                            if (ksVar.O == null) {
                                k0 k0Var = new k0(ksVar.z.getContext(), ksVar.c0);
                                ksVar.O = k0Var;
                                ksVar.z.addView(k0Var, c8.ha.c(-1.0f, -1));
                                ksVar.O.setOnClickListener(new zr(ksVar, i29));
                                ((ug.p0) ksVar.O.b).w.setOnClickListener(new zr(ksVar, i36));
                            }
                            org.telegram.messenger.g0.Z3(ksVar.O, false, 1.0f, true, false);
                            org.telegram.messenger.g0.X3(ksVar.O, true);
                            ksVar.O.setTranslationY(0.0f);
                            ksVar.K = true;
                            x5Var26 = ksVar.z;
                            x5Var26.invalidate();
                            try {
                                x5Var27 = ksVar.z;
                                x5Var27.performHapticFeedback(0);
                                return;
                            } catch (Exception unused3) {
                                return;
                            }
                        }
                    }
                    i19 = ksVar.r;
                    org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i19);
                    document13 = ksVar.W;
                    boolean A0 = b02.A0(document13);
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    isVar13 = ksVar.l;
                    if (isVar13 != null) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                        isVar20 = ksVar.l;
                        z10 = A0;
                        i24 = ksVar.V;
                        if (isVar20.k(i24)) {
                            isVar25 = ksVar.l;
                            if (!isVar25.c()) {
                                org.telegram.ui.Cells.f1.q(2131745589, arrayList5, arrayList7, valueOf4);
                                arrayList6.add(0);
                            }
                        }
                        isVar21 = ksVar.l;
                        i25 = ksVar.V;
                        if (isVar21.k(i25)) {
                            isVar24 = ksVar.l;
                            if (!isVar24.c()) {
                                arrayList5.add(org.telegram.messenger.hd.L0(2131745584));
                                arrayList7.add(valueOf3);
                                arrayList6.add(6);
                            }
                        }
                        isVar22 = ksVar.l;
                        if (isVar22.b()) {
                            org.telegram.ui.Cells.f1.q(2131745861, arrayList5, arrayList7, valueOf2);
                            arrayList6.add(3);
                        }
                        isVar23 = ksVar.l;
                        if (isVar23.f()) {
                            org.telegram.ui.Cells.f1.q(2131749226, arrayList5, arrayList7, valueOf5);
                            arrayList6.add(5);
                        }
                    } else {
                        z10 = A0;
                        actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                    }
                    document14 = ksVar.W;
                    if (!org.telegram.messenger.ij.F3(document14)) {
                        if (!z10) {
                            i23 = ksVar.r;
                            if (org.telegram.messenger.ui.b0(i23).s()) {
                                document16 = ksVar.W;
                            }
                        }
                        arrayList5.add(z10 ? org.telegram.messenger.hd.L0(2131751539) : org.telegram.messenger.hd.L0(2131754374));
                        if (!z10) {
                            i37 = R.drawable.msg_fave;
                        }
                        arrayList7.add(Integer.valueOf(i37));
                        arrayList6.add(2);
                    }
                    isVar14 = ksVar.l;
                    if (isVar14 != null && (inputStickerSet = ksVar.a0) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                        isVar19 = ksVar.l;
                        if (isVar19.Q()) {
                            arrayList5.add(org.telegram.messenger.hd.Z(2131743549, new Object[0]));
                            arrayList7.add(Integer.valueOf(R.drawable.msg_media));
                            arrayList6.add(1);
                        }
                    }
                    if (ksVar.p) {
                        org.telegram.ui.Cells.f1.q(2131751538, arrayList5, arrayList7, valueOf5);
                        arrayList6.add(4);
                    }
                    if (ksVar.a0 != null) {
                        document15 = ksVar.W;
                        if (document15 != null) {
                            i22 = ksVar.r;
                            z11 = true;
                            TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(i22).m0(ksVar.a0, true);
                            if (m0 != null) {
                                isVar17 = ksVar.l;
                                if (isVar17 != null) {
                                    isVar18 = ksVar.l;
                                    if (isVar18.D()) {
                                        TLRPC.StickerSet stickerSet = m0.set;
                                        if (!stickerSet.emojis && !stickerSet.masks) {
                                            arrayList6.add(org.telegram.ui.Cells.f1.j(2131751224, arrayList5, R.drawable.msg_edit, arrayList7, 7));
                                        }
                                    }
                                }
                            }
                            if (m0 != null && m0.set.creator) {
                                isVar15 = ksVar.l;
                                if (isVar15 != null) {
                                    isVar16 = ksVar.l;
                                    unused = ksVar.W;
                                    if (isVar16.I()) {
                                        arrayList5.add(org.telegram.messenger.hd.L0(2131751496));
                                        arrayList7.add(valueOf5);
                                        arrayList6.add(8);
                                    }
                                }
                            }
                            if (!arrayList5.isEmpty()) {
                                return;
                            }
                            ksVar.K = true;
                            x5Var15 = ksVar.z;
                            x5Var15.invalidate();
                            cs csVar = new cs(this, arrayList6, z10);
                            actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                            ks.g(ksVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            for (int i38 = 0; i38 < arrayList5.size(); i38++) {
                                int intValue = ((Integer) arrayList7.get(i38)).intValue();
                                CharSequence charSequence = (CharSequence) arrayList5.get(i38);
                                f6Var3 = ksVar.c0;
                                org.telegram.ui.ActionBar.z0 c12 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, intValue, charSequence, false, f6Var3);
                                c12.setTag(Integer.valueOf(i38));
                                c12.setOnClickListener(csVar);
                                if (((Integer) arrayList6.get(i38)).intValue() == 8) {
                                    int i39 = org.telegram.ui.ActionBar.k6.q7;
                                    c12.c(i39, i39);
                                    c12.h(0.1f, i39);
                                }
                            }
                            ds dsVar = new ds(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            ksVar.k = dsVar;
                            dsVar.e = true;
                            dsVar.c = 100;
                            dsVar.g = true;
                            dsVar.setOutsideTouchable(z11);
                            ksVar.k.setClippingEnabled(z11);
                            ksVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                            ksVar.k.setFocusable(z11);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                            ksVar.k.setInputMethodMode(2);
                            ksVar.k.getContentView().setFocusableInTouchMode(z11);
                            bVar7 = ksVar.q;
                            int i40 = bVar7.d;
                            bVar8 = ksVar.q;
                            int i41 = i40 + bVar8.b;
                            bVar9 = ksVar.q;
                            int i42 = bVar9.b;
                            i20 = ksVar.V;
                            if (i20 == z11) {
                                x5Var24 = ksVar.z;
                                int width2 = x5Var24.getWidth();
                                x5Var25 = ksVar.z;
                                i21 = Math.min(width2, x5Var25.getHeight() - i41) - org.telegram.messenger.g0.L(40.0f);
                            } else {
                                if (ksVar.S) {
                                    x5Var18 = ksVar.z;
                                    int width3 = x5Var18.getWidth();
                                    x5Var19 = ksVar.z;
                                    min = Math.min(width3, x5Var19.getHeight() - i41) - org.telegram.messenger.g0.N(40.0f);
                                } else {
                                    x5Var16 = ksVar.z;
                                    int width4 = x5Var16.getWidth();
                                    x5Var17 = ksVar.z;
                                    min = Math.min(width4, x5Var17.getHeight() - i41) / 1.8f;
                                }
                                i21 = (int) min;
                            }
                            f18 = ksVar.e;
                            int i43 = i21 / 2;
                            int L3 = i42 + i43 + (ksVar.G != null ? org.telegram.messenger.g0.L(40.0f) : 0);
                            x5Var20 = ksVar.z;
                            int L4 = org.telegram.messenger.g0.L(24.0f) + ((int) (f18 + Math.max(L3, ((x5Var20.getHeight() - i41) - ksVar.I) / 2) + i43));
                            if (ksVar.S) {
                                L4 += org.telegram.messenger.g0.L(24.0f);
                            }
                            org.telegram.ui.ActionBar.g1 g1Var = ksVar.k;
                            x5Var21 = ksVar.z;
                            x5Var22 = ksVar.z;
                            g1Var.showAtLocation(x5Var21, 0, (int) ((x5Var22.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), L4);
                            try {
                                x5Var23 = ksVar.z;
                                x5Var23.performHapticFeedback(0);
                            } catch (Exception unused4) {
                            }
                        }
                    }
                    z11 = true;
                    if (!arrayList5.isEmpty()) {
                    }
                } else {
                    i11 = ksVar.V;
                    if (i11 == 2) {
                        isVar8 = ksVar.l;
                        if (isVar8 != null) {
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = new ArrayList();
                            isVar9 = ksVar.l;
                            i16 = ksVar.V;
                            if (isVar9.k(i16)) {
                                org.telegram.ui.Cells.f1.q(2131745627, arrayList8, arrayList10, valueOf4);
                                arrayList9.add(0);
                            }
                            isVar10 = ksVar.l;
                            document5 = ksVar.W;
                            Boolean P = isVar10.P(document5);
                            if (P != null) {
                                if (P.booleanValue()) {
                                    org.telegram.ui.Cells.f1.q(2131745547, arrayList8, arrayList10, valueOf);
                                    arrayList9.add(1);
                                } else {
                                    org.telegram.ui.Cells.f1.q(2131746287, arrayList8, arrayList10, valueOf);
                                    arrayList9.add(2);
                                }
                            }
                            isVar11 = ksVar.l;
                            document6 = ksVar.W;
                            if (isVar11.E(document6)) {
                                arrayList8.add(org.telegram.messenger.hd.L0(2131751764));
                                arrayList10.add(Integer.valueOf(R.drawable.msg_copy));
                                arrayList9.add(3);
                            }
                            isVar12 = ksVar.l;
                            document7 = ksVar.W;
                            if (isVar12.N(document7)) {
                                org.telegram.ui.Cells.f1.q(2131746310, arrayList8, arrayList10, valueOf5);
                                arrayList9.add(4);
                            }
                            i17 = ksVar.r;
                            org.telegram.messenger.ui b03 = org.telegram.messenger.ui.b0(i17);
                            document8 = ksVar.W;
                            boolean A02 = b03.A0(document8);
                            document9 = ksVar.W;
                            if (!org.telegram.messenger.ij.I2(document9)) {
                                document10 = ksVar.W;
                                if (!org.telegram.messenger.ij.F3(document10)) {
                                    if (!A02) {
                                        i18 = ksVar.r;
                                        if (org.telegram.messenger.ui.b0(i18).s()) {
                                            document11 = ksVar.W;
                                        }
                                    }
                                    arrayList8.add(A02 ? org.telegram.messenger.hd.L0(2131751539) : org.telegram.messenger.hd.L0(2131754374));
                                    arrayList10.add(Integer.valueOf(A02 ? R.drawable.msg_unfave : R.drawable.msg_fave));
                                    arrayList9.add(5);
                                }
                            }
                            if (arrayList8.isEmpty()) {
                                return;
                            }
                            ksVar.K = true;
                            x5Var8 = ksVar.z;
                            x5Var8.invalidate();
                            int[] iArr = new int[arrayList10.size()];
                            for (int i44 = 0; i44 < arrayList10.size(); i44++) {
                                iArr[i44] = ((Integer) arrayList10.get(i44)).intValue();
                            }
                            org.telegram.ui.Components.ka0 ka0Var = new org.telegram.ui.Components.ka0(this, arrayList9, A02);
                            boolean g11 = ks.g(ksVar, actionBarPopupWindow$ActionBarPopupWindowLayout3);
                            int i45 = 0;
                            while (i45 < arrayList8.size()) {
                                boolean z12 = !g11 && i45 == 0;
                                boolean z13 = i45 == arrayList8.size() + (-1);
                                int intValue2 = ((Integer) arrayList10.get(i45)).intValue();
                                CharSequence charSequence2 = (CharSequence) arrayList8.get(i45);
                                f6Var2 = ksVar.c0;
                                org.telegram.ui.ActionBar.z0 c13 = org.telegram.ui.ActionBar.r0.c(z12, z13, actionBarPopupWindow$ActionBarPopupWindowLayout3, intValue2, charSequence2, false, f6Var2);
                                if (((Integer) arrayList9.get(i45)).intValue() == 4) {
                                    c13.c(org.telegram.ui.ActionBar.k6.q7, org.telegram.ui.ActionBar.k6.p7);
                                }
                                c13.setTag(Integer.valueOf(i45));
                                c13.setOnClickListener(ka0Var);
                                i45++;
                            }
                            es esVar = new es(this, actionBarPopupWindow$ActionBarPopupWindowLayout3);
                            ksVar.k = esVar;
                            esVar.e = true;
                            esVar.c = org.telegram.messenger.qs.g2;
                            esVar.g = true;
                            esVar.setOutsideTouchable(true);
                            ksVar.k.setClippingEnabled(true);
                            ksVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                            ksVar.k.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout3.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                            ksVar.k.setInputMethodMode(2);
                            ksVar.k.getContentView().setFocusableInTouchMode(true);
                            bVar4 = ksVar.q;
                            int i46 = bVar4.d;
                            bVar5 = ksVar.q;
                            int i47 = i46 + bVar5.b;
                            bVar6 = ksVar.q;
                            int i48 = bVar6.b;
                            x5Var9 = ksVar.z;
                            int width5 = x5Var9.getWidth();
                            x5Var10 = ksVar.z;
                            int min4 = Math.min(width5, x5Var10.getHeight() - i47) - org.telegram.messenger.g0.L(40.0f);
                            f14 = ksVar.e;
                            int i49 = min4 / 2;
                            int L5 = i48 + i49 + (ksVar.G != null ? org.telegram.messenger.g0.L(40.0f) : 0);
                            x5Var11 = ksVar.z;
                            float max = (int) (f14 + Math.max(L5, ((x5Var11.getHeight() - i47) - ksVar.I) / 2) + i49);
                            float L6 = org.telegram.messenger.g0.L(24.0f);
                            f15 = ksVar.e;
                            int i50 = (int) ((L6 - f15) + max);
                            org.telegram.ui.ActionBar.g1 g1Var2 = ksVar.k;
                            x5Var12 = ksVar.z;
                            x5Var13 = ksVar.z;
                            g1Var2.showAtLocation(x5Var12, 0, (int) ((x5Var13.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout3.getMeasuredWidth()) / 2.0f), i50);
                            org.telegram.ui.ActionBar.g1.i(actionBarPopupWindow$ActionBarPopupWindowLayout3);
                            try {
                                x5Var14 = ksVar.z;
                                x5Var14.performHapticFeedback(0);
                            } catch (Exception unused5) {
                            }
                            f16 = ksVar.e;
                            if (f16 != 0.0f) {
                                f17 = ksVar.e;
                                ksVar.f = f17;
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                final int i51 = 1;
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.as
                                    public final /* synthetic */ gs b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        switch (i51) {
                                            case 0:
                                                ks ksVar2 = this.b.a;
                                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                ksVar2.g = floatValue;
                                                float f21 = ksVar2.f;
                                                ksVar2.e = com.google.android.recaptcha.internal.a.z(0.0f, f21, floatValue, f21);
                                                ksVar2.z.invalidate();
                                                break;
                                            case 1:
                                                ks ksVar3 = this.b.a;
                                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                ksVar3.g = floatValue2;
                                                float f22 = ksVar3.f;
                                                ksVar3.e = com.google.android.recaptcha.internal.a.z(0.0f, f22, floatValue2, f22);
                                                ksVar3.z.invalidate();
                                                break;
                                            default:
                                                ks ksVar4 = this.b.a;
                                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                ksVar4.g = floatValue3;
                                                float f23 = ksVar4.f;
                                                ksVar4.e = com.google.android.recaptcha.internal.a.z(0.0f, f23, floatValue3, f23);
                                                ksVar4.z.invalidate();
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
                    isVar = ksVar.l;
                    if (isVar != null) {
                        ArrayList arrayList11 = new ArrayList();
                        ArrayList arrayList12 = new ArrayList();
                        ArrayList arrayList13 = new ArrayList();
                        isVar2 = ksVar.l;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                        i12 = ksVar.V;
                        if (isVar2.k(i12)) {
                            isVar7 = ksVar.l;
                            if (!isVar7.c()) {
                                org.telegram.ui.Cells.f1.q(2131745624, arrayList11, arrayList13, valueOf4);
                                arrayList12.add(0);
                            }
                        }
                        isVar3 = ksVar.l;
                        i13 = ksVar.V;
                        if (isVar3.k(i13)) {
                            isVar6 = ksVar.l;
                            if (!isVar6.c()) {
                                org.telegram.ui.Cells.f1.q(2131745584, arrayList11, arrayList13, valueOf3);
                                arrayList12.add(4);
                            }
                        }
                        isVar4 = ksVar.l;
                        if (isVar4.b()) {
                            org.telegram.ui.Cells.f1.q(2131745861, arrayList11, arrayList13, valueOf2);
                            arrayList12.add(3);
                        }
                        document = ksVar.W;
                        if (document != null) {
                            isVar5 = ksVar.l;
                            document4 = ksVar.W;
                            if (isVar5.e(document4)) {
                                arrayList12.add(org.telegram.ui.Cells.f1.j(2131754485, arrayList11, R.drawable.outline_caption_24, arrayList13, 11));
                            }
                        }
                        document2 = ksVar.W;
                        if (document2 != null) {
                            i15 = ksVar.r;
                            org.telegram.messenger.ui b04 = org.telegram.messenger.ui.b0(i15);
                            document3 = ksVar.W;
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
                                arrayList11.add(org.telegram.messenger.hd.Y(2131751599, "Delete", new Object[0]));
                                arrayList13.add(valueOf5);
                                arrayList12.add(1);
                            } else {
                                arrayList11.add(org.telegram.messenger.hd.Y(2131745931, "SaveToGIFs", new Object[0]));
                                arrayList13.add(Integer.valueOf(R.drawable.msg_gif_add));
                                arrayList12.add(2);
                            }
                        } else {
                            z9 = false;
                        }
                        if (arrayList11.isEmpty()) {
                            return;
                        }
                        ksVar.K = true;
                        x5Var = ksVar.z;
                        x5Var.invalidate();
                        int[] iArr2 = new int[arrayList13.size()];
                        for (int i53 = 0; i53 < arrayList13.size(); i53++) {
                            iArr2[i53] = ((Integer) arrayList13.get(i53)).intValue();
                        }
                        org.telegram.ui.Components.t41 t41Var = new org.telegram.ui.Components.t41(6, this, arrayList12);
                        int i54 = 0;
                        while (i54 < arrayList11.size()) {
                            int intValue3 = ((Integer) arrayList13.get(i54)).intValue();
                            CharSequence charSequence3 = (CharSequence) arrayList11.get(i54);
                            f6Var = ksVar.c0;
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                            org.telegram.ui.ActionBar.z0 c14 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, intValue3, charSequence3, false, f6Var);
                            c14.setTag(Integer.valueOf(i54));
                            c14.setOnClickListener(t41Var);
                            if (z9 && i54 == arrayList11.size() - 1) {
                                c14.c(org.telegram.ui.ActionBar.k6.q7, org.telegram.ui.ActionBar.k6.p7);
                            }
                            i54++;
                            actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout5;
                        }
                        actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                        fs fsVar = new fs(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                        ksVar.k = fsVar;
                        fsVar.e = true;
                        fsVar.c = org.telegram.messenger.qs.g2;
                        fsVar.g = true;
                        fsVar.setOutsideTouchable(true);
                        ksVar.k.setClippingEnabled(true);
                        ksVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                        ksVar.k.setFocusable(true);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                        ksVar.k.setInputMethodMode(2);
                        ksVar.k.getContentView().setFocusableInTouchMode(true);
                        bVar = ksVar.q;
                        int i55 = bVar.d;
                        bVar2 = ksVar.q;
                        int i56 = i55 + bVar2.b;
                        bVar3 = ksVar.q;
                        int i57 = bVar3.b;
                        x5Var2 = ksVar.z;
                        int width6 = x5Var2.getWidth();
                        x5Var3 = ksVar.z;
                        int min5 = Math.min(width6, x5Var3.getHeight() - i56) - org.telegram.messenger.g0.L(40.0f);
                        f10 = ksVar.e;
                        int i58 = min5 / 2;
                        int L7 = i57 + i58 + (ksVar.G != null ? org.telegram.messenger.g0.L(40.0f) : 0);
                        x5Var4 = ksVar.z;
                        float max2 = (int) (f10 + Math.max(L7, ((x5Var4.getHeight() - i56) - ksVar.I) / 2) + i58);
                        float L8 = org.telegram.messenger.g0.L(24.0f);
                        f11 = ksVar.e;
                        int i59 = (int) ((L8 - f11) + max2);
                        org.telegram.ui.ActionBar.g1 g1Var3 = ksVar.k;
                        x5Var5 = ksVar.z;
                        x5Var6 = ksVar.z;
                        i14 = 0;
                        g1Var3.showAtLocation(x5Var5, 0, (int) ((x5Var6.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i59);
                        try {
                            x5Var7 = ksVar.z;
                            x5Var7.performHapticFeedback(0);
                        } catch (Exception unused6) {
                        }
                        f12 = ksVar.e;
                        if (f12 != 0.0f) {
                            f13 = ksVar.e;
                            ksVar.f = f13;
                            final int i60 = 2;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.as
                                public final /* synthetic */ gs b;

                                {
                                    this.b = this;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (i60) {
                                        case 0:
                                            ks ksVar2 = this.b.a;
                                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            ksVar2.g = floatValue;
                                            float f21 = ksVar2.f;
                                            ksVar2.e = com.google.android.recaptcha.internal.a.z(0.0f, f21, floatValue, f21);
                                            ksVar2.z.invalidate();
                                            break;
                                        case 1:
                                            ks ksVar3 = this.b.a;
                                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            ksVar3.g = floatValue2;
                                            float f22 = ksVar3.f;
                                            ksVar3.e = com.google.android.recaptcha.internal.a.z(0.0f, f22, floatValue2, f22);
                                            ksVar3.z.invalidate();
                                            break;
                                        default:
                                            ks ksVar4 = this.b.a;
                                            float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            ksVar4.g = floatValue3;
                                            float f23 = ksVar4.f;
                                            ksVar4.e = com.google.android.recaptcha.internal.a.z(0.0f, f23, floatValue3, f23);
                                            ksVar4.z.invalidate();
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
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout32 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i7, ksVar.z.getContext(), ksVar.c0);
        org.telegram.ui.ActionBar.f6 f6Var42 = null;
        fh.g c102 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout32, null, true);
        c102.p(c8.g0.k(ksVar.c0));
        org.telegram.messenger.camera.q.p(c102, org.telegram.messenger.g0.L(12.0f), 8.0f);
        c102.Q.e = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout32.setBackground(c102);
        if (ksVar.V != 3) {
        }
        i14 = 0;
        i27 = i14;
        while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
        }
    }
}
