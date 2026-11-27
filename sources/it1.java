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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.q;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class it1 extends g69 {
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
    public final /* synthetic */ zu1 R;
    public final Context h;
    public final boolean n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public it1(zu1 zu1Var, Context context) {
        this.R = zu1Var;
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
        TLRPC.User user = zu1Var.f;
        this.n = user != null && user.bot;
        C(true);
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return false;
    }

    public final void F(boolean z) {
        zu1 zu1Var = this.R;
        if (lbc.w(zu1Var.f)) {
            if (z) {
                zu1Var.id = true;
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

    public final void H(r47 r47Var) {
        zu1 zu1Var = this.R;
        int childCount = zu1Var.A0.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = zu1Var.A0.getChildAt(i);
            if (childAt instanceof wb2) {
                wb2 wb2Var = (wb2) childAt;
                if (wb2Var.getMessageObject() == r47Var) {
                    wb2Var.invalidate();
                    return;
                }
            }
        }
    }

    public final boolean I() {
        zu1 zu1Var = this.R;
        return lbc.x(zu1Var.f) && zu1Var.c() == 0 && !zu1Var.id && zu1Var.g4 == 0;
    }

    public final void J(boolean z) {
        boolean z2;
        boolean z3;
        zu1 zu1Var = this.R;
        ArrayList arrayList = zu1Var.M6;
        if (f11.a) {
            cc4.b("notify data set changed fragmentOpened=" + zu1Var.g6);
        }
        if (z && zu1Var.g6) {
            o79 itemAnimator = zu1Var.A0.getItemAnimator();
            yq1 yq1Var = zu1Var.B0;
            if (itemAnimator != yq1Var) {
                zu1Var.A0.setItemAnimator(yq1Var);
            }
        } else {
            zu1Var.A0.setItemAnimator(null);
        }
        N();
        try {
            super.f();
        } catch (Exception e) {
            cc4.g(e, true);
        }
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            r47 r47Var = (r47) arrayList.get(size);
            if (r47Var.l0) {
                size--;
            } else {
                TLRPC.Message message = r47Var.k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionTopicCreate) || (messageAction instanceof TLRPC.TL_messageActionChannelCreate)) {
                        z2 = true;
                    }
                }
            }
        }
        z2 = false;
        boolean[] zArr = zu1Var.U6;
        if ((zArr[0] && (zu1Var.d7 == 0 || zArr[1])) || z2) {
            z3 = ((e) zu1Var).fragmentBeginToShow;
            zu1Var.X4(z3);
        }
    }

    public final void K(int i, boolean z) {
        boolean z2;
        r47 messageObject;
        if (f11.a) {
            StringBuilder sb = new StringBuilder("notify item removed ");
            sb.append(i);
            uh9.s(z ? " with thanos effect" : "", sb);
        }
        zu1 zu1Var = this.R;
        z2 = ((e) zu1Var).fragmentBeginToShow;
        wq1 wq1Var = zu1Var.A0;
        if (z2) {
            o79 itemAnimator = wq1Var.getItemAnimator();
            yq1 yq1Var = zu1Var.B0;
            if (itemAnimator != yq1Var) {
                zu1Var.A0.setItemAnimator(yq1Var);
            }
        } else {
            wq1Var.setItemAnimator(null);
        }
        if (z && zu1Var.B0 != null) {
            o79 itemAnimator2 = zu1Var.A0.getItemAnimator();
            yq1 yq1Var2 = zu1Var.B0;
            if (itemAnimator2 == yq1Var2) {
                f89 L = zu1Var.A0.L(i);
                if (L == null) {
                    yq1Var2.getClass();
                } else {
                    yq1Var2.S.add(L);
                    View view = L.a;
                    if ((view instanceof wb2) && (messageObject = ((wb2) view).getMessageObject()) != null) {
                        messageObject.a0 = true;
                    }
                }
            }
        }
        N();
        try {
            super.s(i);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void L(int i) {
        int i2;
        zu1 zu1Var = this.R;
        ArrayList arrayList = zu1Var.M6;
        if (zu1Var.C0 == null || this.M || this.O) {
            return;
        }
        int i3 = 0;
        if (!zu1Var.R4 && zu1Var.b8 != null) {
            int childCount = zu1Var.A0.getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    break;
                }
                View childAt = zu1Var.A0.getChildAt(i4);
                if (childAt instanceof wb2) {
                    r47 messageObject = ((wb2) childAt).getMessageObject();
                    r47 r47Var = zu1Var.b8;
                    if (messageObject == r47Var) {
                        if (arrayList.indexOf(r47Var) >= 0) {
                            i2 = arrayList.indexOf(zu1Var.b8) + this.K;
                            i3 = zu1Var.i7(childAt);
                        }
                    }
                }
                i4++;
            }
        }
        i2 = -1;
        g(i);
        if (i2 != -1) {
            zu1Var.C0.g1(i2, i3);
        }
    }

    public final wb2 M(r47 r47Var, boolean z, boolean z2) {
        zu1 zu1Var = this.R;
        if (z) {
            int childCount = zu1Var.A0.getChildCount();
            int i = 0;
            while (i < childCount) {
                View childAt = zu1Var.A0.getChildAt(i);
                if (childAt instanceof wb2) {
                    wb2 wb2Var = (wb2) childAt;
                    if (wb2Var.getMessageObject() == r47Var && TextUtils.equals(wb2Var.z5, wb2Var.Q5.k.post_author)) {
                        wb2Var.z3(r47Var, wb2Var.getCurrentMessagesGroup(), wb2Var.K2(), wb2Var.L2(), wb2Var.C2(), wb2Var.G2());
                        return wb2Var;
                    }
                }
                i++;
                r47Var = r47Var;
            }
        }
        r47 r47Var2 = r47Var;
        int indexOf = (this.M ? this.N : this.O ? this.Q : zu1Var.M6).indexOf(r47Var2);
        if (indexOf == -1) {
            return null;
        }
        if (!z2) {
            L(this.K + indexOf);
            return null;
        }
        int i2 = zu1.Cd;
        zu1.Cd = i2 + 1;
        r47Var2.m1 = i2;
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
        TLRPC.PeerSettings B1;
        TLRPC.PeerSettings B12;
        int i2;
        zu1 zu1Var = this.R;
        boolean[] zArr = zu1Var.U6;
        this.r = 0;
        ArrayList arrayList = this.M ? this.N : this.O ? this.Q : zu1Var.M6;
        if (zu1Var.g4 == 3 && zu1Var.mb) {
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
            TLRPC.User user4 = zu1Var.f;
            if (user4 != null && !lbc.v(user4) && !lbc.B(zu1Var.f)) {
                TLRPC.PeerSettings B13 = zu1Var.getMessagesController().B1(zu1Var.f.id);
                int i4 = gbc.Q;
                if (B13 != null && ((B13.phone_country != null || B13.registration_month != null) && !uc7.K2(zu1Var.f) && zu1Var.g4 == 0)) {
                    int i5 = this.r;
                    this.r = i5 + 1;
                    this.E = i5;
                    return;
                }
            }
            if (lbc.B(zu1Var.f) || ((user = zu1Var.f) != null && user.bot && !uc7.K2(user) && zu1Var.g4 == 0)) {
                int i6 = this.r;
                this.r = i6 + 1;
                this.x = i6;
                return;
            }
            return;
        }
        if (!this.O) {
            boolean[] zArr2 = zu1Var.W6;
            if (((!zArr2[0] || (zu1Var.d7 != 0 && !zArr2[1])) && !zu1Var.X6) || zu1Var.ub) {
                int i7 = this.r;
                this.r = i7 + 1;
                this.G = i7;
                int i8 = this.r;
                this.K = i8;
                int size = arrayList.size() + i8;
                this.r = size;
                this.L = size;
                user2 = zu1Var.f;
                if (user2 != null && !lbc.v(user2) && !lbc.B(zu1Var.f)) {
                    B1 = zu1Var.getMessagesController().B1(zu1Var.f.id);
                    int i9 = gbc.Q;
                    if (B1 != null && ((B1.phone_country != null || B1.registration_month != null) && !uc7.K2(zu1Var.f) && zu1Var.g4 == 0 && zArr[0])) {
                        B12 = zu1Var.getMessagesController().B1(zu1Var.f.id);
                        i2 = B12.name_change_date;
                        if (i2 != 0) {
                            int i10 = B12.photo_change_date;
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
                                i = zu1Var.g4;
                                if (i == 9) {
                                    int i14 = this.r;
                                    this.s = i14;
                                    this.r = i14 + 2;
                                    this.w = i14 + 1;
                                }
                                if (i == 5 && !b19.g(zu1Var.f4)) {
                                    int i15 = this.r;
                                    this.r = i15 + 1;
                                    this.s = i15;
                                }
                                if (!this.O ? !(zArr[0] && (zu1Var.d7 == 0 || zArr[1])) && (hl.O1() || zu1Var.v4 || zu1Var.f != null) : !this.P) {
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
                        if (B12.photo_change_date != 0) {
                            int i17 = this.r;
                            this.r = i17 + 1;
                            this.H = i17;
                        }
                        int i132 = this.r;
                        this.r = i132 + 1;
                        this.E = i132;
                        i = zu1Var.g4;
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
                if ((!lbc.B(zu1Var.f) || ((user3 = zu1Var.f) != null && user3.bot && !uc7.K2(user3) && zu1Var.g4 == 0)) && zArr[0]) {
                    int i18 = this.r;
                    this.r = i18 + 1;
                    this.x = i18;
                }
                i = zu1Var.g4;
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
        user2 = zu1Var.f;
        if (user2 != null) {
            B1 = zu1Var.getMessagesController().B1(zu1Var.f.id);
            int i92 = gbc.Q;
            if (B1 != null) {
                B12 = zu1Var.getMessagesController().B1(zu1Var.f.id);
                i2 = B12.name_change_date;
                if (i2 != 0) {
                }
                if (B12.photo_change_date != 0) {
                }
                int i1322 = this.r;
                this.r = i1322 + 1;
                this.E = i1322;
                i = zu1Var.g4;
                if (i == 9) {
                }
                if (i == 5) {
                }
                if (this.O) {
                }
            }
        }
        if (!lbc.B(zu1Var.f)) {
        }
        int i182 = this.r;
        this.r = i182 + 1;
        this.x = i182;
        i = zu1Var.g4;
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

    @Override // j79
    public final int b() {
        this.y = -5;
        zu1 zu1Var = this.R;
        zh6 zh6Var = zu1Var.v8;
        if (zu1Var.e6.get(zu1Var.s4, 0) == 0) {
            return this.r;
        }
        TLRPC.User user = zu1Var.f;
        if (user == null || !user.bot || zu1Var.g4 != 0 || ((zh6Var.m() <= 0 || (((TL_bots.BotInfo) zh6Var.f(zu1Var.f.id)).description == null && ((TL_bots.BotInfo) zh6Var.f(zu1Var.f.id)).description_photo == null && ((TL_bots.BotInfo) zh6Var.f(zu1Var.f.id)).description_document == null)) && !lbc.B(zu1Var.f) && !lbc.w(zu1Var.f))) {
            return 0;
        }
        this.y = 0;
        return 1;
    }

    @Override // j79
    public final long c(int i) {
        zu1 zu1Var = this.R;
        if (zu1Var.e6.get(zu1Var.s4, 0) != 0 && i == this.y) {
            return 1L;
        }
        ArrayList arrayList = this.M ? this.N : this.O ? this.Q : zu1Var.M6;
        if (i >= this.K && i < this.L) {
            return ((r47) arrayList.get(i - r1)).m1;
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

    @Override // j79
    public final int d(int i) {
        zu1 zu1Var = this.R;
        if (zu1Var.e6.get(zu1Var.s4, 0) != 0 && i == this.y) {
            return 3;
        }
        if (i == this.s || i == this.w) {
            return 1;
        }
        int i2 = this.K;
        if (i >= i2 && i < this.L) {
            return ((r47) (this.M ? this.N : this.O ? this.Q : zu1Var.M6).get(i - i2)).U;
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

    @Override // g69, j79
    public final void f() {
        J(false);
    }

    @Override // g69, j79
    public final void g(int i) {
        boolean z;
        if (f11.a) {
            cc4.b("notify item changed " + i);
        }
        zu1 zu1Var = this.R;
        z = ((e) zu1Var).fragmentBeginToShow;
        if (!z || zu1Var.c1) {
            zu1Var.A0.setItemAnimator(null);
        } else {
            o79 itemAnimator = zu1Var.A0.getItemAnimator();
            yq1 yq1Var = zu1Var.B0;
            if (itemAnimator != yq1Var) {
                zu1Var.A0.setItemAnimator(yq1Var);
            }
        }
        N();
        try {
            super.g(i);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // g69, j79
    public final void i(int i) {
        boolean z;
        if (f11.a) {
            cc4.b("notify item inserted " + i);
        }
        zu1 zu1Var = this.R;
        z = ((e) zu1Var).fragmentBeginToShow;
        wq1 wq1Var = zu1Var.A0;
        if (z) {
            o79 itemAnimator = wq1Var.getItemAnimator();
            yq1 yq1Var = zu1Var.B0;
            if (itemAnimator != yq1Var) {
                zu1Var.A0.setItemAnimator(yq1Var);
            }
        } else {
            wq1Var.setItemAnimator(null);
        }
        N();
        try {
            super.i(i);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // j79
    public final void j(int i, int i2) {
        boolean z;
        if (f11.a) {
            cc4.b("notify item moved" + i + ":" + i2);
        }
        zu1 zu1Var = this.R;
        z = ((e) zu1Var).fragmentBeginToShow;
        wq1 wq1Var = zu1Var.A0;
        if (z) {
            o79 itemAnimator = wq1Var.getItemAnimator();
            yq1 yq1Var = zu1Var.B0;
            if (itemAnimator != yq1Var) {
                zu1Var.A0.setItemAnimator(yq1Var);
            }
        } else {
            wq1Var.setItemAnimator(null);
        }
        N();
        try {
            super.j(i, i2);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // g69, j79
    public final void l(int i, int i2) {
        boolean z;
        if (f11.a) {
            cc4.b("notify item range changed " + i + ":" + i2);
        }
        zu1 zu1Var = this.R;
        z = ((e) zu1Var).fragmentBeginToShow;
        wq1 wq1Var = zu1Var.A0;
        if (z) {
            o79 itemAnimator = wq1Var.getItemAnimator();
            yq1 yq1Var = zu1Var.B0;
            if (itemAnimator != yq1Var) {
                zu1Var.A0.setItemAnimator(yq1Var);
            }
        } else {
            wq1Var.setItemAnimator(null);
        }
        N();
        try {
            super.l(i, i2);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // g69, j79
    public final void p(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        zu1 zu1Var = this.R;
        ArrayList arrayList = zu1Var.M6;
        if (f11.a) {
            cc4.b("notify item range inserted " + i + ":" + i2);
        }
        z = ((e) zu1Var).fragmentBeginToShow;
        wq1 wq1Var = zu1Var.A0;
        if (z) {
            o79 itemAnimator = wq1Var.getItemAnimator();
            yq1 yq1Var = zu1Var.B0;
            if (itemAnimator != yq1Var) {
                zu1Var.A0.setItemAnimator(yq1Var);
            }
        } else {
            wq1Var.setItemAnimator(null);
        }
        N();
        if (i == 1 && i2 > 0 && (i3 = i + i2) >= (i4 = this.K) && i3 < this.L) {
            r47 r47Var = (r47) arrayList.get(i3 - i4);
            r47 r47Var2 = (r47) arrayList.get((i3 - this.K) - 1);
            if ((zu1Var.e != null && r47Var.Z0() == r47Var2.Z0()) || (zu1Var.f != null && r47Var.O3() == r47Var2.O3())) {
                g(i);
            }
        }
        try {
            super.p(i, i2);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // g69, j79
    public final void q(int i, int i2) {
        boolean z;
        if (f11.a) {
            cc4.b("notify item range removed" + i + ":" + i2);
        }
        zu1 zu1Var = this.R;
        z = ((e) zu1Var).fragmentBeginToShow;
        wq1 wq1Var = zu1Var.A0;
        if (z) {
            o79 itemAnimator = wq1Var.getItemAnimator();
            yq1 yq1Var = zu1Var.B0;
            if (itemAnimator != yq1Var) {
                zu1Var.A0.setItemAnimator(yq1Var);
            }
        } else {
            wq1Var.setItemAnimator(null);
        }
        N();
        try {
            super.q(i, i2);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // g69, j79
    public final void s(int i) {
        boolean z;
        if (f11.a) {
            cc4.b("notify item removed " + i);
        }
        zu1 zu1Var = this.R;
        z = ((e) zu1Var).fragmentBeginToShow;
        wq1 wq1Var = zu1Var.A0;
        if (z) {
            o79 itemAnimator = wq1Var.getItemAnimator();
            yq1 yq1Var = zu1Var.B0;
            if (itemAnimator != yq1Var) {
                zu1Var.A0.setItemAnimator(yq1Var);
            }
        } else {
            wq1Var.setItemAnimator(null);
        }
        N();
        try {
            super.s(i);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x024a, code lost:
    
        if (r4.X4.containsKey(java.lang.Integer.valueOf(((r47) r8.get(0)).e1())) != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x05a4, code lost:
    
        if (r18 != r25) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0913, code lost:
    
        if (r4.B0 == null) goto L531;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x05d5, code lost:
    
        if (r47.B1(r5.k.peer_id) == r47.B1(r2.k.peer_id)) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x064a, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x05ef, code lost:
    
        if (r2.R1() == r5.R1()) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0648, code lost:
    
        if (r47.B1(r8) == r47.B1(r5.k.fwd_from.from_id)) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0405, code lost:
    
        if (r47.B1(r5.k.peer_id) == r47.B1(r10.k.peer_id)) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x047a, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0423, code lost:
    
        if (r10.R1() == r5.R1()) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0478, code lost:
    
        if (r47.B1(r11) == r47.B1(r5.k.fwd_from.from_id)) goto L257;
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
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
        TLRPC.UserFull userFull;
        TLObject tLObject;
        String str;
        eq0 eq0Var;
        int i2;
        int i3;
        int i4;
        r47 r47Var;
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
        m47 m47Var;
        boolean z9;
        boolean z10;
        boolean z11;
        String str2;
        int indexOf;
        ?? r15;
        yq1 yq1Var;
        n47 n47Var;
        nr1 nr1Var;
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
        View view = f89Var.a;
        zu1 zu1Var = this.R;
        zh6 zh6Var = zu1Var.v8;
        ArrayList arrayList3 = zu1Var.K4;
        HashMap hashMap = zu1Var.L4;
        if (i == this.x || i == this.y) {
            eq0 eq0Var2 = (eq0) view;
            if (lbc.B(zu1Var.f)) {
                eq0Var = eq0Var2;
                eq0Var.b(false, 0L, ob6.M0(2131745994, null), null, null, null);
            } else {
                TLRPC.User user = zu1Var.f;
                if (user == null || user.id != 489000) {
                    TL_bots.BotInfo botInfo = zh6Var.m() != 0 ? (TL_bots.BotInfo) zh6Var.f(zu1Var.f.id) : null;
                    boolean z16 = (botInfo == null || (TextUtils.isEmpty(botInfo.description) && botInfo.description_photo == null && botInfo.description_document == null)) && lbc.v(zu1Var.f) && (userFull = zu1Var.s8) != null && userFull.bot_manager_id != 0 && zu1Var.f.bot_can_edit;
                    TLRPC.User user2 = zu1Var.f;
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
                        i2 = ((e) zu1Var).currentAccount;
                        str = wf3.k(i2, zu1Var.s8.bot_manager_id);
                    } else {
                        str = null;
                    }
                    eq0Var = eq0Var2;
                    eq0Var.b(true, j4, str5, tLObject, botInfo, str);
                } else {
                    eq0Var = eq0Var2;
                    eq0Var.b(false, 0L, ob6.M0(2131743272, null), null, null, null);
                }
            }
            zu1Var.Nc(eq0Var);
            return;
        }
        if (i == this.J) {
            ((oo0) view).setDialogId(zu1Var.a());
            return;
        }
        if (i == this.E) {
            gbc gbcVar = (gbc) view;
            TLRPC.EncryptedChat encryptedChat = zu1Var.h;
            long a = encryptedChat != null ? encryptedChat.user_id : zu1Var.a();
            gbcVar.b(a, zu1Var.getMessagesController().B1(a));
            return;
        }
        if (i == this.G || i == this.F) {
            ((cb2) view).setProgressVisible(zu1Var.b7 > 1);
            return;
        }
        if (i == this.I) {
            if (zu1Var.getMessagesController().B1(zu1Var.a()) != null) {
                ((dl1) view).setCustomText(ob6.a0(null, null, 2131751759, ob6.N(zu1Var.getConnectionsManager().getCurrentTime() - r0.name_change_date)));
                return;
            }
            return;
        }
        if (i == this.H) {
            if (zu1Var.getMessagesController().B1(zu1Var.a()) != null) {
                ((dl1) view).setCustomText(ob6.a0(null, null, 2131751758, ob6.N(zu1Var.getConnectionsManager().getCurrentTime() - r0.photo_change_date)));
                return;
            }
            return;
        }
        if (i == this.s) {
            dl1 dl1Var = (dl1) view;
            zu1Var.W5();
            dl1Var.setMessageObject(zu1Var.X3);
            int i15 = zu1Var.g4;
            if (i15 == 3) {
                dl1Var.setCustomText(ob6.M0(2131745622, null));
            } else if (i15 == 5) {
                dl1Var.setCustomText(ob6.M0(2131752652, null));
            } else if (i15 == 9) {
                dl1Var.setCustomText(ob6.M0(2131742524, null));
            }
            dl1Var.setAlpha(1.0f);
            dl1Var.setSpoilersSuppressed(zu1Var.A0.getScrollState() != 0);
            return;
        }
        if (i == this.w) {
            dl1 dl1Var2 = (dl1) view;
            zu1Var.X5();
            dl1Var2.setMessageObject(zu1Var.Y3);
            dl1Var2.setCustomText(ob6.M0(2131742525, null));
            dl1Var2.setAlpha(1.0f);
            dl1Var2.setSpoilersSuppressed(zu1Var.A0.getScrollState() != 0);
            return;
        }
        int i16 = this.K;
        if (i < i16 || i >= this.L) {
            return;
        }
        ArrayList arrayList4 = this.M ? this.N : this.O ? this.Q : zu1Var.M6;
        r47 r47Var2 = (r47) arrayList4.get(i - i16);
        if (!(view instanceof wb2)) {
            ArrayList arrayList5 = arrayList4;
            if (!(view instanceof dl1)) {
                if (view instanceof bf2) {
                    bf2 bf2Var = (bf2) view;
                    bf2Var.setText(ob6.M0(2131743493, null));
                    bf2Var.getTextView().setTranslationX(zu1Var.o7() / 2.0f);
                    if (zu1Var.V7 != 0) {
                        zu1Var.V7 = 0;
                        return;
                    }
                    return;
                }
                return;
            }
            if ((r47Var2 == null || !r47Var2.l0) && (i4 = (i3 = i + 1) - this.K) >= 0 && i4 < arrayList5.size()) {
                r47 r47Var3 = (r47) arrayList5.get(i3 - this.K);
                if (r47Var3 == null || !r47Var3.l0) {
                    r47Var = r47Var3;
                } else {
                    int i17 = i + 2;
                    int i18 = i17 - this.K;
                    r47Var = (i18 < 0 || i18 >= arrayList5.size()) ? null : (r47) arrayList5.get(i17 - this.K);
                }
                z = r47Var == null || !(r47Var2 == null || r47Var.Y1() == r47Var2.Y1());
            } else {
                z = false;
            }
            dl1 dl1Var3 = (dl1) view;
            dl1Var3.f0 = zu1Var.S7();
            dl1Var3.j0 = zu1Var.f8();
            zu1Var.e8();
            zu1Var.n7();
            dl1Var3.k0 = zu1Var.o7();
            dl1Var3.g0 = xc2.c0(zu1Var.e);
            dl1Var3.h0 = xc2.p0(zu1Var.e);
            dl1Var3.i0 = lbc.w(zu1Var.f);
            boolean z17 = dl1Var3.l0 != z;
            dl1Var3.l0 = z;
            dl1Var3.i0(r47Var2, z17);
            dl1Var3.setAlpha(1.0f);
            dl1Var3.setShowTopic(true);
            dl1Var3.setSpoilersSuppressed(zu1Var.A0.getScrollState() != 0);
            return;
        }
        wb2 wb2Var = (wb2) view;
        m47 v7 = zu1Var.v7(r47Var2);
        wb2Var.f6 = zu1Var.e != null || lbc.D(zu1Var.f) || lbc.B(zu1Var.f) || zu1Var.g4 == 7;
        wb2Var.E.a(false, false);
        wb2Var.g6 = lbc.w(zu1Var.f);
        wb2Var.s6 = zu1Var.c8();
        int i19 = zu1Var.g4;
        wb2Var.h6 = i19 == 3;
        wb2Var.i6 = i19 == 3 && zu1Var.mb;
        TLRPC.User user3 = zu1Var.f;
        wb2Var.j6 = user3 != null && user3.bot;
        wb2Var.k6 = xc2.T(zu1Var.e) && zu1Var.e.megagroup;
        wb2Var.l6 = xc2.c0(zu1Var.e);
        wb2Var.m6 = xc2.p0(zu1Var.e);
        wb2Var.n6 = xc2.c0(zu1Var.e) && zu1Var.x4 && zu1Var.c() == 1;
        wb2Var.o6 = (zu1Var.s4 != 0 || (wb2Var.l6 && zu1Var.x4)) && !wb2Var.m6;
        int i20 = zu1Var.g4;
        if (i20 != 1 && i20 != 9 && xc2.T(zu1Var.e)) {
            TLRPC.Chat chat = zu1Var.e;
            if (chat.has_link && !chat.megagroup) {
                z2 = true;
                wb2Var.p6 = z2;
                if (zu1Var.g4 == 0) {
                    if (!zu1Var.X4.containsKey(Integer.valueOf(r47Var2.e1()))) {
                        if (v7 != null) {
                            ArrayList arrayList6 = v7.d;
                            if (!arrayList6.isEmpty()) {
                            }
                        }
                    }
                    z3 = true;
                    wb2Var.q6 = z3;
                    i5 = zu1Var.g4;
                    if (i5 != 1 || i5 == 9 || (chatFull = zu1Var.r8) == null) {
                        arrayList = arrayList4;
                        j = 0;
                    } else {
                        arrayList = arrayList4;
                        j = chatFull.linked_chat_id;
                    }
                    wb2Var.t6 = j;
                    if (i5 == 7 || zu1Var.d4 != 1) {
                        wb2Var.u6 = lbc.B(zu1Var.f);
                    } else {
                        wb2Var.u6 = lbc.A(r47.B0(r47Var2.k));
                    }
                    wb2Var.v6 = zu1Var.g4 == 2;
                    wb2Var.W6 = zu1Var.S7();
                    wb2Var.X6 = zu1Var.f8();
                    wb2Var.Y6 = zu1Var.e8();
                    wb2Var.Z6 = zu1Var.n7();
                    wb2Var.a7 = zu1Var.o7();
                    if (r47Var2.q4()) {
                        hl.K(wb2Var, new kc((byte) 10));
                    }
                    int i21 = i + 2;
                    if (v7 != null) {
                        ArrayList arrayList7 = v7.e;
                        j47 d2 = v7.d(r47Var2);
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
                    if ((r47Var2.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && d3 == f89Var.f) {
                        arrayList2 = arrayList;
                        r47 r47Var4 = (r47) arrayList2.get(i6 - this.K);
                        if (r47Var4.O3() != r47Var2.O3() || (Math.abs(r47Var4.k.date - r47Var2.k.date) > 300 && zu1Var.g4 != 9)) {
                            i13 = i7;
                            z5 = false;
                        } else {
                            i13 = i7;
                            z5 = true;
                        }
                        if (z5) {
                            TLRPC.Message message2 = r47Var4.k;
                            boolean z18 = z5;
                            i8 = i13;
                            if (message2 == null || message2.paid_message_stars <= 0) {
                                if (!r47Var2.y3() && !r47Var4.y3()) {
                                    if (zu1Var.e != null) {
                                        long Z0 = r47Var4.Z0();
                                        z18 = Z0 == r47Var2.Z0();
                                        if (!z4 && z18 && Z0 < 0 && zu1Var.e.megagroup && zu1Var.g4 != 9) {
                                            z18 = false;
                                        }
                                    } else {
                                        if (lbc.D(zu1Var.f) || lbc.B(zu1Var.f)) {
                                            if (!r47Var2.X3()) {
                                                if (!r47Var4.X3()) {
                                                }
                                            }
                                        } else if (zu1Var.g4 == 7) {
                                        }
                                        if (wf3.n(r47Var4.k.guestchat_via_from) != wf3.n(r47Var2.k.guestchat_via_from)) {
                                        }
                                    }
                                    z5 = z18;
                                    if (wf3.n(r47Var4.k.guestchat_via_from) != wf3.n(r47Var2.k.guestchat_via_from)) {
                                    }
                                } else if (r47Var2.y3() && r47Var4.y3() && Math.abs(r47Var4.k.fwd_from.date - r47Var2.k.fwd_from.date) <= 300) {
                                    TLRPC.MessageFwdHeader messageFwdHeader2 = r47Var4.k.fwd_from;
                                    String str6 = messageFwdHeader2.from_name;
                                    if (str6 == null || (str4 = r47Var2.k.fwd_from.from_name) == null) {
                                        TLRPC.Peer peer = messageFwdHeader2.from_id;
                                        if (peer != null) {
                                            if (r47Var2.k.fwd_from.from_id != null) {
                                            }
                                        }
                                    } else {
                                        z5 = str6.equals(str4);
                                        if (wf3.n(r47Var4.k.guestchat_via_from) != wf3.n(r47Var2.k.guestchat_via_from)) {
                                            z5 = false;
                                        }
                                    }
                                }
                            }
                            z5 = false;
                            if (wf3.n(r47Var4.k.guestchat_via_from) != wf3.n(r47Var2.k.guestchat_via_from)) {
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
                        r47 r47Var5 = (r47) arrayList2.get(i8 - this.K);
                        if (r47Var5 != null && r47Var5.l0) {
                            int i24 = i8 + 1;
                            int i25 = i24 - this.K;
                            r47Var5 = (i25 < 0 || i25 >= arrayList2.size()) ? null : (r47) arrayList2.get(i24 - this.K);
                        }
                        z8 = r47Var5 == null || r47Var5.Y1() != r47Var2.Y1();
                    }
                    int i26 = this.K;
                    boolean z19 = i == i26;
                    if (d == f89Var.f) {
                        r47 r47Var6 = (r47) arrayList2.get(i8 - i26);
                        z7 = !(r47Var6.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && r47Var6.O3() == r47Var2.O3() && (Math.abs(r47Var6.k.date - r47Var2.k.date) <= 300 || zu1Var.g4 == 9);
                        if (z7) {
                            if (r47Var2.y3() || r47Var6.y3()) {
                                m47Var = v7;
                                if (r47Var2.y3() && r47Var6.y3() && Math.abs(r47Var2.k.fwd_from.date - r47Var6.k.fwd_from.date) <= 300) {
                                    TLRPC.MessageFwdHeader messageFwdHeader3 = r47Var6.k.fwd_from;
                                    String str7 = messageFwdHeader3.from_name;
                                    if (str7 == null || (str3 = r47Var2.k.fwd_from.from_name) == null) {
                                        TLRPC.Peer peer2 = messageFwdHeader3.from_id;
                                        if (peer2 != null && r47Var2.k.fwd_from.from_id != null) {
                                        }
                                    } else {
                                        equals = str7.equals(str3);
                                        z7 = equals;
                                        if (wf3.n(r47Var6.k.guestchat_via_from) != wf3.n(r47Var2.k.guestchat_via_from)) {
                                            z7 = false;
                                        }
                                    }
                                }
                                z7 = false;
                                if (wf3.n(r47Var6.k.guestchat_via_from) != wf3.n(r47Var2.k.guestchat_via_from)) {
                                }
                            } else {
                                if (zu1Var.e != null) {
                                    long Z02 = r47Var6.Z0();
                                    equals = (Z02 != r47Var2.Z0() || r47Var2.y3() || r47Var6.y3()) ? false : true;
                                    if (!z6 && equals && Z02 < 0 && zu1Var.e.megagroup && zu1Var.g4 != 9) {
                                        equals = false;
                                    }
                                    if (equals && zu1Var.V7()) {
                                        TLRPC.TL_forumTopic tL_forumTopic = r47Var2.j1;
                                        if (tL_forumTopic == null) {
                                            i12 = ((e) zu1Var).currentAccount;
                                            z14 = false;
                                            j2 = r47.b2(i12, r47Var2.k, true, false);
                                            m47Var = v7;
                                        } else {
                                            z14 = false;
                                            m47Var = v7;
                                            j2 = tL_forumTopic.id;
                                        }
                                        TLRPC.TL_forumTopic tL_forumTopic2 = r47Var6.j1;
                                        if (tL_forumTopic2 == null) {
                                            i11 = ((e) zu1Var).currentAccount;
                                            j3 = r47.b2(i11, r47Var6.k, true, z14);
                                        } else {
                                            j3 = tL_forumTopic2.id;
                                        }
                                    } else {
                                        m47Var = v7;
                                    }
                                    z7 = equals;
                                    if (wf3.n(r47Var6.k.guestchat_via_from) != wf3.n(r47Var2.k.guestchat_via_from)) {
                                    }
                                } else {
                                    m47Var = v7;
                                    if (lbc.D(zu1Var.f) || lbc.B(zu1Var.f)) {
                                        if (!r47Var2.X3() && !r47Var6.X3()) {
                                        }
                                        z7 = false;
                                        if (wf3.n(r47Var6.k.guestchat_via_from) != wf3.n(r47Var2.k.guestchat_via_from)) {
                                        }
                                    } else {
                                        if (zu1Var.g4 == 7) {
                                        }
                                        if (wf3.n(r47Var6.k.guestchat_via_from) != wf3.n(r47Var2.k.guestchat_via_from)) {
                                        }
                                    }
                                    z7 = equals;
                                    if (wf3.n(r47Var6.k.guestchat_via_from) != wf3.n(r47Var2.k.guestchat_via_from)) {
                                    }
                                }
                                equals = false;
                                z7 = equals;
                                if (wf3.n(r47Var6.k.guestchat_via_from) != wf3.n(r47Var2.k.guestchat_via_from)) {
                                }
                            }
                            if (xc2.T(zu1Var.e) && zu1Var.e.megagroup && r47Var2.Z0() <= 0 && (messageFwdHeader = r47Var2.k.fwd_from) != null && (messageFwdHeader.saved_from_peer instanceof TLRPC.TL_peerChannel)) {
                                if (!z6) {
                                    z7 = false;
                                }
                                if (!z4) {
                                    z5 = false;
                                }
                            }
                            if (!z6 && (message = r47Var2.k) != null && message.paid_message_stars > 0) {
                                z7 = false;
                            }
                            boolean z20 = false;
                            r47Var2.f6(false);
                            m47 m47Var2 = m47Var;
                            if (m47Var != null) {
                                ArrayList arrayList8 = m47Var2.d;
                                int i27 = 0;
                                while (i27 < arrayList8.size()) {
                                    ((r47) arrayList8.get(i27)).f6(z20);
                                    i27++;
                                    z20 = false;
                                }
                            }
                            if (zu1Var.nb) {
                                z9 = z5;
                                z10 = z7;
                            } else {
                                if (m47Var2 != null) {
                                    z11 = true;
                                    z9 = false;
                                    z10 = false;
                                    wb2Var.setShowTopic(z11);
                                    wb2Var.z3(r47Var2, m47Var2, z9, z10, z8, z19);
                                    wb2Var.setSpoilersSuppressed(zu1Var.A0.getScrollState() != 0);
                                    wb2Var.setHighlighted(zu1Var.d8 == Integer.MAX_VALUE && r47Var2.e1() == zu1Var.d8);
                                    if (wb2Var.x6) {
                                        if (zu1Var.h8 != null) {
                                            long currentTimeMillis = System.currentTimeMillis();
                                            wb2Var.w3(true, zu1Var.k8, zu1Var.h8, zu1Var.f8 || currentTimeMillis - zu1Var.g8 < 200);
                                            if (zu1Var.f8) {
                                                zu1Var.g8 = currentTimeMillis;
                                            }
                                            zu1Var.f8 = false;
                                        } else {
                                            Integer num = zu1Var.i8;
                                            if (num != null) {
                                                wb2Var.u3(num.intValue());
                                            } else {
                                                byte[] bArr = zu1Var.j8;
                                                if (bArr != null) {
                                                    wb2Var.s3(bArr);
                                                }
                                            }
                                        }
                                        if (zu1Var.d8 != Integer.MAX_VALUE) {
                                            zu1Var.Ec();
                                        }
                                        indexOf = arrayList3.indexOf(r47Var2);
                                        if (indexOf != -1) {
                                            if (r47Var2.D == 5 && (qVar = zu1Var.q3) != null && qVar.getTextureView() != null) {
                                                hm1 hm1Var = zu1Var.I7;
                                                if (hm1Var != null) {
                                                    hl.r(hm1Var);
                                                    zu1Var.I7 = null;
                                                }
                                                wb2Var.getViewTreeObserver().addOnPreDrawListener(new gt1(this, wb2Var, (byte) 0));
                                            } else if ((r47Var2.M2() && !r47Var2.I2()) || ((n47Var = r47Var2.N1) != null && n47Var.h)) {
                                                if (!r47Var2.N1.h || (nr1Var = zu1Var.a0) == null || nr1Var.M0 == null) {
                                                    wb2Var.getViewTreeObserver().addOnPreDrawListener(new gt1(this, wb2Var, (byte) 1));
                                                } else {
                                                    aVar = ((e) zu1Var).actionBar;
                                                    if (aVar.getVisibility() == 0) {
                                                        aVar2 = ((e) zu1Var).actionBar;
                                                        int translationY = (int) aVar2.getTranslationY();
                                                        aVar3 = ((e) zu1Var).actionBar;
                                                        int measuredHeight = aVar3.getMeasuredHeight() + translationY;
                                                        zr1 zr1Var = zu1Var.D1;
                                                        int currentHeight = measuredHeight + (zr1Var != null ? zr1Var.getCurrentHeight() : 0);
                                                        kr1 kr1Var = zu1Var.E1;
                                                        int currentHeight2 = currentHeight + (kr1Var != null ? kr1Var.getCurrentHeight() : 0);
                                                        z12 = ((e) zu1Var).inPreviewMode;
                                                        i10 = (z12 ? hl.m : 0) + currentHeight2;
                                                    } else {
                                                        i10 = 0;
                                                    }
                                                    float f = i10 + zu1Var.Q9;
                                                    float height = zu1Var.fragmentView == null ? 0.0f : r8.getHeight();
                                                    q67 q67Var = zu1Var.a0.M0;
                                                    Rect rect = q67Var.y0;
                                                    if (!q67Var.u0) {
                                                        q67Var.r = true;
                                                        q67Var.u0 = true;
                                                        h67 h67Var = q67Var.X;
                                                        if (h67Var != null) {
                                                            h67Var.invalidate();
                                                        }
                                                        bz1 bz1Var = q67Var.W;
                                                        if (bz1Var != null) {
                                                            bz1Var.invalidate();
                                                        }
                                                        if (q67Var.Q != null) {
                                                            q67Var.v0 = wb2Var;
                                                            wb2Var.setVisibility(4);
                                                            q67Var.w0 = f;
                                                            q67Var.x0 = height;
                                                            wb2 wb2Var2 = q67Var.Q;
                                                            wb2 wb2Var3 = q67Var.v0;
                                                            wb2Var2.f6 = wb2Var3.f6;
                                                            wb2Var2.o6 = wb2Var3.o6;
                                                            wb2Var2.h6 = wb2Var3.h6;
                                                            wb2Var2.j6 = wb2Var3.j6;
                                                            wb2Var2.l6 = wb2Var3.l6;
                                                            wb2Var2.n6 = wb2Var3.n6;
                                                            wb2Var2.z3(wb2Var.getMessageObject(), null, wb2Var.K2(), wb2Var.L2(), wb2Var.C2(), false);
                                                            dc2 transitionParams = q67Var.Q.getTransitionParams();
                                                            transitionParams.h = q67Var.Q.getTransitionParams().a();
                                                            Rect rect2 = transitionParams.E0;
                                                            transitionParams.L1 = 0.0f;
                                                            if (q67Var.Q.getTransitionParams().E0.left == q67Var.Q.getBackgroundDrawableLeft() && rect2.top == q67Var.Q.getBackgroundDrawableTop() && rect2.bottom == q67Var.Q.getBackgroundDrawableBottom()) {
                                                                b = 1;
                                                            } else {
                                                                rect.bottom = -(q67Var.Q.getBackgroundDrawableBottom() - rect2.bottom);
                                                                rect.top = -(q67Var.Q.getBackgroundDrawableTop() - rect2.top);
                                                                if (wb2Var.getMessageObject().O3()) {
                                                                    rect.left = -(q67Var.Q.getBackgroundDrawableLeft() - rect2.left);
                                                                    rect.right = 0;
                                                                } else {
                                                                    rect.left = 0;
                                                                    rect.right = q67Var.Q.getBackgroundDrawableRight() - rect2.right;
                                                                }
                                                                b = 1;
                                                                transitionParams.x0 = true;
                                                            }
                                                            int i28 = q67Var.Q.Cc;
                                                        } else {
                                                            b = 1;
                                                        }
                                                        q67Var.c(new b67(q67Var, b), false);
                                                        q67Var.F.invalidate();
                                                        jn7.f(q67Var.c).n(q67Var, jn7.w3);
                                                    }
                                                    zu1Var.a0.M0 = null;
                                                }
                                            }
                                            arrayList3.remove(indexOf);
                                            nr1 nr1Var2 = zu1Var.a0;
                                            Runnable runnable = nr1Var2.g0;
                                            if (runnable != null) {
                                                hl.r(runnable);
                                                z13 = true;
                                                nr1Var2.h0 = true;
                                                nr1Var2.g0.run();
                                                nr1Var2.g0 = null;
                                            } else {
                                                z13 = true;
                                            }
                                            zu1Var.a0.R0(z13);
                                        }
                                        if (!hashMap.isEmpty() && hashMap.containsKey(r47Var2.F0())) {
                                            hashMap.remove(r47Var2.F0());
                                            yq1Var = zu1Var.B0;
                                            if (yq1Var != null) {
                                                y92 y92Var = zu1Var.h1;
                                                yq1Var.O = f89Var;
                                                yq1Var.P = y92Var;
                                                r15 = 0;
                                                yq1Var.N = false;
                                                if (wb2Var.Ab) {
                                                    wb2Var.Ab = r15;
                                                    wb2Var.setVisibility(r15);
                                                }
                                                zu1Var.Vb(wb2Var);
                                            }
                                        }
                                        r15 = 0;
                                        if (wb2Var.Ab) {
                                        }
                                        zu1Var.Vb(wb2Var);
                                    }
                                    if (zu1Var.g4 == 7 && zu1Var.J3 != null && (str2 = zu1Var.I3) != null) {
                                        wb2Var.v3(str2);
                                    }
                                    if (zu1Var.d8 != Integer.MAX_VALUE) {
                                    }
                                    indexOf = arrayList3.indexOf(r47Var2);
                                    if (indexOf != -1) {
                                    }
                                    if (!hashMap.isEmpty()) {
                                        hashMap.remove(r47Var2.F0());
                                        yq1Var = zu1Var.B0;
                                        if (yq1Var != null) {
                                        }
                                    }
                                    r15 = 0;
                                    if (wb2Var.Ab) {
                                    }
                                    zu1Var.Vb(wb2Var);
                                }
                                z10 = z5;
                                z9 = z7;
                            }
                            z11 = true;
                            wb2Var.setShowTopic(z11);
                            wb2Var.z3(r47Var2, m47Var2, z9, z10, z8, z19);
                            wb2Var.setSpoilersSuppressed(zu1Var.A0.getScrollState() != 0);
                            wb2Var.setHighlighted(zu1Var.d8 == Integer.MAX_VALUE && r47Var2.e1() == zu1Var.d8);
                            if (wb2Var.x6) {
                            }
                            if (zu1Var.g4 == 7) {
                                wb2Var.v3(str2);
                            }
                            if (zu1Var.d8 != Integer.MAX_VALUE) {
                            }
                            indexOf = arrayList3.indexOf(r47Var2);
                            if (indexOf != -1) {
                            }
                            if (!hashMap.isEmpty()) {
                            }
                            r15 = 0;
                            if (wb2Var.Ab) {
                            }
                            zu1Var.Vb(wb2Var);
                        }
                    }
                    m47Var = v7;
                    if (xc2.T(zu1Var.e)) {
                        if (!z6) {
                        }
                        if (!z4) {
                        }
                    }
                    if (!z6) {
                        z7 = false;
                    }
                    boolean z202 = false;
                    r47Var2.f6(false);
                    m47 m47Var22 = m47Var;
                    if (m47Var != null) {
                    }
                    if (zu1Var.nb) {
                    }
                    z11 = true;
                    wb2Var.setShowTopic(z11);
                    wb2Var.z3(r47Var2, m47Var22, z9, z10, z8, z19);
                    wb2Var.setSpoilersSuppressed(zu1Var.A0.getScrollState() != 0);
                    wb2Var.setHighlighted(zu1Var.d8 == Integer.MAX_VALUE && r47Var2.e1() == zu1Var.d8);
                    if (wb2Var.x6) {
                    }
                    if (zu1Var.g4 == 7) {
                    }
                    if (zu1Var.d8 != Integer.MAX_VALUE) {
                    }
                    indexOf = arrayList3.indexOf(r47Var2);
                    if (indexOf != -1) {
                    }
                    if (!hashMap.isEmpty()) {
                    }
                    r15 = 0;
                    if (wb2Var.Ab) {
                    }
                    zu1Var.Vb(wb2Var);
                }
                z3 = false;
                wb2Var.q6 = z3;
                i5 = zu1Var.g4;
                if (i5 != 1) {
                }
                arrayList = arrayList4;
                j = 0;
                wb2Var.t6 = j;
                if (i5 == 7) {
                }
                wb2Var.u6 = lbc.B(zu1Var.f);
                wb2Var.v6 = zu1Var.g4 == 2;
                wb2Var.W6 = zu1Var.S7();
                wb2Var.X6 = zu1Var.f8();
                wb2Var.Y6 = zu1Var.e8();
                wb2Var.Z6 = zu1Var.n7();
                wb2Var.a7 = zu1Var.o7();
                if (r47Var2.q4()) {
                }
                int i212 = i + 2;
                if (v7 != null) {
                }
                int d32 = d(i6);
                d = d(i7);
                d(i212);
                if (r47Var2.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) {
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
                if (d == f89Var.f) {
                }
                m47Var = v7;
                if (xc2.T(zu1Var.e)) {
                }
                if (!z6) {
                }
                boolean z2022 = false;
                r47Var2.f6(false);
                m47 m47Var222 = m47Var;
                if (m47Var != null) {
                }
                if (zu1Var.nb) {
                }
                z11 = true;
                wb2Var.setShowTopic(z11);
                wb2Var.z3(r47Var2, m47Var222, z9, z10, z8, z19);
                wb2Var.setSpoilersSuppressed(zu1Var.A0.getScrollState() != 0);
                wb2Var.setHighlighted(zu1Var.d8 == Integer.MAX_VALUE && r47Var2.e1() == zu1Var.d8);
                if (wb2Var.x6) {
                }
                if (zu1Var.g4 == 7) {
                }
                if (zu1Var.d8 != Integer.MAX_VALUE) {
                }
                indexOf = arrayList3.indexOf(r47Var2);
                if (indexOf != -1) {
                }
                if (!hashMap.isEmpty()) {
                }
                r15 = 0;
                if (wb2Var.Ab) {
                }
                zu1Var.Vb(wb2Var);
            }
        }
        z2 = false;
        wb2Var.p6 = z2;
        if (zu1Var.g4 == 0) {
        }
        z3 = false;
        wb2Var.q6 = z3;
        i5 = zu1Var.g4;
        if (i5 != 1) {
        }
        arrayList = arrayList4;
        j = 0;
        wb2Var.t6 = j;
        if (i5 == 7) {
        }
        wb2Var.u6 = lbc.B(zu1Var.f);
        wb2Var.v6 = zu1Var.g4 == 2;
        wb2Var.W6 = zu1Var.S7();
        wb2Var.X6 = zu1Var.f8();
        wb2Var.Y6 = zu1Var.e8();
        wb2Var.Z6 = zu1Var.n7();
        wb2Var.a7 = zu1Var.o7();
        if (r47Var2.q4()) {
        }
        int i2122 = i + 2;
        if (v7 != null) {
        }
        int d322 = d(i6);
        d = d(i7);
        d(i2122);
        if (r47Var2.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) {
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
        if (d == f89Var.f) {
        }
        m47Var = v7;
        if (xc2.T(zu1Var.e)) {
        }
        if (!z6) {
        }
        boolean z20222 = false;
        r47Var2.f6(false);
        m47 m47Var2222 = m47Var;
        if (m47Var != null) {
        }
        if (zu1Var.nb) {
        }
        z11 = true;
        wb2Var.setShowTopic(z11);
        wb2Var.z3(r47Var2, m47Var2222, z9, z10, z8, z19);
        wb2Var.setSpoilersSuppressed(zu1Var.A0.getScrollState() != 0);
        wb2Var.setHighlighted(zu1Var.d8 == Integer.MAX_VALUE && r47Var2.e1() == zu1Var.d8);
        if (wb2Var.x6) {
        }
        if (zu1Var.g4 == 7) {
        }
        if (zu1Var.d8 != Integer.MAX_VALUE) {
        }
        indexOf = arrayList3.indexOf(r47Var2);
        if (indexOf != -1) {
        }
        if (!hashMap.isEmpty()) {
        }
        r15 = 0;
        if (wb2Var.Ab) {
        }
        zu1Var.Vb(wb2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v17, types: [eq0, et1] */
    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        int i2;
        int i3;
        ft1 ft1Var;
        int i4;
        View view2;
        int i5;
        zu1 zu1Var = this.R;
        if (i == 0) {
            i5 = ((e) zu1Var).currentAccount;
            wb2 wb2Var = new wb2(this.h, i5, true, zu1Var.Za, zu1Var.Ba);
            wb2Var.setResourcesProvider(zu1Var.Ba);
            ju1 ju1Var = zu1Var.kd;
            if (ju1Var == null) {
                ju1Var = new ju1(zu1Var);
                zu1Var.kd = ju1Var;
            }
            wb2Var.setDelegate(ju1Var);
            wb2Var.jc = zu1Var.Ec;
            view = wb2Var;
            if (zu1Var.h == null) {
                wb2Var.setAllowAssistant(true);
                view = wb2Var;
            }
        } else {
            Context context = this.h;
            if (i == 1) {
                at1 at1Var = new at1(zu1Var.Ba, context, true);
                at1Var.setInvalidateColors(true);
                at1Var.setDelegate(new dt1(this));
                view = at1Var;
            } else {
                if (i == 2) {
                    bf2 bf2Var = new bf2(context, zu1Var.Ba);
                    view2 = bf2Var;
                    if (!zu1Var.U7()) {
                        yob.X(bf2Var.getTextView(), aob.wf, zu1Var.Ba);
                        yob.x(bf2Var.getBackgroundLayout(), bf2Var.getBackgroundLayout().getBackground(), aob.xf, zu1Var.Ba, PorterDuff.Mode.MULTIPLY);
                        view2 = bf2Var;
                    }
                } else {
                    if (i == 3) {
                        i4 = ((e) zu1Var).currentAccount;
                        ?? et1Var = new et1(this, context, i4, zu1Var.Ba);
                        et1Var.setDelegate(new rd1((Object) this, (byte) 11));
                        ft1Var = et1Var;
                    } else if (i == 4) {
                        view2 = new cb2(context, zu1Var.Ba);
                    } else if (i == 6) {
                        i3 = ((e) zu1Var).currentAccount;
                        view2 = new gbc(i3, zu1Var.Ba, context);
                    } else if (i == 7) {
                        view2 = new dl1(zu1Var.Ba, context, false);
                    } else if (i == 8) {
                        i2 = ((e) zu1Var).currentAccount;
                        ft1Var = new ft1(this, context, i2, zu1Var.Ba);
                    } else if (i == 10) {
                        ec2 ec2Var = new ec2(context, zu1Var.Ba);
                        ju1 ju1Var2 = zu1Var.kd;
                        if (ju1Var2 == null) {
                            ju1Var2 = new ju1(zu1Var);
                            zu1Var.kd = ju1Var2;
                        }
                        ec2Var.setDelegate(ju1Var2);
                        view2 = ec2Var;
                    } else {
                        view = null;
                    }
                    view = ft1Var;
                }
                view = view2;
            }
        }
        return qu6.h(view, view, -1, -2);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x023f  */
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(f89 f89Var) {
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
        fc7 fc7Var;
        zu1 zu1Var = this.R;
        View view = f89Var.a;
        if ((view instanceof wb2) || (view instanceof dl1)) {
            zu1Var.Q7();
        }
        boolean z8 = view instanceof wb2;
        boolean z9 = true;
        if (z8) {
            wb2 wb2Var = (wb2) view;
            r47 messageObject = wb2Var.getMessageObject();
            wb2Var.W6 = zu1Var.S7();
            wb2Var.X6 = zu1Var.f8();
            wb2Var.Y6 = zu1Var.e8();
            wb2Var.Z6 = zu1Var.n7();
            wb2Var.a7 = zu1Var.o7();
            wb2Var.J3(-1, true, false);
            r47 r47Var = zu1Var.V3;
            if (r47Var != null && r47Var.T(messageObject)) {
                wb2Var.J3(zu1Var.W3 ? 1 : 0, false, false);
            }
            if (messageObject.G2() && (V1 = messageObject.V1()) != null && (fc7Var = (fc7) zu1Var.getMessagesController().C3.get(V1.replace("️", ""))) != null) {
                MediaController mediaController = zu1Var.getMediaController();
                k5 accountInstance = zu1Var.getAccountInstance();
                mediaController.getClass();
                Utilities.d.c(new lg((Object) mediaController, (Object) fc7Var, (Object) accountInstance, z9, (byte) 23));
            }
            if (messageObject.f6(false)) {
                wb2Var.z3(messageObject, wb2Var.getCurrentMessagesGroup(), wb2Var.K2(), wb2Var.L2(), wb2Var.C2(), wb2Var.G2());
            } else {
                m47 currentMessagesGroup = wb2Var.getCurrentMessagesGroup();
                if (currentMessagesGroup != null) {
                    ArrayList arrayList = currentMessagesGroup.d;
                    for (int i = 0; i < arrayList.size(); i++) {
                        ((r47) arrayList.get(i)).f6(false);
                    }
                }
            }
            aVar = ((e) zu1Var).actionBar;
            if (aVar.z() || zu1Var.c8()) {
                zu1Var.f8 = false;
                zu1Var.g8 = 0L;
                zu1Var.h8 = null;
                ArrayList arrayList2 = zu1Var.p4;
                wb2Var.m3(arrayList2 == null || !arrayList2.contains(messageObject), false);
                int i2 = r47.B0(messageObject.k) == zu1Var.l6 ? 0 : 1;
                if (zu1Var.o6[i2].indexOfKey(messageObject.e1()) >= 0) {
                    zu1Var.Gb(messageObject, wb2Var, i2, false);
                    z3 = true;
                } else {
                    wb2Var.setDrawSelectionBackground(false);
                    wb2Var.o3(false, false, false);
                    z3 = false;
                }
                z4 = true;
                z5 = z3;
            } else {
                wb2Var.setDrawSelectionBackground(false);
                wb2Var.o3(false, false, false);
                wb2Var.m3(false, false);
                z5 = false;
                z4 = false;
            }
            wb2Var.n3(!z4, z4 && z5);
            if (zu1Var.g4 != 7 || zu1Var.J3 == null || (str = zu1Var.I3) == null) {
                qr1 qr1Var = zu1Var.g3;
                if (qr1Var != null && qr1Var.getVisibility() == 0) {
                    if (zu1Var.getMediaDataController().c1[r47.B0(messageObject.k) == zu1Var.d7 ? (char) 1 : (char) 0].indexOfKey(messageObject.e1()) >= 0 && zu1Var.getMediaDataController().e1 != null) {
                        wb2Var.v3(zu1Var.getMediaDataController().e1);
                    }
                }
                wb2Var.v3(null);
            } else {
                wb2Var.v3(str);
            }
            z6 = ((e) zu1Var).inPreviewMode;
            if (!z6 || !wb2Var.x6) {
                if (zu1Var.d8 != Integer.MAX_VALUE) {
                    if (wb2Var.getMessageObject() == null || wb2Var.getMessageObject().e1() != zu1Var.d8) {
                        if (wb2Var.getCurrentMessagesGroup() != null) {
                            m47 currentMessagesGroup2 = wb2Var.getCurrentMessagesGroup();
                            int i3 = zu1Var.d8;
                            ArrayList arrayList3 = currentMessagesGroup2.d;
                            for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                                r47 r47Var2 = (r47) arrayList3.get(i4);
                                if (r47Var2 == null || r47Var2.e1() != i3) {
                                }
                            }
                        }
                    }
                    z7 = true;
                    wb2Var.setHighlighted(z7);
                    if (wb2Var.x6) {
                        if (zu1Var.h8 != null) {
                            long currentTimeMillis = System.currentTimeMillis();
                            if (!wb2Var.w3(true, zu1Var.k8, zu1Var.h8, zu1Var.f8 || currentTimeMillis - zu1Var.g8 < 200) && zu1Var.e8) {
                                d31.b0(zu1Var).Q(R.raw.error, 36, ob6.M0(2131746162, null)).k(true);
                            }
                            zu1Var.e8 = false;
                            if (zu1Var.f8) {
                                zu1Var.g8 = currentTimeMillis;
                            }
                            zu1Var.f8 = false;
                        } else {
                            Integer num = zu1Var.i8;
                            if (num != null) {
                                wb2Var.u3(num.intValue());
                            } else {
                                byte[] bArr = zu1Var.j8;
                                if (bArr != null) {
                                    wb2Var.s3(bArr);
                                }
                            }
                        }
                    }
                    if (zu1Var.d8 != Integer.MAX_VALUE) {
                        zu1Var.Ec();
                    }
                }
                z7 = false;
                wb2Var.setHighlighted(z7);
                if (wb2Var.x6) {
                }
                if (zu1Var.d8 != Integer.MAX_VALUE) {
                }
            }
        } else if (view instanceof dl1) {
            dl1 dl1Var = (dl1) view;
            dl1Var.f0 = zu1Var.S7();
            dl1Var.j0 = zu1Var.f8();
            zu1Var.e8();
            zu1Var.n7();
            dl1Var.k0 = zu1Var.o7();
        } else if (view instanceof bf2) {
            ((bf2) view).getTextView().setTranslationX(zu1Var.o7() / 2.0f);
        }
        int b = f89Var.b();
        int i5 = this.K;
        if (b < i5 || b >= this.L) {
            return;
        }
        r47 r47Var3 = (r47) (this.M ? this.N : this.O ? this.Q : zu1Var.M6).get(b - i5);
        if (r47Var3 == null || (message = r47Var3.k) == null || !message.media_unread || !message.mentioned) {
            return;
        }
        z = ((e) zu1Var).inPreviewMode;
        if (!z && zu1Var.g4 == 0 && !r47.Q4(r47Var3.k) && !r47Var3.g4()) {
            int i6 = zu1Var.D6 - 1;
            zu1Var.D6 = i6;
            if (i6 <= 0) {
                zu1Var.D6 = 0;
                zu1Var.E6 = true;
                zu1Var.mc(false);
            } else {
                zu1Var.y1.c(2, i6, true);
            }
            zu1Var.getMessagesController().v3(xc2.T(zu1Var.e) ? zu1Var.e.id : 0L, r47Var3.e1(), zu1Var.l6);
            r47Var3.k.media_unread = false;
        }
        if (z8) {
            wb2 wb2Var2 = (wb2) view;
            z2 = ((e) zu1Var).inPreviewMode;
            if (z2) {
                wb2Var2.setHighlighted(true);
            } else {
                wb2Var2.r3();
            }
        }
    }
}
