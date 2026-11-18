package gi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.v4.media.session.a0;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import bi.m5;
import c8.ma;
import di.c7;
import di.i4;
import fi.o6;
import fi.p6;
import fi.z5;
import hi.d7;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.p7;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.si;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public abstract class q extends FrameLayout implements c6, fs {
    public static LongSparseArray F;
    public static LongSparseArray G;
    public int E;
    public final h2 a;
    public final int b;
    public final i6 c;
    public final long d;
    public final z5 e;
    public final ArrayList f;
    public final ArrayList h;
    public final m5 n;
    public final f71 r;
    public Boolean s;
    public int w;
    public float x;
    public ValueAnimator y;

    public q(Context context, h2 h2Var, long j3) {
        super(context);
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.s = null;
        this.w = g0.q.y;
        this.E = Utilities.j(bz.u1, 6, 2);
        this.a = h2Var;
        int currentAccount = h2Var.getCurrentAccount();
        this.b = currentAccount;
        i6 resourceProvider = h2Var.getResourceProvider();
        this.c = resourceProvider;
        this.d = j3;
        setBackgroundColor(n6.w(n6.w0(n6.d6, resourceProvider), n6.r1(0.04f, n6.w0(n6.G6, resourceProvider))));
        if (G == null) {
            G = new LongSparseArray();
        }
        long j10 = currentAccount;
        LongSparseArray longSparseArray = (LongSparseArray) G.get(j10);
        if (longSparseArray == null) {
            LongSparseArray longSparseArray2 = G;
            LongSparseArray longSparseArray3 = new LongSparseArray();
            longSparseArray2.put(j10, longSparseArray3);
            longSparseArray = longSparseArray3;
        }
        z5 z5Var = (z5) longSparseArray.get(j3);
        if (z5Var == null) {
            z5 z5Var2 = new z5(currentAccount, j3, "", null);
            longSparseArray.put(j3, z5Var2);
            z5Var = z5Var2;
        }
        this.e = z5Var;
        dq0 dq0Var = (dq0) this;
        m5 m5Var = new m5(dq0Var, context);
        this.n = m5Var;
        m5Var.setAllowDisallowInterceptTouch(true);
        m5Var.setAdapter(new i4(1, context, dq0Var));
        addView(m5Var, ma.e(-1, -1, ks.E1));
        f71 i7 = m5Var.i(9, true);
        this.r = i7;
        i7.r = 12;
        i7.setPreTabClick(new c7(dq0Var, 13));
        addView(i7, ma.e(-1, 42, 48));
        i(false);
    }

    public final void a(String str) {
        h2 h2Var = this.a;
        if (h2Var == null || h2Var.getParentActivity() == null) {
            return;
        }
        si siVar = new si(h2Var.getParentActivity(), this.a, false, false, false, this.c);
        siVar.z1(1, false);
        siVar.R2 = true;
        siVar.Q2 = false;
        siVar.h3.setText(gd.M0(2131752110, null));
        siVar.e2.i0();
        siVar.X3 = new a0(this, siVar, str);
        siVar.f1();
        siVar.show();
    }

    public final void b(String str) {
        z5 z5Var;
        TLRPC.MessageMedia messageMedia;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.e.G.remove(str);
        this.h.remove(str);
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i7 >= arrayList.size()) {
                z5Var = null;
                break;
            }
            z5Var = (z5) arrayList.get(i7);
            if (z5Var != null && TextUtils.equals(z5Var.E, str)) {
                break;
            } else {
                i7++;
            }
        }
        if (z5Var != null) {
            ArrayList arrayList2 = z5Var.i;
            TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
            int i10 = this.b;
            deletepreviewmedia.bot = mp.u1(i10).q1(this.d);
            deletepreviewmedia.lang_code = str;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                TL_stories.StoryItem storyItem = ((fj) arrayList2.get(i11)).l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    deletepreviewmedia.media.add(mp.l5(messageMedia));
                }
            }
            ConnectionsManager.getInstance(i10).sendRequest(deletepreviewmedia, null);
        }
        i(true);
        this.r.e(-1, 0);
    }

    public abstract boolean c(fj fjVar);

    public final boolean d() {
        z5 z5Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof m) || (z5Var = ((m) currentView).a) == null) {
            return true;
        }
        ArrayList arrayList = z5Var.i;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (!c((fj) arrayList.get(i7))) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ks.A5;
        m5 m5Var = this.n;
        int i12 = 0;
        if (i7 != i11) {
            if (i7 == ks.y5) {
                i(true);
                View[] viewPages = m5Var.getViewPages();
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
        z5 z5Var = this.e;
        if (obj == z5Var) {
            i(true);
            View[] viewPages2 = m5Var.getViewPages();
            int length2 = viewPages2.length;
            while (i12 < length2) {
                View view2 = viewPages2[i12];
                if (view2 instanceof m) {
                    m mVar = (m) view2;
                    if (mVar.a == z5Var) {
                        mVar.w.f();
                    }
                }
                i12++;
            }
            return;
        }
        if (this.f.indexOf(obj) >= 0) {
            View[] viewPages3 = m5Var.getViewPages();
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

    public abstract boolean e(fj fjVar);

    public final void f() {
        z5 z5Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof m) || (z5Var = ((m) currentView).a) == null) {
            return;
        }
        ArrayList arrayList = z5Var.i;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (!c((fj) arrayList.get(i7))) {
                e((fj) arrayList.get(i7));
            }
        }
    }

    public abstract boolean g(fj fjVar);

    public String getBotPreviewsSubtitle() {
        int i7;
        int i10;
        TLRPC.MessageMedia messageMedia;
        StringBuilder sb2 = new StringBuilder();
        View currentView = this.n.getCurrentView();
        if (currentView instanceof m) {
            z5 z5Var = ((m) currentView).a;
            if (z5Var != null) {
                ArrayList arrayList = z5Var.i;
                i7 = 0;
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    fj fjVar = (fj) arrayList.get(i11);
                    TL_stories.StoryItem storyItem = fjVar.l;
                    if (storyItem != null && (messageMedia = storyItem.media) != null) {
                        if (fj.K4(messageMedia.document)) {
                            i10++;
                        } else if (fjVar.l.media.photo != null) {
                            i7++;
                        }
                    }
                }
            } else {
                i7 = 0;
                i10 = 0;
            }
            if (i7 == 0 && i10 == 0) {
                return gd.M0(2131753003, null);
            }
            if (i7 > 0) {
                sb2.append(gd.G(i7, "Images", new Object[0]));
            }
            if (i10 > 0) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(gd.G(i10, "Videos", new Object[0]));
            }
        }
        return sb2.toString();
    }

    public String getCurrentLang() {
        View view;
        z5 z5Var;
        m5 m5Var = this.n;
        View[] viewPages = m5Var.getViewPages();
        if (Math.abs(m5Var.getCurrentPosition() - m5Var.getPositionAnimated()) >= 0.5f || (view = viewPages[1]) == null) {
            view = viewPages[0];
        }
        if (!(view instanceof m) || (z5Var = ((m) view).a) == null) {
            return null;
        }
        return z5Var.E;
    }

    public z5 getCurrentList() {
        z5 z5Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof m) || (z5Var = ((m) currentView).a) == null) {
            return null;
        }
        return z5Var;
    }

    public ck0 getCurrentListView() {
        View currentView = this.n.getCurrentView();
        if (currentView instanceof m) {
            return ((m) currentView).f;
        }
        return null;
    }

    public int getItemsCount() {
        z5 z5Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof m) || (z5Var = ((m) currentView).a) == null) {
            return 0;
        }
        return z5Var.i.size();
    }

    public int getStartedTrackingX() {
        return 0;
    }

    public final void h() {
        z5 z5Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof m) || (z5Var = ((m) currentView).a) == null) {
            return;
        }
        ArrayList arrayList = z5Var.i;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (c((fj) arrayList.get(i7))) {
                g((fj) arrayList.get(i7));
            }
        }
    }

    public final void i(boolean z10) {
        z5 z5Var;
        d7 d7Var;
        ArrayList arrayList = new ArrayList(this.e.G);
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            String str = (String) obj;
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        p6 R1 = mp.u1(this.b).R1();
        long j3 = this.d;
        ArrayList F2 = R1.F(j3);
        if (F2 != null) {
            int size2 = F2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = F2.get(i10);
                i10++;
                o6 o6Var = (o6) obj2;
                if (o6Var != null && (d7Var = o6Var.c) != null && d7Var.J0 == j3 && !TextUtils.isEmpty(d7Var.K0) && !arrayList.contains(d7Var.K0)) {
                    arrayList.add(d7Var.K0);
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
                    z5Var = null;
                    break;
                } else {
                    if (TextUtils.equals(((z5) arrayList4.get(i12)).E, str2)) {
                        z5Var = (z5) arrayList4.get(i12);
                        break;
                    }
                    i12++;
                }
            }
            if (z5Var == null) {
                z5 z5Var2 = new z5(this.b, this.d, str2, null);
                z5Var2.H(null);
                z5Var = z5Var2;
            }
            arrayList3.add(z5Var);
        }
        m5 m5Var = this.n;
        m5Var.j(true);
        SpannableString spannableString = new SpannableString(i5.c.k(2131746516, null, new StringBuilder("+ ")));
        lq lqVar = new lq(R.drawable.msg_filled_plus, 0);
        lqVar.I = 0.9f;
        lqVar.J = 0.9f;
        lqVar.H = 0.85f;
        spannableString.setSpan(lqVar, 0, 1, 33);
        f71 f71Var = this.r;
        f71Var.a(-1, spannableString);
        f71Var.y.f();
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
                f71Var.setTranslationY(g0.L(z11 ? 0.0f : -42.0f));
                m5Var.setTranslationY(g0.L(z11 ? 42.0f : 0.0f));
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z11 ? 1.0f : 0.0f);
            this.y = ofFloat;
            ofFloat.addUpdateListener(new ah.g(this, 25));
            this.y.addListener(new bi.d7(5, this, z11));
            this.y.setDuration(320L);
            this.y.setInterpolator(lr.h);
            this.y.start();
        }
    }

    public final void j() {
        View currentView = this.n.getCurrentView();
        if (currentView instanceof m) {
            m mVar = (m) currentView;
            e eVar = mVar.f;
            for (int i7 = 0; i7 < eVar.getChildCount(); i7++) {
                View childAt = eVar.getChildAt(i7);
                if (childAt instanceof p7) {
                    p7 p7Var = (p7) childAt;
                    p7Var.i(mVar.a0.c(p7Var.getMessageObject()), true);
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
        int i7 = this.b;
        long j3 = i7;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(j3);
        if (longSparseArray2 == null) {
            LongSparseArray longSparseArray3 = F;
            LongSparseArray longSparseArray4 = new LongSparseArray();
            longSparseArray3.put(j3, longSparseArray4);
            longSparseArray2 = longSparseArray4;
        }
        longSparseArray2.put(this.d, this);
        ks.f(i7).c(this, ks.A5);
        ks.f(i7).c(this, ks.y5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (F == null) {
            F = new LongSparseArray();
        }
        LongSparseArray longSparseArray = F;
        int i7 = this.b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(i7);
        if (longSparseArray2 != null) {
            longSparseArray2.remove(this.d);
        }
        ks.f(i7).n(this, ks.A5);
        ks.f(i7).n(this, ks.y5);
    }

    public void setVisibleHeight(int i7) {
        this.w = i7;
        View[] viewPages = this.n.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view instanceof m) {
                    ((m) view).setVisibleHeight(i7);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        i6 i6Var = this.c;
        try {
            setBackgroundColor(n6.w(n6.w0(n6.d6, i6Var), n6.r1(0.04f, n6.w0(n6.G6, i6Var))));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
