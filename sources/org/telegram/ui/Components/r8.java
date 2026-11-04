package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r8 extends org.telegram.ui.ActionBar.d2 {
    public static final int[][] d0 = {new int[]{-11302949, -11562789, -10430789, -11480359}, new int[]{-11229725, -12014137, -10234219, -10819908}, new int[]{-12927610, -11158198, -3355566, -5191850}, new int[]{-8164117, -5281560, -2200166, -2525971}, new int[]{-1287263, -1350281, -1337532, -885148}, new int[]{-1419145, -1936819, -742839, -1014448}, new int[]{-1017772, -1212871, -998847, -1003446}};
    public static final int[][] e0 = {new int[]{-7035984, -9667705}, new int[]{-1334949, -6199504}, new int[]{-1525432, -4686800}, new int[]{-11117215, -12893369}, new int[]{-15000805, -16777216}, new int[]{-10588271, -12496267}, new int[]{-5344541, -7842635}, new int[]{-5278276, -7777898}, new int[]{-4036162, -7650428}, new int[]{-2459992, -5351279}, new int[]{-1678221, -5814951}, new int[]{-9659148, -10720532}, new int[]{-12149549, -13731672}, new int[]{-12350279, -13802877}, new int[]{-10046854, -13404051}, new int[]{-8276302, -11822442}, new int[]{-10760507, -13200754}, new int[]{-10496401, -13525130}, new int[]{-1668548, -2862189}, new int[]{-9706766, -10062345}, new int[]{-3838476, -10456076}, new int[]{-1324753, -11225016}, new int[]{-10046854, -13404051}, new int[]{-3492512, -7569348}, new int[]{-5394320, -9732780}, new int[]{-7039865, -9408414}, new int[]{-5202023, -7373198}, new int[]{-3701922, -6397115}, new int[]{-4427695, -6859449}, new int[]{-7379371, -9944001}};
    public FrameLayout E;
    public float F;
    public boolean G;
    public ValueAnimator H;
    public org.telegram.ui.ActionBar.k I;
    public org.telegram.ui.jo J;
    public o8 K;
    public nc L;
    public boolean M;
    public ValueAnimator N;
    public float O;
    public final Paint P;
    public int Q;
    public boolean R;
    public org.telegram.ui.ActionBar.q0 S;
    public org.telegram.messenger.b9 T;
    public final d30 U;
    public boolean V;
    public TextView W;
    public TextView X;
    public final f30 Y;
    public n8 Z;
    public k8 a;
    public boolean a0;
    public l8 b;
    public float b0;
    public int c;
    public ValueAnimator c0;
    public int d;
    public View e;
    public boolean f;
    public boolean h;
    public boolean n;
    public org.telegram.ui.s51 r;
    public CharSequence s;
    public SpannableStringBuilder w;
    public boolean x;
    public gi.d y;

    public r8(f30 f30Var, d30 d30Var) {
        super(null);
        this.P = new Paint();
        this.R = true;
        this.a0 = false;
        this.b0 = 0.0f;
        this.Y = f30Var;
        this.U = d30Var;
    }

    public static void Z(r8 r8Var) {
        if (r8Var.getParentActivity() == null) {
            return;
        }
        if (!r8Var.n) {
            r8Var.finishFragment();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r8Var.getParentActivity());
        String M0 = org.telegram.messenger.bd.M0(2131747286, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.U = M0;
        s1Var.S = org.telegram.messenger.bd.M0(2131751406, null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747588, null), new f8(r8Var, 1));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        r8Var.showDialog(s1Var);
        s1Var.i();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        this.hasOwnBackground = true;
        this.actionBar.setBackgroundDrawable(null);
        int i3 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.m(kVar, 5, i10, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, i10, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.i6, null);
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131747288, null));
        this.actionBar.setActionBarMenuOnItemClick(new i8(this, 0));
        this.actionBar.getTitleTextView().setAlpha(0.0f);
        org.telegram.ui.ActionBar.k kVar2 = new org.telegram.ui.ActionBar.k(getParentActivity(), null);
        this.I = kVar2;
        kVar2.setCastShadows(false);
        this.I.setAddToContainer(false);
        this.I.setOccupyStatusBar(true);
        this.I.setClipChildren(false);
        int o10 = i0.a.o(-1, 60);
        this.I.D(-1, false);
        this.I.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        this.I.setAllowOverlayTitle(false);
        this.I.C(o10, false);
        org.telegram.ui.ActionBar.x q10 = this.I.q();
        q10.setClipChildren(false);
        int i11 = 2;
        d30 d30Var = this.U;
        org.telegram.ui.ActionBar.q0 e10 = q10.e(1, (d30Var == null || d30Var.c != 2) ? org.telegram.messenger.bd.M0(2131745529, null) : org.telegram.messenger.bd.M0(2131744418, null));
        this.S = e10;
        e10.setBackground(org.telegram.ui.ActionBar.k6.h0(o10, 3, -1));
        this.I.setActionBarMenuOnItemClick(new i8(this, 1));
        this.r = new org.telegram.ui.s51(11, getParentActivity(), this);
        j8 j8Var = new j8(this, context);
        j8Var.setFitsSystemWindows(true);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, j8Var, null);
        this.r.setClipChildren(false);
        this.r.setClipToPadding(false);
        this.r.setPadding(0, org.telegram.messenger.g0.m, 0, 0);
        this.r.setOrientation(1);
        org.telegram.ui.s51 s51Var = this.r;
        k8 k8Var = new k8(this, getParentActivity(), j8Var);
        this.a = k8Var;
        s51Var.addView(k8Var);
        TextView textView = new TextView(getParentActivity());
        this.X = textView;
        textView.setText(org.telegram.messenger.bd.M0(2131752139, null));
        TextView textView2 = this.X;
        int i12 = org.telegram.ui.ActionBar.k6.y6;
        org.telegram.ui.ActionBar.r6.V(textView2, i12, null);
        this.X.setTextSize(1, 14.0f);
        this.X.setGravity(17);
        this.r.addView(this.X, b8.mf.t(-1, -2, 0, 21, 10, 21, 10));
        ci.l1 l1Var = new ci.l1(this, getParentActivity());
        o8 o8Var = new o8(this, getParentActivity());
        this.K = o8Var;
        l1Var.addView(o8Var);
        this.r.addView(l1Var, b8.mf.t(-1, 48, 0, 12, 0, 12, 0));
        TextView textView3 = new TextView(getParentActivity());
        this.W = textView3;
        textView3.setText(org.telegram.messenger.bd.M0(2131752131, null));
        org.telegram.ui.ActionBar.r6.V(this.W, i12, null);
        this.W.setTextSize(1, 14.0f);
        this.W.setGravity(17);
        this.r.addView(this.W, b8.mf.t(-1, -2, 0, 21, 18, 21, 10));
        l8 l8Var = new l8(this, this, getParentActivity(), getThemedColor(i10));
        this.b = l8Var;
        l8Var.S = true;
        l8Var.setAnimationsEnabled(this.fragmentBeginToShow);
        this.b.setClipChildren(false);
        this.r.addView(this.b, b8.mf.t(-1, -1, 0, 12, 0, 12, 12));
        this.r.setClipChildren(false);
        j8Var.addView(this.r, b8.mf.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 64.0f));
        View view = new View(getParentActivity());
        this.e = view;
        view.setVisibility(8);
        gi.d dVar = new gi.d(context, this.resourceProvider, true);
        this.y = dVar;
        dVar.f();
        this.y.d.r(false, false);
        int i13 = this.Y.W;
        if (i13 == 1) {
            this.s = org.telegram.messenger.bd.M0(2131745549, null);
        } else if (i13 == 3) {
            this.s = org.telegram.messenger.bd.M0(2131745546, null);
        } else if (i13 == 2) {
            this.s = org.telegram.messenger.bd.M0(2131745535, null);
        } else if (d30Var == null || d30Var.c != 2) {
            this.s = org.telegram.messenger.bd.M0(2131745533, null);
        } else {
            this.s = org.telegram.messenger.bd.M0(2131744418, null);
        }
        this.s = new SpannableStringBuilder(this.s);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.s);
        spannableStringBuilder.append((CharSequence) " l");
        spannableStringBuilder.setSpan(new wp(R.drawable.msg_mini_lock2, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.w = spannableStringBuilder;
        this.x = false;
        this.y.i(this.s, false, true);
        this.y.setOnClickListener(new f0(this, i11));
        this.E = new FrameLayout(context);
        j8Var.addView(this.y, b8.mf.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        j8Var.addView(this.E, b8.mf.d(-1, 80.0f, 80, 8.0f, 16.0f, 8.0f, 64.0f));
        j8Var.addView(this.actionBar);
        j8Var.addView(this.I);
        j8Var.addView(this.e, b8.mf.c(-1.0f, -1));
        nc ncVar = new nc(j8Var);
        this.L = ncVar;
        ncVar.h = new e8(this, i3);
        this.fragmentView = j8Var;
        return j8Var;
    }

    public final void i0() {
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.H.cancel();
            this.H = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        if (org.telegram.messenger.g0.B(r5) > 0.721f) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0040, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004f, code lost:
    
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false)) > 0.721f) goto L21;
     */
    @Override // org.telegram.ui.ActionBar.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isLightStatusBar() {
        boolean z10;
        k8 k8Var = this.a;
        if (k8Var != null && (k8Var.w || (k8Var.x >= 0.0f && k8Var.h != null))) {
            n8 n8Var = k8Var.h;
            int i3 = n8Var.c;
            int i10 = n8Var.d;
            if (i10 != 0) {
                i3 = i0.a.f(0.5f, i3, i10);
            }
            int i11 = n8Var.e;
            if (i11 != 0) {
                i3 = i0.a.f(0.5f, i3, i11);
            }
            int i12 = n8Var.f;
            if (i12 != 0) {
                i3 = i0.a.f(0.5f, i3, i12);
            }
        }
        if (this.a0 != z10) {
            this.a0 = z10;
            if (this.actionBar.getAlpha() == 0.0f) {
                o0(z10 ? 0.0f : 1.0f);
            } else {
                ValueAnimator valueAnimator = this.c0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.c0.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b0, z10 ? 0.0f : 1.0f);
                this.c0 = ofFloat;
                ofFloat.addUpdateListener(new c6(this, 3));
                this.c0.setDuration(150L).start();
            }
        }
        org.telegram.messenger.b9 b9Var = this.T;
        if (b9Var != null) {
            org.telegram.messenger.g0.q3(b9Var, z10);
        }
        return z10;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final boolean j0() {
        if (org.telegram.messenger.h10.i(this.currentAccount).q()) {
            return false;
        }
        k8 k8Var = this.a;
        n8 n8Var = k8Var.h;
        return (n8Var != null && n8Var.b) || k8Var.n;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:12|(1:14)(1:93)|15|(3:16|17|18)|(2:19|20)|21|(1:23)(3:83|(1:85)|86)|24|25|26|27|(5:38|(7:40|(1:42)|43|(1:45)|46|(1:48)|49)(2:68|(7:70|(1:72)|73|(1:75)|76|(1:78)|79))|50|(1:52)(1:67)|(5:54|(3:62|(1:64)(1:66)|65)|58|(1:60)|61))(1:31)|32|(3:34|(1:36)|37)) */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a8, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k0() {
        boolean z10;
        int i3;
        byte b10;
        ImageReceiver imageReceiver;
        TLRPC.Document document;
        float f10;
        File file;
        org.telegram.messenger.ye yeVar;
        TLRPC.Document e10;
        ByteArrayOutputStream byteArrayOutputStream;
        if (this.a.getImageReceiver() == null || !this.a.getImageReceiver().J()) {
            return;
        }
        int i10 = 1;
        if (j0()) {
            new fc(this.E, this.resourceProvider).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.bd.M0(2131747073, null), new e8(this, i10))).j();
            return;
        }
        org.telegram.ui.jo joVar = this.J;
        if (joVar != null) {
            k8 k8Var = this.a;
            n8 n8Var = k8Var.h;
            long j10 = k8Var.a;
            TLRPC.Document document2 = k8Var.b;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) joVar.b;
            r8 r8Var = (r8) joVar.c;
            boolean z11 = ChatAttachAlertPhotoLayout.r1;
            bi biVar = chatAttachAlertPhotoLayout.b;
            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
            hashMap.clear();
            Bitmap createBitmap = Bitmap.createBitmap(800, 800, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            b10 b10Var = new b10();
            if (n8Var != null) {
                z10 = true;
                i3 = 0;
                b10Var.d(n8Var.c, n8Var.d, n8Var.e, n8Var.f);
            } else {
                z10 = true;
                i3 = 0;
                int[] iArr = d0[0];
                b10Var.d(iArr[0], iArr[1], iArr[2], iArr[3]);
            }
            b10Var.b(0.0f, 0.0f, 800.0f, 800.0f);
            canvas.drawRect(0.0f, 0.0f, 800.0f, 800.0f, b10Var.c);
            File file2 = new File(org.telegram.messenger.w7.z(4), org.telegram.messenger.az.p() + "avatar_background.png");
            try {
                file2.createNewFile();
                byteArrayOutputStream = new ByteArrayOutputStream();
                b10 = 4;
            } catch (IOException e11) {
                e = e11;
                b10 = 4;
            }
            try {
                createBitmap.compress(Bitmap.CompressFormat.PNG, i3, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(byteArray);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (IOException e12) {
                e = e12;
                e.printStackTrace();
                int i11 = (int) 120.00001f;
                int i12 = (int) 560.0f;
                imageReceiver = k8Var.getImageReceiver();
                if (imageReceiver.m() == null) {
                }
                file = new File(org.telegram.messenger.w7.z(b10), org.telegram.messenger.az.p() + "avatar_background.png");
                file.createNewFile();
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream2);
                byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                fileOutputStream2.write(byteArray2);
                fileOutputStream2.flush();
                fileOutputStream2.close();
                if (k8Var.getImageReceiver().m() == null) {
                }
                yeVar = new org.telegram.messenger.ye(0, file2.getPath(), 0, false, 0, 0);
                yeVar.c = file.getPath();
                if (k8Var.a == 0) {
                }
                org.telegram.messenger.b20 b20Var = new org.telegram.messenger.b20();
                yeVar.s = b20Var;
                b20Var.o = file2.getPath();
                org.telegram.messenger.b20 b20Var2 = yeVar.s;
                b20Var2.k = 800;
                b20Var2.l = 800;
                b20Var2.h = 800;
                b20Var2.i = 800;
                b20Var2.I = true;
                b20Var2.m = -1;
                b20Var2.t = true;
                b20Var2.a = 0L;
                b20Var2.d = 0L;
                b20Var2.b = k8Var.getDuration();
                org.telegram.messenger.b20 b20Var3 = yeVar.s;
                b20Var3.n = 30;
                b20Var3.c = 0L;
                long j11 = b20Var3.b;
                b20Var3.q = (int) ((j11 / 1000.0f) * 115200.0f);
                b20Var3.r = j11;
                org.telegram.messenger.z10 z10Var = new org.telegram.messenger.z10();
                z10Var.a = (byte) 0;
                if (document != null) {
                }
                if (e10 != null) {
                }
                if (this.R) {
                }
            }
            int i112 = (int) 120.00001f;
            int i122 = (int) 560.0f;
            imageReceiver = k8Var.getImageReceiver();
            if (imageReceiver.m() == null) {
                Bitmap p10 = imageReceiver.m().p();
                f10 = 0.13f;
                document = document2;
                ImageReceiver imageReceiver2 = new ImageReceiver(null);
                imageReceiver2.v0(p10);
                float f11 = i112;
                float f12 = i122;
                imageReceiver2.y0(f11, f11, f12, f12);
                imageReceiver2.J0((int) (f12 * 0.13f));
                imageReceiver2.h(canvas, null);
                imageReceiver2.f();
                p10.recycle();
            } else {
                document = document2;
                f10 = 0.13f;
                if (imageReceiver.B() != null) {
                    imageReceiver.B().N(0, false, z10);
                }
                float f13 = i112;
                float f14 = i122;
                imageReceiver.y0(f13, f13, f14, f14);
                imageReceiver.J0((int) (f14 * 0.13f));
                imageReceiver.h(canvas, null);
            }
            file = new File(org.telegram.messenger.w7.z(b10), org.telegram.messenger.az.p() + "avatar_background.png");
            file.createNewFile();
            ByteArrayOutputStream byteArrayOutputStream22 = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream22);
            byte[] byteArray22 = byteArrayOutputStream22.toByteArray();
            FileOutputStream fileOutputStream22 = new FileOutputStream(file);
            fileOutputStream22.write(byteArray22);
            fileOutputStream22.flush();
            fileOutputStream22.close();
            if (k8Var.getImageReceiver().m() == null || k8Var.getImageReceiver().B() != null) {
                yeVar = new org.telegram.messenger.ye(0, file2.getPath(), 0, false, 0, 0);
                yeVar.c = file.getPath();
                if (k8Var.a == 0) {
                    TLRPC.TL_videoSizeEmojiMarkup tL_videoSizeEmojiMarkup = new TLRPC.TL_videoSizeEmojiMarkup();
                    tL_videoSizeEmojiMarkup.emoji_id = k8Var.a;
                    tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(k8Var.h.c));
                    int i13 = k8Var.h.d;
                    if (i13 != 0) {
                        tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i13));
                    }
                    int i14 = k8Var.h.e;
                    if (i14 != 0) {
                        tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i14));
                    }
                    int i15 = k8Var.h.f;
                    if (i15 != 0) {
                        tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i15));
                    }
                    yeVar.S = tL_videoSizeEmojiMarkup;
                } else if (k8Var.b != null) {
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
                    TLRPC.Document document3 = k8Var.b;
                    tL_videoSizeStickerMarkup.sticker_id = document3.id;
                    tL_videoSizeStickerMarkup.stickerset = org.telegram.messenger.zi.j1(document3);
                    tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(k8Var.h.c));
                    int i16 = k8Var.h.d;
                    if (i16 != 0) {
                        tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(i16));
                    }
                    int i17 = k8Var.h.e;
                    if (i17 != 0) {
                        tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(i17));
                    }
                    int i18 = k8Var.h.f;
                    if (i18 != 0) {
                        tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(i18));
                    }
                    yeVar.S = tL_videoSizeStickerMarkup;
                }
                org.telegram.messenger.b20 b20Var4 = new org.telegram.messenger.b20();
                yeVar.s = b20Var4;
                b20Var4.o = file2.getPath();
                org.telegram.messenger.b20 b20Var22 = yeVar.s;
                b20Var22.k = 800;
                b20Var22.l = 800;
                b20Var22.h = 800;
                b20Var22.i = 800;
                b20Var22.I = true;
                b20Var22.m = -1;
                b20Var22.t = true;
                b20Var22.a = 0L;
                b20Var22.d = 0L;
                b20Var22.b = k8Var.getDuration();
                org.telegram.messenger.b20 b20Var32 = yeVar.s;
                b20Var32.n = 30;
                b20Var32.c = 0L;
                long j112 = b20Var32.b;
                b20Var32.q = (int) ((j112 / 1000.0f) * 115200.0f);
                b20Var32.r = j112;
                org.telegram.messenger.z10 z10Var2 = new org.telegram.messenger.z10();
                z10Var2.a = (byte) 0;
                e10 = document != null ? g5.e(org.telegram.messenger.h10.t0, j10) : document;
                if (e10 != null) {
                    z10Var2.q = i122;
                    z10Var2.r = i122;
                    z10Var2.f = 0.7f;
                    z10Var2.g = 0.7f;
                    z10Var2.c = 0.15f;
                    z10Var2.d = 0.15f;
                    z10Var2.B = e10;
                    z10Var2.C = null;
                    org.telegram.messenger.w7.G(org.telegram.messenger.h10.t0);
                    z10Var2.j = org.telegram.messenger.w7.K(e10, null, true, true).getAbsolutePath();
                    z10Var2.s = f10;
                    if (org.telegram.messenger.zi.L2(e10, true) || org.telegram.messenger.zi.P4(e10)) {
                        z10Var2.b = (byte) ((org.telegram.messenger.zi.L2(e10, true) ? (byte) 1 : b10) | z10Var2.b);
                    }
                    if (org.telegram.messenger.zi.D4(e10)) {
                        z10Var2.l = -1;
                        z10Var2.b = (byte) (z10Var2.b | 8);
                    }
                    yeVar.s.G = new ArrayList();
                    yeVar.s.G.add(z10Var2);
                }
            } else {
                yeVar = new org.telegram.messenger.ye(0, file.getPath(), 0, false, 0, 0);
            }
            hashMap.put(-1, yeVar);
            ChatAttachAlertPhotoLayout.u1.add(-1);
            biVar.U3.o1(7, true, false, 0, 0, 0L, biVar.f1(), false, 0L);
            if (!r8Var.R) {
                org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
                if (d2Var != null) {
                    d2Var.removeSelfFromStack();
                }
                r8Var.finishFragment();
            }
        }
        if (this.R) {
            return;
        }
        finishFragment();
    }

    public final void l0(boolean z10, boolean z11, boolean z12) {
        if (this.V) {
            return;
        }
        i0();
        int i3 = 2;
        this.H = ValueAnimator.ofFloat(this.F, z10 ? 1.0f : 0.0f);
        if (z11) {
            this.a.x = this.F;
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.r4, new Object[0]);
        }
        this.H.addUpdateListener(new dh.u(6, this, z11));
        this.H.addListener(new org.telegram.ui.ActionBar.g(this, z10, z11, i3));
        if (z12) {
            this.H.setInterpolator(xq.h);
            this.H.setDuration(350L);
            this.H.setStartDelay(150L);
        } else {
            this.H.setInterpolator(xq.f);
            this.H.setDuration(250L);
        }
        this.H.start();
    }

    public final void m0(boolean z10, long j10, TLRPC.Document document) {
        k8 k8Var = this.a;
        k8Var.a = j10;
        ei.d4 d4Var = k8Var.c;
        k8Var.b = document;
        if (j10 == 0) {
            d4Var.setAnimatedEmojiDrawable(null);
            this.a.c.getImageReceiver().r0(org.telegram.messenger.ac.b(document), "100_100", null, null, org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.k6.m6, 0.2f, null), 0L, "tgs", document, 0);
        } else {
            d4Var.setAnimatedEmojiDrawable(new g5(14, this.currentAccount, j10));
            this.a.c.getImageReceiver().f();
        }
        if (this.a.getImageReceiver() != null && this.a.getImageReceiver().m() != null) {
            this.a.getImageReceiver().m().y(0L, true, false);
        }
        if (this.a.getImageReceiver() != null && this.a.getImageReceiver().B() != null) {
            this.a.getImageReceiver().B().N(0, false, true);
        }
        this.n = true;
        s0();
    }

    public final void n0(boolean z10, float f10) {
        this.F = f10;
        float f11 = ((this.d - this.c) - org.telegram.messenger.g0.m) * f10;
        if (this.O == 0.0f) {
            this.r.setTranslationY(f11);
            this.y.setTranslationY(f11);
        }
        this.a.setTranslationY(((-(this.d - this.c)) / 2.0f) * f10);
        this.fragmentView.invalidate();
        if (z10) {
            this.a.setExpanded(f10 > 0.5f);
        }
    }

    public final void o0(float f10) {
        if (this.b0 != f10) {
            this.b0 = f10;
            int f11 = i0.a.f(f10, -16777216, -1);
            int o10 = i0.a.o(f11, 60);
            this.I.D(f11, false);
            this.S.setBackground(org.telegram.ui.ActionBar.k6.h0(o10, 3, -1));
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        if (!this.n) {
            return super.onBackPressed(z10);
        }
        int i3 = 0;
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = org.telegram.messenger.bd.M0(2131747286, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.U = M0;
            s1Var.S = org.telegram.messenger.bd.M0(2131751406, null);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747588, null), new f8(this, i3));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            showDialog(s1Var);
            s1Var.i();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.a3(getParentActivity(), getClassGuid());
    }

    public final void p0(long j10) {
        k8 k8Var = this.a;
        if (k8Var == null) {
            return;
        }
        n8 n8Var = new n8();
        int[] iArr = d0[0];
        n8Var.c = iArr[0];
        n8Var.d = iArr[1];
        n8Var.e = iArr[2];
        n8Var.f = iArr[3];
        k8Var.b(n8Var, false);
        s0();
        k8 k8Var2 = this.a;
        k8Var2.a = j10;
        k8Var2.c.setAnimatedEmojiDrawable(new g5(14, this.currentAccount, j10));
        this.K.z1(n8Var);
        this.b.setForUser(false);
    }

    public final void q0(TLRPC.VideoSize videoSize) {
        n8 n8Var = new n8();
        n8Var.c = i0.a.o(videoSize.background_colors.get(0).intValue(), org.telegram.messenger.hs.e4);
        n8Var.d = videoSize.background_colors.size() > 1 ? i0.a.o(videoSize.background_colors.get(1).intValue(), org.telegram.messenger.hs.e4) : 0;
        n8Var.e = videoSize.background_colors.size() > 2 ? i0.a.o(videoSize.background_colors.get(2).intValue(), org.telegram.messenger.hs.e4) : 0;
        n8Var.f = videoSize.background_colors.size() > 3 ? i0.a.o(videoSize.background_colors.get(3).intValue(), org.telegram.messenger.hs.e4) : 0;
        this.a.b(n8Var, false);
        s0();
        TLRPC.Document document = null;
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            m0(false, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id, null);
        } else {
            TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
            TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.li.b0(this.currentAccount).m0(tL_videoSizeStickerMarkup.stickerset, false);
            if (m0 != null) {
                for (int i3 = 0; i3 < m0.documents.size(); i3++) {
                    if (m0.documents.get(i3).id == tL_videoSizeStickerMarkup.sticker_id) {
                        document = m0.documents.get(i3);
                    }
                }
            }
            m0(false, 0L, document);
        }
        this.K.z1(n8Var);
        this.b.setForUser(true);
    }

    public final void r0(t8 t8Var) {
        n8 backgroundGradient = t8Var.getBackgroundGradient();
        k8 k8Var = this.a;
        if (k8Var == null) {
            return;
        }
        k8Var.b(backgroundGradient, false);
        s0();
        if (t8Var.getAnimatedEmoji() != null) {
            long h = t8Var.getAnimatedEmoji().h();
            k8 k8Var2 = this.a;
            k8Var2.a = h;
            k8Var2.c.setAnimatedEmojiDrawable(new g5(14, this.currentAccount, h));
        }
        this.K.z1(backgroundGradient);
        this.b.setForUser(false);
    }

    public final void s0() {
        boolean j02 = j0();
        if (this.x != j02) {
            gi.d dVar = this.y;
            this.x = j02;
            dVar.i(j02 ? this.w : this.s, true, true);
        }
    }
}
