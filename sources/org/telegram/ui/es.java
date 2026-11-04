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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class es implements Runnable {
    public final /* synthetic */ is a;

    public es(is isVar) {
        this.a = isVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x06cc, code lost:
    
        if (org.telegram.messenger.zi.w4(r1) != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0a0c, code lost:
    
        if (org.telegram.messenger.zi.w4(r5) != false) goto L228;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0e57  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i3;
        int i10;
        int i11;
        gs gsVar;
        gs gsVar2;
        int i12;
        gs gsVar3;
        int i13;
        gs gsVar4;
        TLRPC.Document document;
        TLRPC.Document document2;
        boolean z10;
        ai.c0 c0Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        i0.b bVar;
        i0.b bVar2;
        i0.b bVar3;
        ai.c0 c0Var2;
        ai.c0 c0Var3;
        float f10;
        ai.c0 c0Var4;
        float f11;
        ai.c0 c0Var5;
        ai.c0 c0Var6;
        int i14;
        float f12;
        float f13;
        ai.c0 c0Var7;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i15;
        TLRPC.Document document3;
        gs gsVar5;
        TLRPC.Document document4;
        gs gsVar6;
        gs gsVar7;
        gs gsVar8;
        gs gsVar9;
        int i16;
        gs gsVar10;
        TLRPC.Document document5;
        gs gsVar11;
        TLRPC.Document document6;
        gs gsVar12;
        TLRPC.Document document7;
        int i17;
        TLRPC.Document document8;
        TLRPC.Document document9;
        ai.c0 c0Var8;
        i0.b bVar4;
        i0.b bVar5;
        i0.b bVar6;
        ai.c0 c0Var9;
        ai.c0 c0Var10;
        float f14;
        ai.c0 c0Var11;
        float f15;
        ai.c0 c0Var12;
        ai.c0 c0Var13;
        float f16;
        float f17;
        ai.c0 c0Var14;
        org.telegram.ui.ActionBar.e6 e6Var2;
        TLRPC.Document document10;
        int i18;
        TLRPC.Document document11;
        TLRPC.Document document12;
        int i19;
        TLRPC.Document document13;
        gs gsVar13;
        TLRPC.Document document14;
        gs gsVar14;
        boolean z11;
        ai.c0 c0Var15;
        i0.b bVar7;
        i0.b bVar8;
        i0.b bVar9;
        int i20;
        ai.c0 c0Var16;
        ai.c0 c0Var17;
        float min;
        int i21;
        ai.c0 c0Var18;
        ai.c0 c0Var19;
        float f18;
        ai.c0 c0Var20;
        ai.c0 c0Var21;
        ai.c0 c0Var22;
        ai.c0 c0Var23;
        ai.c0 c0Var24;
        ai.c0 c0Var25;
        org.telegram.ui.ActionBar.e6 e6Var3;
        TLRPC.Document document15;
        int i22;
        gs gsVar15;
        gs gsVar16;
        gs gsVar17;
        gs gsVar18;
        TLRPC.InputStickerSet inputStickerSet;
        gs gsVar19;
        int i23;
        TLRPC.Document document16;
        gs gsVar20;
        int i24;
        gs gsVar21;
        int i25;
        gs gsVar22;
        gs gsVar23;
        gs gsVar24;
        gs gsVar25;
        int i26;
        ai.c0 c0Var26;
        ai.c0 c0Var27;
        int i27;
        u51 u51Var;
        i0.b bVar10;
        i0.b bVar11;
        i0.b bVar12;
        ai.c0 c0Var28;
        ai.c0 c0Var29;
        float f19;
        ai.c0 c0Var30;
        ai.c0 c0Var31;
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        View view7;
        View view8;
        ai.c0 c0Var32;
        org.telegram.ui.Components.f60 n4;
        TLRPC.Document unused;
        Integer valueOf = Integer.valueOf(R.drawable.msg_smile_status);
        Integer valueOf2 = Integer.valueOf(R.drawable.msg_autodelete);
        Integer valueOf3 = Integer.valueOf(R.drawable.input_notify_off);
        Integer valueOf4 = Integer.valueOf(R.drawable.msg_send);
        Integer valueOf5 = Integer.valueOf(R.drawable.msg_delete);
        is isVar = this.a;
        eh.c cVar = isVar.t;
        if (isVar.w == null || isVar.m) {
            return;
        }
        isVar.R = true;
        gs gsVar26 = isVar.l;
        if (gsVar26 != null && (n4 = gsVar26.n(isVar.z)) != null) {
            n4.Q(cVar, b8.cd.k(isVar.c0), true);
            n4.t = false;
            n4.Y();
            n4.p = new xg(this, 16);
            ViewGroup viewGroup = n4.A;
            zr zrVar = new zr(this, viewGroup);
            isVar.k = zrVar;
            zrVar.e = true;
            zrVar.c = org.telegram.messenger.hs.g2;
            zrVar.g = true;
            zrVar.setOutsideTouchable(true);
            isVar.k.setClippingEnabled(true);
            isVar.k.setAnimationStyle(R.style.PopupContextAnimation);
            isVar.k.setFocusable(true);
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
            isVar.k.setInputMethodMode(2);
            isVar.k.getContentView().setFocusableInTouchMode(true);
            i0.b bVar13 = isVar.q;
            int min2 = (Math.min(isVar.z.getWidth(), isVar.z.getHeight() - (bVar13.d + bVar13.b)) - org.telegram.messenger.g0.L(40.0f)) / 2;
            int L = (int) ((org.telegram.messenger.g0.L(24.0f) - isVar.e) + ((int) (isVar.e + Math.max(r2 + min2 + (isVar.G != null ? org.telegram.messenger.g0.L(40.0f) : 0), ((isVar.z.getHeight() - r3) - isVar.I) / 2) + min2)));
            isVar.k.showAtLocation(isVar.z, 0, (int) ((r4.getMeasuredWidth() - viewGroup.getMeasuredWidth()) / 2.0f), L);
            try {
                isVar.z.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            float f20 = isVar.e;
            if (f20 != 0.0f) {
                isVar.f = f20;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                final int i28 = 0;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.yr
                    public final /* synthetic */ es b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i28) {
                            case 0:
                                is isVar2 = this.b.a;
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                isVar2.g = floatValue;
                                float f21 = isVar2.f;
                                isVar2.e = com.google.android.recaptcha.internal.a.y(0.0f, f21, floatValue, f21);
                                isVar2.z.invalidate();
                                break;
                            case 1:
                                is isVar3 = this.b.a;
                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                isVar3.g = floatValue2;
                                float f22 = isVar3.f;
                                isVar3.e = com.google.android.recaptcha.internal.a.y(0.0f, f22, floatValue2, f22);
                                isVar3.z.invalidate();
                                break;
                            default:
                                is isVar4 = this.b.a;
                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                isVar4.g = floatValue3;
                                float f23 = isVar4.f;
                                isVar4.e = com.google.android.recaptcha.internal.a.y(0.0f, f23, floatValue3, f23);
                                isVar4.z.invalidate();
                                break;
                        }
                    }
                });
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(org.telegram.ui.Components.xq.f);
                ofFloat.start();
            }
            isVar.K = true;
            return;
        }
        int i29 = 0;
        if (isVar.V != 3) {
            gs gsVar27 = isVar.l;
            if (gsVar27 != null) {
                TLRPC.TL_messageMediaPoll d = gsVar27.d();
                TLRPC.PollAnswer g7 = isVar.l.g();
                if (d != null && d.poll != null && g7 != null) {
                    TLRPC.PollAnswerVoters F1 = org.telegram.messenger.zi.F1(d, g7.option);
                    if (F1 != null && F1.voters > 0) {
                        org.telegram.messenger.zi.A(d);
                    }
                }
            }
            i3 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i3, isVar.z.getContext(), isVar.c0);
            org.telegram.ui.ActionBar.e6 e6Var4 = null;
            gh.g c2 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout2, null, true);
            c2.p(b8.cd.k(isVar.c0));
            org.telegram.messenger.camera.q.p(c2, org.telegram.messenger.g0.L(12.0f), 8.0f);
            c2.R.e = true;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackground(c2);
            if (isVar.V != 3) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = isVar.T;
                int i30 = R.drawable.menu_sticker_add;
                if (tL_messages_stickerSet == null) {
                    gs gsVar28 = isVar.l;
                    if (gsVar28 == null || !gsVar28.A()) {
                        if (isVar.l.x()) {
                            arrayList.add(org.telegram.messenger.bd.M0(2131745598, null));
                            arrayList3.add(valueOf4);
                            arrayList2.add(0);
                        }
                        org.telegram.ui.Cells.f1.x(null, 2131754374, arrayList, R.drawable.msg_fave, arrayList3);
                        arrayList2.add(1);
                    } else {
                        org.telegram.ui.Cells.f1.x(null, 2131745534, arrayList, R.drawable.menu_sticker_add, arrayList3);
                        arrayList2.add(0);
                    }
                }
                gs gsVar29 = isVar.l;
                if (gsVar29 == null || !gsVar29.A()) {
                    gs gsVar30 = isVar.l;
                    arrayList.add(org.telegram.messenger.bd.M0((gsVar30 == null || !gsVar30.I()) ? 2131754370 : 2131744859, null));
                    gs gsVar31 = isVar.l;
                    if (gsVar31 != null && gsVar31.I()) {
                        i30 = R.drawable.msg_replace;
                    }
                    arrayList3.add(Integer.valueOf(i30));
                    arrayList2.add(2);
                }
                int i31 = 6;
                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, isVar.w, isVar.c0, true, false);
                y0Var.setItemHeight(44);
                y0Var.j(org.telegram.messenger.bd.M0(2131753756, null), R.drawable.msg_arrow_back, null);
                y0Var.getTextView().setPadding(org.telegram.messenger.bd.a0 ? 0 : org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0);
                FrameLayout frameLayout = new FrameLayout(isVar.z.getContext());
                LinearLayout linearLayout = new LinearLayout(isVar.z.getContext());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, linearLayout, isVar.c0);
                linearLayout.setOrientation(1);
                if (isVar.w == null) {
                    u51Var = null;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new TLRPC.TL_stickerSetNoCovered());
                    TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = new TLRPC.TL_messages_getMyStickers();
                    tL_messages_getMyStickers.limit = 100;
                    int i32 = 7;
                    ConnectionsManager.getInstance(isVar.r).sendRequest(tL_messages_getMyStickers, new y9(isVar, arrayList4, tL_messages_getMyStickers, i32));
                    u51Var = new u51(i32, isVar.w, e6Var4);
                    u51Var.setLayoutManager(new u4.b0());
                    u51Var.i(new gi.o1(arrayList4, 4));
                    u51Var.setAdapter(new fs(isVar, arrayList4));
                }
                u51Var.setOnItemClickListener(new h(this, i31));
                frameLayout.addView(y0Var);
                linearLayout.addView(frameLayout);
                linearLayout.addView(new org.telegram.ui.ActionBar.c1(isVar.z.getContext(), isVar.c0), b8.mf.o(-1, 8));
                u51 u51Var2 = u51Var;
                ei.f0 f0Var = new ei.f0(this, arrayList2, u51Var2, linearLayout, actionBarPopupWindow$ActionBarPopupWindowLayout2, 13);
                for (int i33 = 0; i33 < arrayList.size(); i33++) {
                    org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, ((Integer) arrayList3.get(i33)).intValue(), (CharSequence) arrayList.get(i33), false, isVar.c0);
                    c10.setTag(Integer.valueOf(i33));
                    c10.setOnClickListener(f0Var);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                linearLayout.addView(u51Var2, new LinearLayout.LayoutParams(actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f), (int) (actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredHeight() * 1.5f)));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.b(linearLayout);
                frameLayout.setOnClickListener(new ze(actionBarPopupWindow$ActionBarPopupWindowLayout2, 2));
                bVar10 = isVar.q;
                int i34 = bVar10.d;
                bVar11 = isVar.q;
                int i35 = i34 + bVar11.b;
                bVar12 = isVar.q;
                int i36 = bVar12.b;
                c0Var28 = isVar.z;
                int width = c0Var28.getWidth();
                c0Var29 = isVar.z;
                int min3 = (int) (Math.min(width, c0Var29.getHeight() - i35) / 1.8f);
                f19 = isVar.e;
                c0Var30 = isVar.z;
                int L2 = org.telegram.messenger.g0.L(84.0f) + ((int) (f19 + Math.max(i36 + r3, ((c0Var30.getHeight() - i35) - isVar.I) / 2) + (min3 / 2)));
                c0Var31 = isVar.z;
                c0Var31.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, b8.mf.d(-2, -2.0f, 49, 0.0f, L2 / org.telegram.messenger.g0.p, 0.0f, 0.0f));
                isVar.L = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                view = isVar.L;
                view.setTranslationY(-org.telegram.messenger.g0.L(12.0f));
                view2 = isVar.L;
                view2.setAlpha(0.0f);
                view3 = isVar.L;
                view3.setScaleX(0.8f);
                view4 = isVar.L;
                view4.setScaleY(0.8f);
                view5 = isVar.L;
                view5.setPivotY(0.0f);
                view6 = isVar.L;
                view7 = isVar.L;
                view6.setPivotX(view7.getMeasuredWidth() / 2.0f);
                view8 = isVar.L;
                view8.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.xq.h).start();
                if (isVar.P == null) {
                    org.telegram.ui.Components.jb jbVar = new org.telegram.ui.Components.jb(isVar, isVar.z.getContext(), org.telegram.messenger.h10.t0, isVar.c0);
                    isVar.P = jbVar;
                    jbVar.O0 = true;
                    jbVar.setPadding(0, org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f));
                    isVar.P.setClipChildren(false);
                    isVar.P.setClipToPadding(false);
                    isVar.P.setVisibility(0);
                    isVar.P.setHint(org.telegram.messenger.bd.M0(2131744858, null));
                    isVar.P.setBubbleOffset(-org.telegram.messenger.g0.L(105.0f));
                    isVar.P.setMiniBubblesOffset(-org.telegram.messenger.g0.L(14.0f));
                    FrameLayout frameLayout2 = new FrameLayout(isVar.z.getContext());
                    isVar.Q = frameLayout2;
                    frameLayout2.addView(isVar.P, b8.mf.d(-2, 116.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                    isVar.z.addView(isVar.Q, b8.mf.d(-2, -2.0f, 1, 0.0f, 100.0f, 0.0f, 0.0f));
                }
                isVar.P.setSelectedEmojis(isVar.o);
                isVar.P.setDelegate(new wr(isVar));
                isVar.P.p(null, null, false);
                isVar.Q.setScaleY(0.6f);
                isVar.Q.setScaleX(0.6f);
                isVar.Q.setAlpha(0.0f);
                org.telegram.messenger.g0.i3(new vr(isVar, 2), 10L);
                isVar.K = true;
                c0Var32 = isVar.z;
                c0Var32.invalidate();
                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            } else {
                int i37 = 1;
                i10 = isVar.V;
                int i38 = R.drawable.msg_unfave;
                if (i10 == 0) {
                    document12 = isVar.W;
                    if (org.telegram.messenger.zi.Y3(document12)) {
                        i26 = isVar.r;
                        if (!org.telegram.messenger.c.a(i26).d().q()) {
                            if (isVar.O == null) {
                                l0 l0Var = new l0(isVar.z.getContext(), isVar.c0);
                                isVar.O = l0Var;
                                isVar.z.addView(l0Var, b8.mf.c(-1.0f, -1));
                                isVar.O.setOnClickListener(new xr(isVar, i29));
                                ((vg.o0) isVar.O.b).w.setOnClickListener(new xr(isVar, i37));
                            }
                            org.telegram.messenger.g0.Z3(isVar.O, false, 1.0f, true, false);
                            org.telegram.messenger.g0.X3(isVar.O, true);
                            isVar.O.setTranslationY(0.0f);
                            isVar.K = true;
                            c0Var26 = isVar.z;
                            c0Var26.invalidate();
                            try {
                                c0Var27 = isVar.z;
                                c0Var27.performHapticFeedback(0);
                                return;
                            } catch (Exception unused3) {
                            }
                        }
                    }
                    i19 = isVar.r;
                    org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(i19);
                    document13 = isVar.W;
                    boolean A0 = b02.A0(document13);
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    gsVar13 = isVar.l;
                    if (gsVar13 != null) {
                        gsVar20 = isVar.l;
                        i24 = isVar.V;
                        if (gsVar20.k(i24)) {
                            gsVar25 = isVar.l;
                            if (!gsVar25.c()) {
                                org.telegram.ui.Cells.f1.u(2131745598, arrayList5, arrayList7, valueOf4);
                                arrayList6.add(0);
                            }
                        }
                        gsVar21 = isVar.l;
                        i25 = isVar.V;
                        if (gsVar21.k(i25)) {
                            gsVar24 = isVar.l;
                            if (!gsVar24.c()) {
                                arrayList5.add(org.telegram.messenger.bd.L0(2131745593));
                                arrayList7.add(valueOf3);
                                arrayList6.add(6);
                            }
                        }
                        gsVar22 = isVar.l;
                        if (gsVar22.b()) {
                            org.telegram.ui.Cells.f1.u(2131745870, arrayList5, arrayList7, valueOf2);
                            arrayList6.add(3);
                        }
                        gsVar23 = isVar.l;
                        if (gsVar23.f()) {
                            org.telegram.ui.Cells.f1.u(2131749235, arrayList5, arrayList7, valueOf5);
                            arrayList6.add(5);
                        }
                    }
                    document14 = isVar.W;
                    if (!org.telegram.messenger.zi.F3(document14)) {
                        if (!A0) {
                            i23 = isVar.r;
                            if (org.telegram.messenger.li.b0(i23).s()) {
                                document16 = isVar.W;
                            }
                        }
                        arrayList5.add(A0 ? org.telegram.messenger.bd.L0(2131751539) : org.telegram.messenger.bd.L0(2131754374));
                        if (!A0) {
                            i38 = R.drawable.msg_fave;
                        }
                        arrayList7.add(Integer.valueOf(i38));
                        arrayList6.add(2);
                    }
                    gsVar14 = isVar.l;
                    if (gsVar14 != null && (inputStickerSet = isVar.a0) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                        gsVar19 = isVar.l;
                        if (gsVar19.Q()) {
                            arrayList5.add(org.telegram.messenger.bd.Z(2131743558, new Object[0]));
                            arrayList7.add(Integer.valueOf(R.drawable.msg_media));
                            arrayList6.add(1);
                        }
                    }
                    if (isVar.p) {
                        org.telegram.ui.Cells.f1.u(2131751538, arrayList5, arrayList7, valueOf5);
                        arrayList6.add(4);
                    }
                    if (isVar.a0 != null) {
                        document15 = isVar.W;
                        if (document15 != null) {
                            i22 = isVar.r;
                            org.telegram.messenger.li b03 = org.telegram.messenger.li.b0(i22);
                            TLRPC.InputStickerSet inputStickerSet2 = isVar.a0;
                            z11 = true;
                            TLRPC.TL_messages_stickerSet m0 = b03.m0(inputStickerSet2, true);
                            if (m0 != null) {
                                gsVar17 = isVar.l;
                                if (gsVar17 != null) {
                                    gsVar18 = isVar.l;
                                    if (gsVar18.C()) {
                                        TLRPC.StickerSet stickerSet = m0.set;
                                        if (!stickerSet.emojis && !stickerSet.masks) {
                                            arrayList6.add(org.telegram.ui.Cells.f1.n(2131751224, arrayList5, R.drawable.msg_edit, arrayList7, 7));
                                        }
                                    }
                                }
                            }
                            if (m0 != null && m0.set.creator) {
                                gsVar15 = isVar.l;
                                if (gsVar15 != null) {
                                    gsVar16 = isVar.l;
                                    unused = isVar.W;
                                    if (gsVar16.H()) {
                                        arrayList5.add(org.telegram.messenger.bd.L0(2131751496));
                                        arrayList7.add(valueOf5);
                                        arrayList6.add(8);
                                    }
                                }
                            }
                            if (!arrayList5.isEmpty()) {
                                isVar.K = true;
                                c0Var15 = isVar.z;
                                c0Var15.invalidate();
                                as asVar = new as(this, arrayList6, A0);
                                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                                is.g(isVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                                for (int i39 = 0; i39 < arrayList5.size(); i39++) {
                                    int intValue = ((Integer) arrayList7.get(i39)).intValue();
                                    CharSequence charSequence = (CharSequence) arrayList5.get(i39);
                                    e6Var3 = isVar.c0;
                                    org.telegram.ui.ActionBar.y0 c11 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, intValue, charSequence, false, e6Var3);
                                    c11.setTag(Integer.valueOf(i39));
                                    c11.setOnClickListener(asVar);
                                    if (((Integer) arrayList6.get(i39)).intValue() == 8) {
                                        int i40 = org.telegram.ui.ActionBar.k6.q7;
                                        c11.c(i40, i40);
                                        c11.h(0.1f, i40);
                                    }
                                }
                                bs bsVar = new bs(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                                isVar.k = bsVar;
                                bsVar.e = true;
                                bsVar.c = 100;
                                bsVar.g = true;
                                bsVar.setOutsideTouchable(z11);
                                isVar.k.setClippingEnabled(z11);
                                isVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                                isVar.k.setFocusable(z11);
                                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                                isVar.k.setInputMethodMode(2);
                                isVar.k.getContentView().setFocusableInTouchMode(z11);
                                bVar7 = isVar.q;
                                int i41 = bVar7.d;
                                bVar8 = isVar.q;
                                int i42 = i41 + bVar8.b;
                                bVar9 = isVar.q;
                                int i43 = bVar9.b;
                                i20 = isVar.V;
                                if (i20 == z11) {
                                    c0Var24 = isVar.z;
                                    int width2 = c0Var24.getWidth();
                                    c0Var25 = isVar.z;
                                    i21 = Math.min(width2, c0Var25.getHeight() - i42) - org.telegram.messenger.g0.L(40.0f);
                                } else {
                                    if (isVar.S) {
                                        c0Var18 = isVar.z;
                                        int width3 = c0Var18.getWidth();
                                        c0Var19 = isVar.z;
                                        min = Math.min(width3, c0Var19.getHeight() - i42) - org.telegram.messenger.g0.N(40.0f);
                                    } else {
                                        c0Var16 = isVar.z;
                                        int width4 = c0Var16.getWidth();
                                        c0Var17 = isVar.z;
                                        min = Math.min(width4, c0Var17.getHeight() - i42) / 1.8f;
                                    }
                                    i21 = (int) min;
                                }
                                f18 = isVar.e;
                                int i44 = i21 / 2;
                                int L3 = i43 + i44 + (isVar.G != null ? org.telegram.messenger.g0.L(40.0f) : 0);
                                c0Var20 = isVar.z;
                                int L4 = org.telegram.messenger.g0.L(24.0f) + ((int) (f18 + Math.max(L3, ((c0Var20.getHeight() - i42) - isVar.I) / 2) + i44));
                                if (isVar.S) {
                                    L4 += org.telegram.messenger.g0.L(24.0f);
                                }
                                org.telegram.ui.ActionBar.f1 f1Var = isVar.k;
                                c0Var21 = isVar.z;
                                c0Var22 = isVar.z;
                                f1Var.showAtLocation(c0Var21, 0, (int) ((c0Var22.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), L4);
                                try {
                                    c0Var23 = isVar.z;
                                    c0Var23.performHapticFeedback(0);
                                } catch (Exception unused4) {
                                }
                            }
                            return;
                        }
                    }
                    z11 = true;
                    if (!arrayList5.isEmpty()) {
                    }
                    return;
                }
                i11 = isVar.V;
                if (i11 == 2) {
                    gsVar8 = isVar.l;
                    if (gsVar8 != null) {
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        gsVar9 = isVar.l;
                        i16 = isVar.V;
                        if (gsVar9.k(i16)) {
                            org.telegram.ui.Cells.f1.u(2131745636, arrayList8, arrayList10, valueOf4);
                            arrayList9.add(0);
                        }
                        gsVar10 = isVar.l;
                        document5 = isVar.W;
                        Boolean P = gsVar10.P(document5);
                        if (P != null) {
                            if (P.booleanValue()) {
                                org.telegram.ui.Cells.f1.u(2131745556, arrayList8, arrayList10, valueOf);
                                arrayList9.add(1);
                            } else {
                                org.telegram.ui.Cells.f1.u(2131746296, arrayList8, arrayList10, valueOf);
                                arrayList9.add(2);
                            }
                        }
                        gsVar11 = isVar.l;
                        document6 = isVar.W;
                        if (gsVar11.D(document6)) {
                            arrayList8.add(org.telegram.messenger.bd.L0(2131751764));
                            arrayList10.add(Integer.valueOf(R.drawable.msg_copy));
                            arrayList9.add(3);
                        }
                        gsVar12 = isVar.l;
                        document7 = isVar.W;
                        if (gsVar12.N(document7)) {
                            org.telegram.ui.Cells.f1.u(2131746319, arrayList8, arrayList10, valueOf5);
                            arrayList9.add(4);
                        }
                        i17 = isVar.r;
                        org.telegram.messenger.li b04 = org.telegram.messenger.li.b0(i17);
                        document8 = isVar.W;
                        boolean A02 = b04.A0(document8);
                        document9 = isVar.W;
                        if (!org.telegram.messenger.zi.I2(document9)) {
                            document10 = isVar.W;
                            if (!org.telegram.messenger.zi.F3(document10)) {
                                if (!A02) {
                                    i18 = isVar.r;
                                    if (org.telegram.messenger.li.b0(i18).s()) {
                                        document11 = isVar.W;
                                    }
                                }
                                arrayList8.add(A02 ? org.telegram.messenger.bd.L0(2131751539) : org.telegram.messenger.bd.L0(2131754374));
                                if (!A02) {
                                    i38 = R.drawable.msg_fave;
                                }
                                arrayList10.add(Integer.valueOf(i38));
                                arrayList9.add(5);
                            }
                        }
                        if (arrayList8.isEmpty()) {
                            return;
                        }
                        isVar.K = true;
                        c0Var8 = isVar.z;
                        c0Var8.invalidate();
                        int[] iArr = new int[arrayList10.size()];
                        for (int i45 = 0; i45 < arrayList10.size(); i45++) {
                            iArr[i45] = ((Integer) arrayList10.get(i45)).intValue();
                        }
                        org.telegram.ui.Components.fa0 fa0Var = new org.telegram.ui.Components.fa0(this, arrayList9, A02);
                        boolean g10 = is.g(isVar, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                        int i46 = 0;
                        while (i46 < arrayList8.size()) {
                            boolean z12 = !g10 && i46 == 0;
                            boolean z13 = i46 == arrayList8.size() + (-1);
                            int intValue2 = ((Integer) arrayList10.get(i46)).intValue();
                            CharSequence charSequence2 = (CharSequence) arrayList8.get(i46);
                            e6Var2 = isVar.c0;
                            org.telegram.ui.ActionBar.y0 c12 = org.telegram.ui.ActionBar.q0.c(z12, z13, actionBarPopupWindow$ActionBarPopupWindowLayout2, intValue2, charSequence2, false, e6Var2);
                            if (((Integer) arrayList9.get(i46)).intValue() == 4) {
                                c12.c(org.telegram.ui.ActionBar.k6.q7, org.telegram.ui.ActionBar.k6.p7);
                            }
                            c12.setTag(Integer.valueOf(i46));
                            c12.setOnClickListener(fa0Var);
                            i46++;
                        }
                        cs csVar = new cs(this, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                        isVar.k = csVar;
                        csVar.e = true;
                        csVar.c = org.telegram.messenger.hs.g2;
                        csVar.g = true;
                        csVar.setOutsideTouchable(true);
                        isVar.k.setClippingEnabled(true);
                        isVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                        isVar.k.setFocusable(true);
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                        isVar.k.setInputMethodMode(2);
                        isVar.k.getContentView().setFocusableInTouchMode(true);
                        bVar4 = isVar.q;
                        int i47 = bVar4.d;
                        bVar5 = isVar.q;
                        int i48 = i47 + bVar5.b;
                        bVar6 = isVar.q;
                        int i49 = bVar6.b;
                        c0Var9 = isVar.z;
                        int width5 = c0Var9.getWidth();
                        c0Var10 = isVar.z;
                        int min4 = Math.min(width5, c0Var10.getHeight() - i48) - org.telegram.messenger.g0.L(40.0f);
                        f14 = isVar.e;
                        int i50 = min4 / 2;
                        int L5 = i49 + i50 + (isVar.G != null ? org.telegram.messenger.g0.L(40.0f) : 0);
                        c0Var11 = isVar.z;
                        float max = (int) (f14 + Math.max(L5, ((c0Var11.getHeight() - i48) - isVar.I) / 2) + i50);
                        float L6 = org.telegram.messenger.g0.L(24.0f);
                        f15 = isVar.e;
                        int i51 = (int) ((L6 - f15) + max);
                        org.telegram.ui.ActionBar.f1 f1Var2 = isVar.k;
                        c0Var12 = isVar.z;
                        c0Var13 = isVar.z;
                        f1Var2.showAtLocation(c0Var12, 0, (int) ((c0Var13.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth()) / 2.0f), i51);
                        org.telegram.ui.ActionBar.f1.i(actionBarPopupWindow$ActionBarPopupWindowLayout2);
                        try {
                            c0Var14 = isVar.z;
                            c0Var14.performHapticFeedback(0);
                        } catch (Exception unused5) {
                        }
                        f16 = isVar.e;
                        if (f16 != 0.0f) {
                            f17 = isVar.e;
                            isVar.f = f17;
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            final int i52 = 1;
                            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.yr
                                public final /* synthetic */ es b;

                                {
                                    this.b = this;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (i52) {
                                        case 0:
                                            is isVar2 = this.b.a;
                                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            isVar2.g = floatValue;
                                            float f21 = isVar2.f;
                                            isVar2.e = com.google.android.recaptcha.internal.a.y(0.0f, f21, floatValue, f21);
                                            isVar2.z.invalidate();
                                            break;
                                        case 1:
                                            is isVar3 = this.b.a;
                                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            isVar3.g = floatValue2;
                                            float f22 = isVar3.f;
                                            isVar3.e = com.google.android.recaptcha.internal.a.y(0.0f, f22, floatValue2, f22);
                                            isVar3.z.invalidate();
                                            break;
                                        default:
                                            is isVar4 = this.b.a;
                                            float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            isVar4.g = floatValue3;
                                            float f23 = isVar4.f;
                                            isVar4.e = com.google.android.recaptcha.internal.a.y(0.0f, f23, floatValue3, f23);
                                            isVar4.z.invalidate();
                                            break;
                                    }
                                }
                            });
                            ofFloat2.setDuration(350L);
                            ofFloat2.setInterpolator(org.telegram.ui.Components.xq.f);
                            ofFloat2.start();
                        }
                        actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                    }
                }
                gsVar = isVar.l;
                if (gsVar != null) {
                    ArrayList arrayList11 = new ArrayList();
                    ArrayList arrayList12 = new ArrayList();
                    ArrayList arrayList13 = new ArrayList();
                    gsVar2 = isVar.l;
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                    i12 = isVar.V;
                    if (gsVar2.k(i12)) {
                        gsVar7 = isVar.l;
                        if (!gsVar7.c()) {
                            org.telegram.ui.Cells.f1.u(2131745633, arrayList11, arrayList13, valueOf4);
                            arrayList12.add(0);
                        }
                    }
                    gsVar3 = isVar.l;
                    i13 = isVar.V;
                    if (gsVar3.k(i13)) {
                        gsVar6 = isVar.l;
                        if (!gsVar6.c()) {
                            org.telegram.ui.Cells.f1.u(2131745593, arrayList11, arrayList13, valueOf3);
                            arrayList12.add(4);
                        }
                    }
                    gsVar4 = isVar.l;
                    if (gsVar4.b()) {
                        org.telegram.ui.Cells.f1.u(2131745870, arrayList11, arrayList13, valueOf2);
                        arrayList12.add(3);
                    }
                    document = isVar.W;
                    if (document != null) {
                        gsVar5 = isVar.l;
                        document4 = isVar.W;
                        if (gsVar5.e(document4)) {
                            arrayList12.add(org.telegram.ui.Cells.f1.n(2131754485, arrayList11, R.drawable.outline_caption_24, arrayList13, 11));
                        }
                    }
                    document2 = isVar.W;
                    if (document2 != null) {
                        i15 = isVar.r;
                        org.telegram.messenger.li b05 = org.telegram.messenger.li.b0(i15);
                        document3 = isVar.W;
                        int i53 = 0;
                        while (true) {
                            if (i53 >= b05.j0.size()) {
                                z10 = false;
                                break;
                            }
                            TLRPC.Document document17 = (TLRPC.Document) b05.j0.get(i53);
                            if (document17.id == document3.id) {
                                b05.j0.remove(i53);
                                b05.j0.add(0, document17);
                                z10 = true;
                                break;
                            }
                            i53++;
                        }
                        if (z10) {
                            arrayList11.add(org.telegram.messenger.bd.Y(2131751599, "Delete", new Object[0]));
                            arrayList13.add(valueOf5);
                            arrayList12.add(1);
                        } else {
                            arrayList11.add(org.telegram.messenger.bd.Y(2131745940, "SaveToGIFs", new Object[0]));
                            arrayList13.add(Integer.valueOf(R.drawable.msg_gif_add));
                            arrayList12.add(2);
                        }
                    } else {
                        z10 = false;
                    }
                    if (arrayList11.isEmpty()) {
                        return;
                    }
                    isVar.K = true;
                    c0Var = isVar.z;
                    c0Var.invalidate();
                    int[] iArr2 = new int[arrayList13.size()];
                    for (int i54 = 0; i54 < arrayList13.size(); i54++) {
                        iArr2[i54] = ((Integer) arrayList13.get(i54)).intValue();
                    }
                    org.telegram.ui.Components.ux0 ux0Var = new org.telegram.ui.Components.ux0(12, this, arrayList12);
                    int i55 = 0;
                    while (i55 < arrayList11.size()) {
                        int intValue3 = ((Integer) arrayList13.get(i55)).intValue();
                        CharSequence charSequence3 = (CharSequence) arrayList11.get(i55);
                        e6Var = isVar.c0;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                        org.telegram.ui.ActionBar.y0 c13 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout4, intValue3, charSequence3, false, e6Var);
                        c13.setTag(Integer.valueOf(i55));
                        c13.setOnClickListener(ux0Var);
                        if (z10 && i55 == arrayList11.size() - 1) {
                            c13.c(org.telegram.ui.ActionBar.k6.q7, org.telegram.ui.ActionBar.k6.p7);
                        }
                        i55++;
                        actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                    ds dsVar = new ds(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                    isVar.k = dsVar;
                    dsVar.e = true;
                    dsVar.c = org.telegram.messenger.hs.g2;
                    dsVar.g = true;
                    dsVar.setOutsideTouchable(true);
                    isVar.k.setClippingEnabled(true);
                    isVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                    isVar.k.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                    isVar.k.setInputMethodMode(2);
                    isVar.k.getContentView().setFocusableInTouchMode(true);
                    bVar = isVar.q;
                    int i56 = bVar.d;
                    bVar2 = isVar.q;
                    int i57 = i56 + bVar2.b;
                    bVar3 = isVar.q;
                    int i58 = bVar3.b;
                    c0Var2 = isVar.z;
                    int width6 = c0Var2.getWidth();
                    c0Var3 = isVar.z;
                    int min5 = Math.min(width6, c0Var3.getHeight() - i57) - org.telegram.messenger.g0.L(40.0f);
                    f10 = isVar.e;
                    int i59 = min5 / 2;
                    int L7 = i58 + i59 + (isVar.G != null ? org.telegram.messenger.g0.L(40.0f) : 0);
                    c0Var4 = isVar.z;
                    float max2 = (int) (f10 + Math.max(L7, ((c0Var4.getHeight() - i57) - isVar.I) / 2) + i59);
                    float L8 = org.telegram.messenger.g0.L(24.0f);
                    f11 = isVar.e;
                    int i60 = (int) ((L8 - f11) + max2);
                    org.telegram.ui.ActionBar.f1 f1Var3 = isVar.k;
                    c0Var5 = isVar.z;
                    c0Var6 = isVar.z;
                    i14 = 0;
                    f1Var3.showAtLocation(c0Var5, 0, (int) ((c0Var6.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i60);
                    try {
                        c0Var7 = isVar.z;
                        c0Var7.performHapticFeedback(0);
                    } catch (Exception unused6) {
                    }
                    f12 = isVar.e;
                    if (f12 != 0.0f) {
                        f13 = isVar.e;
                        isVar.f = f13;
                        final int i61 = 2;
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.yr
                            public final /* synthetic */ es b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i61) {
                                    case 0:
                                        is isVar2 = this.b.a;
                                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        isVar2.g = floatValue;
                                        float f21 = isVar2.f;
                                        isVar2.e = com.google.android.recaptcha.internal.a.y(0.0f, f21, floatValue, f21);
                                        isVar2.z.invalidate();
                                        break;
                                    case 1:
                                        is isVar3 = this.b.a;
                                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        isVar3.g = floatValue2;
                                        float f22 = isVar3.f;
                                        isVar3.e = com.google.android.recaptcha.internal.a.y(0.0f, f22, floatValue2, f22);
                                        isVar3.z.invalidate();
                                        break;
                                    default:
                                        is isVar4 = this.b.a;
                                        float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        isVar4.g = floatValue3;
                                        float f23 = isVar4.f;
                                        isVar4.e = com.google.android.recaptcha.internal.a.y(0.0f, f23, floatValue3, f23);
                                        isVar4.z.invalidate();
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
                        View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i27);
                        if (childAt instanceof org.telegram.ui.ActionBar.y0) {
                            ((org.telegram.ui.ActionBar.y0) childAt).n(i27 == 0 ? 1 : i14, i27 == actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() + (-1) ? 1 : i14);
                        }
                        i27++;
                    }
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            }
            i14 = 0;
            i27 = i14;
            while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
            }
        }
        i3 = 1;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout22 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i3, isVar.z.getContext(), isVar.c0);
        org.telegram.ui.ActionBar.e6 e6Var42 = null;
        gh.g c22 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout22, null, true);
        c22.p(b8.cd.k(isVar.c0));
        org.telegram.messenger.camera.q.p(c22, org.telegram.messenger.g0.L(12.0f), 8.0f);
        c22.R.e = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout22.setBackground(c22);
        if (isVar.V != 3) {
        }
        i14 = 0;
        i27 = i14;
        while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
        }
    }
}
