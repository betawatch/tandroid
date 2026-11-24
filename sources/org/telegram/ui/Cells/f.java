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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class f extends o39 implements gk7 {
    public static final byte[] q3 = new byte[1024];
    public boolean f3;
    public final zr g3;
    public final HashMap h3;
    public final HashMap i3;
    public akb j3;
    public final e k3;
    public final ArrayList l3;
    public final ArrayList m3;
    public final byte n3;
    public int o3;
    public final org.telegram.ui.ActionBar.d p3;

    /* JADX WARN: Multi-variable type inference failed */
    public f(Context context, org.telegram.ui.ActionBar.d dVar, int i, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null);
        this.h3 = new HashMap();
        this.i3 = new HashMap();
        this.l3 = arrayList2;
        this.m3 = arrayList;
        this.n3 = i;
        this.p3 = dVar;
        if (i == 2) {
            zkb.h(bkb.g5, null, this);
        } else {
            zkb.h(bkb.c6, null, this);
        }
        setItemAnimator(null);
        setLayoutAnimation(null);
        zr zrVar = new zr((byte) 18);
        this.g3 = zrVar;
        setPadding(0, 0, 0, 0);
        setClipToPadding(false);
        zrVar.i1(0);
        setLayoutManager(zrVar);
        e eVar = new e(this, context);
        this.k3 = eVar;
        setAdapter(eVar);
        setOnItemClickListener(new c39() { // from class: org.telegram.ui.Cells.a
            @Override // c39
            public final void d(int i2, View view) {
                akb akbVar = ((ThemesHorizontalListCell$InnerThemeView) view).b;
                f fVar = f.this;
                fVar.B1(akbVar, view);
                int left = view.getLeft();
                int right = view.getRight();
                if (left < 0) {
                    fVar.x0(left - gl.L(8.0f), 0, null);
                } else if (right > fVar.getMeasuredWidth()) {
                    fVar.x0(right - fVar.getMeasuredWidth(), 0, null);
                }
            }
        });
        setOnItemLongClickListener(new e39() { // from class: org.telegram.ui.Cells.b
            @Override // e39
            public final boolean d(int i2, View view) {
                f.this.C1(((ThemesHorizontalListCell$InnerThemeView) view).b);
                return true;
            }
        });
    }

    public final void A1(int i) {
        View view;
        if (i == 0 && (view = (View) getParent()) != null) {
            i = view.getMeasuredWidth();
        }
        if (i != 0) {
            akb B0 = this.n3 == 1 ? bkb.J : bkb.B0();
            this.j3 = B0;
            ArrayList arrayList = this.m3;
            int indexOf = arrayList.indexOf(B0);
            if (indexOf >= 0 || (indexOf = this.l3.indexOf(this.j3) + arrayList.size()) >= 0) {
                this.g3.g1(indexOf, (i - gl.L(76.0f)) / 2);
            }
        }
    }

    public final void B1(akb akbVar, View view) {
        TLRPC.TL_theme tL_theme = akbVar.G;
        if (tL_theme != null) {
            if (!akbVar.V) {
                return;
            }
            if (tL_theme.document == null) {
                org.telegram.ui.ActionBar.d dVar = this.p3;
                if (dVar != null) {
                    dVar.presentFragment(new ymb(akbVar, null, true));
                    return;
                }
                return;
            }
        }
        SharedPreferences.Editor edit = org.telegram.messenger.a.b.getSharedPreferences("themeconfig", 0).edit();
        edit.putString((this.n3 == 1 || akbVar.o()) ? "lastDarkTheme" : "lastDayTheme", akbVar.k());
        edit.commit();
        if (this.n3 == 1) {
            if (akbVar == bkb.J) {
                return;
            }
            boolean z = bkb.I == bkb.J;
            bkb.J = akbVar;
            if (z) {
                bkb.l(true);
            }
        } else if (akbVar == bkb.B0()) {
            return;
        } else {
            bkb.I1(akbVar, false, -1, view);
        }
        D1();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                themesHorizontalListCell$InnerThemeView.a.a(themesHorizontalListCell$InnerThemeView.b == (themesHorizontalListCell$InnerThemeView.b0.n3 == 1 ? bkb.J : bkb.B0()), true);
            }
        }
        jy3.q(akbVar, akbVar.Z);
        if (this.n3 != 1) {
            bkb.K1(this.p3);
        }
    }

    public abstract void D1();

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != kk7.X1) {
            if (i == kk7.Y1) {
                this.h3.remove((String) objArr[0]);
                return;
            }
            return;
        }
        String str = (String) objArr[0];
        File file = (File) objArr[1];
        akb akbVar = (akb) this.h3.get(str);
        if (akbVar != null) {
            this.h3.remove(str);
            if (this.i3.remove(akbVar) != null) {
                Utilities.e.c(new r1b(this, akbVar, file, (byte) 14));
            } else {
                z1(akbVar);
            }
        }
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i = 0; i < 4; i++) {
            kk7.f(i).b(this, kk7.X1);
            kk7.f(i).b(this, kk7.Y1);
        }
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (int i = 0; i < 4; i++) {
            kk7.f(i).n(this, kk7.X1);
            kk7.f(i).n(this, kk7.Y1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f3) {
            canvas.drawLine(k96.a0 ? 0.0f : gl.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(20.0f) : 0), getMeasuredHeight() - 1, bkb.j0);
        }
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null && getParent().getParent() != null) {
            getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        h1();
    }

    public void setDrawDivider(boolean z) {
        this.f3 = z;
    }

    public final void z1(akb akbVar) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.b == akbVar && themesHorizontalListCell$InnerThemeView.c()) {
                    themesHorizontalListCell$InnerThemeView.b.V = true;
                    themesHorizontalListCell$InnerThemeView.a();
                }
            }
        }
    }

    public void C1(akb akbVar) {
    }
}
