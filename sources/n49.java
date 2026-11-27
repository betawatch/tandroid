// default package

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class n49 extends e implements fn7 {
    public d79 a;
    public j49 b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public u8a h;
    public l49 n;

    public n49() {
        super(null);
        this.d = -1;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(ob6.M0(2131746114, null));
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new rn8(this, (byte) 8));
        FrameLayout frameLayout = new FrameLayout(context);
        d79 d79Var = new d79(context, null);
        this.a = d79Var;
        d79Var.s1();
        this.a.setSectionsDrawBackground(true);
        ((zb3) this.a.getItemAnimator()).m = false;
        this.a.setLayoutManager(new x46());
        d79 d79Var2 = this.a;
        j49 j49Var = new j49(this, context);
        this.b = j49Var;
        d79Var2.setAdapter(j49Var);
        this.a.setOnItemClickListener(new t39(this, (byte) 1));
        frameLayout.addView(this.a, tre.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        this.b.f();
        g0();
        return frameLayout;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i2 == this.currentAccount) {
            if (i == jn7.Y4) {
                this.b.f();
            } else if (i == jn7.i5) {
                g0();
                this.b.f();
            }
        }
    }

    public final void f0(View view) {
        int i;
        int i2;
        if (view instanceof xa0) {
            xa0 xa0Var = (xa0) view;
            if (xa0Var.n && !getUserConfig().p()) {
                showDialog(new xk8((e) this, 4, true));
                return;
            } else {
                ls6.d0(this.currentAccount).c2(xa0Var.f.reaction);
                this.a.getAdapter().l(0, this.a.getAdapter().b());
                return;
            }
        }
        if (view instanceof m49) {
            m49 m49Var = (m49) view;
            if (this.n == null) {
                d1a[] d1aVarArr = new d1a[1];
                ul ulVar = m49Var.a;
                if (ulVar != null) {
                    ulVar.f();
                    m49Var.b();
                    Rect rect = hl.Q;
                    rect.set(ulVar.getBounds());
                    i2 = (-(m49Var.getHeight() - rect.centerY())) - hl.L(16.0f);
                    float L = hl.L(324.0f);
                    i = rect.centerX() - ((hl.q.x - hl.L(12.0f)) - ((int) Math.min(L, r4.x * 0.95f)));
                } else {
                    i = 0;
                    i2 = 0;
                }
                k49 k49Var = new k49(this, this, getParentActivity(), Integer.valueOf(i), m49Var, d1aVarArr);
                String S = getMediaDataController().S();
                if (S != null && S.startsWith("animated_")) {
                    try {
                        k49Var.setSelected(Long.valueOf(Long.parseLong(S.substring(9))));
                    } catch (Exception unused) {
                    }
                }
                ArrayList arrayList = getMediaDataController().h;
                ArrayList arrayList2 = new ArrayList(20);
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    w49 w49Var = new w49();
                    w49Var.f = ((TLRPC.TL_availableReaction) arrayList.get(i3)).reaction;
                    arrayList2.add(w49Var);
                }
                k49Var.setRecentReactions(arrayList2);
                k49Var.setSaveState(3);
                k49Var.y(ulVar, m49Var);
                l49 l49Var = new l49(this, k49Var);
                this.n = l49Var;
                d1aVarArr[0] = l49Var;
                l49Var.showAsDropDown(m49Var, 0, i2, 53);
                d1aVarArr[0].a();
            }
        }
    }

    public final void g0() {
        this.f = 2;
        this.c = true;
        if (!yac.h(this.currentAccount).p()) {
            this.e = -1;
            this.d = this.f;
        } else {
            this.d = -1;
            int i = this.f;
            this.f = i + 1;
            this.e = i;
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final d79 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        return zye.a(new u00(this, (byte) 16), aob.d6, aob.G6, aob.z6, aob.i6, aob.a7, aob.B6, aob.p7, aob.f6, aob.g6, aob.O6, aob.P6, aob.Q6, aob.R6);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        u8a u8aVar = this.h;
        if (u8aVar != null) {
            u8aVar.a();
            this.h = null;
        }
        jn7 notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        u8a u8aVar2 = new u8a(notificationCenter, this);
        u8aVar2.b(jn7.Y4);
        u8aVar2.b(jn7.i5);
        this.h = u8aVar2;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        u8a u8aVar = this.h;
        if (u8aVar != null) {
            u8aVar.a();
            this.h = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }
}
