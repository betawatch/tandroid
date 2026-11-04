package fi;

import ai.q3;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.v4.media.session.a0;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import ci.o4;
import dh.x;
import ei.k6;
import ei.y6;
import ei.y8;
import ei.z6;
import gi.f7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import k2.p1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.g0;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Cells.n7;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class q extends FrameLayout implements z5, cs {
    public static LongSparseArray F;
    public static LongSparseArray G;
    public int E;
    public final d2 a;
    public final int b;
    public final e6 c;
    public final long d;
    public final k6 e;
    public final ArrayList f;
    public final ArrayList h;
    public final q3 n;
    public final m61 r;
    public Boolean s;
    public int w;
    public float x;
    public ValueAnimator y;

    public q(Context context, d2 d2Var, long j10) {
        super(context);
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.s = null;
        this.w = g0.q.y;
        this.E = Utilities.j(az.u1, 6, 2);
        this.a = d2Var;
        int currentAccount = d2Var.getCurrentAccount();
        this.b = currentAccount;
        e6 resourceProvider = d2Var.getResourceProvider();
        this.c = resourceProvider;
        this.d = j10;
        setBackgroundColor(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, resourceProvider), org.telegram.ui.ActionBar.k6.r1(0.04f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, resourceProvider))));
        if (G == null) {
            G = new LongSparseArray();
        }
        long j11 = currentAccount;
        LongSparseArray longSparseArray = (LongSparseArray) G.get(j11);
        if (longSparseArray == null) {
            LongSparseArray longSparseArray2 = G;
            LongSparseArray longSparseArray3 = new LongSparseArray();
            longSparseArray2.put(j11, longSparseArray3);
            longSparseArray = longSparseArray3;
        }
        k6 k6Var = (k6) longSparseArray.get(j10);
        if (k6Var == null) {
            k6 k6Var2 = new k6(currentAccount, j10, "", null);
            longSparseArray.put(j10, k6Var2);
            k6Var = k6Var2;
        }
        this.e = k6Var;
        tp0 tp0Var = (tp0) this;
        q3 q3Var = new q3(tp0Var, context);
        this.n = q3Var;
        q3Var.setAllowDisallowInterceptTouch(true);
        q3Var.setAdapter(new o4(1, context, tp0Var));
        addView(q3Var, mf.e(-1, -1, hs.E1));
        m61 j12 = q3Var.j(9, true);
        this.r = j12;
        j12.r = 12;
        j12.setPreTabClick(new y8(tp0Var, 2));
        addView(j12, mf.e(-1, 42, 48));
        i(false);
    }

    public final void a(String str) {
        d2 d2Var = this.a;
        if (d2Var == null || d2Var.getParentActivity() == null) {
            return;
        }
        bi biVar = new bi(d2Var.getParentActivity(), this.a, false, false, false, this.c);
        biVar.y1(1, false);
        biVar.O2 = true;
        biVar.N2 = false;
        biVar.e3.setText(bd.M0(2131752121, null));
        biVar.b2.i0();
        biVar.U3 = new a0((FrameLayout) this, (Object) biVar, (Serializable) str, 21);
        biVar.e1();
        biVar.show();
    }

    public final void b(String str) {
        k6 k6Var;
        TLRPC.MessageMedia messageMedia;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.e.G.remove(str);
        this.h.remove(str);
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i3 >= arrayList.size()) {
                k6Var = null;
                break;
            }
            k6Var = (k6) arrayList.get(i3);
            if (k6Var != null && TextUtils.equals(k6Var.E, str)) {
                break;
            } else {
                i3++;
            }
        }
        if (k6Var != null) {
            ArrayList arrayList2 = k6Var.i;
            TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
            int i10 = this.b;
            deletepreviewmedia.bot = hp.s1(i10).o1(this.d);
            deletepreviewmedia.lang_code = str;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                TL_stories.StoryItem storyItem = ((zi) arrayList2.get(i11)).l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    deletepreviewmedia.media.add(hp.Z4(messageMedia));
                }
            }
            ConnectionsManager.getInstance(i10).sendRequest(deletepreviewmedia, null);
        }
        i(true);
        this.r.d(-1, 0);
    }

    public abstract boolean c(zi ziVar);

    public final boolean d() {
        k6 k6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof m) || (k6Var = ((m) currentView).a) == null) {
            return true;
        }
        ArrayList arrayList = k6Var.i;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (!c((zi) arrayList.get(i3))) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = hs.x5;
        q3 q3Var = this.n;
        int i12 = 0;
        if (i3 != i11) {
            if (i3 == hs.v5) {
                i(true);
                View[] viewPages = q3Var.getViewPages();
                int length = viewPages.length;
                while (i12 < length) {
                    View view = viewPages[i12];
                    if (view instanceof m) {
                        ((m) view).w.f();
                    }
                    i12++;
                }
                return;
            }
            return;
        }
        Object obj = objArr[0];
        k6 k6Var = this.e;
        if (obj == k6Var) {
            i(true);
            View[] viewPages2 = q3Var.getViewPages();
            int length2 = viewPages2.length;
            while (i12 < length2) {
                View view2 = viewPages2[i12];
                if (view2 instanceof m) {
                    m mVar = (m) view2;
                    if (mVar.a == k6Var) {
                        mVar.w.f();
                    }
                }
                i12++;
            }
            return;
        }
        if (this.f.indexOf(obj) >= 0) {
            View[] viewPages3 = q3Var.getViewPages();
            for (View view3 : viewPages3) {
                if (view3 instanceof m) {
                    m mVar2 = (m) view3;
                    if (mVar2.a == objArr[0]) {
                        mVar2.w.f();
                    }
                }
            }
        }
    }

    public abstract boolean e(zi ziVar);

    public final void f() {
        k6 k6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof m) || (k6Var = ((m) currentView).a) == null) {
            return;
        }
        ArrayList arrayList = k6Var.i;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (!c((zi) arrayList.get(i3))) {
                e((zi) arrayList.get(i3));
            }
        }
    }

    public abstract boolean g(zi ziVar);

    public String getBotPreviewsSubtitle() {
        int i3;
        int i10;
        TLRPC.MessageMedia messageMedia;
        StringBuilder sb2 = new StringBuilder();
        View currentView = this.n.getCurrentView();
        if (currentView instanceof m) {
            k6 k6Var = ((m) currentView).a;
            if (k6Var != null) {
                ArrayList arrayList = k6Var.i;
                i3 = 0;
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    zi ziVar = (zi) arrayList.get(i11);
                    TL_stories.StoryItem storyItem = ziVar.l;
                    if (storyItem != null && (messageMedia = storyItem.media) != null) {
                        if (zi.L4(messageMedia.document)) {
                            i10++;
                        } else if (ziVar.l.media.photo != null) {
                            i3++;
                        }
                    }
                }
            } else {
                i3 = 0;
                i10 = 0;
            }
            if (i3 == 0 && i10 == 0) {
                return bd.M0(2131753014, null);
            }
            if (i3 > 0) {
                sb2.append(bd.G(i3, "Images", new Object[0]));
            }
            if (i10 > 0) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(bd.G(i10, "Videos", new Object[0]));
            }
        }
        return sb2.toString();
    }

    public String getCurrentLang() {
        View view;
        k6 k6Var;
        q3 q3Var = this.n;
        View[] viewPages = q3Var.getViewPages();
        if (Math.abs(q3Var.getCurrentPosition() - q3Var.getPositionAnimated()) >= 0.5f || (view = viewPages[1]) == null) {
            view = viewPages[0];
        }
        if (!(view instanceof m) || (k6Var = ((m) view).a) == null) {
            return null;
        }
        return k6Var.E;
    }

    public k6 getCurrentList() {
        k6 k6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof m) || (k6Var = ((m) currentView).a) == null) {
            return null;
        }
        return k6Var;
    }

    public tj0 getCurrentListView() {
        View currentView = this.n.getCurrentView();
        if (currentView instanceof m) {
            return ((m) currentView).f;
        }
        return null;
    }

    public int getItemsCount() {
        k6 k6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof m) || (k6Var = ((m) currentView).a) == null) {
            return 0;
        }
        return k6Var.i.size();
    }

    public int getStartedTrackingX() {
        return 0;
    }

    public final void h() {
        k6 k6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof m) || (k6Var = ((m) currentView).a) == null) {
            return;
        }
        ArrayList arrayList = k6Var.i;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (c((zi) arrayList.get(i3))) {
                g((zi) arrayList.get(i3));
            }
        }
    }

    public final void i(boolean z10) {
        k6 k6Var;
        f7 f7Var;
        ArrayList arrayList = new ArrayList(this.e.G);
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            String str = (String) obj;
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        z6 P1 = hp.s1(this.b).P1();
        long j10 = this.d;
        ArrayList F2 = P1.F(j10);
        if (F2 != null) {
            int size2 = F2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = F2.get(i10);
                i10++;
                y6 y6Var = (y6) obj2;
                if (y6Var != null && (f7Var = y6Var.c) != null && f7Var.J0 == j10 && !TextUtils.isEmpty(f7Var.K0) && !arrayList.contains(f7Var.K0)) {
                    arrayList.add(f7Var.K0);
                }
            }
        }
        ArrayList arrayList3 = this.f;
        ArrayList arrayList4 = new ArrayList(arrayList3);
        arrayList3.clear();
        int size3 = arrayList.size();
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList.get(i11);
            i11++;
            String str2 = (String) obj3;
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList4.size()) {
                    k6Var = null;
                    break;
                } else {
                    if (TextUtils.equals(((k6) arrayList4.get(i12)).E, str2)) {
                        k6Var = (k6) arrayList4.get(i12);
                        break;
                    }
                    i12++;
                }
            }
            if (k6Var == null) {
                k6 k6Var2 = new k6(this.b, this.d, str2, null);
                k6Var2.H(null);
                k6Var = k6Var2;
            }
            arrayList3.add(k6Var);
        }
        q3 q3Var = this.n;
        q3Var.k(true);
        SpannableString spannableString = new SpannableString(p1.k(2131746719, null, new StringBuilder("+ ")));
        wp wpVar = new wp(R.drawable.msg_filled_plus, 0);
        wpVar.I = 0.9f;
        wpVar.J = 0.9f;
        wpVar.H = 0.85f;
        spannableString.setSpan(wpVar, 0, 1, 33);
        m61 m61Var = this.r;
        m61Var.a(-1, spannableString);
        m61Var.y.f();
        boolean z11 = arrayList3.size() + 1 > 1;
        Boolean bool = this.s;
        if (bool == null || bool.booleanValue() != z11) {
            ValueAnimator valueAnimator = this.y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.s = Boolean.valueOf(z11);
            if (!z10) {
                this.x = z11 ? 1.0f : 0.0f;
                m61Var.setTranslationY(g0.L(z11 ? 0.0f : -42.0f));
                q3Var.setTranslationY(g0.L(z11 ? 42.0f : 0.0f));
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z11 ? 1.0f : 0.0f);
            this.y = ofFloat;
            ofFloat.addUpdateListener(new bh.f(this, 25));
            this.y.addListener(new x(5, this, z11));
            this.y.setDuration(320L);
            this.y.setInterpolator(xq.h);
            this.y.start();
        }
    }

    public final void j() {
        View currentView = this.n.getCurrentView();
        if (currentView instanceof m) {
            m mVar = (m) currentView;
            e eVar = mVar.f;
            for (int i3 = 0; i3 < eVar.getChildCount(); i3++) {
                View childAt = eVar.getChildAt(i3);
                if (childAt instanceof n7) {
                    n7 n7Var = (n7) childAt;
                    n7Var.i(mVar.a0.c(n7Var.getMessageObject()), true);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (F == null) {
            F = new LongSparseArray();
        }
        LongSparseArray longSparseArray = F;
        int i3 = this.b;
        long j10 = i3;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(j10);
        if (longSparseArray2 == null) {
            LongSparseArray longSparseArray3 = F;
            LongSparseArray longSparseArray4 = new LongSparseArray();
            longSparseArray3.put(j10, longSparseArray4);
            longSparseArray2 = longSparseArray4;
        }
        longSparseArray2.put(this.d, this);
        hs.f(i3).c(this, hs.x5);
        hs.f(i3).c(this, hs.v5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (F == null) {
            F = new LongSparseArray();
        }
        LongSparseArray longSparseArray = F;
        int i3 = this.b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(i3);
        if (longSparseArray2 != null) {
            longSparseArray2.remove(this.d);
        }
        hs.f(i3).n(this, hs.x5);
        hs.f(i3).n(this, hs.v5);
    }

    public void setVisibleHeight(int i3) {
        this.w = i3;
        View[] viewPages = this.n.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view instanceof m) {
                    ((m) view).setVisibleHeight(i3);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        e6 e6Var = this.c;
        try {
            setBackgroundColor(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, e6Var), org.telegram.ui.ActionBar.k6.r1(0.04f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var))));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
