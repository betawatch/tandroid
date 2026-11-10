package fi;

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
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class n8 extends FrameLayout implements View.OnClickListener, ls {
    public final org.telegram.ui.Cells.x3 D;
    public final a8 E;
    public boolean F;
    public org.telegram.ui.ActionBar.u1 G;
    public long H;
    public String I;
    public final ArrayList J;
    public final ArrayList K;
    public final ArrayList L;
    public boolean M;
    public boolean N;
    public float O;
    public ValueAnimator P;
    public boolean Q;
    public int R;
    public boolean S;
    public int T;
    public boolean U;
    public boolean V;
    public final /* synthetic */ s8 W;
    public int a;
    public final a0.h b;
    public final ArrayList c;
    public final HashMap d;
    public final FrameLayout e;
    public final pj0 f;
    public final v4.b0 h;
    public final j8 n;
    public final l8 r;
    public final View s;
    public final d w;
    public final d x;
    public final g8 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(s8 s8Var, Context context) {
        super(context);
        this.W = s8Var;
        this.b = new a0.h();
        this.c = new ArrayList();
        this.d = new HashMap();
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.R = -1;
        int i7 = s8.X1;
        org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(context, s8Var.I0);
        this.D = x3Var;
        g8 g8Var = new g8(this, context, s8Var.I0, new d8(this, 4));
        this.y = g8Var;
        int i10 = org.telegram.ui.ActionBar.m6.h5;
        org.telegram.ui.ActionBar.t6.h(i10, g8Var, s8Var.I0);
        g8Var.setOnSearchTextChange(new e8(this, 3));
        a8 a8Var = new a8(context, s8Var.I0);
        this.E = a8Var;
        a8Var.h = new d8(this, 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        int i11 = 0;
        frameLayout.setPadding(0, org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, c8.ha.e(-1, -1, qs.E1));
        pj0 pj0Var = new pj0(context, s8Var.I0);
        this.f = pj0Var;
        pj0Var.setClipToPadding(false);
        pj0Var.setTranslateSelector(true);
        j8 j8Var = new j8(this, context, s8Var.I0, g8Var, new di.x3(s8Var, 2));
        this.n = j8Var;
        pj0Var.setAdapter(j8Var);
        j8Var.h = pj0Var;
        v4.b0 b0Var = new v4.b0();
        this.h = b0Var;
        pj0Var.setLayoutManager(b0Var);
        pj0Var.setOnScrollListener(new h8(i11, this));
        pj0Var.setOnItemClickListener(new ab.g(14, this, context));
        frameLayout.addView(pj0Var, c8.ha.c(-1.0f, -1));
        i8 i8Var = new i8(this);
        i8Var.n(350L);
        i8Var.o(wq.h);
        i8Var.C = false;
        i8Var.m = false;
        pj0Var.setItemAnimator(i8Var);
        frameLayout.addView(g8Var, c8.ha.e(-1, -2, 55));
        frameLayout.addView(x3Var, c8.ha.e(-1, 32, 55));
        addView(a8Var, c8.ha.e(-1, -2, 55));
        l8 l8Var = new l8(this, context);
        this.r = l8Var;
        l8Var.setClickable(true);
        l8Var.setOrientation(1);
        l8Var.setPadding(org.telegram.messenger.g0.L(10.0f) + s8Var.t0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f) + s8Var.t0, org.telegram.messenger.g0.L(10.0f));
        org.telegram.ui.ActionBar.t6.h(i10, l8Var, s8Var.I0);
        d dVar = new d(context, s8Var.I0, true);
        this.w = dVar;
        dVar.setOnClickListener(new c8(this, i11));
        dVar.f();
        l8Var.addView(dVar, c8.ha.r(-1, 48, 87));
        d dVar2 = new d(context, s8Var.I0, false);
        this.x = dVar2;
        dVar2.setOnClickListener(new c8(this, 1));
        dVar2.f();
        l8Var.addView(dVar2, c8.ha.t(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.s = view;
        org.telegram.ui.ActionBar.t6.h(i10, view, s8Var.I0);
        addView(view, c8.ha.d(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
        addView(l8Var, c8.ha.e(-1, -2, 87));
    }

    public static boolean d(String str, TLObject tLObject) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            String lowerCase = org.telegram.messenger.g0.O3(t10.p(user)).toLowerCase();
            if (lowerCase.startsWith(str) || jg.g.A(" ", str, lowerCase)) {
                return true;
            }
            String lowerCase2 = org.telegram.messenger.g0.O3(t10.n(user)).toLowerCase();
            if (lowerCase2.startsWith(str) || jg.g.A(" ", str, lowerCase2)) {
                return true;
            }
            ArrayList<TLRPC.TL_username> arrayList = user.usernames;
            if (arrayList != null) {
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    TLRPC.TL_username tL_username = arrayList.get(i7);
                    if (tL_username.active && org.telegram.messenger.g0.O3(tL_username.username).toLowerCase().startsWith(str)) {
                        return true;
                    }
                }
            }
        } else if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String lowerCase3 = org.telegram.messenger.g0.O3(chat.title).toLowerCase();
            if (lowerCase3.startsWith(str) || jg.g.A(" ", str, lowerCase3)) {
                return true;
            }
            String lowerCase4 = org.telegram.messenger.g0.O3(org.telegram.messenger.t3.K(chat, false)).toLowerCase();
            if (lowerCase4.startsWith(str) || jg.g.A(" ", str, lowerCase4)) {
                return true;
            }
            ArrayList<TLRPC.TL_username> arrayList2 = chat.usernames;
            if (arrayList2 != null) {
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    TLRPC.TL_username tL_username2 = arrayList2.get(i10);
                    if (tL_username2.active && org.telegram.messenger.g0.O3(tL_username2.username).toLowerCase().startsWith(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void a(boolean z9) {
        if (this.a != 6) {
            return;
        }
        ArrayList arrayList = this.c;
        arrayList.clear();
        int i7 = s8.X1;
        arrayList.addAll(qp.s1(this.W.a).P1().L);
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
        if (z9) {
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
        s8 s8Var = this.W;
        if (i7 == 4) {
            arrayList.addAll(s8Var.n1);
            hashMap.putAll(s8Var.o1);
        } else if (i7 == 5) {
            arrayList.addAll(s8Var.D1);
        } else if (i7 == 1) {
            ArrayList J0 = s8.J0(s8Var);
            for (int i10 = 0; i10 < J0.size(); i10 = com.google.android.recaptcha.internal.a.g(i10, 1, ((TLRPC.User) J0.get(i10)).id, arrayList)) {
            }
        } else if (i7 == 2) {
            arrayList.addAll(s8Var.q1);
        } else if (i7 == 3) {
            arrayList.addAll(s8Var.r1);
            hashMap.putAll(s8Var.s1);
        } else if (i7 == 6) {
            a(false);
        }
        this.n.getClass();
        this.h.k1(false);
        j(false);
        g8 g8Var = this.y;
        g8Var.setText("");
        g8Var.setVisibility(i7 == 0 ? 8 : 0);
        g8Var.L = true;
        this.I = null;
        h(false);
        f(false);
        g(false);
        int i11 = this.a;
        pj0 pj0Var = this.f;
        if (i11 != 0) {
            pj0Var.v0(0);
        }
        pj0Var.requestLayout();
        this.R = -1;
    }

    public final float c() {
        int i7 = 0;
        float f10 = -jg.g.e(150.0f, Math.min(org.telegram.messenger.g0.L(150.0f), this.y.K), 0);
        while (true) {
            pj0 pj0Var = this.f;
            if (i7 >= pj0Var.getChildCount()) {
                return f10;
            }
            View childAt = pj0Var.getChildAt(i7);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 34) {
                return Math.max(f10, childAt.getY());
            }
            i7++;
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.ChatFull chatFull;
        org.telegram.ui.ActionBar.u1 u1Var;
        if (i7 != qs.T || (chatFull = (TLRPC.ChatFull) objArr[0]) == null || (u1Var = this.G) == null || this.H != chatFull.id) {
            return;
        }
        u1Var.c(350L);
        this.G = null;
        this.H = -1L;
        e(chatFull.id, chatFull.participants);
    }

    public final void e(long j3, TLRPC.ChatParticipants chatParticipants) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i7 = this.a;
        int i10 = 0;
        boolean z9 = i7 == 1 || i7 == 2;
        s8 s8Var = this.W;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i11 = 0; i11 < chatParticipants.participants.size(); i11++) {
                long j10 = chatParticipants.participants.get(i11).user_id;
                int i12 = s8.X1;
                TLRPC.User a22 = qp.s1(s8Var.a).a2(Long.valueOf(j10));
                if (a22 != null && !t10.B(a22) && !a22.bot && a22.id != 777000 && j10 != 0) {
                    if (!z9 || a22.contact) {
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
            this.y.L = true;
            return;
        }
        if (arrayList.isEmpty()) {
            Context context = getContext();
            int i13 = s8.X1;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, s8Var.I0);
            alertDialog$Builder.a.T = id.M0(2131744538, null);
            jg.g.w(null, 2131752589, alertDialog$Builder, null);
            return;
        }
        Context context2 = getContext();
        int i14 = s8.X1;
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, context2, s8Var.I0);
        alertDialog$Builder2.a.T = id.G(arrayList2.size(), "StoryPrivacyGroupNonContacts", new Object[0]);
        alertDialog$Builder2.k(id.G(arrayList.size(), "StoryPrivacyGroupAddContacts", new Object[0]), new bi.i(this, j3, arrayList, 2));
        jg.g.w(null, 2131752589, alertDialog$Builder2, null);
    }

    public final void f(boolean z9) {
        int i7 = this.a;
        s8 s8Var = this.W;
        d dVar = this.x;
        int i10 = 0;
        d dVar2 = this.w;
        if (i7 == 0) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.c(0, z9);
            if (s8Var.F1) {
                dVar2.i(id.M0(2131744554, null), z9, true);
            } else if (s8Var.T1) {
                dVar2.i(id.M0(2131744554, null), z9, true);
            } else {
                int i11 = s8Var.C1;
                if (i11 == 1) {
                    dVar2.i(id.M0(s8Var.E1 ? 2131744619 : 2131744558, null), z9, true);
                } else {
                    dVar2.i(id.H(',', "StoryPrivacyButtonPostMultiple", i11), z9, true);
                }
            }
            dVar.setVisibility(8);
            return;
        }
        ArrayList arrayList = this.c;
        if (i7 == 1) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.i(id.M0(2131744553, null), z9, true);
            dVar2.c(arrayList.size(), z9);
            dVar.setVisibility(8);
            return;
        }
        l8 l8Var = this.r;
        if (i7 == 3) {
            int size = s8.R0(arrayList, this.d).size();
            s8Var.t1 = size;
            dVar2.i(id.M0(2131744554, null), z9, true);
            dVar2.setShowZero(false);
            l8Var.b(size <= 0, z9);
            dVar2.c(size, z9);
            dVar2.setEnabled(size > 0);
            dVar.setVisibility(8);
            return;
        }
        if (i7 == 2) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            if (arrayList.isEmpty()) {
                dVar2.i(id.M0(2131744554, null), z9, true);
                dVar2.c(0, z9);
            } else {
                dVar2.i(id.M0(2131744559, null), z9, true);
                dVar2.c(arrayList.size(), z9);
            }
            dVar.setVisibility(8);
            return;
        }
        if (i7 == 5) {
            dVar2.setShowZero(true);
            dVar2.setEnabled(!arrayList.isEmpty());
            dVar2.c(arrayList.size(), z9);
            dVar.setVisibility(8);
            return;
        }
        if (i7 != 6) {
            if (i7 == 4) {
                int size2 = s8.R0(s8Var.n1, s8Var.o1).size();
                s8Var.p1 = size2;
                dVar2.i(id.M0(2131744554, null), z9, true);
                dVar2.setShowZero(false);
                l8Var.b(false, z9);
                dVar2.c(size2, z9);
                dVar2.setEnabled(true);
                dVar.setVisibility(8);
                return;
            }
            return;
        }
        dVar2.setShowZero(false);
        dVar2.setEnabled(true);
        dVar2.i(id.M0(2131744553, null), z9, true);
        int i12 = s8.X1;
        di.z6 P1 = qp.s1(s8Var.a).P1();
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
            dVar2.c(arrayList.size(), z9);
        }
        dVar.setVisibility(8);
    }

    public final void g(boolean z9) {
        ArrayList arrayList;
        int R;
        s8 s8Var = this.W;
        ArrayList arrayList2 = s8Var.D1;
        HashMap hashMap = s8Var.s1;
        ArrayList arrayList3 = s8Var.r1;
        ArrayList arrayList4 = s8Var.q1;
        HashMap hashMap2 = s8Var.o1;
        ArrayList arrayList5 = s8Var.n1;
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
        if (this.a == 3 && (s8Var.H1 != 3 || (arrayList6.isEmpty() && hashMap3.isEmpty()))) {
            if (arrayList6.isEmpty() && hashMap3.isEmpty()) {
                int i10 = this.R;
                if (i10 != -1) {
                    s8Var.H1 = i10;
                }
            } else {
                this.R = s8Var.H1;
                s8Var.H1 = 3;
            }
        }
        HashSet R0 = s8.R0(arrayList6, hashMap3);
        int i11 = 0;
        while (true) {
            arrayList = this.L;
            if (i11 >= arrayList.size()) {
                break;
            }
            b8 b8Var = (b8) arrayList.get(i11);
            if (b8Var != null) {
                int i12 = b8Var.i;
                if (i12 > 0) {
                    b8Var.k = s8Var.H1 == i12;
                    b8Var.l = false;
                } else {
                    TLRPC.User user = b8Var.g;
                    if (user != null) {
                        boolean contains = arrayList6.contains(Long.valueOf(user.id));
                        b8Var.k = contains;
                        b8Var.l = !contains && R0.contains(Long.valueOf(b8Var.g.id));
                    } else {
                        TLRPC.Chat chat = b8Var.h;
                        if (chat != null) {
                            b8Var.k = hashMap3.containsKey(Long.valueOf(chat.id));
                            b8Var.l = false;
                        }
                    }
                }
            }
            i11++;
        }
        int i13 = 0;
        while (true) {
            pj0 pj0Var = this.f;
            if (i13 >= pj0Var.getChildCount()) {
                i(z9);
                return;
            }
            View childAt = pj0Var.getChildAt(i13);
            if ((childAt instanceof r8) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                b8 b8Var2 = (b8) arrayList.get(R);
                r8 r8Var = (r8) childAt;
                r8Var.c(b8Var2.k || b8Var2.l, z9);
                TLRPC.Chat chat2 = b8Var2.h;
                if (chat2 != null) {
                    r8Var.b(z9, s8.K0(s8Var, chat2) > 200 ? 0.3f : 1.0f);
                } else {
                    if (b8Var2.l && !b8Var2.k) {
                        r8 = 0.5f;
                    }
                    r8Var.b(z9, r8);
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
    public final void h(boolean z9) {
        float L;
        float L2;
        j8 j8Var;
        ArrayList arrayList;
        long j3;
        boolean z10;
        float f10;
        boolean z11;
        float f11;
        TLRPC.User a22;
        TLRPC.Chat M0;
        int i7;
        ArrayList arrayList2;
        int i10;
        int i11;
        TLRPC.Chat M02;
        boolean z12;
        boolean z13;
        String G;
        float f12;
        boolean z14;
        boolean z15;
        boolean z16;
        String G2;
        String G3;
        s8 s8Var = this.W;
        ArrayList arrayList3 = s8Var.r1;
        ArrayList arrayList4 = s8Var.n1;
        ArrayList arrayList5 = s8Var.q1;
        HashSet hashSet = s8Var.u1;
        ArrayList arrayList6 = this.K;
        arrayList6.clear();
        ArrayList arrayList7 = this.L;
        arrayList6.addAll(arrayList7);
        arrayList7.clear();
        int i12 = this.a;
        org.telegram.ui.Cells.x3 x3Var = this.D;
        if (i12 != 0) {
            a8 a8Var = this.E;
            if (i12 == 1) {
                a8Var.e(id.M0(2131744573, null));
                a8Var.d(true);
                ((org.telegram.ui.ActionBar.y1) a8Var.e).c(false, 0.0f);
                arrayList7.add(b8.d());
                arrayList7.add(b8.c());
                arrayList7.size();
                arrayList7.add(b8.e());
                arrayList7.add(b8.f());
                L2 = org.telegram.messenger.g0.L(32.0f) + org.telegram.messenger.g0.L(56.0f) + 0.0f + org.telegram.messenger.g0.L(150.0f);
                x3Var.setText(id.M0(2131744574, null));
                i(z9);
                this.F = true;
            } else if (i12 == 2) {
                a8Var.e(id.M0(2131744568, null));
                a8Var.d(true);
                ((org.telegram.ui.ActionBar.y1) a8Var.e).c(false, 0.0f);
                arrayList7.add(b8.d());
                arrayList7.add(b8.c());
                arrayList7.size();
                arrayList7.add(b8.e());
                arrayList7.add(b8.f());
                L2 = org.telegram.messenger.g0.L(32.0f) + org.telegram.messenger.g0.L(56.0f) + 0.0f + org.telegram.messenger.g0.L(150.0f);
                x3Var.setText(id.M0(2131744569, null));
                i(z9);
                this.F = true;
            } else if (i12 == 3) {
                a8Var.e(id.M0(2131744566, null));
                a8Var.d(true);
                ((org.telegram.ui.ActionBar.y1) a8Var.e).c(false, 0.0f);
                arrayList7.add(b8.d());
                arrayList7.add(b8.c());
                arrayList7.size();
                arrayList7.add(b8.e());
                arrayList7.add(b8.f());
                L2 = org.telegram.messenger.g0.L(32.0f) + org.telegram.messenger.g0.L(56.0f) + 0.0f + org.telegram.messenger.g0.L(150.0f);
                x3Var.setText(id.M0(2131744567, null));
                i(z9);
                this.F = true;
            } else if (i12 == 5) {
                a8Var.e(id.M0(2131744577, null));
                a8Var.d(s8Var.I1);
                ((org.telegram.ui.ActionBar.y1) a8Var.e).c(false, 0.0f);
                arrayList7.add(b8.d());
                arrayList7.add(b8.c());
                arrayList7.size();
                arrayList7.add(b8.e());
                arrayList7.add(b8.f());
                L2 = org.telegram.messenger.g0.L(32.0f) + org.telegram.messenger.g0.L(56.0f) + 0.0f + org.telegram.messenger.g0.L(150.0f);
                x3Var.setText(id.M0(2131744578, null));
                i(z9);
                this.F = true;
            } else if (i12 == 6) {
                a8Var.e(id.M0(2131744575, null));
                a8Var.d(true);
                ((org.telegram.ui.ActionBar.y1) a8Var.e).c(false, 0.0f);
                arrayList7.add(b8.d());
                arrayList7.add(b8.c());
                arrayList7.size();
                arrayList7.add(b8.e());
                arrayList7.add(b8.f());
                L2 = org.telegram.messenger.g0.L(32.0f) + org.telegram.messenger.g0.L(56.0f) + 0.0f + org.telegram.messenger.g0.L(150.0f);
                x3Var.setText(id.M0(2131744576, null));
                i(z9);
                this.F = true;
            } else if (i12 == 4) {
                a8Var.e(id.M0(2131744570, null));
                a8Var.d(true);
                ((org.telegram.ui.ActionBar.y1) a8Var.e).c(false, 0.0f);
                arrayList7.add(b8.d());
                arrayList7.add(b8.c());
                arrayList7.size();
                arrayList7.add(b8.e());
                arrayList7.add(b8.f());
                L = org.telegram.messenger.g0.L(56.0f) + 0.0f + org.telegram.messenger.g0.L(150.0f) + org.telegram.messenger.g0.L(32.0f);
                x3Var.setText(id.M0(2131744571, null));
                i(z9);
                this.F = true;
                boolean isEmpty = TextUtils.isEmpty(this.I);
                if (this.a != 0) {
                    String lowerCase = org.telegram.messenger.g0.O3(this.I).toLowerCase();
                    int i13 = this.a;
                    if (i13 == 5) {
                        ArrayList arrayList8 = new ArrayList();
                        qp s12 = qp.s1(s8Var.a);
                        ArrayList arrayList9 = s12.y;
                        for (int i14 = 0; i14 < arrayList9.size(); i14++) {
                            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList9.get(i14);
                            if (s12.y(dialog)) {
                                if (org.telegram.messenger.m5.E(dialog.id)) {
                                    TLRPC.User a23 = s12.a2(Long.valueOf(dialog.id));
                                    if (a23 != null && !a23.bot && a23.id != 777000 && !t10.B(a23)) {
                                        arrayList8.add(a23);
                                    }
                                } else if (org.telegram.messenger.m5.z(dialog.id) && (M02 = s12.M0(Long.valueOf(-dialog.id))) != null && !org.telegram.messenger.t3.c0(M02)) {
                                    arrayList8.add(M02);
                                }
                            }
                        }
                        z10 = isEmpty;
                        arrayList = arrayList8;
                        f11 = L;
                    } else {
                        boolean z17 = i13 == 1 || i13 == 2;
                        boolean z18 = s8Var.S1 && (i13 == 3 || i13 == 6);
                        qp s13 = qp.s1(s8Var.a);
                        HashMap hashMap = new HashMap();
                        arrayList = new ArrayList();
                        ArrayList arrayList10 = s13.y;
                        ConcurrentHashMap concurrentHashMap = org.telegram.messenger.g5.r(s8Var.a).f0;
                        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
                            j3 = 777000;
                            if (s8Var.U1) {
                                z10 = isEmpty;
                                f10 = L;
                                z11 = z18;
                            } else {
                                f10 = L;
                                z11 = z18;
                                z10 = isEmpty;
                                org.telegram.messenger.g5.r(s8Var.a).A(0L, false);
                            }
                            s8Var.U1 = true;
                        } else {
                            z10 = isEmpty;
                            z11 = z18;
                            j3 = 777000;
                            f10 = L;
                        }
                        int i15 = 0;
                        while (i15 < arrayList10.size()) {
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList10.get(i15);
                            float f13 = f10;
                            if (org.telegram.messenger.m5.E(dialog2.id)) {
                                TLRPC.User a24 = s13.a2(Long.valueOf(dialog2.id));
                                if (a24 != null && !a24.bot && a24.id != j3 && !t10.B(a24) && !a24.deleted && (!z17 || (concurrentHashMap != null && concurrentHashMap.get(Long.valueOf(a24.id)) != null))) {
                                    hashMap.put(Long.valueOf(a24.id), Boolean.TRUE);
                                    arrayList.add(a24);
                                }
                            } else if (z11 && org.telegram.messenger.m5.z(dialog2.id) && (M0 = s13.M0(Long.valueOf(-dialog2.id))) != null && !org.telegram.messenger.t3.V(M0)) {
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
                                if (!hashMap.containsKey(l10) && (a22 = s13.a2(l10)) != null && !a22.bot && a22.id != j3 && !t10.B(a22)) {
                                    arrayList.add(a22);
                                    hashMap.put(Long.valueOf(a22.id), Boolean.TRUE);
                                }
                            }
                        }
                    }
                    ArrayList arrayList11 = this.c;
                    HashMap hashMap2 = this.d;
                    HashSet R0 = s8.R0(arrayList11, hashMap2);
                    ArrayList arrayList12 = this.J;
                    if (z10) {
                        if (!z9) {
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
                                b8 i19 = b8.i(user, contains, !contains && R0.contains(Long.valueOf(user.id)));
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
                                    b8 b8Var = new b8(3, true);
                                    b8Var.h = chat;
                                    b8Var.k = containsKey;
                                    int i21 = this.a;
                                    b8Var.m = i21 == 2 || i21 == 4;
                                    arrayList7.add(b8Var);
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
                        if ((!z10 || !arrayList12.contains(tLObject3)) && d(lowerCase, tLObject3)) {
                            if (tLObject3 instanceof TLRPC.User) {
                                TLRPC.User user2 = (TLRPC.User) tLObject3;
                                boolean contains2 = arrayList11.contains(Long.valueOf(user2.id));
                                b8 i23 = b8.i(user2, contains2, !contains2 && R0.contains(Long.valueOf(user2.id)));
                                int i24 = this.a;
                                i23.m = i24 == 2 || i24 == 4;
                                arrayList7.add(i23);
                                f11 += org.telegram.messenger.g0.L(56.0f);
                                i7++;
                            } else if (tLObject3 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject3;
                                boolean containsKey2 = hashMap2.containsKey(Long.valueOf(chat2.id));
                                arrayList2 = arrayList11;
                                b8 b8Var2 = new b8(3, true);
                                b8Var2.h = chat2;
                                b8Var2.k = containsKey2;
                                int i25 = this.a;
                                b8Var2.m = i25 == 2 || i25 == 4;
                                arrayList7.add(b8Var2);
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
                    if (!z10) {
                        if (i7 == 0) {
                            arrayList7.add(new b8(5, false));
                            f11 += org.telegram.messenger.g0.L(150.0f);
                        }
                        pj0 pj0Var = this.f;
                        float measuredHeight = (pj0Var != null ? ((pj0Var.getMeasuredHeight() - pj0Var.getPaddingTop()) - pj0Var.getPaddingBottom()) + (s8Var.d ? this.T : 0) : ((org.telegram.messenger.g0.q.y - org.telegram.messenger.g0.L(56.0f)) - org.telegram.messenger.g0.n) - org.telegram.messenger.g0.L(42.0f)) - f11;
                        if (measuredHeight > 0.0f) {
                            b8 b8Var3 = new b8(-1, false);
                            b8Var3.p = (int) measuredHeight;
                            arrayList7.add(b8Var3);
                        }
                    }
                }
                if (this.h.t) {
                    Collections.reverse(arrayList7);
                }
                j8Var = this.n;
                if (j8Var != null) {
                    if (!z9 || s8Var.H1 == 0) {
                        j8Var.f();
                    } else {
                        j8Var.E(arrayList6, arrayList7);
                    }
                }
                this.e.invalidate();
            }
            L = L2;
            boolean isEmpty2 = TextUtils.isEmpty(this.I);
            if (this.a != 0) {
            }
            if (this.h.t) {
            }
            j8Var = this.n;
            if (j8Var != null) {
            }
            this.e.invalidate();
        }
        this.F = false;
        x3Var.setVisibility(8);
        int i26 = s8.X1;
        ArrayList arrayList13 = qp.s1(s8Var.a).P1().T;
        b8 b8Var4 = new b8(-1, false);
        b8Var4.o = 24;
        arrayList7.add(b8Var4);
        if (s8Var.F1) {
            String M03 = id.M0(2131748789, null);
            b8 b8Var5 = new b8(11, false);
            b8Var5.e = M03;
            arrayList7.add(b8Var5);
            b8Var4.o = org.telegram.messenger.g0.L(72.0f) + b8Var4.o;
        } else if (s8Var.z1 && (s8Var.T1 || arrayList13 == null || arrayList13.size() <= 1)) {
            String M04 = s8Var.T1 ? id.M0(2131744572, null) : id.M0(s8Var.E1 ? 2131744620 : 2131744561, null);
            if (s8Var.E1) {
                G = id.M0(2131744621, null);
            } else {
                int i27 = s8Var.K1;
                G = i27 != Integer.MAX_VALUE ? id.G(i27 / 3600, "StoryPrivacyAlertSubtitle", new Object[0]) : id.M0(2131744564, null);
            }
            b8 b8Var6 = new b8(4, false);
            b8Var6.e = M04;
            b8Var6.f = G;
            arrayList7.add(b8Var6);
            b8Var4.o = org.telegram.messenger.g0.L(72.0f) + b8Var4.o;
        } else {
            String M05 = id.M0(s8Var.E1 ? 2131744618 : 2131744518, null);
            b8 b8Var7 = new b8(8, false);
            b8Var7.e = M05;
            arrayList7.add(b8Var7);
            b8Var4.o = org.telegram.messenger.g0.L(50.0f) + b8Var4.o;
            TLRPC.InputPeer inputPeer = s8Var.m1;
            if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                b8 i28 = b8.i(p10.i(s8Var.a).f(), false, false);
                i28.n = true;
                arrayList7.add(i28);
                b8Var4.o = org.telegram.messenger.g0.L(62.0f) + b8Var4.o;
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                b8 i29 = b8.i(qp.s1(s8Var.a).a2(Long.valueOf(s8Var.m1.user_id)), false, false);
                i29.n = true;
                arrayList7.add(i29);
                b8Var4.o = org.telegram.messenger.g0.L(62.0f) + b8Var4.o;
            } else {
                if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.Chat M06 = qp.s1(s8Var.a).M0(Long.valueOf(s8Var.m1.channel_id));
                    b8 b8Var8 = new b8(3, true);
                    b8Var8.h = M06;
                    b8Var8.k = false;
                    b8Var8.n = true;
                    arrayList7.add(b8Var8);
                    z13 = org.telegram.messenger.t3.V(M06);
                    b8Var4.o = org.telegram.messenger.g0.L(104.0f) + b8Var4.o;
                    z12 = false;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.Chat M07 = qp.s1(s8Var.a).M0(Long.valueOf(s8Var.m1.chat_id));
                    b8 b8Var9 = new b8(3, true);
                    b8Var9.h = M07;
                    b8Var9.k = false;
                    b8Var9.n = true;
                    arrayList7.add(b8Var9);
                    b8Var4.o = org.telegram.messenger.g0.L(104.0f) + b8Var4.o;
                    z13 = false;
                    z12 = false;
                }
                b8 g10 = b8.g(null);
                g10.c = !z12 ? 1 : 2;
                arrayList7.add(g10);
                b8Var4.o = org.telegram.messenger.g0.L(12.0f) + b8Var4.o;
                if (z12) {
                    String M08 = id.M0(s8Var.E1 ? 2131744617 : 2131744513, null);
                    b8 b8Var10 = new b8(8, false);
                    b8Var10.e = M08;
                    arrayList7.add(b8Var10);
                    b8Var4.o = org.telegram.messenger.g0.L(40.0f) + b8Var4.o;
                }
                if (z12 || s8Var.F1) {
                    f12 = 80.0f;
                } else {
                    f12 = 80.0f;
                    b8 h = b8.h(4, s8Var.p1, s8Var.H1 == 4);
                    arrayList7.add(h);
                    b8Var4.o = org.telegram.messenger.g0.L(56.0f) + b8Var4.o;
                    if (s8Var.p1 == 1) {
                        if (arrayList4.size() != 1) {
                            Iterator it2 = s8Var.o1.values().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList14 = (ArrayList) it2.next();
                                if (arrayList14.size() >= 1) {
                                    h.g = qp.s1(s8Var.a).a2((Long) arrayList14.get(0));
                                    break;
                                }
                            }
                        } else {
                            h.g = qp.s1(s8Var.a).a2((Long) arrayList4.get(0));
                        }
                    }
                    b8 h7 = b8.h(2, arrayList5.size(), s8Var.H1 == 2);
                    arrayList7.add(h7);
                    b8Var4.o = org.telegram.messenger.g0.L(56.0f) + b8Var4.o;
                    if (arrayList5.size() == 1) {
                        h7.g = qp.s1(s8Var.a).a2((Long) arrayList5.get(0));
                    }
                    ArrayList J0 = s8.J0(s8Var);
                    b8 h10 = b8.h(1, J0.size(), s8Var.H1 == 1);
                    arrayList7.add(h10);
                    b8Var4.o = org.telegram.messenger.g0.L(56.0f) + b8Var4.o;
                    if (J0.size() == 1 && (J0.get(0) instanceof TLRPC.User)) {
                        h10.g = (TLRPC.User) J0.get(0);
                    }
                    b8 h11 = b8.h(3, s8Var.t1, s8Var.H1 == 3);
                    arrayList7.add(h11);
                    b8Var4.o = org.telegram.messenger.g0.L(56.0f) + b8Var4.o;
                    if (s8Var.t1 == 1) {
                        if (arrayList3.size() != 1) {
                            Iterator it3 = s8Var.s1.values().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList15 = (ArrayList) it3.next();
                                if (arrayList15.size() >= 1) {
                                    h11.g = qp.s1(s8Var.a).a2((Long) arrayList15.get(0));
                                    break;
                                }
                            }
                        } else {
                            h11.g = qp.s1(s8Var.a).a2((Long) arrayList3.get(0));
                        }
                    }
                    int i30 = qp.s1(s8Var.a).P1().N;
                    arrayList7.add(b8.g(org.telegram.messenger.g0.S2(i30 <= 0 ? id.M0(s8Var.E1 ? 2131744628 : 2131744716, null) : id.G(i30, s8Var.E1 ? "StoryLiveBlockList" : "StoryBlockList", new Object[0]), org.telegram.ui.ActionBar.m6.Uc, 0, new d8(this, 3), s8Var.I0)));
                    b8Var4.o = org.telegram.messenger.g0.L(80.0f) + b8Var4.o;
                }
                if (!s8Var.T1) {
                    if (s8Var.E1 && !s8Var.F1) {
                        if (s8Var.A1) {
                            arrayList7.add(b8.b(id.M0(2131748797, null), "", 5));
                            b8Var4.o = org.telegram.messenger.g0.L(50.0f) + b8Var4.o;
                            arrayList7.add(b8.b(id.M0(2131748803, null), "", 6));
                            b8Var4.o = org.telegram.messenger.g0.L(50.0f) + b8Var4.o;
                            arrayList7.add(b8.g(null));
                            b8Var4.o = org.telegram.messenger.g0.L(12.0f) + b8Var4.o;
                        } else {
                            arrayList7.add(b8.b(id.M0(2131748802, null), "", 5));
                            b8Var4.o = org.telegram.messenger.g0.L(50.0f) + b8Var4.o;
                            arrayList7.add(b8.g(id.M0(2131748801, null)));
                            b8Var4.o = org.telegram.messenger.g0.L(30.0f) + b8Var4.o;
                        }
                    }
                    if (s8Var.E1) {
                        String M09 = id.M0(2131744630, null);
                        boolean z19 = s8Var.v1;
                        b8 b8Var11 = new b8(7, false);
                        b8Var11.c = 2;
                        b8Var11.e = M09;
                        b8Var11.k = z19;
                        arrayList7.add(b8Var11);
                        b8Var4.o = org.telegram.messenger.g0.L(50.0f) + b8Var4.o;
                    }
                    if (!s8Var.F1) {
                        String M010 = id.M0(2131744729, null);
                        boolean z20 = s8Var.w1;
                        b8 b8Var12 = new b8(7, false);
                        b8Var12.c = 0;
                        b8Var12.e = M010;
                        b8Var12.k = z20;
                        arrayList7.add(b8Var12);
                        b8Var4.o = org.telegram.messenger.g0.L(50.0f) + b8Var4.o;
                    }
                    if (!s8Var.E1 && !s8Var.F1) {
                        String M011 = id.M0(z12 ? 2131744658 : z13 ? 2131744657 : 2131744652, null);
                        boolean z21 = s8Var.x1;
                        b8 b8Var13 = new b8(7, false);
                        b8Var13.c = 1;
                        b8Var13.e = M011;
                        b8Var13.k = z21;
                        arrayList7.add(b8Var13);
                        b8Var4.o = org.telegram.messenger.g0.L(50.0f) + b8Var4.o;
                    }
                }
                z14 = s8Var.E1;
                String str = "StoryKeepGroupInfo";
                if (!z14 || s8Var.F1) {
                    arrayList7.add(b8.g(null));
                    b8Var4.o = org.telegram.messenger.g0.L(12.0f) + b8Var4.o;
                } else if (!s8Var.T1 && s8Var.y1 && s8Var.W1 != null) {
                    if (z14) {
                        G3 = id.M0(z12 ? 2131744623 : z13 ? 2131744625 : 2131744624, null);
                    } else {
                        String str2 = z12 ? "StoryKeepInfo" : z13 ? "StoryKeepChannelInfo" : "StoryKeepGroupInfo";
                        int i31 = s8Var.K1;
                        if (i31 == Integer.MAX_VALUE) {
                            i31 = 86400;
                        }
                        G3 = id.G(i31 / 3600, str2, new Object[0]);
                    }
                    arrayList7.add(b8.g(G3));
                    b8Var4.o = org.telegram.messenger.g0.L(f12) + b8Var4.o;
                }
                if (s8Var.x1 || s8Var.E1 || s8Var.F1) {
                    z15 = z13;
                } else {
                    TLRPC.InputPeer inputPeer2 = s8Var.m1;
                    long n10 = inputPeer2 != null ? org.telegram.messenger.m5.n(inputPeer2) : p10.i(s8Var.a).e();
                    qp.s1(s8Var.a).P1().B(n10, true);
                    StringBuilder sb2 = new StringBuilder();
                    if (hashSet.isEmpty()) {
                        sb2.append(id.M0(2131744786, null));
                    } else if (hashSet.size() < 3) {
                        Iterator it4 = hashSet.iterator();
                        while (it4.hasNext()) {
                            Iterator it5 = it4;
                            boolean z22 = z13;
                            di.s6 b10 = qp.s1(s8Var.a).P1().B(n10, true).b(((Integer) it4.next()).intValue());
                            if (b10 != null) {
                                if (sb2.length() != 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(b10.b);
                            }
                            it4 = it5;
                            z13 = z22;
                        }
                    } else {
                        z15 = z13;
                        sb2.append(id.G(hashSet.size(), "StoriesAlbumCount", new Object[0]));
                        arrayList7.add(b8.b(id.M0(2131744808, null), sb2, 1));
                        b8Var4.o = org.telegram.messenger.g0.L(50.0f) + b8Var4.o;
                    }
                    z15 = z13;
                    arrayList7.add(b8.b(id.M0(2131744808, null), sb2, 1));
                    b8Var4.o = org.telegram.messenger.g0.L(50.0f) + b8Var4.o;
                }
                if (!s8Var.T1 && ((!s8Var.y1 || s8Var.W1 == null) && !(z16 = s8Var.E1) && !s8Var.F1)) {
                    if (z16) {
                        if (z12) {
                            str = "StoryKeepInfo";
                        } else if (z15) {
                            str = "StoryKeepChannelInfo";
                        }
                        int i32 = s8Var.K1;
                        G2 = id.G((i32 == Integer.MAX_VALUE ? 86400 : i32) / 3600, str, new Object[0]);
                    } else {
                        G2 = id.M0(z12 ? 2131744623 : z15 ? 2131744625 : 2131744624, null);
                    }
                    arrayList7.add(b8.g(G2));
                    b8Var4.o = org.telegram.messenger.g0.L(f12) + b8Var4.o;
                }
                if (s8Var.x1 && s8Var.y1 && s8Var.W1 != null) {
                    String M012 = id.M0(2131744676, null);
                    BitmapDrawable bitmapDrawable = s8Var.V1;
                    b8 b8Var14 = new b8(9, false);
                    b8Var14.e = M012;
                    b8Var14.d = bitmapDrawable;
                    b8Var14.q = 0;
                    arrayList7.add(b8Var14);
                    b8Var4.o = org.telegram.messenger.g0.L(50.0f) + b8Var4.o;
                    arrayList7.add(b8.g(id.M0(2131744675, null)));
                    b8Var4.o = org.telegram.messenger.g0.L(72.0f) + b8Var4.o;
                }
                if (s8Var.F1) {
                    arrayList7.add(b8.b(id.M0(2131748797, null), "", 5));
                    b8Var4.o = org.telegram.messenger.g0.L(50.0f) + b8Var4.o;
                    arrayList7.add(b8.g(null));
                    b8Var4.o = org.telegram.messenger.g0.L(52.0f) + b8Var4.o;
                }
                if (s8Var.E1 && s8Var.v1) {
                    String M013 = id.M0(2131748806, null);
                    b8 b8Var15 = new b8(8, false);
                    b8Var15.e = M013;
                    arrayList7.add(b8Var15);
                    b8Var4.o = org.telegram.messenger.g0.L(40.0f) + b8Var4.o;
                    b8 b8Var16 = new b8(10, false);
                    b8Var16.q = 8;
                    arrayList7.add(b8Var16);
                    b8Var4.o = org.telegram.messenger.g0.L(75.0f) + b8Var4.o;
                    arrayList7.add(b8.g(id.M0(2131748804, null)));
                    b8Var4.o = org.telegram.messenger.g0.L(50.0f) + b8Var4.o;
                }
            }
            z13 = false;
            z12 = true;
            b8 g102 = b8.g(null);
            g102.c = !z12 ? 1 : 2;
            arrayList7.add(g102);
            b8Var4.o = org.telegram.messenger.g0.L(12.0f) + b8Var4.o;
            if (z12) {
            }
            if (z12) {
            }
            f12 = 80.0f;
            if (!s8Var.T1) {
            }
            z14 = s8Var.E1;
            String str3 = "StoryKeepGroupInfo";
            if (z14) {
            }
            arrayList7.add(b8.g(null));
            b8Var4.o = org.telegram.messenger.g0.L(12.0f) + b8Var4.o;
            if (s8Var.x1) {
            }
            z15 = z13;
            if (!s8Var.T1) {
                if (z16) {
                }
                arrayList7.add(b8.g(G2));
                b8Var4.o = org.telegram.messenger.g0.L(f12) + b8Var4.o;
            }
            if (s8Var.x1) {
                String M0122 = id.M0(2131744676, null);
                BitmapDrawable bitmapDrawable2 = s8Var.V1;
                b8 b8Var142 = new b8(9, false);
                b8Var142.e = M0122;
                b8Var142.d = bitmapDrawable2;
                b8Var142.q = 0;
                arrayList7.add(b8Var142);
                b8Var4.o = org.telegram.messenger.g0.L(50.0f) + b8Var4.o;
                arrayList7.add(b8.g(id.M0(2131744675, null)));
                b8Var4.o = org.telegram.messenger.g0.L(72.0f) + b8Var4.o;
            }
            if (s8Var.F1) {
            }
            if (s8Var.E1) {
                String M0132 = id.M0(2131748806, null);
                b8 b8Var152 = new b8(8, false);
                b8Var152.e = M0132;
                arrayList7.add(b8Var152);
                b8Var4.o = org.telegram.messenger.g0.L(40.0f) + b8Var4.o;
                b8 b8Var162 = new b8(10, false);
                b8Var162.q = 8;
                arrayList7.add(b8Var162);
                b8Var4.o = org.telegram.messenger.g0.L(75.0f) + b8Var4.o;
                arrayList7.add(b8.g(id.M0(2131748804, null)));
                b8Var4.o = org.telegram.messenger.g0.L(50.0f) + b8Var4.o;
            }
        }
        z13 = false;
        z12 = true;
        if (z12) {
        }
        f12 = 80.0f;
        if (!s8Var.T1) {
        }
        z14 = s8Var.E1;
        String str32 = "StoryKeepGroupInfo";
        if (z14) {
        }
        arrayList7.add(b8.g(null));
        b8Var4.o = org.telegram.messenger.g0.L(12.0f) + b8Var4.o;
        if (s8Var.x1) {
        }
        z15 = z13;
        if (!s8Var.T1) {
        }
        if (s8Var.x1) {
        }
        if (s8Var.F1) {
        }
        if (s8Var.E1) {
        }
        L = 0.0f;
        boolean isEmpty22 = TextUtils.isEmpty(this.I);
        if (this.a != 0) {
        }
        if (this.h.t) {
        }
        j8Var = this.n;
        if (j8Var != null) {
        }
        this.e.invalidate();
    }

    public final void i(boolean z9) {
        org.telegram.ui.Cells.x3 x3Var = this.D;
        if (x3Var == null) {
            return;
        }
        if (s8.R0(this.c, this.d).size() > 0) {
            x3Var.a(id.M0(2131743630, null), new c8(this, 2));
            return;
        }
        if (z9) {
            x3Var.setRightText(null);
            return;
        }
        org.telegram.ui.Cells.w3 w3Var = x3Var.b;
        w3Var.c(null, false, true);
        w3Var.setOnClickListener(null);
        w3Var.setVisibility(0);
    }

    public final void j(boolean z9) {
        g8 g8Var;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        HashSet R0 = s8.R0(this.c, this.d);
        int i7 = this.a;
        s8 s8Var = this.W;
        if (i7 == 3) {
            s8Var.t1 = R0.size();
        } else if (i7 == 4) {
            s8Var.p1 = R0.size();
        }
        qp s12 = qp.s1(s8Var.a);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            g8Var = this.y;
            ArrayList arrayList4 = g8Var.e;
            arrayList = g8Var.e;
            if (i11 >= arrayList4.size()) {
                break;
            }
            c20 c20Var = (c20) arrayList.get(i11);
            if (!R0.contains(Long.valueOf(c20Var.getUid()))) {
                arrayList2.add(c20Var);
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
                        c20 c20Var2 = new c20(getContext(), a22, null, true, s8Var.I0);
                        c20Var2.setOnClickListener(this);
                        arrayList3.add(c20Var2);
                    }
                } else if (((c20) arrayList.get(i12)).getUid() == longValue) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        ah.n nVar = g8Var.d;
        ArrayList arrayList5 = nVar.e;
        ArrayList arrayList6 = nVar.d;
        ArrayList arrayList7 = nVar.f;
        p8 p8Var = (p8) nVar.n;
        p8Var.H = true;
        ArrayList arrayList8 = p8Var.e;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = nVar.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            ((c20) arrayList2.get(i13)).setOnClickListener(null);
        }
        nVar.c();
        if (z9) {
            nVar.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            nVar.b = animatorSet;
            animatorSet.addListener(new o8(nVar, arrayList2, i10));
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
                c20 c20Var3 = (c20) arrayList2.get(i14);
                arrayList5.add(c20Var3);
                arrayList7.add(ObjectAnimator.ofFloat(c20Var3, (Property<c20, Float>) property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(c20Var3, (Property<c20, Float>) property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(c20Var3, (Property<c20, Float>) property, 1.0f, 0.0f));
                i14++;
            }
            for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                c20 c20Var4 = (c20) arrayList3.get(i15);
                arrayList6.add(c20Var4);
                arrayList7.add(ObjectAnimator.ofFloat(c20Var4, (Property<c20, Float>) property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(c20Var4, (Property<c20, Float>) property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(c20Var4, (Property<c20, Float>) property, 0.0f, 1.0f));
            }
        } else {
            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                nVar.removeView((View) arrayList2.get(i16));
            }
            arrayList9.clear();
            nVar.b = null;
            nVar.c = false;
            p8Var.b.setAllowDrawCursor(true);
        }
        while (i10 < arrayList3.size()) {
            nVar.addView((View) arrayList3.get(i10));
            i10++;
        }
        nVar.requestLayout();
    }

    public final void k() {
        float c10 = c();
        boolean z9 = this.M;
        boolean z10 = false;
        g8 g8Var = this.y;
        if (z9 || this.U || getTranslationX() != 0.0f) {
            this.N = false;
            ValueAnimator valueAnimator = this.P;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.P = null;
            }
            g8Var.setTranslationY(c10);
        } else if (!this.N || Math.abs(this.O - c10) > 1.0f) {
            this.N = true;
            ValueAnimator valueAnimator2 = this.P;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.P = null;
            }
            float translationY = g8Var.getTranslationY();
            this.O = c10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, c10);
            this.P = ofFloat;
            ofFloat.addUpdateListener(new v3(this, 5));
            this.P.addListener(new bi.t5(this, 24));
            this.P.setInterpolator(new LinearInterpolator());
            this.P.setDuration(180L);
            this.P.start();
        }
        boolean z11 = this.F;
        a8 a8Var = this.E;
        if (!z11) {
            a8Var.setVisibility(8);
            return;
        }
        a8Var.setVisibility(0);
        float f10 = -a8Var.getHeight();
        int i7 = 0;
        while (true) {
            pj0 pj0Var = this.f;
            if (i7 >= pj0Var.getChildCount()) {
                z10 = true;
                break;
            }
            View childAt = pj0Var.getChildAt(i7);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                f10 = this.e.getPaddingTop() + childAt.getY();
                break;
            }
            i7++;
        }
        if (this.Q != z10) {
            this.Q = z10;
            ((org.telegram.ui.ActionBar.y1) a8Var.e).c(true, (z10 || this.a != 0) ? 0.0f : 1.0f);
        }
        a8Var.setTranslationY(Math.max(org.telegram.messenger.g0.m, f10));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = s8.X1;
        qs.f(this.W.a).c(this, qs.T);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        g8 g8Var = this.y;
        if (!g8Var.e.contains(view)) {
            return;
        }
        c20 c20Var = (c20) view;
        if (!c20Var.D) {
            c20 c20Var2 = g8Var.f;
            if (c20Var2 != null) {
                c20Var2.a();
                g8Var.f = null;
            }
            g8Var.f = c20Var;
            c20Var.b();
            return;
        }
        g8Var.f = null;
        ah.n nVar = g8Var.d;
        p8 p8Var = (p8) nVar.n;
        p8Var.H = true;
        p8Var.e.remove(c20Var);
        c20Var.setOnClickListener(null);
        nVar.c();
        nVar.c = false;
        AnimatorSet animatorSet = new AnimatorSet();
        nVar.b = animatorSet;
        animatorSet.addListener(new ah.l(7, nVar, c20Var));
        ArrayList arrayList = nVar.h;
        arrayList.clear();
        arrayList.add(c20Var);
        ArrayList arrayList2 = nVar.d;
        arrayList2.clear();
        nVar.e.clear();
        arrayList2.add(c20Var);
        ArrayList arrayList3 = nVar.f;
        arrayList3.clear();
        arrayList3.add(ObjectAnimator.ofFloat(c20Var, (Property<c20, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(c20Var, (Property<c20, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(c20Var, (Property<c20, Float>) View.ALPHA, 1.0f, 0.0f));
        nVar.requestLayout();
        long uid = c20Var.getUid();
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
        int i7 = s8.X1;
        qs.f(this.W.a).n(this, qs.T);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11 = s8.X1;
        s8 s8Var = this.W;
        int i12 = s8Var.f;
        if (i12 > 0) {
            this.T = i12;
        }
        super.onMeasure(i7, i10);
        this.e.setPadding(0, org.telegram.messenger.g0.m + (this.a == 0 ? 0 : org.telegram.messenger.g0.L(56.0f)), 0, 0);
        boolean z9 = this.V;
        boolean z10 = s8Var.d;
        pj0 pj0Var = this.f;
        l8 l8Var = this.r;
        if (z9 != z10) {
            float c10 = c();
            int i13 = 2;
            if (s8Var.d && c10 + Math.min(org.telegram.messenger.g0.L(150.0f), this.y.K) > pj0Var.getPaddingTop()) {
                mi.m mVar = new mi.m(getContext(), 2, 0.7f);
                mVar.a = 1;
                mVar.p = -org.telegram.messenger.g0.L(56.0f);
                this.h.w0(mVar);
            }
            int i14 = this.a;
            View view = this.s;
            if (i14 == 0) {
                l8Var.setTranslationY(s8Var.d ? this.T : 0.0f);
                view.setTranslationY(s8Var.d ? this.T : 0.0f);
            } else {
                float f10 = s8Var.d ? this.T : -this.T;
                ValueAnimator valueAnimator = l8Var.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    l8Var.d = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                l8Var.d = ofFloat;
                ofFloat.addUpdateListener(new k8(l8Var, 1));
                l8Var.d.addListener(new bi.t5(l8Var, 25));
                l8Var.d.setDuration(250L);
                ValueAnimator valueAnimator2 = l8Var.d;
                wq wqVar = org.telegram.ui.ActionBar.i1.w;
                valueAnimator2.setInterpolator(wqVar);
                l8Var.d.start();
                view.setTranslationY(s8Var.d ? this.T : -this.T);
                this.U = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(wqVar).withEndAction(new d8(this, i13)).start();
            }
            this.V = s8Var.d;
        }
        pj0Var.setPadding(0, 0, 0, l8Var.getMeasuredHeight());
    }
}
