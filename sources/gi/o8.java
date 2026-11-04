package gi;

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
import b8.mf;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o8 extends FrameLayout implements View.OnClickListener, cs {
    public final org.telegram.ui.Cells.x3 E;
    public final z7 F;
    public boolean G;
    public org.telegram.ui.ActionBar.s1 H;
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
    public final /* synthetic */ t8 a0;
    public final a0.h b;
    public final ArrayList c;
    public final HashMap d;
    public final FrameLayout e;
    public final tj0 f;
    public final u4.b0 h;
    public final k8 n;
    public final m8 r;
    public final View s;
    public final d w;
    public final d x;
    public final f8 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(t8 t8Var, Context context) {
        super(context);
        this.a0 = t8Var;
        this.b = new a0.h();
        this.c = new ArrayList();
        this.d = new HashMap();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.S = -1;
        int i3 = t8.V1;
        org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(context, t8Var.J0);
        this.E = x3Var;
        f8 f8Var = new f8(this, context, t8Var.J0, new c8(this, 4));
        this.y = f8Var;
        int i10 = org.telegram.ui.ActionBar.k6.h5;
        org.telegram.ui.ActionBar.r6.i(i10, f8Var, t8Var.J0);
        f8Var.setOnSearchTextChange(new d8(this, 3));
        z7 z7Var = new z7(context, t8Var.J0);
        this.F = z7Var;
        z7Var.h = new c8(this, 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        int i11 = 0;
        frameLayout.setPadding(0, org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, mf.e(-1, -1, hs.E1));
        tj0 tj0Var = new tj0(context, t8Var.J0);
        this.f = tj0Var;
        tj0Var.setClipToPadding(false);
        tj0Var.setTranslateSelector(true);
        k8 k8Var = new k8(this, context, t8Var.J0, f8Var, new ei.y3(t8Var, 2));
        this.n = k8Var;
        tj0Var.setAdapter(k8Var);
        k8Var.h = tj0Var;
        u4.b0 b0Var = new u4.b0();
        this.h = b0Var;
        tj0Var.setLayoutManager(b0Var);
        tj0Var.setOnScrollListener(new g8(i11, this));
        tj0Var.setOnItemClickListener(new ai.n(17, this, context));
        frameLayout.addView(tj0Var, mf.c(-1.0f, -1));
        h8 h8Var = new h8(this);
        h8Var.n(350L);
        h8Var.o(xq.h);
        h8Var.C = false;
        h8Var.m = false;
        tj0Var.setItemAnimator(h8Var);
        frameLayout.addView(f8Var, mf.e(-1, -2, 55));
        frameLayout.addView(x3Var, mf.e(-1, 32, 55));
        addView(z7Var, mf.e(-1, -2, 55));
        m8 m8Var = new m8(this, context);
        this.r = m8Var;
        m8Var.setClickable(true);
        m8Var.setOrientation(1);
        m8Var.setPadding(org.telegram.messenger.g0.L(10.0f) + t8Var.u0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f) + t8Var.u0, org.telegram.messenger.g0.L(10.0f));
        org.telegram.ui.ActionBar.r6.i(i10, m8Var, t8Var.J0);
        d dVar = new d(context, t8Var.J0, true);
        this.w = dVar;
        dVar.setOnClickListener(new b8(this, i11));
        dVar.f();
        m8Var.addView(dVar, mf.r(-1, 48, 87));
        d dVar2 = new d(context, t8Var.J0, false);
        this.x = dVar2;
        dVar2.setOnClickListener(new b8(this, 1));
        dVar2.f();
        m8Var.addView(dVar2, mf.t(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.s = view;
        org.telegram.ui.ActionBar.r6.i(i10, view, t8Var.J0);
        addView(view, mf.d(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
        addView(m8Var, mf.e(-1, -2, 87));
    }

    public static boolean d(String str, TLObject tLObject) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            String lowerCase = org.telegram.messenger.g0.O3(l10.p(user)).toLowerCase();
            if (lowerCase.startsWith(str) || k2.p1.z(" ", str, lowerCase)) {
                return true;
            }
            String lowerCase2 = org.telegram.messenger.g0.O3(l10.n(user)).toLowerCase();
            if (lowerCase2.startsWith(str) || k2.p1.z(" ", str, lowerCase2)) {
                return true;
            }
            ArrayList<TLRPC.TL_username> arrayList = user.usernames;
            if (arrayList != null) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    TLRPC.TL_username tL_username = arrayList.get(i3);
                    if (tL_username.active && org.telegram.messenger.g0.O3(tL_username.username).toLowerCase().startsWith(str)) {
                        return true;
                    }
                }
            }
        } else if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String lowerCase3 = org.telegram.messenger.g0.O3(chat.title).toLowerCase();
            if (lowerCase3.startsWith(str) || k2.p1.z(" ", str, lowerCase3)) {
                return true;
            }
            String lowerCase4 = org.telegram.messenger.g0.O3(org.telegram.messenger.t3.K(chat, false)).toLowerCase();
            if (lowerCase4.startsWith(str) || k2.p1.z(" ", str, lowerCase4)) {
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

    public final void a(boolean z10) {
        if (this.a != 6) {
            return;
        }
        ArrayList arrayList = this.c;
        arrayList.clear();
        int i3 = t8.V1;
        arrayList.addAll(hp.s1(this.a0.a).P1().L);
        int i10 = 0;
        while (true) {
            a0.h hVar = this.b;
            if (i10 >= hVar.m()) {
                break;
            }
            long j10 = hVar.j(i10);
            if (!((Boolean) hVar.n(i10)).booleanValue()) {
                arrayList.remove(Long.valueOf(j10));
            } else if (!arrayList.contains(Long.valueOf(j10))) {
                arrayList.add(Long.valueOf(j10));
            }
            i10++;
        }
        if (z10) {
            h(true);
            f(true);
            g(true);
        }
    }

    public final void b(int i3) {
        this.a = i3;
        this.b.b();
        ArrayList arrayList = this.c;
        arrayList.clear();
        HashMap hashMap = this.d;
        hashMap.clear();
        t8 t8Var = this.a0;
        if (i3 == 4) {
            arrayList.addAll(t8Var.l1);
            hashMap.putAll(t8Var.m1);
        } else if (i3 == 5) {
            arrayList.addAll(t8Var.B1);
        } else if (i3 == 1) {
            ArrayList J0 = t8.J0(t8Var);
            for (int i10 = 0; i10 < J0.size(); i10 = a1.g.h(i10, 1, ((TLRPC.User) J0.get(i10)).id, arrayList)) {
            }
        } else if (i3 == 2) {
            arrayList.addAll(t8Var.o1);
        } else if (i3 == 3) {
            arrayList.addAll(t8Var.p1);
            hashMap.putAll(t8Var.q1);
        } else if (i3 == 6) {
            a(false);
        }
        this.n.getClass();
        this.h.k1(false);
        j(false);
        f8 f8Var = this.y;
        f8Var.setText("");
        f8Var.setVisibility(i3 == 0 ? 8 : 0);
        f8Var.M = true;
        this.J = null;
        h(false);
        f(false);
        g(false);
        int i11 = this.a;
        tj0 tj0Var = this.f;
        if (i11 != 0) {
            tj0Var.v0(0);
        }
        tj0Var.requestLayout();
        this.S = -1;
    }

    public final float c() {
        int i3 = 0;
        float f10 = -k2.p1.d(150.0f, Math.min(org.telegram.messenger.g0.L(150.0f), this.y.L), 0);
        while (true) {
            tj0 tj0Var = this.f;
            if (i3 >= tj0Var.getChildCount()) {
                return f10;
            }
            View childAt = tj0Var.getChildAt(i3);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 34) {
                return Math.max(f10, childAt.getY());
            }
            i3++;
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        TLRPC.ChatFull chatFull;
        org.telegram.ui.ActionBar.s1 s1Var;
        if (i3 != hs.T || (chatFull = (TLRPC.ChatFull) objArr[0]) == null || (s1Var = this.H) == null || this.I != chatFull.id) {
            return;
        }
        s1Var.c(350L);
        this.H = null;
        this.I = -1L;
        e(chatFull.id, chatFull.participants);
    }

    public final void e(long j10, TLRPC.ChatParticipants chatParticipants) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i3 = this.a;
        int i10 = 0;
        boolean z10 = i3 == 1 || i3 == 2;
        t8 t8Var = this.a0;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i11 = 0; i11 < chatParticipants.participants.size(); i11++) {
                long j11 = chatParticipants.participants.get(i11).user_id;
                int i12 = t8.V1;
                TLRPC.User a22 = hp.s1(t8Var.a).a2(Long.valueOf(j11));
                if (a22 != null && !l10.B(a22) && !a22.bot && a22.id != 777000 && j11 != 0) {
                    if (!z10 || a22.contact) {
                        arrayList.add(Long.valueOf(j11));
                    } else {
                        arrayList2.add(Long.valueOf(j11));
                    }
                    this.c.remove(Long.valueOf(j11));
                }
            }
        }
        if (arrayList2.isEmpty()) {
            this.d.put(Long.valueOf(j10), arrayList);
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
            int i13 = t8.V1;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, t8Var.J0);
            alertDialog$Builder.a.U = bd.M0(2131744548, null);
            k2.p1.v(null, 2131752589, alertDialog$Builder, null);
            return;
        }
        Context context2 = getContext();
        int i14 = t8.V1;
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, context2, t8Var.J0);
        alertDialog$Builder2.a.U = bd.G(arrayList2.size(), "StoryPrivacyGroupNonContacts", new Object[0]);
        alertDialog$Builder2.k(bd.G(arrayList.size(), "StoryPrivacyGroupAddContacts", new Object[0]), new ci.i(this, j10, arrayList, 2));
        k2.p1.v(null, 2131752589, alertDialog$Builder2, null);
    }

    public final void f(boolean z10) {
        int i3 = this.a;
        t8 t8Var = this.a0;
        d dVar = this.x;
        int i10 = 0;
        d dVar2 = this.w;
        if (i3 == 0) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.c(0, z10);
            if (t8Var.D1) {
                dVar2.i(bd.M0(2131744564, null), z10, true);
            } else if (t8Var.R1) {
                dVar2.i(bd.M0(2131744564, null), z10, true);
            } else {
                int i11 = t8Var.A1;
                if (i11 == 1) {
                    dVar2.i(bd.M0(t8Var.C1 ? 2131744629 : 2131744568, null), z10, true);
                } else {
                    dVar2.i(bd.H(',', "StoryPrivacyButtonPostMultiple", i11), z10, true);
                }
            }
            dVar.setVisibility(8);
            return;
        }
        ArrayList arrayList = this.c;
        if (i3 == 1) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.i(bd.M0(2131744563, null), z10, true);
            dVar2.c(arrayList.size(), z10);
            dVar.setVisibility(8);
            return;
        }
        m8 m8Var = this.r;
        if (i3 == 3) {
            int size = t8.R0(arrayList, this.d).size();
            t8Var.r1 = size;
            dVar2.i(bd.M0(2131744564, null), z10, true);
            dVar2.setShowZero(false);
            m8Var.b(size <= 0, z10);
            dVar2.c(size, z10);
            dVar2.setEnabled(size > 0);
            dVar.setVisibility(8);
            return;
        }
        if (i3 == 2) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            if (arrayList.isEmpty()) {
                dVar2.i(bd.M0(2131744564, null), z10, true);
                dVar2.c(0, z10);
            } else {
                dVar2.i(bd.M0(2131744569, null), z10, true);
                dVar2.c(arrayList.size(), z10);
            }
            dVar.setVisibility(8);
            return;
        }
        if (i3 == 5) {
            dVar2.setShowZero(true);
            dVar2.setEnabled(!arrayList.isEmpty());
            dVar2.c(arrayList.size(), z10);
            dVar.setVisibility(8);
            return;
        }
        if (i3 != 6) {
            if (i3 == 4) {
                int size2 = t8.R0(t8Var.l1, t8Var.m1).size();
                t8Var.n1 = size2;
                dVar2.i(bd.M0(2131744564, null), z10, true);
                dVar2.setShowZero(false);
                m8Var.b(false, z10);
                dVar2.c(size2, z10);
                dVar2.setEnabled(true);
                dVar.setVisibility(8);
                return;
            }
            return;
        }
        dVar2.setShowZero(false);
        dVar2.setEnabled(true);
        dVar2.i(bd.M0(2131744563, null), z10, true);
        int i12 = t8.V1;
        ei.z6 P1 = hp.s1(t8Var.a).P1();
        if (!P1.O) {
            while (true) {
                a0.h hVar = this.b;
                if (i10 >= hVar.m()) {
                    break;
                }
                long j10 = hVar.j(i10);
                ((Boolean) hVar.n(i10)).getClass();
                P1.L.contains(Long.valueOf(j10));
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
        t8 t8Var = this.a0;
        ArrayList arrayList2 = t8Var.B1;
        HashMap hashMap = t8Var.q1;
        ArrayList arrayList3 = t8Var.p1;
        ArrayList arrayList4 = t8Var.o1;
        HashMap hashMap2 = t8Var.m1;
        ArrayList arrayList5 = t8Var.l1;
        int i3 = this.a;
        HashMap hashMap3 = this.d;
        ArrayList arrayList6 = this.c;
        if (i3 == 4) {
            arrayList5.clear();
            hashMap2.clear();
            arrayList5.addAll(arrayList6);
            hashMap2.putAll(hashMap3);
        } else if (i3 == 2) {
            arrayList4.clear();
            arrayList4.addAll(arrayList6);
        } else if (i3 == 3) {
            arrayList3.clear();
            hashMap.clear();
            arrayList3.addAll(arrayList6);
            hashMap.putAll(hashMap3);
        } else if (i3 == 0) {
            arrayList2.clear();
            arrayList2.addAll(arrayList6);
        }
        if (this.a == 3 && (t8Var.F1 != 3 || (arrayList6.isEmpty() && hashMap3.isEmpty()))) {
            if (arrayList6.isEmpty() && hashMap3.isEmpty()) {
                int i10 = this.S;
                if (i10 != -1) {
                    t8Var.F1 = i10;
                }
            } else {
                this.S = t8Var.F1;
                t8Var.F1 = 3;
            }
        }
        HashSet R0 = t8.R0(arrayList6, hashMap3);
        int i11 = 0;
        while (true) {
            arrayList = this.M;
            if (i11 >= arrayList.size()) {
                break;
            }
            a8 a8Var = (a8) arrayList.get(i11);
            if (a8Var != null) {
                int i12 = a8Var.i;
                if (i12 > 0) {
                    a8Var.k = t8Var.F1 == i12;
                    a8Var.l = false;
                } else {
                    TLRPC.User user = a8Var.g;
                    if (user != null) {
                        boolean contains = arrayList6.contains(Long.valueOf(user.id));
                        a8Var.k = contains;
                        a8Var.l = !contains && R0.contains(Long.valueOf(a8Var.g.id));
                    } else {
                        TLRPC.Chat chat = a8Var.h;
                        if (chat != null) {
                            a8Var.k = hashMap3.containsKey(Long.valueOf(chat.id));
                            a8Var.l = false;
                        }
                    }
                }
            }
            i11++;
        }
        int i13 = 0;
        while (true) {
            tj0 tj0Var = this.f;
            if (i13 >= tj0Var.getChildCount()) {
                i(z10);
                return;
            }
            View childAt = tj0Var.getChildAt(i13);
            if ((childAt instanceof s8) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                a8 a8Var2 = (a8) arrayList.get(R);
                s8 s8Var = (s8) childAt;
                s8Var.c(a8Var2.k || a8Var2.l, z10);
                TLRPC.Chat chat2 = a8Var2.h;
                if (chat2 != null) {
                    s8Var.b(z10, t8.K0(t8Var, chat2) > 200 ? 0.3f : 1.0f);
                } else {
                    if (a8Var2.l && !a8Var2.k) {
                        r8 = 0.5f;
                    }
                    s8Var.b(z10, r8);
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
        k8 k8Var;
        ArrayList arrayList;
        long j10;
        boolean z11;
        float f10;
        boolean z12;
        float f11;
        TLRPC.User a22;
        TLRPC.Chat M0;
        int i3;
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
        t8 t8Var = this.a0;
        ArrayList arrayList3 = t8Var.p1;
        ArrayList arrayList4 = t8Var.l1;
        ArrayList arrayList5 = t8Var.o1;
        HashSet hashSet = t8Var.s1;
        ArrayList arrayList6 = this.L;
        arrayList6.clear();
        ArrayList arrayList7 = this.M;
        arrayList6.addAll(arrayList7);
        arrayList7.clear();
        int i12 = this.a;
        org.telegram.ui.Cells.x3 x3Var = this.E;
        if (i12 != 0) {
            z7 z7Var = this.F;
            if (i12 == 1) {
                z7Var.e(bd.M0(2131744583, null));
                z7Var.d(true);
                ((org.telegram.ui.ActionBar.w1) z7Var.e).c(false, 0.0f);
                arrayList7.add(a8.d());
                arrayList7.add(a8.c());
                arrayList7.size();
                arrayList7.add(a8.e());
                arrayList7.add(a8.f());
                L2 = org.telegram.messenger.g0.L(32.0f) + org.telegram.messenger.g0.L(56.0f) + 0.0f + org.telegram.messenger.g0.L(150.0f);
                x3Var.setText(bd.M0(2131744584, null));
                i(z10);
                this.G = true;
            } else if (i12 == 2) {
                z7Var.e(bd.M0(2131744578, null));
                z7Var.d(true);
                ((org.telegram.ui.ActionBar.w1) z7Var.e).c(false, 0.0f);
                arrayList7.add(a8.d());
                arrayList7.add(a8.c());
                arrayList7.size();
                arrayList7.add(a8.e());
                arrayList7.add(a8.f());
                L2 = org.telegram.messenger.g0.L(32.0f) + org.telegram.messenger.g0.L(56.0f) + 0.0f + org.telegram.messenger.g0.L(150.0f);
                x3Var.setText(bd.M0(2131744579, null));
                i(z10);
                this.G = true;
            } else if (i12 == 3) {
                z7Var.e(bd.M0(2131744576, null));
                z7Var.d(true);
                ((org.telegram.ui.ActionBar.w1) z7Var.e).c(false, 0.0f);
                arrayList7.add(a8.d());
                arrayList7.add(a8.c());
                arrayList7.size();
                arrayList7.add(a8.e());
                arrayList7.add(a8.f());
                L2 = org.telegram.messenger.g0.L(32.0f) + org.telegram.messenger.g0.L(56.0f) + 0.0f + org.telegram.messenger.g0.L(150.0f);
                x3Var.setText(bd.M0(2131744577, null));
                i(z10);
                this.G = true;
            } else if (i12 == 5) {
                z7Var.e(bd.M0(2131744587, null));
                z7Var.d(t8Var.G1);
                ((org.telegram.ui.ActionBar.w1) z7Var.e).c(false, 0.0f);
                arrayList7.add(a8.d());
                arrayList7.add(a8.c());
                arrayList7.size();
                arrayList7.add(a8.e());
                arrayList7.add(a8.f());
                L2 = org.telegram.messenger.g0.L(32.0f) + org.telegram.messenger.g0.L(56.0f) + 0.0f + org.telegram.messenger.g0.L(150.0f);
                x3Var.setText(bd.M0(2131744588, null));
                i(z10);
                this.G = true;
            } else if (i12 == 6) {
                z7Var.e(bd.M0(2131744585, null));
                z7Var.d(true);
                ((org.telegram.ui.ActionBar.w1) z7Var.e).c(false, 0.0f);
                arrayList7.add(a8.d());
                arrayList7.add(a8.c());
                arrayList7.size();
                arrayList7.add(a8.e());
                arrayList7.add(a8.f());
                L2 = org.telegram.messenger.g0.L(32.0f) + org.telegram.messenger.g0.L(56.0f) + 0.0f + org.telegram.messenger.g0.L(150.0f);
                x3Var.setText(bd.M0(2131744586, null));
                i(z10);
                this.G = true;
            } else if (i12 == 4) {
                z7Var.e(bd.M0(2131744580, null));
                z7Var.d(true);
                ((org.telegram.ui.ActionBar.w1) z7Var.e).c(false, 0.0f);
                arrayList7.add(a8.d());
                arrayList7.add(a8.c());
                arrayList7.size();
                arrayList7.add(a8.e());
                arrayList7.add(a8.f());
                L = org.telegram.messenger.g0.L(56.0f) + 0.0f + org.telegram.messenger.g0.L(150.0f) + org.telegram.messenger.g0.L(32.0f);
                x3Var.setText(bd.M0(2131744581, null));
                i(z10);
                this.G = true;
                boolean isEmpty = TextUtils.isEmpty(this.J);
                if (this.a != 0) {
                    String lowerCase = org.telegram.messenger.g0.O3(this.J).toLowerCase();
                    int i13 = this.a;
                    if (i13 == 5) {
                        ArrayList arrayList8 = new ArrayList();
                        hp s12 = hp.s1(t8Var.a);
                        ArrayList arrayList9 = s12.y;
                        for (int i14 = 0; i14 < arrayList9.size(); i14++) {
                            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList9.get(i14);
                            if (s12.y(dialog)) {
                                if (org.telegram.messenger.m5.E(dialog.id)) {
                                    TLRPC.User a23 = s12.a2(Long.valueOf(dialog.id));
                                    if (a23 != null && !a23.bot && a23.id != 777000 && !l10.B(a23)) {
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
                        boolean z19 = t8Var.Q1 && (i13 == 3 || i13 == 6);
                        hp s13 = hp.s1(t8Var.a);
                        HashMap hashMap = new HashMap();
                        arrayList = new ArrayList();
                        ArrayList arrayList10 = s13.y;
                        ConcurrentHashMap concurrentHashMap = org.telegram.messenger.g5.r(t8Var.a).g0;
                        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
                            j10 = 777000;
                            if (t8Var.S1) {
                                z11 = isEmpty;
                                f10 = L;
                                z12 = z19;
                            } else {
                                f10 = L;
                                z12 = z19;
                                z11 = isEmpty;
                                org.telegram.messenger.g5.r(t8Var.a).A(0L, false);
                            }
                            t8Var.S1 = true;
                        } else {
                            z11 = isEmpty;
                            z12 = z19;
                            j10 = 777000;
                            f10 = L;
                        }
                        int i15 = 0;
                        while (i15 < arrayList10.size()) {
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList10.get(i15);
                            float f13 = f10;
                            if (org.telegram.messenger.m5.E(dialog2.id)) {
                                TLRPC.User a24 = s13.a2(Long.valueOf(dialog2.id));
                                if (a24 != null && !a24.bot && a24.id != j10 && !l10.B(a24) && !a24.deleted && (!z18 || (concurrentHashMap != null && concurrentHashMap.get(Long.valueOf(a24.id)) != null))) {
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
                                if (!hashMap.containsKey(l10) && (a22 = s13.a2(l10)) != null && !a22.bot && a22.id != j10 && !l10.B(a22)) {
                                    arrayList.add(a22);
                                    hashMap.put(Long.valueOf(a22.id), Boolean.TRUE);
                                }
                            }
                        }
                    }
                    ArrayList arrayList11 = this.c;
                    HashMap hashMap2 = this.d;
                    HashSet R0 = t8.R0(arrayList11, hashMap2);
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
                                a8 i19 = a8.i(user, contains, !contains && R0.contains(Long.valueOf(user.id)));
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
                                    a8 a8Var = new a8(3, true);
                                    a8Var.h = chat;
                                    a8Var.k = containsKey;
                                    int i21 = this.a;
                                    a8Var.m = i21 == 2 || i21 == 4;
                                    arrayList7.add(a8Var);
                                    f11 = f14 + org.telegram.messenger.g0.L(56.0f);
                                } else {
                                    i18 = i11;
                                    i17 = i10 + 1;
                                }
                            }
                            i18 = i11 + 1;
                            i17 = i10 + 1;
                        }
                        i3 = i18;
                    } else {
                        i3 = 0;
                    }
                    int i22 = 0;
                    while (i22 < arrayList.size()) {
                        TLObject tLObject3 = (TLObject) arrayList.get(i22);
                        if ((!z11 || !arrayList12.contains(tLObject3)) && d(lowerCase, tLObject3)) {
                            if (tLObject3 instanceof TLRPC.User) {
                                TLRPC.User user2 = (TLRPC.User) tLObject3;
                                boolean contains2 = arrayList11.contains(Long.valueOf(user2.id));
                                a8 i23 = a8.i(user2, contains2, !contains2 && R0.contains(Long.valueOf(user2.id)));
                                int i24 = this.a;
                                i23.m = i24 == 2 || i24 == 4;
                                arrayList7.add(i23);
                                f11 += org.telegram.messenger.g0.L(56.0f);
                                i3++;
                            } else if (tLObject3 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject3;
                                boolean containsKey2 = hashMap2.containsKey(Long.valueOf(chat2.id));
                                arrayList2 = arrayList11;
                                a8 a8Var2 = new a8(3, true);
                                a8Var2.h = chat2;
                                a8Var2.k = containsKey2;
                                int i25 = this.a;
                                a8Var2.m = i25 == 2 || i25 == 4;
                                arrayList7.add(a8Var2);
                                f11 += org.telegram.messenger.g0.L(56.0f);
                                i3++;
                                i22++;
                                arrayList11 = arrayList2;
                            }
                        }
                        arrayList2 = arrayList11;
                        i22++;
                        arrayList11 = arrayList2;
                    }
                    if (!z11) {
                        if (i3 == 0) {
                            arrayList7.add(new a8(5, false));
                            f11 += org.telegram.messenger.g0.L(150.0f);
                        }
                        tj0 tj0Var = this.f;
                        float measuredHeight = (tj0Var != null ? ((tj0Var.getMeasuredHeight() - tj0Var.getPaddingTop()) - tj0Var.getPaddingBottom()) + (t8Var.d ? this.U : 0) : ((org.telegram.messenger.g0.q.y - org.telegram.messenger.g0.L(56.0f)) - org.telegram.messenger.g0.n) - org.telegram.messenger.g0.L(42.0f)) - f11;
                        if (measuredHeight > 0.0f) {
                            a8 a8Var3 = new a8(-1, false);
                            a8Var3.p = (int) measuredHeight;
                            arrayList7.add(a8Var3);
                        }
                    }
                }
                if (this.h.t) {
                    Collections.reverse(arrayList7);
                }
                k8Var = this.n;
                if (k8Var != null) {
                    if (!z10 || t8Var.F1 == 0) {
                        k8Var.f();
                    } else {
                        k8Var.E(arrayList6, arrayList7);
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
            k8Var = this.n;
            if (k8Var != null) {
            }
            this.e.invalidate();
        }
        this.G = false;
        x3Var.setVisibility(8);
        int i26 = t8.V1;
        ArrayList arrayList13 = hp.s1(t8Var.a).P1().T;
        a8 a8Var4 = new a8(-1, false);
        a8Var4.o = 24;
        arrayList7.add(a8Var4);
        if (t8Var.D1) {
            String M03 = bd.M0(2131748797, null);
            a8 a8Var5 = new a8(11, false);
            a8Var5.e = M03;
            arrayList7.add(a8Var5);
            a8Var4.o = org.telegram.messenger.g0.L(72.0f) + a8Var4.o;
        } else if (t8Var.x1 && (t8Var.R1 || arrayList13 == null || arrayList13.size() <= 1)) {
            String M04 = t8Var.R1 ? bd.M0(2131744582, null) : bd.M0(t8Var.C1 ? 2131744630 : 2131744571, null);
            if (t8Var.C1) {
                G = bd.M0(2131744631, null);
            } else {
                int i27 = t8Var.I1;
                G = i27 != Integer.MAX_VALUE ? bd.G(i27 / 3600, "StoryPrivacyAlertSubtitle", new Object[0]) : bd.M0(2131744574, null);
            }
            a8 a8Var6 = new a8(4, false);
            a8Var6.e = M04;
            a8Var6.f = G;
            arrayList7.add(a8Var6);
            a8Var4.o = org.telegram.messenger.g0.L(72.0f) + a8Var4.o;
        } else {
            String M05 = bd.M0(t8Var.C1 ? 2131744628 : 2131744528, null);
            a8 a8Var7 = new a8(8, false);
            a8Var7.e = M05;
            arrayList7.add(a8Var7);
            a8Var4.o = org.telegram.messenger.g0.L(50.0f) + a8Var4.o;
            TLRPC.InputPeer inputPeer = t8Var.k1;
            if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                a8 i28 = a8.i(h10.i(t8Var.a).f(), false, false);
                i28.n = true;
                arrayList7.add(i28);
                a8Var4.o = org.telegram.messenger.g0.L(62.0f) + a8Var4.o;
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                a8 i29 = a8.i(hp.s1(t8Var.a).a2(Long.valueOf(t8Var.k1.user_id)), false, false);
                i29.n = true;
                arrayList7.add(i29);
                a8Var4.o = org.telegram.messenger.g0.L(62.0f) + a8Var4.o;
            } else {
                if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.Chat M06 = hp.s1(t8Var.a).M0(Long.valueOf(t8Var.k1.channel_id));
                    a8 a8Var8 = new a8(3, true);
                    a8Var8.h = M06;
                    a8Var8.k = false;
                    a8Var8.n = true;
                    arrayList7.add(a8Var8);
                    z14 = org.telegram.messenger.t3.V(M06);
                    a8Var4.o = org.telegram.messenger.g0.L(104.0f) + a8Var4.o;
                    z13 = false;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.Chat M07 = hp.s1(t8Var.a).M0(Long.valueOf(t8Var.k1.chat_id));
                    a8 a8Var9 = new a8(3, true);
                    a8Var9.h = M07;
                    a8Var9.k = false;
                    a8Var9.n = true;
                    arrayList7.add(a8Var9);
                    a8Var4.o = org.telegram.messenger.g0.L(104.0f) + a8Var4.o;
                    z14 = false;
                    z13 = false;
                }
                a8 g7 = a8.g(null);
                g7.c = !z13 ? 1 : 2;
                arrayList7.add(g7);
                a8Var4.o = org.telegram.messenger.g0.L(12.0f) + a8Var4.o;
                if (z13) {
                    String M08 = bd.M0(t8Var.C1 ? 2131744627 : 2131744523, null);
                    a8 a8Var10 = new a8(8, false);
                    a8Var10.e = M08;
                    arrayList7.add(a8Var10);
                    a8Var4.o = org.telegram.messenger.g0.L(40.0f) + a8Var4.o;
                }
                if (z13 || t8Var.D1) {
                    f12 = 80.0f;
                } else {
                    f12 = 80.0f;
                    a8 h = a8.h(4, t8Var.n1, t8Var.F1 == 4);
                    arrayList7.add(h);
                    a8Var4.o = org.telegram.messenger.g0.L(56.0f) + a8Var4.o;
                    if (t8Var.n1 == 1) {
                        if (arrayList4.size() != 1) {
                            Iterator it2 = t8Var.m1.values().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList14 = (ArrayList) it2.next();
                                if (arrayList14.size() >= 1) {
                                    h.g = hp.s1(t8Var.a).a2((Long) arrayList14.get(0));
                                    break;
                                }
                            }
                        } else {
                            h.g = hp.s1(t8Var.a).a2((Long) arrayList4.get(0));
                        }
                    }
                    a8 h7 = a8.h(2, arrayList5.size(), t8Var.F1 == 2);
                    arrayList7.add(h7);
                    a8Var4.o = org.telegram.messenger.g0.L(56.0f) + a8Var4.o;
                    if (arrayList5.size() == 1) {
                        h7.g = hp.s1(t8Var.a).a2((Long) arrayList5.get(0));
                    }
                    ArrayList J0 = t8.J0(t8Var);
                    a8 h10 = a8.h(1, J0.size(), t8Var.F1 == 1);
                    arrayList7.add(h10);
                    a8Var4.o = org.telegram.messenger.g0.L(56.0f) + a8Var4.o;
                    if (J0.size() == 1 && (J0.get(0) instanceof TLRPC.User)) {
                        h10.g = (TLRPC.User) J0.get(0);
                    }
                    a8 h11 = a8.h(3, t8Var.r1, t8Var.F1 == 3);
                    arrayList7.add(h11);
                    a8Var4.o = org.telegram.messenger.g0.L(56.0f) + a8Var4.o;
                    if (t8Var.r1 == 1) {
                        if (arrayList3.size() != 1) {
                            Iterator it3 = t8Var.q1.values().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList15 = (ArrayList) it3.next();
                                if (arrayList15.size() >= 1) {
                                    h11.g = hp.s1(t8Var.a).a2((Long) arrayList15.get(0));
                                    break;
                                }
                            }
                        } else {
                            h11.g = hp.s1(t8Var.a).a2((Long) arrayList3.get(0));
                        }
                    }
                    int i30 = hp.s1(t8Var.a).P1().N;
                    arrayList7.add(a8.g(org.telegram.messenger.g0.S2(i30 <= 0 ? bd.M0(t8Var.C1 ? 2131744638 : 2131744726, null) : bd.G(i30, t8Var.C1 ? "StoryLiveBlockList" : "StoryBlockList", new Object[0]), org.telegram.ui.ActionBar.k6.Uc, 0, new c8(this, 3), t8Var.J0)));
                    a8Var4.o = org.telegram.messenger.g0.L(80.0f) + a8Var4.o;
                }
                if (!t8Var.R1) {
                    if (t8Var.C1 && !t8Var.D1) {
                        if (t8Var.y1) {
                            arrayList7.add(a8.b(bd.M0(2131748805, null), "", 5));
                            a8Var4.o = org.telegram.messenger.g0.L(50.0f) + a8Var4.o;
                            arrayList7.add(a8.b(bd.M0(2131748811, null), "", 6));
                            a8Var4.o = org.telegram.messenger.g0.L(50.0f) + a8Var4.o;
                            arrayList7.add(a8.g(null));
                            a8Var4.o = org.telegram.messenger.g0.L(12.0f) + a8Var4.o;
                        } else {
                            arrayList7.add(a8.b(bd.M0(2131748810, null), "", 5));
                            a8Var4.o = org.telegram.messenger.g0.L(50.0f) + a8Var4.o;
                            arrayList7.add(a8.g(bd.M0(2131748809, null)));
                            a8Var4.o = org.telegram.messenger.g0.L(30.0f) + a8Var4.o;
                        }
                    }
                    if (t8Var.C1) {
                        String M09 = bd.M0(2131744640, null);
                        boolean z20 = t8Var.t1;
                        a8 a8Var11 = new a8(7, false);
                        a8Var11.c = 2;
                        a8Var11.e = M09;
                        a8Var11.k = z20;
                        arrayList7.add(a8Var11);
                        a8Var4.o = org.telegram.messenger.g0.L(50.0f) + a8Var4.o;
                    }
                    if (!t8Var.D1) {
                        String M010 = bd.M0(2131744739, null);
                        boolean z21 = t8Var.u1;
                        a8 a8Var12 = new a8(7, false);
                        a8Var12.c = 0;
                        a8Var12.e = M010;
                        a8Var12.k = z21;
                        arrayList7.add(a8Var12);
                        a8Var4.o = org.telegram.messenger.g0.L(50.0f) + a8Var4.o;
                    }
                    if (!t8Var.C1 && !t8Var.D1) {
                        String M011 = bd.M0(z13 ? 2131744668 : z14 ? 2131744667 : 2131744662, null);
                        boolean z22 = t8Var.v1;
                        a8 a8Var13 = new a8(7, false);
                        a8Var13.c = 1;
                        a8Var13.e = M011;
                        a8Var13.k = z22;
                        arrayList7.add(a8Var13);
                        a8Var4.o = org.telegram.messenger.g0.L(50.0f) + a8Var4.o;
                    }
                }
                z15 = t8Var.C1;
                String str = "StoryKeepGroupInfo";
                if (!z15 || t8Var.D1) {
                    arrayList7.add(a8.g(null));
                    a8Var4.o = org.telegram.messenger.g0.L(12.0f) + a8Var4.o;
                } else if (!t8Var.R1 && t8Var.w1 && t8Var.U1 != null) {
                    if (z15) {
                        G3 = bd.M0(z13 ? 2131744633 : z14 ? 2131744635 : 2131744634, null);
                    } else {
                        String str2 = z13 ? "StoryKeepInfo" : z14 ? "StoryKeepChannelInfo" : "StoryKeepGroupInfo";
                        int i31 = t8Var.I1;
                        if (i31 == Integer.MAX_VALUE) {
                            i31 = 86400;
                        }
                        G3 = bd.G(i31 / 3600, str2, new Object[0]);
                    }
                    arrayList7.add(a8.g(G3));
                    a8Var4.o = org.telegram.messenger.g0.L(f12) + a8Var4.o;
                }
                if (t8Var.v1 || t8Var.C1 || t8Var.D1) {
                    z16 = z14;
                } else {
                    TLRPC.InputPeer inputPeer2 = t8Var.k1;
                    long n4 = inputPeer2 != null ? org.telegram.messenger.m5.n(inputPeer2) : h10.i(t8Var.a).e();
                    hp.s1(t8Var.a).P1().B(n4, true);
                    StringBuilder sb2 = new StringBuilder();
                    if (hashSet.isEmpty()) {
                        sb2.append(bd.M0(2131744796, null));
                    } else if (hashSet.size() < 3) {
                        Iterator it4 = hashSet.iterator();
                        while (it4.hasNext()) {
                            Iterator it5 = it4;
                            boolean z23 = z14;
                            ei.s6 b10 = hp.s1(t8Var.a).P1().B(n4, true).b(((Integer) it4.next()).intValue());
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
                        sb2.append(bd.G(hashSet.size(), "StoriesAlbumCount", new Object[0]));
                        arrayList7.add(a8.b(bd.M0(2131744818, null), sb2, 1));
                        a8Var4.o = org.telegram.messenger.g0.L(50.0f) + a8Var4.o;
                    }
                    z16 = z14;
                    arrayList7.add(a8.b(bd.M0(2131744818, null), sb2, 1));
                    a8Var4.o = org.telegram.messenger.g0.L(50.0f) + a8Var4.o;
                }
                if (!t8Var.R1 && ((!t8Var.w1 || t8Var.U1 == null) && !(z17 = t8Var.C1) && !t8Var.D1)) {
                    if (z17) {
                        if (z13) {
                            str = "StoryKeepInfo";
                        } else if (z16) {
                            str = "StoryKeepChannelInfo";
                        }
                        int i32 = t8Var.I1;
                        G2 = bd.G((i32 == Integer.MAX_VALUE ? 86400 : i32) / 3600, str, new Object[0]);
                    } else {
                        G2 = bd.M0(z13 ? 2131744633 : z16 ? 2131744635 : 2131744634, null);
                    }
                    arrayList7.add(a8.g(G2));
                    a8Var4.o = org.telegram.messenger.g0.L(f12) + a8Var4.o;
                }
                if (t8Var.v1 && t8Var.w1 && t8Var.U1 != null) {
                    String M012 = bd.M0(2131744686, null);
                    BitmapDrawable bitmapDrawable = t8Var.T1;
                    a8 a8Var14 = new a8(9, false);
                    a8Var14.e = M012;
                    a8Var14.d = bitmapDrawable;
                    a8Var14.q = 0;
                    arrayList7.add(a8Var14);
                    a8Var4.o = org.telegram.messenger.g0.L(50.0f) + a8Var4.o;
                    arrayList7.add(a8.g(bd.M0(2131744685, null)));
                    a8Var4.o = org.telegram.messenger.g0.L(72.0f) + a8Var4.o;
                }
                if (t8Var.D1) {
                    arrayList7.add(a8.b(bd.M0(2131748805, null), "", 5));
                    a8Var4.o = org.telegram.messenger.g0.L(50.0f) + a8Var4.o;
                    arrayList7.add(a8.g(null));
                    a8Var4.o = org.telegram.messenger.g0.L(52.0f) + a8Var4.o;
                }
                if (t8Var.C1 && t8Var.t1) {
                    String M013 = bd.M0(2131748814, null);
                    a8 a8Var15 = new a8(8, false);
                    a8Var15.e = M013;
                    arrayList7.add(a8Var15);
                    a8Var4.o = org.telegram.messenger.g0.L(40.0f) + a8Var4.o;
                    a8 a8Var16 = new a8(10, false);
                    a8Var16.q = 8;
                    arrayList7.add(a8Var16);
                    a8Var4.o = org.telegram.messenger.g0.L(75.0f) + a8Var4.o;
                    arrayList7.add(a8.g(bd.M0(2131748812, null)));
                    a8Var4.o = org.telegram.messenger.g0.L(50.0f) + a8Var4.o;
                }
            }
            z14 = false;
            z13 = true;
            a8 g72 = a8.g(null);
            g72.c = !z13 ? 1 : 2;
            arrayList7.add(g72);
            a8Var4.o = org.telegram.messenger.g0.L(12.0f) + a8Var4.o;
            if (z13) {
            }
            if (z13) {
            }
            f12 = 80.0f;
            if (!t8Var.R1) {
            }
            z15 = t8Var.C1;
            String str3 = "StoryKeepGroupInfo";
            if (z15) {
            }
            arrayList7.add(a8.g(null));
            a8Var4.o = org.telegram.messenger.g0.L(12.0f) + a8Var4.o;
            if (t8Var.v1) {
            }
            z16 = z14;
            if (!t8Var.R1) {
                if (z17) {
                }
                arrayList7.add(a8.g(G2));
                a8Var4.o = org.telegram.messenger.g0.L(f12) + a8Var4.o;
            }
            if (t8Var.v1) {
                String M0122 = bd.M0(2131744686, null);
                BitmapDrawable bitmapDrawable2 = t8Var.T1;
                a8 a8Var142 = new a8(9, false);
                a8Var142.e = M0122;
                a8Var142.d = bitmapDrawable2;
                a8Var142.q = 0;
                arrayList7.add(a8Var142);
                a8Var4.o = org.telegram.messenger.g0.L(50.0f) + a8Var4.o;
                arrayList7.add(a8.g(bd.M0(2131744685, null)));
                a8Var4.o = org.telegram.messenger.g0.L(72.0f) + a8Var4.o;
            }
            if (t8Var.D1) {
            }
            if (t8Var.C1) {
                String M0132 = bd.M0(2131748814, null);
                a8 a8Var152 = new a8(8, false);
                a8Var152.e = M0132;
                arrayList7.add(a8Var152);
                a8Var4.o = org.telegram.messenger.g0.L(40.0f) + a8Var4.o;
                a8 a8Var162 = new a8(10, false);
                a8Var162.q = 8;
                arrayList7.add(a8Var162);
                a8Var4.o = org.telegram.messenger.g0.L(75.0f) + a8Var4.o;
                arrayList7.add(a8.g(bd.M0(2131748812, null)));
                a8Var4.o = org.telegram.messenger.g0.L(50.0f) + a8Var4.o;
            }
        }
        z14 = false;
        z13 = true;
        if (z13) {
        }
        f12 = 80.0f;
        if (!t8Var.R1) {
        }
        z15 = t8Var.C1;
        String str32 = "StoryKeepGroupInfo";
        if (z15) {
        }
        arrayList7.add(a8.g(null));
        a8Var4.o = org.telegram.messenger.g0.L(12.0f) + a8Var4.o;
        if (t8Var.v1) {
        }
        z16 = z14;
        if (!t8Var.R1) {
        }
        if (t8Var.v1) {
        }
        if (t8Var.D1) {
        }
        if (t8Var.C1) {
        }
        L = 0.0f;
        boolean isEmpty22 = TextUtils.isEmpty(this.J);
        if (this.a != 0) {
        }
        if (this.h.t) {
        }
        k8Var = this.n;
        if (k8Var != null) {
        }
        this.e.invalidate();
    }

    public final void i(boolean z10) {
        org.telegram.ui.Cells.x3 x3Var = this.E;
        if (x3Var == null) {
            return;
        }
        if (t8.R0(this.c, this.d).size() > 0) {
            x3Var.a(bd.M0(2131743640, null), new b8(this, 2));
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
        f8 f8Var;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        HashSet R0 = t8.R0(this.c, this.d);
        int i3 = this.a;
        t8 t8Var = this.a0;
        if (i3 == 3) {
            t8Var.r1 = R0.size();
        } else if (i3 == 4) {
            t8Var.n1 = R0.size();
        }
        hp s12 = hp.s1(t8Var.a);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            f8Var = this.y;
            ArrayList arrayList4 = f8Var.e;
            arrayList = f8Var.e;
            if (i11 >= arrayList4.size()) {
                break;
            }
            y10 y10Var = (y10) arrayList.get(i11);
            if (!R0.contains(Long.valueOf(y10Var.getUid()))) {
                arrayList2.add(y10Var);
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
                        y10 y10Var2 = new y10(getContext(), a22, null, true, t8Var.J0);
                        y10Var2.setOnClickListener(this);
                        arrayList3.add(y10Var2);
                    }
                } else if (((y10) arrayList.get(i12)).getUid() == longValue) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        bh.l lVar = f8Var.d;
        ArrayList arrayList5 = lVar.e;
        ArrayList arrayList6 = lVar.d;
        ArrayList arrayList7 = lVar.f;
        q8 q8Var = (q8) lVar.n;
        q8Var.I = true;
        ArrayList arrayList8 = q8Var.e;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = lVar.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            ((y10) arrayList2.get(i13)).setOnClickListener(null);
        }
        lVar.c();
        if (z10) {
            lVar.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            lVar.b = animatorSet;
            animatorSet.addListener(new p8(lVar, arrayList2, i10));
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
                y10 y10Var3 = (y10) arrayList2.get(i14);
                arrayList5.add(y10Var3);
                arrayList7.add(ObjectAnimator.ofFloat(y10Var3, (Property<y10, Float>) property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(y10Var3, (Property<y10, Float>) property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(y10Var3, (Property<y10, Float>) property, 1.0f, 0.0f));
                i14++;
            }
            for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                y10 y10Var4 = (y10) arrayList3.get(i15);
                arrayList6.add(y10Var4);
                arrayList7.add(ObjectAnimator.ofFloat(y10Var4, (Property<y10, Float>) property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(y10Var4, (Property<y10, Float>) property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(y10Var4, (Property<y10, Float>) property, 0.0f, 1.0f));
            }
        } else {
            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                lVar.removeView((View) arrayList2.get(i16));
            }
            arrayList9.clear();
            lVar.b = null;
            lVar.c = false;
            q8Var.b.setAllowDrawCursor(true);
        }
        while (i10 < arrayList3.size()) {
            lVar.addView((View) arrayList3.get(i10));
            i10++;
        }
        lVar.requestLayout();
    }

    public final void k() {
        float c2 = c();
        boolean z10 = this.N;
        boolean z11 = false;
        f8 f8Var = this.y;
        if (z10 || this.V || getTranslationX() != 0.0f) {
            this.O = false;
            ValueAnimator valueAnimator = this.Q;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.Q = null;
            }
            f8Var.setTranslationY(c2);
        } else if (!this.O || Math.abs(this.P - c2) > 1.0f) {
            this.O = true;
            ValueAnimator valueAnimator2 = this.Q;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.Q = null;
            }
            float translationY = f8Var.getTranslationY();
            this.P = c2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, c2);
            this.Q = ofFloat;
            ofFloat.addUpdateListener(new j3(this, 6));
            this.Q.addListener(new ai.e1(this, 26));
            this.Q.setInterpolator(new LinearInterpolator());
            this.Q.setDuration(180L);
            this.Q.start();
        }
        boolean z12 = this.G;
        z7 z7Var = this.F;
        if (!z12) {
            z7Var.setVisibility(8);
            return;
        }
        z7Var.setVisibility(0);
        float f10 = -z7Var.getHeight();
        int i3 = 0;
        while (true) {
            tj0 tj0Var = this.f;
            if (i3 >= tj0Var.getChildCount()) {
                z11 = true;
                break;
            }
            View childAt = tj0Var.getChildAt(i3);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                f10 = this.e.getPaddingTop() + childAt.getY();
                break;
            }
            i3++;
        }
        if (this.R != z11) {
            this.R = z11;
            ((org.telegram.ui.ActionBar.w1) z7Var.e).c(true, (z11 || this.a != 0) ? 0.0f : 1.0f);
        }
        z7Var.setTranslationY(Math.max(org.telegram.messenger.g0.m, f10));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i3 = t8.V1;
        hs.f(this.a0.a).c(this, hs.T);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f8 f8Var = this.y;
        if (!f8Var.e.contains(view)) {
            return;
        }
        y10 y10Var = (y10) view;
        if (!y10Var.E) {
            y10 y10Var2 = f8Var.f;
            if (y10Var2 != null) {
                y10Var2.a();
                f8Var.f = null;
            }
            f8Var.f = y10Var;
            y10Var.b();
            return;
        }
        f8Var.f = null;
        bh.l lVar = f8Var.d;
        q8 q8Var = (q8) lVar.n;
        q8Var.I = true;
        q8Var.e.remove(y10Var);
        y10Var.setOnClickListener(null);
        lVar.c();
        lVar.c = false;
        AnimatorSet animatorSet = new AnimatorSet();
        lVar.b = animatorSet;
        animatorSet.addListener(new bh.j(7, lVar, y10Var));
        ArrayList arrayList = lVar.h;
        arrayList.clear();
        arrayList.add(y10Var);
        ArrayList arrayList2 = lVar.d;
        arrayList2.clear();
        lVar.e.clear();
        arrayList2.add(y10Var);
        ArrayList arrayList3 = lVar.f;
        arrayList3.clear();
        arrayList3.add(ObjectAnimator.ofFloat(y10Var, (Property<y10, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(y10Var, (Property<y10, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(y10Var, (Property<y10, Float>) View.ALPHA, 1.0f, 0.0f));
        lVar.requestLayout();
        long uid = y10Var.getUid();
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
        int i3 = t8.V1;
        hs.f(this.a0.a).n(this, hs.T);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11 = t8.V1;
        t8 t8Var = this.a0;
        int i12 = t8Var.f;
        if (i12 > 0) {
            this.U = i12;
        }
        super.onMeasure(i3, i10);
        this.e.setPadding(0, org.telegram.messenger.g0.m + (this.a == 0 ? 0 : org.telegram.messenger.g0.L(56.0f)), 0, 0);
        boolean z10 = this.W;
        boolean z11 = t8Var.d;
        tj0 tj0Var = this.f;
        m8 m8Var = this.r;
        if (z10 != z11) {
            float c2 = c();
            int i13 = 2;
            if (t8Var.d && c2 + Math.min(org.telegram.messenger.g0.L(150.0f), this.y.L) > tj0Var.getPaddingTop()) {
                ni.m mVar = new ni.m(getContext(), 2, 0.7f);
                mVar.a = 1;
                mVar.p = -org.telegram.messenger.g0.L(56.0f);
                this.h.w0(mVar);
            }
            int i14 = this.a;
            View view = this.s;
            if (i14 == 0) {
                m8Var.setTranslationY(t8Var.d ? this.U : 0.0f);
                view.setTranslationY(t8Var.d ? this.U : 0.0f);
            } else {
                float f10 = t8Var.d ? this.U : -this.U;
                ValueAnimator valueAnimator = m8Var.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    m8Var.d = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                m8Var.d = ofFloat;
                ofFloat.addUpdateListener(new l8(m8Var, 1));
                m8Var.d.addListener(new ai.e1(m8Var, 27));
                m8Var.d.setDuration(250L);
                ValueAnimator valueAnimator2 = m8Var.d;
                xq xqVar = org.telegram.ui.ActionBar.h1.w;
                valueAnimator2.setInterpolator(xqVar);
                m8Var.d.start();
                view.setTranslationY(t8Var.d ? this.U : -this.U);
                this.V = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(xqVar).withEndAction(new c8(this, i13)).start();
            }
            this.W = t8Var.d;
        }
        tj0Var.setPadding(0, 0, 0, m8Var.getMeasuredHeight());
    }
}
