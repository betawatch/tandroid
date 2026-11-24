// default package

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class jf6 implements TextWatcher {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jf6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z;
        String str2;
        byte b;
        mx2 mx2Var;
        boolean z2;
        Object obj;
        String str3;
        boolean z3;
        mx2 mx2Var2;
        mx2 mx2Var3;
        long j;
        p8c p8cVar;
        String obj2;
        int indexOf;
        p8c p8cVar2;
        ns9 ns9Var;
        byte b2 = 8;
        byte b3 = 3;
        str = "";
        String str4 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        String str5 = null;
        r10 = false;
        r10 = false;
        boolean z4 = false;
        switch (this.a) {
            case 0:
                lf6 lf6Var = (lf6) this.b;
                HashMap hashMap = lf6Var.I;
                ArrayList arrayList = lf6Var.H;
                if6 if6Var = lf6Var.a;
                if6 if6Var2 = lf6Var.b;
                if (!lf6Var.L) {
                    lf6Var.L = true;
                    String h = p38.h(if6Var.getText().toString(), false);
                    if6Var.setText(h);
                    if (h.length() == 0) {
                        lf6Var.setCountryButtonText(null);
                        if6Var2.setHintText((String) null);
                        lf6Var.F = (byte) 1;
                        z2 = false;
                    } else {
                        int i = 4;
                        if (h.length() > 4) {
                            while (true) {
                                if (i >= r4) {
                                    String substring = h.substring(0, i);
                                    List list = (List) hashMap.get(substring);
                                    if (list == null) {
                                        obj = str4;
                                    } else if (list.size() > r4) {
                                        String string = na7.c1().getString("phone_code_last_matched_".concat(substring), str4);
                                        Object obj3 = (mx2) oo1.m(r4, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i2 = 0;
                                            while (true) {
                                                if (i2 < size) {
                                                    Object obj4 = arrayList.get(i2);
                                                    i2++;
                                                    mx2 mx2Var4 = (mx2) obj4;
                                                    if (Objects.equals(mx2Var4.d, string)) {
                                                        obj3 = mx2Var4;
                                                    }
                                                }
                                            }
                                        }
                                        obj = obj3;
                                    } else {
                                        obj = (mx2) list.get(0);
                                    }
                                    if (obj != null) {
                                        String str6 = h.substring(i) + if6Var2.getText().toString();
                                        if6Var.setText(substring);
                                        h = substring;
                                        str2 = str6;
                                        z = true;
                                    } else {
                                        i--;
                                        r4 = 1;
                                        str4 = null;
                                    }
                                } else {
                                    z = false;
                                    str2 = null;
                                }
                            }
                            if (!z) {
                                str2 = h.substring(1) + if6Var2.getText().toString();
                                h = h.substring(0, 1);
                                if6Var.setText(h);
                            }
                        } else {
                            z = false;
                            str2 = null;
                        }
                        int size2 = arrayList.size();
                        int i3 = 0;
                        int i4 = 0;
                        mx2 mx2Var5 = null;
                        while (i4 < size2) {
                            Object obj5 = arrayList.get(i4);
                            i4++;
                            mx2 mx2Var6 = (mx2) obj5;
                            if (mx2Var6.c.startsWith(h)) {
                                int i5 = i3 + 1;
                                if (mx2Var6.c.equals(h)) {
                                    if (mx2Var5 == null || !mx2Var5.c.equals(mx2Var6.c)) {
                                        i3 = i5;
                                    }
                                    mx2Var5 = mx2Var6;
                                } else {
                                    i3 = i5;
                                }
                            }
                        }
                        if (i3 == 1 && mx2Var5 != null && str2 == null) {
                            str2 = h.substring(mx2Var5.c.length()) + if6Var2.getText().toString();
                            h = mx2Var5.c;
                            if6Var.setText(h);
                        }
                        List list2 = (List) hashMap.get(h);
                        if (list2 == null) {
                            b = 0;
                            mx2Var = null;
                        } else if (list2.size() > 1) {
                            String string2 = na7.c1().getString("phone_code_last_matched_" + h, null);
                            mx2 mx2Var7 = (mx2) oo1.m(1, list2);
                            if (string2 != null) {
                                int size3 = arrayList.size();
                                int i6 = 0;
                                while (i6 < size3) {
                                    Object obj6 = arrayList.get(i6);
                                    i6++;
                                    mx2Var = (mx2) obj6;
                                    if (Objects.equals(mx2Var.d, string2)) {
                                        b = 0;
                                    }
                                }
                            }
                            mx2Var = mx2Var7;
                            b = 0;
                        } else {
                            b = 0;
                            mx2Var = (mx2) list2.get(0);
                        }
                        if (mx2Var != null) {
                            lf6Var.K = true;
                            lf6Var.G = mx2Var;
                            lf6Var.u(h, mx2Var);
                            lf6Var.F = b;
                        } else {
                            lf6Var.setCountryButtonText(null);
                            if6Var2.setHintText((String) null);
                            lf6Var.F = (byte) 2;
                        }
                        if (!z) {
                            if6Var.setSelection(if6Var.getText().length());
                        }
                        if (str2 != null) {
                            if6Var2.requestFocus();
                            if6Var2.setText(str2);
                            if6Var2.setSelection(if6Var2.length());
                        }
                        z2 = false;
                    }
                    lf6Var.L = z2;
                    break;
                }
                break;
            case 1:
                oj ojVar = oj.a;
                t47 t47Var = (t47) this.b;
                EditTextBoldCursor editTextBoldCursor = t47Var.p1;
                t47Var.G0((editable == null || editable.toString().isEmpty()) ? nj.j(0L, ojVar) : nj.i(editable.toString(), ojVar), false, false, true);
                t47Var.o1.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(editTextBoldCursor.getText()));
                break;
            case 2:
                jj7 jj7Var = (jj7) this.b;
                HashMap hashMap2 = jj7Var.v1;
                ArrayList arrayList2 = jj7Var.u1;
                if (!jj7Var.x1) {
                    jj7Var.x1 = true;
                    String h2 = p38.h(jj7Var.H1.getText().toString(), false);
                    jj7Var.H1.setText(h2);
                    if (h2.length() == 0) {
                        jj7Var.F0(null);
                        jj7Var.J1.setHintText((String) null);
                    } else {
                        if (h2.length() > 4) {
                            int i7 = 4;
                            while (true) {
                                if (i7 >= 1) {
                                    String substring2 = h2.substring(0, i7);
                                    List list3 = (List) hashMap2.get(substring2);
                                    if (list3 == null) {
                                        mx2Var3 = null;
                                    } else if (list3.size() > 1) {
                                        String string3 = na7.c1().getString("phone_code_last_matched_".concat(substring2), null);
                                        mx2Var3 = (mx2) oo1.m(1, list3);
                                        if (string3 != null) {
                                            int size4 = arrayList2.size();
                                            int i8 = 0;
                                            while (true) {
                                                if (i8 < size4) {
                                                    Object obj7 = arrayList2.get(i8);
                                                    i8++;
                                                    mx2 mx2Var8 = (mx2) obj7;
                                                    if (Objects.equals(mx2Var8.d, string3)) {
                                                        mx2Var3 = mx2Var8;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        mx2Var3 = (mx2) list3.get(0);
                                    }
                                    if (mx2Var3 != null) {
                                        String str7 = h2.substring(i7) + jj7Var.J1.getText().toString();
                                        jj7Var.H1.setText(substring2);
                                        str3 = str7;
                                        h2 = substring2;
                                        z3 = true;
                                    } else {
                                        i7--;
                                    }
                                } else {
                                    str3 = null;
                                    z3 = false;
                                }
                            }
                            if (!z3) {
                                str3 = h2.substring(1) + jj7Var.J1.getText().toString();
                                ij7 ij7Var = jj7Var.H1;
                                h2 = h2.substring(0, 1);
                                ij7Var.setText(h2);
                            }
                        } else {
                            str3 = null;
                            z3 = false;
                        }
                        int size5 = arrayList2.size();
                        mx2 mx2Var9 = null;
                        int i9 = 0;
                        int i10 = 0;
                        while (i10 < size5) {
                            Object obj8 = arrayList2.get(i10);
                            i10++;
                            mx2 mx2Var10 = (mx2) obj8;
                            if (mx2Var10.c.startsWith(h2)) {
                                i9++;
                                if (mx2Var10.c.equals(h2)) {
                                    mx2Var9 = mx2Var10;
                                }
                            }
                        }
                        if (i9 == 1 && mx2Var9 != null && str3 == null) {
                            str3 = h2.substring(mx2Var9.c.length()) + jj7Var.J1.getText().toString();
                            ij7 ij7Var2 = jj7Var.H1;
                            String str8 = mx2Var9.c;
                            ij7Var2.setText(str8);
                            h2 = str8;
                        }
                        List list4 = (List) hashMap2.get(h2);
                        if (list4 == null) {
                            mx2Var2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = na7.c1().getString("phone_code_last_matched_" + h2, null);
                            mx2Var2 = (mx2) oo1.m(1, list4);
                            if (string4 != null) {
                                int size6 = arrayList2.size();
                                int i11 = 0;
                                while (true) {
                                    if (i11 < size6) {
                                        Object obj9 = arrayList2.get(i11);
                                        i11++;
                                        mx2 mx2Var11 = (mx2) obj9;
                                        if (Objects.equals(mx2Var11.d, string4)) {
                                            mx2Var2 = mx2Var11;
                                        }
                                    }
                                }
                            }
                        } else {
                            mx2Var2 = (mx2) list4.get(0);
                        }
                        if (mx2Var2 != null) {
                            jj7Var.z1 = true;
                            jj7Var.G0(h2, mx2Var2);
                        } else {
                            jj7Var.F0(null);
                            jj7Var.J1.setHintText((String) null);
                        }
                        if (!z3) {
                            ij7 ij7Var3 = jj7Var.H1;
                            ij7Var3.setSelection(ij7Var3.getText().length());
                        }
                        if (str3 != null && str3.length() != 0) {
                            jj7Var.J1.requestFocus();
                            jj7Var.J1.setText(str3);
                            ij7 ij7Var4 = jj7Var.J1;
                            ij7Var4.setSelection(ij7Var4.length());
                        }
                    }
                    jj7Var.x1 = false;
                    jj7Var.L0();
                    break;
                }
                break;
            case 3:
                jq7 jq7Var = (jq7) this.b;
                str = editable != null ? editable.toString() : "";
                int indexOf2 = str.indexOf(46);
                if (!jq7Var.w1 && indexOf2 >= 0 && (str.length() - indexOf2) - 1 > 2) {
                    editable.delete(indexOf2 + 3, str.length());
                    break;
                } else {
                    r10 = (str.isEmpty() || ".".equals(str)) ? (byte) 1 : (byte) 0;
                    nj i12 = r10 == 0 ? nj.i(str, oj.b) : null;
                    if (r10 != 0) {
                        j = 0;
                    } else if (i12 == null) {
                        editable.delete(str.length() - 1, str.length());
                        break;
                    } else {
                        j = i12.b;
                    }
                    jq7Var.D0(j);
                    break;
                }
                break;
            case 4:
                yv7 yv7Var = (yv7) this.b;
                if (yv7Var.r.length() == 4 && gba.q == 0) {
                    yv7Var.n(false);
                    break;
                }
                break;
            case 5:
                s58 s58Var = ((u58) this.b).t0;
                if (s58Var != null) {
                    s58Var.j(editable);
                    break;
                }
                break;
            case 6:
                jd8 jd8Var = (jd8) this.b;
                int length = jd8Var.a.getText().length();
                fm0 fm0Var = jd8Var.I;
                int i13 = jd8Var.y;
                fm0Var.a(length > (i13 * 7) / 10, true);
                jd8Var.J.a(length > i13, true);
                jd8Var.f.l(Integer.toString(i13 - length), false);
                break;
            case 7:
                js9 js9Var = (js9) this.b;
                ImageView imageView = js9Var.b;
                ps0 ps0Var = js9Var.d;
                byte b4 = ps0Var.length() > 0 ? (byte) 1 : (byte) 0;
                if (b4 != (imageView.getAlpha() == 0.0f ? (byte) 0 : (byte) 1)) {
                    imageView.animate().alpha(b4 != 0 ? 1.0f : 0.0f).setDuration(150L).scaleX(b4 != 0 ? 1.0f : 0.1f).scaleY(b4 == 0 ? 0.1f : 1.0f).start();
                }
                js9Var.a(ps0Var.getText().toString());
                break;
            case 8:
                break;
            case 9:
                lw9 lw9Var = (lw9) this.b;
                py pyVar = lw9Var.h;
                String obj10 = (pyVar.getText() == null || gl.J3(pyVar.getText(), null).length() == 0) ? null : pyVar.getText().toString();
                lw9Var.G.v(obj10, true, true);
                ix9 ix9Var = lw9Var.n;
                if (ix9Var != null) {
                    ix9Var.I1(null);
                    lw9Var.n.J1(TextUtils.isEmpty(obj10), true);
                }
                if (pyVar != null) {
                    pyVar.clearAnimation();
                    pyVar.animate().translationX(0.0f).setInterpolator(s33.h).start();
                }
                lw9Var.b(false);
                break;
            case 10:
                ((yx9) this.b).l2 = editable.toString();
                yx9 yx9Var = (yx9) this.b;
                if (!yx9Var.U1) {
                    String str9 = yx9Var.q2;
                    String str10 = yx9Var.l2;
                    if (str10 == null) {
                        str10 = "";
                    }
                    if (!TextUtils.equals(str9, str10)) {
                        ((yx9) this.b).a1();
                        yx9 yx9Var2 = (yx9) this.b;
                        String str11 = yx9Var2.l2;
                        yx9Var2.p2 = str11 != null && str11.length() > 0;
                    }
                    yx9 yx9Var3 = (yx9) this.b;
                    String str12 = yx9Var3.B2;
                    String str13 = yx9Var3.l2;
                    if (!TextUtils.equals(str12, str13 != null ? str13 : "")) {
                        ((yx9) this.b).Z0();
                        yx9 yx9Var4 = (yx9) this.b;
                        String str14 = yx9Var4.l2;
                        if (str14 != null && str14.length() > 3 && !TextUtils.isEmpty(na7.q1(((yx9) this.b).a).k4.J.f)) {
                            z4 = true;
                        }
                        yx9Var4.w2 = z4;
                    }
                    vx9 vx9Var = ((yx9) this.b).s2;
                    gl.r(vx9Var);
                    gl.d3(vx9Var, 400L);
                    vx9 vx9Var2 = ((yx9) this.b).D2;
                    gl.r(vx9Var2);
                    gl.d3(vx9Var2, 400L);
                }
                ((yx9) this.b).j2.O(true);
                break;
            case 11:
                hz9 hz9Var = (hz9) this.b;
                if (!hz9Var.h && (p8cVar = hz9Var.n) != null && editable != null) {
                    p8cVar.a(editable.toString());
                    break;
                }
                break;
            case 12:
                o0a o0aVar = (o0a) this.b;
                EditTextBoldCursor editTextBoldCursor2 = o0aVar.m1;
                boolean z5 = editable == null || editable.toString().isEmpty() || ".".equals(editable.toString());
                if (!z5 && (indexOf = (obj2 = editable.toString()).indexOf(46)) >= 0 && (obj2.length() - indexOf) - 1 > 2) {
                    editable.delete(indexOf + 3, obj2.length());
                }
                o0aVar.E0(!z5 ? nj.i(editable.toString(), o0aVar.y1.a) : nj.j(0L, o0aVar.y1.a), false, false, true);
                o0aVar.l1.c(editTextBoldCursor2.isFocused(), !TextUtils.isEmpty(editTextBoldCursor2.getText()));
                break;
            case 13:
                break;
            case 14:
                v5b v5bVar = (v5b) this.b;
                if (!v5bVar.n && (p8cVar2 = v5bVar.r) != null && editable != null) {
                    p8cVar2.a(editable.toString());
                    break;
                }
                break;
            case 15:
                dbb dbbVar = (dbb) this.b;
                bbb bbbVar = dbbVar.c;
                if (bbbVar != null && bbbVar.getVisibility() == 0) {
                    dbbVar.d();
                    break;
                }
                break;
            case 16:
                wfb wfbVar = (wfb) this.b;
                if (!wfbVar.y) {
                    String trim = editable.toString().trim();
                    int length2 = trim.length();
                    hn hnVar = wfbVar.n;
                    if (length2 > 16) {
                        hnVar.setText("-" + (trim.length() - 16));
                        trim = trim.substring(0, 16);
                    } else {
                        hnVar.setText("");
                    }
                    p8c p8cVar3 = wfbVar.x;
                    if (p8cVar3 != null) {
                        p8cVar3.a(trim);
                    }
                    k27 k27Var = wfbVar.r;
                    if (k27Var != null) {
                        k27Var.M1 = true;
                        wfbVar.d.z3(k27Var, null, false, false, false, false);
                        break;
                    }
                }
                break;
            case 17:
                ymb ymbVar = (ymb) this.b;
                if (!ymbVar.I) {
                    if (ymbVar.a.length() <= 0) {
                        ymbVar.d.setText(ymbVar.H);
                        break;
                    } else {
                        String str15 = "https://" + ymbVar.getMessagesController().N2 + "/addtheme/" + ((Object) ymbVar.a.getText());
                        String a0 = k96.a0("ThemeHelpLink", null, 2131743940, str15);
                        int indexOf3 = a0.indexOf(str15);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a0);
                        if (indexOf3 >= 0) {
                            spannableStringBuilder.setSpan(new q1(b2, str15, ymbVar), indexOf3, str15.length() + indexOf3, 33);
                        }
                        ymbVar.d.setText(TextUtils.concat(ymbVar.H, "\n\n", spannableStringBuilder));
                        break;
                    }
                }
                break;
            case 18:
                String trim2 = editable.toString().trim();
                vtb vtbVar = (vtb) this.b;
                String str16 = vtbVar.n;
                if (trim2.length() > 0) {
                    str = trim2.substring(0, 1).toUpperCase();
                    vtbVar.n = str;
                } else {
                    vtbVar.n = "";
                }
                if (!str16.equals(str)) {
                    o06 o06Var = new o06(1, null);
                    o06Var.a(vtbVar.n);
                    l79 l79Var = vtbVar.w;
                    if (l79Var != null) {
                        l79Var.b(o06Var, true);
                        break;
                    }
                }
                break;
            case 19:
                lwb lwbVar = (lwb) this.b;
                String lowerCase = editable.toString().trim().toLowerCase();
                lwbVar.M = lowerCase;
                if (lowerCase.startsWith("@")) {
                    lwbVar.M = lwbVar.M.substring(1);
                }
                lwbVar.l(true);
                lwbVar.n();
                break;
            case 20:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                u2c u2cVar = twoStepVerificationActivity.W;
                if (twoStepVerificationActivity.V) {
                    gl.r(u2cVar);
                    u2cVar.run();
                    break;
                }
                break;
            case 21:
                w7c w7cVar = (w7c) this.b;
                String obj11 = w7cVar.K.getText().toString();
                x7c x7cVar = w7cVar.L;
                int b5 = x7cVar.n1.getAdapter() == null ? 0 : x7cVar.n1.getAdapter().b();
                x7cVar.G0(obj11);
                if (TextUtils.isEmpty(obj11) && (ns9Var = x7cVar.n1) != null) {
                    w39 adapter = ns9Var.getAdapter();
                    n39 n39Var = x7cVar.p1;
                    if (adapter != n39Var) {
                        ns9 ns9Var2 = x7cVar.n1;
                        ns9Var2.X1 = false;
                        ns9Var2.Y1 = false;
                        ns9Var2.setAdapter(n39Var);
                        ns9 ns9Var3 = x7cVar.n1;
                        ns9Var3.X1 = true;
                        ns9Var3.Y1 = false;
                        if (b5 == 0) {
                            x7cVar.J0(0);
                        }
                    }
                }
                x7cVar.u1.setVisibility(0);
                break;
            case 22:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                if (usersSelectActivity.c.length() == 0) {
                    usersSelectActivity.O = false;
                    usersSelectActivity.N = false;
                    b8c b8cVar = usersSelectActivity.h;
                    if (b8cVar.n) {
                        b8cVar.n = false;
                        b8cVar.f();
                    }
                    usersSelectActivity.h.L(null);
                    usersSelectActivity.d.setFastScrollVisible(true);
                    usersSelectActivity.d.setVerticalScrollBarEnabled(false);
                    usersSelectActivity.f.d.setText(k96.M0(2131748031, null));
                    break;
                } else {
                    b8c b8cVar2 = usersSelectActivity.h;
                    boolean z6 = b8cVar2.n;
                    if (!z6) {
                        usersSelectActivity.O = true;
                        usersSelectActivity.N = true;
                        if (!z6) {
                            b8cVar2.n = true;
                            b8cVar2.f();
                        }
                        usersSelectActivity.d.setFastScrollVisible(false);
                        usersSelectActivity.d.setVerticalScrollBarEnabled(true);
                        usersSelectActivity.f.d.setText(k96.M0(2131747975, null));
                    }
                    usersSelectActivity.f.e(true, true);
                    usersSelectActivity.h.L(usersSelectActivity.c.getText().toString());
                    break;
                }
            case 23:
                gjc gjcVar = (gjc) this.b;
                gjcVar.n = editable.toString();
                yic yicVar = gjcVar.K;
                if (yicVar != null) {
                    yicVar.invalidate();
                    break;
                }
                break;
            case 24:
                break;
            case 25:
                ((qpc) this.b).B0();
                break;
            case 26:
                final ypc ypcVar = (ypc) this.b;
                ArrayList arrayList3 = ypcVar.w;
                arrayList3.clear();
                final String trim3 = editable.toString().trim();
                Runnable runnable = ypcVar.L;
                if (runnable != null) {
                    gl.r(runnable);
                    ypcVar.L = null;
                }
                if (ypcVar.F != 0) {
                    ypcVar.getConnectionsManager().cancelRequest(ypcVar.F, true);
                    ypcVar.F = 0;
                }
                String str17 = WalletEngine2.isValidRecipientAddress(trim3) ? trim3 : null;
                ypcVar.y = str17;
                if (str17 == null && trim3 != null && trim3.length() <= 126) {
                    String lowerCase2 = trim3.toLowerCase(Locale.ROOT);
                    if (lowerCase2.matches("[a-z0-9_-]+(?:\\.[a-z0-9_-]+)*\\.ton")) {
                        str5 = lowerCase2;
                    }
                }
                ypcVar.E = str5;
                final int i14 = ypcVar.K + 1;
                ypcVar.K = i14;
                ypcVar.M = !TextUtils.isEmpty(trim3) && ypcVar.y == null;
                ypcVar.x.g(null, true, false, false, false, 0L, false, 0, i14);
                u41 u41Var = ypcVar.a0;
                if (u41Var != null) {
                    u41Var.setEnabled(ypcVar.y != null);
                }
                if (!TextUtils.isEmpty(trim3) && ypcVar.y == null && ypcVar.E == null) {
                    ypcVar.i0(trim3);
                    Runnable runnable2 = new Runnable() { // from class: xpc
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b6 = r4;
                            ypc ypcVar2 = ypcVar;
                            switch (b6) {
                                case 0:
                                    ypcVar2.f0(i14, trim3);
                                    break;
                                default:
                                    ypcVar2.L = null;
                                    zr9 zr9Var = ypcVar2.x;
                                    int i15 = i14;
                                    zr9Var.h(trim3, true, false, false, false, false, 0L, false, 0, i15, 0L, new on7(ypcVar2, i15, (byte) 28));
                                    break;
                            }
                        }
                    };
                    ypcVar.L = runnable2;
                    gl.d3(runnable2, 300L);
                } else {
                    arrayList3.clear();
                    ypcVar.a.g3.O(true);
                    final String str18 = ypcVar.E;
                    if (str18 != null) {
                        Runnable runnable3 = new Runnable() { // from class: xpc
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b6 = r4;
                                ypc ypcVar2 = ypcVar;
                                switch (b6) {
                                    case 0:
                                        ypcVar2.f0(i14, str18);
                                        break;
                                    default:
                                        ypcVar2.L = null;
                                        zr9 zr9Var = ypcVar2.x;
                                        int i15 = i14;
                                        zr9Var.h(str18, true, false, false, false, false, 0L, false, 0, i15, 0L, new on7(ypcVar2, i15, (byte) 28));
                                        break;
                                }
                            }
                        };
                        ypcVar.L = runnable3;
                        gl.d3(runnable3, 300L);
                    }
                }
                ypcVar.o0(true);
                break;
            case 27:
                lqc lqcVar = (lqc) this.b;
                if (lqcVar.w && !editable.toString().trim().toLowerCase().matches(".*\\s+.*") && lqcVar.b()) {
                    lqcVar.setError(false);
                }
                lqcVar.e();
                lqcVar.d();
                if (lqcVar.a.hasFocus()) {
                    lqcVar.f(editable.toString().trim().toLowerCase());
                }
                Runnable runnable4 = lqcVar.f;
                if (runnable4 != null) {
                    runnable4.run();
                    break;
                }
                break;
            default:
                wt wtVar = (wt) this.b;
                gl.P3(wtVar.K, editable.length() > 0 && wtVar.U, true);
                String obj12 = editable.toString();
                o oVar = wtVar.C0;
                String lowerCase3 = obj12.toLowerCase();
                va7 va7Var = oVar.X0;
                if (va7Var != null) {
                    gl.r(va7Var);
                    oVar.X0 = null;
                }
                if (!TextUtils.isEmpty(lowerCase3)) {
                    int i15 = oVar.Y0 + 1;
                    oVar.Y0 = i15;
                    if (!oVar.v0[0].e()) {
                        va7 va7Var2 = new va7(oVar, lowerCase3, i15, b3);
                        oVar.X0 = va7Var2;
                        gl.d3(va7Var2, 400L);
                        break;
                    } else {
                        oVar.b0(true);
                        if (oVar.v0[0].getWebView() != null) {
                            cv0 webView = oVar.v0[0].getWebView();
                            webView.J = new ts(oVar, b2);
                            webView.findAllAsync(lowerCase3);
                            oVar.f0();
                            break;
                        }
                    }
                } else {
                    oVar.F.clear();
                    oVar.G = lowerCase3;
                    oVar.v0[0].c.E.clear();
                    oVar.b0(false);
                    boolean e = oVar.v0[0].e();
                    m[] mVarArr = oVar.v0;
                    if (!e) {
                        mVarArr[0].b.h1();
                        oVar.U(0);
                    } else if (mVarArr[0].getWebView() != null) {
                        cv0 webView2 = oVar.v0[0].getWebView();
                        webView2.J = new ts(oVar, b2);
                        webView2.findAllAsync("");
                        oVar.f0();
                    }
                    oVar.Y0 = -1;
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        switch (this.a) {
            case 4:
                yv7 yv7Var = (yv7) this.b;
                LinkedList linkedList = yv7Var.W;
                LinkedList linkedList2 = yv7Var.V;
                Drawable drawable = yv7Var.a;
                if (drawable instanceof ye7) {
                    ye7 ye7Var = (ye7) drawable;
                    ye7Var.C = null;
                    ye7Var.x();
                    float f = ye7Var.h;
                    int i4 = 0;
                    boolean z2 = true;
                    if (i2 == 0 && i3 == 1) {
                        ye7Var.v(true);
                        z = true;
                    } else if (i2 == 1 && i3 == 0) {
                        ye7Var.w();
                        z = false;
                    } else {
                        z = false;
                        z2 = false;
                    }
                    if (z2) {
                        if (f >= 1.0f) {
                            yv7Var.a(ye7Var);
                            break;
                        } else {
                            linkedList2.offer(new vj6((Object) this, z, (Object) ye7Var, (byte) 8));
                            linkedList.offer(Boolean.valueOf(z));
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            for (int i5 = 0; i5 < linkedList2.size(); i5++) {
                                Runnable runnable = (Runnable) linkedList2.get(i5);
                                if (((Boolean) linkedList.get(i5)).booleanValue() != z) {
                                    arrayList.add(runnable);
                                    arrayList2.add(Integer.valueOf(i5));
                                }
                            }
                            int size = arrayList.size();
                            int i6 = 0;
                            while (i6 < size) {
                                Object obj = arrayList.get(i6);
                                i6++;
                                linkedList2.remove((Runnable) obj);
                            }
                            int size2 = arrayList2.size();
                            while (i4 < size2) {
                                Object obj2 = arrayList2.get(i4);
                                i4++;
                                int intValue = ((Integer) obj2).intValue();
                                if (intValue < linkedList.size()) {
                                    linkedList.remove(intValue);
                                }
                            }
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        n7 searchListener;
        byte b = this.a;
        int i4 = 0;
        Object obj = this.b;
        switch (b) {
            case 8:
                SearchView searchView = (SearchView) obj;
                Editable text = searchView.G.getText();
                searchView.p0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.u(!isEmpty);
                if (searchView.o0 && !searchView.h0 && isEmpty) {
                    searchView.L.setVisibility(8);
                } else {
                    i4 = 8;
                }
                searchView.N.setVisibility(i4);
                searchView.q();
                searchView.t();
                charSequence.toString();
                break;
            case 13:
                pha phaVar = (pha) obj;
                phaVar.l();
                searchListener = phaVar.getSearchListener();
                if (searchListener != null) {
                    searchListener.l(phaVar.s);
                    break;
                }
                break;
            case 17:
                ymb ymbVar = (ymb) obj;
                if (!ymbVar.G) {
                    ymbVar.Y(ymbVar.a.getText().toString(), false);
                    break;
                }
                break;
            case 24:
                ((tkc) obj).a(charSequence.toString());
                break;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
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

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d0(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void e(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void f(int i, int i2, int i3, CharSequence charSequence) {
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
