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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void b(Object obj, Object obj2) {
        l7c l7cVar;
        f51 f51Var = (f51) this.b;
        f51Var.M.dismiss();
        f51Var.E = (String) obj;
        f51Var.F = (TLRPC.InputDocument) obj2;
        f51Var.x = false;
        gm.r(f51Var.e);
        f51Var.n.setSticker(f51Var.E);
        f51Var.g0(true);
        va vaVar = f51Var.a;
        if (vaVar == null || (l7cVar = vaVar.g3) == null) {
            return;
        }
        l7cVar.O(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void c(Object obj, Object obj2) {
        TLRPC.Chat L0;
        ia1 ia1Var = (ia1) this.b;
        ArrayList arrayList = (ArrayList) obj;
        boolean isEmpty = ia1Var.G.isEmpty();
        ArrayList arrayList2 = ia1Var.x;
        boolean isEmpty2 = arrayList2.isEmpty();
        if (!isEmpty || !isEmpty2) {
            c6c c = c6c.c(1, R.drawable.menu_call_create, jb6.M0(2131749247, null));
            c.r = true;
            arrayList.add(c);
            arrayList.add(c6c.C(null));
        }
        int i = 0;
        Object[] objArr = 0;
        if (!isEmpty) {
            ArrayList arrayList3 = ia1Var.G;
            int size = arrayList3.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj3 = arrayList3.get(i2);
                i2++;
                Long l = (Long) obj3;
                if (l != null && (L0 = ia1Var.getMessagesController().L0(l)) != null) {
                    m91 m91Var = new m91(ia1Var, objArr == true ? 1 : 0);
                    int i3 = ga1.b;
                    c6c K = c6c.K(ga1.class);
                    K.H = L0;
                    K.E = m91Var;
                    arrayList.add(K);
                }
            }
            arrayList.add(c6c.C(null));
        }
        if (isEmpty2) {
            return;
        }
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj4 = arrayList2.get(i);
            i++;
            fa1 fa1Var = (fa1) obj4;
            t tVar = new t(ia1Var, fa1Var, (byte) 29);
            int i4 = da1.b;
            c6c K2 = c6c.K(da1.class);
            K2.H = fa1Var;
            K2.E = tVar;
            K2.L(ia1Var.f0(fa1Var.c));
            arrayList.add(K2);
        }
        if (ia1Var.F) {
            return;
        }
        arrayList.add(c6c.q(-1, 8));
        arrayList.add(c6c.q(-2, 8));
        arrayList.add(c6c.q(-3, 8));
    }

    private final void d(Object obj, Object obj2) {
        pc1 pc1Var = (pc1) this.b;
        Canvas canvas = (Canvas) obj;
        Runnable runnable = (Runnable) obj2;
        Paint paint = pc1Var.J;
        RectF rectF = pc1Var.z0;
        jc1 jc1Var = pc1Var.f;
        if (!pc1Var.g()) {
            Paint c = pc1Var.Q.c(1.0f);
            jc1Var.getEditText().setHintColor(c != null ? -1 : -2130706433);
            if (c == null) {
                runnable.run();
                return;
            }
            qu3 editText = jc1Var.getEditText();
            canvas.saveLayerAlpha(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), nm7.d4, 31);
            runnable.run();
            canvas.drawRect(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), c);
            canvas.restore();
            return;
        }
        if (pc1Var.H == null) {
            runnable.run();
            return;
        }
        canvas.translate(-jc1Var.getEditText().q0, 0.0f);
        canvas.saveLayerAlpha(0.0f, 0.0f, pc1Var.H.getWidth(), pc1Var.H.getHeight(), nm7.d4, 31);
        rectF.set(0.0f, 1.0f, pc1Var.H.getWidth(), pc1Var.H.getHeight() - 1);
        pc1Var.h(pc1Var.Q, canvas, rectF, 0.0f, true, (-jc1Var.getX()) - r13.getPaddingLeft(), ((-jc1Var.getY()) - r13.getPaddingTop()) - r13.getExtendedPaddingTop(), true);
        canvas.save();
        paint.setAlpha(nm7.u2);
        canvas.drawBitmap(pc1Var.H, 0.0f, 0.0f, paint);
        canvas.restore();
        canvas.restore();
    }

    private final void e(Object obj, Object obj2) {
        ((mh1) this.b).D0((ArrayList) obj, (l7c) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void f(Object obj, Object obj2) {
        jza jzaVar;
        ik1 ik1Var = (ik1) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ik1Var.R0 = -1;
        TLRPC.Chat L0 = oc7.r1(ik1Var.o0).L0(Long.valueOf(-ik1Var.p0));
        TLRPC.ChatFull M0 = oc7.r1(ik1Var.o0).M0(-ik1Var.p0);
        int i = M0 != null ? M0.stats_dc : -1;
        if (ik1Var.b1) {
            arrayList.add(c6c.g(ik1Var.s0));
            jza jzaVar2 = ik1Var.l1;
            if (jzaVar2 != null && !jzaVar2.l) {
                arrayList.add(c6c.h(5, i, jzaVar2));
                arrayList.add(c6c.B(-1, null));
            }
            jza jzaVar3 = ik1Var.m1;
            if (jzaVar3 != null && !jzaVar3.l) {
                arrayList.add(c6c.h(2, i, jzaVar3));
                arrayList.add(c6c.B(-2, null));
            }
        }
        if (ik1Var.c1 && (jzaVar = ik1Var.n1) != null && !jzaVar.l) {
            arrayList.add(c6c.h(2, i, jzaVar));
            arrayList.add(c6c.B(-3, null));
        }
        if (ik1Var.o1) {
            arrayList.add(c6c.b(jb6.M0(2131748142, null)));
            arrayList.add(c6c.v(ik1Var.p1));
            arrayList.add(c6c.v(ik1Var.q1));
            arrayList.add(c6c.v(ik1Var.r1));
            arrayList.add(c6c.B(-4, ik1Var.u0));
        }
        if (L0 != null && L0.creator) {
            if (ik1Var.b1) {
                arrayList.add(c6c.b(jb6.M0(2131748163, null)));
                arrayList.add(c6c.k(ik1Var.w0));
                arrayList.add(c6c.B(-5, ik1Var.t0));
                int f = oc7.r1(ik1Var.o0).l4.T1.f();
                String M02 = jb6.M0(2131748122, null);
                boolean z = false;
                int i2 = ik1Var.r0 < f ? f : 0;
                if (i2 > 0) {
                    Context context = a.b;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M02);
                    spannableStringBuilder.append((CharSequence) "  L");
                    pn2 pn2Var = new pn2(0, new hd(i2, null, context, false));
                    pn2Var.s = gm.L(1.0f);
                    spannableStringBuilder.setSpan(pn2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    M02 = spannableStringBuilder;
                }
                c6c i3 = c6c.i(1, M02);
                if (ik1Var.r0 >= f && ik1Var.j1) {
                    z = true;
                }
                i3.L(z);
                arrayList.add(i3);
                arrayList.add(c6c.B(-8, jb6.M0(2131748121, null)));
            }
            if (ik1Var.c1) {
                arrayList.add(c6c.b(jb6.M0(2131748130, null)));
                arrayList.add(c6c.j(3, ik1Var.C0));
                arrayList.add(c6c.B(-6, ik1Var.v0));
            }
        }
        if (sd2.V(oc7.r1(ik1Var.o0).L0(Long.valueOf(-ik1Var.p0))) && oc7.r1(ik1Var.o0).l4.C2.f) {
            arrayList.add(xb.i(4, cmb.v0(cmb.kk, ik1Var.n0), ba2.b0(jb6.M0(2131752421, null)), jb6.M0(2131752422, null)));
            arrayList.add(c6c.B(-7, null));
        }
        if (!ik1Var.a1.a()) {
            arrayList.add(c6c.B(-10, null));
        } else {
            ik1Var.R0 = arrayList.size();
            arrayList.add(c6c.n(ik1Var.T0, -2));
        }
    }

    private final void g(Object obj, Object obj2) {
        ck1 ck1Var = (ck1) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ek1 ek1Var = ck1Var.f;
        int i = ck1Var.d;
        int i2 = ek1.y;
        ArrayList arrayList2 = i == 0 ? ek1Var.r : ek1Var.n;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            int i4 = hxa.b;
            c6c K = c6c.K(hxa.class);
            K.H = (TL_stars.StarsTransaction) obj3;
            K.r = true;
            arrayList.add(K);
        }
        if (TextUtils.isEmpty(i == 0 ? ek1Var.s : ek1Var.h)) {
            return;
        }
        arrayList.add(c6c.q(arrayList.size(), 7));
        arrayList.add(c6c.q(arrayList.size(), 7));
        arrayList.add(c6c.q(arrayList.size(), 7));
    }

    private final void h(Object obj, Object obj2) {
        ((ChatActivityEnterView) this.b).v0((Canvas) obj, (iac) obj2);
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
        l7c l7cVar;
        String str2;
        CharSequence charSequence;
        zn6 zn6Var;
        s22 s22Var = (s22) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l7c l7cVar2 = (l7c) obj2;
        boolean z2 = s22Var.Q;
        ArrayList arrayList2 = s22Var.N;
        jc7 jc7Var = s22Var.K;
        ArrayList arrayList3 = s22Var.L;
        HashSet hashSet = s22Var.J;
        ArrayList arrayList4 = s22Var.M;
        arrayList.add(c6c.E(-100, gm.L(1.0f)));
        int size = arrayList.size();
        byte b = 0;
        boolean z3 = true;
        if (TextUtils.isEmpty(s22Var.E)) {
            l7cVar2.V();
            for (int i = 0; i < s22Var.I.size(); i++) {
                zn6 zn6Var2 = (zn6) s22Var.I.get(i);
                zn6Var2.e.J5(null, true);
                c6c i2 = dda.i(zn6Var2, new k22(s22Var, b));
                i2.L(hashSet.contains(zn6Var2));
                i2.d = -1;
                arrayList.add(i2);
            }
            if (s22Var.H) {
                arrayList.add(c6c.q(11, 4));
                arrayList.add(c6c.q(12, 4));
                arrayList.add(c6c.q(13, 4));
            }
            l7cVar2.U();
            if (jc7Var != null) {
                ArrayList arrayList5 = jc7Var.c;
                int size2 = arrayList5.size();
                if (size2 < arrayList3.size()) {
                    arrayList3.subList(size2, arrayList3.size()).clear();
                }
                int i3 = 0;
                while (i3 < size2) {
                    boolean z4 = z3;
                    if (i3 >= arrayList3.size()) {
                        zn6Var = new zn6();
                        arrayList3.add(zn6Var);
                    } else {
                        zn6Var = (zn6) arrayList3.get(i3);
                    }
                    if (zn6Var.e != arrayList5.get(i3)) {
                        s22Var.m0--;
                        zn6Var.e = (k47) arrayList5.get(i3);
                    }
                    i3++;
                    z3 = z4;
                }
            }
            boolean z5 = z3;
            if (jc7Var != null && arrayList3 != null && !arrayList3.isEmpty()) {
                if (arrayList.size() > size) {
                    arrayList.add(c6c.B(-98, null));
                }
                l7cVar2.V();
                arrayList.add(c6c.t(45, jb6.M0(2131753869, null)));
                for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                    zn6 zn6Var3 = (zn6) arrayList3.get(i4);
                    c6c i5 = dda.i(zn6Var3, new k22(s22Var, (byte) 0));
                    i5.L(hashSet.contains(zn6Var3));
                    arrayList.add(i5);
                }
                if (jc7Var.f) {
                    arrayList.add(c6c.q(41, 4));
                    arrayList.add(c6c.q(42, 4));
                    arrayList.add(c6c.q(43, 4));
                }
                if (!jc7Var.f && !jc7Var.e) {
                    c6c c = c6c.c(s22Var.S, R.drawable.arrow_more, jb6.M0(2131745073, null));
                    c.r = z5;
                    arrayList.add(c);
                }
                l7cVar2.U();
            }
            if (arrayList4 != null && (!arrayList4.isEmpty() || s22Var.V >= 0 || s22Var.a0)) {
                if (arrayList.size() > size) {
                    arrayList.add(c6c.B(-98, null));
                }
                l7cVar2.V();
                arrayList.add(c6c.t(((s22Var.V >= 0 || s22Var.a0) && arrayList4.isEmpty()) ? 25 : 20, jb6.M0(2131753872, null)));
                for (int i6 = 0; i6 < arrayList4.size(); i6++) {
                    zn6 zn6Var4 = (zn6) arrayList4.get(i6);
                    zn6Var4.e.J5(s22Var.E, true);
                    c6c i7 = dda.i(zn6Var4, new k22(s22Var, (byte) 0));
                    i7.L(hashSet.contains(zn6Var4));
                    arrayList.add(i7);
                }
                if (s22Var.V >= 0 || s22Var.a0) {
                    arrayList.add(c6c.q(21, 4));
                    arrayList.add(c6c.q(22, 4));
                    arrayList.add(c6c.q(23, 4));
                }
                if (s22Var.d0) {
                    c6c c2 = c6c.c(z2 ? 1 : 0, R.drawable.arrow_more, jb6.M0(2131745073, null));
                    c2.r = true;
                    arrayList.add(c2);
                }
                l7cVar2.U();
            }
        } else {
            String lowerCase = s22Var.E.toLowerCase();
            String I3 = gm.I3(lowerCase);
            boolean z6 = false;
            int i8 = 0;
            while (i8 < s22Var.I.size()) {
                zn6 zn6Var5 = (zn6) s22Var.I.get(i8);
                String str3 = zn6Var5.a;
                if (str3 != null) {
                    String lowerCase2 = str3.toLowerCase();
                    String I32 = gm.I3(lowerCase2);
                    if (lowerCase2.startsWith(lowerCase) || hg9.s(" ", lowerCase, lowerCase2) || I32.startsWith(I3) || I32.contains(" ".concat(I3))) {
                        z = true;
                        str = zn6Var5.b;
                        if (str == null) {
                            String lowerCase3 = str.toLowerCase();
                            l7cVar = l7cVar2;
                            String I33 = gm.I3(lowerCase3);
                            z = z || lowerCase3.startsWith(lowerCase) || hg9.s(" ", lowerCase, lowerCase3) || I33.startsWith(I3) || I33.contains(" ".concat(I3));
                        } else {
                            l7cVar = l7cVar2;
                        }
                        if (z) {
                            if (!z6) {
                                if (arrayList.size() > size) {
                                    str2 = null;
                                    arrayList.add(c6c.B(-97, null));
                                } else {
                                    str2 = null;
                                }
                                l7cVar.V();
                                arrayList.add(c6c.t(10, jb6.M0(2131753870, str2)));
                                z6 = true;
                            }
                            zn6Var5.e.J5(s22Var.E, true);
                            c6c i9 = dda.i(zn6Var5, new k22(s22Var, (byte) 0));
                            i9.L(hashSet.contains(zn6Var5));
                            i9.d = 10;
                            arrayList.add(i9);
                        }
                        i8++;
                        l7cVar2 = l7cVar;
                    }
                }
                z = false;
                str = zn6Var5.b;
                if (str == null) {
                }
                if (z) {
                }
                i8++;
                l7cVar2 = l7cVar;
            }
            l7c l7cVar3 = l7cVar2;
            l7cVar3.U();
            if (arrayList4 != null && (!arrayList4.isEmpty() || s22Var.V >= 0 || s22Var.a0)) {
                if (arrayList.size() > size) {
                    arrayList.add(c6c.B(-98, null));
                }
                l7cVar3.V();
                arrayList.add(c6c.t(((s22Var.V >= 0 || s22Var.a0) && arrayList4.isEmpty()) ? 25 : 20, jb6.M0(2131753872, null)));
                for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                    zn6 zn6Var6 = (zn6) arrayList4.get(i10);
                    zn6Var6.e.J5(s22Var.E, true);
                    c6c i11 = dda.i(zn6Var6, new k22(s22Var, (byte) 0));
                    i11.L(hashSet.contains(zn6Var6));
                    arrayList.add(i11);
                }
                if (s22Var.V >= 0 || s22Var.a0) {
                    arrayList.add(c6c.q(21, 4));
                    arrayList.add(c6c.q(22, 4));
                    arrayList.add(c6c.q(23, 4));
                }
                if (s22Var.d0) {
                    c6c c3 = c6c.c(z2 ? 1 : 0, R.drawable.arrow_more, jb6.M0(2131745073, null));
                    c3.r = true;
                    arrayList.add(c3);
                }
                l7cVar3.U();
            }
            if (arrayList2 != null && (!arrayList2.isEmpty() || s22Var.e0 >= 0 || s22Var.n0)) {
                if (arrayList.size() > size) {
                    arrayList.add(c6c.B(-96, null));
                }
                l7cVar3.V();
                arrayList.add(c6c.t(((s22Var.e0 >= 0 || s22Var.n0) && arrayList2.isEmpty()) ? 35 : 30, jb6.M0(2131753871, null)));
                int size3 = arrayList2.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    zn6 zn6Var7 = (zn6) arrayList2.get(i12);
                    zn6Var7.e.J5(s22Var.E, true);
                    c6c i13 = dda.i(zn6Var7, new k22(s22Var, (byte) 0));
                    i13.L(hashSet.contains(zn6Var7));
                    arrayList.add(i13);
                }
                if (s22Var.e0 >= 0 || s22Var.n0) {
                    arrayList.add(c6c.q(31, 4));
                    arrayList.add(c6c.q(32, 4));
                    arrayList.add(c6c.q(33, 4));
                }
                if (s22Var.h0) {
                    c6c c4 = c6c.c(s22Var.R, R.drawable.arrow_more, jb6.M0(2131745073, null));
                    c4.r = true;
                    arrayList.add(c4);
                }
                l7cVar3.U();
            }
        }
        if (arrayList.size() > size || s22Var.H) {
            charSequence = null;
        } else if (TextUtils.isEmpty(s22Var.E)) {
            charSequence = null;
            arrayList.add(q22.i(jb6.M0(2131747978, null), jb6.M0(2131747979, null)));
        } else {
            charSequence = null;
            arrayList.add(q22.i(gm.S2(jb6.a0(null, null, s22Var.E.length() >= 3 ? 2131747975 : 2131747976, s22Var.E)), jb6.M0(2131747977, null)));
        }
        arrayList.add(c6c.B(-99, charSequence));
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
    @Override // jac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        String str;
        byte b;
        c6c i;
        c6c i2;
        TL_iv.RichMessage richMessage;
        c6c i3;
        TL_iv.RichMessage richMessage2;
        String substring;
        String str2;
        c6c i4;
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
        rwc rwcVar;
        byte b2 = 23;
        int i8 = 2;
        str = "";
        int i9 = 1;
        final byte b3 = 0;
        switch (this.a) {
            case 0:
                a1 a1Var = (a1) this.b;
                ArrayList arrayList2 = (ArrayList) obj;
                l7c l7cVar = (l7c) obj2;
                boolean[] zArr = a1Var.k2;
                boolean[] zArr2 = a1Var.l2;
                z0 z0Var = a1Var.u2;
                arrayList2.add(c6c.C(null));
                arrayList2.add(c6c.m(a1Var.s2));
                arrayList2.add(c6c.C(null));
                l7cVar.G = true;
                l7cVar.V();
                z0 z0Var2 = a1Var.t2;
                int selectedTab = z0Var2 != null ? z0Var2.getSelectedTab() : 0;
                if (selectedTab == 0) {
                    String str3 = a1Var.m2;
                    if (str3 == null || str3.equalsIgnoreCase("und")) {
                        arrayList2.add(w1c.i(3, jb6.M0(2131754986, null), null, null, null));
                    } else {
                        String J0 = s1c.J0(a1Var.m2, null, zArr2);
                        String M0 = jb6.M0((zArr2 == null || !zArr2[0]) ? 2131754993 : 2131754994, null);
                        int indexOf = M0.indexOf("%s");
                        if (indexOf < 0) {
                            substring3 = "";
                            substring2 = substring3;
                        } else {
                            substring2 = M0.substring(0, indexOf);
                            substring3 = M0.substring(indexOf + 2);
                        }
                        if (TextUtils.isEmpty(substring2)) {
                            J0 = s1c.E0(J0);
                        }
                        arrayList2.add(w1c.i(3, substring2, J0, substring3, null));
                    }
                    arrayList2.add(a1Var.i1() ? a1Var.j1(4, a1Var.T1, false) : a2c.i(4, a1Var.S1, a1Var.P2, new d(a1Var, (byte) 5), null, null));
                    String J02 = s1c.J0(a1Var.n2, zArr, null);
                    String M02 = jb6.M0((zArr == null || !zArr[0]) ? 2131754960 : 2131754961, null);
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
                        J02 = s1c.E0(J02);
                    }
                    StringBuilder s = td4.s(J02);
                    s.append(a1Var.o2 != null ? b10.j(new StringBuilder(" ("), a1Var.o2, ")") : "");
                    arrayList2.add(w1c.j(5, str2, s.toString(), substring, new d(a1Var, (byte) 6), a1Var.q2, new d(a1Var, r2), null));
                    boolean i1 = a1Var.i1();
                    boolean z = a1Var.U1;
                    if (i1) {
                        if (z || (richMessage3 = a1Var.W1) == null) {
                            richMessage3 = a1Var.T1;
                        }
                        i4 = a1Var.j1(6, richMessage3, z);
                    } else {
                        i4 = a2c.i(z ? 7 : 6, a1Var.V1, false, null, null, !z ? new d(a1Var, (byte) 8) : null);
                    }
                    arrayList2.add(i4);
                } else if (selectedTab == 1) {
                    arrayList2.add(c6c.k(z0Var));
                    if (z0Var.getSelectedTone() instanceof t0) {
                        arrayList2.add(c6c.j(10, a1Var.w2));
                        l7cVar.U();
                        arrayList2.add(c6c.B(11, null));
                        l7cVar.V();
                    }
                    if ((z0Var.getSelectedTab() >= 0 || a1Var.q2) && (!(z0Var.getSelectedTone() instanceof t0) || TextUtils.equals(a1Var.x2.getText().toString(), a1Var.F2))) {
                        arrayList2.add(w1c.j(7, jb6.M0(2131754984, null), null, null, null, a1Var.q2, new d(a1Var, r2), null));
                        boolean i12 = a1Var.i1();
                        boolean z2 = a1Var.X1;
                        if (i12) {
                            if (z2 || (richMessage2 = a1Var.Z1) == null) {
                                richMessage2 = a1Var.T1;
                            }
                            i3 = a1Var.j1(8, richMessage2, z2);
                        } else {
                            i3 = a2c.i(z2 ? (byte) 7 : (byte) 6, a1Var.Y1, false, null, null, !z2 ? new d(a1Var, (byte) 8) : null);
                        }
                        arrayList2.add(i3);
                    } else {
                        arrayList2.add(w1c.j(5, jb6.M0(2131754987, null), null, null, null, a1Var.q2, new d(a1Var, r2), null));
                        arrayList2.add(a1Var.i1() ? a1Var.j1(6, a1Var.T1, false) : a2c.i(a1Var.X1 ? 7 : 6, a1Var.S1, false, null, null, null));
                    }
                } else if (selectedTab == 2) {
                    arrayList2.add(w1c.i(3, jb6.M0(2131754987, null), null, null, null));
                    if (a1Var.i1()) {
                        i = a1Var.j1(4, a1Var.T1, false);
                        b = 5;
                    } else {
                        b = 5;
                        i = a2c.i(4, a1Var.S1, a1Var.P2, new d(a1Var, b), null, null);
                    }
                    arrayList2.add(i);
                    arrayList2.add(w1c.i(b, jb6.M0(2131754984, null), null, null, null));
                    boolean i13 = a1Var.i1();
                    boolean z3 = a1Var.a2;
                    if (i13) {
                        if (z3 || (richMessage = a1Var.c2) == null) {
                            richMessage = a1Var.T1;
                        }
                        i2 = a1Var.j1(6, richMessage, z3);
                    } else {
                        i2 = a2c.i(z3 ? 7 : 6, a1Var.b2, false, null, null, !z3 ? new d(a1Var, (byte) 8) : null);
                    }
                    arrayList2.add(i2);
                }
                l7cVar.U();
                if (a1Var.h1()) {
                    arrayList2.add(c6c.B(21, null));
                    l7cVar.V();
                    arrayList2.add(c6c.j(20, a1Var.Q2));
                    l7cVar.U();
                    arrayList2.add(c6c.B(22, "Every message you send in this chat will be rewritten with these settings."));
                    break;
                } else {
                    arrayList2.add(c6c.C(null));
                    break;
                }
                break;
            case 1:
                e0 e0Var = (e0) this.b;
                ArrayList arrayList3 = (ArrayList) obj;
                l7c l7cVar2 = (l7c) obj2;
                l7cVar2.G = true;
                arrayList3.add(c6c.C(null));
                FrameLayout frameLayout = e0Var.V1;
                c6c c6cVar = new c6c(-4);
                c6cVar.c = frameLayout;
                c6cVar.A = -1;
                c6cVar.e = true;
                arrayList3.add(c6cVar);
                arrayList3.add(c6c.C(null));
                arrayList3.add(c6c.m(e0Var.W1));
                arrayList3.add(c6c.D(gm.L(1.0f)));
                arrayList3.add(c6c.m(e0Var.X1));
                arrayList3.add(c6c.D(gm.L(24.0f)));
                TL_aicompose.AiComposeTone aiComposeTone = e0Var.S1;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    TL_aicompose.aiComposeToneExample aicomposetoneexample = e0Var.d2[e0Var.c2];
                    l7cVar2.V();
                    arrayList3.add(w1c.j(3, jb6.M0(2131755001, null), null, null, null, false, null, new a0(e0Var, (byte) 1)));
                    arrayList3.add(a2c.i(4, aicomposetoneexample == null ? e0.Z0() : k47.h0(aicomposetoneexample.from, false), false, null, null, null));
                    arrayList3.add(w1c.i(5, jb6.M0(2131755004, null), null, null, null));
                    arrayList3.add(a2c.i(6, aicomposetoneexample == null ? e0.Z0() : k47.h0(aicomposetoneexample.to, false), false, null, null, null));
                    l7cVar2.U();
                    TLRPC.User W1 = tL_aiComposeTone.author_id != 0 ? oc7.r1(e0Var.a).W1(Long.valueOf(tL_aiComposeTone.author_id)) : null;
                    String p = m9c.p(W1);
                    int i10 = tL_aiComposeTone.installs_count;
                    if (W1 != null) {
                        arrayList3.add(c6c.C(gm.M2((i10 > 0 ? jb6.G(i10, "AIEditorUsedBy", new Object[0]).concat(" ") : "").concat(TextUtils.isEmpty(p) ? jb6.a0(null, null, 2131754999, m9c.r(W1)) : jb6.a0(null, null, 2131754999, b10.h("@", p))), cmb.Wc, e0Var.J0, new pf2(e0Var, tL_aiComposeTone, (byte) 16), false)));
                    } else if (i10 > 0) {
                        arrayList3.add(c6c.C(jb6.G(i10, "AIEditorUsedBy", new Object[0])));
                    }
                }
                arrayList3.add(c6c.D(gm.L(32.0f)));
                break;
            case 2:
                r0 r0Var = (r0) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                arrayList4.add(c6c.C(null));
                arrayList4.add(c6c.m(r0Var.S1));
                arrayList4.add(c6c.C(null));
                arrayList4.add(c6c.k(r0Var.V1));
                arrayList4.add(c6c.C(null));
                arrayList4.add(c6c.k(r0Var.W1));
                arrayList4.add(c6c.C(null));
                if (r0Var.e2 != null) {
                    c6c e = c6c.e(1, jb6.M0(2131754998, null));
                    e.s = true;
                    arrayList4.add(e);
                    arrayList4.add(c6c.C(null));
                }
                arrayList4.add(c6c.m(r0Var.X1));
                break;
            case 3:
                o5 o5Var = (o5) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                List<TL_stars.TL_StarGiftAuctionAcquiredGift> list = o5Var.S1;
                if (list != null) {
                    for (TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift : list) {
                        hv4 hv4Var = o5Var.T1;
                        t tVar = new t(o5Var, tL_StarGiftAuctionAcquiredGift, (byte) 3);
                        int i11 = m5.b;
                        c6c K = c6c.K(m5.class);
                        K.H = tL_StarGiftAuctionAcquiredGift;
                        K.I = hv4Var;
                        K.E = tVar;
                        arrayList5.add(K);
                    }
                    arrayList5.add(c6c.D(gm.L(16.0f)));
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
                    arrayList6.add(c6c.k(ebVar.d));
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
                                arrayList6.add(c6c.k(ebVar.w));
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
                                                xt xtVar = ebVar2.N;
                                                if (xtVar != null) {
                                                    xtVar.a(str5);
                                                    break;
                                                }
                                                break;
                                            default:
                                                xt xtVar2 = ebVar2.N;
                                                if (xtVar2 != null) {
                                                    xtVar2.a(str5);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                int i16 = wa.b;
                                c6c K2 = c6c.K(wa.class);
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
                                arrayList6.add(c6c.s(jb6.M0(2131742575, null), jb6.M0(2131742579, null), new j1(ebVar, (byte) 5)));
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
                                                    xt xtVar = ebVar2.N;
                                                    if (xtVar != null) {
                                                        xtVar.a(str52);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    xt xtVar2 = ebVar2.N;
                                                    if (xtVar2 != null) {
                                                        xtVar2.a(str52);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    int i18 = wa.b;
                                    c6c K3 = c6c.K(wa.class);
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
                                    arrayList6.add(c6c.r(jb6.M0(2131742576, null)));
                                    while (b3 < arrayList9.size()) {
                                        k47 k47Var = (k47) arrayList9.get(b3);
                                        if (!TextUtils.isEmpty(eb.a(k47Var))) {
                                            int i19 = ab.b;
                                            c6c K4 = c6c.K(ab.class);
                                            K4.A = 3;
                                            K4.r = true;
                                            K4.I = k47Var;
                                            arrayList6.add(K4);
                                        }
                                        b3++;
                                    }
                                    if (!cbVar.f) {
                                        arrayList6.add(c6c.q(arrayList6.size(), 32));
                                        arrayList6.add(c6c.q(arrayList6.size(), 32));
                                        arrayList6.add(c6c.q(arrayList6.size(), 32));
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
                    arrayList10.add(c6c.C(null));
                    arrayList10.add(c6c.u(jb6.M0(2131750939, null)));
                    c6c A = c6c.A(ibVar.Y0(0), jb6.M0(z8 ? 2131750918 : 2131750916, null), 2);
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = ibVar.T1;
                    A.L(tL_channelAdminLogEventsFilter.promote || tL_channelAdminLogEventsFilter.demote || (z8 && (tL_channelAdminLogEventsFilter.kick || tL_channelAdminLogEventsFilter.ban || tL_channelAdminLogEventsFilter.unkick || tL_channelAdminLogEventsFilter.unban)) || tL_channelAdminLogEventsFilter.invite || tL_channelAdminLogEventsFilter.join || tL_channelAdminLogEventsFilter.leave || tL_channelAdminLogEventsFilter.edit_rank);
                    A.f = !ibVar.Y1;
                    A.E = new hb(ibVar, b3, b3);
                    arrayList10.add(A);
                    if (ibVar.Y1) {
                        c6c z9 = c6c.z(3, jb6.M0(2131750921, null));
                        z9.i = 1;
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = ibVar.T1;
                        z9.L(tL_channelAdminLogEventsFilter2.promote || tL_channelAdminLogEventsFilter2.demote);
                        arrayList10.add(z9);
                        if (z8) {
                            c6c z10 = c6c.z(4, jb6.M0(2131750924, null));
                            z10.i = 1;
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = ibVar.T1;
                            z10.L(tL_channelAdminLogEventsFilter3.kick || tL_channelAdminLogEventsFilter3.ban || tL_channelAdminLogEventsFilter3.unkick || tL_channelAdminLogEventsFilter3.unban);
                            arrayList10.add(z10);
                        }
                        c6c z11 = c6c.z(5, jb6.M0(z8 ? 2131750925 : 2131750923, null));
                        z11.i = 1;
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = ibVar.T1;
                        z11.L(tL_channelAdminLogEventsFilter4.invite || tL_channelAdminLogEventsFilter4.join);
                        arrayList10.add(z11);
                        c6c z12 = c6c.z(6, jb6.M0(z8 ? 2131750929 : 2131750928, null));
                        z12.i = 1;
                        z12.L(ibVar.T1.leave);
                        arrayList10.add(z12);
                        if (z8) {
                            c6c z13 = c6c.z(7, jb6.M0(2131750927, null));
                            z13.i = 1;
                            z13.L(ibVar.T1.edit_rank);
                            arrayList10.add(z13);
                        }
                    }
                    c6c A2 = c6c.A(ibVar.Y0(1), jb6.M0(z8 ? 2131750919 : 2131750920, null), 8);
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = ibVar.T1;
                    A2.L(tL_channelAdminLogEventsFilter5.info || tL_channelAdminLogEventsFilter5.settings || tL_channelAdminLogEventsFilter5.invites || tL_channelAdminLogEventsFilter5.group_call);
                    A2.f = !ibVar.Z1;
                    A2.E = new hb(ibVar, i9, b3);
                    arrayList10.add(A2);
                    if (ibVar.Z1) {
                        c6c z14 = c6c.z(9, jb6.M0(z8 ? 2131750932 : 2131750935, null));
                        z14.i = 1;
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = ibVar.T1;
                        z14.L(tL_channelAdminLogEventsFilter6.info || tL_channelAdminLogEventsFilter6.settings);
                        arrayList10.add(z14);
                        c6c z15 = c6c.z(10, jb6.M0(2131750931, null));
                        z15.i = 1;
                        z15.L(ibVar.T1.invites);
                        arrayList10.add(z15);
                        c6c z16 = c6c.z(11, jb6.M0(2131750936, null));
                        z16.i = 1;
                        z16.L(ibVar.T1.group_call);
                        arrayList10.add(z16);
                    }
                    c6c A3 = c6c.A(ibVar.Y0(2), jb6.M0(2131750917, null), 12);
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = ibVar.T1;
                    A3.L(tL_channelAdminLogEventsFilter7.delete || tL_channelAdminLogEventsFilter7.edit || tL_channelAdminLogEventsFilter7.pinned);
                    A3.f = !ibVar.a2;
                    A3.E = new hb(ibVar, i8, b3);
                    arrayList10.add(A3);
                    if (ibVar.a2) {
                        c6c z17 = c6c.z(13, jb6.M0(2131750934, null));
                        z17.i = 1;
                        z17.L(ibVar.T1.delete);
                        arrayList10.add(z17);
                        c6c z18 = c6c.z(14, jb6.M0(2131750933, null));
                        z18.i = 1;
                        z18.L(ibVar.T1.edit);
                        arrayList10.add(z18);
                        c6c z19 = c6c.z(15, jb6.M0(2131750922, null));
                        z19.i = 1;
                        z19.L(ibVar.T1.pinned);
                        arrayList10.add(z19);
                    }
                    arrayList10.add(c6c.C(null));
                    arrayList10.add(c6c.u(jb6.M0(2131750938, null)));
                    c6c z20 = c6c.z(16, jb6.M0(2131750937, null));
                    vh6 vh6Var = ibVar.V1;
                    int m = vh6Var == null ? 0 : vh6Var.m();
                    ArrayList arrayList11 = ibVar.U1;
                    z20.L(m >= (arrayList11 == null ? 0 : arrayList11.size()));
                    arrayList10.add(z20);
                    if (ibVar.U1 != null) {
                        for (int i20 = 0; i20 < ibVar.U1.size(); i20++) {
                            long n = pg3.n(((TLRPC.ChannelParticipant) ibVar.U1.get(i20)).peer);
                            TLRPC.User W12 = oc7.r1(ibVar.a).W1(Long.valueOf(n));
                            c6c c6cVar2 = new c6c(37);
                            c6cVar2.d = (-1) - i20;
                            c6cVar2.H = W12;
                            c6cVar2.i = 1;
                            vh6 vh6Var2 = ibVar.V1;
                            c6cVar2.L(vh6Var2 != null && vh6Var2.d(n));
                            arrayList10.add(c6cVar2);
                        }
                        break;
                    }
                }
                break;
            case 7:
                ((bc) this.b).D0((ArrayList) obj, (l7c) obj2);
                break;
            case 8:
                lf2 lf2Var = (lf2) this.b;
                TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI = (TLRPC.TL_composedMessageWithAI) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null && tL_composedMessageWithAI != null && (tL_textWithEntities = tL_composedMessageWithAI.result_text) != null) {
                    lf2Var.a(k47.h0(tL_textWithEntities, false), null);
                    break;
                } else {
                    if (tL_error == null) {
                        tL_error = new TLRPC.TL_error();
                    }
                    lf2Var.a(null, tL_error);
                    break;
                }
            case 9:
                id idVar = (id) this.b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                ArrayList arrayList12 = idVar.b;
                idVar.f = -1;
                idVar.g = System.currentTimeMillis();
                if (tones instanceof TL_aicompose.TL_tones) {
                    oc7.r1(idVar.a).d4(tones.users, false);
                    arrayList12.clear();
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    arrayList12.addAll(tL_tones.tones);
                    idVar.c = tL_tones.hash;
                    idVar.d();
                    idVar.c();
                    break;
                }
                break;
            case 10:
                ArrayList arrayList13 = (ArrayList) obj;
                arrayList13.add(((tz) this.b).T1);
                arrayList13.add(c6c.D(gm.L(16.0f)));
                break;
            case 11:
                ((ArrayList) obj).add(c6c.j(-1, ((e00) this.b).U1));
                break;
            case 12:
                ((ArrayList) obj).add(c6c.j(-1, ((m00) this.b).U1));
                break;
            case 13:
                bd0 bd0Var = (bd0) this.b;
                bd0Var.w.setBackground(new BitmapDrawable((Bitmap) obj));
                bd0Var.x = false;
                jz4 jz4Var = bd0Var.h;
                jz4Var.a((Bitmap) obj2);
                tl0.c(jz4Var, bd0Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = bd0Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    break;
                }
                break;
            case 14:
                ((be0) this.b).a0((ArrayList) obj, (l7c) obj2);
                break;
            case 15:
                ((vp0) this.b).Z((ArrayList) obj);
                break;
            case 16:
                io ioVar = (io) this.b;
                String str6 = (String) obj;
                Long l = (Long) obj2;
                StringBuilder sb = new StringBuilder();
                if (l.longValue() > 0) {
                    sb.append("~");
                    sb.append(gm.i0(l.longValue(), false, false));
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
                            case nm7.S /* 30 */:
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
                    sb.append(jb6.M0(2131753940, null));
                }
                ioVar.setText(sb);
                break;
            case 17:
                lt0 lt0Var = (lt0) this.b;
                ArrayList arrayList14 = (ArrayList) obj;
                arrayList14.add(c6c.j(-1, lt0Var.V1));
                arrayList14.add(c6c.C(gm.S2(jb6.a0(null, null, 2131752933, lt0Var.T1))));
                break;
            case 18:
                zt0 zt0Var = (zt0) this.b;
                ArrayList arrayList15 = (ArrayList) obj;
                ArrayList arrayList16 = zt0Var.b;
                int size2 = arrayList16.size();
                int i21 = 0;
                while (i21 < size2) {
                    Object obj4 = arrayList16.get(i21);
                    i21++;
                    int i22 = hxa.b;
                    c6c K5 = c6c.K(hxa.class);
                    K5.H = (TL_stars.StarsTransaction) obj4;
                    K5.r = true;
                    arrayList15.add(K5);
                }
                if (zt0Var.h) {
                    arrayList15.add(c6c.e(-1, jb6.M0(2131745785, null)));
                    break;
                } else if (!zt0Var.f) {
                    for (int i23 = 0; i23 < 3; i23++) {
                        arrayList15.add(c6c.q(i23, 7));
                    }
                    break;
                }
                break;
            case 19:
                wx0 wx0Var = (wx0) this.b;
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                if (((TLRPC.TL_error) obj2) == null && (rwcVar = wx0Var.x0) != null) {
                    rwcVar.a(tL_webViewResultUrl);
                    wx0Var.s();
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
                Utilities.i.c(new lx1((String[]) this.b, (jac) obj2, b2));
                break;
        }
    }
}
