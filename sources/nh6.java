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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class nh6 implements TextWatcher {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nh6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v22, types: [gy2] */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View, android.widget.EditText, android.widget.TextView, mh6, org.telegram.ui.Components.AnimatedPhoneNumberEditText, org.telegram.ui.Components.EditTextBoldCursor] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r9v16, types: [gy2] */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z;
        String str2;
        byte b;
        gy2 gy2Var;
        boolean z2;
        ?? r7;
        String str3;
        gy2 gy2Var2;
        gy2 gy2Var3;
        pcc pccVar;
        String obj;
        int indexOf;
        pcc pccVar2;
        gw9 gw9Var;
        long j = 0;
        byte b2 = 3;
        str = "";
        String str4 = null;
        r15 = null;
        r15 = null;
        r15 = null;
        String str5 = null;
        r4 = false;
        r4 = false;
        boolean z3 = false;
        switch (this.a) {
            case 0:
                ph6 ph6Var = (ph6) this.b;
                HashMap hashMap = ph6Var.I;
                ArrayList arrayList = ph6Var.H;
                mh6 mh6Var = ph6Var.a;
                ?? r6 = ph6Var.b;
                if (!ph6Var.L) {
                    ph6Var.L = true;
                    String h = f78.h(mh6Var.getText().toString(), false);
                    mh6Var.setText(h);
                    if (h.length() == 0) {
                        ph6Var.setCountryButtonText(null);
                        r6.setHintText(null);
                        ph6Var.F = (byte) 1;
                        z2 = false;
                    } else {
                        int i = 4;
                        if (h.length() > 4) {
                            while (true) {
                                if (i >= r9) {
                                    String substring = h.substring(0, i);
                                    List list = (List) hashMap.get(substring);
                                    if (list != null) {
                                        if (list.size() > r9) {
                                            String string = uc7.e1().getString("phone_code_last_matched_".concat(substring), str4);
                                            ?? r11 = (gy2) bp1.m(r9, list);
                                            if (string != null) {
                                                int size = arrayList.size();
                                                int i2 = 0;
                                                while (true) {
                                                    if (i2 < size) {
                                                        Object obj2 = arrayList.get(i2);
                                                        i2++;
                                                        gy2 gy2Var4 = (gy2) obj2;
                                                        if (Objects.equals(gy2Var4.d, string)) {
                                                            r11 = gy2Var4;
                                                        }
                                                    }
                                                }
                                            }
                                            str4 = r11;
                                        } else {
                                            str4 = (gy2) list.get(0);
                                        }
                                    }
                                    if (str4 != null) {
                                        String str6 = h.substring(i) + r6.getText().toString();
                                        mh6Var.setText(substring);
                                        str2 = str6;
                                        h = substring;
                                        z = true;
                                    } else {
                                        i--;
                                        r9 = 1;
                                        str4 = null;
                                    }
                                } else {
                                    z = false;
                                    str2 = null;
                                }
                            }
                            if (!z) {
                                str2 = h.substring(1) + r6.getText().toString();
                                h = h.substring(0, 1);
                                mh6Var.setText(h);
                            }
                        } else {
                            z = false;
                            str2 = null;
                        }
                        int size2 = arrayList.size();
                        int i3 = 0;
                        int i4 = 0;
                        gy2 gy2Var5 = null;
                        while (i4 < size2) {
                            Object obj3 = arrayList.get(i4);
                            i4++;
                            gy2 gy2Var6 = (gy2) obj3;
                            if (gy2Var6.c.startsWith(h)) {
                                int i5 = i3 + 1;
                                if (gy2Var6.c.equals(h)) {
                                    if (gy2Var5 == null || !gy2Var5.c.equals(gy2Var6.c)) {
                                        i3 = i5;
                                    }
                                    gy2Var5 = gy2Var6;
                                } else {
                                    i3 = i5;
                                }
                            }
                        }
                        if (i3 == 1 && gy2Var5 != null && str2 == null) {
                            str2 = h.substring(gy2Var5.c.length()) + r6.getText().toString();
                            h = gy2Var5.c;
                            mh6Var.setText(h);
                        }
                        List list2 = (List) hashMap.get(h);
                        if (list2 == null) {
                            b = 0;
                            gy2Var = null;
                        } else if (list2.size() > 1) {
                            String string2 = uc7.e1().getString("phone_code_last_matched_" + h, null);
                            gy2 gy2Var7 = (gy2) bp1.m(1, list2);
                            if (string2 != null) {
                                int size3 = arrayList.size();
                                int i6 = 0;
                                while (i6 < size3) {
                                    Object obj4 = arrayList.get(i6);
                                    i6++;
                                    gy2Var = (gy2) obj4;
                                    if (Objects.equals(gy2Var.d, string2)) {
                                        b = 0;
                                    }
                                }
                            }
                            gy2Var = gy2Var7;
                            b = 0;
                        } else {
                            b = 0;
                            gy2Var = (gy2) list2.get(0);
                        }
                        if (gy2Var != null) {
                            ph6Var.K = true;
                            ph6Var.G = gy2Var;
                            ph6Var.u(h, gy2Var);
                            ph6Var.F = b;
                        } else {
                            ph6Var.setCountryButtonText(null);
                            r6.setHintText(null);
                            ph6Var.F = (byte) 2;
                        }
                        if (!z) {
                            mh6Var.setSelection(mh6Var.getText().length());
                        }
                        if (str2 != null) {
                            r6.requestFocus();
                            r6.setText(str2);
                            r6.setSelection(r6.length());
                        }
                        z2 = false;
                    }
                    ph6Var.L = z2;
                    break;
                }
                break;
            case 1:
                pj pjVar = pj.a;
                a77 a77Var = (a77) this.b;
                EditTextBoldCursor editTextBoldCursor = a77Var.p1;
                a77Var.H0((editable == null || editable.toString().isEmpty()) ? oj.j(0L, pjVar) : oj.i(editable.toString(), pjVar), false, false, true);
                a77Var.o1.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(editTextBoldCursor.getText()));
                break;
            case 2:
                sl7 sl7Var = (sl7) this.b;
                HashMap hashMap2 = sl7Var.v1;
                ArrayList arrayList2 = sl7Var.u1;
                if (!sl7Var.x1) {
                    sl7Var.x1 = true;
                    String h2 = f78.h(sl7Var.H1.getText().toString(), false);
                    sl7Var.H1.setText(h2);
                    if (h2.length() == 0) {
                        sl7Var.G0(null);
                        sl7Var.J1.setHintText((String) null);
                    } else {
                        if (h2.length() > 4) {
                            int i7 = 4;
                            while (true) {
                                if (i7 >= 1) {
                                    String substring2 = h2.substring(0, i7);
                                    List list3 = (List) hashMap2.get(substring2);
                                    if (list3 == null) {
                                        gy2Var3 = null;
                                    } else if (list3.size() > 1) {
                                        String string3 = uc7.e1().getString("phone_code_last_matched_".concat(substring2), null);
                                        gy2Var3 = (gy2) bp1.m(1, list3);
                                        if (string3 != null) {
                                            int size4 = arrayList2.size();
                                            int i8 = 0;
                                            while (true) {
                                                if (i8 < size4) {
                                                    Object obj5 = arrayList2.get(i8);
                                                    i8++;
                                                    gy2 gy2Var8 = (gy2) obj5;
                                                    if (Objects.equals(gy2Var8.d, string3)) {
                                                        gy2Var3 = gy2Var8;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        gy2Var3 = (gy2) list3.get(0);
                                    }
                                    if (gy2Var3 != null) {
                                        String str7 = h2.substring(i7) + sl7Var.J1.getText().toString();
                                        sl7Var.H1.setText(substring2);
                                        str3 = str7;
                                        h2 = substring2;
                                        r7 = true;
                                    } else {
                                        i7--;
                                    }
                                } else {
                                    r7 = false;
                                    str3 = null;
                                }
                            }
                            if (r7 == false) {
                                str3 = h2.substring(1) + sl7Var.J1.getText().toString();
                                rl7 rl7Var = sl7Var.H1;
                                h2 = h2.substring(0, 1);
                                rl7Var.setText(h2);
                            }
                        } else {
                            r7 = false;
                            str3 = null;
                        }
                        int size5 = arrayList2.size();
                        int i9 = 0;
                        int i10 = 0;
                        gy2 gy2Var9 = null;
                        while (i10 < size5) {
                            Object obj6 = arrayList2.get(i10);
                            i10++;
                            gy2 gy2Var10 = (gy2) obj6;
                            if (gy2Var10.c.startsWith(h2)) {
                                i9++;
                                if (gy2Var10.c.equals(h2)) {
                                    gy2Var9 = gy2Var10;
                                }
                            }
                        }
                        if (i9 == 1 && gy2Var9 != null && str3 == null) {
                            str3 = h2.substring(gy2Var9.c.length()) + sl7Var.J1.getText().toString();
                            rl7 rl7Var2 = sl7Var.H1;
                            String str8 = gy2Var9.c;
                            rl7Var2.setText(str8);
                            h2 = str8;
                        }
                        List list4 = (List) hashMap2.get(h2);
                        if (list4 == null) {
                            gy2Var2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = uc7.e1().getString("phone_code_last_matched_" + h2, null);
                            gy2Var2 = (gy2) bp1.m(1, list4);
                            if (string4 != null) {
                                int size6 = arrayList2.size();
                                int i11 = 0;
                                while (true) {
                                    if (i11 < size6) {
                                        Object obj7 = arrayList2.get(i11);
                                        i11++;
                                        gy2 gy2Var11 = (gy2) obj7;
                                        if (Objects.equals(gy2Var11.d, string4)) {
                                            gy2Var2 = gy2Var11;
                                        }
                                    }
                                }
                            }
                        } else {
                            gy2Var2 = (gy2) list4.get(0);
                        }
                        if (gy2Var2 != null) {
                            sl7Var.z1 = true;
                            sl7Var.H0(h2, gy2Var2);
                        } else {
                            sl7Var.G0(null);
                            sl7Var.J1.setHintText((String) null);
                        }
                        if (r7 == false) {
                            rl7 rl7Var3 = sl7Var.H1;
                            rl7Var3.setSelection(rl7Var3.getText().length());
                        }
                        if (str3 != null && str3.length() != 0) {
                            sl7Var.J1.requestFocus();
                            sl7Var.J1.setText(str3);
                            rl7 rl7Var4 = sl7Var.J1;
                            rl7Var4.setSelection(rl7Var4.length());
                        }
                    }
                    sl7Var.x1 = false;
                    sl7Var.M0();
                    break;
                }
                break;
            case 3:
                lm7 lm7Var = (lm7) this.b;
                if (lm7Var.M) {
                    lm7Var.F0(editable.toString().trim());
                    break;
                }
                break;
            case 4:
                pt7 pt7Var = (pt7) this.b;
                str = editable != null ? editable.toString() : "";
                int indexOf2 = str.indexOf(46);
                if (!pt7Var.w1 && indexOf2 >= 0 && (str.length() - indexOf2) - 1 > 2) {
                    editable.delete(indexOf2 + 3, str.length());
                    break;
                } else {
                    r4 = (str.isEmpty() || ".".equals(str)) ? (byte) 1 : (byte) 0;
                    oj i12 = r4 == 0 ? oj.i(str, pj.b) : null;
                    if (r4 == 0) {
                        if (i12 == null) {
                            editable.delete(str.length() - 1, str.length());
                            break;
                        } else {
                            j = i12.b;
                        }
                    }
                    pt7Var.E0(j);
                    break;
                }
                break;
            case 5:
                fz7 fz7Var = (fz7) this.b;
                if (fz7Var.r.length() == 4 && xea.q == 0) {
                    fz7Var.n(false);
                    break;
                }
                break;
            case 6:
                j98 j98Var = ((l98) this.b).t0;
                if (j98Var != null) {
                    j98Var.l(editable);
                    break;
                }
                break;
            case 7:
                xg8 xg8Var = (xg8) this.b;
                int length = xg8Var.a.getText().length();
                fm0 fm0Var = xg8Var.I;
                int i13 = xg8Var.y;
                fm0Var.a(length > (i13 * 7) / 10, true);
                xg8Var.J.a(length > i13, true);
                xg8Var.f.l(Integer.toString(i13 - length), false);
                break;
            case 8:
                cw9 cw9Var = (cw9) this.b;
                ImageView imageView = cw9Var.b;
                xs0 xs0Var = cw9Var.d;
                byte b3 = xs0Var.length() > 0 ? (byte) 1 : (byte) 0;
                if (b3 != (imageView.getAlpha() == 0.0f ? (byte) 0 : (byte) 1)) {
                    imageView.animate().alpha(b3 != 0 ? 1.0f : 0.0f).setDuration(150L).scaleX(b3 != 0 ? 1.0f : 0.1f).scaleY(b3 == 0 ? 0.1f : 1.0f).start();
                }
                cw9Var.a(xs0Var.getText().toString());
                break;
            case 9:
                break;
            case 10:
                e0a e0aVar = (e0a) this.b;
                qy qyVar = e0aVar.h;
                String obj8 = (qyVar.getText() == null || hl.J3(qyVar.getText(), null).length() == 0) ? null : qyVar.getText().toString();
                e0aVar.G.v(obj8, true, true);
                b1a b1aVar = e0aVar.n;
                if (b1aVar != null) {
                    b1aVar.J1(null);
                    e0aVar.n.K1(TextUtils.isEmpty(obj8), true);
                }
                if (qyVar != null) {
                    qyVar.clearAnimation();
                    qyVar.animate().translationX(0.0f).setInterpolator(k43.h).start();
                }
                e0aVar.b(false);
                break;
            case 11:
                ((r1a) this.b).l2 = editable.toString();
                r1a r1aVar = (r1a) this.b;
                if (!r1aVar.U1) {
                    String str9 = r1aVar.q2;
                    String str10 = r1aVar.l2;
                    if (str10 == null) {
                        str10 = "";
                    }
                    if (!TextUtils.equals(str9, str10)) {
                        ((r1a) this.b).b1();
                        r1a r1aVar2 = (r1a) this.b;
                        String str11 = r1aVar2.l2;
                        r1aVar2.p2 = str11 != null && str11.length() > 0;
                    }
                    r1a r1aVar3 = (r1a) this.b;
                    String str12 = r1aVar3.B2;
                    String str13 = r1aVar3.l2;
                    if (!TextUtils.equals(str12, str13 != null ? str13 : "")) {
                        ((r1a) this.b).a1();
                        r1a r1aVar4 = (r1a) this.b;
                        String str14 = r1aVar4.l2;
                        if (str14 != null && str14.length() > 3 && !TextUtils.isEmpty(uc7.s1(((r1a) this.b).a).l4.Q.f)) {
                            z3 = true;
                        }
                        r1aVar4.w2 = z3;
                    }
                    p1a p1aVar = ((r1a) this.b).s2;
                    hl.r(p1aVar);
                    hl.d3(p1aVar, 400L);
                    p1a p1aVar2 = ((r1a) this.b).D2;
                    hl.r(p1aVar2);
                    hl.d3(p1aVar2, 400L);
                }
                ((r1a) this.b).j2.O(true);
                break;
            case 12:
                b3a b3aVar = (b3a) this.b;
                if (!b3aVar.h && (pccVar = b3aVar.n) != null && editable != null) {
                    pccVar.a(editable.toString());
                    break;
                }
                break;
            case 13:
                h4a h4aVar = (h4a) this.b;
                EditTextBoldCursor editTextBoldCursor2 = h4aVar.m1;
                ?? r3 = editable == null || editable.toString().isEmpty() || ".".equals(editable.toString());
                if (r3 == false && (indexOf = (obj = editable.toString()).indexOf(46)) >= 0 && (obj.length() - indexOf) - 1 > 2) {
                    editable.delete(indexOf + 3, obj.length());
                }
                h4aVar.F0(r3 == false ? oj.i(editable.toString(), h4aVar.y1.a) : oj.j(0L, h4aVar.y1.a), false, false, true);
                h4aVar.l1.c(editTextBoldCursor2.isFocused(), !TextUtils.isEmpty(editTextBoldCursor2.getText()));
                break;
            case 14:
                break;
            case 15:
                t9b t9bVar = (t9b) this.b;
                if (!t9bVar.n && (pccVar2 = t9bVar.r) != null && editable != null) {
                    pccVar2.a(editable.toString());
                    break;
                }
                break;
            case 16:
                zeb zebVar = (zeb) this.b;
                xeb xebVar = zebVar.c;
                if (xebVar != null && xebVar.getVisibility() == 0) {
                    zebVar.d();
                    break;
                }
                break;
            case 17:
                sjb sjbVar = (sjb) this.b;
                if (!sjbVar.y) {
                    String trim = editable.toString().trim();
                    int length2 = trim.length();
                    in inVar = sjbVar.n;
                    if (length2 > 16) {
                        inVar.setText("-" + (trim.length() - 16));
                        trim = trim.substring(0, 16);
                    } else {
                        inVar.setText("");
                    }
                    pcc pccVar3 = sjbVar.x;
                    if (pccVar3 != null) {
                        pccVar3.a(trim);
                    }
                    r47 r47Var = sjbVar.r;
                    if (r47Var != null) {
                        r47Var.M1 = true;
                        sjbVar.d.z3(r47Var, null, false, false, false, false);
                        break;
                    }
                }
                break;
            case 18:
                xqb xqbVar = (xqb) this.b;
                if (!xqbVar.I) {
                    if (xqbVar.a.length() <= 0) {
                        xqbVar.d.setText(xqbVar.H);
                        break;
                    } else {
                        String str15 = "https://" + xqbVar.getMessagesController().N2 + "/addtheme/" + ((Object) xqbVar.a.getText());
                        String a0 = ob6.a0("ThemeHelpLink", null, 2131743834, str15);
                        int indexOf3 = a0.indexOf(str15);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a0);
                        if (indexOf3 >= 0) {
                            spannableStringBuilder.setSpan(new r1((byte) 8, str15, (e) xqbVar), indexOf3, str15.length() + indexOf3, 33);
                        }
                        xqbVar.d.setText(TextUtils.concat(xqbVar.H, "\n\n", spannableStringBuilder));
                        break;
                    }
                }
                break;
            case 19:
                String trim2 = editable.toString().trim();
                wxb wxbVar = (wxb) this.b;
                String str16 = wxbVar.n;
                if (trim2.length() > 0) {
                    str = trim2.substring(0, 1).toUpperCase();
                    wxbVar.n = str;
                } else {
                    wxbVar.n = "";
                }
                if (!str16.equals(str)) {
                    s26 s26Var = new s26(1, null);
                    s26Var.a(wxbVar.n);
                    ya9 ya9Var = wxbVar.w;
                    if (ya9Var != null) {
                        ya9Var.b(s26Var, true);
                        break;
                    }
                }
                break;
            case 20:
                n0c n0cVar = (n0c) this.b;
                String lowerCase = editable.toString().trim().toLowerCase();
                n0cVar.M = lowerCase;
                if (lowerCase.startsWith("@")) {
                    n0cVar.M = n0cVar.M.substring(1);
                }
                n0cVar.l(true);
                n0cVar.n();
                break;
            case 21:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                u6c u6cVar = twoStepVerificationActivity.W;
                if (twoStepVerificationActivity.V) {
                    hl.r(u6cVar);
                    u6cVar.run();
                    break;
                }
                break;
            case 22:
                wbc wbcVar = (wbc) this.b;
                String obj9 = wbcVar.L.getText().toString();
                xbc xbcVar = wbcVar.M;
                int b4 = xbcVar.n1.getAdapter() == null ? 0 : xbcVar.n1.getAdapter().b();
                xbcVar.H0(obj9);
                if (TextUtils.isEmpty(obj9) && (gw9Var = xbcVar.n1) != null) {
                    j79 adapter = gw9Var.getAdapter();
                    c79 c79Var = xbcVar.p1;
                    if (adapter != c79Var) {
                        gw9 gw9Var2 = xbcVar.n1;
                        gw9Var2.X1 = false;
                        gw9Var2.Y1 = false;
                        gw9Var2.setAdapter(c79Var);
                        gw9 gw9Var3 = xbcVar.n1;
                        gw9Var3.X1 = true;
                        gw9Var3.Y1 = false;
                        if (b4 == 0) {
                            xbcVar.K0(0);
                        }
                    }
                }
                xbcVar.u1.setVisibility(0);
                break;
            case 23:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                if (usersSelectActivity.c.length() == 0) {
                    usersSelectActivity.O = false;
                    usersSelectActivity.N = false;
                    bcc bccVar = usersSelectActivity.h;
                    if (bccVar.n) {
                        bccVar.n = false;
                        bccVar.f();
                    }
                    usersSelectActivity.h.L(null);
                    usersSelectActivity.d.setFastScrollVisible(true);
                    usersSelectActivity.d.setVerticalScrollBarEnabled(false);
                    usersSelectActivity.f.d.setText(ob6.M0(2131747954, null));
                    break;
                } else {
                    bcc bccVar2 = usersSelectActivity.h;
                    boolean z4 = bccVar2.n;
                    if (!z4) {
                        usersSelectActivity.O = true;
                        usersSelectActivity.N = true;
                        if (!z4) {
                            bccVar2.n = true;
                            bccVar2.f();
                        }
                        usersSelectActivity.d.setFastScrollVisible(false);
                        usersSelectActivity.d.setVerticalScrollBarEnabled(true);
                        usersSelectActivity.f.d.setText(ob6.M0(2131747898, null));
                    }
                    usersSelectActivity.f.e(true, true);
                    usersSelectActivity.h.L(usersSelectActivity.c.getText().toString());
                    break;
                }
            case 24:
                snc sncVar = (snc) this.b;
                sncVar.n = editable.toString();
                knc kncVar = sncVar.L;
                if (kncVar != null) {
                    kncVar.invalidate();
                    break;
                }
                break;
            case 25:
                break;
            case 26:
                ((euc) this.b).C0();
                break;
            case 27:
                final muc mucVar = (muc) this.b;
                ArrayList arrayList3 = mucVar.w;
                arrayList3.clear();
                final String trim3 = editable.toString().trim();
                Runnable runnable = mucVar.L;
                if (runnable != null) {
                    hl.r(runnable);
                    mucVar.L = null;
                }
                if (mucVar.F != 0) {
                    mucVar.getConnectionsManager().cancelRequest(mucVar.F, true);
                    mucVar.F = 0;
                }
                String str17 = WalletEngine2.isValidRecipientAddress(trim3) ? trim3 : null;
                mucVar.y = str17;
                if (str17 == null && trim3 != null && trim3.length() <= 126) {
                    String lowerCase2 = trim3.toLowerCase(Locale.ROOT);
                    if (lowerCase2.matches("[a-z0-9_-]+(?:\\.[a-z0-9_-]+)*\\.ton")) {
                        str5 = lowerCase2;
                    }
                }
                mucVar.E = str5;
                final int i14 = mucVar.K + 1;
                mucVar.K = i14;
                mucVar.M = !TextUtils.isEmpty(trim3) && mucVar.y == null;
                mucVar.x.g(null, true, false, false, false, 0L, false, 0, i14);
                c51 c51Var = mucVar.a0;
                if (c51Var != null) {
                    c51Var.setEnabled(mucVar.y != null);
                }
                if (!TextUtils.isEmpty(trim3) && mucVar.y == null && mucVar.E == null) {
                    mucVar.i0(trim3);
                    Runnable runnable2 = new Runnable() { // from class: luc
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b5 = r4;
                            muc mucVar2 = mucVar;
                            switch (b5) {
                                case 0:
                                    mucVar2.f0(i14, trim3);
                                    break;
                                default:
                                    mucVar2.L = null;
                                    sv9 sv9Var = mucVar2.x;
                                    int i15 = i14;
                                    sv9Var.h(trim3, true, false, false, false, false, 0L, false, 0, i15, 0L, new zsc(mucVar2, i15, (byte) 1));
                                    break;
                            }
                        }
                    };
                    mucVar.L = runnable2;
                    hl.d3(runnable2, 300L);
                } else {
                    arrayList3.clear();
                    mucVar.a.g3.O(true);
                    final String str18 = mucVar.E;
                    if (str18 != null) {
                        Runnable runnable3 = new Runnable() { // from class: luc
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b5 = r4;
                                muc mucVar2 = mucVar;
                                switch (b5) {
                                    case 0:
                                        mucVar2.f0(i14, str18);
                                        break;
                                    default:
                                        mucVar2.L = null;
                                        sv9 sv9Var = mucVar2.x;
                                        int i15 = i14;
                                        sv9Var.h(str18, true, false, false, false, false, 0L, false, 0, i15, 0L, new zsc(mucVar2, i15, (byte) 1));
                                        break;
                                }
                            }
                        };
                        mucVar.L = runnable3;
                        hl.d3(runnable3, 300L);
                    }
                }
                mucVar.o0(true);
                break;
            case 28:
                zuc zucVar = (zuc) this.b;
                if (zucVar.w && !editable.toString().trim().toLowerCase().matches(".*\\s+.*") && zucVar.b()) {
                    zucVar.setError(false);
                }
                zucVar.e();
                zucVar.d();
                if (zucVar.a.hasFocus()) {
                    zucVar.f(editable.toString().trim().toLowerCase());
                }
                Runnable runnable4 = zucVar.f;
                if (runnable4 != null) {
                    runnable4.run();
                    break;
                }
                break;
            default:
                xt xtVar = (xt) this.b;
                hl.P3(xtVar.K, editable.length() > 0 && xtVar.U, true);
                String obj10 = editable.toString();
                o oVar = xtVar.C0;
                String lowerCase3 = obj10.toLowerCase();
                bf7 bf7Var = oVar.X0;
                if (bf7Var != null) {
                    hl.r(bf7Var);
                    oVar.X0 = null;
                }
                byte b5 = 7;
                if (!TextUtils.isEmpty(lowerCase3)) {
                    int i15 = oVar.Y0 + 1;
                    oVar.Y0 = i15;
                    if (!oVar.v0[0].e()) {
                        bf7 bf7Var2 = new bf7(oVar, lowerCase3, i15, b2);
                        oVar.X0 = bf7Var2;
                        hl.d3(bf7Var2, 400L);
                        break;
                    } else {
                        oVar.b0(true);
                        if (oVar.v0[0].getWebView() != null) {
                            nv0 webView = oVar.v0[0].getWebView();
                            webView.J = new ys(oVar, b5);
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
                        mVarArr[0].b.i1();
                        oVar.U(0);
                    } else if (mVarArr[0].getWebView() != null) {
                        nv0 webView2 = oVar.v0[0].getWebView();
                        webView2.J = new ys(oVar, b5);
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
            case 5:
                fz7 fz7Var = (fz7) this.b;
                LinkedList linkedList = fz7Var.W;
                LinkedList linkedList2 = fz7Var.V;
                Drawable drawable = fz7Var.a;
                if (drawable instanceof ih7) {
                    ih7 ih7Var = (ih7) drawable;
                    ih7Var.C = null;
                    ih7Var.x();
                    float f = ih7Var.h;
                    int i4 = 0;
                    boolean z2 = true;
                    if (i2 == 0 && i3 == 1) {
                        ih7Var.v(true);
                        z = true;
                    } else if (i2 == 1 && i3 == 0) {
                        ih7Var.w();
                        z = false;
                    } else {
                        z = false;
                        z2 = false;
                    }
                    if (z2) {
                        if (f >= 1.0f) {
                            fz7Var.a(ih7Var);
                            break;
                        } else {
                            linkedList2.offer(new yn6((Object) this, z, (Object) ih7Var, (byte) 7));
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
        o7 searchListener;
        byte b = this.a;
        int i4 = 0;
        Object obj = this.b;
        switch (b) {
            case 9:
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
            case 14:
                jla jlaVar = (jla) obj;
                jlaVar.m();
                searchListener = jlaVar.getSearchListener();
                if (searchListener != null) {
                    searchListener.l(jlaVar.s);
                    break;
                }
                break;
            case 18:
                xqb xqbVar = (xqb) obj;
                if (!xqbVar.G) {
                    xqbVar.Y(xqbVar.a.getText().toString(), false);
                    break;
                }
                break;
            case 25:
                ((fpc) obj).a(charSequence.toString());
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

    private final void e0(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void f(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void f0(int i, int i2, int i3, CharSequence charSequence) {
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
