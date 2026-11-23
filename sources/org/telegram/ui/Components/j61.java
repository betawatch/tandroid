package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class j61 {
    public final org.telegram.ui.fo0 a;
    public hi.r7 b;
    public String c;
    public boolean d;
    public m.o3 e;
    public ac0 f;
    public ArrayList g;
    public hi.o7 h;
    public boolean i;
    public final rc j = new rc(this, 22);

    public j61(org.telegram.ui.fo0 fo0Var) {
        this.a = fo0Var;
    }

    public final void a(int i7, hi.p7 p7Var) {
        hi.r7 r7Var;
        android.support.v4.media.session.a0 a0Var;
        hi.p7 p7Var2 = (p7Var == null || DictationAsr.E(i7)) ? p7Var : null;
        String l10 = p7Var2 == null ? null : p7Var2.l();
        if (TextUtils.equals(l10, this.c)) {
            return;
        }
        c();
        hi.r7 r7Var2 = this.b;
        if (r7Var2 != null) {
            r7Var2.c();
            this.b = null;
        }
        this.c = l10;
        if (p7Var2 != null) {
            hi.r7 r7Var3 = new hi.r7(p7Var2, 0L, 0L, new sh0(26, this, r9));
            this.b = r7Var3;
            hi.r7[] r7VarArr = {r7Var3};
            if (r7Var3.f != null && org.telegram.messenger.mp.g1().getBoolean("asr_video_captions", false) && (a0Var = (r7Var = this.b).f) != null && (DictationAsr.C((ai.q) a0Var.b) || DictationAsr.A((ai.q) r7Var.f.b))) {
                b();
            }
        }
        this.a.i();
    }

    public final void b() {
        hi.r7 r7Var;
        org.telegram.ui.fo0 fo0Var = this.a;
        PhotoViewer photoViewer = fo0Var.a;
        if (this.d || (r7Var = this.b) == null || r7Var.f == null) {
            return;
        }
        this.d = true;
        ac0 ac0Var = this.f;
        if (ac0Var == null) {
            ac0 ac0Var2 = new ac0(photoViewer.f0.getContext(), 1);
            this.f = ac0Var2;
            ac0Var2.setEnabled(false);
            this.f.setFocusable(false);
            this.f.setClickable(false);
            this.f.setBackgroundColor(0);
            this.f.setTextSize(1, 16.0f);
            this.f.setTypeface(org.telegram.messenger.g0.o());
            this.f.setGravity(17);
            this.f.setTextAlignment(4);
            this.f.setHorizontallyScrolling(false);
            this.f.setMaxLines(3);
            this.f.setBreakStrategy(0);
            this.f.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
            this.f.setFrameColor(2130706432);
            this.f.setTextColor(-1);
            this.f.setTallFrame(true);
            this.f.setAlpha(0.0f);
            this.f.setImportantForAccessibility(2);
            org.telegram.ui.qq0 qq0Var = photoViewer.f0;
            ac0 ac0Var3 = this.f;
            org.telegram.ui.cr0 cr0Var = photoViewer.i3;
            qq0Var.addView(ac0Var3, cr0Var != null ? qq0Var.indexOfChild(cr0Var) : -1, c8.na.d(-2, -2.0f, 49, 16.0f, 0.0f, 16.0f, 0.0f));
        } else if (ac0Var.getParent() == null) {
            org.telegram.ui.qq0 qq0Var2 = photoViewer.f0;
            ac0 ac0Var4 = this.f;
            org.telegram.ui.cr0 cr0Var2 = photoViewer.i3;
            qq0Var2.addView(ac0Var4, cr0Var2 != null ? qq0Var2.indexOfChild(cr0Var2) : -1, c8.na.d(-2, -2.0f, 49, 16.0f, 0.0f, 16.0f, 0.0f));
        }
        hi.r7 r7Var2 = this.b;
        r7Var2.n = new hy(fo0Var, 26);
        r7Var2.d = 1;
        TextPaint textPaint = new TextPaint(this.f.getPaint());
        float width = (((photoViewer.f0.getWidth() > 0 ? photoViewer.f0.getWidth() : org.telegram.messenger.g0.q.x) - org.telegram.messenger.g0.L(32.0f)) - this.f.getPaddingLeft()) - this.f.getPaddingRight();
        r7Var2.u = new hy(textPaint, 27);
        r7Var2.v = width * 0.96f;
        Context context = this.f.getContext();
        org.telegram.ui.qq0 qq0Var3 = photoViewer.f0;
        org.telegram.ui.ActionBar.i6 i6Var = photoViewer.w2;
        android.support.v4.media.session.a0 a0Var = r7Var2.f;
        m.o3 o3Var = new m.o3(context, qq0Var3, i6Var, a0Var == null ? "" : ai.l0.o(a0Var.i()), new sh0(27, this, r7Var2));
        this.e = o3Var;
        r7Var2.h(0L, 0L, new i61(this, o3Var, r7Var2));
        ac0 ac0Var5 = this.f;
        rc rcVar = this.j;
        ac0Var5.removeCallbacks(rcVar);
        this.f.postOnAnimation(rcVar);
    }

    public final void c() {
        hi.r7 r7Var = this.b;
        if (r7Var != null) {
            r7Var.i();
        }
        m.o3 o3Var = this.e;
        if (o3Var != null) {
            o3Var.f = null;
            fc fcVar = (fc) o3Var.h;
            if (fcVar != null) {
                fcVar.b();
                o3Var.h = null;
            }
            this.e = null;
        }
        this.d = false;
        this.g = null;
        this.h = null;
        ac0 ac0Var = this.f;
        if (ac0Var != null) {
            ac0Var.removeCallbacks(this.j);
            this.f.animate().cancel();
            this.f.setAlpha(0.0f);
            this.i = false;
        }
    }

    public final void d() {
        hi.r7 r7Var = this.b;
        if (r7Var == null || r7Var.f == null) {
            return;
        }
        if (this.d) {
            org.telegram.messenger.mp.g1().edit().putBoolean("asr_video_captions", false).apply();
            c();
        } else {
            org.telegram.messenger.mp.g1().edit().putBoolean("asr_video_captions", true).apply();
            b();
        }
        this.a.i();
    }
}
