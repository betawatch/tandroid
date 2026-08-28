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
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g4 extends ActionMode {
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
    public final e4 p = new e4(this, 0);
    public final e4 q = new e4(this, 1);
    public final v4 r;
    public final f4 s;

    public g4(Context context, ActionMode.Callback2 callback2, View view, v4 v4Var) {
        this.a = context;
        this.b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: org.telegram.ui.ActionBar.c4
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.b.onActionItemClicked(g4.this, menuItem);
                return onActionItemClicked;
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
        this.o = AndroidUtilities.dp(20.0f);
        this.n = new Point();
        v4Var.e = menu;
        v4Var.g = new MenuItem.OnMenuItemClickListener() { // from class: org.telegram.ui.ActionBar.d4
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.b.onActionItemClicked(g4.this, menuItem);
                return onActionItemClicked;
            }
        };
        this.r = v4Var;
        f4 f4Var = new f4(v4Var);
        this.s = f4Var;
        f4Var.b = false;
        f4Var.c = false;
        f4Var.d = false;
        f4Var.e = true;
        f4Var.f = true;
    }

    public static boolean c(Rect rect, Rect rect2) {
        return rect.left <= rect2.right && rect2.left <= rect.right && rect.top <= rect2.bottom && rect2.top <= rect.bottom;
    }

    public final void d() {
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
        int i9 = point.x;
        int i10 = point.y;
        Rect rect3 = this.l;
        rect3.set(0, 0, i9, i10);
        boolean c10 = c(rect2, rect3);
        Rect rect4 = this.f;
        if (c10) {
            Rect rect5 = this.j;
            if (c(rect2, rect5)) {
                this.s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.o));
                if (!rect2.equals(rect4)) {
                    Runnable runnable = this.p;
                    view.removeCallbacks(runnable);
                    f4 f4Var = this.s;
                    f4Var.getClass();
                    if (System.currentTimeMillis() - f4Var.g > 500) {
                        f4Var.c = true;
                    }
                    view.postDelayed(runnable, 50L);
                    this.r.c.set(rect2);
                    v4 v4Var = this.r;
                    if (v4Var.b.f()) {
                        v4Var.c();
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

    public final void e() {
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
        d();
        iArr3[0] = iArr[0];
        iArr3[1] = iArr[1];
        rect2.set(rect);
    }

    @Override // android.view.ActionMode
    public final void finish() {
        v4 v4Var = this.r;
        v4Var.a.removeOnLayoutChangeListener(v4Var.l);
        t4 t4Var = v4Var.b;
        if (!t4Var.F) {
            t4Var.G = false;
            t4Var.F = true;
            t4Var.x.cancel();
            t4Var.w.start();
            t4Var.D.setEmpty();
        }
        f4 f4Var = this.s;
        f4Var.f = false;
        v4 v4Var2 = f4Var.a;
        v4Var2.a.removeOnLayoutChangeListener(v4Var2.l);
        t4 t4Var2 = v4Var2.b;
        if (!t4Var2.F) {
            t4Var2.G = false;
            t4Var2.F = true;
            t4Var2.x.cancel();
            t4Var2.w.start();
            t4Var2.D.setEmpty();
        }
        e4 e4Var = this.p;
        View view = this.m;
        view.removeCallbacks(e4Var);
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
        e4 e4Var = this.q;
        view.removeCallbacks(e4Var);
        if (min <= 0) {
            e4Var.run();
            return;
        }
        f4 f4Var = this.s;
        f4Var.b = true;
        f4Var.a();
        view.postDelayed(e4Var, min);
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
        d();
    }

    @Override // android.view.ActionMode
    public final void onWindowFocusChanged(boolean z10) {
        f4 f4Var = this.s;
        f4Var.e = z10;
        f4Var.a();
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i9) {
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i9) {
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
