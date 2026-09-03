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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class k4 extends ActionMode {
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
    public final i4 p = new i4(this, 0);
    public final i4 q = new i4(this, 1);
    public final z4 r;
    public final j4 s;

    public k4(Context context, ActionMode.Callback2 callback2, View view, z4 z4Var) {
        this.a = context;
        this.b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: org.telegram.ui.ActionBar.g4
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.b.onActionItemClicked(k4.this, menuItem);
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
        z4Var.e = menu;
        z4Var.g = new MenuItem.OnMenuItemClickListener() { // from class: org.telegram.ui.ActionBar.h4
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.b.onActionItemClicked(k4.this, menuItem);
                return onActionItemClicked;
            }
        };
        this.r = z4Var;
        j4 j4Var = new j4(z4Var);
        this.s = j4Var;
        j4Var.b = false;
        j4Var.c = false;
        j4Var.d = false;
        j4Var.e = true;
        j4Var.f = true;
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
        int i10 = point.x;
        int i11 = point.y;
        Rect rect3 = this.l;
        rect3.set(0, 0, i10, i11);
        boolean c3 = c(rect2, rect3);
        Rect rect4 = this.f;
        if (c3) {
            Rect rect5 = this.j;
            if (c(rect2, rect5)) {
                this.s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.o));
                if (!rect2.equals(rect4)) {
                    Runnable runnable = this.p;
                    view.removeCallbacks(runnable);
                    j4 j4Var = this.s;
                    j4Var.getClass();
                    if (System.currentTimeMillis() - j4Var.g > 500) {
                        j4Var.c = true;
                    }
                    view.postDelayed(runnable, 50L);
                    this.r.c.set(rect2);
                    z4 z4Var = this.r;
                    if (z4Var.b.f()) {
                        z4Var.c();
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
        z4 z4Var = this.r;
        z4Var.a.removeOnLayoutChangeListener(z4Var.l);
        x4 x4Var = z4Var.b;
        if (!x4Var.F) {
            x4Var.G = false;
            x4Var.F = true;
            x4Var.x.cancel();
            x4Var.w.start();
            x4Var.D.setEmpty();
        }
        j4 j4Var = this.s;
        j4Var.f = false;
        z4 z4Var2 = j4Var.a;
        z4Var2.a.removeOnLayoutChangeListener(z4Var2.l);
        x4 x4Var2 = z4Var2.b;
        if (!x4Var2.F) {
            x4Var2.G = false;
            x4Var2.F = true;
            x4Var2.x.cancel();
            x4Var2.w.start();
            x4Var2.D.setEmpty();
        }
        i4 i4Var = this.p;
        View view = this.m;
        view.removeCallbacks(i4Var);
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
        i4 i4Var = this.q;
        view.removeCallbacks(i4Var);
        if (min <= 0) {
            i4Var.run();
            return;
        }
        j4 j4Var = this.s;
        j4Var.b = true;
        j4Var.a();
        view.postDelayed(i4Var, min);
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
    public final void onWindowFocusChanged(boolean z4) {
        j4 j4Var = this.s;
        j4Var.e = z4;
        j4Var.a();
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
