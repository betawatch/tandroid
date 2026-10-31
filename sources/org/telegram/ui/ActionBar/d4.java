package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.PopupMenu;
import java.util.Arrays;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d4 extends ActionMode {
    public final Context a;
    public final ActionMode.Callback2 b;
    public final Menu c;
    public final Rect d;
    public final Rect e;
    public final Rect f;
    public final int[] g;
    public final int[] h;
    public final int[] i;
    public final Rect j;
    public final Rect k;
    public final Rect l;
    public final View m;
    public final Point n;
    public final int o;
    public final b4 p = new b4(this, 0);
    public final b4 q = new b4(this, 1);
    public final s4 r;
    public final c4 s;

    public d4(Context context, ActionMode.Callback2 callback2, View view, s4 s4Var) {
        this.a = context;
        this.b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: org.telegram.ui.ActionBar.z3
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                d4 d4Var = d4.this;
                return d4Var.b.onActionItemClicked(d4Var, menuItem);
            }
        });
        this.d = new Rect();
        this.e = new Rect();
        this.f = new Rect();
        int[] iArr = new int[2];
        this.g = iArr;
        this.h = new int[2];
        this.i = new int[2];
        this.j = new Rect();
        this.k = new Rect();
        this.l = new Rect();
        this.m = view;
        view.getLocationOnScreen(iArr);
        this.o = org.telegram.messenger.i0.L(20.0f);
        this.n = new Point();
        s4Var.e = menu;
        s4Var.g = new MenuItem.OnMenuItemClickListener() { // from class: org.telegram.ui.ActionBar.a4
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                d4 d4Var = d4.this;
                return d4Var.b.onActionItemClicked(d4Var, menuItem);
            }
        };
        this.r = s4Var;
        c4 c4Var = new c4(s4Var);
        this.s = c4Var;
        c4Var.b = false;
        c4Var.c = false;
        c4Var.d = false;
        c4Var.e = true;
        c4Var.f = true;
    }

    public static boolean a(Rect rect, Rect rect2) {
        return rect.left <= rect2.right && rect2.left <= rect.right && rect.top <= rect2.bottom && rect2.top <= rect.bottom;
    }

    public final void b() {
        Rect rect = this.d;
        Rect rect2 = this.e;
        rect2.set(rect);
        View view = this.m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.n;
        defaultDisplay.getRealSize(point);
        int i10 = point.x;
        int i11 = point.y;
        Rect rect3 = this.l;
        rect3.set(0, 0, i10, i11);
        boolean a2 = a(rect2, rect3);
        Rect rect4 = this.f;
        if (a2) {
            Rect rect5 = this.j;
            if (a(rect2, rect5)) {
                this.s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.o));
                if (!rect2.equals(rect4)) {
                    Runnable runnable = this.p;
                    view.removeCallbacks(runnable);
                    c4 c4Var = this.s;
                    c4Var.getClass();
                    if (System.currentTimeMillis() - c4Var.g > 500) {
                        c4Var.c = true;
                    }
                    view.postDelayed(runnable, 50L);
                    this.r.c.set(rect2);
                    s4 s4Var = this.r;
                    if (s4Var.b.f()) {
                        s4Var.c();
                    }
                }
                this.s.a();
                rect4.set(rect2);
            }
        }
        this.s.d = true;
        rect2.setEmpty();
        this.s.a();
        rect4.set(rect2);
    }

    public final void c() {
        View view = this.m;
        int[] iArr = this.g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.k;
        if (equals && rect.equals(rect2)) {
            return;
        }
        b();
        iArr3[0] = iArr[0];
        iArr3[1] = iArr[1];
        rect2.set(rect);
    }

    @Override // android.view.ActionMode
    public final void finish() {
        s4 s4Var = this.r;
        s4Var.a.removeOnLayoutChangeListener(s4Var.l);
        q4 q4Var = s4Var.b;
        if (!q4Var.F) {
            q4Var.G = false;
            q4Var.F = true;
            q4Var.x.cancel();
            q4Var.w.start();
            q4Var.D.setEmpty();
        }
        c4 c4Var = this.s;
        c4Var.f = false;
        s4 s4Var2 = c4Var.a;
        s4Var2.a.removeOnLayoutChangeListener(s4Var2.l);
        q4 q4Var2 = s4Var2.b;
        if (!q4Var2.F) {
            q4Var2.G = false;
            q4Var2.F = true;
            q4Var2.x.cancel();
            q4Var2.w.start();
            q4Var2.D.setEmpty();
        }
        b4 b4Var = this.p;
        View view = this.m;
        view.removeCallbacks(b4Var);
        view.removeCallbacks(this.q);
        this.b.onDestroyActionMode(this);
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return null;
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return this.c;
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.a);
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return null;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return null;
    }

    @Override // android.view.ActionMode
    public final void hide(long j10) {
        if (j10 == -1) {
            j10 = ViewConfiguration.getDefaultActionModeHideDuration();
        }
        long min = Math.min(3000L, j10);
        View view = this.m;
        b4 b4Var = this.q;
        view.removeCallbacks(b4Var);
        if (min <= 0) {
            b4Var.run();
            return;
        }
        c4 c4Var = this.s;
        c4Var.b = true;
        c4Var.a();
        view.postDelayed(b4Var, min);
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.b.onPrepareActionMode(this, this.c);
        invalidateContentRect();
    }

    @Override // android.view.ActionMode
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.b;
        View view = this.m;
        Rect rect = this.d;
        callback2.onGetContentRect(this, view, rect);
        if (rect.left == 0 && rect.right == 0) {
            rect.left = 1;
            rect.right = 1;
        }
        b();
    }

    @Override // android.view.ActionMode
    public final void onWindowFocusChanged(boolean z10) {
        c4 c4Var = this.s;
        c4Var.e = z10;
        c4Var.a();
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i10) {
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i10) {
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
    }
}
