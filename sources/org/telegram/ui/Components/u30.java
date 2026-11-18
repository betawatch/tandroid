package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class u30 implements org.telegram.messenger.fs, org.telegram.ui.sm0 {
    public org.telegram.messenger.fj E;
    public String F;
    public boolean G;
    public boolean I;
    public final boolean J;
    public TLRPC.User M;
    public TLRPC.InputFile N;
    public TLRPC.InputFile O;
    public TLRPC.VideoSize P;
    public double Q;
    public final boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public int V;
    public final int W;
    public float X;
    public org.telegram.ui.ActionBar.h2 a;
    public t30 b;
    public si c;
    public String f;
    public TLRPC.PhotoSize h;
    public TLRPC.PhotoSize n;
    public Bitmap r;
    public boolean s;
    public String w;
    public String x;
    public String y;
    public final int d = org.telegram.messenger.j10.t0;
    public boolean H = true;
    public boolean K = true;
    public boolean L = true;
    public final ImageReceiver e = new ImageReceiver(null);

    public u30(int i7, boolean z10, boolean z11) {
        this.R = z10;
        this.J = z11;
        this.W = i7;
    }

    public static void a(u30 u30Var, boolean z10, ArrayList arrayList) {
        org.telegram.messenger.fj fjVar;
        Bitmap K;
        ImageReceiver imageReceiver = u30Var.e;
        int i7 = u30Var.d;
        if (arrayList.isEmpty()) {
            return;
        }
        org.telegram.messenger.yy yyVar = (org.telegram.messenger.yy) arrayList.get(0);
        Bitmap bitmap = null;
        if ((yyVar.o || yyVar.k != null) && !yyVar.p) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 0;
            tL_message.message = "";
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.action = new TLRPC.TL_messageActionEmpty();
            tL_message.dialog_id = 0L;
            fjVar = new org.telegram.messenger.fj(org.telegram.messenger.j10.t0, tL_message, false, false);
            fjVar.k.attachPath = new File(org.telegram.messenger.w7.z(4), org.telegram.messenger.bz.p() + "_avatar.mp4").getAbsolutePath();
            fjVar.r0 = yyVar.k;
            fjVar.s = yyVar.v;
            bitmap = org.telegram.messenger.ec.K(yyVar.e, null, 800.0f, 800.0f, true);
        } else {
            String str = yyVar.c;
            if (str != null) {
                K = org.telegram.messenger.ec.K(str, null, 800.0f, 800.0f, true);
            } else {
                org.telegram.messenger.hf hfVar = yyVar.l;
                if (hfVar != null) {
                    TLRPC.Photo photo = hfVar.K;
                    if (photo != null) {
                        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
                        if (w10 != null) {
                            org.telegram.messenger.w7.G(i7);
                            File J = org.telegram.messenger.w7.J(w10, null, true, true);
                            u30Var.F = J.getAbsolutePath();
                            if (!J.exists()) {
                                org.telegram.messenger.w7.G(i7);
                                J = org.telegram.messenger.w7.J(w10, null, false, true);
                                if (!J.exists()) {
                                    J = null;
                                }
                            }
                            if (J != null) {
                                K = org.telegram.messenger.ec.K(J.getAbsolutePath(), null, 800.0f, 800.0f, true);
                            } else {
                                org.telegram.messenger.ks.f(i7).b(u30Var, org.telegram.messenger.ks.Y1);
                                org.telegram.messenger.ks.f(i7).b(u30Var, org.telegram.messenger.ks.Z1);
                                u30Var.w = org.telegram.messenger.w7.r(null, w10.location);
                                imageReceiver.q0(org.telegram.messenger.fc.i(w10, yyVar.l.K), null, null, "jpg", null, 1);
                            }
                        }
                        K = null;
                    } else if (hfVar.C != null) {
                        File file = new File(org.telegram.messenger.w7.z(4), Utilities.a(yyVar.l.C) + "." + org.telegram.messenger.ec.B(yyVar.l.C, "jpg"));
                        u30Var.F = file.getAbsolutePath();
                        if (!file.exists() || file.length() == 0) {
                            u30Var.w = yyVar.l.C;
                            org.telegram.messenger.ks.f(i7).b(u30Var, org.telegram.messenger.ks.R1);
                            org.telegram.messenger.ks.f(i7).b(u30Var, org.telegram.messenger.ks.S1);
                            imageReceiver.o0(yyVar.l.C, null, null, "jpg", 1L);
                        } else {
                            K = org.telegram.messenger.ec.K(file.getAbsolutePath(), null, 800.0f, 800.0f, true);
                        }
                    }
                }
                fjVar = null;
            }
            fjVar = null;
            bitmap = K;
        }
        u30Var.r(z10, bitmap, fjVar);
    }

    public final void b() {
        this.U = true;
        String str = this.w;
        int i7 = this.d;
        if (str != null) {
            org.telegram.messenger.w7.G(i7).b(this.w, false);
        }
        if (this.x != null) {
            org.telegram.messenger.w7.G(i7).b(this.x, false);
        }
        t30 t30Var = this.b;
        if (t30Var != null) {
            t30Var.U();
        }
    }

    public final void c() {
        this.w = null;
        this.x = null;
        this.y = null;
        this.E = null;
        if (this.G) {
            this.e.w0(null);
            this.a = null;
            this.b = null;
        }
    }

    public final void d() {
        this.U = false;
        if (this.w == null && this.x == null && this.E == null) {
            this.a = null;
            this.b = null;
        } else {
            this.G = true;
        }
        si siVar = this.c;
        if (siVar != null) {
            siVar.L();
            this.c.k1();
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        t30 t30Var;
        org.telegram.ui.ActionBar.h2 h2Var;
        int i11 = org.telegram.messenger.ks.W1;
        int i12 = org.telegram.messenger.ks.V1;
        int i13 = this.d;
        int i14 = org.telegram.messenger.ks.U1;
        if (i7 == i14 || i7 == i12) {
            String str = (String) objArr[0];
            if (str.equals(this.w)) {
                this.w = null;
                if (i7 == i14) {
                    this.N = (TLRPC.InputFile) objArr[1];
                }
            } else {
                if (!str.equals(this.x)) {
                    return;
                }
                this.x = null;
                if (i7 == i14) {
                    this.O = (TLRPC.InputFile) objArr[1];
                }
            }
            if (this.w == null && this.x == null && this.E == null) {
                org.telegram.messenger.ks.f(i13).n(this, i14);
                org.telegram.messenger.ks.f(i13).n(this, i11);
                org.telegram.messenger.ks.f(i13).n(this, i12);
                if (i7 == i14 && (t30Var = this.b) != null) {
                    t30Var.V(this.N, this.O, this.Q, this.y, this.h, this.n, this.s, this.P);
                }
                c();
                return;
            }
            return;
        }
        if (i7 == i11) {
            String str2 = (String) objArr[0];
            String str3 = this.E != null ? this.x : this.w;
            if (this.b == null || !str2.equals(str3)) {
                return;
            }
            float min = Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue());
            t30 t30Var2 = this.b;
            this.X = min;
            t30Var2.I(min);
            return;
        }
        int i15 = org.telegram.messenger.ks.S1;
        int i16 = org.telegram.messenger.ks.R1;
        int i17 = org.telegram.messenger.ks.Z1;
        int i18 = org.telegram.messenger.ks.Y1;
        if (i7 == i18 || i7 == i17 || i7 == i16 || i7 == i15) {
            String str4 = (String) objArr[0];
            this.X = 1.0f;
            if (str4.equals(this.w)) {
                org.telegram.messenger.ks.f(i13).n(this, i18);
                org.telegram.messenger.ks.f(i13).n(this, i17);
                org.telegram.messenger.ks.f(i13).n(this, i16);
                org.telegram.messenger.ks.f(i13).n(this, i15);
                this.w = null;
                if (i7 == i18 || i7 == i16) {
                    r(false, org.telegram.messenger.ec.K(this.F, null, 800.0f, 800.0f, true), null);
                    return;
                }
                this.e.w0(null);
                t30 t30Var3 = this.b;
                if (t30Var3 != null) {
                    t30Var3.U();
                    return;
                }
                return;
            }
            return;
        }
        int i19 = org.telegram.messenger.ks.c2;
        int i20 = org.telegram.messenger.ks.b2;
        int i21 = org.telegram.messenger.ks.a2;
        if (i7 == i19) {
            if (((org.telegram.messenger.fj) objArr[0]) != this.E || this.a == null) {
                return;
            }
            org.telegram.messenger.ks.f(i13).n(this, i21);
            org.telegram.messenger.ks.f(i13).n(this, i19);
            org.telegram.messenger.ks.f(i13).n(this, i20);
            c();
            return;
        }
        if (i7 != i20) {
            if (i7 == i21 && ((org.telegram.messenger.fj) objArr[0]) == this.E && (h2Var = this.a) != null) {
                this.x = (String) objArr[1];
                h2Var.getFileLoader().g0(this.x, false, false, (int) this.E.r0.q, 33554432, false);
                return;
            }
            return;
        }
        if (((org.telegram.messenger.fj) objArr[0]) != this.E || this.a == null) {
            return;
        }
        String str5 = (String) objArr[1];
        long longValue = ((Long) objArr[2]).longValue();
        long longValue2 = ((Long) objArr[3]).longValue();
        this.a.getFileLoader().n(str5, false, longValue, longValue2, null);
        if (longValue2 != 0) {
            double longValue3 = ((Long) objArr[5]).longValue() / 1000000.0d;
            if (this.Q > longValue3) {
                this.Q = longValue3;
            }
            Bitmap s5 = org.telegram.messenger.zy.s(str5, (long) (this.Q * 1000.0d), null, true);
            if (s5 != null) {
                org.telegram.messenger.w7.G(i13);
                File J = org.telegram.messenger.w7.J(this.n, null, true, true);
                if (J != null) {
                    if (org.telegram.messenger.s2.a) {
                        org.telegram.messenger.a8.d("delete file " + J);
                    }
                    J.delete();
                }
                org.telegram.messenger.w7.G(i13);
                File J2 = org.telegram.messenger.w7.J(this.h, null, true, true);
                if (J2 != null) {
                    if (org.telegram.messenger.s2.a) {
                        org.telegram.messenger.a8.d("delete file " + J2);
                    }
                    J2.delete();
                }
                this.h = org.telegram.messenger.ec.Y(s5, 800.0f, 800.0f, 80, org.telegram.messenger.ks.r5, org.telegram.messenger.ks.r5);
                TLRPC.PhotoSize Y = org.telegram.messenger.ec.Y(s5, 150.0f, 150.0f, 80, org.telegram.messenger.ks.g2, org.telegram.messenger.ks.g2);
                this.n = Y;
                if (Y != null) {
                    try {
                        org.telegram.messenger.w7.G(i13);
                        org.telegram.messenger.ec.D().O(new BitmapDrawable(BitmapFactory.decodeFile(org.telegram.messenger.w7.J(this.n, null, true, true).getAbsolutePath())), this.n.location.volume_id + "_" + this.n.location.local_id + "@50_50", true);
                    } catch (Throwable unused) {
                    }
                }
            }
            org.telegram.messenger.ks.f(i13).n(this, i21);
            org.telegram.messenger.ks.f(i13).n(this, i19);
            org.telegram.messenger.ks.f(i13).n(this, i20);
            this.y = str5;
            this.x = str5;
            this.E = null;
        }
    }

    public final void e() {
        dt dtVar;
        org.telegram.ui.ActionBar.h2 h2Var = this.a;
        if (h2Var == null || h2Var.getParentActivity() == null) {
            return;
        }
        int i7 = 1;
        if (this.c == null) {
            si siVar = new si(this.a.getParentActivity(), this.a, this.S, this.T);
            this.c = siVar;
            int i10 = this.R ? 2 : 1;
            t30 t30Var = this.b;
            if (t30Var == null || !t30Var.x()) {
                dtVar = null;
            } else {
                t30 t30Var2 = this.b;
                Objects.requireNonNull(t30Var2);
                dtVar = new dt(t30Var2, i7);
            }
            siVar.O2 = i10;
            siVar.P2 = dtVar;
            siVar.Q2 = false;
            ki kiVar = siVar.w2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = siVar.e2;
            if (kiVar == null || kiVar == chatAttachAlertPhotoLayout) {
                siVar.v3.setVisibility(8);
            }
            int i11 = siVar.O2;
            TextView textView = siVar.h3;
            if (i11 == 2) {
                textView.setText(org.telegram.messenger.gd.M0(2131752110, null));
            } else {
                textView.setText(org.telegram.messenger.gd.M0(2131752112, null));
            }
            if (chatAttachAlertPhotoLayout != null) {
                si siVar2 = chatAttachAlertPhotoLayout.b;
                chatAttachAlertPhotoLayout.h1 = (siVar2.O2 == 0 || siVar2.A1) ? false : true;
            }
            si siVar3 = this.c;
            siVar3.X3 = new q30(this);
            siVar3.P1 = this;
        }
        int i12 = this.V;
        if (i12 == 1) {
            this.c.h3.setText(org.telegram.messenger.gd.a0("SetPhotoFor", null, 2131745323, this.M.first_name));
        } else if (i12 == 2) {
            this.c.h3.setText(org.telegram.messenger.gd.a0("SuggestPhotoFor", null, 2131744171, this.M.first_name));
        }
    }

    public final boolean f(Dialog dialog) {
        si siVar = this.c;
        if (siVar == null || dialog != siVar) {
            return false;
        }
        siVar.e2.d0(false);
        this.c.L();
        this.c.e2.g0(true);
        return true;
    }

    public final boolean g() {
        return (this.w == null && this.x == null && this.E == null) ? false : true;
    }

    public final void h(int i7, int i10, Intent intent) {
        if (i10 == -1) {
            if (i7 == 0 || i7 == 2) {
                e();
                si siVar = this.c;
                if (siVar != null) {
                    siVar.e2.j0(i7, intent, this.f);
                }
                this.f = null;
                return;
            }
            if (i7 == 13) {
                this.a.getParentActivity().overridePendingTransition(R.anim.alpha_in, R.anim.alpha_out);
                PhotoViewer.p1().I2(null, this.a, null);
                o(this.f, null, org.telegram.messenger.g0.N0(this.f), false);
                org.telegram.messenger.g0.e(this.f);
                this.f = null;
                return;
            }
            if (i7 == 14) {
                if (intent == null || intent.getData() == null) {
                    return;
                }
                org.telegram.messenger.g0.g3(new dw(10, this, intent.getData()));
                return;
            }
            if (i7 == 15) {
                p(this.f, null, true);
                org.telegram.messenger.g0.e(this.f);
                this.f = null;
            }
        }
    }

    public final void i() {
        si siVar = this.c;
        if (siVar != null) {
            siVar.m1();
        }
    }

    public final void j(int i7, String[] strArr, int[] iArr) {
        si siVar = this.c;
        if (siVar != null) {
            if (i7 == 17) {
                siVar.e2.X(false);
                this.c.e2.b0();
            } else if (i7 == 4) {
                siVar.e2.b0();
            }
        }
    }

    public final void k() {
        si siVar = this.c;
        if (siVar != null) {
            siVar.n1();
        }
    }

    public final void l() {
        org.telegram.ui.ActionBar.h2 h2Var = this.a;
        if (h2Var == null || h2Var.getParentActivity() == null) {
            return;
        }
        try {
            int i7 = Build.VERSION.SDK_INT;
            if (this.a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                this.a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                return;
            }
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            File q02 = org.telegram.messenger.g0.q0(null, false);
            if (q02 != null) {
                if (i7 >= 24) {
                    Activity parentActivity = this.a.getParentActivity();
                    org.telegram.messenger.t0.d();
                    intent.putExtra("output", FileProvider.d(parentActivity, "org.telegram.messenger.beta.provider", q02));
                    intent.addFlags(2);
                    intent.addFlags(1);
                } else {
                    intent.putExtra("output", Uri.fromFile(q02));
                }
                this.f = q02.getAbsolutePath();
            }
            this.a.startActivityForResult(intent, 13);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void m() {
        org.telegram.ui.ActionBar.h2 h2Var = this.a;
        if (h2Var == null) {
            return;
        }
        Activity parentActivity = h2Var.getParentActivity();
        if (Build.VERSION.SDK_INT < 33 || parentActivity == null) {
            if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, org.telegram.messenger.ks.h2);
                return;
            }
        } else if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, org.telegram.messenger.ks.h2);
            return;
        }
        org.telegram.ui.qm0 qm0Var = new org.telegram.ui.qm0(this.R ? 3 : 1, false, false, null);
        qm0Var.y = this.K;
        qm0Var.W = new org.telegram.ui.Cells.c5(this);
        this.a.presentFragment(qm0Var);
    }

    public final void n(boolean z10, final Runnable runnable, DialogInterface.OnDismissListener onDismissListener, int i7) {
        org.telegram.ui.ActionBar.q2 q2Var;
        org.telegram.ui.ActionBar.h2 h2Var = this.a;
        if (h2Var == null || h2Var.getParentActivity() == null) {
            return;
        }
        this.U = false;
        this.V = i7;
        if (this.H) {
            org.telegram.ui.ActionBar.h2 h2Var2 = this.a;
            if (h2Var2 == null || h2Var2.getParentActivity() == null) {
                return;
            }
            e();
            si siVar = this.c;
            siVar.S3 = this.I;
            siVar.z1(1, false);
            this.c.e2.i0();
            this.c.f1();
            si siVar2 = this.c;
            siVar2.I0 = onDismissListener;
            int i10 = this.V;
            if (i10 != 0) {
                siVar2.L1 = new s30(i10, this.M);
            }
            this.a.showDialog(siVar2);
            return;
        }
        org.telegram.ui.ActionBar.x2 j3 = org.telegram.messenger.n10.j(this.a.getParentActivity(), false, 1, null);
        if (i7 == 1) {
            j3.P = org.telegram.messenger.gd.a0("SetPhotoFor", null, 2131745323, this.M.first_name);
            j3.Q = true;
        } else if (i7 == 2) {
            j3.P = org.telegram.messenger.gd.a0("SuggestPhotoFor", null, 2131744171, this.M.first_name);
            j3.Q = true;
        } else {
            j3.P = org.telegram.messenger.gd.M0(2131752112, null);
            j3.Q = true;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        org.telegram.ui.Cells.c0.v(null, 2131752102, arrayList, R.drawable.msg_camera, arrayList2);
        arrayList3.add(0);
        if (this.R) {
            org.telegram.ui.Cells.c0.v(null, 2131752109, arrayList, R.drawable.msg_video, arrayList2);
            arrayList3.add(4);
        }
        org.telegram.ui.Cells.c0.v(null, 2131752117, arrayList, R.drawable.msg_photos, arrayList2);
        arrayList3.add(1);
        if (this.K) {
            org.telegram.ui.Cells.c0.v(null, 2131752115, arrayList, R.drawable.msg_search, arrayList2);
            arrayList3.add(2);
        }
        if (z10) {
            org.telegram.ui.Cells.c0.v(null, 2131751503, arrayList, R.drawable.msg_delete, arrayList2);
            arrayList3.add(3);
        }
        int[] iArr = new int[arrayList2.size()];
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = ((Integer) arrayList2.get(i11)).intValue();
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.p30
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                org.telegram.ui.ActionBar.h2 h2Var3;
                int intValue = ((Integer) arrayList3.get(i12)).intValue();
                u30 u30Var = u30.this;
                if (intValue == 0) {
                    u30Var.l();
                    return;
                }
                if (intValue == 1) {
                    u30Var.m();
                    return;
                }
                if (intValue == 2) {
                    u30Var.q();
                    return;
                }
                if (intValue == 3) {
                    runnable.run();
                    return;
                }
                if (intValue != 4 || (h2Var3 = u30Var.a) == null || h2Var3.getParentActivity() == null) {
                    return;
                }
                try {
                    int i13 = Build.VERSION.SDK_INT;
                    if (u30Var.a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        u30Var.a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                        return;
                    }
                    Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                    File s02 = org.telegram.messenger.g0.s0(false);
                    if (s02 != null) {
                        if (i13 >= 24) {
                            Activity parentActivity = u30Var.a.getParentActivity();
                            org.telegram.messenger.t0.d();
                            intent.putExtra("output", FileProvider.d(parentActivity, "org.telegram.messenger.beta.provider", s02));
                            intent.addFlags(2);
                            intent.addFlags(1);
                        } else {
                            intent.putExtra("output", Uri.fromFile(s02));
                        }
                        intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
                        intent.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
                        intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
                        intent.putExtra("android.intent.extra.durationLimit", 10);
                        u30Var.f = s02.getAbsolutePath();
                    }
                    u30Var.a.startActivityForResult(intent, 15);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        };
        j3.M = charSequenceArr;
        j3.N = iArr;
        j3.L = onClickListener;
        j3.I0 = onDismissListener;
        this.a.showDialog(j3);
        if (z10) {
            int size2 = arrayList.size() - 1;
            int i12 = org.telegram.ui.ActionBar.n6.q7;
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, i12, false);
            int i13 = org.telegram.ui.ActionBar.n6.p7;
            j3.C0(size2, x02, org.telegram.ui.ActionBar.n6.x0(null, i13, false));
            int size3 = arrayList.size() - 1;
            if (size3 < 0 || size3 >= j3.x0.size() || (q2Var = (org.telegram.ui.ActionBar.q2) j3.x0.get(size3)) == null || q2Var.getTextView() == null || q2Var.getImageView() == null) {
                return;
            }
            org.telegram.ui.ActionBar.u6.U(q2Var.getTextView(), i12, null);
            org.telegram.ui.ActionBar.u6.s(q2Var.getImageView(), i13, null, PorterDuff.Mode.MULTIPLY);
        }
    }

    public final void o(String str, String str2, Pair pair, boolean z10) {
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, str, ((Integer) pair.first).intValue(), false, 0, 0);
        efVar.n(pair);
        efVar.b = z10;
        efVar.c = str2;
        arrayList.add(efVar);
        PhotoViewer.p1().I2(null, this.a, null);
        PhotoViewer.p1().f2(arrayList, 0, 1, false, new r30(this, arrayList), null);
        PhotoViewer.p1().Q = true;
    }

    public final void p(String str, String str2, boolean z10) {
        o(str, str2, new Pair(0, 0), z10);
    }

    public final void q() {
        if (this.a == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.cn0 cn0Var = new org.telegram.ui.cn0(0, null, hashMap, arrayList, 1, false, null, this.S);
        ab.q qVar = new ab.q();
        qVar.d = this;
        qVar.b = hashMap;
        qVar.c = arrayList;
        cn0Var.t0 = qVar;
        cn0Var.k0(1, false);
        cn0Var.q0 = this.b.getInitialSearchString();
        if (this.T) {
            this.a.showAsSheet(cn0Var);
        } else {
            this.a.presentFragment(cn0Var);
        }
    }

    public final void r(boolean z10, Bitmap bitmap, org.telegram.messenger.fj fjVar) {
        if (bitmap == null) {
            return;
        }
        this.O = null;
        this.N = null;
        this.E = null;
        this.y = null;
        this.P = fjVar == null ? null : fjVar.s;
        this.h = org.telegram.messenger.ec.Y(bitmap, 800.0f, 800.0f, 80, org.telegram.messenger.ks.r5, org.telegram.messenger.ks.r5);
        TLRPC.PhotoSize Y = org.telegram.messenger.ec.Y(bitmap, 150.0f, 150.0f, 80, org.telegram.messenger.ks.g2, org.telegram.messenger.ks.g2);
        this.n = Y;
        int i7 = this.d;
        if (Y != null) {
            try {
                org.telegram.messenger.w7.G(i7);
                Bitmap decodeFile = BitmapFactory.decodeFile(org.telegram.messenger.w7.J(this.n, null, true, true).getAbsolutePath());
                this.r = decodeFile;
                org.telegram.messenger.ec.D().O(new BitmapDrawable(decodeFile), this.n.location.volume_id + "_" + this.n.location.local_id + "@50_50", true);
            } catch (Throwable unused) {
            }
        }
        bitmap.recycle();
        if (this.h != null) {
            org.telegram.messenger.j10.i(i7).v(false);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(org.telegram.messenger.w7.z(4));
            sb2.append("/");
            sb2.append(this.h.location.volume_id);
            sb2.append("_");
            this.w = a8.p0.n(this.h.location.local_id, ".jpg", sb2);
            if (this.L) {
                if (fjVar == null || fjVar.r0 == null) {
                    t30 t30Var = this.b;
                    if (t30Var != null) {
                        t30Var.Q(z10, false);
                    }
                    this.s = false;
                } else {
                    if (this.J && !org.telegram.messenger.mp.u1(i7).x7) {
                        t30 t30Var2 = this.b;
                        if (t30Var2 != null) {
                            t30Var2.Q(z10, true);
                        }
                        t30 t30Var3 = this.b;
                        if (t30Var3 != null) {
                            t30Var3.V(null, null, 0.0d, null, this.h, this.n, this.s, null);
                            this.b.V(null, null, this.Q, this.y, this.h, this.n, this.s, this.P);
                            c();
                            return;
                        }
                        return;
                    }
                    this.E = fjVar;
                    org.telegram.messenger.e20 e20Var = fjVar.r0;
                    long j3 = e20Var.a;
                    if (j3 < 0) {
                        j3 = 0;
                    }
                    this.Q = (e20Var.c - j3) / 1000000.0d;
                    e20Var.Z = false;
                    org.telegram.messenger.ks.f(i7).b(this, org.telegram.messenger.ks.a2);
                    org.telegram.messenger.ks.f(i7).b(this, org.telegram.messenger.ks.c2);
                    org.telegram.messenger.ks.f(i7).b(this, org.telegram.messenger.ks.b2);
                    MediaController.B().h0(fjVar, true, true, false);
                    this.w = null;
                    t30 t30Var4 = this.b;
                    if (t30Var4 != null) {
                        t30Var4.Q(z10, true);
                    }
                    this.s = true;
                }
                org.telegram.messenger.ks.f(i7).b(this, org.telegram.messenger.ks.U1);
                org.telegram.messenger.ks.f(i7).b(this, org.telegram.messenger.ks.W1);
                org.telegram.messenger.ks.f(i7).b(this, org.telegram.messenger.ks.V1);
                if (this.w != null) {
                    org.telegram.messenger.w7.G(i7).h0(false, 16777216, this.w, true);
                }
            }
            t30 t30Var5 = this.b;
            if (t30Var5 != null) {
                t30Var5.V(null, null, 0.0d, null, this.h, this.n, this.s, null);
            }
        }
    }

    public final void s(org.telegram.messenger.ef efVar) {
        Bitmap K;
        String str = efVar.h;
        if (str == null) {
            str = efVar.I;
        }
        org.telegram.messenger.fj fjVar = null;
        if ((efVar.b || efVar.s != null) && !efVar.d()) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 0;
            tL_message.message = "";
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.action = new TLRPC.TL_messageActionEmpty();
            tL_message.dialog_id = 0L;
            org.telegram.messenger.fj fjVar2 = new org.telegram.messenger.fj(org.telegram.messenger.j10.t0, tL_message, false, false);
            fjVar2.k.attachPath = new File(org.telegram.messenger.w7.z(4), org.telegram.messenger.bz.p() + "_avatar.mp4").getAbsolutePath();
            fjVar2.r0 = efVar.s;
            fjVar2.s = efVar.S;
            K = org.telegram.messenger.ec.K(efVar.c, null, 800.0f, 800.0f, true);
            fjVar = fjVar2;
        } else {
            K = org.telegram.messenger.ec.K(str, null, 800.0f, 800.0f, true);
        }
        r(false, K, fjVar);
    }
}
