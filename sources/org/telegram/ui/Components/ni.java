package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public abstract class ni extends FrameLayout {
    public final org.telegram.ui.ActionBar.f6 a;
    public final vi b;
    public ll0 c;
    public ll0 d;
    public int e;
    public boolean f;
    public boolean h;

    public ni(Context context, org.telegram.ui.ActionBar.f6 f6Var, vi viVar) {
        super(context);
        this.a = f6Var;
        this.b = viVar;
    }

    public boolean C(int i10) {
        return false;
    }

    public boolean I(int i10, boolean z10, int i11, boolean z11, long j3) {
        return false;
    }

    public boolean J() {
        return !(this instanceof fi.r4);
    }

    public boolean b() {
        return true;
    }

    public boolean c() {
        return true;
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(h() != 0 ? 12.0f : 17.0f);
    }

    public int getCurrentItemTop() {
        return 0;
    }

    public int getCustomActionBarBackground() {
        return 0;
    }

    public int getCustomBackground() {
        return 0;
    }

    public int getFirstOffset() {
        return 0;
    }

    public ch.a getIBlur3Capture() {
        return null;
    }

    public int getListTopPadding() {
        return 0;
    }

    public int getSelectedItemsCount() {
        return 0;
    }

    public ArrayList<org.telegram.ui.ActionBar.l6> getThemeDescriptions() {
        return null;
    }

    public int h() {
        return 0;
    }

    public boolean i() {
        return false;
    }

    public boolean l(MotionEvent motionEvent) {
        return false;
    }

    public boolean n() {
        return false;
    }

    public boolean p() {
        return true;
    }

    public abstract void y(int i10, int i11);

    public void A() {
    }

    public void B(int i10) {
    }

    public void D(ni niVar) {
    }

    public void F() {
    }

    public void G() {
    }

    public void a(CharSequence charSequence) {
    }

    public void d() {
    }

    public void j() {
    }

    public void k(float f7) {
    }

    public void m() {
    }

    public void o(int i10) {
    }

    public void q() {
    }

    public void r() {
    }

    public void s(float f7) {
    }

    public void t(int i10) {
    }

    public void u() {
    }

    public void v() {
    }

    public void x() {
    }

    public void w(int i10, boolean z10) {
    }
}
