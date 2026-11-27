package org.telegram.ui.Cells;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class f extends d79 implements fn7 {
    public static final byte[] q3 = new byte[1024];
    public boolean f3;
    public final as g3;
    public final HashMap h3;
    public final HashMap i3;
    public znb j3;
    public final e k3;
    public final ArrayList l3;
    public final ArrayList m3;
    public final byte n3;
    public int o3;
    public final org.telegram.ui.ActionBar.e p3;

    /* JADX WARN: Multi-variable type inference failed */
    public f(Context context, org.telegram.ui.ActionBar.e eVar, int i, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null);
        this.h3 = new HashMap();
        this.i3 = new HashMap();
        this.l3 = arrayList2;
        this.m3 = arrayList;
        this.n3 = i;
        this.p3 = eVar;
        if (i == 2) {
            yob.h(aob.h5, null, this);
        } else {
            yob.h(aob.d6, null, this);
        }
        setItemAnimator(null);
        setLayoutAnimation(null);
        as asVar = new as((byte) 18);
        this.g3 = asVar;
        setPadding(0, 0, 0, 0);
        setClipToPadding(false);
        asVar.i1(0);
        setLayoutManager(asVar);
        e eVar2 = new e(this, context);
        this.k3 = eVar2;
        setAdapter(eVar2);
        setOnItemClickListener(new r69() { // from class: org.telegram.ui.Cells.a
            @Override // r69
            public final void e(int i2, View view) {
                znb znbVar = ((ThemesHorizontalListCell$InnerThemeView) view).b;
                f fVar = f.this;
                fVar.C1(znbVar, view);
                int left = view.getLeft();
                int right = view.getRight();
                if (left < 0) {
                    fVar.y0(left - hl.L(8.0f), 0, null);
                } else if (right > fVar.getMeasuredWidth()) {
                    fVar.y0(right - fVar.getMeasuredWidth(), 0, null);
                }
            }
        });
        setOnItemLongClickListener(new t69() { // from class: org.telegram.ui.Cells.b
            @Override // t69
            public final boolean e(int i2, View view) {
                f.this.D1(((ThemesHorizontalListCell$InnerThemeView) view).b);
                return true;
            }
        });
    }

    public final void A1(znb znbVar) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.b == znbVar && themesHorizontalListCell$InnerThemeView.c()) {
                    themesHorizontalListCell$InnerThemeView.b.V = true;
                    themesHorizontalListCell$InnerThemeView.a();
                }
            }
        }
    }

    public final void B1(int i) {
        View view;
        if (i == 0 && (view = (View) getParent()) != null) {
            i = view.getMeasuredWidth();
        }
        if (i != 0) {
            znb B0 = this.n3 == 1 ? aob.J : aob.B0();
            this.j3 = B0;
            ArrayList arrayList = this.m3;
            int indexOf = arrayList.indexOf(B0);
            if (indexOf >= 0 || (indexOf = this.l3.indexOf(this.j3) + arrayList.size()) >= 0) {
                this.g3.g1(indexOf, (i - hl.L(76.0f)) / 2);
            }
        }
    }

    public final void C1(znb znbVar, View view) {
        TLRPC.TL_theme tL_theme = znbVar.G;
        if (tL_theme != null) {
            if (!znbVar.V) {
                return;
            }
            if (tL_theme.document == null) {
                org.telegram.ui.ActionBar.e eVar = this.p3;
                if (eVar != null) {
                    eVar.presentFragment(new xqb(znbVar, null, true));
                    return;
                }
                return;
            }
        }
        SharedPreferences.Editor edit = org.telegram.messenger.a.b.getSharedPreferences("themeconfig", 0).edit();
        edit.putString((this.n3 == 1 || znbVar.o()) ? "lastDarkTheme" : "lastDayTheme", znbVar.k());
        edit.commit();
        if (this.n3 == 1) {
            if (znbVar == aob.J) {
                return;
            }
            boolean z = aob.I == aob.J;
            aob.J = znbVar;
            if (z) {
                aob.l(true);
            }
        } else if (znbVar == aob.B0()) {
            return;
        } else {
            aob.I1(znbVar, false, -1, view);
        }
        E1();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                themesHorizontalListCell$InnerThemeView.a.a(themesHorizontalListCell$InnerThemeView.b == (themesHorizontalListCell$InnerThemeView.b0.n3 == 1 ? aob.J : aob.B0()), true);
            }
        }
        ez3.q(znbVar, znbVar.Z);
        if (this.n3 != 1) {
            aob.K1(this.p3);
        }
    }

    public abstract void E1();

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != jn7.Y1) {
            if (i == jn7.Z1) {
                this.h3.remove((String) objArr[0]);
                return;
            }
            return;
        }
        String str = (String) objArr[0];
        File file = (File) objArr[1];
        znb znbVar = (znb) this.h3.get(str);
        if (znbVar != null) {
            this.h3.remove(str);
            if (this.i3.remove(znbVar) != null) {
                Utilities.e.c(new pwa(this, znbVar, file, (byte) 23));
            } else {
                A1(znbVar);
            }
        }
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i = 0; i < 4; i++) {
            jn7.f(i).b(this, jn7.Y1);
            jn7.f(i).b(this, jn7.Z1);
        }
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (int i = 0; i < 4; i++) {
            jn7.f(i).n(this, jn7.Y1);
            jn7.f(i).n(this, jn7.Z1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f3) {
            canvas.drawLine(ob6.a0 ? 0.0f : hl.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (ob6.a0 ? hl.L(20.0f) : 0), getMeasuredHeight() - 1, aob.j0);
        }
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null && getParent().getParent() != null) {
            getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        i1();
    }

    public void setDrawDivider(boolean z) {
        this.f3 = z;
    }

    public void D1(znb znbVar) {
    }
}
