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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class m30 implements org.telegram.messenger.is, org.telegram.ui.pm0 {
    public org.telegram.messenger.gj E;
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
    public org.telegram.ui.ActionBar.e2 a;
    public l30 b;
    public ki c;
    public String f;
    public TLRPC.PhotoSize h;
    public TLRPC.PhotoSize n;
    public Bitmap r;
    public boolean s;
    public String w;
    public String x;
    public String y;
    public final int d = org.telegram.messenger.m10.t0;
    public boolean H = true;
    public boolean K = true;
    public boolean L = true;
    public final ImageReceiver e = new ImageReceiver(null);

    public m30(int i7, boolean z10, boolean z11) {
        this.R = z10;
        this.J = z11;
        this.W = i7;
    }

    public static void a(m30 m30Var, boolean z10, ArrayList arrayList) {
        org.telegram.messenger.gj gjVar;
        Bitmap K;
        ImageReceiver imageReceiver = m30Var.e;
        int i7 = m30Var.d;
        if (arrayList.isEmpty()) {
            return;
        }
        org.telegram.messenger.dz dzVar = (org.telegram.messenger.dz) arrayList.get(0);
        Bitmap bitmap = null;
        if ((dzVar.o || dzVar.k != null) && !dzVar.p) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 0;
            tL_message.message = "";
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.action = new TLRPC.TL_messageActionEmpty();
            tL_message.dialog_id = 0L;
            gjVar = new org.telegram.messenger.gj(org.telegram.messenger.m10.t0, tL_message, false, false);
            gjVar.k.attachPath = new File(org.telegram.messenger.w7.z(4), org.telegram.messenger.gz.p() + "_avatar.mp4").getAbsolutePath();
            gjVar.r0 = dzVar.k;
            gjVar.s = dzVar.v;
            bitmap = org.telegram.messenger.fc.K(dzVar.e, null, 800.0f, 800.0f, true);
        } else {
            String str = dzVar.c;
            if (str != null) {
                K = org.telegram.messenger.fc.K(str, null, 800.0f, 800.0f, true);
            } else {
                org.telegram.messenger.jf jfVar = dzVar.l;
                if (jfVar != null) {
                    TLRPC.Photo photo = jfVar.K;
                    if (photo != null) {
                        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
                        if (w10 != null) {
                            org.telegram.messenger.w7.G(i7);
                            File J = org.telegram.messenger.w7.J(w10, null, true, true);
                            m30Var.F = J.getAbsolutePath();
                            if (!J.exists()) {
                                org.telegram.messenger.w7.G(i7);
                                J = org.telegram.messenger.w7.J(w10, null, false, true);
                                if (!J.exists()) {
                                    J = null;
                                }
                            }
                            if (J != null) {
                                K = org.telegram.messenger.fc.K(J.getAbsolutePath(), null, 800.0f, 800.0f, true);
                            } else {
                                org.telegram.messenger.ns.f(i7).b(m30Var, org.telegram.messenger.ns.Y1);
                                org.telegram.messenger.ns.f(i7).b(m30Var, org.telegram.messenger.ns.Z1);
                                m30Var.w = org.telegram.messenger.w7.r(null, w10.location);
                                imageReceiver.q0(org.telegram.messenger.gc.i(w10, dzVar.l.K), null, null, "jpg", null, 1);
                            }
                        }
                        K = null;
                    } else if (jfVar.C != null) {
                        File file = new File(org.telegram.messenger.w7.z(4), Utilities.a(dzVar.l.C) + "." + org.telegram.messenger.fc.B(dzVar.l.C, "jpg"));
                        m30Var.F = file.getAbsolutePath();
                        if (!file.exists() || file.length() == 0) {
                            m30Var.w = dzVar.l.C;
                            org.telegram.messenger.ns.f(i7).b(m30Var, org.telegram.messenger.ns.R1);
                            org.telegram.messenger.ns.f(i7).b(m30Var, org.telegram.messenger.ns.S1);
                            imageReceiver.o0(dzVar.l.C, null, null, "jpg", 1L);
                        } else {
                            K = org.telegram.messenger.fc.K(file.getAbsolutePath(), null, 800.0f, 800.0f, true);
                        }
                    }
                }
                gjVar = null;
            }
            gjVar = null;
            bitmap = K;
        }
        m30Var.r(z10, bitmap, gjVar);
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
        l30 l30Var = this.b;
        if (l30Var != null) {
            l30Var.U();
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
        ki kiVar = this.c;
        if (kiVar != null) {
            kiVar.L();
            this.c.j1();
        }
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        l30 l30Var;
        org.telegram.ui.ActionBar.e2 e2Var;
        int i11 = org.telegram.messenger.ns.W1;
        int i12 = org.telegram.messenger.ns.V1;
        int i13 = this.d;
        int i14 = org.telegram.messenger.ns.U1;
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
                org.telegram.messenger.ns.f(i13).n(this, i14);
                org.telegram.messenger.ns.f(i13).n(this, i11);
                org.telegram.messenger.ns.f(i13).n(this, i12);
                if (i7 == i14 && (l30Var = this.b) != null) {
                    l30Var.V(this.N, this.O, this.Q, this.y, this.h, this.n, this.s, this.P);
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
            l30 l30Var2 = this.b;
            this.X = min;
            l30Var2.I(min);
            return;
        }
        int i15 = org.telegram.messenger.ns.S1;
        int i16 = org.telegram.messenger.ns.R1;
        int i17 = org.telegram.messenger.ns.Z1;
        int i18 = org.telegram.messenger.ns.Y1;
        if (i7 == i18 || i7 == i17 || i7 == i16 || i7 == i15) {
            String str4 = (String) objArr[0];
            this.X = 1.0f;
            if (str4.equals(this.w)) {
                org.telegram.messenger.ns.f(i13).n(this, i18);
                org.telegram.messenger.ns.f(i13).n(this, i17);
                org.telegram.messenger.ns.f(i13).n(this, i16);
                org.telegram.messenger.ns.f(i13).n(this, i15);
                this.w = null;
                if (i7 == i18 || i7 == i16) {
                    r(false, org.telegram.messenger.fc.K(this.F, null, 800.0f, 800.0f, true), null);
                    return;
                }
                this.e.w0(null);
                l30 l30Var3 = this.b;
                if (l30Var3 != null) {
                    l30Var3.U();
                    return;
                }
                return;
            }
            return;
        }
        int i19 = org.telegram.messenger.ns.c2;
        int i20 = org.telegram.messenger.ns.b2;
        int i21 = org.telegram.messenger.ns.a2;
        if (i7 == i19) {
            if (((org.telegram.messenger.gj) objArr[0]) != this.E || this.a == null) {
                return;
            }
            org.telegram.messenger.ns.f(i13).n(this, i21);
            org.telegram.messenger.ns.f(i13).n(this, i19);
            org.telegram.messenger.ns.f(i13).n(this, i20);
            c();
            return;
        }
        if (i7 != i20) {
            if (i7 == i21 && ((org.telegram.messenger.gj) objArr[0]) == this.E && (e2Var = this.a) != null) {
                this.x = (String) objArr[1];
                e2Var.getFileLoader().g0(this.x, false, false, (int) this.E.r0.q, 33554432, false);
                return;
            }
            return;
        }
        if (((org.telegram.messenger.gj) objArr[0]) != this.E || this.a == null) {
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
            Bitmap s5 = org.telegram.messenger.ez.s(str5, (long) (this.Q * 1000.0d), null, true);
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
                this.h = org.telegram.messenger.fc.Y(s5, 800.0f, 800.0f, 80, org.telegram.messenger.ns.r5, org.telegram.messenger.ns.r5);
                TLRPC.PhotoSize Y = org.telegram.messenger.fc.Y(s5, 150.0f, 150.0f, 80, org.telegram.messenger.ns.g2, org.telegram.messenger.ns.g2);
                this.n = Y;
                if (Y != null) {
                    try {
                        org.telegram.messenger.w7.G(i13);
                        org.telegram.messenger.fc.D().O(new BitmapDrawable(BitmapFactory.decodeFile(org.telegram.messenger.w7.J(this.n, null, true, true).getAbsolutePath())), this.n.location.volume_id + "_" + this.n.location.local_id + "@50_50", true);
                    } catch (Throwable unused) {
                    }
                }
            }
            org.telegram.messenger.ns.f(i13).n(this, i21);
            org.telegram.messenger.ns.f(i13).n(this, i19);
            org.telegram.messenger.ns.f(i13).n(this, i20);
            this.y = str5;
            this.x = str5;
            this.E = null;
        }
    }

    public final void e() {
        xs xsVar;
        org.telegram.ui.ActionBar.e2 e2Var = this.a;
        if (e2Var == null || e2Var.getParentActivity() == null) {
            return;
        }
        int i7 = 1;
        if (this.c == null) {
            ki kiVar = new ki(this.a.getParentActivity(), this.a, this.S, this.T);
            this.c = kiVar;
            int i10 = this.R ? 2 : 1;
            l30 l30Var = this.b;
            if (l30Var == null || !l30Var.x()) {
                xsVar = null;
            } else {
                l30 l30Var2 = this.b;
                Objects.requireNonNull(l30Var2);
                xsVar = new xs(l30Var2, i7);
            }
            kiVar.O2 = i10;
            kiVar.P2 = xsVar;
            kiVar.Q2 = false;
            ci ciVar = kiVar.w2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar.e2;
            if (ciVar == null || ciVar == chatAttachAlertPhotoLayout) {
                kiVar.v3.setVisibility(8);
            }
            int i11 = kiVar.O2;
            TextView textView = kiVar.h3;
            if (i11 == 2) {
                textView.setText(org.telegram.messenger.hd.M0(2131752121, null));
            } else {
                textView.setText(org.telegram.messenger.hd.M0(2131752123, null));
            }
            if (chatAttachAlertPhotoLayout != null) {
                ki kiVar2 = chatAttachAlertPhotoLayout.b;
                chatAttachAlertPhotoLayout.h1 = (kiVar2.O2 == 0 || kiVar2.A1) ? false : true;
            }
            ki kiVar3 = this.c;
            kiVar3.X3 = new i30(this);
            kiVar3.P1 = this;
        }
        int i12 = this.V;
        if (i12 == 1) {
            this.c.h3.setText(org.telegram.messenger.hd.a0("SetPhotoFor", null, 2131745518, this.M.first_name));
        } else if (i12 == 2) {
            this.c.h3.setText(org.telegram.messenger.hd.a0("SuggestPhotoFor", null, 2131744406, this.M.first_name));
        }
    }

    public final boolean f(Dialog dialog) {
        ki kiVar = this.c;
        if (kiVar == null || dialog != kiVar) {
            return false;
        }
        kiVar.e2.d0(false);
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
                ki kiVar = this.c;
                if (kiVar != null) {
                    kiVar.e2.j0(i7, intent, this.f);
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
            int i11 = 14;
            if (i7 == 14) {
                if (intent == null || intent.getData() == null) {
                    return;
                }
                org.telegram.messenger.g0.h3(new vs(i11, this, intent.getData()));
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
        ki kiVar = this.c;
        if (kiVar != null) {
            kiVar.l1();
        }
    }

    public final void j(int i7, String[] strArr, int[] iArr) {
        ki kiVar = this.c;
        if (kiVar != null) {
            if (i7 == 17) {
                kiVar.e2.X(false);
                this.c.e2.b0();
            } else if (i7 == 4) {
                kiVar.e2.b0();
            }
        }
    }

    public final void k() {
        ki kiVar = this.c;
        if (kiVar != null) {
            kiVar.m1();
        }
    }

    public final void l() {
        org.telegram.ui.ActionBar.e2 e2Var = this.a;
        if (e2Var == null || e2Var.getParentActivity() == null) {
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
        org.telegram.ui.ActionBar.e2 e2Var = this.a;
        if (e2Var == null) {
            return;
        }
        Activity parentActivity = e2Var.getParentActivity();
        if (Build.VERSION.SDK_INT < 33 || parentActivity == null) {
            if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, org.telegram.messenger.ns.h2);
                return;
            }
        } else if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, org.telegram.messenger.ns.h2);
            return;
        }
        org.telegram.ui.nm0 nm0Var = new org.telegram.ui.nm0(this.R ? 3 : 1, false, false, null);
        nm0Var.y = this.K;
        nm0Var.W = new cf(this);
        this.a.presentFragment(nm0Var);
    }

    public final void n(boolean z10, final Runnable runnable, DialogInterface.OnDismissListener onDismissListener, int i7) {
        org.telegram.ui.ActionBar.n2 n2Var;
        org.telegram.ui.ActionBar.e2 e2Var = this.a;
        if (e2Var == null || e2Var.getParentActivity() == null) {
            return;
        }
        this.U = false;
        this.V = i7;
        if (this.H) {
            org.telegram.ui.ActionBar.e2 e2Var2 = this.a;
            if (e2Var2 == null || e2Var2.getParentActivity() == null) {
                return;
            }
            e();
            ki kiVar = this.c;
            kiVar.S3 = this.I;
            kiVar.y1(1, false);
            this.c.e2.i0();
            this.c.e1();
            ki kiVar2 = this.c;
            kiVar2.I0 = onDismissListener;
            int i10 = this.V;
            if (i10 != 0) {
                kiVar2.L1 = new k30(i10, this.M);
            }
            this.a.showDialog(kiVar2);
            return;
        }
        org.telegram.ui.ActionBar.u2 i11 = org.telegram.messenger.i20.i(this.a.getParentActivity(), false, 1, null);
        if (i7 == 1) {
            i11.P = org.telegram.messenger.hd.a0("SetPhotoFor", null, 2131745518, this.M.first_name);
            i11.Q = true;
        } else if (i7 == 2) {
            i11.P = org.telegram.messenger.hd.a0("SuggestPhotoFor", null, 2131744406, this.M.first_name);
            i11.Q = true;
        } else {
            i11.P = org.telegram.messenger.hd.M0(2131752123, null);
            i11.Q = true;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        org.telegram.ui.Cells.y0.s(null, 2131752113, arrayList, R.drawable.msg_camera, arrayList2);
        arrayList3.add(0);
        if (this.R) {
            org.telegram.ui.Cells.y0.s(null, 2131752120, arrayList, R.drawable.msg_video, arrayList2);
            arrayList3.add(4);
        }
        org.telegram.ui.Cells.y0.s(null, 2131752128, arrayList, R.drawable.msg_photos, arrayList2);
        arrayList3.add(1);
        if (this.K) {
            org.telegram.ui.Cells.y0.s(null, 2131752126, arrayList, R.drawable.msg_search, arrayList2);
            arrayList3.add(2);
        }
        if (z10) {
            org.telegram.ui.Cells.y0.s(null, 2131751514, arrayList, R.drawable.msg_delete, arrayList2);
            arrayList3.add(3);
        }
        int[] iArr = new int[arrayList2.size()];
        int size = arrayList2.size();
        for (int i12 = 0; i12 < size; i12++) {
            iArr[i12] = ((Integer) arrayList2.get(i12)).intValue();
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.h30
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i13) {
                org.telegram.ui.ActionBar.e2 e2Var3;
                int intValue = ((Integer) arrayList3.get(i13)).intValue();
                m30 m30Var = m30.this;
                if (intValue == 0) {
                    m30Var.l();
                    return;
                }
                if (intValue == 1) {
                    m30Var.m();
                    return;
                }
                if (intValue == 2) {
                    m30Var.q();
                    return;
                }
                if (intValue == 3) {
                    runnable.run();
                    return;
                }
                if (intValue != 4 || (e2Var3 = m30Var.a) == null || e2Var3.getParentActivity() == null) {
                    return;
                }
                try {
                    int i14 = Build.VERSION.SDK_INT;
                    if (m30Var.a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        m30Var.a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                        return;
                    }
                    Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                    File s02 = org.telegram.messenger.g0.s0(false);
                    if (s02 != null) {
                        if (i14 >= 24) {
                            Activity parentActivity = m30Var.a.getParentActivity();
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
                        m30Var.f = s02.getAbsolutePath();
                    }
                    m30Var.a.startActivityForResult(intent, 15);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        };
        i11.M = charSequenceArr;
        i11.N = iArr;
        i11.L = onClickListener;
        i11.I0 = onDismissListener;
        this.a.showDialog(i11);
        if (z10) {
            int size2 = arrayList.size() - 1;
            int i13 = org.telegram.ui.ActionBar.j6.q7;
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, i13, false);
            int i14 = org.telegram.ui.ActionBar.j6.p7;
            i11.C0(size2, x02, org.telegram.ui.ActionBar.j6.x0(null, i14, false));
            int size3 = arrayList.size() - 1;
            if (size3 < 0 || size3 >= i11.x0.size() || (n2Var = (org.telegram.ui.ActionBar.n2) i11.x0.get(size3)) == null || n2Var.getTextView() == null || n2Var.getImageView() == null) {
                return;
            }
            org.telegram.ui.ActionBar.q6.U(n2Var.getTextView(), i13, null);
            org.telegram.ui.ActionBar.q6.s(n2Var.getImageView(), i14, null, PorterDuff.Mode.MULTIPLY);
        }
    }

    public final void o(String str, String str2, Pair pair, boolean z10) {
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, str, ((Integer) pair.first).intValue(), false, 0, 0);
        ffVar.n(pair);
        ffVar.b = z10;
        ffVar.c = str2;
        arrayList.add(ffVar);
        PhotoViewer.p1().I2(null, this.a, null);
        PhotoViewer.p1().f2(arrayList, 0, 1, false, new j30(this, arrayList), null);
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
        org.telegram.ui.ym0 ym0Var = new org.telegram.ui.ym0(0, null, hashMap, arrayList, 1, false, null, this.S);
        ab.q qVar = new ab.q();
        qVar.d = this;
        qVar.b = hashMap;
        qVar.c = arrayList;
        ym0Var.t0 = qVar;
        ym0Var.k0(1, false);
        ym0Var.q0 = this.b.getInitialSearchString();
        if (this.T) {
            this.a.showAsSheet(ym0Var);
        } else {
            this.a.presentFragment(ym0Var);
        }
    }

    public final void r(boolean z10, Bitmap bitmap, org.telegram.messenger.gj gjVar) {
        if (bitmap == null) {
            return;
        }
        this.O = null;
        this.N = null;
        this.E = null;
        this.y = null;
        this.P = gjVar == null ? null : gjVar.s;
        this.h = org.telegram.messenger.fc.Y(bitmap, 800.0f, 800.0f, 80, org.telegram.messenger.ns.r5, org.telegram.messenger.ns.r5);
        TLRPC.PhotoSize Y = org.telegram.messenger.fc.Y(bitmap, 150.0f, 150.0f, 80, org.telegram.messenger.ns.g2, org.telegram.messenger.ns.g2);
        this.n = Y;
        int i7 = this.d;
        if (Y != null) {
            try {
                org.telegram.messenger.w7.G(i7);
                Bitmap decodeFile = BitmapFactory.decodeFile(org.telegram.messenger.w7.J(this.n, null, true, true).getAbsolutePath());
                this.r = decodeFile;
                org.telegram.messenger.fc.D().O(new BitmapDrawable(decodeFile), this.n.location.volume_id + "_" + this.n.location.local_id + "@50_50", true);
            } catch (Throwable unused) {
            }
        }
        bitmap.recycle();
        if (this.h != null) {
            org.telegram.messenger.m10.i(i7).v(false);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(org.telegram.messenger.w7.z(4));
            sb2.append("/");
            sb2.append(this.h.location.volume_id);
            sb2.append("_");
            this.w = a8.p0.n(this.h.location.local_id, ".jpg", sb2);
            if (this.L) {
                if (gjVar == null || gjVar.r0 == null) {
                    l30 l30Var = this.b;
                    if (l30Var != null) {
                        l30Var.O(z10, false);
                    }
                    this.s = false;
                } else {
                    if (this.J && !org.telegram.messenger.np.s1(i7).v7) {
                        l30 l30Var2 = this.b;
                        if (l30Var2 != null) {
                            l30Var2.O(z10, true);
                        }
                        l30 l30Var3 = this.b;
                        if (l30Var3 != null) {
                            l30Var3.V(null, null, 0.0d, null, this.h, this.n, this.s, null);
                            this.b.V(null, null, this.Q, this.y, this.h, this.n, this.s, this.P);
                            c();
                            return;
                        }
                        return;
                    }
                    this.E = gjVar;
                    org.telegram.messenger.g20 g20Var = gjVar.r0;
                    long j3 = g20Var.a;
                    if (j3 < 0) {
                        j3 = 0;
                    }
                    this.Q = (g20Var.c - j3) / 1000000.0d;
                    g20Var.Z = false;
                    org.telegram.messenger.ns.f(i7).b(this, org.telegram.messenger.ns.a2);
                    org.telegram.messenger.ns.f(i7).b(this, org.telegram.messenger.ns.c2);
                    org.telegram.messenger.ns.f(i7).b(this, org.telegram.messenger.ns.b2);
                    MediaController.B().h0(gjVar, true, true, false);
                    this.w = null;
                    l30 l30Var4 = this.b;
                    if (l30Var4 != null) {
                        l30Var4.O(z10, true);
                    }
                    this.s = true;
                }
                org.telegram.messenger.ns.f(i7).b(this, org.telegram.messenger.ns.U1);
                org.telegram.messenger.ns.f(i7).b(this, org.telegram.messenger.ns.W1);
                org.telegram.messenger.ns.f(i7).b(this, org.telegram.messenger.ns.V1);
                if (this.w != null) {
                    org.telegram.messenger.w7.G(i7).h0(false, 16777216, this.w, true);
                }
            }
            l30 l30Var5 = this.b;
            if (l30Var5 != null) {
                l30Var5.V(null, null, 0.0d, null, this.h, this.n, this.s, null);
            }
        }
    }

    public final void s(org.telegram.messenger.ff ffVar) {
        Bitmap K;
        String str = ffVar.h;
        if (str == null) {
            str = ffVar.I;
        }
        org.telegram.messenger.gj gjVar = null;
        if ((ffVar.b || ffVar.s != null) && !ffVar.d()) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 0;
            tL_message.message = "";
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.action = new TLRPC.TL_messageActionEmpty();
            tL_message.dialog_id = 0L;
            org.telegram.messenger.gj gjVar2 = new org.telegram.messenger.gj(org.telegram.messenger.m10.t0, tL_message, false, false);
            gjVar2.k.attachPath = new File(org.telegram.messenger.w7.z(4), org.telegram.messenger.gz.p() + "_avatar.mp4").getAbsolutePath();
            gjVar2.r0 = ffVar.s;
            gjVar2.s = ffVar.S;
            K = org.telegram.messenger.fc.K(ffVar.c, null, 800.0f, 800.0f, true);
            gjVar = gjVar2;
        } else {
            K = org.telegram.messenger.fc.K(str, null, 800.0f, 800.0f, true);
        }
        r(false, K, gjVar);
    }
}
