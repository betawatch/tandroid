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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o8 extends org.telegram.ui.ActionBar.k2 {
    public static final int[][] c0 = {new int[]{-11302949, -11562789, -10430789, -11480359}, new int[]{-11229725, -12014137, -10234219, -10819908}, new int[]{-12927610, -11158198, -3355566, -5191850}, new int[]{-8164117, -5281560, -2200166, -2525971}, new int[]{-1287263, -1350281, -1337532, -885148}, new int[]{-1419145, -1936819, -742839, -1014448}, new int[]{-1017772, -1212871, -998847, -1003446}};
    public static final int[][] d0 = {new int[]{-7035984, -9667705}, new int[]{-1334949, -6199504}, new int[]{-1525432, -4686800}, new int[]{-11117215, -12893369}, new int[]{-15000805, -16777216}, new int[]{-10588271, -12496267}, new int[]{-5344541, -7842635}, new int[]{-5278276, -7777898}, new int[]{-4036162, -7650428}, new int[]{-2459992, -5351279}, new int[]{-1678221, -5814951}, new int[]{-9659148, -10720532}, new int[]{-12149549, -13731672}, new int[]{-12350279, -13802877}, new int[]{-10046854, -13404051}, new int[]{-8276302, -11822442}, new int[]{-10760507, -13200754}, new int[]{-10496401, -13525130}, new int[]{-1668548, -2862189}, new int[]{-9706766, -10062345}, new int[]{-3838476, -10456076}, new int[]{-1324753, -11225016}, new int[]{-10046854, -13404051}, new int[]{-3492512, -7569348}, new int[]{-5394320, -9732780}, new int[]{-7039865, -9408414}, new int[]{-5202023, -7373198}, new int[]{-3701922, -6397115}, new int[]{-4427695, -6859449}, new int[]{-7379371, -9944001}};
    public FrameLayout D;
    public float E;
    public boolean F;
    public ValueAnimator G;
    public org.telegram.ui.ActionBar.l H;
    public f2 I;
    public l8 J;
    public jc K;
    public boolean L;
    public ValueAnimator M;
    public float N;
    public final Paint O;
    public int P;
    public boolean Q;
    public org.telegram.ui.ActionBar.t0 R;
    public org.telegram.messenger.h9 S;
    public final z30 T;
    public boolean U;
    public TextView V;
    public TextView W;
    public final b40 X;
    public k8 Y;
    public boolean Z;
    public h8 a;
    public float a0;
    public i8 b;
    public ValueAnimator b0;
    public int c;
    public int d;
    public View e;
    public boolean f;
    public boolean h;
    public boolean n;
    public org.telegram.ui.u71 r;
    public CharSequence s;
    public SpannableStringBuilder w;
    public boolean x;
    public vh.d y;

    public o8(b40 b40Var, z30 z30Var) {
        super(null);
        this.O = new Paint();
        this.Q = true;
        this.Z = false;
        this.a0 = 0.0f;
        this.X = b40Var;
        this.T = z30Var;
    }

    public static void Y(o8 o8Var) {
        if (o8Var.getParentActivity() == null) {
            return;
        }
        if (!o8Var.n) {
            o8Var.finishFragment();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o8Var.getParentActivity());
        String L0 = org.telegram.messenger.cd.L0(2131747294, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.T = L0;
        x1Var.R = org.telegram.messenger.cd.L0(2131751406, null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747596, null), new c8(o8Var, 1));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        o8Var.showDialog(x1Var);
        x1Var.i();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        this.hasOwnBackground = true;
        this.actionBar.setBackgroundDrawable(null);
        int i10 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.m(lVar, 5, i11, null);
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 1, i11, null);
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 3, org.telegram.ui.ActionBar.t6.i6, null);
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131747296, null));
        this.actionBar.setActionBarMenuOnItemClick(new f8(this, 0));
        this.actionBar.getTitleTextView().setAlpha(0.0f);
        org.telegram.ui.ActionBar.l lVar2 = new org.telegram.ui.ActionBar.l(getParentActivity(), null);
        this.H = lVar2;
        lVar2.setCastShadows(false);
        this.H.setAddToContainer(false);
        this.H.setOccupyStatusBar(true);
        this.H.setClipChildren(false);
        int o10 = i0.b.o(-1, 60);
        this.H.D(-1, false);
        this.H.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        this.H.setAllowOverlayTitle(false);
        this.H.C(o10, false);
        org.telegram.ui.ActionBar.y p5 = this.H.p();
        p5.setClipChildren(false);
        int i12 = 2;
        z30 z30Var = this.T;
        org.telegram.ui.ActionBar.t0 e = p5.e(1, (z30Var == null || z30Var.c != 2) ? org.telegram.messenger.cd.L0(2131745536, null) : org.telegram.messenger.cd.L0(2131744434, null));
        this.R = e;
        e.setBackground(org.telegram.ui.ActionBar.t6.h0(o10, 3, -1));
        this.H.setActionBarMenuOnItemClick(new f8(this, 1));
        this.r = new org.telegram.ui.u71(this, getParentActivity(), 6);
        g8 g8Var = new g8(this, context);
        g8Var.setFitsSystemWindows(true);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.a7, g8Var, null);
        this.r.setClipChildren(false);
        this.r.setClipToPadding(false);
        this.r.setPadding(0, org.telegram.messenger.i0.m, 0, 0);
        this.r.setOrientation(1);
        org.telegram.ui.u71 u71Var = this.r;
        h8 h8Var = new h8(this, getParentActivity(), g8Var);
        this.a = h8Var;
        u71Var.addView(h8Var);
        TextView textView = new TextView(getParentActivity());
        this.W = textView;
        textView.setText(org.telegram.messenger.cd.L0(2131752139, null));
        TextView textView2 = this.W;
        int i13 = org.telegram.ui.ActionBar.t6.y6;
        org.telegram.ui.ActionBar.a7.V(textView2, i13, null);
        this.W.setTextSize(1, 14.0f);
        this.W.setGravity(17);
        this.r.addView(this.W, w7.b6.t(-1, -2, 0, 21, 10, 21, 10));
        jg.a3 a3Var = new jg.a3(this, getParentActivity());
        l8 l8Var = new l8(this, getParentActivity());
        this.J = l8Var;
        a3Var.addView(l8Var);
        this.r.addView(a3Var, w7.b6.t(-1, 48, 0, 12, 0, 12, 0));
        TextView textView3 = new TextView(getParentActivity());
        this.V = textView3;
        textView3.setText(org.telegram.messenger.cd.L0(2131752131, null));
        org.telegram.ui.ActionBar.a7.V(this.V, i13, null);
        this.V.setTextSize(1, 14.0f);
        this.V.setGravity(17);
        this.r.addView(this.V, w7.b6.t(-1, -2, 0, 21, 18, 21, 10));
        i8 i8Var = new i8(this, this, getParentActivity(), getThemedColor(i11));
        this.b = i8Var;
        i8Var.R = true;
        i8Var.setAnimationsEnabled(this.fragmentBeginToShow);
        this.b.setClipChildren(false);
        this.r.addView(this.b, w7.b6.t(-1, -1, 0, 12, 0, 12, 12));
        this.r.setClipChildren(false);
        g8Var.addView(this.r, w7.b6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 64.0f));
        View view = new View(getParentActivity());
        this.e = view;
        view.setVisibility(8);
        vh.d dVar = new vh.d(context, this.resourceProvider, true);
        this.y = dVar;
        dVar.f();
        this.y.d.r(false, false);
        int i14 = this.X.V;
        if (i14 == 1) {
            this.s = org.telegram.messenger.cd.L0(2131745556, null);
        } else if (i14 == 3) {
            this.s = org.telegram.messenger.cd.L0(2131745553, null);
        } else if (i14 == 2) {
            this.s = org.telegram.messenger.cd.L0(2131745542, null);
        } else if (z30Var == null || z30Var.c != 2) {
            this.s = org.telegram.messenger.cd.L0(2131745540, null);
        } else {
            this.s = org.telegram.messenger.cd.L0(2131744434, null);
        }
        this.s = new SpannableStringBuilder(this.s);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.s);
        spannableStringBuilder.append((CharSequence) " l");
        spannableStringBuilder.setSpan(new dq(R.drawable.msg_mini_lock2, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.w = spannableStringBuilder;
        this.x = false;
        this.y.i(this.s, false, true);
        this.y.setOnClickListener(new h0(this, i12));
        this.D = new FrameLayout(context);
        g8Var.addView(this.y, w7.b6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        g8Var.addView(this.D, w7.b6.d(-1, 80.0f, 80, 8.0f, 16.0f, 8.0f, 64.0f));
        g8Var.addView(this.actionBar);
        g8Var.addView(this.H);
        g8Var.addView(this.e, w7.b6.c(-1.0f, -1));
        jc jcVar = new jc(g8Var);
        this.K = jcVar;
        jcVar.h = new b8(this, i10);
        this.fragmentView = g8Var;
        return g8Var;
    }

    public final void h0() {
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.G.cancel();
            this.G = null;
        }
    }

    public final boolean i0() {
        if (org.telegram.messenger.d20.i(this.currentAccount).q()) {
            return false;
        }
        h8 h8Var = this.a;
        k8 k8Var = h8Var.h;
        return (k8Var != null && k8Var.b) || h8Var.n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        if (org.telegram.messenger.i0.B(r5) > 0.721f) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0040, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004f, code lost:
    
        if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.a7, false)) > 0.721f) goto L21;
     */
    @Override // org.telegram.ui.ActionBar.k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isLightStatusBar() {
        boolean z10;
        h8 h8Var = this.a;
        if (h8Var != null && (h8Var.w || (h8Var.x >= 0.0f && h8Var.h != null))) {
            k8 k8Var = h8Var.h;
            int i10 = k8Var.c;
            int i11 = k8Var.d;
            if (i11 != 0) {
                i10 = i0.b.f(0.5f, i10, i11);
            }
            int i12 = k8Var.e;
            if (i12 != 0) {
                i10 = i0.b.f(0.5f, i10, i12);
            }
            int i13 = k8Var.f;
            if (i13 != 0) {
                i10 = i0.b.f(0.5f, i10, i13);
            }
        }
        if (this.Z != z10) {
            this.Z = z10;
            if (this.actionBar.getAlpha() == 0.0f) {
                n0(z10 ? 0.0f : 1.0f);
            } else {
                ValueAnimator valueAnimator = this.b0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.b0.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a0, z10 ? 0.0f : 1.0f);
                this.b0 = ofFloat;
                ofFloat.addUpdateListener(new a6(this, 3));
                this.b0.setDuration(150L).start();
            }
        }
        org.telegram.messenger.h9 h9Var = this.S;
        if (h9Var != null) {
            org.telegram.messenger.i0.p3(h9Var, z10);
        }
        return z10;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
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
    public final void j0() {
        boolean z10;
        int i10;
        byte b10;
        ImageReceiver imageReceiver;
        TLRPC.Document document;
        float f7;
        File file;
        org.telegram.messenger.ef efVar;
        TLRPC.Document e;
        ByteArrayOutputStream byteArrayOutputStream;
        if (this.a.getImageReceiver() == null || !this.a.getImageReceiver().J()) {
            return;
        }
        int i11 = 1;
        if (i0()) {
            new cc(this.D, this.resourceProvider).Q(R.raw.star_premium_2, 36, org.telegram.messenger.i0.x2(org.telegram.messenger.cd.L0(2131747080, null), new b8(this, i11))).j();
            return;
        }
        f2 f2Var = this.I;
        if (f2Var != null) {
            h8 h8Var = this.a;
            k8 k8Var = h8Var.h;
            long j10 = h8Var.a;
            TLRPC.Document document2 = h8Var.b;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) f2Var.b;
            o8 o8Var = (o8) f2Var.c;
            boolean z11 = ChatAttachAlertPhotoLayout.q1;
            bi biVar = chatAttachAlertPhotoLayout.b;
            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
            hashMap.clear();
            Bitmap createBitmap = Bitmap.createBitmap(800, 800, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            u10 u10Var = new u10();
            if (k8Var != null) {
                z10 = true;
                i10 = 0;
                u10Var.d(k8Var.c, k8Var.d, k8Var.e, k8Var.f);
            } else {
                z10 = true;
                i10 = 0;
                int[] iArr = c0[0];
                u10Var.d(iArr[0], iArr[1], iArr[2], iArr[3]);
            }
            u10Var.b(0.0f, 0.0f, 800.0f, 800.0f);
            canvas.drawRect(0.0f, 0.0f, 800.0f, 800.0f, u10Var.c);
            File file2 = new File(org.telegram.messenger.b8.z(4), org.telegram.messenger.tz.p() + "avatar_background.png");
            try {
                file2.createNewFile();
                byteArrayOutputStream = new ByteArrayOutputStream();
                b10 = 4;
            } catch (IOException e7) {
                e = e7;
                b10 = 4;
            }
            try {
                createBitmap.compress(Bitmap.CompressFormat.PNG, i10, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(byteArray);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (IOException e10) {
                e = e10;
                e.printStackTrace();
                int i12 = (int) 120.00001f;
                int i13 = (int) 560.0f;
                imageReceiver = h8Var.getImageReceiver();
                if (imageReceiver.m() == null) {
                }
                file = new File(org.telegram.messenger.b8.z(b10), org.telegram.messenger.tz.p() + "avatar_background.png");
                file.createNewFile();
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream2);
                byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                fileOutputStream2.write(byteArray2);
                fileOutputStream2.flush();
                fileOutputStream2.close();
                if (h8Var.getImageReceiver().m() == null) {
                }
                efVar = new org.telegram.messenger.ef(0, file2.getPath(), 0, false, 0, 0);
                efVar.c = file.getPath();
                if (h8Var.a == 0) {
                }
                org.telegram.messenger.x20 x20Var = new org.telegram.messenger.x20();
                efVar.s = x20Var;
                x20Var.o = file2.getPath();
                org.telegram.messenger.x20 x20Var2 = efVar.s;
                x20Var2.k = 800;
                x20Var2.l = 800;
                x20Var2.h = 800;
                x20Var2.i = 800;
                x20Var2.I = true;
                x20Var2.m = -1;
                x20Var2.t = true;
                x20Var2.a = 0L;
                x20Var2.d = 0L;
                x20Var2.b = h8Var.getDuration();
                org.telegram.messenger.x20 x20Var3 = efVar.s;
                x20Var3.n = 30;
                x20Var3.c = 0L;
                long j11 = x20Var3.b;
                x20Var3.q = (int) ((j11 / 1000.0f) * 115200.0f);
                x20Var3.r = j11;
                org.telegram.messenger.v20 v20Var = new org.telegram.messenger.v20();
                v20Var.a = (byte) 0;
                if (document != null) {
                }
                if (e != null) {
                }
                if (this.Q) {
                }
            }
            int i122 = (int) 120.00001f;
            int i132 = (int) 560.0f;
            imageReceiver = h8Var.getImageReceiver();
            if (imageReceiver.m() == null) {
                Bitmap p5 = imageReceiver.m().p();
                f7 = 0.13f;
                document = document2;
                ImageReceiver imageReceiver2 = new ImageReceiver(null);
                imageReceiver2.v0(p5);
                float f10 = i122;
                float f11 = i132;
                imageReceiver2.y0(f10, f10, f11, f11);
                imageReceiver2.J0((int) (f11 * 0.13f));
                imageReceiver2.h(canvas, null);
                imageReceiver2.f();
                p5.recycle();
            } else {
                document = document2;
                f7 = 0.13f;
                if (imageReceiver.B() != null) {
                    imageReceiver.B().N(0, false, z10);
                }
                float f12 = i122;
                float f13 = i132;
                imageReceiver.y0(f12, f12, f13, f13);
                imageReceiver.J0((int) (f13 * 0.13f));
                imageReceiver.h(canvas, null);
            }
            file = new File(org.telegram.messenger.b8.z(b10), org.telegram.messenger.tz.p() + "avatar_background.png");
            file.createNewFile();
            ByteArrayOutputStream byteArrayOutputStream22 = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream22);
            byte[] byteArray22 = byteArrayOutputStream22.toByteArray();
            FileOutputStream fileOutputStream22 = new FileOutputStream(file);
            fileOutputStream22.write(byteArray22);
            fileOutputStream22.flush();
            fileOutputStream22.close();
            if (h8Var.getImageReceiver().m() == null || h8Var.getImageReceiver().B() != null) {
                efVar = new org.telegram.messenger.ef(0, file2.getPath(), 0, false, 0, 0);
                efVar.c = file.getPath();
                if (h8Var.a == 0) {
                    TLRPC.TL_videoSizeEmojiMarkup tL_videoSizeEmojiMarkup = new TLRPC.TL_videoSizeEmojiMarkup();
                    tL_videoSizeEmojiMarkup.emoji_id = h8Var.a;
                    tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(h8Var.h.c));
                    int i14 = h8Var.h.d;
                    if (i14 != 0) {
                        tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i14));
                    }
                    int i15 = h8Var.h.e;
                    if (i15 != 0) {
                        tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i15));
                    }
                    int i16 = h8Var.h.f;
                    if (i16 != 0) {
                        tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i16));
                    }
                    efVar.S = tL_videoSizeEmojiMarkup;
                } else if (h8Var.b != null) {
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
                    TLRPC.Document document3 = h8Var.b;
                    tL_videoSizeStickerMarkup.sticker_id = document3.id;
                    tL_videoSizeStickerMarkup.stickerset = org.telegram.messenger.jj.j1(document3);
                    tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(h8Var.h.c));
                    int i17 = h8Var.h.d;
                    if (i17 != 0) {
                        tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(i17));
                    }
                    int i18 = h8Var.h.e;
                    if (i18 != 0) {
                        tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(i18));
                    }
                    int i19 = h8Var.h.f;
                    if (i19 != 0) {
                        tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(i19));
                    }
                    efVar.S = tL_videoSizeStickerMarkup;
                }
                org.telegram.messenger.x20 x20Var4 = new org.telegram.messenger.x20();
                efVar.s = x20Var4;
                x20Var4.o = file2.getPath();
                org.telegram.messenger.x20 x20Var22 = efVar.s;
                x20Var22.k = 800;
                x20Var22.l = 800;
                x20Var22.h = 800;
                x20Var22.i = 800;
                x20Var22.I = true;
                x20Var22.m = -1;
                x20Var22.t = true;
                x20Var22.a = 0L;
                x20Var22.d = 0L;
                x20Var22.b = h8Var.getDuration();
                org.telegram.messenger.x20 x20Var32 = efVar.s;
                x20Var32.n = 30;
                x20Var32.c = 0L;
                long j112 = x20Var32.b;
                x20Var32.q = (int) ((j112 / 1000.0f) * 115200.0f);
                x20Var32.r = j112;
                org.telegram.messenger.v20 v20Var2 = new org.telegram.messenger.v20();
                v20Var2.a = (byte) 0;
                e = document != null ? f5.e(org.telegram.messenger.d20.s0, j10) : document;
                if (e != null) {
                    v20Var2.q = i132;
                    v20Var2.r = i132;
                    v20Var2.f = 0.7f;
                    v20Var2.g = 0.7f;
                    v20Var2.c = 0.15f;
                    v20Var2.d = 0.15f;
                    v20Var2.B = e;
                    v20Var2.C = null;
                    org.telegram.messenger.b8.G(org.telegram.messenger.d20.s0);
                    v20Var2.j = org.telegram.messenger.b8.K(e, null, true, true).getAbsolutePath();
                    v20Var2.s = f7;
                    if (org.telegram.messenger.jj.K2(e, true) || org.telegram.messenger.jj.O4(e)) {
                        v20Var2.b = (byte) ((org.telegram.messenger.jj.K2(e, true) ? (byte) 1 : b10) | v20Var2.b);
                    }
                    if (org.telegram.messenger.jj.C4(e)) {
                        v20Var2.l = -1;
                        v20Var2.b = (byte) (v20Var2.b | 8);
                    }
                    efVar.s.G = new ArrayList();
                    efVar.s.G.add(v20Var2);
                }
            } else {
                efVar = new org.telegram.messenger.ef(0, file.getPath(), 0, false, 0, 0);
            }
            hashMap.put(-1, efVar);
            ChatAttachAlertPhotoLayout.t1.add(-1);
            biVar.T3.H0(7, true, false, 0, 0, 0L, biVar.e1(), false, 0L);
            if (!o8Var.Q) {
                org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
                if (k2Var != null) {
                    k2Var.removeSelfFromStack();
                }
                o8Var.finishFragment();
            }
        }
        if (this.Q) {
            return;
        }
        finishFragment();
    }

    public final void k0(boolean z10, boolean z11, boolean z12) {
        if (this.U) {
            return;
        }
        h0();
        int i10 = 2;
        this.G = ValueAnimator.ofFloat(this.E, z10 ? 1.0f : 0.0f);
        if (z11) {
            this.a.x = this.E;
            org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.r4, new Object[0]);
        }
        this.G.addUpdateListener(new jg.o0(4, this, z11));
        this.G.addListener(new org.telegram.ui.ActionBar.g(this, z10, z11, i10));
        if (z12) {
            this.G.setInterpolator(gr.h);
            this.G.setDuration(350L);
            this.G.setStartDelay(150L);
        } else {
            this.G.setInterpolator(gr.f);
            this.G.setDuration(250L);
        }
        this.G.start();
    }

    public final void l0(boolean z10, long j10, TLRPC.Document document) {
        h8 h8Var = this.a;
        h8Var.a = j10;
        ag.d2 d2Var = h8Var.c;
        h8Var.b = document;
        if (j10 == 0) {
            d2Var.setAnimatedEmojiDrawable(null);
            this.a.c.getImageReceiver().r0(org.telegram.messenger.ic.b(document), "100_100", null, null, org.telegram.messenger.v5.f(document, org.telegram.ui.ActionBar.t6.m6, 0.2f, null), 0L, "tgs", document, 0);
        } else {
            d2Var.setAnimatedEmojiDrawable(new f5(14, this.currentAccount, j10));
            this.a.c.getImageReceiver().f();
        }
        if (this.a.getImageReceiver() != null && this.a.getImageReceiver().m() != null) {
            this.a.getImageReceiver().m().y(0L, true, false);
        }
        if (this.a.getImageReceiver() != null && this.a.getImageReceiver().B() != null) {
            this.a.getImageReceiver().B().N(0, false, true);
        }
        this.n = true;
        r0();
    }

    public final void m0(boolean z10, float f7) {
        this.E = f7;
        float f10 = ((this.d - this.c) - org.telegram.messenger.i0.m) * f7;
        if (this.N == 0.0f) {
            this.r.setTranslationY(f10);
            this.y.setTranslationY(f10);
        }
        this.a.setTranslationY(((-(this.d - this.c)) / 2.0f) * f7);
        this.fragmentView.invalidate();
        if (z10) {
            this.a.setExpanded(f7 > 0.5f);
        }
    }

    public final void n0(float f7) {
        if (this.a0 != f7) {
            this.a0 = f7;
            int f10 = i0.b.f(f7, -16777216, -1);
            int o10 = i0.b.o(f10, 60);
            this.H.D(f10, false);
            this.R.setBackground(org.telegram.ui.ActionBar.t6.h0(o10, 3, -1));
        }
    }

    public final void o0(long j10) {
        h8 h8Var = this.a;
        if (h8Var == null) {
            return;
        }
        k8 k8Var = new k8();
        int[] iArr = c0[0];
        k8Var.c = iArr[0];
        k8Var.d = iArr[1];
        k8Var.e = iArr[2];
        k8Var.f = iArr[3];
        h8Var.b(k8Var, false);
        r0();
        h8 h8Var2 = this.a;
        h8Var2.a = j10;
        h8Var2.c.setAnimatedEmojiDrawable(new f5(14, this.currentAccount, j10));
        this.J.z1(k8Var);
        this.b.setForUser(false);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        if (!this.n) {
            return super.onBackPressed(z10);
        }
        int i10 = 0;
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String L0 = org.telegram.messenger.cd.L0(2131747294, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.T = L0;
            x1Var.R = org.telegram.messenger.cd.L0(2131751406, null);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747596, null), new c8(this, i10));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            showDialog(x1Var);
            x1Var.i();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.i0.Z2(getParentActivity(), getClassGuid());
    }

    public final void p0(TLRPC.VideoSize videoSize) {
        k8 k8Var = new k8();
        k8Var.c = i0.b.o(videoSize.background_colors.get(0).intValue(), org.telegram.messenger.zs.e4);
        k8Var.d = videoSize.background_colors.size() > 1 ? i0.b.o(videoSize.background_colors.get(1).intValue(), org.telegram.messenger.zs.e4) : 0;
        k8Var.e = videoSize.background_colors.size() > 2 ? i0.b.o(videoSize.background_colors.get(2).intValue(), org.telegram.messenger.zs.e4) : 0;
        k8Var.f = videoSize.background_colors.size() > 3 ? i0.b.o(videoSize.background_colors.get(3).intValue(), org.telegram.messenger.zs.e4) : 0;
        this.a.b(k8Var, false);
        r0();
        TLRPC.Document document = null;
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            l0(false, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id, null);
        } else {
            TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
            TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(this.currentAccount).m0(tL_videoSizeStickerMarkup.stickerset, false);
            if (m0 != null) {
                for (int i10 = 0; i10 < m0.documents.size(); i10++) {
                    if (m0.documents.get(i10).id == tL_videoSizeStickerMarkup.sticker_id) {
                        document = m0.documents.get(i10);
                    }
                }
            }
            l0(false, 0L, document);
        }
        this.J.z1(k8Var);
        this.b.setForUser(true);
    }

    public final void q0(q8 q8Var) {
        k8 backgroundGradient = q8Var.getBackgroundGradient();
        h8 h8Var = this.a;
        if (h8Var == null) {
            return;
        }
        h8Var.b(backgroundGradient, false);
        r0();
        if (q8Var.getAnimatedEmoji() != null) {
            long h = q8Var.getAnimatedEmoji().h();
            h8 h8Var2 = this.a;
            h8Var2.a = h;
            h8Var2.c.setAnimatedEmojiDrawable(new f5(14, this.currentAccount, h));
        }
        this.J.z1(backgroundGradient);
        this.b.setForUser(false);
    }

    public final void r0() {
        boolean i02 = i0();
        if (this.x != i02) {
            vh.d dVar = this.y;
            this.x = i02;
            dVar.i(i02 ? this.w : this.s, true, true);
        }
    }
}
