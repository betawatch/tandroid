package hi;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.f20;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class l8 extends FrameLayout implements View.OnClickListener, is {
    public final org.telegram.ui.Cells.x3 E;
    public final y7 F;
    public boolean G;
    public org.telegram.ui.ActionBar.t1 H;
    public long I;
    public String J;
    public final ArrayList K;
    public final ArrayList L;
    public final ArrayList M;
    public boolean N;
    public boolean O;
    public float P;
    public ValueAnimator Q;
    public boolean R;
    public int S;
    public boolean T;
    public int U;
    public boolean V;
    public boolean W;
    public int a;
    public final /* synthetic */ q8 a0;
    public final a0.h b;
    public final ArrayList c;
    public final HashMap d;
    public final FrameLayout e;
    public final uj0 f;
    public final v4.b0 h;
    public final h8 n;
    public final j8 r;
    public final View s;
    public final d w;
    public final d x;
    public final e8 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(q8 q8Var, Context context) {
        super(context);
        this.a0 = q8Var;
        this.b = new a0.h();
        this.c = new ArrayList();
        this.d = new HashMap();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.S = -1;
        int i7 = q8.Y1;
        org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(context, q8Var.J0);
        this.E = x3Var;
        e8 e8Var = new e8(this, context, q8Var.J0, new b8(this, 4));
        this.y = e8Var;
        int i10 = org.telegram.ui.ActionBar.j6.h5;
        org.telegram.ui.ActionBar.q6.h(i10, e8Var, q8Var.J0);
        e8Var.setOnSearchTextChange(new c8(this, 3));
        y7 y7Var = new y7(context, q8Var.J0);
        this.F = y7Var;
        y7Var.h = new b8(this, 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        int i11 = 0;
        frameLayout.setPadding(0, org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, c8.ja.e(-1, -1, ns.E1));
        uj0 uj0Var = new uj0(context, q8Var.J0);
        this.f = uj0Var;
        uj0Var.setClipToPadding(false);
        uj0Var.setTranslateSelector(true);
        h8 h8Var = new h8(this, context, q8Var.J0, e8Var, new fi.q3(q8Var, 2));
        this.n = h8Var;
        uj0Var.setAdapter(h8Var);
        h8Var.h = uj0Var;
        v4.b0 b0Var = new v4.b0();
        this.h = b0Var;
        uj0Var.setLayoutManager(b0Var);
        uj0Var.setOnScrollListener(new f8(i11, this));
        uj0Var.setOnItemClickListener(new ab.g(20, this, context));
        frameLayout.addView(uj0Var, c8.ja.c(-1.0f, -1));
        g8 g8Var = new g8(this);
        g8Var.n(350L);
        g8Var.o(er.h);
        g8Var.C = false;
        g8Var.m = false;
        uj0Var.setItemAnimator(g8Var);
        frameLayout.addView(e8Var, c8.ja.e(-1, -2, 55));
        frameLayout.addView(x3Var, c8.ja.e(-1, 32, 55));
        addView(y7Var, c8.ja.e(-1, -2, 55));
        j8 j8Var = new j8(this, context);
        this.r = j8Var;
        j8Var.setClickable(true);
        j8Var.setOrientation(1);
        j8Var.setPadding(org.telegram.messenger.g0.L(10.0f) + q8Var.u0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f) + q8Var.u0, org.telegram.messenger.g0.L(10.0f));
        org.telegram.ui.ActionBar.q6.h(i10, j8Var, q8Var.J0);
        d dVar = new d(context, q8Var.J0, true);
        this.w = dVar;
        dVar.setOnClickListener(new a8(this, i11));
        dVar.f();
        j8Var.addView(dVar, c8.ja.r(-1, 48, 87));
        d dVar2 = new d(context, q8Var.J0, false);
        this.x = dVar2;
        dVar2.setOnClickListener(new a8(this, 1));
        dVar2.f();
        j8Var.addView(dVar2, c8.ja.t(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.s = view;
        org.telegram.ui.ActionBar.q6.h(i10, view, q8Var.J0);
        addView(view, c8.ja.d(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
        addView(j8Var, c8.ja.e(-1, -2, 87));
    }

    public static boolean d(String str, TLObject tLObject) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            String lowerCase = org.telegram.messenger.g0.N3(q10.p(user)).toLowerCase();
            if (lowerCase.startsWith(str) || i5.c.A(" ", str, lowerCase)) {
                return true;
            }
            String lowerCase2 = org.telegram.messenger.g0.N3(q10.n(user)).toLowerCase();
            if (lowerCase2.startsWith(str) || i5.c.A(" ", str, lowerCase2)) {
                return true;
            }
            ArrayList<TLRPC.TL_username> arrayList = user.usernames;
            if (arrayList != null) {
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    TLRPC.TL_username tL_username = arrayList.get(i7);
                    if (tL_username.active && org.telegram.messenger.g0.N3(tL_username.username).toLowerCase().startsWith(str)) {
                        return true;
                    }
                }
            }
        } else if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String lowerCase3 = org.telegram.messenger.g0.N3(chat.title).toLowerCase();
            if (lowerCase3.startsWith(str) || i5.c.A(" ", str, lowerCase3)) {
                return true;
            }
            String lowerCase4 = org.telegram.messenger.g0.N3(org.telegram.messenger.t3.K(chat, false)).toLowerCase();
            if (lowerCase4.startsWith(str) || i5.c.A(" ", str, lowerCase4)) {
                return true;
            }
            ArrayList<TLRPC.TL_username> arrayList2 = chat.usernames;
            if (arrayList2 != null) {
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    TLRPC.TL_username tL_username2 = arrayList2.get(i10);
                    if (tL_username2.active && org.telegram.messenger.g0.N3(tL_username2.username).toLowerCase().startsWith(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void a(boolean z10) {
        if (this.a != 6) {
            return;
        }
        ArrayList arrayList = this.c;
        arrayList.clear();
        int i7 = q8.Y1;
        arrayList.addAll(np.s1(this.a0.a).P1().L);
        int i10 = 0;
        while (true) {
            a0.h hVar = this.b;
            if (i10 >= hVar.m()) {
                break;
            }
            long j3 = hVar.j(i10);
            if (!((Boolean) hVar.n(i10)).booleanValue()) {
                arrayList.remove(Long.valueOf(j3));
            } else if (!arrayList.contains(Long.valueOf(j3))) {
                arrayList.add(Long.valueOf(j3));
            }
            i10++;
        }
        if (z10) {
            h(true);
            f(true);
            g(true);
        }
    }

    public final void b(int i7) {
        this.a = i7;
        this.b.b();
        ArrayList arrayList = this.c;
        arrayList.clear();
        HashMap hashMap = this.d;
        hashMap.clear();
        q8 q8Var = this.a0;
        if (i7 == 4) {
            arrayList.addAll(q8Var.o1);
            hashMap.putAll(q8Var.p1);
        } else if (i7 == 5) {
            arrayList.addAll(q8Var.E1);
        } else if (i7 == 1) {
            ArrayList J0 = q8.J0(q8Var);
            for (int i10 = 0; i10 < J0.size(); i10 = com.google.android.gms.internal.vision.e2.g(i10, 1, ((TLRPC.User) J0.get(i10)).id, arrayList)) {
            }
        } else if (i7 == 2) {
            arrayList.addAll(q8Var.r1);
        } else if (i7 == 3) {
            arrayList.addAll(q8Var.s1);
            hashMap.putAll(q8Var.t1);
        } else if (i7 == 6) {
            a(false);
        }
        this.n.getClass();
        this.h.k1(false);
        j(false);
        e8 e8Var = this.y;
        e8Var.setText("");
        e8Var.setVisibility(i7 == 0 ? 8 : 0);
        e8Var.M = true;
        this.J = null;
        h(false);
        f(false);
        g(false);
        int i11 = this.a;
        uj0 uj0Var = this.f;
        if (i11 != 0) {
            uj0Var.v0(0);
        }
        uj0Var.requestLayout();
        this.S = -1;
    }

    public final float c() {
        int i7 = 0;
        float f10 = -i5.c.d(150.0f, Math.min(org.telegram.messenger.g0.L(150.0f), this.y.L), 0);
        while (true) {
            uj0 uj0Var = this.f;
            if (i7 >= uj0Var.getChildCount()) {
                return f10;
            }
            View childAt = uj0Var.getChildAt(i7);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 34) {
                return Math.max(f10, childAt.getY());
            }
            i7++;
        }
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.ChatFull chatFull;
        org.telegram.ui.ActionBar.t1 t1Var;
        if (i7 != ns.T || (chatFull = (TLRPC.ChatFull) objArr[0]) == null || (t1Var = this.H) == null || this.I != chatFull.id) {
            return;
        }
        t1Var.c(350L);
        this.H = null;
        this.I = -1L;
        e(chatFull.id, chatFull.participants);
    }

    public final void e(long j3, TLRPC.ChatParticipants chatParticipants) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i7 = this.a;
        int i10 = 0;
        boolean z10 = i7 == 1 || i7 == 2;
        q8 q8Var = this.a0;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i11 = 0; i11 < chatParticipants.participants.size(); i11++) {
                long j10 = chatParticipants.participants.get(i11).user_id;
                int i12 = q8.Y1;
                TLRPC.User a22 = np.s1(q8Var.a).a2(Long.valueOf(j10));
                if (a22 != null && !q10.B(a22) && !a22.bot && a22.id != 777000 && j10 != 0) {
                    if (!z10 || a22.contact) {
                        arrayList.add(Long.valueOf(j10));
                    } else {
                        arrayList2.add(Long.valueOf(j10));
                    }
                    this.c.remove(Long.valueOf(j10));
                }
            }
        }
        if (arrayList2.isEmpty()) {
            this.d.put(Long.valueOf(j3), arrayList);
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                this.b.k(Boolean.TRUE, ((Long) obj).longValue());
            }
            j(true);
            f(true);
            g(true);
            this.y.M = true;
            return;
        }
        if (arrayList.isEmpty()) {
            Context context = getContext();
            int i13 = q8.Y1;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, q8Var.J0);
            alertDialog$Builder.a.U = hd.M0(2131744538, null);
            i5.c.x(null, 2131752589, alertDialog$Builder, null);
            return;
        }
        Context context2 = getContext();
        int i14 = q8.Y1;
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, context2, q8Var.J0);
        alertDialog$Builder2.a.U = hd.G(arrayList2.size(), "StoryPrivacyGroupNonContacts", new Object[0]);
        alertDialog$Builder2.k(hd.G(arrayList.size(), "StoryPrivacyGroupAddContacts", new Object[0]), new di.h(this, j3, arrayList, 2));
        i5.c.x(null, 2131752589, alertDialog$Builder2, null);
    }

    public final void f(boolean z10) {
        int i7 = this.a;
        q8 q8Var = this.a0;
        d dVar = this.x;
        int i10 = 0;
        d dVar2 = this.w;
        if (i7 == 0) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.c(0, z10);
            if (q8Var.G1) {
                dVar2.i(hd.M0(2131744554, null), z10, true);
            } else if (q8Var.U1) {
                dVar2.i(hd.M0(2131744554, null), z10, true);
            } else {
                int i11 = q8Var.D1;
                if (i11 == 1) {
                    dVar2.i(hd.M0(q8Var.F1 ? 2131744619 : 2131744558, null), z10, true);
                } else {
                    dVar2.i(hd.H(',', "StoryPrivacyButtonPostMultiple", i11), z10, true);
                }
            }
            dVar.setVisibility(8);
            return;
        }
        ArrayList arrayList = this.c;
        if (i7 == 1) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.i(hd.M0(2131744553, null), z10, true);
            dVar2.c(arrayList.size(), z10);
            dVar.setVisibility(8);
            return;
        }
        j8 j8Var = this.r;
        if (i7 == 3) {
            int size = q8.R0(arrayList, this.d).size();
            q8Var.u1 = size;
            dVar2.i(hd.M0(2131744554, null), z10, true);
            dVar2.setShowZero(false);
            j8Var.b(size <= 0, z10);
            dVar2.c(size, z10);
            dVar2.setEnabled(size > 0);
            dVar.setVisibility(8);
            return;
        }
        if (i7 == 2) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            if (arrayList.isEmpty()) {
                dVar2.i(hd.M0(2131744554, null), z10, true);
                dVar2.c(0, z10);
            } else {
                dVar2.i(hd.M0(2131744559, null), z10, true);
                dVar2.c(arrayList.size(), z10);
            }
            dVar.setVisibility(8);
            return;
        }
        if (i7 == 5) {
            dVar2.setShowZero(true);
            dVar2.setEnabled(!arrayList.isEmpty());
            dVar2.c(arrayList.size(), z10);
            dVar.setVisibility(8);
            return;
        }
        if (i7 != 6) {
            if (i7 == 4) {
                int size2 = q8.R0(q8Var.o1, q8Var.p1).size();
                q8Var.q1 = size2;
                dVar2.i(hd.M0(2131744554, null), z10, true);
                dVar2.setShowZero(false);
                j8Var.b(false, z10);
                dVar2.c(size2, z10);
                dVar2.setEnabled(true);
                dVar.setVisibility(8);
                return;
            }
            return;
        }
        dVar2.setShowZero(false);
        dVar2.setEnabled(true);
        dVar2.i(hd.M0(2131744553, null), z10, true);
        int i12 = q8.Y1;
        fi.s6 P1 = np.s1(q8Var.a).P1();
        if (!P1.O) {
            while (true) {
                a0.h hVar = this.b;
                if (i10 >= hVar.m()) {
                    break;
                }
                long j3 = hVar.j(i10);
                ((Boolean) hVar.n(i10)).getClass();
                P1.L.contains(Long.valueOf(j3));
                i10++;
            }
        } else {
            dVar2.c(arrayList.size(), z10);
        }
        dVar.setVisibility(8);
    }

    public final void g(boolean z10) {
        ArrayList arrayList;
        int R;
        q8 q8Var = this.a0;
        ArrayList arrayList2 = q8Var.E1;
        HashMap hashMap = q8Var.t1;
        ArrayList arrayList3 = q8Var.s1;
        ArrayList arrayList4 = q8Var.r1;
        HashMap hashMap2 = q8Var.p1;
        ArrayList arrayList5 = q8Var.o1;
        int i7 = this.a;
        HashMap hashMap3 = this.d;
        ArrayList arrayList6 = this.c;
        if (i7 == 4) {
            arrayList5.clear();
            hashMap2.clear();
            arrayList5.addAll(arrayList6);
            hashMap2.putAll(hashMap3);
        } else if (i7 == 2) {
            arrayList4.clear();
            arrayList4.addAll(arrayList6);
        } else if (i7 == 3) {
            arrayList3.clear();
            hashMap.clear();
            arrayList3.addAll(arrayList6);
            hashMap.putAll(hashMap3);
        } else if (i7 == 0) {
            arrayList2.clear();
            arrayList2.addAll(arrayList6);
        }
        if (this.a == 3 && (q8Var.I1 != 3 || (arrayList6.isEmpty() && hashMap3.isEmpty()))) {
            if (arrayList6.isEmpty() && hashMap3.isEmpty()) {
                int i10 = this.S;
                if (i10 != -1) {
                    q8Var.I1 = i10;
                }
            } else {
                this.S = q8Var.I1;
                q8Var.I1 = 3;
            }
        }
        HashSet R0 = q8.R0(arrayList6, hashMap3);
        int i11 = 0;
        while (true) {
            arrayList = this.M;
            if (i11 >= arrayList.size()) {
                break;
            }
            z7 z7Var = (z7) arrayList.get(i11);
            if (z7Var != null) {
                int i12 = z7Var.i;
                if (i12 > 0) {
                    z7Var.k = q8Var.I1 == i12;
                    z7Var.l = false;
                } else {
                    TLRPC.User user = z7Var.g;
                    if (user != null) {
                        boolean contains = arrayList6.contains(Long.valueOf(user.id));
                        z7Var.k = contains;
                        z7Var.l = !contains && R0.contains(Long.valueOf(z7Var.g.id));
                    } else {
                        TLRPC.Chat chat = z7Var.h;
                        if (chat != null) {
                            z7Var.k = hashMap3.containsKey(Long.valueOf(chat.id));
                            z7Var.l = false;
                        }
                    }
                }
            }
            i11++;
        }
        int i13 = 0;
        while (true) {
            uj0 uj0Var = this.f;
            if (i13 >= uj0Var.getChildCount()) {
                i(z10);
                return;
            }
            View childAt = uj0Var.getChildAt(i13);
            if ((childAt instanceof p8) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                z7 z7Var2 = (z7) arrayList.get(R);
                p8 p8Var = (p8) childAt;
                p8Var.c(z7Var2.k || z7Var2.l, z10);
                TLRPC.Chat chat2 = z7Var2.h;
                if (chat2 != null) {
                    p8Var.b(z10, q8.K0(q8Var, chat2) > 200 ? 0.3f : 1.0f);
                } else {
                    if (z7Var2.l && !z7Var2.k) {
                        r8 = 0.5f;
                    }
                    p8Var.b(z10, r8);
                }
            }
            i13++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0cbe  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0cc5  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(boolean z10) {
        float L;
        float L2;
        h8 h8Var;
        ArrayList arrayList;
        long j3;
        boolean z11;
        float f10;
        boolean z12;
        float f11;
        TLRPC.User a22;
        TLRPC.Chat M0;
        int i7;
        ArrayList arrayList2;
        int i10;
        int i11;
        TLRPC.Chat M02;
        boolean z13;
        boolean z14;
        String G;
        float f12;
        boolean z15;
        boolean z16;
        boolean z17;
        String G2;
        String G3;
        q8 q8Var = this.a0;
        ArrayList arrayList3 = q8Var.s1;
        ArrayList arrayList4 = q8Var.o1;
        ArrayList arrayList5 = q8Var.r1;
        HashSet hashSet = q8Var.v1;
        ArrayList arrayList6 = this.L;
        arrayList6.clear();
        ArrayList arrayList7 = this.M;
        arrayList6.addAll(arrayList7);
        arrayList7.clear();
        int i12 = this.a;
        org.telegram.ui.Cells.x3 x3Var = this.E;
        if (i12 != 0) {
            y7 y7Var = this.F;
            if (i12 == 1) {
                y7Var.e(hd.M0(2131744573, null));
                y7Var.d(true);
                ((org.telegram.ui.ActionBar.x1) y7Var.e).c(false, 0.0f);
                arrayList7.add(z7.d());
                arrayList7.add(z7.c());
                arrayList7.size();
                arrayList7.add(z7.e());
                arrayList7.add(z7.f());
                L2 = org.telegram.messenger.g0.L(32.0f) + org.telegram.messenger.g0.L(56.0f) + 0.0f + org.telegram.messenger.g0.L(150.0f);
                x3Var.setText(hd.M0(2131744574, null));
                i(z10);
                this.G = true;
            } else if (i12 == 2) {
                y7Var.e(hd.M0(2131744568, null));
                y7Var.d(true);
                ((org.telegram.ui.ActionBar.x1) y7Var.e).c(false, 0.0f);
                arrayList7.add(z7.d());
                arrayList7.add(z7.c());
                arrayList7.size();
                arrayList7.add(z7.e());
                arrayList7.add(z7.f());
                L2 = org.telegram.messenger.g0.L(32.0f) + org.telegram.messenger.g0.L(56.0f) + 0.0f + org.telegram.messenger.g0.L(150.0f);
                x3Var.setText(hd.M0(2131744569, null));
                i(z10);
                this.G = true;
            } else if (i12 == 3) {
                y7Var.e(hd.M0(2131744566, null));
                y7Var.d(true);
                ((org.telegram.ui.ActionBar.x1) y7Var.e).c(false, 0.0f);
                arrayList7.add(z7.d());
                arrayList7.add(z7.c());
                arrayList7.size();
                arrayList7.add(z7.e());
                arrayList7.add(z7.f());
                L2 = org.telegram.messenger.g0.L(32.0f) + org.telegram.messenger.g0.L(56.0f) + 0.0f + org.telegram.messenger.g0.L(150.0f);
                x3Var.setText(hd.M0(2131744567, null));
                i(z10);
                this.G = true;
            } else if (i12 == 5) {
                y7Var.e(hd.M0(2131744577, null));
                y7Var.d(q8Var.J1);
                ((org.telegram.ui.ActionBar.x1) y7Var.e).c(false, 0.0f);
                arrayList7.add(z7.d());
                arrayList7.add(z7.c());
                arrayList7.size();
                arrayList7.add(z7.e());
                arrayList7.add(z7.f());
                L2 = org.telegram.messenger.g0.L(32.0f) + org.telegram.messenger.g0.L(56.0f) + 0.0f + org.telegram.messenger.g0.L(150.0f);
                x3Var.setText(hd.M0(2131744578, null));
                i(z10);
                this.G = true;
            } else if (i12 == 6) {
                y7Var.e(hd.M0(2131744575, null));
                y7Var.d(true);
                ((org.telegram.ui.ActionBar.x1) y7Var.e).c(false, 0.0f);
                arrayList7.add(z7.d());
                arrayList7.add(z7.c());
                arrayList7.size();
                arrayList7.add(z7.e());
                arrayList7.add(z7.f());
                L2 = org.telegram.messenger.g0.L(32.0f) + org.telegram.messenger.g0.L(56.0f) + 0.0f + org.telegram.messenger.g0.L(150.0f);
                x3Var.setText(hd.M0(2131744576, null));
                i(z10);
                this.G = true;
            } else if (i12 == 4) {
                y7Var.e(hd.M0(2131744570, null));
                y7Var.d(true);
                ((org.telegram.ui.ActionBar.x1) y7Var.e).c(false, 0.0f);
                arrayList7.add(z7.d());
                arrayList7.add(z7.c());
                arrayList7.size();
                arrayList7.add(z7.e());
                arrayList7.add(z7.f());
                L = org.telegram.messenger.g0.L(56.0f) + 0.0f + org.telegram.messenger.g0.L(150.0f) + org.telegram.messenger.g0.L(32.0f);
                x3Var.setText(hd.M0(2131744571, null));
                i(z10);
                this.G = true;
                boolean isEmpty = TextUtils.isEmpty(this.J);
                if (this.a != 0) {
                    String lowerCase = org.telegram.messenger.g0.N3(this.J).toLowerCase();
                    int i13 = this.a;
                    if (i13 == 5) {
                        ArrayList arrayList8 = new ArrayList();
                        np s12 = np.s1(q8Var.a);
                        ArrayList arrayList9 = s12.y;
                        for (int i14 = 0; i14 < arrayList9.size(); i14++) {
                            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList9.get(i14);
                            if (s12.y(dialog)) {
                                if (org.telegram.messenger.m5.E(dialog.id)) {
                                    TLRPC.User a23 = s12.a2(Long.valueOf(dialog.id));
                                    if (a23 != null && !a23.bot && a23.id != 777000 && !q10.B(a23)) {
                                        arrayList8.add(a23);
                                    }
                                } else if (org.telegram.messenger.m5.z(dialog.id) && (M02 = s12.M0(Long.valueOf(-dialog.id))) != null && !org.telegram.messenger.t3.c0(M02)) {
                                    arrayList8.add(M02);
                                }
                            }
                        }
                        z11 = isEmpty;
                        arrayList = arrayList8;
                        f11 = L;
                    } else {
                        boolean z18 = i13 == 1 || i13 == 2;
                        boolean z19 = q8Var.T1 && (i13 == 3 || i13 == 6);
                        np s13 = np.s1(q8Var.a);
                        HashMap hashMap = new HashMap();
                        arrayList = new ArrayList();
                        ArrayList arrayList10 = s13.y;
                        ConcurrentHashMap concurrentHashMap = org.telegram.messenger.g5.r(q8Var.a).g0;
                        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
                            j3 = 777000;
                            if (q8Var.V1) {
                                z11 = isEmpty;
                                f10 = L;
                                z12 = z19;
                            } else {
                                f10 = L;
                                z12 = z19;
                                z11 = isEmpty;
                                org.telegram.messenger.g5.r(q8Var.a).A(0L, false);
                            }
                            q8Var.V1 = true;
                        } else {
                            z11 = isEmpty;
                            z12 = z19;
                            j3 = 777000;
                            f10 = L;
                        }
                        int i15 = 0;
                        while (i15 < arrayList10.size()) {
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList10.get(i15);
                            float f13 = f10;
                            if (org.telegram.messenger.m5.E(dialog2.id)) {
                                TLRPC.User a24 = s13.a2(Long.valueOf(dialog2.id));
                                if (a24 != null && !a24.bot && a24.id != j3 && !q10.B(a24) && !a24.deleted && (!z18 || (concurrentHashMap != null && concurrentHashMap.get(Long.valueOf(a24.id)) != null))) {
                                    hashMap.put(Long.valueOf(a24.id), Boolean.TRUE);
                                    arrayList.add(a24);
                                }
                            } else if (z12 && org.telegram.messenger.m5.z(dialog2.id) && (M0 = s13.M0(Long.valueOf(-dialog2.id))) != null && !org.telegram.messenger.t3.V(M0)) {
                                hashMap.put(Long.valueOf(-M0.id), Boolean.TRUE);
                                arrayList.add(M0);
                            }
                            i15++;
                            f10 = f13;
                        }
                        f11 = f10;
                        if (concurrentHashMap != null) {
                            Iterator it = concurrentHashMap.entrySet().iterator();
                            while (it.hasNext()) {
                                Long l10 = (Long) ((Map.Entry) it.next()).getKey();
                                l10.getClass();
                                if (!hashMap.containsKey(l10) && (a22 = s13.a2(l10)) != null && !a22.bot && a22.id != j3 && !q10.B(a22)) {
                                    arrayList.add(a22);
                                    hashMap.put(Long.valueOf(a22.id), Boolean.TRUE);
                                }
                            }
                        }
                    }
                    ArrayList arrayList11 = this.c;
                    HashMap hashMap2 = this.d;
                    HashSet R0 = q8.R0(arrayList11, hashMap2);
                    ArrayList arrayList12 = this.K;
                    if (z11) {
                        if (!z10) {
                            arrayList12.clear();
                            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                TLObject tLObject = (TLObject) arrayList.get(i16);
                                if (tLObject instanceof TLRPC.User ? arrayList11.contains(Long.valueOf(((TLRPC.User) tLObject).id)) : tLObject instanceof TLRPC.Chat ? hashMap2.containsKey(Long.valueOf(((TLRPC.Chat) tLObject).id)) : false) {
                                    arrayList12.add(tLObject);
                                }
                            }
                        }
                        int i17 = 0;
                        int i18 = 0;
                        while (i17 < arrayList12.size()) {
                            TLObject tLObject2 = (TLObject) arrayList12.get(i17);
                            if (tLObject2 instanceof TLRPC.User) {
                                TLRPC.User user = (TLRPC.User) tLObject2;
                                boolean contains = arrayList11.contains(Long.valueOf(user.id));
                                i10 = i17;
                                i11 = i18;
                                z7 i19 = z7.i(user, contains, !contains && R0.contains(Long.valueOf(user.id)));
                                int i20 = this.a;
                                i19.m = i20 == 2 || i20 == 4;
                                arrayList7.add(i19);
                                f11 += org.telegram.messenger.g0.L(56.0f);
                            } else {
                                i10 = i17;
                                i11 = i18;
                                if (tLObject2 instanceof TLRPC.Chat) {
                                    TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                                    boolean containsKey = hashMap2.containsKey(Long.valueOf(chat.id));
                                    float f14 = f11;
                                    z7 z7Var = new z7(3, true);
                                    z7Var.h = chat;
                                    z7Var.k = containsKey;
                                    int i21 = this.a;
                                    z7Var.m = i21 == 2 || i21 == 4;
                                    arrayList7.add(z7Var);
                                    f11 = f14 + org.telegram.messenger.g0.L(56.0f);
                                } else {
                                    i18 = i11;
                                    i17 = i10 + 1;
                                }
                            }
                            i18 = i11 + 1;
                            i17 = i10 + 1;
                        }
                        i7 = i18;
                    } else {
                        i7 = 0;
                    }
                    int i22 = 0;
                    while (i22 < arrayList.size()) {
                        TLObject tLObject3 = (TLObject) arrayList.get(i22);
                        if ((!z11 || !arrayList12.contains(tLObject3)) && d(lowerCase, tLObject3)) {
                            if (tLObject3 instanceof TLRPC.User) {
                                TLRPC.User user2 = (TLRPC.User) tLObject3;
                                boolean contains2 = arrayList11.contains(Long.valueOf(user2.id));
                                z7 i23 = z7.i(user2, contains2, !contains2 && R0.contains(Long.valueOf(user2.id)));
                                int i24 = this.a;
                                i23.m = i24 == 2 || i24 == 4;
                                arrayList7.add(i23);
                                f11 += org.telegram.messenger.g0.L(56.0f);
                                i7++;
                            } else if (tLObject3 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject3;
                                boolean containsKey2 = hashMap2.containsKey(Long.valueOf(chat2.id));
                                arrayList2 = arrayList11;
                                z7 z7Var2 = new z7(3, true);
                                z7Var2.h = chat2;
                                z7Var2.k = containsKey2;
                                int i25 = this.a;
                                z7Var2.m = i25 == 2 || i25 == 4;
                                arrayList7.add(z7Var2);
                                f11 += org.telegram.messenger.g0.L(56.0f);
                                i7++;
                                i22++;
                                arrayList11 = arrayList2;
                            }
                        }
                        arrayList2 = arrayList11;
                        i22++;
                        arrayList11 = arrayList2;
                    }
                    if (!z11) {
                        if (i7 == 0) {
                            arrayList7.add(new z7(5, false));
                            f11 += org.telegram.messenger.g0.L(150.0f);
                        }
                        uj0 uj0Var = this.f;
                        float measuredHeight = (uj0Var != null ? ((uj0Var.getMeasuredHeight() - uj0Var.getPaddingTop()) - uj0Var.getPaddingBottom()) + (q8Var.d ? this.U : 0) : ((org.telegram.messenger.g0.q.y - org.telegram.messenger.g0.L(56.0f)) - org.telegram.messenger.g0.n) - org.telegram.messenger.g0.L(42.0f)) - f11;
                        if (measuredHeight > 0.0f) {
                            z7 z7Var3 = new z7(-1, false);
                            z7Var3.p = (int) measuredHeight;
                            arrayList7.add(z7Var3);
                        }
                    }
                }
                if (this.h.t) {
                    Collections.reverse(arrayList7);
                }
                h8Var = this.n;
                if (h8Var != null) {
                    if (!z10 || q8Var.I1 == 0) {
                        h8Var.f();
                    } else {
                        h8Var.E(arrayList6, arrayList7);
                    }
                }
                this.e.invalidate();
            }
            L = L2;
            boolean isEmpty2 = TextUtils.isEmpty(this.J);
            if (this.a != 0) {
            }
            if (this.h.t) {
            }
            h8Var = this.n;
            if (h8Var != null) {
            }
            this.e.invalidate();
        }
        this.G = false;
        x3Var.setVisibility(8);
        int i26 = q8.Y1;
        ArrayList arrayList13 = np.s1(q8Var.a).P1().T;
        z7 z7Var4 = new z7(-1, false);
        z7Var4.o = 24;
        arrayList7.add(z7Var4);
        if (q8Var.G1) {
            String M03 = hd.M0(2131748789, null);
            z7 z7Var5 = new z7(11, false);
            z7Var5.e = M03;
            arrayList7.add(z7Var5);
            z7Var4.o = org.telegram.messenger.g0.L(72.0f) + z7Var4.o;
        } else if (q8Var.A1 && (q8Var.U1 || arrayList13 == null || arrayList13.size() <= 1)) {
            String M04 = q8Var.U1 ? hd.M0(2131744572, null) : hd.M0(q8Var.F1 ? 2131744620 : 2131744561, null);
            if (q8Var.F1) {
                G = hd.M0(2131744621, null);
            } else {
                int i27 = q8Var.L1;
                G = i27 != Integer.MAX_VALUE ? hd.G(i27 / 3600, "StoryPrivacyAlertSubtitle", new Object[0]) : hd.M0(2131744564, null);
            }
            z7 z7Var6 = new z7(4, false);
            z7Var6.e = M04;
            z7Var6.f = G;
            arrayList7.add(z7Var6);
            z7Var4.o = org.telegram.messenger.g0.L(72.0f) + z7Var4.o;
        } else {
            String M05 = hd.M0(q8Var.F1 ? 2131744618 : 2131744518, null);
            z7 z7Var7 = new z7(8, false);
            z7Var7.e = M05;
            arrayList7.add(z7Var7);
            z7Var4.o = org.telegram.messenger.g0.L(50.0f) + z7Var4.o;
            TLRPC.InputPeer inputPeer = q8Var.n1;
            if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                z7 i28 = z7.i(m10.i(q8Var.a).f(), false, false);
                i28.n = true;
                arrayList7.add(i28);
                z7Var4.o = org.telegram.messenger.g0.L(62.0f) + z7Var4.o;
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                z7 i29 = z7.i(np.s1(q8Var.a).a2(Long.valueOf(q8Var.n1.user_id)), false, false);
                i29.n = true;
                arrayList7.add(i29);
                z7Var4.o = org.telegram.messenger.g0.L(62.0f) + z7Var4.o;
            } else {
                if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.Chat M06 = np.s1(q8Var.a).M0(Long.valueOf(q8Var.n1.channel_id));
                    z7 z7Var8 = new z7(3, true);
                    z7Var8.h = M06;
                    z7Var8.k = false;
                    z7Var8.n = true;
                    arrayList7.add(z7Var8);
                    z14 = org.telegram.messenger.t3.V(M06);
                    z7Var4.o = org.telegram.messenger.g0.L(104.0f) + z7Var4.o;
                    z13 = false;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.Chat M07 = np.s1(q8Var.a).M0(Long.valueOf(q8Var.n1.chat_id));
                    z7 z7Var9 = new z7(3, true);
                    z7Var9.h = M07;
                    z7Var9.k = false;
                    z7Var9.n = true;
                    arrayList7.add(z7Var9);
                    z7Var4.o = org.telegram.messenger.g0.L(104.0f) + z7Var4.o;
                    z14 = false;
                    z13 = false;
                }
                z7 g10 = z7.g(null);
                g10.c = !z13 ? 1 : 2;
                arrayList7.add(g10);
                z7Var4.o = org.telegram.messenger.g0.L(12.0f) + z7Var4.o;
                if (z13) {
                    String M08 = hd.M0(q8Var.F1 ? 2131744617 : 2131744513, null);
                    z7 z7Var10 = new z7(8, false);
                    z7Var10.e = M08;
                    arrayList7.add(z7Var10);
                    z7Var4.o = org.telegram.messenger.g0.L(40.0f) + z7Var4.o;
                }
                if (z13 || q8Var.G1) {
                    f12 = 80.0f;
                } else {
                    f12 = 80.0f;
                    z7 h = z7.h(4, q8Var.q1, q8Var.I1 == 4);
                    arrayList7.add(h);
                    z7Var4.o = org.telegram.messenger.g0.L(56.0f) + z7Var4.o;
                    if (q8Var.q1 == 1) {
                        if (arrayList4.size() != 1) {
                            Iterator it2 = q8Var.p1.values().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList14 = (ArrayList) it2.next();
                                if (arrayList14.size() >= 1) {
                                    h.g = np.s1(q8Var.a).a2((Long) arrayList14.get(0));
                                    break;
                                }
                            }
                        } else {
                            h.g = np.s1(q8Var.a).a2((Long) arrayList4.get(0));
                        }
                    }
                    z7 h7 = z7.h(2, arrayList5.size(), q8Var.I1 == 2);
                    arrayList7.add(h7);
                    z7Var4.o = org.telegram.messenger.g0.L(56.0f) + z7Var4.o;
                    if (arrayList5.size() == 1) {
                        h7.g = np.s1(q8Var.a).a2((Long) arrayList5.get(0));
                    }
                    ArrayList J0 = q8.J0(q8Var);
                    z7 h10 = z7.h(1, J0.size(), q8Var.I1 == 1);
                    arrayList7.add(h10);
                    z7Var4.o = org.telegram.messenger.g0.L(56.0f) + z7Var4.o;
                    if (J0.size() == 1 && (J0.get(0) instanceof TLRPC.User)) {
                        h10.g = (TLRPC.User) J0.get(0);
                    }
                    z7 h11 = z7.h(3, q8Var.u1, q8Var.I1 == 3);
                    arrayList7.add(h11);
                    z7Var4.o = org.telegram.messenger.g0.L(56.0f) + z7Var4.o;
                    if (q8Var.u1 == 1) {
                        if (arrayList3.size() != 1) {
                            Iterator it3 = q8Var.t1.values().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList15 = (ArrayList) it3.next();
                                if (arrayList15.size() >= 1) {
                                    h11.g = np.s1(q8Var.a).a2((Long) arrayList15.get(0));
                                    break;
                                }
                            }
                        } else {
                            h11.g = np.s1(q8Var.a).a2((Long) arrayList3.get(0));
                        }
                    }
                    int i30 = np.s1(q8Var.a).P1().N;
                    arrayList7.add(z7.g(org.telegram.messenger.g0.S2(i30 <= 0 ? hd.M0(q8Var.F1 ? 2131744628 : 2131744716, null) : hd.G(i30, q8Var.F1 ? "StoryLiveBlockList" : "StoryBlockList", new Object[0]), org.telegram.ui.ActionBar.j6.Xc, 0, new b8(this, 3), q8Var.J0)));
                    z7Var4.o = org.telegram.messenger.g0.L(80.0f) + z7Var4.o;
                }
                if (!q8Var.U1) {
                    if (q8Var.F1 && !q8Var.G1) {
                        if (q8Var.B1) {
                            arrayList7.add(z7.b(hd.M0(2131748797, null), "", 5));
                            z7Var4.o = org.telegram.messenger.g0.L(50.0f) + z7Var4.o;
                            arrayList7.add(z7.b(hd.M0(2131748803, null), "", 6));
                            z7Var4.o = org.telegram.messenger.g0.L(50.0f) + z7Var4.o;
                            arrayList7.add(z7.g(null));
                            z7Var4.o = org.telegram.messenger.g0.L(12.0f) + z7Var4.o;
                        } else {
                            arrayList7.add(z7.b(hd.M0(2131748802, null), "", 5));
                            z7Var4.o = org.telegram.messenger.g0.L(50.0f) + z7Var4.o;
                            arrayList7.add(z7.g(hd.M0(2131748801, null)));
                            z7Var4.o = org.telegram.messenger.g0.L(30.0f) + z7Var4.o;
                        }
                    }
                    if (q8Var.F1) {
                        String M09 = hd.M0(2131744630, null);
                        boolean z20 = q8Var.w1;
                        z7 z7Var11 = new z7(7, false);
                        z7Var11.c = 2;
                        z7Var11.e = M09;
                        z7Var11.k = z20;
                        arrayList7.add(z7Var11);
                        z7Var4.o = org.telegram.messenger.g0.L(50.0f) + z7Var4.o;
                    }
                    if (!q8Var.G1) {
                        String M010 = hd.M0(2131744729, null);
                        boolean z21 = q8Var.x1;
                        z7 z7Var12 = new z7(7, false);
                        z7Var12.c = 0;
                        z7Var12.e = M010;
                        z7Var12.k = z21;
                        arrayList7.add(z7Var12);
                        z7Var4.o = org.telegram.messenger.g0.L(50.0f) + z7Var4.o;
                    }
                    if (!q8Var.F1 && !q8Var.G1) {
                        String M011 = hd.M0(z13 ? 2131744658 : z14 ? 2131744657 : 2131744652, null);
                        boolean z22 = q8Var.y1;
                        z7 z7Var13 = new z7(7, false);
                        z7Var13.c = 1;
                        z7Var13.e = M011;
                        z7Var13.k = z22;
                        arrayList7.add(z7Var13);
                        z7Var4.o = org.telegram.messenger.g0.L(50.0f) + z7Var4.o;
                    }
                }
                z15 = q8Var.F1;
                String str = "StoryKeepGroupInfo";
                if (!z15 || q8Var.G1) {
                    arrayList7.add(z7.g(null));
                    z7Var4.o = org.telegram.messenger.g0.L(12.0f) + z7Var4.o;
                } else if (!q8Var.U1 && q8Var.z1 && q8Var.X1 != null) {
                    if (z15) {
                        G3 = hd.M0(z13 ? 2131744623 : z14 ? 2131744625 : 2131744624, null);
                    } else {
                        String str2 = z13 ? "StoryKeepInfo" : z14 ? "StoryKeepChannelInfo" : "StoryKeepGroupInfo";
                        int i31 = q8Var.L1;
                        if (i31 == Integer.MAX_VALUE) {
                            i31 = 86400;
                        }
                        G3 = hd.G(i31 / 3600, str2, new Object[0]);
                    }
                    arrayList7.add(z7.g(G3));
                    z7Var4.o = org.telegram.messenger.g0.L(f12) + z7Var4.o;
                }
                if (q8Var.y1 || q8Var.F1 || q8Var.G1) {
                    z16 = z14;
                } else {
                    TLRPC.InputPeer inputPeer2 = q8Var.n1;
                    long n10 = inputPeer2 != null ? org.telegram.messenger.m5.n(inputPeer2) : m10.i(q8Var.a).e();
                    np.s1(q8Var.a).P1().B(n10, true);
                    StringBuilder sb2 = new StringBuilder();
                    if (hashSet.isEmpty()) {
                        sb2.append(hd.M0(2131744786, null));
                    } else if (hashSet.size() < 3) {
                        Iterator it4 = hashSet.iterator();
                        while (it4.hasNext()) {
                            Iterator it5 = it4;
                            boolean z23 = z14;
                            fi.l6 b10 = np.s1(q8Var.a).P1().B(n10, true).b(((Integer) it4.next()).intValue());
                            if (b10 != null) {
                                if (sb2.length() != 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(b10.b);
                            }
                            it4 = it5;
                            z14 = z23;
                        }
                    } else {
                        z16 = z14;
                        sb2.append(hd.G(hashSet.size(), "StoriesAlbumCount", new Object[0]));
                        arrayList7.add(z7.b(hd.M0(2131744808, null), sb2, 1));
                        z7Var4.o = org.telegram.messenger.g0.L(50.0f) + z7Var4.o;
                    }
                    z16 = z14;
                    arrayList7.add(z7.b(hd.M0(2131744808, null), sb2, 1));
                    z7Var4.o = org.telegram.messenger.g0.L(50.0f) + z7Var4.o;
                }
                if (!q8Var.U1 && ((!q8Var.z1 || q8Var.X1 == null) && !(z17 = q8Var.F1) && !q8Var.G1)) {
                    if (z17) {
                        if (z13) {
                            str = "StoryKeepInfo";
                        } else if (z16) {
                            str = "StoryKeepChannelInfo";
                        }
                        int i32 = q8Var.L1;
                        G2 = hd.G((i32 == Integer.MAX_VALUE ? 86400 : i32) / 3600, str, new Object[0]);
                    } else {
                        G2 = hd.M0(z13 ? 2131744623 : z16 ? 2131744625 : 2131744624, null);
                    }
                    arrayList7.add(z7.g(G2));
                    z7Var4.o = org.telegram.messenger.g0.L(f12) + z7Var4.o;
                }
                if (q8Var.y1 && q8Var.z1 && q8Var.X1 != null) {
                    String M012 = hd.M0(2131744676, null);
                    BitmapDrawable bitmapDrawable = q8Var.W1;
                    z7 z7Var14 = new z7(9, false);
                    z7Var14.e = M012;
                    z7Var14.d = bitmapDrawable;
                    z7Var14.q = 0;
                    arrayList7.add(z7Var14);
                    z7Var4.o = org.telegram.messenger.g0.L(50.0f) + z7Var4.o;
                    arrayList7.add(z7.g(hd.M0(2131744675, null)));
                    z7Var4.o = org.telegram.messenger.g0.L(72.0f) + z7Var4.o;
                }
                if (q8Var.G1) {
                    arrayList7.add(z7.b(hd.M0(2131748797, null), "", 5));
                    z7Var4.o = org.telegram.messenger.g0.L(50.0f) + z7Var4.o;
                    arrayList7.add(z7.g(null));
                    z7Var4.o = org.telegram.messenger.g0.L(52.0f) + z7Var4.o;
                }
                if (q8Var.F1 && q8Var.w1) {
                    String M013 = hd.M0(2131748806, null);
                    z7 z7Var15 = new z7(8, false);
                    z7Var15.e = M013;
                    arrayList7.add(z7Var15);
                    z7Var4.o = org.telegram.messenger.g0.L(40.0f) + z7Var4.o;
                    z7 z7Var16 = new z7(10, false);
                    z7Var16.q = 8;
                    arrayList7.add(z7Var16);
                    z7Var4.o = org.telegram.messenger.g0.L(75.0f) + z7Var4.o;
                    arrayList7.add(z7.g(hd.M0(2131748804, null)));
                    z7Var4.o = org.telegram.messenger.g0.L(50.0f) + z7Var4.o;
                }
            }
            z14 = false;
            z13 = true;
            z7 g102 = z7.g(null);
            g102.c = !z13 ? 1 : 2;
            arrayList7.add(g102);
            z7Var4.o = org.telegram.messenger.g0.L(12.0f) + z7Var4.o;
            if (z13) {
            }
            if (z13) {
            }
            f12 = 80.0f;
            if (!q8Var.U1) {
            }
            z15 = q8Var.F1;
            String str3 = "StoryKeepGroupInfo";
            if (z15) {
            }
            arrayList7.add(z7.g(null));
            z7Var4.o = org.telegram.messenger.g0.L(12.0f) + z7Var4.o;
            if (q8Var.y1) {
            }
            z16 = z14;
            if (!q8Var.U1) {
                if (z17) {
                }
                arrayList7.add(z7.g(G2));
                z7Var4.o = org.telegram.messenger.g0.L(f12) + z7Var4.o;
            }
            if (q8Var.y1) {
                String M0122 = hd.M0(2131744676, null);
                BitmapDrawable bitmapDrawable2 = q8Var.W1;
                z7 z7Var142 = new z7(9, false);
                z7Var142.e = M0122;
                z7Var142.d = bitmapDrawable2;
                z7Var142.q = 0;
                arrayList7.add(z7Var142);
                z7Var4.o = org.telegram.messenger.g0.L(50.0f) + z7Var4.o;
                arrayList7.add(z7.g(hd.M0(2131744675, null)));
                z7Var4.o = org.telegram.messenger.g0.L(72.0f) + z7Var4.o;
            }
            if (q8Var.G1) {
            }
            if (q8Var.F1) {
                String M0132 = hd.M0(2131748806, null);
                z7 z7Var152 = new z7(8, false);
                z7Var152.e = M0132;
                arrayList7.add(z7Var152);
                z7Var4.o = org.telegram.messenger.g0.L(40.0f) + z7Var4.o;
                z7 z7Var162 = new z7(10, false);
                z7Var162.q = 8;
                arrayList7.add(z7Var162);
                z7Var4.o = org.telegram.messenger.g0.L(75.0f) + z7Var4.o;
                arrayList7.add(z7.g(hd.M0(2131748804, null)));
                z7Var4.o = org.telegram.messenger.g0.L(50.0f) + z7Var4.o;
            }
        }
        z14 = false;
        z13 = true;
        if (z13) {
        }
        f12 = 80.0f;
        if (!q8Var.U1) {
        }
        z15 = q8Var.F1;
        String str32 = "StoryKeepGroupInfo";
        if (z15) {
        }
        arrayList7.add(z7.g(null));
        z7Var4.o = org.telegram.messenger.g0.L(12.0f) + z7Var4.o;
        if (q8Var.y1) {
        }
        z16 = z14;
        if (!q8Var.U1) {
        }
        if (q8Var.y1) {
        }
        if (q8Var.G1) {
        }
        if (q8Var.F1) {
        }
        L = 0.0f;
        boolean isEmpty22 = TextUtils.isEmpty(this.J);
        if (this.a != 0) {
        }
        if (this.h.t) {
        }
        h8Var = this.n;
        if (h8Var != null) {
        }
        this.e.invalidate();
    }

    public final void i(boolean z10) {
        org.telegram.ui.Cells.x3 x3Var = this.E;
        if (x3Var == null) {
            return;
        }
        if (q8.R0(this.c, this.d).size() > 0) {
            x3Var.a(hd.M0(2131743630, null), new a8(this, 2));
            return;
        }
        if (z10) {
            x3Var.setRightText(null);
            return;
        }
        org.telegram.ui.Cells.w3 w3Var = x3Var.b;
        w3Var.c(null, false, true);
        w3Var.setOnClickListener(null);
        w3Var.setVisibility(0);
    }

    public final void j(boolean z10) {
        e8 e8Var;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        HashSet R0 = q8.R0(this.c, this.d);
        int i7 = this.a;
        q8 q8Var = this.a0;
        if (i7 == 3) {
            q8Var.u1 = R0.size();
        } else if (i7 == 4) {
            q8Var.q1 = R0.size();
        }
        np s12 = np.s1(q8Var.a);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            e8Var = this.y;
            ArrayList arrayList4 = e8Var.e;
            arrayList = e8Var.e;
            if (i11 >= arrayList4.size()) {
                break;
            }
            f20 f20Var = (f20) arrayList.get(i11);
            if (!R0.contains(Long.valueOf(f20Var.getUid()))) {
                arrayList2.add(f20Var);
            }
            i11++;
        }
        Iterator it = R0.iterator();
        while (it.hasNext()) {
            Long l10 = (Long) it.next();
            long longValue = l10.longValue();
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList.size()) {
                    Object a22 = longValue >= 0 ? s12.a2(l10) : s12.M0(l10);
                    if (a22 != null) {
                        f20 f20Var2 = new f20(getContext(), a22, null, true, q8Var.J0);
                        f20Var2.setOnClickListener(this);
                        arrayList3.add(f20Var2);
                    }
                } else if (((f20) arrayList.get(i12)).getUid() == longValue) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        ah.n nVar = e8Var.d;
        ArrayList arrayList5 = nVar.e;
        ArrayList arrayList6 = nVar.d;
        ArrayList arrayList7 = nVar.f;
        n8 n8Var = (n8) nVar.n;
        n8Var.I = true;
        ArrayList arrayList8 = n8Var.e;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = nVar.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            ((f20) arrayList2.get(i13)).setOnClickListener(null);
        }
        nVar.c();
        if (z10) {
            nVar.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            nVar.b = animatorSet;
            animatorSet.addListener(new m8(nVar, arrayList2, i10));
            arrayList7.clear();
            arrayList6.clear();
            arrayList5.clear();
            int i14 = 0;
            while (true) {
                int size = arrayList2.size();
                property = View.ALPHA;
                property2 = View.SCALE_Y;
                property3 = View.SCALE_X;
                if (i14 >= size) {
                    break;
                }
                f20 f20Var3 = (f20) arrayList2.get(i14);
                arrayList5.add(f20Var3);
                arrayList7.add(ObjectAnimator.ofFloat(f20Var3, (Property<f20, Float>) property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(f20Var3, (Property<f20, Float>) property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(f20Var3, (Property<f20, Float>) property, 1.0f, 0.0f));
                i14++;
            }
            for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                f20 f20Var4 = (f20) arrayList3.get(i15);
                arrayList6.add(f20Var4);
                arrayList7.add(ObjectAnimator.ofFloat(f20Var4, (Property<f20, Float>) property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(f20Var4, (Property<f20, Float>) property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(f20Var4, (Property<f20, Float>) property, 0.0f, 1.0f));
            }
        } else {
            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                nVar.removeView((View) arrayList2.get(i16));
            }
            arrayList9.clear();
            nVar.b = null;
            nVar.c = false;
            n8Var.b.setAllowDrawCursor(true);
        }
        while (i10 < arrayList3.size()) {
            nVar.addView((View) arrayList3.get(i10));
            i10++;
        }
        nVar.requestLayout();
    }

    public final void k() {
        float c10 = c();
        boolean z10 = this.N;
        boolean z11 = false;
        e8 e8Var = this.y;
        if (z10 || this.V || getTranslationX() != 0.0f) {
            this.O = false;
            ValueAnimator valueAnimator = this.Q;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.Q = null;
            }
            e8Var.setTranslationY(c10);
        } else if (!this.O || Math.abs(this.P - c10) > 1.0f) {
            this.O = true;
            ValueAnimator valueAnimator2 = this.Q;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.Q = null;
            }
            float translationY = e8Var.getTranslationY();
            this.P = c10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, c10);
            this.Q = ofFloat;
            ofFloat.addUpdateListener(new j3(this, 6));
            this.Q.addListener(new ai.j0(this, 26));
            this.Q.setInterpolator(new LinearInterpolator());
            this.Q.setDuration(180L);
            this.Q.start();
        }
        boolean z12 = this.G;
        y7 y7Var = this.F;
        if (!z12) {
            y7Var.setVisibility(8);
            return;
        }
        y7Var.setVisibility(0);
        float f10 = -y7Var.getHeight();
        int i7 = 0;
        while (true) {
            uj0 uj0Var = this.f;
            if (i7 >= uj0Var.getChildCount()) {
                z11 = true;
                break;
            }
            View childAt = uj0Var.getChildAt(i7);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                f10 = this.e.getPaddingTop() + childAt.getY();
                break;
            }
            i7++;
        }
        if (this.R != z11) {
            this.R = z11;
            ((org.telegram.ui.ActionBar.x1) y7Var.e).c(true, (z11 || this.a != 0) ? 0.0f : 1.0f);
        }
        y7Var.setTranslationY(Math.max(org.telegram.messenger.g0.m, f10));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = q8.Y1;
        ns.f(this.a0.a).c(this, ns.T);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e8 e8Var = this.y;
        if (!e8Var.e.contains(view)) {
            return;
        }
        f20 f20Var = (f20) view;
        if (!f20Var.E) {
            f20 f20Var2 = e8Var.f;
            if (f20Var2 != null) {
                f20Var2.a();
                e8Var.f = null;
            }
            e8Var.f = f20Var;
            f20Var.b();
            return;
        }
        e8Var.f = null;
        ah.n nVar = e8Var.d;
        n8 n8Var = (n8) nVar.n;
        n8Var.I = true;
        n8Var.e.remove(f20Var);
        f20Var.setOnClickListener(null);
        nVar.c();
        nVar.c = false;
        AnimatorSet animatorSet = new AnimatorSet();
        nVar.b = animatorSet;
        animatorSet.addListener(new ah.l(7, nVar, f20Var));
        ArrayList arrayList = nVar.h;
        arrayList.clear();
        arrayList.add(f20Var);
        ArrayList arrayList2 = nVar.d;
        arrayList2.clear();
        nVar.e.clear();
        arrayList2.add(f20Var);
        ArrayList arrayList3 = nVar.f;
        arrayList3.clear();
        arrayList3.add(ObjectAnimator.ofFloat(f20Var, (Property<f20, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(f20Var, (Property<f20, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(f20Var, (Property<f20, Float>) View.ALPHA, 1.0f, 0.0f));
        nVar.requestLayout();
        long uid = f20Var.getUid();
        Iterator it = this.d.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            ArrayList arrayList4 = this.c;
            if (!hasNext) {
                arrayList4.remove(Long.valueOf(uid));
                g(true);
                f(true);
                return;
            } else {
                Map.Entry entry = (Map.Entry) it.next();
                if (((ArrayList) entry.getValue()).contains(Long.valueOf(uid))) {
                    it.remove();
                    arrayList4.addAll((Collection) entry.getValue());
                    arrayList4.remove(Long.valueOf(uid));
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = q8.Y1;
        ns.f(this.a0.a).n(this, ns.T);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11 = q8.Y1;
        q8 q8Var = this.a0;
        int i12 = q8Var.f;
        if (i12 > 0) {
            this.U = i12;
        }
        super.onMeasure(i7, i10);
        this.e.setPadding(0, org.telegram.messenger.g0.m + (this.a == 0 ? 0 : org.telegram.messenger.g0.L(56.0f)), 0, 0);
        boolean z10 = this.W;
        boolean z11 = q8Var.d;
        uj0 uj0Var = this.f;
        j8 j8Var = this.r;
        if (z10 != z11) {
            float c10 = c();
            int i13 = 2;
            if (q8Var.d && c10 + Math.min(org.telegram.messenger.g0.L(150.0f), this.y.L) > uj0Var.getPaddingTop()) {
                pi.l lVar = new pi.l(getContext(), 2, 0.7f);
                lVar.a = 1;
                lVar.p = -org.telegram.messenger.g0.L(56.0f);
                this.h.w0(lVar);
            }
            int i14 = this.a;
            View view = this.s;
            if (i14 == 0) {
                j8Var.setTranslationY(q8Var.d ? this.U : 0.0f);
                view.setTranslationY(q8Var.d ? this.U : 0.0f);
            } else {
                float f10 = q8Var.d ? this.U : -this.U;
                ValueAnimator valueAnimator = j8Var.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    j8Var.d = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                j8Var.d = ofFloat;
                ofFloat.addUpdateListener(new i8(j8Var, 1));
                j8Var.d.addListener(new ai.j0(j8Var, 27));
                j8Var.d.setDuration(250L);
                ValueAnimator valueAnimator2 = j8Var.d;
                er erVar = org.telegram.ui.ActionBar.i1.w;
                valueAnimator2.setInterpolator(erVar);
                j8Var.d.start();
                view.setTranslationY(q8Var.d ? this.U : -this.U);
                this.V = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(erVar).withEndAction(new b8(this, i13)).start();
            }
            this.W = q8Var.d;
        }
        uj0Var.setPadding(0, 0, 0, j8Var.getMeasuredHeight());
    }
}
