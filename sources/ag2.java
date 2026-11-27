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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ag2 extends c79 {
    public final /* synthetic */ bg2 E;
    public final Context c;
    public final sv9 h;
    public zf2 n;
    public boolean s;
    public int w;
    public int x;
    public int y;
    public ArrayList d = new ArrayList();
    public zh6 e = new zh6();
    public ArrayList f = new ArrayList();
    public int r = 0;

    public ag2(bg2 bg2Var, Context context) {
        this.E = bg2Var;
        this.c = context;
        sv9 sv9Var = new sv9(true);
        this.h = sv9Var;
        sv9Var.a = new yf2(this);
    }

    @Override // j79
    public final void A(f89 f89Var) {
        View view = f89Var.a;
        if (view instanceof lj6) {
            ((lj6) view).a();
        }
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return f89Var.f != 1;
    }

    public final TLObject E(int i) {
        sv9 sv9Var = this.h;
        ArrayList arrayList = sv9Var.e;
        ArrayList arrayList2 = sv9Var.g;
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
        sv9 sv9Var = this.h;
        bg2 bg2Var = this.E;
        byte b = 0;
        sv9Var.g(null, bg2Var.O != 0, false, true, false, xc2.T(bg2Var.n) ? this.E.N : 0L, false, this.E.O, 0);
        f();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.s = true;
        this.E.b.e(true, true);
        to3 to3Var = Utilities.g;
        zf2 zf2Var = new zf2(this, str, b);
        this.n = zf2Var;
        to3Var.d(zf2Var, 300L);
    }

    @Override // j79
    public final int b() {
        return this.r;
    }

    @Override // j79
    public final int d(int i) {
        return (i == this.y || i == this.w || i == this.x) ? 1 : 0;
    }

    @Override // j79
    public final void f() {
        gu guVar;
        this.r = 0;
        sv9 sv9Var = this.h;
        int size = sv9Var.g.size();
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
        int size3 = sv9Var.e.size();
        if (size3 != 0) {
            int i2 = this.r;
            this.y = i2;
            this.r = size3 + 1 + i2;
        } else {
            this.y = -1;
        }
        bg2 bg2Var = this.E;
        if (bg2Var.o1 && (guVar = bg2Var.c) != null) {
            j79 adapter = guVar.getAdapter();
            ag2 ag2Var = bg2Var.e;
            if (adapter != ag2Var) {
                gu guVar2 = bg2Var.c;
                guVar2.X1 = true;
                guVar2.Y1 = false;
                guVar2.setAdapter(ag2Var);
                bg2Var.c.setFastScrollVisible(false);
                bg2Var.c.setVerticalScrollBarEnabled(true);
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
    /* JADX WARN: Type inference failed for: r14v2, types: [android.view.View, lj6] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r15v7, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r15v9 */
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
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
        int i4 = f89Var.f;
        View view = f89Var.a;
        bg2 bg2Var = this.E;
        if (i4 != 0) {
            if (i4 == 1) {
                p55 p55Var = (p55) view;
                if (i != this.w) {
                    if (i == this.y) {
                        p55Var.setText(ob6.M0(2131749306, null));
                        return;
                    } else {
                        if (i == this.x) {
                            p55Var.setText(ob6.M0(2131751745, null));
                            return;
                        }
                        return;
                    }
                }
                int i5 = bg2Var.O;
                if (i5 == 0) {
                    p55Var.setText(ob6.M0(2131752425, null));
                    return;
                }
                if (i5 == 3) {
                    p55Var.setText(ob6.M0(2131752274, null));
                    return;
                } else if (bg2Var.s) {
                    p55Var.setText(ob6.M0(2131752255, null));
                    return;
                } else {
                    p55Var.setText(ob6.M0(2131752349, null));
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
                long B1 = r47.B1(((TLRPC.ChannelParticipant) E).peer);
                if (B1 >= 0) {
                    TLRPC.User X1 = bg2Var.getMessagesController().X1(Long.valueOf(B1));
                    tLObject2 = X1;
                    if (X1 != null) {
                        str = lbc.p(X1);
                        tLObject = X1;
                    }
                } else {
                    TLRPC.Chat M0 = bg2Var.getMessagesController().M0(Long.valueOf(-B1));
                    tLObject2 = M0;
                    if (M0 != null) {
                        str = xc2.K(M0, false);
                        tLObject = M0;
                    }
                }
                sv9 sv9Var = this.h;
                size = sv9Var.g.size();
                if (size != 0) {
                    int i6 = size + 1;
                    if (i6 > i) {
                        str2 = sv9Var.n;
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
                                        if (!z2 && str != null && (size2 = sv9Var.e.size()) != 0 && size2 + 1 > i2) {
                                            str3 = sv9Var.c;
                                            if (str3.startsWith("@")) {
                                                str3 = str3.substring(1);
                                            }
                                            try {
                                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                                spannableStringBuilder.append((CharSequence) "@");
                                                spannableStringBuilder.append((CharSequence) str);
                                                y12 = hl.y1(str, str3);
                                                if (y12 != -1) {
                                                    int length = str3.length();
                                                    if (y12 == 0) {
                                                        length++;
                                                    } else {
                                                        y12++;
                                                    }
                                                    spannableStringBuilder.setSpan(new ho4(aob.q6, null), y12, length + y12, 33);
                                                }
                                                charSequence = spannableStringBuilder;
                                            } catch (Exception e) {
                                                cc4.g(e, true);
                                                charSequence = str;
                                            }
                                        }
                                        if (str2 != null && str != null) {
                                            r15 = new SpannableStringBuilder(str);
                                            y1 = hl.y1(str, str2);
                                            if (y1 != -1) {
                                                r15.setSpan(new ho4(aob.q6, null), y1, str2.length() + y1, 33);
                                            }
                                        }
                                        ?? r14 = (lj6) view;
                                        r14.setTag(Integer.valueOf(i2));
                                        r14.c(tLObject, r15, charSequence, false);
                                    }
                                }
                                i2 = i;
                                z2 = true;
                                r15 = charSequence;
                                charSequence = null;
                                if (!z2) {
                                    str3 = sv9Var.c;
                                    if (str3.startsWith("@")) {
                                    }
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                    spannableStringBuilder2.append((CharSequence) "@");
                                    spannableStringBuilder2.append((CharSequence) str);
                                    y12 = hl.y1(str, str3);
                                    if (y12 != -1) {
                                    }
                                    charSequence = spannableStringBuilder2;
                                }
                                if (str2 != null) {
                                    r15 = new SpannableStringBuilder(str);
                                    y1 = hl.y1(str, str2);
                                    if (y1 != -1) {
                                    }
                                }
                                ?? r142 = (lj6) view;
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
                        ?? r1422 = (lj6) view;
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
                ?? r14222 = (lj6) view;
                r14222.setTag(Integer.valueOf(i2));
                r14222.c(tLObject, r15, charSequence, false);
            }
            if (!(E instanceof TLRPC.ChatParticipant)) {
                return;
            } else {
                tLObject2 = bg2Var.getMessagesController().X1(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
            }
        }
        str = null;
        tLObject = tLObject2;
        sv9 sv9Var2 = this.h;
        size = sv9Var2.g.size();
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
        ?? r142222 = (lj6) view;
        r142222.setTag(Integer.valueOf(i2));
        r142222.c(tLObject, r15, charSequence, false);
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        vnb vnbVar;
        bg2 bg2Var = this.E;
        if (i != 0) {
            vnbVar = ((e) bg2Var).resourceProvider;
            view = new p55(26, vnbVar, this.c);
            view.setBackground(null);
        } else {
            lj6 lj6Var = new lj6(this.c, 2, 2, bg2Var.e1 == 0, null);
            lj6Var.H = true;
            lj6Var.setDelegate(new yf2(this));
            view = lj6Var;
        }
        return new n69(view);
    }
}
