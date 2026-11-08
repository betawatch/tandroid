package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class yt extends PopupWindow {
    public static Field f;
    public static final org.telegram.ui.ActionBar.a1 g = new org.telegram.ui.ActionBar.a1(1);
    public ViewTreeObserver.OnScrollChangedListener a;
    public ViewTreeObserver b;
    public final xt c;
    public boolean d;
    public final int e;

    public yt(xt xtVar) {
        super(xtVar);
        this.e = org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 40.0f : 32.0f);
        this.c = xtVar;
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(2);
        setSoftInputMode(0);
        xtVar.setFocusableInTouchMode(true);
        xtVar.setOnKeyListener(new vm(this, 1));
    }

    public final void a(View view) {
        if (this.a != null) {
            ViewTreeObserver viewTreeObserver = view.getWindowToken() != null ? view.getViewTreeObserver() : null;
            ViewTreeObserver viewTreeObserver2 = this.b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.b.removeOnScrollChangedListener(this.a);
                }
                this.b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.a);
                }
            }
        }
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        ViewTreeObserver viewTreeObserver;
        setFocusable(false);
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
        if (this.a == null || (viewTreeObserver = this.b) == null) {
            return;
        }
        if (viewTreeObserver.isAlive()) {
            this.b.removeOnScrollChangedListener(this.a);
        }
        this.b = null;
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i7, int i10) {
        try {
            super.showAsDropDown(view, i7, i10);
            a(view);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // android.widget.PopupWindow
    public final void showAtLocation(View view, int i7, int i10, int i11) {
        ViewTreeObserver viewTreeObserver;
        super.showAtLocation(view, i7, i10, i11);
        if (this.a == null || (viewTreeObserver = this.b) == null) {
            return;
        }
        if (viewTreeObserver.isAlive()) {
            this.b.removeOnScrollChangedListener(this.a);
        }
        this.b = null;
    }

    @Override // android.widget.PopupWindow
    public final void update(View view, int i7, int i10, int i11, int i12) {
        super.update(view, i7, i10, i11, i12);
        a(view);
    }

    @Override // android.widget.PopupWindow
    public final void update(View view, int i7, int i10) {
        super.update(view, i7, i10);
        a(view);
    }
}
