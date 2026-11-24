// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class jf2 extends n39 {
    public final /* synthetic */ kf2 E;
    public final Context c;
    public final zr9 h;
    public hf2 n;
    public boolean s;
    public int w;
    public int x;
    public int y;
    public ArrayList d = new ArrayList();
    public vf6 e = new vf6();
    public ArrayList f = new ArrayList();
    public int r = 0;

    public jf2(kf2 kf2Var, Context context) {
        this.E = kf2Var;
        this.c = context;
        zr9 zr9Var = new zr9(true);
        this.h = zr9Var;
        zr9Var.a = new if2(this);
    }

    @Override // w39
    public final void A(s49 s49Var) {
        View view = s49Var.a;
        if (view instanceof gh6) {
            ((gh6) view).a();
        }
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return s49Var.f != 1;
    }

    public final TLObject E(int i) {
        zr9 zr9Var = this.h;
        ArrayList arrayList = zr9Var.e;
        ArrayList arrayList2 = zr9Var.g;
        int size = arrayList2.size();
        if (size != 0) {
            int i2 = size + 1;
            if (i2 > i) {
                if (i != 0) {
                    return (TLObject) arrayList2.get(i - 1);
                }
                return null;
            }
            i -= i2;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i3 = size2 + 1;
            if (i3 > i) {
                if (i != 0) {
                    return (TLObject) this.d.get(i - 1);
                }
                return null;
            }
            i -= i3;
        }
        int size3 = arrayList.size();
        if (size3 == 0 || size3 + 1 <= i || i == 0) {
            return null;
        }
        return (TLObject) arrayList.get(i - 1);
    }

    public final void F(String str) {
        if (this.n != null) {
            Utilities.g.a(this.n);
            this.n = null;
        }
        this.d.clear();
        this.e.b();
        this.f.clear();
        this.h.f(null, null);
        zr9 zr9Var = this.h;
        kf2 kf2Var = this.E;
        byte b = 0;
        zr9Var.g(null, kf2Var.O != 0, false, true, false, hc2.T(kf2Var.n) ? this.E.N : 0L, false, this.E.O, 0);
        f();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.s = true;
        this.E.b.e(true, true);
        co3 co3Var = Utilities.g;
        hf2 hf2Var = new hf2(this, str, b);
        this.n = hf2Var;
        co3Var.d(hf2Var, 300L);
    }

    @Override // w39
    public final int b() {
        return this.r;
    }

    @Override // w39
    public final int d(int i) {
        return (i == this.y || i == this.w || i == this.x) ? 1 : 0;
    }

    @Override // w39
    public final void f() {
        fu fuVar;
        this.r = 0;
        zr9 zr9Var = this.h;
        int size = zr9Var.g.size();
        if (size != 0) {
            this.w = 0;
            this.r = size + 1 + this.r;
        } else {
            this.w = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i = this.r;
            this.x = i;
            this.r = size2 + 1 + i;
        } else {
            this.x = -1;
        }
        int size3 = zr9Var.e.size();
        if (size3 != 0) {
            int i2 = this.r;
            this.y = i2;
            this.r = size3 + 1 + i2;
        } else {
            this.y = -1;
        }
        kf2 kf2Var = this.E;
        if (kf2Var.o1 && (fuVar = kf2Var.c) != null) {
            w39 adapter = fuVar.getAdapter();
            jf2 jf2Var = kf2Var.e;
            if (adapter != jf2Var) {
                fu fuVar2 = kf2Var.c;
                fuVar2.X1 = true;
                fuVar2.Y1 = false;
                fuVar2.setAdapter(jf2Var);
                kf2Var.c.setFastScrollVisible(false);
                kf2Var.c.setVerticalScrollBarEnabled(true);
            }
        }
        super.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0146 A[Catch: Exception -> 0x015e, TryCatch #0 {Exception -> 0x015e, blocks: (B:69:0x0135, B:71:0x0146, B:73:0x014c, B:74:0x0151, B:76:0x014f), top: B:68:0x0135 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0165 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0112  */
    /* JADX WARN: Type inference failed for: r14v2, types: [android.view.View, gh6] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r15v7, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r15v9 */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        String str;
        TLObject tLObject;
        int size;
        String str2;
        boolean z;
        CharSequence charSequence;
        boolean z2;
        int i2;
        ?? r15;
        int y1;
        int size2;
        String str3;
        int y12;
        int size3;
        int i3;
        int i4 = s49Var.f;
        View view = s49Var.a;
        kf2 kf2Var = this.E;
        if (i4 != 0) {
            if (i4 == 1) {
                l35 l35Var = (l35) view;
                if (i != this.w) {
                    if (i == this.y) {
                        l35Var.setText(k96.M0(2131749360, null));
                        return;
                    } else {
                        if (i == this.x) {
                            l35Var.setText(k96.M0(2131751768, null));
                            return;
                        }
                        return;
                    }
                }
                int i5 = kf2Var.O;
                if (i5 == 0) {
                    l35Var.setText(k96.M0(2131752439, null));
                    return;
                }
                if (i5 == 3) {
                    l35Var.setText(k96.M0(2131752296, null));
                    return;
                } else if (kf2Var.s) {
                    l35Var.setText(k96.M0(2131752277, null));
                    return;
                } else {
                    l35Var.setText(k96.M0(2131752365, null));
                    return;
                }
            }
            return;
        }
        TLObject E = E(i);
        boolean z3 = E instanceof TLRPC.User;
        TLObject tLObject2 = E;
        if (!z3) {
            if (E instanceof TLRPC.ChannelParticipant) {
                long B1 = k27.B1(((TLRPC.ChannelParticipant) E).peer);
                if (B1 >= 0) {
                    TLRPC.User V1 = kf2Var.getMessagesController().V1(Long.valueOf(B1));
                    tLObject2 = V1;
                    if (V1 != null) {
                        str = l7c.o(V1);
                        tLObject = V1;
                    }
                } else {
                    TLRPC.Chat K0 = kf2Var.getMessagesController().K0(Long.valueOf(-B1));
                    tLObject2 = K0;
                    if (K0 != null) {
                        str = hc2.K(K0, false);
                        tLObject = K0;
                    }
                }
                zr9 zr9Var = this.h;
                size = zr9Var.g.size();
                if (size != 0) {
                    int i6 = size + 1;
                    if (i6 > i) {
                        str2 = zr9Var.n;
                        z = true;
                        if (!z && (size3 = this.d.size()) != 0) {
                            i3 = size3 + 1;
                            if (i3 <= i) {
                                charSequence = (CharSequence) this.f.get(i - 1);
                                if (charSequence != null && !TextUtils.isEmpty(str)) {
                                    if (charSequence.toString().startsWith("@" + str)) {
                                        i2 = i;
                                        z2 = true;
                                        r15 = 0;
                                        if (!z2 && str != null && (size2 = zr9Var.e.size()) != 0 && size2 + 1 > i2) {
                                            str3 = zr9Var.c;
                                            if (str3.startsWith("@")) {
                                                str3 = str3.substring(1);
                                            }
                                            try {
                                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                                spannableStringBuilder.append((CharSequence) "@");
                                                spannableStringBuilder.append((CharSequence) str);
                                                y12 = gl.y1(str, str3);
                                                if (y12 != -1) {
                                                    int length = str3.length();
                                                    if (y12 == 0) {
                                                        length++;
                                                    } else {
                                                        y12++;
                                                    }
                                                    spannableStringBuilder.setSpan(new cm4(bkb.p6, null), y12, length + y12, 33);
                                                }
                                                charSequence = spannableStringBuilder;
                                            } catch (Exception e) {
                                                fa4.g(e, true);
                                                charSequence = str;
                                            }
                                        }
                                        if (str2 != null && str != null) {
                                            r15 = new SpannableStringBuilder(str);
                                            y1 = gl.y1(str, str2);
                                            if (y1 != -1) {
                                                r15.setSpan(new cm4(bkb.p6, null), y1, str2.length() + y1, 33);
                                            }
                                        }
                                        ?? r14 = (gh6) view;
                                        r14.setTag(Integer.valueOf(i2));
                                        r14.c(tLObject, r15, charSequence, false);
                                    }
                                }
                                i2 = i;
                                z2 = true;
                                r15 = charSequence;
                                charSequence = null;
                                if (!z2) {
                                    str3 = zr9Var.c;
                                    if (str3.startsWith("@")) {
                                    }
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                    spannableStringBuilder2.append((CharSequence) "@");
                                    spannableStringBuilder2.append((CharSequence) str);
                                    y12 = gl.y1(str, str3);
                                    if (y12 != -1) {
                                    }
                                    charSequence = spannableStringBuilder2;
                                }
                                if (str2 != null) {
                                    r15 = new SpannableStringBuilder(str);
                                    y1 = gl.y1(str, str2);
                                    if (y1 != -1) {
                                    }
                                }
                                ?? r142 = (gh6) view;
                                r142.setTag(Integer.valueOf(i2));
                                r142.c(tLObject, r15, charSequence, false);
                            }
                            i -= i3;
                        }
                        charSequence = null;
                        z2 = z;
                        i2 = i;
                        r15 = 0;
                        if (!z2) {
                        }
                        if (str2 != null) {
                        }
                        ?? r1422 = (gh6) view;
                        r1422.setTag(Integer.valueOf(i2));
                        r1422.c(tLObject, r15, charSequence, false);
                    }
                    i -= i6;
                }
                str2 = null;
                z = false;
                if (!z) {
                    i3 = size3 + 1;
                    if (i3 <= i) {
                    }
                }
                charSequence = null;
                z2 = z;
                i2 = i;
                r15 = 0;
                if (!z2) {
                }
                if (str2 != null) {
                }
                ?? r14222 = (gh6) view;
                r14222.setTag(Integer.valueOf(i2));
                r14222.c(tLObject, r15, charSequence, false);
            }
            if (!(E instanceof TLRPC.ChatParticipant)) {
                return;
            } else {
                tLObject2 = kf2Var.getMessagesController().V1(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
            }
        }
        str = null;
        tLObject = tLObject2;
        zr9 zr9Var2 = this.h;
        size = zr9Var2.g.size();
        if (size != 0) {
        }
        str2 = null;
        z = false;
        if (!z) {
        }
        charSequence = null;
        z2 = z;
        i2 = i;
        r15 = 0;
        if (!z2) {
        }
        if (str2 != null) {
        }
        ?? r142222 = (gh6) view;
        r142222.setTag(Integer.valueOf(i2));
        r142222.c(tLObject, r15, charSequence, false);
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        wjb wjbVar;
        kf2 kf2Var = this.E;
        if (i != 0) {
            wjbVar = ((d) kf2Var).resourceProvider;
            view = new l35(26, wjbVar, this.c);
            view.setBackground(null);
        } else {
            gh6 gh6Var = new gh6(this.c, 2, 2, kf2Var.e1 == 0, null);
            gh6Var.H = true;
            gh6Var.setDelegate(new if2(this));
            view = gh6Var;
        }
        return new y29(view);
    }
}
