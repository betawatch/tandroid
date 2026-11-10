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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class j30 implements org.telegram.messenger.ls, org.telegram.ui.rm0 {
    public org.telegram.messenger.ij D;
    public String E;
    public boolean F;
    public boolean H;
    public final boolean I;
    public TLRPC.User L;
    public TLRPC.InputFile M;
    public TLRPC.InputFile N;
    public TLRPC.VideoSize O;
    public double P;
    public final boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public int U;
    public final int V;
    public float W;
    public org.telegram.ui.ActionBar.f2 a;
    public i30 b;
    public ci c;
    public String f;
    public TLRPC.PhotoSize h;
    public TLRPC.PhotoSize n;
    public Bitmap r;
    public boolean s;
    public String w;
    public String x;
    public String y;
    public final int d = org.telegram.messenger.p10.s0;
    public boolean G = true;
    public boolean J = true;
    public boolean K = true;
    public final ImageReceiver e = new ImageReceiver(null);

    public j30(int i7, boolean z9, boolean z10) {
        this.Q = z9;
        this.I = z10;
        this.V = i7;
    }

    public static void a(j30 j30Var, boolean z9, ArrayList arrayList) {
        org.telegram.messenger.ij ijVar;
        Bitmap K;
        ImageReceiver imageReceiver = j30Var.e;
        int i7 = j30Var.d;
        if (arrayList.isEmpty()) {
            return;
        }
        org.telegram.messenger.fz fzVar = (org.telegram.messenger.fz) arrayList.get(0);
        Bitmap bitmap = null;
        if ((fzVar.o || fzVar.k != null) && !fzVar.p) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 0;
            tL_message.message = "";
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.action = new TLRPC.TL_messageActionEmpty();
            tL_message.dialog_id = 0L;
            ijVar = new org.telegram.messenger.ij(org.telegram.messenger.p10.s0, tL_message, false, false);
            ijVar.k.attachPath = new File(org.telegram.messenger.w7.z(4), org.telegram.messenger.iz.p() + "_avatar.mp4").getAbsolutePath();
            ijVar.p0 = fzVar.k;
            ijVar.s = fzVar.v;
            bitmap = org.telegram.messenger.gc.K(fzVar.e, null, 800.0f, 800.0f, true);
        } else {
            String str = fzVar.c;
            if (str != null) {
                K = org.telegram.messenger.gc.K(str, null, 800.0f, 800.0f, true);
            } else {
                org.telegram.messenger.kf kfVar = fzVar.l;
                if (kfVar != null) {
                    TLRPC.Photo photo = kfVar.K;
                    if (photo != null) {
                        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
                        if (w10 != null) {
                            org.telegram.messenger.w7.G(i7);
                            File J = org.telegram.messenger.w7.J(w10, null, true, true);
                            j30Var.E = J.getAbsolutePath();
                            if (!J.exists()) {
                                org.telegram.messenger.w7.G(i7);
                                J = org.telegram.messenger.w7.J(w10, null, false, true);
                                if (!J.exists()) {
                                    J = null;
                                }
                            }
                            if (J != null) {
                                K = org.telegram.messenger.gc.K(J.getAbsolutePath(), null, 800.0f, 800.0f, true);
                            } else {
                                org.telegram.messenger.qs.f(i7).b(j30Var, org.telegram.messenger.qs.Y1);
                                org.telegram.messenger.qs.f(i7).b(j30Var, org.telegram.messenger.qs.Z1);
                                j30Var.w = org.telegram.messenger.w7.r(null, w10.location);
                                imageReceiver.q0(org.telegram.messenger.hc.i(w10, fzVar.l.K), null, null, "jpg", null, 1);
                            }
                        }
                        K = null;
                    } else if (kfVar.C != null) {
                        File file = new File(org.telegram.messenger.w7.z(4), Utilities.a(fzVar.l.C) + "." + org.telegram.messenger.gc.B(fzVar.l.C, "jpg"));
                        j30Var.E = file.getAbsolutePath();
                        if (!file.exists() || file.length() == 0) {
                            j30Var.w = fzVar.l.C;
                            org.telegram.messenger.qs.f(i7).b(j30Var, org.telegram.messenger.qs.R1);
                            org.telegram.messenger.qs.f(i7).b(j30Var, org.telegram.messenger.qs.S1);
                            imageReceiver.o0(fzVar.l.C, null, null, "jpg", 1L);
                        } else {
                            K = org.telegram.messenger.gc.K(file.getAbsolutePath(), null, 800.0f, 800.0f, true);
                        }
                    }
                }
                ijVar = null;
            }
            ijVar = null;
            bitmap = K;
        }
        j30Var.r(z9, bitmap, ijVar);
    }

    public final void b() {
        this.T = true;
        String str = this.w;
        int i7 = this.d;
        if (str != null) {
            org.telegram.messenger.w7.G(i7).b(this.w, false);
        }
        if (this.x != null) {
            org.telegram.messenger.w7.G(i7).b(this.x, false);
        }
        i30 i30Var = this.b;
        if (i30Var != null) {
            i30Var.T();
        }
    }

    public final void c() {
        this.w = null;
        this.x = null;
        this.y = null;
        this.D = null;
        if (this.F) {
            this.e.w0(null);
            this.a = null;
            this.b = null;
        }
    }

    public final void d() {
        this.T = false;
        if (this.w == null && this.x == null && this.D == null) {
            this.a = null;
            this.b = null;
        } else {
            this.F = true;
        }
        ci ciVar = this.c;
        if (ciVar != null) {
            ciVar.K();
            this.c.j1();
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        i30 i30Var;
        org.telegram.ui.ActionBar.f2 f2Var;
        int i11 = org.telegram.messenger.qs.W1;
        int i12 = org.telegram.messenger.qs.V1;
        int i13 = this.d;
        int i14 = org.telegram.messenger.qs.U1;
        if (i7 == i14 || i7 == i12) {
            String str = (String) objArr[0];
            if (str.equals(this.w)) {
                this.w = null;
                if (i7 == i14) {
                    this.M = (TLRPC.InputFile) objArr[1];
                }
            } else {
                if (!str.equals(this.x)) {
                    return;
                }
                this.x = null;
                if (i7 == i14) {
                    this.N = (TLRPC.InputFile) objArr[1];
                }
            }
            if (this.w == null && this.x == null && this.D == null) {
                org.telegram.messenger.qs.f(i13).n(this, i14);
                org.telegram.messenger.qs.f(i13).n(this, i11);
                org.telegram.messenger.qs.f(i13).n(this, i12);
                if (i7 == i14 && (i30Var = this.b) != null) {
                    i30Var.U(this.M, this.N, this.P, this.y, this.h, this.n, this.s, this.O);
                }
                c();
                return;
            }
            return;
        }
        if (i7 == i11) {
            String str2 = (String) objArr[0];
            String str3 = this.D != null ? this.x : this.w;
            if (this.b == null || !str2.equals(str3)) {
                return;
            }
            float min = Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue());
            i30 i30Var2 = this.b;
            this.W = min;
            i30Var2.H(min);
            return;
        }
        int i15 = org.telegram.messenger.qs.S1;
        int i16 = org.telegram.messenger.qs.R1;
        int i17 = org.telegram.messenger.qs.Z1;
        int i18 = org.telegram.messenger.qs.Y1;
        if (i7 == i18 || i7 == i17 || i7 == i16 || i7 == i15) {
            String str4 = (String) objArr[0];
            this.W = 1.0f;
            if (str4.equals(this.w)) {
                org.telegram.messenger.qs.f(i13).n(this, i18);
                org.telegram.messenger.qs.f(i13).n(this, i17);
                org.telegram.messenger.qs.f(i13).n(this, i16);
                org.telegram.messenger.qs.f(i13).n(this, i15);
                this.w = null;
                if (i7 == i18 || i7 == i16) {
                    r(false, org.telegram.messenger.gc.K(this.E, null, 800.0f, 800.0f, true), null);
                    return;
                }
                this.e.w0(null);
                i30 i30Var3 = this.b;
                if (i30Var3 != null) {
                    i30Var3.T();
                    return;
                }
                return;
            }
            return;
        }
        int i19 = org.telegram.messenger.qs.c2;
        int i20 = org.telegram.messenger.qs.b2;
        int i21 = org.telegram.messenger.qs.a2;
        if (i7 == i19) {
            if (((org.telegram.messenger.ij) objArr[0]) != this.D || this.a == null) {
                return;
            }
            org.telegram.messenger.qs.f(i13).n(this, i21);
            org.telegram.messenger.qs.f(i13).n(this, i19);
            org.telegram.messenger.qs.f(i13).n(this, i20);
            c();
            return;
        }
        if (i7 != i20) {
            if (i7 == i21 && ((org.telegram.messenger.ij) objArr[0]) == this.D && (f2Var = this.a) != null) {
                this.x = (String) objArr[1];
                f2Var.getFileLoader().g0(this.x, false, false, (int) this.D.p0.q, 33554432, false);
                return;
            }
            return;
        }
        if (((org.telegram.messenger.ij) objArr[0]) != this.D || this.a == null) {
            return;
        }
        String str5 = (String) objArr[1];
        long longValue = ((Long) objArr[2]).longValue();
        long longValue2 = ((Long) objArr[3]).longValue();
        this.a.getFileLoader().n(str5, false, longValue, longValue2, null);
        if (longValue2 != 0) {
            double longValue3 = ((Long) objArr[5]).longValue() / 1000000.0d;
            if (this.P > longValue3) {
                this.P = longValue3;
            }
            Bitmap s5 = org.telegram.messenger.gz.s(str5, (long) (this.P * 1000.0d), null, true);
            if (s5 != null) {
                org.telegram.messenger.w7.G(i13);
                File J = org.telegram.messenger.w7.J(this.n, null, true, true);
                if (J != null) {
                    if (org.telegram.messenger.r2.a) {
                        org.telegram.messenger.a8.d("delete file " + J);
                    }
                    J.delete();
                }
                org.telegram.messenger.w7.G(i13);
                File J2 = org.telegram.messenger.w7.J(this.h, null, true, true);
                if (J2 != null) {
                    if (org.telegram.messenger.r2.a) {
                        org.telegram.messenger.a8.d("delete file " + J2);
                    }
                    J2.delete();
                }
                this.h = org.telegram.messenger.gc.Y(s5, 800.0f, 800.0f, 80, org.telegram.messenger.qs.r5, org.telegram.messenger.qs.r5);
                TLRPC.PhotoSize Y = org.telegram.messenger.gc.Y(s5, 150.0f, 150.0f, 80, org.telegram.messenger.qs.g2, org.telegram.messenger.qs.g2);
                this.n = Y;
                if (Y != null) {
                    try {
                        org.telegram.messenger.w7.G(i13);
                        org.telegram.messenger.gc.D().O(new BitmapDrawable(BitmapFactory.decodeFile(org.telegram.messenger.w7.J(this.n, null, true, true).getAbsolutePath())), this.n.location.volume_id + "_" + this.n.location.local_id + "@50_50", true);
                    } catch (Throwable unused) {
                    }
                }
            }
            org.telegram.messenger.qs.f(i13).n(this, i21);
            org.telegram.messenger.qs.f(i13).n(this, i19);
            org.telegram.messenger.qs.f(i13).n(this, i20);
            this.y = str5;
            this.x = str5;
            this.D = null;
        }
    }

    public final void e() {
        ps psVar;
        org.telegram.ui.ActionBar.f2 f2Var = this.a;
        if (f2Var == null || f2Var.getParentActivity() == null) {
            return;
        }
        int i7 = 1;
        if (this.c == null) {
            ci ciVar = new ci(this.a.getParentActivity(), this.a, this.R, this.S);
            this.c = ciVar;
            int i10 = this.Q ? 2 : 1;
            i30 i30Var = this.b;
            if (i30Var == null || !i30Var.x()) {
                psVar = null;
            } else {
                i30 i30Var2 = this.b;
                Objects.requireNonNull(i30Var2);
                psVar = new ps(i30Var2, i7);
            }
            ciVar.N2 = i10;
            ciVar.O2 = psVar;
            ciVar.P2 = false;
            uh uhVar = ciVar.v2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ciVar.d2;
            if (uhVar == null || uhVar == chatAttachAlertPhotoLayout) {
                ciVar.u3.setVisibility(8);
            }
            int i11 = ciVar.N2;
            TextView textView = ciVar.g3;
            if (i11 == 2) {
                textView.setText(org.telegram.messenger.id.M0(2131752121, null));
            } else {
                textView.setText(org.telegram.messenger.id.M0(2131752123, null));
            }
            if (chatAttachAlertPhotoLayout != null) {
                ci ciVar2 = chatAttachAlertPhotoLayout.b;
                chatAttachAlertPhotoLayout.g1 = (ciVar2.N2 == 0 || ciVar2.z1) ? false : true;
            }
            ci ciVar3 = this.c;
            ciVar3.W3 = new f30(this);
            ciVar3.O1 = this;
        }
        int i12 = this.U;
        if (i12 == 1) {
            this.c.g3.setText(org.telegram.messenger.id.a0("SetPhotoFor", null, 2131745518, this.L.first_name));
        } else if (i12 == 2) {
            this.c.g3.setText(org.telegram.messenger.id.a0("SuggestPhotoFor", null, 2131744406, this.L.first_name));
        }
    }

    public final boolean f(Dialog dialog) {
        ci ciVar = this.c;
        if (ciVar == null || dialog != ciVar) {
            return false;
        }
        ciVar.d2.d0(false);
        this.c.K();
        this.c.d2.g0(true);
        return true;
    }

    public final boolean g() {
        return (this.w == null && this.x == null && this.D == null) ? false : true;
    }

    public final void h(int i7, int i10, Intent intent) {
        if (i10 == -1) {
            if (i7 == 0 || i7 == 2) {
                e();
                ci ciVar = this.c;
                if (ciVar != null) {
                    ciVar.d2.j0(i7, intent, this.f);
                }
                this.f = null;
                return;
            }
            if (i7 == 13) {
                this.a.getParentActivity().overridePendingTransition(R.anim.alpha_in, R.anim.alpha_out);
                PhotoViewer.p1().H2(null, this.a, null);
                o(this.f, null, org.telegram.messenger.g0.N0(this.f), false);
                org.telegram.messenger.g0.e(this.f);
                this.f = null;
                return;
            }
            if (i7 == 14) {
                if (intent == null || intent.getData() == null) {
                    return;
                }
                org.telegram.messenger.g0.h3(new ro(21, this, intent.getData()));
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
        ci ciVar = this.c;
        if (ciVar != null) {
            ciVar.l1();
        }
    }

    public final void j(int i7, String[] strArr, int[] iArr) {
        ci ciVar = this.c;
        if (ciVar != null) {
            if (i7 == 17) {
                ciVar.d2.W(false);
                this.c.d2.b0();
            } else if (i7 == 4) {
                ciVar.d2.b0();
            }
        }
    }

    public final void k() {
        ci ciVar = this.c;
        if (ciVar != null) {
            ciVar.m1();
        }
    }

    public final void l() {
        org.telegram.ui.ActionBar.f2 f2Var = this.a;
        if (f2Var == null || f2Var.getParentActivity() == null) {
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
        org.telegram.ui.ActionBar.f2 f2Var = this.a;
        if (f2Var == null) {
            return;
        }
        Activity parentActivity = f2Var.getParentActivity();
        if (Build.VERSION.SDK_INT < 33 || parentActivity == null) {
            if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, org.telegram.messenger.qs.h2);
                return;
            }
        } else if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, org.telegram.messenger.qs.h2);
            return;
        }
        org.telegram.ui.pm0 pm0Var = new org.telegram.ui.pm0(this.Q ? 3 : 1, false, false, null);
        pm0Var.y = this.J;
        pm0Var.V = new m(this);
        this.a.presentFragment(pm0Var);
    }

    public final void n(boolean z9, final Runnable runnable, DialogInterface.OnDismissListener onDismissListener, int i7) {
        org.telegram.ui.ActionBar.p2 p2Var;
        org.telegram.ui.ActionBar.f2 f2Var = this.a;
        if (f2Var == null || f2Var.getParentActivity() == null) {
            return;
        }
        this.T = false;
        this.U = i7;
        if (this.G) {
            org.telegram.ui.ActionBar.f2 f2Var2 = this.a;
            if (f2Var2 == null || f2Var2.getParentActivity() == null) {
                return;
            }
            e();
            ci ciVar = this.c;
            ciVar.R3 = this.H;
            ciVar.y1(1, false);
            this.c.d2.i0();
            this.c.e1();
            ci ciVar2 = this.c;
            ciVar2.H0 = onDismissListener;
            int i10 = this.U;
            if (i10 != 0) {
                ciVar2.K1 = new h30(i10, this.L);
            }
            this.a.showDialog(ciVar2);
            return;
        }
        org.telegram.ui.ActionBar.w2 h = org.telegram.messenger.camera.q.h(this.a.getParentActivity(), false, 1, null);
        if (i7 == 1) {
            h.O = org.telegram.messenger.id.a0("SetPhotoFor", null, 2131745518, this.L.first_name);
            h.P = true;
        } else if (i7 == 2) {
            h.O = org.telegram.messenger.id.a0("SuggestPhotoFor", null, 2131744406, this.L.first_name);
            h.P = true;
        } else {
            h.O = org.telegram.messenger.id.M0(2131752123, null);
            h.P = true;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        org.telegram.ui.Cells.f1.t(null, 2131752113, arrayList, R.drawable.msg_camera, arrayList2);
        arrayList3.add(0);
        if (this.Q) {
            org.telegram.ui.Cells.f1.t(null, 2131752120, arrayList, R.drawable.msg_video, arrayList2);
            arrayList3.add(4);
        }
        org.telegram.ui.Cells.f1.t(null, 2131752128, arrayList, R.drawable.msg_photos, arrayList2);
        arrayList3.add(1);
        if (this.J) {
            org.telegram.ui.Cells.f1.t(null, 2131752126, arrayList, R.drawable.msg_search, arrayList2);
            arrayList3.add(2);
        }
        if (z9) {
            org.telegram.ui.Cells.f1.t(null, 2131751514, arrayList, R.drawable.msg_delete, arrayList2);
            arrayList3.add(3);
        }
        int[] iArr = new int[arrayList2.size()];
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = ((Integer) arrayList2.get(i11)).intValue();
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.e30
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                org.telegram.ui.ActionBar.f2 f2Var3;
                int intValue = ((Integer) arrayList3.get(i12)).intValue();
                j30 j30Var = j30.this;
                if (intValue == 0) {
                    j30Var.l();
                    return;
                }
                if (intValue == 1) {
                    j30Var.m();
                    return;
                }
                if (intValue == 2) {
                    j30Var.q();
                    return;
                }
                if (intValue == 3) {
                    runnable.run();
                    return;
                }
                if (intValue != 4 || (f2Var3 = j30Var.a) == null || f2Var3.getParentActivity() == null) {
                    return;
                }
                try {
                    int i13 = Build.VERSION.SDK_INT;
                    if (j30Var.a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        j30Var.a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                        return;
                    }
                    Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                    File s02 = org.telegram.messenger.g0.s0(false);
                    if (s02 != null) {
                        if (i13 >= 24) {
                            Activity parentActivity = j30Var.a.getParentActivity();
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
                        j30Var.f = s02.getAbsolutePath();
                    }
                    j30Var.a.startActivityForResult(intent, 15);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        };
        h.L = charSequenceArr;
        h.M = iArr;
        h.K = onClickListener;
        h.H0 = onDismissListener;
        this.a.showDialog(h);
        if (z9) {
            int size2 = arrayList.size() - 1;
            int i12 = org.telegram.ui.ActionBar.m6.q7;
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, i12, false);
            int i13 = org.telegram.ui.ActionBar.m6.p7;
            h.C0(size2, x02, org.telegram.ui.ActionBar.m6.x0(null, i13, false));
            int size3 = arrayList.size() - 1;
            if (size3 < 0 || size3 >= h.w0.size() || (p2Var = (org.telegram.ui.ActionBar.p2) h.w0.get(size3)) == null || p2Var.getTextView() == null || p2Var.getImageView() == null) {
                return;
            }
            org.telegram.ui.ActionBar.t6.U(p2Var.getTextView(), i12, null);
            org.telegram.ui.ActionBar.t6.s(p2Var.getImageView(), i13, null, PorterDuff.Mode.MULTIPLY);
        }
    }

    public final void o(String str, String str2, Pair pair, boolean z9) {
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(0, str, ((Integer) pair.first).intValue(), false, 0, 0);
        gfVar.n(pair);
        gfVar.b = z9;
        gfVar.c = str2;
        arrayList.add(gfVar);
        PhotoViewer.p1().H2(null, this.a, null);
        PhotoViewer.p1().e2(arrayList, 0, 1, false, new g30(this, arrayList), null);
        PhotoViewer.p1().P = true;
    }

    public final void p(String str, String str2, boolean z9) {
        o(str, str2, new Pair(0, 0), z9);
    }

    public final void q() {
        if (this.a == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.an0 an0Var = new org.telegram.ui.an0(0, null, hashMap, arrayList, 1, false, null, this.R);
        ab.q qVar = new ab.q();
        qVar.d = this;
        qVar.b = hashMap;
        qVar.c = arrayList;
        an0Var.s0 = qVar;
        an0Var.k0(1, false);
        an0Var.p0 = this.b.getInitialSearchString();
        if (this.S) {
            this.a.showAsSheet(an0Var);
        } else {
            this.a.presentFragment(an0Var);
        }
    }

    public final void r(boolean z9, Bitmap bitmap, org.telegram.messenger.ij ijVar) {
        if (bitmap == null) {
            return;
        }
        this.N = null;
        this.M = null;
        this.D = null;
        this.y = null;
        this.O = ijVar == null ? null : ijVar.s;
        this.h = org.telegram.messenger.gc.Y(bitmap, 800.0f, 800.0f, 80, org.telegram.messenger.qs.r5, org.telegram.messenger.qs.r5);
        TLRPC.PhotoSize Y = org.telegram.messenger.gc.Y(bitmap, 150.0f, 150.0f, 80, org.telegram.messenger.qs.g2, org.telegram.messenger.qs.g2);
        this.n = Y;
        int i7 = this.d;
        if (Y != null) {
            try {
                org.telegram.messenger.w7.G(i7);
                Bitmap decodeFile = BitmapFactory.decodeFile(org.telegram.messenger.w7.J(this.n, null, true, true).getAbsolutePath());
                this.r = decodeFile;
                org.telegram.messenger.gc.D().O(new BitmapDrawable(decodeFile), this.n.location.volume_id + "_" + this.n.location.local_id + "@50_50", true);
            } catch (Throwable unused) {
            }
        }
        bitmap.recycle();
        if (this.h != null) {
            org.telegram.messenger.p10.i(i7).v(false);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(org.telegram.messenger.w7.z(4));
            sb2.append("/");
            sb2.append(this.h.location.volume_id);
            sb2.append("_");
            this.w = a8.p0.n(this.h.location.local_id, ".jpg", sb2);
            if (this.K) {
                if (ijVar == null || ijVar.p0 == null) {
                    i30 i30Var = this.b;
                    if (i30Var != null) {
                        i30Var.O(z9, false);
                    }
                    this.s = false;
                } else {
                    if (this.I && !org.telegram.messenger.qp.s1(i7).u7) {
                        i30 i30Var2 = this.b;
                        if (i30Var2 != null) {
                            i30Var2.O(z9, true);
                        }
                        i30 i30Var3 = this.b;
                        if (i30Var3 != null) {
                            i30Var3.U(null, null, 0.0d, null, this.h, this.n, this.s, null);
                            this.b.U(null, null, this.P, this.y, this.h, this.n, this.s, this.O);
                            c();
                            return;
                        }
                        return;
                    }
                    this.D = ijVar;
                    org.telegram.messenger.j20 j20Var = ijVar.p0;
                    long j3 = j20Var.a;
                    if (j3 < 0) {
                        j3 = 0;
                    }
                    this.P = (j20Var.c - j3) / 1000000.0d;
                    j20Var.Z = false;
                    org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.a2);
                    org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.c2);
                    org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.b2);
                    MediaController.B().h0(ijVar, true, true, false);
                    this.w = null;
                    i30 i30Var4 = this.b;
                    if (i30Var4 != null) {
                        i30Var4.O(z9, true);
                    }
                    this.s = true;
                }
                org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.U1);
                org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.W1);
                org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.V1);
                if (this.w != null) {
                    org.telegram.messenger.w7.G(i7).h0(false, 16777216, this.w, true);
                }
            }
            i30 i30Var5 = this.b;
            if (i30Var5 != null) {
                i30Var5.U(null, null, 0.0d, null, this.h, this.n, this.s, null);
            }
        }
    }

    public final void s(org.telegram.messenger.gf gfVar) {
        Bitmap K;
        String str = gfVar.h;
        if (str == null) {
            str = gfVar.I;
        }
        org.telegram.messenger.ij ijVar = null;
        if ((gfVar.b || gfVar.s != null) && !gfVar.d()) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 0;
            tL_message.message = "";
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.action = new TLRPC.TL_messageActionEmpty();
            tL_message.dialog_id = 0L;
            org.telegram.messenger.ij ijVar2 = new org.telegram.messenger.ij(org.telegram.messenger.p10.s0, tL_message, false, false);
            ijVar2.k.attachPath = new File(org.telegram.messenger.w7.z(4), org.telegram.messenger.iz.p() + "_avatar.mp4").getAbsolutePath();
            ijVar2.p0 = gfVar.s;
            ijVar2.s = gfVar.S;
            K = org.telegram.messenger.gc.K(gfVar.c, null, 800.0f, 800.0f, true);
            ijVar = ijVar2;
        } else {
            K = org.telegram.messenger.gc.K(str, null, 800.0f, 800.0f, true);
        }
        r(false, K, ijVar);
    }
}
