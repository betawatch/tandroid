package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public abstract class ni extends FrameLayout {
    public final org.telegram.ui.ActionBar.c6 a;
    public final vi b;
    public mm0 c;
    public mm0 d;
    public int e;
    public boolean f;
    public boolean h;

    public ni(Context context, org.telegram.ui.ActionBar.c6 c6Var, vi viVar) {
        super(context);
        this.a = c6Var;
        this.b = viVar;
    }

    public abstract void C(int i10, int i11);

    public boolean F(int i10) {
        return false;
    }

    public boolean K(int i10, boolean z10, int i11, boolean z11, long j10) {
        return false;
    }

    public boolean L() {
        return !(this instanceof fi.q4);
    }

    public boolean M() {
        return true;
    }

    public boolean b() {
        return true;
    }

    public boolean c() {
        return true;
    }

    public boolean e() {
        return this instanceof cl;
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return this instanceof cl;
    }

    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(i() != 0 ? 12.0f : 17.0f);
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

    public ArrayList<org.telegram.ui.ActionBar.i6> getThemeDescriptions() {
        return null;
    }

    public boolean h() {
        return false;
    }

    public int i() {
        return 0;
    }

    public boolean j() {
        return false;
    }

    public void m(float f7, float f10) {
        l(f7);
    }

    public boolean n(MotionEvent motionEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public boolean s() {
        return true;
    }

    public void B() {
    }

    public void D() {
    }

    public void E(int i10) {
    }

    public void G(ni niVar) {
    }

    public void I() {
    }

    public void J() {
    }

    public void a(CharSequence charSequence) {
    }

    public void d() {
    }

    public void k() {
    }

    public void l(float f7) {
    }

    public void o() {
    }

    public void r(int i10) {
    }

    public void t() {
    }

    public void u() {
    }

    public void v(float f7) {
    }

    public void w(int i10) {
    }

    public void x() {
    }

    public void y() {
    }

    public void z(int i10, boolean z10) {
    }
}
