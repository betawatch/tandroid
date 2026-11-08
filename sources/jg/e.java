package jg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.x5;
import c8.ha;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.d5;
import org.telegram.messenger.g5;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.q4;
import org.telegram.ui.Cells.s4;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Cells.y6;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.tm;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.yp;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public abstract class e extends kj0 {
    public ArrayList D;
    public final boolean E;
    public int F;
    public final boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public float M;
    public final Context s;
    public final int w;
    public final boolean x;
    public final a0.h y;
    public final int r = p10.s0;
    public float L = 1.0f;
    public final ArrayList N = new ArrayList();

    public e(Context context, int i7, boolean z9, a0.h hVar, int i10) {
        this.s = context;
        this.w = i7;
        this.x = z9;
        this.y = hVar;
        this.E = i10 != 0;
        this.G = i10 == 2;
    }

    @Override // org.telegram.ui.Components.vi0
    public final String F(int i7) {
        if (this.F == 2 || this.I) {
            return null;
        }
        int i10 = this.r;
        int i11 = this.w;
        g5 r10 = g5.r(i10);
        ArrayList arrayList = i11 == 2 ? r10.j0 : r10.h0;
        int S = S(i7);
        if (S == -1) {
            S = arrayList.size() - 1;
        }
        if (i11 == 0 || this.E) {
            if (S <= 0 || S > arrayList.size()) {
                return null;
            }
            return (String) arrayList.get(S - 1);
        }
        if (S < 0 || S >= arrayList.size()) {
            return null;
        }
        return (String) arrayList.get(S);
    }

    @Override // org.telegram.ui.Components.vi0
    public final void G(pj0 pj0Var, float f10, int[] iArr) {
        iArr[0] = (int) (b() * f10);
        iArr[1] = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.kj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int M(int i7) {
        boolean z9 = this.K;
        int i10 = this.r;
        if (z9) {
            if (i7 == 0) {
                return 1;
            }
            if (i7 == 1) {
                return g5.r(i10).a0.size() + 2;
            }
            return 0;
        }
        int i11 = this.w;
        g5 r10 = g5.r(i10);
        HashMap hashMap = i11 == 2 ? r10.i0 : r10.g0;
        g5 r11 = g5.r(i10);
        ArrayList arrayList = i11 == 2 ? r11.j0 : r11.h0;
        boolean z10 = this.E;
        boolean z11 = this.x;
        if (i11 != 0 && !z10) {
            if (!this.I) {
                if (i7 < arrayList.size()) {
                    int size = ((ArrayList) hashMap.get(arrayList.get(i7))).size();
                    return (i7 != arrayList.size() - 1 || z11) ? size + 1 : size;
                }
                if (z11) {
                }
            }
            return 1;
        }
        if (i7 == 0) {
            if (this.I) {
                return 2;
            }
            return z10 ? 3 : 4;
        }
        if (!this.I) {
            if (this.F != 2) {
                int i12 = i7 - 1;
                if (i12 < arrayList.size()) {
                    int size2 = ((ArrayList) hashMap.get(arrayList.get(i12))).size();
                    arrayList.size();
                    return size2;
                }
            } else if (i7 == 1) {
                if (this.D.isEmpty()) {
                    return 0;
                }
                return this.D.size();
            }
            if (z11) {
                return 0;
            }
            return g5.r(i10).a0.size();
        }
        return 1;
    }

    @Override // org.telegram.ui.Components.kj0
    public final int N(int i7, int i10) {
        return Objects.hash(Integer.valueOf(i7 * (-49612)), O(i7, i10));
    }

    @Override // org.telegram.ui.Components.kj0
    public final Object O(int i7, int i10) {
        int i11;
        boolean z9 = this.K;
        int i12 = this.r;
        if (z9 && i7 == 1 && i10 > 1 && i10 - 2 < g5.r(i12).a0.size()) {
            return g5.r(i12).a0.get(i11);
        }
        if (P(i7, i10) == 2) {
            return "Header";
        }
        int i13 = this.w;
        g5 r10 = g5.r(i12);
        HashMap hashMap = i13 == 2 ? r10.i0 : r10.g0;
        g5 r11 = g5.r(i12);
        ArrayList arrayList = i13 == 2 ? r11.j0 : r11.h0;
        if (i13 != 0 && !this.E) {
            if (i7 < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) hashMap.get(arrayList.get(i7));
                if (i10 < arrayList2.size()) {
                    return qp.s1(i12).a2(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i10)).user_id));
                }
            }
            return null;
        }
        if (i7 == 0) {
            return null;
        }
        if (this.F != 2) {
            int i14 = i7 - 1;
            if (i14 < arrayList.size()) {
                ArrayList arrayList3 = (ArrayList) hashMap.get(arrayList.get(i14));
                if (i10 < arrayList3.size()) {
                    return qp.s1(i12).a2(Long.valueOf(((TLRPC.TL_contact) arrayList3.get(i10)).user_id));
                }
                return null;
            }
        } else if (i7 == 1) {
            if (i10 < this.D.size()) {
                return qp.s1(i12).a2(Long.valueOf(((TLRPC.TL_contact) this.D.get(i10)).user_id));
            }
            return null;
        }
        if (!this.x || i10 < 0 || i10 >= g5.r(i12).a0.size()) {
            return null;
        }
        return g5.r(i12).a0.get(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0089 A[RETURN] */
    @Override // org.telegram.ui.Components.kj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int P(int i7, int i10) {
        if (this.K) {
            if (i7 == 0) {
                return 4;
            }
            if (i7 != 1) {
                return 8;
            }
            if (i10 == 0) {
                return 5;
            }
            return i10 == 1 ? 7 : 8;
        }
        int i11 = this.w;
        int i12 = this.r;
        g5 r10 = g5.r(i12);
        HashMap hashMap = i11 == 2 ? r10.i0 : r10.g0;
        g5 r11 = g5.r(i12);
        ArrayList arrayList = i11 == 2 ? r11.j0 : r11.h0;
        boolean z9 = this.E;
        if (i11 == 0 || z9) {
            if (i7 == 0) {
                if (z9) {
                    if (i10 == 1) {
                        return 5;
                    }
                    if (i10 == 2) {
                        int i13 = this.F;
                        return (i13 == 1 || i13 == 2) ? 7 : 2;
                    }
                } else if (this.x) {
                    if (i10 >= 2) {
                        if (i10 == 2) {
                            return 5;
                        }
                        if (i10 == 3) {
                            if (this.I) {
                                return 5;
                            }
                            int i14 = this.F;
                            if (i14 == 1 || i14 == 2) {
                                return 7;
                            }
                        }
                    }
                } else {
                    if (i10 == 2) {
                        return 5;
                    }
                    if (i10 == 3) {
                        if (this.I) {
                            return 5;
                        }
                        int i15 = this.F;
                        if (i15 == 1 || i15 == 2) {
                            return 7;
                        }
                    }
                }
            } else {
                if (this.I) {
                    return 4;
                }
                if (this.F != 2) {
                    int i16 = i7 - 1;
                    if (i16 < arrayList.size()) {
                        if (i10 < ((ArrayList) hashMap.get(arrayList.get(i16))).size()) {
                            return 0;
                        }
                    }
                } else if (i7 == 1) {
                    if (i10 < this.D.size()) {
                        return 0;
                    }
                }
            }
            return 1;
        }
        if (this.I) {
            return 4;
        }
        if (i10 < ((ArrayList) hashMap.get(arrayList.get(i7))).size()) {
            return 0;
        }
        return 3;
    }

    @Override // org.telegram.ui.Components.kj0
    public final View T(int i7, View view) {
        int i10 = this.r;
        int i11 = this.w;
        g5.r(i10);
        g5 r10 = g5.r(i10);
        ArrayList arrayList = i11 == 2 ? r10.j0 : r10.h0;
        View view2 = view;
        if (view == null) {
            s4 s4Var = new s4(this.s);
            s4Var.setLayoutParams(new ViewGroup.LayoutParams(org.telegram.messenger.g0.L(76.0f), org.telegram.messenger.g0.L(64.0f)));
            TextView textView = new TextView(s4Var.getContext());
            s4Var.a = textView;
            com.google.android.recaptcha.internal.a.q(textView, 1, 22.0f);
            r6.V(textView, k6.B6, null);
            textView.setGravity(17);
            s4Var.addView(textView, ha.d(-1, -1.0f, qs.E1, 12.0f, 0.0f, 0.0f, 0.0f));
            this.N.add(s4Var);
            view2 = s4Var;
        }
        s4 s4Var2 = (s4) view2;
        float f10 = this.M;
        if (f10 > 0.0f) {
            s4Var2.setLetterTextSize(f10);
        }
        s4Var2.setLetterProgress(this.L);
        if (this.F == 2 || this.H || this.I) {
            s4Var2.setLetter("");
            return view2;
        }
        if (i11 != 0 && !this.E) {
            if (i7 < arrayList.size()) {
                s4Var2.setLetter((String) arrayList.get(i7));
                return view2;
            }
            s4Var2.setLetter("");
            return view2;
        }
        if (i7 == 0) {
            s4Var2.setLetter("");
            return view2;
        }
        int i12 = i7 - 1;
        if (i12 < arrayList.size()) {
            s4Var2.setLetter((String) arrayList.get(i12));
            return view2;
        }
        s4Var2.setLetter("");
        return view2;
    }

    @Override // org.telegram.ui.Components.kj0
    public final boolean V(int i7, int i10, v4.d1 d1Var) {
        if (!this.K) {
            int i11 = this.w;
            int i12 = this.r;
            g5 r10 = g5.r(i12);
            HashMap hashMap = i11 == 2 ? r10.i0 : r10.g0;
            g5 r11 = g5.r(i12);
            ArrayList arrayList = i11 == 2 ? r11.j0 : r11.h0;
            boolean z9 = this.E;
            if (i11 == 0 || z9) {
                if (i7 == 0) {
                    if (z9) {
                        if (i10 >= 1) {
                            return false;
                        }
                    } else if (this.x) {
                        if (i10 >= 2) {
                            return false;
                        }
                    } else if (i10 >= 3) {
                        return false;
                    }
                } else {
                    if (this.I) {
                        return false;
                    }
                    if (this.F != 2) {
                        int i13 = i7 - 1;
                        if (i13 < arrayList.size() && i10 >= ((ArrayList) hashMap.get(arrayList.get(i13))).size()) {
                            return false;
                        }
                    } else if (i7 == 1 && i10 >= this.D.size()) {
                        return false;
                    }
                }
            } else if (this.I || i10 >= ((ArrayList) hashMap.get(arrayList.get(i7))).size()) {
                return false;
            }
        } else if (i7 != 1 || i10 <= 1) {
            return false;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.kj0
    public final void W(int i7, int i10, v4.d1 d1Var) {
        ArrayList arrayList;
        int i11 = d1Var.f;
        View view = d1Var.a;
        int i12 = 7;
        boolean z9 = this.E;
        int i13 = this.r;
        if (i11 == 0) {
            pa paVar = (pa) view;
            paVar.T.a = false;
            if (this.F != 2 && !this.H) {
                i12 = 58;
            }
            paVar.b(i12, 1);
            if (this.F == 2) {
                arrayList = this.D;
            } else {
                int i14 = this.w;
                g5 r10 = g5.r(i13);
                arrayList = (ArrayList) (i14 == 2 ? r10.i0 : r10.g0).get((i14 == 2 ? g5.r(i13).j0 : g5.r(i13).h0).get(i7 - ((i14 == 0 || z9) ? 1 : 0)));
            }
            TLRPC.User a22 = qp.s1(i13).a2(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i10)).user_id));
            paVar.d(a22, null, null, false);
            paVar.c(this.y.h(a22.id) >= 0, false);
            return;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                x3 x3Var = (x3) view;
                int i15 = this.F;
                if (i15 == 0) {
                    x3Var.setText(id.M0(2131751780, null));
                    return;
                } else if (i15 == 1) {
                    x3Var.setText(id.M0(2131745287, null));
                    return;
                } else {
                    x3Var.setText(id.M0(2131745288, null));
                    return;
                }
            }
            if (i11 == 4) {
                view.setPadding(0, org.telegram.messenger.g0.L(!this.J ? 96.0f : 25.0f), 0, org.telegram.messenger.g0.L(18.0f));
                return;
            }
            if (i11 != 7) {
                if (i11 != 8) {
                    return;
                }
                q4 q4Var = (q4) view;
                int i16 = i10 - 2;
                if (i16 < 0 || i16 >= g5.r(i13).a0.size()) {
                    return;
                }
                q4Var.a((d5) g5.r(i13).a0.get(i16), null);
                return;
            }
            n4 n4Var = (n4) view;
            if (this.K && i10 == 1 && i7 == 1) {
                n4Var.setText(id.M0(2131749152, null));
                return;
            } else if (this.F == 1) {
                n4Var.setText(id.M0(2131745287, null));
                return;
            } else {
                n4Var.setText(id.M0(2131745288, null));
                return;
            }
        }
        m8 m8Var = (m8) view;
        boolean z10 = this.x;
        if (z10 || !z9) {
            int i17 = k6.G6;
            m8Var.g(i17, i17);
        } else {
            int i18 = k6.Wl;
            m8Var.g(i18, i18);
        }
        if (i7 != 0) {
            d5 d5Var = (d5) g5.r(i13).a0.get(i10);
            String str = d5Var.i;
            if (str == null || d5Var.j == null) {
                if (str == null || d5Var.j != null) {
                    m8Var.k(d5Var.j, false);
                    return;
                } else {
                    m8Var.k(str, false);
                    return;
                }
            }
            m8Var.k(d5Var.i + " " + d5Var.j, false);
            return;
        }
        if (z10) {
            if (i10 == 0) {
                m8Var.r(id.M0(2131749152, null), "", false, R.drawable.settings_invite, -14899731, -15431455, false);
                return;
            } else {
                if (i10 == 1) {
                    m8Var.r(id.M0(2131746370, null), "", false, R.drawable.settings_calls, -11154873, -14175180, false);
                    return;
                }
                return;
            }
        }
        if (z9) {
            if (this.G) {
                m8Var.o(R.drawable.msg_link2, id.M0(2131752402, null), false);
                return;
            } else {
                m8Var.o(R.drawable.msg_link2, id.M0(2131749111, null), false);
                return;
            }
        }
        if (i10 == 0) {
            m8Var.r(id.M0(2131748274, null), "", false, R.drawable.settings_group, -14899731, -15431455, false);
        } else if (i10 == 1) {
            m8Var.r(id.M0(2131748287, null), "", false, R.drawable.settings_channel, -11154873, -14175180, false);
        }
    }

    public final void Y(int i7, boolean z9) {
        this.F = i7;
        if (i7 != 2) {
            f();
            return;
        }
        if (this.D == null || z9) {
            int i10 = this.r;
            this.D = new ArrayList(g5.r(i10).e0);
            long j3 = p10.i(i10).n;
            int size = this.D.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                if (((TLRPC.TL_contact) this.D.get(i11)).user_id == j3) {
                    this.D.remove(i11);
                    break;
                }
                i11++;
            }
        }
        Z();
    }

    public final void Z() {
        int i7 = this.r;
        if (this.D == null) {
            return;
        }
        try {
            int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
            Collections.sort(this.D, new d(qp.s1(i7), currentTime, 0));
            f();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        Context context = this.s;
        if (i7 == 0) {
            pa paVar = new pa(context, 58, 1, false);
            paVar.setCallCellStyle(58);
            view = paVar;
        } else if (i7 == 1) {
            view = new m8(context);
        } else if (i7 == 2) {
            view = new x3(context, null);
        } else if (i7 != 3) {
            if (i7 == 4) {
                FrameLayout x5Var = new x5(this, context, viewGroup, 5);
                x5Var.addView(new yp(context), ha.e(-1, -2, 17));
                x5Var.setLayoutParams(new v4.o0(-1, -2));
                x5Var.setTag(-33024);
                view2 = x5Var;
            } else if (i7 == 7) {
                view = new n4(this.s, k6.L6, 21, 14, 5, false, false, null);
            } else if (i7 == 8) {
                view = new q4(context, false);
            } else if (i7 != 9) {
                view = new y6(context, (org.telegram.ui.Cells.f1) null);
            } else {
                View tmVar = new tm(context, 3);
                tmVar.setId(9);
                tmVar.setTag(-33024);
                view2 = tmVar;
            }
            view = view2;
        } else {
            View e3Var = new e3(context, null);
            e3Var.setPadding(org.telegram.messenger.g0.L(id.a0 ? 28.0f : 72.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(id.a0 ? 72.0f : 28.0f), org.telegram.messenger.g0.L(8.0f));
            view = e3Var;
        }
        return new xi0(view);
    }
}
