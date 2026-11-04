package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class th extends FrameLayout {
    public final org.telegram.ui.ActionBar.e6 a;
    public final bi b;
    public tj0 c;
    public tj0 d;
    public int e;
    public boolean f;
    public boolean h;

    public th(Context context, org.telegram.ui.ActionBar.e6 e6Var, bi biVar) {
        super(context);
        this.a = e6Var;
        this.b = biVar;
    }

    public abstract void B(int i3, int i10);

    public boolean G(int i3) {
        return false;
    }

    public boolean L(boolean z10, int i3, int i10, long j10, boolean z11) {
        return false;
    }

    public boolean M() {
        return !(this instanceof uk);
    }

    public boolean N() {
        return true;
    }

    public boolean b() {
        return true;
    }

    public boolean c() {
        return true;
    }

    public boolean e() {
        return this instanceof hk;
    }

    public boolean f() {
        return this instanceof hk;
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

    public ArrayList<org.telegram.ui.ActionBar.t6> getThemeDescriptions() {
        return null;
    }

    public boolean h() {
        return this instanceof hk;
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

    public void setBlur3Capture(tj0 tj0Var) {
        int i3 = bi.F4;
        this.b.Y0.b(tj0Var);
        this.c = tj0Var;
    }

    public void D(int i3) {
    }

    public void H(th thVar) {
    }

    public void a(CharSequence charSequence) {
    }

    public void m(float f10) {
    }

    public void r(int i3) {
    }

    public void v(float f10) {
    }

    public void w(int i3) {
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

    public void z(int i3, boolean z10) {
    }
}
