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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class en0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ en0(PhotoViewer photoViewer, int i7) {
        this.a = i7;
        this.b = photoViewer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7;
        org.telegram.ui.Components.u51 u51Var;
        int i10;
        Bitmap bitmap;
        Bitmap bitmap2;
        fi.p2 p2Var;
        org.telegram.messenger.gj gjVar;
        org.telegram.messenger.lj b10;
        sq0 sq0Var;
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
                        alertDialog$Builder.a.U = org.telegram.messenger.hd.M0(2131751405, "DiscardChanges");
                        alertDialog$Builder.a.S = org.telegram.messenger.hd.M0(R.string.AppName, "AppName");
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, "OK"), new nn0(photoViewer2));
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
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
                if (obj instanceof org.telegram.messenger.ye) {
                    ((org.telegram.messenger.ye) obj).s = photoViewer4.j1();
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
                if (!photoViewer10.q5.b.R && (i7 = photoViewer10.P4) >= 0 && i7 < photoViewer10.g7.size() && (photoViewer10.g7.get(photoViewer10.P4) instanceof org.telegram.messenger.ff)) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) photoViewer10.g7.get(photoViewer10.P4);
                    long time = photoViewer10.q5.getTime();
                    String v12 = PhotoViewer.v1();
                    photoViewer10.q5.b.setLoading(true);
                    Utilities.e.c(new di.f2(photoViewer10, v12, ffVar, time, 23));
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
                            ((hi.l3) obj2).f(true);
                        }
                    }
                    if (photoViewer11.r) {
                        final hi.l3 l3Var = new hi.l3(photoViewer11.E, 3);
                        l3Var.r(true);
                        l3Var.u(org.telegram.messenger.hd.M0(2131751209, null));
                        l3Var.h = hi.l3.a(l3Var.getText(), l3Var.getTextPaint());
                        l3Var.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
                        l3Var.o(0.0f, 22.0f);
                        l3Var.r0 = new Runnable() { // from class: org.telegram.ui.kn0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        ArrayList arrayList2 = photoViewer11.i1;
                                        if (arrayList2 != null) {
                                            arrayList2.remove(l3Var);
                                            break;
                                        }
                                        break;
                                    default:
                                        PhotoViewer photoViewer12 = photoViewer11;
                                        ArrayList arrayList3 = photoViewer12.i1;
                                        hi.l3 l3Var2 = l3Var;
                                        if (arrayList3 != null) {
                                            arrayList3.remove(l3Var2);
                                        }
                                        ArrayList arrayList4 = photoViewer12.j1;
                                        if (arrayList4 != null) {
                                            arrayList4.remove(l3Var2);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        if (photoViewer11.i1 == null) {
                            photoViewer11.i1 = new ArrayList();
                        }
                        photoViewer11.f0.addView(l3Var, c8.ja.e(-1, org.telegram.messenger.ns.e3, 83));
                        photoViewer11.i1.add(l3Var);
                        l3Var.w();
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
                    if (obj3 instanceof org.telegram.messenger.ye) {
                        ((org.telegram.messenger.ye) obj3).s = photoViewer11.j1();
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
                    if (obj4 instanceof org.telegram.messenger.ff) {
                        ((org.telegram.messenger.ff) obj4).O = Boolean.valueOf(z10);
                        SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                        org.telegram.messenger.gz.i1 = O1;
                        edit.putBoolean("photoLiveDefault", O1).apply();
                        sq0 sq0Var2 = photoViewer12.d;
                        if (sq0Var2 != null) {
                            sq0Var2.m();
                        }
                    }
                }
                photoViewer12.g1.a(!photoViewer12.O1(), true);
                photoViewer12.S7.animate().alpha(photoViewer12.O1() ? 0.45f : 1.0f).start();
                if (photoViewer12.O1() && (u51Var = photoViewer12.G2) != null) {
                    u51Var.g0();
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
                    ((hi.l3) obj5).f(true);
                }
                final hi.l3 l3Var2 = new hi.l3(photoViewer12.E, 3);
                l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(photoViewer12.O1() ? 2131748836 : 2131748835, null)));
                l3Var2.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
                l3Var2.o(0.0f, 28.0f);
                final char c11 = c10 == true ? 1 : 0;
                l3Var2.r0 = new Runnable() { // from class: org.telegram.ui.kn0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (c11) {
                            case 0:
                                ArrayList arrayList22 = photoViewer12.i1;
                                if (arrayList22 != null) {
                                    arrayList22.remove(l3Var2);
                                    break;
                                }
                                break;
                            default:
                                PhotoViewer photoViewer122 = photoViewer12;
                                ArrayList arrayList3 = photoViewer122.i1;
                                hi.l3 l3Var22 = l3Var2;
                                if (arrayList3 != null) {
                                    arrayList3.remove(l3Var22);
                                }
                                ArrayList arrayList4 = photoViewer122.j1;
                                if (arrayList4 != null) {
                                    arrayList4.remove(l3Var22);
                                    break;
                                }
                                break;
                        }
                    }
                };
                photoViewer12.f0.addView(l3Var2, c8.ja.e(-1, org.telegram.messenger.ns.e3, 83));
                photoViewer12.i1.add(l3Var2);
                photoViewer12.j1.add(l3Var2);
                l3Var2.w();
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
                    gq0 gq0Var = photoViewer15.t5;
                    if (!gq0Var.R && gq0Var.n0 != 1 && (i10 = photoViewer15.P4) >= 0 && i10 < arrayList3.size() && !photoViewer15.p5.W) {
                        org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) arrayList3.get(photoViewer15.P4);
                        boolean isEmpty = TextUtils.isEmpty(yeVar.i);
                        boolean z11 = !isEmpty;
                        gq0 gq0Var2 = photoViewer15.t5;
                        int i16 = gq0Var2.n0;
                        if (i16 != 0) {
                            if (i16 != 2) {
                                photoViewer15.p5.l();
                                photoViewer15.p5.getThanosEffect();
                                tg.f2 f2Var = photoViewer15.p5;
                                f2Var.M = false;
                                f2Var.F = null;
                                ImageReceiver imageReceiver = photoViewer15.C4;
                                if (isEmpty || (bitmap = f2Var.L) == null) {
                                    bitmap = f2Var.J;
                                }
                                imageReceiver.v0(bitmap);
                                photoViewer15.t5.setCutOutState(true);
                                photoViewer15.V2(false, true);
                                photoViewer15.f0();
                                break;
                            } else {
                                gq0Var2.setCutOutState(true);
                                photoViewer15.V2(false, true);
                                photoViewer15.p5.f();
                                photoViewer15.f0.invalidate();
                                break;
                            }
                        } else {
                            gq0Var2.setCancelState(true);
                            tg.f2 f2Var2 = photoViewer15.p5;
                            hi.kb kbVar = new hi.kb(photoViewer15, z11, yeVar, i11);
                            f2Var2.getClass();
                            f2Var2.setOnClickListener(new sc1(4, f2Var2, kbVar));
                            TextView textView = f2Var2.N;
                            textView.setText(org.telegram.messenger.hd.M0(2131745675, null));
                            textView.animate().cancel();
                            textView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(240L).setInterpolator(org.telegram.ui.Components.er.h).start();
                            ValueAnimator valueAnimator = f2Var2.O;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            f2Var2.R = f2Var2.S;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            f2Var2.O = ofFloat;
                            ofFloat.addUpdateListener(new tg.y1(f2Var2, 0));
                            f2Var2.O.setRepeatCount(-1);
                            f2Var2.O.setRepeatMode(1);
                            f2Var2.O.setDuration(2400L);
                            f2Var2.O.setInterpolator(new LinearInterpolator());
                            f2Var2.O.start();
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
                tg.f2 f2Var3 = photoViewer16.p5;
                if (f2Var3 != null) {
                    f2Var3.setOutlineVisible(false);
                }
                photoViewer16.N1 = true;
                sp0 sp0Var = photoViewer16.O1;
                if (sp0Var != null) {
                    sp0Var.setEraser(true);
                }
                photoViewer16.c3(4);
                break;
            case 16:
                PhotoViewer photoViewer17 = this.b;
                photoViewer17.v5.m(false, true);
                photoViewer17.w5.m(true, true);
                tg.f2 f2Var4 = photoViewer17.p5;
                if (f2Var4 != null) {
                    f2Var4.setOutlineVisible(false);
                }
                photoViewer17.N1 = false;
                sp0 sp0Var2 = photoViewer17.O1;
                if (sp0Var2 != null) {
                    sp0Var2.setEraser(false);
                }
                photoViewer17.c3(4);
                break;
            case 17:
                PhotoViewer photoViewer18 = this.b;
                sp0 sp0Var3 = photoViewer18.O1;
                if (sp0Var3 != null) {
                    sg.k1 k1Var = sp0Var3.b;
                    if (k1Var.a()) {
                        k1Var.c();
                        break;
                    }
                }
                photoViewer18.c3(0);
                photoViewer18.p5.l();
                boolean isEmpty2 = TextUtils.isEmpty(((org.telegram.messenger.ye) photoViewer18.g7.get(photoViewer18.P4)).i);
                tg.f2 f2Var5 = photoViewer18.p5;
                if (f2Var5 != null && !f2Var5.H) {
                    f2Var5.M = false;
                    f2Var5.F = null;
                }
                ImageReceiver imageReceiver2 = photoViewer18.C4;
                if (isEmpty2 || (bitmap2 = f2Var5.L) == null) {
                    bitmap2 = f2Var5.J;
                }
                imageReceiver2.v0(bitmap2);
                tg.f2 f2Var6 = photoViewer18.p5;
                if (f2Var6 == null || !f2Var6.H) {
                    photoViewer18.t5.setCutOutState(true);
                }
                photoViewer18.Y2(true, true);
                break;
            case 18:
                PhotoViewer photoViewer19 = this.b;
                if (photoViewer19.p5 != null) {
                    photoViewer19.y5.m(!r2.t0, true);
                    photoViewer19.p5.setOutlineVisible((!photoViewer19.y5.t0 || photoViewer19.v5.t0 || photoViewer19.w5.t0) ? false : true);
                    break;
                }
                break;
            case 19:
                PhotoViewer photoViewer20 = this.b;
                an anVar = photoViewer20.l4;
                if (anVar != null && (gjVar = anVar.G5) != null && gjVar.p5() && !org.telegram.messenger.t3.z(photoViewer20.U, 24, org.telegram.messenger.gj.B0(photoViewer20.l4.G5.k))) {
                    if (photoViewer20.m4 == null || (b10 = photoViewer20.l4.x5) == null) {
                        b10 = org.telegram.messenger.lj.b(photoViewer20.l4.G5.k.suggested_post);
                    }
                    if (!di.v8.T(photoViewer20.U, b10.a)) {
                        an anVar2 = photoViewer20.l4;
                        if (anVar2 != null) {
                            anVar2.Ac(b10);
                            break;
                        }
                    }
                }
                if (!photoViewer20.V1.o()) {
                    an anVar3 = photoViewer20.l4;
                    if (anVar3 == null || !anVar3.c() || ((p2Var = photoViewer20.l4.Y1) != null && p2Var.F3 != null)) {
                        photoViewer20.u2(true, 0, 0, false, false, false);
                        break;
                    } else {
                        photoViewer20.X2();
                        break;
                    }
                } else {
                    org.telegram.ui.Components.h6 h6Var = photoViewer20.V1.w;
                    float f10 = -photoViewer20.X1;
                    photoViewer20.X1 = f10;
                    org.telegram.messenger.g0.F3(f10, h6Var, null);
                    org.telegram.messenger.p2.E.a();
                    if (!org.telegram.messenger.np.s1(photoViewer20.U).D3() && org.telegram.messenger.np.s1(photoViewer20.U).V4 > photoViewer20.V1.getCodePointCount()) {
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
                if (photoViewer21.E != null && (sq0Var = photoViewer21.d) != null) {
                    sq0Var.W();
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
                            if (textureView instanceof org.telegram.ui.Components.k51) {
                                org.telegram.ui.Components.k51 k51Var = (org.telegram.ui.Components.k51) textureView;
                                if (k51Var.getVideoWidth() <= 0 || k51Var.getVideoHeight() <= 0) {
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
                            if (textureView2 instanceof org.telegram.ui.Components.k51) {
                                org.telegram.ui.Components.k51 k51Var2 = (org.telegram.ui.Components.k51) textureView2;
                                if (k51Var2.getVideoWidth() <= 0 || k51Var2.getVideoHeight() <= 0) {
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
                                if (textureView3 instanceof org.telegram.ui.Components.k51) {
                                    org.telegram.ui.Components.k51 k51Var3 = (org.telegram.ui.Components.k51) textureView3;
                                    if (k51Var3.getVideoWidth() <= 0 || k51Var3.getVideoHeight() <= 0) {
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
                    wn0 wn0Var = new wn0(photoViewer27, 2);
                    if (!photoViewer27.J2) {
                        float stateOrientation = photoViewer27.R2 - photoViewer27.D1.b.getStateOrientation();
                        if (Math.abs(stateOrientation) > 180.0f) {
                            stateOrientation = stateOrientation < 0.0f ? stateOrientation + 360.0f : -(360.0f - stateOrientation);
                        }
                        photoViewer27.I0(stateOrientation, photoViewer27.D1.b.getStateMirror(), wn0Var);
                        break;
                    } else {
                        wn0Var.run();
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
                photoViewer29.I0(f11, photoViewer29.D1.b.getStateMirror(), new dn0(photoViewer29, 8));
                break;
        }
    }
}
