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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class w3 extends ActionMode {
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
    public final u3 p = new u3(this, 0);
    public final u3 q = new u3(this, 1);
    public final k4 r;
    public final v3 s;

    public w3(Context context, ActionMode.Callback2 callback2, View view, k4 k4Var) {
        this.a = context;
        this.b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: org.telegram.ui.ActionBar.s3
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                w3 w3Var = w3.this;
                return w3Var.b.onActionItemClicked(w3Var, menuItem);
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
        this.o = org.telegram.messenger.g0.L(20.0f);
        this.n = new Point();
        k4Var.e = menu;
        k4Var.g = new MenuItem.OnMenuItemClickListener() { // from class: org.telegram.ui.ActionBar.t3
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                w3 w3Var = w3.this;
                return w3Var.b.onActionItemClicked(w3Var, menuItem);
            }
        };
        this.r = k4Var;
        v3 v3Var = new v3(k4Var);
        this.s = v3Var;
        v3Var.b = false;
        v3Var.c = false;
        v3Var.d = false;
        v3Var.e = true;
        v3Var.f = true;
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
        int i7 = point.x;
        int i10 = point.y;
        Rect rect3 = this.l;
        rect3.set(0, 0, i7, i10);
        boolean a10 = a(rect2, rect3);
        Rect rect4 = this.f;
        if (a10) {
            Rect rect5 = this.j;
            if (a(rect2, rect5)) {
                this.s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.o));
                if (!rect2.equals(rect4)) {
                    Runnable runnable = this.p;
                    view.removeCallbacks(runnable);
                    v3 v3Var = this.s;
                    v3Var.getClass();
                    if (System.currentTimeMillis() - v3Var.g > 500) {
                        v3Var.c = true;
                    }
                    view.postDelayed(runnable, 50L);
                    this.r.c.set(rect2);
                    k4 k4Var = this.r;
                    if (k4Var.b.f()) {
                        k4Var.c();
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
        k4 k4Var = this.r;
        k4Var.a.removeOnLayoutChangeListener(k4Var.l);
        i4 i4Var = k4Var.b;
        if (!i4Var.F) {
            i4Var.G = false;
            i4Var.F = true;
            i4Var.x.cancel();
            i4Var.w.start();
            i4Var.D.setEmpty();
        }
        v3 v3Var = this.s;
        v3Var.f = false;
        k4 k4Var2 = v3Var.a;
        k4Var2.a.removeOnLayoutChangeListener(k4Var2.l);
        i4 i4Var2 = k4Var2.b;
        if (!i4Var2.F) {
            i4Var2.G = false;
            i4Var2.F = true;
            i4Var2.x.cancel();
            i4Var2.w.start();
            i4Var2.D.setEmpty();
        }
        u3 u3Var = this.p;
        View view = this.m;
        view.removeCallbacks(u3Var);
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
    public final void hide(long j3) {
        if (j3 == -1) {
            j3 = ViewConfiguration.getDefaultActionModeHideDuration();
        }
        long min = Math.min(3000L, j3);
        View view = this.m;
        u3 u3Var = this.q;
        view.removeCallbacks(u3Var);
        if (min <= 0) {
            u3Var.run();
            return;
        }
        v3 v3Var = this.s;
        v3Var.b = true;
        v3Var.a();
        view.postDelayed(u3Var, min);
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
    public final void onWindowFocusChanged(boolean z9) {
        v3 v3Var = this.s;
        v3Var.e = z9;
        v3Var.a();
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i7) {
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i7) {
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
