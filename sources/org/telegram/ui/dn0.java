package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.CheckBox;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dn0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ dn0(PhotoViewer photoViewer, int i7) {
        this.a = i7;
        this.b = photoViewer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7;
        org.telegram.ui.Components.t51 t51Var;
        int i10;
        Bitmap bitmap;
        Bitmap bitmap2;
        di.u2 u2Var;
        org.telegram.messenger.ij ijVar;
        org.telegram.messenger.nj b10;
        uq0 uq0Var;
        int i11 = 3;
        char c10 = 1;
        final int i12 = 0;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                Drawable[] drawableArr = PhotoViewer.Y8;
                photoViewer.f0();
                photoViewer.b3(0);
                break;
            case 1:
                PhotoViewer photoViewer2 = this.b;
                if (!photoViewer2.I1.a()) {
                    photoViewer2.b3(0);
                    break;
                } else {
                    Activity activity = photoViewer2.D;
                    if (activity != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, photoViewer2.v2);
                        alertDialog$Builder.a.T = org.telegram.messenger.id.M0(2131751406, "DiscardChanges");
                        alertDialog$Builder.a.R = org.telegram.messenger.id.M0(R.string.AppName, "AppName");
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, "OK"), new ln0(photoViewer2));
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, "Cancel"), null);
                        photoViewer2.P2(alertDialog$Builder);
                        break;
                    }
                }
                break;
            case 2:
                PhotoViewer photoViewer3 = this.b;
                photoViewer3.X7 = photoViewer3.Z7;
                photoViewer3.L0();
                photoViewer3.V2(false);
                photoViewer3.m2(2);
                break;
            case 3:
                PhotoViewer photoViewer4 = this.b;
                Object obj = photoViewer4.f7.get(photoViewer4.O4);
                if (obj instanceof org.telegram.messenger.ze) {
                    ((org.telegram.messenger.ze) obj).s = photoViewer4.j1();
                }
                photoViewer4.V2(false);
                photoViewer4.m2(2);
                break;
            case 4:
                PhotoViewer photoViewer5 = this.b;
                Drawable[] drawableArr2 = PhotoViewer.Y8;
                photoViewer5.t2(false, 0, 0, false, false, false);
                break;
            case 5:
                PhotoViewer photoViewer6 = this.b;
                photoViewer6.u5.m(false, true);
                photoViewer6.v5.m(false, true);
                photoViewer6.b3(0);
                break;
            case 6:
                PhotoViewer photoViewer7 = this.b;
                photoViewer7.u5.m(false, true);
                photoViewer7.v5.m(false, true);
                photoViewer7.f0();
                photoViewer7.b3(0);
                break;
            case 7:
                PhotoViewer photoViewer8 = this.b;
                Drawable[] drawableArr3 = PhotoViewer.Y8;
                photoViewer8.b3(5);
                break;
            case 8:
                PhotoViewer photoViewer9 = this.b;
                Drawable[] drawableArr4 = PhotoViewer.Y8;
                photoViewer9.y0();
                break;
            case 9:
                PhotoViewer photoViewer10 = this.b;
                if (!photoViewer10.p5.b.Q && (i7 = photoViewer10.O4) >= 0 && i7 < photoViewer10.f7.size() && (photoViewer10.f7.get(photoViewer10.O4) instanceof org.telegram.messenger.gf)) {
                    org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) photoViewer10.f7.get(photoViewer10.O4);
                    long time = photoViewer10.p5.getTime();
                    String v12 = PhotoViewer.v1();
                    photoViewer10.p5.b.setLoading(true);
                    Utilities.e.c(new bi.w2(photoViewer10, v12, gfVar, time, 23));
                    break;
                }
                break;
            case 10:
                final PhotoViewer photoViewer11 = this.b;
                Drawable[] drawableArr5 = PhotoViewer.Y8;
                if (!photoViewer11.F1()) {
                    photoViewer11.r = !photoViewer11.r;
                    ArrayList arrayList = photoViewer11.h1;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj2 = arrayList.get(i13);
                            i13++;
                            ((fi.m3) obj2).f(true);
                        }
                    }
                    if (photoViewer11.r) {
                        final fi.m3 m3Var = new fi.m3(photoViewer11.D, 3);
                        m3Var.r(true);
                        m3Var.u(org.telegram.messenger.id.M0(2131751210, null));
                        m3Var.h = fi.m3.a(m3Var.getText(), m3Var.getTextPaint());
                        m3Var.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
                        m3Var.o(0.0f, 22.0f);
                        m3Var.q0 = new Runnable() { // from class: org.telegram.ui.in0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        ArrayList arrayList2 = photoViewer11.h1;
                                        if (arrayList2 != null) {
                                            arrayList2.remove(m3Var);
                                            break;
                                        }
                                        break;
                                    default:
                                        PhotoViewer photoViewer12 = photoViewer11;
                                        ArrayList arrayList3 = photoViewer12.h1;
                                        fi.m3 m3Var2 = m3Var;
                                        if (arrayList3 != null) {
                                            arrayList3.remove(m3Var2);
                                        }
                                        ArrayList arrayList4 = photoViewer12.i1;
                                        if (arrayList4 != null) {
                                            arrayList4.remove(m3Var2);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        if (photoViewer11.h1 == null) {
                            photoViewer11.h1 = new ArrayList();
                        }
                        photoViewer11.e0.addView(m3Var, c8.ha.e(-1, org.telegram.messenger.qs.e3, 83));
                        photoViewer11.h1.add(m3Var);
                        m3Var.w();
                    }
                    photoViewer11.u3();
                    photoViewer11.z3();
                    if (photoViewer11.r) {
                        CheckBox checkBox = photoViewer11.N0;
                        if (!checkBox.y) {
                            checkBox.callOnClick();
                            break;
                        }
                    }
                    Object obj3 = photoViewer11.f7.get(photoViewer11.O4);
                    if (obj3 instanceof org.telegram.messenger.ze) {
                        ((org.telegram.messenger.ze) obj3).s = photoViewer11.j1();
                        break;
                    }
                }
                break;
            case 11:
                final PhotoViewer photoViewer12 = this.b;
                Drawable[] drawableArr6 = PhotoViewer.Y8;
                boolean O1 = photoViewer12.O1();
                boolean z9 = !O1;
                int i14 = photoViewer12.O4;
                if (i14 >= 0 && i14 < photoViewer12.f7.size()) {
                    Object obj4 = photoViewer12.f7.get(photoViewer12.O4);
                    if (obj4 instanceof org.telegram.messenger.gf) {
                        ((org.telegram.messenger.gf) obj4).O = Boolean.valueOf(z9);
                        SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                        org.telegram.messenger.iz.i1 = O1;
                        edit.putBoolean("photoLiveDefault", O1).apply();
                        uq0 uq0Var2 = photoViewer12.d;
                        if (uq0Var2 != null) {
                            uq0Var2.m();
                        }
                    }
                }
                photoViewer12.f1.a(!photoViewer12.O1(), true);
                photoViewer12.R7.animate().alpha(photoViewer12.O1() ? 0.45f : 1.0f).start();
                if (photoViewer12.O1() && (t51Var = photoViewer12.F2) != null) {
                    t51Var.g0();
                }
                photoViewer12.e0.invalidate();
                if (photoViewer12.h1 == null) {
                    photoViewer12.h1 = new ArrayList();
                }
                if (photoViewer12.i1 == null) {
                    photoViewer12.i1 = new ArrayList();
                }
                ArrayList arrayList2 = photoViewer12.h1;
                int size2 = arrayList2.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj5 = arrayList2.get(i15);
                    i15++;
                    ((fi.m3) obj5).f(true);
                }
                final fi.m3 m3Var2 = new fi.m3(photoViewer12.D, 3);
                m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(photoViewer12.O1() ? 2131748837 : 2131748836, null)));
                m3Var2.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
                m3Var2.o(0.0f, 28.0f);
                final char c11 = c10 == true ? 1 : 0;
                m3Var2.q0 = new Runnable() { // from class: org.telegram.ui.in0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (c11) {
                            case 0:
                                ArrayList arrayList22 = photoViewer12.h1;
                                if (arrayList22 != null) {
                                    arrayList22.remove(m3Var2);
                                    break;
                                }
                                break;
                            default:
                                PhotoViewer photoViewer122 = photoViewer12;
                                ArrayList arrayList3 = photoViewer122.h1;
                                fi.m3 m3Var22 = m3Var2;
                                if (arrayList3 != null) {
                                    arrayList3.remove(m3Var22);
                                }
                                ArrayList arrayList4 = photoViewer122.i1;
                                if (arrayList4 != null) {
                                    arrayList4.remove(m3Var22);
                                    break;
                                }
                                break;
                        }
                    }
                };
                photoViewer12.e0.addView(m3Var2, c8.ha.e(-1, org.telegram.messenger.qs.e3, 83));
                photoViewer12.h1.add(m3Var2);
                photoViewer12.i1.add(m3Var2);
                m3Var2.w();
                break;
            case 12:
                PhotoViewer photoViewer13 = this.b;
                if (photoViewer13.d != null && !photoViewer13.F1()) {
                    photoViewer13.d.n();
                    photoViewer13.z0(true, false);
                    break;
                }
                break;
            case 13:
                PhotoViewer photoViewer14 = this.b;
                if (photoViewer14.d != null && !photoViewer14.F1()) {
                    photoViewer14.d.n();
                    photoViewer14.z0(true, false);
                    break;
                }
                break;
            case 14:
                PhotoViewer photoViewer15 = this.b;
                ArrayList arrayList3 = photoViewer15.f7;
                if (!photoViewer15.u7) {
                    hq0 hq0Var = photoViewer15.s5;
                    if (!hq0Var.Q && hq0Var.m0 != 1 && (i10 = photoViewer15.O4) >= 0 && i10 < arrayList3.size() && !photoViewer15.o5.V) {
                        org.telegram.messenger.ze zeVar = (org.telegram.messenger.ze) arrayList3.get(photoViewer15.O4);
                        boolean isEmpty = TextUtils.isEmpty(zeVar.i);
                        boolean z10 = !isEmpty;
                        hq0 hq0Var2 = photoViewer15.s5;
                        int i16 = hq0Var2.m0;
                        if (i16 != 0) {
                            if (i16 != 2) {
                                photoViewer15.o5.l();
                                photoViewer15.o5.getThanosEffect();
                                tg.c2 c2Var = photoViewer15.o5;
                                c2Var.L = false;
                                c2Var.E = null;
                                ImageReceiver imageReceiver = photoViewer15.B4;
                                if (isEmpty || (bitmap = c2Var.K) == null) {
                                    bitmap = c2Var.I;
                                }
                                imageReceiver.v0(bitmap);
                                photoViewer15.s5.setCutOutState(true);
                                photoViewer15.U2(false, true);
                                photoViewer15.f0();
                                break;
                            } else {
                                hq0Var2.setCutOutState(true);
                                photoViewer15.U2(false, true);
                                photoViewer15.o5.f();
                                photoViewer15.e0.invalidate();
                                break;
                            }
                        } else {
                            hq0Var2.setCancelState(true);
                            tg.c2 c2Var2 = photoViewer15.o5;
                            fi.nb nbVar = new fi.nb(photoViewer15, z10, zeVar, i11);
                            c2Var2.getClass();
                            c2Var2.setOnClickListener(new fk0(27, c2Var2, nbVar));
                            TextView textView = c2Var2.M;
                            textView.setText(org.telegram.messenger.id.M0(2131745678, null));
                            textView.animate().cancel();
                            textView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(240L).setInterpolator(org.telegram.ui.Components.xq.h).start();
                            ValueAnimator valueAnimator = c2Var2.N;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            c2Var2.Q = c2Var2.R;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            c2Var2.N = ofFloat;
                            ofFloat.addUpdateListener(new fi.v3(c2Var2, 28));
                            c2Var2.N.setRepeatCount(-1);
                            c2Var2.N.setRepeatMode(1);
                            c2Var2.N.setDuration(2400L);
                            c2Var2.N.setInterpolator(new LinearInterpolator());
                            c2Var2.N.start();
                            photoViewer15.e0.invalidate();
                            break;
                        }
                    }
                }
                break;
            case 15:
                PhotoViewer photoViewer16 = this.b;
                photoViewer16.u5.m(true, true);
                photoViewer16.v5.m(false, true);
                tg.c2 c2Var3 = photoViewer16.o5;
                if (c2Var3 != null) {
                    c2Var3.setOutlineVisible(false);
                }
                photoViewer16.M1 = true;
                tp0 tp0Var = photoViewer16.N1;
                if (tp0Var != null) {
                    tp0Var.setEraser(true);
                }
                photoViewer16.b3(4);
                break;
            case 16:
                PhotoViewer photoViewer17 = this.b;
                photoViewer17.u5.m(false, true);
                photoViewer17.v5.m(true, true);
                tg.c2 c2Var4 = photoViewer17.o5;
                if (c2Var4 != null) {
                    c2Var4.setOutlineVisible(false);
                }
                photoViewer17.M1 = false;
                tp0 tp0Var2 = photoViewer17.N1;
                if (tp0Var2 != null) {
                    tp0Var2.setEraser(false);
                }
                photoViewer17.b3(4);
                break;
            case 17:
                PhotoViewer photoViewer18 = this.b;
                tp0 tp0Var3 = photoViewer18.N1;
                if (tp0Var3 != null) {
                    sg.m1 m1Var = tp0Var3.b;
                    if (m1Var.a()) {
                        m1Var.c();
                        break;
                    }
                }
                photoViewer18.b3(0);
                photoViewer18.o5.l();
                boolean isEmpty2 = TextUtils.isEmpty(((org.telegram.messenger.ze) photoViewer18.f7.get(photoViewer18.O4)).i);
                tg.c2 c2Var5 = photoViewer18.o5;
                if (c2Var5 != null && !c2Var5.G) {
                    c2Var5.L = false;
                    c2Var5.E = null;
                }
                ImageReceiver imageReceiver2 = photoViewer18.B4;
                if (isEmpty2 || (bitmap2 = c2Var5.K) == null) {
                    bitmap2 = c2Var5.I;
                }
                imageReceiver2.v0(bitmap2);
                tg.c2 c2Var6 = photoViewer18.o5;
                if (c2Var6 == null || !c2Var6.G) {
                    photoViewer18.s5.setCutOutState(true);
                }
                photoViewer18.X2(true, true);
                break;
            case 18:
                PhotoViewer photoViewer19 = this.b;
                if (photoViewer19.o5 != null) {
                    photoViewer19.x5.m(!r2.s0, true);
                    photoViewer19.o5.setOutlineVisible((!photoViewer19.x5.s0 || photoViewer19.u5.s0 || photoViewer19.v5.s0) ? false : true);
                    break;
                }
                break;
            case 19:
                PhotoViewer photoViewer20 = this.b;
                an anVar = photoViewer20.k4;
                if (anVar != null && (ijVar = anVar.F5) != null && ijVar.q5() && !org.telegram.messenger.t3.z(photoViewer20.T, 24, org.telegram.messenger.ij.B0(photoViewer20.k4.F5.k))) {
                    if (photoViewer20.l4 == null || (b10 = photoViewer20.k4.w5) == null) {
                        b10 = org.telegram.messenger.nj.b(photoViewer20.k4.F5.k.suggested_post);
                    }
                    if (!bi.ea.T(photoViewer20.T, b10.a)) {
                        an anVar2 = photoViewer20.k4;
                        if (anVar2 != null) {
                            anVar2.wc(b10);
                            break;
                        }
                    }
                }
                if (!photoViewer20.U1.o()) {
                    an anVar3 = photoViewer20.k4;
                    if (anVar3 == null || !anVar3.c() || ((u2Var = photoViewer20.k4.X1) != null && u2Var.B3 != null)) {
                        photoViewer20.t2(true, 0, 0, false, false, false);
                        break;
                    } else {
                        photoViewer20.W2();
                        break;
                    }
                } else {
                    org.telegram.ui.Components.j6 j6Var = photoViewer20.U1.w;
                    float f10 = -photoViewer20.W1;
                    photoViewer20.W1 = f10;
                    org.telegram.messenger.g0.G3(f10, j6Var, null);
                    org.telegram.messenger.p2.D.a();
                    if (!org.telegram.messenger.qp.s1(photoViewer20.T).D3() && org.telegram.messenger.qp.s1(photoViewer20.T).U4 > photoViewer20.U1.getCodePointCount()) {
                        photoViewer20.Q2(photoViewer20.e0);
                        break;
                    }
                }
                break;
            case 20:
                this.b.a.a(false, true);
                break;
            case 21:
                PhotoViewer photoViewer21 = this.b;
                if (photoViewer21.D != null && (uq0Var = photoViewer21.d) != null) {
                    uq0Var.W();
                    photoViewer21.z0(true, false);
                    break;
                }
                break;
            case 22:
                PhotoViewer photoViewer22 = this.b;
                Drawable[] drawableArr7 = PhotoViewer.Y8;
                photoViewer22.m0();
                if (!photoViewer22.F1()) {
                    if (photoViewer22.r1) {
                        if (photoViewer22.j8) {
                            TextureView textureView = photoViewer22.B2;
                            if (textureView instanceof org.telegram.ui.Components.h51) {
                                org.telegram.ui.Components.h51 h51Var = (org.telegram.ui.Components.h51) textureView;
                                if (h51Var.getVideoWidth() <= 0 || h51Var.getVideoHeight() <= 0) {
                                }
                            }
                        }
                    }
                    photoViewer22.b3(1);
                    break;
                }
                break;
            case 23:
                PhotoViewer photoViewer23 = this.b;
                Drawable[] drawableArr8 = PhotoViewer.Y8;
                photoViewer23.I0(-90.0f, false, null);
                break;
            case 24:
                PhotoViewer photoViewer24 = this.b;
                Drawable[] drawableArr9 = PhotoViewer.Y8;
                photoViewer24.H0();
                break;
            case 25:
                PhotoViewer photoViewer25 = this.b;
                Drawable[] drawableArr10 = PhotoViewer.Y8;
                photoViewer25.m0();
                if (!photoViewer25.F1()) {
                    if (photoViewer25.r1) {
                        if (photoViewer25.j8) {
                            TextureView textureView2 = photoViewer25.B2;
                            if (textureView2 instanceof org.telegram.ui.Components.h51) {
                                org.telegram.ui.Components.h51 h51Var2 = (org.telegram.ui.Components.h51) textureView2;
                                if (h51Var2.getVideoWidth() <= 0 || h51Var2.getVideoHeight() <= 0) {
                                }
                            }
                        }
                    }
                    photoViewer25.b3(3);
                    break;
                }
                break;
            case 26:
                PhotoViewer photoViewer26 = this.b;
                Drawable[] drawableArr11 = PhotoViewer.Y8;
                if (view.getAlpha() >= 0.9f) {
                    photoViewer26.m0();
                    if (!photoViewer26.F1()) {
                        if (photoViewer26.r1) {
                            if (photoViewer26.j8) {
                                TextureView textureView3 = photoViewer26.B2;
                                if (textureView3 instanceof org.telegram.ui.Components.h51) {
                                    org.telegram.ui.Components.h51 h51Var3 = (org.telegram.ui.Components.h51) textureView3;
                                    if (h51Var3.getVideoWidth() <= 0 || h51Var3.getVideoHeight() <= 0) {
                                    }
                                }
                            }
                        }
                        photoViewer26.b3(2);
                        break;
                    }
                }
                break;
            case 27:
                PhotoViewer photoViewer27 = this.b;
                if (photoViewer27.o6 == null) {
                    wn0 wn0Var = new wn0(photoViewer27, 2);
                    if (!photoViewer27.I2) {
                        float stateOrientation = photoViewer27.Q2 - photoViewer27.C1.b.getStateOrientation();
                        if (Math.abs(stateOrientation) > 180.0f) {
                            stateOrientation = stateOrientation < 0.0f ? stateOrientation + 360.0f : -(360.0f - stateOrientation);
                        }
                        photoViewer27.I0(stateOrientation, photoViewer27.C1.b.getStateMirror(), wn0Var);
                        break;
                    } else {
                        wn0Var.run();
                        break;
                    }
                }
                break;
            case 28:
                PhotoViewer photoViewer28 = this.b;
                if (photoViewer28.t4 == 1) {
                    og.o oVar = photoViewer28.C1.b;
                    og.c cVar = oVar.G;
                    if (cVar.a.isInProgress() || cVar.h || oVar.a.e0) {
                    }
                }
                photoViewer28.f0();
                photoViewer28.b3(0);
                break;
            default:
                PhotoViewer photoViewer29 = this.b;
                float f11 = -photoViewer29.C1.b.getStateOrientation();
                if (Math.abs(f11) > 180.0f) {
                    f11 = f11 < 0.0f ? f11 + 360.0f : -(360.0f - f11);
                }
                photoViewer29.I0(f11, photoViewer29.C1.b.getStateMirror(), new cn0(photoViewer29, 8));
                break;
        }
    }
}
