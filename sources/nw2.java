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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class nw2 implements Runnable {
    public final /* synthetic */ rw2 a;

    public nw2(rw2 rw2Var) {
        this.a = rw2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0d09  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int i2;
        int i3;
        boolean z;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        String L0;
        int min;
        pw2 pw2Var;
        pw2 pw2Var2;
        TLRPC.InputStickerSet inputStickerSet;
        int i4;
        String str;
        boolean z2;
        int i5;
        qob qobVar;
        byte b;
        fu5 J;
        Integer valueOf = Integer.valueOf(R.drawable.msg_smile_status);
        Integer valueOf2 = Integer.valueOf(R.drawable.msg_autodelete);
        Integer valueOf3 = Integer.valueOf(R.drawable.input_notify_off);
        Integer valueOf4 = Integer.valueOf(R.drawable.msg_send);
        Integer valueOf5 = Integer.valueOf(R.drawable.msg_delete);
        rw2 rw2Var = this.a;
        ll0 ll0Var = rw2Var.t;
        if (rw2Var.w == null || rw2Var.m) {
            return;
        }
        rw2Var.R = true;
        pw2 pw2Var3 = rw2Var.l;
        if (pw2Var3 != null && (J = pw2Var3.J(rw2Var.z)) != null) {
            J.R(ll0Var, dtd.k(rw2Var.c0), true);
            J.t = false;
            J.Z();
            J.p = new vd2(this, (byte) 16);
            ViewGroup viewGroup = J.A;
            iw2 iw2Var = new iw2(this, viewGroup);
            rw2Var.k = iw2Var;
            iw2Var.e = true;
            iw2Var.c = (short) 150;
            iw2Var.g = true;
            iw2Var.setOutsideTouchable(true);
            rw2Var.k.setClippingEnabled(true);
            rw2Var.k.setAnimationStyle(R.style.PopupContextAnimation);
            rw2Var.k.setFocusable(true);
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31));
            rw2Var.k.setInputMethodMode(2);
            rw2Var.k.getContentView().setFocusableInTouchMode(true);
            mq5 mq5Var = rw2Var.q;
            int min2 = (Math.min(rw2Var.z.getWidth(), rw2Var.z.getHeight() - (mq5Var.d + mq5Var.b)) - hl.L(40.0f)) / 2;
            int L = (int) ((hl.L(24.0f) - rw2Var.e) + ((int) (rw2Var.e + Math.max(r2 + min2 + (rw2Var.G != null ? hl.L(40.0f) : 0), ((rw2Var.z.getHeight() - r3) - rw2Var.I) / 2) + min2)));
            rw2Var.k.showAtLocation(rw2Var.z, 0, (int) ((r4.getMeasuredWidth() - viewGroup.getMeasuredWidth()) / 2.0f), L);
            try {
                rw2Var.z.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            float f = rw2Var.e;
            if (f != 0.0f) {
                rw2Var.f = f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                final byte b2 = 0;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: gw2
                    public final /* synthetic */ nw2 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b3 = b2;
                        nw2 nw2Var = this.b;
                        switch (b3) {
                            case 0:
                                rw2 rw2Var2 = nw2Var.a;
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                rw2Var2.g = floatValue;
                                float f2 = rw2Var2.f;
                                rw2Var2.e = qd4.A(0.0f, f2, floatValue, f2);
                                rw2Var2.z.invalidate();
                                break;
                            case 1:
                                rw2 rw2Var3 = nw2Var.a;
                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                rw2Var3.g = floatValue2;
                                float f3 = rw2Var3.f;
                                rw2Var3.e = qd4.A(0.0f, f3, floatValue2, f3);
                                rw2Var3.z.invalidate();
                                break;
                            default:
                                rw2 rw2Var4 = nw2Var.a;
                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                rw2Var4.g = floatValue3;
                                float f4 = rw2Var4.f;
                                rw2Var4.e = qd4.A(0.0f, f4, floatValue3, f4);
                                rw2Var4.z.invalidate();
                                break;
                        }
                    }
                });
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(k43.f);
                ofFloat.start();
            }
            rw2Var.K = true;
            return;
        }
        byte b3 = 0;
        if (rw2Var.V != 3) {
            pw2 pw2Var4 = rw2Var.l;
            if (pw2Var4 != null) {
                TLRPC.TL_messageMediaPoll d = pw2Var4.d();
                TLRPC.PollAnswer g = rw2Var.l.g();
                if (d != null && d.poll != null && g != null) {
                    TLRPC.PollAnswerVoters E1 = r47.E1(d, g.option);
                    if (E1 != null && E1.voters > 0) {
                        r47.A(d);
                    }
                }
            }
            i = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i, rw2Var.c0, rw2Var.z.getContext());
            vnb vnbVar = null;
            jl0 c = ll0Var.c(actionBarPopupWindow$ActionBarPopupWindowLayout2, null, true);
            c.p(dtd.k(rw2Var.c0));
            ik8.r(c, hl.L(12.0f), 8.0f);
            c.S.e = true;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackground(c);
            i2 = rw2Var.V;
            if (i2 != 3) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = rw2Var.T;
                int i6 = R.drawable.menu_sticker_add;
                if (tL_messages_stickerSet == null) {
                    pw2 pw2Var5 = rw2Var.l;
                    if (pw2Var5 == null || !pw2Var5.y()) {
                        if (rw2Var.l.u()) {
                            c00.t(null, 2131745316, arrayList, arrayList3, valueOf4);
                            arrayList2.add(0);
                        }
                        c00.s(null, 2131754367, arrayList, R.drawable.msg_fave, arrayList3);
                        arrayList2.add(1);
                    } else {
                        c00.s(null, 2131745252, arrayList, R.drawable.menu_sticker_add, arrayList3);
                        arrayList2.add(0);
                    }
                }
                pw2 pw2Var6 = rw2Var.l;
                if (pw2Var6 == null || !pw2Var6.y()) {
                    pw2 pw2Var7 = rw2Var.l;
                    arrayList.add(ob6.M0((pw2Var7 == null || !pw2Var7.M()) ? 2131754363 : 2131744506, null));
                    pw2 pw2Var8 = rw2Var.l;
                    if (pw2Var8 != null && pw2Var8.M()) {
                        i6 = R.drawable.msg_replace;
                    }
                    arrayList3.add(Integer.valueOf(i6));
                    arrayList2.add(2);
                }
                byte b4 = 16;
                b8 b8Var = new b8(0, rw2Var.c0, rw2Var.w, true, false);
                b8Var.setItemHeight(44);
                b8Var.j(ob6.M0(2131753749, null), R.drawable.msg_arrow_back, null);
                b8Var.getTextView().setPadding(ob6.a0 ? 0 : hl.L(40.0f), 0, ob6.a0 ? hl.L(40.0f) : 0, 0);
                FrameLayout frameLayout = new FrameLayout(rw2Var.z.getContext());
                LinearLayout linearLayout = new LinearLayout(rw2Var.z.getContext());
                yob.h(aob.G8, rw2Var.c0, linearLayout);
                linearLayout.setOrientation(1);
                if (rw2Var.w == null) {
                    qobVar = null;
                    b = 1;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new TLRPC.TL_stickerSetNoCovered());
                    TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = new TLRPC.TL_messages_getMyStickers();
                    tL_messages_getMyStickers.limit = 100;
                    ConnectionsManager.getInstance(rw2Var.r).sendRequest(tL_messages_getMyStickers, new fn0((Object) rw2Var, (Object) arrayList4, (Object) tL_messages_getMyStickers, (byte) 20));
                    qobVar = new qob(rw2Var.w, vnbVar, (byte) 4);
                    qobVar.setLayoutManager(new x46());
                    b = 1;
                    qobVar.i(new lr(arrayList4, b));
                    qobVar.setAdapter(new ow2(rw2Var, arrayList4));
                }
                qobVar.setOnItemClickListener(new u(this, b4));
                frameLayout.addView(b8Var);
                linearLayout.addView(frameLayout);
                linearLayout.addView(new k8(rw2Var.z.getContext(), rw2Var.c0), tre.o(-1, 8));
                qob qobVar2 = qobVar;
                boolean z3 = b;
                nh nhVar = new nh(this, arrayList2, qobVar2, linearLayout, actionBarPopupWindow$ActionBarPopupWindowLayout2, (byte) 7);
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    b8 c2 = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, ((Integer) arrayList3.get(i7)).intValue(), (CharSequence) arrayList.get(i7), false, rw2Var.c0);
                    c2.setTag(Integer.valueOf(i7));
                    c2.setOnClickListener(nhVar);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31));
                linearLayout.addView(qobVar2, new LinearLayout.LayoutParams(actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth() - hl.L(16.0f), (int) (actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredHeight() * 1.5f)));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.b(linearLayout);
                frameLayout.setOnClickListener(new co1(actionBarPopupWindow$ActionBarPopupWindowLayout2, (byte) 2));
                mq5 mq5Var2 = rw2Var.q;
                int i8 = mq5Var2.d + mq5Var2.b;
                int min3 = ((int) (Math.min(rw2Var.z.getWidth(), rw2Var.z.getHeight() - i8) / 1.8f)) / 2;
                rw2Var.z.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, tre.d(-2, -2.0f, 49, 0.0f, (hl.L(84.0f) + ((int) ((rw2Var.e + Math.max(r0 + min3, ((rw2Var.z.getHeight() - i8) - rw2Var.I) / 2)) + min3))) / hl.p, 0.0f, 0.0f));
                rw2Var.L = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setTranslationY(-hl.L(12.0f));
                rw2Var.L.setAlpha(0.0f);
                rw2Var.L.setScaleX(0.8f);
                rw2Var.L.setScaleY(0.8f);
                rw2Var.L.setPivotY(0.0f);
                rw2Var.L.setPivotX(r0.getMeasuredWidth() / 2.0f);
                rw2Var.L.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(k43.h).start();
                if (rw2Var.P == null) {
                    d21 d21Var = new d21(rw2Var, rw2Var.z.getContext(), yac.t0, rw2Var.c0);
                    rw2Var.P = d21Var;
                    d21Var.O0 = z3;
                    d21Var.setPadding(0, hl.L(22.0f), 0, hl.L(22.0f));
                    rw2Var.P.setClipChildren(false);
                    rw2Var.P.setClipToPadding(false);
                    rw2Var.P.setVisibility(0);
                    rw2Var.P.setHint(ob6.M0(2131744505, null));
                    rw2Var.P.setBubbleOffset(-hl.L(105.0f));
                    rw2Var.P.setMiniBubblesOffset(-hl.L(14.0f));
                    FrameLayout frameLayout2 = new FrameLayout(rw2Var.z.getContext());
                    rw2Var.Q = frameLayout2;
                    frameLayout2.addView(rw2Var.P, tre.d(-2, 116.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                    rw2Var.z.addView(rw2Var.Q, tre.d(-2, -2.0f, 1, 0.0f, 100.0f, 0.0f, 0.0f));
                }
                rw2Var.P.setSelectedEmojis(rw2Var.o);
                rw2Var.P.setDelegate(new dw2(rw2Var));
                rw2Var.P.m(null, null, false);
                rw2Var.Q.setScaleY(0.6f);
                rw2Var.Q.setScaleX(0.6f);
                rw2Var.Q.setAlpha(0.0f);
                hl.d3(new cw2(rw2Var, (byte) 2), 10L);
                rw2Var.K = true;
                rw2Var.z.invalidate();
                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                i3 = 0;
            } else if (i2 != 0) {
                if (i2 != 2 || rw2Var.l == null) {
                    i3 = 0;
                    if (rw2Var.l != null) {
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                        if (rw2Var.l.j(rw2Var.V) && !rw2Var.l.c()) {
                            bp1.p(2131745351, arrayList5, arrayList7, valueOf4);
                            arrayList6.add(0);
                        }
                        if (rw2Var.l.j(rw2Var.V) && !rw2Var.l.c()) {
                            bp1.p(2131745311, arrayList5, arrayList7, valueOf3);
                            arrayList6.add(4);
                        }
                        if (rw2Var.l.b()) {
                            bp1.p(2131745588, arrayList5, arrayList7, valueOf2);
                            arrayList6.add(3);
                        }
                        TLRPC.Document document = rw2Var.W;
                        if (document != null && rw2Var.l.e(document)) {
                            arrayList6.add(bp1.l(2131754478, arrayList5, R.drawable.outline_caption_24, arrayList7, 11));
                        }
                        if (rw2Var.W != null) {
                            ls6 d0 = ls6.d0(rw2Var.r);
                            TLRPC.Document document2 = rw2Var.W;
                            int i9 = 0;
                            while (true) {
                                if (i9 >= d0.j0.size()) {
                                    z = false;
                                    break;
                                }
                                TLRPC.Document document3 = (TLRPC.Document) d0.j0.get(i9);
                                if (document3.id == document2.id) {
                                    d0.j0.remove(i9);
                                    d0.j0.add(0, document3);
                                    z = true;
                                    break;
                                }
                                i9++;
                            }
                            if (z) {
                                arrayList5.add(ob6.Y(2131751563, "Delete", new Object[0]));
                                arrayList7.add(valueOf5);
                                arrayList6.add(1);
                            } else {
                                arrayList5.add(ob6.Y(2131745658, "SaveToGIFs", new Object[0]));
                                arrayList7.add(Integer.valueOf(R.drawable.msg_gif_add));
                                arrayList6.add(2);
                            }
                        } else {
                            z = false;
                        }
                        if (arrayList5.isEmpty()) {
                            return;
                        }
                        rw2Var.K = true;
                        rw2Var.z.invalidate();
                        int[] iArr = new int[arrayList7.size()];
                        for (int i10 = 0; i10 < arrayList7.size(); i10++) {
                            iArr[i10] = ((Integer) arrayList7.get(i10)).intValue();
                        }
                        sb1 sb1Var = new sb1((Object) this, (Object) arrayList6, (byte) 25);
                        int i11 = 0;
                        while (i11 < arrayList5.size()) {
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                            b8 c3 = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout4, ((Integer) arrayList7.get(i11)).intValue(), (CharSequence) arrayList5.get(i11), false, rw2Var.c0);
                            c3.setTag(Integer.valueOf(i11));
                            c3.setOnClickListener(sb1Var);
                            if (z && i11 == arrayList5.size() - 1) {
                                c3.c(aob.q7, aob.p7);
                            }
                            i11++;
                            actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                        }
                        actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                        mw2 mw2Var = new mw2(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                        rw2Var.k = mw2Var;
                        mw2Var.e = true;
                        mw2Var.c = (short) 150;
                        mw2Var.g = true;
                        mw2Var.setOutsideTouchable(true);
                        rw2Var.k.setClippingEnabled(true);
                        rw2Var.k.setAnimationStyle(R.style.PopupContextAnimation);
                        rw2Var.k.setFocusable(true);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31));
                        rw2Var.k.setInputMethodMode(2);
                        rw2Var.k.getContentView().setFocusableInTouchMode(true);
                        mq5 mq5Var3 = rw2Var.q;
                        int min4 = (Math.min(rw2Var.z.getWidth(), rw2Var.z.getHeight() - (mq5Var3.d + mq5Var3.b)) - hl.L(40.0f)) / 2;
                        int L2 = (int) ((hl.L(24.0f) - rw2Var.e) + ((int) (rw2Var.e + Math.max(r0 + min4 + (rw2Var.G != null ? hl.L(40.0f) : 0), ((rw2Var.z.getHeight() - r2) - rw2Var.I) / 2) + min4)));
                        i3 = 0;
                        rw2Var.k.showAtLocation(rw2Var.z, 0, (int) ((r3.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), L2);
                        try {
                            rw2Var.z.performHapticFeedback(0);
                        } catch (Exception unused2) {
                        }
                        float f2 = rw2Var.e;
                        if (f2 != 0.0f) {
                            rw2Var.f = f2;
                            final byte b5 = 2;
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: gw2
                                public final /* synthetic */ nw2 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    byte b32 = b5;
                                    nw2 nw2Var = this.b;
                                    switch (b32) {
                                        case 0:
                                            rw2 rw2Var2 = nw2Var.a;
                                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            rw2Var2.g = floatValue;
                                            float f22 = rw2Var2.f;
                                            rw2Var2.e = qd4.A(0.0f, f22, floatValue, f22);
                                            rw2Var2.z.invalidate();
                                            break;
                                        case 1:
                                            rw2 rw2Var3 = nw2Var.a;
                                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            rw2Var3.g = floatValue2;
                                            float f3 = rw2Var3.f;
                                            rw2Var3.e = qd4.A(0.0f, f3, floatValue2, f3);
                                            rw2Var3.z.invalidate();
                                            break;
                                        default:
                                            rw2 rw2Var4 = nw2Var.a;
                                            float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            rw2Var4.g = floatValue3;
                                            float f4 = rw2Var4.f;
                                            rw2Var4.e = qd4.A(0.0f, f4, floatValue3, f4);
                                            rw2Var4.z.invalidate();
                                            break;
                                    }
                                }
                            });
                            ofFloat2.setDuration(350L);
                            ofFloat2.setInterpolator(k43.f);
                            ofFloat2.start();
                        }
                    }
                } else {
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = new ArrayList();
                    ArrayList arrayList10 = new ArrayList();
                    if (rw2Var.l.j(rw2Var.V)) {
                        bp1.p(2131745354, arrayList8, arrayList10, valueOf4);
                        arrayList9.add(0);
                    }
                    Boolean S = rw2Var.l.S(rw2Var.W);
                    if (S != null) {
                        if (S.booleanValue()) {
                            bp1.p(2131745274, arrayList8, arrayList10, valueOf);
                            arrayList9.add(1);
                        } else {
                            bp1.p(2131746015, arrayList8, arrayList10, valueOf);
                            arrayList9.add(2);
                        }
                    }
                    if (rw2Var.l.C(rw2Var.W)) {
                        arrayList8.add(ob6.L0(2131751729));
                        arrayList10.add(Integer.valueOf(R.drawable.msg_copy));
                        arrayList9.add(3);
                    }
                    if (rw2Var.l.Q(rw2Var.W)) {
                        bp1.p(2131746038, arrayList8, arrayList10, valueOf5);
                        arrayList9.add(4);
                    }
                    boolean C0 = ls6.d0(rw2Var.r).C0(rw2Var.W);
                    if (!r47.H2(rw2Var.W) && !r47.E3(rw2Var.W)) {
                        if (C0) {
                            L0 = ob6.L0(2131751503);
                        } else if (ls6.d0(rw2Var.r).u() && r47.u4(rw2Var.W)) {
                            L0 = ob6.L0(2131754367);
                        }
                        arrayList8.add(L0);
                        arrayList10.add(Integer.valueOf(C0 ? R.drawable.msg_unfave : R.drawable.msg_fave));
                        arrayList9.add(5);
                    }
                    if (arrayList8.isEmpty()) {
                        return;
                    }
                    rw2Var.K = true;
                    rw2Var.z.invalidate();
                    int[] iArr2 = new int[arrayList10.size()];
                    for (int i12 = 0; i12 < arrayList10.size(); i12++) {
                        iArr2[i12] = ((Integer) arrayList10.get(i12)).intValue();
                    }
                    hw2 hw2Var = new hw2(this, arrayList9, C0);
                    boolean a = rw2Var.a(actionBarPopupWindow$ActionBarPopupWindowLayout2);
                    int i13 = 0;
                    while (i13 < arrayList8.size()) {
                        b8 c4 = s7.c(!a && i13 == 0, i13 == arrayList8.size() + (-1), actionBarPopupWindow$ActionBarPopupWindowLayout2, ((Integer) arrayList10.get(i13)).intValue(), (CharSequence) arrayList8.get(i13), false, rw2Var.c0);
                        if (((Integer) arrayList9.get(i13)).intValue() == 4) {
                            c4.c(aob.q7, aob.p7);
                        }
                        c4.setTag(Integer.valueOf(i13));
                        c4.setOnClickListener(hw2Var);
                        i13++;
                    }
                    lw2 lw2Var = new lw2(this, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                    rw2Var.k = lw2Var;
                    lw2Var.e = true;
                    lw2Var.c = (short) 150;
                    lw2Var.g = true;
                    lw2Var.setOutsideTouchable(true);
                    rw2Var.k.setClippingEnabled(true);
                    rw2Var.k.setAnimationStyle(R.style.PopupContextAnimation);
                    rw2Var.k.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31));
                    rw2Var.k.setInputMethodMode(2);
                    rw2Var.k.getContentView().setFocusableInTouchMode(true);
                    mq5 mq5Var4 = rw2Var.q;
                    int min5 = (Math.min(rw2Var.z.getWidth(), rw2Var.z.getHeight() - (mq5Var4.d + mq5Var4.b)) - hl.L(40.0f)) / 2;
                    int L3 = (int) ((hl.L(24.0f) - rw2Var.e) + ((int) (rw2Var.e + Math.max(r0 + min5 + (rw2Var.G != null ? hl.L(40.0f) : 0), ((rw2Var.z.getHeight() - r2) - rw2Var.I) / 2) + min5)));
                    i3 = 0;
                    rw2Var.k.showAtLocation(rw2Var.z, 0, (int) ((r3.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth()) / 2.0f), L3);
                    n8.i(actionBarPopupWindow$ActionBarPopupWindowLayout2);
                    try {
                        rw2Var.z.performHapticFeedback(0);
                    } catch (Exception unused3) {
                    }
                    float f3 = rw2Var.e;
                    if (f3 != 0.0f) {
                        rw2Var.f = f3;
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        final byte b6 = 1;
                        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: gw2
                            public final /* synthetic */ nw2 b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                byte b32 = b6;
                                nw2 nw2Var = this.b;
                                switch (b32) {
                                    case 0:
                                        rw2 rw2Var2 = nw2Var.a;
                                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        rw2Var2.g = floatValue;
                                        float f22 = rw2Var2.f;
                                        rw2Var2.e = qd4.A(0.0f, f22, floatValue, f22);
                                        rw2Var2.z.invalidate();
                                        break;
                                    case 1:
                                        rw2 rw2Var3 = nw2Var.a;
                                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        rw2Var3.g = floatValue2;
                                        float f32 = rw2Var3.f;
                                        rw2Var3.e = qd4.A(0.0f, f32, floatValue2, f32);
                                        rw2Var3.z.invalidate();
                                        break;
                                    default:
                                        rw2 rw2Var4 = nw2Var.a;
                                        float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        rw2Var4.g = floatValue3;
                                        float f4 = rw2Var4.f;
                                        rw2Var4.e = qd4.A(0.0f, f4, floatValue3, f4);
                                        rw2Var4.z.invalidate();
                                        break;
                                }
                            }
                        });
                        ofFloat3.setDuration(350L);
                        ofFloat3.setInterpolator(k43.f);
                        ofFloat3.start();
                    }
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            } else {
                if (r47.W3(rw2Var.W) && !yac.h(k5.a(rw2Var.r).a).p()) {
                    if (rw2Var.O == null) {
                        nk8 nk8Var = new nk8(rw2Var.z.getContext(), rw2Var.c0);
                        rw2Var.O = nk8Var;
                        rw2Var.z.addView(nk8Var, tre.c(-1.0f, -1));
                        rw2Var.O.setOnClickListener(new ew2(rw2Var, b3));
                        z2 = true;
                        rw2Var.O.b.w.setOnClickListener(new ew2(rw2Var, 1 == true ? 1 : 0));
                    } else {
                        z2 = true;
                    }
                    hl.T3(rw2Var.O, false, 1.0f, z2, false);
                    hl.R3(rw2Var.O, z2);
                    rw2Var.O.setTranslationY(0.0f);
                    rw2Var.K = true;
                    rw2Var.z.invalidate();
                    try {
                        rw2Var.z.performHapticFeedback(0);
                        return;
                    } catch (Exception unused4) {
                        return;
                    }
                }
                boolean C02 = ls6.d0(rw2Var.r).C0(rw2Var.W);
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                pw2 pw2Var9 = rw2Var.l;
                if (pw2Var9 != null) {
                    if (pw2Var9.j(rw2Var.V) && !rw2Var.l.c()) {
                        c00.t(null, 2131745316, arrayList11, arrayList13, valueOf4);
                        arrayList12.add(0);
                    }
                    if (!rw2Var.l.j(rw2Var.V) || rw2Var.l.c()) {
                        str = null;
                    } else {
                        str = null;
                        c00.t(null, 2131745311, arrayList11, arrayList13, valueOf3);
                        arrayList12.add(6);
                    }
                    if (rw2Var.l.b()) {
                        c00.t(str, 2131745588, arrayList11, arrayList13, valueOf2);
                        arrayList12.add(3);
                    }
                    if (rw2Var.l.f()) {
                        c00.t(str, 2131748981, arrayList11, arrayList13, valueOf5);
                        arrayList12.add(5);
                    }
                }
                if (!r47.E3(rw2Var.W)) {
                    if (!C02) {
                        i4 = (ls6.d0(rw2Var.r).u() && r47.u4(rw2Var.W)) ? 2131754367 : 2131751503;
                    }
                    arrayList11.add(ob6.M0(i4, null));
                    arrayList13.add(Integer.valueOf(C02 ? R.drawable.msg_unfave : R.drawable.msg_fave));
                    arrayList12.add(2);
                }
                pw2 pw2Var10 = rw2Var.l;
                if (pw2Var10 != null && (inputStickerSet = rw2Var.a0) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty) && pw2Var10.T()) {
                    arrayList11.add(ob6.a0(null, null, 2131743200, new Object[0]));
                    arrayList13.add(Integer.valueOf(R.drawable.msg_media));
                    arrayList12.add(1);
                }
                if (rw2Var.p) {
                    c00.t(null, 2131751502, arrayList11, arrayList13, valueOf5);
                    arrayList12.add(4);
                }
                if (rw2Var.a0 != null && rw2Var.W != null) {
                    TLRPC.TL_messages_stickerSet n0 = ls6.d0(rw2Var.r).n0(rw2Var.a0, true);
                    if (n0 != null && (pw2Var2 = rw2Var.l) != null && pw2Var2.A()) {
                        TLRPC.StickerSet stickerSet = n0.set;
                        if (!stickerSet.emojis && !stickerSet.masks) {
                            c00.s(null, 2131751188, arrayList11, R.drawable.msg_edit, arrayList13);
                            arrayList12.add(7);
                        }
                    }
                    if (n0 != null && n0.set.creator && (pw2Var = rw2Var.l) != null && pw2Var.H()) {
                        c00.t(null, 2131751460, arrayList11, arrayList13, valueOf5);
                        arrayList12.add(8);
                    }
                }
                if (arrayList11.isEmpty()) {
                    return;
                }
                rw2Var.K = true;
                rw2Var.z.invalidate();
                jw2 jw2Var = new jw2(this, arrayList12, C02);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                rw2Var.a(actionBarPopupWindow$ActionBarPopupWindowLayout5);
                int i14 = 0;
                while (i14 < arrayList11.size()) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout5;
                    b8 c5 = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout6, ((Integer) arrayList13.get(i14)).intValue(), (CharSequence) arrayList11.get(i14), false, rw2Var.c0);
                    c5.setTag(Integer.valueOf(i14));
                    c5.setOnClickListener(jw2Var);
                    if (((Integer) arrayList12.get(i14)).intValue() == 8) {
                        int i15 = aob.q7;
                        c5.c(i15, i15);
                        c5.h(0.1f, i15);
                    }
                    i14++;
                    actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout6;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout5;
                kw2 kw2Var = new kw2(this, actionBarPopupWindow$ActionBarPopupWindowLayout7);
                rw2Var.k = kw2Var;
                kw2Var.e = true;
                kw2Var.c = (short) 100;
                kw2Var.g = true;
                kw2Var.setOutsideTouchable(true);
                rw2Var.k.setClippingEnabled(true);
                rw2Var.k.setAnimationStyle(R.style.PopupContextAnimation);
                rw2Var.k.setFocusable(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout7.measure(View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31));
                rw2Var.k.setInputMethodMode(2);
                rw2Var.k.getContentView().setFocusableInTouchMode(true);
                mq5 mq5Var5 = rw2Var.q;
                int i16 = mq5Var5.d + mq5Var5.b;
                if (rw2Var.V == 1) {
                    min = Math.min(rw2Var.z.getWidth(), rw2Var.z.getHeight() - i16) - hl.L(40.0f);
                } else {
                    boolean z4 = rw2Var.S;
                    tt ttVar = rw2Var.z;
                    min = (int) (z4 ? Math.min(ttVar.getWidth(), rw2Var.z.getHeight() - i16) - hl.N(40.0f) : Math.min(ttVar.getWidth(), rw2Var.z.getHeight() - i16) / 1.8f);
                }
                int L4 = hl.L(24.0f) + ((int) (rw2Var.e + Math.max(r0 + r2 + (rw2Var.G != null ? hl.L(40.0f) : 0), ((rw2Var.z.getHeight() - i16) - rw2Var.I) / 2) + (min / 2)));
                if (rw2Var.S) {
                    L4 += hl.L(24.0f);
                }
                rw2Var.k.showAtLocation(rw2Var.z, 0, (int) ((r2.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout7.getMeasuredWidth()) / 2.0f), L4);
                try {
                    rw2Var.z.performHapticFeedback(0);
                } catch (Exception unused5) {
                }
                i3 = 0;
                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout7;
            }
            i5 = i3;
            while (i5 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i5);
                if (childAt instanceof b8) {
                    ((b8) childAt).n(i5 == 0 ? 1 : i3, i5 == actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() + (-1) ? 1 : i3);
                }
                i5++;
            }
        }
        i = 1;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout22 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i, rw2Var.c0, rw2Var.z.getContext());
        vnb vnbVar2 = null;
        jl0 c6 = ll0Var.c(actionBarPopupWindow$ActionBarPopupWindowLayout22, null, true);
        c6.p(dtd.k(rw2Var.c0));
        ik8.r(c6, hl.L(12.0f), 8.0f);
        c6.S.e = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout22.setBackground(c6);
        i2 = rw2Var.V;
        if (i2 != 3) {
        }
        i5 = i3;
        while (i5 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
        }
    }
}
