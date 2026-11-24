// default package

import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.o;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class b7 implements TextWatcher {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        eb ebVar;
        int i;
        boolean z;
        r3b r3bVar;
        int i2;
        int i3;
        ArrayList arrayList;
        int[] iArr;
        int i4;
        int i5;
        int currentTop;
        int currentTop2;
        pha phaVar;
        pha phaVar2;
        pha phaVar3;
        boolean z2 = false;
        r12 = false;
        boolean z3 = false;
        int i6 = 0;
        z2 = false;
        z2 = false;
        byte b = 1;
        switch (this.a) {
            case 1:
                o oVar = (o) this.b;
                if (oVar.i0.a0 && (ebVar = oVar.j0) != null) {
                    ebVar.setInput(editable != null ? editable.toString() : null);
                    break;
                }
                break;
            case 2:
                ss0 ss0Var = (ss0) this.b;
                es0 es0Var = ss0Var.t0;
                i = ((d) ss0Var).currentAccount;
                TLRPC.TL_payments_starsRevenueStats h = ct0.g(i).h(ss0Var.b, false);
                long j = h == null ? 0L : h.status.available_balance.amount;
                long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
                ss0Var.Z = parseLong;
                if (parseLong > j) {
                    ss0Var.Z = j;
                    z = true;
                    ss0Var.X = true;
                    ss0Var.a0.setText(Long.toString(j));
                    ps0 ps0Var = ss0Var.a0;
                    ps0Var.setSelection(ps0Var.getText().length());
                    ss0Var.X = false;
                } else {
                    z = true;
                }
                ss0Var.Y = ss0Var.Z == j ? z : false;
                gl.r(es0Var);
                es0Var.run();
                if (!ss0Var.X) {
                    ss0Var.Y = false;
                    break;
                }
                break;
            case 3:
                mb1 mb1Var = (mb1) this.b;
                if (mb1Var.f.getEditText().getLineCount() > 2 && editable != null && !TextUtils.isEmpty(editable.toString().trim())) {
                    z2 = true;
                }
                mb1Var.F(z2);
                break;
            case 4:
                cc1 cc1Var = (cc1) this.b;
                if (!cc1Var.H0 && cc1Var.G0 && (r3bVar = cc1Var.E0) != null) {
                    r3bVar.c = new SpannableStringBuilder(editable);
                    r3b r3bVar2 = cc1Var.E0;
                    ArrayList arrayList2 = new ArrayList();
                    int i7 = -1;
                    for (int i8 = 0; i8 <= editable.length(); i8++) {
                        if (i8 == editable.length() || Character.isWhitespace(editable.charAt(i8))) {
                            if (i7 >= 0) {
                                arrayList2.add(Integer.valueOf(i7));
                                arrayList2.add(Integer.valueOf(i8));
                                i7 = -1;
                            }
                        } else if (i7 < 0) {
                            i7 = i8;
                        }
                    }
                    int size = arrayList2.size() / 2;
                    int[] iArr2 = r3bVar2.d;
                    Object[] objArr = iArr2 != null && iArr2.length == (size << 2);
                    long j2 = (iArr2 == null || iArr2.length < 4) ? r3bVar2.a : iArr2[2];
                    long max = Math.max(j2, (iArr2 == null || iArr2.length < 4) ? r3bVar2.b : iArr2[iArr2.length - 1]);
                    int[] iArr3 = new int[size << 2];
                    while (i6 < size) {
                        int i9 = i6 << 2;
                        int i10 = i6 << 1;
                        iArr3[i9] = ((Integer) arrayList2.get(i10)).intValue();
                        iArr3[i9 + 1] = ((Integer) arrayList2.get(i10 + b)).intValue();
                        int i11 = i9 + 2;
                        if (objArr == true) {
                            i3 = iArr2[i11];
                            i2 = i11;
                        } else {
                            i2 = i11;
                            i3 = (int) ((((max - j2) * i6) / size) + j2);
                        }
                        iArr3[i2] = i3;
                        int i12 = i9 + 3;
                        if (objArr == true) {
                            i4 = iArr2[i12];
                            arrayList = arrayList2;
                            iArr = iArr2;
                        } else {
                            arrayList = arrayList2;
                            iArr = iArr2;
                            i4 = (int) ((((max - j2) * (i6 + 1)) / size) + j2);
                        }
                        iArr3[i12] = i4;
                        i6++;
                        arrayList2 = arrayList;
                        iArr2 = iArr;
                        b = 1;
                    }
                    r3bVar2.d = iArr3;
                    cc1Var.E0.e = true;
                    break;
                }
                break;
            case 5:
                me1 me1Var = ((ge1) this.b).c;
                if (me1Var.r.startsWith("@")) {
                    me1Var.r = me1Var.r.substring(1);
                }
                if (me1Var.r.length() > 0) {
                    StringBuilder sb = new StringBuilder("https://");
                    i5 = ((d) me1Var).currentAccount;
                    sb.append(na7.q1(i5).N2);
                    sb.append("/");
                    sb.append(me1Var.r);
                    String sb2 = sb.toString();
                    String a0 = k96.a0("UsernameHelpLink", null, 2131743420, sb2);
                    int indexOf = a0.indexOf(sb2);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a0);
                    if (indexOf >= 0) {
                        spannableStringBuilder.setSpan(new q1(b, sb2, me1Var), indexOf, sb2.length() + indexOf, 33);
                        break;
                    }
                }
                break;
            case 7:
                TextUtils.isEmpty(((h12) this.b).E);
                ((h12) this.b).E = editable.toString().trim();
                gl.r(((h12) this.b).b0);
                if (!TextUtils.isEmpty(((h12) this.b).E)) {
                    h12 h12Var = (h12) this.b;
                    String str = h12Var.E;
                    h12Var.a0 = str != null && str.length() >= 0;
                    h12 h12Var2 = (h12) this.b;
                    if (!TextUtils.equals(h12Var2.W, h12Var2.E)) {
                        ((h12) this.b).M.clear();
                        h12 h12Var3 = (h12) this.b;
                        h12Var3.c0 = 0;
                        h12Var3.d0 = false;
                    }
                    gl.e3(((h12) this.b).b0, 1500L);
                }
                gl.r(((h12) this.b).g0);
                if (!TextUtils.isEmpty(((h12) this.b).E)) {
                    h12 h12Var4 = (h12) this.b;
                    String str2 = h12Var4.E;
                    h12Var4.n0 = (str2 == null || str2.length() < 3 || TextUtils.isEmpty(na7.q1(((h12) this.b).b.G3).k4.J.f)) ? false : true;
                    h12 h12Var5 = (h12) this.b;
                    if (!TextUtils.equals(h12Var5.f0, h12Var5.E)) {
                        ((h12) this.b).N.clear();
                        ((h12) this.b).h0 = false;
                    }
                    gl.e3(((h12) this.b).g0, 1500L);
                }
                ((h12) this.b).T();
                break;
            case 8:
                String obj = editable.toString();
                boolean isEmpty = obj.isEmpty();
                k22 k22Var = (k22) this.b;
                if (isEmpty) {
                    w39 adapter = k22Var.s.getAdapter();
                    k22 k22Var2 = (k22) this.b;
                    if (adapter != k22Var2.F) {
                        currentTop = k22Var2.getCurrentTop();
                        ((k22) this.b).H.setText(k96.M0(2131748031, null));
                        ((k22) this.b).H.c();
                        k22 k22Var3 = (k22) this.b;
                        k22Var3.s.setAdapter(k22Var3.F);
                        ((k22) this.b).F.f();
                        if (currentTop > 0) {
                            ((k22) this.b).w.g1(0, -currentTop);
                        }
                    }
                } else {
                    g24 g24Var = k22Var.H;
                    if (g24Var != null) {
                        g24Var.setText(k96.M0(2131747975, null));
                    }
                }
                g22 g22Var = ((k22) this.b).G;
                if (g22Var != null) {
                    if (g22Var.f != null) {
                        Utilities.g.a(g22Var.f);
                        g22Var.f = null;
                    }
                    int i13 = g22Var.h + 1;
                    g22Var.h = i13;
                    co3 co3Var = Utilities.g;
                    f22 f22Var = new f22(g22Var, obj, i13, false ? (byte) 1 : (byte) 0);
                    g22Var.f = f22Var;
                    co3Var.d(f22Var, 300L);
                    break;
                }
                break;
            case 9:
                String obj2 = editable.toString();
                boolean isEmpty2 = obj2.isEmpty();
                p62 p62Var = (p62) this.b;
                fu fuVar = p62Var.s;
                g24 g24Var2 = p62Var.F;
                m62 m62Var = p62Var.y;
                if (isEmpty2) {
                    if (fuVar.getAdapter() != m62Var) {
                        currentTop2 = p62Var.getCurrentTop();
                        g24Var2.c();
                        fuVar.setAdapter(m62Var);
                        m62Var.f();
                        if (currentTop2 > 0) {
                            p62Var.w.g1(0, -currentTop2);
                        }
                    }
                } else if (g24Var2 != null) {
                    g24Var2.setText(k96.M0(2131747975, null));
                }
                n62 n62Var = p62Var.E;
                if (n62Var != null) {
                    p62 p62Var2 = n62Var.f;
                    fu fuVar2 = p62Var2.s;
                    ArrayList arrayList3 = n62Var.d;
                    arrayList3.clear();
                    n62Var.e = obj2;
                    String J3 = gl.J3(obj2);
                    if (J3.startsWith("/")) {
                        J3 = J3.substring(1);
                    }
                    ArrayList arrayList4 = ox8.f(y6c.t0).b;
                    for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                        nx8 nx8Var = (nx8) arrayList4.get(i14);
                        if (!ox8.g(nx8Var.b)) {
                            String J32 = gl.J3(nx8Var.b);
                            if (J32.startsWith(J3) || J32.contains(" ".concat(J3))) {
                                arrayList3.add(nx8Var);
                            }
                        }
                    }
                    w39 adapter2 = fuVar2.getAdapter();
                    n62 n62Var2 = p62Var2.E;
                    if (adapter2 != n62Var2) {
                        fuVar2.setAdapter(n62Var2);
                    }
                    n62Var.f();
                    break;
                }
                break;
            case 10:
                p82 p82Var = (p82) this.b;
                p82Var.r.j(5L, p82Var.w.getText().toString(), null, null);
                kb0 kb0Var = p82Var.e;
                if (kb0Var != null) {
                    kb0Var.invalidate();
                    break;
                }
                break;
            case 11:
                ((f92) this.b).a0();
                break;
            case 12:
                yc2 yc2Var = (yc2) this.b;
                zc2 zc2Var = yc2Var.e;
                if (!yc2Var.d) {
                    zc2Var.T = editable.toString();
                    s49 K = zc2Var.b.K(zc2Var.v0);
                    if (K != null) {
                        zc2Var.q0(K.a);
                        break;
                    }
                }
                break;
            case 13:
                uf2 uf2Var = (uf2) this.b;
                uf2Var.y = false;
                of2 of2Var = uf2Var.G;
                gl.r(of2Var);
                if (TextUtils.isEmpty(uf2Var.f.getText())) {
                    uf2Var.E = null;
                    uf2Var.d.b();
                } else {
                    uf2Var.y = true;
                    gl.e3(of2Var, 800L);
                }
                uf2Var.c.g3.O(true);
                uf2Var.f0();
                break;
            case 15:
                ((en2) this.b).Y();
                break;
            case 16:
                xx2 xx2Var = (xx2) this.b;
                xx2Var.S0();
                xx2Var.X1 = editable.toString();
                xx2Var.Y1.O(true);
                break;
            case 17:
                jm3 jm3Var = (jm3) this.b;
                if (!jm3Var.L) {
                    byte b2 = jm3Var.r;
                    if (b2 == 1) {
                        jm3Var.N = jm3Var.M.length();
                        jm3Var.I = editable.length();
                        if (editable.length() > 0 && !Character.isWhitespace(editable.charAt(editable.length() - 1))) {
                            z3 = true;
                        }
                        jm3Var.O = z3;
                        break;
                    } else if (b2 == 3 && TextUtils.isEmpty(editable)) {
                        jm3Var.m();
                        break;
                    }
                }
                break;
            case 18:
                gt3 gt3Var = (gt3) this.b;
                if (gt3Var.X1 != gt3Var.getLineCount()) {
                    if (!gt3Var.Y1 && gt3Var.getMeasuredWidth() > 0) {
                        gt3Var.G(gt3Var.X1, gt3Var.getLineCount());
                    }
                    gt3Var.X1 = gt3Var.getLineCount();
                    break;
                }
                break;
            case 19:
                ((z77) this.b).run();
                break;
            case 20:
                xv3 xv3Var = (xv3) this.b;
                ImageView imageView = xv3Var.r;
                l7 l7Var = xv3Var.e;
                if (!xv3Var.s) {
                    xv3Var.d(false);
                    String obj3 = l7Var.getText().toString();
                    String str3 = TextUtils.isEmpty(obj3) ? null : obj3;
                    i8c i8cVar = xv3Var.x;
                    if (i8cVar != null) {
                        i8cVar.a(str3, -1);
                    }
                    wv3 wv3Var = xv3Var.h;
                    if (wv3Var != null) {
                        wv3Var.I1(null);
                        xv3Var.h.J1(TextUtils.isEmpty(obj3), true);
                    }
                    if (l7Var != null) {
                        l7Var.animate().cancel();
                        ViewPropertyAnimator translationX = l7Var.animate().translationX(0.0f);
                        s33 s33Var = s33.h;
                        translationX.setInterpolator(s33Var).start();
                        if (imageView != null && xv3Var.n != (!TextUtils.isEmpty(l7Var.getText()))) {
                            xv3Var.n = !xv3Var.n;
                            imageView.animate().cancel();
                            if (xv3Var.n) {
                                imageView.setVisibility(0);
                            }
                            imageView.animate().scaleX(xv3Var.n ? 1.0f : 0.7f).scaleY(xv3Var.n ? 1.0f : 0.7f).alpha(xv3Var.n ? 1.0f : 0.0f).withEndAction(new li3(this, (byte) 22)).setInterpolator(s33Var).setDuration(320L).setStartDelay(xv3Var.n ? 240L : 0L).start();
                            break;
                        }
                    }
                }
                break;
            case 21:
                h14 h14Var = (h14) this.b;
                h14Var.g(false);
                f14 f14Var = h14Var.d;
                String obj4 = f14Var.getText().toString();
                h14Var.b(obj4, true);
                g14 g14Var = h14Var.r;
                if (g14Var != null) {
                    g14Var.I1(null);
                    g14Var.J1(TextUtils.isEmpty(obj4), true);
                }
                h14Var.f(!TextUtils.isEmpty(obj4));
                if (f14Var != null) {
                    f14Var.clearAnimation();
                    f14Var.animate().translationX(0.0f).setInterpolator(s33.h).start();
                }
                h14Var.c(false);
                break;
            case 22:
                b34 b34Var = ((c34) this.b).c;
                if (b34Var != null) {
                    String trim = editable.toString().trim();
                    ao0 ao0Var = ((sn0) b34Var).a;
                    ao0Var.q2 = trim;
                    ao0Var.f1(false, false);
                    ao0Var.f1(true, true);
                    break;
                }
                break;
            case 23:
                pd4 pd4Var = ((md4) this.b).e;
                if (!TextUtils.equals(editable, pd4Var.x)) {
                    pd4Var.n = !TextUtils.isEmpty(editable);
                    pd4Var.x = gm.onlyEmojiSpans(editable);
                    ed4 ed4Var = pd4Var.J;
                    if (ed4Var != null) {
                        ed4Var.e(gm.cloneSpans(pd4Var.x, -1, ed4Var.s.getPaint().getFontMetricsInt(), 0.5f), true);
                    }
                    fd4 fd4Var = pd4Var.K;
                    if (fd4Var != null) {
                        fd4Var.r.setText(pd4.m0(pd4Var.x) ? k96.M0(pd4Var.y ? 2131750723 : 2131750722, null) : null);
                    }
                    if (pd4Var.s && TextUtils.isEmpty(pd4Var.x)) {
                        phaVar3 = ((d) pd4Var).simpleActionBar;
                        phaVar3.setTitle(k96.M0(2131750716, null));
                    } else {
                        phaVar = ((d) pd4Var).simpleActionBar;
                        CharSequence charSequence = pd4Var.x;
                        phaVar2 = ((d) pd4Var).simpleActionBar;
                        phaVar.setTitle(gm.cloneSpans(charSequence, -1, phaVar2.getTitleFontMetricsInt()));
                    }
                }
                pd4Var.k0(true);
                break;
            case 24:
                no4 no4Var = (no4) this.b;
                if (!no4Var.G.isEmpty() && editable.length() > 0 && no4Var.J >= 0) {
                    no4Var.J = -1;
                    no4Var.e();
                }
                no4Var.a.a(no4Var.n || no4Var.r.length() > 0, true);
                break;
            case 25:
                qa5 qa5Var = (qa5) this.b;
                if (qa5Var.f.r.length() != 0) {
                    oa5 oa5Var = qa5Var.w;
                    boolean z4 = oa5Var.n;
                    if (!z4) {
                        qa5Var.U = true;
                        qa5Var.T = true;
                        if (!z4) {
                            oa5Var.n = true;
                            oa5Var.f();
                        }
                        qa5Var.n.setFastScrollVisible(false);
                        qa5Var.n.setVerticalScrollBarEnabled(true);
                    }
                    qa5Var.w.L(qa5Var.f.r.getText().toString());
                    qa5Var.s.e(true, false);
                    break;
                } else {
                    qa5Var.U = false;
                    qa5Var.T = false;
                    oa5 oa5Var2 = qa5Var.w;
                    if (oa5Var2.n) {
                        oa5Var2.n = false;
                        oa5Var2.f();
                    }
                    qa5Var.w.L(null);
                    qa5Var.n.setFastScrollVisible(true);
                    qa5Var.n.setVerticalScrollBarEnabled(false);
                    qa5Var.t0(0);
                    break;
                }
            case 26:
                pa6 pa6Var = (pa6) this.b;
                if (!pa6Var.c) {
                    pa6Var.E = false;
                    pa6Var.y = editable.toString();
                    pa6Var.Y(true);
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                ge1 ge1Var = (ge1) obj;
                me1 me1Var = ge1Var.c;
                String str = me1Var.r;
                me1Var.r = charSequence == null ? "" : charSequence.toString();
                me1 me1Var2 = ge1Var.c;
                ie1 ie1Var = me1Var2.F;
                if (ie1Var != null && str != null) {
                    ie1Var.b(me1Var2.r);
                    break;
                }
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            case 14:
                dj2 dj2Var = (dj2) obj;
                dj2Var.X1 = charSequence.length() != 0;
                dj2Var.V1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                dj2Var.a2 = ofFloat;
                ofFloat.addUpdateListener(new uz1(dj2Var, (byte) 11));
                boolean z = dj2Var.X1;
                ValueAnimator valueAnimator = dj2Var.a2;
                if (z) {
                    valueAnimator.setDuration(220L);
                } else {
                    b00.n(1.5f, valueAnimator);
                    dj2Var.a2.setDuration(350L);
                }
                dj2Var.a2.start();
                dj2Var.m();
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                break;
            case 27:
                ad6 ad6Var = (ad6) obj;
                uc6 uc6Var = ad6Var.T;
                if (ad6Var.S) {
                    ad6Var.removeCallbacks(uc6Var);
                    uc6Var.run();
                    break;
                }
                break;
            case 28:
                td6 td6Var = (td6) obj;
                rd6 rd6Var = td6Var.y;
                if (td6Var.x) {
                    td6Var.removeCallbacks(rd6Var);
                    rd6Var.run();
                    break;
                }
                break;
            default:
                qe6 qe6Var = (qe6) obj;
                ee6 ee6Var = qe6Var.u0;
                if (qe6Var.t0) {
                    qe6Var.removeCallbacks(ee6Var);
                    ee6Var.run();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                r7 r7Var = (r7) obj;
                n7 n7Var = r7Var.I;
                if (n7Var != null) {
                    n7Var.l(r7Var.e);
                }
                r7Var.k();
                if (!r7Var.h0.isEmpty() && !TextUtils.isEmpty(r7Var.e.getText()) && r7Var.i0 >= 0) {
                    r7Var.i0 = -1;
                    r7Var.E();
                    break;
                }
                break;
            case 5:
                ge1 ge1Var = (ge1) obj;
                me1 me1Var = ge1Var.c;
                String str = me1Var.r;
                me1Var.r = charSequence == null ? "" : charSequence.toString();
                me1 me1Var2 = ge1Var.c;
                ie1 ie1Var = me1Var2.F;
                if (ie1Var != null && str != null) {
                    ie1Var.b(me1Var2.r);
                }
                if (!me1Var.n) {
                    me1Var.b0(me1Var.r);
                    break;
                }
                break;
            case 6:
                yh1 yh1Var = (yh1) obj;
                yh1Var.d0(yh1Var.y.getText().toString());
                break;
            case 11:
                f92 f92Var = (f92) obj;
                if (!f92Var.n0) {
                    String obj2 = f92Var.b.getText().toString();
                    ie1 ie1Var2 = f92Var.P;
                    if (ie1Var2 != null) {
                        ie1Var2.b(obj2);
                    }
                    f92Var.b0(obj2);
                    break;
                }
                break;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void d(Editable editable) {
    }

    private final void e(Editable editable) {
    }

    private final void f(Editable editable) {
    }

    private final void A(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void B(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void C(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void D(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void E(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void F(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void G(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void H(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void I(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void J(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void K(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void L(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void M(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void N(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void O(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void P(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void Q(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void R(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void S(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void T(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void U(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void V(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void W(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void X(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void Y(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void Z(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void a0(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b0(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c0(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d0(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void e0(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void g(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void h(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void i(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void j(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void k(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void l(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void m(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void n(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void o(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void p(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void q(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void r(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void s(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void t(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void u(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void v(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void w(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void x(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void y(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void z(int i, int i2, int i3, CharSequence charSequence) {
    }
}
