package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class iu extends PopupWindow {
    public static Field f;
    public static final org.telegram.ui.ActionBar.h1 g = new org.telegram.ui.ActionBar.h1(1);
    public ViewTreeObserver.OnScrollChangedListener a;
    public ViewTreeObserver b;
    public final hu c;
    public boolean d;
    public final int e;

    public iu(hu huVar) {
        super(huVar);
        this.e = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        this.c = huVar;
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(2);
        setSoftInputMode(0);
        huVar.setFocusableInTouchMode(true);
        huVar.setOnKeyListener(new cn(this, 1));
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
    public final void showAsDropDown(View view, int i9, int i10) {
        try {
            super.showAsDropDown(view, i9, i10);
            a(view);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // android.widget.PopupWindow
    public final void showAtLocation(View view, int i9, int i10, int i11) {
        ViewTreeObserver viewTreeObserver;
        super.showAtLocation(view, i9, i10, i11);
        if (this.a == null || (viewTreeObserver = this.b) == null) {
            return;
        }
        if (viewTreeObserver.isAlive()) {
            this.b.removeOnScrollChangedListener(this.a);
        }
        this.b = null;
    }

    @Override // android.widget.PopupWindow
    public final void update(View view, int i9, int i10, int i11, int i12) {
        super.update(view, i9, i10, i11, i12);
        a(view);
    }

    @Override // android.widget.PopupWindow
    public final void update(View view, int i9, int i10) {
        super.update(view, i9, i10);
        a(view);
    }
}
