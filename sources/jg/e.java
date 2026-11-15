package jg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ja;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.d5;
import org.telegram.messenger.g5;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.q4;
import org.telegram.ui.Cells.s4;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class e extends pj0 {
    public ArrayList E;
    public final boolean F;
    public int G;
    public final boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public float N;
    public final Context s;
    public final int w;
    public final boolean x;
    public final a0.h y;
    public final int r = m10.t0;
    public float M = 1.0f;
    public final ArrayList O = new ArrayList();

    public e(Context context, int i7, boolean z10, a0.h hVar, int i10) {
        this.s = context;
        this.w = i7;
        this.x = z10;
        this.y = hVar;
        this.F = i10 != 0;
        this.H = i10 == 2;
    }

    @Override // org.telegram.ui.Components.aj0
    public final String F(int i7) {
        if (this.G == 2 || this.J) {
            return null;
        }
        int i10 = this.r;
        int i11 = this.w;
        g5 r10 = g5.r(i10);
        ArrayList arrayList = i11 == 2 ? r10.k0 : r10.i0;
        int S = S(i7);
        if (S == -1) {
            S = arrayList.size() - 1;
        }
        if (i11 == 0 || this.F) {
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

    @Override // org.telegram.ui.Components.aj0
    public final void G(uj0 uj0Var, float f10, int[] iArr) {
        iArr[0] = (int) (b() * f10);
        iArr[1] = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.pj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int M(int i7) {
        boolean z10 = this.L;
        int i10 = this.r;
        if (z10) {
            if (i7 == 0) {
                return 1;
            }
            if (i7 == 1) {
                return g5.r(i10).b0.size() + 2;
            }
            return 0;
        }
        int i11 = this.w;
        g5 r10 = g5.r(i10);
        HashMap hashMap = i11 == 2 ? r10.j0 : r10.h0;
        g5 r11 = g5.r(i10);
        ArrayList arrayList = i11 == 2 ? r11.k0 : r11.i0;
        boolean z11 = this.F;
        boolean z12 = this.x;
        if (i11 != 0 && !z11) {
            if (!this.J) {
                if (i7 < arrayList.size()) {
                    int size = ((ArrayList) hashMap.get(arrayList.get(i7))).size();
                    return (i7 != arrayList.size() - 1 || z12) ? size + 1 : size;
                }
                if (z12) {
                }
            }
            return 1;
        }
        if (i7 == 0) {
            if (this.J) {
                return 2;
            }
            return z11 ? 3 : 4;
        }
        if (!this.J) {
            if (this.G != 2) {
                int i12 = i7 - 1;
                if (i12 < arrayList.size()) {
                    int size2 = ((ArrayList) hashMap.get(arrayList.get(i12))).size();
                    arrayList.size();
                    return size2;
                }
            } else if (i7 == 1) {
                if (this.E.isEmpty()) {
                    return 0;
                }
                return this.E.size();
            }
            if (z12) {
                return 0;
            }
            return g5.r(i10).b0.size();
        }
        return 1;
    }

    @Override // org.telegram.ui.Components.pj0
    public final int N(int i7, int i10) {
        return Objects.hash(Integer.valueOf(i7 * (-49612)), O(i7, i10));
    }

    @Override // org.telegram.ui.Components.pj0
    public final Object O(int i7, int i10) {
        int i11;
        boolean z10 = this.L;
        int i12 = this.r;
        if (z10 && i7 == 1 && i10 > 1 && i10 - 2 < g5.r(i12).b0.size()) {
            return g5.r(i12).b0.get(i11);
        }
        if (P(i7, i10) == 2) {
            return "Header";
        }
        int i13 = this.w;
        g5 r10 = g5.r(i12);
        HashMap hashMap = i13 == 2 ? r10.j0 : r10.h0;
        g5 r11 = g5.r(i12);
        ArrayList arrayList = i13 == 2 ? r11.k0 : r11.i0;
        if (i13 != 0 && !this.F) {
            if (i7 < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) hashMap.get(arrayList.get(i7));
                if (i10 < arrayList2.size()) {
                    return np.s1(i12).a2(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i10)).user_id));
                }
            }
            return null;
        }
        if (i7 == 0) {
            return null;
        }
        if (this.G != 2) {
            int i14 = i7 - 1;
            if (i14 < arrayList.size()) {
                ArrayList arrayList3 = (ArrayList) hashMap.get(arrayList.get(i14));
                if (i10 < arrayList3.size()) {
                    return np.s1(i12).a2(Long.valueOf(((TLRPC.TL_contact) arrayList3.get(i10)).user_id));
                }
                return null;
            }
        } else if (i7 == 1) {
            if (i10 < this.E.size()) {
                return np.s1(i12).a2(Long.valueOf(((TLRPC.TL_contact) this.E.get(i10)).user_id));
            }
            return null;
        }
        if (!this.x || i10 < 0 || i10 >= g5.r(i12).b0.size()) {
            return null;
        }
        return g5.r(i12).b0.get(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0089 A[RETURN] */
    @Override // org.telegram.ui.Components.pj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int P(int i7, int i10) {
        if (this.L) {
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
        HashMap hashMap = i11 == 2 ? r10.j0 : r10.h0;
        g5 r11 = g5.r(i12);
        ArrayList arrayList = i11 == 2 ? r11.k0 : r11.i0;
        boolean z10 = this.F;
        if (i11 == 0 || z10) {
            if (i7 == 0) {
                if (z10) {
                    if (i10 == 1) {
                        return 5;
                    }
                    if (i10 == 2) {
                        int i13 = this.G;
                        return (i13 == 1 || i13 == 2) ? 7 : 2;
                    }
                } else if (this.x) {
                    if (i10 >= 2) {
                        if (i10 == 2) {
                            return 5;
                        }
                        if (i10 == 3) {
                            if (this.J) {
                                return 5;
                            }
                            int i14 = this.G;
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
                        if (this.J) {
                            return 5;
                        }
                        int i15 = this.G;
                        if (i15 == 1 || i15 == 2) {
                            return 7;
                        }
                    }
                }
            } else {
                if (this.J) {
                    return 4;
                }
                if (this.G != 2) {
                    int i16 = i7 - 1;
                    if (i16 < arrayList.size()) {
                        if (i10 < ((ArrayList) hashMap.get(arrayList.get(i16))).size()) {
                            return 0;
                        }
                    }
                } else if (i7 == 1) {
                    if (i10 < this.E.size()) {
                        return 0;
                    }
                }
            }
            return 1;
        }
        if (this.J) {
            return 4;
        }
        if (i10 < ((ArrayList) hashMap.get(arrayList.get(i7))).size()) {
            return 0;
        }
        return 3;
    }

    @Override // org.telegram.ui.Components.pj0
    public final View T(int i7, View view) {
        int i10 = this.r;
        int i11 = this.w;
        g5.r(i10);
        g5 r10 = g5.r(i10);
        ArrayList arrayList = i11 == 2 ? r10.k0 : r10.i0;
        View view2 = view;
        if (view == null) {
            s4 s4Var = new s4(this.s);
            s4Var.setLayoutParams(new ViewGroup.LayoutParams(org.telegram.messenger.g0.L(76.0f), org.telegram.messenger.g0.L(64.0f)));
            TextView textView = new TextView(s4Var.getContext());
            s4Var.a = textView;
            i5.c.v(textView, 1, 22.0f);
            q6.U(textView, j6.B6, null);
            textView.setGravity(17);
            s4Var.addView(textView, ja.d(-1, -1.0f, ns.E1, 12.0f, 0.0f, 0.0f, 0.0f));
            this.O.add(s4Var);
            view2 = s4Var;
        }
        s4 s4Var2 = (s4) view2;
        float f10 = this.N;
        if (f10 > 0.0f) {
            s4Var2.setLetterTextSize(f10);
        }
        s4Var2.setLetterProgress(this.M);
        if (this.G == 2 || this.I || this.J) {
            s4Var2.setLetter("");
            return view2;
        }
        if (i11 != 0 && !this.F) {
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

    @Override // org.telegram.ui.Components.pj0
    public final boolean V(int i7, int i10, v4.e1 e1Var) {
        if (!this.L) {
            int i11 = this.w;
            int i12 = this.r;
            g5 r10 = g5.r(i12);
            HashMap hashMap = i11 == 2 ? r10.j0 : r10.h0;
            g5 r11 = g5.r(i12);
            ArrayList arrayList = i11 == 2 ? r11.k0 : r11.i0;
            boolean z10 = this.F;
            if (i11 == 0 || z10) {
                if (i7 == 0) {
                    if (z10) {
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
                    if (this.J) {
                        return false;
                    }
                    if (this.G != 2) {
                        int i13 = i7 - 1;
                        if (i13 < arrayList.size() && i10 >= ((ArrayList) hashMap.get(arrayList.get(i13))).size()) {
                            return false;
                        }
                    } else if (i7 == 1 && i10 >= this.E.size()) {
                        return false;
                    }
                }
            } else if (this.J || i10 >= ((ArrayList) hashMap.get(arrayList.get(i7))).size()) {
                return false;
            }
        } else if (i7 != 1 || i10 <= 1) {
            return false;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.pj0
    public final void W(int i7, int i10, v4.e1 e1Var) {
        ArrayList arrayList;
        int i11 = e1Var.f;
        View view = e1Var.a;
        int i12 = 7;
        boolean z10 = this.F;
        int i13 = this.r;
        if (i11 == 0) {
            pa paVar = (pa) view;
            paVar.U.a = false;
            if (this.G != 2 && !this.I) {
                i12 = 58;
            }
            paVar.b(i12, 1);
            if (this.G == 2) {
                arrayList = this.E;
            } else {
                int i14 = this.w;
                g5 r10 = g5.r(i13);
                arrayList = (ArrayList) (i14 == 2 ? r10.j0 : r10.h0).get((i14 == 2 ? g5.r(i13).k0 : g5.r(i13).i0).get(i7 - ((i14 == 0 || z10) ? 1 : 0)));
            }
            TLRPC.User a22 = np.s1(i13).a2(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i10)).user_id));
            paVar.d(a22, null, null, false);
            paVar.c(this.y.h(a22.id) >= 0, false);
            return;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                x3 x3Var = (x3) view;
                int i15 = this.G;
                if (i15 == 0) {
                    x3Var.setText(hd.M0(2131751780, null));
                    return;
                } else if (i15 == 1) {
                    x3Var.setText(hd.M0(2131745284, null));
                    return;
                } else {
                    x3Var.setText(hd.M0(2131745285, null));
                    return;
                }
            }
            if (i11 == 4) {
                view.setPadding(0, org.telegram.messenger.g0.L(!this.K ? 96.0f : 25.0f), 0, org.telegram.messenger.g0.L(18.0f));
                return;
            }
            if (i11 != 7) {
                if (i11 != 8) {
                    return;
                }
                q4 q4Var = (q4) view;
                int i16 = i10 - 2;
                if (i16 < 0 || i16 >= g5.r(i13).b0.size()) {
                    return;
                }
                q4Var.a((d5) g5.r(i13).b0.get(i16), null);
                return;
            }
            n4 n4Var = (n4) view;
            if (this.L && i10 == 1 && i7 == 1) {
                n4Var.setText(hd.M0(2131749151, null));
                return;
            } else if (this.G == 1) {
                n4Var.setText(hd.M0(2131745284, null));
                return;
            } else {
                n4Var.setText(hd.M0(2131745285, null));
                return;
            }
        }
        l8 l8Var = (l8) view;
        boolean z11 = this.x;
        if (z11 || !z10) {
            int i17 = j6.G6;
            l8Var.g(i17, i17);
        } else {
            int i18 = j6.Zl;
            l8Var.g(i18, i18);
        }
        if (i7 != 0) {
            d5 d5Var = (d5) g5.r(i13).b0.get(i10);
            String str = d5Var.i;
            if (str == null || d5Var.j == null) {
                if (str == null || d5Var.j != null) {
                    l8Var.k(d5Var.j, false);
                    return;
                } else {
                    l8Var.k(str, false);
                    return;
                }
            }
            l8Var.k(d5Var.i + " " + d5Var.j, false);
            return;
        }
        if (z11) {
            if (i10 == 0) {
                l8Var.r(hd.M0(2131749151, null), "", false, R.drawable.settings_invite, -14899731, -15431455, false);
                return;
            } else {
                if (i10 == 1) {
                    l8Var.r(hd.M0(2131746369, null), "", false, R.drawable.settings_calls, -11154873, -14175180, false);
                    return;
                }
                return;
            }
        }
        if (z10) {
            if (this.H) {
                l8Var.o(R.drawable.msg_link2, hd.M0(2131752402, null), false);
                return;
            } else {
                l8Var.o(R.drawable.msg_link2, hd.M0(2131749110, null), false);
                return;
            }
        }
        if (i10 == 0) {
            l8Var.r(hd.M0(2131748273, null), "", false, R.drawable.settings_group, -14899731, -15431455, false);
        } else if (i10 == 1) {
            l8Var.r(hd.M0(2131748286, null), "", false, R.drawable.settings_channel, -11154873, -14175180, false);
        }
    }

    public final void Y(int i7, boolean z10) {
        this.G = i7;
        if (i7 != 2) {
            f();
            return;
        }
        if (this.E == null || z10) {
            int i10 = this.r;
            this.E = new ArrayList(g5.r(i10).f0);
            long j3 = m10.i(i10).n;
            int size = this.E.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                if (((TLRPC.TL_contact) this.E.get(i11)).user_id == j3) {
                    this.E.remove(i11);
                    break;
                }
                i11++;
            }
        }
        Z();
    }

    public final void Z() {
        int i7 = this.r;
        if (this.E == null) {
            return;
        }
        try {
            int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
            Collections.sort(this.E, new d(np.s1(i7), currentTime, 0));
            f();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        Context context = this.s;
        if (i7 == 0) {
            pa paVar = new pa(context, 58, 1, false);
            paVar.setCallCellStyle(58);
            view = paVar;
        } else if (i7 == 1) {
            view = new l8(context);
        } else if (i7 == 2) {
            view = new x3(context, null);
        } else if (i7 != 3) {
            if (i7 == 4) {
                FrameLayout k0Var = new ai.k0(this, context, viewGroup, 7);
                k0Var.addView(new gq(context), ja.e(-1, -2, 17));
                k0Var.setLayoutParams(new v4.p0(-1, -2));
                k0Var.setTag(-33024);
                view2 = k0Var;
            } else if (i7 == 7) {
                view = new n4(this.s, j6.L6, 21, 14, 5, false, false, null);
            } else if (i7 == 8) {
                view = new q4(context, false);
            } else if (i7 != 9) {
                view = new x6(context, (org.telegram.ui.Cells.y0) null);
            } else {
                View bnVar = new bn(context, 2);
                bnVar.setId(9);
                bnVar.setTag(-33024);
                view2 = bnVar;
            }
            view = view2;
        } else {
            View e3Var = new e3(context, null);
            e3Var.setPadding(org.telegram.messenger.g0.L(hd.a0 ? 28.0f : 72.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(hd.a0 ? 72.0f : 28.0f), org.telegram.messenger.g0.L(8.0f));
            view = e3Var;
        }
        return new cj0(view);
    }
}
