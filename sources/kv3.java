// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kv3 extends d {
    public gv3 E;
    public hv3 a;
    public r59 b;
    public hu5 c;
    public ImageView d;
    public final ArrayList e;
    public jv3 f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public int w;
    public final int x;
    public final int y;

    public kv3(int i, int i2) {
        super(null);
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.x = i;
        this.y = i2;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        getMessagesStorage().n0(i2, i, arrayList, arrayList2, arrayList3, true);
        getMessagesController().d4(arrayList2, true);
        getMessagesController().X3(arrayList3, true);
        e0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.a7));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
        hashSet.add(Integer.valueOf(cmb.c6));
    }

    public final void c0() {
        if (getParentActivity() == null) {
            return;
        }
        getParentActivity().finish();
        gm.d3(new bi3(this, (byte) 19), 1000L);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && ((ActionBarLayout) tk5Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        a aVar = this.actionBar;
        if (this.x == 0) {
            aVar.setTitle(jb6.M0(2131742540, null));
        } else {
            aVar.setTitle(jb6.M0(2131742531, null));
        }
        this.actionBar.t().e(1, jb6.M0(2131751291, null).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new fh2(this, (byte) 14));
        this.a = new hv3(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        anb.h(cmb.Z6, null, frameLayout);
        this.fragmentView = frameLayout;
        r59 r59Var = new r59(context, null);
        this.b = r59Var;
        r59Var.setLayoutManager(new u46(1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        ((sc3) this.b.getItemAnimator()).C = false;
        frameLayout.addView(this.b, qoe.c(-1.0f, -1));
        hu5 hu5Var = new hu5(new iv3(this));
        this.c = hu5Var;
        hu5Var.h(this.b);
        this.b.setOnItemClickListener(new k0(this, context, (byte) 12));
        this.b.setOnItemLongClickListener(new hi2(this));
        return this.fragmentView;
    }

    public final void d0(Context context, int i) {
        ht5 ht5Var;
        int i2;
        if (i == this.h) {
            it5 it5Var = new it5(context, this.currentAccount, null, 0L, this, null);
            it5Var.g2 = new yu3(this, (byte) 1);
            nm7.f(it5Var.a).b(it5Var, nm7.r);
            it5Var.h2 = new ArrayList(oc7.r1(it5Var.a).F);
            it5Var.O0();
            ArrayList arrayList = this.e;
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                ht5Var = it5Var.O1;
                if (i3 >= size) {
                    break;
                }
                Long l = (Long) arrayList.get(i3);
                long longValue = l.longValue();
                boolean y = pg3.y(longValue);
                int i4 = it5Var.a;
                wc5 wc5Var = new wc5(ht5Var.getContext(), y ? oc7.r1(i4).L0(Long.valueOf(-longValue)) : oc7.r1(i4).W1(l));
                ht5Var.a(wc5Var, false);
                wc5Var.setOnClickListener(it5Var.l2);
                i3++;
            }
            it5Var.N0(false);
            int childCount = ht5Var.getChildCount();
            Point point = gm.q;
            byte b = point.x >= point.y ? (byte) 0 : (byte) 1;
            if (gm.O1() || b != 0) {
                it5Var.m2 = gm.L(144.0f);
            } else {
                it5Var.m2 = gm.L(56.0f);
            }
            boolean O1 = gm.O1();
            int i5 = point.x;
            if (O1) {
                i2 = (int) (Math.min(i5, point.y) * 0.8f);
            } else {
                if (b == 0) {
                    i5 = (int) Math.max(i5 * 0.8f, Math.min(gm.L(480.0f), point.x));
                }
                i2 = i5;
            }
            int L = i2 - gm.L(26.0f);
            int L2 = gm.L(10.0f);
            int i6 = 0;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = ht5Var.getChildAt(i7);
                if (childAt instanceof wc5) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i2, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(32.0f), TLObject.FLAG_30));
                    if (childAt.getMeasuredWidth() + i6 > L) {
                        L2 = hg9.v(8.0f, childAt.getMeasuredHeight(), L2);
                        i6 = 0;
                    }
                    i6 = hg9.v(9.0f, childAt.getMeasuredWidth(), i6);
                }
            }
            int L3 = gm.L(42.0f) + L2;
            int min = it5Var.g2 != null ? it5Var.a2 ? Math.min(it5Var.m2, L3) : 0 : b10.c(52.0f, Math.min(it5Var.m2, L3), 0);
            int i8 = it5Var.o2;
            int L4 = it5Var.Z1.m() > 0 ? gm.L(56.0f) : 0;
            it5Var.o2 = L4;
            if (min != it5Var.i2 || i8 != L4) {
                it5Var.i2 = min;
            }
            showDialog(it5Var);
        }
    }

    public final void e0() {
        this.w = 2;
        this.h = true;
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            this.n = -1;
            this.r = -1;
        } else {
            int i = this.w;
            this.n = i;
            int size = arrayList.size() + i;
            this.w = size;
            this.r = size;
        }
        int i2 = this.w;
        this.w = i2 + 1;
        this.s = i2;
        hv3 hv3Var = this.a;
        if (hv3Var != null) {
            hv3Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.actionBar, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.F8));
        arrayList.add(new cnb(this.actionBar, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.D8));
        arrayList.add(new cnb(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.E8));
        int i = cmb.p6;
        arrayList.add(new cnb(this.b, 0, new Class[]{xib.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.b, 0, new Class[]{xib.class}, new String[]{"imageView"}, (Drawable[]) null, (bnb) null, i));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        if (this.E != null) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        c0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        nk3.x4(j5.a(this.currentAccount));
        getMediaDataController().O0(true);
        return super.onFragmentCreate();
    }
}
