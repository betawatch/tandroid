// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class f72 extends f12 implements snb, fn7, s84 {
    public final d72 E;
    public final b34 F;
    public final j12 G;
    public final fm0 n;
    public final FrameLayout r;
    public final gu s;
    public final q22 w;
    public final HashSet x;
    public final c72 y;

    public f72(n12 n12Var, vnb vnbVar, Context context) {
        super(n12Var, vnbVar, context);
        this.n = new fm0(0, this, k43.h, 380L, false);
        this.x = new HashSet();
        this.E = new d72(this, context);
        m12 m12Var = new m12(aob.d6, vnbVar, context);
        m12Var.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        j12 j12Var = new j12(this.b, vnbVar, context);
        this.G = j12Var;
        j12Var.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
        byte b = 9;
        c7 c7Var = new c7(this, b);
        m7 m7Var = j12Var.r;
        m7Var.addTextChangedListener(c7Var);
        m7Var.setHint(ob6.M0(2131752637, null));
        frameLayout.addView(m12Var, tre.g());
        FrameLayout.LayoutParams d = tre.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += hl.m;
        frameLayout.addView(j12Var, d);
        b34 b34Var = new b34(context, vnbVar);
        this.F = b34Var;
        b34Var.c();
        addView(b34Var, tre.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        gu guVar = new gu(this, context, vnbVar, (byte) 11);
        this.s = guVar;
        guVar.s1();
        setBlur3Capture(guVar);
        this.d = guVar;
        this.h = true;
        this.f = true;
        jn7.e().h(guVar, jn7.l4, new te2(this, (byte) 19));
        guVar.setClipToPadding(false);
        getContext();
        q22 q22Var = new q22(this, hl.L(9.0f), guVar, (byte) 4);
        this.w = q22Var;
        guVar.setLayoutManager(q22Var);
        q22Var.P = false;
        guVar.setHorizontalScrollBarEnabled(false);
        guVar.setVerticalScrollBarEnabled(false);
        guVar.setClipToPadding(false);
        addView(guVar, tre.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        c72 c72Var = new c72(this, context);
        this.y = c72Var;
        guVar.setAdapter(c72Var);
        yob.l(guVar, 21, aob.A5, vnbVar);
        guVar.setOnItemClickListener(new u(this, b));
        guVar.setOnScrollListener(new y(this, (byte) 22));
        FrameLayout.LayoutParams e = tre.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e).height += hl.m;
        addView(frameLayout, e);
        P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentTop() {
        gu guVar = this.s;
        if (guVar.getChildCount() == 0) {
            return -1000;
        }
        int i = 0;
        View childAt = guVar.getChildAt(0);
        n69 n69Var = (n69) guVar.H(childAt);
        if (n69Var == null) {
            return -1000;
        }
        int paddingTop = guVar.getPaddingTop();
        if (n69Var.b() == 0 && childAt.getTop() >= 0) {
            i = childAt.getTop();
        }
        return paddingTop - i;
    }

    @Override // f12
    public final void C(int i, int i2) {
        int i3;
        n12 n12Var = this.b;
        if (n12Var.o3.Q() > hl.L(20.0f)) {
            i3 = hl.L(8.0f);
            n12Var.r0 = false;
        } else {
            if (!hl.O1()) {
                Point point = hl.q;
                if (point.x > point.y) {
                    i3 = (int) (i2 / 3.5f);
                    n12Var.r0 = true;
                }
            }
            i3 = (i2 / 5) << 1;
            n12Var.r0 = true;
        }
        this.s.r1(0, i3 + hl.m, 0, this.e);
    }

    @Override // f12
    public final void H(f12 f12Var) {
        this.w.g1(0, 0);
    }

    @Override // f12
    public final void J() {
        this.s.A0(0);
    }

    public final void P() {
        this.F.setVisibility(this.s.getAdapter().b() == 2 ? 0 : 8);
        Q();
    }

    public final void Q() {
        View childAt;
        b34 b34Var = this.F;
        if (b34Var.getVisibility() != 0 || (childAt = this.s.getChildAt(0)) == null) {
            return;
        }
        b34Var.setTranslationY((childAt.getTop() + (b34Var.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.q5));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
    }

    @Override // f12
    public int getCurrentItemTop() {
        gu guVar = this.s;
        if (guVar.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = guVar.getChildAt(0);
        n69 n69Var = (n69) guVar.H(childAt);
        int top = (childAt.getTop() - hl.m) - hl.L(8.0f);
        int i = (top <= 0 || n69Var == null || n69Var.b() != 0) ? 0 : top;
        fm0 fm0Var = this.n;
        if (top < 0 || n69Var == null || n69Var.b() != 0) {
            fm0Var.a(true, true);
            top = i;
        } else {
            fm0Var.a(false, true);
        }
        this.r.setTranslationY(top);
        return hl.L(12.0f) + top;
    }

    @Override // f12
    public int getFirstOffset() {
        return hl.L(4.0f) + getListTopPadding();
    }

    @Override // f12
    public int getListTopPadding() {
        return this.s.getPaddingTop();
    }

    @Override // f12
    public int getSelectedItemsCount() {
        return 0;
    }

    @Override // f12
    public ArrayList<apb> getThemeDescriptions() {
        ArrayList<apb> arrayList = new ArrayList<>();
        arrayList.add(new apb(this.F, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.c7));
        arrayList.add(new apb(this.F, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.h6));
        int i = aob.q5;
        arrayList.add(new apb(this.s, 0, new Class[]{e72.class}, new String[]{"nameTextView"}, (Drawable[]) null, (zob) null, i));
        return arrayList;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Q();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
    }

    public void setupBlurredSearchField(ll0 ll0Var) {
        j12 j12Var = this.G;
        if (j12Var != null) {
            j12Var.setupBlurredBackground(ll0Var.c(j12Var, dtd.a(this.a), false));
        }
    }

    @Override // f12
    public final void p() {
    }

    @Override // snb
    public final void updateColors() {
    }

    @Override // s84
    public final void v0(float f, int i) {
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
    }
}
