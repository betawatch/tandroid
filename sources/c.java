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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void b(Object obj, Object obj2) {
        l9c l9cVar;
        g41 g41Var = (g41) this.b;
        g41Var.M.dismiss();
        g41Var.E = (String) obj;
        g41Var.F = (TLRPC.InputDocument) obj2;
        g41Var.x = false;
        hl.r(g41Var.e);
        g41Var.n.setSticker(g41Var.E);
        g41Var.f0(true);
        wa waVar = g41Var.a;
        if (waVar == null || (l9cVar = waVar.g3) == null) {
            return;
        }
        l9cVar.O(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void c(Object obj, Object obj2) {
        TLRPC.Chat M0;
        i91 i91Var = (i91) this.b;
        ArrayList arrayList = (ArrayList) obj;
        boolean isEmpty = i91Var.G.isEmpty();
        ArrayList arrayList2 = i91Var.x;
        boolean isEmpty2 = arrayList2.isEmpty();
        if (!isEmpty || !isEmpty2) {
            b8c c = b8c.c(1, R.drawable.menu_call_create, ob6.M0(2131749244, null));
            c.r = true;
            arrayList.add(c);
            if (!i91Var.getUserConfig().X && !i91Var.getMessagesController().E3()) {
                b8c c2 = b8c.c(2, R.drawable.menu_add_tab_24, ob6.M0(2131749215, null));
                c2.r = true;
                arrayList.add(c2);
            }
            arrayList.add(b8c.C(null));
        }
        int i = 0;
        Object[] objArr = 0;
        if (!isEmpty) {
            ArrayList arrayList3 = i91Var.G;
            int size = arrayList3.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj3 = arrayList3.get(i2);
                i2++;
                Long l = (Long) obj3;
                if (l != null && (M0 = i91Var.getMessagesController().M0(l)) != null) {
                    k81 k81Var = new k81(i91Var, objArr == true ? 1 : 0);
                    int i3 = g91.b;
                    b8c K = b8c.K(g91.class);
                    K.H = M0;
                    K.E = k81Var;
                    arrayList.add(K);
                }
            }
            arrayList.add(b8c.C(null));
        }
        if (isEmpty2) {
            return;
        }
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj4 = arrayList2.get(i);
            i++;
            f91 f91Var = (f91) obj4;
            t tVar = new t(i91Var, f91Var, (byte) 29);
            int i4 = d91.b;
            b8c K2 = b8c.K(d91.class);
            K2.H = f91Var;
            K2.E = tVar;
            K2.L(i91Var.e0(f91Var.c));
            arrayList.add(K2);
        }
        if (i91Var.F) {
            return;
        }
        arrayList.add(b8c.q(-1, 8));
        arrayList.add(b8c.q(-2, 8));
        arrayList.add(b8c.q(-3, 8));
    }

    private final void d(Object obj, Object obj2) {
        qb1 qb1Var = (qb1) this.b;
        Canvas canvas = (Canvas) obj;
        Runnable runnable = (Runnable) obj2;
        Paint paint = qb1Var.J;
        RectF rectF = qb1Var.z0;
        kb1 kb1Var = qb1Var.f;
        if (!qb1Var.g()) {
            Paint c = qb1Var.Q.c(1.0f);
            kb1Var.getEditText().setHintColor(c != null ? -1 : -2130706433);
            if (c == null) {
                runnable.run();
                return;
            }
            xt3 editText = kb1Var.getEditText();
            canvas.saveLayerAlpha(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), jn7.d4, 31);
            runnable.run();
            canvas.drawRect(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), c);
            canvas.restore();
            return;
        }
        if (qb1Var.H == null) {
            runnable.run();
            return;
        }
        canvas.translate(-kb1Var.getEditText().q0, 0.0f);
        canvas.saveLayerAlpha(0.0f, 0.0f, qb1Var.H.getWidth(), qb1Var.H.getHeight(), jn7.d4, 31);
        rectF.set(0.0f, 1.0f, qb1Var.H.getWidth(), qb1Var.H.getHeight() - 1);
        qb1Var.h(qb1Var.Q, canvas, rectF, 0.0f, true, (-kb1Var.getX()) - r13.getPaddingLeft(), ((-kb1Var.getY()) - r13.getPaddingTop()) - r13.getExtendedPaddingTop(), true);
        canvas.save();
        paint.setAlpha(jn7.u2);
        canvas.drawBitmap(qb1Var.H, 0.0f, 0.0f, paint);
        canvas.restore();
        canvas.restore();
    }

    private final void e(Object obj, Object obj2) {
        ((ng1) this.b).D0((ArrayList) obj, (l9c) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void f(Object obj, Object obj2) {
        i1b i1bVar;
        ij1 ij1Var = (ij1) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ij1Var.R0 = -1;
        TLRPC.Chat M0 = uc7.s1(ij1Var.o0).M0(Long.valueOf(-ij1Var.p0));
        TLRPC.ChatFull N0 = uc7.s1(ij1Var.o0).N0(-ij1Var.p0);
        int i = N0 != null ? N0.stats_dc : -1;
        if (ij1Var.b1) {
            arrayList.add(b8c.g(ij1Var.s0));
            i1b i1bVar2 = ij1Var.l1;
            if (i1bVar2 != null && !i1bVar2.l) {
                arrayList.add(b8c.h(5, i, i1bVar2));
                arrayList.add(b8c.B(-1, null));
            }
            i1b i1bVar3 = ij1Var.m1;
            if (i1bVar3 != null && !i1bVar3.l) {
                arrayList.add(b8c.h(2, i, i1bVar3));
                arrayList.add(b8c.B(-2, null));
            }
        }
        if (ij1Var.c1 && (i1bVar = ij1Var.n1) != null && !i1bVar.l) {
            arrayList.add(b8c.h(2, i, i1bVar));
            arrayList.add(b8c.B(-3, null));
        }
        if (ij1Var.o1) {
            arrayList.add(b8c.b(ob6.M0(2131748139, null)));
            arrayList.add(b8c.v(ij1Var.p1));
            arrayList.add(b8c.v(ij1Var.q1));
            arrayList.add(b8c.v(ij1Var.r1));
            arrayList.add(b8c.B(-4, ij1Var.u0));
        }
        if (M0 != null && M0.creator) {
            if (ij1Var.b1) {
                arrayList.add(b8c.b(ob6.M0(2131748160, null)));
                arrayList.add(b8c.k(ij1Var.w0));
                arrayList.add(b8c.B(-5, ij1Var.t0));
                int f = uc7.s1(ij1Var.o0).l4.b2.f();
                String M02 = ob6.M0(2131748119, null);
                boolean z = false;
                int i2 = ij1Var.r0 < f ? f : 0;
                if (i2 > 0) {
                    Context context = a.b;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M02);
                    spannableStringBuilder.append((CharSequence) "  L");
                    wm2 wm2Var = new wm2(0, new hc(i2, null, context, false));
                    wm2Var.s = hl.L(1.0f);
                    spannableStringBuilder.setSpan(wm2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    M02 = spannableStringBuilder;
                }
                b8c i3 = b8c.i(1, M02);
                if (ij1Var.r0 >= f && ij1Var.j1) {
                    z = true;
                }
                i3.L(z);
                arrayList.add(i3);
                arrayList.add(b8c.B(-8, ob6.M0(2131748118, null)));
            }
            if (ij1Var.c1) {
                arrayList.add(b8c.b(ob6.M0(2131748127, null)));
                arrayList.add(b8c.j(3, ij1Var.C0));
                arrayList.add(b8c.B(-6, ij1Var.v0));
            }
        }
        if (xc2.V(uc7.s1(ij1Var.o0).M0(Long.valueOf(-ij1Var.p0))) && uc7.s1(ij1Var.o0).l4.K2.f) {
            arrayList.add(yb.i(4, aob.v0(aob.lk, ij1Var.n0), g92.a0(ob6.M0(2131752449, null)), ob6.M0(2131752450, null)));
            arrayList.add(b8c.B(-7, null));
        }
        if (!ij1Var.a1.a()) {
            arrayList.add(b8c.B(-10, null));
        } else {
            ij1Var.R0 = arrayList.size();
            arrayList.add(b8c.n(ij1Var.T0, -2));
        }
    }

    private final void g(Object obj, Object obj2) {
        cj1 cj1Var = (cj1) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ej1 ej1Var = cj1Var.f;
        int i = cj1Var.d;
        int i2 = ej1.y;
        ArrayList arrayList2 = i == 0 ? ej1Var.r : ej1Var.n;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            int i4 = hza.b;
            b8c K = b8c.K(hza.class);
            K.H = (TL_stars.StarsTransaction) obj3;
            K.r = true;
            arrayList.add(K);
        }
        if (TextUtils.isEmpty(i == 0 ? ej1Var.s : ej1Var.h)) {
            return;
        }
        arrayList.add(b8c.q(arrayList.size(), 7));
        arrayList.add(b8c.q(arrayList.size(), 7));
        arrayList.add(b8c.q(arrayList.size(), 7));
    }

    private final void h(Object obj, Object obj2) {
        ((ChatActivityEnterView) this.b).y0((Canvas) obj, (hcc) obj2);
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
        l9c l9cVar;
        String str2;
        CharSequence charSequence;
        eo6 eo6Var;
        x12 x12Var = (x12) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l9c l9cVar2 = (l9c) obj2;
        boolean z2 = x12Var.Q;
        ArrayList arrayList2 = x12Var.N;
        pc7 pc7Var = x12Var.K;
        ArrayList arrayList3 = x12Var.L;
        HashSet hashSet = x12Var.J;
        ArrayList arrayList4 = x12Var.M;
        arrayList.add(b8c.E(-100, hl.L(1.0f)));
        int size = arrayList.size();
        byte b = 0;
        boolean z3 = true;
        if (TextUtils.isEmpty(x12Var.E)) {
            l9cVar2.V();
            for (int i = 0; i < x12Var.I.size(); i++) {
                eo6 eo6Var2 = (eo6) x12Var.I.get(i);
                eo6Var2.e.J5(null, true);
                b8c i2 = uea.i(eo6Var2, new p12(x12Var, b));
                i2.L(hashSet.contains(eo6Var2));
                i2.d = -1;
                arrayList.add(i2);
            }
            if (x12Var.H) {
                arrayList.add(b8c.q(11, 4));
                arrayList.add(b8c.q(12, 4));
                arrayList.add(b8c.q(13, 4));
            }
            l9cVar2.U();
            if (pc7Var != null) {
                ArrayList arrayList5 = pc7Var.c;
                int size2 = arrayList5.size();
                if (size2 < arrayList3.size()) {
                    arrayList3.subList(size2, arrayList3.size()).clear();
                }
                int i3 = 0;
                while (i3 < size2) {
                    boolean z4 = z3;
                    if (i3 >= arrayList3.size()) {
                        eo6Var = new eo6();
                        arrayList3.add(eo6Var);
                    } else {
                        eo6Var = (eo6) arrayList3.get(i3);
                    }
                    if (eo6Var.e != arrayList5.get(i3)) {
                        x12Var.m0--;
                        eo6Var.e = (r47) arrayList5.get(i3);
                    }
                    i3++;
                    z3 = z4;
                }
            }
            boolean z5 = z3;
            if (pc7Var != null && arrayList3 != null && !arrayList3.isEmpty()) {
                if (arrayList.size() > size) {
                    arrayList.add(b8c.B(-98, null));
                }
                l9cVar2.V();
                arrayList.add(b8c.t(45, ob6.M0(2131753897, null)));
                for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                    eo6 eo6Var3 = (eo6) arrayList3.get(i4);
                    b8c i5 = uea.i(eo6Var3, new p12(x12Var, (byte) 0));
                    i5.L(hashSet.contains(eo6Var3));
                    arrayList.add(i5);
                }
                if (pc7Var.f) {
                    arrayList.add(b8c.q(41, 4));
                    arrayList.add(b8c.q(42, 4));
                    arrayList.add(b8c.q(43, 4));
                }
                if (!pc7Var.f && !pc7Var.e) {
                    b8c c = b8c.c(x12Var.S, R.drawable.arrow_more, ob6.M0(2131745067, null));
                    c.r = z5;
                    arrayList.add(c);
                }
                l9cVar2.U();
            }
            if (arrayList4 != null && (!arrayList4.isEmpty() || x12Var.V >= 0 || x12Var.a0)) {
                if (arrayList.size() > size) {
                    arrayList.add(b8c.B(-98, null));
                }
                l9cVar2.V();
                arrayList.add(b8c.t(((x12Var.V >= 0 || x12Var.a0) && arrayList4.isEmpty()) ? 25 : 20, ob6.M0(2131753900, null)));
                for (int i6 = 0; i6 < arrayList4.size(); i6++) {
                    eo6 eo6Var4 = (eo6) arrayList4.get(i6);
                    eo6Var4.e.J5(x12Var.E, true);
                    b8c i7 = uea.i(eo6Var4, new p12(x12Var, (byte) 0));
                    i7.L(hashSet.contains(eo6Var4));
                    arrayList.add(i7);
                }
                if (x12Var.V >= 0 || x12Var.a0) {
                    arrayList.add(b8c.q(21, 4));
                    arrayList.add(b8c.q(22, 4));
                    arrayList.add(b8c.q(23, 4));
                }
                if (x12Var.d0) {
                    b8c c2 = b8c.c(z2 ? 1 : 0, R.drawable.arrow_more, ob6.M0(2131745067, null));
                    c2.r = true;
                    arrayList.add(c2);
                }
                l9cVar2.U();
            }
        } else {
            String lowerCase = x12Var.E.toLowerCase();
            String I3 = hl.I3(lowerCase);
            boolean z6 = false;
            int i8 = 0;
            while (i8 < x12Var.I.size()) {
                eo6 eo6Var5 = (eo6) x12Var.I.get(i8);
                String str3 = eo6Var5.a;
                if (str3 != null) {
                    String lowerCase2 = str3.toLowerCase();
                    String I32 = hl.I3(lowerCase2);
                    if (lowerCase2.startsWith(lowerCase) || uh9.t(" ", lowerCase, lowerCase2) || I32.startsWith(I3) || I32.contains(" ".concat(I3))) {
                        z = true;
                        str = eo6Var5.b;
                        if (str == null) {
                            String lowerCase3 = str.toLowerCase();
                            l9cVar = l9cVar2;
                            String I33 = hl.I3(lowerCase3);
                            z = z || lowerCase3.startsWith(lowerCase) || uh9.t(" ", lowerCase, lowerCase3) || I33.startsWith(I3) || I33.contains(" ".concat(I3));
                        } else {
                            l9cVar = l9cVar2;
                        }
                        if (z) {
                            if (!z6) {
                                if (arrayList.size() > size) {
                                    str2 = null;
                                    arrayList.add(b8c.B(-97, null));
                                } else {
                                    str2 = null;
                                }
                                l9cVar.V();
                                arrayList.add(b8c.t(10, ob6.M0(2131753898, str2)));
                                z6 = true;
                            }
                            eo6Var5.e.J5(x12Var.E, true);
                            b8c i9 = uea.i(eo6Var5, new p12(x12Var, (byte) 0));
                            i9.L(hashSet.contains(eo6Var5));
                            i9.d = 10;
                            arrayList.add(i9);
                        }
                        i8++;
                        l9cVar2 = l9cVar;
                    }
                }
                z = false;
                str = eo6Var5.b;
                if (str == null) {
                }
                if (z) {
                }
                i8++;
                l9cVar2 = l9cVar;
            }
            l9c l9cVar3 = l9cVar2;
            l9cVar3.U();
            if (arrayList4 != null && (!arrayList4.isEmpty() || x12Var.V >= 0 || x12Var.a0)) {
                if (arrayList.size() > size) {
                    arrayList.add(b8c.B(-98, null));
                }
                l9cVar3.V();
                arrayList.add(b8c.t(((x12Var.V >= 0 || x12Var.a0) && arrayList4.isEmpty()) ? 25 : 20, ob6.M0(2131753900, null)));
                for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                    eo6 eo6Var6 = (eo6) arrayList4.get(i10);
                    eo6Var6.e.J5(x12Var.E, true);
                    b8c i11 = uea.i(eo6Var6, new p12(x12Var, (byte) 0));
                    i11.L(hashSet.contains(eo6Var6));
                    arrayList.add(i11);
                }
                if (x12Var.V >= 0 || x12Var.a0) {
                    arrayList.add(b8c.q(21, 4));
                    arrayList.add(b8c.q(22, 4));
                    arrayList.add(b8c.q(23, 4));
                }
                if (x12Var.d0) {
                    b8c c3 = b8c.c(z2 ? 1 : 0, R.drawable.arrow_more, ob6.M0(2131745067, null));
                    c3.r = true;
                    arrayList.add(c3);
                }
                l9cVar3.U();
            }
            if (arrayList2 != null && (!arrayList2.isEmpty() || x12Var.e0 >= 0 || x12Var.n0)) {
                if (arrayList.size() > size) {
                    arrayList.add(b8c.B(-96, null));
                }
                l9cVar3.V();
                arrayList.add(b8c.t(((x12Var.e0 >= 0 || x12Var.n0) && arrayList2.isEmpty()) ? 35 : 30, ob6.M0(2131753899, null)));
                int size3 = arrayList2.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    eo6 eo6Var7 = (eo6) arrayList2.get(i12);
                    eo6Var7.e.J5(x12Var.E, true);
                    b8c i13 = uea.i(eo6Var7, new p12(x12Var, (byte) 0));
                    i13.L(hashSet.contains(eo6Var7));
                    arrayList.add(i13);
                }
                if (x12Var.e0 >= 0 || x12Var.n0) {
                    arrayList.add(b8c.q(31, 4));
                    arrayList.add(b8c.q(32, 4));
                    arrayList.add(b8c.q(33, 4));
                }
                if (x12Var.h0) {
                    b8c c4 = b8c.c(x12Var.R, R.drawable.arrow_more, ob6.M0(2131745067, null));
                    c4.r = true;
                    arrayList.add(c4);
                }
                l9cVar3.U();
            }
        }
        if (arrayList.size() > size || x12Var.H) {
            charSequence = null;
        } else if (TextUtils.isEmpty(x12Var.E)) {
            charSequence = null;
            arrayList.add(v12.i(ob6.M0(2131747975, null), ob6.M0(2131747976, null)));
        } else {
            charSequence = null;
            arrayList.add(v12.i(hl.S2(ob6.a0(null, null, x12Var.E.length() >= 3 ? 2131747972 : 2131747973, x12Var.E)), ob6.M0(2131747974, null)));
        }
        arrayList.add(b8c.B(-99, charSequence));
    }

    private final void j(Object obj, Object obj2) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
        boolean z = ChatAttachAlertPhotoLayout.r1;
        ((Runnable) obj2).run();
        chatAttachAlertPhotoLayout.setStarsPrice(((Long) obj).longValue());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x02d3, code lost:
    
        if (r1.equals("application/vnd.ms-fontobject") == false) goto L172;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x08ae  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0908  */
    @Override // icc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        String str;
        b8c i;
        TL_iv.RichMessage richMessage;
        b8c i2;
        TL_iv.RichMessage richMessage2;
        String substring;
        String str2;
        b8c i3;
        TL_iv.RichMessage richMessage3;
        String substring2;
        String substring3;
        ArrayList arrayList;
        db dbVar;
        int size;
        int i4;
        int i5;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        String upperCase;
        gzc gzcVar;
        int i6 = 2;
        str = "";
        byte b = 16;
        byte b2 = 4;
        char c = 3;
        byte b3 = 7;
        final byte b4 = 1;
        final byte b5 = 0;
        switch (this.a) {
            case 0:
                b1 b1Var = (b1) this.b;
                ArrayList arrayList2 = (ArrayList) obj;
                l9c l9cVar = (l9c) obj2;
                boolean[] zArr = b1Var.k2;
                boolean[] zArr2 = b1Var.l2;
                a1 a1Var = b1Var.u2;
                arrayList2.add(b8c.C(null));
                arrayList2.add(b8c.m(b1Var.s2));
                arrayList2.add(b8c.C(null));
                l9cVar.G = true;
                l9cVar.V();
                a1 a1Var2 = b1Var.t2;
                int selectedTab = a1Var2 != null ? a1Var2.getSelectedTab() : 0;
                if (selectedTab == 0) {
                    String str3 = b1Var.m2;
                    if (str3 == null || str3.equalsIgnoreCase("und")) {
                        arrayList2.add(v3c.i(3, ob6.M0(2131754983, null), null, null, null));
                    } else {
                        String K0 = r3c.K0(b1Var.m2, null, zArr2);
                        String M0 = ob6.M0((zArr2 == null || !zArr2[0]) ? 2131754990 : 2131754991, null);
                        int indexOf = M0.indexOf("%s");
                        if (indexOf < 0) {
                            substring3 = "";
                            substring2 = substring3;
                        } else {
                            substring2 = M0.substring(0, indexOf);
                            substring3 = M0.substring(indexOf + 2);
                        }
                        if (TextUtils.isEmpty(substring2)) {
                            K0 = r3c.F0(K0);
                        }
                        arrayList2.add(v3c.i(3, substring2, K0, substring3, null));
                    }
                    arrayList2.add(b1Var.j1() ? b1Var.l1(4, b1Var.T1, false) : z3c.i(4, b1Var.S1, b1Var.R2, new b(b1Var, b2), null, null));
                    String K02 = r3c.K0(b1Var.n2, zArr, null);
                    String M02 = ob6.M0((zArr == null || !zArr[0]) ? 2131754957 : 2131754958, null);
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
                        K02 = r3c.F0(K02);
                    }
                    StringBuilder r = qd4.r(K02);
                    r.append(b1Var.o2 != null ? c00.k(new StringBuilder(" ("), b1Var.o2, ")") : "");
                    arrayList2.add(v3c.j(5, str2, r.toString(), substring, new b(b1Var, (byte) 5), b1Var.q2, new b(b1Var, (byte) 6), null));
                    boolean j1 = b1Var.j1();
                    boolean z = b1Var.U1;
                    if (j1) {
                        if (z || (richMessage3 = b1Var.W1) == null) {
                            richMessage3 = b1Var.T1;
                        }
                        i3 = b1Var.l1(6, richMessage3, z);
                    } else {
                        i3 = z3c.i(z ? 7 : 6, b1Var.V1, false, null, null, !z ? new b(b1Var, b3) : null);
                    }
                    arrayList2.add(i3);
                } else if (selectedTab == 1) {
                    arrayList2.add(b8c.k(a1Var));
                    if (a1Var.getSelectedTone() instanceof u0) {
                        arrayList2.add(b8c.j(10, b1Var.w2));
                        l9cVar.U();
                        arrayList2.add(b8c.B(11, null));
                        l9cVar.V();
                    }
                    if ((a1Var.getSelectedTab() >= 0 || b1Var.q2) && (!(a1Var.getSelectedTone() instanceof u0) || TextUtils.equals(b1Var.x2.getText().toString(), b1Var.F2))) {
                        arrayList2.add(v3c.j(7, ob6.M0(2131754981, null), null, null, null, b1Var.q2, new b(b1Var, (byte) 6), null));
                        boolean j12 = b1Var.j1();
                        boolean z2 = b1Var.X1;
                        if (j12) {
                            if (z2 || (richMessage2 = b1Var.Z1) == null) {
                                richMessage2 = b1Var.T1;
                            }
                            i2 = b1Var.l1(8, richMessage2, z2);
                        } else {
                            i2 = z3c.i(z2 ? 7 : 6, b1Var.Y1, false, null, null, !z2 ? new b(b1Var, b3) : null);
                        }
                        arrayList2.add(i2);
                    } else {
                        arrayList2.add(v3c.j(5, ob6.M0(2131754984, null), null, null, null, b1Var.q2, new b(b1Var, (byte) 6), null));
                        arrayList2.add(b1Var.j1() ? b1Var.l1(6, b1Var.T1, false) : z3c.i(b1Var.X1 ? 7 : 6, b1Var.S1, false, null, null, null));
                    }
                } else if (selectedTab == 2) {
                    arrayList2.add(v3c.i(3, ob6.M0(2131754984, null), null, null, null));
                    arrayList2.add(b1Var.j1() ? b1Var.l1(4, b1Var.T1, false) : z3c.i(4, b1Var.S1, b1Var.R2, new b(b1Var, b2), null, null));
                    arrayList2.add(v3c.i(5, ob6.M0(2131754981, null), null, null, null));
                    boolean j13 = b1Var.j1();
                    boolean z3 = b1Var.a2;
                    if (j13) {
                        if (z3 || (richMessage = b1Var.c2) == null) {
                            richMessage = b1Var.T1;
                        }
                        i = b1Var.l1(6, richMessage, z3);
                    } else {
                        i = z3c.i(z3 ? 7 : 6, b1Var.b2, false, null, null, !z3 ? new b(b1Var, b3) : null);
                    }
                    arrayList2.add(i);
                }
                l9cVar.U();
                if (b1Var.i1()) {
                    arrayList2.add(b8c.B(21, null));
                    l9cVar.V();
                    arrayList2.add(b8c.j(20, b1Var.S2));
                    l9cVar.U();
                    arrayList2.add(b8c.B(22, "Every message you send in this chat will be rewritten with these settings."));
                    break;
                } else {
                    arrayList2.add(b8c.C(null));
                    break;
                }
                break;
            case 1:
                f0 f0Var = (f0) this.b;
                ArrayList arrayList3 = (ArrayList) obj;
                l9c l9cVar2 = (l9c) obj2;
                l9cVar2.G = true;
                arrayList3.add(b8c.C(null));
                FrameLayout frameLayout = f0Var.V1;
                b8c b8cVar = new b8c(-4);
                b8cVar.c = frameLayout;
                b8cVar.A = -1;
                b8cVar.e = true;
                arrayList3.add(b8cVar);
                arrayList3.add(b8c.C(null));
                arrayList3.add(b8c.m(f0Var.W1));
                arrayList3.add(b8c.D(hl.L(1.0f)));
                arrayList3.add(b8c.m(f0Var.X1));
                arrayList3.add(b8c.D(hl.L(24.0f)));
                TL_aicompose.AiComposeTone aiComposeTone = f0Var.S1;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    TL_aicompose.aiComposeToneExample aicomposetoneexample = f0Var.d2[f0Var.c2];
                    l9cVar2.V();
                    arrayList3.add(v3c.j(3, ob6.M0(2131754998, null), null, null, null, false, null, new b0(f0Var, b4)));
                    arrayList3.add(z3c.i(4, aicomposetoneexample == null ? f0.a1() : r47.h0(aicomposetoneexample.from, false), false, null, null, null));
                    arrayList3.add(v3c.i(5, ob6.M0(2131755001, null), null, null, null));
                    arrayList3.add(z3c.i(6, aicomposetoneexample == null ? f0.a1() : r47.h0(aicomposetoneexample.to, false), false, null, null, null));
                    l9cVar2.U();
                    TLRPC.User X1 = tL_aiComposeTone.author_id != 0 ? uc7.s1(f0Var.a).X1(Long.valueOf(tL_aiComposeTone.author_id)) : null;
                    String p = lbc.p(X1);
                    int i7 = tL_aiComposeTone.installs_count;
                    if (X1 != null) {
                        arrayList3.add(b8c.C(hl.M2((i7 > 0 ? ob6.G(i7, "AIEditorUsedBy", new Object[0]).concat(" ") : "").concat(TextUtils.isEmpty(p) ? ob6.a0(null, null, 2131754996, lbc.r(X1)) : ob6.a0(null, null, 2131754996, c00.i("@", p))), aob.Xc, f0Var.J0, new ve2(f0Var, tL_aiComposeTone, (byte) 16), false)));
                    } else if (i7 > 0) {
                        arrayList3.add(b8c.C(ob6.G(i7, "AIEditorUsedBy", new Object[0])));
                    }
                }
                arrayList3.add(b8c.D(hl.L(32.0f)));
                break;
            case 2:
                s0 s0Var = (s0) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                arrayList4.add(b8c.C(null));
                arrayList4.add(b8c.m(s0Var.S1));
                arrayList4.add(b8c.C(null));
                arrayList4.add(b8c.k(s0Var.V1));
                arrayList4.add(b8c.C(null));
                arrayList4.add(b8c.k(s0Var.W1));
                arrayList4.add(b8c.C(null));
                if (s0Var.e2 != null) {
                    b8c e = b8c.e(1, ob6.M0(2131754995, null));
                    e.s = true;
                    arrayList4.add(e);
                    arrayList4.add(b8c.C(null));
                }
                arrayList4.add(b8c.m(s0Var.X1));
                break;
            case 3:
                p5 p5Var = (p5) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                List<TL_stars.TL_StarGiftAuctionAcquiredGift> list = p5Var.S1;
                if (list != null) {
                    for (TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift : list) {
                        kv4 kv4Var = p5Var.T1;
                        t tVar = new t(p5Var, tL_StarGiftAuctionAcquiredGift, (byte) 3);
                        int i8 = n5.b;
                        b8c K = b8c.K(n5.class);
                        K.H = tL_StarGiftAuctionAcquiredGift;
                        K.I = kv4Var;
                        K.E = tVar;
                        arrayList5.add(K);
                    }
                    arrayList5.add(b8c.D(hl.L(16.0f)));
                    break;
                }
                break;
            case 4:
                ((ArrayList) obj).add(((k9) this.b).S1);
                break;
            case 5:
                final fb fbVar = (fb) this.b;
                ArrayList arrayList6 = (ArrayList) obj;
                db dbVar2 = fbVar.E;
                ArrayList arrayList7 = fbVar.y;
                if (!fbVar.b && arrayList7.isEmpty()) {
                    arrayList6.add(b8c.k(fbVar.d));
                }
                SharedPreferences sharedPreferences = fbVar.getContext().getSharedPreferences("webhistory", 0);
                ArrayList arrayList8 = new ArrayList();
                String string = sharedPreferences.getString("queries_json", null);
                if (string != null) {
                    try {
                        arrayList = new ArrayList();
                        JSONArray jSONArray = new JSONArray(string);
                        int i9 = 0;
                        while (i9 < jSONArray.length()) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i9);
                            dbVar = dbVar2;
                            try {
                                eb ebVar = new eb(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                                ebVar.c = jSONObject.optDouble("rank", 0.0d);
                                arrayList.add(ebVar);
                                i9++;
                                dbVar2 = dbVar;
                            } catch (Exception unused) {
                            }
                        }
                        dbVar = dbVar2;
                        Collections.sort(arrayList, new ta((byte) 0));
                        size = arrayList.size();
                        i4 = 0;
                    } catch (Exception unused2) {
                    }
                    while (i4 < size) {
                        Object obj3 = arrayList.get(i4);
                        i4++;
                        eb ebVar2 = (eb) obj3;
                        if (arrayList8.size() >= 20) {
                            arrayList7.size();
                            arrayList8.size();
                            if (!arrayList7.isEmpty()) {
                                arrayList6.add(b8c.k(fbVar.w));
                            }
                            i5 = 0;
                            while (i5 < arrayList7.size()) {
                                final String str4 = (String) arrayList7.get(i5);
                                boolean z4 = i5 == 0;
                                boolean z5 = i5 == arrayList7.size() - 1;
                                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: va
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        byte b6 = b5;
                                        String str5 = str4;
                                        fb fbVar2 = fbVar;
                                        switch (b6) {
                                            case 0:
                                                vs vsVar = fbVar2.N;
                                                if (vsVar != null) {
                                                    vsVar.a(str5);
                                                    break;
                                                }
                                                break;
                                            default:
                                                vs vsVar2 = fbVar2.N;
                                                if (vsVar2 != null) {
                                                    vsVar2.a(str5);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                int i10 = xa.b;
                                b8c K2 = b8c.K(xa.class);
                                K2.A = 1;
                                K2.m = str4;
                                K2.E = onClickListener;
                                K2.r = z4;
                                K2.s = z5;
                                K2.H = Boolean.TRUE;
                                K2.I = fbVar;
                                arrayList6.add(K2);
                                i5++;
                            }
                            if (!arrayList8.isEmpty()) {
                                arrayList6.add(b8c.s(ob6.M0(2131742543, null), ob6.M0(2131742547, null), new k1(fbVar, (byte) 5)));
                                int i11 = 0;
                                while (i11 < arrayList8.size()) {
                                    final String str5 = (String) arrayList8.get(i11);
                                    boolean z6 = i11 == 0;
                                    boolean z7 = i11 == arrayList8.size() - 1;
                                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: va
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            byte b6 = b4;
                                            String str52 = str5;
                                            fb fbVar2 = fbVar;
                                            switch (b6) {
                                                case 0:
                                                    vs vsVar = fbVar2.N;
                                                    if (vsVar != null) {
                                                        vsVar.a(str52);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    vs vsVar2 = fbVar2.N;
                                                    if (vsVar2 != null) {
                                                        vsVar2.a(str52);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    int i12 = xa.b;
                                    b8c K3 = b8c.K(xa.class);
                                    K3.A = 0;
                                    K3.m = str5;
                                    K3.E = onClickListener2;
                                    K3.r = z6;
                                    K3.s = z7;
                                    K3.H = Boolean.TRUE;
                                    K3.I = fbVar;
                                    arrayList6.add(K3);
                                    i11++;
                                }
                            }
                            if (dbVar != null) {
                                db dbVar3 = dbVar;
                                ArrayList arrayList9 = dbVar3.a;
                                if (!arrayList9.isEmpty()) {
                                    arrayList6.add(b8c.r(ob6.M0(2131742544, null)));
                                    while (b5 < arrayList9.size()) {
                                        r47 r47Var = (r47) arrayList9.get(b5);
                                        if (!TextUtils.isEmpty(fb.a(r47Var))) {
                                            int i13 = bb.b;
                                            b8c K4 = b8c.K(bb.class);
                                            K4.A = 3;
                                            K4.r = true;
                                            K4.I = r47Var;
                                            arrayList6.add(K4);
                                        }
                                        b5++;
                                    }
                                    if (!dbVar3.f) {
                                        arrayList6.add(b8c.q(arrayList6.size(), 32));
                                        arrayList6.add(b8c.q(arrayList6.size(), 32));
                                        arrayList6.add(b8c.q(arrayList6.size(), 32));
                                        break;
                                    }
                                }
                            }
                        } else {
                            arrayList8.add(ebVar2.a);
                        }
                    }
                    arrayList7.size();
                    arrayList8.size();
                    if (!arrayList7.isEmpty()) {
                    }
                    i5 = 0;
                    while (i5 < arrayList7.size()) {
                    }
                    if (!arrayList8.isEmpty()) {
                    }
                    if (dbVar != null) {
                    }
                }
                dbVar = dbVar2;
                arrayList7.size();
                arrayList8.size();
                if (!arrayList7.isEmpty()) {
                }
                i5 = 0;
                while (i5 < arrayList7.size()) {
                }
                if (!arrayList8.isEmpty()) {
                }
                if (dbVar != null) {
                }
                break;
            case 6:
                jb jbVar = (jb) this.b;
                ArrayList arrayList10 = (ArrayList) obj;
                boolean z8 = jbVar.W1;
                if (jbVar.T1 != null) {
                    arrayList10.add(b8c.C(null));
                    arrayList10.add(b8c.u(ob6.M0(2131750967, null)));
                    b8c A = b8c.A(jbVar.Z0(0), ob6.M0(z8 ? 2131750946 : 2131750944, null), 2);
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = jbVar.T1;
                    A.L(tL_channelAdminLogEventsFilter.promote || tL_channelAdminLogEventsFilter.demote || (z8 && (tL_channelAdminLogEventsFilter.kick || tL_channelAdminLogEventsFilter.ban || tL_channelAdminLogEventsFilter.unkick || tL_channelAdminLogEventsFilter.unban)) || tL_channelAdminLogEventsFilter.invite || tL_channelAdminLogEventsFilter.join || tL_channelAdminLogEventsFilter.leave || tL_channelAdminLogEventsFilter.edit_rank);
                    A.f = !jbVar.Y1;
                    A.E = new ib(jbVar, b5, b5);
                    arrayList10.add(A);
                    if (jbVar.Y1) {
                        b8c z9 = b8c.z(3, ob6.M0(2131750949, null));
                        z9.i = 1;
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = jbVar.T1;
                        z9.L(tL_channelAdminLogEventsFilter2.promote || tL_channelAdminLogEventsFilter2.demote);
                        arrayList10.add(z9);
                        if (z8) {
                            b8c z10 = b8c.z(4, ob6.M0(2131750952, null));
                            z10.i = 1;
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = jbVar.T1;
                            z10.L(tL_channelAdminLogEventsFilter3.kick || tL_channelAdminLogEventsFilter3.ban || tL_channelAdminLogEventsFilter3.unkick || tL_channelAdminLogEventsFilter3.unban);
                            arrayList10.add(z10);
                        }
                        b8c z11 = b8c.z(5, ob6.M0(z8 ? 2131750953 : 2131750951, null));
                        z11.i = 1;
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = jbVar.T1;
                        z11.L(tL_channelAdminLogEventsFilter4.invite || tL_channelAdminLogEventsFilter4.join);
                        arrayList10.add(z11);
                        b8c z12 = b8c.z(6, ob6.M0(z8 ? 2131750957 : 2131750956, null));
                        z12.i = 1;
                        z12.L(jbVar.T1.leave);
                        arrayList10.add(z12);
                        if (z8) {
                            b8c z13 = b8c.z(7, ob6.M0(2131750955, null));
                            z13.i = 1;
                            z13.L(jbVar.T1.edit_rank);
                            arrayList10.add(z13);
                        }
                    }
                    b8c A2 = b8c.A(jbVar.Z0(1), ob6.M0(z8 ? 2131750947 : 2131750948, null), 8);
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = jbVar.T1;
                    A2.L(tL_channelAdminLogEventsFilter5.info || tL_channelAdminLogEventsFilter5.settings || tL_channelAdminLogEventsFilter5.invites || tL_channelAdminLogEventsFilter5.group_call);
                    A2.f = !jbVar.Z1;
                    A2.E = new ib(jbVar, b4, b5);
                    arrayList10.add(A2);
                    if (jbVar.Z1) {
                        b8c z14 = b8c.z(9, ob6.M0(z8 ? 2131750960 : 2131750963, null));
                        z14.i = 1;
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = jbVar.T1;
                        z14.L(tL_channelAdminLogEventsFilter6.info || tL_channelAdminLogEventsFilter6.settings);
                        arrayList10.add(z14);
                        b8c z15 = b8c.z(10, ob6.M0(2131750959, null));
                        z15.i = 1;
                        z15.L(jbVar.T1.invites);
                        arrayList10.add(z15);
                        b8c z16 = b8c.z(11, ob6.M0(2131750964, null));
                        z16.i = 1;
                        z16.L(jbVar.T1.group_call);
                        arrayList10.add(z16);
                    }
                    b8c A3 = b8c.A(jbVar.Z0(2), ob6.M0(2131750945, null), 12);
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = jbVar.T1;
                    A3.L(tL_channelAdminLogEventsFilter7.delete || tL_channelAdminLogEventsFilter7.edit || tL_channelAdminLogEventsFilter7.pinned);
                    A3.f = !jbVar.a2;
                    A3.E = new ib(jbVar, i6, b5);
                    arrayList10.add(A3);
                    if (jbVar.a2) {
                        b8c z17 = b8c.z(13, ob6.M0(2131750962, null));
                        z17.i = 1;
                        z17.L(jbVar.T1.delete);
                        arrayList10.add(z17);
                        b8c z18 = b8c.z(14, ob6.M0(2131750961, null));
                        z18.i = 1;
                        z18.L(jbVar.T1.edit);
                        arrayList10.add(z18);
                        b8c z19 = b8c.z(15, ob6.M0(2131750950, null));
                        z19.i = 1;
                        z19.L(jbVar.T1.pinned);
                        arrayList10.add(z19);
                    }
                    arrayList10.add(b8c.C(null));
                    arrayList10.add(b8c.u(ob6.M0(2131750966, null)));
                    b8c z20 = b8c.z(16, ob6.M0(2131750965, null));
                    zh6 zh6Var = jbVar.V1;
                    int m = zh6Var == null ? 0 : zh6Var.m();
                    ArrayList arrayList11 = jbVar.U1;
                    z20.L(m >= (arrayList11 == null ? 0 : arrayList11.size()));
                    arrayList10.add(z20);
                    if (jbVar.U1 != null) {
                        for (int i14 = 0; i14 < jbVar.U1.size(); i14++) {
                            long n = wf3.n(((TLRPC.ChannelParticipant) jbVar.U1.get(i14)).peer);
                            TLRPC.User X12 = uc7.s1(jbVar.a).X1(Long.valueOf(n));
                            b8c b8cVar2 = new b8c(37);
                            b8cVar2.d = (-1) - i14;
                            b8cVar2.H = X12;
                            b8cVar2.i = 1;
                            zh6 zh6Var2 = jbVar.V1;
                            b8cVar2.L(zh6Var2 != null && zh6Var2.d(n));
                            arrayList10.add(b8cVar2);
                        }
                        break;
                    }
                }
                break;
            case 7:
                ((cc) this.b).D0((ArrayList) obj, (l9c) obj2);
                break;
            case 8:
                qe2 qe2Var = (qe2) this.b;
                TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI = (TLRPC.TL_composedMessageWithAI) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null && tL_composedMessageWithAI != null && (tL_textWithEntities = tL_composedMessageWithAI.result_text) != null) {
                    qe2Var.a(r47.h0(tL_textWithEntities, false), null);
                    break;
                } else {
                    if (tL_error == null) {
                        tL_error = new TLRPC.TL_error();
                    }
                    qe2Var.a(null, tL_error);
                    break;
                }
            case 9:
                jc jcVar = (jc) this.b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                ArrayList arrayList12 = jcVar.b;
                jcVar.f = -1;
                jcVar.g = System.currentTimeMillis();
                if (tones instanceof TL_aicompose.TL_tones) {
                    uc7.s1(jcVar.a).j4(tones.users, false);
                    arrayList12.clear();
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    arrayList12.addAll(tL_tones.tones);
                    jcVar.c = tL_tones.hash;
                    jcVar.d();
                    jcVar.c();
                    break;
                }
                break;
            case 10:
                ArrayList arrayList13 = (ArrayList) obj;
                arrayList13.add(((uy) this.b).T1);
                arrayList13.add(b8c.D(hl.L(16.0f)));
                break;
            case 11:
                ((ArrayList) obj).add(b8c.j(-1, ((fz) this.b).U1));
                break;
            case 12:
                ((ArrayList) obj).add(b8c.j(-1, ((mz) this.b).U1));
                break;
            case 13:
                dc0 dc0Var = (dc0) this.b;
                dc0Var.w.setBackground(new BitmapDrawable((Bitmap) obj));
                dc0Var.x = false;
                nz4 nz4Var = dc0Var.h;
                nz4Var.a((Bitmap) obj2);
                uk0.c(nz4Var, dc0Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = dc0Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    break;
                }
                break;
            case 14:
                ((dd0) this.b).Z((ArrayList) obj, (l9c) obj2);
                break;
            case 15:
                ((vo0) this.b).Y((ArrayList) obj);
                break;
            case 16:
                in inVar = (in) this.b;
                String str6 = (String) obj;
                Long l = (Long) obj2;
                StringBuilder sb = new StringBuilder();
                if (l.longValue() > 0) {
                    sb.append("~");
                    sb.append(hl.i0(l.longValue(), false, false));
                }
                if (str6 == null) {
                    upperCase = null;
                } else {
                    if (!str6.isEmpty()) {
                        switch (str6.hashCode()) {
                            case -2008589971:
                                if (str6.equals("application/epub+zip")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1719571662:
                                if (str6.equals("application/vnd.oasis.opendocument.text")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1664118616:
                                if (str6.equals("video/3gpp")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1578389996:
                                break;
                            case -1348237359:
                                if (str6.equals("application/x-cdf")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1348236892:
                                if (str6.equals("application/x-csh")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1079884372:
                                if (str6.equals("video/x-msvideo")) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1073633483:
                                if (str6.equals("application/vnd.openxmlformats-officedocument.presentationml.presentation")) {
                                    c = 7;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1071817359:
                                if (str6.equals("application/vnd.ms-powerpoint")) {
                                    c = '\b';
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1050893613:
                                if (str6.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document")) {
                                    c = '\t';
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1007601745:
                                if (str6.equals("audio/x-midi")) {
                                    c = '\n';
                                    break;
                                }
                                c = 65535;
                                break;
                            case -958424608:
                                if (str6.equals("text/calendar")) {
                                    c = 11;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -816908365:
                                if (str6.equals("application/x-httpd-php")) {
                                    c = '\f';
                                    break;
                                }
                                c = 65535;
                                break;
                            case -648684635:
                                if (str6.equals("audio/3gpp2")) {
                                    c = '\r';
                                    break;
                                }
                                c = 65535;
                                break;
                            case -433129473:
                                if (str6.equals("application/vnd.apple.installer+xml")) {
                                    c = 14;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -366307023:
                                if (str6.equals("application/vnd.ms-excel")) {
                                    c = 15;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -48069494:
                                if (str6.equals("video/3gpp2")) {
                                    c = 16;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -43923783:
                                if (str6.equals("application/gzip")) {
                                    c = 17;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -43491031:
                                if (str6.equals("application/x-sh")) {
                                    c = 18;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 187091926:
                                if (str6.equals("audio/ogg")) {
                                    c = 19;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 817335912:
                                if (str6.equals("text/plain")) {
                                    c = 20;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 859118878:
                                if (str6.equals("application/x-abiword")) {
                                    c = 21;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 886992732:
                                if (str6.equals("application/ld+json")) {
                                    c = 22;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 904647503:
                                if (str6.equals("application/msword")) {
                                    c = 23;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1154306387:
                                if (str6.equals("application/x-bzip")) {
                                    c = 24;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1154455342:
                                if (str6.equals("application/x-gzip")) {
                                    c = 25;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1178484637:
                                if (str6.equals("application/octet-stream")) {
                                    c = 26;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1423759679:
                                if (str6.equals("application/x-bzip2")) {
                                    c = 27;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1436962847:
                                if (str6.equals("application/vnd.oasis.opendocument.presentation")) {
                                    c = 28;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1454024983:
                                if (str6.equals("application/x-7z-compressed")) {
                                    c = 29;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1455492626:
                                if (str6.equals("application/x-freearc")) {
                                    c = 30;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1503095341:
                                if (str6.equals("audio/3gpp")) {
                                    c = 31;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1504831518:
                                if (str6.equals("audio/mpeg")) {
                                    c = ' ';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1509238306:
                                if (str6.equals("application/vnd.rar")) {
                                    c = '!';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1578362927:
                                if (str6.equals("image/vnd.microsoft.icon")) {
                                    c = '\"';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1643664935:
                                if (str6.equals("application/vnd.oasis.opendocument.spreadsheet")) {
                                    c = '#';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1672200517:
                                if (str6.equals("application/vnd.amazon.ebook")) {
                                    c = '$';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1993842850:
                                if (str6.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
                                    c = '%';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2049276534:
                                if (str6.equals("application/java-archive")) {
                                    c = '&';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2132236175:
                                if (str6.equals("text/javascript")) {
                                    c = '\'';
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
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
                            case '\b':
                                str = "ppt";
                                break;
                            case '\t':
                                str = "docx";
                                break;
                            case '\n':
                                str = "midi";
                                break;
                            case 11:
                                str = "ics";
                                break;
                            case '\f':
                                str = "php";
                                break;
                            case '\r':
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
                            case jn7.S /* 30 */:
                                str = "arc";
                                break;
                            case ' ':
                                str = "mp3";
                                break;
                            case '!':
                                str = "rar";
                                break;
                            case '\"':
                                str = "ico";
                                break;
                            case '#':
                                str = "ods";
                                break;
                            case '$':
                                str = "azw";
                                break;
                            case '%':
                                str = "xlsx";
                                break;
                            case '&':
                                str = "jar";
                                break;
                            case '\'':
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
                    sb.append(ob6.M0(2131753968, null));
                }
                inVar.setText(sb);
                break;
            case 17:
                ls0 ls0Var = (ls0) this.b;
                ArrayList arrayList14 = (ArrayList) obj;
                arrayList14.add(b8c.j(-1, ls0Var.V1));
                arrayList14.add(b8c.C(hl.S2(ob6.a0(null, null, 2131752961, ls0Var.T1))));
                break;
            case 18:
                zs0 zs0Var = (zs0) this.b;
                ArrayList arrayList15 = (ArrayList) obj;
                ArrayList arrayList16 = zs0Var.b;
                int size2 = arrayList16.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj4 = arrayList16.get(i15);
                    i15++;
                    int i16 = hza.b;
                    b8c K5 = b8c.K(hza.class);
                    K5.H = (TL_stars.StarsTransaction) obj4;
                    K5.r = true;
                    arrayList15.add(K5);
                }
                if (zs0Var.h) {
                    arrayList15.add(b8c.e(-1, ob6.M0(2131745779, null)));
                    break;
                } else if (!zs0Var.f) {
                    for (int i17 = 0; i17 < 3; i17++) {
                        arrayList15.add(b8c.q(i17, 7));
                    }
                    break;
                }
                break;
            case 19:
                xw0 xw0Var = (xw0) this.b;
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                if (((TLRPC.TL_error) obj2) == null && (gzcVar = xw0Var.x0) != null) {
                    gzcVar.a(tL_webViewResultUrl);
                    xw0Var.s();
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
                Utilities.i.c(new on1((String) obj, (String[]) this.b, (icc) obj2, b));
                break;
        }
    }
}
