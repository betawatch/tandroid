// default package

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class m66 extends d {
    public FrameLayout a;
    public o39 b;
    public t26 c;
    public c83 d;
    public m21 e;
    public int f;
    public final hj3 h;
    public final boolean[] n;
    public final ArrayList r;
    public final ArrayList s;

    public m66() {
        super(null);
        this.h = new hj3(this, (byte) 23);
        this.n = new boolean[3];
        this.r = new ArrayList();
        this.s = new ArrayList();
    }

    public final int Y(int i) {
        if (i == 3) {
            return 0;
        }
        if (i == 28700) {
            return 1;
        }
        return i == this.f ? 2 : -1;
    }

    public final void Z(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.s;
            if (i2 >= arrayList.size()) {
                return;
            }
            if (((g66) arrayList.get(i2)).e == i) {
                this.b.f1(new jh((Object) this, i2, (byte) 11), 700, true);
                return;
            }
            i2++;
        }
    }

    public final void a0(int i) {
        int Y = Y(i);
        if (Y == -1) {
            return;
        }
        this.n[Y] = true;
        c0();
        b0();
    }

    public final void b0() {
        ArrayList arrayList = this.r;
        arrayList.clear();
        ArrayList arrayList2 = this.s;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new g66(1, 0, 0, 0, null));
        arrayList2.add(new g66(2, 0, 0, 0, e66.c() <= 0 ? k96.M0(2131748679, null) : e66.c() >= 100 ? k96.M0(2131748678, null) : k96.a0(null, null, 2131748680, String.format("%d%%", Integer.valueOf(e66.c())))));
        arrayList2.add(new g66(0, 0, 0, 0, k96.M0(2131748656, null)));
        arrayList2.add(g66.c(R.drawable.msg2_sticker, 3, k96.M0(2131748658, null)));
        boolean[] zArr = this.n;
        if (zArr[0]) {
            arrayList2.add(g66.b(1, k96.M0(2131748670, null)));
            arrayList2.add(g66.b(2, k96.M0(2131748672, null)));
        }
        arrayList2.add(g66.c(R.drawable.msg2_smile_status, 28700, k96.M0(2131748663, null)));
        if (zArr[1]) {
            arrayList2.add(g66.b(16388, k96.M0(2131748670, null)));
            arrayList2.add(g66.b(8200, k96.M0(2131748669, null)));
            arrayList2.add(g66.b(4112, k96.M0(2131748672, null)));
        }
        arrayList2.add(g66.c(R.drawable.msg2_ask_question, this.f, k96.M0(2131748664, null)));
        if (zArr[2]) {
            arrayList2.add(g66.b(32, k96.N0("LiteOptionsBackground")));
            if (!gl.O1()) {
                arrayList2.add(g66.b(64, k96.N0("LiteOptionsTopics")));
            }
            arrayList2.add(g66.b(128, k96.N0("LiteOptionsSpoiler")));
            if (gba.o() < 1) {
                boolean z = w01.a;
            } else {
                arrayList2.add(g66.b(256, k96.N0("LiteOptionsBlur2")));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                if (gba.o() < 1) {
                    boolean z2 = w01.a;
                } else {
                    arrayList2.add(g66.b(262144, k96.N0("LiteOptionsLiquidGlass")));
                }
            }
            arrayList2.add(g66.b(32768, k96.N0("LiteOptionsScale")));
            if (ijb.c()) {
                arrayList2.add(g66.b(65536, k96.N0("LiteOptionsThanos")));
            }
        }
        arrayList2.add(g66.c(R.drawable.msg2_call_earpiece, 512, k96.M0(2131748665, null)));
        arrayList2.add(g66.c(R.drawable.msg2_videocall, 1024, k96.M0(2131748668, null)));
        arrayList2.add(g66.c(R.drawable.msg2_gif, 2048, k96.M0(2131748671, null)));
        arrayList2.add(g66.c(R.drawable.photo_star, 131072, k96.M0(2131748661, null)));
        arrayList2.add(new g66(2, 0, 0, 0, ""));
        arrayList2.add(new g66(5, 0, 0, 1, k96.M0(2131748654, null)));
        arrayList2.add(new g66(2, 0, 0, 0, k96.N0("LiteSmoothTransitionsInfo")));
        this.d.E(arrayList, arrayList2);
    }

    public final void c0() {
        if (this.b != null) {
            for (int i = 0; i < this.b.getChildCount(); i++) {
                View childAt = this.b.getChildAt(i);
                if (childAt != null) {
                    this.b.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        ArrayList arrayList = this.s;
                        if (R < arrayList.size()) {
                            g66 g66Var = (g66) arrayList.get(R);
                            int i2 = g66Var.a;
                            if (i2 == 3 || i2 == 4) {
                                l66 l66Var = (l66) childAt;
                                ImageView imageView = l66Var.e;
                                m66 m66Var = l66Var.E;
                                int i3 = g66Var.e;
                                if (i2 == 3) {
                                    boolean z = Integer.bitCount(i3) > 1;
                                    l66Var.w = z;
                                    if (z) {
                                        l66Var.c(g66Var, true);
                                        int Y = m66Var.Y(i3);
                                        imageView.clearAnimation();
                                        ug8.t(imageView.animate().rotation((Y < 0 || !m66Var.n[Y]) ? 0.0f : 180.0f), s33.h, 240L);
                                    }
                                    l66Var.f.c(e66.e(i3), true);
                                } else {
                                    l66Var.h.a(e66.e(i3), true);
                                }
                                l66Var.b(e66.f(), true);
                            } else if (i2 == 1) {
                                ((k66) childAt).a();
                            }
                        }
                    }
                }
            }
            if (this.e == null || e66.f()) {
                return;
            }
            this.e.b();
            this.e = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        byte b = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(k96.M0(2131746875, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bq5(this, (byte) 3));
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ((ActionBarLayout) ui5Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new FrameLayout(context);
        o39 o39Var = new o39(context, null);
        this.b = o39Var;
        o39Var.r1();
        o39 o39Var2 = this.b;
        t26 t26Var = new t26();
        this.c = t26Var;
        o39Var2.setLayoutManager(t26Var);
        o39 o39Var3 = this.b;
        c83 c83Var = new c83(this, b);
        this.d = c83Var;
        o39Var3.setAdapter(c83Var);
        this.b.setSectionsDrawBackground(true);
        gb3 gb3Var = new gb3();
        gb3Var.n(350L);
        gb3Var.o(s33.h);
        gb3Var.C = false;
        gb3Var.m = false;
        this.b.setItemAnimator(gb3Var);
        this.a.addView(this.b, nme.c(-1.0f, -1));
        this.b.setOnItemClickListener(new ry4((Object) this, (byte) 23));
        this.fragmentView = this.a;
        this.f = gl.O1() ? 360864 : 360928;
        b0();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final o39 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        HashSet hashSet = e66.n;
        if (hashSet != null) {
            hashSet.remove(this.h);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        e66.a(this.h);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        e66.k();
        vl.t();
        bkb.s1(true);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
