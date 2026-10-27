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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.CheckBox;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ar0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ ar0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.Components.t81 t81Var;
        int i11;
        Bitmap bitmap;
        Bitmap bitmap2;
        di.a3 a3Var;
        MessageObject messageObject;
        MessageSuggestionParams of2;
        qu0 qu0Var;
        int i12 = 3;
        char c10 = 1;
        final int i13 = 0;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.n0();
                photoViewer.h3(0);
                break;
            case 1:
                PhotoViewer photoViewer2 = this.b;
                if (!photoViewer2.I1.d()) {
                    photoViewer2.h3(0);
                    break;
                } else {
                    Activity activity = photoViewer2.y;
                    if (activity != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, photoViewer2.v2);
                        alertDialog$Builder.a.T = LocaleController.getString("DiscardChanges", R.string.DiscardChanges);
                        alertDialog$Builder.a.R = LocaleController.getString("AppName", R.string.AppName);
                        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new hr0(photoViewer2));
                        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        photoViewer2.V2(alertDialog$Builder);
                        break;
                    }
                }
                break;
            case 2:
                PhotoViewer photoViewer3 = this.b;
                photoViewer3.Y7 = photoViewer3.a8;
                photoViewer3.S0();
                photoViewer3.b3(false);
                photoViewer3.s2(2);
                break;
            case 3:
                PhotoViewer photoViewer4 = this.b;
                Object obj = photoViewer4.g7.get(photoViewer4.P4);
                if (obj instanceof MediaController.MediaEditState) {
                    ((MediaController.MediaEditState) obj).editedInfo = photoViewer4.p1();
                }
                photoViewer4.b3(false);
                photoViewer4.s2(2);
                break;
            case 4:
                PhotoViewer photoViewer5 = this.b;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer5.z2(false, 0, 0, false, false, false);
                break;
            case 5:
                PhotoViewer photoViewer6 = this.b;
                photoViewer6.v5.m(false, true);
                photoViewer6.w5.m(false, true);
                photoViewer6.h3(0);
                break;
            case 6:
                PhotoViewer photoViewer7 = this.b;
                photoViewer7.v5.m(false, true);
                photoViewer7.w5.m(false, true);
                photoViewer7.n0();
                photoViewer7.h3(0);
                break;
            case 7:
                PhotoViewer photoViewer8 = this.b;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer8.h3(5);
                break;
            case 8:
                PhotoViewer photoViewer9 = this.b;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                photoViewer9.G0();
                break;
            case 9:
                PhotoViewer photoViewer10 = this.b;
                if (!photoViewer10.q5.b.Q && (i10 = photoViewer10.P4) >= 0 && i10 < photoViewer10.g7.size() && (photoViewer10.g7.get(photoViewer10.P4) instanceof MediaController.PhotoEntry)) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) photoViewer10.g7.get(photoViewer10.P4);
                    long time = photoViewer10.q5.getTime();
                    String A1 = PhotoViewer.A1();
                    photoViewer10.q5.b.setLoading(true);
                    Utilities.globalQueue.postRunnable(new bi.y2(photoViewer10, A1, photoEntry, time, 23));
                    break;
                }
                break;
            case 10:
                final PhotoViewer photoViewer11 = this.b;
                Drawable[] drawableArr5 = PhotoViewer.U8;
                if (!photoViewer11.K1()) {
                    photoViewer11.r = !photoViewer11.r;
                    ArrayList arrayList = photoViewer11.h1;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj2 = arrayList.get(i14);
                            i14++;
                            ((fi.v3) obj2).e(true);
                        }
                    }
                    if (photoViewer11.r) {
                        final fi.v3 v3Var = new fi.v3(photoViewer11.y, 3);
                        v3Var.p(true);
                        v3Var.s(LocaleController.getString(R.string.EditorMuteHint));
                        v3Var.h = fi.v3.a(v3Var.getText(), v3Var.getTextPaint());
                        v3Var.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                        v3Var.l(0.0f, 22.0f);
                        v3Var.l0 = new Runnable() { // from class: org.telegram.ui.er0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        ArrayList arrayList2 = photoViewer11.h1;
                                        if (arrayList2 != null) {
                                            arrayList2.remove(v3Var);
                                            break;
                                        }
                                        break;
                                    default:
                                        PhotoViewer photoViewer12 = photoViewer11;
                                        ArrayList arrayList3 = photoViewer12.h1;
                                        fi.v3 v3Var2 = v3Var;
                                        if (arrayList3 != null) {
                                            arrayList3.remove(v3Var2);
                                        }
                                        ArrayList arrayList4 = photoViewer12.i1;
                                        if (arrayList4 != null) {
                                            arrayList4.remove(v3Var2);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        if (photoViewer11.h1 == null) {
                            photoViewer11.h1 = new ArrayList();
                        }
                        photoViewer11.e0.addView(v3Var, org.telegram.ui.Components.kb1.i(-1, 200, 83));
                        photoViewer11.h1.add(v3Var);
                        v3Var.u();
                    }
                    photoViewer11.A3();
                    photoViewer11.E3();
                    if (photoViewer11.r) {
                        CheckBox checkBox = photoViewer11.N0;
                        if (!checkBox.x) {
                            checkBox.callOnClick();
                            break;
                        }
                    }
                    Object obj3 = photoViewer11.g7.get(photoViewer11.P4);
                    if (obj3 instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj3).editedInfo = photoViewer11.p1();
                        break;
                    }
                }
                break;
            case 11:
                final PhotoViewer photoViewer12 = this.b;
                Drawable[] drawableArr6 = PhotoViewer.U8;
                boolean T1 = photoViewer12.T1();
                boolean z10 = !T1;
                int i15 = photoViewer12.P4;
                if (i15 >= 0 && i15 < photoViewer12.g7.size()) {
                    Object obj4 = photoViewer12.g7.get(photoViewer12.P4);
                    if (obj4 instanceof MediaController.PhotoEntry) {
                        ((MediaController.PhotoEntry) obj4).discardLivePhoto = Boolean.valueOf(z10);
                        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                        SharedConfig.photoLiveDefault = T1;
                        edit.putBoolean("photoLiveDefault", T1).apply();
                        qu0 qu0Var2 = photoViewer12.d;
                        if (qu0Var2 != null) {
                            qu0Var2.m();
                        }
                    }
                }
                photoViewer12.f1.a(!photoViewer12.T1(), true);
                photoViewer12.S7.animate().alpha(photoViewer12.T1() ? 0.45f : 1.0f).start();
                if (photoViewer12.T1() && (t81Var = photoViewer12.F2) != null) {
                    t81Var.B();
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
                int i16 = 0;
                while (i16 < size2) {
                    Object obj5 = arrayList2.get(i16);
                    i16++;
                    ((fi.v3) obj5).e(true);
                }
                final fi.v3 v3Var2 = new fi.v3(photoViewer12.y, 3);
                v3Var2.s(AndroidUtilities.replaceTags(LocaleController.getString(photoViewer12.T1() ? R.string.LivePhotoOff : R.string.LivePhotoOn)));
                v3Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
                v3Var2.l(0.0f, 28.0f);
                final char c11 = c10 == true ? 1 : 0;
                v3Var2.l0 = new Runnable() { // from class: org.telegram.ui.er0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (c11) {
                            case 0:
                                ArrayList arrayList22 = photoViewer12.h1;
                                if (arrayList22 != null) {
                                    arrayList22.remove(v3Var2);
                                    break;
                                }
                                break;
                            default:
                                PhotoViewer photoViewer122 = photoViewer12;
                                ArrayList arrayList3 = photoViewer122.h1;
                                fi.v3 v3Var22 = v3Var2;
                                if (arrayList3 != null) {
                                    arrayList3.remove(v3Var22);
                                }
                                ArrayList arrayList4 = photoViewer122.i1;
                                if (arrayList4 != null) {
                                    arrayList4.remove(v3Var22);
                                    break;
                                }
                                break;
                        }
                    }
                };
                photoViewer12.e0.addView(v3Var2, org.telegram.ui.Components.kb1.i(-1, 200, 83));
                photoViewer12.h1.add(v3Var2);
                photoViewer12.i1.add(v3Var2);
                v3Var2.u();
                break;
            case 12:
                PhotoViewer photoViewer13 = this.b;
                if (photoViewer13.d != null && !photoViewer13.K1()) {
                    photoViewer13.d.n();
                    photoViewer13.H0(true, false);
                    break;
                }
                break;
            case 13:
                PhotoViewer photoViewer14 = this.b;
                if (photoViewer14.d != null && !photoViewer14.K1()) {
                    photoViewer14.d.n();
                    photoViewer14.H0(true, false);
                    break;
                }
                break;
            case 14:
                PhotoViewer photoViewer15 = this.b;
                ArrayList arrayList3 = photoViewer15.g7;
                if (!photoViewer15.v7) {
                    cu0 cu0Var = photoViewer15.t5;
                    if (!cu0Var.Q && cu0Var.m0 != 1 && (i11 = photoViewer15.P4) >= 0 && i11 < arrayList3.size() && !photoViewer15.p5.V) {
                        MediaController.MediaEditState mediaEditState = (MediaController.MediaEditState) arrayList3.get(photoViewer15.P4);
                        boolean isEmpty = TextUtils.isEmpty(mediaEditState.filterPath);
                        boolean z11 = !isEmpty;
                        cu0 cu0Var2 = photoViewer15.t5;
                        int i17 = cu0Var2.m0;
                        if (i17 != 0) {
                            if (i17 != 2) {
                                photoViewer15.p5.l();
                                photoViewer15.p5.getThanosEffect();
                                sg.o2 o2Var = photoViewer15.p5;
                                o2Var.L = false;
                                o2Var.E = null;
                                ImageReceiver imageReceiver = photoViewer15.C4;
                                if (isEmpty || (bitmap = o2Var.K) == null) {
                                    bitmap = o2Var.I;
                                }
                                imageReceiver.setImageBitmap(bitmap);
                                photoViewer15.t5.setCutOutState(true);
                                photoViewer15.a3(false, true);
                                photoViewer15.n0();
                                break;
                            } else {
                                cu0Var2.setCutOutState(true);
                                photoViewer15.a3(false, true);
                                photoViewer15.p5.f();
                                photoViewer15.e0.invalidate();
                                break;
                            }
                        } else {
                            cu0Var2.setCancelState(true);
                            sg.o2 o2Var2 = photoViewer15.p5;
                            fi.kc kcVar = new fi.kc(photoViewer15, z11, mediaEditState, i12);
                            o2Var2.getClass();
                            o2Var2.setOnClickListener(new org.telegram.ui.web.c(2, o2Var2, kcVar));
                            TextView textView = o2Var2.M;
                            textView.setText(LocaleController.getString(R.string.SegmentationTabToCrop));
                            textView.animate().cancel();
                            textView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(240L).setInterpolator(org.telegram.ui.Components.ds.h).start();
                            ValueAnimator valueAnimator = o2Var2.N;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            o2Var2.Q = o2Var2.R;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            o2Var2.N = ofFloat;
                            ofFloat.addUpdateListener(new fi.e4(o2Var2, 23));
                            o2Var2.N.setRepeatCount(-1);
                            o2Var2.N.setRepeatMode(1);
                            o2Var2.N.setDuration(2400L);
                            o2Var2.N.setInterpolator(new LinearInterpolator());
                            o2Var2.N.start();
                            photoViewer15.e0.invalidate();
                            break;
                        }
                    }
                }
                break;
            case 15:
                PhotoViewer photoViewer16 = this.b;
                photoViewer16.v5.m(true, true);
                photoViewer16.w5.m(false, true);
                sg.o2 o2Var3 = photoViewer16.p5;
                if (o2Var3 != null) {
                    o2Var3.setOutlineVisible(false);
                }
                photoViewer16.M1 = true;
                ot0 ot0Var = photoViewer16.N1;
                if (ot0Var != null) {
                    ot0Var.setEraser(true);
                }
                photoViewer16.h3(4);
                break;
            case 16:
                PhotoViewer photoViewer17 = this.b;
                photoViewer17.v5.m(false, true);
                photoViewer17.w5.m(true, true);
                sg.o2 o2Var4 = photoViewer17.p5;
                if (o2Var4 != null) {
                    o2Var4.setOutlineVisible(false);
                }
                photoViewer17.M1 = false;
                ot0 ot0Var2 = photoViewer17.N1;
                if (ot0Var2 != null) {
                    ot0Var2.setEraser(false);
                }
                photoViewer17.h3(4);
                break;
            case 17:
                PhotoViewer photoViewer18 = this.b;
                ot0 ot0Var3 = photoViewer18.N1;
                if (ot0Var3 != null) {
                    rg.t1 t1Var = ot0Var3.b;
                    if (t1Var.a()) {
                        t1Var.c();
                        break;
                    }
                }
                photoViewer18.h3(0);
                photoViewer18.p5.l();
                boolean isEmpty2 = TextUtils.isEmpty(((MediaController.MediaEditState) photoViewer18.g7.get(photoViewer18.P4)).filterPath);
                sg.o2 o2Var5 = photoViewer18.p5;
                if (o2Var5 != null && !o2Var5.G) {
                    o2Var5.L = false;
                    o2Var5.E = null;
                }
                ImageReceiver imageReceiver2 = photoViewer18.C4;
                if (isEmpty2 || (bitmap2 = o2Var5.K) == null) {
                    bitmap2 = o2Var5.I;
                }
                imageReceiver2.setImageBitmap(bitmap2);
                sg.o2 o2Var6 = photoViewer18.p5;
                if (o2Var6 == null || !o2Var6.G) {
                    photoViewer18.t5.setCutOutState(true);
                }
                photoViewer18.d3(true, true);
                break;
            case 18:
                PhotoViewer photoViewer19 = this.b;
                if (photoViewer19.p5 != null) {
                    photoViewer19.y5.m(!r2.s0, true);
                    photoViewer19.p5.setOutlineVisible((!photoViewer19.y5.s0 || photoViewer19.v5.s0 || photoViewer19.w5.s0) ? false : true);
                    break;
                }
                break;
            case 19:
                PhotoViewer photoViewer20 = this.b;
                wn wnVar = photoViewer20.l4;
                if (wnVar != null && (messageObject = wnVar.F5) != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(photoViewer20.T, photoViewer20.l4.F5.getDialogId())) {
                    if (photoViewer20.m4 == null || (of2 = photoViewer20.l4.w5) == null) {
                        of2 = MessageSuggestionParams.of(photoViewer20.l4.F5.messageOwner.suggested_post);
                    }
                    if (!bi.ca.U(photoViewer20.T, of2.amount)) {
                        wn wnVar2 = photoViewer20.l4;
                        if (wnVar2 != null) {
                            wnVar2.jc(of2);
                            break;
                        }
                    }
                }
                if (!photoViewer20.U1.o()) {
                    wn wnVar3 = photoViewer20.l4;
                    if (wnVar3 == null || !wnVar3.c() || ((a3Var = photoViewer20.l4.V1) != null && a3Var.K1 != null)) {
                        photoViewer20.z2(true, 0, 0, false, false, false);
                        break;
                    } else {
                        photoViewer20.c3();
                        break;
                    }
                } else {
                    org.telegram.ui.Components.s6 s6Var = photoViewer20.U1.v;
                    float f7 = -photoViewer20.W1;
                    photoViewer20.W1 = f7;
                    AndroidUtilities.shakeViewSpring(s6Var, f7);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    if (!MessagesController.getInstance(photoViewer20.T).premiumFeaturesBlocked() && MessagesController.getInstance(photoViewer20.T).captionLengthLimitPremium > photoViewer20.U1.getCodePointCount()) {
                        photoViewer20.W2(photoViewer20.e0);
                        break;
                    }
                }
                break;
            case 20:
                this.b.a.a(false, true);
                break;
            case 21:
                PhotoViewer photoViewer21 = this.b;
                if (photoViewer21.y != null && (qu0Var = photoViewer21.d) != null) {
                    qu0Var.W();
                    photoViewer21.H0(true, false);
                    break;
                }
                break;
            case 22:
                PhotoViewer photoViewer22 = this.b;
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer22.u0();
                if (!photoViewer22.K1()) {
                    if (photoViewer22.r1) {
                        if (photoViewer22.k8) {
                            TextureView textureView = photoViewer22.B2;
                            if (textureView instanceof org.telegram.ui.Components.i81) {
                                org.telegram.ui.Components.i81 i81Var = (org.telegram.ui.Components.i81) textureView;
                                if (i81Var.getVideoWidth() <= 0 || i81Var.getVideoHeight() <= 0) {
                                }
                            }
                        }
                    }
                    photoViewer22.h3(1);
                    break;
                }
                break;
            case 23:
                PhotoViewer photoViewer23 = this.b;
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer23.P0(-90.0f, false, null);
                break;
            case 24:
                PhotoViewer photoViewer24 = this.b;
                Drawable[] drawableArr9 = PhotoViewer.U8;
                photoViewer24.O0();
                break;
            case 25:
                PhotoViewer photoViewer25 = this.b;
                Drawable[] drawableArr10 = PhotoViewer.U8;
                photoViewer25.u0();
                if (!photoViewer25.K1()) {
                    if (photoViewer25.r1) {
                        if (photoViewer25.k8) {
                            TextureView textureView2 = photoViewer25.B2;
                            if (textureView2 instanceof org.telegram.ui.Components.i81) {
                                org.telegram.ui.Components.i81 i81Var2 = (org.telegram.ui.Components.i81) textureView2;
                                if (i81Var2.getVideoWidth() <= 0 || i81Var2.getVideoHeight() <= 0) {
                                }
                            }
                        }
                    }
                    photoViewer25.h3(3);
                    break;
                }
                break;
            case 26:
                PhotoViewer photoViewer26 = this.b;
                Drawable[] drawableArr11 = PhotoViewer.U8;
                if (view.getAlpha() >= 0.9f) {
                    photoViewer26.u0();
                    if (!photoViewer26.K1()) {
                        if (photoViewer26.r1) {
                            if (photoViewer26.k8) {
                                TextureView textureView3 = photoViewer26.B2;
                                if (textureView3 instanceof org.telegram.ui.Components.i81) {
                                    org.telegram.ui.Components.i81 i81Var3 = (org.telegram.ui.Components.i81) textureView3;
                                    if (i81Var3.getVideoWidth() <= 0 || i81Var3.getVideoHeight() <= 0) {
                                    }
                                }
                            }
                        }
                        photoViewer26.h3(2);
                        break;
                    }
                }
                break;
            case 27:
                PhotoViewer photoViewer27 = this.b;
                if (photoViewer27.p6 == null) {
                    zq0 zq0Var = new zq0(photoViewer27, 29);
                    if (!photoViewer27.J2) {
                        float stateOrientation = photoViewer27.R2 - photoViewer27.C1.b.getStateOrientation();
                        if (Math.abs(stateOrientation) > 180.0f) {
                            stateOrientation = stateOrientation < 0.0f ? stateOrientation + 360.0f : -(360.0f - stateOrientation);
                        }
                        photoViewer27.P0(stateOrientation, photoViewer27.C1.b.getStateMirror(), zq0Var);
                        break;
                    } else {
                        zq0Var.run();
                        break;
                    }
                }
                break;
            case 28:
                PhotoViewer photoViewer28 = this.b;
                if (photoViewer28.u4 == 1) {
                    ng.p pVar = photoViewer28.C1.b;
                    ng.c cVar = pVar.G;
                    if (cVar.a.isInProgress() || cVar.h || pVar.a.e0) {
                    }
                }
                photoViewer28.n0();
                photoViewer28.h3(0);
                break;
            default:
                PhotoViewer photoViewer29 = this.b;
                float f10 = -photoViewer29.C1.b.getStateOrientation();
                if (Math.abs(f10) > 180.0f) {
                    f10 = f10 < 0.0f ? f10 + 360.0f : -(360.0f - f10);
                }
                photoViewer29.P0(f10, photoViewer29.C1.b.getStateMirror(), new zq0(photoViewer29, 8));
                break;
        }
    }
}
