// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class ev2 extends m59 {
    public ArrayList E;
    public final boolean F;
    public byte G;
    public final boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public float N;
    public final Context s;
    public final int w;
    public final boolean x;
    public final vh6 y;
    public final int r = z8c.t0;
    public float M = 1.0f;
    public final ArrayList O = new ArrayList();

    public ev2(Context context, int i, boolean z, vh6 vh6Var, int i2) {
        this.s = context;
        this.w = i;
        this.x = z;
        this.y = vh6Var;
        this.F = i2 != 0;
        this.H = i2 == 2;
    }

    @Override // z49
    public final String F(int i) {
        if (this.G == 2 || this.J) {
            return null;
        }
        int i2 = this.w;
        int i3 = this.r;
        ArrayList arrayList = i2 == 2 ? bw2.r(i3).k0 : bw2.r(i3).i0;
        int S = S(i);
        if (S == -1) {
            S = arrayList.size() - 1;
        }
        if (i2 == 0 || this.F) {
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

    @Override // z49
    public final void G(r59 r59Var, float f, int[] iArr) {
        iArr[0] = (int) (b() * f);
        iArr[1] = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // m59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int M(int i) {
        HashMap hashMap;
        ArrayList arrayList;
        boolean z = this.L;
        int i2 = this.r;
        if (z) {
            if (i == 0) {
                return 1;
            }
            if (i == 1) {
                return bw2.r(i2).b0.size() + 2;
            }
            return 0;
        }
        int i3 = this.w;
        bw2 r = bw2.r(i2);
        if (i3 == 2) {
            hashMap = r.j0;
            arrayList = bw2.r(i2).k0;
        } else {
            hashMap = r.h0;
            arrayList = bw2.r(i2).i0;
        }
        boolean z2 = this.F;
        boolean z3 = this.x;
        if (i3 != 0 && !z2) {
            if (!this.J) {
                if (i < arrayList.size()) {
                    int size = ((ArrayList) hashMap.get(arrayList.get(i))).size();
                    return (i != arrayList.size() - 1 || z3) ? size + 1 : size;
                }
                if (z3) {
                }
            }
            return 1;
        }
        boolean z4 = this.J;
        if (i == 0) {
            if (z4) {
                return 2;
            }
            return z2 ? 3 : 4;
        }
        if (!z4) {
            if (this.G != 2) {
                int i4 = i - 1;
                if (i4 < arrayList.size()) {
                    int size2 = ((ArrayList) hashMap.get(arrayList.get(i4))).size();
                    arrayList.size();
                    return size2;
                }
            } else if (i == 1) {
                if (this.E.isEmpty()) {
                    return 0;
                }
                return this.E.size();
            }
            if (z3) {
                return 0;
            }
            return bw2.r(i2).b0.size();
        }
        return 1;
    }

    @Override // m59
    public final int N(int i, int i2) {
        return Objects.hash(Integer.valueOf(i * (-49612)), O(i, i2));
    }

    @Override // m59
    public final Object O(int i, int i2) {
        HashMap hashMap;
        ArrayList arrayList;
        int i3;
        boolean z = this.L;
        int i4 = this.r;
        if (z && i == 1 && i2 > 1 && i2 - 2 < bw2.r(i4).b0.size()) {
            return bw2.r(i4).b0.get(i3);
        }
        if (P(i, i2) == 2) {
            return "Header";
        }
        int i5 = this.w;
        bw2 r = bw2.r(i4);
        if (i5 == 2) {
            hashMap = r.j0;
            arrayList = bw2.r(i4).k0;
        } else {
            hashMap = r.h0;
            arrayList = bw2.r(i4).i0;
        }
        if (i5 != 0 && !this.F) {
            if (i >= arrayList.size()) {
                return null;
            }
            ArrayList arrayList2 = (ArrayList) hashMap.get(arrayList.get(i));
            if (i2 < arrayList2.size()) {
                return oc7.r1(i4).W1(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i2)).user_id));
            }
            return null;
        }
        if (i == 0) {
            return null;
        }
        if (this.G != 2) {
            int i6 = i - 1;
            if (i6 < arrayList.size()) {
                ArrayList arrayList3 = (ArrayList) hashMap.get(arrayList.get(i6));
                if (i2 < arrayList3.size()) {
                    return oc7.r1(i4).W1(Long.valueOf(((TLRPC.TL_contact) arrayList3.get(i2)).user_id));
                }
                return null;
            }
        } else if (i == 1) {
            if (i2 < this.E.size()) {
                return oc7.r1(i4).W1(Long.valueOf(((TLRPC.TL_contact) this.E.get(i2)).user_id));
            }
            return null;
        }
        if (!this.x || i2 < 0 || i2 >= bw2.r(i4).b0.size()) {
            return null;
        }
        return bw2.r(i4).b0.get(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007d A[RETURN] */
    @Override // m59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int P(int i, int i2) {
        HashMap hashMap;
        ArrayList arrayList;
        if (this.L) {
            if (i == 0) {
                return 4;
            }
            if (i != 1) {
                return 8;
            }
            if (i2 != 0) {
                return i2 != 1 ? 8 : 7;
            }
            return 5;
        }
        int i3 = this.r;
        int i4 = this.w;
        bw2 r = bw2.r(i3);
        if (i4 == 2) {
            hashMap = r.j0;
            arrayList = bw2.r(i3).k0;
        } else {
            hashMap = r.h0;
            arrayList = bw2.r(i3).i0;
        }
        boolean z = this.F;
        if (i4 == 0 || z) {
            if (i == 0) {
                if (z) {
                    if (i2 == 1) {
                        return 5;
                    }
                    if (i2 == 2) {
                        byte b = this.G;
                        return (b == 1 || b == 2) ? 7 : 2;
                    }
                } else if (this.x) {
                    if (i2 >= 2) {
                        if (i2 == 2) {
                            return 5;
                        }
                        if (i2 == 3) {
                            if (this.J) {
                                return 5;
                            }
                            byte b2 = this.G;
                            if (b2 == 1 || b2 == 2) {
                                return 7;
                            }
                        }
                    }
                } else {
                    if (i2 == 2) {
                        return 5;
                    }
                    if (i2 == 3) {
                        if (this.J) {
                            return 5;
                        }
                        byte b3 = this.G;
                        if (b3 == 1 || b3 == 2) {
                            return 7;
                        }
                    }
                }
            } else {
                if (this.J) {
                    return 4;
                }
                if (this.G != 2) {
                    int i5 = i - 1;
                    if (i5 < arrayList.size()) {
                        if (i2 < ((ArrayList) hashMap.get(arrayList.get(i5))).size()) {
                            return 0;
                        }
                    }
                } else if (i == 1) {
                    if (i2 < this.E.size()) {
                        return 0;
                    }
                }
            }
            return 1;
        }
        if (this.J) {
            return 4;
        }
        if (i2 < ((ArrayList) hashMap.get(arrayList.get(i))).size()) {
            return 0;
        }
        return 3;
    }

    @Override // m59
    public final View T(int i, View view) {
        int i2 = this.w;
        int i3 = this.r;
        bw2.r(i3);
        bw2 r = bw2.r(i3);
        ArrayList arrayList = i2 == 2 ? r.k0 : r.i0;
        View view2 = view;
        if (view == null) {
            p26 p26Var = new p26(this.s);
            p26Var.setLayoutParams(new ViewGroup.LayoutParams(gm.L(76.0f), gm.L(64.0f)));
            TextView textView = new TextView(p26Var.getContext());
            p26Var.a = textView;
            ts2.s(textView, 1, 22.0f);
            anb.X(textView, cmb.A6, null);
            textView.setGravity(17);
            p26Var.addView(textView, qoe.d(-1, -1.0f, nm7.D1, 12.0f, 0.0f, 0.0f, 0.0f));
            this.O.add(p26Var);
            view2 = p26Var;
        }
        p26 p26Var2 = (p26) view2;
        float f = this.N;
        if (f > 0.0f) {
            p26Var2.setLetterTextSize(f);
        }
        p26Var2.setLetterProgress(this.M);
        if (this.G == 2 || this.I || this.J) {
            p26Var2.setLetter("");
            return view2;
        }
        if (i2 != 0 && !this.F) {
            if (i < arrayList.size()) {
                p26Var2.setLetter((String) arrayList.get(i));
                return view2;
            }
            p26Var2.setLetter("");
            return view2;
        }
        if (i == 0) {
            p26Var2.setLetter("");
            return view2;
        }
        int i4 = i - 1;
        if (i4 < arrayList.size()) {
            p26Var2.setLetter((String) arrayList.get(i4));
            return view2;
        }
        p26Var2.setLetter("");
        return view2;
    }

    @Override // m59
    public final boolean V(int i, int i2, u69 u69Var) {
        HashMap hashMap;
        ArrayList arrayList;
        if (!this.L) {
            int i3 = this.r;
            int i4 = this.w;
            bw2 r = bw2.r(i3);
            if (i4 == 2) {
                hashMap = r.j0;
                arrayList = bw2.r(i3).k0;
            } else {
                hashMap = r.h0;
                arrayList = bw2.r(i3).i0;
            }
            boolean z = this.F;
            if (i4 == 0 || z) {
                if (i == 0) {
                    if (z) {
                        if (i2 >= 1) {
                            return false;
                        }
                    } else if (this.x) {
                        if (i2 >= 2) {
                            return false;
                        }
                    } else if (i2 >= 3) {
                        return false;
                    }
                } else {
                    if (this.J) {
                        return false;
                    }
                    if (this.G != 2) {
                        int i5 = i - 1;
                        if (i5 < arrayList.size() && i2 >= ((ArrayList) hashMap.get(arrayList.get(i5))).size()) {
                            return false;
                        }
                    } else if (i == 1 && i2 >= this.E.size()) {
                        return false;
                    }
                }
            } else if (this.J || i2 >= ((ArrayList) hashMap.get(arrayList.get(i))).size()) {
                return false;
            }
        } else if (i != 1 || i2 <= 1) {
            return false;
        }
        return true;
    }

    @Override // m59
    public final void W(int i, int i2, u69 u69Var) {
        HashMap hashMap;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i3 = u69Var.f;
        View view = u69Var.a;
        int i4 = 7;
        boolean z = this.F;
        int i5 = this.r;
        if (i3 == 0) {
            w8c w8cVar = (w8c) view;
            w8cVar.U.a = false;
            if (this.G != 2 && !this.I) {
                i4 = 58;
            }
            w8cVar.b(i4, 1);
            if (this.G == 2) {
                arrayList2 = this.E;
            } else {
                int i6 = this.w;
                bw2 r = bw2.r(i5);
                if (i6 == 2) {
                    hashMap = r.j0;
                    arrayList = bw2.r(i5).k0;
                } else {
                    hashMap = r.h0;
                    arrayList = bw2.r(i5).i0;
                }
                arrayList2 = (ArrayList) hashMap.get(arrayList.get(i - ((i6 == 0 || z) ? 1 : 0)));
            }
            TLRPC.User W1 = oc7.r1(i5).W1(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i2)).user_id));
            w8cVar.d(W1, null, null, false);
            w8cVar.c(this.y.h(W1.id) >= 0, false);
            return;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                l55 l55Var = (l55) view;
                byte b = this.G;
                if (b == 0) {
                    l55Var.setText(jb6.M0(2131751717, null));
                    return;
                } else if (b == 1) {
                    l55Var.setText(jb6.M0(2131745018, null));
                    return;
                } else {
                    l55Var.setText(jb6.M0(2131745019, null));
                    return;
                }
            }
            if (i3 == 4) {
                view.setPadding(0, gm.L(!this.K ? 96.0f : 25.0f), 0, gm.L(18.0f));
                return;
            }
            if (i3 != 7) {
                if (i3 == 8) {
                    jt5 jt5Var = (jt5) view;
                    int i7 = i2 - 2;
                    if (i7 < 0 || i7 >= bw2.r(i5).b0.size()) {
                        return;
                    }
                    jt5Var.a((yv2) bw2.r(i5).b0.get(i7), null);
                    return;
                }
                return;
            }
            jf5 jf5Var = (jf5) view;
            if (this.L && i2 == 1 && i == 1) {
                jf5Var.setText(jb6.M0(2131748908, null));
                return;
            } else if (this.G == 1) {
                jf5Var.setText(jb6.M0(2131745018, null));
                return;
            } else {
                jf5Var.setText(jb6.M0(2131745019, null));
                return;
            }
        }
        xib xibVar = (xib) view;
        boolean z2 = this.x;
        if (z2 || !z) {
            int i8 = cmb.F6;
            xibVar.g(i8, i8);
        } else {
            int i9 = cmb.Yl;
            xibVar.g(i9, i9);
        }
        if (i != 0) {
            yv2 yv2Var = (yv2) bw2.r(i5).b0.get(i2);
            String str = yv2Var.i;
            if (str != null) {
                String str2 = yv2Var.j;
                if (str2 != null) {
                    xibVar.k(yv2Var.i + " " + yv2Var.j, false);
                    return;
                }
                if (str2 == null) {
                    xibVar.k(str, false);
                    return;
                }
            }
            xibVar.k(yv2Var.j, false);
            return;
        }
        if (z2) {
            if (i2 == 0) {
                xibVar.r(jb6.M0(2131748908, null), "", false, R.drawable.settings_invite, -14899731, -15431455, false);
                return;
            } else {
                if (i2 == 1) {
                    xibVar.r(jb6.M0(2131746102, null), "", false, R.drawable.settings_calls, -11154873, -14175180, false);
                    return;
                }
                return;
            }
        }
        if (z) {
            if (this.H) {
                xibVar.o(R.drawable.msg_link2, jb6.M0(2131752346, null), false);
                return;
            } else {
                xibVar.o(R.drawable.msg_link2, jb6.M0(2131748867, null), false);
                return;
            }
        }
        if (i2 == 0) {
            xibVar.r(jb6.M0(2131748030, null), "", false, R.drawable.settings_group, -14899731, -15431455, false);
        } else if (i2 == 1) {
            xibVar.r(jb6.M0(2131748043, null), "", false, R.drawable.settings_channel, -11154873, -14175180, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y(int i, boolean z) {
        this.G = i;
        if (i != 2) {
            f();
            return;
        }
        if (this.E == null || z) {
            int i2 = this.r;
            this.E = new ArrayList(bw2.r(i2).f0);
            long j = z8c.h(i2).n;
            int size = this.E.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                if (((TLRPC.TL_contact) this.E.get(i3)).user_id == j) {
                    this.E.remove(i3);
                    break;
                }
                i3++;
            }
        }
        Z();
    }

    public final void Z() {
        int i = this.r;
        if (this.E == null) {
            return;
        }
        try {
            int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
            Collections.sort(this.E, new dv2(oc7.r1(i), currentTime, (byte) 0));
            f();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        Context context = this.s;
        if (i == 0) {
            w8c w8cVar = new w8c(context, 58, 1, false);
            w8cVar.setCallCellStyle(58);
            view = w8cVar;
        } else if (i == 1) {
            view = new xib(context);
        } else if (i == 2) {
            view = new l55(context, null);
        } else if (i == 3) {
            View aq3Var = new aq3(context, null);
            aq3Var.setPadding(gm.L(jb6.a0 ? 28.0f : 72.0f), gm.L(8.0f), gm.L(jb6.a0 ? 72.0f : 28.0f), gm.L(8.0f));
            view = aq3Var;
        } else if (i == 4) {
            FrameLayout suVar = new su(this, context, viewGroup, (byte) 10);
            suVar.addView(new cw2(context), qoe.e(-1, -2, 17));
            suVar.setLayoutParams(new g69(-1, -2));
            suVar.setTag(-33024);
            view = suVar;
        } else if (i == 7) {
            view = new jf5(this.s, cmb.K6, 21, 14, 5, false, false, null);
        } else if (i == 8) {
            view = new jt5(context, false);
        } else if (i != 9) {
            view = new bba(context, (hg9) null);
        } else {
            View o72Var = new o72(context, (byte) 5);
            o72Var.setId(9);
            o72Var.setTag(-33024);
            view = o72Var;
        }
        return new b59(view);
    }
}
