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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f30 implements org.telegram.messenger.cs, org.telegram.ui.jm0 {
    public org.telegram.messenger.zi E;
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
    public org.telegram.ui.ActionBar.d2 a;
    public e30 b;
    public bi c;
    public String f;
    public TLRPC.PhotoSize h;
    public TLRPC.PhotoSize n;
    public Bitmap r;
    public boolean s;
    public String w;
    public String x;
    public String y;
    public final int d = org.telegram.messenger.h10.t0;
    public boolean H = true;
    public boolean K = true;
    public boolean L = true;
    public final ImageReceiver e = new ImageReceiver(null);

    public f30(int i3, boolean z10, boolean z11) {
        this.R = z10;
        this.J = z11;
        this.W = i3;
    }

    public static void a(f30 f30Var, boolean z10, ArrayList arrayList) {
        org.telegram.messenger.zi ziVar;
        Bitmap K;
        ImageReceiver imageReceiver = f30Var.e;
        int i3 = f30Var.d;
        if (arrayList.isEmpty()) {
            return;
        }
        org.telegram.messenger.xy xyVar = (org.telegram.messenger.xy) arrayList.get(0);
        Bitmap bitmap = null;
        if ((xyVar.o || xyVar.k != null) && !xyVar.p) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 0;
            tL_message.message = "";
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.action = new TLRPC.TL_messageActionEmpty();
            tL_message.dialog_id = 0L;
            ziVar = new org.telegram.messenger.zi(org.telegram.messenger.h10.t0, tL_message, false, false);
            ziVar.k.attachPath = new File(org.telegram.messenger.w7.z(4), org.telegram.messenger.az.p() + "_avatar.mp4").getAbsolutePath();
            ziVar.p0 = xyVar.k;
            ziVar.s = xyVar.v;
            bitmap = org.telegram.messenger.zb.K(xyVar.e, null, 800.0f, 800.0f, true);
        } else {
            String str = xyVar.c;
            if (str != null) {
                K = org.telegram.messenger.zb.K(str, null, 800.0f, 800.0f, true);
            } else {
                org.telegram.messenger.bf bfVar = xyVar.l;
                if (bfVar != null) {
                    TLRPC.Photo photo = bfVar.K;
                    if (photo != null) {
                        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
                        if (w10 != null) {
                            org.telegram.messenger.w7.G(i3);
                            File K2 = org.telegram.messenger.w7.K(w10, null, true, true);
                            f30Var.F = K2.getAbsolutePath();
                            if (!K2.exists()) {
                                org.telegram.messenger.w7.G(i3);
                                K2 = org.telegram.messenger.w7.K(w10, null, false, true);
                                if (!K2.exists()) {
                                    K2 = null;
                                }
                            }
                            if (K2 != null) {
                                K = org.telegram.messenger.zb.K(K2.getAbsolutePath(), null, 800.0f, 800.0f, true);
                            } else {
                                org.telegram.messenger.hs.f(i3).b(f30Var, org.telegram.messenger.hs.Y1);
                                org.telegram.messenger.hs.f(i3).b(f30Var, org.telegram.messenger.hs.Z1);
                                f30Var.w = org.telegram.messenger.w7.r(null, w10.location);
                                imageReceiver.q0(org.telegram.messenger.ac.i(w10, xyVar.l.K), null, null, "jpg", null, 1);
                            }
                        }
                        K = null;
                    } else if (bfVar.C != null) {
                        File file = new File(org.telegram.messenger.w7.z(4), Utilities.a(xyVar.l.C) + "." + org.telegram.messenger.zb.B(xyVar.l.C, "jpg"));
                        f30Var.F = file.getAbsolutePath();
                        if (!file.exists() || file.length() == 0) {
                            f30Var.w = xyVar.l.C;
                            org.telegram.messenger.hs.f(i3).b(f30Var, org.telegram.messenger.hs.R1);
                            org.telegram.messenger.hs.f(i3).b(f30Var, org.telegram.messenger.hs.S1);
                            imageReceiver.o0(xyVar.l.C, null, null, "jpg", 1L);
                        } else {
                            K = org.telegram.messenger.zb.K(file.getAbsolutePath(), null, 800.0f, 800.0f, true);
                        }
                    }
                }
                ziVar = null;
            }
            ziVar = null;
            bitmap = K;
        }
        f30Var.r(z10, bitmap, ziVar);
    }

    public final void b() {
        this.U = true;
        String str = this.w;
        int i3 = this.d;
        if (str != null) {
            org.telegram.messenger.w7.G(i3).b(this.w, false);
        }
        if (this.x != null) {
            org.telegram.messenger.w7.G(i3).b(this.x, false);
        }
        e30 e30Var = this.b;
        if (e30Var != null) {
            e30Var.T();
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
        bi biVar = this.c;
        if (biVar != null) {
            biVar.K();
            this.c.j1();
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        e30 e30Var;
        org.telegram.ui.ActionBar.d2 d2Var;
        int i11 = org.telegram.messenger.hs.W1;
        int i12 = org.telegram.messenger.hs.V1;
        int i13 = this.d;
        int i14 = org.telegram.messenger.hs.U1;
        if (i3 == i14 || i3 == i12) {
            String str = (String) objArr[0];
            if (str.equals(this.w)) {
                this.w = null;
                if (i3 == i14) {
                    this.N = (TLRPC.InputFile) objArr[1];
                }
            } else {
                if (!str.equals(this.x)) {
                    return;
                }
                this.x = null;
                if (i3 == i14) {
                    this.O = (TLRPC.InputFile) objArr[1];
                }
            }
            if (this.w == null && this.x == null && this.E == null) {
                org.telegram.messenger.hs.f(i13).n(this, i14);
                org.telegram.messenger.hs.f(i13).n(this, i11);
                org.telegram.messenger.hs.f(i13).n(this, i12);
                if (i3 == i14 && (e30Var = this.b) != null) {
                    e30Var.U(this.N, this.O, this.Q, this.y, this.h, this.n, this.s, this.P);
                }
                c();
                return;
            }
            return;
        }
        if (i3 == i11) {
            String str2 = (String) objArr[0];
            String str3 = this.E != null ? this.x : this.w;
            if (this.b == null || !str2.equals(str3)) {
                return;
            }
            float min = Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue());
            e30 e30Var2 = this.b;
            this.X = min;
            e30Var2.H(min);
            return;
        }
        int i15 = org.telegram.messenger.hs.S1;
        int i16 = org.telegram.messenger.hs.R1;
        int i17 = org.telegram.messenger.hs.Z1;
        int i18 = org.telegram.messenger.hs.Y1;
        if (i3 == i18 || i3 == i17 || i3 == i16 || i3 == i15) {
            String str4 = (String) objArr[0];
            this.X = 1.0f;
            if (str4.equals(this.w)) {
                org.telegram.messenger.hs.f(i13).n(this, i18);
                org.telegram.messenger.hs.f(i13).n(this, i17);
                org.telegram.messenger.hs.f(i13).n(this, i16);
                org.telegram.messenger.hs.f(i13).n(this, i15);
                this.w = null;
                if (i3 == i18 || i3 == i16) {
                    r(false, org.telegram.messenger.zb.K(this.F, null, 800.0f, 800.0f, true), null);
                    return;
                }
                this.e.w0(null);
                e30 e30Var3 = this.b;
                if (e30Var3 != null) {
                    e30Var3.T();
                    return;
                }
                return;
            }
            return;
        }
        int i19 = org.telegram.messenger.hs.c2;
        int i20 = org.telegram.messenger.hs.b2;
        int i21 = org.telegram.messenger.hs.a2;
        if (i3 == i19) {
            if (((org.telegram.messenger.zi) objArr[0]) != this.E || this.a == null) {
                return;
            }
            org.telegram.messenger.hs.f(i13).n(this, i21);
            org.telegram.messenger.hs.f(i13).n(this, i19);
            org.telegram.messenger.hs.f(i13).n(this, i20);
            c();
            return;
        }
        if (i3 != i20) {
            if (i3 == i21 && ((org.telegram.messenger.zi) objArr[0]) == this.E && (d2Var = this.a) != null) {
                this.x = (String) objArr[1];
                d2Var.getFileLoader().h0(this.x, false, false, (int) this.E.p0.q, 33554432, false);
                return;
            }
            return;
        }
        if (((org.telegram.messenger.zi) objArr[0]) != this.E || this.a == null) {
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
            Bitmap s6 = org.telegram.messenger.yy.s(str5, (long) (this.Q * 1000.0d), null, true);
            if (s6 != null) {
                org.telegram.messenger.w7.G(i13);
                File K = org.telegram.messenger.w7.K(this.n, null, true, true);
                if (K != null) {
                    if (org.telegram.messenger.r2.a) {
                        org.telegram.messenger.a8.d("delete file " + K);
                    }
                    K.delete();
                }
                org.telegram.messenger.w7.G(i13);
                File K2 = org.telegram.messenger.w7.K(this.h, null, true, true);
                if (K2 != null) {
                    if (org.telegram.messenger.r2.a) {
                        org.telegram.messenger.a8.d("delete file " + K2);
                    }
                    K2.delete();
                }
                this.h = org.telegram.messenger.zb.Y(s6, 800.0f, 800.0f, 80, org.telegram.messenger.hs.r5, org.telegram.messenger.hs.r5);
                TLRPC.PhotoSize Y = org.telegram.messenger.zb.Y(s6, 150.0f, 150.0f, 80, org.telegram.messenger.hs.g2, org.telegram.messenger.hs.g2);
                this.n = Y;
                if (Y != null) {
                    try {
                        org.telegram.messenger.w7.G(i13);
                        org.telegram.messenger.zb.D().O(new BitmapDrawable(BitmapFactory.decodeFile(org.telegram.messenger.w7.K(this.n, null, true, true).getAbsolutePath())), this.n.location.volume_id + "_" + this.n.location.local_id + "@50_50", true);
                    } catch (Throwable unused) {
                    }
                }
            }
            org.telegram.messenger.hs.f(i13).n(this, i21);
            org.telegram.messenger.hs.f(i13).n(this, i19);
            org.telegram.messenger.hs.f(i13).n(this, i20);
            this.y = str5;
            this.x = str5;
            this.E = null;
        }
    }

    public final void e() {
        qs qsVar;
        org.telegram.ui.ActionBar.d2 d2Var = this.a;
        if (d2Var == null || d2Var.getParentActivity() == null) {
            return;
        }
        int i3 = 1;
        if (this.c == null) {
            bi biVar = new bi(this.a.getParentActivity(), this.a, this.S, this.T);
            this.c = biVar;
            int i10 = this.R ? 2 : 1;
            e30 e30Var = this.b;
            if (e30Var == null || !e30Var.x()) {
                qsVar = null;
            } else {
                e30 e30Var2 = this.b;
                Objects.requireNonNull(e30Var2);
                qsVar = new qs(e30Var2, i3);
            }
            biVar.L2 = i10;
            biVar.M2 = qsVar;
            biVar.N2 = false;
            th thVar = biVar.t2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar.b2;
            if (thVar == null || thVar == chatAttachAlertPhotoLayout) {
                biVar.s3.setVisibility(8);
            }
            int i11 = biVar.L2;
            TextView textView = biVar.e3;
            if (i11 == 2) {
                textView.setText(org.telegram.messenger.bd.M0(2131752121, null));
            } else {
                textView.setText(org.telegram.messenger.bd.M0(2131752123, null));
            }
            if (chatAttachAlertPhotoLayout != null) {
                bi biVar2 = chatAttachAlertPhotoLayout.b;
                chatAttachAlertPhotoLayout.h1 = (biVar2.L2 == 0 || biVar2.x1) ? false : true;
            }
            bi biVar3 = this.c;
            biVar3.U3 = new b30(this);
            biVar3.M1 = this;
        }
        int i12 = this.V;
        if (i12 == 1) {
            this.c.e3.setText(org.telegram.messenger.bd.a0("SetPhotoFor", null, 2131745528, this.M.first_name));
        } else if (i12 == 2) {
            this.c.e3.setText(org.telegram.messenger.bd.a0("SuggestPhotoFor", null, 2131744416, this.M.first_name));
        }
    }

    public final boolean f(Dialog dialog) {
        bi biVar = this.c;
        if (biVar == null || dialog != biVar) {
            return false;
        }
        biVar.b2.d0(false);
        this.c.K();
        this.c.b2.g0(true);
        return true;
    }

    public final boolean g() {
        return (this.w == null && this.x == null && this.E == null) ? false : true;
    }

    public final void h(int i3, int i10, Intent intent) {
        if (i10 == -1) {
            if (i3 == 0 || i3 == 2) {
                e();
                bi biVar = this.c;
                if (biVar != null) {
                    biVar.b2.j0(i3, intent, this.f);
                }
                this.f = null;
                return;
            }
            if (i3 == 13) {
                this.a.getParentActivity().overridePendingTransition(R.anim.alpha_in, R.anim.alpha_out);
                PhotoViewer.v1().N2(null, this.a, null);
                o(this.f, null, org.telegram.messenger.g0.N0(this.f), false);
                org.telegram.messenger.g0.e(this.f);
                this.f = null;
                return;
            }
            if (i3 == 14) {
                if (intent == null || intent.getData() == null) {
                    return;
                }
                org.telegram.messenger.g0.h3(new cl(25, this, intent.getData()));
                return;
            }
            if (i3 == 15) {
                p(this.f, null, true);
                org.telegram.messenger.g0.e(this.f);
                this.f = null;
            }
        }
    }

    public final void i() {
        bi biVar = this.c;
        if (biVar != null) {
            biVar.l1();
        }
    }

    public final void j(int i3, String[] strArr, int[] iArr) {
        bi biVar = this.c;
        if (biVar != null) {
            if (i3 == 17) {
                biVar.b2.W(false);
                this.c.b2.b0();
            } else if (i3 == 4) {
                biVar.b2.b0();
            }
        }
    }

    public final void k() {
        bi biVar = this.c;
        if (biVar != null) {
            biVar.m1();
        }
    }

    public final void l() {
        org.telegram.ui.ActionBar.d2 d2Var = this.a;
        if (d2Var == null || d2Var.getParentActivity() == null) {
            return;
        }
        try {
            int i3 = Build.VERSION.SDK_INT;
            if (this.a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                this.a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                return;
            }
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            File q02 = org.telegram.messenger.g0.q0(null, false);
            if (q02 != null) {
                if (i3 >= 24) {
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
        org.telegram.ui.ActionBar.d2 d2Var = this.a;
        if (d2Var == null) {
            return;
        }
        Activity parentActivity = d2Var.getParentActivity();
        if (Build.VERSION.SDK_INT < 33 || parentActivity == null) {
            if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, org.telegram.messenger.hs.h2);
                return;
            }
        } else if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, org.telegram.messenger.hs.h2);
            return;
        }
        org.telegram.ui.hm0 hm0Var = new org.telegram.ui.hm0(this.R ? 3 : 1, false, false, null);
        hm0Var.y = this.K;
        hm0Var.W = new nh(this, 2);
        this.a.presentFragment(hm0Var);
    }

    public final void n(boolean z10, final Runnable runnable, DialogInterface.OnDismissListener onDismissListener, int i3) {
        org.telegram.ui.ActionBar.m2 m2Var;
        org.telegram.ui.ActionBar.d2 d2Var = this.a;
        if (d2Var == null || d2Var.getParentActivity() == null) {
            return;
        }
        this.U = false;
        this.V = i3;
        if (this.H) {
            org.telegram.ui.ActionBar.d2 d2Var2 = this.a;
            if (d2Var2 == null || d2Var2.getParentActivity() == null) {
                return;
            }
            e();
            bi biVar = this.c;
            biVar.P3 = this.I;
            biVar.y1(1, false);
            this.c.b2.i0();
            this.c.e1();
            bi biVar2 = this.c;
            biVar2.I0 = onDismissListener;
            int i10 = this.V;
            if (i10 != 0) {
                biVar2.I1 = new d30(i10, this.M);
            }
            this.a.showDialog(biVar2);
            return;
        }
        org.telegram.ui.ActionBar.t2 h = org.telegram.messenger.camera.q.h(this.a.getParentActivity(), false, 1, null);
        if (i3 == 1) {
            h.P = org.telegram.messenger.bd.a0("SetPhotoFor", null, 2131745528, this.M.first_name);
            h.Q = true;
        } else if (i3 == 2) {
            h.P = org.telegram.messenger.bd.a0("SuggestPhotoFor", null, 2131744416, this.M.first_name);
            h.Q = true;
        } else {
            h.P = org.telegram.messenger.bd.M0(2131752123, null);
            h.Q = true;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        org.telegram.ui.Cells.f1.x(null, 2131752113, arrayList, R.drawable.msg_camera, arrayList2);
        arrayList3.add(0);
        if (this.R) {
            org.telegram.ui.Cells.f1.x(null, 2131752120, arrayList, R.drawable.msg_video, arrayList2);
            arrayList3.add(4);
        }
        org.telegram.ui.Cells.f1.x(null, 2131752128, arrayList, R.drawable.msg_photos, arrayList2);
        arrayList3.add(1);
        if (this.K) {
            org.telegram.ui.Cells.f1.x(null, 2131752126, arrayList, R.drawable.msg_search, arrayList2);
            arrayList3.add(2);
        }
        if (z10) {
            org.telegram.ui.Cells.f1.x(null, 2131751515, arrayList, R.drawable.msg_delete, arrayList2);
            arrayList3.add(3);
        }
        int[] iArr = new int[arrayList2.size()];
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = ((Integer) arrayList2.get(i11)).intValue();
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.a30
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                org.telegram.ui.ActionBar.d2 d2Var3;
                int intValue = ((Integer) arrayList3.get(i12)).intValue();
                f30 f30Var = f30.this;
                if (intValue == 0) {
                    f30Var.l();
                    return;
                }
                if (intValue == 1) {
                    f30Var.m();
                    return;
                }
                if (intValue == 2) {
                    f30Var.q();
                    return;
                }
                if (intValue == 3) {
                    runnable.run();
                    return;
                }
                if (intValue != 4 || (d2Var3 = f30Var.a) == null || d2Var3.getParentActivity() == null) {
                    return;
                }
                try {
                    int i13 = Build.VERSION.SDK_INT;
                    if (f30Var.a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        f30Var.a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                        return;
                    }
                    Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                    File s02 = org.telegram.messenger.g0.s0(false);
                    if (s02 != null) {
                        if (i13 >= 24) {
                            Activity parentActivity = f30Var.a.getParentActivity();
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
                        f30Var.f = s02.getAbsolutePath();
                    }
                    f30Var.a.startActivityForResult(intent, 15);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        };
        h.M = charSequenceArr;
        h.N = iArr;
        h.L = onClickListener;
        h.I0 = onDismissListener;
        this.a.showDialog(h);
        if (z10) {
            int size2 = arrayList.size() - 1;
            int i12 = org.telegram.ui.ActionBar.k6.q7;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i12, false);
            int i13 = org.telegram.ui.ActionBar.k6.p7;
            h.C0(size2, x02, org.telegram.ui.ActionBar.k6.x0(null, i13, false));
            int size3 = arrayList.size() - 1;
            if (size3 < 0 || size3 >= h.x0.size() || (m2Var = (org.telegram.ui.ActionBar.m2) h.x0.get(size3)) == null || m2Var.getTextView() == null || m2Var.getImageView() == null) {
                return;
            }
            org.telegram.ui.ActionBar.r6.V(m2Var.getTextView(), i12, null);
            org.telegram.ui.ActionBar.r6.t(m2Var.getImageView(), i13, null, PorterDuff.Mode.MULTIPLY);
        }
    }

    public final void o(String str, String str2, Pair pair, boolean z10) {
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.ye yeVar = new org.telegram.messenger.ye(0, str, ((Integer) pair.first).intValue(), false, 0, 0);
        yeVar.n(pair);
        yeVar.b = z10;
        yeVar.c = str2;
        arrayList.add(yeVar);
        PhotoViewer.v1().N2(null, this.a, null);
        PhotoViewer.v1().j2(arrayList, 0, 1, false, new c30(this, arrayList), null);
        PhotoViewer.v1().Q = true;
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
        org.telegram.ui.sm0 sm0Var = new org.telegram.ui.sm0(0, null, hashMap, arrayList, 1, false, null, this.S);
        b4.n nVar = new b4.n();
        nVar.d = this;
        nVar.b = hashMap;
        nVar.c = arrayList;
        sm0Var.t0 = nVar;
        sm0Var.k0(1, false);
        sm0Var.q0 = this.b.getInitialSearchString();
        if (this.T) {
            this.a.showAsSheet(sm0Var);
        } else {
            this.a.presentFragment(sm0Var);
        }
    }

    public final void r(boolean z10, Bitmap bitmap, org.telegram.messenger.zi ziVar) {
        if (bitmap == null) {
            return;
        }
        this.O = null;
        this.N = null;
        this.E = null;
        this.y = null;
        this.P = ziVar == null ? null : ziVar.s;
        this.h = org.telegram.messenger.zb.Y(bitmap, 800.0f, 800.0f, 80, org.telegram.messenger.hs.r5, org.telegram.messenger.hs.r5);
        TLRPC.PhotoSize Y = org.telegram.messenger.zb.Y(bitmap, 150.0f, 150.0f, 80, org.telegram.messenger.hs.g2, org.telegram.messenger.hs.g2);
        this.n = Y;
        int i3 = this.d;
        if (Y != null) {
            try {
                org.telegram.messenger.w7.G(i3);
                Bitmap decodeFile = BitmapFactory.decodeFile(org.telegram.messenger.w7.K(this.n, null, true, true).getAbsolutePath());
                this.r = decodeFile;
                org.telegram.messenger.zb.D().O(new BitmapDrawable(decodeFile), this.n.location.volume_id + "_" + this.n.location.local_id + "@50_50", true);
            } catch (Throwable unused) {
            }
        }
        bitmap.recycle();
        if (this.h != null) {
            org.telegram.messenger.h10.i(i3).v(false);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(org.telegram.messenger.w7.z(4));
            sb2.append("/");
            sb2.append(this.h.location.volume_id);
            sb2.append("_");
            this.w = a1.g.o(this.h.location.local_id, ".jpg", sb2);
            if (this.L) {
                if (ziVar == null || ziVar.p0 == null) {
                    e30 e30Var = this.b;
                    if (e30Var != null) {
                        e30Var.O(z10, false);
                    }
                    this.s = false;
                } else {
                    if (this.J && !org.telegram.messenger.hp.s1(i3).u7) {
                        e30 e30Var2 = this.b;
                        if (e30Var2 != null) {
                            e30Var2.O(z10, true);
                        }
                        e30 e30Var3 = this.b;
                        if (e30Var3 != null) {
                            e30Var3.U(null, null, 0.0d, null, this.h, this.n, this.s, null);
                            this.b.U(null, null, this.Q, this.y, this.h, this.n, this.s, this.P);
                            c();
                            return;
                        }
                        return;
                    }
                    this.E = ziVar;
                    org.telegram.messenger.b20 b20Var = ziVar.p0;
                    long j10 = b20Var.a;
                    if (j10 < 0) {
                        j10 = 0;
                    }
                    this.Q = (b20Var.c - j10) / 1000000.0d;
                    b20Var.Z = false;
                    org.telegram.messenger.hs.f(i3).b(this, org.telegram.messenger.hs.a2);
                    org.telegram.messenger.hs.f(i3).b(this, org.telegram.messenger.hs.c2);
                    org.telegram.messenger.hs.f(i3).b(this, org.telegram.messenger.hs.b2);
                    MediaController.B().h0(ziVar, true, true, false);
                    this.w = null;
                    e30 e30Var4 = this.b;
                    if (e30Var4 != null) {
                        e30Var4.O(z10, true);
                    }
                    this.s = true;
                }
                org.telegram.messenger.hs.f(i3).b(this, org.telegram.messenger.hs.U1);
                org.telegram.messenger.hs.f(i3).b(this, org.telegram.messenger.hs.W1);
                org.telegram.messenger.hs.f(i3).b(this, org.telegram.messenger.hs.V1);
                if (this.w != null) {
                    org.telegram.messenger.w7.G(i3).i0(false, 16777216, this.w, true);
                }
            }
            e30 e30Var5 = this.b;
            if (e30Var5 != null) {
                e30Var5.U(null, null, 0.0d, null, this.h, this.n, this.s, null);
            }
        }
    }

    public final void s(org.telegram.messenger.ye yeVar) {
        Bitmap K;
        String str = yeVar.h;
        if (str == null) {
            str = yeVar.I;
        }
        org.telegram.messenger.zi ziVar = null;
        if ((yeVar.b || yeVar.s != null) && !yeVar.d()) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 0;
            tL_message.message = "";
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.action = new TLRPC.TL_messageActionEmpty();
            tL_message.dialog_id = 0L;
            org.telegram.messenger.zi ziVar2 = new org.telegram.messenger.zi(org.telegram.messenger.h10.t0, tL_message, false, false);
            ziVar2.k.attachPath = new File(org.telegram.messenger.w7.z(4), org.telegram.messenger.az.p() + "_avatar.mp4").getAbsolutePath();
            ziVar2.p0 = yeVar.s;
            ziVar2.s = yeVar.S;
            K = org.telegram.messenger.zb.K(yeVar.c, null, 800.0f, 800.0f, true);
            ziVar = ziVar2;
        } else {
            K = org.telegram.messenger.zb.K(str, null, 800.0f, 800.0f, true);
        }
        r(false, K, ziVar);
    }
}
