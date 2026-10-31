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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b40 implements org.telegram.messenger.us, org.telegram.ui.ao0 {
    public org.telegram.messenger.jj D;
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
    public org.telegram.ui.ActionBar.k2 a;
    public a40 b;
    public bi c;
    public String f;
    public TLRPC.PhotoSize h;
    public TLRPC.PhotoSize n;
    public Bitmap r;
    public boolean s;
    public String w;
    public String x;
    public String y;
    public final int d = org.telegram.messenger.d20.s0;
    public boolean G = true;
    public boolean J = true;
    public boolean K = true;
    public final ImageReceiver e = new ImageReceiver(null);

    public b40(int i10, boolean z10, boolean z11) {
        this.Q = z10;
        this.I = z11;
        this.V = i10;
    }

    public static void a(b40 b40Var, boolean z10, ArrayList arrayList) {
        org.telegram.messenger.jj jjVar;
        Bitmap K;
        ImageReceiver imageReceiver = b40Var.e;
        int i10 = b40Var.d;
        if (arrayList.isEmpty()) {
            return;
        }
        org.telegram.messenger.pz pzVar = (org.telegram.messenger.pz) arrayList.get(0);
        Bitmap bitmap = null;
        if ((pzVar.o || pzVar.k != null) && !pzVar.p) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 0;
            tL_message.message = "";
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.action = new TLRPC.TL_messageActionEmpty();
            tL_message.dialog_id = 0L;
            jjVar = new org.telegram.messenger.jj(org.telegram.messenger.d20.s0, tL_message, false, false);
            jjVar.k.attachPath = new File(org.telegram.messenger.b8.z(4), org.telegram.messenger.tz.p() + "_avatar.mp4").getAbsolutePath();
            jjVar.p0 = pzVar.k;
            jjVar.s = pzVar.v;
            bitmap = org.telegram.messenger.hc.K(pzVar.e, null, 800.0f, 800.0f, true);
        } else {
            String str = pzVar.c;
            if (str != null) {
                K = org.telegram.messenger.hc.K(str, null, 800.0f, 800.0f, true);
            } else {
                org.telegram.messenger.hf hfVar = pzVar.l;
                if (hfVar != null) {
                    TLRPC.Photo photo = hfVar.K;
                    if (photo != null) {
                        TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(photo.sizes, org.telegram.messenger.i0.Z0(false), false, null, false);
                        if (w9 != null) {
                            org.telegram.messenger.b8.G(i10);
                            File K2 = org.telegram.messenger.b8.K(w9, null, true, true);
                            b40Var.E = K2.getAbsolutePath();
                            if (!K2.exists()) {
                                org.telegram.messenger.b8.G(i10);
                                K2 = org.telegram.messenger.b8.K(w9, null, false, true);
                                if (!K2.exists()) {
                                    K2 = null;
                                }
                            }
                            if (K2 != null) {
                                K = org.telegram.messenger.hc.K(K2.getAbsolutePath(), null, 800.0f, 800.0f, true);
                            } else {
                                org.telegram.messenger.zs.f(i10).b(b40Var, org.telegram.messenger.zs.Y1);
                                org.telegram.messenger.zs.f(i10).b(b40Var, org.telegram.messenger.zs.Z1);
                                b40Var.w = org.telegram.messenger.b8.r(null, w9.location);
                                imageReceiver.q0(org.telegram.messenger.ic.i(w9, pzVar.l.K), null, null, "jpg", null, 1);
                            }
                        }
                        K = null;
                    } else if (hfVar.C != null) {
                        File file = new File(org.telegram.messenger.b8.z(4), Utilities.a(pzVar.l.C) + "." + org.telegram.messenger.hc.B(pzVar.l.C, "jpg"));
                        b40Var.E = file.getAbsolutePath();
                        if (!file.exists() || file.length() == 0) {
                            b40Var.w = pzVar.l.C;
                            org.telegram.messenger.zs.f(i10).b(b40Var, org.telegram.messenger.zs.R1);
                            org.telegram.messenger.zs.f(i10).b(b40Var, org.telegram.messenger.zs.S1);
                            imageReceiver.o0(pzVar.l.C, null, null, "jpg", 1L);
                        } else {
                            K = org.telegram.messenger.hc.K(file.getAbsolutePath(), null, 800.0f, 800.0f, true);
                        }
                    }
                }
                jjVar = null;
            }
            jjVar = null;
            bitmap = K;
        }
        b40Var.r(z10, bitmap, jjVar);
    }

    public final void b() {
        this.T = true;
        String str = this.w;
        int i10 = this.d;
        if (str != null) {
            org.telegram.messenger.b8.G(i10).b(this.w, false);
        }
        if (this.x != null) {
            org.telegram.messenger.b8.G(i10).b(this.x, false);
        }
        a40 a40Var = this.b;
        if (a40Var != null) {
            a40Var.T();
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
        bi biVar = this.c;
        if (biVar != null) {
            biVar.L();
            this.c.i1();
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a40 a40Var;
        org.telegram.ui.ActionBar.k2 k2Var;
        int i12 = org.telegram.messenger.zs.W1;
        int i13 = org.telegram.messenger.zs.V1;
        int i14 = this.d;
        int i15 = org.telegram.messenger.zs.U1;
        if (i10 == i15 || i10 == i13) {
            String str = (String) objArr[0];
            if (str.equals(this.w)) {
                this.w = null;
                if (i10 == i15) {
                    this.M = (TLRPC.InputFile) objArr[1];
                }
            } else {
                if (!str.equals(this.x)) {
                    return;
                }
                this.x = null;
                if (i10 == i15) {
                    this.N = (TLRPC.InputFile) objArr[1];
                }
            }
            if (this.w == null && this.x == null && this.D == null) {
                org.telegram.messenger.zs.f(i14).n(this, i15);
                org.telegram.messenger.zs.f(i14).n(this, i12);
                org.telegram.messenger.zs.f(i14).n(this, i13);
                if (i10 == i15 && (a40Var = this.b) != null) {
                    a40Var.U(this.M, this.N, this.P, this.y, this.h, this.n, this.s, this.O);
                }
                c();
                return;
            }
            return;
        }
        if (i10 == i12) {
            String str2 = (String) objArr[0];
            String str3 = this.D != null ? this.x : this.w;
            if (this.b == null || !str2.equals(str3)) {
                return;
            }
            float min = Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue());
            a40 a40Var2 = this.b;
            this.W = min;
            a40Var2.H(min);
            return;
        }
        int i16 = org.telegram.messenger.zs.S1;
        int i17 = org.telegram.messenger.zs.R1;
        int i18 = org.telegram.messenger.zs.Z1;
        int i19 = org.telegram.messenger.zs.Y1;
        if (i10 == i19 || i10 == i18 || i10 == i17 || i10 == i16) {
            String str4 = (String) objArr[0];
            this.W = 1.0f;
            if (str4.equals(this.w)) {
                org.telegram.messenger.zs.f(i14).n(this, i19);
                org.telegram.messenger.zs.f(i14).n(this, i18);
                org.telegram.messenger.zs.f(i14).n(this, i17);
                org.telegram.messenger.zs.f(i14).n(this, i16);
                this.w = null;
                if (i10 == i19 || i10 == i17) {
                    r(false, org.telegram.messenger.hc.K(this.E, null, 800.0f, 800.0f, true), null);
                    return;
                }
                this.e.w0(null);
                a40 a40Var3 = this.b;
                if (a40Var3 != null) {
                    a40Var3.T();
                    return;
                }
                return;
            }
            return;
        }
        int i20 = org.telegram.messenger.zs.c2;
        int i21 = org.telegram.messenger.zs.b2;
        int i22 = org.telegram.messenger.zs.a2;
        if (i10 == i20) {
            if (((org.telegram.messenger.jj) objArr[0]) != this.D || this.a == null) {
                return;
            }
            org.telegram.messenger.zs.f(i14).n(this, i22);
            org.telegram.messenger.zs.f(i14).n(this, i20);
            org.telegram.messenger.zs.f(i14).n(this, i21);
            c();
            return;
        }
        if (i10 != i21) {
            if (i10 == i22 && ((org.telegram.messenger.jj) objArr[0]) == this.D && (k2Var = this.a) != null) {
                this.x = (String) objArr[1];
                k2Var.getFileLoader().h0(this.x, false, false, (int) this.D.p0.q, 33554432, false);
                return;
            }
            return;
        }
        if (((org.telegram.messenger.jj) objArr[0]) != this.D || this.a == null) {
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
            Bitmap s10 = org.telegram.messenger.qz.s(str5, (long) (this.P * 1000.0d), null, true);
            if (s10 != null) {
                org.telegram.messenger.b8.G(i14);
                File K = org.telegram.messenger.b8.K(this.n, null, true, true);
                if (K != null) {
                    if (org.telegram.messenger.v2.a) {
                        org.telegram.messenger.f8.d("delete file " + K);
                    }
                    K.delete();
                }
                org.telegram.messenger.b8.G(i14);
                File K2 = org.telegram.messenger.b8.K(this.h, null, true, true);
                if (K2 != null) {
                    if (org.telegram.messenger.v2.a) {
                        org.telegram.messenger.f8.d("delete file " + K2);
                    }
                    K2.delete();
                }
                this.h = org.telegram.messenger.hc.Y(s10, 800.0f, 800.0f, 80, org.telegram.messenger.zs.r5, org.telegram.messenger.zs.r5);
                TLRPC.PhotoSize Y = org.telegram.messenger.hc.Y(s10, 150.0f, 150.0f, 80, org.telegram.messenger.zs.g2, org.telegram.messenger.zs.g2);
                this.n = Y;
                if (Y != null) {
                    try {
                        org.telegram.messenger.b8.G(i14);
                        org.telegram.messenger.hc.D().O(new BitmapDrawable(BitmapFactory.decodeFile(org.telegram.messenger.b8.K(this.n, null, true, true).getAbsolutePath())), this.n.location.volume_id + "_" + this.n.location.local_id + "@50_50", true);
                    } catch (Throwable unused) {
                    }
                }
            }
            org.telegram.messenger.zs.f(i14).n(this, i22);
            org.telegram.messenger.zs.f(i14).n(this, i20);
            org.telegram.messenger.zs.f(i14).n(this, i21);
            this.y = str5;
            this.x = str5;
            this.D = null;
        }
    }

    public final void e() {
        ct ctVar;
        org.telegram.ui.ActionBar.k2 k2Var = this.a;
        if (k2Var == null || k2Var.getParentActivity() == null) {
            return;
        }
        int i10 = 1;
        if (this.c == null) {
            bi biVar = new bi(this.a.getParentActivity(), this.a, this.R, this.S);
            this.c = biVar;
            int i11 = this.Q ? 2 : 1;
            a40 a40Var = this.b;
            if (a40Var == null || !a40Var.x()) {
                ctVar = null;
            } else {
                a40 a40Var2 = this.b;
                Objects.requireNonNull(a40Var2);
                ctVar = new ct(a40Var2, i10);
            }
            biVar.K2 = i11;
            biVar.L2 = ctVar;
            biVar.M2 = false;
            uh uhVar = biVar.s2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar.a2;
            if (uhVar == null || uhVar == chatAttachAlertPhotoLayout) {
                biVar.r3.setVisibility(8);
            }
            int i12 = biVar.K2;
            TextView textView = biVar.d3;
            if (i12 == 2) {
                textView.setText(org.telegram.messenger.cd.L0(2131752121, null));
            } else {
                textView.setText(org.telegram.messenger.cd.L0(2131752123, null));
            }
            if (chatAttachAlertPhotoLayout != null) {
                bi biVar2 = chatAttachAlertPhotoLayout.b;
                chatAttachAlertPhotoLayout.g1 = (biVar2.K2 == 0 || biVar2.w1) ? false : true;
            }
            bi biVar3 = this.c;
            biVar3.T3 = new x30(this);
            biVar3.L1 = this;
        }
        int i13 = this.U;
        if (i13 == 1) {
            this.c.d3.setText(org.telegram.messenger.cd.a0("SetPhotoFor", null, 2131745535, this.L.first_name));
        } else if (i13 == 2) {
            this.c.d3.setText(org.telegram.messenger.cd.a0("SuggestPhotoFor", null, 2131744432, this.L.first_name));
        }
    }

    public final boolean f(Dialog dialog) {
        bi biVar = this.c;
        if (biVar == null || dialog != biVar) {
            return false;
        }
        biVar.a2.b0(false);
        this.c.L();
        this.c.a2.e0(true);
        return true;
    }

    public final boolean g() {
        return (this.w == null && this.x == null && this.D == null) ? false : true;
    }

    public final void h(int i10, int i11, Intent intent) {
        if (i11 == -1) {
            if (i10 == 0 || i10 == 2) {
                e();
                bi biVar = this.c;
                if (biVar != null) {
                    biVar.a2.h0(i10, intent, this.f);
                }
                this.f = null;
                return;
            }
            if (i10 == 13) {
                this.a.getParentActivity().overridePendingTransition(R.anim.alpha_in, R.anim.alpha_out);
                PhotoViewer.v1().N2(null, this.a, null);
                o(this.f, null, org.telegram.messenger.i0.N0(this.f), false);
                org.telegram.messenger.i0.e(this.f);
                this.f = null;
                return;
            }
            int i12 = 14;
            if (i10 == 14) {
                if (intent == null || intent.getData() == null) {
                    return;
                }
                org.telegram.messenger.i0.g3(new at(i12, this, intent.getData()));
                return;
            }
            if (i10 == 15) {
                p(this.f, null, true);
                org.telegram.messenger.i0.e(this.f);
                this.f = null;
            }
        }
    }

    public final void i() {
        bi biVar = this.c;
        if (biVar != null) {
            biVar.k1();
        }
    }

    public final void j(int i10, String[] strArr, int[] iArr) {
        bi biVar = this.c;
        if (biVar != null) {
            if (i10 == 17) {
                biVar.a2.V(false);
                this.c.a2.Z();
            } else if (i10 == 4) {
                biVar.a2.Z();
            }
        }
    }

    public final void k() {
        bi biVar = this.c;
        if (biVar != null) {
            biVar.l1();
        }
    }

    public final void l() {
        org.telegram.ui.ActionBar.k2 k2Var = this.a;
        if (k2Var == null || k2Var.getParentActivity() == null) {
            return;
        }
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (this.a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                this.a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                return;
            }
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            File q02 = org.telegram.messenger.i0.q0(null, false);
            if (q02 != null) {
                if (i10 >= 24) {
                    Activity parentActivity = this.a.getParentActivity();
                    org.telegram.messenger.w0.d();
                    intent.putExtra("output", FileProvider.d(parentActivity, "org.telegram.messenger.beta.provider", q02));
                    intent.addFlags(2);
                    intent.addFlags(1);
                } else {
                    intent.putExtra("output", Uri.fromFile(q02));
                }
                this.f = q02.getAbsolutePath();
            }
            this.a.startActivityForResult(intent, 13);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void m() {
        org.telegram.ui.ActionBar.k2 k2Var = this.a;
        if (k2Var == null) {
            return;
        }
        Activity parentActivity = k2Var.getParentActivity();
        if (Build.VERSION.SDK_INT < 33 || parentActivity == null) {
            if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, org.telegram.messenger.zs.h2);
                return;
            }
        } else if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, org.telegram.messenger.zs.h2);
            return;
        }
        org.telegram.ui.yn0 yn0Var = new org.telegram.ui.yn0(this.Q ? 3 : 1, false, false, null);
        yn0Var.y = this.J;
        yn0Var.V = new l2.f(this, 16);
        this.a.presentFragment(yn0Var);
    }

    public final void n(boolean z10, final Runnable runnable, DialogInterface.OnDismissListener onDismissListener, int i10) {
        org.telegram.ui.ActionBar.s2 s2Var;
        org.telegram.ui.ActionBar.k2 k2Var = this.a;
        if (k2Var == null || k2Var.getParentActivity() == null) {
            return;
        }
        this.T = false;
        this.U = i10;
        if (this.G) {
            org.telegram.ui.ActionBar.k2 k2Var2 = this.a;
            if (k2Var2 == null || k2Var2.getParentActivity() == null) {
                return;
            }
            e();
            bi biVar = this.c;
            biVar.O3 = this.H;
            biVar.x1(1, false);
            this.c.a2.g0();
            this.c.d1();
            bi biVar2 = this.c;
            biVar2.H0 = onDismissListener;
            int i11 = this.U;
            if (i11 != 0) {
                biVar2.H1 = new z30(i11, this.L);
            }
            this.a.showDialog(biVar2);
            return;
        }
        org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.z20.h(this.a.getParentActivity(), false, 1, null);
        if (i10 == 1) {
            h.O = org.telegram.messenger.cd.a0("SetPhotoFor", null, 2131745535, this.L.first_name);
            h.P = true;
        } else if (i10 == 2) {
            h.O = org.telegram.messenger.cd.a0("SuggestPhotoFor", null, 2131744432, this.L.first_name);
            h.P = true;
        } else {
            h.O = org.telegram.messenger.cd.L0(2131752123, null);
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
        if (z10) {
            org.telegram.ui.Cells.f1.t(null, 2131751515, arrayList, R.drawable.msg_delete, arrayList2);
            arrayList3.add(3);
        }
        int[] iArr = new int[arrayList2.size()];
        int size = arrayList2.size();
        for (int i12 = 0; i12 < size; i12++) {
            iArr[i12] = ((Integer) arrayList2.get(i12)).intValue();
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.w30
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i13) {
                org.telegram.ui.ActionBar.k2 k2Var3;
                int intValue = ((Integer) arrayList3.get(i13)).intValue();
                b40 b40Var = b40.this;
                if (intValue == 0) {
                    b40Var.l();
                    return;
                }
                if (intValue == 1) {
                    b40Var.m();
                    return;
                }
                if (intValue == 2) {
                    b40Var.q();
                    return;
                }
                if (intValue == 3) {
                    runnable.run();
                    return;
                }
                if (intValue != 4 || (k2Var3 = b40Var.a) == null || k2Var3.getParentActivity() == null) {
                    return;
                }
                try {
                    int i14 = Build.VERSION.SDK_INT;
                    if (b40Var.a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        b40Var.a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                        return;
                    }
                    Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                    File s02 = org.telegram.messenger.i0.s0(false);
                    if (s02 != null) {
                        if (i14 >= 24) {
                            Activity parentActivity = b40Var.a.getParentActivity();
                            org.telegram.messenger.w0.d();
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
                        b40Var.f = s02.getAbsolutePath();
                    }
                    b40Var.a.startActivityForResult(intent, 15);
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
        };
        h.L = charSequenceArr;
        h.M = iArr;
        h.K = onClickListener;
        h.H0 = onDismissListener;
        this.a.showDialog(h);
        if (z10) {
            int size2 = arrayList.size() - 1;
            int i13 = org.telegram.ui.ActionBar.t6.q7;
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, i13, false);
            int i14 = org.telegram.ui.ActionBar.t6.p7;
            h.C0(size2, x02, org.telegram.ui.ActionBar.t6.x0(null, i14, false));
            int size3 = arrayList.size() - 1;
            if (size3 < 0 || size3 >= h.w0.size() || (s2Var = (org.telegram.ui.ActionBar.s2) h.w0.get(size3)) == null || s2Var.getTextView() == null || s2Var.getImageView() == null) {
                return;
            }
            org.telegram.ui.ActionBar.a7.V(s2Var.getTextView(), i13, null);
            org.telegram.ui.ActionBar.a7.t(s2Var.getImageView(), i14, null, PorterDuff.Mode.MULTIPLY);
        }
    }

    public final void o(String str, String str2, Pair pair, boolean z10) {
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, str, ((Integer) pair.first).intValue(), false, 0, 0);
        efVar.k(pair);
        efVar.b = z10;
        efVar.c = str2;
        arrayList.add(efVar);
        PhotoViewer.v1().N2(null, this.a, null);
        PhotoViewer.v1().j2(arrayList, 0, 1, false, new y30(this, arrayList), null);
        PhotoViewer.v1().P = true;
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
        org.telegram.ui.lo0 lo0Var = new org.telegram.ui.lo0(0, null, hashMap, arrayList, 1, false, null, this.R);
        ac.a aVar = new ac.a();
        aVar.d = this;
        aVar.b = hashMap;
        aVar.c = arrayList;
        lo0Var.s0 = aVar;
        lo0Var.j0(1, false);
        lo0Var.p0 = this.b.getInitialSearchString();
        if (this.S) {
            this.a.showAsSheet(lo0Var);
        } else {
            this.a.presentFragment(lo0Var);
        }
    }

    public final void r(boolean z10, Bitmap bitmap, org.telegram.messenger.jj jjVar) {
        if (bitmap == null) {
            return;
        }
        this.N = null;
        this.M = null;
        this.D = null;
        this.y = null;
        this.O = jjVar == null ? null : jjVar.s;
        this.h = org.telegram.messenger.hc.Y(bitmap, 800.0f, 800.0f, 80, org.telegram.messenger.zs.r5, org.telegram.messenger.zs.r5);
        TLRPC.PhotoSize Y = org.telegram.messenger.hc.Y(bitmap, 150.0f, 150.0f, 80, org.telegram.messenger.zs.g2, org.telegram.messenger.zs.g2);
        this.n = Y;
        int i10 = this.d;
        if (Y != null) {
            try {
                org.telegram.messenger.b8.G(i10);
                Bitmap decodeFile = BitmapFactory.decodeFile(org.telegram.messenger.b8.K(this.n, null, true, true).getAbsolutePath());
                this.r = decodeFile;
                org.telegram.messenger.hc.D().O(new BitmapDrawable(decodeFile), this.n.location.volume_id + "_" + this.n.location.local_id + "@50_50", true);
            } catch (Throwable unused) {
            }
        }
        bitmap.recycle();
        if (this.h != null) {
            org.telegram.messenger.d20.i(i10).v(false);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(org.telegram.messenger.b8.z(4));
            sb2.append("/");
            sb2.append(this.h.location.volume_id);
            sb2.append("_");
            this.w = a1.g.p(sb2, this.h.location.local_id, ".jpg");
            if (this.K) {
                if (jjVar == null || jjVar.p0 == null) {
                    a40 a40Var = this.b;
                    if (a40Var != null) {
                        a40Var.O(z10, false);
                    }
                    this.s = false;
                } else {
                    if (this.I && !org.telegram.messenger.vp.r1(i10).v7) {
                        a40 a40Var2 = this.b;
                        if (a40Var2 != null) {
                            a40Var2.O(z10, true);
                        }
                        a40 a40Var3 = this.b;
                        if (a40Var3 != null) {
                            a40Var3.U(null, null, 0.0d, null, this.h, this.n, this.s, null);
                            this.b.U(null, null, this.P, this.y, this.h, this.n, this.s, this.O);
                            c();
                            return;
                        }
                        return;
                    }
                    this.D = jjVar;
                    org.telegram.messenger.x20 x20Var = jjVar.p0;
                    long j10 = x20Var.a;
                    if (j10 < 0) {
                        j10 = 0;
                    }
                    this.P = (x20Var.c - j10) / 1000000.0d;
                    x20Var.Z = false;
                    org.telegram.messenger.zs.f(i10).b(this, org.telegram.messenger.zs.a2);
                    org.telegram.messenger.zs.f(i10).b(this, org.telegram.messenger.zs.c2);
                    org.telegram.messenger.zs.f(i10).b(this, org.telegram.messenger.zs.b2);
                    MediaController.B().h0(jjVar, true, true, false);
                    this.w = null;
                    a40 a40Var4 = this.b;
                    if (a40Var4 != null) {
                        a40Var4.O(z10, true);
                    }
                    this.s = true;
                }
                org.telegram.messenger.zs.f(i10).b(this, org.telegram.messenger.zs.U1);
                org.telegram.messenger.zs.f(i10).b(this, org.telegram.messenger.zs.W1);
                org.telegram.messenger.zs.f(i10).b(this, org.telegram.messenger.zs.V1);
                if (this.w != null) {
                    org.telegram.messenger.b8.G(i10).i0(false, 16777216, this.w, true);
                }
            }
            a40 a40Var5 = this.b;
            if (a40Var5 != null) {
                a40Var5.U(null, null, 0.0d, null, this.h, this.n, this.s, null);
            }
        }
    }

    public final void s(org.telegram.messenger.ef efVar) {
        Bitmap K;
        String str = efVar.h;
        if (str == null) {
            str = efVar.I;
        }
        org.telegram.messenger.jj jjVar = null;
        if ((efVar.b || efVar.s != null) && !efVar.d()) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 0;
            tL_message.message = "";
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.action = new TLRPC.TL_messageActionEmpty();
            tL_message.dialog_id = 0L;
            org.telegram.messenger.jj jjVar2 = new org.telegram.messenger.jj(org.telegram.messenger.d20.s0, tL_message, false, false);
            jjVar2.k.attachPath = new File(org.telegram.messenger.b8.z(4), org.telegram.messenger.tz.p() + "_avatar.mp4").getAbsolutePath();
            jjVar2.p0 = efVar.s;
            jjVar2.s = efVar.S;
            K = org.telegram.messenger.hc.K(efVar.c, null, 800.0f, 800.0f, true);
            jjVar = jjVar2;
        } else {
            K = org.telegram.messenger.hc.K(str, null, 800.0f, 800.0f, true);
        }
        r(false, K, jjVar);
    }
}
