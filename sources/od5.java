// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class od5 extends q59 {
    public final Context c;
    public final bu9 d;
    public md5 e;
    public int f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public int w;
    public final /* synthetic */ pd5 x;

    public od5(pd5 pd5Var, Context context) {
        this.x = pd5Var;
        this.c = context;
        bu9 bu9Var = new bu9(true);
        this.d = bu9Var;
        bu9Var.a = new nd5(this);
    }

    @Override // y59
    public final void A(u69 u69Var) {
        View view = u69Var.a;
        if (view instanceof ij6) {
            ((ij6) view).a();
        }
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        View view = u69Var.a;
        return !((view instanceof ij6) && this.x.Z1.contains(Long.valueOf(((ij6) view).getUserId()))) && u69Var.f == 0;
    }

    @Override // y59
    public final int b() {
        return this.f;
    }

    @Override // y59
    public final int d(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == this.r) {
            return 3;
        }
        return (i == this.w || i == this.s) ? 1 : 0;
    }

    @Override // y59
    public final void f() {
        this.f = 1;
        bu9 bu9Var = this.d;
        int size = bu9Var.g.size();
        if (size != 0) {
            int i = this.f;
            this.s = i;
            this.f = size + 1 + i;
        } else {
            this.s = -1;
        }
        int size2 = bu9Var.e.size();
        if (size2 != 0) {
            int i2 = this.f;
            this.w = i2;
            this.f = size2 + 1 + i2;
        } else {
            this.w = -1;
        }
        int i3 = this.f;
        this.f = i3 + 1;
        this.r = i3;
        super.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x006e  */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
        TLObject tLObject;
        boolean z;
        TLRPC.User W1;
        int size;
        String str;
        boolean z2;
        int size2;
        bu9 bu9Var = this.d;
        ArrayList arrayList = bu9Var.e;
        ArrayList arrayList2 = bu9Var.g;
        int i2 = u69Var.f;
        View view = u69Var.a;
        SpannableStringBuilder spannableStringBuilder = null;
        if (i2 != 0) {
            if (i2 == 1) {
                l55 l55Var = (l55) view;
                if (i == this.s) {
                    l55Var.setText(jb6.M0(2131752321, null));
                    return;
                } else {
                    if (i == this.w) {
                        l55Var.setText(jb6.M0(2131749309, null));
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int i3 = this.s;
        if (i3 >= 0 && i > i3) {
            if (i < arrayList2.size() + i3 + 1) {
                tLObject = (TLObject) arrayList2.get((i - this.s) - 1);
                z = tLObject instanceof TLRPC.User;
                pd5 pd5Var = this.x;
                if (z) {
                    W1 = (TLRPC.User) tLObject;
                } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                    W1 = oc7.r1(pd5Var.a).W1(Long.valueOf(k47.B1(((TLRPC.ChannelParticipant) tLObject).peer)));
                } else if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                    return;
                } else {
                    W1 = oc7.r1(pd5Var.a).W1(Long.valueOf(((TLRPC.ChatParticipant) tLObject).user_id));
                }
                String p = m9c.p(W1);
                size = arrayList2.size();
                if (size != 0) {
                    int i4 = size + 1;
                    if (i4 > i) {
                        str = bu9Var.n;
                        z2 = true;
                        if (!z2 || p == null || (size2 = arrayList.size()) == 0 || size2 + 1 <= i) {
                            p = null;
                        } else {
                            String str2 = bu9Var.c;
                            if (str2.startsWith("@")) {
                                str2 = str2.substring(1);
                            }
                            try {
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                spannableStringBuilder2.append((CharSequence) "@");
                                spannableStringBuilder2.append((CharSequence) p);
                                int y1 = gm.y1(p, str2);
                                if (y1 != -1) {
                                    int length = str2.length();
                                    if (y1 == 0) {
                                        length++;
                                    } else {
                                        y1++;
                                    }
                                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(cmb.w0(null, cmb.fh, false)), y1, length + y1, 33);
                                }
                                p = spannableStringBuilder2;
                            } catch (Exception e) {
                                fc4.g(e, true);
                            }
                        }
                        if (str != null) {
                            String r = m9c.r(W1);
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(r);
                            int y12 = gm.y1(r, str);
                            if (y12 != -1) {
                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(cmb.w0(null, cmb.fh, false)), y12, str.length() + y12, 33);
                            }
                            spannableStringBuilder = spannableStringBuilder3;
                        }
                        ij6 ij6Var = (ij6) view;
                        ij6Var.setTag(Integer.valueOf(i));
                        ij6Var.setCustomImageVisible(pd5Var.Z1.contains(Long.valueOf(W1.id)));
                        ij6Var.c(W1, spannableStringBuilder, p, false);
                    }
                    i -= i4;
                }
                str = null;
                z2 = false;
                if (z2) {
                }
                p = null;
                if (str != null) {
                }
                ij6 ij6Var2 = (ij6) view;
                ij6Var2.setTag(Integer.valueOf(i));
                ij6Var2.setCustomImageVisible(pd5Var.Z1.contains(Long.valueOf(W1.id)));
                ij6Var2.c(W1, spannableStringBuilder, p, false);
            }
        }
        int i5 = this.w;
        if (i5 >= 0 && i > i5) {
            if (i < arrayList.size() + i5 + 1) {
                tLObject = (TLObject) arrayList.get((i - this.w) - 1);
                z = tLObject instanceof TLRPC.User;
                pd5 pd5Var2 = this.x;
                if (z) {
                }
                String p2 = m9c.p(W1);
                size = arrayList2.size();
                if (size != 0) {
                }
                str = null;
                z2 = false;
                if (z2) {
                }
                p2 = null;
                if (str != null) {
                }
                ij6 ij6Var22 = (ij6) view;
                ij6Var22.setTag(Integer.valueOf(i));
                ij6Var22.setCustomImageVisible(pd5Var2.Z1.contains(Long.valueOf(W1.id)));
                ij6Var22.c(W1, spannableStringBuilder, p2, false);
            }
        }
        tLObject = null;
        z = tLObject instanceof TLRPC.User;
        pd5 pd5Var22 = this.x;
        if (z) {
        }
        String p22 = m9c.p(W1);
        size = arrayList2.size();
        if (size != 0) {
        }
        str = null;
        z2 = false;
        if (z2) {
        }
        p22 = null;
        if (str != null) {
        }
        ij6 ij6Var222 = (ij6) view;
        ij6Var222.setTag(Integer.valueOf(i));
        ij6Var222.setCustomImageVisible(pd5Var22.Z1.contains(Long.valueOf(W1.id)));
        ij6Var222.c(W1, spannableStringBuilder, p22, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.view.View, l55] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.view.View] */
    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        ij6 ij6Var;
        if (i != 0) {
            Context context = this.c;
            if (i == 1) {
                ?? l55Var = new l55(context, null);
                anb.h(cmb.Zg, null, l55Var);
                l55Var.setTextColor(cmb.Gh);
                ij6Var = l55Var;
            } else if (i != 2) {
                ij6Var = new View(context);
            } else {
                ?? view = new View(context);
                view.setLayoutParams(new g69(-1, gm.L(56.0f)));
                ij6Var = view;
            }
        } else {
            ij6 ij6Var2 = new ij6(this.c, 2, 2, false, null);
            ij6Var2.setCustomRightImage(R.drawable.msg_invited);
            ij6Var2.setNameColor(cmb.w0(null, cmb.dh, false));
            int w0 = cmb.w0(null, cmb.bh, false);
            int w02 = cmb.w0(null, cmb.fh, false);
            ij6Var2.P = true;
            ij6Var2.I = w0;
            ij6Var2.J = w02;
            ij6Var2.setDividerColor(cmb.jh);
            ij6Var = ij6Var2;
        }
        return new b59(ij6Var);
    }
}
