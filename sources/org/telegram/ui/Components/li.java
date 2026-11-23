package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public abstract class li extends FrameLayout {
    public final org.telegram.ui.ActionBar.i6 a;
    public final ti b;
    public ek0 c;
    public ek0 d;
    public int e;
    public boolean f;
    public boolean h;

    public li(Context context, org.telegram.ui.ActionBar.i6 i6Var, ti tiVar) {
        super(context);
        this.a = i6Var;
        this.b = tiVar;
    }

    public abstract void B(int i7, int i10);

    public boolean F(int i7) {
        return false;
    }

    public boolean M(boolean z10, int i7, int i10, long j3, boolean z11) {
        return false;
    }

    public boolean N() {
        return !(this instanceof kl);
    }

    public boolean O() {
        return true;
    }

    public boolean b() {
        return true;
    }

    public boolean c() {
        return true;
    }

    public boolean e() {
        return this instanceof xk;
    }

    public boolean f() {
        return this instanceof xk;
    }

    public boolean g() {
        return false;
    }

    public int getButtonsHideOffset() {
        return org.telegram.messenger.g0.L(j() != 0 ? 12.0f : 17.0f);
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

    public int getListTopPadding() {
        return 0;
    }

    public int getSelectedItemsCount() {
        return 0;
    }

    public ArrayList<org.telegram.ui.ActionBar.w6> getThemeDescriptions() {
        return null;
    }

    public boolean h() {
        return this instanceof xk;
    }

    public boolean i() {
        return false;
    }

    public int j() {
        return 0;
    }

    public boolean k() {
        return false;
    }

    public void n(float f10, float f11) {
        m(f10);
    }

    public boolean o(MotionEvent motionEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public boolean s() {
        return true;
    }

    public void setBlur3Capture(ek0 ek0Var) {
        int i7 = ti.I4;
        this.b.Y0.b(ek0Var);
        this.c = ek0Var;
    }

    public void D(int i7) {
    }

    public void H(li liVar) {
    }

    public void a(CharSequence charSequence) {
    }

    public void m(float f10) {
    }

    public void r(int i7) {
    }

    public void v(float f10) {
    }

    public void w(int i7) {
    }

    public void A() {
    }

    public void C() {
    }

    public void I() {
    }

    public void J() {
    }

    public void d() {
    }

    public void l() {
    }

    public void p() {
    }

    public void t() {
    }

    public void u() {
    }

    public void x() {
    }

    public void y() {
    }

    public void E(float f10, float f11) {
    }

    public void z(int i7, boolean z10) {
    }
}
