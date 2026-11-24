// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.l;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class fv1 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ fv1(ChatActivityEnterView chatActivityEnterView, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r1v116, types: [fu, o39] */
    /* JADX WARN: Type inference failed for: r1v147, types: [hy1] */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v51, types: [cja] */
    /* JADX WARN: Type inference failed for: r6v7, types: [org.telegram.tgnet.TLRPC$ChatFull] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.Peer peer;
        int i;
        int i2;
        byte b;
        ?? r18;
        wx1 wx1Var;
        ex1 ex1Var;
        ChatActivityEnterView.RecordCircle recordCircle;
        i29 i29Var;
        ry8 ry8Var;
        int i3;
        int i4;
        int i5;
        float f;
        hy1 hy1Var;
        ?? r3;
        byte b2 = 27;
        byte b3 = 3;
        int i6 = 0;
        r4 = false;
        boolean z = false;
        r4 = false;
        boolean z2 = false;
        byte b4 = 1;
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.b;
                int i7 = ChatActivityEnterView.r7;
                gb gbVar = chatActivityEnterView.V;
                if ((gbVar == null || !gbVar.f) && chatActivityEnterView.G != 0.0f) {
                    chatActivityEnterView.P3.I0();
                    break;
                }
                break;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                int i8 = ChatActivityEnterView.r7;
                gb gbVar2 = chatActivityEnterView2.V;
                if ((gbVar2 == null || !gbVar2.f) && chatActivityEnterView2.G != 0.0f) {
                    chatActivityEnterView2.P3.s1();
                    break;
                }
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                int i9 = ChatActivityEnterView.r7;
                mu1 mu1Var = chatActivityEnterView3.F3;
                if (!chatActivityEnterView3.o7 ? chatActivityEnterView3.getTranslationY() == 0.0f : !chatActivityEnterView3.Q0()) {
                    byte b5 = 7;
                    if (chatActivityEnterView3.P3.h() > gl.L(20.0f)) {
                        int o0 = chatActivityEnterView3.P3.o0();
                        int h = chatActivityEnterView3.P3.h();
                        if (h <= gl.L(20.0f)) {
                            o0 += h;
                        }
                        if (chatActivityEnterView3.X0) {
                            o0 -= chatActivityEnterView3.getEmojiPadding();
                        }
                        if (o0 < gl.L(200.0f)) {
                            chatActivityEnterView3.v0 = new av1(chatActivityEnterView3, b5);
                            chatActivityEnterView3.S();
                            break;
                        }
                    }
                    if (chatActivityEnterView3.P3.v() != null) {
                        try {
                            view.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        uw1 uw1Var = chatActivityEnterView3.r0;
                        if (uw1Var != null) {
                            uw1Var.e = false;
                            uw1Var.l(new yla[0]);
                            break;
                        } else {
                            na7 q1 = na7.q1(chatActivityEnterView3.R);
                            if (chatActivityEnterView3.o7) {
                                peer = chatActivityEnterView3.P3.i();
                            } else {
                                na7.q1(chatActivityEnterView3.R).K0(Long.valueOf(-chatActivityEnterView3.G3));
                                ?? L0 = na7.q1(chatActivityEnterView3.R).L0(-chatActivityEnterView3.G3);
                                r9 = L0;
                                peer = L0 != 0 ? L0.default_send_as : null;
                            }
                            if (peer == null && chatActivityEnterView3.P3.v() != null && !chatActivityEnterView3.P3.v().peers.isEmpty()) {
                                peer = chatActivityEnterView3.P3.v().peers.get(0).peer;
                            }
                            TLRPC.Peer peer2 = peer;
                            boolean V = hc2.V(q1.K0(Long.valueOf(-chatActivityEnterView3.G3)));
                            if (chatActivityEnterView3.o7) {
                            } else {
                                mu1Var.getParentLayout().getOverlayContainerView();
                            }
                            uw1 uw1Var2 = new uw1(chatActivityEnterView3, chatActivityEnterView3.getContext(), chatActivityEnterView3.F3, q1, V, peer2, chatActivityEnterView3.P3.v(), new ie((Object) chatActivityEnterView3, (Object) r9, (Object) q1, (byte) 19), chatActivityEnterView3.L4);
                            chatActivityEnterView3.r0 = uw1Var2;
                            uw1Var2.e = true;
                            uw1Var2.c = (short) 220;
                            uw1Var2.setOutsideTouchable(true);
                            chatActivityEnterView3.r0.setClippingEnabled(true);
                            chatActivityEnterView3.r0.setFocusable(true);
                            chatActivityEnterView3.r0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31));
                            chatActivityEnterView3.r0.setInputMethodMode(2);
                            chatActivityEnterView3.r0.setSoftInputMode(0);
                            chatActivityEnterView3.r0.getContentView().setFocusableInTouchMode(true);
                            chatActivityEnterView3.r0.b = false;
                            int i10 = -gl.L(4.0f);
                            int[] iArr = new int[2];
                            if (!gl.O1() || mu1Var == null) {
                                i = i10;
                            } else {
                                mu1Var.getFragmentView().getLocationInWindow(iArr);
                                i = iArr[0] + i10;
                            }
                            int o02 = chatActivityEnterView3.P3.o0();
                            int measuredHeight = chatActivityEnterView3.r0.getContentView().getMeasuredHeight();
                            int h2 = chatActivityEnterView3.P3.h();
                            if (h2 <= gl.L(20.0f)) {
                                o02 += h2;
                            }
                            if (chatActivityEnterView3.X0) {
                                o02 -= chatActivityEnterView3.getEmojiPadding();
                            }
                            if (measuredHeight < (((i10 << 1) + o02) - ((mu1Var == null || !mu1Var.isInBubbleMode()) ? gl.m : 0)) - chatActivityEnterView3.r0.p.getMeasuredHeight()) {
                                chatActivityEnterView3.getLocationInWindow(iArr);
                                i2 = ((iArr[1] - measuredHeight) - i10) - gl.L(2.0f);
                            } else {
                                i2 = (mu1Var == null || !mu1Var.isInBubbleMode()) ? gl.m : 0;
                                chatActivityEnterView3.r0.o.getLayoutParams().height = ((o02 - i2) - gl.L(14.0f)) - chatActivityEnterView3.getHeightWithTopView();
                            }
                            final uw1 uw1Var3 = chatActivityEnterView3.r0;
                            View view2 = uw1Var3.u;
                            o39 o39Var = uw1Var3.v;
                            TLRPC.Peer peer3 = uw1Var3.r;
                            d4a d4aVar = uw1Var3.o;
                            oc6 oc6Var = uw1Var3.t;
                            ArrayList arrayList = uw1Var3.z;
                            int size = arrayList.size();
                            int i11 = 0;
                            while (i11 < size) {
                                Object obj = arrayList.get(i11);
                                i11++;
                                ((yla) obj).d();
                            }
                            arrayList.clear();
                            oc6Var.setPivotX(gl.L(8.0f));
                            oc6Var.setPivotY(oc6Var.getMeasuredHeight() - gl.L(8.0f));
                            d4aVar.setPivotX(0.0f);
                            d4aVar.setPivotY(0.0f);
                            ArrayList<TLRPC.TL_sendAsPeer> arrayList2 = uw1Var3.s.peers;
                            if (peer3 != null) {
                                int L = gl.L(54.0f);
                                r18 = 3;
                                int size2 = arrayList2.size() * L;
                                b = 1;
                                int i12 = 0;
                                while (i12 < arrayList2.size()) {
                                    TLRPC.Peer peer4 = arrayList2.get(i12).peer;
                                    View view3 = view2;
                                    o39 o39Var2 = o39Var;
                                    long j = peer4.channel_id;
                                    if (j == 0 || j != peer3.channel_id) {
                                        long j2 = peer4.user_id;
                                        if (j2 == 0 || j2 != peer3.user_id) {
                                            long j3 = peer4.chat_id;
                                            if (j3 == 0 || j3 != peer3.chat_id) {
                                                i12++;
                                                view2 = view3;
                                                o39Var = o39Var2;
                                            }
                                        }
                                    }
                                    uw1Var3.w.g1(i12, (size2 - ((arrayList2.size() - 2) * L)) + gl.L(7.0f) + ((i12 == arrayList2.size() + (-1) || o39Var2.getMeasuredHeight() >= size2) ? 0 : o39Var2.getMeasuredHeight() % L));
                                    if (o39Var2.computeVerticalScrollOffset() > 0) {
                                        view3.animate().cancel();
                                        view3.animate().alpha(1.0f).setDuration(150L).start();
                                    }
                                }
                            } else {
                                b = 1;
                                r18 = 3;
                            }
                            oc6Var.setScaleX(0.25f);
                            oc6Var.setScaleY(0.25f);
                            d4aVar.setAlpha(0.25f);
                            yla ylaVar = new yla(oc6Var, yla.q);
                            ylaVar.m = oo1.j(1.0f, 750.0f, 1.0f);
                            final byte b6 = 0;
                            ylaVar.b(new yr3() { // from class: b4a
                                @Override // yr3
                                public final void a(yla ylaVar2, float f2, float f3) {
                                    byte b7 = b6;
                                    uw1 uw1Var4 = uw1Var3;
                                    switch (b7) {
                                        case 0:
                                            uw1Var4.o.setScaleX(1.0f / f2);
                                            break;
                                        default:
                                            uw1Var4.o.setScaleY(1.0f / f2);
                                            break;
                                    }
                                }
                            });
                            yla ylaVar2 = new yla(oc6Var, yla.r);
                            ylaVar2.m = oo1.j(1.0f, 750.0f, 1.0f);
                            final byte b7 = b;
                            ylaVar2.b(new yr3() { // from class: b4a
                                @Override // yr3
                                public final void a(yla ylaVar22, float f2, float f3) {
                                    byte b72 = b7;
                                    uw1 uw1Var4 = uw1Var3;
                                    switch (b72) {
                                        case 0:
                                            uw1Var4.o.setScaleX(1.0f / f2);
                                            break;
                                        default:
                                            uw1Var4.o.setScaleY(1.0f / f2);
                                            break;
                                    }
                                }
                            });
                            wr3 wr3Var = yla.v;
                            yla ylaVar3 = new yla(oc6Var, wr3Var);
                            ylaVar3.m = oo1.j(1.0f, 750.0f, 1.0f);
                            yla ylaVar4 = new yla(d4aVar, wr3Var);
                            ylaVar4.m = oo1.j(1.0f, 750.0f, 1.0f);
                            yla[] ylaVarArr = new yla[4];
                            ylaVarArr[0] = ylaVar;
                            ylaVarArr[1] = ylaVar2;
                            ylaVarArr[2] = ylaVar3;
                            ylaVarArr[r18] = ylaVar4;
                            for (yla ylaVar5 : Arrays.asList(ylaVarArr)) {
                                arrayList.add(ylaVar5);
                                ylaVar5.a(new o11(uw1Var3, ylaVar5, (byte) 7));
                                ylaVar5.h();
                            }
                            uw1 uw1Var4 = chatActivityEnterView3.r0;
                            chatActivityEnterView3.t0 = i;
                            chatActivityEnterView3.u0 = i2;
                            uw1Var4.showAtLocation(view, 51, i, i2);
                            chatActivityEnterView3.q0.setProgress(1.0f);
                            break;
                        }
                    }
                } else {
                    chatActivityEnterView3.s0 = new av1(chatActivityEnterView3, (byte) 6);
                    if (chatActivityEnterView3.o7) {
                        chatActivityEnterView3.K0(true, false, true);
                        break;
                    } else {
                        chatActivityEnterView3.K0(true, true, true);
                        break;
                    }
                }
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView4 = this.b;
                int i13 = ChatActivityEnterView.r7;
                chatActivityEnterView4.j1();
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView5 = this.b;
                int i14 = ChatActivityEnterView.r7;
                ex1 ex1Var2 = chatActivityEnterView5.F0;
                String obj2 = ex1Var2 != null ? ex1Var2.getText().toString() : "";
                int indexOf = obj2.indexOf(32);
                if (indexOf != -1 && indexOf != obj2.length() - 1) {
                    chatActivityEnterView5.setFieldText(obj2.substring(0, indexOf + 1));
                    break;
                } else {
                    chatActivityEnterView5.setFieldText("");
                    break;
                }
                break;
            case 5:
                ChatActivityEnterView chatActivityEnterView6 = this.b;
                int i15 = ChatActivityEnterView.r7;
                j47 j47Var = chatActivityEnterView6.M0;
                if (j47Var == null || j47Var.u0) {
                    AnimatorSet animatorSet = chatActivityEnterView6.j3;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView6.g0 == null) {
                        chatActivityEnterView6.u1();
                        break;
                    }
                }
                break;
            case 6:
                ChatActivityEnterView chatActivityEnterView7 = this.b;
                int i16 = ChatActivityEnterView.r7;
                hy1 hy1Var2 = chatActivityEnterView7.P3;
                if (hy1Var2 != null) {
                    hy1Var2.U();
                    break;
                }
                break;
            case 7:
                ChatActivityEnterView chatActivityEnterView8 = this.b;
                int i17 = ChatActivityEnterView.r7;
                if (chatActivityEnterView8.R2 != null) {
                    if (chatActivityEnterView8.d0 - chatActivityEnterView8.e0 >= 0) {
                        cy1 B = chatActivityEnterView8.B();
                        chatActivityEnterView8.S2 = B;
                        j41 d = j41.d(chatActivityEnterView8.R);
                        String str = chatActivityEnterView8.R2.link;
                        String str2 = B.a;
                        ArrayList<TLRPC.MessageEntity> arrayList3 = B.b;
                        av1 av1Var = new av1(chatActivityEnterView8, (byte) 29);
                        TL_account.TL_businessChatLink c = d.c(str);
                        if (c != null) {
                            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                            tL_inputBusinessChatLink.message = str2;
                            tL_inputBusinessChatLink.entities = arrayList3;
                            tL_inputBusinessChatLink.title = c.title;
                            d.b(c, tL_inputBusinessChatLink, av1Var);
                            break;
                        }
                    } else {
                        NumberTextView numberTextView = chatActivityEnterView8.c0;
                        if (numberTextView != null) {
                            gl.A3(3.5f, numberTextView, null);
                            try {
                                chatActivityEnterView8.c0.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused2) {
                                return;
                            }
                        }
                    }
                }
                break;
            case 8:
                ChatActivityEnterView chatActivityEnterView9 = this.b;
                int i18 = ChatActivityEnterView.r7;
                if (chatActivityEnterView9.T0.getVisibility() == 0 && chatActivityEnterView9.T0.getAlpha() == 1.0f && !chatActivityEnterView9.a4) {
                    if (!chatActivityEnterView9.p3 || (ex1Var = chatActivityEnterView9.F0) == null || !ex1Var.isFocused()) {
                        if (chatActivityEnterView9.p4) {
                            if (chatActivityEnterView9.H2 != 0) {
                                chatActivityEnterView9.O1(0, true);
                                chatActivityEnterView9.V0.s(true);
                                chatActivityEnterView9.V0.z();
                                if (chatActivityEnterView9.o4) {
                                    chatActivityEnterView9.N(true);
                                }
                            } else if (!chatActivityEnterView9.u4 && (wx1Var = chatActivityEnterView9.V0) != null) {
                                wx1Var.O(false);
                            }
                        } else if (!chatActivityEnterView9.u4) {
                            chatActivityEnterView9.V0.O(true);
                        }
                        if (!chatActivityEnterView9.u4) {
                            chatActivityEnterView9.P1(!chatActivityEnterView9.p4, true, false, true);
                            break;
                        }
                    }
                }
                break;
            case 9:
                ChatActivityEnterView chatActivityEnterView10 = this.b;
                int i19 = ChatActivityEnterView.r7;
                if (chatActivityEnterView10.g0() && chatActivityEnterView10.v3 && (recordCircle = chatActivityEnterView10.D2) != null && ChatActivityEnterView.this.h5) {
                    chatActivityEnterView10.m0(false, false);
                    jm3 jm3Var = chatActivityEnterView10.j1;
                    if (jm3Var == null || !jm3Var.q()) {
                        jm3 jm3Var2 = chatActivityEnterView10.j1;
                        if (jm3Var2 != null && jm3Var2.p()) {
                            ex1 ex1Var3 = chatActivityEnterView10.F0;
                            if (ex1Var3 != null) {
                                ex1Var3.setText("");
                            }
                            chatActivityEnterView10.j1.m();
                        }
                    } else {
                        jm3 jm3Var3 = chatActivityEnterView10.j1;
                        if (jm3Var3.o0 && jm3Var3.q()) {
                            jm3Var3.t();
                        }
                    }
                    if (chatActivityEnterView10.v3) {
                        chatActivityEnterView10.v3 = false;
                        chatActivityEnterView10.Y1 = 0L;
                        chatActivityEnterView10.r2(2, true);
                        break;
                    }
                }
                break;
            case 10:
                ChatActivityEnterView chatActivityEnterView11 = this.b;
                int i20 = ChatActivityEnterView.r7;
                AnimatorSet animatorSet2 = chatActivityEnterView11.j3;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    int[] iArr2 = chatActivityEnterView11.S1;
                    int[] iArr3 = chatActivityEnterView11.R1;
                    if (!chatActivityEnterView11.K1 || chatActivityEnterView11.U1 || (i29Var = chatActivityEnterView11.i1) == null || chatActivityEnterView11.R3 == null || i29Var.getVisibility() != 0 || chatActivityEnterView11.i1.getWidth() <= 0 || (ry8Var = chatActivityEnterView11.h1) == null) {
                        chatActivityEnterView11.r1();
                        break;
                    } else if (chatActivityEnterView11.i1.T0 == null) {
                        ry8Var.getLocationInWindow(iArr3);
                        chatActivityEnterView11.i1.getLocationInWindow(iArr2);
                        float width = (chatActivityEnterView11.h1.getWidth() / 2.0f) + (iArr3[0] - iArr2[0]);
                        float height = ((chatActivityEnterView11.h1.getHeight() / 2.0f) + (iArr3[1] - iArr2[1])) - gl.L(3.0f);
                        TLRPC.TL_document tL_document = chatActivityEnterView11.R3;
                        chatActivityEnterView11.y5 = null;
                        gl.d3(new aj1(chatActivityEnterView11, tL_document, b2), 100L);
                        try {
                            chatActivityEnterView11.h1.performHapticFeedback(3, 2);
                        } catch (Exception unused3) {
                        }
                        l lVar = chatActivityEnterView11.E2;
                        if (lVar != null) {
                            lVar.invalidate();
                        }
                        chatActivityEnterView11.D5 = 0.0f;
                        chatActivityEnterView11.C5 = 0.0f;
                        ValueAnimator valueAnimator = chatActivityEnterView11.B5;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        chatActivityEnterView11.B5 = ofFloat;
                        ofFloat.setDuration(160L);
                        chatActivityEnterView11.B5.setInterpolator(s33.g);
                        chatActivityEnterView11.B5.addUpdateListener(new pv1(chatActivityEnterView11, (byte) 9));
                        chatActivityEnterView11.B5.start();
                        i29 i29Var2 = chatActivityEnterView11.i1;
                        jw1 jw1Var = new jw1(chatActivityEnterView11);
                        kra kraVar = i29Var2.J0;
                        RectF rectF = i29Var2.f0;
                        if (i29Var2.T0 == null && !i29Var2.X0) {
                            int width2 = i29Var2.getWidth();
                            int height2 = i29Var2.getHeight();
                            if (!i29Var2.d0 || width2 <= 0 || height2 <= 0) {
                                jw1Var.a();
                                break;
                            } else {
                                i29Var2.setPlaying(false);
                                i29Var2.p0 = false;
                                i29Var2.W = false;
                                try {
                                    Bitmap createBitmap = Bitmap.createBitmap(width2, height2, Bitmap.Config.ARGB_8888);
                                    float f2 = width2;
                                    rectF.set(0.0f, 0.0f, f2, height2);
                                    i29Var2.b(new Canvas(createBitmap), rectF, 1.0f);
                                    int[] iArr4 = new int[width2 * height2];
                                    createBitmap.getPixels(iArr4, 0, width2, 0, 0, width2, height2);
                                    int i21 = width2;
                                    int i22 = height2;
                                    i29Var2.a1 = i29Var2.f();
                                    i29Var2.Z0 = width < f2 / 2.0f;
                                    int max = Math.max(1, Math.round(gl.p * 0.75f));
                                    int i23 = 0;
                                    for (int i24 = 0; i24 < i22; i24 += max) {
                                        for (int i25 = 0; i25 < i21; i25 += max) {
                                            int i26 = iArr4[(i24 * i21) + i25];
                                            int i27 = i6;
                                            if ((i26 >>> 24) > 60) {
                                                if (i29Var2.e(i26)) {
                                                    i23++;
                                                } else {
                                                    i6 = i27 + 1;
                                                }
                                            }
                                            i6 = i27;
                                        }
                                    }
                                    float f3 = i23 > 1100 ? 1100.0f / i23 : 1.0f;
                                    float min = i6 > 0 ? Math.min(1.0f, 360.0f / i6) : 0.0f;
                                    kraVar.a();
                                    kraVar.S = 0.0f;
                                    kraVar.R = 0.0f;
                                    kraVar.e(i29Var2.a1);
                                    float f4 = gl.p;
                                    int i28 = 0;
                                    int i29 = 0;
                                    int i30 = 0;
                                    while (i28 < i22) {
                                        int i31 = 0;
                                        while (i31 < i21) {
                                            int i32 = i21;
                                            int i33 = iArr4[(i28 * i21) + i31];
                                            float f5 = f3;
                                            int i34 = i22;
                                            if ((i33 >>> 24) > 60) {
                                                i30++;
                                                int i35 = i30 * 7;
                                                if (i29.c(i35 + 3) <= (i29Var2.e(i33) ? f5 : min)) {
                                                    float f6 = i29Var2.Z0 ? i31 / f2 : 1.0f - (i31 / f2);
                                                    float c2 = (((i29.c(i35 + 13) * 0.04f) + (0.42f * f6)) * 760.0f) / 1000.0f;
                                                    float c3 = i29.c(i35 + 11);
                                                    float c4 = i29.c(i35 + 12);
                                                    float f7 = i31;
                                                    float f8 = c3 - 0.5f;
                                                    i4 = i31;
                                                    float f9 = max;
                                                    float f10 = (f8 * f9) + f7;
                                                    i5 = max;
                                                    float f11 = i28;
                                                    i3 = i28;
                                                    float f12 = c4 - 0.5f;
                                                    float f13 = (f12 * f9) + f11;
                                                    f = min;
                                                    i29Var2.J0.i(f10, f13, oo1.g(c3, 0.25f, 0.25f, width - f10, f10), Math.min(f13, height) - (((i29.c(i35 + 14) * 9.0f) + 3.0f) * f4), b00.w(f12, 4.0f, f4, width), b00.w(f8, 4.0f, f4, height), yjb.z(f6, 0.3f, 0.8f, (i29.c(i35 + 15) * 0.2f) + 0.45f), c2);
                                                    i29++;
                                                    i31 = i4 + i5;
                                                    f3 = f5;
                                                    min = f;
                                                    i21 = i32;
                                                    max = i5;
                                                    i22 = i34;
                                                    i28 = i3;
                                                }
                                            }
                                            i3 = i28;
                                            i4 = i31;
                                            i5 = max;
                                            f = min;
                                            i31 = i4 + i5;
                                            f3 = f5;
                                            min = f;
                                            i21 = i32;
                                            max = i5;
                                            i22 = i34;
                                            i28 = i3;
                                        }
                                        i28 += max;
                                    }
                                    i29Var2.T0 = createBitmap;
                                    i29Var2.U0 = i29;
                                    i29Var2.W0 = jw1Var;
                                    i29Var2.V0 = SystemClock.uptimeMillis();
                                    i29Var2.invalidate();
                                    break;
                                } catch (Throwable unused4) {
                                    jw1Var.a();
                                    return;
                                }
                            }
                        }
                    }
                }
                break;
            case 11:
                ChatActivityEnterView chatActivityEnterView12 = this.b;
                int i36 = ChatActivityEnterView.r7;
                ep0 ep0Var = chatActivityEnterView12.m0;
                boolean z3 = ep0Var.w;
                ep0Var.setOpened(!z3);
                try {
                    chatActivityEnterView12.performHapticFeedback(3, 2);
                } catch (Exception unused5) {
                }
                if (chatActivityEnterView12.G0()) {
                    if (!z3) {
                        if (!chatActivityEnterView12.X0 && !chatActivityEnterView12.Y0) {
                            chatActivityEnterView12.l1();
                            break;
                        } else {
                            gl.d3(new av1(chatActivityEnterView12, b2), 275L);
                            chatActivityEnterView12.J0(false);
                            break;
                        }
                    }
                } else {
                    cx1 cx1Var = chatActivityEnterView12.n0;
                    if (z3) {
                        if (cx1Var != null) {
                            cx1Var.c();
                            break;
                        }
                    } else {
                        if (cx1Var == null) {
                            cx1 cx1Var2 = new cx1(chatActivityEnterView12, chatActivityEnterView12.getContext());
                            chatActivityEnterView12.n0 = cx1Var2;
                            fu fuVar = cx1Var2.c;
                            chatActivityEnterView12.getContext();
                            fuVar.setLayoutManager(new t26());
                            ?? r1 = chatActivityEnterView12.n0.c;
                            dp0 dp0Var = new dp0();
                            dp0Var.c = new ArrayList();
                            dp0Var.d = new ArrayList();
                            dp0Var.e = new ArrayList();
                            chatActivityEnterView12.o0 = dp0Var;
                            r1.setAdapter(dp0Var);
                            chatActivityEnterView12.n0.c.setOnItemClickListener(new dx1(chatActivityEnterView12));
                            chatActivityEnterView12.n0.c.setOnItemLongClickListener(new iw1(chatActivityEnterView12, (byte) 2));
                            chatActivityEnterView12.n0.setClipToPadding(false);
                            chatActivityEnterView12.c2.addView(chatActivityEnterView12.n0, nme.e(-1, -1, 80));
                            chatActivityEnterView12.n0.setVisibility(8);
                            vf6 vf6Var = chatActivityEnterView12.X6;
                            if (vf6Var != null) {
                                chatActivityEnterView12.o0.E(vf6Var);
                            }
                            chatActivityEnterView12.i2();
                        }
                        cx1 cx1Var3 = chatActivityEnterView12.n0;
                        if (cx1Var3.getVisibility() != 0) {
                            cx1Var3.setVisibility(0);
                            cx1Var3.c.w0(0);
                            cx1Var3.n = true;
                            cx1Var3.f = false;
                            break;
                        } else if (cx1Var3.f) {
                            cx1Var3.f = false;
                            cx1Var3.a();
                            cx1Var3.d(false);
                            break;
                        }
                    }
                }
                break;
            case 12:
                ChatActivityEnterView chatActivityEnterView13 = this.b;
                int i37 = ChatActivityEnterView.r7;
                if (chatActivityEnterView13.q7 == 3 && (hy1Var = chatActivityEnterView13.P3) != null) {
                    hy1Var.R0();
                    break;
                }
                break;
            case 13:
                ChatActivityEnterView chatActivityEnterView14 = this.b;
                int i38 = ChatActivityEnterView.r7;
                SharedPreferences.Editor edit = na7.q1(chatActivityEnterView14.R).X3.edit();
                if (oj0.d(chatActivityEnterView14.F3.s8)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + chatActivityEnterView14.F3.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + chatActivityEnterView14.F3.a(), false);
                }
                if (na7.q1(chatActivityEnterView14.R).k4.C0.f && na7.q1(chatActivityEnterView14.R).k4.B0.f) {
                    edit.putBoolean("show_gift_for_" + chatActivityEnterView14.F3.a(), false);
                }
                edit.apply();
                TLRPC.UserFull W1 = na7.q1(chatActivityEnterView14.R).W1(y6c.h(chatActivityEnterView14.R).e());
                if ((chatActivityEnterView14.getParentFragment().s8 == null || !chatActivityEnterView14.getParentFragment().s8.display_gifts_button) && (W1 == null || !W1.display_gifts_button)) {
                    gl.R3(chatActivityEnterView14.A2, false);
                }
                TLRPC.User h3 = chatActivityEnterView14.getParentFragment().h();
                if (h3 != null) {
                    if (chatActivityEnterView14.getParentFragment().s8 != null && oj0.e(chatActivityEnterView14.getParentFragment().s8.birthday)) {
                        z2 = true;
                    }
                    hd hdVar = new hd(3, null, chatActivityEnterView14.getContext());
                    hdVar.q(200L);
                    hdVar.setOnCancelListener(new xs0(chatActivityEnterView14, on0.l(chatActivityEnterView14.R, null, new gv1(chatActivityEnterView14, hdVar, h3, z2)), b3));
                    break;
                }
                break;
            case 14:
                ChatActivityEnterView chatActivityEnterView15 = this.b;
                int i39 = ChatActivityEnterView.r7;
                chatActivityEnterView15.j1();
                break;
            case 15:
                ChatActivityEnterView chatActivityEnterView16 = this.b;
                int i40 = ChatActivityEnterView.r7;
                hy1 hy1Var3 = chatActivityEnterView16.P3;
                if (hy1Var3 != null && !hy1Var3.g()) {
                    ?? r12 = chatActivityEnterView16.P3;
                    ly1 ly1Var = chatActivityEnterView16.G0;
                    r12.O0(ly1Var, ((jia) ly1Var.c).getText(), true);
                    break;
                }
                break;
            case 16:
                ChatActivityEnterView chatActivityEnterView17 = this.b;
                int i41 = ChatActivityEnterView.r7;
                zw1 zw1Var = chatActivityEnterView17.O0;
                if (zw1Var != null && zw1Var.isShowing()) {
                    chatActivityEnterView17.O0.dismiss();
                }
                ij.J(chatActivityEnterView17.E3, chatActivityEnterView17.F3.a(), new sw1(chatActivityEnterView17), chatActivityEnterView17.L4);
                break;
            case 17:
                ChatActivityEnterView chatActivityEnterView18 = this.b;
                int i42 = ChatActivityEnterView.r7;
                zw1 zw1Var2 = chatActivityEnterView18.O0;
                if (zw1Var2 != null && zw1Var2.isShowing()) {
                    chatActivityEnterView18.O0.dismiss();
                }
                chatActivityEnterView18.v1(true, 2147483646, 0, 0L, true);
                break;
            case 18:
                ChatActivityEnterView chatActivityEnterView19 = this.b;
                int i43 = ChatActivityEnterView.r7;
                zw1 zw1Var3 = chatActivityEnterView19.O0;
                if (zw1Var3 != null && zw1Var3.isShowing()) {
                    chatActivityEnterView19.O0.dismiss();
                }
                chatActivityEnterView19.v1(false, 0, 0, 0L, true);
                break;
            case 19:
                ChatActivityEnterView chatActivityEnterView20 = this.b;
                int i44 = ChatActivityEnterView.r7;
                if (chatActivityEnterView20.H2 != 0) {
                    chatActivityEnterView20.O1(0, false);
                    chatActivityEnterView20.V0.s(false);
                    ex1 ex1Var4 = chatActivityEnterView20.F0;
                    if (ex1Var4 != null) {
                        ex1Var4.requestFocus();
                    }
                }
                if (chatActivityEnterView20.d3 != null) {
                    if (!chatActivityEnterView20.Q0() || chatActivityEnterView20.V2 != 1) {
                        chatActivityEnterView20.W1(1, 1, true, true);
                    } else if (chatActivityEnterView20.Q0() && chatActivityEnterView20.V2 == 1) {
                        chatActivityEnterView20.W1(0, 1, true, false);
                    }
                } else if (chatActivityEnterView20.f3) {
                    chatActivityEnterView20.setFieldText("/");
                    ex1 ex1Var5 = chatActivityEnterView20.F0;
                    if (ex1Var5 != null) {
                        ex1Var5.requestFocus();
                    }
                    chatActivityEnterView20.h1();
                }
                if (chatActivityEnterView20.p4) {
                    chatActivityEnterView20.P1(false, false, false, true);
                    break;
                }
                break;
            case 20:
                ChatActivityEnterView chatActivityEnterView21 = this.b;
                int i45 = ChatActivityEnterView.r7;
                chatActivityEnterView21.t0();
                break;
            default:
                ChatActivityEnterView chatActivityEnterView22 = this.b;
                int i46 = ChatActivityEnterView.r7;
                mu1 mu1Var2 = chatActivityEnterView22.F3;
                ew1 ew1Var = chatActivityEnterView22.R0;
                if (chatActivityEnterView22.n0()) {
                    if (chatActivityEnterView22.C6 == null) {
                        chatActivityEnterView22.D6 = true;
                        float f14 = chatActivityEnterView22.B0 ? 0.5f : 1.0f;
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        chatActivityEnterView22.C6 = ofFloat2;
                        ofFloat2.addUpdateListener(new rm1(chatActivityEnterView22, f14, b4));
                        chatActivityEnterView22.C6.addListener(new t7(chatActivityEnterView22, f14, (byte) 3));
                        chatActivityEnterView22.C6.setDuration(180L);
                        chatActivityEnterView22.C6.setInterpolator(s33.i);
                        chatActivityEnterView22.C6.start();
                        break;
                    }
                } else {
                    gb gbVar3 = chatActivityEnterView22.V;
                    if (gbVar3 == null || !gbVar3.f) {
                        byte b8 = 28;
                        if (ew1Var.x) {
                            cs5 cs5Var = chatActivityEnterView22.U6;
                            if (cs5Var != null) {
                                cs5Var.u();
                                chatActivityEnterView22.U6 = null;
                                break;
                            } else {
                                ex1 ex1Var6 = chatActivityEnterView22.F0;
                                if (ex1Var6 != null && mu1Var2 != null) {
                                    ex1Var6.m();
                                    ?? r32 = chatActivityEnterView22.c2;
                                    cs5 cs5Var2 = new cs5(r32 != null ? r32 : chatActivityEnterView22, chatActivityEnterView22.L4, ew1Var, false, false, true);
                                    cs5Var2.a0 = gl.L(280.0f);
                                    mu1.x6(new t07(cs5Var2, chatActivityEnterView22.F0), mu1Var2.h, true, true, true, true);
                                    cs5Var2.X = true;
                                    cs5Var2.p = new aj1(chatActivityEnterView22, cs5Var2, b8);
                                    chatActivityEnterView22.U6 = cs5Var2;
                                    cs5Var2.a0();
                                    break;
                                }
                            }
                        } else if (chatActivityEnterView22.B0) {
                            chatActivityEnterView22.X1();
                            break;
                        } else if (!chatActivityEnterView22.Q0() || chatActivityEnterView22.V2 != 0) {
                            chatActivityEnterView22.W1(1, 0, true, true);
                            wx1 wx1Var2 = chatActivityEnterView22.V0;
                            ex1 ex1Var7 = chatActivityEnterView22.F0;
                            boolean z4 = ex1Var7 != null && ex1Var7.length() > 0;
                            if (mu1Var2 != null) {
                                je5 je5Var = mu1Var2.N1;
                                if (je5Var != null) {
                                    if (je5Var.W) {
                                        je5Var.f(true);
                                    }
                                    r3 = true;
                                } else {
                                    r3 = false;
                                }
                                mu1Var2.N1 = null;
                                if (r3 != false) {
                                    z = true;
                                }
                            }
                            wx1Var2.B(z4, z);
                            break;
                        } else {
                            if (chatActivityEnterView22.H2 != 0) {
                                chatActivityEnterView22.O1(0, true);
                                wx1 wx1Var3 = chatActivityEnterView22.V0;
                                if (wx1Var3 != null) {
                                    wx1Var3.s(false);
                                }
                                ex1 ex1Var8 = chatActivityEnterView22.F0;
                                if (ex1Var8 != null) {
                                    ex1Var8.requestFocus();
                                }
                            }
                            if (chatActivityEnterView22.p4) {
                                chatActivityEnterView22.P1(false, true, false, true);
                                chatActivityEnterView22.b4 = true;
                                gl.d3(new av1(chatActivityEnterView22, b8), 200L);
                                break;
                            } else {
                                chatActivityEnterView22.i1();
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
