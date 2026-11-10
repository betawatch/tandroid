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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class x3 extends ActionMode {
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
    public final v3 p = new v3(this, 0);
    public final v3 q = new v3(this, 1);
    public final l4 r;
    public final w3 s;

    public x3(Context context, ActionMode.Callback2 callback2, View view, l4 l4Var) {
        this.a = context;
        this.b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: org.telegram.ui.ActionBar.t3
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                x3 x3Var = x3.this;
                return x3Var.b.onActionItemClicked(x3Var, menuItem);
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
        l4Var.e = menu;
        l4Var.g = new MenuItem.OnMenuItemClickListener() { // from class: org.telegram.ui.ActionBar.u3
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                x3 x3Var = x3.this;
                return x3Var.b.onActionItemClicked(x3Var, menuItem);
            }
        };
        this.r = l4Var;
        w3 w3Var = new w3(l4Var);
        this.s = w3Var;
        w3Var.b = false;
        w3Var.c = false;
        w3Var.d = false;
        w3Var.e = true;
        w3Var.f = true;
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
                    w3 w3Var = this.s;
                    w3Var.getClass();
                    if (System.currentTimeMillis() - w3Var.g > 500) {
                        w3Var.c = true;
                    }
                    view.postDelayed(runnable, 50L);
                    this.r.c.set(rect2);
                    l4 l4Var = this.r;
                    if (l4Var.b.f()) {
                        l4Var.c();
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
        l4 l4Var = this.r;
        l4Var.a.removeOnLayoutChangeListener(l4Var.l);
        j4 j4Var = l4Var.b;
        if (!j4Var.F) {
            j4Var.G = false;
            j4Var.F = true;
            j4Var.x.cancel();
            j4Var.w.start();
            j4Var.D.setEmpty();
        }
        w3 w3Var = this.s;
        w3Var.f = false;
        l4 l4Var2 = w3Var.a;
        l4Var2.a.removeOnLayoutChangeListener(l4Var2.l);
        j4 j4Var2 = l4Var2.b;
        if (!j4Var2.F) {
            j4Var2.G = false;
            j4Var2.F = true;
            j4Var2.x.cancel();
            j4Var2.w.start();
            j4Var2.D.setEmpty();
        }
        v3 v3Var = this.p;
        View view = this.m;
        view.removeCallbacks(v3Var);
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
        v3 v3Var = this.q;
        view.removeCallbacks(v3Var);
        if (min <= 0) {
            v3Var.run();
            return;
        }
        w3 w3Var = this.s;
        w3Var.b = true;
        w3Var.a();
        view.postDelayed(v3Var, min);
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
        w3 w3Var = this.s;
        w3Var.e = z9;
        w3Var.a();
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
