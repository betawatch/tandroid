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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class in0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ in0(PhotoViewer photoViewer, int i7) {
        this.a = i7;
        this.b = photoViewer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7;
        org.telegram.ui.Components.f61 f61Var;
        int i10;
        Bitmap bitmap;
        Bitmap bitmap2;
        fi.n2 n2Var;
        org.telegram.messenger.fj fjVar;
        org.telegram.messenger.kj b10;
        uq0 uq0Var;
        int i11 = 3;
        char c10 = 1;
        final int i12 = 0;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                Drawable[] drawableArr = PhotoViewer.Z8;
                photoViewer.f0();
                photoViewer.c3(0);
                break;
            case 1:
                PhotoViewer photoViewer2 = this.b;
                if (!photoViewer2.J1.a()) {
                    photoViewer2.c3(0);
                    break;
                } else {
                    Activity activity = photoViewer2.E;
                    if (activity != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, photoViewer2.w2);
                        alertDialog$Builder.a.U = org.telegram.messenger.gd.M0(2131751394, "DiscardChanges");
                        alertDialog$Builder.a.S = org.telegram.messenger.gd.M0(R.string.AppName, "AppName");
                        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, "OK"), new qn0(photoViewer2));
                        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, "Cancel"), null);
                        photoViewer2.Q2(alertDialog$Builder);
                        break;
                    }
                }
                break;
            case 2:
                PhotoViewer photoViewer3 = this.b;
                photoViewer3.Y7 = photoViewer3.a8;
                photoViewer3.L0();
                photoViewer3.W2(false);
                photoViewer3.n2(2);
                break;
            case 3:
                PhotoViewer photoViewer4 = this.b;
                Object obj = photoViewer4.g7.get(photoViewer4.P4);
                if (obj instanceof org.telegram.messenger.xe) {
                    ((org.telegram.messenger.xe) obj).s = photoViewer4.j1();
                }
                photoViewer4.W2(false);
                photoViewer4.n2(2);
                break;
            case 4:
                PhotoViewer photoViewer5 = this.b;
                Drawable[] drawableArr2 = PhotoViewer.Z8;
                photoViewer5.u2(false, 0, 0, false, false, false);
                break;
            case 5:
                PhotoViewer photoViewer6 = this.b;
                photoViewer6.v5.m(false, true);
                photoViewer6.w5.m(false, true);
                photoViewer6.c3(0);
                break;
            case 6:
                PhotoViewer photoViewer7 = this.b;
                photoViewer7.v5.m(false, true);
                photoViewer7.w5.m(false, true);
                photoViewer7.f0();
                photoViewer7.c3(0);
                break;
            case 7:
                PhotoViewer photoViewer8 = this.b;
                Drawable[] drawableArr3 = PhotoViewer.Z8;
                photoViewer8.c3(5);
                break;
            case 8:
                PhotoViewer photoViewer9 = this.b;
                Drawable[] drawableArr4 = PhotoViewer.Z8;
                photoViewer9.y0();
                break;
            case 9:
                PhotoViewer photoViewer10 = this.b;
                if (!photoViewer10.q5.b.R && (i7 = photoViewer10.P4) >= 0 && i7 < photoViewer10.g7.size() && (photoViewer10.g7.get(photoViewer10.P4) instanceof org.telegram.messenger.ef)) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) photoViewer10.g7.get(photoViewer10.P4);
                    long time = photoViewer10.q5.getTime();
                    String v12 = PhotoViewer.v1();
                    photoViewer10.q5.b.setLoading(true);
                    Utilities.e.c(new di.i2(photoViewer10, v12, efVar, time, 22));
                    break;
                }
                break;
            case 10:
                final PhotoViewer photoViewer11 = this.b;
                Drawable[] drawableArr5 = PhotoViewer.Z8;
                if (!photoViewer11.F1()) {
                    photoViewer11.r = !photoViewer11.r;
                    ArrayList arrayList = photoViewer11.i1;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj2 = arrayList.get(i13);
                            i13++;
                            ((hi.m3) obj2).f(true);
                        }
                    }
                    if (photoViewer11.r) {
                        final hi.m3 m3Var = new hi.m3(photoViewer11.E, 3);
                        m3Var.r(true);
                        m3Var.v(org.telegram.messenger.gd.M0(2131751198, null));
                        m3Var.h = hi.m3.a(m3Var.getText(), m3Var.getTextPaint());
                        m3Var.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
                        m3Var.o(0.0f, 22.0f);
                        m3Var.r0 = new Runnable() { // from class: org.telegram.ui.nn0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        ArrayList arrayList2 = photoViewer11.i1;
                                        if (arrayList2 != null) {
                                            arrayList2.remove(m3Var);
                                            break;
                                        }
                                        break;
                                    default:
                                        PhotoViewer photoViewer12 = photoViewer11;
                                        ArrayList arrayList3 = photoViewer12.i1;
                                        hi.m3 m3Var2 = m3Var;
                                        if (arrayList3 != null) {
                                            arrayList3.remove(m3Var2);
                                        }
                                        ArrayList arrayList4 = photoViewer12.j1;
                                        if (arrayList4 != null) {
                                            arrayList4.remove(m3Var2);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        if (photoViewer11.i1 == null) {
                            photoViewer11.i1 = new ArrayList();
                        }
                        photoViewer11.f0.addView(m3Var, c8.ma.e(-1, org.telegram.messenger.ks.e3, 83));
                        photoViewer11.i1.add(m3Var);
                        m3Var.x();
                    }
                    photoViewer11.v3();
                    photoViewer11.A3();
                    if (photoViewer11.r) {
                        CheckBox checkBox = photoViewer11.O0;
                        if (!checkBox.y) {
                            checkBox.callOnClick();
                            break;
                        }
                    }
                    Object obj3 = photoViewer11.g7.get(photoViewer11.P4);
                    if (obj3 instanceof org.telegram.messenger.xe) {
                        ((org.telegram.messenger.xe) obj3).s = photoViewer11.j1();
                        break;
                    }
                }
                break;
            case 11:
                final PhotoViewer photoViewer12 = this.b;
                Drawable[] drawableArr6 = PhotoViewer.Z8;
                boolean O1 = photoViewer12.O1();
                boolean z10 = !O1;
                int i14 = photoViewer12.P4;
                if (i14 >= 0 && i14 < photoViewer12.g7.size()) {
                    Object obj4 = photoViewer12.g7.get(photoViewer12.P4);
                    if (obj4 instanceof org.telegram.messenger.ef) {
                        ((org.telegram.messenger.ef) obj4).O = Boolean.valueOf(z10);
                        SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                        org.telegram.messenger.bz.i1 = O1;
                        edit.putBoolean("photoLiveDefault", O1).apply();
                        uq0 uq0Var2 = photoViewer12.d;
                        if (uq0Var2 != null) {
                            uq0Var2.m();
                        }
                    }
                }
                photoViewer12.g1.a(!photoViewer12.O1(), true);
                photoViewer12.S7.animate().alpha(photoViewer12.O1() ? 0.45f : 1.0f).start();
                if (photoViewer12.O1() && (f61Var = photoViewer12.G2) != null) {
                    f61Var.g0();
                }
                photoViewer12.f0.invalidate();
                if (photoViewer12.i1 == null) {
                    photoViewer12.i1 = new ArrayList();
                }
                if (photoViewer12.j1 == null) {
                    photoViewer12.j1 = new ArrayList();
                }
                ArrayList arrayList2 = photoViewer12.i1;
                int size2 = arrayList2.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj5 = arrayList2.get(i15);
                    i15++;
                    ((hi.m3) obj5).f(true);
                }
                final hi.m3 m3Var2 = new hi.m3(photoViewer12.E, 3);
                m3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(photoViewer12.O1() ? 2131748644 : 2131748643, null)));
                m3Var2.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
                m3Var2.o(0.0f, 28.0f);
                final char c11 = c10 == true ? 1 : 0;
                m3Var2.r0 = new Runnable() { // from class: org.telegram.ui.nn0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (c11) {
                            case 0:
                                ArrayList arrayList22 = photoViewer12.i1;
                                if (arrayList22 != null) {
                                    arrayList22.remove(m3Var2);
                                    break;
                                }
                                break;
                            default:
                                PhotoViewer photoViewer122 = photoViewer12;
                                ArrayList arrayList3 = photoViewer122.i1;
                                hi.m3 m3Var22 = m3Var2;
                                if (arrayList3 != null) {
                                    arrayList3.remove(m3Var22);
                                }
                                ArrayList arrayList4 = photoViewer122.j1;
                                if (arrayList4 != null) {
                                    arrayList4.remove(m3Var22);
                                    break;
                                }
                                break;
                        }
                    }
                };
                photoViewer12.f0.addView(m3Var2, c8.ma.e(-1, org.telegram.messenger.ks.e3, 83));
                photoViewer12.i1.add(m3Var2);
                photoViewer12.j1.add(m3Var2);
                m3Var2.x();
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
                ArrayList arrayList3 = photoViewer15.g7;
                if (!photoViewer15.v7) {
                    iq0 iq0Var = photoViewer15.t5;
                    if (!iq0Var.R && iq0Var.o0 != 1 && (i10 = photoViewer15.P4) >= 0 && i10 < arrayList3.size() && !photoViewer15.p5.W) {
                        org.telegram.messenger.xe xeVar = (org.telegram.messenger.xe) arrayList3.get(photoViewer15.P4);
                        boolean isEmpty = TextUtils.isEmpty(xeVar.i);
                        boolean z11 = !isEmpty;
                        iq0 iq0Var2 = photoViewer15.t5;
                        int i16 = iq0Var2.o0;
                        if (i16 != 0) {
                            if (i16 != 2) {
                                photoViewer15.p5.l();
                                photoViewer15.p5.getThanosEffect();
                                tg.e2 e2Var = photoViewer15.p5;
                                e2Var.M = false;
                                e2Var.F = null;
                                ImageReceiver imageReceiver = photoViewer15.C4;
                                if (isEmpty || (bitmap = e2Var.L) == null) {
                                    bitmap = e2Var.J;
                                }
                                imageReceiver.v0(bitmap);
                                photoViewer15.t5.setCutOutState(true);
                                photoViewer15.V2(false, true);
                                photoViewer15.f0();
                                break;
                            } else {
                                iq0Var2.setCutOutState(true);
                                photoViewer15.V2(false, true);
                                photoViewer15.p5.f();
                                photoViewer15.f0.invalidate();
                                break;
                            }
                        } else {
                            iq0Var2.setCancelState(true);
                            tg.e2 e2Var2 = photoViewer15.p5;
                            hi.lb lbVar = new hi.lb(photoViewer15, z11, xeVar, i11);
                            e2Var2.getClass();
                            e2Var2.setOnClickListener(new bd0(29, e2Var2, lbVar));
                            TextView textView = e2Var2.N;
                            textView.setText(org.telegram.messenger.gd.M0(2131745480, null));
                            textView.animate().cancel();
                            textView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(240L).setInterpolator(org.telegram.ui.Components.lr.h).start();
                            ValueAnimator valueAnimator = e2Var2.O;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            e2Var2.R = e2Var2.S;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            e2Var2.O = ofFloat;
                            ofFloat.addUpdateListener(new tg.x1(e2Var2, 0));
                            e2Var2.O.setRepeatCount(-1);
                            e2Var2.O.setRepeatMode(1);
                            e2Var2.O.setDuration(2400L);
                            e2Var2.O.setInterpolator(new LinearInterpolator());
                            e2Var2.O.start();
                            photoViewer15.f0.invalidate();
                            break;
                        }
                    }
                }
                break;
            case 15:
                PhotoViewer photoViewer16 = this.b;
                photoViewer16.v5.m(true, true);
                photoViewer16.w5.m(false, true);
                tg.e2 e2Var3 = photoViewer16.p5;
                if (e2Var3 != null) {
                    e2Var3.setOutlineVisible(false);
                }
                photoViewer16.N1 = true;
                up0 up0Var = photoViewer16.O1;
                if (up0Var != null) {
                    up0Var.setEraser(true);
                }
                photoViewer16.c3(4);
                break;
            case 16:
                PhotoViewer photoViewer17 = this.b;
                photoViewer17.v5.m(false, true);
                photoViewer17.w5.m(true, true);
                tg.e2 e2Var4 = photoViewer17.p5;
                if (e2Var4 != null) {
                    e2Var4.setOutlineVisible(false);
                }
                photoViewer17.N1 = false;
                up0 up0Var2 = photoViewer17.O1;
                if (up0Var2 != null) {
                    up0Var2.setEraser(false);
                }
                photoViewer17.c3(4);
                break;
            case 17:
                PhotoViewer photoViewer18 = this.b;
                up0 up0Var3 = photoViewer18.O1;
                if (up0Var3 != null) {
                    sg.k1 k1Var = up0Var3.b;
                    if (k1Var.a()) {
                        k1Var.c();
                        break;
                    }
                }
                photoViewer18.c3(0);
                photoViewer18.p5.l();
                boolean isEmpty2 = TextUtils.isEmpty(((org.telegram.messenger.xe) photoViewer18.g7.get(photoViewer18.P4)).i);
                tg.e2 e2Var5 = photoViewer18.p5;
                if (e2Var5 != null && !e2Var5.H) {
                    e2Var5.M = false;
                    e2Var5.F = null;
                }
                ImageReceiver imageReceiver2 = photoViewer18.C4;
                if (isEmpty2 || (bitmap2 = e2Var5.L) == null) {
                    bitmap2 = e2Var5.J;
                }
                imageReceiver2.v0(bitmap2);
                tg.e2 e2Var6 = photoViewer18.p5;
                if (e2Var6 == null || !e2Var6.H) {
                    photoViewer18.t5.setCutOutState(true);
                }
                photoViewer18.Y2(true, true);
                break;
            case 18:
                PhotoViewer photoViewer19 = this.b;
                if (photoViewer19.p5 != null) {
                    photoViewer19.y5.m(!r2.u0, true);
                    photoViewer19.p5.setOutlineVisible((!photoViewer19.y5.u0 || photoViewer19.v5.u0 || photoViewer19.w5.u0) ? false : true);
                    break;
                }
                break;
            case 19:
                PhotoViewer photoViewer20 = this.b;
                bn bnVar = photoViewer20.l4;
                if (bnVar != null && (fjVar = bnVar.H5) != null && fjVar.p5() && !org.telegram.messenger.v3.z(photoViewer20.U, 24, org.telegram.messenger.fj.B0(photoViewer20.l4.H5.k))) {
                    if (photoViewer20.m4 == null || (b10 = photoViewer20.l4.y5) == null) {
                        b10 = org.telegram.messenger.kj.b(photoViewer20.l4.H5.k.suggested_post);
                    }
                    if (!di.x8.S(photoViewer20.U, b10.a)) {
                        bn bnVar2 = photoViewer20.l4;
                        if (bnVar2 != null) {
                            bnVar2.Ac(b10);
                            break;
                        }
                    }
                }
                if (!photoViewer20.V1.o()) {
                    bn bnVar3 = photoViewer20.l4;
                    if (bnVar3 == null || !bnVar3.c() || ((n2Var = photoViewer20.l4.Y1) != null && n2Var.F3 != null)) {
                        photoViewer20.u2(true, 0, 0, false, false, false);
                        break;
                    } else {
                        photoViewer20.X2();
                        break;
                    }
                } else {
                    org.telegram.ui.Components.n6 n6Var = photoViewer20.V1.w;
                    float f10 = -photoViewer20.X1;
                    photoViewer20.X1 = f10;
                    org.telegram.messenger.g0.E3(f10, n6Var, null);
                    org.telegram.messenger.q2.E.a();
                    if (!org.telegram.messenger.mp.u1(photoViewer20.U).K3() && org.telegram.messenger.mp.u1(photoViewer20.U).X4 > photoViewer20.V1.getCodePointCount()) {
                        photoViewer20.R2(photoViewer20.f0);
                        break;
                    }
                }
                break;
            case 20:
                this.b.a.a(false, true);
                break;
            case 21:
                PhotoViewer photoViewer21 = this.b;
                if (photoViewer21.E != null && (uq0Var = photoViewer21.d) != null) {
                    uq0Var.W();
                    photoViewer21.z0(true, false);
                    break;
                }
                break;
            case 22:
                PhotoViewer photoViewer22 = this.b;
                Drawable[] drawableArr7 = PhotoViewer.Z8;
                photoViewer22.m0();
                if (!photoViewer22.F1()) {
                    if (photoViewer22.s1) {
                        if (photoViewer22.k8) {
                            TextureView textureView = photoViewer22.C2;
                            if (textureView instanceof org.telegram.ui.Components.v51) {
                                org.telegram.ui.Components.v51 v51Var = (org.telegram.ui.Components.v51) textureView;
                                if (v51Var.getVideoWidth() <= 0 || v51Var.getVideoHeight() <= 0) {
                                }
                            }
                        }
                    }
                    photoViewer22.c3(1);
                    break;
                }
                break;
            case 23:
                PhotoViewer photoViewer23 = this.b;
                Drawable[] drawableArr8 = PhotoViewer.Z8;
                photoViewer23.I0(-90.0f, false, null);
                break;
            case 24:
                PhotoViewer photoViewer24 = this.b;
                Drawable[] drawableArr9 = PhotoViewer.Z8;
                photoViewer24.H0();
                break;
            case 25:
                PhotoViewer photoViewer25 = this.b;
                Drawable[] drawableArr10 = PhotoViewer.Z8;
                photoViewer25.m0();
                if (!photoViewer25.F1()) {
                    if (photoViewer25.s1) {
                        if (photoViewer25.k8) {
                            TextureView textureView2 = photoViewer25.C2;
                            if (textureView2 instanceof org.telegram.ui.Components.v51) {
                                org.telegram.ui.Components.v51 v51Var2 = (org.telegram.ui.Components.v51) textureView2;
                                if (v51Var2.getVideoWidth() <= 0 || v51Var2.getVideoHeight() <= 0) {
                                }
                            }
                        }
                    }
                    photoViewer25.c3(3);
                    break;
                }
                break;
            case 26:
                PhotoViewer photoViewer26 = this.b;
                Drawable[] drawableArr11 = PhotoViewer.Z8;
                if (view.getAlpha() >= 0.9f) {
                    photoViewer26.m0();
                    if (!photoViewer26.F1()) {
                        if (photoViewer26.s1) {
                            if (photoViewer26.k8) {
                                TextureView textureView3 = photoViewer26.C2;
                                if (textureView3 instanceof org.telegram.ui.Components.v51) {
                                    org.telegram.ui.Components.v51 v51Var3 = (org.telegram.ui.Components.v51) textureView3;
                                    if (v51Var3.getVideoWidth() <= 0 || v51Var3.getVideoHeight() <= 0) {
                                    }
                                }
                            }
                        }
                        photoViewer26.c3(2);
                        break;
                    }
                }
                break;
            case 27:
                PhotoViewer photoViewer27 = this.b;
                if (photoViewer27.p6 == null) {
                    zn0 zn0Var = new zn0(photoViewer27, 2);
                    if (!photoViewer27.J2) {
                        float stateOrientation = photoViewer27.R2 - photoViewer27.D1.b.getStateOrientation();
                        if (Math.abs(stateOrientation) > 180.0f) {
                            stateOrientation = stateOrientation < 0.0f ? stateOrientation + 360.0f : -(360.0f - stateOrientation);
                        }
                        photoViewer27.I0(stateOrientation, photoViewer27.D1.b.getStateMirror(), zn0Var);
                        break;
                    } else {
                        zn0Var.run();
                        break;
                    }
                }
                break;
            case 28:
                PhotoViewer photoViewer28 = this.b;
                if (photoViewer28.u4 == 1) {
                    og.o oVar = photoViewer28.D1.b;
                    og.c cVar = oVar.H;
                    if (cVar.a.isInProgress() || cVar.h || oVar.a.f0) {
                    }
                }
                photoViewer28.f0();
                photoViewer28.c3(0);
                break;
            default:
                PhotoViewer photoViewer29 = this.b;
                float f11 = -photoViewer29.D1.b.getStateOrientation();
                if (Math.abs(f11) > 180.0f) {
                    f11 = f11 < 0.0f ? f11 + 360.0f : -(360.0f - f11);
                }
                photoViewer29.I0(f11, photoViewer29.D1.b.getStateMirror(), new hn0(photoViewer29, 8));
                break;
        }
    }
}
