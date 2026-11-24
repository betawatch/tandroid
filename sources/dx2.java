// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class dx2 implements Runnable {
    public final /* synthetic */ hx2 a;

    public dx2(hx2 hx2Var) {
        this.a = hx2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0d09  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int i2;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        int i3;
        boolean z;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        int i4;
        String L0;
        int min;
        fx2 fx2Var;
        fx2 fx2Var2;
        TLRPC.InputStickerSet inputStickerSet;
        int i5;
        String str;
        boolean z2;
        int i6;
        smb smbVar;
        byte b;
        bu5 I;
        Integer valueOf = Integer.valueOf(R.drawable.msg_smile_status);
        Integer valueOf2 = Integer.valueOf(R.drawable.msg_autodelete);
        Integer valueOf3 = Integer.valueOf(R.drawable.input_notify_off);
        Integer valueOf4 = Integer.valueOf(R.drawable.msg_send);
        Integer valueOf5 = Integer.valueOf(R.drawable.msg_delete);
        hx2 hx2Var = this.a;
        km0 km0Var = hx2Var.t;
        if (hx2Var.w == null || hx2Var.m) {
            return;
        }
        hx2Var.R = true;
        fx2 fx2Var3 = hx2Var.l;
        if (fx2Var3 != null && (I = fx2Var3.I(hx2Var.z)) != null) {
            I.R(km0Var, qqd.k(hx2Var.c0), true);
            I.t = false;
            I.Z();
            I.p = new xf2(this, (byte) 15);
            ViewGroup viewGroup = I.A;
            yw2 yw2Var = new yw2(this, viewGroup);
            hx2Var.k = yw2Var;
            yw2Var.e = true;
            yw2Var.c = (short) 150;
            yw2Var.g = true;
            yw2Var.setOutsideTouchable(true);
            hx2Var.k.setClippingEnabled(true);
            hx2Var.k.setAnimationStyle(R.style.PopupContextAnimation);
            hx2Var.k.setFocusable(true);
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31));
            hx2Var.k.setInputMethodMode(2);
            hx2Var.k.getContentView().setFocusableInTouchMode(true);
            iq5 iq5Var = hx2Var.q;
            int min2 = (Math.min(hx2Var.z.getWidth(), hx2Var.z.getHeight() - (iq5Var.d + iq5Var.b)) - gm.L(40.0f)) / 2;
            int L = (int) ((gm.L(24.0f) - hx2Var.e) + ((int) (hx2Var.e + Math.max(r2 + min2 + (hx2Var.G != null ? gm.L(40.0f) : 0), ((hx2Var.z.getHeight() - r3) - hx2Var.I) / 2) + min2)));
            hx2Var.k.showAtLocation(hx2Var.z, 0, (int) ((r4.getMeasuredWidth() - viewGroup.getMeasuredWidth()) / 2.0f), L);
            try {
                hx2Var.z.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            float f = hx2Var.e;
            if (f != 0.0f) {
                hx2Var.f = f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                final byte b2 = 0;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ww2
                    public final /* synthetic */ dx2 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b3 = b2;
                        dx2 dx2Var = this.b;
                        switch (b3) {
                            case 0:
                                hx2 hx2Var2 = dx2Var.a;
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                hx2Var2.g = floatValue;
                                float f2 = hx2Var2.f;
                                hx2Var2.e = td4.A(0.0f, f2, floatValue, f2);
                                hx2Var2.z.invalidate();
                                break;
                            case 1:
                                hx2 hx2Var3 = dx2Var.a;
                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                hx2Var3.g = floatValue2;
                                float f3 = hx2Var3.f;
                                hx2Var3.e = td4.A(0.0f, f3, floatValue2, f3);
                                hx2Var3.z.invalidate();
                                break;
                            default:
                                hx2 hx2Var4 = dx2Var.a;
                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                hx2Var4.g = floatValue3;
                                float f4 = hx2Var4.f;
                                hx2Var4.e = td4.A(0.0f, f4, floatValue3, f4);
                                hx2Var4.z.invalidate();
                                break;
                        }
                    }
                });
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(d53.f);
                ofFloat.start();
            }
            hx2Var.K = true;
            return;
        }
        byte b3 = 0;
        if (hx2Var.V != 3) {
            fx2 fx2Var4 = hx2Var.l;
            if (fx2Var4 != null) {
                TLRPC.TL_messageMediaPoll d = fx2Var4.d();
                TLRPC.PollAnswer g = hx2Var.l.g();
                if (d != null && d.poll != null && g != null) {
                    TLRPC.PollAnswerVoters E1 = k47.E1(d, g.option);
                    if (E1 != null && E1.voters > 0) {
                        k47.A(d);
                    }
                }
            }
            i = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i, hx2Var.c0, hx2Var.z.getContext());
            ylb ylbVar = null;
            im0 c = km0Var.c(actionBarPopupWindow$ActionBarPopupWindowLayout3, null, true);
            c.p(qqd.k(hx2Var.c0));
            wi8.r(c, gm.L(12.0f), 8.0f);
            c.S.e = true;
            actionBarPopupWindow$ActionBarPopupWindowLayout3.setBackground(c);
            i2 = hx2Var.V;
            if (i2 != 3) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = hx2Var.T;
                int i7 = R.drawable.menu_sticker_add;
                if (tL_messages_stickerSet == null) {
                    fx2 fx2Var5 = hx2Var.l;
                    if (fx2Var5 == null || !fx2Var5.y()) {
                        if (hx2Var.l.t()) {
                            b10.s(null, 2131745322, arrayList, arrayList3, valueOf4);
                            arrayList2.add(0);
                        }
                        b10.r(null, 2131754371, arrayList, R.drawable.msg_fave, arrayList3);
                        arrayList2.add(1);
                    } else {
                        b10.r(null, 2131745258, arrayList, R.drawable.menu_sticker_add, arrayList3);
                        arrayList2.add(0);
                    }
                }
                fx2 fx2Var6 = hx2Var.l;
                if (fx2Var6 == null || !fx2Var6.y()) {
                    fx2 fx2Var7 = hx2Var.l;
                    arrayList.add(jb6.M0((fx2Var7 == null || !fx2Var7.L()) ? 2131754367 : 2131744538, null));
                    fx2 fx2Var8 = hx2Var.l;
                    if (fx2Var8 != null && fx2Var8.L()) {
                        i7 = R.drawable.msg_replace;
                    }
                    arrayList3.add(Integer.valueOf(i7));
                    arrayList2.add(2);
                }
                a8 a8Var = new a8(0, hx2Var.c0, hx2Var.w, true, false);
                a8Var.setItemHeight(44);
                a8Var.j(jb6.M0(2131753721, null), R.drawable.msg_arrow_back, null);
                a8Var.getTextView().setPadding(jb6.a0 ? 0 : gm.L(40.0f), 0, jb6.a0 ? gm.L(40.0f) : 0, 0);
                FrameLayout frameLayout = new FrameLayout(hx2Var.z.getContext());
                LinearLayout linearLayout = new LinearLayout(hx2Var.z.getContext());
                anb.h(cmb.F8, hx2Var.c0, linearLayout);
                linearLayout.setOrientation(1);
                if (hx2Var.w == null) {
                    smbVar = null;
                    b = 1;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new TLRPC.TL_stickerSetNoCovered());
                    TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = new TLRPC.TL_messages_getMyStickers();
                    tL_messages_getMyStickers.limit = 100;
                    ConnectionsManager.getInstance(hx2Var.r).sendRequest(tL_messages_getMyStickers, new eo0((Object) hx2Var, (Object) arrayList4, (Object) tL_messages_getMyStickers, (byte) 20));
                    smbVar = new smb(hx2Var.w, ylbVar, (byte) 4);
                    smbVar.setLayoutManager(new u46());
                    b = 1;
                    smbVar.i(new ks(arrayList4, b));
                    smbVar.setAdapter(new ex2(hx2Var, arrayList4));
                }
                smbVar.setOnItemClickListener(new u(this, (byte) 17));
                frameLayout.addView(a8Var);
                linearLayout.addView(frameLayout);
                linearLayout.addView(new j8(hx2Var.z.getContext(), hx2Var.c0), qoe.o(-1, 8));
                boolean z3 = b;
                oh ohVar = new oh(this, arrayList2, smbVar, linearLayout, actionBarPopupWindow$ActionBarPopupWindowLayout3, (byte) 7);
                for (int i8 = 0; i8 < arrayList.size(); i8++) {
                    a8 c2 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, ((Integer) arrayList3.get(i8)).intValue(), (CharSequence) arrayList.get(i8), false, hx2Var.c0);
                    c2.setTag(Integer.valueOf(i8));
                    c2.setOnClickListener(ohVar);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout3.measure(View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31));
                linearLayout.addView(smbVar, new LinearLayout.LayoutParams(actionBarPopupWindow$ActionBarPopupWindowLayout3.getMeasuredWidth() - gm.L(16.0f), (int) (actionBarPopupWindow$ActionBarPopupWindowLayout3.getMeasuredHeight() * 1.5f)));
                actionBarPopupWindow$ActionBarPopupWindowLayout3.b(linearLayout);
                frameLayout.setOnClickListener(new hn1(actionBarPopupWindow$ActionBarPopupWindowLayout3, (byte) 2));
                iq5 iq5Var2 = hx2Var.q;
                int i9 = iq5Var2.d + iq5Var2.b;
                int min3 = ((int) (Math.min(hx2Var.z.getWidth(), hx2Var.z.getHeight() - i9) / 1.8f)) / 2;
                hx2Var.z.addView(actionBarPopupWindow$ActionBarPopupWindowLayout3, qoe.d(-2, -2.0f, 49, 0.0f, (gm.L(84.0f) + ((int) ((hx2Var.e + Math.max(r0 + min3, ((hx2Var.z.getHeight() - i9) - hx2Var.I) / 2)) + min3))) / gm.p, 0.0f, 0.0f));
                hx2Var.L = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                actionBarPopupWindow$ActionBarPopupWindowLayout3.setTranslationY(-gm.L(12.0f));
                hx2Var.L.setAlpha(0.0f);
                hx2Var.L.setScaleX(0.8f);
                hx2Var.L.setScaleY(0.8f);
                hx2Var.L.setPivotY(0.0f);
                hx2Var.L.setPivotX(r0.getMeasuredWidth() / 2.0f);
                hx2Var.L.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(d53.h).start();
                if (hx2Var.P == null) {
                    c31 c31Var = new c31(hx2Var, hx2Var.z.getContext(), z8c.t0, hx2Var.c0);
                    hx2Var.P = c31Var;
                    c31Var.O0 = z3;
                    c31Var.setPadding(0, gm.L(22.0f), 0, gm.L(22.0f));
                    hx2Var.P.setClipChildren(false);
                    hx2Var.P.setClipToPadding(false);
                    hx2Var.P.setVisibility(0);
                    hx2Var.P.setHint(jb6.M0(2131744537, null));
                    hx2Var.P.setBubbleOffset(-gm.L(105.0f));
                    hx2Var.P.setMiniBubblesOffset(-gm.L(14.0f));
                    FrameLayout frameLayout2 = new FrameLayout(hx2Var.z.getContext());
                    hx2Var.Q = frameLayout2;
                    frameLayout2.addView(hx2Var.P, qoe.d(-2, 116.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                    hx2Var.z.addView(hx2Var.Q, qoe.d(-2, -2.0f, 1, 0.0f, 100.0f, 0.0f, 0.0f));
                }
                hx2Var.P.setSelectedEmojis(hx2Var.o);
                hx2Var.P.setDelegate(new tw2(hx2Var));
                hx2Var.P.m(null, null, false);
                hx2Var.Q.setScaleY(0.6f);
                hx2Var.Q.setScaleX(0.6f);
                hx2Var.Q.setAlpha(0.0f);
                gm.d3(new sw2(hx2Var, (byte) 2), 10L);
                hx2Var.K = true;
                hx2Var.z.invalidate();
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                i4 = 0;
            } else {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                if (i2 != 0) {
                    if (i2 != 2 || hx2Var.l == null) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                        i3 = 0;
                        if (hx2Var.l != null) {
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = new ArrayList();
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            if (hx2Var.l.j(hx2Var.V) && !hx2Var.l.c()) {
                                aq1.p(2131745357, arrayList5, arrayList7, valueOf4);
                                arrayList6.add(0);
                            }
                            if (hx2Var.l.j(hx2Var.V) && !hx2Var.l.c()) {
                                aq1.p(2131745317, arrayList5, arrayList7, valueOf3);
                                arrayList6.add(4);
                            }
                            if (hx2Var.l.b()) {
                                aq1.p(2131745594, arrayList5, arrayList7, valueOf2);
                                arrayList6.add(3);
                            }
                            TLRPC.Document document = hx2Var.W;
                            if (document != null && hx2Var.l.e(document)) {
                                arrayList6.add(aq1.l(2131754482, arrayList5, R.drawable.outline_caption_24, arrayList7, 11));
                            }
                            if (hx2Var.W != null) {
                                hs6 d0 = hs6.d0(hx2Var.r);
                                TLRPC.Document document2 = hx2Var.W;
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= d0.j0.size()) {
                                        z = false;
                                        break;
                                    }
                                    TLRPC.Document document3 = (TLRPC.Document) d0.j0.get(i10);
                                    if (document3.id == document2.id) {
                                        d0.j0.remove(i10);
                                        d0.j0.add(0, document3);
                                        z = true;
                                        break;
                                    }
                                    i10++;
                                }
                                if (z) {
                                    arrayList5.add(jb6.Y(2131751535, "Delete", new Object[0]));
                                    arrayList7.add(valueOf5);
                                    arrayList6.add(1);
                                } else {
                                    arrayList5.add(jb6.Y(2131745664, "SaveToGIFs", new Object[0]));
                                    arrayList7.add(Integer.valueOf(R.drawable.msg_gif_add));
                                    arrayList6.add(2);
                                }
                            } else {
                                z = false;
                            }
                            if (arrayList5.isEmpty()) {
                                return;
                            }
                            hx2Var.K = true;
                            hx2Var.z.invalidate();
                            int[] iArr = new int[arrayList7.size()];
                            for (int i11 = 0; i11 < arrayList7.size(); i11++) {
                                iArr[i11] = ((Integer) arrayList7.get(i11)).intValue();
                            }
                            rc1 rc1Var = new rc1((Object) this, (Object) arrayList6, (byte) 24);
                            int i12 = 0;
                            while (i12 < arrayList5.size()) {
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout5;
                                a8 c3 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout6, ((Integer) arrayList7.get(i12)).intValue(), (CharSequence) arrayList5.get(i12), false, hx2Var.c0);
                                c3.setTag(Integer.valueOf(i12));
                                c3.setOnClickListener(rc1Var);
                                if (z && i12 == arrayList5.size() - 1) {
                                    c3.c(cmb.p7, cmb.o7);
                                }
                                i12++;
                                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout6;
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout5;
                            cx2 cx2Var = new cx2(this, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                            hx2Var.k = cx2Var;
                            cx2Var.e = true;
                            cx2Var.c = (short) 150;
                            cx2Var.g = true;
                            cx2Var.setOutsideTouchable(true);
                            hx2Var.k.setClippingEnabled(true);
                            hx2Var.k.setAnimationStyle(R.style.PopupContextAnimation);
                            hx2Var.k.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31));
                            hx2Var.k.setInputMethodMode(2);
                            hx2Var.k.getContentView().setFocusableInTouchMode(true);
                            iq5 iq5Var3 = hx2Var.q;
                            int min4 = (Math.min(hx2Var.z.getWidth(), hx2Var.z.getHeight() - (iq5Var3.d + iq5Var3.b)) - gm.L(40.0f)) / 2;
                            int L2 = (int) ((gm.L(24.0f) - hx2Var.e) + ((int) (hx2Var.e + Math.max(r0 + min4 + (hx2Var.G != null ? gm.L(40.0f) : 0), ((hx2Var.z.getHeight() - r2) - hx2Var.I) / 2) + min4)));
                            i4 = 0;
                            hx2Var.k.showAtLocation(hx2Var.z, 0, (int) ((r3.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth()) / 2.0f), L2);
                            try {
                                hx2Var.z.performHapticFeedback(0);
                            } catch (Exception unused2) {
                            }
                            float f2 = hx2Var.e;
                            if (f2 != 0.0f) {
                                hx2Var.f = f2;
                                final byte b4 = 2;
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ww2
                                    public final /* synthetic */ dx2 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        byte b32 = b4;
                                        dx2 dx2Var = this.b;
                                        switch (b32) {
                                            case 0:
                                                hx2 hx2Var2 = dx2Var.a;
                                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                hx2Var2.g = floatValue;
                                                float f22 = hx2Var2.f;
                                                hx2Var2.e = td4.A(0.0f, f22, floatValue, f22);
                                                hx2Var2.z.invalidate();
                                                break;
                                            case 1:
                                                hx2 hx2Var3 = dx2Var.a;
                                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                hx2Var3.g = floatValue2;
                                                float f3 = hx2Var3.f;
                                                hx2Var3.e = td4.A(0.0f, f3, floatValue2, f3);
                                                hx2Var3.z.invalidate();
                                                break;
                                            default:
                                                hx2 hx2Var4 = dx2Var.a;
                                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                hx2Var4.g = floatValue3;
                                                float f4 = hx2Var4.f;
                                                hx2Var4.e = td4.A(0.0f, f4, floatValue3, f4);
                                                hx2Var4.z.invalidate();
                                                break;
                                        }
                                    }
                                });
                                ofFloat2.setDuration(350L);
                                ofFloat2.setInterpolator(d53.f);
                                ofFloat2.start();
                            }
                        }
                    } else {
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        if (hx2Var.l.j(hx2Var.V)) {
                            aq1.p(2131745360, arrayList8, arrayList10, valueOf4);
                            arrayList9.add(0);
                        }
                        Boolean S = hx2Var.l.S(hx2Var.W);
                        if (S != null) {
                            if (S.booleanValue()) {
                                aq1.p(2131745280, arrayList8, arrayList10, valueOf);
                                arrayList9.add(1);
                            } else {
                                aq1.p(2131746021, arrayList8, arrayList10, valueOf);
                                arrayList9.add(2);
                            }
                        }
                        if (hx2Var.l.C(hx2Var.W)) {
                            arrayList8.add(jb6.L0(2131751701));
                            arrayList10.add(Integer.valueOf(R.drawable.msg_copy));
                            arrayList9.add(3);
                        }
                        if (hx2Var.l.Q(hx2Var.W)) {
                            aq1.p(2131746044, arrayList8, arrayList10, valueOf5);
                            arrayList9.add(4);
                        }
                        boolean C0 = hs6.d0(hx2Var.r).C0(hx2Var.W);
                        if (!k47.H2(hx2Var.W) && !k47.E3(hx2Var.W)) {
                            if (C0) {
                                L0 = jb6.L0(2131751475);
                            } else if (hs6.d0(hx2Var.r).u() && k47.u4(hx2Var.W)) {
                                L0 = jb6.L0(2131754371);
                            }
                            arrayList8.add(L0);
                            arrayList10.add(Integer.valueOf(C0 ? R.drawable.msg_unfave : R.drawable.msg_fave));
                            arrayList9.add(5);
                        }
                        if (arrayList8.isEmpty()) {
                            return;
                        }
                        hx2Var.K = true;
                        hx2Var.z.invalidate();
                        int[] iArr2 = new int[arrayList10.size()];
                        for (int i13 = 0; i13 < arrayList10.size(); i13++) {
                            iArr2[i13] = ((Integer) arrayList10.get(i13)).intValue();
                        }
                        xw2 xw2Var = new xw2(this, arrayList9, C0);
                        boolean a = hx2Var.a(actionBarPopupWindow$ActionBarPopupWindowLayout4);
                        int i14 = 0;
                        while (i14 < arrayList8.size()) {
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                            a8 c4 = r7.c(!a && i14 == 0, i14 == arrayList8.size() + (-1), actionBarPopupWindow$ActionBarPopupWindowLayout7, ((Integer) arrayList10.get(i14)).intValue(), (CharSequence) arrayList8.get(i14), false, hx2Var.c0);
                            if (((Integer) arrayList9.get(i14)).intValue() == 4) {
                                c4.c(cmb.p7, cmb.o7);
                            }
                            c4.setTag(Integer.valueOf(i14));
                            c4.setOnClickListener(xw2Var);
                            i14++;
                            actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout7;
                        }
                        actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                        bx2 bx2Var = new bx2(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                        hx2Var.k = bx2Var;
                        bx2Var.e = true;
                        bx2Var.c = (short) 150;
                        bx2Var.g = true;
                        bx2Var.setOutsideTouchable(true);
                        hx2Var.k.setClippingEnabled(true);
                        hx2Var.k.setAnimationStyle(R.style.PopupContextAnimation);
                        hx2Var.k.setFocusable(true);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31));
                        hx2Var.k.setInputMethodMode(2);
                        hx2Var.k.getContentView().setFocusableInTouchMode(true);
                        iq5 iq5Var4 = hx2Var.q;
                        int min5 = (Math.min(hx2Var.z.getWidth(), hx2Var.z.getHeight() - (iq5Var4.d + iq5Var4.b)) - gm.L(40.0f)) / 2;
                        int L3 = (int) ((gm.L(24.0f) - hx2Var.e) + ((int) (hx2Var.e + Math.max(r0 + min5 + (hx2Var.G != null ? gm.L(40.0f) : 0), ((hx2Var.z.getHeight() - r2) - hx2Var.I) / 2) + min5)));
                        m8 m8Var = hx2Var.k;
                        su suVar = hx2Var.z;
                        i3 = 0;
                        m8Var.showAtLocation(suVar, 0, (int) ((suVar.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), L3);
                        m8.i(actionBarPopupWindow$ActionBarPopupWindowLayout);
                        try {
                            hx2Var.z.performHapticFeedback(0);
                        } catch (Exception unused3) {
                        }
                        float f3 = hx2Var.e;
                        if (f3 != 0.0f) {
                            hx2Var.f = f3;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            final byte b5 = 1;
                            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ww2
                                public final /* synthetic */ dx2 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    byte b32 = b5;
                                    dx2 dx2Var = this.b;
                                    switch (b32) {
                                        case 0:
                                            hx2 hx2Var2 = dx2Var.a;
                                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            hx2Var2.g = floatValue;
                                            float f22 = hx2Var2.f;
                                            hx2Var2.e = td4.A(0.0f, f22, floatValue, f22);
                                            hx2Var2.z.invalidate();
                                            break;
                                        case 1:
                                            hx2 hx2Var3 = dx2Var.a;
                                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            hx2Var3.g = floatValue2;
                                            float f32 = hx2Var3.f;
                                            hx2Var3.e = td4.A(0.0f, f32, floatValue2, f32);
                                            hx2Var3.z.invalidate();
                                            break;
                                        default:
                                            hx2 hx2Var4 = dx2Var.a;
                                            float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            hx2Var4.g = floatValue3;
                                            float f4 = hx2Var4.f;
                                            hx2Var4.e = td4.A(0.0f, f4, floatValue3, f4);
                                            hx2Var4.z.invalidate();
                                            break;
                                    }
                                }
                            });
                            ofFloat3.setDuration(350L);
                            ofFloat3.setInterpolator(d53.f);
                            ofFloat3.start();
                        }
                    }
                    i4 = i3;
                    actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                } else {
                    if (k47.W3(hx2Var.W) && !z8c.h(j5.a(hx2Var.r).a).p()) {
                        if (hx2Var.O == null) {
                            bj8 bj8Var = new bj8(hx2Var.z.getContext(), hx2Var.c0);
                            hx2Var.O = bj8Var;
                            hx2Var.z.addView(bj8Var, qoe.c(-1.0f, -1));
                            hx2Var.O.setOnClickListener(new uw2(hx2Var, b3));
                            z2 = true;
                            hx2Var.O.b.w.setOnClickListener(new uw2(hx2Var, 1 == true ? 1 : 0));
                        } else {
                            z2 = true;
                        }
                        gm.T3(hx2Var.O, false, 1.0f, z2, false);
                        gm.R3(hx2Var.O, z2);
                        hx2Var.O.setTranslationY(0.0f);
                        hx2Var.K = true;
                        hx2Var.z.invalidate();
                        try {
                            hx2Var.z.performHapticFeedback(0);
                            return;
                        } catch (Exception unused4) {
                            return;
                        }
                    }
                    boolean C02 = hs6.d0(hx2Var.r).C0(hx2Var.W);
                    ArrayList arrayList11 = new ArrayList();
                    ArrayList arrayList12 = new ArrayList();
                    ArrayList arrayList13 = new ArrayList();
                    fx2 fx2Var9 = hx2Var.l;
                    if (fx2Var9 != null) {
                        if (fx2Var9.j(hx2Var.V) && !hx2Var.l.c()) {
                            b10.s(null, 2131745322, arrayList11, arrayList13, valueOf4);
                            arrayList12.add(0);
                        }
                        if (!hx2Var.l.j(hx2Var.V) || hx2Var.l.c()) {
                            str = null;
                        } else {
                            str = null;
                            b10.s(null, 2131745317, arrayList11, arrayList13, valueOf3);
                            arrayList12.add(6);
                        }
                        if (hx2Var.l.b()) {
                            b10.s(str, 2131745594, arrayList11, arrayList13, valueOf2);
                            arrayList12.add(3);
                        }
                        if (hx2Var.l.f()) {
                            b10.s(str, 2131748984, arrayList11, arrayList13, valueOf5);
                            arrayList12.add(5);
                        }
                    }
                    if (!k47.E3(hx2Var.W)) {
                        if (!C02) {
                            i5 = (hs6.d0(hx2Var.r).u() && k47.u4(hx2Var.W)) ? 2131754371 : 2131751475;
                        }
                        arrayList11.add(jb6.M0(i5, null));
                        arrayList13.add(Integer.valueOf(C02 ? R.drawable.msg_unfave : R.drawable.msg_fave));
                        arrayList12.add(2);
                    }
                    fx2 fx2Var10 = hx2Var.l;
                    if (fx2Var10 != null && (inputStickerSet = hx2Var.a0) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty) && fx2Var10.T()) {
                        arrayList11.add(jb6.a0(null, null, 2131743232, new Object[0]));
                        arrayList13.add(Integer.valueOf(R.drawable.msg_media));
                        arrayList12.add(1);
                    }
                    if (hx2Var.p) {
                        b10.s(null, 2131751474, arrayList11, arrayList13, valueOf5);
                        arrayList12.add(4);
                    }
                    if (hx2Var.a0 != null && hx2Var.W != null) {
                        TLRPC.TL_messages_stickerSet n0 = hs6.d0(hx2Var.r).n0(hx2Var.a0, true);
                        if (n0 != null && (fx2Var2 = hx2Var.l) != null && fx2Var2.B()) {
                            TLRPC.StickerSet stickerSet = n0.set;
                            if (!stickerSet.emojis && !stickerSet.masks) {
                                b10.r(null, 2131751160, arrayList11, R.drawable.msg_edit, arrayList13);
                                arrayList12.add(7);
                            }
                        }
                        if (n0 != null && n0.set.creator && (fx2Var = hx2Var.l) != null && fx2Var.H()) {
                            b10.s(null, 2131751432, arrayList11, arrayList13, valueOf5);
                            arrayList12.add(8);
                        }
                    }
                    if (arrayList11.isEmpty()) {
                        return;
                    }
                    hx2Var.K = true;
                    hx2Var.z.invalidate();
                    zw2 zw2Var = new zw2(this, arrayList12, C02);
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                    hx2Var.a(actionBarPopupWindow$ActionBarPopupWindowLayout8);
                    int i15 = 0;
                    while (i15 < arrayList11.size()) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout9 = actionBarPopupWindow$ActionBarPopupWindowLayout8;
                        a8 c5 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout9, ((Integer) arrayList13.get(i15)).intValue(), (CharSequence) arrayList11.get(i15), false, hx2Var.c0);
                        c5.setTag(Integer.valueOf(i15));
                        c5.setOnClickListener(zw2Var);
                        if (((Integer) arrayList12.get(i15)).intValue() == 8) {
                            int i16 = cmb.p7;
                            c5.c(i16, i16);
                            c5.h(0.1f, i16);
                        }
                        i15++;
                        actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout9;
                    }
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout10 = actionBarPopupWindow$ActionBarPopupWindowLayout8;
                    ax2 ax2Var = new ax2(this, actionBarPopupWindow$ActionBarPopupWindowLayout10);
                    hx2Var.k = ax2Var;
                    ax2Var.e = true;
                    ax2Var.c = (short) 100;
                    ax2Var.g = true;
                    ax2Var.setOutsideTouchable(true);
                    hx2Var.k.setClippingEnabled(true);
                    hx2Var.k.setAnimationStyle(R.style.PopupContextAnimation);
                    hx2Var.k.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout10.measure(View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31));
                    hx2Var.k.setInputMethodMode(2);
                    hx2Var.k.getContentView().setFocusableInTouchMode(true);
                    iq5 iq5Var5 = hx2Var.q;
                    int i17 = iq5Var5.d + iq5Var5.b;
                    if (hx2Var.V == 1) {
                        min = Math.min(hx2Var.z.getWidth(), hx2Var.z.getHeight() - i17) - gm.L(40.0f);
                    } else {
                        boolean z4 = hx2Var.S;
                        su suVar2 = hx2Var.z;
                        min = (int) (z4 ? Math.min(suVar2.getWidth(), hx2Var.z.getHeight() - i17) - gm.N(40.0f) : Math.min(suVar2.getWidth(), hx2Var.z.getHeight() - i17) / 1.8f);
                    }
                    int L4 = gm.L(24.0f) + ((int) (hx2Var.e + Math.max(r0 + r2 + (hx2Var.G != null ? gm.L(40.0f) : 0), ((hx2Var.z.getHeight() - i17) - hx2Var.I) / 2) + (min / 2)));
                    if (hx2Var.S) {
                        L4 += gm.L(24.0f);
                    }
                    i4 = 0;
                    hx2Var.k.showAtLocation(hx2Var.z, 0, (int) ((r2.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout10.getMeasuredWidth()) / 2.0f), L4);
                    try {
                        hx2Var.z.performHapticFeedback(0);
                    } catch (Exception unused5) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout10;
                }
            }
            i6 = i4;
            while (i6 < actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount()) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout2.M.getChildAt(i6);
                if (childAt instanceof a8) {
                    ((a8) childAt).n(i6 == 0 ? 1 : i4, i6 == actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount() + (-1) ? 1 : i4);
                }
                i6++;
            }
        }
        i = 1;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout32 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i, hx2Var.c0, hx2Var.z.getContext());
        ylb ylbVar2 = null;
        im0 c6 = km0Var.c(actionBarPopupWindow$ActionBarPopupWindowLayout32, null, true);
        c6.p(qqd.k(hx2Var.c0));
        wi8.r(c6, gm.L(12.0f), 8.0f);
        c6.S.e = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout32.setBackground(c6);
        i2 = hx2Var.V;
        if (i2 != 3) {
        }
        i6 = i4;
        while (i6 < actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount()) {
        }
    }
}
