// default package

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void b(Object obj, Object obj2) {
        l5c l5cVar;
        y31 y31Var = (y31) this.b;
        y31Var.M.dismiss();
        y31Var.E = (String) obj;
        y31Var.F = (TLRPC.InputDocument) obj2;
        y31Var.x = false;
        gl.r(y31Var.e);
        y31Var.n.setSticker(y31Var.E);
        y31Var.f0(true);
        va vaVar = y31Var.a;
        if (vaVar == null || (l5cVar = vaVar.g3) == null) {
            return;
        }
        l5cVar.O(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void c(Object obj, Object obj2) {
        TLRPC.Chat K0;
        z81 z81Var = (z81) this.b;
        ArrayList arrayList = (ArrayList) obj;
        boolean isEmpty = z81Var.G.isEmpty();
        ArrayList arrayList2 = z81Var.x;
        boolean isEmpty2 = arrayList2.isEmpty();
        if (!isEmpty || !isEmpty2) {
            c4c c = c4c.c(1, R.drawable.menu_call_create, k96.M0(2131749298, null));
            c.r = true;
            arrayList.add(c);
            if (!z81Var.getUserConfig().X) {
                c4c c2 = c4c.c(2, R.drawable.menu_add_tab_24, k96.M0(2131749269, null));
                c2.r = true;
                arrayList.add(c2);
            }
            arrayList.add(c4c.C(null));
        }
        int i = 0;
        Object[] objArr = 0;
        if (!isEmpty) {
            ArrayList arrayList3 = z81Var.G;
            int size = arrayList3.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj3 = arrayList3.get(i2);
                i2++;
                Long l = (Long) obj3;
                if (l != null && (K0 = z81Var.getMessagesController().K0(l)) != null) {
                    d81 d81Var = new d81(z81Var, objArr == true ? 1 : 0);
                    int i3 = x81.b;
                    c4c K = c4c.K(x81.class);
                    K.H = K0;
                    K.E = d81Var;
                    arrayList.add(K);
                }
            }
            arrayList.add(c4c.C(null));
        }
        if (isEmpty2) {
            return;
        }
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj4 = arrayList2.get(i);
            i++;
            w81 w81Var = (w81) obj4;
            t tVar = new t(z81Var, w81Var, (byte) 29);
            int i4 = u81.b;
            c4c K2 = c4c.K(u81.class);
            K2.H = w81Var;
            K2.E = tVar;
            K2.L(z81Var.e0(w81Var.c));
            arrayList.add(K2);
        }
        if (z81Var.F) {
            return;
        }
        arrayList.add(c4c.q(-1, 8));
        arrayList.add(c4c.q(-2, 8));
        arrayList.add(c4c.q(-3, 8));
    }

    private final void d(Object obj, Object obj2) {
        ib1 ib1Var = (ib1) this.b;
        Canvas canvas = (Canvas) obj;
        Runnable runnable = (Runnable) obj2;
        Paint paint = ib1Var.J;
        RectF rectF = ib1Var.z0;
        cb1 cb1Var = ib1Var.f;
        if (!ib1Var.g()) {
            Paint c = ib1Var.Q.c(1.0f);
            cb1Var.getEditText().setHintColor(c != null ? -1 : -2130706433);
            if (c == null) {
                runnable.run();
                return;
            }
            gt3 editText = cb1Var.getEditText();
            canvas.saveLayerAlpha(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), kk7.d4, 31);
            runnable.run();
            canvas.drawRect(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), c);
            canvas.restore();
            return;
        }
        if (ib1Var.H == null) {
            runnable.run();
            return;
        }
        canvas.translate(-cb1Var.getEditText().q0, 0.0f);
        canvas.saveLayerAlpha(0.0f, 0.0f, ib1Var.H.getWidth(), ib1Var.H.getHeight(), kk7.d4, 31);
        rectF.set(0.0f, 1.0f, ib1Var.H.getWidth(), ib1Var.H.getHeight() - 1);
        ib1Var.h(ib1Var.Q, canvas, rectF, 0.0f, true, (-cb1Var.getX()) - r13.getPaddingLeft(), ((-cb1Var.getY()) - r13.getPaddingTop()) - r13.getExtendedPaddingTop(), true);
        canvas.save();
        paint.setAlpha(kk7.u2);
        canvas.drawBitmap(ib1Var.H, 0.0f, 0.0f, paint);
        canvas.restore();
        canvas.restore();
    }

    private final void e(Object obj, Object obj2) {
        ((eg1) this.b).C0((ArrayList) obj, (l5c) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void f(Object obj, Object obj2) {
        gxa gxaVar;
        zi1 zi1Var = (zi1) this.b;
        ArrayList arrayList = (ArrayList) obj;
        zi1Var.R0 = -1;
        TLRPC.Chat K0 = na7.q1(zi1Var.o0).K0(Long.valueOf(-zi1Var.p0));
        TLRPC.ChatFull L0 = na7.q1(zi1Var.o0).L0(-zi1Var.p0);
        int i = L0 != null ? L0.stats_dc : -1;
        if (zi1Var.b1) {
            arrayList.add(c4c.g(zi1Var.s0));
            gxa gxaVar2 = zi1Var.l1;
            if (gxaVar2 != null && !gxaVar2.l) {
                arrayList.add(c4c.h(5, i, gxaVar2));
                arrayList.add(c4c.B(-1, null));
            }
            gxa gxaVar3 = zi1Var.m1;
            if (gxaVar3 != null && !gxaVar3.l) {
                arrayList.add(c4c.h(2, i, gxaVar3));
                arrayList.add(c4c.B(-2, null));
            }
        }
        if (zi1Var.c1 && (gxaVar = zi1Var.n1) != null && !gxaVar.l) {
            arrayList.add(c4c.h(2, i, gxaVar));
            arrayList.add(c4c.B(-3, null));
        }
        if (zi1Var.o1) {
            arrayList.add(c4c.b(k96.M0(2131748193, null)));
            arrayList.add(c4c.v(zi1Var.p1));
            arrayList.add(c4c.v(zi1Var.q1));
            arrayList.add(c4c.v(zi1Var.r1));
            arrayList.add(c4c.B(-4, zi1Var.u0));
        }
        if (K0 != null && K0.creator) {
            if (zi1Var.b1) {
                arrayList.add(c4c.b(k96.M0(2131748214, null)));
                arrayList.add(c4c.k(zi1Var.w0));
                arrayList.add(c4c.B(-5, zi1Var.t0));
                int f = na7.q1(zi1Var.o0).k4.T1.f();
                String M0 = k96.M0(2131748173, null);
                boolean z = false;
                int i2 = zi1Var.r0 < f ? f : 0;
                if (i2 > 0) {
                    Context context = a.b;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                    spannableStringBuilder.append((CharSequence) "  L");
                    cm2 cm2Var = new cm2(0, new gc(i2, null, context, false));
                    cm2Var.s = gl.L(1.0f);
                    spannableStringBuilder.setSpan(cm2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    M0 = spannableStringBuilder;
                }
                c4c i3 = c4c.i(1, M0);
                if (zi1Var.r0 >= f && zi1Var.j1) {
                    z = true;
                }
                i3.L(z);
                arrayList.add(i3);
                arrayList.add(c4c.B(-8, k96.M0(2131748172, null)));
            }
            if (zi1Var.c1) {
                arrayList.add(c4c.b(k96.M0(2131748181, null)));
                arrayList.add(c4c.j(3, zi1Var.C0));
                arrayList.add(c4c.B(-6, zi1Var.v0));
            }
        }
        if (hc2.V(na7.q1(zi1Var.o0).K0(Long.valueOf(-zi1Var.p0))) && na7.q1(zi1Var.o0).k4.C2.f) {
            arrayList.add(xb.i(4, bkb.v0(bkb.kk, zi1Var.n0), p82.a0(k96.M0(2131752462, null)), k96.M0(2131752463, null)));
            arrayList.add(c4c.B(-7, null));
        }
        if (!zi1Var.a1.a()) {
            arrayList.add(c4c.B(-10, null));
        } else {
            zi1Var.R0 = arrayList.size();
            arrayList.add(c4c.n(zi1Var.T0, -2));
        }
    }

    private final void g(Object obj, Object obj2) {
        ti1 ti1Var = (ti1) this.b;
        ArrayList arrayList = (ArrayList) obj;
        vi1 vi1Var = ti1Var.f;
        int i = ti1Var.d;
        int i2 = vi1.y;
        ArrayList arrayList2 = i == 0 ? vi1Var.r : vi1Var.n;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            int i4 = dva.b;
            c4c K = c4c.K(dva.class);
            K.H = (TL_stars.StarsTransaction) obj3;
            K.r = true;
            arrayList.add(K);
        }
        if (TextUtils.isEmpty(i == 0 ? vi1Var.s : vi1Var.h)) {
            return;
        }
        arrayList.add(c4c.q(arrayList.size(), 7));
        arrayList.add(c4c.q(arrayList.size(), 7));
        arrayList.add(c4c.q(arrayList.size(), 7));
    }

    private final void h(Object obj, Object obj2) {
        ((ChatActivityEnterView) this.b).v0((Canvas) obj, (h8c) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x029c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void i(Object obj, Object obj2) {
        boolean z;
        String str;
        l5c l5cVar;
        String str2;
        CharSequence charSequence;
        yl6 yl6Var;
        h12 h12Var = (h12) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l5c l5cVar2 = (l5c) obj2;
        boolean z2 = h12Var.Q;
        ArrayList arrayList2 = h12Var.N;
        ia7 ia7Var = h12Var.K;
        ArrayList arrayList3 = h12Var.L;
        HashSet hashSet = h12Var.J;
        ArrayList arrayList4 = h12Var.M;
        arrayList.add(c4c.E(-100, gl.L(1.0f)));
        int size = arrayList.size();
        byte b = 0;
        boolean z3 = true;
        if (TextUtils.isEmpty(h12Var.E)) {
            l5cVar2.V();
            for (int i = 0; i < h12Var.I.size(); i++) {
                yl6 yl6Var2 = (yl6) h12Var.I.get(i);
                yl6Var2.e.J5(null, true);
                c4c i2 = dba.i(yl6Var2, new z02(h12Var, b));
                i2.L(hashSet.contains(yl6Var2));
                i2.d = -1;
                arrayList.add(i2);
            }
            if (h12Var.H) {
                arrayList.add(c4c.q(11, 4));
                arrayList.add(c4c.q(12, 4));
                arrayList.add(c4c.q(13, 4));
            }
            l5cVar2.U();
            if (ia7Var != null) {
                ArrayList arrayList5 = ia7Var.c;
                int size2 = arrayList5.size();
                if (size2 < arrayList3.size()) {
                    arrayList3.subList(size2, arrayList3.size()).clear();
                }
                int i3 = 0;
                while (i3 < size2) {
                    boolean z4 = z3;
                    if (i3 >= arrayList3.size()) {
                        yl6Var = new yl6();
                        arrayList3.add(yl6Var);
                    } else {
                        yl6Var = (yl6) arrayList3.get(i3);
                    }
                    if (yl6Var.e != arrayList5.get(i3)) {
                        h12Var.m0--;
                        yl6Var.e = (k27) arrayList5.get(i3);
                    }
                    i3++;
                    z3 = z4;
                }
            }
            boolean z5 = z3;
            if (ia7Var != null && arrayList3 != null && !arrayList3.isEmpty()) {
                if (arrayList.size() > size) {
                    arrayList.add(c4c.B(-98, null));
                }
                l5cVar2.V();
                arrayList.add(c4c.t(45, k96.M0(2131753901, null)));
                for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                    yl6 yl6Var3 = (yl6) arrayList3.get(i4);
                    c4c i5 = dba.i(yl6Var3, new z02(h12Var, (byte) 0));
                    i5.L(hashSet.contains(yl6Var3));
                    arrayList.add(i5);
                }
                if (ia7Var.f) {
                    arrayList.add(c4c.q(41, 4));
                    arrayList.add(c4c.q(42, 4));
                    arrayList.add(c4c.q(43, 4));
                }
                if (!ia7Var.f && !ia7Var.e) {
                    c4c c = c4c.c(h12Var.S, R.drawable.arrow_more, k96.M0(2131745147, null));
                    c.r = z5;
                    arrayList.add(c);
                }
                l5cVar2.U();
            }
            if (arrayList4 != null && (!arrayList4.isEmpty() || h12Var.V >= 0 || h12Var.a0)) {
                if (arrayList.size() > size) {
                    arrayList.add(c4c.B(-98, null));
                }
                l5cVar2.V();
                arrayList.add(c4c.t(((h12Var.V >= 0 || h12Var.a0) && arrayList4.isEmpty()) ? 25 : 20, k96.M0(2131753904, null)));
                for (int i6 = 0; i6 < arrayList4.size(); i6++) {
                    yl6 yl6Var4 = (yl6) arrayList4.get(i6);
                    yl6Var4.e.J5(h12Var.E, true);
                    c4c i7 = dba.i(yl6Var4, new z02(h12Var, (byte) 0));
                    i7.L(hashSet.contains(yl6Var4));
                    arrayList.add(i7);
                }
                if (h12Var.V >= 0 || h12Var.a0) {
                    arrayList.add(c4c.q(21, 4));
                    arrayList.add(c4c.q(22, 4));
                    arrayList.add(c4c.q(23, 4));
                }
                if (h12Var.d0) {
                    c4c c2 = c4c.c(z2 ? 1 : 0, R.drawable.arrow_more, k96.M0(2131745147, null));
                    c2.r = true;
                    arrayList.add(c2);
                }
                l5cVar2.U();
            }
        } else {
            String lowerCase = h12Var.E.toLowerCase();
            String I3 = gl.I3(lowerCase);
            boolean z6 = false;
            int i8 = 0;
            while (i8 < h12Var.I.size()) {
                yl6 yl6Var5 = (yl6) h12Var.I.get(i8);
                String str3 = yl6Var5.a;
                if (str3 != null) {
                    String lowerCase2 = str3.toLowerCase();
                    String I32 = gl.I3(lowerCase2);
                    if (lowerCase2.startsWith(lowerCase) || de9.t(" ", lowerCase, lowerCase2) || I32.startsWith(I3) || I32.contains(" ".concat(I3))) {
                        z = true;
                        str = yl6Var5.b;
                        if (str == null) {
                            String lowerCase3 = str.toLowerCase();
                            l5cVar = l5cVar2;
                            String I33 = gl.I3(lowerCase3);
                            z = z || lowerCase3.startsWith(lowerCase) || de9.t(" ", lowerCase, lowerCase3) || I33.startsWith(I3) || I33.contains(" ".concat(I3));
                        } else {
                            l5cVar = l5cVar2;
                        }
                        if (z) {
                            if (!z6) {
                                if (arrayList.size() > size) {
                                    str2 = null;
                                    arrayList.add(c4c.B(-97, null));
                                } else {
                                    str2 = null;
                                }
                                l5cVar.V();
                                arrayList.add(c4c.t(10, k96.M0(2131753902, str2)));
                                z6 = true;
                            }
                            yl6Var5.e.J5(h12Var.E, true);
                            c4c i9 = dba.i(yl6Var5, new z02(h12Var, (byte) 0));
                            i9.L(hashSet.contains(yl6Var5));
                            i9.d = 10;
                            arrayList.add(i9);
                        }
                        i8++;
                        l5cVar2 = l5cVar;
                    }
                }
                z = false;
                str = yl6Var5.b;
                if (str == null) {
                }
                if (z) {
                }
                i8++;
                l5cVar2 = l5cVar;
            }
            l5c l5cVar3 = l5cVar2;
            l5cVar3.U();
            if (arrayList4 != null && (!arrayList4.isEmpty() || h12Var.V >= 0 || h12Var.a0)) {
                if (arrayList.size() > size) {
                    arrayList.add(c4c.B(-98, null));
                }
                l5cVar3.V();
                arrayList.add(c4c.t(((h12Var.V >= 0 || h12Var.a0) && arrayList4.isEmpty()) ? 25 : 20, k96.M0(2131753904, null)));
                for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                    yl6 yl6Var6 = (yl6) arrayList4.get(i10);
                    yl6Var6.e.J5(h12Var.E, true);
                    c4c i11 = dba.i(yl6Var6, new z02(h12Var, (byte) 0));
                    i11.L(hashSet.contains(yl6Var6));
                    arrayList.add(i11);
                }
                if (h12Var.V >= 0 || h12Var.a0) {
                    arrayList.add(c4c.q(21, 4));
                    arrayList.add(c4c.q(22, 4));
                    arrayList.add(c4c.q(23, 4));
                }
                if (h12Var.d0) {
                    c4c c3 = c4c.c(z2 ? 1 : 0, R.drawable.arrow_more, k96.M0(2131745147, null));
                    c3.r = true;
                    arrayList.add(c3);
                }
                l5cVar3.U();
            }
            if (arrayList2 != null && (!arrayList2.isEmpty() || h12Var.e0 >= 0 || h12Var.n0)) {
                if (arrayList.size() > size) {
                    arrayList.add(c4c.B(-96, null));
                }
                l5cVar3.V();
                arrayList.add(c4c.t(((h12Var.e0 >= 0 || h12Var.n0) && arrayList2.isEmpty()) ? 35 : 30, k96.M0(2131753903, null)));
                int size3 = arrayList2.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    yl6 yl6Var7 = (yl6) arrayList2.get(i12);
                    yl6Var7.e.J5(h12Var.E, true);
                    c4c i13 = dba.i(yl6Var7, new z02(h12Var, (byte) 0));
                    i13.L(hashSet.contains(yl6Var7));
                    arrayList.add(i13);
                }
                if (h12Var.e0 >= 0 || h12Var.n0) {
                    arrayList.add(c4c.q(31, 4));
                    arrayList.add(c4c.q(32, 4));
                    arrayList.add(c4c.q(33, 4));
                }
                if (h12Var.h0) {
                    c4c c4 = c4c.c(h12Var.R, R.drawable.arrow_more, k96.M0(2131745147, null));
                    c4.r = true;
                    arrayList.add(c4);
                }
                l5cVar3.U();
            }
        }
        if (arrayList.size() > size || h12Var.H) {
            charSequence = null;
        } else if (TextUtils.isEmpty(h12Var.E)) {
            charSequence = null;
            arrayList.add(f12.i(k96.M0(2131748052, null), k96.M0(2131748053, null)));
        } else {
            charSequence = null;
            arrayList.add(f12.i(gl.S2(k96.a0(null, null, h12Var.E.length() >= 3 ? 2131748049 : 2131748050, h12Var.E)), k96.M0(2131748051, null)));
        }
        arrayList.add(c4c.B(-99, charSequence));
    }

    private final void j(Object obj, Object obj2) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
        boolean z = ChatAttachAlertPhotoLayout.r1;
        ((Runnable) obj2).run();
        chatAttachAlertPhotoLayout.setStarsPrice(((Long) obj).longValue());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x02ab, code lost:
    
        if (r1.equals("application/vnd.openxmlformats-officedocument.presentationml.presentation") == false) goto L172;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:412:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x08ae  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x090a  */
    @Override // i8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        String str;
        byte b;
        c4c i;
        c4c i2;
        TL_iv.RichMessage richMessage;
        c4c i3;
        TL_iv.RichMessage richMessage2;
        String substring;
        String str2;
        c4c i4;
        TL_iv.RichMessage richMessage3;
        String substring2;
        String substring3;
        ArrayList arrayList;
        int i5;
        int size;
        int i6;
        int i7;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        String upperCase;
        quc qucVar;
        int i8 = 2;
        str = "";
        byte b2 = 22;
        int i9 = 1;
        final byte b3 = 0;
        switch (this.a) {
            case 0:
                a1 a1Var = (a1) this.b;
                ArrayList arrayList2 = (ArrayList) obj;
                l5c l5cVar = (l5c) obj2;
                boolean[] zArr = a1Var.k2;
                boolean[] zArr2 = a1Var.l2;
                z0 z0Var = a1Var.u2;
                arrayList2.add(c4c.C(null));
                arrayList2.add(c4c.m(a1Var.s2));
                arrayList2.add(c4c.C(null));
                l5cVar.G = true;
                l5cVar.V();
                z0 z0Var2 = a1Var.t2;
                int selectedTab = z0Var2 != null ? z0Var2.getSelectedTab() : 0;
                if (selectedTab == 0) {
                    String str3 = a1Var.m2;
                    if (str3 == null || str3.equalsIgnoreCase("und")) {
                        arrayList2.add(wzb.i(3, k96.M0(2131754986, null), null, null, null));
                    } else {
                        String J0 = rzb.J0(a1Var.m2, null, zArr2);
                        String M0 = k96.M0((zArr2 == null || !zArr2[0]) ? 2131754993 : 2131754994, null);
                        int indexOf = M0.indexOf("%s");
                        if (indexOf < 0) {
                            substring3 = "";
                            substring2 = substring3;
                        } else {
                            substring2 = M0.substring(0, indexOf);
                            substring3 = M0.substring(indexOf + 2);
                        }
                        if (TextUtils.isEmpty(substring2)) {
                            J0 = rzb.E0(J0);
                        }
                        arrayList2.add(wzb.i(3, substring2, J0, substring3, null));
                    }
                    arrayList2.add(a1Var.i1() ? a1Var.j1(4, a1Var.T1, false) : a0c.i(4, a1Var.S1, a1Var.P2, new d(a1Var, (byte) 5), null, null));
                    String J02 = rzb.J0(a1Var.n2, zArr, null);
                    String M02 = k96.M0((zArr == null || !zArr[0]) ? 2131754960 : 2131754961, null);
                    int indexOf2 = M02.indexOf("%s");
                    if (indexOf2 < 0) {
                        str2 = "";
                        substring = str2;
                    } else {
                        String substring4 = M02.substring(0, indexOf2);
                        substring = M02.substring(indexOf2 + 2);
                        str2 = substring4;
                    }
                    if (TextUtils.isEmpty(str2)) {
                        J02 = rzb.E0(J02);
                    }
                    StringBuilder r = tb4.r(J02);
                    r.append(a1Var.o2 != null ? b00.j(new StringBuilder(" ("), a1Var.o2, ")") : "");
                    arrayList2.add(wzb.j(5, str2, r.toString(), substring, new d(a1Var, (byte) 6), a1Var.q2, new d(a1Var, r2), null));
                    boolean i1 = a1Var.i1();
                    boolean z = a1Var.U1;
                    if (i1) {
                        if (z || (richMessage3 = a1Var.W1) == null) {
                            richMessage3 = a1Var.T1;
                        }
                        i4 = a1Var.j1(6, richMessage3, z);
                    } else {
                        i4 = a0c.i(z ? 7 : 6, a1Var.V1, false, null, null, !z ? new d(a1Var, (byte) 8) : null);
                    }
                    arrayList2.add(i4);
                } else if (selectedTab == 1) {
                    arrayList2.add(c4c.k(z0Var));
                    if (z0Var.getSelectedTone() instanceof t0) {
                        arrayList2.add(c4c.j(10, a1Var.w2));
                        l5cVar.U();
                        arrayList2.add(c4c.B(11, null));
                        l5cVar.V();
                    }
                    if ((z0Var.getSelectedTab() >= 0 || a1Var.q2) && (!(z0Var.getSelectedTone() instanceof t0) || TextUtils.equals(a1Var.x2.getText().toString(), a1Var.F2))) {
                        arrayList2.add(wzb.j(7, k96.M0(2131754984, null), null, null, null, a1Var.q2, new d(a1Var, r2), null));
                        boolean i12 = a1Var.i1();
                        boolean z2 = a1Var.X1;
                        if (i12) {
                            if (z2 || (richMessage2 = a1Var.Z1) == null) {
                                richMessage2 = a1Var.T1;
                            }
                            i3 = a1Var.j1(8, richMessage2, z2);
                        } else {
                            i3 = a0c.i(z2 ? (byte) 7 : (byte) 6, a1Var.Y1, false, null, null, !z2 ? new d(a1Var, (byte) 8) : null);
                        }
                        arrayList2.add(i3);
                    } else {
                        arrayList2.add(wzb.j(5, k96.M0(2131754987, null), null, null, null, a1Var.q2, new d(a1Var, r2), null));
                        arrayList2.add(a1Var.i1() ? a1Var.j1(6, a1Var.T1, false) : a0c.i(a1Var.X1 ? 7 : 6, a1Var.S1, false, null, null, null));
                    }
                } else if (selectedTab == 2) {
                    arrayList2.add(wzb.i(3, k96.M0(2131754987, null), null, null, null));
                    if (a1Var.i1()) {
                        i = a1Var.j1(4, a1Var.T1, false);
                        b = 5;
                    } else {
                        b = 5;
                        i = a0c.i(4, a1Var.S1, a1Var.P2, new d(a1Var, b), null, null);
                    }
                    arrayList2.add(i);
                    arrayList2.add(wzb.i(b, k96.M0(2131754984, null), null, null, null));
                    boolean i13 = a1Var.i1();
                    boolean z3 = a1Var.a2;
                    if (i13) {
                        if (z3 || (richMessage = a1Var.c2) == null) {
                            richMessage = a1Var.T1;
                        }
                        i2 = a1Var.j1(6, richMessage, z3);
                    } else {
                        i2 = a0c.i(z3 ? 7 : 6, a1Var.b2, false, null, null, !z3 ? new d(a1Var, (byte) 8) : null);
                    }
                    arrayList2.add(i2);
                }
                l5cVar.U();
                if (a1Var.h1()) {
                    arrayList2.add(c4c.B(21, null));
                    l5cVar.V();
                    arrayList2.add(c4c.j(20, a1Var.Q2));
                    l5cVar.U();
                    arrayList2.add(c4c.B(22, "Every message you send in this chat will be rewritten with these settings."));
                    break;
                } else {
                    arrayList2.add(c4c.C(null));
                    break;
                }
                break;
            case 1:
                e0 e0Var = (e0) this.b;
                ArrayList arrayList3 = (ArrayList) obj;
                l5c l5cVar2 = (l5c) obj2;
                l5cVar2.G = true;
                arrayList3.add(c4c.C(null));
                FrameLayout frameLayout = e0Var.V1;
                c4c c4cVar = new c4c(-4);
                c4cVar.c = frameLayout;
                c4cVar.A = -1;
                c4cVar.e = true;
                arrayList3.add(c4cVar);
                arrayList3.add(c4c.C(null));
                arrayList3.add(c4c.m(e0Var.W1));
                arrayList3.add(c4c.D(gl.L(1.0f)));
                arrayList3.add(c4c.m(e0Var.X1));
                arrayList3.add(c4c.D(gl.L(24.0f)));
                TL_aicompose.AiComposeTone aiComposeTone = e0Var.S1;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    TL_aicompose.aiComposeToneExample aicomposetoneexample = e0Var.d2[e0Var.c2];
                    l5cVar2.V();
                    arrayList3.add(wzb.j(3, k96.M0(2131755001, null), null, null, null, false, null, new a0(e0Var, (byte) 1)));
                    arrayList3.add(a0c.i(4, aicomposetoneexample == null ? e0.Z0() : k27.h0(aicomposetoneexample.from, false), false, null, null, null));
                    arrayList3.add(wzb.i(5, k96.M0(2131755004, null), null, null, null));
                    arrayList3.add(a0c.i(6, aicomposetoneexample == null ? e0.Z0() : k27.h0(aicomposetoneexample.to, false), false, null, null, null));
                    l5cVar2.U();
                    TLRPC.User V1 = tL_aiComposeTone.author_id != 0 ? na7.q1(e0Var.a).V1(Long.valueOf(tL_aiComposeTone.author_id)) : null;
                    String p = l7c.p(V1);
                    int i10 = tL_aiComposeTone.installs_count;
                    if (V1 != null) {
                        arrayList3.add(c4c.C(gl.M2((i10 > 0 ? k96.G(i10, "AIEditorUsedBy", new Object[0]).concat(" ") : "").concat(TextUtils.isEmpty(p) ? k96.a0(null, null, 2131754999, l7c.r(V1)) : k96.a0(null, null, 2131754999, b00.h("@", p))), bkb.Wc, e0Var.J0, new ee2(e0Var, tL_aiComposeTone, (byte) 16), false)));
                    } else if (i10 > 0) {
                        arrayList3.add(c4c.C(k96.G(i10, "AIEditorUsedBy", new Object[0])));
                    }
                }
                arrayList3.add(c4c.D(gl.L(32.0f)));
                break;
            case 2:
                r0 r0Var = (r0) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                arrayList4.add(c4c.C(null));
                arrayList4.add(c4c.m(r0Var.S1));
                arrayList4.add(c4c.C(null));
                arrayList4.add(c4c.k(r0Var.V1));
                arrayList4.add(c4c.C(null));
                arrayList4.add(c4c.k(r0Var.W1));
                arrayList4.add(c4c.C(null));
                if (r0Var.e2 != null) {
                    c4c e = c4c.e(1, k96.M0(2131754998, null));
                    e.s = true;
                    arrayList4.add(e);
                    arrayList4.add(c4c.C(null));
                }
                arrayList4.add(c4c.m(r0Var.X1));
                break;
            case 3:
                o5 o5Var = (o5) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                List<TL_stars.TL_StarGiftAuctionAcquiredGift> list = o5Var.S1;
                if (list != null) {
                    for (TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift : list) {
                        gt4 gt4Var = o5Var.T1;
                        t tVar = new t(o5Var, tL_StarGiftAuctionAcquiredGift, (byte) 3);
                        int i11 = m5.b;
                        c4c K = c4c.K(m5.class);
                        K.H = tL_StarGiftAuctionAcquiredGift;
                        K.I = gt4Var;
                        K.E = tVar;
                        arrayList5.add(K);
                    }
                    arrayList5.add(c4c.D(gl.L(16.0f)));
                    break;
                }
                break;
            case 4:
                ((ArrayList) obj).add(((j9) this.b).S1);
                break;
            case 5:
                final eb ebVar = (eb) this.b;
                ArrayList arrayList6 = (ArrayList) obj;
                cb cbVar = ebVar.E;
                ArrayList arrayList7 = ebVar.y;
                if (!ebVar.b && arrayList7.isEmpty()) {
                    arrayList6.add(c4c.k(ebVar.d));
                }
                SharedPreferences sharedPreferences = ebVar.getContext().getSharedPreferences("webhistory", 0);
                ArrayList arrayList8 = new ArrayList();
                String string = sharedPreferences.getString("queries_json", null);
                if (string != null) {
                    try {
                        arrayList = new ArrayList();
                        JSONArray jSONArray = new JSONArray(string);
                        int i14 = 0;
                        while (i14 < jSONArray.length()) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i14);
                            int i15 = i14;
                            db dbVar = new db(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                            i5 = i9;
                            try {
                                dbVar.c = jSONObject.optDouble("rank", 0.0d);
                                arrayList.add(dbVar);
                                i14 = i15 + 1;
                                i9 = i5;
                            } catch (Exception unused) {
                            }
                        }
                        i5 = i9;
                        Collections.sort(arrayList, new sa((byte) 0));
                        size = arrayList.size();
                        i6 = 0;
                    } catch (Exception unused2) {
                    }
                    while (i6 < size) {
                        Object obj3 = arrayList.get(i6);
                        i6++;
                        db dbVar2 = (db) obj3;
                        if (arrayList8.size() >= 20) {
                            arrayList7.size();
                            arrayList8.size();
                            if (!arrayList7.isEmpty()) {
                                arrayList6.add(c4c.k(ebVar.w));
                            }
                            i7 = 0;
                            while (i7 < arrayList7.size()) {
                                final String str4 = (String) arrayList7.get(i7);
                                boolean z4 = i7 == 0 ? i5 : 0;
                                boolean z5 = i7 == arrayList7.size() - i5 ? i5 : 0;
                                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: ua
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        byte b4 = b3;
                                        String str5 = str4;
                                        eb ebVar2 = ebVar;
                                        switch (b4) {
                                            case 0:
                                                ws wsVar = ebVar2.N;
                                                if (wsVar != null) {
                                                    wsVar.a(str5);
                                                    break;
                                                }
                                                break;
                                            default:
                                                ws wsVar2 = ebVar2.N;
                                                if (wsVar2 != null) {
                                                    wsVar2.a(str5);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                int i16 = wa.b;
                                c4c K2 = c4c.K(wa.class);
                                K2.A = i5;
                                K2.m = str4;
                                K2.E = onClickListener;
                                K2.r = z4;
                                K2.s = z5;
                                K2.H = Boolean.TRUE;
                                K2.I = ebVar;
                                arrayList6.add(K2);
                                i7++;
                                i5 = 1;
                            }
                            if (!arrayList8.isEmpty()) {
                                arrayList6.add(c4c.s(k96.M0(2131742649, null), k96.M0(2131742653, null), new j1(ebVar, (byte) 5)));
                                int i17 = 0;
                                while (i17 < arrayList8.size()) {
                                    final String str5 = (String) arrayList8.get(i17);
                                    boolean z6 = i17 == 0;
                                    final byte b4 = 1;
                                    boolean z7 = i17 == arrayList8.size() - 1;
                                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: ua
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            byte b42 = b4;
                                            String str52 = str5;
                                            eb ebVar2 = ebVar;
                                            switch (b42) {
                                                case 0:
                                                    ws wsVar = ebVar2.N;
                                                    if (wsVar != null) {
                                                        wsVar.a(str52);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    ws wsVar2 = ebVar2.N;
                                                    if (wsVar2 != null) {
                                                        wsVar2.a(str52);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    int i18 = wa.b;
                                    c4c K3 = c4c.K(wa.class);
                                    K3.A = 0;
                                    K3.m = str5;
                                    K3.E = onClickListener2;
                                    K3.r = z6;
                                    K3.s = z7;
                                    K3.H = Boolean.TRUE;
                                    K3.I = ebVar;
                                    arrayList6.add(K3);
                                    i17++;
                                }
                            }
                            if (cbVar != null) {
                                ArrayList arrayList9 = cbVar.a;
                                if (!arrayList9.isEmpty()) {
                                    arrayList6.add(c4c.r(k96.M0(2131742650, null)));
                                    while (b3 < arrayList9.size()) {
                                        k27 k27Var = (k27) arrayList9.get(b3);
                                        if (!TextUtils.isEmpty(eb.a(k27Var))) {
                                            int i19 = ab.b;
                                            c4c K4 = c4c.K(ab.class);
                                            K4.A = 3;
                                            K4.r = true;
                                            K4.I = k27Var;
                                            arrayList6.add(K4);
                                        }
                                        b3++;
                                    }
                                    if (!cbVar.f) {
                                        arrayList6.add(c4c.q(arrayList6.size(), 32));
                                        arrayList6.add(c4c.q(arrayList6.size(), 32));
                                        arrayList6.add(c4c.q(arrayList6.size(), 32));
                                        break;
                                    }
                                }
                            }
                        } else {
                            arrayList8.add(dbVar2.a);
                        }
                    }
                    arrayList7.size();
                    arrayList8.size();
                    if (!arrayList7.isEmpty()) {
                    }
                    i7 = 0;
                    while (i7 < arrayList7.size()) {
                    }
                    if (!arrayList8.isEmpty()) {
                    }
                    if (cbVar != null) {
                    }
                }
                i5 = i9;
                arrayList7.size();
                arrayList8.size();
                if (!arrayList7.isEmpty()) {
                }
                i7 = 0;
                while (i7 < arrayList7.size()) {
                }
                if (!arrayList8.isEmpty()) {
                }
                if (cbVar != null) {
                }
                break;
            case 6:
                ib ibVar = (ib) this.b;
                ArrayList arrayList10 = (ArrayList) obj;
                boolean z8 = ibVar.W1;
                if (ibVar.T1 != null) {
                    arrayList10.add(c4c.C(null));
                    arrayList10.add(c4c.u(k96.M0(2131750990, null)));
                    c4c A = c4c.A(ibVar.Y0(0), k96.M0(z8 ? 2131750969 : 2131750967, null), 2);
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = ibVar.T1;
                    A.L(tL_channelAdminLogEventsFilter.promote || tL_channelAdminLogEventsFilter.demote || (z8 && (tL_channelAdminLogEventsFilter.kick || tL_channelAdminLogEventsFilter.ban || tL_channelAdminLogEventsFilter.unkick || tL_channelAdminLogEventsFilter.unban)) || tL_channelAdminLogEventsFilter.invite || tL_channelAdminLogEventsFilter.join || tL_channelAdminLogEventsFilter.leave || tL_channelAdminLogEventsFilter.edit_rank);
                    A.f = !ibVar.Y1;
                    A.E = new hb(ibVar, b3, b3);
                    arrayList10.add(A);
                    if (ibVar.Y1) {
                        c4c z9 = c4c.z(3, k96.M0(2131750972, null));
                        z9.i = 1;
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = ibVar.T1;
                        z9.L(tL_channelAdminLogEventsFilter2.promote || tL_channelAdminLogEventsFilter2.demote);
                        arrayList10.add(z9);
                        if (z8) {
                            c4c z10 = c4c.z(4, k96.M0(2131750975, null));
                            z10.i = 1;
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = ibVar.T1;
                            z10.L(tL_channelAdminLogEventsFilter3.kick || tL_channelAdminLogEventsFilter3.ban || tL_channelAdminLogEventsFilter3.unkick || tL_channelAdminLogEventsFilter3.unban);
                            arrayList10.add(z10);
                        }
                        c4c z11 = c4c.z(5, k96.M0(z8 ? 2131750976 : 2131750974, null));
                        z11.i = 1;
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = ibVar.T1;
                        z11.L(tL_channelAdminLogEventsFilter4.invite || tL_channelAdminLogEventsFilter4.join);
                        arrayList10.add(z11);
                        c4c z12 = c4c.z(6, k96.M0(z8 ? 2131750980 : 2131750979, null));
                        z12.i = 1;
                        z12.L(ibVar.T1.leave);
                        arrayList10.add(z12);
                        if (z8) {
                            c4c z13 = c4c.z(7, k96.M0(2131750978, null));
                            z13.i = 1;
                            z13.L(ibVar.T1.edit_rank);
                            arrayList10.add(z13);
                        }
                    }
                    c4c A2 = c4c.A(ibVar.Y0(1), k96.M0(z8 ? 2131750970 : 2131750971, null), 8);
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = ibVar.T1;
                    A2.L(tL_channelAdminLogEventsFilter5.info || tL_channelAdminLogEventsFilter5.settings || tL_channelAdminLogEventsFilter5.invites || tL_channelAdminLogEventsFilter5.group_call);
                    A2.f = !ibVar.Z1;
                    A2.E = new hb(ibVar, i9, b3);
                    arrayList10.add(A2);
                    if (ibVar.Z1) {
                        c4c z14 = c4c.z(9, k96.M0(z8 ? 2131750983 : 2131750986, null));
                        z14.i = 1;
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = ibVar.T1;
                        z14.L(tL_channelAdminLogEventsFilter6.info || tL_channelAdminLogEventsFilter6.settings);
                        arrayList10.add(z14);
                        c4c z15 = c4c.z(10, k96.M0(2131750982, null));
                        z15.i = 1;
                        z15.L(ibVar.T1.invites);
                        arrayList10.add(z15);
                        c4c z16 = c4c.z(11, k96.M0(2131750987, null));
                        z16.i = 1;
                        z16.L(ibVar.T1.group_call);
                        arrayList10.add(z16);
                    }
                    c4c A3 = c4c.A(ibVar.Y0(2), k96.M0(2131750968, null), 12);
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = ibVar.T1;
                    A3.L(tL_channelAdminLogEventsFilter7.delete || tL_channelAdminLogEventsFilter7.edit || tL_channelAdminLogEventsFilter7.pinned);
                    A3.f = !ibVar.a2;
                    A3.E = new hb(ibVar, i8, b3);
                    arrayList10.add(A3);
                    if (ibVar.a2) {
                        c4c z17 = c4c.z(13, k96.M0(2131750985, null));
                        z17.i = 1;
                        z17.L(ibVar.T1.delete);
                        arrayList10.add(z17);
                        c4c z18 = c4c.z(14, k96.M0(2131750984, null));
                        z18.i = 1;
                        z18.L(ibVar.T1.edit);
                        arrayList10.add(z18);
                        c4c z19 = c4c.z(15, k96.M0(2131750973, null));
                        z19.i = 1;
                        z19.L(ibVar.T1.pinned);
                        arrayList10.add(z19);
                    }
                    arrayList10.add(c4c.C(null));
                    arrayList10.add(c4c.u(k96.M0(2131750989, null)));
                    c4c z20 = c4c.z(16, k96.M0(2131750988, null));
                    vf6 vf6Var = ibVar.V1;
                    int m = vf6Var == null ? 0 : vf6Var.m();
                    ArrayList arrayList11 = ibVar.U1;
                    z20.L(m >= (arrayList11 == null ? 0 : arrayList11.size()));
                    arrayList10.add(z20);
                    if (ibVar.U1 != null) {
                        for (int i20 = 0; i20 < ibVar.U1.size(); i20++) {
                            long n = cf3.n(((TLRPC.ChannelParticipant) ibVar.U1.get(i20)).peer);
                            TLRPC.User V12 = na7.q1(ibVar.a).V1(Long.valueOf(n));
                            c4c c4cVar2 = new c4c(37);
                            c4cVar2.d = (-1) - i20;
                            c4cVar2.H = V12;
                            c4cVar2.i = 1;
                            vf6 vf6Var2 = ibVar.V1;
                            c4cVar2.L(vf6Var2 != null && vf6Var2.d(n));
                            arrayList10.add(c4cVar2);
                        }
                        break;
                    }
                }
                break;
            case 7:
                ((bc) this.b).C0((ArrayList) obj, (l5c) obj2);
                break;
            case 8:
                ae2 ae2Var = (ae2) this.b;
                TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI = (TLRPC.TL_composedMessageWithAI) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null && tL_composedMessageWithAI != null && (tL_textWithEntities = tL_composedMessageWithAI.result_text) != null) {
                    ae2Var.a(k27.h0(tL_textWithEntities, false), null);
                    break;
                } else {
                    if (tL_error == null) {
                        tL_error = new TLRPC.TL_error();
                    }
                    ae2Var.a(null, tL_error);
                    break;
                }
            case 9:
                ic icVar = (ic) this.b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                ArrayList arrayList12 = icVar.b;
                icVar.f = -1;
                icVar.g = System.currentTimeMillis();
                if (tones instanceof TL_aicompose.TL_tones) {
                    na7.q1(icVar.a).b4(tones.users, false);
                    arrayList12.clear();
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    arrayList12.addAll(tL_tones.tones);
                    icVar.c = tL_tones.hash;
                    icVar.d();
                    icVar.c();
                    break;
                }
                break;
            case 10:
                ArrayList arrayList13 = (ArrayList) obj;
                arrayList13.add(((ty) this.b).T1);
                arrayList13.add(c4c.D(gl.L(16.0f)));
                break;
            case 11:
                ((ArrayList) obj).add(c4c.j(-1, ((ez) this.b).U1));
                break;
            case 12:
                ((ArrayList) obj).add(c4c.j(-1, ((lz) this.b).U1));
                break;
            case 13:
                bc0 bc0Var = (bc0) this.b;
                bc0Var.w.setBackground(new BitmapDrawable((Bitmap) obj));
                bc0Var.x = false;
                hx4 hx4Var = bc0Var.h;
                hx4Var.a((Bitmap) obj2);
                tk0.c(hx4Var, bc0Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = bc0Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    break;
                }
                break;
            case 14:
                ((bd0) this.b).Z((ArrayList) obj, (l5c) obj2);
                break;
            case 15:
                ((vo0) this.b).Y((ArrayList) obj);
                break;
            case 16:
                hn hnVar = (hn) this.b;
                String str6 = (String) obj;
                Long l = (Long) obj2;
                StringBuilder sb = new StringBuilder();
                if (l.longValue() > 0) {
                    sb.append("~");
                    sb.append(gl.i0(l.longValue(), false, false));
                }
                if (str6 == null) {
                    upperCase = null;
                } else {
                    if (!str6.isEmpty()) {
                        switch (str6.hashCode()) {
                            case -2008589971:
                                if (str6.equals("application/epub+zip")) {
                                    r2 = 0;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case -1719571662:
                                if (str6.equals("application/vnd.oasis.opendocument.text")) {
                                    r2 = 1;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case -1664118616:
                                if (str6.equals("video/3gpp")) {
                                    r2 = 2;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case -1578389996:
                                if (str6.equals("application/vnd.ms-fontobject")) {
                                    r2 = 3;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case -1348237359:
                                if (str6.equals("application/x-cdf")) {
                                    r2 = 4;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case -1348236892:
                                if (str6.equals("application/x-csh")) {
                                    r2 = 5;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case -1079884372:
                                if (str6.equals("video/x-msvideo")) {
                                    r2 = 6;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case -1073633483:
                                break;
                            case -1071817359:
                                if (str6.equals("application/vnd.ms-powerpoint")) {
                                    r2 = 8;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case -1050893613:
                                if (str6.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document")) {
                                    r2 = 9;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case -1007601745:
                                if (str6.equals("audio/x-midi")) {
                                    r2 = 10;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case -958424608:
                                if (str6.equals("text/calendar")) {
                                    r2 = 11;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case -816908365:
                                if (str6.equals("application/x-httpd-php")) {
                                    r2 = 12;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case -648684635:
                                if (str6.equals("audio/3gpp2")) {
                                    r2 = 13;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case -433129473:
                                if (str6.equals("application/vnd.apple.installer+xml")) {
                                    r2 = 14;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case -366307023:
                                if (str6.equals("application/vnd.ms-excel")) {
                                    r2 = 15;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case -48069494:
                                if (str6.equals("video/3gpp2")) {
                                    r2 = 16;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case -43923783:
                                if (str6.equals("application/gzip")) {
                                    r2 = 17;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case -43491031:
                                if (str6.equals("application/x-sh")) {
                                    r2 = 18;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case 187091926:
                                if (str6.equals("audio/ogg")) {
                                    r2 = 19;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case 817335912:
                                if (str6.equals("text/plain")) {
                                    r2 = 20;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case 859118878:
                                if (str6.equals("application/x-abiword")) {
                                    r2 = 21;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case 886992732:
                                if (str6.equals("application/ld+json")) {
                                    r2 = 22;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case 904647503:
                                if (str6.equals("application/msword")) {
                                    r2 = 23;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case 1154306387:
                                if (str6.equals("application/x-bzip")) {
                                    r2 = 24;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case 1154455342:
                                if (str6.equals("application/x-gzip")) {
                                    r2 = 25;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case 1178484637:
                                if (str6.equals("application/octet-stream")) {
                                    r2 = 26;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case 1423759679:
                                if (str6.equals("application/x-bzip2")) {
                                    r2 = 27;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case 1436962847:
                                if (str6.equals("application/vnd.oasis.opendocument.presentation")) {
                                    r2 = 28;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case 1454024983:
                                if (str6.equals("application/x-7z-compressed")) {
                                    r2 = 29;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case 1455492626:
                                if (str6.equals("application/x-freearc")) {
                                    r2 = 30;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case 1503095341:
                                if (str6.equals("audio/3gpp")) {
                                    r2 = 31;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case 1504831518:
                                if (str6.equals("audio/mpeg")) {
                                    r2 = 32;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case 1509238306:
                                if (str6.equals("application/vnd.rar")) {
                                    r2 = 33;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case 1578362927:
                                if (str6.equals("image/vnd.microsoft.icon")) {
                                    r2 = 34;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case 1643664935:
                                if (str6.equals("application/vnd.oasis.opendocument.spreadsheet")) {
                                    r2 = 35;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case 1672200517:
                                if (str6.equals("application/vnd.amazon.ebook")) {
                                    r2 = 36;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case 1993842850:
                                if (str6.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
                                    r2 = 37;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case 2049276534:
                                if (str6.equals("application/java-archive")) {
                                    r2 = 38;
                                    break;
                                }
                                r2 = -1;
                                break;
                            case 2132236175:
                                if (str6.equals("text/javascript")) {
                                    r2 = 39;
                                    break;
                                }
                                r2 = -1;
                                break;
                            default:
                                r2 = -1;
                                break;
                        }
                        switch (r2) {
                            case 0:
                                str = "epub";
                                break;
                            case 1:
                                str = "odt";
                                break;
                            case 2:
                            case 31:
                                str = "3gp";
                                break;
                            case 3:
                                str = "eot";
                                break;
                            case 4:
                                str = "cda";
                                break;
                            case 5:
                                str = "csh";
                                break;
                            case 6:
                                str = "avi";
                                break;
                            case 7:
                                str = "pptx";
                                break;
                            case 8:
                                str = "ppt";
                                break;
                            case 9:
                                str = "docx";
                                break;
                            case 10:
                                str = "midi";
                                break;
                            case 11:
                                str = "ics";
                                break;
                            case 12:
                                str = "php";
                                break;
                            case 13:
                            case 16:
                                str = "3g2";
                                break;
                            case 14:
                                str = "mpkg";
                                break;
                            case 15:
                                str = "xls";
                                break;
                            case 17:
                            case 25:
                                str = "gz";
                                break;
                            case 18:
                                str = "sh";
                                break;
                            case 19:
                                str = "opus";
                                break;
                            case 20:
                                str = "txt";
                                break;
                            case 21:
                                str = "abw";
                                break;
                            case 22:
                                str = "jsonld";
                                break;
                            case 23:
                                str = "doc";
                                break;
                            case 24:
                                str = "bz";
                                break;
                            case 26:
                                str = "bin";
                                break;
                            case 27:
                                str = "bz2";
                                break;
                            case 28:
                                str = "odp";
                                break;
                            case 29:
                                str = "7z";
                                break;
                            case kk7.S /* 30 */:
                                str = "arc";
                                break;
                            case 32:
                                str = "mp3";
                                break;
                            case 33:
                                str = "rar";
                                break;
                            case 34:
                                str = "ico";
                                break;
                            case 35:
                                str = "ods";
                                break;
                            case 36:
                                str = "azw";
                                break;
                            case 37:
                                str = "xlsx";
                                break;
                            case 38:
                                str = "jar";
                                break;
                            case 39:
                                str = "js";
                                break;
                            default:
                                if (str6.contains("/")) {
                                    str6 = str6.substring(str6.indexOf("/") + 1);
                                }
                                if (str6.contains("-")) {
                                    str6 = str6.substring(str6.indexOf("-") + 1);
                                }
                                if (str6.contains("+")) {
                                    str6 = str6.substring(0, str6.indexOf("+"));
                                }
                                str = str6.toLowerCase();
                                break;
                        }
                    }
                    upperCase = str.toUpperCase();
                }
                if (!TextUtils.isEmpty(upperCase)) {
                    if (sb.length() > 0) {
                        sb.append(" ");
                    }
                    sb.append(upperCase.toUpperCase());
                }
                if (sb.length() <= 0) {
                    sb.append(k96.M0(2131753972, null));
                }
                hnVar.setText(sb);
                break;
            case 17:
                ds0 ds0Var = (ds0) this.b;
                ArrayList arrayList14 = (ArrayList) obj;
                arrayList14.add(c4c.j(-1, ds0Var.V1));
                arrayList14.add(c4c.C(gl.S2(k96.a0(null, null, 2131752968, ds0Var.T1))));
                break;
            case 18:
                rs0 rs0Var = (rs0) this.b;
                ArrayList arrayList15 = (ArrayList) obj;
                ArrayList arrayList16 = rs0Var.b;
                int size2 = arrayList16.size();
                int i21 = 0;
                while (i21 < size2) {
                    Object obj4 = arrayList16.get(i21);
                    i21++;
                    int i22 = dva.b;
                    c4c K5 = c4c.K(dva.class);
                    K5.H = (TL_stars.StarsTransaction) obj4;
                    K5.r = true;
                    arrayList15.add(K5);
                }
                if (rs0Var.h) {
                    arrayList15.add(c4c.e(-1, k96.M0(2131745859, null)));
                    break;
                } else if (!rs0Var.f) {
                    for (int i23 = 0; i23 < 3; i23++) {
                        arrayList15.add(c4c.q(i23, 7));
                    }
                    break;
                }
                break;
            case 19:
                ow0 ow0Var = (ow0) this.b;
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                if (((TLRPC.TL_error) obj2) == null && (qucVar = ow0Var.x0) != null) {
                    qucVar.a(tL_webViewResultUrl);
                    ow0Var.s();
                    break;
                }
                break;
            case 20:
                b(obj, obj2);
                break;
            case 21:
                c(obj, obj2);
                break;
            case 22:
                d(obj, obj2);
                break;
            case 23:
                e(obj, obj2);
                break;
            case 24:
                f(obj, obj2);
                break;
            case 25:
                g(obj, obj2);
                break;
            case 26:
                h(obj, obj2);
                break;
            case 27:
                i(obj, obj2);
                break;
            case 28:
                j(obj, obj2);
                break;
            default:
                Utilities.i.c(new kx1((String[]) this.b, (i8c) obj2, b2));
                break;
        }
    }
}
