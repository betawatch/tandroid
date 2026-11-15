package gi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.v4.media.session.a0;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import bi.f3;
import bi.v4;
import c8.ja;
import di.f4;
import di.z6;
import fi.c6;
import fi.r6;
import fi.s6;
import hi.d7;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Cells.n7;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.vp0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class q extends FrameLayout implements z5, is {
    public static LongSparseArray F;
    public static LongSparseArray G;
    public int E;
    public final e2 a;
    public final int b;
    public final e6 c;
    public final long d;
    public final c6 e;
    public final ArrayList f;
    public final ArrayList h;
    public final f3 n;
    public final v61 r;
    public Boolean s;
    public int w;
    public float x;
    public ValueAnimator y;

    public q(Context context, e2 e2Var, long j3) {
        super(context);
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.s = null;
        this.w = g0.q.y;
        this.E = Utilities.j(gz.u1, 6, 2);
        this.a = e2Var;
        int currentAccount = e2Var.getCurrentAccount();
        this.b = currentAccount;
        e6 resourceProvider = e2Var.getResourceProvider();
        this.c = resourceProvider;
        this.d = j3;
        setBackgroundColor(j6.w(j6.w0(j6.d6, resourceProvider), j6.r1(0.04f, j6.w0(j6.G6, resourceProvider))));
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
        c6 c6Var = (c6) longSparseArray.get(j3);
        if (c6Var == null) {
            c6 c6Var2 = new c6(currentAccount, j3, "", null);
            longSparseArray.put(j3, c6Var2);
            c6Var = c6Var2;
        }
        this.e = c6Var;
        vp0 vp0Var = (vp0) this;
        f3 f3Var = new f3(vp0Var, context);
        this.n = f3Var;
        f3Var.setAllowDisallowInterceptTouch(true);
        f3Var.setAdapter(new f4(1, context, vp0Var));
        addView(f3Var, ja.e(-1, -1, ns.E1));
        v61 i7 = f3Var.i(9, true);
        this.r = i7;
        i7.r = 12;
        i7.setPreTabClick(new z6(vp0Var, 13));
        addView(i7, ja.e(-1, 42, 48));
        i(false);
    }

    public final void a(String str) {
        e2 e2Var = this.a;
        if (e2Var == null || e2Var.getParentActivity() == null) {
            return;
        }
        ki kiVar = new ki(e2Var.getParentActivity(), this.a, false, false, false, this.c);
        kiVar.y1(1, false);
        kiVar.R2 = true;
        kiVar.Q2 = false;
        kiVar.h3.setText(hd.M0(2131752121, null));
        kiVar.e2.i0();
        kiVar.X3 = new a0(this, kiVar, str);
        kiVar.e1();
        kiVar.show();
    }

    public final void b(String str) {
        c6 c6Var;
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
                c6Var = null;
                break;
            }
            c6Var = (c6) arrayList.get(i7);
            if (c6Var != null && TextUtils.equals(c6Var.E, str)) {
                break;
            } else {
                i7++;
            }
        }
        if (c6Var != null) {
            ArrayList arrayList2 = c6Var.i;
            TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
            int i10 = this.b;
            deletepreviewmedia.bot = np.s1(i10).o1(this.d);
            deletepreviewmedia.lang_code = str;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                TL_stories.StoryItem storyItem = ((gj) arrayList2.get(i11)).l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    deletepreviewmedia.media.add(np.a5(messageMedia));
                }
            }
            ConnectionsManager.getInstance(i10).sendRequest(deletepreviewmedia, null);
        }
        i(true);
        this.r.d(-1, 0);
    }

    public abstract boolean c(gj gjVar);

    public final boolean d() {
        c6 c6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof m) || (c6Var = ((m) currentView).a) == null) {
            return true;
        }
        ArrayList arrayList = c6Var.i;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (!c((gj) arrayList.get(i7))) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ns.x5;
        f3 f3Var = this.n;
        int i12 = 0;
        if (i7 != i11) {
            if (i7 == ns.v5) {
                i(true);
                View[] viewPages = f3Var.getViewPages();
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
        c6 c6Var = this.e;
        if (obj == c6Var) {
            i(true);
            View[] viewPages2 = f3Var.getViewPages();
            int length2 = viewPages2.length;
            while (i12 < length2) {
                View view2 = viewPages2[i12];
                if (view2 instanceof m) {
                    m mVar = (m) view2;
                    if (mVar.a == c6Var) {
                        mVar.w.f();
                    }
                }
                i12++;
            }
            return;
        }
        if (this.f.indexOf(obj) >= 0) {
            View[] viewPages3 = f3Var.getViewPages();
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

    public abstract boolean e(gj gjVar);

    public final void f() {
        c6 c6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof m) || (c6Var = ((m) currentView).a) == null) {
            return;
        }
        ArrayList arrayList = c6Var.i;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (!c((gj) arrayList.get(i7))) {
                e((gj) arrayList.get(i7));
            }
        }
    }

    public abstract boolean g(gj gjVar);

    public String getBotPreviewsSubtitle() {
        int i7;
        int i10;
        TLRPC.MessageMedia messageMedia;
        StringBuilder sb2 = new StringBuilder();
        View currentView = this.n.getCurrentView();
        if (currentView instanceof m) {
            c6 c6Var = ((m) currentView).a;
            if (c6Var != null) {
                ArrayList arrayList = c6Var.i;
                i7 = 0;
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    gj gjVar = (gj) arrayList.get(i11);
                    TL_stories.StoryItem storyItem = gjVar.l;
                    if (storyItem != null && (messageMedia = storyItem.media) != null) {
                        if (gj.K4(messageMedia.document)) {
                            i10++;
                        } else if (gjVar.l.media.photo != null) {
                            i7++;
                        }
                    }
                }
            } else {
                i7 = 0;
                i10 = 0;
            }
            if (i7 == 0 && i10 == 0) {
                return hd.M0(2131753014, null);
            }
            if (i7 > 0) {
                sb2.append(hd.G(i7, "Images", new Object[0]));
            }
            if (i10 > 0) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(hd.G(i10, "Videos", new Object[0]));
            }
        }
        return sb2.toString();
    }

    public String getCurrentLang() {
        View view;
        c6 c6Var;
        f3 f3Var = this.n;
        View[] viewPages = f3Var.getViewPages();
        if (Math.abs(f3Var.getCurrentPosition() - f3Var.getPositionAnimated()) >= 0.5f || (view = viewPages[1]) == null) {
            view = viewPages[0];
        }
        if (!(view instanceof m) || (c6Var = ((m) view).a) == null) {
            return null;
        }
        return c6Var.E;
    }

    public c6 getCurrentList() {
        c6 c6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof m) || (c6Var = ((m) currentView).a) == null) {
            return null;
        }
        return c6Var;
    }

    public uj0 getCurrentListView() {
        View currentView = this.n.getCurrentView();
        if (currentView instanceof m) {
            return ((m) currentView).f;
        }
        return null;
    }

    public int getItemsCount() {
        c6 c6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof m) || (c6Var = ((m) currentView).a) == null) {
            return 0;
        }
        return c6Var.i.size();
    }

    public int getStartedTrackingX() {
        return 0;
    }

    public final void h() {
        c6 c6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof m) || (c6Var = ((m) currentView).a) == null) {
            return;
        }
        ArrayList arrayList = c6Var.i;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (c((gj) arrayList.get(i7))) {
                g((gj) arrayList.get(i7));
            }
        }
    }

    public final void i(boolean z10) {
        c6 c6Var;
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
        s6 P1 = np.s1(this.b).P1();
        long j3 = this.d;
        ArrayList F2 = P1.F(j3);
        if (F2 != null) {
            int size2 = F2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = F2.get(i10);
                i10++;
                r6 r6Var = (r6) obj2;
                if (r6Var != null && (d7Var = r6Var.c) != null && d7Var.J0 == j3 && !TextUtils.isEmpty(d7Var.K0) && !arrayList.contains(d7Var.K0)) {
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
                    c6Var = null;
                    break;
                } else {
                    if (TextUtils.equals(((c6) arrayList4.get(i12)).E, str2)) {
                        c6Var = (c6) arrayList4.get(i12);
                        break;
                    }
                    i12++;
                }
            }
            if (c6Var == null) {
                c6 c6Var2 = new c6(this.b, this.d, str2, null);
                c6Var2.H(null);
                c6Var = c6Var2;
            }
            arrayList3.add(c6Var);
        }
        f3 f3Var = this.n;
        f3Var.k(true);
        SpannableString spannableString = new SpannableString(i5.c.k(2131746711, null, new StringBuilder("+ ")));
        eq eqVar = new eq(R.drawable.msg_filled_plus, 0);
        eqVar.I = 0.9f;
        eqVar.J = 0.9f;
        eqVar.H = 0.85f;
        spannableString.setSpan(eqVar, 0, 1, 33);
        v61 v61Var = this.r;
        v61Var.a(-1, spannableString);
        v61Var.y.f();
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
                v61Var.setTranslationY(g0.L(z11 ? 0.0f : -42.0f));
                f3Var.setTranslationY(g0.L(z11 ? 42.0f : 0.0f));
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z11 ? 1.0f : 0.0f);
            this.y = ofFloat;
            ofFloat.addUpdateListener(new ah.h(this, 25));
            this.y.addListener(new v4(5, this, z11));
            this.y.setDuration(320L);
            this.y.setInterpolator(er.h);
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
        ns.f(i7).c(this, ns.x5);
        ns.f(i7).c(this, ns.v5);
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
        ns.f(i7).n(this, ns.x5);
        ns.f(i7).n(this, ns.v5);
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        e6 e6Var = this.c;
        try {
            setBackgroundColor(j6.w(j6.w0(j6.d6, e6Var), j6.r1(0.04f, j6.w0(j6.G6, e6Var))));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
