package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.CheckBox;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        org.telegram.ui.Components.h61 h61Var;
        int i10;
        Bitmap bitmap;
        Bitmap bitmap2;
        fi.n2 n2Var;
        org.telegram.messenger.fj fjVar;
        org.telegram.messenger.kj b10;
        uq0 uq0Var;
        int i11 = 4;
        int i12 = 3;
        char c10 = 1;
        final int i13 = 0;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                Activity activity = photoViewer.E;
                if (activity != null) {
                    photoViewer.Z3 = false;
                    photoViewer.Y3 = 1;
                    if (photoViewer.X3 == -10) {
                        photoViewer.X3 = activity.getRequestedOrientation();
                    }
                    if (((WindowManager) photoViewer.E.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                        photoViewer.E.setRequestedOrientation(8);
                    } else {
                        photoViewer.E.setRequestedOrientation(0);
                    }
                    photoViewer.i3(false, false);
                    break;
                }
                break;
            case 1:
                PhotoViewer photoViewer2 = this.b;
                Drawable[] drawableArr = PhotoViewer.f9;
                photoViewer2.f0();
                photoViewer2.d3(0);
                break;
            case 2:
                PhotoViewer photoViewer3 = this.b;
                if (!photoViewer3.J1.a()) {
                    photoViewer3.d3(0);
                    break;
                } else {
                    Activity activity2 = photoViewer3.E;
                    if (activity2 != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity2, photoViewer3.w2);
                        alertDialog$Builder.a.U = org.telegram.messenger.gd.N0(2131751393, "DiscardChanges");
                        alertDialog$Builder.a.S = org.telegram.messenger.gd.N0(R.string.AppName, "AppName");
                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, "OK"), new qn0(photoViewer3));
                        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, "Cancel"), null);
                        photoViewer3.R2(alertDialog$Builder);
                        break;
                    }
                }
                break;
            case 3:
                PhotoViewer photoViewer4 = this.b;
                photoViewer4.e8 = photoViewer4.g8;
                photoViewer4.L0();
                photoViewer4.X2(false);
                photoViewer4.o2(2);
                break;
            case 4:
                PhotoViewer photoViewer5 = this.b;
                Object obj = photoViewer5.g7.get(photoViewer5.P4);
                if (obj instanceof org.telegram.messenger.xe) {
                    ((org.telegram.messenger.xe) obj).s = photoViewer5.j1();
                }
                photoViewer5.X2(false);
                photoViewer5.o2(2);
                break;
            case 5:
                PhotoViewer photoViewer6 = this.b;
                photoViewer6.v5.m(false, true);
                photoViewer6.w5.m(false, true);
                photoViewer6.d3(0);
                break;
            case 6:
                PhotoViewer photoViewer7 = this.b;
                photoViewer7.v5.m(false, true);
                photoViewer7.w5.m(false, true);
                photoViewer7.f0();
                photoViewer7.d3(0);
                break;
            case 7:
                PhotoViewer photoViewer8 = this.b;
                Drawable[] drawableArr2 = PhotoViewer.f9;
                photoViewer8.v2(false, 0, 0, false, false, false);
                break;
            case 8:
                PhotoViewer photoViewer9 = this.b;
                Drawable[] drawableArr3 = PhotoViewer.f9;
                photoViewer9.d3(5);
                break;
            case 9:
                PhotoViewer photoViewer10 = this.b;
                Drawable[] drawableArr4 = PhotoViewer.f9;
                photoViewer10.y0();
                break;
            case 10:
                PhotoViewer photoViewer11 = this.b;
                if (!photoViewer11.q5.b.R && (i7 = photoViewer11.P4) >= 0 && i7 < photoViewer11.g7.size() && (photoViewer11.g7.get(photoViewer11.P4) instanceof org.telegram.messenger.ef)) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) photoViewer11.g7.get(photoViewer11.P4);
                    long time = photoViewer11.q5.getTime();
                    String v12 = PhotoViewer.v1();
                    photoViewer11.q5.b.setLoading(true);
                    Utilities.e.c(new di.j2(photoViewer11, v12, efVar, time, 22));
                    break;
                }
                break;
            case 11:
                final PhotoViewer photoViewer12 = this.b;
                Drawable[] drawableArr5 = PhotoViewer.f9;
                if (!photoViewer12.F1()) {
                    photoViewer12.r = !photoViewer12.r;
                    ArrayList arrayList = photoViewer12.i1;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj2 = arrayList.get(i14);
                            i14++;
                            ((hi.u3) obj2).f(true);
                        }
                    }
                    if (photoViewer12.r) {
                        final hi.u3 u3Var = new hi.u3(photoViewer12.E, 3);
                        u3Var.r(true);
                        u3Var.v(org.telegram.messenger.gd.N0(2131751197, null));
                        u3Var.h = hi.u3.a(u3Var.getText(), u3Var.getTextPaint());
                        u3Var.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
                        u3Var.o(0.0f, 22.0f);
                        u3Var.r0 = new Runnable() { // from class: org.telegram.ui.jn0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        ArrayList arrayList2 = photoViewer12.i1;
                                        if (arrayList2 != null) {
                                            arrayList2.remove(u3Var);
                                            break;
                                        }
                                        break;
                                    default:
                                        PhotoViewer photoViewer13 = photoViewer12;
                                        ArrayList arrayList3 = photoViewer13.i1;
                                        hi.u3 u3Var2 = u3Var;
                                        if (arrayList3 != null) {
                                            arrayList3.remove(u3Var2);
                                        }
                                        ArrayList arrayList4 = photoViewer13.j1;
                                        if (arrayList4 != null) {
                                            arrayList4.remove(u3Var2);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        if (photoViewer12.i1 == null) {
                            photoViewer12.i1 = new ArrayList();
                        }
                        photoViewer12.f0.addView(u3Var, c8.na.e(-1, org.telegram.messenger.ks.e3, 83));
                        photoViewer12.i1.add(u3Var);
                        u3Var.x();
                    }
                    photoViewer12.w3();
                    photoViewer12.C3();
                    if (photoViewer12.r) {
                        CheckBox checkBox = photoViewer12.O0;
                        if (!checkBox.y) {
                            checkBox.callOnClick();
                            break;
                        }
                    }
                    Object obj3 = photoViewer12.g7.get(photoViewer12.P4);
                    if (obj3 instanceof org.telegram.messenger.xe) {
                        ((org.telegram.messenger.xe) obj3).s = photoViewer12.j1();
                        break;
                    }
                }
                break;
            case 12:
                final PhotoViewer photoViewer13 = this.b;
                Drawable[] drawableArr6 = PhotoViewer.f9;
                boolean P1 = photoViewer13.P1();
                boolean z10 = !P1;
                int i15 = photoViewer13.P4;
                if (i15 >= 0 && i15 < photoViewer13.g7.size()) {
                    Object obj4 = photoViewer13.g7.get(photoViewer13.P4);
                    if (obj4 instanceof org.telegram.messenger.ef) {
                        ((org.telegram.messenger.ef) obj4).O = Boolean.valueOf(z10);
                        SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                        org.telegram.messenger.bz.i1 = P1;
                        edit.putBoolean("photoLiveDefault", P1).apply();
                        uq0 uq0Var2 = photoViewer13.d;
                        if (uq0Var2 != null) {
                            uq0Var2.m();
                        }
                    }
                }
                photoViewer13.g1.a(!photoViewer13.P1(), true);
                photoViewer13.Y7.animate().alpha(photoViewer13.P1() ? 0.45f : 1.0f).start();
                if (photoViewer13.P1() && (h61Var = photoViewer13.G2) != null) {
                    h61Var.g0();
                }
                photoViewer13.f0.invalidate();
                if (photoViewer13.i1 == null) {
                    photoViewer13.i1 = new ArrayList();
                }
                if (photoViewer13.j1 == null) {
                    photoViewer13.j1 = new ArrayList();
                }
                ArrayList arrayList2 = photoViewer13.i1;
                int size2 = arrayList2.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj5 = arrayList2.get(i16);
                    i16++;
                    ((hi.u3) obj5).f(true);
                }
                final hi.u3 u3Var2 = new hi.u3(photoViewer13.E, 3);
                u3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(photoViewer13.P1() ? 2131748643 : 2131748642, null)));
                u3Var2.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
                u3Var2.o(0.0f, 28.0f);
                final char c11 = c10 == true ? 1 : 0;
                u3Var2.r0 = new Runnable() { // from class: org.telegram.ui.jn0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (c11) {
                            case 0:
                                ArrayList arrayList22 = photoViewer13.i1;
                                if (arrayList22 != null) {
                                    arrayList22.remove(u3Var2);
                                    break;
                                }
                                break;
                            default:
                                PhotoViewer photoViewer132 = photoViewer13;
                                ArrayList arrayList3 = photoViewer132.i1;
                                hi.u3 u3Var22 = u3Var2;
                                if (arrayList3 != null) {
                                    arrayList3.remove(u3Var22);
                                }
                                ArrayList arrayList4 = photoViewer132.j1;
                                if (arrayList4 != null) {
                                    arrayList4.remove(u3Var22);
                                    break;
                                }
                                break;
                        }
                    }
                };
                photoViewer13.f0.addView(u3Var2, c8.na.e(-1, org.telegram.messenger.ks.e3, 83));
                photoViewer13.i1.add(u3Var2);
                photoViewer13.j1.add(u3Var2);
                u3Var2.x();
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
                if (photoViewer15.d != null && !photoViewer15.F1()) {
                    photoViewer15.d.n();
                    photoViewer15.z0(true, false);
                    break;
                }
                break;
            case 15:
                PhotoViewer photoViewer16 = this.b;
                ArrayList arrayList3 = photoViewer16.g7;
                if (!photoViewer16.B7) {
                    iq0 iq0Var = photoViewer16.t5;
                    if (!iq0Var.R && iq0Var.o0 != 1 && (i10 = photoViewer16.P4) >= 0 && i10 < arrayList3.size() && !photoViewer16.p5.W) {
                        org.telegram.messenger.xe xeVar = (org.telegram.messenger.xe) arrayList3.get(photoViewer16.P4);
                        boolean isEmpty = TextUtils.isEmpty(xeVar.i);
                        boolean z11 = !isEmpty;
                        iq0 iq0Var2 = photoViewer16.t5;
                        int i17 = iq0Var2.o0;
                        if (i17 != 0) {
                            if (i17 != 2) {
                                photoViewer16.p5.l();
                                photoViewer16.p5.getThanosEffect();
                                tg.i2 i2Var = photoViewer16.p5;
                                i2Var.M = false;
                                i2Var.F = null;
                                ImageReceiver imageReceiver = photoViewer16.C4;
                                if (isEmpty || (bitmap = i2Var.L) == null) {
                                    bitmap = i2Var.J;
                                }
                                imageReceiver.w0(bitmap);
                                photoViewer16.t5.setCutOutState(true);
                                photoViewer16.W2(false, true);
                                photoViewer16.f0();
                                break;
                            } else {
                                iq0Var2.setCutOutState(true);
                                photoViewer16.W2(false, true);
                                photoViewer16.p5.f();
                                photoViewer16.f0.invalidate();
                                break;
                            }
                        } else {
                            iq0Var2.setCancelState(true);
                            tg.i2 i2Var2 = photoViewer16.p5;
                            hi.fc fcVar = new hi.fc(photoViewer16, z11, xeVar, i12);
                            i2Var2.getClass();
                            i2Var2.setOnClickListener(new ig0(27, i2Var2, fcVar));
                            TextView textView = i2Var2.N;
                            textView.setText(org.telegram.messenger.gd.N0(2131745479, null));
                            textView.animate().cancel();
                            textView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(240L).setInterpolator(org.telegram.ui.Components.kr.h).start();
                            ValueAnimator valueAnimator = i2Var2.O;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            i2Var2.R = i2Var2.S;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            i2Var2.O = ofFloat;
                            ofFloat.addUpdateListener(new tg.c2(i2Var2, 0));
                            i2Var2.O.setRepeatCount(-1);
                            i2Var2.O.setRepeatMode(1);
                            i2Var2.O.setDuration(2400L);
                            i2Var2.O.setInterpolator(new LinearInterpolator());
                            i2Var2.O.start();
                            photoViewer16.f0.invalidate();
                            break;
                        }
                    }
                }
                break;
            case 16:
                PhotoViewer photoViewer17 = this.b;
                photoViewer17.v5.m(true, true);
                photoViewer17.w5.m(false, true);
                tg.i2 i2Var3 = photoViewer17.p5;
                if (i2Var3 != null) {
                    i2Var3.setOutlineVisible(false);
                }
                photoViewer17.N1 = true;
                up0 up0Var = photoViewer17.O1;
                if (up0Var != null) {
                    up0Var.setEraser(true);
                }
                photoViewer17.d3(4);
                break;
            case 17:
                PhotoViewer photoViewer18 = this.b;
                photoViewer18.v5.m(false, true);
                photoViewer18.w5.m(true, true);
                tg.i2 i2Var4 = photoViewer18.p5;
                if (i2Var4 != null) {
                    i2Var4.setOutlineVisible(false);
                }
                photoViewer18.N1 = false;
                up0 up0Var2 = photoViewer18.O1;
                if (up0Var2 != null) {
                    up0Var2.setEraser(false);
                }
                photoViewer18.d3(4);
                break;
            case 18:
                PhotoViewer photoViewer19 = this.b;
                up0 up0Var3 = photoViewer19.O1;
                if (up0Var3 != null) {
                    sg.j1 j1Var = up0Var3.b;
                    if (j1Var.a()) {
                        j1Var.c();
                        break;
                    }
                }
                photoViewer19.d3(0);
                photoViewer19.p5.l();
                boolean isEmpty2 = TextUtils.isEmpty(((org.telegram.messenger.xe) photoViewer19.g7.get(photoViewer19.P4)).i);
                tg.i2 i2Var5 = photoViewer19.p5;
                if (i2Var5 != null && !i2Var5.H) {
                    i2Var5.M = false;
                    i2Var5.F = null;
                }
                ImageReceiver imageReceiver2 = photoViewer19.C4;
                if (isEmpty2 || (bitmap2 = i2Var5.L) == null) {
                    bitmap2 = i2Var5.J;
                }
                imageReceiver2.w0(bitmap2);
                tg.i2 i2Var6 = photoViewer19.p5;
                if (i2Var6 == null || !i2Var6.H) {
                    photoViewer19.t5.setCutOutState(true);
                }
                photoViewer19.Z2(true, true);
                break;
            case 19:
                PhotoViewer photoViewer20 = this.b;
                if (photoViewer20.p5 != null) {
                    photoViewer20.y5.m(!r0.u0, true);
                    photoViewer20.p5.setOutlineVisible((!photoViewer20.y5.u0 || photoViewer20.v5.u0 || photoViewer20.w5.u0) ? false : true);
                    break;
                }
                break;
            case 20:
                PhotoViewer photoViewer21 = this.b;
                bn bnVar = photoViewer21.l4;
                if (bnVar != null && (fjVar = bnVar.H5) != null && fjVar.p5() && !org.telegram.messenger.v3.z(photoViewer21.U, 24, org.telegram.messenger.fj.B0(photoViewer21.l4.H5.k))) {
                    if (photoViewer21.m4 == null || (b10 = photoViewer21.l4.y5) == null) {
                        b10 = org.telegram.messenger.kj.b(photoViewer21.l4.H5.k.suggested_post);
                    }
                    if (!di.y8.S(photoViewer21.U, b10.a)) {
                        bn bnVar2 = photoViewer21.l4;
                        if (bnVar2 != null) {
                            bnVar2.Ac(b10);
                            break;
                        }
                    }
                }
                if (!photoViewer21.V1.o()) {
                    bn bnVar3 = photoViewer21.l4;
                    if (bnVar3 == null || !bnVar3.c() || ((n2Var = photoViewer21.l4.Y1) != null && n2Var.F3 != null)) {
                        photoViewer21.v2(true, 0, 0, false, false, false);
                        break;
                    } else {
                        photoViewer21.Y2();
                        break;
                    }
                } else {
                    org.telegram.ui.Components.n6 n6Var = photoViewer21.V1.w;
                    float f10 = -photoViewer21.X1;
                    photoViewer21.X1 = f10;
                    org.telegram.messenger.g0.E3(f10, n6Var, null);
                    org.telegram.messenger.q2.E.a();
                    if (!org.telegram.messenger.mp.u1(photoViewer21.U).K3() && org.telegram.messenger.mp.u1(photoViewer21.U).X4 > photoViewer21.V1.getCodePointCount()) {
                        photoViewer21.S2(photoViewer21.f0);
                        break;
                    }
                }
                break;
            case 21:
                this.b.a.a(false, true);
                break;
            case 22:
                PhotoViewer photoViewer22 = this.b;
                if (photoViewer22.E != null && (uq0Var = photoViewer22.d) != null) {
                    uq0Var.W();
                    photoViewer22.z0(true, false);
                    break;
                }
                break;
            case 23:
                PhotoViewer photoViewer23 = this.b;
                Drawable[] drawableArr7 = PhotoViewer.f9;
                photoViewer23.m0();
                if (!photoViewer23.F1()) {
                    if (photoViewer23.s1) {
                        if (photoViewer23.q8) {
                            TextureView textureView = photoViewer23.C2;
                            if (textureView instanceof org.telegram.ui.Components.x51) {
                                org.telegram.ui.Components.x51 x51Var = (org.telegram.ui.Components.x51) textureView;
                                if (x51Var.getVideoWidth() <= 0 || x51Var.getVideoHeight() <= 0) {
                                }
                            }
                        }
                    }
                    photoViewer23.d3(1);
                    break;
                }
                break;
            case 24:
                PhotoViewer photoViewer24 = this.b;
                Drawable[] drawableArr8 = PhotoViewer.f9;
                photoViewer24.I0(-90.0f, false, null);
                break;
            case 25:
                PhotoViewer photoViewer25 = this.b;
                Drawable[] drawableArr9 = PhotoViewer.f9;
                photoViewer25.H0();
                break;
            case 26:
                PhotoViewer photoViewer26 = this.b;
                Drawable[] drawableArr10 = PhotoViewer.f9;
                photoViewer26.m0();
                if (!photoViewer26.F1()) {
                    if (photoViewer26.s1) {
                        if (photoViewer26.q8) {
                            TextureView textureView2 = photoViewer26.C2;
                            if (textureView2 instanceof org.telegram.ui.Components.x51) {
                                org.telegram.ui.Components.x51 x51Var2 = (org.telegram.ui.Components.x51) textureView2;
                                if (x51Var2.getVideoWidth() <= 0 || x51Var2.getVideoHeight() <= 0) {
                                }
                            }
                        }
                    }
                    photoViewer26.d3(3);
                    break;
                }
                break;
            case 27:
                PhotoViewer photoViewer27 = this.b;
                Drawable[] drawableArr11 = PhotoViewer.f9;
                if (view.getAlpha() >= 0.9f) {
                    photoViewer27.m0();
                    if (!photoViewer27.F1()) {
                        if (photoViewer27.s1) {
                            if (photoViewer27.q8) {
                                TextureView textureView3 = photoViewer27.C2;
                                if (textureView3 instanceof org.telegram.ui.Components.x51) {
                                    org.telegram.ui.Components.x51 x51Var3 = (org.telegram.ui.Components.x51) textureView3;
                                    if (x51Var3.getVideoWidth() <= 0 || x51Var3.getVideoHeight() <= 0) {
                                    }
                                }
                            }
                        }
                        photoViewer27.d3(2);
                        break;
                    }
                }
                break;
            case 28:
                PhotoViewer photoViewer28 = this.b;
                if (photoViewer28.p6 == null) {
                    kn0 kn0Var = new kn0(photoViewer28, i11);
                    if (!photoViewer28.J2) {
                        float stateOrientation = photoViewer28.R2 - photoViewer28.D1.b.getStateOrientation();
                        if (Math.abs(stateOrientation) > 180.0f) {
                            stateOrientation = stateOrientation < 0.0f ? stateOrientation + 360.0f : -(360.0f - stateOrientation);
                        }
                        photoViewer28.I0(stateOrientation, photoViewer28.D1.b.getStateMirror(), kn0Var);
                        break;
                    } else {
                        kn0Var.run();
                        break;
                    }
                }
                break;
            default:
                PhotoViewer photoViewer29 = this.b;
                if (photoViewer29.u4 == 1) {
                    og.o oVar = photoViewer29.D1.b;
                    og.c cVar = oVar.H;
                    if (cVar.a.isInProgress() || cVar.h || oVar.a.f0) {
                    }
                }
                photoViewer29.f0();
                photoViewer29.d3(0);
                break;
        }
    }
}
