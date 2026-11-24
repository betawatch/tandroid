package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class SaveToGallerySettingsActivity extends org.telegram.ui.ActionBar.d {
    public int a;
    public int addExceptionRow;
    public long b;
    public qp9 c;
    public boolean d;
    public int deleteAllExceptionsRow;
    public int e;
    public int f;
    public int h;
    public int maxVideoSizeRow;
    public np9 n;
    public o39 r;
    public final ArrayList s;
    public LongSparseArray w;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.s = new ArrayList();
        this.w = new LongSparseArray();
    }

    public final void a0(ahb ahbVar, int i) {
        for (int i2 = 0; i2 < ahbVar.getChildCount(); i2++) {
            View childAt = ahbVar.getChildAt(i2);
            if ((childAt instanceof ry8) && childAt.getBackground() != null) {
                Drawable background = childAt.getBackground();
                vkb M = zkb.M(i);
                wjb resourceProvider = getResourceProvider();
                childAt.setBackground(background);
                zkb.j(childAt, background, M, null, resourceProvider);
                return;
            }
        }
    }

    public final rp9 b0() {
        qp9 qp9Var = this.c;
        return qp9Var != null ? qp9Var : mte.a(this.a);
    }

    public final void c0() {
        if (this.d) {
            return;
        }
        if (this.c == null) {
            mte.f(this.a);
            return;
        }
        LongSparseArray l = getUserConfig().l(this.a);
        qp9 qp9Var = this.c;
        l.put(qp9Var.d, qp9Var);
        getUserConfig().z(this.a, l);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new ed0(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new kk8(this, (byte) 10));
        if (this.c != null) {
            boolean z = this.d;
            pha phaVar = this.simpleActionBar;
            if (z) {
                phaVar.setTitle(k96.M0(2131747702, null));
            } else {
                phaVar.setTitle(k96.M0(2131745735, null));
            }
        } else {
            int i = this.a;
            pha phaVar2 = this.simpleActionBar;
            if (i == 1) {
                phaVar2.setTitle(k96.M0(2131745727, null));
            } else if (i == 2) {
                phaVar2.setTitle(k96.M0(2131745734, null));
            } else {
                phaVar2.setTitle(k96.M0(2131745736, null));
            }
        }
        o39 o39Var = new o39(context, null);
        this.r = o39Var;
        o39Var.r1();
        this.r.setSectionsDrawBackground(true);
        gb3 gb3Var = new gb3();
        gb3Var.n(400L);
        gb3Var.o(s33.h);
        gb3Var.C = false;
        gb3Var.m = false;
        this.r.setItemAnimator(gb3Var);
        this.r.setLayoutManager(new t26());
        o39 o39Var2 = this.r;
        np9 np9Var = new np9(this);
        this.n = np9Var;
        o39Var2.setAdapter(np9Var);
        this.r.setOnItemClickListener(new mp9(this));
        this.r.setOnItemLongClickListener(new mp9(this));
        frameLayout.addView(this.r);
        if (this.c != null) {
            FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
            frameLayout2.setBackground(sjb.f(bkb.Ei, 8.0f));
            TextView textView = new TextView(getParentActivity());
            textView.setTextSize(1, 14.0f);
            textView.setText(k96.M0(this.d ? 2131754429 : 2131745751, null));
            textView.setGravity(17);
            textView.setTypeface(gl.o());
            zkb.X(textView, bkb.Ii, null);
            frameLayout2.addView(textView, nme.e(-2, -2, 17));
            frameLayout2.setOnClickListener(new ik8(this, (byte) 11));
            frameLayout.addView(frameLayout2, nme.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        ArrayList arrayList;
        String M0;
        this.maxVideoSizeRow = -1;
        this.addExceptionRow = -1;
        this.deleteAllExceptionsRow = -1;
        boolean z = this.isPaused;
        ArrayList arrayList2 = this.s;
        if (z || this.n == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        }
        arrayList2.clear();
        if (this.c != null) {
            arrayList2.add(new op9(9));
            arrayList2.add(new op9(3));
        }
        arrayList2.add(new op9(5, k96.M0(2131745737, null)));
        this.e = arrayList2.size();
        arrayList2.add(new op9(6));
        this.f = arrayList2.size();
        arrayList2.add(new op9(6));
        if (this.c != null) {
            M0 = k96.M0(2131745732, null);
        } else {
            int i = this.a;
            M0 = i == 1 ? k96.M0(2131745730, null) : i == 4 ? k96.M0(2131745733, null) : i == 2 ? k96.M0(2131745731, null) : null;
        }
        arrayList2.add(new op9(7, M0));
        if (b0().b) {
            arrayList2.add(new op9(5, k96.M0(2131748476, null)));
            this.maxVideoSizeRow = arrayList2.size();
            arrayList2.add(new op9(8));
            this.h = arrayList2.size();
            arrayList2.add(new op9(7));
        } else {
            this.h = -1;
        }
        if (this.c == null) {
            this.w = getUserConfig().l(this.a);
            this.addExceptionRow = arrayList2.size();
            arrayList2.add(new op9(1));
            int i2 = 0;
            boolean z2 = false;
            while (i2 < this.w.size()) {
                arrayList2.add(new op9((qp9) this.w.valueAt(i2)));
                i2++;
                z2 = true;
            }
            if (z2) {
                arrayList2.add(new op9(3));
                this.deleteAllExceptionsRow = arrayList2.size();
                arrayList2.add(new op9(4));
            }
            arrayList2.add(new op9(10));
        }
        np9 np9Var = this.n;
        if (np9Var != null) {
            if (arrayList != null) {
                np9Var.E(arrayList, arrayList2);
            } else {
                np9Var.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final o39 getListViewForSimpleGlass() {
        return this.r;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        this.a = getArguments().getInt(TeXSymbolParser.TYPE_ATTR);
        this.w = getUserConfig().l(this.a);
        long j = getArguments().getLong("dialog_id");
        this.b = j;
        if (j != 0) {
            qp9 qp9Var = (qp9) y6c.h(this.currentAccount).l(this.a).get(this.b);
            this.c = qp9Var;
            if (qp9Var == null) {
                this.d = true;
                this.c = new qp9();
                sp9 a = mte.a(this.a);
                qp9 qp9Var2 = this.c;
                qp9Var2.a = a.a;
                qp9Var2.b = a.b;
                qp9Var2.c = a.c;
                qp9Var2.d = this.b;
            }
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        d0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
