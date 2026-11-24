// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.q;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hu1 extends u49 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final ArrayList N;
    public boolean O;
    public boolean P;
    public final ArrayList Q;
    public final /* synthetic */ yv1 R;
    public final Context h;
    public final boolean n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public hu1(yv1 yv1Var, Context context) {
        this.R = yv1Var;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.s = -5;
        this.w = -5;
        this.x = -5;
        this.y = -5;
        this.E = -5;
        this.F = -5;
        this.G = -5;
        this.H = -5;
        this.I = -5;
        this.J = -5;
        this.N = new ArrayList();
        this.Q = new ArrayList();
        this.h = context;
        TLRPC.User user = yv1Var.f;
        this.n = user != null && user.bot;
        C(true);
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return false;
    }

    public final void F(boolean z) {
        yv1 yv1Var = this.R;
        if (m9c.w(yv1Var.f)) {
            if (z) {
                yv1Var.fd = true;
            }
            if (this.J < 0 || I()) {
                return;
            }
            super.s(this.J);
            N();
        }
    }

    public final ArrayList G() {
        return this.M ? this.N : this.O ? this.Q : this.R.M6;
    }

    public final void H(k47 k47Var) {
        yv1 yv1Var = this.R;
        int childCount = yv1Var.A0.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = yv1Var.A0.getChildAt(i);
            if (childAt instanceof rc2) {
                rc2 rc2Var = (rc2) childAt;
                if (rc2Var.getMessageObject() == k47Var) {
                    rc2Var.invalidate();
                    return;
                }
            }
        }
    }

    public final boolean I() {
        yv1 yv1Var = this.R;
        return m9c.x(yv1Var.f) && yv1Var.d() == 0 && !yv1Var.fd && yv1Var.g4 == 0;
    }

    public final void J(boolean z) {
        boolean z2;
        boolean z3;
        yv1 yv1Var = this.R;
        ArrayList arrayList = yv1Var.M6;
        if (e21.a) {
            fc4.b("notify data set changed fragmentOpened=" + yv1Var.g6);
        }
        if (z && yv1Var.g6) {
            d69 itemAnimator = yv1Var.A0.getItemAnimator();
            xr1 xr1Var = yv1Var.B0;
            if (itemAnimator != xr1Var) {
                yv1Var.A0.setItemAnimator(xr1Var);
            }
        } else {
            yv1Var.A0.setItemAnimator(null);
        }
        N();
        try {
            super.f();
        } catch (Exception e) {
            fc4.g(e, true);
        }
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            k47 k47Var = (k47) arrayList.get(size);
            if (k47Var.l0) {
                size--;
            } else {
                TLRPC.Message message = k47Var.k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionTopicCreate) || (messageAction instanceof TLRPC.TL_messageActionChannelCreate)) {
                        z2 = true;
                    }
                }
            }
        }
        z2 = false;
        boolean[] zArr = yv1Var.U6;
        if ((zArr[0] && (yv1Var.d7 == 0 || zArr[1])) || z2) {
            z3 = ((d) yv1Var).fragmentBeginToShow;
            yv1Var.Y4(z3);
        }
    }

    public final void K(int i, boolean z) {
        boolean z2;
        k47 messageObject;
        if (e21.a) {
            StringBuilder sb = new StringBuilder("notify item removed ");
            sb.append(i);
            hg9.r(z ? " with thanos effect" : "", sb);
        }
        yv1 yv1Var = this.R;
        z2 = ((d) yv1Var).fragmentBeginToShow;
        vr1 vr1Var = yv1Var.A0;
        if (z2) {
            d69 itemAnimator = vr1Var.getItemAnimator();
            xr1 xr1Var = yv1Var.B0;
            if (itemAnimator != xr1Var) {
                yv1Var.A0.setItemAnimator(xr1Var);
            }
        } else {
            vr1Var.setItemAnimator(null);
        }
        if (z && yv1Var.B0 != null) {
            d69 itemAnimator2 = yv1Var.A0.getItemAnimator();
            xr1 xr1Var2 = yv1Var.B0;
            if (itemAnimator2 == xr1Var2) {
                u69 K = yv1Var.A0.K(i);
                if (K == null) {
                    xr1Var2.getClass();
                } else {
                    xr1Var2.S.add(K);
                    View view = K.a;
                    if ((view instanceof rc2) && (messageObject = ((rc2) view).getMessageObject()) != null) {
                        messageObject.a0 = true;
                    }
                }
            }
        }
        N();
        try {
            super.s(i);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void L(int i) {
        int i2;
        yv1 yv1Var = this.R;
        ArrayList arrayList = yv1Var.M6;
        if (yv1Var.C0 == null || this.M || this.O) {
            return;
        }
        int i3 = 0;
        if (!yv1Var.R4 && yv1Var.b8 != null) {
            int childCount = yv1Var.A0.getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    break;
                }
                View childAt = yv1Var.A0.getChildAt(i4);
                if (childAt instanceof rc2) {
                    k47 messageObject = ((rc2) childAt).getMessageObject();
                    k47 k47Var = yv1Var.b8;
                    if (messageObject == k47Var) {
                        if (arrayList.indexOf(k47Var) >= 0) {
                            i2 = arrayList.indexOf(yv1Var.b8) + this.K;
                            i3 = yv1Var.i7(childAt);
                        }
                    }
                }
                i4++;
            }
        }
        i2 = -1;
        g(i);
        if (i2 != -1) {
            yv1Var.C0.g1(i2, i3);
        }
    }

    public final rc2 M(k47 k47Var, boolean z, boolean z2) {
        yv1 yv1Var = this.R;
        if (z) {
            int childCount = yv1Var.A0.getChildCount();
            int i = 0;
            while (i < childCount) {
                View childAt = yv1Var.A0.getChildAt(i);
                if (childAt instanceof rc2) {
                    rc2 rc2Var = (rc2) childAt;
                    if (rc2Var.getMessageObject() == k47Var && TextUtils.equals(rc2Var.z5, rc2Var.Q5.k.post_author)) {
                        rc2Var.z3(k47Var, rc2Var.getCurrentMessagesGroup(), rc2Var.K2(), rc2Var.L2(), rc2Var.C2(), rc2Var.G2());
                        return rc2Var;
                    }
                }
                i++;
                k47Var = k47Var;
            }
        }
        k47 k47Var2 = k47Var;
        int indexOf = (this.M ? this.N : this.O ? this.Q : yv1Var.M6).indexOf(k47Var2);
        if (indexOf == -1) {
            return null;
        }
        if (!z2) {
            L(this.K + indexOf);
            return null;
        }
        int i2 = yv1.zd;
        yv1.zd = i2 + 1;
        k47Var2.m1 = i2;
        J(true);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N() {
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.User user3;
        int i;
        TLRPC.PeerSettings A1;
        TLRPC.PeerSettings A12;
        int i2;
        yv1 yv1Var = this.R;
        boolean[] zArr = yv1Var.U6;
        this.r = 0;
        ArrayList arrayList = this.M ? this.N : this.O ? this.Q : yv1Var.M6;
        if (yv1Var.g4 == 3 && yv1Var.mb) {
            this.r = 1;
            this.s = 0;
        } else {
            this.s = -5;
        }
        this.w = -5;
        this.x = -5;
        this.E = -5;
        this.H = -5;
        this.I = -5;
        this.J = -5;
        if (I()) {
            int i3 = this.r;
            this.r = i3 + 1;
            this.J = i3;
        }
        if (arrayList.isEmpty()) {
            this.F = -5;
            this.G = -5;
            this.K = 0;
            this.L = 0;
            TLRPC.User user4 = yv1Var.f;
            if (user4 != null && !m9c.v(user4) && !m9c.B(yv1Var.f)) {
                TLRPC.PeerSettings A13 = yv1Var.getMessagesController().A1(yv1Var.f.id);
                int i4 = h9c.Q;
                if (A13 != null && ((A13.phone_country != null || A13.registration_month != null) && !oc7.G2(yv1Var.f) && yv1Var.g4 == 0)) {
                    int i5 = this.r;
                    this.r = i5 + 1;
                    this.E = i5;
                    return;
                }
            }
            if (m9c.B(yv1Var.f) || ((user = yv1Var.f) != null && user.bot && !oc7.G2(user) && yv1Var.g4 == 0)) {
                int i6 = this.r;
                this.r = i6 + 1;
                this.x = i6;
                return;
            }
            return;
        }
        if (!this.O) {
            boolean[] zArr2 = yv1Var.W6;
            if (((!zArr2[0] || (yv1Var.d7 != 0 && !zArr2[1])) && !yv1Var.X6) || yv1Var.tb) {
                int i7 = this.r;
                this.r = i7 + 1;
                this.G = i7;
                int i8 = this.r;
                this.K = i8;
                int size = arrayList.size() + i8;
                this.r = size;
                this.L = size;
                user2 = yv1Var.f;
                if (user2 != null && !m9c.v(user2) && !m9c.B(yv1Var.f)) {
                    A1 = yv1Var.getMessagesController().A1(yv1Var.f.id);
                    int i9 = h9c.Q;
                    if (A1 != null && ((A1.phone_country != null || A1.registration_month != null) && !oc7.G2(yv1Var.f) && yv1Var.g4 == 0 && zArr[0])) {
                        A12 = yv1Var.getMessagesController().A1(yv1Var.f.id);
                        i2 = A12.name_change_date;
                        if (i2 != 0) {
                            int i10 = A12.photo_change_date;
                            int i11 = this.r;
                            if (i10 != 0) {
                                int i12 = i11 + 1;
                                if (i2 < i10) {
                                    this.I = i11;
                                    this.r = i11 + 2;
                                    this.H = i12;
                                } else {
                                    this.H = i11;
                                    this.r = i11 + 2;
                                    this.I = i12;
                                }
                                int i13 = this.r;
                                this.r = i13 + 1;
                                this.E = i13;
                                i = yv1Var.g4;
                                if (i == 9) {
                                    int i14 = this.r;
                                    this.s = i14;
                                    this.r = i14 + 2;
                                    this.w = i14 + 1;
                                }
                                if (i == 5 && !pz8.g(yv1Var.f4)) {
                                    int i15 = this.r;
                                    this.r = i15 + 1;
                                    this.s = i15;
                                }
                                if (!this.O ? !(zArr[0] && (yv1Var.d7 == 0 || zArr[1])) && (gm.O1() || yv1Var.v4 || yv1Var.f != null) : !this.P) {
                                    this.F = -5;
                                    return;
                                }
                                int i16 = this.r;
                                this.r = i16 + 1;
                                this.F = i16;
                                return;
                            }
                            this.r = i11 + 1;
                            this.I = i11;
                        }
                        if (A12.photo_change_date != 0) {
                            int i17 = this.r;
                            this.r = i17 + 1;
                            this.H = i17;
                        }
                        int i132 = this.r;
                        this.r = i132 + 1;
                        this.E = i132;
                        i = yv1Var.g4;
                        if (i == 9) {
                        }
                        if (i == 5) {
                            int i152 = this.r;
                            this.r = i152 + 1;
                            this.s = i152;
                        }
                        if (this.O) {
                            int i162 = this.r;
                            this.r = i162 + 1;
                            this.F = i162;
                            return;
                        } else {
                            int i1622 = this.r;
                            this.r = i1622 + 1;
                            this.F = i1622;
                            return;
                        }
                    }
                }
                if ((!m9c.B(yv1Var.f) || ((user3 = yv1Var.f) != null && user3.bot && !oc7.G2(user3) && yv1Var.g4 == 0)) && zArr[0]) {
                    int i18 = this.r;
                    this.r = i18 + 1;
                    this.x = i18;
                }
                i = yv1Var.g4;
                if (i == 9) {
                }
                if (i == 5) {
                }
                if (this.O) {
                }
            }
        }
        this.G = -5;
        int i82 = this.r;
        this.K = i82;
        int size2 = arrayList.size() + i82;
        this.r = size2;
        this.L = size2;
        user2 = yv1Var.f;
        if (user2 != null) {
            A1 = yv1Var.getMessagesController().A1(yv1Var.f.id);
            int i92 = h9c.Q;
            if (A1 != null) {
                A12 = yv1Var.getMessagesController().A1(yv1Var.f.id);
                i2 = A12.name_change_date;
                if (i2 != 0) {
                }
                if (A12.photo_change_date != 0) {
                }
                int i1322 = this.r;
                this.r = i1322 + 1;
                this.E = i1322;
                i = yv1Var.g4;
                if (i == 9) {
                }
                if (i == 5) {
                }
                if (this.O) {
                }
            }
        }
        if (!m9c.B(yv1Var.f)) {
        }
        int i182 = this.r;
        this.r = i182 + 1;
        this.x = i182;
        i = yv1Var.g4;
        if (i == 9) {
        }
        if (i == 5) {
        }
        if (this.O) {
        }
    }

    public final void O() {
        int i = this.r;
        int i2 = this.x;
        int i3 = this.E;
        int i4 = this.s;
        int i5 = this.w;
        int i6 = this.F;
        int i7 = this.G;
        int i8 = this.K;
        int i9 = this.L;
        int i10 = this.H;
        int i11 = this.I;
        int i12 = this.J;
        N();
        if (i == this.r && i2 == this.x && i6 == this.F && i7 == this.G && i8 == this.K && i9 == this.L && i4 == this.s && i5 == this.w && i3 == this.E && i10 == this.H && i11 == this.I && i12 == this.J) {
            return;
        }
        J(false);
    }

    @Override // y59
    public final int b() {
        this.y = -5;
        yv1 yv1Var = this.R;
        vh6 vh6Var = yv1Var.v8;
        if (yv1Var.e6.get(yv1Var.s4, 0) == 0) {
            return this.r;
        }
        TLRPC.User user = yv1Var.f;
        if (user == null || !user.bot || yv1Var.g4 != 0 || ((vh6Var.m() <= 0 || (((TL_bots.BotInfo) vh6Var.f(yv1Var.f.id)).description == null && ((TL_bots.BotInfo) vh6Var.f(yv1Var.f.id)).description_photo == null && ((TL_bots.BotInfo) vh6Var.f(yv1Var.f.id)).description_document == null)) && !m9c.B(yv1Var.f) && !m9c.w(yv1Var.f))) {
            return 0;
        }
        this.y = 0;
        return 1;
    }

    @Override // y59
    public final long c(int i) {
        yv1 yv1Var = this.R;
        if (yv1Var.e6.get(yv1Var.s4, 0) != 0 && i == this.y) {
            return 1L;
        }
        ArrayList arrayList = this.M ? this.N : this.O ? this.Q : yv1Var.M6;
        if (i >= this.K && i < this.L) {
            return ((k47) arrayList.get(i - r1)).m1;
        }
        if (i == this.x || i == this.y) {
            return 1L;
        }
        if (i == this.F) {
            return 2L;
        }
        if (i == this.G) {
            return 3L;
        }
        if (i == this.s) {
            return 4L;
        }
        if (i == this.E) {
            return 6L;
        }
        if (i == this.H) {
            return 7L;
        }
        if (i == this.I) {
            return 8L;
        }
        if (i == this.J) {
            return 9L;
        }
        return i == this.w ? 10L : 5L;
    }

    @Override // y59
    public final int d(int i) {
        yv1 yv1Var = this.R;
        if (yv1Var.e6.get(yv1Var.s4, 0) != 0 && i == this.y) {
            return 3;
        }
        if (i == this.s || i == this.w) {
            return 1;
        }
        int i2 = this.K;
        if (i >= i2 && i < this.L) {
            return ((k47) (this.M ? this.N : this.O ? this.Q : yv1Var.M6).get(i - i2)).U;
        }
        if (i == this.x) {
            return 3;
        }
        if (i == this.E) {
            return 6;
        }
        if (i == this.I || i == this.H) {
            return 7;
        }
        return i == this.J ? 8 : 4;
    }

    @Override // u49, y59
    public final void f() {
        J(false);
    }

    @Override // u49, y59
    public final void g(int i) {
        boolean z;
        if (e21.a) {
            fc4.b("notify item changed " + i);
        }
        yv1 yv1Var = this.R;
        z = ((d) yv1Var).fragmentBeginToShow;
        if (!z || yv1Var.c1) {
            yv1Var.A0.setItemAnimator(null);
        } else {
            d69 itemAnimator = yv1Var.A0.getItemAnimator();
            xr1 xr1Var = yv1Var.B0;
            if (itemAnimator != xr1Var) {
                yv1Var.A0.setItemAnimator(xr1Var);
            }
        }
        N();
        try {
            super.g(i);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // u49, y59
    public final void i(int i) {
        boolean z;
        if (e21.a) {
            fc4.b("notify item inserted " + i);
        }
        yv1 yv1Var = this.R;
        z = ((d) yv1Var).fragmentBeginToShow;
        vr1 vr1Var = yv1Var.A0;
        if (z) {
            d69 itemAnimator = vr1Var.getItemAnimator();
            xr1 xr1Var = yv1Var.B0;
            if (itemAnimator != xr1Var) {
                yv1Var.A0.setItemAnimator(xr1Var);
            }
        } else {
            vr1Var.setItemAnimator(null);
        }
        N();
        try {
            super.i(i);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // y59
    public final void j(int i, int i2) {
        boolean z;
        if (e21.a) {
            fc4.b("notify item moved" + i + ":" + i2);
        }
        yv1 yv1Var = this.R;
        z = ((d) yv1Var).fragmentBeginToShow;
        vr1 vr1Var = yv1Var.A0;
        if (z) {
            d69 itemAnimator = vr1Var.getItemAnimator();
            xr1 xr1Var = yv1Var.B0;
            if (itemAnimator != xr1Var) {
                yv1Var.A0.setItemAnimator(xr1Var);
            }
        } else {
            vr1Var.setItemAnimator(null);
        }
        N();
        try {
            super.j(i, i2);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // u49, y59
    public final void l(int i, int i2) {
        boolean z;
        if (e21.a) {
            fc4.b("notify item range changed " + i + ":" + i2);
        }
        yv1 yv1Var = this.R;
        z = ((d) yv1Var).fragmentBeginToShow;
        vr1 vr1Var = yv1Var.A0;
        if (z) {
            d69 itemAnimator = vr1Var.getItemAnimator();
            xr1 xr1Var = yv1Var.B0;
            if (itemAnimator != xr1Var) {
                yv1Var.A0.setItemAnimator(xr1Var);
            }
        } else {
            vr1Var.setItemAnimator(null);
        }
        N();
        try {
            super.l(i, i2);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // u49, y59
    public final void p(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        yv1 yv1Var = this.R;
        ArrayList arrayList = yv1Var.M6;
        if (e21.a) {
            fc4.b("notify item range inserted " + i + ":" + i2);
        }
        z = ((d) yv1Var).fragmentBeginToShow;
        vr1 vr1Var = yv1Var.A0;
        if (z) {
            d69 itemAnimator = vr1Var.getItemAnimator();
            xr1 xr1Var = yv1Var.B0;
            if (itemAnimator != xr1Var) {
                yv1Var.A0.setItemAnimator(xr1Var);
            }
        } else {
            vr1Var.setItemAnimator(null);
        }
        N();
        if (i == 1 && i2 > 0 && (i3 = i + i2) >= (i4 = this.K) && i3 < this.L) {
            k47 k47Var = (k47) arrayList.get(i3 - i4);
            k47 k47Var2 = (k47) arrayList.get((i3 - this.K) - 1);
            if ((yv1Var.e != null && k47Var.Z0() == k47Var2.Z0()) || (yv1Var.f != null && k47Var.O3() == k47Var2.O3())) {
                g(i);
            }
        }
        try {
            super.p(i, i2);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // u49, y59
    public final void q(int i, int i2) {
        boolean z;
        if (e21.a) {
            fc4.b("notify item range removed" + i + ":" + i2);
        }
        yv1 yv1Var = this.R;
        z = ((d) yv1Var).fragmentBeginToShow;
        vr1 vr1Var = yv1Var.A0;
        if (z) {
            d69 itemAnimator = vr1Var.getItemAnimator();
            xr1 xr1Var = yv1Var.B0;
            if (itemAnimator != xr1Var) {
                yv1Var.A0.setItemAnimator(xr1Var);
            }
        } else {
            vr1Var.setItemAnimator(null);
        }
        N();
        try {
            super.q(i, i2);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // u49, y59
    public final void s(int i) {
        boolean z;
        if (e21.a) {
            fc4.b("notify item removed " + i);
        }
        yv1 yv1Var = this.R;
        z = ((d) yv1Var).fragmentBeginToShow;
        vr1 vr1Var = yv1Var.A0;
        if (z) {
            d69 itemAnimator = vr1Var.getItemAnimator();
            xr1 xr1Var = yv1Var.B0;
            if (itemAnimator != xr1Var) {
                yv1Var.A0.setItemAnimator(xr1Var);
            }
        } else {
            vr1Var.setItemAnimator(null);
        }
        N();
        try {
            super.s(i);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x024a, code lost:
    
        if (r4.X4.containsKey(java.lang.Integer.valueOf(((k47) r8.get(0)).e1())) != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x05a4, code lost:
    
        if (r18 != r25) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0913, code lost:
    
        if (r4.B0 == null) goto L531;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x05d5, code lost:
    
        if (k47.B1(r5.k.peer_id) == k47.B1(r2.k.peer_id)) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x064a, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x05ef, code lost:
    
        if (r2.R1() == r5.R1()) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0648, code lost:
    
        if (k47.B1(r8) == k47.B1(r5.k.fwd_from.from_id)) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0405, code lost:
    
        if (k47.B1(r5.k.peer_id) == k47.B1(r10.k.peer_id)) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x047a, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0423, code lost:
    
        if (r10.R1() == r5.R1()) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0478, code lost:
    
        if (k47.B1(r11) == k47.B1(r5.k.fwd_from.from_id)) goto L257;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0255 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x094e  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x095d  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0289  */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v18 */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
        TLRPC.UserFull userFull;
        TLObject tLObject;
        String str;
        er0 er0Var;
        int i2;
        int i3;
        int i4;
        k47 k47Var;
        boolean z;
        boolean z2;
        boolean z3;
        int i5;
        ArrayList arrayList;
        long j;
        int i6;
        boolean z4;
        boolean z5;
        boolean z6;
        int i7;
        boolean z7;
        int d;
        ArrayList arrayList2;
        int i8;
        int i9;
        boolean z8;
        f47 f47Var;
        boolean z9;
        boolean z10;
        boolean z11;
        String str2;
        int indexOf;
        ?? r15;
        xr1 xr1Var;
        g47 g47Var;
        ms1 ms1Var;
        a aVar;
        int i10;
        byte b;
        a aVar2;
        a aVar3;
        boolean z12;
        boolean z13;
        q qVar;
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        String str3;
        boolean equals;
        boolean z14;
        long j2;
        long j3;
        int i11;
        int i12;
        int i13;
        String str4;
        boolean z15;
        int i14;
        TLRPC.ChatFull chatFull;
        View view = u69Var.a;
        yv1 yv1Var = this.R;
        vh6 vh6Var = yv1Var.v8;
        ArrayList arrayList3 = yv1Var.K4;
        HashMap hashMap = yv1Var.L4;
        if (i == this.x || i == this.y) {
            er0 er0Var2 = (er0) view;
            if (m9c.B(yv1Var.f)) {
                er0Var = er0Var2;
                er0Var.b(false, 0L, jb6.M0(2131746000, null), null, null, null);
            } else {
                TLRPC.User user = yv1Var.f;
                if (user == null || user.id != 489000) {
                    TL_bots.BotInfo botInfo = vh6Var.m() != 0 ? (TL_bots.BotInfo) vh6Var.f(yv1Var.f.id) : null;
                    boolean z16 = (botInfo == null || (TextUtils.isEmpty(botInfo.description) && botInfo.description_photo == null && botInfo.description_document == null)) && m9c.v(yv1Var.f) && (userFull = yv1Var.s8) != null && userFull.bot_manager_id != 0 && yv1Var.f.bot_can_edit;
                    TLRPC.User user2 = yv1Var.f;
                    long j4 = user2 == null ? 0L : user2.id;
                    String str5 = botInfo != null ? botInfo.description : null;
                    if (botInfo != null) {
                        TLObject tLObject2 = botInfo.description_document;
                        if (tLObject2 == null) {
                            tLObject2 = botInfo.description_photo;
                        }
                        tLObject = tLObject2;
                    } else {
                        tLObject = null;
                    }
                    if (z16) {
                        i2 = ((d) yv1Var).currentAccount;
                        str = pg3.k(i2, yv1Var.s8.bot_manager_id);
                    } else {
                        str = null;
                    }
                    er0Var = er0Var2;
                    er0Var.b(true, j4, str5, tLObject, botInfo, str);
                } else {
                    er0Var = er0Var2;
                    er0Var.b(false, 0L, jb6.M0(2131743304, null), null, null, null);
                }
            }
            yv1Var.Nc(er0Var);
            return;
        }
        if (i == this.J) {
            ((op0) view).setDialogId(yv1Var.a());
            return;
        }
        if (i == this.E) {
            h9c h9cVar = (h9c) view;
            TLRPC.EncryptedChat encryptedChat = yv1Var.h;
            long a = encryptedChat != null ? encryptedChat.user_id : yv1Var.a();
            h9cVar.b(a, yv1Var.getMessagesController().A1(a));
            return;
        }
        if (i == this.G || i == this.F) {
            ((xb2) view).setProgressVisible(yv1Var.b7 > 1);
            return;
        }
        if (i == this.I) {
            if (yv1Var.getMessagesController().A1(yv1Var.a()) != null) {
                ((cm1) view).setCustomText(jb6.a0(null, null, 2131751731, jb6.N(yv1Var.getConnectionsManager().getCurrentTime() - r0.name_change_date)));
                return;
            }
            return;
        }
        if (i == this.H) {
            if (yv1Var.getMessagesController().A1(yv1Var.a()) != null) {
                ((cm1) view).setCustomText(jb6.a0(null, null, 2131751730, jb6.N(yv1Var.getConnectionsManager().getCurrentTime() - r0.photo_change_date)));
                return;
            }
            return;
        }
        if (i == this.s) {
            cm1 cm1Var = (cm1) view;
            yv1Var.W5();
            cm1Var.setMessageObject(yv1Var.X3);
            int i15 = yv1Var.g4;
            if (i15 == 3) {
                cm1Var.setCustomText(jb6.M0(2131745628, null));
            } else if (i15 == 5) {
                cm1Var.setCustomText(jb6.M0(2131752624, null));
            } else if (i15 == 9) {
                cm1Var.setCustomText(jb6.M0(2131742556, null));
            }
            cm1Var.setAlpha(1.0f);
            cm1Var.setSpoilersSuppressed(yv1Var.A0.getScrollState() != 0);
            return;
        }
        if (i == this.w) {
            cm1 cm1Var2 = (cm1) view;
            yv1Var.X5();
            cm1Var2.setMessageObject(yv1Var.Y3);
            cm1Var2.setCustomText(jb6.M0(2131742557, null));
            cm1Var2.setAlpha(1.0f);
            cm1Var2.setSpoilersSuppressed(yv1Var.A0.getScrollState() != 0);
            return;
        }
        int i16 = this.K;
        if (i < i16 || i >= this.L) {
            return;
        }
        ArrayList arrayList4 = this.M ? this.N : this.O ? this.Q : yv1Var.M6;
        k47 k47Var2 = (k47) arrayList4.get(i - i16);
        if (!(view instanceof rc2)) {
            ArrayList arrayList5 = arrayList4;
            if (!(view instanceof cm1)) {
                if (view instanceof vf2) {
                    vf2 vf2Var = (vf2) view;
                    vf2Var.setText(jb6.M0(2131743525, null));
                    vf2Var.getTextView().setTranslationX(yv1Var.o7() / 2.0f);
                    if (yv1Var.V7 != 0) {
                        yv1Var.V7 = 0;
                        return;
                    }
                    return;
                }
                return;
            }
            if ((k47Var2 == null || !k47Var2.l0) && (i4 = (i3 = i + 1) - this.K) >= 0 && i4 < arrayList5.size()) {
                k47 k47Var3 = (k47) arrayList5.get(i3 - this.K);
                if (k47Var3 == null || !k47Var3.l0) {
                    k47Var = k47Var3;
                } else {
                    int i17 = i + 2;
                    int i18 = i17 - this.K;
                    k47Var = (i18 < 0 || i18 >= arrayList5.size()) ? null : (k47) arrayList5.get(i17 - this.K);
                }
                z = k47Var == null || !(k47Var2 == null || k47Var.Y1() == k47Var2.Y1());
            } else {
                z = false;
            }
            cm1 cm1Var3 = (cm1) view;
            cm1Var3.f0 = yv1Var.S7();
            cm1Var3.j0 = yv1Var.f8();
            yv1Var.e8();
            yv1Var.n7();
            cm1Var3.k0 = yv1Var.o7();
            cm1Var3.g0 = sd2.c0(yv1Var.e);
            cm1Var3.h0 = sd2.p0(yv1Var.e);
            cm1Var3.i0 = m9c.w(yv1Var.f);
            boolean z17 = cm1Var3.l0 != z;
            cm1Var3.l0 = z;
            cm1Var3.i0(k47Var2, z17);
            cm1Var3.setAlpha(1.0f);
            cm1Var3.setShowTopic(true);
            cm1Var3.setSpoilersSuppressed(yv1Var.A0.getScrollState() != 0);
            return;
        }
        rc2 rc2Var = (rc2) view;
        f47 v7 = yv1Var.v7(k47Var2);
        rc2Var.f6 = yv1Var.e != null || m9c.D(yv1Var.f) || m9c.B(yv1Var.f) || yv1Var.g4 == 7;
        rc2Var.E.a(false, false);
        rc2Var.g6 = m9c.w(yv1Var.f);
        rc2Var.s6 = yv1Var.c8();
        int i19 = yv1Var.g4;
        rc2Var.h6 = i19 == 3;
        rc2Var.i6 = i19 == 3 && yv1Var.mb;
        TLRPC.User user3 = yv1Var.f;
        rc2Var.j6 = user3 != null && user3.bot;
        rc2Var.k6 = sd2.T(yv1Var.e) && yv1Var.e.megagroup;
        rc2Var.l6 = sd2.c0(yv1Var.e);
        rc2Var.m6 = sd2.p0(yv1Var.e);
        rc2Var.n6 = sd2.c0(yv1Var.e) && yv1Var.x4 && yv1Var.d() == 1;
        rc2Var.o6 = (yv1Var.s4 != 0 || (rc2Var.l6 && yv1Var.x4)) && !rc2Var.m6;
        int i20 = yv1Var.g4;
        if (i20 != 1 && i20 != 9 && sd2.T(yv1Var.e)) {
            TLRPC.Chat chat = yv1Var.e;
            if (chat.has_link && !chat.megagroup) {
                z2 = true;
                rc2Var.p6 = z2;
                if (yv1Var.g4 == 0) {
                    if (!yv1Var.X4.containsKey(Integer.valueOf(k47Var2.e1()))) {
                        if (v7 != null) {
                            ArrayList arrayList6 = v7.d;
                            if (!arrayList6.isEmpty()) {
                            }
                        }
                    }
                    z3 = true;
                    rc2Var.q6 = z3;
                    i5 = yv1Var.g4;
                    if (i5 != 1 || i5 == 9 || (chatFull = yv1Var.r8) == null) {
                        arrayList = arrayList4;
                        j = 0;
                    } else {
                        arrayList = arrayList4;
                        j = chatFull.linked_chat_id;
                    }
                    rc2Var.t6 = j;
                    if (i5 == 7 || yv1Var.d4 != 1) {
                        rc2Var.u6 = m9c.B(yv1Var.f);
                    } else {
                        rc2Var.u6 = m9c.A(k47.B0(k47Var2.k));
                    }
                    rc2Var.v6 = yv1Var.g4 == 2;
                    rc2Var.W6 = yv1Var.S7();
                    rc2Var.X6 = yv1Var.f8();
                    rc2Var.Y6 = yv1Var.e8();
                    rc2Var.Z6 = yv1Var.n7();
                    rc2Var.a7 = yv1Var.o7();
                    if (k47Var2.q4()) {
                        gm.K(rc2Var, new jd((byte) 10));
                    }
                    int i21 = i + 2;
                    if (v7 != null) {
                        ArrayList arrayList7 = v7.e;
                        c47 d2 = v7.d(k47Var2);
                        int i22 = -100;
                        if (d2 == null) {
                            z4 = false;
                            z5 = false;
                            z15 = false;
                            z6 = false;
                            i6 = -100;
                        } else if (v7.i) {
                            i22 = arrayList7.indexOf(d2) + i + 1;
                            i6 = arrayList7.indexOf(d2) + (i - arrayList7.size());
                            z4 = false;
                            z5 = false;
                            z15 = false;
                            z6 = false;
                        } else {
                            if ((d2.l & 4) != 0) {
                                i14 = v7.n ? arrayList7.indexOf(d2) + (i - arrayList7.size()) : arrayList7.indexOf(d2) + i + 1;
                                z15 = false;
                                z6 = false;
                            } else {
                                z15 = true;
                                z6 = true;
                                i14 = -100;
                            }
                            if ((d2.l & 8) != 0) {
                                i22 = v7.n ? arrayList7.indexOf(d2) + i + 1 : arrayList7.indexOf(d2) + (i - arrayList7.size());
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            z5 = z4;
                            i6 = i22;
                            i22 = i14;
                        }
                        int i23 = i22;
                        z7 = z15;
                        i7 = i23;
                    } else {
                        i6 = i - 1;
                        z4 = false;
                        z5 = false;
                        z6 = false;
                        i7 = i + 1;
                        z7 = false;
                    }
                    int d3 = d(i6);
                    d = d(i7);
                    d(i21);
                    if ((k47Var2.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && d3 == u69Var.f) {
                        arrayList2 = arrayList;
                        k47 k47Var4 = (k47) arrayList2.get(i6 - this.K);
                        if (k47Var4.O3() != k47Var2.O3() || (Math.abs(k47Var4.k.date - k47Var2.k.date) > 300 && yv1Var.g4 != 9)) {
                            i13 = i7;
                            z5 = false;
                        } else {
                            i13 = i7;
                            z5 = true;
                        }
                        if (z5) {
                            TLRPC.Message message2 = k47Var4.k;
                            boolean z18 = z5;
                            i8 = i13;
                            if (message2 == null || message2.paid_message_stars <= 0) {
                                if (!k47Var2.y3() && !k47Var4.y3()) {
                                    if (yv1Var.e != null) {
                                        long Z0 = k47Var4.Z0();
                                        z18 = Z0 == k47Var2.Z0();
                                        if (!z4 && z18 && Z0 < 0 && yv1Var.e.megagroup && yv1Var.g4 != 9) {
                                            z18 = false;
                                        }
                                    } else {
                                        if (m9c.D(yv1Var.f) || m9c.B(yv1Var.f)) {
                                            if (!k47Var2.X3()) {
                                                if (!k47Var4.X3()) {
                                                }
                                            }
                                        } else if (yv1Var.g4 == 7) {
                                        }
                                        if (pg3.n(k47Var4.k.guestchat_via_from) != pg3.n(k47Var2.k.guestchat_via_from)) {
                                        }
                                    }
                                    z5 = z18;
                                    if (pg3.n(k47Var4.k.guestchat_via_from) != pg3.n(k47Var2.k.guestchat_via_from)) {
                                    }
                                } else if (k47Var2.y3() && k47Var4.y3() && Math.abs(k47Var4.k.fwd_from.date - k47Var2.k.fwd_from.date) <= 300) {
                                    TLRPC.MessageFwdHeader messageFwdHeader2 = k47Var4.k.fwd_from;
                                    String str6 = messageFwdHeader2.from_name;
                                    if (str6 == null || (str4 = k47Var2.k.fwd_from.from_name) == null) {
                                        TLRPC.Peer peer = messageFwdHeader2.from_id;
                                        if (peer != null) {
                                            if (k47Var2.k.fwd_from.from_id != null) {
                                            }
                                        }
                                    } else {
                                        z5 = str6.equals(str4);
                                        if (pg3.n(k47Var4.k.guestchat_via_from) != pg3.n(k47Var2.k.guestchat_via_from)) {
                                            z5 = false;
                                        }
                                    }
                                }
                            }
                            z5 = false;
                            if (pg3.n(k47Var4.k.guestchat_via_from) != pg3.n(k47Var2.k.guestchat_via_from)) {
                            }
                        } else {
                            i8 = i13;
                        }
                    } else {
                        arrayList2 = arrayList;
                        i8 = i7;
                    }
                    i9 = i8 - this.K;
                    if (i9 >= 0 || i9 >= arrayList2.size()) {
                        z8 = true;
                    } else {
                        k47 k47Var5 = (k47) arrayList2.get(i8 - this.K);
                        if (k47Var5 != null && k47Var5.l0) {
                            int i24 = i8 + 1;
                            int i25 = i24 - this.K;
                            k47Var5 = (i25 < 0 || i25 >= arrayList2.size()) ? null : (k47) arrayList2.get(i24 - this.K);
                        }
                        z8 = k47Var5 == null || k47Var5.Y1() != k47Var2.Y1();
                    }
                    int i26 = this.K;
                    boolean z19 = i == i26;
                    if (d == u69Var.f) {
                        k47 k47Var6 = (k47) arrayList2.get(i8 - i26);
                        z7 = !(k47Var6.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && k47Var6.O3() == k47Var2.O3() && (Math.abs(k47Var6.k.date - k47Var2.k.date) <= 300 || yv1Var.g4 == 9);
                        if (z7) {
                            if (k47Var2.y3() || k47Var6.y3()) {
                                f47Var = v7;
                                if (k47Var2.y3() && k47Var6.y3() && Math.abs(k47Var2.k.fwd_from.date - k47Var6.k.fwd_from.date) <= 300) {
                                    TLRPC.MessageFwdHeader messageFwdHeader3 = k47Var6.k.fwd_from;
                                    String str7 = messageFwdHeader3.from_name;
                                    if (str7 == null || (str3 = k47Var2.k.fwd_from.from_name) == null) {
                                        TLRPC.Peer peer2 = messageFwdHeader3.from_id;
                                        if (peer2 != null && k47Var2.k.fwd_from.from_id != null) {
                                        }
                                    } else {
                                        equals = str7.equals(str3);
                                        z7 = equals;
                                        if (pg3.n(k47Var6.k.guestchat_via_from) != pg3.n(k47Var2.k.guestchat_via_from)) {
                                            z7 = false;
                                        }
                                    }
                                }
                                z7 = false;
                                if (pg3.n(k47Var6.k.guestchat_via_from) != pg3.n(k47Var2.k.guestchat_via_from)) {
                                }
                            } else {
                                if (yv1Var.e != null) {
                                    long Z02 = k47Var6.Z0();
                                    equals = (Z02 != k47Var2.Z0() || k47Var2.y3() || k47Var6.y3()) ? false : true;
                                    if (!z6 && equals && Z02 < 0 && yv1Var.e.megagroup && yv1Var.g4 != 9) {
                                        equals = false;
                                    }
                                    if (equals && yv1Var.V7()) {
                                        TLRPC.TL_forumTopic tL_forumTopic = k47Var2.j1;
                                        if (tL_forumTopic == null) {
                                            i12 = ((d) yv1Var).currentAccount;
                                            z14 = false;
                                            j2 = k47.b2(i12, k47Var2.k, true, false);
                                            f47Var = v7;
                                        } else {
                                            z14 = false;
                                            f47Var = v7;
                                            j2 = tL_forumTopic.id;
                                        }
                                        TLRPC.TL_forumTopic tL_forumTopic2 = k47Var6.j1;
                                        if (tL_forumTopic2 == null) {
                                            i11 = ((d) yv1Var).currentAccount;
                                            j3 = k47.b2(i11, k47Var6.k, true, z14);
                                        } else {
                                            j3 = tL_forumTopic2.id;
                                        }
                                    } else {
                                        f47Var = v7;
                                    }
                                    z7 = equals;
                                    if (pg3.n(k47Var6.k.guestchat_via_from) != pg3.n(k47Var2.k.guestchat_via_from)) {
                                    }
                                } else {
                                    f47Var = v7;
                                    if (m9c.D(yv1Var.f) || m9c.B(yv1Var.f)) {
                                        if (!k47Var2.X3() && !k47Var6.X3()) {
                                        }
                                        z7 = false;
                                        if (pg3.n(k47Var6.k.guestchat_via_from) != pg3.n(k47Var2.k.guestchat_via_from)) {
                                        }
                                    } else {
                                        if (yv1Var.g4 == 7) {
                                        }
                                        if (pg3.n(k47Var6.k.guestchat_via_from) != pg3.n(k47Var2.k.guestchat_via_from)) {
                                        }
                                    }
                                    z7 = equals;
                                    if (pg3.n(k47Var6.k.guestchat_via_from) != pg3.n(k47Var2.k.guestchat_via_from)) {
                                    }
                                }
                                equals = false;
                                z7 = equals;
                                if (pg3.n(k47Var6.k.guestchat_via_from) != pg3.n(k47Var2.k.guestchat_via_from)) {
                                }
                            }
                            if (sd2.T(yv1Var.e) && yv1Var.e.megagroup && k47Var2.Z0() <= 0 && (messageFwdHeader = k47Var2.k.fwd_from) != null && (messageFwdHeader.saved_from_peer instanceof TLRPC.TL_peerChannel)) {
                                if (!z6) {
                                    z7 = false;
                                }
                                if (!z4) {
                                    z5 = false;
                                }
                            }
                            if (!z6 && (message = k47Var2.k) != null && message.paid_message_stars > 0) {
                                z7 = false;
                            }
                            boolean z20 = false;
                            k47Var2.f6(false);
                            f47 f47Var2 = f47Var;
                            if (f47Var != null) {
                                ArrayList arrayList8 = f47Var2.d;
                                int i27 = 0;
                                while (i27 < arrayList8.size()) {
                                    ((k47) arrayList8.get(i27)).f6(z20);
                                    i27++;
                                    z20 = false;
                                }
                            }
                            if (yv1Var.nb) {
                                z9 = z5;
                                z10 = z7;
                            } else {
                                if (f47Var2 != null) {
                                    z11 = true;
                                    z9 = false;
                                    z10 = false;
                                    rc2Var.setShowTopic(z11);
                                    rc2Var.z3(k47Var2, f47Var2, z9, z10, z8, z19);
                                    rc2Var.setSpoilersSuppressed(yv1Var.A0.getScrollState() != 0);
                                    rc2Var.setHighlighted(yv1Var.d8 == Integer.MAX_VALUE && k47Var2.e1() == yv1Var.d8);
                                    if (rc2Var.x6) {
                                        if (yv1Var.h8 != null) {
                                            long currentTimeMillis = System.currentTimeMillis();
                                            rc2Var.w3(true, yv1Var.k8, yv1Var.h8, yv1Var.f8 || currentTimeMillis - yv1Var.g8 < 200);
                                            if (yv1Var.f8) {
                                                yv1Var.g8 = currentTimeMillis;
                                            }
                                            yv1Var.f8 = false;
                                        } else {
                                            Integer num = yv1Var.i8;
                                            if (num != null) {
                                                rc2Var.u3(num.intValue());
                                            } else {
                                                byte[] bArr = yv1Var.j8;
                                                if (bArr != null) {
                                                    rc2Var.s3(bArr);
                                                }
                                            }
                                        }
                                        if (yv1Var.d8 != Integer.MAX_VALUE) {
                                            yv1Var.Ec();
                                        }
                                        indexOf = arrayList3.indexOf(k47Var2);
                                        if (indexOf != -1) {
                                            if (k47Var2.D == 5 && (qVar = yv1Var.q3) != null && qVar.getTextureView() != null) {
                                                ho1 ho1Var = yv1Var.I7;
                                                if (ho1Var != null) {
                                                    gm.r(ho1Var);
                                                    yv1Var.I7 = null;
                                                }
                                                rc2Var.getViewTreeObserver().addOnPreDrawListener(new fu1(this, rc2Var, (byte) 0));
                                            } else if ((k47Var2.M2() && !k47Var2.I2()) || ((g47Var = k47Var2.N1) != null && g47Var.h)) {
                                                if (!k47Var2.N1.h || (ms1Var = yv1Var.a0) == null || ms1Var.M0 == null) {
                                                    rc2Var.getViewTreeObserver().addOnPreDrawListener(new fu1(this, rc2Var, (byte) 1));
                                                } else {
                                                    aVar = ((d) yv1Var).actionBar;
                                                    if (aVar.getVisibility() == 0) {
                                                        aVar2 = ((d) yv1Var).actionBar;
                                                        int translationY = (int) aVar2.getTranslationY();
                                                        aVar3 = ((d) yv1Var).actionBar;
                                                        int measuredHeight = aVar3.getMeasuredHeight() + translationY;
                                                        ys1 ys1Var = yv1Var.D1;
                                                        int currentHeight = measuredHeight + (ys1Var != null ? ys1Var.getCurrentHeight() : 0);
                                                        js1 js1Var = yv1Var.E1;
                                                        int currentHeight2 = currentHeight + (js1Var != null ? js1Var.getCurrentHeight() : 0);
                                                        z12 = ((d) yv1Var).inPreviewMode;
                                                        i10 = (z12 ? gm.m : 0) + currentHeight2;
                                                    } else {
                                                        i10 = 0;
                                                    }
                                                    float f = i10 + yv1Var.Q9;
                                                    float height = yv1Var.fragmentView == null ? 0.0f : r8.getHeight();
                                                    j67 j67Var = yv1Var.a0.M0;
                                                    Rect rect = j67Var.y0;
                                                    if (!j67Var.u0) {
                                                        j67Var.r = true;
                                                        j67Var.u0 = true;
                                                        a67 a67Var = j67Var.X;
                                                        if (a67Var != null) {
                                                            a67Var.invalidate();
                                                        }
                                                        xz1 xz1Var = j67Var.W;
                                                        if (xz1Var != null) {
                                                            xz1Var.invalidate();
                                                        }
                                                        if (j67Var.Q != null) {
                                                            j67Var.v0 = rc2Var;
                                                            rc2Var.setVisibility(4);
                                                            j67Var.w0 = f;
                                                            j67Var.x0 = height;
                                                            rc2 rc2Var2 = j67Var.Q;
                                                            rc2 rc2Var3 = j67Var.v0;
                                                            rc2Var2.f6 = rc2Var3.f6;
                                                            rc2Var2.o6 = rc2Var3.o6;
                                                            rc2Var2.h6 = rc2Var3.h6;
                                                            rc2Var2.j6 = rc2Var3.j6;
                                                            rc2Var2.l6 = rc2Var3.l6;
                                                            rc2Var2.n6 = rc2Var3.n6;
                                                            rc2Var2.z3(rc2Var.getMessageObject(), null, rc2Var.K2(), rc2Var.L2(), rc2Var.C2(), false);
                                                            yc2 transitionParams = j67Var.Q.getTransitionParams();
                                                            transitionParams.h = j67Var.Q.getTransitionParams().a();
                                                            Rect rect2 = transitionParams.E0;
                                                            transitionParams.L1 = 0.0f;
                                                            if (j67Var.Q.getTransitionParams().E0.left == j67Var.Q.getBackgroundDrawableLeft() && rect2.top == j67Var.Q.getBackgroundDrawableTop() && rect2.bottom == j67Var.Q.getBackgroundDrawableBottom()) {
                                                                b = 1;
                                                            } else {
                                                                rect.bottom = -(j67Var.Q.getBackgroundDrawableBottom() - rect2.bottom);
                                                                rect.top = -(j67Var.Q.getBackgroundDrawableTop() - rect2.top);
                                                                if (rc2Var.getMessageObject().O3()) {
                                                                    rect.left = -(j67Var.Q.getBackgroundDrawableLeft() - rect2.left);
                                                                    rect.right = 0;
                                                                } else {
                                                                    rect.left = 0;
                                                                    rect.right = j67Var.Q.getBackgroundDrawableRight() - rect2.right;
                                                                }
                                                                b = 1;
                                                                transitionParams.x0 = true;
                                                            }
                                                            int i28 = j67Var.Q.Cc;
                                                        } else {
                                                            b = 1;
                                                        }
                                                        j67Var.c(new u57(j67Var, b), false);
                                                        j67Var.F.invalidate();
                                                        nm7.f(j67Var.c).n(j67Var, nm7.w3);
                                                    }
                                                    yv1Var.a0.M0 = null;
                                                }
                                            }
                                            arrayList3.remove(indexOf);
                                            ms1 ms1Var2 = yv1Var.a0;
                                            Runnable runnable = ms1Var2.g0;
                                            if (runnable != null) {
                                                gm.r(runnable);
                                                z13 = true;
                                                ms1Var2.h0 = true;
                                                ms1Var2.g0.run();
                                                ms1Var2.g0 = null;
                                            } else {
                                                z13 = true;
                                            }
                                            yv1Var.a0.N0(z13);
                                        }
                                        if (!hashMap.isEmpty() && hashMap.containsKey(k47Var2.F0())) {
                                            hashMap.remove(k47Var2.F0());
                                            xr1Var = yv1Var.B0;
                                            if (xr1Var != null) {
                                                ua2 ua2Var = yv1Var.h1;
                                                xr1Var.O = u69Var;
                                                xr1Var.P = ua2Var;
                                                r15 = 0;
                                                xr1Var.N = false;
                                                if (rc2Var.Ab) {
                                                    rc2Var.Ab = r15;
                                                    rc2Var.setVisibility(r15);
                                                }
                                                yv1Var.Vb(rc2Var);
                                            }
                                        }
                                        r15 = 0;
                                        if (rc2Var.Ab) {
                                        }
                                        yv1Var.Vb(rc2Var);
                                    }
                                    if (yv1Var.g4 == 7 && yv1Var.J3 != null && (str2 = yv1Var.I3) != null) {
                                        rc2Var.v3(str2);
                                    }
                                    if (yv1Var.d8 != Integer.MAX_VALUE) {
                                    }
                                    indexOf = arrayList3.indexOf(k47Var2);
                                    if (indexOf != -1) {
                                    }
                                    if (!hashMap.isEmpty()) {
                                        hashMap.remove(k47Var2.F0());
                                        xr1Var = yv1Var.B0;
                                        if (xr1Var != null) {
                                        }
                                    }
                                    r15 = 0;
                                    if (rc2Var.Ab) {
                                    }
                                    yv1Var.Vb(rc2Var);
                                }
                                z10 = z5;
                                z9 = z7;
                            }
                            z11 = true;
                            rc2Var.setShowTopic(z11);
                            rc2Var.z3(k47Var2, f47Var2, z9, z10, z8, z19);
                            rc2Var.setSpoilersSuppressed(yv1Var.A0.getScrollState() != 0);
                            rc2Var.setHighlighted(yv1Var.d8 == Integer.MAX_VALUE && k47Var2.e1() == yv1Var.d8);
                            if (rc2Var.x6) {
                            }
                            if (yv1Var.g4 == 7) {
                                rc2Var.v3(str2);
                            }
                            if (yv1Var.d8 != Integer.MAX_VALUE) {
                            }
                            indexOf = arrayList3.indexOf(k47Var2);
                            if (indexOf != -1) {
                            }
                            if (!hashMap.isEmpty()) {
                            }
                            r15 = 0;
                            if (rc2Var.Ab) {
                            }
                            yv1Var.Vb(rc2Var);
                        }
                    }
                    f47Var = v7;
                    if (sd2.T(yv1Var.e)) {
                        if (!z6) {
                        }
                        if (!z4) {
                        }
                    }
                    if (!z6) {
                        z7 = false;
                    }
                    boolean z202 = false;
                    k47Var2.f6(false);
                    f47 f47Var22 = f47Var;
                    if (f47Var != null) {
                    }
                    if (yv1Var.nb) {
                    }
                    z11 = true;
                    rc2Var.setShowTopic(z11);
                    rc2Var.z3(k47Var2, f47Var22, z9, z10, z8, z19);
                    rc2Var.setSpoilersSuppressed(yv1Var.A0.getScrollState() != 0);
                    rc2Var.setHighlighted(yv1Var.d8 == Integer.MAX_VALUE && k47Var2.e1() == yv1Var.d8);
                    if (rc2Var.x6) {
                    }
                    if (yv1Var.g4 == 7) {
                    }
                    if (yv1Var.d8 != Integer.MAX_VALUE) {
                    }
                    indexOf = arrayList3.indexOf(k47Var2);
                    if (indexOf != -1) {
                    }
                    if (!hashMap.isEmpty()) {
                    }
                    r15 = 0;
                    if (rc2Var.Ab) {
                    }
                    yv1Var.Vb(rc2Var);
                }
                z3 = false;
                rc2Var.q6 = z3;
                i5 = yv1Var.g4;
                if (i5 != 1) {
                }
                arrayList = arrayList4;
                j = 0;
                rc2Var.t6 = j;
                if (i5 == 7) {
                }
                rc2Var.u6 = m9c.B(yv1Var.f);
                rc2Var.v6 = yv1Var.g4 == 2;
                rc2Var.W6 = yv1Var.S7();
                rc2Var.X6 = yv1Var.f8();
                rc2Var.Y6 = yv1Var.e8();
                rc2Var.Z6 = yv1Var.n7();
                rc2Var.a7 = yv1Var.o7();
                if (k47Var2.q4()) {
                }
                int i212 = i + 2;
                if (v7 != null) {
                }
                int d32 = d(i6);
                d = d(i7);
                d(i212);
                if (k47Var2.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) {
                }
                arrayList2 = arrayList;
                i8 = i7;
                i9 = i8 - this.K;
                if (i9 >= 0) {
                }
                z8 = true;
                int i262 = this.K;
                if (i == i262) {
                }
                if (d == u69Var.f) {
                }
                f47Var = v7;
                if (sd2.T(yv1Var.e)) {
                }
                if (!z6) {
                }
                boolean z2022 = false;
                k47Var2.f6(false);
                f47 f47Var222 = f47Var;
                if (f47Var != null) {
                }
                if (yv1Var.nb) {
                }
                z11 = true;
                rc2Var.setShowTopic(z11);
                rc2Var.z3(k47Var2, f47Var222, z9, z10, z8, z19);
                rc2Var.setSpoilersSuppressed(yv1Var.A0.getScrollState() != 0);
                rc2Var.setHighlighted(yv1Var.d8 == Integer.MAX_VALUE && k47Var2.e1() == yv1Var.d8);
                if (rc2Var.x6) {
                }
                if (yv1Var.g4 == 7) {
                }
                if (yv1Var.d8 != Integer.MAX_VALUE) {
                }
                indexOf = arrayList3.indexOf(k47Var2);
                if (indexOf != -1) {
                }
                if (!hashMap.isEmpty()) {
                }
                r15 = 0;
                if (rc2Var.Ab) {
                }
                yv1Var.Vb(rc2Var);
            }
        }
        z2 = false;
        rc2Var.p6 = z2;
        if (yv1Var.g4 == 0) {
        }
        z3 = false;
        rc2Var.q6 = z3;
        i5 = yv1Var.g4;
        if (i5 != 1) {
        }
        arrayList = arrayList4;
        j = 0;
        rc2Var.t6 = j;
        if (i5 == 7) {
        }
        rc2Var.u6 = m9c.B(yv1Var.f);
        rc2Var.v6 = yv1Var.g4 == 2;
        rc2Var.W6 = yv1Var.S7();
        rc2Var.X6 = yv1Var.f8();
        rc2Var.Y6 = yv1Var.e8();
        rc2Var.Z6 = yv1Var.n7();
        rc2Var.a7 = yv1Var.o7();
        if (k47Var2.q4()) {
        }
        int i2122 = i + 2;
        if (v7 != null) {
        }
        int d322 = d(i6);
        d = d(i7);
        d(i2122);
        if (k47Var2.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) {
        }
        arrayList2 = arrayList;
        i8 = i7;
        i9 = i8 - this.K;
        if (i9 >= 0) {
        }
        z8 = true;
        int i2622 = this.K;
        if (i == i2622) {
        }
        if (d == u69Var.f) {
        }
        f47Var = v7;
        if (sd2.T(yv1Var.e)) {
        }
        if (!z6) {
        }
        boolean z20222 = false;
        k47Var2.f6(false);
        f47 f47Var2222 = f47Var;
        if (f47Var != null) {
        }
        if (yv1Var.nb) {
        }
        z11 = true;
        rc2Var.setShowTopic(z11);
        rc2Var.z3(k47Var2, f47Var2222, z9, z10, z8, z19);
        rc2Var.setSpoilersSuppressed(yv1Var.A0.getScrollState() != 0);
        rc2Var.setHighlighted(yv1Var.d8 == Integer.MAX_VALUE && k47Var2.e1() == yv1Var.d8);
        if (rc2Var.x6) {
        }
        if (yv1Var.g4 == 7) {
        }
        if (yv1Var.d8 != Integer.MAX_VALUE) {
        }
        indexOf = arrayList3.indexOf(k47Var2);
        if (indexOf != -1) {
        }
        if (!hashMap.isEmpty()) {
        }
        r15 = 0;
        if (rc2Var.Ab) {
        }
        yv1Var.Vb(rc2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v17, types: [du1, er0] */
    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        int i2;
        int i3;
        eu1 eu1Var;
        int i4;
        View view2;
        int i5;
        yv1 yv1Var = this.R;
        if (i == 0) {
            i5 = ((d) yv1Var).currentAccount;
            rc2 rc2Var = new rc2(this.h, i5, true, yv1Var.Za, yv1Var.Ba);
            rc2Var.setResourcesProvider(yv1Var.Ba);
            iv1 iv1Var = yv1Var.hd;
            if (iv1Var == null) {
                iv1Var = new iv1(yv1Var);
                yv1Var.hd = iv1Var;
            }
            rc2Var.setDelegate(iv1Var);
            rc2Var.jc = yv1Var.Dc;
            view = rc2Var;
            if (yv1Var.h == null) {
                rc2Var.setAllowAssistant(true);
                view = rc2Var;
            }
        } else {
            Context context = this.h;
            if (i == 1) {
                zt1 zt1Var = new zt1(yv1Var.Ba, context, true);
                zt1Var.setInvalidateColors(true);
                zt1Var.setDelegate(new cu1(this));
                view = zt1Var;
            } else {
                if (i == 2) {
                    vf2 vf2Var = new vf2(context, yv1Var.Ba);
                    view2 = vf2Var;
                    if (!yv1Var.U7()) {
                        anb.X(vf2Var.getTextView(), cmb.vf, yv1Var.Ba);
                        anb.x(vf2Var.getBackgroundLayout(), vf2Var.getBackgroundLayout().getBackground(), cmb.wf, yv1Var.Ba, PorterDuff.Mode.MULTIPLY);
                        view2 = vf2Var;
                    }
                } else {
                    if (i == 3) {
                        i4 = ((d) yv1Var).currentAccount;
                        ?? du1Var = new du1(this, context, i4, yv1Var.Ba);
                        du1Var.setDelegate(new cd1((Object) this, (byte) 12));
                        eu1Var = du1Var;
                    } else if (i == 4) {
                        view2 = new xb2(context, yv1Var.Ba);
                    } else if (i == 6) {
                        i3 = ((d) yv1Var).currentAccount;
                        view2 = new h9c(i3, yv1Var.Ba, context);
                    } else if (i == 7) {
                        view2 = new cm1(yv1Var.Ba, context, false);
                    } else if (i == 8) {
                        i2 = ((d) yv1Var).currentAccount;
                        eu1Var = new eu1(this, context, i2, yv1Var.Ba);
                    } else if (i == 10) {
                        zc2 zc2Var = new zc2(context, yv1Var.Ba);
                        iv1 iv1Var2 = yv1Var.hd;
                        if (iv1Var2 == null) {
                            iv1Var2 = new iv1(yv1Var);
                            yv1Var.hd = iv1Var2;
                        }
                        zc2Var.setDelegate(iv1Var2);
                        view2 = zc2Var;
                    } else {
                        view = null;
                    }
                    view = eu1Var;
                }
                view = view2;
            }
        }
        return kt6.h(view, view, -1, -2);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x023f  */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(u69 u69Var) {
        TLRPC.Message message;
        boolean z;
        boolean z2;
        a aVar;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        String str;
        String V1;
        zb7 zb7Var;
        yv1 yv1Var = this.R;
        View view = u69Var.a;
        if ((view instanceof rc2) || (view instanceof cm1)) {
            yv1Var.Q7();
        }
        boolean z8 = view instanceof rc2;
        boolean z9 = true;
        if (z8) {
            rc2 rc2Var = (rc2) view;
            k47 messageObject = rc2Var.getMessageObject();
            rc2Var.W6 = yv1Var.S7();
            rc2Var.X6 = yv1Var.f8();
            rc2Var.Y6 = yv1Var.e8();
            rc2Var.Z6 = yv1Var.n7();
            rc2Var.a7 = yv1Var.o7();
            rc2Var.J3(-1, true, false);
            k47 k47Var = yv1Var.V3;
            if (k47Var != null && k47Var.T(messageObject)) {
                rc2Var.J3(yv1Var.W3 ? 1 : 0, false, false);
            }
            if (messageObject.G2() && (V1 = messageObject.V1()) != null && (zb7Var = (zb7) yv1Var.getMessagesController().B3.get(V1.replace("️", ""))) != null) {
                MediaController mediaController = yv1Var.getMediaController();
                j5 accountInstance = yv1Var.getAccountInstance();
                mediaController.getClass();
                Utilities.d.c(new rh((Object) mediaController, (Object) zb7Var, (Object) accountInstance, z9, (byte) 23));
            }
            if (messageObject.f6(false)) {
                rc2Var.z3(messageObject, rc2Var.getCurrentMessagesGroup(), rc2Var.K2(), rc2Var.L2(), rc2Var.C2(), rc2Var.G2());
            } else {
                f47 currentMessagesGroup = rc2Var.getCurrentMessagesGroup();
                if (currentMessagesGroup != null) {
                    ArrayList arrayList = currentMessagesGroup.d;
                    for (int i = 0; i < arrayList.size(); i++) {
                        ((k47) arrayList.get(i)).f6(false);
                    }
                }
            }
            aVar = ((d) yv1Var).actionBar;
            if (aVar.y() || yv1Var.c8()) {
                yv1Var.f8 = false;
                yv1Var.g8 = 0L;
                yv1Var.h8 = null;
                ArrayList arrayList2 = yv1Var.p4;
                rc2Var.m3(arrayList2 == null || !arrayList2.contains(messageObject), false);
                int i2 = k47.B0(messageObject.k) == yv1Var.l6 ? 0 : 1;
                if (yv1Var.o6[i2].indexOfKey(messageObject.e1()) >= 0) {
                    yv1Var.Fb(messageObject, rc2Var, i2, false);
                    z3 = true;
                } else {
                    rc2Var.setDrawSelectionBackground(false);
                    rc2Var.o3(false, false, false);
                    z3 = false;
                }
                z4 = true;
                z5 = z3;
            } else {
                rc2Var.setDrawSelectionBackground(false);
                rc2Var.o3(false, false, false);
                rc2Var.m3(false, false);
                z5 = false;
                z4 = false;
            }
            rc2Var.n3(!z4, z4 && z5);
            if (yv1Var.g4 != 7 || yv1Var.J3 == null || (str = yv1Var.I3) == null) {
                ps1 ps1Var = yv1Var.g3;
                if (ps1Var != null && ps1Var.getVisibility() == 0) {
                    if (yv1Var.getMediaDataController().c1[k47.B0(messageObject.k) == yv1Var.d7 ? (char) 1 : (char) 0].indexOfKey(messageObject.e1()) >= 0 && yv1Var.getMediaDataController().e1 != null) {
                        rc2Var.v3(yv1Var.getMediaDataController().e1);
                    }
                }
                rc2Var.v3(null);
            } else {
                rc2Var.v3(str);
            }
            z6 = ((d) yv1Var).inPreviewMode;
            if (!z6 || !rc2Var.x6) {
                if (yv1Var.d8 != Integer.MAX_VALUE) {
                    if (rc2Var.getMessageObject() == null || rc2Var.getMessageObject().e1() != yv1Var.d8) {
                        if (rc2Var.getCurrentMessagesGroup() != null) {
                            f47 currentMessagesGroup2 = rc2Var.getCurrentMessagesGroup();
                            int i3 = yv1Var.d8;
                            ArrayList arrayList3 = currentMessagesGroup2.d;
                            for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                                k47 k47Var2 = (k47) arrayList3.get(i4);
                                if (k47Var2 == null || k47Var2.e1() != i3) {
                                }
                            }
                        }
                    }
                    z7 = true;
                    rc2Var.setHighlighted(z7);
                    if (rc2Var.x6) {
                        if (yv1Var.h8 != null) {
                            long currentTimeMillis = System.currentTimeMillis();
                            if (!rc2Var.w3(true, yv1Var.k8, yv1Var.h8, yv1Var.f8 || currentTimeMillis - yv1Var.g8 < 200) && yv1Var.e8) {
                                c41.b0(yv1Var).Q(R.raw.error, 36, jb6.M0(2131746168, null)).k(true);
                            }
                            yv1Var.e8 = false;
                            if (yv1Var.f8) {
                                yv1Var.g8 = currentTimeMillis;
                            }
                            yv1Var.f8 = false;
                        } else {
                            Integer num = yv1Var.i8;
                            if (num != null) {
                                rc2Var.u3(num.intValue());
                            } else {
                                byte[] bArr = yv1Var.j8;
                                if (bArr != null) {
                                    rc2Var.s3(bArr);
                                }
                            }
                        }
                    }
                    if (yv1Var.d8 != Integer.MAX_VALUE) {
                        yv1Var.Ec();
                    }
                }
                z7 = false;
                rc2Var.setHighlighted(z7);
                if (rc2Var.x6) {
                }
                if (yv1Var.d8 != Integer.MAX_VALUE) {
                }
            }
        } else if (view instanceof cm1) {
            cm1 cm1Var = (cm1) view;
            cm1Var.f0 = yv1Var.S7();
            cm1Var.j0 = yv1Var.f8();
            yv1Var.e8();
            yv1Var.n7();
            cm1Var.k0 = yv1Var.o7();
        } else if (view instanceof vf2) {
            ((vf2) view).getTextView().setTranslationX(yv1Var.o7() / 2.0f);
        }
        int b = u69Var.b();
        int i5 = this.K;
        if (b < i5 || b >= this.L) {
            return;
        }
        k47 k47Var3 = (k47) (this.M ? this.N : this.O ? this.Q : yv1Var.M6).get(b - i5);
        if (k47Var3 == null || (message = k47Var3.k) == null || !message.media_unread || !message.mentioned) {
            return;
        }
        z = ((d) yv1Var).inPreviewMode;
        if (!z && yv1Var.g4 == 0 && !k47.Q4(k47Var3.k) && !k47Var3.g4()) {
            int i6 = yv1Var.D6 - 1;
            yv1Var.D6 = i6;
            if (i6 <= 0) {
                yv1Var.D6 = 0;
                yv1Var.E6 = true;
                yv1Var.mc(false);
            } else {
                yv1Var.y1.c(2, i6, true);
            }
            yv1Var.getMessagesController().r3(sd2.T(yv1Var.e) ? yv1Var.e.id : 0L, k47Var3.e1(), yv1Var.l6);
            k47Var3.k.media_unread = false;
        }
        if (z8) {
            rc2 rc2Var2 = (rc2) view;
            z2 = ((d) yv1Var).inPreviewMode;
            if (z2) {
                rc2Var2.setHighlighted(true);
            } else {
                rc2Var2.r3();
            }
        }
    }
}
