package ei;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.v4.media.session.a0;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import bi.g5;
import c8.ha;
import ch.y;
import di.j6;
import di.q4;
import di.x6;
import di.y6;
import fi.e7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public abstract class r extends FrameLayout implements a6, ls {
    public static LongSparseArray E;
    public static LongSparseArray F;
    public int D;
    public final f2 a;
    public final int b;
    public final f6 c;
    public final long d;
    public final j6 e;
    public final ArrayList f;
    public final ArrayList h;
    public final a n;
    public final u61 r;
    public Boolean s;
    public int w;
    public float x;
    public ValueAnimator y;

    public r(Context context, f2 f2Var, long j3) {
        super(context);
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.s = null;
        this.w = g0.q.y;
        this.D = Utilities.j(iz.u1, 6, 2);
        this.a = f2Var;
        int currentAccount = f2Var.getCurrentAccount();
        this.b = currentAccount;
        f6 resourceProvider = f2Var.getResourceProvider();
        this.c = resourceProvider;
        this.d = j3;
        setBackgroundColor(k6.w(k6.w0(k6.d6, resourceProvider), k6.r1(0.04f, k6.w0(k6.G6, resourceProvider))));
        if (F == null) {
            F = new LongSparseArray();
        }
        long j10 = currentAccount;
        LongSparseArray longSparseArray = (LongSparseArray) F.get(j10);
        if (longSparseArray == null) {
            LongSparseArray longSparseArray2 = F;
            LongSparseArray longSparseArray3 = new LongSparseArray();
            longSparseArray2.put(j10, longSparseArray3);
            longSparseArray = longSparseArray3;
        }
        j6 j6Var = (j6) longSparseArray.get(j3);
        if (j6Var == null) {
            j6 j6Var2 = new j6(currentAccount, j3, "", null);
            longSparseArray.put(j3, j6Var2);
            j6Var = j6Var2;
        }
        this.e = j6Var;
        sp0 sp0Var = (sp0) this;
        a aVar = new a(sp0Var, context);
        this.n = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        aVar.setAdapter(new g5(1, context, sp0Var));
        addView(aVar, ha.e(-1, -1, qs.E1));
        u61 n10 = aVar.n(9, true);
        this.r = n10;
        n10.r = 12;
        n10.setPreTabClick(new q4(sp0Var, 6));
        addView(n10, ha.e(-1, 42, 48));
        i(false);
    }

    public final void a(String str) {
        f2 f2Var = this.a;
        if (f2Var == null || f2Var.getParentActivity() == null) {
            return;
        }
        di diVar = new di(f2Var.getParentActivity(), this.a, false, false, false, this.c);
        diVar.y1(1, false);
        diVar.N2 = true;
        diVar.M2 = false;
        diVar.d3.setText(id.M0(2131752121, null));
        diVar.a2.i0();
        diVar.T3 = new a0((FrameLayout) this, (Object) diVar, (Serializable) str, 21);
        diVar.e1();
        diVar.show();
    }

    public final void b(String str) {
        j6 j6Var;
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
                j6Var = null;
                break;
            }
            j6Var = (j6) arrayList.get(i7);
            if (j6Var != null && TextUtils.equals(j6Var.E, str)) {
                break;
            } else {
                i7++;
            }
        }
        if (j6Var != null) {
            ArrayList arrayList2 = j6Var.i;
            TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
            int i10 = this.b;
            deletepreviewmedia.bot = qp.s1(i10).o1(this.d);
            deletepreviewmedia.lang_code = str;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                TL_stories.StoryItem storyItem = ((ij) arrayList2.get(i11)).l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    deletepreviewmedia.media.add(qp.Z4(messageMedia));
                }
            }
            ConnectionsManager.getInstance(i10).sendRequest(deletepreviewmedia, null);
        }
        i(true);
        this.r.d(-1, 0);
    }

    public abstract boolean c(ij ijVar);

    public final boolean d() {
        j6 j6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof n) || (j6Var = ((n) currentView).a) == null) {
            return true;
        }
        ArrayList arrayList = j6Var.i;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (!c((ij) arrayList.get(i7))) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = qs.x5;
        a aVar = this.n;
        int i12 = 0;
        if (i7 != i11) {
            if (i7 == qs.v5) {
                i(true);
                View[] viewPages = aVar.getViewPages();
                int length = viewPages.length;
                while (i12 < length) {
                    View view = viewPages[i12];
                    if (view instanceof n) {
                        ((n) view).w.f();
                    }
                    i12++;
                }
                return;
            }
            return;
        }
        Object obj = objArr[0];
        j6 j6Var = this.e;
        if (obj == j6Var) {
            i(true);
            View[] viewPages2 = aVar.getViewPages();
            int length2 = viewPages2.length;
            while (i12 < length2) {
                View view2 = viewPages2[i12];
                if (view2 instanceof n) {
                    n nVar = (n) view2;
                    if (nVar.a == j6Var) {
                        nVar.w.f();
                    }
                }
                i12++;
            }
            return;
        }
        if (this.f.indexOf(obj) >= 0) {
            View[] viewPages3 = aVar.getViewPages();
            for (View view3 : viewPages3) {
                if (view3 instanceof n) {
                    n nVar2 = (n) view3;
                    if (nVar2.a == objArr[0]) {
                        nVar2.w.f();
                    }
                }
            }
        }
    }

    public abstract boolean e(ij ijVar);

    public final void f() {
        j6 j6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof n) || (j6Var = ((n) currentView).a) == null) {
            return;
        }
        ArrayList arrayList = j6Var.i;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (!c((ij) arrayList.get(i7))) {
                e((ij) arrayList.get(i7));
            }
        }
    }

    public abstract boolean g(ij ijVar);

    public String getBotPreviewsSubtitle() {
        int i7;
        int i10;
        TLRPC.MessageMedia messageMedia;
        StringBuilder sb2 = new StringBuilder();
        View currentView = this.n.getCurrentView();
        if (currentView instanceof n) {
            j6 j6Var = ((n) currentView).a;
            if (j6Var != null) {
                ArrayList arrayList = j6Var.i;
                i7 = 0;
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ij ijVar = (ij) arrayList.get(i11);
                    TL_stories.StoryItem storyItem = ijVar.l;
                    if (storyItem != null && (messageMedia = storyItem.media) != null) {
                        if (ij.L4(messageMedia.document)) {
                            i10++;
                        } else if (ijVar.l.media.photo != null) {
                            i7++;
                        }
                    }
                }
            } else {
                i7 = 0;
                i10 = 0;
            }
            if (i7 == 0 && i10 == 0) {
                return id.M0(2131753014, null);
            }
            if (i7 > 0) {
                sb2.append(id.G(i7, "Images", new Object[0]));
            }
            if (i10 > 0) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(id.G(i10, "Videos", new Object[0]));
            }
        }
        return sb2.toString();
    }

    public String getCurrentLang() {
        View view;
        j6 j6Var;
        a aVar = this.n;
        View[] viewPages = aVar.getViewPages();
        if (Math.abs(aVar.getCurrentPosition() - aVar.getPositionAnimated()) >= 0.5f || (view = viewPages[1]) == null) {
            view = viewPages[0];
        }
        if (!(view instanceof n) || (j6Var = ((n) view).a) == null) {
            return null;
        }
        return j6Var.E;
    }

    public j6 getCurrentList() {
        j6 j6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof n) || (j6Var = ((n) currentView).a) == null) {
            return null;
        }
        return j6Var;
    }

    public pj0 getCurrentListView() {
        View currentView = this.n.getCurrentView();
        if (currentView instanceof n) {
            return ((n) currentView).f;
        }
        return null;
    }

    public int getItemsCount() {
        j6 j6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof n) || (j6Var = ((n) currentView).a) == null) {
            return 0;
        }
        return j6Var.i.size();
    }

    public int getStartedTrackingX() {
        return 0;
    }

    public final void h() {
        j6 j6Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof n) || (j6Var = ((n) currentView).a) == null) {
            return;
        }
        ArrayList arrayList = j6Var.i;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (c((ij) arrayList.get(i7))) {
                g((ij) arrayList.get(i7));
            }
        }
    }

    public final void i(boolean z9) {
        j6 j6Var;
        e7 e7Var;
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
        y6 P1 = qp.s1(this.b).P1();
        long j3 = this.d;
        ArrayList F2 = P1.F(j3);
        if (F2 != null) {
            int size2 = F2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = F2.get(i10);
                i10++;
                x6 x6Var = (x6) obj2;
                if (x6Var != null && (e7Var = x6Var.c) != null && e7Var.J0 == j3 && !TextUtils.isEmpty(e7Var.K0) && !arrayList.contains(e7Var.K0)) {
                    arrayList.add(e7Var.K0);
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
                    j6Var = null;
                    break;
                } else {
                    if (TextUtils.equals(((j6) arrayList4.get(i12)).E, str2)) {
                        j6Var = (j6) arrayList4.get(i12);
                        break;
                    }
                    i12++;
                }
            }
            if (j6Var == null) {
                j6 j6Var2 = new j6(this.b, this.d, str2, null);
                j6Var2.H(null);
                j6Var = j6Var2;
            }
            arrayList3.add(j6Var);
        }
        a aVar = this.n;
        aVar.o(true);
        SpannableString spannableString = new SpannableString(jg.g.l(2131746712, null, new StringBuilder("+ ")));
        wp wpVar = new wp(R.drawable.msg_filled_plus, 0);
        wpVar.H = 0.9f;
        wpVar.I = 0.9f;
        wpVar.G = 0.85f;
        spannableString.setSpan(wpVar, 0, 1, 33);
        u61 u61Var = this.r;
        u61Var.a(-1, spannableString);
        u61Var.y.f();
        boolean z10 = arrayList3.size() + 1 > 1;
        Boolean bool = this.s;
        if (bool == null || bool.booleanValue() != z10) {
            ValueAnimator valueAnimator = this.y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.s = Boolean.valueOf(z10);
            if (!z9) {
                this.x = z10 ? 1.0f : 0.0f;
                u61Var.setTranslationY(g0.L(z10 ? 0.0f : -42.0f));
                aVar.setTranslationY(g0.L(z10 ? 42.0f : 0.0f));
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z10 ? 1.0f : 0.0f);
            this.y = ofFloat;
            ofFloat.addUpdateListener(new ah.h(this, 24));
            this.y.addListener(new y(4, this, z10));
            this.y.setDuration(320L);
            this.y.setInterpolator(xq.h);
            this.y.start();
        }
    }

    public final void j() {
        View currentView = this.n.getCurrentView();
        if (currentView instanceof n) {
            n nVar = (n) currentView;
            f fVar = nVar.f;
            for (int i7 = 0; i7 < fVar.getChildCount(); i7++) {
                View childAt = fVar.getChildAt(i7);
                if (childAt instanceof o7) {
                    o7 o7Var = (o7) childAt;
                    o7Var.i(nVar.W.c(o7Var.getMessageObject()), true);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (E == null) {
            E = new LongSparseArray();
        }
        LongSparseArray longSparseArray = E;
        int i7 = this.b;
        long j3 = i7;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(j3);
        if (longSparseArray2 == null) {
            LongSparseArray longSparseArray3 = E;
            LongSparseArray longSparseArray4 = new LongSparseArray();
            longSparseArray3.put(j3, longSparseArray4);
            longSparseArray2 = longSparseArray4;
        }
        longSparseArray2.put(this.d, this);
        qs.f(i7).c(this, qs.x5);
        qs.f(i7).c(this, qs.v5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (E == null) {
            E = new LongSparseArray();
        }
        LongSparseArray longSparseArray = E;
        int i7 = this.b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(i7);
        if (longSparseArray2 != null) {
            longSparseArray2.remove(this.d);
        }
        qs.f(i7).n(this, qs.x5);
        qs.f(i7).n(this, qs.v5);
    }

    public void setVisibleHeight(int i7) {
        this.w = i7;
        View[] viewPages = this.n.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view instanceof n) {
                    ((n) view).setVisibleHeight(i7);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        f6 f6Var = this.c;
        try {
            setBackgroundColor(k6.w(k6.w0(k6.d6, f6Var), k6.r1(0.04f, k6.w0(k6.G6, f6Var))));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
